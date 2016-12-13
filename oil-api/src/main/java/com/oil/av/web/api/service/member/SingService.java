package com.oil.av.web.api.service.member;

import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

import javax.annotation.Resource;

import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.stereotype.Service;

import com.google.common.collect.Maps;
import com.oil.av.em.MemberPublicMessageEnum;
import com.oil.av.em.MemberSexEnum;
import com.oil.av.em.MemberStateEnum;
import com.oil.av.em.SmsQueueTypeEnum;
import com.oil.av.em.SmsTemplateNameEnum;
import com.oil.av.service.platform.config.SmsQueueService;
import com.oil.av.service.platform.config.SmsTemplateService;
import com.oil.av.service.platform.member.MemberService;
import com.oil.av.vo.platform.config.SmsQueueVo;
import com.oil.av.vo.platform.config.SmsTemplateVo;
import com.oil.av.vo.platform.member.MemberVo;
import com.oil.av.web.api.model.request.member.AutoSignRequest;
import com.oil.av.web.api.model.request.member.MemberSignRequest;
import com.oil.av.web.api.model.request.member.PwdModifRequest;
import com.oil.av.web.api.model.request.member.RegisterRequest;
import com.oil.av.web.api.model.response.member.MemberSignResponse;
import com.oil.av.web.api.service.TokenUtilsService;
import com.oil.framework.common.exception.BusinessException;
import com.oil.framework.common.util.PasswordUtils;
import com.oil.framework.common.util.StringUtils;
import com.oil.framework.common.util.UUIDS;
import com.oil.framework.common.util.WxSignUtil;

/**
 * @Description: 用户入口
 *
 * @Version：1.0
 * @author lv  
 * @date 2016年12月11日  
 *
 */
@Service("singService")
public class SingService {
	
	//private static final Log logger = LogFactory.getLog(SingService.class);
	@Resource
    private MemberService memberService;

	@Resource
	private SmsQueueService smsQueueService;

	@Resource
	private SmsTemplateService smTemplateService;


    /**
     * 手机号登录
     * @param lv
     * @return
     * @throws BusinessException 
     */
    public MemberSignResponse loginByMobile(MemberSignRequest memberSignRequest) throws BusinessException, IOException {
    	List<MemberVo> memberVoList = memberService.getByPhone(memberSignRequest.getTel());
    	
    	if(memberVoList == null || memberVoList.size() == 0){
    		//会员不存在，会员手机号或者密码错误
    		throw new BusinessException("1111111");
    	}else if(memberVoList.size() > 1){
    		//一个手机号存在多个记录
    		throw new BusinessException("1111111");
    	}
    	MemberVo member = memberVoList.get(0);
    	//会员无法登陆，联系管理员
    	if(isDisabled(member)){
    		throw new BusinessException("1111111");
    	}
    	
    	String inPwd = PasswordUtils.cryptPassword(memberSignRequest.getTel(), memberSignRequest.getPwd());
    	MemberVo memberUpdate = null;
    	//密码错误
    	if(!inPwd.equals(member.getPassword())){
    		memberUpdate = new MemberVo();
    		memberUpdate.setId(member.getId());
    		memberUpdate.setWrongTimes(member.getWrongTimes()+1);
    		memberUpdate.setWrongDate(new Date());
    		//TODO 获取系统配置,密码错误次数,锁定用户
    		if(memberUpdate.getWrongTimes() == 5){
    			memberUpdate.setMemberStateEnum(MemberStateEnum.LOCK);
    		}
    		memberService.updateNotNull(memberUpdate);
    		throw new BusinessException("1111111");
    	}
    	
    	//设置最后一次登录时间和token
    	memberUpdate = new MemberVo();
		memberUpdate.setId(member.getId());
		memberUpdate.setLastDevice(memberSignRequest.getDevice());
		memberUpdate.setLastDeviceSerial(memberSignRequest.getDeviceCode());
		memberUpdate.setLastIp(memberSignRequest.getIp());
		memberUpdate.setLastLoginTime(new Date());
		memberService.updateNotNull(memberUpdate);
		
		MemberSignResponse msr = new MemberSignResponse();
		msr.setMemberId(member.getId());
		msr.setToken(TokenUtilsService.createToken(member.getId(), memberSignRequest.getVersion(), 
				memberSignRequest.getIp(), memberSignRequest.getDeviceCode(), memberSignRequest.getDevice()));
        //调用登录方法 
    	return msr;
    }

    /**
     * 用户ID+序列号 自动登陆
     * @param autoSignRequest
     * @return
     */
	public MemberSignResponse autoLoginBySerial(AutoSignRequest autoSignRequest)throws BusinessException , IOException{
		String serialNumber = memberService.getSerialById(autoSignRequest.getMemberId());
		if(StringUtils.isBlank(serialNumber) || !serialNumber.equals(autoSignRequest.getSerialNumber())){
			//不存在||序列号不同，需输入密码登陆
			throw new BusinessException("201612");
		}
		MemberSignResponse usr = new MemberSignResponse();
		usr.setMemberId(autoSignRequest.getMemberId());
		String token = TokenUtilsService.createToken(autoSignRequest.getMemberId(), autoSignRequest.getVersion(),
				autoSignRequest.getIp(), autoSignRequest.getDeviceCode(), autoSignRequest.getDevice());
		usr.setToken(token);
		return usr;
	}
	
    /**
     * 用户注册
     * @param register 
     * @param lv
     * @return
     * @throws BusinessException 
     */
    public MemberSignResponse registerMember(RegisterRequest register) throws BusinessException, IOException{
    	MemberSignResponse msr = new MemberSignResponse();
        //注册前 需要先判断手机号是否存在
    	preCheck(register.getTel(),"register");
    	
    	//TODO 缓存中获取未过期的验证码||数据库获取
    	checkSmsCode(register.getTel(),register.getVerifyCode(), SmsTemplateNameEnum.REGISTER);
    	
    	MemberVo memberVo = new MemberVo();
    	memberVo.setId(UUIDS.getUUID());
		memberVo.setPhone(register.getTel());
        memberVo.setPassword(PasswordUtils.cryptPassword(register.getTel(), register.getPwd()));
        memberVo.setAddress("");
        memberVo.setAvatar("");
        memberVo.setIsMember(true);
        memberVo.setNick(register.getTel().substring(0, 4)+ "*******");
        memberVo.setSignature("");
        memberVo.setProfile("");
        memberVo.setWrongTimes(0);
        memberVo.setMemberStateEnum(MemberStateEnum.NORMAL);
        memberVo.setMemberSexEnum(MemberSexEnum.NONE);
        memberVo.setMemberPublicMessageEnum(MemberPublicMessageEnum.OPEN);
        memberVo.setCreateUser("");
        memberVo.setCreateTime(new Date());
        memberVo.setModifyUser("");
        memberVo.setModifyTime(memberVo.getCreateTime());
        
        //注册成功，既登陆
        memberVo.setLastIp(register.getIp());
        memberVo.setLastLoginTime(memberVo.getCreateTime());
        memberVo.setLastDevice(register.getDevice());
        memberVo.setLastDeviceSerial(register.getDeviceCode());
        /*
         * 生成序列号
         */
        Map<String,String> serialMap = Maps.newHashMap();
		serialMap.put("id", memberVo.getId());
		serialMap.put("pwd", memberVo.getPassword());
		serialMap.put("device", register.getDevice());
		serialMap.put("deviceCode", register.getDeviceCode());
		String serial = WxSignUtil.createSerial(serialMap);
		memberVo.setLastSerialNumber(serial);
        try {
        	int returnL = memberService.addMemberVo(memberVo);
        	if(returnL == 1){
        		msr.setMemberId(memberVo.getId());
        		//TODO 缓存存放
        		msr.setToken(TokenUtilsService.createToken(memberVo.getId(), register.getVersion(), 
        				register.getIp(), register.getDeviceCode(), register.getDevice()));
        		msr.setSerial(serial);
        	}
		} catch (Exception e) {
			//插入失败
			e.printStackTrace();
			throw new BusinessException("1111111");
		}
        
        return msr;
    }

    
    public void checkSmsCode(String phone, String code, String flag) throws BusinessException {
    	preCheck(phone, flag);
    	SmsTemplateNameEnum smTemplateNameEnum = null;
		try {
			smTemplateNameEnum = SmsTemplateNameEnum.valueOf(flag);
		} catch (Exception e) {
			//参数错误，短信模板不存在
			throw new BusinessException("1111111");
		}
		checkSmsCode(phone, code, smTemplateNameEnum);
	}
    
    private void preCheck(String phone,String flag) throws BusinessException{
    	Pattern pattern = Pattern.compile("^1[34578]\\d{9}$");
		//手机格式不正确
		if(StringUtils.isBlank(phone) || !pattern.matcher(phone).matches()){
			throw new BusinessException("1111111");
		}
		
    	int count = memberService.getMemberCountByPhone(phone);
    	//用户存在
    	if(flag.equals("register")){
    		if(count > 0){
    			throw new BusinessException("1111112");
    		}
    	}else{
    		if(count == 0){
    			throw new BusinessException("1111112");
    		}
    	}
    }
    
    /**
     * 校验验证码
     * @param phone
     * @param code
     * @param smTemplateNameEnum
     * @throws BusinessException
     */
    public void checkSmsCode(String phone, String code, SmsTemplateNameEnum smTemplateNameEnum) throws BusinessException {
    	SmsTemplateVo stv = getSmstemplateVo(smTemplateNameEnum);
    	
    	////TODO 缓存获取|| 数据库查询
    	SmsQueueVo sqv = getSmsQueueVo(phone, stv.getId());
    	if(!sqv.getContent().contains(code)){
    		//验证码错误
    		throw new BusinessException("1111111");
    	}
    }

    /**
     * 发送短信校验码
     * @param phone
     */
	public void sendSmsCode(String phone, String flag) throws BusinessException, IOException{
		preCheck(phone, flag);
		
		SmsTemplateNameEnum smTemplateNameEnum = null;
		try {
			smTemplateNameEnum = SmsTemplateNameEnum.valueOf(flag);
		} catch (Exception e) {
			//参数错误，短信模板不存在
			throw new BusinessException("1111111");
		}
    	
    	//校验手机号是否已经发送验证码,倒计时内
		SmsTemplateVo stv = getSmstemplateVo(smTemplateNameEnum);
    	SmsQueueVo sqv = getSmsQueueVo(phone, stv.getId());
    	if(sqv == null){
    		sqv = new SmsQueueVo();
    		sqv.setId(UUIDS.getUUID());
    		sqv.setTemplateId(stv.getId());
    		sqv.setSmsQueueTypeEnum(SmsQueueTypeEnum.MEMBER);
    		sqv.setPhone(phone);
    		
    		// TODO 校验码位数，可配置
    		sqv.setContent(stv.getContent().replace("@", RandomStringUtils.randomNumeric(6))); 
    		sqv.setSendTimes(1);
    		sqv.setCreateTime(new Date());
    		smsQueueService.sendSms(sqv,true);
    	}else{
    		Calendar cal = Calendar.getInstance();
    		if(sqv.getSuccessTime() != null){
    			long seconds = (cal.getTimeInMillis() - sqv.getLastSendTime().getTime())/1000;
    			if(seconds < 180){
    				//1.TODO 短信间隔3分钟
    				throw new BusinessException("1111111");
    			}
    			//大于12小时，发送次数清零
    			if(seconds >= 43200){
    				sqv.setSendTimes(0);
    			}
    		}
    		
    		//2.TODO 配置。缓存获取。当天短信次数已满
    		if(sqv.getSendTimes() > 5){
    			throw new BusinessException("1111111");
    		}
    		sqv.setContent(stv.getContent().replace("@", RandomStringUtils.randomNumeric(6))); 
    		sqv.setSendTimes(sqv.getSendTimes()+1);
    		smsQueueService.sendSms(sqv,false);
    	}
	}
    
	private SmsTemplateVo getSmstemplateVo(SmsTemplateNameEnum smTemplateNameEnum) throws BusinessException{
		//TODO 缓存获取|| 数据库查询
    	Map<String, Object> mapTemplate = Maps.newHashMap();
    	mapTemplate.put("smTemplateNameEnum", smTemplateNameEnum);
    	List<SmsTemplateVo> stvList = smTemplateService.getListByConditions(mapTemplate);
    	if(stvList.size() != 1){
    		//注册短信模板有且只有一条
    		throw new BusinessException("1111111");
    	}
    	return stvList.get(0);
	}

	private SmsQueueVo getSmsQueueVo(String phone, String smsTemplateId) throws BusinessException {
		Map<String, Object> mapSms = Maps.newHashMap();
		mapSms.put("phone", phone);
		mapSms.put("templateId", smsTemplateId);

		List<SmsQueueVo> sqvList = smsQueueService.getListByConditions(mapSms);
		// 每个用户注册短信最多一条
		if (sqvList.size() != 1) {
			throw new BusinessException("1111111");
		}

		return sqvList.get(0);
	}

	/**
     * 重置密码
	 * @param hasOldPwd 
     * @param pwd
     * @param account
     * @param resultModel
	 * @throws BusinessException 
     */
    public MemberSignResponse resetPassword(PwdModifRequest pmr, boolean hasOldPwd) throws BusinessException {
    	preCheck(pmr.getTel(), "PWDMODIFY");
    	
    	if(!pmr.getPwd().equals(pmr.getCopyPwd())){
    		throw new BusinessException("111111134");
    	}
        //更新密码
    	List<MemberVo> memberList = memberService.getByPhone(pmr.getTel());
    	if(memberList == null || memberList.size() != 1){
    		throw new BusinessException("1111111554");
    	}
    	MemberVo mv = memberList.get(0);
    	
    	if(hasOldPwd){
    		String oldpwd = PasswordUtils.cryptPassword(pmr.getTel(), pmr.getOldPwd());
    		//原密码错误
    		if(!mv.getPassword().equals(oldpwd)){
    			throw new BusinessException("11111111");
    		}
    	}
    	
    	MemberVo updateVo = new MemberVo();
    	updateVo.setId(mv.getId());
    	updateVo.setPassword(PasswordUtils.cryptPassword(pmr.getTel(), pmr.getPwd()));
    	
    	 /*
         * 生成序列号
         */
        Map<String,String> serialMap = Maps.newHashMap();
		serialMap.put("id", updateVo.getId());
		serialMap.put("pwd", updateVo.getPassword());
		serialMap.put("device", pmr.getDevice());
		serialMap.put("deviceCode", pmr.getDeviceCode());
		String serial = WxSignUtil.createSerial(serialMap);
    	updateVo.setLastSerialNumber(serial);
    	int result = memberService.updateNotNull(updateVo);
    	if(result != 1){
    		throw new BusinessException("1121212122");
    	}
    	MemberSignResponse msr = new MemberSignResponse();
    	msr.setMemberId(updateVo.getId());
    	msr.setSerial(serial);
    	//TODO 缓存存放
		msr.setToken(TokenUtilsService.createToken(updateVo.getId(), pmr.getVersion(), 
				pmr.getIp(), pmr.getDeviceCode(), pmr.getDevice()));
    	return msr;
    }

    /**
     * 退出登录
     * @param asr 
     * @param account
     * @param resultModel
     * @throws BusinessException 
     */
    public Boolean logonOut(AutoSignRequest asr) throws BusinessException {
    	MemberVo mv = memberService.getMemberVoById(asr.getMemberId());
    	//用户不存在
    	if(mv == null){
    		throw new BusinessException("11111111");
    	}
    	
    	//非本人操作
    	if(!asr.getSerialNumber().equals(mv.getLastSerialNumber())){
    		throw new BusinessException("111111");
    	}
    	MemberVo udapteVo = new MemberVo();
    	udapteVo.setId(mv.getId());
    	udapteVo.setLastSerialNumber("");
    	int result = memberService.updateNotNull(udapteVo);
    	//退出异常
    	if(result != 1){
    		throw new BusinessException("111111");
    	}
    	return true;
    }

    public void pcLoginByMobile() throws BusinessException,
                                                               NumberFormatException, IOException {
    }

    /**
     * 根据第三方userId  获取第三方账户信息
     * @param thirdId
     * @param resultModel
     * @throws BusinessException 
     * @throws IOException 
     * @throws NumberFormatException 
     */
    private void getThirdAccount() throws BusinessException,NumberFormatException, IOException {
    	
    }

    private boolean isDisabled(MemberVo mv){
    	boolean result = false;
    	if(MemberStateEnum.NORMAL.equals(mv.getMemberStateEnum())){
    		result = false;
    	}
    	if(MemberStateEnum.LOCK.equals(mv.getMemberStateEnum())){
    		// TODO log
    		result = true;
    	}
    	if(MemberStateEnum.DESTROY.equals(mv.getMemberStateEnum())){
    		// TODO log
    		result = true;
    	}
    	if(MemberStateEnum.SEAL.equals(mv.getMemberStateEnum())){
    		// TODO log
    		result = true;
    	}
    	if(MemberStateEnum.SAFETY.equals(mv.getMemberStateEnum())){
    		// TODO log
    		result = true;
    	}
    	return result;
    }
    



}

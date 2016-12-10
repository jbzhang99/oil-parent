package com.oil.av.web.api.service.member;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.google.common.collect.Maps;
import com.oil.av.em.MemberPublicMessageEnum;
import com.oil.av.em.MemberSexEnum;
import com.oil.av.em.MemberStateEnum;
import com.oil.av.service.platform.member.MemberService;
import com.oil.av.vo.platform.member.MemberVo;
import com.oil.av.web.api.model.request.member.AutoSignRequest;
import com.oil.av.web.api.model.request.member.RegisterRequest;
import com.oil.av.web.api.model.request.member.UserSignRequest;
import com.oil.av.web.api.model.response.member.UserSignResponse;
import com.oil.av.web.api.service.TokenUtilsService;
import com.oil.framework.common.exception.BusinessException;
import com.oil.framework.common.util.PasswordUtils;
import com.oil.framework.common.util.StringUtils;
import com.oil.framework.common.util.UUIDS;
import com.oil.framework.common.util.WxSignUtil;

@Service("singService")
public class SingService {
	
	@Resource
    private MemberService             memberService;
	
   /*@Resource
    private LiveAnchorAssistantService liveAnchorAssistantService;
    @Resource
    SMSService                         smsService;                                   //短信日志记录服务
    @Resource
    AccountThirdService                accountThirdService;                          //第三方账号服务
    @Resource
    IntegralLogService                 intergarlService;                             //积分服务
    @Resource
    private LiveRoomMemberService      liveRoomMemberService;                        //直播间
    @Resource
    private LiveTelecastService        liveTelecastService;
    @Resource
    private LiveRoomService            liveRoomService;
    @Resource
    AccountMemberService               accountMemberService;                         //会员服务

    @Resource
    MemberInfoService                  memberInfoService;                            //会员API服务
    @Resource
    QcloudService                      qcloudService;                                //腾讯云服务

    private static final Log           logger = LogFactory.getLog(SingService.class);

    /**
     * 手机号登录
     * @param lv
     * @return
     * @throws BusinessException 
     */
    public UserSignResponse loginByMobile(UserSignRequest userSignRequest) throws BusinessException, IOException {

        
        //设置最后一次登录时间和token
        //vo.setLastLoginTime(new Date());
        //vo.setLastToken(TokenUtilsService.getToken(vo.getPassword(), Long.valueOf(vo.getId()), vo.getLastLoginTime()));
        //调用登录方法 
       // memberVo account = userService.loginByPhone(vo);
    	return null;
    }

    /**
     * 用户ID+序列号 自动登陆
     * @param autoSignRequest
     * @return
     */
	public UserSignResponse autoLoginBySerial(AutoSignRequest autoSignRequest)throws BusinessException {
		String serialNumber = memberService.getSerialById(autoSignRequest.getUserId());
		if(StringUtils.isBlank(serialNumber) || !serialNumber.equals(autoSignRequest.getSerialNumber())){
			//不存在||序列号不同，需输入密码登陆
			throw new BusinessException("201612");
		}
		UserSignResponse usr = new UserSignResponse();
		usr.setUserId(autoSignRequest.getUserId());
		String token = TokenUtilsService.createToken(autoSignRequest.getUserId(), autoSignRequest.getVersion(),
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
    public UserSignResponse registerUser(RegisterRequest register) throws BusinessException{
    	UserSignResponse usr = new UserSignResponse();
    	//TODO 缓存中获取未过期的验证码||数据库获取
    	
        //注册前 需要先判断手机号是否存在
    	List<MemberVo> memberVoList = memberService.getByPhone(register.getTel());
    	if(memberVoList != null && memberVoList.size() > 0){
    		if(memberVoList.size() == 1){
    			//用户存在
    			throw new BusinessException("1111111");
    		}else{
    			throw new BusinessException("1111111");
    		}
    	}
    	
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
        memberVo.setLastIp(memberVo.getId());
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
        	Long returnL = memberService.addMemberVo(memberVo);
        	if(returnL == 1){
        		usr.setUserId(memberVo.getId());
        		//TODO 缓存存放
        		usr.setToken(TokenUtilsService.createToken(memberVo.getId(), register.getVersion(), 
        				register.getIp(), register.getDeviceCode(), register.getDevice()));
        		usr.setSerial(serial);
        	}
		} catch (Exception e) {
			//插入失败
			throw new BusinessException("1111111");
		}
        
        return usr;
    }

    /**
     * 重置密码
     * @param pwd
     * @param account
     * @param resultModel
     */
    public Boolean resetPassword() {
        //更新密码
        //Boolean result = accountService.updatePwdInfo(account) > 0;
        //return result;
    	return true;
    }

    /**
     * 退出登录
     * @param account
     * @param resultModel
     */
    public Boolean logonOut() {
        //Integer result = accountService.logonOut(account.getId());
        //return result > 0;
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


}

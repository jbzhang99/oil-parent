package com.oil.av.web.api.service.member;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.google.common.collect.Maps;
import com.oil.av.em.MemberSexEnum;
import com.oil.av.service.platform.member.MemberBusinessService;
import com.oil.av.service.platform.member.MemberService;
import com.oil.av.vo.platform.member.MemberBusinessVo;
import com.oil.av.vo.platform.member.MemberVo;
import com.oil.av.web.api.model.request.BaseMemberRequest;
import com.oil.av.web.api.model.request.member.MemberBusinessRequest;
import com.oil.av.web.api.model.request.member.MemberInfoRequest;
import com.oil.av.web.api.model.response.member.MemberInfoResponse;
import com.oil.framework.common.exception.BusinessException;
import com.oil.framework.common.util.DateUtils;

/**
 * @Description: 用户信息表
 *
 * @Version：1.0
 * @author lv  
 * @date 2016年12月11日  
 *
 */
@Service("memberInfoService")
public class MemberInfoService {
	
	//private static final Log logger = LogFactory.getLog(SingService.class);
	@Resource
    private MemberService memberService;

	@Resource
	private MemberBusinessService memberBusinessService;

	private MemberVo getMemberVo(String id) throws BusinessException{
		MemberVo mv = memberService.getMemberVoById(id);
    	if(mv == null){
    		throw new BusinessException("1111111");
    	}
    	return mv;
	}
	
	/**
	 * 通过用户id查询基本信息
	 * @param bmr
	 * @return
	 * @throws BusinessException
	 * @throws IOException
	 */
    public MemberInfoResponse getMemberInfoByid(BaseMemberRequest bmr) throws BusinessException, IOException {
    	MemberVo mv = getMemberVo(bmr.getMemberId());
    	MemberInfoResponse mir = new MemberInfoResponse();
    	//组装前台要显示的信息
    	mir.setMemberId(mv.getId());
    	mir.setAvatar(mv.getAvatar());
    	return mir;
    }

    /**
     * 修改基本信息
     * @param mir
     * @return
     */
	public MemberInfoResponse modifyMemberInfo(MemberInfoRequest mir) throws BusinessException, IOException {
		//
		MemberVo mv = getMemberVo(mir.getMemberId());
		MemberVo updateMV = new MemberVo();
		updateMV.setId(mv.getId());
		updateMV.setAddress(mir.getAddress());
		updateMV.setAvatar(mir.getAvatar());
		updateMV.setBirthday(DateUtils.parseDate2(mir.getBirthday()));
		updateMV.setNick(mir.getNick());
		updateMV.setMemberSexEnum(MemberSexEnum.valueOf(mir.getSex()));
		updateMV.setFullName(mir.getName());
		updateMV.setIdCard(mir.getIdCard());
		int result = memberService.updateNotNull(updateMV);
		if(result != 1){
			//数据库更新失败
			throw new BusinessException("11111111");
		}
		
		MemberInfoResponse uires = new MemberInfoResponse();
		uires.setMemberId(mv.getId());
		uires.setAddress(mir.getAddress());
		uires.setAvatar(mir.getAvatar());
		uires.setBirthday((mir.getBirthday()));
		uires.setNick(mir.getNick());
		uires.setSex(mir.getSex());
		uires.setName(mir.getName());
		uires.setIdCard(mir.getIdCard());
		return uires;
	}

	public MemberInfoResponse modifyMemberBusinessInfo(MemberBusinessRequest mbr)throws BusinessException, IOException {
		MemberInfoResponse mir = new MemberInfoResponse();
		int result = 0;
		MemberBusinessVo memberBusinessVo= new MemberBusinessVo();
		memberBusinessVo.setMemberId(mbr.getMemberId());
		memberBusinessVo.setBusinessName(mbr.getBusinessName());
		memberBusinessVo.setBusinessInfo(mbr.getBusinessInfo());
		memberBusinessVo.setBusinessScope(mbr.getBusinessScope());
		memberBusinessVo.setBank(mbr.getBank());
		memberBusinessVo.setBankNumber(mbr.getBankNumber());
		memberBusinessVo.setInvoice(mbr.getInvoice());
		memberBusinessVo.setTouchPhone(mbr.getTouchPhone());
		memberBusinessVo.setTouchName(mbr.getTouchName());
		
		if(mbr.getId() == null){
			result = memberBusinessService.addMemberBusinessVo(memberBusinessVo);
		}else{
			MemberBusinessVo dbVo = memberBusinessService.getMemberBusinessVoById(mbr.getId());
			if(dbVo == null || !dbVo.getMemberId().equals(mbr.getMemberId())){
				//参数错误，或者是在修改别人的企业信息
				throw new BusinessException("11111111");
			}
			memberBusinessVo.setId(mbr.getId());
			result = memberBusinessService.addMemberBusinessVo(memberBusinessVo);
		}
		if(result !=1 ){
			//数据库更新失败
			throw new BusinessException("11111111");
		}
			
		mir.setMemberId(mbr.getMemberId());
		mir.setBusinessName(mbr.getBusinessName());
		mir.setBusinessInfo(mbr.getBusinessInfo());
		mir.setBusinessScope(mbr.getBusinessScope());
		mir.setBank(mbr.getBank());
		mir.setBankNumber(mbr.getBankNumber());
		mir.setInvoice(mbr.getInvoice());
		mir.setTouchPhone(mbr.getTouchPhone());
		mir.setTouchName(mbr.getTouchName());
		
		return mir;
	}

}

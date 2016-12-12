package com.oil.av.web.api.service.member;

import java.io.IOException;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.oil.av.service.platform.member.MemberService;
import com.oil.av.vo.platform.member.MemberVo;
import com.oil.av.web.api.model.request.member.MemberInfoRequest;
import com.oil.av.web.api.model.response.member.MemberInfoResponse;
import com.oil.framework.common.exception.BusinessException;

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

    public MemberInfoResponse getMemberInfoByid(MemberInfoRequest mir) throws BusinessException, IOException {
    	MemberVo mv = memberService.getMemberVoById(mir.getId());
    	if(mv == null){
    		throw new BusinessException("1111111");
    	}
    	MemberInfoResponse memberInfoResponse = new MemberInfoResponse();
    	memberInfoResponse.setMemberId(mv.getId());
    	return null;
    }

    /**
     * 修改基本信息
     * @param mir
     * @return
     */
	public MemberInfoResponse modifyMemberInfo(MemberInfoRequest mir) throws BusinessException, IOException {
		//
		
		return null;
	}

}

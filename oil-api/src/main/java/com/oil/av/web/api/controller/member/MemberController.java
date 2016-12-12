package com.oil.av.web.api.controller.member;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.oil.av.web.api.controller.BaseController;
import com.oil.av.web.api.model.request.member.MemberInfoRequest;
import com.oil.av.web.api.model.response.member.MemberInfoResponse;
import com.oil.av.web.api.service.member.MemberInfoService;
import com.oil.framework.common.base.model.JsonResult;
import com.oil.framework.common.exception.BusinessException;

/**
 * @Description: 用户修改信息
 *
 * @Version：1.0
 * @author lv  
 * @date 2016年12月9日  
 *
 */
@Controller
@RequestMapping(value = "/memb")
public class MemberController extends BaseController {
	

	private MemberInfoService memberInfoService;
	
    /**
     * 查询基本信息
     * @param request
     * @param modelMap
     * @return
     * @throws BusinessException 
     */
    @SuppressWarnings({ "rawtypes", "unchecked" })
	@ResponseBody
    @RequestMapping(value = "/baseInfo", method = RequestMethod.POST)
    public JsonResult baseInfo(@Valid MemberInfoRequest mir,BindingResult br ){
    	JsonResult jsonResult = new JsonResult();
    	if(br.hasErrors()){
			this.illParamsResult(jsonResult, br);
    		return jsonResult;
		}
    	
    	try{
			MemberInfoResponse uir = memberInfoService.getMemberInfoByid(mir);
			jsonResult.setDataObject(uir);
		}catch(BusinessException be){
			this.businessExceptionResult(jsonResult, be);
		}catch(Exception e){
			this.exceptionResult(jsonResult);
		}
		return jsonResult;
    }
    /**
     * 修改基本信息
     * @param request
     * @param modelMap
     * @return
     * @throws BusinessException 
     */
    @SuppressWarnings({ "rawtypes", "unchecked" })
    @ResponseBody
    @RequestMapping(value = "/updateInfo", method = RequestMethod.POST)
    public JsonResult updateInfo(@Valid MemberInfoRequest mir,BindingResult br ){
    	JsonResult jsonResult = new JsonResult();
    	if(br.hasErrors()){
    		this.illParamsResult(jsonResult, br);
    		return jsonResult;
    	}
    	
    	try{
    		MemberInfoResponse uir = memberInfoService.modifyMemberInfo(mir);
    		jsonResult.setDataObject(uir);
    	}catch(BusinessException be){
    		this.businessExceptionResult(jsonResult, be);
    	}catch(Exception e){
    		this.exceptionResult(jsonResult);
    	}
    	return jsonResult;
    }
    
    
}

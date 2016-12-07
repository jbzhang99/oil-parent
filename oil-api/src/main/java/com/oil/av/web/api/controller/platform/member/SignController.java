package com.oil.av.web.api.controller.platform.member;

import javax.annotation.Resource;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.oil.av.service.platform.member.AccountService;
import com.oil.av.web.api.controller.BaseController;
import com.oil.av.web.api.model.request.member.UserSignRequest;
import com.oil.framework.common.base.model.JsonResult;
import com.oil.framework.common.exception.BusinessException;

@Controller
@RequestMapping(value = "/user")
public class SignController extends BaseController{
	
	@Resource
	private  AccountService  accountService;
	
	@ResponseBody
	@RequestMapping(value = "/userSign",method=RequestMethod.GET)
	public JsonResult<String> userSign(@Valid UserSignRequest userSignRequest,BindingResult br ){
		JsonResult<String> jsonResult = new JsonResult<String>();
		if(br.hasErrors()){
			this.illParamsResult(jsonResult, br);
    		return jsonResult;
		}
		try{
			accountService.userSign(userSignRequest.getUserName(), userSignRequest.getPwd());
		}catch(BusinessException be){
			this.businessExceptionResult(jsonResult, be);
		}catch(Exception e){
			this.exceptionResult(jsonResult);
		}
		return jsonResult;
	}
}

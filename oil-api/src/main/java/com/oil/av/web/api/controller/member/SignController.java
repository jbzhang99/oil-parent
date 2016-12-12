package com.oil.av.web.api.controller.member;

import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.common.collect.Maps;
import com.oil.av.web.api.controller.BaseController;
import com.oil.av.web.api.model.request.member.AutoSignRequest;
import com.oil.av.web.api.model.request.member.RegisterRequest;
import com.oil.av.web.api.model.request.member.MemberSignRequest;
import com.oil.av.web.api.model.request.member.PwdModifRequest;
import com.oil.av.web.api.model.response.member.MemberSignResponse;
import com.oil.av.web.api.service.TokenUtilsService;
import com.oil.av.web.api.service.member.SingService;
import com.oil.framework.common.base.model.JsonResult;
import com.oil.framework.common.exception.BusinessException;

/**
 * @Description: 登陆控制器
 *
 * @Version：1.0
 * @author lv  
 * @date 2016年12月9日  
 *
 */
@Controller
@RequestMapping(value = "/sign")
public class SignController extends BaseController {
	
    @Resource
    SingService              singService;

    private static final Log logger = LogFactory.getLog(SignController.class);
    
    /**
     * 自动登陆（用户ID+序列号）
     * @param request
     * @param modelMap
     * @return
     * @throws BusinessException 
     */
    @SuppressWarnings({ "rawtypes", "unchecked" })
	@ResponseBody
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public JsonResult login(@Valid MemberSignRequest memberSignRequest,BindingResult br ){
    	JsonResult jsonResult = new JsonResult();
    	if(br.hasErrors()){
			this.illParamsResult(jsonResult, br);
    		return jsonResult;
		}
    	
    	try{
			MemberSignResponse usr = singService.loginByMobile(memberSignRequest);
			jsonResult.setDataObject(usr);
		}catch(BusinessException be){
			this.businessExceptionResult(jsonResult, be);
		}catch(Exception e){
			this.exceptionResult(jsonResult);
		}
		return jsonResult;
    }

    /**
     * 自动登陆（用户ID+序列号）
     * @param request
     * @param modelMap
     * @return
     * @throws BusinessException 
     */
    @SuppressWarnings({ "rawtypes", "unchecked" })
	@ResponseBody
    @RequestMapping(value = "/autoLogin", method = RequestMethod.POST)
    public JsonResult autoLogin(@Valid AutoSignRequest autoSignRequest,BindingResult br ){
    	JsonResult jsonResult = new JsonResult();
    	if(br.hasErrors()){
			this.illParamsResult(jsonResult, br);
    		return jsonResult;
		}
    	
    	try{
			MemberSignResponse usr = singService.autoLoginBySerial(autoSignRequest);
			jsonResult.setDataObject(usr);
		}catch(BusinessException be){
			this.businessExceptionResult(jsonResult, be);
		}catch(Exception e){
			this.exceptionResult(jsonResult);
		}
		return jsonResult;
    }

    /**
     * 注册
     * @param request
     * @param modelMap
     * @return
     * @throws BusinessException
     */
    @SuppressWarnings({ "rawtypes", "unchecked" })
    @ResponseBody
    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public JsonResult getAttentionList(RegisterRequest register, BindingResult br) throws BusinessException {
    	JsonResult jsonResult = new JsonResult();
    	if(br.hasErrors()){
			this.illParamsResult(jsonResult, br);
    		return jsonResult;
		}
    	try {
    		//注册成功默认登陆
    		MemberSignResponse sur = singService.registerMember(register);
    		jsonResult.setDataObject(sur);
		}catch(BusinessException be){
			this.businessExceptionResult(jsonResult, be);
		}catch(Exception e){
			this.exceptionResult(jsonResult);
		}
		return jsonResult;
    }

    /**
     * 发送短信验证码
     * @param request
     * @param modelMap
     * @return
     * @throws BusinessException
     */
    @SuppressWarnings({ "rawtypes", "unchecked" })
    @ResponseBody
    @RequestMapping(value = "/sendCode", method = RequestMethod.POST)
    public JsonResult sendNoteCode(HttpServletRequest request) throws BusinessException {
    	JsonResult jsonResult = new JsonResult();
    	String phone = request.getParameter("tel");
    	String flag = request.getParameter("flag");//与短信模板对应
    	try {
    		singService.sendSmsCode(phone, flag);
    		jsonResult.setDataObject("ok");
    	}catch(BusinessException be){
			this.businessExceptionResult(jsonResult, be);
		}catch(Exception e){
			this.exceptionResult(jsonResult);
		}
    	
    	return jsonResult;
    }

    /**
     * 验证短信码
     * @param request
     * @param modelMap
     * @return
     * @throws BusinessException
     */
    @SuppressWarnings({ "rawtypes", "unchecked" })
    @ResponseBody
    @RequestMapping(value = "/checkCode", method = RequestMethod.POST)
    public JsonResult checkSMSCode(HttpServletRequest request ) throws BusinessException {
    	JsonResult jsonResult = new JsonResult();
    	String phone = request.getParameter("tel");
    	String checkCode = request.getParameter("code");//
    	String flag = request.getParameter("flag");//与短信模板对应
    	
    	try {
    		singService.checkSmsCode(phone, checkCode, flag);
    		SortedMap<Object,Object> map = new TreeMap<Object,Object>();
    		map.put("phone", phone);
    		map.put("ip", request.getParameterMap().get("ip").toString());
    		
    		jsonResult.setDataObject(TokenUtilsService.getToken(map));
    	}catch(BusinessException be){
			this.businessExceptionResult(jsonResult, be);
		}catch(Exception e){
			this.exceptionResult(jsonResult);
		}
    	
    	return jsonResult;
    }
   
    @ResponseBody
    @RequestMapping(value = "/forgetPwd", method = RequestMethod.POST)
    public JsonResult forgetPwd(HttpServletRequest request,
    		BindingResult br ) throws BusinessException {
    	return null;
    }

    /**
     * 原密码修改
     * @param request
     * @return
     * @throws BusinessException 
     */
    @SuppressWarnings({ "rawtypes", "unchecked" })
    @ResponseBody
    @RequestMapping(value = "/modifyPwd", method = RequestMethod.POST)
    public JsonResult modifyPwd(PwdModifRequest pmr, BindingResult br, HttpServletRequest request) throws BusinessException {
    	JsonResult jsonResult = new JsonResult();
    	if(br.hasErrors()){
			this.illParamsResult(jsonResult, br);
    		return jsonResult;
		}
    	try {
    		MemberSignResponse msr = singService.resetPassword(pmr,true);
    		jsonResult.setDataObject(msr);
    	}catch(BusinessException be){
			this.businessExceptionResult(jsonResult, be);
		}catch(Exception e){
			this.exceptionResult(jsonResult);
		}
    	
    	return jsonResult;
    }
    
    /**
     * 重置密码
     * @param request
     * @return
     * @throws BusinessException 
     */
    @SuppressWarnings({ "rawtypes", "unchecked" })
    @ResponseBody
    @RequestMapping(value = "/resetPwd", method = RequestMethod.POST)
    public JsonResult resetPwd(PwdModifRequest pmr, BindingResult br, HttpServletRequest request) throws BusinessException {
    	JsonResult jsonResult = new JsonResult();
    	// 注意：原密码随便给个默认值就ok,比如：8ddda80e09e3df44fa024f11115c9dc7
    	if(br.hasErrors()){
    		this.illParamsResult(jsonResult, br);
    		return jsonResult;
    	}
    	try {
    		SortedMap<Object,Object> map = new TreeMap<Object,Object>();
    		map.put("phone", pmr.getTel());
    		map.put("ip", request.getParameterMap().get("ip").toString());
    		String checkToken = TokenUtilsService.getToken(map);
    		if(!checkToken.equals(pmr.getTooken())){
    			jsonResult.setCode("1111");
    			jsonResult.setErrorDescription("操作异常，不是本人操作");
    		}
    		MemberSignResponse msr = singService.resetPassword(pmr,false);
    		jsonResult.setDataObject(msr);
    	}catch(BusinessException be){
    		this.businessExceptionResult(jsonResult, be);
    	}catch(Exception e){
    		this.exceptionResult(jsonResult);
    	}
    	
    	return jsonResult;
    }
    
    /**
     * 退出
     * @param asr
     * @param br
     * @return
     */
    @SuppressWarnings({ "rawtypes", "unchecked" })
    @ResponseBody
    @RequestMapping(value = "/logout", method = RequestMethod.POST)
    public JsonResult incomeStatistics(AutoSignRequest asr, BindingResult br ) {
    	JsonResult jsonResult = new JsonResult();
    	if(br.hasErrors()){
    		this.illParamsResult(jsonResult, br);
    		return jsonResult;
    	}
    	try{
    		singService.logonOut(asr);
    		jsonResult.setDataObject("OK");
		}catch(BusinessException be){
			this.businessExceptionResult(jsonResult, be);
		}catch(Exception e){
			this.exceptionResult(jsonResult);
		}
		
		return jsonResult;
    }

    @ResponseBody
    @RequestMapping(value = "/thirdPartLogin", method = RequestMethod.POST)
    public JsonResult thirdPartLogin(HttpServletRequest request,
    		BindingResult br ) throws BusinessException {
    	return null;
    }

    /**
     * 第三方登录绑定手机号
     * @param request
     * @param modelMap
     * @return
     * @throws BusinessException
     */
    @ResponseBody
    @RequestMapping(value = "/thirdPartBindPhone", method = RequestMethod.POST)
    public JsonResult thirdPartBindPhone(HttpServletRequest request,
    		BindingResult br ) throws BusinessException {
    	return null;
    }

    /**
     * pc登录
     * @param request
     * @param login
     * @param br
     * @return
     * @throws BusinessException
     */
    @ResponseBody
    @RequestMapping(value = "/pcLogin", method = RequestMethod.POST)
    public JsonResult pcLogin() throws BusinessException { 
    	return null;
    }

}

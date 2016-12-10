package com.oil.av.web.api.controller.member;

import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.oil.av.web.api.controller.BaseController;
import com.oil.av.web.api.model.request.member.AutoSignRequest;
import com.oil.av.web.api.model.request.member.RegisterRequest;
import com.oil.av.web.api.model.request.member.UserSignRequest;
import com.oil.av.web.api.model.response.member.UserSignResponse;
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
    public JsonResult login(@Valid UserSignRequest userSignRequest,BindingResult br ){
    	JsonResult jsonResult = new JsonResult();
    	if(br.hasErrors()){
			this.illParamsResult(jsonResult, br);
    		return jsonResult;
		}
    	
    	try{
			UserSignResponse usr = singService.loginByMobile(userSignRequest);
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
			UserSignResponse usr = singService.autoLoginBySerial(autoSignRequest);
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
    		UserSignResponse sur = singService.registerUser(register);
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
    @ResponseBody
    @RequestMapping(value = "/sendNoteCode", method = RequestMethod.POST)
    public JsonResult sendNoteCode(HttpServletRequest request,
    		BindingResult br ) throws BusinessException {
    	return null;
    }

    /**
     * 验证短信码
     * @param request
     * @param modelMap
     * @return
     * @throws BusinessException
     */
    @ResponseBody
    @RequestMapping(value = "/checkCode", method = RequestMethod.POST)
    public JsonResult checkSMSCode(HttpServletRequest request,
    		BindingResult br ) throws BusinessException {
    	return null;
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

   
    @ResponseBody
    @RequestMapping(value = "/forgetPwd", method = RequestMethod.POST)
    public JsonResult forgetPwd(HttpServletRequest request,
    		BindingResult br ) throws BusinessException {
    	return null;
    }

    /**
     * 重置密码
     * @param request
     * @return
     * @throws BusinessException 
     */
    @ResponseBody
    @RequestMapping(value = "/resetPwd", method = RequestMethod.POST)
    public JsonResult resetPwd(HttpServletRequest request) throws BusinessException {
    	return null;
    }

    @ResponseBody
    @RequestMapping(value = "/logout", method = RequestMethod.POST)
    public JsonResult incomeStatistics(HttpServletRequest request, BindingResult br ) {
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

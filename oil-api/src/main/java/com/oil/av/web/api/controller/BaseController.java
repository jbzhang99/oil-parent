package com.oil.av.web.api.controller;

import org.springframework.validation.BindingResult;

import com.oil.av.web.api.constant.ErrCodeConfig;
import com.oil.framework.common.base.model.JsonResult;
import com.oil.framework.common.exception.BusinessException;


public class BaseController {

	 /**
     * 返回系统异常的错误信息
     *
     * @param jsonResult 结果
     * @return jsonResult 系统异常错误码 SE1001
     * @since 1.0
     */
	protected <T> JsonResult<T> exceptionResult(JsonResult<T> jsonResult) {
		ErrCodeConfig.injectError(jsonResult, ErrCodeConfig.CODE_EXCEPTION);
		return jsonResult;
	}
	
	/**
     * 业务异常错误信息
     * 
     * @param jsonResult
     * @param be
     * @return
     */
	 protected <T> JsonResult<T> businessExceptionResult(JsonResult<T> jsonResult,
             BusinessException be) {
		 return ErrCodeConfig.injectError(jsonResult, be.getCode());
	 }
	 
	 /**
	     * 返回请求参数非法的错误信息
	     *
	     * @param jsonResult 结果
	     * @param result     验证结果
	     * @return jsonResult 非法请求参数错误码 SE1000
	     * @since 1.0
	     */
	    protected <T> JsonResult<T> illParamsResult(JsonResult<T> jsonResult, BindingResult result) {
	        ErrCodeConfig.injectError(jsonResult, ErrCodeConfig.CODE_ILLPARAMERROR);
//	        logger.debug(result.getAllErrors().toString());
	        return jsonResult;
	    }
}

package com.oil.framework.common.exception;


import java.io.Serializable;

import org.apache.commons.lang3.StringUtils;


public class BusinessException extends Exception {

	 /**
     * @since 1.5
     */
    private static final long serialVersionUID = -7875638417065665771L;
    /**
     * 错误码
     */
    private String code;

    public BusinessException() {
        super();
    }
    
    
    /**
     * 业务异常构造器
     *
     * @param code    异常错误码
     * @since 1.0
     */
    public BusinessException(String code) {
		super();
		this.code = code;
	}

	/**
     * 业务异常构造器
     *
     * @param code    异常错误码
     * @param message 异常内容，可以为空。如果为空，则根据错误码去错误码表查找相应的错误提示
     * @since 1.0
     */
    public BusinessException(String code, String message) {
        super(message);
        this.code = code;
    }

    public BusinessException(String message, Throwable cause) {
        super(message, cause);
    }

    public BusinessException(Throwable cause) {
        super(cause);
    }

    public BusinessException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}

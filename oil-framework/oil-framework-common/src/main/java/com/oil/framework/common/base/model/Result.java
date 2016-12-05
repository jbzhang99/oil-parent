package com.oil.framework.common.base.model;

import java.io.Serializable;

/**
 * 抽象类：返回结果
 */
public abstract class Result<T> implements Serializable {
    /**
     *Comment for <code>serialVersionUID</code>
     */
    private static final long serialVersionUID = -6176944338511043743L;
    //错误码
    private String            code             = "0";
    //错误对象
    private String            errorDescription;
    //返回数据
    private T                 dataObject;

    public Result(String code, String errorDescription) {
        this.code = code;
        this.errorDescription = errorDescription;
    }

    public Result() {}

    /**
     * 返回code值
     * @return code
     */
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    /**
     * 返回错误描述
     * @return errorDescription ，返回结果为成功时，为空
     */
    public String getErrorDescription() {
        return errorDescription;
    }

    public void setErrorDescription(String errorDescription) {
        this.errorDescription = errorDescription;
    }

    /**
     * 调用成功返回的数据模型
     * @return dataObject 返回错误时，该值可以为空
     */
    public T getDataObject() {
        return dataObject;
    }

    public void setDataObject(T dataObject) {
        this.dataObject = dataObject;
    }

    /**
     * 是否成功
     * 
     * @return
     */
    public Boolean getSuccess() {
        if ("0".equals(code)) {
            return true;
        } else {
            return false;
        }
    }
}

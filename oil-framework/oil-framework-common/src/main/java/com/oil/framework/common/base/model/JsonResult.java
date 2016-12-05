package com.oil.framework.common.base.model;

/**
 * 流程层返回JSON结果集
 *
 * @author XuDongDong  2015/4/16.
 */
public class JsonResult<T> extends Result<T> {

    /**
     *Comment for <code>serialVersionUID</code>
     */
    private static final long serialVersionUID = 9154484378817818393L;

    public JsonResult(String code, String errorDescription) {
        super(code, errorDescription);
    }

    public JsonResult() {
        super();
    }
}

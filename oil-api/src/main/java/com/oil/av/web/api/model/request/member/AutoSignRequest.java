package com.oil.av.web.api.model.request.member;


import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.NotEmpty;

import com.oil.av.web.api.model.request.BaseRequest;

public class AutoSignRequest extends BaseRequest{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 用户ID
	 */
	@NotEmpty
	@Pattern(regexp="/^[a-zA-Z0-9]*$/", message="数字和字母的组合")
	private String userId;
	

	/**
	 * 用户登陆序列
	 */
	@NotEmpty
	@Pattern(regexp="/^[a-zA-Z0-9]*$/", message="数字和字母的组合")
	private String serialNumber;
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	/**
	 * @return the serialNumber
	 */
	public String getSerialNumber() {
		return serialNumber;
	}
	/**
	 * @param serialNumber the serialNumber to set
	 */
	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}
	
}

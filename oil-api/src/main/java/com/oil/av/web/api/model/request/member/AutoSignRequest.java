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
	private String memberId;
	

	/**
	 * 用户登陆序列
	 */
	@NotEmpty
	@Pattern(regexp="/^[a-zA-Z0-9]*$/", message="数字和字母的组合")
	private String serialNumber;
	
	/**
	 * @return the memberId
	 */
	public String getMemberId() {
		return memberId;
	}
	/**
	 * @param memberId the memberId to set
	 */
	public void setMemberId(String memberId) {
		this.memberId = memberId;
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

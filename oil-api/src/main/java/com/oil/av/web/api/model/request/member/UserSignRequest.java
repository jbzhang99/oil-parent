package com.oil.av.web.api.model.request.member;


import org.hibernate.validator.constraints.NotEmpty;

import com.oil.av.web.api.model.BaseRequest;

public class UserSignRequest extends BaseRequest{

	/**
	 * 用户名
	 */
	@NotEmpty
	private String userName;
	/**
	 * 密码
	 */
	@NotEmpty
	private String pwd;
	
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	
	
}

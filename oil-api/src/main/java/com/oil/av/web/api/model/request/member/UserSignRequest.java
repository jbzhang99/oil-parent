package com.oil.av.web.api.model.request.member;


import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.NotEmpty;

import com.oil.av.web.api.model.request.BaseRequest;

public class UserSignRequest extends BaseRequest{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 用户名，手机号
	 */
	@NotEmpty
	@Pattern(regexp="^1[34578]\\d{9}$", message="手机号格式不正确")
	private String userName;
	
	/**
	 * 密码
	 */
	@NotEmpty
	@Pattern(regexp="/^[a-zA-Z]\\w{5,17}$/", message="以字母开头，长度在6~18之间，只能包含字符、数字和下划线")
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

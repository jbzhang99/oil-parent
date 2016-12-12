package com.oil.av.web.api.model.request.member;


import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.NotEmpty;

import com.oil.av.web.api.model.request.BaseRequest;

public class MemberSignRequest extends BaseRequest{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 用户名，手机号
	 */
	@NotEmpty
	@Pattern(regexp="^1[34578]\\d{9}$", message="手机号格式不正确")
	private String tel;
	
	/**
	 * 密码
	 */
	@NotEmpty
	@Pattern(regexp="/^[a-zA-Z]\\w{5,17}$/", message="以字母开头，长度在6~18之间，只能包含字符、数字和下划线")
	private String pwd;
	
	
	/**
	 * @return the tel
	 */
	public String getTel() {
		return tel;
	}
	/**
	 * @param tel the tel to set
	 */
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	
}

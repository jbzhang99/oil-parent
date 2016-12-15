package com.oil.av.web.api.model.request;


import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.NotEmpty;

import com.oil.av.web.api.model.request.BaseRequest;

public class BaseMemberRequest extends BaseRequest{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 用户ID
	 */
	@NotEmpty
	@Pattern(regexp="^\\w{32}$", message="用户ID格式不正确")
	private String memberId;

	/**  
	 * 获取memberId  
	 * @return memberId memberId  
	 */
	public String getMemberId() {
		return memberId;
	}
	

	/**  
	 * 设置memberId  
	 * @param memberId memberId  
	 */
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	
	
}

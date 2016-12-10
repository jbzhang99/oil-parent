package com.oil.av.web.api.model.response.member;

import com.oil.av.web.api.model.response.BaseResponse;

public class UserSignResponse extends BaseResponse{

    /**
     *Comment for <code>serialVersionUID</code>
     */
    private static final long serialVersionUID = -939261706201571601L;

    private String	userId;//用户id
    private String  phone;//用户手机号
    private String  serial;//用户登陆序列
	/**
	 * @return the userId
	 */
	public String getUserId() {
		return userId;
	}
	/**
	 * @param userId the userId to set
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}
	/**
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}
	/**
	 * @param phone the phone to set
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}
	/**
	 * @return the serial
	 */
	public String getSerial() {
		return serial;
	}
	/**
	 * @param serial the serial to set
	 */
	public void setSerial(String serial) {
		this.serial = serial;
	}

}

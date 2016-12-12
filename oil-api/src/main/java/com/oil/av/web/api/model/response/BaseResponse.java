package com.oil.av.web.api.model.response;

import java.io.Serializable;

import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.NotEmpty;

public class BaseResponse implements Serializable{

	private static final long serialVersionUID = 3301642332497735651L;
	/**
	 * 请求tooken
	 */
	private String token;
	
	/**
	 * 版本号
	 */
	private String version;
	/**
	 * 设备号
	 */
	private String deviceCode;
	/**
	 * 设备 ios/android
	 */
	private String device;
	
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public String getDeviceCode() {
		return deviceCode;
	}
	public void setDeviceCode(String deviceCode) {
		this.deviceCode = deviceCode;
	}
	public String getDevice() {
		return device;
	}
	public void setDevice(String device) {
		this.device = device;
	}

}

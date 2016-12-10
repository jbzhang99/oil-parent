package com.oil.av.web.api.model.request;

import java.io.Serializable;

import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.NotEmpty;

public class BaseRequest implements Serializable{

	private static final long serialVersionUID = 3301642332497735651L;
	/**
	 * 请求tooken
	 */
	@NotEmpty
	private String tooken;
	
	/**
	 * 版本号
	 */
	@NotEmpty
	private String version;
	/**
	 * 设备号
	 */
	@NotEmpty
	private String deviceCode;
	
	/**
	 * 请求ip
	 */
	private String ip;
	
	/**
	 * 设备 ios/android
	 */
	@NotEmpty
	@Pattern(regexp = "android|ios|ANDROID|IOS",message = "设备参数有误")
	private String device;
	
	public String getTooken() {
		return tooken;
	}
	public void setTooken(String tooken) {
		this.tooken = tooken;
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
	/**
	 * @return the ip
	 */
	public String getIp() {
		return ip;
	}
	/**
	 * @param ip the ip to set
	 */
	public void setIp(String ip) {
		this.ip = ip;
	}

}

package com.oil.av.web.api.model.request.member;

import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.NotEmpty;

import com.oil.av.web.api.model.request.BaseRequest;

public class PwdModifRequest extends BaseRequest{

	private static final long serialVersionUID = 1L;

	/**
	 * 手机号
	 */
	@NotEmpty
	@Pattern(regexp="^1[34578]\\d{9}$", message="手机号格式不正确")
    private String tel;
    
	/**
	 * 请求tooken
	 */
	@NotEmpty
	private String tooken;
	
	 /**
     * 原密码
     */
	@NotEmpty
	@Pattern(regexp="/^[a-zA-Z]\\w{5,17}$/", message="以字母开头，长度在6~18之间，只能包含字符、数字和下划线")
    private String oldPwd;
    
    /**
     * 密码
     */
    @NotEmpty
    @Pattern(regexp="/^[a-zA-Z]\\w{5,17}$/", message="以字母开头，长度在6~18之间，只能包含字符、数字和下划线")
    private String pwd;
    /**
     * 密码2
     */
    @NotEmpty
	@Pattern(regexp="/^[a-zA-Z]\\w{5,17}$/", message="以字母开头，长度在6~18之间，只能包含字符、数字和下划线")
    private String copyPwd;
    
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
	/**
	 * @return the tooken
	 */
	public String getTooken() {
		return tooken;
	}
	/**
	 * @param tooken the tooken to set
	 */
	public void setTooken(String tooken) {
		this.tooken = tooken;
	}
	/**
	 * @return the pwd
	 */
	public String getPwd() {
		return pwd;
	}
	/**
	 * @param pwd the pwd to set
	 */
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	/**
	 * @return the copyPwd
	 */
	public String getCopyPwd() {
		return copyPwd;
	}
	/**
	 * @param copyPwd the copyPwd to set
	 */
	public void setCopyPwd(String copyPwd) {
		this.copyPwd = copyPwd;
	}
	/**
	 * @return the oldPwd
	 */
	public String getOldPwd() {
		return oldPwd;
	}
	/**
	 * @param oldPwd the oldPwd to set
	 */
	public void setOldPwd(String oldPwd) {
		this.oldPwd = oldPwd;
	}
    
    
}

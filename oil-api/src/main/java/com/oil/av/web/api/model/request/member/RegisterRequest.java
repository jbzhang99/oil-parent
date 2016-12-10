package com.oil.av.web.api.model.request.member;

import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.NotEmpty;

import com.oil.av.web.api.model.request.BaseRequest;

public class RegisterRequest extends BaseRequest{

	private static final long serialVersionUID = 1L;

	/**
	 * 手机号
	 */
	@NotEmpty
	@Pattern(regexp="^1[34578]\\d{9}$", message="手机号格式不正确")
    private String tel;
    
    /**
     * 验证码
     */
	@NotEmpty
	@Pattern(regexp="^\\d*$", message="验证码输入不正确")
    private String verifyCode;
    
    /**
     * 昵称
     */
	@NotEmpty
    private String nickName;
    
    /**
     * 密码
     */
    @NotEmpty
	@Pattern(regexp="/^[a-zA-Z]\\w{5,17}$/", message="以字母开头，长度在6~18之间，只能包含字符、数字和下划线")
    private String pwd;
    
    public String getTel() {
        return tel;
    }
    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getPwd() {
        return pwd;
    }
    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
	/**
	 * @return the verifyCode
	 */
	public String getVerifyCode() {
		return verifyCode;
	}
	/**
	 * @param verifyCode the verifyCode to set
	 */
	public void setVerifyCode(String verifyCode) {
		this.verifyCode = verifyCode;
	}
	/**
	 * @return the nickName
	 */
	public String getNickName() {
		return nickName;
	}
	/**
	 * @param nickName the nickName to set
	 */
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

}

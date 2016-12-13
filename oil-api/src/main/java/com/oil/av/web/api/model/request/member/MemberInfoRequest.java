package com.oil.av.web.api.model.request.member;


import org.hibernate.validator.constraints.NotBlank;

import com.oil.av.web.api.model.request.BaseMemberRequest;

public class MemberInfoRequest extends BaseMemberRequest{


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
     * 用户头像
     */
	@NotBlank
    private String avatar;
    
    /**
     * 昵称
     */
	@NotBlank
    private String nick;
    
    /**
     * 性别
     */
	@NotBlank
    private String sex;
    
    /**
     * 生日
     */
	@NotBlank
    private String birthday;
    
    /**
     * 地址
     */
	@NotBlank
    private String address;
    
    /**
     * 姓名
     */
	@NotBlank
    private String name;
    
    /**
     * 身份证号
     */
	@NotBlank
    private String idCard;
    
    
	/**
	 * @return the avatar
	 */
	public String getAvatar() {
		return avatar;
	}

	/**
	 * @param avatar the avatar to set
	 */
	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	/**
	 * @return the nick
	 */
	public String getNick() {
		return nick;
	}

	/**
	 * @param nick the nick to set
	 */
	public void setNick(String nick) {
		this.nick = nick;
	}

	/**
	 * @return the sex
	 */
	public String getSex() {
		return sex;
	}

	/**
	 * @param sex the sex to set
	 */
	public void setSex(String sex) {
		this.sex = sex;
	}

	/**
	 * @return the birthday
	 */
	public String getBirthday() {
		return birthday;
	}

	/**
	 * @param birthday the birthday to set
	 */
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the idCard
	 */
	public String getIdCard() {
		return idCard;
	}

	/**
	 * @param idCard the idCard to set
	 */
	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}
	
}

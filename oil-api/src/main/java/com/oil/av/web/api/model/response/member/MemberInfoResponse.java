package com.oil.av.web.api.model.response.member;

import org.hibernate.validator.constraints.NotBlank;

import com.oil.av.web.api.model.response.BaseResponse;

public class MemberInfoResponse extends BaseResponse{

    /**
     *Comment for <code>serialVersionUID</code>
     */
    private static final long serialVersionUID = -939261706201571601L;

    /**
     * 用户id
     */
    private String	memberId;//
    
    /**
     * 用户头像
     */
    private String avatar;

    /**
     * 昵称
     */
    private String nick;
    
    /**
     * 性别
     */
    private String sex;
    
    /**
     * 生日
     */
    private String birthday;
    
    /**
     * 地址
     */
    private String address;
    
    /**
     * 姓名
     */
    private String name;
    
    /**
     * 身份证号
     */
    private String idCard;
    
    /**
     * 企业名称
     */
    private String businessName;
    
    /**
     * 简介
     */
    private String businessInfo;
    
    /**
     * 经营范围
     */
    private String businessScope;
    
    /**
     * 企业联系人
     */
	@NotBlank
    private String touchName;
    
    /**
     * 企业联系电话
     */
	@NotBlank
    private String touchPhone;
    
    /**
     * 付款行
     */
	@NotBlank
    private String bank;
    
    /**
     * 付款账号
     */
	@NotBlank
    private String bankNumber;
    
    /**
     * 发票信息
     */
	@NotBlank
    private String invoice;
	
    /**
	 * @return the memberId
	 */
	public String getMemberId() {
		return memberId;
	}
	/**
	 * @param memberId the memberId to set
	 */
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
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
	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}
	public String getBusinessName() {
		return businessName;
	}
	public void setBusinessName(String businessName) {
		this.businessName = businessName;
	}
	public String getBusinessInfo() {
		return businessInfo;
	}
	public void setBusinessInfo(String businessInfo) {
		this.businessInfo = businessInfo;
	}
	/**
	 * @return the businessScope
	 */
	public String getBusinessScope() {
		return businessScope;
	}
	/**
	 * @param businessScope the businessScope to set
	 */
	public void setBusinessScope(String businessScope) {
		this.businessScope = businessScope;
	}
	/**  
	 * 获取touchName  
	 * @return touchName touchName  
	 */
	public String getTouchName() {
		return touchName;
	}
	
	/**  
	 * 设置touchName  
	 * @param touchName touchName  
	 */
	public void setTouchName(String touchName) {
		this.touchName = touchName;
	}
	
	/**  
	 * 获取touchPhone  
	 * @return touchPhone touchPhone  
	 */
	public String getTouchPhone() {
		return touchPhone;
	}
	
	/**  
	 * 设置touchPhone  
	 * @param touchPhone touchPhone  
	 */
	public void setTouchPhone(String touchPhone) {
		this.touchPhone = touchPhone;
	}
	
	/**  
	 * 获取bank  
	 * @return bank bank  
	 */
	public String getBank() {
		return bank;
	}
	
	/**  
	 * 设置bank  
	 * @param bank bank  
	 */
	public void setBank(String bank) {
		this.bank = bank;
	}
	
	/**  
	 * 获取bankNumber  
	 * @return bankNumber bankNumber  
	 */
	public String getBankNumber() {
		return bankNumber;
	}
	
	/**  
	 * 设置bankNumber  
	 * @param bankNumber bankNumber  
	 */
	public void setBankNumber(String bankNumber) {
		this.bankNumber = bankNumber;
	}
	
	/**  
	 * 获取invoice  
	 * @return invoice invoice  
	 */
	public String getInvoice() {
		return invoice;
	}
	
	/**  
	 * 设置invoice  
	 * @param invoice invoice  
	 */
	public void setInvoice(String invoice) {
		this.invoice = invoice;
	}
	

}

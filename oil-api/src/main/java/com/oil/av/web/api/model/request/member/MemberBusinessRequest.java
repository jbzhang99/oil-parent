package com.oil.av.web.api.model.request.member;


import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;

import com.oil.av.web.api.model.request.BaseRequest;

public class MemberBusinessRequest extends BaseRequest{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 用户ID
	 */
	@NotEmpty
	@Pattern(regexp="^\\w{32}$", message="用户id不正确")
	private String memberId;

	/**
     * 企业名称
     */
	@NotBlank
	private String id;
	
	/**
	 * 企业名称
	 */
	@NotBlank
	private String businessName;
    
    /**
     * 企业简介
     */
	@NotBlank
    private String businessInfo;
    
    /**
     * 经营范围
     */
	@NotBlank
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
	 * 获取id  
	 * @return id id  
	 */
	public String getId() {
		return id;
	}
	

	/**  
	 * 设置id  
	 * @param id id  
	 */
	public void setId(String id) {
		this.id = id;
	}
	

	/**  
	 * 获取businessName  
	 * @return businessName businessName  
	 */
	public String getBusinessName() {
		return businessName;
	}
	

	/**  
	 * 设置businessName  
	 * @param businessName businessName  
	 */
	public void setBusinessName(String businessName) {
		this.businessName = businessName;
	}
	

	/**  
	 * 获取businessInfo  
	 * @return businessInfo businessInfo  
	 */
	public String getBusinessInfo() {
		return businessInfo;
	}
	

	/**  
	 * 设置businessInfo  
	 * @param businessInfo businessInfo  
	 */
	public void setBusinessInfo(String businessInfo) {
		this.businessInfo = businessInfo;
	}
	

	/**  
	 * 获取businessScope  
	 * @return businessScope businessScope  
	 */
	public String getBusinessScope() {
		return businessScope;
	}
	

	/**  
	 * 设置businessScope  
	 * @param businessScope businessScope  
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

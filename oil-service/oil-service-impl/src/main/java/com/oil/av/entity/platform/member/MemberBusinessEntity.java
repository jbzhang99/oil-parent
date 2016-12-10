package com.oil.av.entity.platform.member;

import java.io.Serializable;

import com.oil.framework.base.entity.BaseEntity;
/**
 * 用户公司信息
 * <p>Table: <strong>pm_member_business</strong>
 * <p><table class="er-mapping" cellspacing=0 cellpadding=0 style="border:solid 1 #666;padding:3px;">
 *   <tr style="background-color:#ddd;Text-align:Left;">
 *     <th nowrap>属性名</th><th nowrap>属性类型</th><th nowrap>字段名</th><th nowrap>字段类型</th><th nowrap>说明</th>
 *   </tr>
 *   <tr><td>id</td><td>{@link java.lang.String}</td><td>id</td><td>varchar</td><td>编码</td></tr>
 *   <tr><td>userId</td><td>{@link java.lang.String}</td><td>user_id</td><td>varchar</td><td>用户id</td></tr>
 *   <tr><td>businessName</td><td>{@link java.lang.String}</td><td>business_name</td><td>varchar</td><td>企业名称</td></tr>
 *   <tr><td>phone</td><td>{@link java.lang.String}</td><td>phone</td><td>varchar</td><td>电话</td></tr>
 *   <tr><td>bank</td><td>{@link java.lang.String}</td><td>bank</td><td>varchar</td><td>付款行</td></tr>
 *   <tr><td>bankNumber</td><td>{@link java.lang.String}</td><td>bank_number</td><td>varchar</td><td>付款账号</td></tr>
 *   <tr><td>invoice</td><td>{@link java.lang.String}</td><td>invoice</td><td>varchar</td><td>发票信息</td></tr>
 *   <tr><td>createBy</td><td>{@link java.lang.String}</td><td>create_by</td><td>varchar</td><td>创建者</td></tr>
 *   <tr><td>createDate</td><td>{@link java.util.Date}</td><td>create_date</td><td>datetime</td><td>创建时间</td></tr>
 *   <tr><td>updateBy</td><td>{@link java.lang.String}</td><td>update_by</td><td>varchar</td><td>更新者</td></tr>
 *   <tr><td>updateDate</td><td>{@link java.util.Date}</td><td>update_date</td><td>datetime</td><td>更新时间</td></tr>
 * </table>
 */
public class MemberBusinessEntity extends BaseEntity implements Serializable {
 
 	
 		private java.lang.String id;
 		/**
	     * 获取编码
	     */
 		public java.lang.String getId(){
 			return this.id;
 		}
 		
 		/**
	     * 设置编码
	     */
 		public void setId(java.lang.String id){
 			this.id = id;
 		} 				
 		
 		private java.lang.String userId;
 		/**
	     * 获取用户id
	     */
 		public java.lang.String getUserId(){
 			return this.userId;
 		}
 		
 		/**
	     * 设置用户id
	     */
 		public void setUserId(java.lang.String userId){
 			this.userId = userId;
 		} 				
 		
 		private java.lang.String businessName;
 		/**
	     * 获取企业名称
	     */
 		public java.lang.String getBusinessName(){
 			return this.businessName;
 		}
 		
 		/**
	     * 设置企业名称
	     */
 		public void setBusinessName(java.lang.String businessName){
 			this.businessName = businessName;
 		} 				
 		
 		private java.lang.String phone;
 		/**
	     * 获取电话
	     */
 		public java.lang.String getPhone(){
 			return this.phone;
 		}
 		
 		/**
	     * 设置电话
	     */
 		public void setPhone(java.lang.String phone){
 			this.phone = phone;
 		} 				
 		
 		private java.lang.String bank;
 		/**
	     * 获取付款行
	     */
 		public java.lang.String getBank(){
 			return this.bank;
 		}
 		
 		/**
	     * 设置付款行
	     */
 		public void setBank(java.lang.String bank){
 			this.bank = bank;
 		} 				
 		
 		private java.lang.String bankNumber;
 		/**
	     * 获取付款账号
	     */
 		public java.lang.String getBankNumber(){
 			return this.bankNumber;
 		}
 		
 		/**
	     * 设置付款账号
	     */
 		public void setBankNumber(java.lang.String bankNumber){
 			this.bankNumber = bankNumber;
 		} 				
 		
 		private java.lang.String invoice;
 		/**
	     * 获取发票信息
	     */
 		public java.lang.String getInvoice(){
 			return this.invoice;
 		}
 		
 		/**
	     * 设置发票信息
	     */
 		public void setInvoice(java.lang.String invoice){
 			this.invoice = invoice;
 		} 				
 		
 		private java.lang.String createBy;
 		/**
	     * 获取创建者
	     */
 		public java.lang.String getCreateBy(){
 			return this.createBy;
 		}
 		
 		/**
	     * 设置创建者
	     */
 		public void setCreateBy(java.lang.String createBy){
 			this.createBy = createBy;
 		} 				
 		
 		private java.util.Date createDate;
 		/**
	     * 获取创建时间
	     */
 		public java.util.Date getCreateDate(){
 			return this.createDate;
 		}
 		
 		/**
	     * 设置创建时间
	     */
 		public void setCreateDate(java.util.Date createDate){
 			this.createDate = createDate;
 		} 				
 		
 		private java.lang.String updateBy;
 		/**
	     * 获取更新者
	     */
 		public java.lang.String getUpdateBy(){
 			return this.updateBy;
 		}
 		
 		/**
	     * 设置更新者
	     */
 		public void setUpdateBy(java.lang.String updateBy){
 			this.updateBy = updateBy;
 		} 				
 		
 		private java.util.Date updateDate;
 		/**
	     * 获取更新时间
	     */
 		public java.util.Date getUpdateDate(){
 			return this.updateDate;
 		}
 		
 		/**
	     * 设置更新时间
	     */
 		public void setUpdateDate(java.util.Date updateDate){
 			this.updateDate = updateDate;
 		} 				
 		
 }
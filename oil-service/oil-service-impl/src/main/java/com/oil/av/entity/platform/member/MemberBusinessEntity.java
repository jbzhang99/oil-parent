package com.oil.av.entity.platform.member;

import java.io.Serializable;

import com.oil.framework.base.entity.BaseEntity;
/**
 * 用户管理-公司信息
 * <p>Table: <strong>pm_member_business</strong>
 * <p><table class="er-mapping" cellspacing=0 cellpadding=0 style="border:solid 1 #666;padding:3px;">
 *   <tr style="background-color:#ddd;Text-align:Left;">
 *     <th nowrap>属性名</th><th nowrap>属性类型</th><th nowrap>字段名</th><th nowrap>字段类型</th><th nowrap>说明</th>
 *   </tr>
 *   <tr><td>id</td><td>{@link java.lang.String}</td><td>id</td><td>varchar</td><td>编码</td></tr>
 *   <tr><td>memberId</td><td>{@link java.lang.String}</td><td>member_id</td><td>varchar</td><td>用户id</td></tr>
 *   <tr><td>businessName</td><td>{@link java.lang.String}</td><td>business_name</td><td>varchar</td><td>企业名称</td></tr>
 *   <tr><td>businessInfo</td><td>{@link java.lang.String}</td><td>business_info</td><td>varchar</td><td>企业简介</td></tr>
 *   <tr><td>businessScope</td><td>{@link java.lang.String}</td><td>business_scope</td><td>varchar</td><td>经营范围</td></tr>
 *   <tr><td>touchName</td><td>{@link java.lang.String}</td><td>touch_name</td><td>varchar</td><td>企业联系人</td></tr>
 *   <tr><td>touchPhone</td><td>{@link java.lang.String}</td><td>touch_phone</td><td>varchar</td><td>企业联系电话</td></tr>
 *   <tr><td>bank</td><td>{@link java.lang.String}</td><td>bank</td><td>varchar</td><td>付款行</td></tr>
 *   <tr><td>bankNumber</td><td>{@link java.lang.String}</td><td>bank_number</td><td>varchar</td><td>付款账号</td></tr>
 *   <tr><td>invoice</td><td>{@link java.lang.String}</td><td>invoice</td><td>varchar</td><td>发票信息</td></tr>
 *   <tr><td>createUser</td><td>{@link java.lang.String}</td><td>create_user</td><td>varchar</td><td>创建人</td></tr>
 *   <tr><td>createTime</td><td>{@link java.util.Date}</td><td>create_time</td><td>datetime</td><td>创建时间</td></tr>
 *   <tr><td>modifyUser</td><td>{@link java.lang.String}</td><td>modify_user</td><td>varchar</td><td>修改人</td></tr>
 *   <tr><td>modifyTime</td><td>{@link java.util.Date}</td><td>modify_time</td><td>datetime</td><td>修改时间</td></tr>
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
 		
 		private java.lang.String memberId;
 		/**
	     * 获取用户id
	     */
 		public java.lang.String getMemberId(){
 			return this.memberId;
 		}
 		
 		/**
	     * 设置用户id
	     */
 		public void setMemberId(java.lang.String memberId){
 			this.memberId = memberId;
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
 		
 		private java.lang.String businessInfo;
 		/**
	     * 获取企业简介
	     */
 		public java.lang.String getBusinessInfo(){
 			return this.businessInfo;
 		}
 		
 		/**
	     * 设置企业简介
	     */
 		public void setBusinessInfo(java.lang.String businessInfo){
 			this.businessInfo = businessInfo;
 		} 				
 		
 		private java.lang.String businessScope;
 		/**
	     * 获取经营范围
	     */
 		public java.lang.String getBusinessScope(){
 			return this.businessScope;
 		}
 		
 		/**
	     * 设置经营范围
	     */
 		public void setBusinessScope(java.lang.String businessScope){
 			this.businessScope = businessScope;
 		} 				
 		
 		private java.lang.String touchName;
 		/**
	     * 获取企业联系人
	     */
 		public java.lang.String getTouchName(){
 			return this.touchName;
 		}
 		
 		/**
	     * 设置企业联系人
	     */
 		public void setTouchName(java.lang.String touchName){
 			this.touchName = touchName;
 		} 				
 		
 		private java.lang.String touchPhone;
 		/**
	     * 获取企业联系电话
	     */
 		public java.lang.String getTouchPhone(){
 			return this.touchPhone;
 		}
 		
 		/**
	     * 设置企业联系电话
	     */
 		public void setTouchPhone(java.lang.String touchPhone){
 			this.touchPhone = touchPhone;
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
 		
 		private java.lang.String createUser;
 		/**
	     * 获取创建人
	     */
 		public java.lang.String getCreateUser(){
 			return this.createUser;
 		}
 		
 		/**
	     * 设置创建人
	     */
 		public void setCreateUser(java.lang.String createUser){
 			this.createUser = createUser;
 		} 				
 		
 		private java.util.Date createTime;
 		/**
	     * 获取创建时间
	     */
 		public java.util.Date getCreateTime(){
 			return this.createTime;
 		}
 		
 		/**
	     * 设置创建时间
	     */
 		public void setCreateTime(java.util.Date createTime){
 			this.createTime = createTime;
 		} 				
 		
 		private java.lang.String modifyUser;
 		/**
	     * 获取修改人
	     */
 		public java.lang.String getModifyUser(){
 			return this.modifyUser;
 		}
 		
 		/**
	     * 设置修改人
	     */
 		public void setModifyUser(java.lang.String modifyUser){
 			this.modifyUser = modifyUser;
 		} 				
 		
 		private java.util.Date modifyTime;
 		/**
	     * 获取修改时间
	     */
 		public java.util.Date getModifyTime(){
 			return this.modifyTime;
 		}
 		
 		/**
	     * 设置修改时间
	     */
 		public void setModifyTime(java.util.Date modifyTime){
 			this.modifyTime = modifyTime;
 		} 				
 		
 }
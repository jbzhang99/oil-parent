package com.oil.av.vo.platform.config;

import com.oil.av.em.SmsQueueTypeEnum;
import com.oil.framework.base.vo.BaseVo; 			
/**
 * 运营管理-短信队列
 * <p>Table: <strong>po_sms_queue</strong>
 * <p><table class="er-mapping" cellspacing=0 cellpadding=0 style="border:solid 1 #666;padding:3px;">
 *   <tr style="background-color:#ddd;Text-align:Left;">
 *     <th nowrap>属性名</th><th nowrap>属性类型</th><th nowrap>字段名</th><th nowrap>字段类型</th><th nowrap>说明</th>
 *   </tr>
 *   <tr><td>id</td><td>{@link java.lang.String}</td><td>id</td><td>varchar</td><td>主键</td></tr>
 *   <tr><td>templateId</td><td>{@link java.lang.String}</td><td>template_id</td><td>varchar</td><td>短信模版ID</td></tr>
 *   <tr><td>smsQueueTypeEnum</td><td>{@link java.lang.String}</td><td>type</td><td>varchar</td><td>用户类型:enum:member,会员;system,系统;</td></tr>
 *   <tr><td>name</td><td>{@link java.lang.String}</td><td>name</td><td>varchar</td><td>用户姓名</td></tr>
 *   <tr><td>phone</td><td>{@link java.lang.String}</td><td>phone</td><td>varchar</td><td>手机号码</td></tr>
 *   <tr><td>content</td><td>{@link java.lang.String}</td><td>content</td><td>varchar</td><td>消息内容</td></tr>
 *   <tr><td>sendTimes</td><td>{@link java.lang.Integer}</td><td>send_times</td><td>int</td><td>发送次数</td></tr>
 *   <tr><td>isSuccess</td><td>{@link java.lang.Boolean}</td><td>is_success</td><td>tinyint</td><td>是否成功</td></tr>
 *   <tr><td>successTime</td><td>{@link java.util.Date}</td><td>success_time</td><td>datetime</td><td>发送成功时间</td></tr>
 *   <tr><td>lastSendTime</td><td>{@link java.util.Date}</td><td>last_send_time</td><td>datetime</td><td>最后发送时间</td></tr>
 *   <tr><td>createUser</td><td>{@link java.lang.String}</td><td>create_user</td><td>varchar</td><td>创建人</td></tr>
 *   <tr><td>createTime</td><td>{@link java.util.Date}</td><td>create_time</td><td>datetime</td><td>创建时间</td></tr>
 *   <tr><td>modifyUser</td><td>{@link java.lang.String}</td><td>modify_user</td><td>varchar</td><td>修改人</td></tr>
 *   <tr><td>modifyTime</td><td>{@link java.util.Date}</td><td>modify_time</td><td>datetime</td><td>修改时间</td></tr>
 * </table>
 */
public class SmsQueueVo extends BaseVo{
 
 	
 		private java.lang.String id;
 		/**
	     * 获取主键
	     */
 		public java.lang.String getId(){
 			return this.id;
 		}
 		
 		/**
	     * 设置主键
	     */
 		public void setId(java.lang.String id){
 			this.id = id;
 		} 				
 		
 		private java.lang.String templateId;
 		/**
	     * 获取短信模版ID
	     */
 		public java.lang.String getTemplateId(){
 			return this.templateId;
 		}
 		
 		/**
	     * 设置短信模版ID
	     */
 		public void setTemplateId(java.lang.String templateId){
 			this.templateId = templateId;
 		} 				
 		
 		private SmsQueueTypeEnum smsQueueTypeEnum;
 		/**
	     * 获取用户类型:enum:member,会员;system,系统;
	     */
 		public SmsQueueTypeEnum getSmsQueueTypeEnum(){
 			return this.smsQueueTypeEnum;
 		}
 		
 		/**
	     * 设置用户类型:enum:member,会员;system,系统;
	     */
 		public void setSmsQueueTypeEnum(SmsQueueTypeEnum smsQueueTypeEnum){
 			this.smsQueueTypeEnum= smsQueueTypeEnum;
 		} 		
 		
 		private java.lang.String name;
 		/**
	     * 获取用户姓名
	     */
 		public java.lang.String getName(){
 			return this.name;
 		}
 		
 		/**
	     * 设置用户姓名
	     */
 		public void setName(java.lang.String name){
 			this.name = name;
 		} 				
 		
 		private java.lang.String phone;
 		/**
	     * 获取手机号码
	     */
 		public java.lang.String getPhone(){
 			return this.phone;
 		}
 		
 		/**
	     * 设置手机号码
	     */
 		public void setPhone(java.lang.String phone){
 			this.phone = phone;
 		} 				
 		
 		private java.lang.String content;
 		/**
	     * 获取消息内容
	     */
 		public java.lang.String getContent(){
 			return this.content;
 		}
 		
 		/**
	     * 设置消息内容
	     */
 		public void setContent(java.lang.String content){
 			this.content = content;
 		} 				
 		
 		private java.lang.Integer sendTimes;
 		/**
	     * 获取发送次数
	     */
 		public java.lang.Integer getSendTimes(){
 			return this.sendTimes;
 		}
 		
 		/**
	     * 设置发送次数
	     */
 		public void setSendTimes(java.lang.Integer sendTimes){
 			this.sendTimes = sendTimes;
 		} 				
 		
 		private java.lang.Boolean isSuccess;
 		/**
	     * 获取是否成功
	     */
 		public java.lang.Boolean getIsSuccess(){
 			return this.isSuccess;
 		}
 		
 		/**
	     * 设置是否成功
	     */
 		public void setIsSuccess(java.lang.Boolean isSuccess){
 			this.isSuccess = isSuccess;
 		} 				
 		
 		private java.util.Date successTime;
 		/**
	     * 获取发送成功时间
	     */
 		public java.util.Date getSuccessTime(){
 			return this.successTime;
 		}
 		
 		/**
	     * 设置发送成功时间
	     */
 		public void setSuccessTime(java.util.Date successTime){
 			this.successTime = successTime;
 		} 				
 		
 		private java.util.Date lastSendTime;
 		/**
	     * 获取最后发送时间
	     */
 		public java.util.Date getLastSendTime(){
 			return this.lastSendTime;
 		}
 		
 		/**
	     * 设置最后发送时间
	     */
 		public void setLastSendTime(java.util.Date lastSendTime){
 			this.lastSendTime = lastSendTime;
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
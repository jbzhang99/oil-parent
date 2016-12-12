package com.oil.av.entity.platform.config;

import java.io.Serializable;

import com.oil.av.em.SmsTemplateNameEnum;
import com.oil.framework.base.entity.BaseEntity; 			
/**
 * 运营管理-短信模板
 * <p>Table: <strong>po_sms_template</strong>
 * <p><table class="er-mapping" cellspacing=0 cellpadding=0 style="border:solid 1 #666;padding:3px;">
 *   <tr style="background-color:#ddd;Text-align:Left;">
 *     <th nowrap>属性名</th><th nowrap>属性类型</th><th nowrap>字段名</th><th nowrap>字段类型</th><th nowrap>说明</th>
 *   </tr>
 *   <tr><td>id</td><td>{@link java.lang.String}</td><td>id</td><td>varchar</td><td>主键</td></tr>
 *   <tr><td>smsTemplateNameEnum</td><td>{@link java.lang.String}</td><td>name</td><td>varchar</td><td>模板名称:enum:register,注册验证码;pwdmodify,密码修改;notice,通知;active,活动;</td></tr>
 *   <tr><td>content</td><td>{@link java.lang.String}</td><td>content</td><td>varchar</td><td>消息内容</td></tr>
 *   <tr><td>isEnable</td><td>{@link java.lang.Boolean}</td><td>is_enable</td><td>tinyint</td><td>是否启用</td></tr>
 *   <tr><td>createUser</td><td>{@link java.lang.String}</td><td>create_user</td><td>varchar</td><td>创建人</td></tr>
 *   <tr><td>createTime</td><td>{@link java.util.Date}</td><td>create_time</td><td>datetime</td><td>创建时间</td></tr>
 *   <tr><td>modifyUser</td><td>{@link java.lang.String}</td><td>modify_user</td><td>varchar</td><td>修改人</td></tr>
 *   <tr><td>modifyTime</td><td>{@link java.util.Date}</td><td>modify_time</td><td>datetime</td><td>修改时间</td></tr>
 * </table>
 */
public class SmsTemplateEntity extends BaseEntity implements Serializable {
 
 	
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
 		
 		private SmsTemplateNameEnum smsTemplateNameEnum;
 		/**
	     * 获取模板名称:enum:register,注册验证码;pwdmodify,密码修改;notice,通知;active,活动;
	     */
 		public SmsTemplateNameEnum getSmsTemplateNameEnum(){
 			return this.smsTemplateNameEnum;
 		}
 		
 		/**
	     * 设置模板名称:enum:register,注册验证码;pwdmodify,密码修改;notice,通知;active,活动;
	     */
 		public void setSmsTemplateNameEnum(SmsTemplateNameEnum smsTemplateNameEnum){
 			this.smsTemplateNameEnum= smsTemplateNameEnum;
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
 		
 		private java.lang.Boolean isEnable;
 		/**
	     * 获取是否启用
	     */
 		public java.lang.Boolean getIsEnable(){
 			return this.isEnable;
 		}
 		
 		/**
	     * 设置是否启用
	     */
 		public void setIsEnable(java.lang.Boolean isEnable){
 			this.isEnable = isEnable;
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
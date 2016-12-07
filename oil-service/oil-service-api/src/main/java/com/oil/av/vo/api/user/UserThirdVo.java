package com.oil.av.vo.api.user;

import com.oil.av.em.api.UserThirdPlatformEnum;
import com.oil.framework.base.vo.BaseVo; 			
/**
 * 用户-三方账户关联
 * <p>Table: <strong>t_user_third</strong>
 * <p><table class="er-mapping" cellspacing=0 cellpadding=0 style="border:solid 1 #666;padding:3px;">
 *   <tr style="background-color:#ddd;Text-align:Left;">
 *     <th nowrap>属性名</th><th nowrap>属性类型</th><th nowrap>字段名</th><th nowrap>字段类型</th><th nowrap>说明</th>
 *   </tr>
 *   <tr><td>id</td><td>{@link java.lang.String}</td><td>id</td><td>varchar</td><td>主键，表唯一ID</td></tr>
 *   <tr><td>userThirdPlatformEnum</td><td>{@link java.lang.String}</td><td>platform</td><td>varchar</td><td>平台类型:enum:weixin,微信;qq,qq;xinlang,新浪;</td></tr>
 *   <tr><td>serial</td><td>{@link java.lang.String}</td><td>serial</td><td>varchar</td><td>唯一编码</td></tr>
 *   <tr><td>username</td><td>{@link java.lang.String}</td><td>username</td><td>varchar</td><td>平台用户名</td></tr>
 *   <tr><td>isRelation</td><td>{@link java.lang.Boolean}</td><td>is_relation</td><td>tinyint</td><td>是否关联</td></tr>
 *   <tr><td>platformUsername</td><td>{@link java.lang.String}</td><td>platform_username</td><td>varchar</td><td>关联账户名称</td></tr>
 *   <tr><td>platformAvatar</td><td>{@link java.lang.String}</td><td>platform_avatar</td><td>varchar</td><td>关联账户头像</td></tr>
 *   <tr><td>createUser</td><td>{@link java.lang.String}</td><td>create_user</td><td>varchar</td><td>创建人</td></tr>
 *   <tr><td>createTime</td><td>{@link java.util.Date}</td><td>create_time</td><td>datetime</td><td>创建时间</td></tr>
 *   <tr><td>modifyUser</td><td>{@link java.lang.String}</td><td>modify_user</td><td>varchar</td><td>修改人</td></tr>
 *   <tr><td>modifyTime</td><td>{@link java.util.Date}</td><td>modify_time</td><td>datetime</td><td>修改时间</td></tr>
 *   <tr><td>userId</td><td>{@link java.lang.Long}</td><td>user_id</td><td>bigint</td><td>注册用户ID</td></tr>
 * </table>
 */
public class UserThirdVo extends BaseVo{
 
 	
 		private java.lang.String id;
 		/**
	     * 获取主键，表唯一ID
	     */
 		public java.lang.String getId(){
 			return this.id;
 		}
 		
 		/**
	     * 设置主键，表唯一ID
	     */
 		public void setId(java.lang.String id){
 			this.id = id;
 		} 				
 		
 		private UserThirdPlatformEnum userThirdPlatformEnum;
 		/**
	     * 获取平台类型:enum:weixin,微信;qq,qq;xinlang,新浪;
	     */
 		public UserThirdPlatformEnum getUserThirdPlatformEnum(){
 			return this.userThirdPlatformEnum;
 		}
 		
 		/**
	     * 设置平台类型:enum:weixin,微信;qq,qq;xinlang,新浪;
	     */
 		public void setUserThirdPlatformEnum(UserThirdPlatformEnum userThirdPlatformEnum){
 			this.userThirdPlatformEnum= userThirdPlatformEnum;
 		} 		
 		
 		private java.lang.String serial;
 		/**
	     * 获取唯一编码
	     */
 		public java.lang.String getSerial(){
 			return this.serial;
 		}
 		
 		/**
	     * 设置唯一编码
	     */
 		public void setSerial(java.lang.String serial){
 			this.serial = serial;
 		} 				
 		
 		private java.lang.String username;
 		/**
	     * 获取平台用户名
	     */
 		public java.lang.String getUsername(){
 			return this.username;
 		}
 		
 		/**
	     * 设置平台用户名
	     */
 		public void setUsername(java.lang.String username){
 			this.username = username;
 		} 				
 		
 		private java.lang.Boolean isRelation;
 		/**
	     * 获取是否关联
	     */
 		public java.lang.Boolean getIsRelation(){
 			return this.isRelation;
 		}
 		
 		/**
	     * 设置是否关联
	     */
 		public void setIsRelation(java.lang.Boolean isRelation){
 			this.isRelation = isRelation;
 		} 				
 		
 		private java.lang.String platformUsername;
 		/**
	     * 获取关联账户名称
	     */
 		public java.lang.String getPlatformUsername(){
 			return this.platformUsername;
 		}
 		
 		/**
	     * 设置关联账户名称
	     */
 		public void setPlatformUsername(java.lang.String platformUsername){
 			this.platformUsername = platformUsername;
 		} 				
 		
 		private java.lang.String platformAvatar;
 		/**
	     * 获取关联账户头像
	     */
 		public java.lang.String getPlatformAvatar(){
 			return this.platformAvatar;
 		}
 		
 		/**
	     * 设置关联账户头像
	     */
 		public void setPlatformAvatar(java.lang.String platformAvatar){
 			this.platformAvatar = platformAvatar;
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
 		
 		private java.lang.Long userId;
 		/**
	     * 获取注册用户ID
	     */
 		public java.lang.Long getUserId(){
 			return this.userId;
 		}
 		
 		/**
	     * 设置注册用户ID
	     */
 		public void setUserId(java.lang.Long userId){
 			this.userId = userId;
 		} 				
 		
 }
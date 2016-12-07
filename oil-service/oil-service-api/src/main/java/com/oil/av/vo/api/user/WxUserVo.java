package com.oil.av.vo.api.user;

import com.oil.framework.base.vo.BaseVo;
/**
 * 用户绑定微信
 * <p>Table: <strong>t_wx_user</strong>
 * <p><table class="er-mapping" cellspacing=0 cellpadding=0 style="border:solid 1 #666;padding:3px;">
 *   <tr style="background-color:#ddd;Text-align:Left;">
 *     <th nowrap>属性名</th><th nowrap>属性类型</th><th nowrap>字段名</th><th nowrap>字段类型</th><th nowrap>说明</th>
 *   </tr>
 *   <tr><td>id</td><td>{@link java.lang.String}</td><td>id</td><td>varchar</td><td>主键，表唯一ID</td></tr>
 *   <tr><td>openid</td><td>{@link java.lang.String}</td><td>openid</td><td>varchar</td><td>微信标识</td></tr>
 *   <tr><td>userId</td><td>{@link java.lang.Long}</td><td>user_id</td><td>bigint</td><td>用户id</td></tr>
 *   <tr><td>isSubscription</td><td>{@link java.lang.Boolean}</td><td>is_subscription</td><td>tinyint</td><td>是否授权</td></tr>
 * </table>
 */
public class WxUserVo extends BaseVo{
 
 	
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
 		
 		private java.lang.String openid;
 		/**
	     * 获取微信标识
	     */
 		public java.lang.String getOpenid(){
 			return this.openid;
 		}
 		
 		/**
	     * 设置微信标识
	     */
 		public void setOpenid(java.lang.String openid){
 			this.openid = openid;
 		} 				
 		
 		private java.lang.Long userId;
 		/**
	     * 获取用户id
	     */
 		public java.lang.Long getUserId(){
 			return this.userId;
 		}
 		
 		/**
	     * 设置用户id
	     */
 		public void setUserId(java.lang.Long userId){
 			this.userId = userId;
 		} 				
 		
 		private java.lang.Boolean isSubscription;
 		/**
	     * 获取是否授权
	     */
 		public java.lang.Boolean getIsSubscription(){
 			return this.isSubscription;
 		}
 		
 		/**
	     * 设置是否授权
	     */
 		public void setIsSubscription(java.lang.Boolean isSubscription){
 			this.isSubscription = isSubscription;
 		} 				
 		
 }
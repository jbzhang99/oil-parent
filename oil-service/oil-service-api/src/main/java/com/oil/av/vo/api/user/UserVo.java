package com.oil.av.vo.api.user;

import com.oil.av.em.api.UserPublicMessageEnum;
import com.oil.av.em.api.UserSexEnum;
import com.oil.av.em.api.UserStateEnum;
import com.oil.framework.base.vo.BaseVo; 			
/**
 * 用户
 * <p>Table: <strong>t_user</strong>
 * <p><table class="er-mapping" cellspacing=0 cellpadding=0 style="border:solid 1 #666;padding:3px;">
 *   <tr style="background-color:#ddd;Text-align:Left;">
 *     <th nowrap>属性名</th><th nowrap>属性类型</th><th nowrap>字段名</th><th nowrap>字段类型</th><th nowrap>说明</th>
 *   </tr>
 *   <tr><td>id</td><td>{@link java.lang.String}</td><td>id</td><td>varchar</td><td>主键，表唯一ID</td></tr>
 *   <tr><td>code</td><td>{@link java.lang.String}</td><td>code</td><td>varchar</td><td>编码</td></tr>
 *   <tr><td>password</td><td>{@link java.lang.String}</td><td>password</td><td>varchar</td><td>密码</td></tr>
 *   <tr><td>nick</td><td>{@link java.lang.String}</td><td>nick</td><td>varchar</td><td>昵称</td></tr>
 *   <tr><td>userSexEnum</td><td>{@link java.lang.String}</td><td>sex</td><td>varchar</td><td>性别:enum:man,男;women,女;none,未设置;</td></tr>
 *   <tr><td>avatar</td><td>{@link java.lang.String}</td><td>avatar</td><td>varchar</td><td>头像</td></tr>
 *   <tr><td>signature</td><td>{@link java.lang.String}</td><td>signature</td><td>varchar</td><td>个性签名</td></tr>
 *   <tr><td>profile</td><td>{@link java.lang.String}</td><td>profile</td><td>varchar</td><td>个人简介</td></tr>
 *   <tr><td>address</td><td>{@link java.lang.String}</td><td>address</td><td>varchar</td><td>地址</td></tr>
 *   <tr><td>birthday</td><td>{@link java.util.Date}</td><td>birthday</td><td>datetime</td><td>出生日期</td></tr>
 *   <tr><td>phone</td><td>{@link java.lang.String}</td><td>phone</td><td>varchar</td><td>手机号码</td></tr>
 *   <tr><td>userStateEnum</td><td>{@link java.lang.String}</td><td>state</td><td>varchar</td><td>账号状态:enum:normal,正常;lock,锁定;destroy,注销;seal,封号;safety,安全问题;</td></tr>
 *   <tr><td>isMember</td><td>{@link java.lang.Boolean}</td><td>is_member</td><td>tinyint</td><td>是否会员用户</td></tr>
 *   <tr><td>lastLoginTime</td><td>{@link java.util.Date}</td><td>last_login_time</td><td>datetime</td><td>最后登录时间</td></tr>
 *   <tr><td>lastIp</td><td>{@link java.lang.String}</td><td>last_ip</td><td>varchar</td><td>最后登录IP</td></tr>
 *   <tr><td>lastDevice</td><td>{@link java.lang.String}</td><td>last_device</td><td>varchar</td><td>最后登录设备</td></tr>
 *   <tr><td>lastDeviceSerial</td><td>{@link java.lang.String}</td><td>last_device_serial</td><td>varchar</td><td>最后登录设备号</td></tr>
 *   <tr><td>lastToken</td><td>{@link java.lang.String}</td><td>last_token</td><td>varchar</td><td>最后登录token</td></tr>
 *   <tr><td>createUser</td><td>{@link java.lang.String}</td><td>create_user</td><td>varchar</td><td>创建人</td></tr>
 *   <tr><td>createTime</td><td>{@link java.util.Date}</td><td>create_time</td><td>datetime</td><td>创建时间</td></tr>
 *   <tr><td>modifyUser</td><td>{@link java.lang.String}</td><td>modify_user</td><td>varchar</td><td>修改人</td></tr>
 *   <tr><td>modifyTime</td><td>{@link java.util.Date}</td><td>modify_time</td><td>datetime</td><td>修改时间</td></tr>
 *   <tr><td>wrongTimes</td><td>{@link java.lang.Integer}</td><td>wrong_times</td><td>int</td><td>密码错误次数</td></tr>
 *   <tr><td>wrongDate</td><td>{@link java.util.Date}</td><td>wrong_date</td><td>datetime</td><td>密码错误日期</td></tr>
 *   <tr><td>userPublicMessageEnum</td><td>{@link java.lang.String}</td><td>public_message</td><td>varchar</td><td>公告接收状态  enum:open,开启;close,结束;</td></tr>
 * </table>
 */
public class UserVo extends BaseVo{
 
 	
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
 		
 		private java.lang.String code;
 		/**
	     * 获取编码
	     */
 		public java.lang.String getCode(){
 			return this.code;
 		}
 		
 		/**
	     * 设置编码
	     */
 		public void setCode(java.lang.String code){
 			this.code = code;
 		} 				
 		
 		private java.lang.String password;
 		/**
	     * 获取密码
	     */
 		public java.lang.String getPassword(){
 			return this.password;
 		}
 		
 		/**
	     * 设置密码
	     */
 		public void setPassword(java.lang.String password){
 			this.password = password;
 		} 				
 		
 		private java.lang.String nick;
 		/**
	     * 获取昵称
	     */
 		public java.lang.String getNick(){
 			return this.nick;
 		}
 		
 		/**
	     * 设置昵称
	     */
 		public void setNick(java.lang.String nick){
 			this.nick = nick;
 		} 				
 		
 		private UserSexEnum userSexEnum;
 		/**
	     * 获取性别:enum:man,男;women,女;none,未设置;
	     */
 		public UserSexEnum getUserSexEnum(){
 			return this.userSexEnum;
 		}
 		
 		/**
	     * 设置性别:enum:man,男;women,女;none,未设置;
	     */
 		public void setUserSexEnum(UserSexEnum userSexEnum){
 			this.userSexEnum= userSexEnum;
 		} 		
 		
 		private java.lang.String avatar;
 		/**
	     * 获取头像
	     */
 		public java.lang.String getAvatar(){
 			return this.avatar;
 		}
 		
 		/**
	     * 设置头像
	     */
 		public void setAvatar(java.lang.String avatar){
 			this.avatar = avatar;
 		} 				
 		
 		private java.lang.String signature;
 		/**
	     * 获取个性签名
	     */
 		public java.lang.String getSignature(){
 			return this.signature;
 		}
 		
 		/**
	     * 设置个性签名
	     */
 		public void setSignature(java.lang.String signature){
 			this.signature = signature;
 		} 				
 		
 		private java.lang.String profile;
 		/**
	     * 获取个人简介
	     */
 		public java.lang.String getProfile(){
 			return this.profile;
 		}
 		
 		/**
	     * 设置个人简介
	     */
 		public void setProfile(java.lang.String profile){
 			this.profile = profile;
 		} 				
 		
 		private java.lang.String address;
 		/**
	     * 获取地址
	     */
 		public java.lang.String getAddress(){
 			return this.address;
 		}
 		
 		/**
	     * 设置地址
	     */
 		public void setAddress(java.lang.String address){
 			this.address = address;
 		} 				
 		
 		private java.util.Date birthday;
 		/**
	     * 获取出生日期
	     */
 		public java.util.Date getBirthday(){
 			return this.birthday;
 		}
 		
 		/**
	     * 设置出生日期
	     */
 		public void setBirthday(java.util.Date birthday){
 			this.birthday = birthday;
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
 		
 		private UserStateEnum userStateEnum;
 		/**
	     * 获取账号状态:enum:normal,正常;lock,锁定;destroy,注销;seal,封号;safety,安全问题;
	     */
 		public UserStateEnum getUserStateEnum(){
 			return this.userStateEnum;
 		}
 		
 		/**
	     * 设置账号状态:enum:normal,正常;lock,锁定;destroy,注销;seal,封号;safety,安全问题;
	     */
 		public void setUserStateEnum(UserStateEnum userStateEnum){
 			this.userStateEnum= userStateEnum;
 		} 		
 		
 		private java.lang.Boolean isMember;
 		/**
	     * 获取是否会员用户
	     */
 		public java.lang.Boolean getIsMember(){
 			return this.isMember;
 		}
 		
 		/**
	     * 设置是否会员用户
	     */
 		public void setIsMember(java.lang.Boolean isMember){
 			this.isMember = isMember;
 		} 				
 		
 		private java.util.Date lastLoginTime;
 		/**
	     * 获取最后登录时间
	     */
 		public java.util.Date getLastLoginTime(){
 			return this.lastLoginTime;
 		}
 		
 		/**
	     * 设置最后登录时间
	     */
 		public void setLastLoginTime(java.util.Date lastLoginTime){
 			this.lastLoginTime = lastLoginTime;
 		} 				
 		
 		private java.lang.String lastIp;
 		/**
	     * 获取最后登录IP
	     */
 		public java.lang.String getLastIp(){
 			return this.lastIp;
 		}
 		
 		/**
	     * 设置最后登录IP
	     */
 		public void setLastIp(java.lang.String lastIp){
 			this.lastIp = lastIp;
 		} 				
 		
 		private java.lang.String lastDevice;
 		/**
	     * 获取最后登录设备
	     */
 		public java.lang.String getLastDevice(){
 			return this.lastDevice;
 		}
 		
 		/**
	     * 设置最后登录设备
	     */
 		public void setLastDevice(java.lang.String lastDevice){
 			this.lastDevice = lastDevice;
 		} 				
 		
 		private java.lang.String lastDeviceSerial;
 		/**
	     * 获取最后登录设备号
	     */
 		public java.lang.String getLastDeviceSerial(){
 			return this.lastDeviceSerial;
 		}
 		
 		/**
	     * 设置最后登录设备号
	     */
 		public void setLastDeviceSerial(java.lang.String lastDeviceSerial){
 			this.lastDeviceSerial = lastDeviceSerial;
 		} 				
 		
 		private java.lang.String lastToken;
 		/**
	     * 获取最后登录token
	     */
 		public java.lang.String getLastToken(){
 			return this.lastToken;
 		}
 		
 		/**
	     * 设置最后登录token
	     */
 		public void setLastToken(java.lang.String lastToken){
 			this.lastToken = lastToken;
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
 		
 		private java.lang.Integer wrongTimes;
 		/**
	     * 获取密码错误次数
	     */
 		public java.lang.Integer getWrongTimes(){
 			return this.wrongTimes;
 		}
 		
 		/**
	     * 设置密码错误次数
	     */
 		public void setWrongTimes(java.lang.Integer wrongTimes){
 			this.wrongTimes = wrongTimes;
 		} 				
 		
 		private java.util.Date wrongDate;
 		/**
	     * 获取密码错误日期
	     */
 		public java.util.Date getWrongDate(){
 			return this.wrongDate;
 		}
 		
 		/**
	     * 设置密码错误日期
	     */
 		public void setWrongDate(java.util.Date wrongDate){
 			this.wrongDate = wrongDate;
 		} 				
 		
 		private UserPublicMessageEnum userPublicMessageEnum;
 		/**
	     * 获取公告接收状态  enum:open,开启;close,结束;
	     */
 		public UserPublicMessageEnum getUserPublicMessageEnum(){
 			return this.userPublicMessageEnum;
 		}
 		
 		/**
	     * 设置公告接收状态  enum:open,开启;close,结束;
	     */
 		public void setUserPublicMessageEnum(UserPublicMessageEnum userPublicMessageEnum){
 			this.userPublicMessageEnum= userPublicMessageEnum;
 		} 		
 		
 }
package com.oil.av.vo.platform.config;

import com.oil.framework.base.vo.BaseVo;
/**
 * 运营管理-商品分类
 * <p>Table: <strong>po_product_category</strong>
 * <p><table class="er-mapping" cellspacing=0 cellpadding=0 style="border:solid 1 #666;padding:3px;">
 *   <tr style="background-color:#ddd;Text-align:Left;">
 *     <th nowrap>属性名</th><th nowrap>属性类型</th><th nowrap>字段名</th><th nowrap>字段类型</th><th nowrap>说明</th>
 *   </tr>
 *   <tr><td>id</td><td>{@link java.lang.String}</td><td>id</td><td>varchar</td><td>编号</td></tr>
 *   <tr><td>parentId</td><td>{@link java.lang.String}</td><td>parent_id</td><td>varchar</td><td>父级编号</td></tr>
 *   <tr><td>name</td><td>{@link java.lang.String}</td><td>name</td><td>varchar</td><td>分类名称</td></tr>
 *   <tr><td>image</td><td>{@link java.lang.String}</td><td>image</td><td>varchar</td><td>图标</td></tr>
 *   <tr><td>isShow</td><td>{@link java.lang.String}</td><td>is_show</td><td>char</td><td>是否显示</td></tr>
 *   <tr><td>createUser</td><td>{@link java.lang.String}</td><td>create_user</td><td>varchar</td><td>创建人</td></tr>
 *   <tr><td>createTime</td><td>{@link java.util.Date}</td><td>create_time</td><td>datetime</td><td>创建时间</td></tr>
 *   <tr><td>modifyUser</td><td>{@link java.lang.String}</td><td>modify_user</td><td>varchar</td><td>修改人</td></tr>
 *   <tr><td>modifyTime</td><td>{@link java.util.Date}</td><td>modify_time</td><td>datetime</td><td>修改时间</td></tr>
 *   <tr><td>description</td><td>{@link java.lang.String}</td><td>description</td><td>varchar</td><td>描述信息</td></tr>
 *   <tr><td>delFlag</td><td>{@link java.lang.String}</td><td>del_flag</td><td>char</td><td>删除标记</td></tr>
 * </table>
 */
public class ProductCategoryVo extends BaseVo{
 
 	
 		private java.lang.String id;
 		/**
	     * 获取编号
	     */
 		public java.lang.String getId(){
 			return this.id;
 		}
 		
 		/**
	     * 设置编号
	     */
 		public void setId(java.lang.String id){
 			this.id = id;
 		} 				
 		
 		private java.lang.String parentId;
 		/**
	     * 获取父级编号
	     */
 		public java.lang.String getParentId(){
 			return this.parentId;
 		}
 		
 		/**
	     * 设置父级编号
	     */
 		public void setParentId(java.lang.String parentId){
 			this.parentId = parentId;
 		} 				
 		
 		private java.lang.String name;
 		/**
	     * 获取分类名称
	     */
 		public java.lang.String getName(){
 			return this.name;
 		}
 		
 		/**
	     * 设置分类名称
	     */
 		public void setName(java.lang.String name){
 			this.name = name;
 		} 				
 		
 		private java.lang.String image;
 		/**
	     * 获取图标
	     */
 		public java.lang.String getImage(){
 			return this.image;
 		}
 		
 		/**
	     * 设置图标
	     */
 		public void setImage(java.lang.String image){
 			this.image = image;
 		} 				
 		
 		private java.lang.String isShow;
 		/**
	     * 获取是否显示
	     */
 		public java.lang.String getIsShow(){
 			return this.isShow;
 		}
 		
 		/**
	     * 设置是否显示
	     */
 		public void setIsShow(java.lang.String isShow){
 			this.isShow = isShow;
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
 		
 		private java.lang.String description;
 		/**
	     * 获取描述信息
	     */
 		public java.lang.String getDescription(){
 			return this.description;
 		}
 		
 		/**
	     * 设置描述信息
	     */
 		public void setDescription(java.lang.String description){
 			this.description = description;
 		} 				
 		
 		private java.lang.String delFlag;
 		/**
	     * 获取删除标记
	     */
 		public java.lang.String getDelFlag(){
 			return this.delFlag;
 		}
 		
 		/**
	     * 设置删除标记
	     */
 		public void setDelFlag(java.lang.String delFlag){
 			this.delFlag = delFlag;
 		} 				
 		
 }
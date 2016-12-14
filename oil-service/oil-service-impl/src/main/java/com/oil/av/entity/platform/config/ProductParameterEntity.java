package com.oil.av.entity.platform.config;

import java.io.Serializable;

import com.oil.framework.base.entity.BaseEntity;
/**
 * 运营管理-商品参数
 * <p>Table: <strong>po_product_parameter</strong>
 * <p><table class="er-mapping" cellspacing=0 cellpadding=0 style="border:solid 1 #666;padding:3px;">
 *   <tr style="background-color:#ddd;Text-align:Left;">
 *     <th nowrap>属性名</th><th nowrap>属性类型</th><th nowrap>字段名</th><th nowrap>字段类型</th><th nowrap>说明</th>
 *   </tr>
 *   <tr><td>id</td><td>{@link java.lang.String}</td><td>id</td><td>varchar</td><td>编号</td></tr>
 *   <tr><td>name</td><td>{@link java.lang.String}</td><td>name</td><td>varchar</td><td>参数名称</td></tr>
 *   <tr><td>paramType</td><td>{@link java.lang.String}</td><td>param_type</td><td>varchar</td><td>参数类型</td></tr>
 *   <tr><td>weight</td><td>{@link java.lang.Integer}</td><td>weight</td><td>int</td><td>权重，越大越靠前</td></tr>
 *   <tr><td>createUser</td><td>{@link java.lang.String}</td><td>create_user</td><td>varchar</td><td>创建人</td></tr>
 *   <tr><td>createTime</td><td>{@link java.util.Date}</td><td>create_time</td><td>datetime</td><td>创建时间</td></tr>
 *   <tr><td>modifyUser</td><td>{@link java.lang.String}</td><td>modify_user</td><td>varchar</td><td>修改人</td></tr>
 *   <tr><td>modifyTime</td><td>{@link java.util.Date}</td><td>modify_time</td><td>datetime</td><td>修改时间</td></tr>
 *   <tr><td>description</td><td>{@link java.lang.String}</td><td>description</td><td>varchar</td><td>描述信息</td></tr>
 * </table>
 */
public class ProductParameterEntity extends BaseEntity implements Serializable {
 
 	
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
 		
 		private java.lang.String name;
 		/**
	     * 获取参数名称
	     */
 		public java.lang.String getName(){
 			return this.name;
 		}
 		
 		/**
	     * 设置参数名称
	     */
 		public void setName(java.lang.String name){
 			this.name = name;
 		} 				
 		
 		private java.lang.String paramType;
 		/**
	     * 获取参数类型
	     */
 		public java.lang.String getParamType(){
 			return this.paramType;
 		}
 		
 		/**
	     * 设置参数类型
	     */
 		public void setParamType(java.lang.String paramType){
 			this.paramType = paramType;
 		} 				
 		
 		private java.lang.Integer weight;
 		/**
	     * 获取权重，越大越靠前
	     */
 		public java.lang.Integer getWeight(){
 			return this.weight;
 		}
 		
 		/**
	     * 设置权重，越大越靠前
	     */
 		public void setWeight(java.lang.Integer weight){
 			this.weight = weight;
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
 		
 }
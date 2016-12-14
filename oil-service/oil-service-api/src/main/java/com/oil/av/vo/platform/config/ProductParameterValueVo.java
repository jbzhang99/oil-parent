package com.oil.av.vo.platform.config;

import com.oil.framework.base.vo.BaseVo;
/**
 * 运营管理-商品参数值
 * <p>Table: <strong>po_product_parameter_value</strong>
 * <p><table class="er-mapping" cellspacing=0 cellpadding=0 style="border:solid 1 #666;padding:3px;">
 *   <tr style="background-color:#ddd;Text-align:Left;">
 *     <th nowrap>属性名</th><th nowrap>属性类型</th><th nowrap>字段名</th><th nowrap>字段类型</th><th nowrap>说明</th>
 *   </tr>
 *   <tr><td>productId</td><td>{@link java.lang.String}</td><td>product_id</td><td>varchar</td><td>商品ID</td></tr>
 *   <tr><td>parameterId</td><td>{@link java.lang.String}</td><td>parameter_id</td><td>varchar</td><td>参数ID</td></tr>
 *   <tr><td>parameterValue</td><td>{@link java.lang.String}</td><td>parameter_value</td><td>varchar</td><td>参数值</td></tr>
 *   <tr><td>createUser</td><td>{@link java.lang.String}</td><td>create_user</td><td>varchar</td><td>创建人</td></tr>
 *   <tr><td>createTime</td><td>{@link java.util.Date}</td><td>create_time</td><td>datetime</td><td>创建时间</td></tr>
 *   <tr><td>modifyUser</td><td>{@link java.lang.String}</td><td>modify_user</td><td>varchar</td><td>修改人</td></tr>
 *   <tr><td>modifyTime</td><td>{@link java.util.Date}</td><td>modify_time</td><td>datetime</td><td>修改时间</td></tr>
 * </table>
 */
public class ProductParameterValueVo extends BaseVo{
 
 	
 		private java.lang.String productId;
 		/**
	     * 获取商品ID
	     */
 		public java.lang.String getProductId(){
 			return this.productId;
 		}
 		
 		/**
	     * 设置商品ID
	     */
 		public void setProductId(java.lang.String productId){
 			this.productId = productId;
 		} 				
 		
 		private java.lang.String parameterId;
 		/**
	     * 获取参数ID
	     */
 		public java.lang.String getParameterId(){
 			return this.parameterId;
 		}
 		
 		/**
	     * 设置参数ID
	     */
 		public void setParameterId(java.lang.String parameterId){
 			this.parameterId = parameterId;
 		} 				
 		
 		private java.lang.String parameterValue;
 		/**
	     * 获取参数值
	     */
 		public java.lang.String getParameterValue(){
 			return this.parameterValue;
 		}
 		
 		/**
	     * 设置参数值
	     */
 		public void setParameterValue(java.lang.String parameterValue){
 			this.parameterValue = parameterValue;
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
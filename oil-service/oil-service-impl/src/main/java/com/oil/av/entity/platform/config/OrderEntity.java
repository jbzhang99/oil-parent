package com.oil.av.entity.platform.config;

import java.io.Serializable;

import com.oil.framework.base.entity.BaseEntity;
/**
 * 运营管理-订单
 * <p>Table: <strong>po_order</strong>
 * <p><table class="er-mapping" cellspacing=0 cellpadding=0 style="border:solid 1 #666;padding:3px;">
 *   <tr style="background-color:#ddd;Text-align:Left;">
 *     <th nowrap>属性名</th><th nowrap>属性类型</th><th nowrap>字段名</th><th nowrap>字段类型</th><th nowrap>说明</th>
 *   </tr>
 *   <tr><td>id</td><td>{@link java.lang.String}</td><td>id</td><td>varchar</td><td>订单id</td></tr>
 *   <tr><td>orderSn</td><td>{@link java.lang.String}</td><td>order_sn</td><td>varchar</td><td>订单编号</td></tr>
 *   <tr><td>memberId</td><td>{@link java.lang.String}</td><td>member_id</td><td>varchar</td><td>会员编号</td></tr>
 *   <tr><td>productId</td><td>{@link java.lang.String}</td><td>product_id</td><td>varchar</td><td>商品编号</td></tr>
 *   <tr><td>orderType</td><td>{@link java.lang.String}</td><td>order_type</td><td>char</td><td>订单类型:0采购、1销售</td></tr>
 *   <tr><td>orderStatus</td><td>{@link java.lang.String}</td><td>order_status</td><td>char</td><td>订单状态:0待处理、1处理-确认、2处理-取消</td></tr>
 *   <tr><td>orderMemo</td><td>{@link java.lang.String}</td><td>order_memo</td><td>varchar</td><td>下单备注</td></tr>
 *   <tr><td>businessName</td><td>{@link java.lang.String}</td><td>business_name</td><td>varchar</td><td>企业名称</td></tr>
 *   <tr><td>touchName</td><td>{@link java.lang.String}</td><td>touch_name</td><td>varchar</td><td>联系人</td></tr>
 *   <tr><td>touchPhone</td><td>{@link java.lang.String}</td><td>touch_phone</td><td>varchar</td><td>电话</td></tr>
 *   <tr><td>orderGoods</td><td>{@link java.math.BigDecimal}</td><td>order_goods</td><td>decimal</td><td>订货量/吨</td></tr>
 *   <tr><td>bank</td><td>{@link java.lang.String}</td><td>bank</td><td>varchar</td><td>付款行</td></tr>
 *   <tr><td>bankNumber</td><td>{@link java.lang.String}</td><td>bank_number</td><td>varchar</td><td>付款账号</td></tr>
 *   <tr><td>invoice</td><td>{@link java.lang.String}</td><td>invoice</td><td>varchar</td><td>发票信息</td></tr>
 *   <tr><td>createUser</td><td>{@link java.lang.String}</td><td>create_user</td><td>varchar</td><td>创建人</td></tr>
 *   <tr><td>createTime</td><td>{@link java.util.Date}</td><td>create_time</td><td>datetime</td><td>创建时间</td></tr>
 *   <tr><td>modifyUser</td><td>{@link java.lang.String}</td><td>modify_user</td><td>varchar</td><td>修改人</td></tr>
 *   <tr><td>modifyTime</td><td>{@link java.util.Date}</td><td>modify_time</td><td>datetime</td><td>修改时间</td></tr>
 *   <tr><td>description</td><td>{@link java.lang.String}</td><td>description</td><td>varchar</td><td>处理描述</td></tr>
 * </table>
 */
public class OrderEntity extends BaseEntity implements Serializable {
 
 	
 		private java.lang.String id;
 		/**
	     * 获取订单id
	     */
 		public java.lang.String getId(){
 			return this.id;
 		}
 		
 		/**
	     * 设置订单id
	     */
 		public void setId(java.lang.String id){
 			this.id = id;
 		} 				
 		
 		private java.lang.String orderSn;
 		/**
	     * 获取订单编号
	     */
 		public java.lang.String getOrderSn(){
 			return this.orderSn;
 		}
 		
 		/**
	     * 设置订单编号
	     */
 		public void setOrderSn(java.lang.String orderSn){
 			this.orderSn = orderSn;
 		} 				
 		
 		private java.lang.String memberId;
 		/**
	     * 获取会员编号
	     */
 		public java.lang.String getMemberId(){
 			return this.memberId;
 		}
 		
 		/**
	     * 设置会员编号
	     */
 		public void setMemberId(java.lang.String memberId){
 			this.memberId = memberId;
 		} 				
 		
 		private java.lang.String productId;
 		/**
	     * 获取商品编号
	     */
 		public java.lang.String getProductId(){
 			return this.productId;
 		}
 		
 		/**
	     * 设置商品编号
	     */
 		public void setProductId(java.lang.String productId){
 			this.productId = productId;
 		} 				
 		
 		private java.lang.String orderType;
 		/**
	     * 获取订单类型:0采购、1销售
	     */
 		public java.lang.String getOrderType(){
 			return this.orderType;
 		}
 		
 		/**
	     * 设置订单类型:0采购、1销售
	     */
 		public void setOrderType(java.lang.String orderType){
 			this.orderType = orderType;
 		} 				
 		
 		private java.lang.String orderStatus;
 		/**
	     * 获取订单状态:0待处理、1处理-确认、2处理-取消
	     */
 		public java.lang.String getOrderStatus(){
 			return this.orderStatus;
 		}
 		
 		/**
	     * 设置订单状态:0待处理、1处理-确认、2处理-取消
	     */
 		public void setOrderStatus(java.lang.String orderStatus){
 			this.orderStatus = orderStatus;
 		} 				
 		
 		private java.lang.String orderMemo;
 		/**
	     * 获取下单备注
	     */
 		public java.lang.String getOrderMemo(){
 			return this.orderMemo;
 		}
 		
 		/**
	     * 设置下单备注
	     */
 		public void setOrderMemo(java.lang.String orderMemo){
 			this.orderMemo = orderMemo;
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
 		
 		private java.lang.String touchName;
 		/**
	     * 获取联系人
	     */
 		public java.lang.String getTouchName(){
 			return this.touchName;
 		}
 		
 		/**
	     * 设置联系人
	     */
 		public void setTouchName(java.lang.String touchName){
 			this.touchName = touchName;
 		} 				
 		
 		private java.lang.String touchPhone;
 		/**
	     * 获取电话
	     */
 		public java.lang.String getTouchPhone(){
 			return this.touchPhone;
 		}
 		
 		/**
	     * 设置电话
	     */
 		public void setTouchPhone(java.lang.String touchPhone){
 			this.touchPhone = touchPhone;
 		} 				
 		
 		private java.math.BigDecimal orderGoods;
 		/**
	     * 获取订货量/吨
	     */
 		public java.math.BigDecimal getOrderGoods(){
 			return this.orderGoods;
 		}
 		
 		/**
	     * 设置订货量/吨
	     */
 		public void setOrderGoods(java.math.BigDecimal orderGoods){
 			this.orderGoods = orderGoods;
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
 		
 		private java.lang.String description;
 		/**
	     * 获取处理描述
	     */
 		public java.lang.String getDescription(){
 			return this.description;
 		}
 		
 		/**
	     * 设置处理描述
	     */
 		public void setDescription(java.lang.String description){
 			this.description = description;
 		} 				
 		
 }
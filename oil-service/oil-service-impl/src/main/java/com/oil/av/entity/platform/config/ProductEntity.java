package com.oil.av.entity.platform.config;

import java.io.Serializable;

import com.oil.framework.base.entity.BaseEntity;
/**
 * 运营管理-商品
 * <p>Table: <strong>po_product</strong>
 * <p><table class="er-mapping" cellspacing=0 cellpadding=0 style="border:solid 1 #666;padding:3px;">
 *   <tr style="background-color:#ddd;Text-align:Left;">
 *     <th nowrap>属性名</th><th nowrap>属性类型</th><th nowrap>字段名</th><th nowrap>字段类型</th><th nowrap>说明</th>
 *   </tr>
 *   <tr><td>id</td><td>{@link java.lang.String}</td><td>id</td><td>varchar</td><td>编号</td></tr>
 *   <tr><td>name</td><td>{@link java.lang.String}</td><td>name</td><td>varchar</td><td>商品名称</td></tr>
 *   <tr><td>categoryId</td><td>{@link java.lang.String}</td><td>category_id</td><td>varchar</td><td>分类id</td></tr>
 *   <tr><td>image</td><td>{@link java.lang.String}</td><td>image</td><td>varchar</td><td>缩略图</td></tr>
 *   <tr><td>introduction</td><td>{@link java.lang.String}</td><td>introduction</td><td>longtext</td><td>商品简介</td></tr>
 *   <tr><td>keywords</td><td>{@link java.lang.String}</td><td>keywords</td><td>varchar</td><td>关键字</td></tr>
 *   <tr><td>weight</td><td>{@link java.lang.Integer}</td><td>weight</td><td>int</td><td>权重，越大越靠前</td></tr>
 *   <tr><td>isShow</td><td>{@link java.lang.String}</td><td>is_show</td><td>char</td><td>是否显示</td></tr>
 *   <tr><td>monthHits</td><td>{@link java.lang.Long}</td><td>month_hits</td><td>bigint</td><td>月点击数</td></tr>
 *   <tr><td>monthHitsDate</td><td>{@link java.util.Date}</td><td>month_hits_date</td><td>datetime</td><td>月点击数更新日期</td></tr>
 *   <tr><td>monthSales</td><td>{@link java.lang.Long}</td><td>month_sales</td><td>bigint</td><td>月销量</td></tr>
 *   <tr><td>monthSalesDate</td><td>{@link java.util.Date}</td><td>month_sales_date</td><td>datetime</td><td>月销量更新日期</td></tr>
 *   <tr><td>createUser</td><td>{@link java.lang.String}</td><td>create_user</td><td>varchar</td><td>创建人</td></tr>
 *   <tr><td>createTime</td><td>{@link java.util.Date}</td><td>create_time</td><td>datetime</td><td>创建时间</td></tr>
 *   <tr><td>modifyUser</td><td>{@link java.lang.String}</td><td>modify_user</td><td>varchar</td><td>修改人</td></tr>
 *   <tr><td>modifyTime</td><td>{@link java.util.Date}</td><td>modify_time</td><td>datetime</td><td>修改时间</td></tr>
 *   <tr><td>description</td><td>{@link java.lang.String}</td><td>description</td><td>varchar</td><td>描述信息</td></tr>
 *   <tr><td>attributeValue0</td><td>{@link java.lang.String}</td><td>attribute_value0</td><td>varchar</td><td>attributeValue0</td></tr>
 *   <tr><td>attributeValue1</td><td>{@link java.lang.String}</td><td>attribute_value1</td><td>varchar</td><td>attributeValue1</td></tr>
 *   <tr><td>attributeValue2</td><td>{@link java.lang.String}</td><td>attribute_value2</td><td>varchar</td><td>attributeValue2</td></tr>
 *   <tr><td>attributeValue3</td><td>{@link java.lang.String}</td><td>attribute_value3</td><td>varchar</td><td>attributeValue3</td></tr>
 *   <tr><td>attributeValue4</td><td>{@link java.lang.String}</td><td>attribute_value4</td><td>varchar</td><td>attributeValue4</td></tr>
 * </table>
 */
public class ProductEntity extends BaseEntity implements Serializable {
 
 	
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
	     * 获取商品名称
	     */
 		public java.lang.String getName(){
 			return this.name;
 		}
 		
 		/**
	     * 设置商品名称
	     */
 		public void setName(java.lang.String name){
 			this.name = name;
 		} 				
 		
 		private java.lang.String categoryId;
 		/**
	     * 获取分类id
	     */
 		public java.lang.String getCategoryId(){
 			return this.categoryId;
 		}
 		
 		/**
	     * 设置分类id
	     */
 		public void setCategoryId(java.lang.String categoryId){
 			this.categoryId = categoryId;
 		} 				
 		
 		private java.lang.String image;
 		/**
	     * 获取缩略图
	     */
 		public java.lang.String getImage(){
 			return this.image;
 		}
 		
 		/**
	     * 设置缩略图
	     */
 		public void setImage(java.lang.String image){
 			this.image = image;
 		} 				
 		
 		private java.lang.String introduction;
 		/**
	     * 获取商品简介
	     */
 		public java.lang.String getIntroduction(){
 			return this.introduction;
 		}
 		
 		/**
	     * 设置商品简介
	     */
 		public void setIntroduction(java.lang.String introduction){
 			this.introduction = introduction;
 		} 				
 		
 		private java.lang.String keywords;
 		/**
	     * 获取关键字
	     */
 		public java.lang.String getKeywords(){
 			return this.keywords;
 		}
 		
 		/**
	     * 设置关键字
	     */
 		public void setKeywords(java.lang.String keywords){
 			this.keywords = keywords;
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
 		
 		private java.lang.Long monthHits;
 		/**
	     * 获取月点击数
	     */
 		public java.lang.Long getMonthHits(){
 			return this.monthHits;
 		}
 		
 		/**
	     * 设置月点击数
	     */
 		public void setMonthHits(java.lang.Long monthHits){
 			this.monthHits = monthHits;
 		} 				
 		
 		private java.util.Date monthHitsDate;
 		/**
	     * 获取月点击数更新日期
	     */
 		public java.util.Date getMonthHitsDate(){
 			return this.monthHitsDate;
 		}
 		
 		/**
	     * 设置月点击数更新日期
	     */
 		public void setMonthHitsDate(java.util.Date monthHitsDate){
 			this.monthHitsDate = monthHitsDate;
 		} 				
 		
 		private java.lang.Long monthSales;
 		/**
	     * 获取月销量
	     */
 		public java.lang.Long getMonthSales(){
 			return this.monthSales;
 		}
 		
 		/**
	     * 设置月销量
	     */
 		public void setMonthSales(java.lang.Long monthSales){
 			this.monthSales = monthSales;
 		} 				
 		
 		private java.util.Date monthSalesDate;
 		/**
	     * 获取月销量更新日期
	     */
 		public java.util.Date getMonthSalesDate(){
 			return this.monthSalesDate;
 		}
 		
 		/**
	     * 设置月销量更新日期
	     */
 		public void setMonthSalesDate(java.util.Date monthSalesDate){
 			this.monthSalesDate = monthSalesDate;
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
 		
 		private java.lang.String attributeValue0;
 		/**
	     * 获取AttributeValue0
	     */
 		public java.lang.String getAttributeValue0(){
 			return this.attributeValue0;
 		}
 		
 		/**
	     * 设置AttributeValue0
	     */
 		public void setAttributeValue0(java.lang.String attributeValue0){
 			this.attributeValue0 = attributeValue0;
 		} 				
 		
 		private java.lang.String attributeValue1;
 		/**
	     * 获取AttributeValue1
	     */
 		public java.lang.String getAttributeValue1(){
 			return this.attributeValue1;
 		}
 		
 		/**
	     * 设置AttributeValue1
	     */
 		public void setAttributeValue1(java.lang.String attributeValue1){
 			this.attributeValue1 = attributeValue1;
 		} 				
 		
 		private java.lang.String attributeValue2;
 		/**
	     * 获取AttributeValue2
	     */
 		public java.lang.String getAttributeValue2(){
 			return this.attributeValue2;
 		}
 		
 		/**
	     * 设置AttributeValue2
	     */
 		public void setAttributeValue2(java.lang.String attributeValue2){
 			this.attributeValue2 = attributeValue2;
 		} 				
 		
 		private java.lang.String attributeValue3;
 		/**
	     * 获取AttributeValue3
	     */
 		public java.lang.String getAttributeValue3(){
 			return this.attributeValue3;
 		}
 		
 		/**
	     * 设置AttributeValue3
	     */
 		public void setAttributeValue3(java.lang.String attributeValue3){
 			this.attributeValue3 = attributeValue3;
 		} 				
 		
 		private java.lang.String attributeValue4;
 		/**
	     * 获取AttributeValue4
	     */
 		public java.lang.String getAttributeValue4(){
 			return this.attributeValue4;
 		}
 		
 		/**
	     * 设置AttributeValue4
	     */
 		public void setAttributeValue4(java.lang.String attributeValue4){
 			this.attributeValue4 = attributeValue4;
 		} 				
 		
 }
package com.oil.av.dao.platform.config;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.oil.av.entity.platform.config.ProductParameterValueEntity;
import com.oil.framework.common.page.Pagination;


public interface ProductParameterValueDao {
 
 	/**
     * 根据id取得运营管理-商品参数值
     * @param  productParameterValueEntityId
     * @return
     */
	ProductParameterValueEntity get(java.lang.String productId);
	
	/**
     * 查询全部ProductParameterValueEntity对象
     * @param  productParameterValueEntityId
     * @return
     */
	List<ProductParameterValueEntity> getAll();

	/**
     * 根据Map<String,Object>对象查询符合条件的总数据数
     * @param  Map对象
     * @return
     */
	Long getProductParameterValueEntityCountsByConditions(@Param("params") Map<String, Object> params);
	
	/**
     * 根据Map<String,Object>分页查询
     * @param  Map对象
     * @return
     */
	List<ProductParameterValueEntity> getProductParameterValueEntityListByConditions(@Param("pager") Pagination<Map<String, Object>> pager, @Param("params") Map<String, Object> params);
		
	/**
     * 保存运营管理-商品参数值
     * @param  productParameterValueEntity
     * @return
     */
	Long insert(ProductParameterValueEntity productParameterValueEntity);
	
	/**
     * 更新运营管理-商品参数值
     * @param  productParameterValueEntity
     * @return
     */
	 Integer update(ProductParameterValueEntity productParameterValueEntity);
	
	/**
     * 根据productParameterValueEntityID删除运营管理-商品参数值
     * @param  productParameterValueEntity
     * @return
     */
	Integer delete(java.lang.String productId);
	

	/**
	 * 按需查询
	 * @param paramMap
	 * @return
	 */
	List<ProductParameterValueEntity> getListByConditions(@Param("params") Map<String, Object> paramMap);
}
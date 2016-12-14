package com.oil.av.dao.platform.config;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.oil.av.entity.platform.config.ProductCategoryEntity;
import com.oil.framework.common.page.Pagination;


public interface ProductCategoryDao {
 
 	/**
     * 根据id取得运营管理-商品分类
     * @param  productCategoryEntityId
     * @return
     */
	ProductCategoryEntity get(java.lang.String id);
	
	/**
     * 查询全部ProductCategoryEntity对象
     * @param  productCategoryEntityId
     * @return
     */
	List<ProductCategoryEntity> getAll();

	/**
     * 根据Map<String,Object>对象查询符合条件的总数据数
     * @param  Map对象
     * @return
     */
	Long getProductCategoryEntityCountsByConditions(@Param("params") Map<String, Object> params);
	
	/**
     * 根据Map<String,Object>分页查询
     * @param  Map对象
     * @return
     */
	List<ProductCategoryEntity> getProductCategoryEntityListByConditions(@Param("pager") Pagination<Map<String, Object>> pager, @Param("params") Map<String, Object> params);
		
	/**
     * 保存运营管理-商品分类
     * @param  productCategoryEntity
     * @return
     */
	Long insert(ProductCategoryEntity productCategoryEntity);
	
	/**
     * 更新运营管理-商品分类
     * @param  productCategoryEntity
     * @return
     */
	 Integer update(ProductCategoryEntity productCategoryEntity);
	
	/**
     * 根据productCategoryEntityID删除运营管理-商品分类
     * @param  productCategoryEntity
     * @return
     */
	Integer delete(java.lang.String id);

	/**
	 * 按需查询
	 * @param paramMap
	 * @return
	 */
	List<ProductCategoryEntity> getListByConditions(@Param("params") Map<String, Object> paramMap);
}
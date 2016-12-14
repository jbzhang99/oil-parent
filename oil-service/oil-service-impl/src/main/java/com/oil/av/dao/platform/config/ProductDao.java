package com.oil.av.dao.platform.config;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.oil.av.entity.platform.config.ProductEntity;
import com.oil.framework.common.page.Pagination;


public interface ProductDao {
 
 	/**
     * 根据id取得运营管理-商品
     * @param  productEntityId
     * @return
     */
	ProductEntity get(java.lang.String id);
	
	/**
     * 查询全部ProductEntity对象
     * @param  productEntityId
     * @return
     */
	List<ProductEntity> getAll();

	/**
     * 根据Map<String,Object>对象查询符合条件的总数据数
     * @param  Map对象
     * @return
     */
	Long getProductEntityCountsByConditions(@Param("params") Map<String, Object> params);
	
	/**
     * 根据Map<String,Object>分页查询
     * @param  Map对象
     * @return
     */
	List<ProductEntity> getProductEntityListByConditions(@Param("pager") Pagination<Map<String, Object>> pager, @Param("params") Map<String, Object> params);
		
	/**
     * 保存运营管理-商品
     * @param  productEntity
     * @return
     */
	Long insert(ProductEntity productEntity);
	
	/**
     * 更新运营管理-商品
     * @param  productEntity
     * @return
     */
	 Integer update(ProductEntity productEntity);
	
	/**
     * 根据productEntityID删除运营管理-商品
     * @param  productEntity
     * @return
     */
	Integer delete(java.lang.String id);
	
	/**
	 * 按需查询
	 * @param paramMap
	 * @return
	 */
	List<ProductEntity> getListByConditions(@Param("params") Map<String, Object> paramMap);
}
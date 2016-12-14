package com.oil.av.dao.platform.config;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.oil.av.entity.platform.config.ProductParameterEntity;
import com.oil.framework.common.page.Pagination;


public interface ProductParameterDao {
 
 	/**
     * 根据id取得运营管理-商品参数
     * @param  productParameterEntityId
     * @return
     */
	ProductParameterEntity get(java.lang.String id);
	
	/**
     * 查询全部ProductParameterEntity对象
     * @param  productParameterEntityId
     * @return
     */
	List<ProductParameterEntity> getAll();

	/**
     * 根据Map<String,Object>对象查询符合条件的总数据数
     * @param  Map对象
     * @return
     */
	Long getProductParameterEntityCountsByConditions(@Param("params") Map<String, Object> params);
	
	/**
     * 根据Map<String,Object>分页查询
     * @param  Map对象
     * @return
     */
	List<ProductParameterEntity> getProductParameterEntityListByConditions(@Param("pager") Pagination<Map<String, Object>> pager, @Param("params") Map<String, Object> params);
		
	/**
     * 保存运营管理-商品参数
     * @param  productParameterEntity
     * @return
     */
	Long insert(ProductParameterEntity productParameterEntity);
	
	/**
     * 更新运营管理-商品参数
     * @param  productParameterEntity
     * @return
     */
	 Integer update(ProductParameterEntity productParameterEntity);
	
	/**
     * 根据productParameterEntityID删除运营管理-商品参数
     * @param  productParameterEntity
     * @return
     */
	Integer delete(java.lang.String id);
	
	/**
	 * 按需查询
	 * @param paramMap
	 * @return
	 */
	List<ProductParameterEntity> getListByConditions(@Param("params") Map<String, Object> paramMap);
}
package com.oil.av.service.platform.config;

import java.util.List;
import java.util.Map;

import com.oil.av.vo.platform.config.ProductCategoryVo;
import com.oil.framework.common.page.Pagination;

public interface ProductCategoryService {

	/**
     * 根据id取得运营管理-商品分类
     * @param  id
     * @return
     */
     public ProductCategoryVo getProductCategoryVoById(String id);

	/**
     * 根据id取得运营管理-商品分类
     * @param  id
     * @return
     */
     public List<ProductCategoryVo> getAll();

	/**
     * 根据ProductCategoryVo对象分页查询
     * @param  productCategoryVo
     * @return
     */
     public Pagination<Map<String, Object>> getProductCategoryVoListByConditions(Pagination<Map<String, Object>> pager);
    
    /**
     * 保存运营管理-商品分类
     * @param  productCategoryVo
     * @return
     */
     public Long addProductCategoryVo(ProductCategoryVo productCategoryVo);
     
     /**
     * 更新运营管理-商品分类
     * @param  productCategoryVo
     * @return
     */
     public Integer updateProductCategoryVo(ProductCategoryVo productCategoryVo);
     
     /**
     * 根据id删除运营管理-商品分类
     * @param  id
     * @return
     */
     public Integer  deleteProductCategoryVo(String id);

     /**
      * 按需查询
      * @param paramMap
      * @return
      */
     public List<ProductCategoryVo> getListByConditions(Map<String, Object> paramMap);
}
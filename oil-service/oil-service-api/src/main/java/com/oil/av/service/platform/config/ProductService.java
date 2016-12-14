package com.oil.av.service.platform.config;

import java.util.List;
import java.util.Map;

import com.oil.av.vo.platform.config.ProductVo;
import com.oil.framework.common.page.Pagination;

public interface ProductService {

	/**
     * 根据id取得运营管理-商品
     * @param  id
     * @return
     */
     public ProductVo getProductVoById(String id);

	/**
     * 根据id取得运营管理-商品
     * @param  id
     * @return
     */
     public List<ProductVo> getAll();

	/**
     * 根据ProductVo对象分页查询
     * @param  productVo
     * @return
     */
     public Pagination<Map<String, Object>> getProductVoListByConditions(Pagination<Map<String, Object>> pager);
    
    /**
     * 保存运营管理-商品
     * @param  productVo
     * @return
     */
     public Long addProductVo(ProductVo productVo);
     
     /**
     * 更新运营管理-商品
     * @param  productVo
     * @return
     */
     public Integer updateProductVo(ProductVo productVo);
     
     /**
     * 根据id删除运营管理-商品
     * @param  id
     * @return
     */
     public Integer  deleteProductVo(String id);
}
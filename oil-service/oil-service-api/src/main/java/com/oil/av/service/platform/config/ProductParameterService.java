package com.oil.av.service.platform.config;

import java.util.List;
import java.util.Map;

import com.oil.av.vo.platform.config.ProductParameterVo;
import com.oil.framework.common.page.Pagination;

public interface ProductParameterService {

	/**
     * 根据id取得运营管理-商品参数
     * @param  id
     * @return
     */
     public ProductParameterVo getProductParameterVoById(String id);

	/**
     * 根据id取得运营管理-商品参数
     * @param  id
     * @return
     */
     public List<ProductParameterVo> getAll();

	/**
     * 根据ProductParameterVo对象分页查询
     * @param  productParameterVo
     * @return
     */
     public Pagination<Map<String, Object>> getProductParameterVoListByConditions(Pagination<Map<String, Object>> pager);
    
    /**
     * 保存运营管理-商品参数
     * @param  productParameterVo
     * @return
     */
     public Long addProductParameterVo(ProductParameterVo productParameterVo);
     
     /**
     * 更新运营管理-商品参数
     * @param  productParameterVo
     * @return
     */
     public Integer updateProductParameterVo(ProductParameterVo productParameterVo);
     
     /**
     * 根据id删除运营管理-商品参数
     * @param  id
     * @return
     */
     public Integer  deleteProductParameterVo(String id);
}
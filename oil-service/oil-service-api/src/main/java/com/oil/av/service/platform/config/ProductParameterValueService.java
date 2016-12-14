package com.oil.av.service.platform.config;

import java.util.List;
import java.util.Map;

import com.oil.av.vo.platform.config.ProductParameterValueVo;
import com.oil.framework.common.page.Pagination;

public interface ProductParameterValueService {

	/**
     * 根据id取得运营管理-商品参数值
     * @param  id
     * @return
     */
     public ProductParameterValueVo getProductParameterValueVoById(String id);

	/**
     * 根据id取得运营管理-商品参数值
     * @param  id
     * @return
     */
     public List<ProductParameterValueVo> getAll();

	/**
     * 根据ProductParameterValueVo对象分页查询
     * @param  productParameterValueVo
     * @return
     */
     public Pagination<Map<String, Object>> getProductParameterValueVoListByConditions(Pagination<Map<String, Object>> pager);
    
    /**
     * 保存运营管理-商品参数值
     * @param  productParameterValueVo
     * @return
     */
     public Long addProductParameterValueVo(ProductParameterValueVo productParameterValueVo);
     
     /**
     * 更新运营管理-商品参数值
     * @param  productParameterValueVo
     * @return
     */
     public Integer updateProductParameterValueVo(ProductParameterValueVo productParameterValueVo);
     
     /**
     * 根据id删除运营管理-商品参数值
     * @param  id
     * @return
     */
     public Integer  deleteProductParameterValueVo(String id);
}
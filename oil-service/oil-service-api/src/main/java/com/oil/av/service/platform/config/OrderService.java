package com.oil.av.service.platform.config;

import java.util.List;
import java.util.Map;

import com.oil.av.vo.platform.config.OrderVo;
import com.oil.framework.common.page.Pagination;

public interface OrderService {

	/**
     * 根据id取得运营管理-订单
     * @param  id
     * @return
     */
     public OrderVo getOrderVoById(String id);

	/**
     * 根据id取得运营管理-订单
     * @param  id
     * @return
     */
     public List<OrderVo> getAll();

	/**
     * 根据OrderVo对象分页查询
     * @param  orderVo
     * @return
     */
     public Pagination<Map<String, Object>> getOrderVoListByConditions(Pagination<Map<String, Object>> pager);
    
    /**
     * 保存运营管理-订单
     * @param  orderVo
     * @return
     */
     public Long addOrderVo(OrderVo orderVo);
     
     /**
     * 更新运营管理-订单
     * @param  orderVo
     * @return
     */
     public Integer updateOrderVo(OrderVo orderVo);
     
     /**
     * 根据id删除运营管理-订单
     * @param  id
     * @return
     */
     public Integer  deleteOrderVo(String id);
}
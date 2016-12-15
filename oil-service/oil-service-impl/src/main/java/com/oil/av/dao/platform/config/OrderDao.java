package com.oil.av.dao.platform.config;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.oil.av.entity.platform.config.OrderEntity;
import com.oil.framework.common.page.Pagination;


public interface OrderDao {
 
 	/**
     * 根据id取得运营管理-订单
     * @param  orderEntityId
     * @return
     */
	OrderEntity get(java.lang.String id);
	
	/**
     * 查询全部OrderEntity对象
     * @param  orderEntityId
     * @return
     */
	List<OrderEntity> getAll();

	/**
     * 根据Map<String,Object>对象查询符合条件的总数据数
     * @param  Map对象
     * @return
     */
	Long getOrderEntityCountsByConditions(@Param("params") Map<String, Object> params);
	
	/**
     * 根据Map<String,Object>分页查询
     * @param  Map对象
     * @return
     */
	List<OrderEntity> getOrderEntityListByConditions(@Param("pager") Pagination<Map<String, Object>> pager, @Param("params") Map<String, Object> params);
		
	/**
     * 保存运营管理-订单
     * @param  orderEntity
     * @return
     */
	Long insert(OrderEntity orderEntity);
	
	/**
     * 更新运营管理-订单
     * @param  orderEntity
     * @return
     */
	 Integer update(OrderEntity orderEntity);
	
	/**
     * 根据orderEntityID删除运营管理-订单
     * @param  orderEntity
     * @return
     */
	Integer delete(java.lang.String id);
	
	/**
     * 更新不为NULL 字段运营管理-订单
     * @param  orderEntity
     * @return
     */
	Integer updateNotNull(OrderEntity orderEntity);
 	
	/**
	 * 按需查询
	 * @param mapSms
	 * @return
	 */
	List<OrderEntity> getListByConditions(@Param("params") Map<String, Object> params);
}
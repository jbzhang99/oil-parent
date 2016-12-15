package com.oil.av.service.impl.platform.config;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import com.oil.av.dao.platform.config.OrderDao;
import com.oil.av.entity.platform.config.OrderEntity;
import com.oil.av.service.platform.config.OrderService;
import com.oil.av.vo.platform.config.OrderVo;
import com.oil.framework.common.page.Pagination;

@Service
public class OrderServiceImpl implements OrderService {
	
	@Resource
	private OrderDao orderDao;
    
    @Override
    public OrderVo getOrderVoById(String id) {
    	return this.entity2vo(orderDao.get(id));
    }

    @Override
    public List<OrderVo> getAll(){
    	List<OrderEntity> orderEntityList = orderDao.getAll();
    	List<OrderVo> orderVoList = new ArrayList<OrderVo>();
    	for(OrderEntity entity : orderEntityList){
    		orderVoList.add(this.entity2vo(entity));
    	}
		return orderVoList;
    }

    @Override
    public Pagination<Map<String, Object>> getOrderVoListByConditions(Pagination<Map<String, Object>> pager) {
		List<OrderEntity> orderEntityList = orderDao.getOrderEntityListByConditions(pager, pager.getCondition());
		Long totalList = orderDao.getOrderEntityCountsByConditions(pager.getCondition());
    	List<OrderVo> orderVoList = new ArrayList<OrderVo>();
    	for(OrderEntity entity : orderEntityList){
    		orderVoList.add(this.entity2vo(entity));
    	}
    	pager.setData(orderVoList);
    	pager.setRecordsTotal(totalList.intValue());
		return pager;
    }
            
     @Override
     public Long addOrderVo(OrderVo orderVo) {
     	
		return orderDao.insert(this.vo2entity(orderVo));
     }
     
     @Override
     public Integer updateOrderVo(OrderVo orderVo) {
		return orderDao.update(this.vo2entity(orderVo));
     }
     
     @Override
     public Integer deleteOrderVo(String id) {
		return orderDao.delete(id);
     }
     
     private OrderVo entity2vo(OrderEntity orderEntity){
     	//TODO 此处需要将entity转换成VO
     	if(orderEntity == null){
     		return null;
     	}
     	OrderVo orderVo = new OrderVo();
     	BeanUtils.copyProperties(orderEntity, orderVo);
     	return orderVo;
     }
     
     private OrderEntity vo2entity(OrderVo orderVo){
     	//TODO 此处需要将VO转换成entity
     	if(orderVo == null){
     		return null;
     	}
     	OrderEntity orderEntity = new OrderEntity();
     	BeanUtils.copyProperties(orderVo, orderEntity);
     	return orderEntity;
     }
}
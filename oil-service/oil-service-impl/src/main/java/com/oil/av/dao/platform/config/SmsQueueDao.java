package com.oil.av.dao.platform.config;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.oil.av.entity.platform.config.SmsQueueEntity;
import com.oil.framework.common.page.Pagination;


public interface SmsQueueDao {
 
 	/**
     * 根据id取得运营管理-短信队列
     * @param  smsQueueEntityId
     * @return
     */
	SmsQueueEntity get(java.lang.String id);
	
	/**
     * 查询全部SmsQueueEntity对象
     * @param  smsQueueEntityId
     * @return
     */
	List<SmsQueueEntity> getAll();

	/**
     * 根据Map<String,Object>对象查询符合条件的总数据数
     * @param  Map对象
     * @return
     */
	Long getSmsQueueEntityCountsByConditions(@Param("params") Map<String, Object> params);
	
	/**
     * 根据Map<String,Object>分页查询
     * @param  Map对象
     * @return
     */
	List<SmsQueueEntity> getSmsQueueEntityListByConditions(@Param("pager") Pagination<Map<String, Object>> pager, @Param("params") Map<String, Object> params);
		
	/**
     * 保存运营管理-短信队列
     * @param  smsQueueEntity
     * @return
     */
	Integer insert(SmsQueueEntity smsQueueEntity);
	
	/**
     * 更新运营管理-短信队列
     * @param  smsQueueEntity
     * @return
     */
	 Integer update(SmsQueueEntity smsQueueEntity);
	
	/**
     * 根据smsQueueEntityID删除运营管理-短信队列
     * @param  smsQueueEntity
     * @return
     */
	Integer delete(java.lang.String id);

	/**
	 * 按需查询
	 * @param mapSms
	 * @return
	 */
	List<SmsQueueEntity> getListByConditions(Map<String, Object> mapSms);

	/**
	 * 更新不为null的字段
	 * @param vo2entity
	 * @return
	 */
	Integer updateNotNull(SmsQueueEntity vo2entity);
}
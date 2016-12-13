package com.oil.av.dao.platform.config;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.oil.av.entity.platform.config.SmsTemplateEntity;
import com.oil.framework.common.page.Pagination;


public interface SmsTemplateDao {
 
 	/**
     * 根据id取得运营管理-短信模板
     * @param  SmsTemplateEntityId
     * @return
     */
	SmsTemplateEntity get(java.lang.String id);
	
	/**
     * 查询全部SmsTemplateEntity对象
     * @param  SmsTemplateEntityId
     * @return
     */
	List<SmsTemplateEntity> getAll();

	/**
     * 根据Map<String,Object>对象查询符合条件的总数据数
     * @param  Map对象
     * @return
     */
	Long getSmsTemplateEntityCountsByConditions(@Param("params") Map<String, Object> params);
	
	/**
     * 根据Map<String,Object>分页查询
     * @param  Map对象
     * @return
     */
	List<SmsTemplateEntity> getSmsTemplateEntityListByConditions(@Param("pager") Pagination<Map<String, Object>> pager, @Param("params") Map<String, Object> params);
		
	/**
     * 保存运营管理-短信模板
     * @param  SmsTemplateEntity
     * @return
     */
	Integer insert(SmsTemplateEntity SmsTemplateEntity);
	
	/**
     * 更新运营管理-短信模板
     * @param  SmsTemplateEntity
     * @return
     */
	 Integer update(SmsTemplateEntity SmsTemplateEntity);
	
	/**
     * 根据SmsTemplateEntityID删除运营管理-短信模板
     * @param  SmsTemplateEntity
     * @return
     */
	Integer delete(java.lang.String id);

	/**
	 * 按需查询
	 * @param params
	 * @return
	 */
	List<SmsTemplateEntity> getListByConditions(@Param("params") Map<String, Object> params);
}
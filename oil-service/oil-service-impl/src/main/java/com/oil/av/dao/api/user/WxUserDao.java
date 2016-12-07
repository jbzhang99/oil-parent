package com.oil.av.dao.api.user;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.oil.av.entity.api.user.WxUserEntity;
import com.oil.framework.common.page.Pagination;


public interface WxUserDao {
 
 	/**
     * 根据id取得用户绑定微信
     * @param  wxUserEntityId
     * @return
     */
	WxUserEntity get(java.lang.String id);
	
	/**
     * 查询全部WxUserEntity对象
     * @param  wxUserEntityId
     * @return
     */
	List<WxUserEntity> getAll();

	/**
     * 根据Map<String,Object>对象查询符合条件的总数据数
     * @param  Map对象
     * @return
     */
	Long getWxUserEntityCountsByConditions(@Param("params") Map<String, Object> params);
	
	/**
     * 根据Map<String,Object>分页查询
     * @param  Map对象
     * @return
     */
	List<WxUserEntity> getWxUserEntityListByConditions(@Param("pager") Pagination<Map<String, Object>> pager, @Param("params") Map<String, Object> params);
		
	/**
     * 保存用户绑定微信
     * @param  wxUserEntity
     * @return
     */
	Long insert(WxUserEntity wxUserEntity);
	
	/**
     * 更新用户绑定微信
     * @param  wxUserEntity
     * @return
     */
	 Integer update(WxUserEntity wxUserEntity);
	
	/**
     * 根据wxUserEntityID删除用户绑定微信
     * @param  wxUserEntity
     * @return
     */
	Integer delete(java.lang.String id);
}
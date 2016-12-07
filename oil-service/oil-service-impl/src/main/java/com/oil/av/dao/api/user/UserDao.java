package com.oil.av.dao.api.user;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.oil.av.entity.api.user.UserEntity;
import com.oil.framework.common.page.Pagination;


public interface UserDao {
 
 	/**
     * 根据id取得用户
     * @param  userEntityId
     * @return
     */
	UserEntity get(java.lang.String id);
	
	/**
     * 查询全部UserEntity对象
     * @param  userEntityId
     * @return
     */
	List<UserEntity> getAll();

	/**
     * 根据Map<String,Object>对象查询符合条件的总数据数
     * @param  Map对象
     * @return
     */
	Long getUserEntityCountsByConditions(@Param("params") Map<String, Object> params);
	
	/**
     * 根据Map<String,Object>分页查询
     * @param  Map对象
     * @return
     */
	List<UserEntity> getUserEntityListByConditions(@Param("pager") Pagination<Map<String, Object>> pager, @Param("params") Map<String, Object> params);
		
	/**
     * 保存用户
     * @param  userEntity
     * @return
     */
	Long insert(UserEntity userEntity);
	
	/**
     * 更新用户
     * @param  userEntity
     * @return
     */
	 Integer update(UserEntity userEntity);
	
	/**
     * 根据userEntityID删除用户
     * @param  userEntity
     * @return
     */
	Integer delete(java.lang.String id);
}
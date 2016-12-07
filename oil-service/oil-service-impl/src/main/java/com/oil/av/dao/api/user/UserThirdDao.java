package com.oil.av.dao.api.user;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.oil.av.entity.api.user.UserThirdEntity;
import com.oil.framework.common.page.Pagination;


public interface UserThirdDao {
 
 	/**
     * 根据id取得用户-三方账户关联
     * @param  userThirdEntityId
     * @return
     */
	UserThirdEntity get(java.lang.String id);
	
	/**
     * 查询全部UserThirdEntity对象
     * @param  userThirdEntityId
     * @return
     */
	List<UserThirdEntity> getAll();

	/**
     * 根据Map<String,Object>对象查询符合条件的总数据数
     * @param  Map对象
     * @return
     */
	Long getUserThirdEntityCountsByConditions(@Param("params") Map<String, Object> params);
	
	/**
     * 根据Map<String,Object>分页查询
     * @param  Map对象
     * @return
     */
	List<UserThirdEntity> getUserThirdEntityListByConditions(@Param("pager") Pagination<Map<String, Object>> pager, @Param("params") Map<String, Object> params);
		
	/**
     * 保存用户-三方账户关联
     * @param  userThirdEntity
     * @return
     */
	Long insert(UserThirdEntity userThirdEntity);
	
	/**
     * 更新用户-三方账户关联
     * @param  userThirdEntity
     * @return
     */
	 Integer update(UserThirdEntity userThirdEntity);
	
	/**
     * 根据userThirdEntityID删除用户-三方账户关联
     * @param  userThirdEntity
     * @return
     */
	Integer delete(java.lang.String id);
}
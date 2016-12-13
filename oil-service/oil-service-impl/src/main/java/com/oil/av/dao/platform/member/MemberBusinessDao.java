package com.oil.av.dao.platform.member;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.oil.av.entity.platform.member.MemberBusinessEntity;
import com.oil.av.vo.platform.member.MemberBusinessVo;
import com.oil.framework.common.page.Pagination;


public interface MemberBusinessDao {
 
 	/**
     * 根据id取得用户公司信息
     * @param  memberBusinessEntityId
     * @return
     */
	MemberBusinessEntity get(java.lang.String id);
	
	/**
     * 查询全部MemberBusinessEntity对象
     * @param  memberBusinessEntityId
     * @return
     */
	List<MemberBusinessEntity> getAll();

	/**
     * 根据Map<String,Object>对象查询符合条件的总数据数
     * @param  Map对象
     * @return
     */
	Long getMemberBusinessEntityCountsByConditions(@Param("params") Map<String, Object> params);
	
	/**
     * 根据Map<String,Object>分页查询
     * @param  Map对象
     * @return
     */
	List<MemberBusinessEntity> getMemberBusinessEntityListByConditions(@Param("pager") Pagination<Map<String, Object>> pager, @Param("params") Map<String, Object> params);
		
	/**
     * 保存用户公司信息
     * @param  memberBusinessEntity
     * @return
     */
	Integer insert(MemberBusinessEntity memberBusinessEntity);
	
	/**
     * 更新用户公司信息
     * @param  memberBusinessEntity
     * @return
     */
	 Integer update(MemberBusinessEntity memberBusinessEntity);
	
	/**
     * 根据memberBusinessEntityID删除用户公司信息
     * @param  memberBusinessEntity
     * @return
     */
	Integer delete(java.lang.String id);

	/**
	 * 更新用户公司信息
	 * @param vo2entity
	 * @return
	 */
	Integer updateNotNull(MemberBusinessEntity vo2entity);

 	/**
 	 * 按需查询
 	 * @param mapSms
 	 * @return
 	 */
	List<MemberBusinessEntity> getListByConditions(Map<String, Object> mapSms);
}
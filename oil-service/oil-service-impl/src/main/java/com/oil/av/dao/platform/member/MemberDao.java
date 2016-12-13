package com.oil.av.dao.platform.member;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.oil.av.entity.platform.member.MemberEntity;
import com.oil.framework.common.page.Pagination;


public interface MemberDao {
 
 	/**
     * 根据id取得用户
     * @param  memberEntityId
     * @return
     */
	MemberEntity get(java.lang.String id);
	
	/**
     * 查询全部MemberEntity对象
     * @param  memberEntityId
     * @return
     */
	List<MemberEntity> getAll();

	/**
     * 根据Map<String,Object>对象查询符合条件的总数据数
     * @param  Map对象
     * @return
     */
	Long getMemberEntityCountsByConditions(@Param("params") Map<String, Object> params);
	
	/**
     * 根据Map<String,Object>分页查询
     * @param  Map对象
     * @return
     */
	List<MemberEntity> getMemberEntityListByConditions(@Param("pager") Pagination<Map<String, Object>> pager, @Param("params") Map<String, Object> params);
		
	/**
     * 保存用户
     * @param  memberEntity
     * @return
     */
	Integer insert(MemberEntity memberEntity);
	
	/**
     * 更新用户
     * @param  memberEntity
     * @return
     */
	 Integer update(MemberEntity memberEntity);
	
	/**
     * 根据memberEntityID删除用户
     * @param  memberEntity
     * @return
     */
	Integer delete(java.lang.String id);
	
	/**
     * 通过手机号查找用户
     * @param accountEntity
     * @return
     */
    List<MemberEntity> getByPhone(@Param("phone") String phone);
    
    /**
     * 更新不为null的字段,如果有字段设置为null,用下面的
     * @param vo2entity
     */
    Integer updateNotNull(MemberEntity vo2entity);
    
    /**
     * 动态更新
     * @param map
     */
    void updateMemberByMap(@Param("map") Map<String,Object> map);

    /**
     * 通过会员id查询序列号
     * @param userId
     * @return
     */
	String getSerialById(String userId);

	/**
	 * 手机号查询用户个数
	 * @param phone
	 * @return
	 */
	int getMemberCountByPhone(String phone);

    
}
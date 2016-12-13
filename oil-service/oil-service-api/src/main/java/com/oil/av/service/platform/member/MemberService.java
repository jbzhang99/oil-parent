package com.oil.av.service.platform.member;

import java.util.List;
import java.util.Map;

import com.oil.av.vo.platform.member.MemberVo;
import com.oil.framework.common.page.Pagination;

public interface MemberService {

	/**
     * 根据id取得用户
     * @param  id
     * @return
     */
     public MemberVo getMemberVoById(String id);

	/**
     * 根据id取得用户
     * @param  id
     * @return
     */
     public List<MemberVo> getAll();

	/**
     * 根据MemberVo对象分页查询
     * @param  memberVo
     * @return
     */
     public Pagination<Map<String, Object>> getMemberVoListByConditions(Pagination<Map<String, Object>> pager);
    
    /**
     * 保存用户
     * @param  memberVo
     * @return
     */
     public Integer addMemberVo(MemberVo memberVo);
     
     /**
     * 更新用户
     * @param  memberVo
     * @return
     */
     public Integer updateMemberVo(MemberVo memberVo);
     
     /**
     * 根据id删除用户
     * @param  id
     * @return
     */
     public Integer  deleteMemberVo(String id);

     /**
      * 通过手机号获取用户信息，有可能查询出多条
      * @param tel
      * @return
      */
     public List<MemberVo> getByPhone(String tel);

     /**
      * 查询会员序列号
      * @param userId
      * @return
      */
	public String getSerialById(String userId);

	/**
	 * 更新不为null的字段
	 * @param memberUpdate
	 */
	public Integer updateNotNull(MemberVo memberUpdate);

	/**
	 * 查询手机号是否存在
	 * @param phone
	 * @return
	 */
	public int getMemberCountByPhone(String phone);
}
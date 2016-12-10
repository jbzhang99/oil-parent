package com.oil.av.service.platform.member;

import java.util.List;
import java.util.Map;

import com.oil.av.vo.platform.member.MemberBusinessVo;
import com.oil.framework.common.page.Pagination;

public interface MemberBusinessService {

	/**
     * 根据id取得用户公司信息
     * @param  id
     * @return
     */
     public MemberBusinessVo getMemberBusinessVoById(String id);

	/**
     * 根据id取得用户公司信息
     * @param  id
     * @return
     */
     public List<MemberBusinessVo> getAll();

	/**
     * 根据MemberBusinessVo对象分页查询
     * @param  memberBusinessVo
     * @return
     */
     public Pagination<Map<String, Object>> getMemberBusinessVoListByConditions(Pagination<Map<String, Object>> pager);
    
    /**
     * 保存用户公司信息
     * @param  memberBusinessVo
     * @return
     */
     public Long addMemberBusinessVo(MemberBusinessVo memberBusinessVo);
     
     /**
     * 更新用户公司信息
     * @param  memberBusinessVo
     * @return
     */
     public Integer updateMemberBusinessVo(MemberBusinessVo memberBusinessVo);
     
     /**
     * 根据id删除用户公司信息
     * @param  id
     * @return
     */
     public Integer  deleteMemberBusinessVo(String id);
}
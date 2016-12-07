package com.oil.av.service.api.user;

import java.util.List;
import java.util.Map;

import com.oil.av.vo.api.user.UserVo;
import com.oil.framework.common.page.Pagination;

public interface UserService {

	/**
     * 根据id取得用户
     * @param  id
     * @return
     */
     public UserVo getUserVoById(String id);

	/**
     * 根据id取得用户
     * @param  id
     * @return
     */
     public List<UserVo> getAll();

	/**
     * 根据UserVo对象分页查询
     * @param  userVo
     * @return
     */
     public Pagination<Map<String, Object>> getUserVoListByConditions(Pagination<Map<String, Object>> pager);
    
    /**
     * 保存用户
     * @param  userVo
     * @return
     */
     public Long addUserVo(UserVo userVo);
     
     /**
     * 更新用户
     * @param  userVo
     * @return
     */
     public Integer updateUserVo(UserVo userVo);
     
     /**
     * 根据id删除用户
     * @param  id
     * @return
     */
     public Integer  deleteUserVo(String id);
}
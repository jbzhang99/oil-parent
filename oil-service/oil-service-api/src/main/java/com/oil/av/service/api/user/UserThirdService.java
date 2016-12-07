package com.oil.av.service.api.user;

import java.util.List;
import java.util.Map;

import com.oil.av.vo.api.user.UserThirdVo;
import com.oil.framework.common.page.Pagination;

public interface UserThirdService {

	/**
     * 根据id取得用户-三方账户关联
     * @param  id
     * @return
     */
     public UserThirdVo getUserThirdVoById(String id);

	/**
     * 根据id取得用户-三方账户关联
     * @param  id
     * @return
     */
     public List<UserThirdVo> getAll();

	/**
     * 根据UserThirdVo对象分页查询
     * @param  userThirdVo
     * @return
     */
     public Pagination<Map<String, Object>> getUserThirdVoListByConditions(Pagination<Map<String, Object>> pager);
    
    /**
     * 保存用户-三方账户关联
     * @param  userThirdVo
     * @return
     */
     public Long addUserThirdVo(UserThirdVo userThirdVo);
     
     /**
     * 更新用户-三方账户关联
     * @param  userThirdVo
     * @return
     */
     public Integer updateUserThirdVo(UserThirdVo userThirdVo);
     
     /**
     * 根据id删除用户-三方账户关联
     * @param  id
     * @return
     */
     public Integer  deleteUserThirdVo(String id);
}
package com.oil.av.service.api.user;

import java.util.List;
import java.util.Map;

import com.oil.av.vo.api.user.WxUserVo;
import com.oil.framework.common.page.Pagination;

public interface WxUserService {

	/**
     * 根据id取得用户绑定微信
     * @param  id
     * @return
     */
     public WxUserVo getWxUserVoById(String id);

	/**
     * 根据id取得用户绑定微信
     * @param  id
     * @return
     */
     public List<WxUserVo> getAll();

	/**
     * 根据WxUserVo对象分页查询
     * @param  wxUserVo
     * @return
     */
     public Pagination<Map<String, Object>> getWxUserVoListByConditions(Pagination<Map<String, Object>> pager);
    
    /**
     * 保存用户绑定微信
     * @param  wxUserVo
     * @return
     */
     public Long addWxUserVo(WxUserVo wxUserVo);
     
     /**
     * 更新用户绑定微信
     * @param  wxUserVo
     * @return
     */
     public Integer updateWxUserVo(WxUserVo wxUserVo);
     
     /**
     * 根据id删除用户绑定微信
     * @param  id
     * @return
     */
     public Integer  deleteWxUserVo(String id);
}
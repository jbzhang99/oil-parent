package com.oil.av.service.platform.config;

import java.util.List;
import java.util.Map;

import com.oil.av.vo.platform.config.SmsTemplateVo;
import com.oil.framework.common.page.Pagination;

public interface SmsTemplateService {

	/**
     * 根据id取得运营管理-短信模板
     * @param  id
     * @return
     */
     public SmsTemplateVo getSmsTemplateVoById(String id);

	/**
     * 根据id取得运营管理-短信模板
     * @param  id
     * @return
     */
     public List<SmsTemplateVo> getAll();

	/**
     * 根据SmsTemplateVo对象分页查询
     * @param  SmsTemplateVo
     * @return
     */
     public Pagination<Map<String, Object>> getSmsTemplateVoListByConditions(Pagination<Map<String, Object>> pager);
    
    /**
     * 保存运营管理-短信模板
     * @param  SmsTemplateVo
     * @return
     */
     public Integer addSmsTemplateVo(SmsTemplateVo SmsTemplateVo);
     
     /**
     * 更新运营管理-短信模板
     * @param  SmsTemplateVo
     * @return
     */
     public Integer updateSmsTemplateVo(SmsTemplateVo SmsTemplateVo);
     
     /**
     * 根据id删除运营管理-短信模板
     * @param  id
     * @return
     */
     public Integer  deleteSmsTemplateVo(String id);

     /**
      * 按需查询模板
      * @param register
      * @return
      */
     public List<SmsTemplateVo> getListByConditions(Map<String,Object> map);
}
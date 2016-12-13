package com.oil.av.service.platform.config;

import java.util.List;
import java.util.Map;

import com.oil.av.em.SmsTemplateNameEnum;
import com.oil.av.vo.platform.config.SmsQueueVo;
import com.oil.framework.common.page.Pagination;

public interface SmsQueueService {

	/**
     * 根据id取得运营管理-短信队列
     * @param  id
     * @return
     */
     public SmsQueueVo getSmsQueueVoById(String id);

	/**
     * 根据id取得运营管理-短信队列
     * @param  id
     * @return
     */
     public List<SmsQueueVo> getAll();

	/**
     * 根据SmsQueueVo对象分页查询
     * @param  smsQueueVo
     * @return
     */
     public Pagination<Map<String, Object>> getSmsQueueVoListByConditions(Pagination<Map<String, Object>> pager);
    
    /**
     * 保存运营管理-短信队列
     * @param  smsQueueVo
     * @return
     */
     public Integer addSmsQueueVo(SmsQueueVo smsQueueVo);
     
     /**
     * 更新运营管理-短信队列
     * @param  smsQueueVo
     * @return
     */
     public Integer updateSmsQueueVo(SmsQueueVo smsQueueVo);
     
     /**
     * 根据id删除运营管理-短信队列
     * @param  id
     * @return
     */
     public Integer  deleteSmsQueueVo(String id);

	  /**
	   * 按需查询
	   * @param mapSms
	   * @return
	   */
	  public List<SmsQueueVo> getListByConditions(Map<String, Object> mapSms);

	  /**
	   * 发送短信
	   * @param sqv
	   * @param flag
	   */
	  public void sendSms(SmsQueueVo sqv, boolean flag);
}
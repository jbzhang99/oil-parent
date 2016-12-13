package com.oil.av.service.impl.platform.config;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import com.oil.av.dao.platform.config.SmsTemplateDao;
import com.oil.av.entity.platform.config.SmsTemplateEntity;
import com.oil.av.service.platform.config.SmsTemplateService;
import com.oil.av.vo.platform.config.SmsTemplateVo;
import com.oil.framework.common.page.Pagination;

@Service
public class SmsTemplateServiceImpl implements SmsTemplateService {
	
	@Resource
	private SmsTemplateDao SmsTemplateDao;
    
    @Override
    public SmsTemplateVo getSmsTemplateVoById(String id) {
    	return this.entity2vo(SmsTemplateDao.get(id));
    }

    @Override
    public List<SmsTemplateVo> getAll(){
    	List<SmsTemplateEntity> SmsTemplateEntityList = SmsTemplateDao.getAll();
    	List<SmsTemplateVo> SmsTemplateVoList = new ArrayList<SmsTemplateVo>();
    	for(SmsTemplateEntity entity : SmsTemplateEntityList){
    		SmsTemplateVoList.add(this.entity2vo(entity));
    	}
		return SmsTemplateVoList;
    }

    @Override
    public Pagination<Map<String, Object>> getSmsTemplateVoListByConditions(Pagination<Map<String, Object>> pager) {
		List<SmsTemplateEntity> SmsTemplateEntityList = SmsTemplateDao.getSmsTemplateEntityListByConditions(pager, pager.getCondition());
		Long totalList = SmsTemplateDao.getSmsTemplateEntityCountsByConditions(pager.getCondition());
    	List<SmsTemplateVo> SmsTemplateVoList = new ArrayList<SmsTemplateVo>();
    	for(SmsTemplateEntity entity : SmsTemplateEntityList){
    		SmsTemplateVoList.add(this.entity2vo(entity));
    	}
    	pager.setData(SmsTemplateVoList);
    	pager.setRecordsTotal(totalList.intValue());
		return pager;
    }
            
     @Override
     public Integer addSmsTemplateVo(SmsTemplateVo SmsTemplateVo) {
     	
		return SmsTemplateDao.insert(this.vo2entity(SmsTemplateVo));
     }
     
     @Override
     public Integer updateSmsTemplateVo(SmsTemplateVo SmsTemplateVo) {
		return SmsTemplateDao.update(this.vo2entity(SmsTemplateVo));
     }
     
     @Override
     public Integer deleteSmsTemplateVo(String id) {
		return SmsTemplateDao.delete(id);
     }
     
     private SmsTemplateVo entity2vo(SmsTemplateEntity SmsTemplateEntity){
     	//TODO 此处需要将entity转换成VO
     	if(SmsTemplateEntity == null){
     		return null;
     	}
     	SmsTemplateVo SmsTemplateVo = new SmsTemplateVo();
     	BeanUtils.copyProperties(SmsTemplateEntity, SmsTemplateVo);
     	return SmsTemplateVo;
     }
     
     private SmsTemplateEntity vo2entity(SmsTemplateVo SmsTemplateVo){
     	//TODO 此处需要将VO转换成entity
     	if(SmsTemplateVo == null){
     		return null;
     	}
     	SmsTemplateEntity SmsTemplateEntity = new SmsTemplateEntity();
     	BeanUtils.copyProperties(SmsTemplateVo, SmsTemplateEntity);
     	return SmsTemplateEntity;
     }

	@Override
	public List<SmsTemplateVo> getListByConditions(Map<String,Object> map) {
		List<SmsTemplateEntity> SmsTemplateEntityList = SmsTemplateDao.getListByConditions(map);
		
		List<SmsTemplateVo> SmsTemplateVoList = new ArrayList<SmsTemplateVo>();
    	for(SmsTemplateEntity entity : SmsTemplateEntityList){
    		SmsTemplateVoList.add(this.entity2vo(entity));
    	}
		return SmsTemplateVoList;
	}
}
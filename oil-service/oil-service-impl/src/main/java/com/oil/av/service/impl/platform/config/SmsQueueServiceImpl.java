package com.oil.av.service.impl.platform.config;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import com.oil.av.dao.platform.config.SmsQueueDao;
import com.oil.av.entity.platform.config.SmsQueueEntity;
import com.oil.av.service.platform.config.SmsQueueService;
import com.oil.av.vo.platform.config.SmsQueueVo;
import com.oil.framework.common.page.Pagination;
import com.oil.framework.common.util.SendMsgUtils;

@Service
public class SmsQueueServiceImpl implements SmsQueueService {
	
	@Resource
	private SmsQueueDao smsQueueDao;
    
    @Override
    public SmsQueueVo getSmsQueueVoById(String id) {
    	return this.entity2vo(smsQueueDao.get(id));
    }

    @Override
    public List<SmsQueueVo> getAll(){
    	List<SmsQueueEntity> smsQueueEntityList = smsQueueDao.getAll();
    	List<SmsQueueVo> smsQueueVoList = new ArrayList<SmsQueueVo>();
    	for(SmsQueueEntity entity : smsQueueEntityList){
    		smsQueueVoList.add(this.entity2vo(entity));
    	}
		return smsQueueVoList;
    }

    @Override
    public Pagination<Map<String, Object>> getSmsQueueVoListByConditions(Pagination<Map<String, Object>> pager) {
		List<SmsQueueEntity> smsQueueEntityList = smsQueueDao.getSmsQueueEntityListByConditions(pager, pager.getCondition());
		Long totalList = smsQueueDao.getSmsQueueEntityCountsByConditions(pager.getCondition());
    	List<SmsQueueVo> smsQueueVoList = new ArrayList<SmsQueueVo>();
    	for(SmsQueueEntity entity : smsQueueEntityList){
    		smsQueueVoList.add(this.entity2vo(entity));
    	}
    	pager.setData(smsQueueVoList);
    	pager.setRecordsTotal(totalList.intValue());
		return pager;
    }
            
     @Override
     public Long addSmsQueueVo(SmsQueueVo smsQueueVo) {
     	
		return smsQueueDao.insert(this.vo2entity(smsQueueVo));
     }
     
     @Override
     public Integer updateSmsQueueVo(SmsQueueVo smsQueueVo) {
		return smsQueueDao.update(this.vo2entity(smsQueueVo));
     }
     
     @Override
     public Integer deleteSmsQueueVo(String id) {
		return smsQueueDao.delete(id);
     }
     
     private SmsQueueVo entity2vo(SmsQueueEntity smsQueueEntity){
     	//TODO 此处需要将entity转换成VO
     	if(smsQueueEntity == null){
     		return null;
     	}
     	SmsQueueVo smsQueueVo = new SmsQueueVo();
     	BeanUtils.copyProperties(smsQueueEntity, smsQueueVo);
     	return smsQueueVo;
     }
     
     private SmsQueueEntity vo2entity(SmsQueueVo smsQueueVo){
     	//TODO 此处需要将VO转换成entity
     	if(smsQueueVo == null){
     		return null;
     	}
     	SmsQueueEntity smsQueueEntity = new SmsQueueEntity();
     	BeanUtils.copyProperties(smsQueueVo, smsQueueEntity);
     	return smsQueueEntity;
     }

	@Override
	public List<SmsQueueVo> getListByConditions(Map<String, Object> mapSms) {
		List<SmsQueueEntity> smsQueueList = smsQueueDao.getListByConditions(mapSms);
		
		List<SmsQueueVo> smTemplateVoList = new ArrayList<SmsQueueVo>();
    	for(SmsQueueEntity entity : smsQueueList){
    		smTemplateVoList.add(this.entity2vo(entity));
    	}
		return smTemplateVoList;
	}

	@Override
	public void sendSms(SmsQueueVo sqv, boolean flag) {
		
		boolean success = SendMsgUtils.sendSms(sqv.getPhone(), sqv.getContent());
		if(success){
			sqv.setIsSuccess(success);
			sqv.setSuccessTime(sqv.getLastSendTime());
			sqv.setLastSendTime(new Date());
		}else{
			//TODO 写日志
		}
		if(flag){
			smsQueueDao.insert(this.vo2entity(sqv));
		}else{
			smsQueueDao.updateNotNull(this.vo2entity(sqv));
		}
	}
}
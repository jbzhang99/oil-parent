package com.oil.av.service.impl.api.user;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import com.oil.av.dao.api.user.WxUserDao;
import com.oil.av.entity.api.user.WxUserEntity;
import com.oil.av.service.api.user.WxUserService;
import com.oil.av.vo.api.user.WxUserVo;
import com.oil.framework.common.page.Pagination;

@Service
public class WxUserServiceImpl implements WxUserService {
	
	@Resource
	private WxUserDao wxUserDao;
    
    @Override
    public WxUserVo getWxUserVoById(String id) {
    	return this.entity2vo(wxUserDao.get(id));
    }

    @Override
    public List<WxUserVo> getAll(){
    	List<WxUserEntity> wxUserEntityList = wxUserDao.getAll();
    	List<WxUserVo> wxUserVoList = new ArrayList<WxUserVo>();
    	for(WxUserEntity entity : wxUserEntityList){
    		wxUserVoList.add(this.entity2vo(entity));
    	}
		return wxUserVoList;
    }

    @Override
    public Pagination<Map<String, Object>> getWxUserVoListByConditions(Pagination<Map<String, Object>> pager) {
		List<WxUserEntity> wxUserEntityList = wxUserDao.getWxUserEntityListByConditions(pager, pager.getCondition());
		Long totalList = wxUserDao.getWxUserEntityCountsByConditions(pager.getCondition());
    	List<WxUserVo> wxUserVoList = new ArrayList<WxUserVo>();
    	for(WxUserEntity entity : wxUserEntityList){
    		wxUserVoList.add(this.entity2vo(entity));
    	}
    	pager.setData(wxUserVoList);
    	pager.setRecordsTotal(totalList.intValue());
		return pager;
    }
            
     @Override
     public Long addWxUserVo(WxUserVo wxUserVo) {
     	
		return wxUserDao.insert(this.vo2entity(wxUserVo));
     }
     
     @Override
     public Integer updateWxUserVo(WxUserVo wxUserVo) {
		return wxUserDao.update(this.vo2entity(wxUserVo));
     }
     
     @Override
     public Integer deleteWxUserVo(String id) {
		return wxUserDao.delete(id);
     }
     
     private WxUserVo entity2vo(WxUserEntity wxUserEntity){
     	//TODO 此处需要将entity转换成VO
     	if(wxUserEntity == null){
     		return null;
     	}
     	WxUserVo wxUserVo = new WxUserVo();
     	BeanUtils.copyProperties(wxUserEntity, wxUserVo);
     	return wxUserVo;
     }
     
     private WxUserEntity vo2entity(WxUserVo wxUserVo){
     	//TODO 此处需要将VO转换成entity
     	if(wxUserVo == null){
     		return null;
     	}
     	WxUserEntity wxUserEntity = new WxUserEntity();
     	BeanUtils.copyProperties(wxUserVo, wxUserEntity);
     	return wxUserEntity;
     }
}
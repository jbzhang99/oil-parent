package com.oil.av.service.impl.api.user;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import com.oil.av.dao.api.user.UserThirdDao;
import com.oil.av.entity.api.user.UserThirdEntity;
import com.oil.av.service.api.user.UserThirdService;
import com.oil.av.vo.api.user.UserThirdVo;
import com.oil.framework.common.page.Pagination;

@Service
public class UserThirdServiceImpl implements UserThirdService {
	
	@Resource
	private UserThirdDao userThirdDao;
    
    @Override
    public UserThirdVo getUserThirdVoById(String id) {
    	return this.entity2vo(userThirdDao.get(id));
    }

    @Override
    public List<UserThirdVo> getAll(){
    	List<UserThirdEntity> userThirdEntityList = userThirdDao.getAll();
    	List<UserThirdVo> userThirdVoList = new ArrayList<UserThirdVo>();
    	for(UserThirdEntity entity : userThirdEntityList){
    		userThirdVoList.add(this.entity2vo(entity));
    	}
		return userThirdVoList;
    }

    @Override
    public Pagination<Map<String, Object>> getUserThirdVoListByConditions(Pagination<Map<String, Object>> pager) {
		List<UserThirdEntity> userThirdEntityList = userThirdDao.getUserThirdEntityListByConditions(pager, pager.getCondition());
		Long totalList = userThirdDao.getUserThirdEntityCountsByConditions(pager.getCondition());
    	List<UserThirdVo> userThirdVoList = new ArrayList<UserThirdVo>();
    	for(UserThirdEntity entity : userThirdEntityList){
    		userThirdVoList.add(this.entity2vo(entity));
    	}
    	pager.setData(userThirdVoList);
    	pager.setRecordsTotal(totalList.intValue());
		return pager;
    }
            
     @Override
     public Long addUserThirdVo(UserThirdVo userThirdVo) {
     	
		return userThirdDao.insert(this.vo2entity(userThirdVo));
     }
     
     @Override
     public Integer updateUserThirdVo(UserThirdVo userThirdVo) {
		return userThirdDao.update(this.vo2entity(userThirdVo));
     }
     
     @Override
     public Integer deleteUserThirdVo(String id) {
		return userThirdDao.delete(id);
     }
     
     private UserThirdVo entity2vo(UserThirdEntity userThirdEntity){
     	//TODO 此处需要将entity转换成VO
     	if(userThirdEntity == null){
     		return null;
     	}
     	UserThirdVo userThirdVo = new UserThirdVo();
     	BeanUtils.copyProperties(userThirdEntity, userThirdVo);
     	return userThirdVo;
     }
     
     private UserThirdEntity vo2entity(UserThirdVo userThirdVo){
     	//TODO 此处需要将VO转换成entity
     	if(userThirdVo == null){
     		return null;
     	}
     	UserThirdEntity userThirdEntity = new UserThirdEntity();
     	BeanUtils.copyProperties(userThirdVo, userThirdEntity);
     	return userThirdEntity;
     }
}
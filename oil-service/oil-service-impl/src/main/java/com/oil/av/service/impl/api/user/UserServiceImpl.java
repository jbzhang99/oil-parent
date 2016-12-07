package com.oil.av.service.impl.api.user;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import com.oil.av.dao.api.user.UserDao;
import com.oil.av.entity.api.user.UserEntity;
import com.oil.av.service.api.user.UserService;
import com.oil.av.vo.api.user.UserVo;
import com.oil.framework.common.page.Pagination;

@Service
public class UserServiceImpl implements UserService {
	
	@Resource
	private UserDao userDao;
    
    @Override
    public UserVo getUserVoById(String id) {
    	return this.entity2vo(userDao.get(id));
    }

    @Override
    public List<UserVo> getAll(){
    	List<UserEntity> userEntityList = userDao.getAll();
    	List<UserVo> userVoList = new ArrayList<UserVo>();
    	for(UserEntity entity : userEntityList){
    		userVoList.add(this.entity2vo(entity));
    	}
		return userVoList;
    }

    @Override
    public Pagination<Map<String, Object>> getUserVoListByConditions(Pagination<Map<String, Object>> pager) {
		List<UserEntity> userEntityList = userDao.getUserEntityListByConditions(pager, pager.getCondition());
		Long totalList = userDao.getUserEntityCountsByConditions(pager.getCondition());
    	List<UserVo> userVoList = new ArrayList<UserVo>();
    	for(UserEntity entity : userEntityList){
    		userVoList.add(this.entity2vo(entity));
    	}
    	pager.setData(userVoList);
    	pager.setRecordsTotal(totalList.intValue());
		return pager;
    }
            
     @Override
     public Long addUserVo(UserVo userVo) {
     	
		return userDao.insert(this.vo2entity(userVo));
     }
     
     @Override
     public Integer updateUserVo(UserVo userVo) {
		return userDao.update(this.vo2entity(userVo));
     }
     
     @Override
     public Integer deleteUserVo(String id) {
		return userDao.delete(id);
     }
     
     private UserVo entity2vo(UserEntity userEntity){
     	//TODO 此处需要将entity转换成VO
     	if(userEntity == null){
     		return null;
     	}
     	UserVo userVo = new UserVo();
     	BeanUtils.copyProperties(userEntity, userVo);
     	return userVo;
     }
     
     private UserEntity vo2entity(UserVo userVo){
     	//TODO 此处需要将VO转换成entity
     	if(userVo == null){
     		return null;
     	}
     	UserEntity userEntity = new UserEntity();
     	BeanUtils.copyProperties(userVo, userEntity);
     	return userEntity;
     }
}
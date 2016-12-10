package com.oil.av.service.impl.platform.member;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import com.oil.av.dao.platform.member.MemberBusinessDao;
import com.oil.av.entity.platform.member.MemberBusinessEntity;
import com.oil.av.service.platform.member.MemberBusinessService;
import com.oil.av.vo.platform.member.MemberBusinessVo;
import com.oil.framework.common.page.Pagination;

@Service
public class MemberBusinessServiceImpl implements MemberBusinessService {
	
	@Resource
	private MemberBusinessDao memberBusinessDao;
    
    @Override
    public MemberBusinessVo getMemberBusinessVoById(String id) {
    	return this.entity2vo(memberBusinessDao.get(id));
    }

    @Override
    public List<MemberBusinessVo> getAll(){
    	List<MemberBusinessEntity> memberBusinessEntityList = memberBusinessDao.getAll();
    	List<MemberBusinessVo> memberBusinessVoList = new ArrayList<MemberBusinessVo>();
    	for(MemberBusinessEntity entity : memberBusinessEntityList){
    		memberBusinessVoList.add(this.entity2vo(entity));
    	}
		return memberBusinessVoList;
    }

    @Override
    public Pagination<Map<String, Object>> getMemberBusinessVoListByConditions(Pagination<Map<String, Object>> pager) {
		List<MemberBusinessEntity> memberBusinessEntityList = memberBusinessDao.getMemberBusinessEntityListByConditions(pager, pager.getCondition());
		Long totalList = memberBusinessDao.getMemberBusinessEntityCountsByConditions(pager.getCondition());
    	List<MemberBusinessVo> memberBusinessVoList = new ArrayList<MemberBusinessVo>();
    	for(MemberBusinessEntity entity : memberBusinessEntityList){
    		memberBusinessVoList.add(this.entity2vo(entity));
    	}
    	pager.setData(memberBusinessVoList);
    	pager.setRecordsTotal(totalList.intValue());
		return pager;
    }
            
     @Override
     public Long addMemberBusinessVo(MemberBusinessVo memberBusinessVo) {
     	
		return memberBusinessDao.insert(this.vo2entity(memberBusinessVo));
     }
     
     @Override
     public Integer updateMemberBusinessVo(MemberBusinessVo memberBusinessVo) {
		return memberBusinessDao.update(this.vo2entity(memberBusinessVo));
     }
     
     @Override
     public Integer deleteMemberBusinessVo(String id) {
		return memberBusinessDao.delete(id);
     }
     
     private MemberBusinessVo entity2vo(MemberBusinessEntity memberBusinessEntity){
     	//TODO 此处需要将entity转换成VO
     	if(memberBusinessEntity == null){
     		return null;
     	}
     	MemberBusinessVo memberBusinessVo = new MemberBusinessVo();
     	BeanUtils.copyProperties(memberBusinessEntity, memberBusinessVo);
     	return memberBusinessVo;
     }
     
     private MemberBusinessEntity vo2entity(MemberBusinessVo memberBusinessVo){
     	//TODO 此处需要将VO转换成entity
     	if(memberBusinessVo == null){
     		return null;
     	}
     	MemberBusinessEntity memberBusinessEntity = new MemberBusinessEntity();
     	BeanUtils.copyProperties(memberBusinessVo, memberBusinessEntity);
     	return memberBusinessEntity;
     }
}
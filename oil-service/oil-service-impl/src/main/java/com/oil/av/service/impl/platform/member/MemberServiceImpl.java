package com.oil.av.service.impl.platform.member;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import com.oil.av.dao.platform.member.MemberDao;
import com.oil.av.entity.platform.member.MemberEntity;
import com.oil.av.service.platform.member.MemberService;
import com.oil.av.vo.platform.member.MemberVo;
import com.oil.framework.common.page.Pagination;

@Service
public class MemberServiceImpl implements MemberService {
	
	@Resource
	private MemberDao memberDao;
    
    @Override
    public MemberVo getMemberVoById(String id) {
    	return this.entity2vo(memberDao.get(id));
    }

    @Override
    public List<MemberVo> getAll(){
    	List<MemberEntity> memberEntityList = memberDao.getAll();
    	List<MemberVo> memberVoList = new ArrayList<MemberVo>();
    	for(MemberEntity entity : memberEntityList){
    		memberVoList.add(this.entity2vo(entity));
    	}
		return memberVoList;
    }

    @Override
    public Pagination<Map<String, Object>> getMemberVoListByConditions(Pagination<Map<String, Object>> pager) {
		List<MemberEntity> memberEntityList = memberDao.getMemberEntityListByConditions(pager, pager.getCondition());
		Long totalList = memberDao.getMemberEntityCountsByConditions(pager.getCondition());
    	List<MemberVo> memberVoList = new ArrayList<MemberVo>();
    	for(MemberEntity entity : memberEntityList){
    		memberVoList.add(this.entity2vo(entity));
    	}
    	pager.setData(memberVoList);
    	pager.setRecordsTotal(totalList.intValue());
		return pager;
    }
            
     @Override
     public Long addMemberVo(MemberVo memberVo) {
     	
		return memberDao.insert(this.vo2entity(memberVo));
     }
     
     @Override
     public Integer updateMemberVo(MemberVo memberVo) {
		return memberDao.update(this.vo2entity(memberVo));
     }
     
     @Override
     public Integer deleteMemberVo(String id) {
		return memberDao.delete(id);
     }
     
     private MemberVo entity2vo(MemberEntity memberEntity){
     	//TODO 此处需要将entity转换成VO
     	if(memberEntity == null){
     		return null;
     	}
     	MemberVo memberVo = new MemberVo();
     	BeanUtils.copyProperties(memberEntity, memberVo);
     	return memberVo;
     }
     
     private MemberEntity vo2entity(MemberVo memberVo){
     	//TODO 此处需要将VO转换成entity
     	if(memberVo == null){
     		return null;
     	}
     	MemberEntity memberEntity = new MemberEntity();
     	BeanUtils.copyProperties(memberVo, memberEntity);
     	return memberEntity;
     }
     
	@Override
	public List<MemberVo> getByPhone(String tel) {
		List<MemberEntity> memberEntityList = memberDao.getByPhone(tel);
    	List<MemberVo> memberVoList = new ArrayList<MemberVo>();
    	for(MemberEntity entity : memberEntityList){
    		memberVoList.add(this.entity2vo(entity));
    	}
		return memberVoList;
	}

	@Override
	public String getSerialById(String userId) {
		return memberDao.getSerialById(userId);
	}
	
}
package com.oil.av.service.impl.platform.config;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import com.oil.av.dao.platform.config.ProductParameterValueDao;
import com.oil.av.entity.platform.config.ProductParameterValueEntity;
import com.oil.av.service.platform.config.ProductParameterValueService;
import com.oil.av.vo.platform.config.ProductParameterValueVo;
import com.oil.framework.common.page.Pagination;

@Service
public class ProductParameterValueServiceImpl implements ProductParameterValueService {
	
	@Resource
	private ProductParameterValueDao productParameterValueDao;
    
    @Override
    public ProductParameterValueVo getProductParameterValueVoById(String id) {
    	return this.entity2vo(productParameterValueDao.get(id));
    }

    @Override
    public List<ProductParameterValueVo> getAll(){
    	List<ProductParameterValueEntity> productParameterValueEntityList = productParameterValueDao.getAll();
    	List<ProductParameterValueVo> productParameterValueVoList = new ArrayList<ProductParameterValueVo>();
    	for(ProductParameterValueEntity entity : productParameterValueEntityList){
    		productParameterValueVoList.add(this.entity2vo(entity));
    	}
		return productParameterValueVoList;
    }

    @Override
    public Pagination<Map<String, Object>> getProductParameterValueVoListByConditions(Pagination<Map<String, Object>> pager) {
		List<ProductParameterValueEntity> productParameterValueEntityList = productParameterValueDao.getProductParameterValueEntityListByConditions(pager, pager.getCondition());
		Long totalList = productParameterValueDao.getProductParameterValueEntityCountsByConditions(pager.getCondition());
    	List<ProductParameterValueVo> productParameterValueVoList = new ArrayList<ProductParameterValueVo>();
    	for(ProductParameterValueEntity entity : productParameterValueEntityList){
    		productParameterValueVoList.add(this.entity2vo(entity));
    	}
    	pager.setData(productParameterValueVoList);
    	pager.setRecordsTotal(totalList.intValue());
		return pager;
    }
            
     @Override
     public Long addProductParameterValueVo(ProductParameterValueVo productParameterValueVo) {
     	
		return productParameterValueDao.insert(this.vo2entity(productParameterValueVo));
     }
     
     @Override
     public Integer updateProductParameterValueVo(ProductParameterValueVo productParameterValueVo) {
		return productParameterValueDao.update(this.vo2entity(productParameterValueVo));
     }
     
     @Override
     public Integer deleteProductParameterValueVo(String id) {
		return productParameterValueDao.delete(id);
     }
     
     private ProductParameterValueVo entity2vo(ProductParameterValueEntity productParameterValueEntity){
     	//TODO 此处需要将entity转换成VO
     	if(productParameterValueEntity == null){
     		return null;
     	}
     	ProductParameterValueVo productParameterValueVo = new ProductParameterValueVo();
     	BeanUtils.copyProperties(productParameterValueEntity, productParameterValueVo);
     	return productParameterValueVo;
     }
     
     private ProductParameterValueEntity vo2entity(ProductParameterValueVo productParameterValueVo){
     	//TODO 此处需要将VO转换成entity
     	if(productParameterValueVo == null){
     		return null;
     	}
     	ProductParameterValueEntity productParameterValueEntity = new ProductParameterValueEntity();
     	BeanUtils.copyProperties(productParameterValueVo, productParameterValueEntity);
     	return productParameterValueEntity;
     }
}
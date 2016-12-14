package com.oil.av.service.impl.platform.config;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import com.oil.av.dao.platform.config.ProductParameterDao;
import com.oil.av.entity.platform.config.ProductParameterEntity;
import com.oil.av.service.platform.config.ProductParameterService;
import com.oil.av.vo.platform.config.ProductParameterVo;
import com.oil.framework.common.page.Pagination;

@Service
public class ProductParameterServiceImpl implements ProductParameterService {
	
	@Resource
	private ProductParameterDao productParameterDao;
    
    @Override
    public ProductParameterVo getProductParameterVoById(String id) {
    	return this.entity2vo(productParameterDao.get(id));
    }

    @Override
    public List<ProductParameterVo> getAll(){
    	List<ProductParameterEntity> productParameterEntityList = productParameterDao.getAll();
    	List<ProductParameterVo> productParameterVoList = new ArrayList<ProductParameterVo>();
    	for(ProductParameterEntity entity : productParameterEntityList){
    		productParameterVoList.add(this.entity2vo(entity));
    	}
		return productParameterVoList;
    }

    @Override
    public Pagination<Map<String, Object>> getProductParameterVoListByConditions(Pagination<Map<String, Object>> pager) {
		List<ProductParameterEntity> productParameterEntityList = productParameterDao.getProductParameterEntityListByConditions(pager, pager.getCondition());
		Long totalList = productParameterDao.getProductParameterEntityCountsByConditions(pager.getCondition());
    	List<ProductParameterVo> productParameterVoList = new ArrayList<ProductParameterVo>();
    	for(ProductParameterEntity entity : productParameterEntityList){
    		productParameterVoList.add(this.entity2vo(entity));
    	}
    	pager.setData(productParameterVoList);
    	pager.setRecordsTotal(totalList.intValue());
		return pager;
    }
            
     @Override
     public Long addProductParameterVo(ProductParameterVo productParameterVo) {
     	
		return productParameterDao.insert(this.vo2entity(productParameterVo));
     }
     
     @Override
     public Integer updateProductParameterVo(ProductParameterVo productParameterVo) {
		return productParameterDao.update(this.vo2entity(productParameterVo));
     }
     
     @Override
     public Integer deleteProductParameterVo(String id) {
		return productParameterDao.delete(id);
     }
     
     private ProductParameterVo entity2vo(ProductParameterEntity productParameterEntity){
     	//TODO 此处需要将entity转换成VO
     	if(productParameterEntity == null){
     		return null;
     	}
     	ProductParameterVo productParameterVo = new ProductParameterVo();
     	BeanUtils.copyProperties(productParameterEntity, productParameterVo);
     	return productParameterVo;
     }
     
     private ProductParameterEntity vo2entity(ProductParameterVo productParameterVo){
     	//TODO 此处需要将VO转换成entity
     	if(productParameterVo == null){
     		return null;
     	}
     	ProductParameterEntity productParameterEntity = new ProductParameterEntity();
     	BeanUtils.copyProperties(productParameterVo, productParameterEntity);
     	return productParameterEntity;
     }
}
package com.oil.av.service.impl.platform.config;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import com.oil.av.dao.platform.config.ProductCategoryDao;
import com.oil.av.entity.platform.config.ProductCategoryEntity;
import com.oil.av.service.platform.config.ProductCategoryService;
import com.oil.av.vo.platform.config.ProductCategoryVo;
import com.oil.framework.common.page.Pagination;

@Service
public class ProductCategoryServiceImpl implements ProductCategoryService {
	
	@Resource
	private ProductCategoryDao productCategoryDao;
    
    @Override
    public ProductCategoryVo getProductCategoryVoById(String id) {
    	return this.entity2vo(productCategoryDao.get(id));
    }

    @Override
    public List<ProductCategoryVo> getAll(){
    	List<ProductCategoryEntity> productCategoryEntityList = productCategoryDao.getAll();
    	List<ProductCategoryVo> productCategoryVoList = new ArrayList<ProductCategoryVo>();
    	for(ProductCategoryEntity entity : productCategoryEntityList){
    		productCategoryVoList.add(this.entity2vo(entity));
    	}
		return productCategoryVoList;
    }

    @Override
    public Pagination<Map<String, Object>> getProductCategoryVoListByConditions(Pagination<Map<String, Object>> pager) {
		List<ProductCategoryEntity> productCategoryEntityList = productCategoryDao.getProductCategoryEntityListByConditions(pager, pager.getCondition());
		Long totalList = productCategoryDao.getProductCategoryEntityCountsByConditions(pager.getCondition());
    	List<ProductCategoryVo> productCategoryVoList = new ArrayList<ProductCategoryVo>();
    	for(ProductCategoryEntity entity : productCategoryEntityList){
    		productCategoryVoList.add(this.entity2vo(entity));
    	}
    	pager.setData(productCategoryVoList);
    	pager.setRecordsTotal(totalList.intValue());
		return pager;
    }
            
     @Override
     public Long addProductCategoryVo(ProductCategoryVo productCategoryVo) {
     	
		return productCategoryDao.insert(this.vo2entity(productCategoryVo));
     }
     
     @Override
     public Integer updateProductCategoryVo(ProductCategoryVo productCategoryVo) {
		return productCategoryDao.update(this.vo2entity(productCategoryVo));
     }
     
     @Override
     public Integer deleteProductCategoryVo(String id) {
		return productCategoryDao.delete(id);
     }
     
     private ProductCategoryVo entity2vo(ProductCategoryEntity productCategoryEntity){
     	//TODO 此处需要将entity转换成VO
     	if(productCategoryEntity == null){
     		return null;
     	}
     	ProductCategoryVo productCategoryVo = new ProductCategoryVo();
     	BeanUtils.copyProperties(productCategoryEntity, productCategoryVo);
     	return productCategoryVo;
     }
     
     private ProductCategoryEntity vo2entity(ProductCategoryVo productCategoryVo){
     	//TODO 此处需要将VO转换成entity
     	if(productCategoryVo == null){
     		return null;
     	}
     	ProductCategoryEntity productCategoryEntity = new ProductCategoryEntity();
     	BeanUtils.copyProperties(productCategoryVo, productCategoryEntity);
     	return productCategoryEntity;
     }

	@Override
	public List<ProductCategoryVo> getListByConditions(Map<String, Object> paramMap) {
		List<ProductCategoryEntity> productCategoryEntityList = productCategoryDao.getListByConditions(paramMap);
    	List<ProductCategoryVo> productCategoryVoList = new ArrayList<ProductCategoryVo>();
    	for(ProductCategoryEntity entity : productCategoryEntityList){
    		productCategoryVoList.add(this.entity2vo(entity));
    	}
		return productCategoryVoList;
	}
}
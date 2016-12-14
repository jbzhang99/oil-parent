package com.oil.av.service.impl.platform.config;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import com.oil.av.dao.platform.config.ProductDao;
import com.oil.av.entity.platform.config.ProductEntity;
import com.oil.av.service.platform.config.ProductService;
import com.oil.av.vo.platform.config.ProductVo;
import com.oil.framework.common.page.Pagination;

@Service
public class ProductServiceImpl implements ProductService {
	
	@Resource
	private ProductDao productDao;
    
    @Override
    public ProductVo getProductVoById(String id) {
    	return this.entity2vo(productDao.get(id));
    }

    @Override
    public List<ProductVo> getAll(){
    	List<ProductEntity> productEntityList = productDao.getAll();
    	List<ProductVo> productVoList = new ArrayList<ProductVo>();
    	for(ProductEntity entity : productEntityList){
    		productVoList.add(this.entity2vo(entity));
    	}
		return productVoList;
    }

    @Override
    public Pagination<Map<String, Object>> getProductVoListByConditions(Pagination<Map<String, Object>> pager) {
		List<ProductEntity> productEntityList = productDao.getProductEntityListByConditions(pager, pager.getCondition());
		Long totalList = productDao.getProductEntityCountsByConditions(pager.getCondition());
    	List<ProductVo> productVoList = new ArrayList<ProductVo>();
    	for(ProductEntity entity : productEntityList){
    		productVoList.add(this.entity2vo(entity));
    	}
    	pager.setData(productVoList);
    	pager.setRecordsTotal(totalList.intValue());
		return pager;
    }
            
     @Override
     public Long addProductVo(ProductVo productVo) {
     	
		return productDao.insert(this.vo2entity(productVo));
     }
     
     @Override
     public Integer updateProductVo(ProductVo productVo) {
		return productDao.update(this.vo2entity(productVo));
     }
     
     @Override
     public Integer deleteProductVo(String id) {
		return productDao.delete(id);
     }
     
     private ProductVo entity2vo(ProductEntity productEntity){
     	//TODO 此处需要将entity转换成VO
     	if(productEntity == null){
     		return null;
     	}
     	ProductVo productVo = new ProductVo();
     	BeanUtils.copyProperties(productEntity, productVo);
     	return productVo;
     }
     
     private ProductEntity vo2entity(ProductVo productVo){
     	//TODO 此处需要将VO转换成entity
     	if(productVo == null){
     		return null;
     	}
     	ProductEntity productEntity = new ProductEntity();
     	BeanUtils.copyProperties(productVo, productEntity);
     	return productEntity;
     }
}
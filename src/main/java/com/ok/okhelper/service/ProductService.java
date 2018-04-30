package com.ok.okhelper.service;

import com.ok.okhelper.common.PageModel;
import com.ok.okhelper.pojo.dto.ProductCondition;
import com.ok.okhelper.pojo.dto.ProductDto;
import com.ok.okhelper.pojo.po.Product;
import com.ok.okhelper.pojo.vo.ProductsVo;

/*
*Author:zhangxin_an
*Description:
*Data:Created in 14:48 2018/4/30
*/
public interface ProductService {
	
	PageModel<ProductsVo> getProductsList(ProductCondition condition, PageModel pageModel);
	
	Product getProduct(Long pId);
	
	void deleteProduct(Long pId);
	
	void addProduct(ProductDto productDto);
	
	void updateProduct(ProductDto productDto);
	
}

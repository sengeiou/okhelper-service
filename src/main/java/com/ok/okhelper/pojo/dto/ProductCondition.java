package com.ok.okhelper.pojo.dto;

import lombok.Data;

/*
*Author:zhangxin_an
*Description:查询产品条件和排序
*Data:Created in 15:19 2018/4/30
*/
@Data
public class ProductCondition {
	
	private String condition;
	private String orderBy;

//	/**
//	 * 商品名
//	 */
//	@ApiModelProperty(value = "商品名")
//	private String productName;
//
//	/**
//	 * 商品标题
//	 */
//	@ApiModelProperty(value = "商品标题")
//	private String productTitle;
//
//
//
//	/**
//	 * 类别名
//	 */
//	@ApiModelProperty(value = "类别名")
//	private Long categoryId;
//	/**
//	 * 货号
//	 */
//	@ApiModelProperty(value = "货号")
//	private String articleNumber;
//
//	/**
//	 * 条码
//	 */
//	@ApiModelProperty(value = "条码")
//	private String barCode;
}

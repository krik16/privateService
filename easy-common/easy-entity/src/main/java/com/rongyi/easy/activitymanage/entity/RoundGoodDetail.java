package com.rongyi.easy.activitymanage.entity;

import java.io.Serializable;

public class RoundGoodDetail extends RoundGood implements Serializable{
	
	private String GoodShopName;
	
	private String GoodName;
	
	/***
	 * 商品分类
	 */
	private String GoodCatName;
	
	/***
	 * 商品现价
	 */
	private String GoodPrice;
	
	/***
	 * 商品提报库存
	 */
	private int  activityTotalCount;
	
	/***
	 * 商品剩余库存
	 */
	private int  activityRemainCount;
	
}

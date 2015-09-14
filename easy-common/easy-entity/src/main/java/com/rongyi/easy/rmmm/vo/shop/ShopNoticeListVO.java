package com.rongyi.easy.rmmm.vo.shop;

import java.io.Serializable;
import java.util.List;

import com.rongyi.easy.rmmm.vo.PageVO;
/*
 * Copyright (C),上海容易网电子商务有限公司
 * Author:  张争平
 * Description:  店铺公告列表返回list
 * time:  2015/9/7
 * History: 变更记录
 * <author>           <time>             <version>        <desc>
 *   张争平                             2015/9/7              1.0            创建文件
 *
 */
public class ShopNoticeListVO extends PageVO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<ShopNoticeVO> shopNoticeVOList;//店铺公告信息列表
	
	public List<ShopNoticeVO> getShopNoticeVOList() {
		return shopNoticeVOList;
	}
	public void setShopNoticeVOList(List<ShopNoticeVO> shopNoticeVOList) {
		this.shopNoticeVOList = shopNoticeVOList;
	}
	
}

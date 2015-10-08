package com.rongyi.easy.malllife.vo;

import java.io.Serializable;
import java.util.List;

import com.rongyi.easy.rmmm.vo.PageVO;


public class APPShopNoticeListVO extends PageVO implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<APPShopNoticeVO> appShopNoticeList;//店铺公告信息列表
	
	public List<APPShopNoticeVO> getAppShopNoticeList() {
		return appShopNoticeList;
	}
	public void setAppShopNoticeList(List<APPShopNoticeVO> appShopNoticeList) {
		this.appShopNoticeList = appShopNoticeList;
	}
	
}

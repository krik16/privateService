package com.rongyi.easy.shop.vo;

import java.util.List;
/**
 * 店铺列表返回数据
 * @author wzh
 *
 */
public class ShopVOList {
	
	private List<ShopVO> shopVOs;
	
	private Long processedNum;//待处理
	
	private Long normalNum;//正常营业
	
	private Long waitingNum;//待营业
	
	private Long suspendedNum;//暂停营业
	
	private Long businessNum;//正常数量
	
	private Long shelvesNum;//下架数量
	
	public List<ShopVO> getShopVOs() {
		return shopVOs;
	}

	public void setShopVOs(List<ShopVO> shopVOs) {
		this.shopVOs = shopVOs;
	}

	public Long getProcessedNum() {
		return processedNum;
	}

	public void setProcessedNum(Long processedNum) {
		this.processedNum = processedNum;
	}

	public Long getNormalNum() {
		return normalNum;
	}

	public void setNormalNum(Long normalNum) {
		this.normalNum = normalNum;
	}

	public Long getWaitingNum() {
		return waitingNum;
	}

	public void setWaitingNum(Long waitingNum) {
		this.waitingNum = waitingNum;
	}

	public Long getSuspendedNum() {
		return suspendedNum;
	}

	public void setSuspendedNum(Long suspendedNum) {
		this.suspendedNum = suspendedNum;
	}

	public Long getBusinessNum() {
		return businessNum;
	}

	public void setBusinessNum(Long businessNum) {
		this.businessNum = businessNum;
	}

	public Long getShelvesNum() {
		return shelvesNum;
	}

	public void setShelvesNum(Long shelvesNum) {
		this.shelvesNum = shelvesNum;
	}
	
	
}

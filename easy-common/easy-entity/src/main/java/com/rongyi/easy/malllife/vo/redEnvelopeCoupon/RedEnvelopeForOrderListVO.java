package com.rongyi.easy.malllife.vo.redEnvelopeCoupon;

import java.io.Serializable;
import java.util.List;
/**
 * 订单可使用与不可使用的红包列表
 * @author zhangzhengping
 *
 */
public class RedEnvelopeForOrderListVO implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private List<RedEnvelopeForOrderVO>  canUsedRedList;//订单可使用的红包列表
	
	private List<RedEnvelopeForOrderVO>  notUsedRedList;//订单不可使用的红包列表

	public List<RedEnvelopeForOrderVO> getCanUsedRedList() {
		return canUsedRedList;
	}

	public void setCanUsedRedList(List<RedEnvelopeForOrderVO> canUsedRedList) {
		this.canUsedRedList = canUsedRedList;
	}

	public List<RedEnvelopeForOrderVO> getNotUsedRedList() {
		return notUsedRedList;
	}

	public void setNotUsedRedList(List<RedEnvelopeForOrderVO> notUsedRedList) {
		this.notUsedRedList = notUsedRedList;
	}
	
}

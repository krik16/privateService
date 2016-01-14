package com.rongyi.easy.redi.param;

import java.io.Serializable;

/**
 * 
 * @author rongyi
 */
public class BailianGoodsPriceOptionParam implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String goodsSid;// String 商品id
	private String channelSid;// String 渠道id
	
	
	public String getGoodsSid() {
		return goodsSid;
	}
	public void setGoodsSid(String goodsSid) {
		this.goodsSid = goodsSid;
	}
	public String getChannelSid() {
		return channelSid;
	}
	public void setChannelSid(String channelSid) {
		this.channelSid = channelSid;
	}

	
}

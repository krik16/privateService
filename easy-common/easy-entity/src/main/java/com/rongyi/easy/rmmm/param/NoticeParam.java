package com.rongyi.easy.rmmm.param;

import java.io.Serializable;

/**
 * 公告参数
 * @author chenjun
 *
 */
public class NoticeParam implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/** 公告内容 */
	private String content;

	/** 关联店铺id */
	private String shopId;

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getShopId() {
		return shopId;
	}

	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

}

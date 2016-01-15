package com.rongyi.easy.ryoms.callcenter.param;

import java.io.Serializable;

import com.rongyi.easy.ryoms.callcenter.entity.OrderEntity;

/**
 * 客服工单新增/修改 参数
 * 
 * @author wangjianhua
 *
 */
public class OrderSaveParam extends OrderEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5318884313259020240L;

	@Override
	public String toString() {
		return "OrderSaveParam [content=" + content + ", toString()=" + super.toString() + "]";
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	// 内容
	private String content = "";
}

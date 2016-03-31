package com.rongyi.easy.rmmm.param;

import java.io.Serializable;

public class AfterSaleParam implements Serializable {


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String refundId;// 售后ID
	private String refundPicLic; // 售后要上传的图片凭证url
	private String expressId;// 物流公司id
	private String expressBillId;// 物流单号id
	private String expressName;// 物流公司名称
	private String orderNum;// 子订单id

	public String getRefundId() {
		return refundId;
	}

	public void setRefundId(String refundId) {
		this.refundId = refundId;
	}

	public String getRefundPicLic() {
		return refundPicLic;
	}

	public void setRefundPicLic(String refundPicLic) {
		this.refundPicLic = refundPicLic;
	}

	public String getExpressBillId() {
		return expressBillId;
	}

	public void setExpressBillId(String expressBillId) {
		this.expressBillId = expressBillId;
	}

	public String getExpressName() {
		return expressName;
	}

	public void setExpressName(String expressName) {
		this.expressName = expressName;
	}

	public String getExpressId() {
		return expressId;
	}

	public void setExpressId(String expressId) {
		this.expressId = expressId;
	}
	public String getOrderNum() {
		return orderNum;
	}

	public void setOrderNum(String orderNum) {
		this.orderNum = orderNum;
	}
}

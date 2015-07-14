package com.rongyi.osm.knowledge;

import java.math.BigDecimal;

import net.sf.json.JSONObject;

public class OrderPriceChangeEvent extends UserEvent {
	/**  */
	private static final long serialVersionUID = 4405898581576281302L;
	
	private BigDecimal discount;//要减去的价格
	private BigDecimal postage;//运费
	
	public void load(JSONObject json) throws Exception {
		// 调用父类分析函数
		super.load(json);
				
		JSONObject param = getBody();
		
		setDisconntFee(new BigDecimal(param.get("discount").toString()));
		setExpressFee(new BigDecimal(param.get("postage").toString()));
	}
	
	@Override
	public String getName() {
		return "卖家修改价格";
	}

	public BigDecimal getDisconntFee() {
		return discount;
	}

	public void setDisconntFee(BigDecimal discount) {
		this.discount = discount;
	}

	public BigDecimal getExpressFee() {
		return postage;
	}

	public void setExpressFee(BigDecimal postage) {
		this.postage = postage;
	}
	

}

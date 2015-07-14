/** 
* @Title: OrderPriceChangeC2CEvent.java 
* @Package com.rongyi.osm.knowledge 
* @Description: TODO
* @author 郑亦梁  zhengyiliang@rongyi.com
* @date 2015年5月21日 下午7:15:06 
* @version V1.0   
* Copyright (C),上海容易网电子商务有限公司
*/
package com.rongyi.osm.knowledge;

import java.math.BigDecimal;

import net.sf.json.JSONObject;

/**
 * @author ZhengYl
 *
 */
public class OrderPriceResetEvent extends UserEvent {
	private static final long serialVersionUID = -3107656524101208105L;
	
	/** 卖家设定的新价格 */
	private BigDecimal orderPrice;
	
	/** 运费 */
	private BigDecimal postage;
	
	public void load(JSONObject json) throws Exception {
		// 调用父类分析函数
		super.load(json);
				
		JSONObject param = getBody();
		
		setOrderPrice(new BigDecimal(param.get("orderPrice").toString()));
		setExpressFee(new BigDecimal(param.get("postage").toString()));
	}
	
	@Override
	public String getName() {
		return "卖家修改价格(C2C)";
	}

	public BigDecimal getOrderPrice() {
		return orderPrice;
	}

	public void setOrderPrice(BigDecimal orderPrice) {
		this.orderPrice = orderPrice;
	}

	public BigDecimal getExpressFee() {
		return postage;
	}

	public void setExpressFee(BigDecimal postage) {
		this.postage = postage;
	}
}

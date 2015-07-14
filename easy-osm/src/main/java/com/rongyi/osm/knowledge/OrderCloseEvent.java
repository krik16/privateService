/** 
 * @Title: OrderCloseEvent.java 
 * @Package com.rongyi.osm.knowledge 
 * @Description: 订单关闭事件
 * @author 郑亦梁  zhengyiliang@rongyi.com
 * @date 2015年6月9日 下午7:06:24 
 * @version V1.0   
 * Copyright (C),上海容易网电子商务有限公司
 */
package com.rongyi.osm.knowledge;

import net.sf.json.JSONObject;

/**
 * @author ZhengYl
 * 
 */
public class OrderCloseEvent extends UserEvent {
	private static final long serialVersionUID = -3107656524101208105L;
	
	private String defaultComm;
	
	@Override
	public String getName() {
		return "订单关闭";
	}

	public String getDefaultComm() {
		return defaultComm;
	}

	public void setDefaultComm(String defaultComm) {
		this.defaultComm = defaultComm;
	}
	
	@Override
	public void updateBody() {
		super.updateBody();
		
		JSONObject param = getBody();
		
		if (defaultComm != null) {
			param.put("defaultComm", getDefaultComm());
		}
	}
}

package com.rongyi.easy.malllife.param;

import java.io.Serializable;
/**
 * 订单模板详情页修改导购参数
 * @author user
 *
 */
public class ChangeGuideInfoParam extends MalllifeBaseParam implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String userId;//导购id
	private String modelId;//订单模板id
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getModelId() {
		return modelId;
	}
	public void setModelId(String modelId) {
		this.modelId = modelId;
	}
	
}

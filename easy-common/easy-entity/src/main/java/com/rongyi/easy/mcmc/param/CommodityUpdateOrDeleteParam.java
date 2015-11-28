/**   
* @Title: CommodityUpdateOrDeleteParam.java 
* @Package com.rongyi.easy.mcmc.param 
* @Description: TODO(用一句话描述该文件做什么) 
* @author wzh   
* @date 2015年9月23日 下午5:43:56 
* @version V1.0   
*/
package com.rongyi.easy.mcmc.param;

import java.util.List;

/** 
 * @ClassName: CommodityUpdateOrDeleteParam 
 * @Description: 商品下架或者删除参数
 * @author wzh
 * @date 2015年9月23日 下午5:43:56 
 *  
 */
public class CommodityUpdateOrDeleteParam {
	
	private List<String> commodityIds;//商品id
	
	private int type=1;//type=0 下架 type=1 删除
	
	private String reason="";//原因

	

	public List<String> getCommodityIds() {
		return commodityIds;
	}

	public void setCommodityIds(List<String> commodityIds) {
		this.commodityIds = commodityIds;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}
	
	
}	

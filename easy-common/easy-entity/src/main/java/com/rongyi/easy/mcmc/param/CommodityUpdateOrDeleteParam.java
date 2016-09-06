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

   private List<CommodityUpdateOrdeteleParamOperate>  commodityUpdateOrdeteleParamOperates;//批量的商品集合

	private Integer type;//type=0 下架 type=1 删除




	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}


	public List<CommodityUpdateOrdeteleParamOperate> getCommodityUpdateOrdeteleParamOperates() {
		return commodityUpdateOrdeteleParamOperates;
	}

	public void setCommodityUpdateOrdeteleParamOperates(List<CommodityUpdateOrdeteleParamOperate> commodityUpdateOrdeteleParamOperates) {
		this.commodityUpdateOrdeteleParamOperates = commodityUpdateOrdeteleParamOperates;
	}
}

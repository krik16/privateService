/** 
* @Title: ShopRetrivalResult.java 
* @Package com.rongyi.easy.solr.retrival.result 
* @Description: TODO
* @author 郑亦梁  zhengyiliang@rongyi.com
* @date 2015年8月19日 上午11:20:54 
* @version V1.0   
* Copyright (C),上海容易网电子商务有限公司
*/
package com.rongyi.easy.solr.retrival.result;

import java.io.Serializable;
import java.util.List;

import com.rongyi.easy.solr.retrival.PoiShopData;

/**
 * @author ZhengYl
 *
 */
public class ShopRetrivalResult implements Serializable {
	/**  */
	private static final long serialVersionUID = -6823770200403884590L;

	private List<PoiShopData> result;
	private Info info;

	public List<PoiShopData> getResult() {
		return result;
	}

	public Info getMeta() {
		return info;
	}

	public void setMeta(Info info) {
		this.info = info;
	}

	public void setResult(List<PoiShopData> res) {
		this.result = res;

		info = new Info();
		info.setHitCount(res.size());
		info.setStatus(0);

		if (result.size() > 0) {
			info.setMsg("success");
		} else {
			info.setMsg("failure");
		}
	}
}

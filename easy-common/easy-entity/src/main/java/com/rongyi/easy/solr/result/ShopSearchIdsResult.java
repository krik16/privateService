/** 
* @Title: ShopSearchIdsResult.java 
* @Package com.rongyi.easy.solr.result 
* @Description: TODO
* @author 郑亦梁  zhengyiliang@rongyi.com
* @date 2015年10月17日 下午3:37:18 
* @version V1.0   
* Copyright (C),上海容易网电子商务有限公司
*/
package com.rongyi.easy.solr.result;

import java.io.Serializable;
import java.util.List;

/**
 * @author ZhengYl
 *
 */
public class ShopSearchIdsResult implements Serializable {
	/**  */
	private static final long serialVersionUID = 8838144400645479973L;
	
	private SearchMeta meta;
	private List<String> idList;

	public SearchMeta getMeta() {
		return meta;
	}

	public void setMeta(SearchMeta meta) {
		this.meta = meta;
	}

	public List<String> getResult() {
		return idList;
	}

	public void setResult(List<String> idList) {
		this.idList = idList;
	}

}

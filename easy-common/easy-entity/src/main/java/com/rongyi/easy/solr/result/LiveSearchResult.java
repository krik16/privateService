/** 
* @Title: LiveSearchResult.java 
* @Package com.rongyi.easy.solr.result 
* @Description: TODO
* @author 郑亦梁  zhengyiliang@rongyi.com
* @date 2015年10月21日 下午2:55:37 
* @version V1.0   
* Copyright (C),上海容易网电子商务有限公司
*/
package com.rongyi.easy.solr.result;

import java.io.Serializable;
import java.util.List;

import org.bson.types.ObjectId;

/**
 * @author ZhengYl
 *
 */
public class LiveSearchResult implements Serializable {

	/**  */
	private static final long serialVersionUID = 6451256584394219148L;
	
	/** 直播Id */
	private List<ObjectId> idList;
	
	private SearchMeta meta;

	public List<ObjectId> getIdList() {
		return idList;
	}

	public void setIdList(List<ObjectId> idList) {
		this.idList = idList;
	}

	public SearchMeta getMeta() {
		return meta;
	}

	public void setMeta(SearchMeta meta) {
		this.meta = meta;
	}
}

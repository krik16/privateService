/** 
* @Title: SolrBaseResult.java 
* @Package com.rongyi.easy.solr.retrival 
* @Description: TODO
* @author 郑亦梁  zhengyiliang@rongyi.com
* @date 2015年8月18日 下午5:40:02 
* @version V1.0   
* Copyright (C),上海容易网电子商务有限公司
*/
package com.rongyi.easy.solr.retrival;

import java.io.Serializable;

/**
 * @author ZhengYl
 *
 */
public class SolrBaseData implements Serializable {

	/**  */
	private static final long serialVersionUID = -5907993721486700054L;

	/**
	 * 数据条目ID信息
	 * 改动int->string
	 */
	public String id;

	/**
	 * 数据条目名称，默认为NULL
	 */
	public String name = null;

	/**
	 * 数据条目地址，默认为NULL
	 */
	public String addr = null;
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}
}

/**   
* @Title: CommodityCategoryParam.java 
* @Package com.rongyi.easy.mcmc.param 
* @Description: TODO(用一句话描述该文件做什么) 
* @author wzh   
* @date 2015年9月23日 下午5:16:41 
* @version V1.0   
*/
package com.rongyi.easy.mcmc.param;

import java.util.List;

/**
 * @ClassName: CommodityCategoryParam 
 * @Description: 查询商品分类参数
 * @author wzh
 * @date 2015年9月23日 下午5:16:41 
 *  
 */
public class CommodityCategoryParam {
	
	private String id;//父类id
	
	private Integer type;//分类级别

	private List<String> ids;//分类id集合

	private boolean popular=false;//是否是热门分类 true表示热门分类

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public List<String> getIds() {
		return ids;
	}

	public void setIds(List<String> ids) {
		this.ids = ids;
	}

	@Override
	public String toString() {
		return "CommodityCategoryParam{" +
				"id='" + id + '\'' +
				", type=" + type +
				", ids=" + ids +
				'}';
	}

	public boolean isPopular() {
		return popular;
	}

	public void setPopular(boolean popular) {
		this.popular = popular;
	}
}

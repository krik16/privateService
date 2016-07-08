/**   
* @Title: CommoditySpecColumnParam.java 
* @Package com.rongyi.easy.mcmc.param 
* @Description: TODO(用一句话描述该文件做什么) 
* @author wzh   
* @date 2015年9月23日 下午5:38:19 
* @version V1.0   
*/
package com.rongyi.easy.mcmc.param;

import java.io.Serializable;

import com.rongyi.easy.rmmm.base.BaseParam;

/** 
 * @ClassName: CommoditySpecColumnParam 
 * @Description: 根据商品分类查询该商品可以选的规格项参数
 * @author wzh
 * @date 2015年9月23日 下午5:38:19 
 *  
 */
public class CommoditySpecColumnParam extends BaseParam implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String categoryId;

	public String getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}
	
}

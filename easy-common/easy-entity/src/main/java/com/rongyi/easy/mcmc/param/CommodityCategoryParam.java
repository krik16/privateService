/**   
* @Title: CommodityCategoryParam.java 
* @Package com.rongyi.easy.mcmc.param 
* @Description: TODO(用一句话描述该文件做什么) 
* @author wzh   
* @date 2015年9月23日 下午5:16:41 
* @version V1.0   
*/
package com.rongyi.easy.mcmc.param;

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
	
	
}

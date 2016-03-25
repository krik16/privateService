/**   
* @Title: CommodityCategoryParam.java 
* @Package com.rongyi.easy.mcmc.param 
* @Description: 商品自定义类目
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
 */
public class CommodityCustomCategoryParam {
	
	private Integer id;//自定义分类id
	
	private int type;//0表示新增或者修改1 表示删除

	private String name;//分类名

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

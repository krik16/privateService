package com.rongyi.easy.malllife.vo;

import java.io.Serializable;
import java.util.List;
/**
 * 全部类目（推荐内容  商场/品牌/类目）
 * @author user
 *
 */
public class RecommendedVO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String id;//id (商场/品牌/类目对应的mongoId)
	private String name;//(商场/品牌/类目的名称)
	private String pic;//商场/品牌/类目对应的图片
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
	
	public String getPic() {
		return pic;
	}
	public void setPic(String pic) {
		this.pic = pic;
	}
	@Override
	public String toString() {
		return "RecommendedVO [id=" + id + ", name=" + name + ", pic=" + pic
				+ "]";
	}
	
}

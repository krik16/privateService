/**
 * 
 */
package com.rongyi.easy.shop.param;

/** 
 * @ClassName: BuildingParam 
 * @Description: TODO
 * @author wzh
 * @date 2015年11月9日 下午6:18:43 
 *  
 */
public class BuildingParam {
	
	private Integer type;//楼栋类型 0楼1栋2幢3座
	
	private String mallId;//商场id
	
	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public String getMallId() {
		return mallId;
	}

	public void setMallId(String mallId) {
		this.mallId = mallId;
	}
	
	
}

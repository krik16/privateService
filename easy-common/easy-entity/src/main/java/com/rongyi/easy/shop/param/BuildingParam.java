/**
 * 
 */
package com.rongyi.easy.shop.param;

/** 
 * @ClassName: BuildingParam 
 * @Description: 楼栋楼层查询参数
 * @author wzh
 * @date 2015年11月9日 下午6:18:43 
 *  
 */
public class BuildingParam {
	
	private Integer type;//楼栋类型 0楼1栋2幢3座
	
	private String mallId;//商场id
	
	private String buildingId;//楼栋id
	
	private String buildingName;//楼栋名
	
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

	public String getBuildingId() {
		return buildingId;
	}

	public void setBuildingId(String buildingId) {
		this.buildingId = buildingId;
	}

	public String getBuildingName() {
		return buildingName;
	}

	public void setBuildingName(String buildingName) {
		this.buildingName = buildingName;
	}
}

package com.rongyi.easy.shop.vo;

/**
 * 微信端查询楼层和铺位号参数类
 * 
 * @author wzh
 *
 */
public class FloorParamForWeChat {

	private String name;// 楼栋名
	private String floorId;// 楼层id
	private String mallId;// 商场id
	private Integer type;// 0表示查楼栋 1表示楼2表示查询铺位号

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFloorId() {
		return floorId;
	}

	public void setFloorId(String floorId) {
		this.floorId = floorId;
	}

	public String getMallId() {
		return mallId;
	}

	public void setMallId(String mallId) {
		this.mallId = mallId;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}
}

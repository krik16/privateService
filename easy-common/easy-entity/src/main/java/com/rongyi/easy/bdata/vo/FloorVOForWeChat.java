/**
 * 
 */
package com.rongyi.easy.bdata.vo;

import org.apache.commons.lang.StringUtils;

/**
 * @ClassName: FloorVOForWeChat
 * @Description: 微信端查询店铺时楼层铺位号列表返回类
 * @author wzh
 * @date 2015年10月29日 下午5:43:27
 * 
 */
public class FloorVOForWeChat implements Comparable<FloorVOForWeChat>{

	private String id;// 楼层id

	private String buildingName;// 楼栋名

	private String floorName;// 楼层名
	
	private String shopNumberName;// 铺位号

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getBuildingName() {
		return buildingName;
	}

	public void setBuildingName(String buildingName) {
		this.buildingName = buildingName;
	}

	public String getFloorName() {
		return floorName;
	}

	public void setFloorName(String floorName) {
		this.floorName = floorName;
	}

	public String getShopNumberName() {
		return shopNumberName;
	}

	public void setShopNumberName(String shopNumberName) {
		this.shopNumberName = shopNumberName;
	}

	@Override
	public int compareTo(FloorVOForWeChat o) {
		if(o==null)
			return -1;
		if(StringUtils.isNotBlank(this.getBuildingName())
				&&StringUtils.isNotBlank(o.getBuildingName()))
			return this.getBuildingName().compareTo(o.getBuildingName());
		if(StringUtils.isNotBlank(this.getFloorName())
				&&StringUtils.isNotBlank(o.getFloorName()))
			return this.getFloorName().compareTo(o.getFloorName());
		if(StringUtils.isNotBlank(this.getShopNumberName())
				&&StringUtils.isNotBlank(o.getShopNumberName()))
			return this.getShopNumberName().compareTo(o.getShopNumberName());
		return -1;
	}
}

package com.rongyi.easy.malllife.param.h5;

import java.io.Serializable;

import com.rongyi.easy.malllife.param.MalllifeBaseParam;
/**
 * H5商场分享详情参数
 * @author user
 *
 */
public class MallParam extends MalllifeBaseParam implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String mallId;//商场mongoId
	private Double coord_x;//经度
	private Double coord_y;//纬度
	public String getMallId() {
		return mallId;
	}
	public void setMallId(String mallId) {
		this.mallId = mallId;
	}
	public Double getCoord_x() {
		return coord_x;
	}
	public void setCoord_x(Double coord_x) {
		this.coord_x = coord_x;
	}
	public Double getCoord_y() {
		return coord_y;
	}
	public void setCoord_y(Double coord_y) {
		this.coord_y = coord_y;
	}
	@Override
	public String toString() {
		return "MallParam [mallId=" + mallId + ", coord_x=" + coord_x
				+ ", coord_y=" + coord_y + "]";
	}
	
}

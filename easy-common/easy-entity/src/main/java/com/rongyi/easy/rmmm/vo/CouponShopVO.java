package com.rongyi.easy.rmmm.vo;

import java.io.Serializable;
import java.util.List;

import org.bson.types.ObjectId;

import com.rongyi.easy.roa.vo.BrandsCategoryVO;
import com.rongyi.easy.roa.vo.ShopPositionVO;

public class CouponShopVO implements Serializable {

    private static final long serialVersionUID = 1L;
    private String id;
    private String address;//地址
    private List<Double> location;//店铺的 经纬度

    //来至 OldMallVO
    private String type;//关联类型(mall or shop)
    private String icon;//商家图片
    private String title;//商家名称
    private String telephone; //商家电话
    private Double distance = 0.0; //距离
    private List<Integer> tip; ///< 店铺标签（格式：[0，0，0] 对应：[货，惠、劵]）
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public List<Double> getLocation() {
		return location;
	}
	public void setLocation(List<Double> location) {
		this.location = location;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getIcon() {
		return icon;
	}
	public void setIcon(String icon) {
		this.icon = icon;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public Double getDistance() {
		return distance;
	}
	public void setDistance(Double distance) {
		this.distance = distance;
	}
	public List<Integer> getTip() {
		return tip;
	}
	public void setTip(List<Integer> tip) {
		this.tip = tip;
	}
	@Override
	public String toString() {
		return "CouponShopVO [id=" + id + ", address=" + address
				+ ", location=" + location + ", type=" + type + ", icon="
				+ icon + ", title=" + title + ", telephone=" + telephone
				+ ", distance=" + distance + ", tip=" + tip + "]";
	}
    
}

package com.rongyi.easy.rmmm.vo;

import java.io.Serializable;
import java.util.List;

public class ShareCouponVO implements Serializable{
	
	private String bindPhone;// 当前绑定的手机号
	private String phone;// 领取红包的手机号
	private double price;// 红包金额
	private String status;// 1：已抢光 ，2：已结束 ，3：已达领取上限，4：已领取，5：未领取
	private String message;// 红包已抢完啦~ 等提示文案
	private String useDescription;// 使用说明
	private String validEndTime;// 有效期结束时间
	private String validStartTime;// 有效期开始时间
	private List<ShareCouponDetailVO> others;//朋友领取红包列表
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getBindPhone() {
		return bindPhone;
	}
	public void setBindPhone(String bindPhone) {
		this.bindPhone = bindPhone;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getUseDescription() {
		return useDescription;
	}
	public void setUseDescription(String useDescription) {
		this.useDescription = useDescription;
	}
	public String getValidEndTime() {
		return validEndTime;
	}
	public void setValidEndTime(String validEndTime) {
		this.validEndTime = validEndTime;
	}
	public String getValidStartTime() {
		return validStartTime;
	}
	public void setValidStartTime(String validStartTime) {
		this.validStartTime = validStartTime;
	}
	public List<ShareCouponDetailVO> getOthers() {
		return others;
	}
	public void setOthers(List<ShareCouponDetailVO> others) {
		this.others = others;
	}
	@Override
	public String toString() {
		return "ShareCouponVO [bindPhone=" + bindPhone + ", phone=" + phone
				+ ", price=" + price + ", status=" + status + ", message="
				+ message + ", useDescription=" + useDescription
				+ ", validEndTime=" + validEndTime + ", validStartTime="
				+ validStartTime + ", others=" + others + "]";
	}

}

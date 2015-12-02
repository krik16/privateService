package com.rongyi.easy.malllife.vo.redEnvelopeCoupon;

import java.io.Serializable;
import java.util.List;
/**
 * 订单可使用与不可使用的红包返回
 * @author user
 *
 */
public class RedEnvelopeForOrderVO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String title;//红包名称
	private String couponCode;//红包券码
	private Integer applyScope;//0:商品/代金券  1:商品   2:代金券
	private Double discount;// 抵扣金额
    private String validBeginDate;// 有效期开始时间
    private String validEndDate;// 有效期结束时间
    private Integer status;// 券状态 0:未激活 1:已领用 2:已使用 3:已过期
    private List<String> label;//标签
    private Integer relateType;//关联类型
    
	public Integer getRelateType() {
		return relateType;
	}
	public void setRelateType(Integer relateType) {
		this.relateType = relateType;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCouponCode() {
		return couponCode;
	}
	public void setCouponCode(String couponCode) {
		this.couponCode = couponCode;
	}
	public Integer getApplyScope() {
		return applyScope;
	}
	public void setApplyScope(Integer applyScope) {
		this.applyScope = applyScope;
	}
	public Double getDiscount() {
		return discount;
	}
	public void setDiscount(Double discount) {
		this.discount = discount;
	}
	public String getValidBeginDate() {
		return validBeginDate;
	}
	public void setValidBeginDate(String validBeginDate) {
		this.validBeginDate = validBeginDate;
	}
	public String getValidEndDate() {
		return validEndDate;
	}
	public void setValidEndDate(String validEndDate) {
		this.validEndDate = validEndDate;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public List<String> getLabel() {
		return label;
	}
	public void setLabel(List<String> label) {
		this.label = label;
	}
	
	@Override
	public String toString() {
		return "RedEnvelopeForOrderVO [title=" + title + ", couponCode="
				+ couponCode + ", applyScope=" + applyScope + ", discount="
				+ discount + ", validBeginDate=" + validBeginDate
				+ ", validEndDate=" + validEndDate + ", status=" + status
				+ ", label=" + label + "]";
	}
    
}

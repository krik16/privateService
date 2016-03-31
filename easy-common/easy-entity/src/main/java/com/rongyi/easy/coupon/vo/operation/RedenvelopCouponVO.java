package com.rongyi.easy.coupon.vo.operation;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import com.rongyi.easy.coupon.entity.CouponRejectRecord;

public class RedenvelopCouponVO implements Serializable{


	private static final long serialVersionUID = 126543468743425L;

	private String id;

    /**
     * 代金券名称
     */
    private String name;

    /**
     * 卡券类型:代金券[0], 抵扣券[1], 红包[2]
     */
    private String couponType;

    /**
     * 券码发行量
     */
    private Integer totalCount;

    /**
     * 库存量
     */
    private Integer stockCount;
    
    /**
     * 领取数量
     */
    private Integer receiveCount;
    /**
     * 原价
     */
    
    private Double origPrice;

    /**
     * 折扣价,属于红包字段
     */
    
    private Double discount;
    /**
     * 卡券发布渠道：大运营平台[0], 商家管理后台[1]
     * 卡券发布渠道：大运营平台[operation], 商家管理后台[merchant]
     */
    private Integer publishChannel;

    /**
     * 现价
     */
    private Double currPrice;

    /**
     * 关联类型
     * 代金券：集团[0],品牌[1], 商场 [2],店铺[3];
     * 红包 ：全场[0],商品[1]
     */
    private String relatedType;

    /**
     * 状态: 待审核[0], 审核未通过[1], 审核通过[2]
     */
    private String status;
    /**
     * 发布开始时间
     */
    private Date publishStartAt;

    /**
     * 发布结束时间
     */
    private Date publishEndAt;

    /**
     * 得到最后一条审核不通过的记录
     */
	private String checkDesic;
    
    /**
     * 拒绝原因
     */
    private List<CouponRejectRecord> rejectRecordList;
    
    public RedenvelopCouponVO(){
    	
    }

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

	public String getCouponType() {
		return couponType;
	}

	public void setCouponType(String couponType) {
		this.couponType = couponType;
	}

	public Integer getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public Integer getStockCount() {
		return stockCount;
	}

	public void setStockCount(Integer stockCount) {
		this.stockCount = stockCount;
	}

	public Integer getReceiveCount() {
		return receiveCount;
	}

	public void setReceiveCount(Integer receiveCount) {
		this.receiveCount = receiveCount;
	}

	public Double getOrigPrice() {
		return origPrice;
	}

	public void setOrigPrice(Double origPrice) {
		this.origPrice = origPrice;
	}

	public Double getDiscount() {
		return discount;
	}

	public void setDiscount(Double discount) {
		this.discount = discount;
	}

	public Integer getPublishChannel() {
		return publishChannel;
	}

	public void setPublishChannel(Integer publishChannel) {
		this.publishChannel = publishChannel;
	}

	public Double getCurrPrice() {
		return currPrice;
	}

	public void setCurrPrice(Double currPrice) {
		this.currPrice = currPrice;
	}

	public String getRelatedType() {
		return relatedType;
	}

	public void setRelatedType(String relatedType) {
		this.relatedType = relatedType;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getPublishStartAt() {
		return publishStartAt;
	}

	public void setPublishStartAt(Date publishStartAt) {
		this.publishStartAt = publishStartAt;
	}

	public Date getPublishEndAt() {
		return publishEndAt;
	}

	public void setPublishEndAt(Date publishEndAt) {
		this.publishEndAt = publishEndAt;
	}

	public List<CouponRejectRecord> getRejectRecordList() {
		return rejectRecordList;
	}

	public void setRejectRecordList(List<CouponRejectRecord> rejectRecordList) {
		this.rejectRecordList = rejectRecordList;
	}

	public String getCheckDesic() {
		if(this.rejectRecordList != null && !this.rejectRecordList.isEmpty()){
			return this.rejectRecordList.get(this.rejectRecordList.size()-1).getReason();
		}else{
			return "";
		}
	}

	public void setCheckDesic(String checkDesic) {
		if(this.rejectRecordList != null && !this.rejectRecordList.isEmpty()){
			this.checkDesic = this.rejectRecordList.get(this.rejectRecordList.size()-1).getReason();
		}else{
			this.checkDesic = "";
		}
		
	}
    
    
    
    
}

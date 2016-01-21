package com.rongyi.easy.coupon.old_vo;

import java.util.List;

/**
 * @author lqy
 * @ClassName: CouponOrderItemVO
 * @Description: (优惠券订单项VO)
 * @date 2015年6月9日 下午6:05:29
 */
public class OldItemVO {

    private String itemName;//订单项name
    private String thumbnail;//缩略图
    private Double orderPrice;//订单总价
    private Integer orderNum;//下单总数量
    private Integer outDateFlag;//是否已过销售时间：0-未过  1-已过
    private Integer orderDetailId;//订单项主键Id
    private List<OldUserCode> myActivityList;

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public Double getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(Double orderPrice) {
        this.orderPrice = orderPrice;
    }

    public Integer getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(Integer orderNum) {
        this.orderNum = orderNum;
    }

    public Integer getOutDateFlag() {
        return outDateFlag;
    }

    public void setOutDateFlag(Integer outDateFlag) {
        this.outDateFlag = outDateFlag;
    }

    public List<OldUserCode> getMyActivityList() {
        return myActivityList;
    }

    public void setMyActivityList(List<OldUserCode> myActivityList) {
        this.myActivityList = myActivityList;
    }

    public Integer getOrderDetailId() {
        return orderDetailId;
    }

    public void setOrderDetailId(Integer orderDetailId) {
        this.orderDetailId = orderDetailId;
    }


}




package com.rongyi.easy.tradecenter.param;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import java.io.Serializable;
import java.util.List;

/**
 * Created by jason
 * on 2015/11/5.17:33
 */
public class OsmOrderQueryParam implements Serializable
{
	private static final long serialVersionUID = 1L;
	private String orderStatus;//订单状态
    private String createOrderBegin;//订单创建开始时间
    private String createOrderEnd;//订单创建结束时间
    private String orderNo;//订单编码
    private String commodityNo;//商品编码
    private String commodityName;//商品名称
    private String buyerAccount;//买家账号
    private String buyerNickName;//买家昵称
    private  String weidianName;//微店id
    private  String guideName;//导购名称
    private  String currentPage;//当前页
    private  String sizePerPage;//每页数量
    private String commodityStatus;//商品状态
    Integer guideId;//导购id
    private Integer activityStatus;// 拼团活动状态
    private String activityName;// 活动名称（购买来源）
    private Integer activityType;// 活动类型
    private List<String> commodityMidList;// 商品ID集合
    private Integer activityRoundId;// 活动场次ID
    private Integer orderSource;// 购买终端

    private List<String> weidianIds;//店铺id集合
    private List<String> commodityIds;//商品id集合
    private List<String> guideIds;//导购id集合
    private List<String> buyerIds;//买家id集合
    private Integer recordStart;//起始
    private Integer pageSize;//
    private List<String> selfShopIds;//
    private List<String> selfGuideIds;//
    private List<String> orderNoList;//
    private Integer deliveryType;//快递方式 1：自提 2：快递
    /**
     * 退款状态（0：全部 1：退款申请中 2：待买家发货 3：待买家上门  4：待卖家收货 5退款中 6：退款成功 7：退款已拒绝 8：退款关闭）
     */
    private Integer refundStatus;


    public Integer getDeliveryType() {
        return deliveryType;
    }

    public void setDeliveryType(Integer deliveryType) {
        this.deliveryType = deliveryType;
    }

    public Integer getGuideId() {
        return guideId;
    }

    public void setGuideId(Integer guideId) {
        this.guideId = guideId;
    }

    public String getCommodityStatus() {
        return commodityStatus;
    }

    public void setCommodityStatus(String commodityStatus) {
        this.commodityStatus = commodityStatus;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getCreateOrderBegin() {
        return createOrderBegin;
    }

    public void setCreateOrderBegin(String createOrderBegin) {
        this.createOrderBegin = createOrderBegin;
    }

    public String getCreateOrderEnd() {
        return createOrderEnd;
    }

    public void setCreateOrderEnd(String createOrderEnd) {
        this.createOrderEnd = createOrderEnd;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getCommodityNo() {
        return commodityNo;
    }

    public void setCommodityNo(String commodityNo) {
        this.commodityNo = commodityNo;
    }

    public String getCommodityName() {
        return commodityName;
    }

    public void setCommodityName(String commodityName) {
        this.commodityName = commodityName;
    }

    public String getBuyerAccount() {
        return buyerAccount;
    }

    public void setBuyerAccount(String buyerAccount) {
        this.buyerAccount = buyerAccount;
    }

    public String getWeidianName() {
        return weidianName;
    }

    public void setWeidianName(String weidianName) {
        this.weidianName = weidianName;
    }

    public String getGuideName() {
        return guideName;
    }

    public void setGuideName(String guideName) {
        this.guideName = guideName;
    }

    public String getCurrentPage() {
        return currentPage;
    }

    public String getBuyerNickName() {
        return buyerNickName;
    }

    public void setBuyerNickName(String buyerNickName) {
        this.buyerNickName = buyerNickName;
    }

    public void setCurrentPage(String currentPage) {
        this.currentPage = currentPage;
    }

    public String getSizePerPage() {
        return sizePerPage;
    }

    public void setSizePerPage(String sizePerPage) {
        this.sizePerPage = sizePerPage;
    }

    public Integer getActivityStatus() {
        return activityStatus;
    }

    public void setActivityStatus(Integer activityStatus) {
        this.activityStatus = activityStatus;
    }

    public String getActivityName() {
        return activityName;
    }

    public void setActivityName(String activityName) {
        this.activityName = activityName;
    }

    public Integer getActivityType() {
        return activityType;
    }

    public void setActivityType(Integer activityType) {
        this.activityType = activityType;
    }

    public List<String> getCommodityMidList() {
        return commodityMidList;
    }

    public void setCommodityMidList(List<String> commodityMidList) {
        this.commodityMidList = commodityMidList;
    }

    public Integer getActivityRoundId() {
        return activityRoundId;
    }

    public void setActivityRoundId(Integer activityRoundId) {
        this.activityRoundId = activityRoundId;
    }

    public Integer getOrderSource() {
        return orderSource;
    }

    public void setOrderSource(Integer orderSource) {
        this.orderSource = orderSource;
    }

    public List<String> getWeidianIds() {
        return weidianIds;
    }

    public void setWeidianIds(List<String> weidianIds) {
        this.weidianIds = weidianIds;
    }

    public List<String> getCommodityIds() {
        return commodityIds;
    }

    public void setCommodityIds(List<String> commodityIds) {
        this.commodityIds = commodityIds;
    }

    public List<String> getGuideIds() {
        return guideIds;
    }

    public void setGuideIds(List<String> guideIds) {
        this.guideIds = guideIds;
    }

    public List<String> getBuyerIds() {
        return buyerIds;
    }

    public void setBuyerIds(List<String> buyerIds) {
        this.buyerIds = buyerIds;
    }

    public Integer getRecordStart() {
        return recordStart;
    }

    public void setRecordStart(Integer recordStart) {
        this.recordStart = recordStart;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public List<String> getSelfShopIds() {
        return selfShopIds;
    }

    public void setSelfShopIds(List<String> selfShopIds) {
        this.selfShopIds = selfShopIds;
    }

    public List<String> getSelfGuideIds() {
        return selfGuideIds;
    }

    public void setSelfGuideIds(List<String> selfGuideIds) {
        this.selfGuideIds = selfGuideIds;
    }

    public List<String> getOrderNoList() {
        return orderNoList;
    }

    public void setOrderNoList(List<String> orderNoList) {
        this.orderNoList = orderNoList;
    }

    public Integer getRefundStatus() {
        return refundStatus;
    }

    public void setRefundStatus(Integer refundStatus) {
        this.refundStatus = refundStatus;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.DEFAULT_STYLE);
    }
}

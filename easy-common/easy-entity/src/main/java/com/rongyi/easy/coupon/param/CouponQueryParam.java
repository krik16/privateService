package com.rongyi.easy.coupon.param;

import com.rongyi.core.constant.Constants;
import com.rongyi.easy.page.QueryOrder;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * Description:
 * Author: 袁波
 * Time: 16:14
 * Package:com.rongyi.easy.coupon.param
 * Project:easy-market
 */
public class CouponQueryParam implements Serializable{
    private Integer id;//id
    private String name;//标题
    private Integer relateType;// 关联类型。 0：集团；1：品牌；2：商场；3：店铺
    private Integer publishStatus;//发布状态。0:待发布 ;1:进行中;2: 已结束;3:已下架
    private Integer checkStatus;// 审核状态。0：待审核；1：未通过；2：已通过
    private Integer publishChannel;//发布渠道。0：大运营；1：商家；
    private String synTarget;//展示渠道；容易逛,互动屏,微信 [1,1,1]表示三个都没选中。0 表示未选中，1 表示选中
    private String mallId;//商场id
    private String shopId;//店铺id
    private Boolean isRelateActivity;//是否关联的活动。true：关联 。false 未关联
    private Date validDate;// 有效期时间之内 后验证使用
    private Integer validateType;//验证类型。0：容易后验证；1：互动屏票据;2:两者兼容
    private Date validBeginDate;//小于等于有效期开始时间。
    private Date validEndDate;//大于等于有效期结束时间
    private Date publishBeginDate;//小于等于发布开始时间
    private Date publishEndDate;// 大于等于发布结束时间
    private Integer couponType;// 卡券类型
    private List<QueryOrder> orders;//排序列表
    private List<Integer> publishStatusList;
    private List<Integer> checkStatusList;

    private Integer currentPage;
    private Integer pageSize;

    public Integer getCurrentPage() {
        return currentPage==null? Constants.CouponPage.CURRENT_PAGE:currentPage;
    }

    public void setCurrentPage(Integer currenPage) {
        this.currentPage = currenPage;
    }

    public Integer getPageSize() {
        return pageSize==null?Constants.CouponPage.PAGE_SIZE:pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getRelateType() {
        return relateType;
    }

    public void setRelateType(Integer relateType) {
        this.relateType = relateType;
    }

    public Integer getPublishStatus() {
        return publishStatus;
    }

    public void setPublishStatus(Integer publishStatus) {
        this.publishStatus = publishStatus;
    }

    public Integer getCheckStatus() {
        return checkStatus;
    }

    public void setCheckStatus(Integer checkStatus) {
        this.checkStatus = checkStatus;
    }

    public Integer getPublishChannel() {
        return publishChannel;
    }

    public void setPublishChannel(Integer publishChannel) {
        this.publishChannel = publishChannel;
    }

    public String getSynTarget() {
        return synTarget;
    }

    public void setSynTarget(String synTarget) {
        this.synTarget = synTarget;
    }

    public String getMallId() {
        return mallId;
    }

    public void setMallId(String mallId) {
        this.mallId = mallId;
    }

    public String getShopId() {
        return shopId;
    }

    public void setShopId(String shopId) {
        this.shopId = shopId;
    }

    public Boolean getIsRelateActivity() {
        return isRelateActivity;
    }

    public void setIsRelateActivity(Boolean isRelateActivity) {
        this.isRelateActivity = isRelateActivity;
    }

    public Date getValidDate() {
        return validDate;
    }

    public void setValidDate(Date validDate) {
        this.validDate = validDate;
    }

    public Integer getValidateType() {
        return validateType;
    }

    public void setValidateType(Integer validateType) {
        this.validateType = validateType;
    }

    public Date getValidBeginDate() {
        return validBeginDate;
    }

    public void setValidBeginDate(Date validBeginDate) {
        this.validBeginDate = validBeginDate;
    }

    public Date getValidEndDate() {
        return validEndDate;
    }

    public void setValidEndDate(Date validEndDate) {
        this.validEndDate = validEndDate;
    }

    public Date getPublishBeginDate() {
        return publishBeginDate;
    }

    public void setPublishBeginDate(Date publishBeginDate) {
        this.publishBeginDate = publishBeginDate;
    }

    public Date getPublishEndDate() {
        return publishEndDate;
    }

    public void setPublishEndDate(Date publishEndDate) {
        this.publishEndDate = publishEndDate;
    }

    public Integer getCouponType() {
        return couponType;
    }

    public void setCouponType(Integer couponType) {
        this.couponType = couponType;
    }

    @Override
    public String toString() {
        return "CouponQueryParam{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", relateType=" + relateType +
            ", publishStatus=" + publishStatus +
            ", checkStatus=" + checkStatus +
            ", publishChannel=" + publishChannel +
            ", synTarget='" + synTarget + '\'' +
            ", mallId='" + mallId + '\'' +
            ", shopId='" + shopId + '\'' +
            ", isRelateActivity=" + isRelateActivity +
            ", validDate=" + validDate +
            ", validateType=" + validateType +
            ", validBeginDate=" + validBeginDate +
            ", validEndDate=" + validEndDate +
            ", publishBeginDate=" + publishBeginDate +
            ", publishEndDate=" + publishEndDate +
            ", couponType=" + couponType +
            ", orders=" + orders +
            ", publishStatusList=" + publishStatusList +
            ", checkStatusList=" + checkStatusList +
            ", currentPage=" + currentPage +
            ", pageSize=" + pageSize +
            '}';
    }

    public List<Integer> getPublishStatusList() {
        return publishStatusList;
    }

    public void setPublishStatusList(List<Integer> publishStatusList) {
        this.publishStatusList = publishStatusList;
    }

    public List<Integer> getCheckStatusList() {
        return checkStatusList;
    }

    public void setCheckStatusList(List<Integer> checkStatusList) {
        this.checkStatusList = checkStatusList;
    }

    public CouponQueryParam(Integer id, String name, Integer relateType, Integer publishStatus, Integer checkStatus, Integer publishChannel, String synTarget, String mallId, String shopId, Boolean isRelateActivity, Date validDate, Integer validateType, Date validBeginDate, Date validEndDate, Date publishBeginDate, Date publishEndDate, Integer couponType, List<QueryOrder> orders, Integer currenPage, Integer pageSize) {
        this.id = id;
        this.name = name;
        this.relateType = relateType;
        this.publishStatus = publishStatus;
        this.checkStatus = checkStatus;
        this.publishChannel = publishChannel;
        this.synTarget = synTarget;
        this.mallId = mallId;
        this.shopId = shopId;
        this.isRelateActivity = isRelateActivity;
        this.validDate = validDate;
        this.validateType = validateType;
        this.validBeginDate = validBeginDate;
        this.validEndDate = validEndDate;
        this.publishBeginDate = publishBeginDate;
        this.publishEndDate = publishEndDate;
        this.couponType = couponType;
        this.orders = orders;
        this.currentPage = currenPage;
        this.pageSize = pageSize;
    }

    public List<QueryOrder> getOrders() {
        return orders;
    }

    public void setOrders(List<QueryOrder> orders) {
        this.orders = orders;
    }

    public CouponQueryParam(Integer id, String name, Integer relateType, Integer publishStatus, Integer checkStatus, Integer publishChannel, String synTarget, String mallId, String shopId, Boolean isRelateActivity, Date validDate, Integer validateType, Date validBeginDate, Date validEndDate, Date publishBeginDate, Date publishEndDate, Integer couponType) {
        this.id = id;
        this.name = name;
        this.relateType = relateType;
        this.publishStatus = publishStatus;
        this.checkStatus = checkStatus;
        this.publishChannel = publishChannel;
        this.synTarget = synTarget;
        this.mallId = mallId;
        this.shopId = shopId;
        this.isRelateActivity = isRelateActivity;
        this.validDate = validDate;
        this.validateType = validateType;
        this.validBeginDate = validBeginDate;
        this.validEndDate = validEndDate;
        this.publishBeginDate = publishBeginDate;
        this.publishEndDate = publishEndDate;
        this.couponType = couponType;
    }

    public CouponQueryParam(Integer id, String name, Integer relateType, Integer publishStatus, Integer checkStatus, Integer publishChannel, String synTarget, String mallId, String shopId, Boolean isRelateActivity, Date validDate, Integer validateType, Date validBeginDate, Date validEndDate, Date publishBeginDate, Date publishEndDate, Integer couponType, Integer currenPage, Integer pageSize) {
        this.id = id;
        this.name = name;
        this.relateType = relateType;
        this.publishStatus = publishStatus;
        this.checkStatus = checkStatus;
        this.publishChannel = publishChannel;
        this.synTarget = synTarget;
        this.mallId = mallId;
        this.shopId = shopId;
        this.isRelateActivity = isRelateActivity;
        this.validDate = validDate;
        this.validateType = validateType;
        this.validBeginDate = validBeginDate;
        this.validEndDate = validEndDate;
        this.publishBeginDate = publishBeginDate;
        this.publishEndDate = publishEndDate;
        this.couponType = couponType;
        this.currentPage = currenPage;
        this.pageSize = pageSize;
    }

    public CouponQueryParam() {

    }

}

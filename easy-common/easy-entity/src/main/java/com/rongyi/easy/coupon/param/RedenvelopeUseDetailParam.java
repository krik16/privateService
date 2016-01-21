package com.rongyi.easy.coupon.param;

import com.rongyi.core.constant.Constants;
import com.rongyi.easy.malllife.common.util.DateTool;
import org.apache.commons.lang.StringUtils;

import java.io.Serializable;
import java.util.Date;

/**
 * Description:
 * Author: 袁波
 * DATE: 2015/11/20 14:54
 * Package:com.rongyi.easy.coupon.param
 * Project:easy-common
 */
public class RedenvelopeUseDetailParam implements Serializable{
    /**
     * 平台促销券id
     */
    private String couponId;

    /**
     * 券码
     */
    private String code;
    /**
     * 订单编号
     */
    private String orderNo;
    /**
     * 状态 0：未使用；1：已使用；2：已过期
     */
    private Integer status;
    /**
     * 领取账号
     */
    private String reciveAccount;
    /**
     * 姓名
     */
    private String userName;
    /**
     * 领取渠道 0 :全部 ；1：容易逛；2：互动屏；3：微信
     */
    private Integer receiveChannel;
    /**
     * 时间段，eg:2015-11-11 11:11:11-2015-12-12 12:12:12
     */
    private String dateBucket;
    /**
     * 时间段类型 1：领取时间 2：使用时间
     */
    private Integer dateType;

    private Integer pageSize;

    private Integer currentPage;

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("RedenvelopeUseDetailParam{");
        sb.append("couponId='").append(couponId).append('\'');
        sb.append(", code='").append(code).append('\'');
        sb.append(", orderNo='").append(orderNo).append('\'');
        sb.append(", status=").append(status);
        sb.append(", reciveAccount='").append(reciveAccount).append('\'');
        sb.append(", userName='").append(userName).append('\'');
        sb.append(", reciveChannel=").append(receiveChannel);
        sb.append(", dateBucket='").append(dateBucket).append('\'');
        sb.append(", dateType=").append(dateType);
        sb.append(", pageSize=").append(pageSize);
        sb.append(", currentPage=").append(currentPage);
        sb.append(", startDate=").append(startDate);
        sb.append(", endDate=").append(endDate);
        sb.append(", start=").append(start);
        sb.append('}');
        return sb.toString();
    }

    private Date startDate;

    private Date endDate;

    /**
     * 查询起始查询行数
     */
    private Integer start;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getReciveAccount() {
        return reciveAccount;
    }

    public void setReciveAccount(String reciveAccount) {
        this.reciveAccount = reciveAccount;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getReceiveChannel() {
        return receiveChannel;
    }

    public void setReceiveChannel(Integer receiveChannel) {
        this.receiveChannel = receiveChannel;
    }

    public String getDateBucket() {
        return dateBucket;
    }

    public void setDateBucket(String dateBucket) {
        this.dateBucket = dateBucket;
    }

    public Integer getDateType() {
        if(dateType==null)
            return 1;
        return dateType;
    }

    public void setDateType(Integer dateType) {
        this.dateType = dateType;
    }

    public Integer getPageSize() {
        if(pageSize==null){
            return Constants.CouponPage.PAGE_SIZE;
        }
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getCurrentPage() {
        if(currentPage==null){
            return Constants.CouponPage.CURRENT_PAGE;
        }
        return currentPage;
    }

    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }

    public Integer getStart() {
        return (this.getCurrentPage()-1)*this.getPageSize();
    }

    public void setStart(Integer start) {
        this.start = start;
    }

    public String getCouponId() {
        return couponId;
    }

    public void setCouponId(String couponId) {
        this.couponId = couponId;
    }

    public RedenvelopeUseDetailParam() {
    }

    public RedenvelopeUseDetailParam(String couponId, Integer currentPage,Integer pageSize) {
        this.couponId = couponId;
        this.currentPage = currentPage;
        this.pageSize=pageSize;
    }

    public Date getStartDate() {
        if(StringUtils.isNotBlank(dateBucket)&&StringUtils.isNumeric(dateBucket.split("-")[0])){
            return new Date(Long.parseLong(dateBucket.split("-")[0]));
        }
        return null;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        if(StringUtils.isNotBlank(dateBucket)&&dateBucket.split("-").length==2&&StringUtils.isNumeric(dateBucket.split("-")[1])){
            return new Date(Long.parseLong(dateBucket.split("-")[1]));
        }
        return null;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

}

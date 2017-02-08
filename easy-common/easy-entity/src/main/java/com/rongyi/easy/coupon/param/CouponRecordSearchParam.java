package com.rongyi.easy.coupon.param;

import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by yangyang on 2017/2/7.
 */
public class CouponRecordSearchParam implements Serializable{

    private Integer id;

    private String batchNo;

    private Integer type;

    private String typeVal;

    private Integer count;

    private Integer acceptId;

    private String phone;

    private String email;

    private Integer sendNum;

    private Date startAt;

    private Date endAt;

    private String couponName;

    private Integer currentPage;

    private Integer pageSize;

    private Integer offset;

    private Integer couponNum;

    private Integer couponCodeNum;


    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("id", id)
                .append("batchNo", batchNo)
                .append("type", type)
                .append("typeVal", typeVal)
                .append("count", count)
                .append("acceptId", acceptId)
                .append("phone", phone)
                .append("email", email)
                .append("sendNum", sendNum)
                .append("startAt", startAt)
                .append("endAt", endAt)
                .append("couponName", couponName)
                .append("currentPage", currentPage)
                .append("pageSize", pageSize)
                .append("offset", offset)
                .append("couponNum", couponNum)
                .append("couponCodeNum", couponCodeNum)
                .toString();
    }




    public Integer getCouponCodeNum() {
        return couponCodeNum;
    }

    public void setCouponCodeNum(Integer couponCodeNum) {
        this.couponCodeNum = couponCodeNum;
    }

    public Integer getCouponNum() {
        return couponNum;
    }

    public void setCouponNum(Integer couponNum) {
        this.couponNum = couponNum;
    }

    private static final long serialVersionUID = 1L;


    public Date getStartAt() {
        return startAt;
    }

    public void setStartAt(Date startAt) {
        this.startAt = startAt;
    }

    public Date getEndAt() {
        return endAt;
    }

    public void setEndAt(Date endAt) {
        this.endAt = endAt;
    }

    public String getCouponName() {
        return couponName;
    }

    public void setCouponName(String couponName) {
        this.couponName = couponName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBatchNo() {
        return batchNo;
    }

    public void setBatchNo(String batchNo) {
        this.batchNo = batchNo;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getTypeVal() {
        return typeVal;
    }

    public void setTypeVal(String typeVal) {
        this.typeVal = typeVal;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Integer getAcceptId() {
        return acceptId;
    }

    public void setAcceptId(Integer acceptId) {
        this.acceptId = acceptId;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getSendNum() {
        return sendNum;
    }

    public void setSendNum(Integer sendNum) {
        this.sendNum = sendNum;
    }


    public Integer getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }
}

package com.rongyi.easy.tradecenter.param;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * Created by hebo on 2016/1/5.
 * 商家验码记录参数
 */
public class BizzValidHistoryParam implements Serializable{

    private String orderBy="user_time";//排序：（默认 验证时间降序）
    private String orderVa="DESC";//排序方式:
    private Integer pageSize = 15;//默认15(传-1不分页)
    private Integer currentPage = 1;//当前页（后台处理）
    private Integer checkUserId;//核销人id
    private String checkNickName;//核销人昵称
    private String title;//券名称
    private String couponCode;//券码
    private String userPhone;//买家手机号
    private Date useTimeBegin;//验证开始时间
    private Date useTimeEnd;//验证结束时间
    private List<String> couponIds;
    /**
     * 0:代金券；1：活动券；2：礼品；3：停车券类
     */
    private Integer type;

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("BizzValidHistoryParam{");
        sb.append("orderBy='").append(orderBy).append('\'');
        sb.append(", orderVa='").append(orderVa).append('\'');
        sb.append(", pageSize=").append(pageSize);
        sb.append(", currentPage=").append(currentPage);
        sb.append(", checkUserId=").append(checkUserId);
        sb.append(", checkNickName='").append(checkNickName).append('\'');
        sb.append(", title='").append(title).append('\'');
        sb.append(", couponCode='").append(couponCode).append('\'');
        sb.append(", userPhone='").append(userPhone).append('\'');
        sb.append(", useTimeBegin=").append(useTimeBegin);
        sb.append(", useTimeEnd=").append(useTimeEnd);
        sb.append(", couponIds=").append(couponIds);
        sb.append(", type=").append(type);
        sb.append(", mallMids=").append(mallMids);
        sb.append(", shopMids=").append(shopMids);
        sb.append(", recordStart=").append(recordStart);
        sb.append(", dateStatus=").append(dateStatus);
        sb.append('}');
        return sb.toString();
    }

    private List<String> mallMids;
    private List<String> shopMids;

    private Integer recordStart;
    private Integer dateStatus;//记录统计参数     0:所有  1：当天  2：当周...
    public String getOrderBy() {
        return orderBy;
    }

    public void setOrderBy(String orderBy) {
        this.orderBy = orderBy;
    }

    public String getOrderVa() {
        return orderVa;
    }

    public void setOrderVa(String orderVa) {
        this.orderVa = orderVa;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getCurrentPage() {
        return currentPage==null?1:currentPage;
    }

    public List<String> getCouponIds() {
        return couponIds;
    }

    public Integer getDateStatus() {
        return dateStatus;
    }

    public String getCheckNickName() {
        return checkNickName;
    }

    public void setCheckNickName(String checkNickName) {
        this.checkNickName = checkNickName;
    }

    public void setDateStatus(Integer dateStatus) {
        this.dateStatus = dateStatus;
    }

    public void setCouponIds(List<String> couponIds) {
        this.couponIds = couponIds;
    }

    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }

    public Integer getCheckUserId() {
        return checkUserId;
    }

    public List<String> getShopMids() {
        return shopMids;
    }

    public void setShopMids(List<String> shopMids) {
        this.shopMids = shopMids;
    }

    public List<String> getMallMids() {

        return mallMids;
    }

    public void setMallMids(List<String> mallMids) {
        this.mallMids = mallMids;
    }

    public void setCheckUserId(Integer checkUserId) {
        this.checkUserId = checkUserId;
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

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public Date getUseTimeBegin() {
        return useTimeBegin;
    }

    public void setUseTimeBegin(Date useTimeBegin) {
        this.useTimeBegin = useTimeBegin;
    }

    public Date getUseTimeEnd() {
        return useTimeEnd;
    }

    public void setUseTimeEnd(Date useTimeEnd) {
        this.useTimeEnd = useTimeEnd;
    }

    public Integer getRecordStart() {
        return recordStart;
    }

    public void setRecordStart(Integer recordStart) {
        this.recordStart = recordStart;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }
}

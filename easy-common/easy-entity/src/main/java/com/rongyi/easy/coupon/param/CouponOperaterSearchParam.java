package com.rongyi.easy.coupon.param;

import java.io.Serializable;

/**
 * Created by shaozhou on 2016/12/7.
 */
public class CouponOperaterSearchParam implements Serializable {
    private Integer showChannel;//1 互动屏 2 微信
    private Integer source;// 1 后台添加 2 店长上传 3 代运营
    private String idOrName;// 卡券名称或编号
    private Integer dateType;// 时间查询类型 1 发布时间 2 有效时间
    private String startAt;// 开始时间
    private String endAt;// 结束时间
    private Integer pageNo;// 当前页
    private Integer pageSize;// 每页个数
    private Integer reserve;//
    private Integer identity;
    private String merId;//商家id
    private Integer startIndex;
    private String wechatAppId;//微信 appid
    private int isShow;// 1 显示中 2 隐藏

    public Integer getShowChannel() {
        return showChannel;
    }

    public void setShowChannel(Integer showChannel) {
        this.showChannel = showChannel;
    }

    public Integer getSource() {
        return source;
    }

    public void setSource(Integer source) {
        this.source = source;
    }

    public String getIdOrName() {
        return idOrName;
    }

    public void setIdOrName(String idOrName) {
        this.idOrName = idOrName;
    }

    public Integer getDateType() {
        return dateType;
    }

    public void setDateType(Integer dateType) {
        this.dateType = dateType;
    }

    public String getStartAt() {
        return startAt;
    }

    public void setStartAt(String startAt) {
        this.startAt = startAt;
    }

    public String getEndAt() {
        return endAt;
    }

    public void setEndAt(String endAt) {
        this.endAt = endAt;
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public void setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getReserve() {
        return reserve;
    }

    public void setReserve(Integer reserve) {
        this.reserve = reserve;
    }

    public Integer getIdentity() {
        return identity;
    }

    public void setIdentity(Integer identity) {
        this.identity = identity;
    }

    public String getMerId() {
        return merId;
    }

    public void setMerId(String merId) {
        this.merId = merId;
    }

    public Integer getStartIndex() {
        return  (pageNo-1)*pageSize;
    }

    public void setStartIndex(Integer startIndex) {
        this.startIndex =startIndex;
    }

    public String getWechatAppId() {
        return wechatAppId;
    }

    public void setWechatAppId(String wechatAppId) {
        this.wechatAppId = wechatAppId;
    }

    public int getIsShow() {
        return isShow;
    }

    public void setIsShow(int isShow) {
        this.isShow = isShow;
    }

    @Override
    public String toString() {
        return "CouponOperaterSearchParam{" +
                "showChannel=" + showChannel +
                ", source=" + source +
                ", idOrName='" + idOrName + '\'' +
                ", dateType=" + dateType +
                ", startAt='" + startAt + '\'' +
                ", endAt='" + endAt + '\'' +
                ", pageNo=" + pageNo +
                ", pageSize=" + pageSize +
                ", reserve=" + reserve +
                ", identity=" + identity +
                ", merId='" + merId + '\'' +
                ", startIndex=" + startIndex +
                ", wechatAppId='" + wechatAppId + '\'' +
                ", isShow=" + isShow +
                '}';
    }
}

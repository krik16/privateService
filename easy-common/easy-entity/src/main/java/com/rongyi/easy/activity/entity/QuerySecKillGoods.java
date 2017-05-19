package com.rongyi.easy.activity.entity;

import com.google.inject.internal.Lists;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;
import java.util.List;

/**
 * Created by yangyang on 2016/9/21.
 */
public class QuerySecKillGoods implements Serializable {

    private Integer activityId;//活动id
    private String goodsId;//商品id
    private String name;//商品名称
    private String shopName;//店铺名称
    private Integer currentPage = 1;
    private Integer pageSize = 10;
    private Integer status;
    private String goodsCode;
    private Integer offset;
    private List<Integer> goodsStatus = Lists.newArrayList();//多个活动状态
    private Integer superPintuanSort;//超级团排序使用  1:教育版排序
    private Integer fromWeixin;//微信端调用
    private String sessionId;//场次id
    private String sessionDate;//changci riqi
    private Integer endSesssionStatus;//场次结束状态1


    public Integer getEndSesssionStatus() {
        return endSesssionStatus;
    }

    public void setEndSesssionStatus(Integer endSesssionStatus) {
        this.endSesssionStatus = endSesssionStatus;
    }

    public String getSessionDate() {
        return sessionDate;
    }

    public void setSessionDate(String sessionDate) {
        this.sessionDate = sessionDate;
    }

    public Integer getSuperPintuanSort() {
		return superPintuanSort;
	}

	public void setSuperPintuanSort(Integer superPintuanSort) {
		this.superPintuanSort = superPintuanSort;
	}

	public Integer getFromWeixin() {
        return fromWeixin;
    }

    public void setFromWeixin(Integer fromWeixin) {
        this.fromWeixin = fromWeixin;
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("activityId", activityId)
                .append("goodsId", goodsId)
                .append("name", name)
                .append("shopName", shopName)
                .append("currentPage", currentPage)
                .append("pageSize", pageSize)
                .append("status", status)
                .append("goodsCode", goodsCode)
                .append("goodsStatus", goodsStatus)
                .append("sessionId", sessionId)
                .append("endSesssionStatus", endSesssionStatus)
                .toString();
    }

    public List<Integer> getGoodsStatus() {
        return goodsStatus;
    }

    public void setGoodsStatus(List<Integer> goodsStatus) {
        this.goodsStatus = goodsStatus;
    }

    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public String getGoodsCode() {
        return goodsCode;
    }

    public void setGoodsCode(String goodsCode) {
        this.goodsCode = goodsCode;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
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

    public Integer getActivityId() {
        return activityId;
    }

    public void setActivityId(Integer activityId) {
        this.activityId = activityId;
    }

    public String getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }
}

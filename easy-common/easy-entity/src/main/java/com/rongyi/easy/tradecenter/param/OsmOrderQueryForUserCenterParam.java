package com.rongyi.easy.tradecenter.param;

import java.io.Serializable;
import java.util.Date;

/**
 * 商品订单查询列表（电子会员）
 *
 * @author wangjh7
 * @date 2016-11-25
 */
public class OsmOrderQueryForUserCenterParam implements Serializable {

    // mallId（必选）
    private String mallId;
    // 订单 状态（0：全部 1：待付款 2：待发货 3：已发货 4：已完成 5：已关闭）
    private Integer status;
    //  s商品状态 1：商品类礼品券 2：卡券类礼品券 3：停车券类型商品
    private Integer commodityType;
    // 订单编号
    private String tradeNo;
    // 用户手机(买家账号）
    private String phone;
    // 订单创建开始时间
    private Date createStartAt;
    // 订单创建结束时间
    private Date createEndAt;
    //  页码
    private int pageIndex;
    // 开始
    private int start;
    // 没页数
    private int pageSize;

    public Date getCreateEndAt() {
        return createEndAt;
    }

    public void setCreateEndAt(Date createEndAt) {
        this.createEndAt = createEndAt;
    }

    public Date getCreateStartAt() {
        return createStartAt;
    }

    public void setCreateStartAt(Date createStartAt) {
        this.createStartAt = createStartAt;
    }

    public String getMallId() {
        return mallId;
    }

    public void setMallId(String mallId) {
        this.mallId = mallId;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getTradeNo() {
        return tradeNo;
    }

    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
    }

    public int getPageIndex() {
        return pageIndex;
    }

    public void setPageIndex(int pageIndex) {
        this.pageIndex = pageIndex;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getStart() {
        if (0 < pageIndex && 0 < pageSize) {
            return (pageIndex - 1) * pageSize;
        }
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public Integer getCommodityType() {
        return commodityType;
    }

    public void setCommodityType(Integer commodityType) {
        this.commodityType = commodityType;
    }

    @Override
    public String toString() {
        return "OsmOrderQueryForUserCenterParam{" +
                "commodityType=" + commodityType +
                ", mallId='" + mallId + '\'' +
                ", status=" + status +
                ", tradeNo='" + tradeNo + '\'' +
                ", phone='" + phone + '\'' +
                ", createStartAt=" + createStartAt +
                ", createEndAt=" + createEndAt +
                ", pageIndex=" + pageIndex +
                ", start=" + start +
                ", pageSize=" + pageSize +
                '}';
    }
}

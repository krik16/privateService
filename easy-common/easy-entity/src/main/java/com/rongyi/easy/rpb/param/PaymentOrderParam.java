package com.rongyi.easy.rpb.param;

import java.io.Serializable;
import java.util.List;

/**
 * Created by shaozhou on 2017/3/29.
 */
public class PaymentOrderParam implements Serializable {
    private String orderNo;//订单编号
    private Integer payChannel;//支付方式
    private String startTime;//支付开始时间
    private String endTime;//支付结束时间
    private String ryMchId;//容易商户号
    private Integer currentPage;//当前页
    private Integer pageSize;//每页记录数
    private Integer startIndex;//
    private Integer tradeType;//0:消费 1:退款 -1全部
    private Integer status;//0:待打款 1:款已打 2:款已到 -1全部
    private Integer payScene;//支付终端 1:移动pos设备,2:扫码支付 -1 全部
    private Integer payerReconflag;// 支付机构对账标志 0:未对账,1:对账一致,2:对账不一致

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public Integer getPayChannel() {
        return payChannel;
    }

    public void setPayChannel(Integer payChannel) {
        this.payChannel = payChannel;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getRyMchId() {
        return ryMchId;
    }

    public void setRyMchId(String ryMchId) {
        this.ryMchId = ryMchId;
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

    public Integer getStartIndex() {
        if(this.currentPage!=null && this.pageSize!=null){
            return (this.currentPage-1)*this.pageSize;
        }else return null;
    }

    public void setStartIndex(Integer startIndex) {
        this.startIndex = startIndex;
    }

    public Integer getTradeType() {
        return tradeType;
    }

    public void setTradeType(Integer tradeType) {
        this.tradeType = tradeType;
    }

    public Integer getPayScene() {
        return payScene;
    }

    public void setPayScene(Integer payScene) {
        this.payScene = payScene;
    }

    public Integer getPayerReconflag() {
        return payerReconflag;
    }

    public void setPayerReconflag(Integer payerReconflag) {
        this.payerReconflag = payerReconflag;
    }

    @Override
    public String toString() {
        return "PaymentOrderParam{" +
                "orderNo='" + orderNo + '\'' +
                ", payChannel=" + payChannel +
                ", startTime='" + startTime + '\'' +
                ", endTime='" + endTime + '\'' +
                ", ryMchId='" + ryMchId + '\'' +
                ", currentPage=" + currentPage +
                ", pageSize=" + pageSize +
                ", startIndex=" + startIndex +
                ", tradeType=" + tradeType +
                ", status=" + status +
                ", payScene=" + payScene +
                ", payerReconflag=" + payerReconflag +
                '}';
    }
}

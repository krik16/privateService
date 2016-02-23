package com.rongyi.easy.malllife.vo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class CouponRefundDetailVO implements Serializable {



	private BigDecimal refundAmount;//退款金额

	private Integer refundNum;//退款数量

	private List<String> couponCodeList;//退款的代金券券码

	private String payChannel;//退回的账户

	private List<RefundMessage> detailList = new ArrayList<>(); //退款信息展示

    public BigDecimal getRefundAmount()
    {
        return refundAmount;
    }

    public void setRefundAmount(BigDecimal refundAmount)
    {
        this.refundAmount = refundAmount;
    }

    public Integer getRefundNum()
    {
        return refundNum;
    }

    public void setRefundNum(Integer refundNum)
    {
        this.refundNum = refundNum;
    }

    public List<String> getCouponCodeList()
    {
        return couponCodeList;
    }

    public void setCouponCodeList(List<String> couponCodeList)
    {
        this.couponCodeList = couponCodeList;
    }

    public String getPayChannel()
    {
        return payChannel;
    }

    public void setPayChannel(String payChannel)
    {
        this.payChannel = payChannel;
    }

    public List<RefundMessage> getDetailList()
    {
        return detailList;
    }

    public void setDetailList(List<RefundMessage> detailList)
    {
        this.detailList = detailList;
    }

    @Override
    public String toString() {
        return "CouponRefundDetailVO{" +
                "refundAmount='" + refundAmount + '\'' +
                "refundNum='" + refundNum + '\'' +
                "payChannel='" + payChannel + '\'' +
                '}';
    }

	public class RefundMessage implements Serializable{

		private String stage;// 退款状态描述

		private String message;// 退款信息

		private String timestamp;// 日期

		private String status;// 退款状态

		public String getStage()
		{
			return stage;
		}

		public void setStage(String stage)
		{
			this.stage = stage;
		}

		public String getMessage()
		{
			return message;
		}

		public void setMessage(String message)
		{
			this.message = message;
		}

		public String getTimestamp()
		{
			return timestamp;
		}

		public void setTimestamp(String timestamp)
		{
			this.timestamp = timestamp;
		}

		public String getStatus()
		{
			return status;
		}

		public void setStatus(String status)
		{
			this.status = status;
		}

		@Override
		public String toString() {
			return "RefundMessage{" +
					"stage='" + stage + '\'' +
					"message='" + message + '\'' +
					"timestamp='" + timestamp + '\'' +
					"status='" + status + '\'' +
					'}';
		}
	}
}

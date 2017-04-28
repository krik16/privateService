package com.rongyi.easy.tradecenter.vo;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

/**
 * @author chenjun
 * @date 2017/4/10 19:15
 */
public class AppealDetailVO implements Serializable{

    private static final long serialVersionUID = 8714837804685367513L;
    private String shopName;// 店铺名称
    private String shopId;// 店铺mysqlId
    private String shopMid;// 店铺monogId
    private String shopLogo;// 店铺logo
    private String shopIcon;// 店铺自定义logo
    private String shopAddress;// 店铺地址
    private Integer refundStatus;// 退款状态 0：申请退款 1：退款中 2：拒绝退款 3：已退款 4：待买家发货 5：带卖家收货 6：退款关闭
    private Integer complaintStatus;// 维权状态 1：申诉中、2：申诉成功、3：申诉失败、4：申诉关闭
    private Integer refundType;// 退款类型 1：仅退款'，3：快递退货退款'，7：到店退货退款'
    private String refundNo;// 退款单号
    private String complaintNo;// 维权单号
    private BigDecimal refundAmount;// 退款金额
    private long nextStatusTime;//剩余时间，单位毫秒
    private String refundExpressInfoId;// 退款物流信息主键id
    private String orderNo;// 订单号
    private boolean whetherCanRefund;// 是否可以退款" true：可以，false:不可以
    private boolean whetherCanComplaint;// 是否可以申诉" true：可以，false:不可以
    private String merchantReceiveName;// 商家收货人姓名
    private String merchantReceivePhone;// 商家收货人电话
    private String merchantReceiveAddress;// 商家收货人地址
    private String operatePhone;// 平台客服维权电话
    private String merchantPhone;// 商家基础信息电话
    private String appealComment;// 退款说明
    private long createAt;//申请时间
    private List<String> pics;//退款图片列表
    private List<AppealNode> nodeList;//退款节点
    private List<AppealCommodityVO> refundCommodiyts;

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getShopId() {
        return shopId;
    }

    public void setShopId(String shopId) {
        this.shopId = shopId;
    }

    public String getShopMid() {
        return shopMid;
    }

    public void setShopMid(String shopMid) {
        this.shopMid = shopMid;
    }

    public String getShopLogo() {
        return shopLogo;
    }

    public void setShopLogo(String shopLogo) {
        this.shopLogo = shopLogo;
    }

    public String getShopAddress() {
        return shopAddress;
    }

    public void setShopAddress(String shopAddress) {
        this.shopAddress = shopAddress;
    }

    public Integer getRefundStatus() {
        return refundStatus;
    }

    public void setRefundStatus(Integer refundStatus) {
        this.refundStatus = refundStatus;
    }

    public Integer getComplaintStatus() {
        return complaintStatus;
    }

    public void setComplaintStatus(Integer complaintStatus) {
        this.complaintStatus = complaintStatus;
    }

    public Integer getRefundType() {
        return refundType;
    }

    public void setRefundType(Integer refundType) {
        this.refundType = refundType;
    }

    public String getRefundNo() {
        return refundNo;
    }

    public void setRefundNo(String refundNo) {
        this.refundNo = refundNo;
    }

    public String getComplaintNo() {
        return complaintNo;
    }

    public void setComplaintNo(String complaintNo) {
        this.complaintNo = complaintNo;
    }

    public BigDecimal getRefundAmount() {
        return refundAmount;
    }

    public void setRefundAmount(BigDecimal refundAmount) {
        this.refundAmount = refundAmount;
    }

    public long getNextStatusTime() {
        return nextStatusTime;
    }

    public void setNextStatusTime(long nextStatusTime) {
        this.nextStatusTime = nextStatusTime;
    }

    public String getRefundExpressInfoId() {
        return refundExpressInfoId;
    }

    public void setRefundExpressInfoId(String refundExpressInfoId) {
        this.refundExpressInfoId = refundExpressInfoId;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public boolean isWhetherCanRefund() {
        return whetherCanRefund;
    }

    public void setWhetherCanRefund(boolean whetherCanRefund) {
        this.whetherCanRefund = whetherCanRefund;
    }

    public boolean isWhetherCanComplaint() {
        return whetherCanComplaint;
    }

    public void setWhetherCanComplaint(boolean whetherCanComplaint) {
        this.whetherCanComplaint = whetherCanComplaint;
    }

    public String getMerchantReceiveName() {
        return merchantReceiveName;
    }

    public void setMerchantReceiveName(String merchantReceiveName) {
        this.merchantReceiveName = merchantReceiveName;
    }

    public String getMerchantReceivePhone() {
        return merchantReceivePhone;
    }

    public void setMerchantReceivePhone(String merchantReceivePhone) {
        this.merchantReceivePhone = merchantReceivePhone;
    }

    public String getMerchantReceiveAddress() {
        return merchantReceiveAddress;
    }

    public void setMerchantReceiveAddress(String merchantReceiveAddress) {
        this.merchantReceiveAddress = merchantReceiveAddress;
    }

    public String getOperatePhone() {
        return operatePhone;
    }

    public void setOperatePhone(String operatePhone) {
        this.operatePhone = operatePhone;
    }

    public String getMerchantPhone() {
        return merchantPhone;
    }

    public void setMerchantPhone(String merchantPhone) {
        this.merchantPhone = merchantPhone;
    }

    public long getCreateAt() {
        return createAt;
    }

    public void setCreateAt(long createAt) {
        this.createAt = createAt;
    }

    public List<String> getPics() {
        return pics;
    }

    public void setPics(List<String> pics) {
        this.pics = pics;
    }

    public List<AppealNode> getNodeList() {
        return nodeList;
    }

    public void setNodeList(List<AppealNode> nodeList) {
        this.nodeList = nodeList;
    }

    public List<AppealCommodityVO> getRefundCommodiyts() {
        return refundCommodiyts;
    }

    public void setRefundCommodiyts(List<AppealCommodityVO> refundCommodiyts) {
        this.refundCommodiyts = refundCommodiyts;
    }

    public String getAppealComment() {
        return appealComment;
    }

    public void setAppealComment(String appealComment) {
        this.appealComment = appealComment;
    }

    public String getShopIcon() {
        return shopIcon;
    }

    public void setShopIcon(String shopIcon) {
        this.shopIcon = shopIcon;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.DEFAULT_STYLE);
    }
}

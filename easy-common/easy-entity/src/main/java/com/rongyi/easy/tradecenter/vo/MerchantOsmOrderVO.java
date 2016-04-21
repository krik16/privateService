package com.rongyi.easy.tradecenter.vo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

/**
 * Created by jason
 * on 2015/11/5.17:33
 */
public class MerchantOsmOrderVO implements Serializable{

    private Integer orderId;
    private String orderNo;//�������
    private String createTime;//�µ�ʱ��
    private String paymentTime;//֧��ʱ��
    private String shopName;//��������
    private String commodityNum;//��Ʒ������
    private  String guideName;//��������
    private Integer guideId;//����id
    private Integer orderSource;//����id
    private Byte payChannel;//����id
    private String buyerAccount;//����˺�
    private String buyerNickName;//����˺�
    private String paymentAmount;//����ʵ��֧����� Ԫ
    private String discountAmount;//�����Żݽ�� Ԫ
    private BigDecimal expressPrice;//�ʷ� Ԫ
    private BigDecimal integralAmount;//�����Ż�
    private String integralNum= "0";//������
    private String orderStatus;//����״̬ 1������δ���2��������������3�������ѷ�����4������ȷ���ջ���5�������رա�8��ȡ��
    private String type;//���䶩��״̬
    private String buyerComment;//��ұ�ע
    private String closeReason;//�ر�ԭ��
    private String cancelReason;//ȡ��ԭ��
    private List<MerchantOrderCommodityVO> commodityList;//�����µ���Ʒ�б�

    public Integer getOrderSource() {
        return orderSource;
    }

    public void setOrderSource(Integer orderSource) {
        this.orderSource = orderSource;
    }

    public Byte getPayChannel() {
        return payChannel;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setPayChannel(Byte payChannel) {
        this.payChannel = payChannel;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public String getBuyerComment() {
        return buyerComment;
    }

    public void setBuyerComment(String buyerComment) {
        this.buyerComment = buyerComment;
    }

    public String getCloseReason() {
        return closeReason;
    }

    public void setCloseReason(String closeReason) {
        this.closeReason = closeReason;
    }

    public String getCancelReason() {
        return cancelReason;
    }

    public String getBuyerNickName() {
        return buyerNickName;
    }

    public void setBuyerNickName(String buyerNickName) {
        this.buyerNickName = buyerNickName;
    }

    public void setCancelReason(String cancelReason) {
        this.cancelReason = cancelReason;
    }

    public Integer getGuideId() {
        return guideId;
    }

    public void setGuideId(Integer guideId) {
        this.guideId = guideId;
    }

    public BigDecimal getIntegralAmount() {
        return integralAmount==null?new BigDecimal(0):integralAmount;
    }

    public void setIntegralAmount(BigDecimal integralAmount) {
        this.integralAmount = integralAmount;
    }

    public BigDecimal getExpressPrice() {
        return expressPrice;
    }

    public void setExpressPrice(BigDecimal expressPrice) {
        this.expressPrice = expressPrice;
    }

    public String getIntegralNum() {
        return integralNum;
    }
    public void setIntegralNum(String integralNum) {
        this.integralNum = integralNum;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getPaymentTime() {
        return paymentTime;
    }

    public void setPaymentTime(String paymentTime) {
        this.paymentTime = paymentTime;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getCommodityNum() {
        return commodityNum;
    }

    public void setCommodityNum(String commodityNum) {
        this.commodityNum = commodityNum;
    }

    public String getGuideName() {
        return guideName;
    }

    public void setGuideName(String guideName) {
        this.guideName = guideName;
    }

    public String getPaymentAmount() {
        return paymentAmount;
    }

    public void setPaymentAmount(String paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    public String getDiscountAmount() {
        return discountAmount;
    }

    public void setDiscountAmount(String discountAmount) {
        this.discountAmount = discountAmount;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public List<MerchantOrderCommodityVO> getCommodityList() {
        return commodityList;
    }

    public void setCommodityList(List<MerchantOrderCommodityVO> commodityList) {
        this.commodityList = commodityList;
    }

    public String getBuyerAccount() {
        return buyerAccount;
    }

    public void setBuyerAccount(String buyerAccount) {
        this.buyerAccount = buyerAccount;
    }

    @Override
    public String toString() {
        return "OrderVO{" +
                "orderNo='" + orderNo + '\'' +
                ", createTime='" + createTime + '\'' +
                ", paymentTime='" + paymentTime + '\'' +
                ", shopName='" + shopName + '\'' +
                ", commodityNum='" + commodityNum + '\'' +
                ", guideName='" + guideName + '\'' +
                ", buyerAccount='" + buyerAccount + '\'' +
                ", paymentAmount='" + paymentAmount + '\'' +
                ", discountAmount='" + discountAmount + '\'' +
                ", expressPrice='" + expressPrice + '\'' +
                ", integralAmount='" + integralAmount + '\'' +
                ", integralNum='" + integralNum + '\'' +
                ", orderStatus='" + orderStatus + '\'' +
                '}';
    }
}

package com.rongyi.easy.tradecenter.param;

/**
 * Created by jason
 * on 2015/11/5.17:33
 */
public class OsmOrderQueryParam
{

    private String orderStatus;//����״̬
    private String createOrderBegin;//����������ʼʱ��
    private String createOrderEnd;//������������ʱ��
    private String orderNo;//��������
    private String commodityNo;//��Ʒ����
    private String commodityName;//��Ʒ����
    private String buyerAccount;//����˺�
    private String buyerNickName;//����ǳ�
    private  String weidianName;//΢��id
    private  String guideName;//��������
    private  String currentPage;//��ǰҳ
    private  String sizePerPage;//ÿҳ����
    private String commodityStatus;//��Ʒ״̬
    Integer guideId;//����id

    public Integer getGuideId() {
        return guideId;
    }

    public void setGuideId(Integer guideId) {
        this.guideId = guideId;
    }

    public String getCommodityStatus() {
        return commodityStatus;
    }

    public void setCommodityStatus(String commodityStatus) {
        this.commodityStatus = commodityStatus;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getCreateOrderBegin() {
        return createOrderBegin;
    }

    public void setCreateOrderBegin(String createOrderBegin) {
        this.createOrderBegin = createOrderBegin;
    }

    public String getCreateOrderEnd() {
        return createOrderEnd;
    }

    public void setCreateOrderEnd(String createOrderEnd) {
        this.createOrderEnd = createOrderEnd;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getCommodityNo() {
        return commodityNo;
    }

    public void setCommodityNo(String commodityNo) {
        this.commodityNo = commodityNo;
    }

    public String getCommodityName() {
        return commodityName;
    }

    public void setCommodityName(String commodityName) {
        this.commodityName = commodityName;
    }

    public String getBuyerAccount() {
        return buyerAccount;
    }

    public void setBuyerAccount(String buyerAccount) {
        this.buyerAccount = buyerAccount;
    }

    public String getWeidianName() {
        return weidianName;
    }

    public void setWeidianName(String weidianName) {
        this.weidianName = weidianName;
    }

    public String getGuideName() {
        return guideName;
    }

    public void setGuideName(String guideName) {
        this.guideName = guideName;
    }

    public String getCurrentPage() {
        return currentPage;
    }

    public String getBuyerNickName() {
        return buyerNickName;
    }

    public void setBuyerNickName(String buyerNickName) {
        this.buyerNickName = buyerNickName;
    }

    public void setCurrentPage(String currentPage) {
        this.currentPage = currentPage;
    }

    public String getSizePerPage() {
        return sizePerPage;
    }

    public void setSizePerPage(String sizePerPage) {
        this.sizePerPage = sizePerPage;
    }

    @Override
    public String toString() {
        return "OsmOrderQueryParam{" +
                "orderStatus='" + orderStatus + '\'' +
                ", createOrderBegin='" + createOrderBegin + '\'' +
                ", createOrderEnd='" + createOrderEnd + '\'' +
                ", orderNo='" + orderNo + '\'' +
                ", commodityNo='" + commodityNo + '\'' +
                ", commodityName='" + commodityName + '\'' +
                ", buyerAccount='" + buyerAccount + '\'' +
                ", weidianName='" + weidianName + '\'' +
                ", guideName='" + guideName + '\'' +
                ", currentPage='" + currentPage + '\'' +
                ", sizePerPage='" + sizePerPage + '\'' +
                ", commodityStatus='" + commodityStatus + '\'' +
                ", guideId=" + guideId +
                '}';
    }
}

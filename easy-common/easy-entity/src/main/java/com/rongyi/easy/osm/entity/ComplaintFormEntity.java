package com.rongyi.easy.osm.entity;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import java.io.Serializable;
import java.util.Date;

public class ComplaintFormEntity implements Serializable {
    /**  */
    private Integer id;

    /** 申诉单号 */
    private String complaintNo;

    /** 退款单号 */
    private String refundNo;

    /** 申诉说明 */
    private String content;

    /** 申诉凭证 */
    private String imageUrl;

    /** 申诉状态：1：申诉中、2：申诉成功、3：申诉失败、4：申诉关闭 */
    private Integer status;

    /** 下次处理时间 */
    private Date nextStatusTime;

    /** 创建时间 */
    private Date createAt;

    /** 更新时间 */
    private Date updateAt;


    /**
     * 
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 申诉单号
     * @return complaintNo
     */
    public String getComplaintNo() {
        return complaintNo;
    }

    /**
     * 申诉单号
     * @param complaintNo
     */
    public void setComplaintNo(String complaintNo) {
        this.complaintNo = complaintNo;
    }

    /**
     * 退款单号
     * @return refundNo
     */
    public String getRefundNo() {
        return refundNo;
    }

    /**
     * 退款单号
     * @param refundNo
     */
    public void setRefundNo(String refundNo) {
        this.refundNo = refundNo;
    }

    /**
     * 申诉说明
     * @return content
     */
    public String getContent() {
        return content;
    }

    /**
     * 申诉说明
     * @param content
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * 申诉凭证
     * @return imageUrl
     */
    public String getImageUrl() {
        return imageUrl;
    }

    /**
     * 申诉凭证
     * @param imageUrl
     */
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    /**
     * 申诉状态：1：申诉中、2：申诉成功、3：申诉失败、4：申诉关闭
     * @return status
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 申诉状态：1：申诉中、2：申诉成功、3：申诉失败、4：申诉关闭
     * @param status
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 下次处理时间
     * @return nextStatusTime
     */
    public Date getNextStatusTime() {
        return nextStatusTime;
    }

    /**
     * 下次处理时间
     * @param nextStatusTime
     */
    public void setNextStatusTime(Date nextStatusTime) {
        this.nextStatusTime = nextStatusTime;
    }

    /**
     * 创建时间
     * @return createAt
     */
    public Date getCreateAt() {
        return createAt;
    }

    /**
     * 创建时间
     * @param createAt
     */
    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    /**
     * 更新时间
     * @return updateAt
     */
    public Date getUpdateAt() {
        return updateAt;
    }

    /**
     * 更新时间
     * @param updateAt
     */
    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.DEFAULT_STYLE);
    }
}
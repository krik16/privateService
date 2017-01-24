package com.rongyi.easy.osm.entity;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import java.io.Serializable;
import java.util.Date;

/**
 * 卖家备注信息
 */
public class OrderCommentEntity implements Serializable {
    /** 主键 */
    private Integer id;

    /** 订单号 */
    private String orderNo;

    /** 备注 */
    private String comment;

    /** 导购id */
    private String guideId;

    /** 导购昵称 */
    private String guideName;

    /** 是否禁用 0正常 1禁用 */
    private Byte isDisabled;

    /** 创建时间 */
    private Date createAt;

    /** 修改时间 */
    private Date updateAt;

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 主键
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 订单号
     * @return orderNo
     */
    public String getOrderNo() {
        return orderNo;
    }

    /**
     * 订单号
     * @param orderNo
     */
    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    /**
     * 备注
     * @return comment
     */
    public String getComment() {
        return comment;
    }

    /**
     * 备注
     * @param comment
     */
    public void setComment(String comment) {
        this.comment = comment;
    }

    /**
     * 导购id
     * @return guideId
     */
    public String getGuideId() {
        return guideId;
    }

    /**
     * 导购id
     * @param guideId
     */
    public void setGuideId(String guideId) {
        this.guideId = guideId;
    }

    /**
     * 导购昵称
     * @return guideName
     */
    public String getGuideName() {
        return guideName;
    }

    /**
     * 导购昵称
     * @param guideName
     */
    public void setGuideName(String guideName) {
        this.guideName = guideName;
    }

    /**
     * 是否禁用 0正常 1禁用
     * @return isDisabled
     */
    public Byte getIsDisabled() {
        return isDisabled;
    }

    /**
     * 是否禁用 0正常 1禁用
     * @param isDisabled
     */
    public void setIsDisabled(Byte isDisabled) {
        this.isDisabled = isDisabled;
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
     * 修改时间
     * @return updateAt
     */
    public Date getUpdateAt() {
        return updateAt;
    }

    /**
     * 修改时间
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
package com.rongyi.easy.rmmm.entity;

import java.io.Serializable;
import java.util.Date;

public class SmsLogInfoEntity implements Serializable{
    /** 主键 */
    private Integer id;

    /** 手机号码 */
    private String phone;

    /** 发送内容 */
    private String content;

    /** 发送渠道 1创世华信,2建周 */
    private Integer channel;

    /** 产品类型 1 mallShop 2,Malllife */
    private Integer productType;

    /** 发送类型 1注册，2找回密码，3登录4绑定时间 */
    private Integer sendModule;

    /** 创建时间 */
    private Date createAt;

    /** 发送时间 */
    private Date updateAt;

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
     * 手机号码
     * @return phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 手机号码
     * @param phone
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * 发送内容
     * @return content
     */
    public String getContent() {
        return content;
    }

    /**
     * 发送内容
     * @param content
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * 发送渠道 1创世华信,2建周
     * @return channel
     */
    public Integer getChannel() {
        return channel;
    }

    /**
     * 发送渠道 1创世华信,2建周
     * @param channel
     */
    public void setChannel(Integer channel) {
        this.channel = channel;
    }

    /**
     * 产品类型 1 mallShop 2,Malllife
     * @return productType
     */
    public Integer getProductType() {
        return productType;
    }

    /**
     * 产品类型 1 mallShop 2,Malllife
     * @param productType
     */
    public void setProductType(Integer productType) {
        this.productType = productType;
    }

    /**
     * 发送类型 1注册，2找回密码，3登录4绑定时间
     * @return sendModule
     */
    public Integer getSendModule() {
        return sendModule;
    }

    /**
     * 发送类型 1注册，2找回密码，3登录4绑定时间
     * @param sendModule
     */
    public void setSendModule(Integer sendModule) {
        this.sendModule = sendModule;
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
     * 发送时间
     * @return updateAt
     */
    public Date getUpdateAt() {
        return updateAt;
    }

    /**
     * 发送时间
     * @param updateAt
     */
    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }
}
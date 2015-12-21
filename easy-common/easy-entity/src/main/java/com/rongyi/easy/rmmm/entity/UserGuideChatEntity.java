package com.rongyi.easy.rmmm.entity;

import java.util.Date;
/**
 * 记录容易逛用户导购聊天历史
 * @author user
 *
 */
public class UserGuideChatEntity {
    /** 表id */
    private Integer id;

    /** 容易逛用户id */
    private String mallUserId;

    /** 导购id */
    private Integer guideId;

    /** 店铺mongoId */
    private String shopMid;

    /** 创建时间 */
    private Date createAt;

    /** 修改时间（最新时间） */
    private Date updateAt;

    /** 店铺mysqlId */
    private Integer shopId;
    
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getMallUserId() {
        return mallUserId;
    }
    public void setMallUserId(String mallUserId) {
        this.mallUserId = mallUserId;
    }
    public Integer getGuideId() {
        return guideId;
    }
    public void setGuideId(Integer guideId) {
        this.guideId = guideId;
    }
    public String getShopMid() {
        return shopMid;
    }
    public void setShopMid(String shopMid) {
        this.shopMid = shopMid;
    }
    public Date getCreateAt() {
        return createAt;
    }
    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }
    public Date getUpdateAt() {
        return updateAt;
    }
    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }
    public Integer getShopId() {
        return shopId;
    }
    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }
}
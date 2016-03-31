package com.rongyi.easy.smms;

import java.io.Serializable;
import java.util.Date;

public class Photos implements Serializable{
    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    /**  */
    private Long id;

    /** 图片名称 */
    private String name;

    /** 图片类型0产品详情图片 1标超营销2 大卖场营销 3便利店营销 */
    private Byte type;

    /** 属于营销图片 0 发布 1 关闭 */
    private Byte status;

    /** 商场id -1没有关联商场 直接关联集团 */
    private String mallId;

    /** 集团id */
    private String groupId;

    /** 创建时间 */
    private Date createdTime;

    /** 更新时间 */
    private Date updatedTime;

    /** 关联商品的id -1没有关联商品 */
    private Long commId;

    /**
     * 
     * @return id
     */
    public Long getId() {
        return id;
    }

    /**
     * 
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 图片名称
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 图片名称
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 图片类型0产品详情图片 1标超营销2 大卖场营销 3便利店营销
     * @return type
     */
    public Byte getType() {
        return type;
    }

    /**
     * 图片类型0产品详情图片 1标超营销2 大卖场营销 3便利店营销
     * @param type
     */
    public void setType(Byte type) {
        this.type = type;
    }

    /**
     * 属于营销图片 0 发布 1 关闭
     * @return status
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * 属于营销图片 0 发布 1 关闭
     * @param status
     */
    public void setStatus(Byte status) {
        this.status = status;
    }

    /**
     * 商场id -1没有关联商场 直接关联集团
     * @return mallId
     */
    public String getMallId() {
        return mallId;
    }

    /**
     * 商场id -1没有关联商场 直接关联集团
     * @param mallId
     */
    public void setMallId(String mallId) {
        this.mallId = mallId;
    }

    /**
     * 集团id
     * @return groupId
     */
    public String getGroupId() {
        return groupId;
    }

    /**
     * 集团id
     * @param groupId
     */
    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    /**
     * 创建时间
     * @return createdTime
     */
    public Date getCreatedTime() {
        return createdTime;
    }

    /**
     * 创建时间
     * @param createdTime
     */
    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * 更新时间
     * @return updatedTime
     */
    public Date getUpdatedTime() {
        return updatedTime;
    }

    /**
     * 更新时间
     * @param updatedTime
     */
    public void setUpdatedTime(Date updatedTime) {
        this.updatedTime = updatedTime;
    }

    /**
     * 关联商品的id -1没有关联商品
     * @return commId
     */
    public Long getCommId() {
        return commId;
    }

    /**
     * 关联商品的id -1没有关联商品
     * @param commId
     */
    public void setCommId(Long commId) {
        this.commId = commId;
    }
}
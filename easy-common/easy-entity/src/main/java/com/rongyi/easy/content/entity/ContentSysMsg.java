package com.rongyi.easy.content.entity;


import java.io.Serializable;
import java.util.Date;

public class ContentSysMsg implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/** 主键 */
    private Integer id;

    /** 创建人 */
    private Integer createBy;

    /** 创建时间 */
    private Date createAt;

    /** 修改人 */
    private Integer updateBy;

    /** 修改时间 */
    private Date updateAt;

    /** 版本 */
    private Integer version;

    /** 是否禁用0正常 1禁用 */
    private Integer isDisabled;

    /** 消息标题 */
    private String msgTitle;

    /** 状态代码 0未推送 1已推送 */
    private Integer msgStatus;

    /** 推送时间 */
    private Date msgPushtime;

    /** 消息外链 */
    private String msgLink;

    /** 消息内容 */
    private String msgContent;

    /** 推送对象 0 全部 1卖家 2买家 3指定用户 */
    private Integer msgType;


    private String userId;//用户ID

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCreateBy() {
        return createBy;
    }

    public void setCreateBy(Integer createBy) {
        this.createBy = createBy;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public Integer getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(Integer updateBy) {
        this.updateBy = updateBy;
    }

    public Date getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public Integer getIsDisabled() {
        return isDisabled;
    }

    public void setIsDisabled(Integer isDisabled) {
        this.isDisabled = isDisabled;
    }

    public String getMsgTitle() {
        return msgTitle;
    }

    public void setMsgTitle(String msgTitle) {
        this.msgTitle = msgTitle;
    }

    public Integer getMsgStatus() {
        return msgStatus;
    }

    public void setMsgStatus(Integer msgStatus) {
        this.msgStatus = msgStatus;
    }

    public Date getMsgPushtime() {
        return msgPushtime;
    }

    public void setMsgPushtime(Date msgPushtime) {
        this.msgPushtime = msgPushtime;
    }

    public String getMsgLink() {
        return msgLink;
    }

    public void setMsgLink(String msgLink) {
        this.msgLink = msgLink;
    }

    public String getMsgContent() {
        return msgContent;
    }

    public void setMsgContent(String msgContent) {
        this.msgContent = msgContent;
    }

    public Integer getMsgType() {
        return msgType;
    }

    public void setMsgType(Integer msgType) {
        this.msgType = msgType;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
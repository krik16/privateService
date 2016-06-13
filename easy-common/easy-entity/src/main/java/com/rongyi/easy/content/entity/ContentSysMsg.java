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

    /** 推送对象 0 全部 1卖家 2买家 3指定用户 4指定商场 5指定店铺*/
    private Integer msgType;

    /*相关ID 用户ID，摩店ID，商城ID*/
    private String objId;

    /**查看类型 -1所有可看，0集团管理员、1商场管理员、2品牌管理员、3分公司、4店长、5导购，6买手'**/
    private Integer roleType;

    /**
     * 关联的类型。0：默认；1：商品类
     */
    private Integer relateType;

    /**
     * false 未读  true 已读
     */
    private Boolean isRead;


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

    public String getObjId() {
        return objId;
    }

    public void setObjId(String objId) {
        this.objId = objId;
    }

    public Integer getRoleType() {
        return roleType;
    }

    public void setRoleType(Integer roleType) {
        this.roleType = roleType;
    }

    public Integer getRelateType() {
        return relateType;
    }

    public void setRelateType(Integer relateType) {
        this.relateType = relateType;
    }

    public Boolean getIsRead() {
        return isRead;
    }

    public void setIsRead(Boolean isRead) {
        this.isRead = isRead;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("ContentSysMsg{");
        sb.append("id=").append(id);
        sb.append(", createBy=").append(createBy);
        sb.append(", createAt=").append(createAt);
        sb.append(", updateBy=").append(updateBy);
        sb.append(", updateAt=").append(updateAt);
        sb.append(", version=").append(version);
        sb.append(", isDisabled=").append(isDisabled);
        sb.append(", msgTitle='").append(msgTitle).append('\'');
        sb.append(", msgStatus=").append(msgStatus);
        sb.append(", msgPushtime=").append(msgPushtime);
        sb.append(", msgLink='").append(msgLink).append('\'');
        sb.append(", msgContent='").append(msgContent).append('\'');
        sb.append(", msgType=").append(msgType);
        sb.append(", objId='").append(objId).append('\'');
        sb.append(", roleType=").append(roleType);
        sb.append(", relateType=").append(relateType);
        sb.append(", isRead=").append(isRead);
        sb.append('}');
        return sb.toString();
    }
}

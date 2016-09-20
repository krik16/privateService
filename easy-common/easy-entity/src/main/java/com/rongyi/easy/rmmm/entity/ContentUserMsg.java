package com.rongyi.easy.rmmm.entity;

import java.io.Serializable;
import java.util.Date;

public class ContentUserMsg implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**  */
    private Integer id;

    /**
     * 系统消息id
     */
    private Integer msgId;

    /**
     * 用户id(卖家)
     */
    private Integer sellerId;

    /**
     * 用户id(买家)
     */
    private String userMid;

    /**
     * 删除 -1 ;阅读 0 ;收藏 1;  2 ：未读.
     */
    private String status;

    private Date createAt;

    private Date updateAt;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 系统消息id
     *
     * @return msgId
     */
    public Integer getMsgId() {
        return msgId;
    }

    /**
     * 系统消息id
     *
     * @param msgId
     */
    public void setMsgId(Integer msgId) {
        this.msgId = msgId;
    }

    /**
     * 用户id(卖家)
     *
     * @return sellerId
     */
    public Integer getSellerId() {
        return sellerId;
    }

    /**
     * 用户id(卖家)
     *
     * @param sellerId
     */
    public void setSellerId(Integer sellerId) {
        this.sellerId = sellerId;
    }

    /**
     * 用户id(买家)
     *
     * @return userMid
     */
    public String getUserMid() {
        return userMid;
    }

    /**
     * 用户id(买家)
     *
     * @param userMid
     */
    public void setUserMid(String userMid) {
        this.userMid = userMid;
    }

    /**
     * 删除 -1 阅读 0 收藏 1
     *
     * @return status
     */
    public String getStatus() {
        return status;
    }

    /**
     * 删除 -1 阅读 0 收藏 1
     *
     * @param status
     */
    public void setStatus(String status) {
        this.status = status;
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

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("ContentUserMsg{");
        sb.append("id=").append(id);
        sb.append(", msgId=").append(msgId);
        sb.append(", sellerId=").append(sellerId);
        sb.append(", userMid='").append(userMid).append('\'');
        sb.append(", status='").append(status).append('\'');
        sb.append(", createAt=").append(createAt);
        sb.append(", updateAt=").append(updateAt);
        sb.append('}');
        return sb.toString();
    }
}

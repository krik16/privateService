package com.rongyi.easy.messagemanage.entity;

import java.io.Serializable;
import java.util.Date;
/**
 * 店铺公告审核不通过记录
 * @author lijing
 * @time 2015-09-06
 */
@SuppressWarnings("serial")
public class ShopNoticeRecord implements Serializable{
	/**id*/
    private Integer id;
    /**店铺公告id*/
    private Integer noticeId;
    /**不通过原因*/
    private String reason;
    /**创建时间*/
    private Date createAt;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getNoticeId() {
        return noticeId;
    }

    public void setNoticeId(Integer noticeId) {
        this.noticeId = noticeId;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }
}
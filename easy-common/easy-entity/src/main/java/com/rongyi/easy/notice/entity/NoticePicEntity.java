package com.rongyi.easy.notice.entity;

import java.io.Serializable;
import java.util.Date;
/**
 * 店铺公告图片
 * @author lijing
 * @time 2015-09-09
 *
 */
public class NoticePicEntity implements Serializable{
	/**id*/
    private Integer id;
    /**公告id*/
    private Integer noticeId;
    /**图片*/
    private String pic;
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

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }
}
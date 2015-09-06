package com.rongyi.easy.messagemanage.entity;

import java.io.Serializable;

/**
 * 店铺公告图片
 * @author lijing
 * @time 2015-09-06
 *
 */
@SuppressWarnings("serial")
public class ShopNoticePic implements Serializable {
	/**店铺公告图片id*/
    private Integer id;
    /**店铺公告id*/
    private Integer noticeId;
    /**图片  全路径*/
    private String pic;

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
}
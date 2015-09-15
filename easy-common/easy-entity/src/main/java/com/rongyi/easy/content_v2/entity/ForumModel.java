package com.rongyi.easy.content_v2.entity;

import java.io.Serializable;
import java.util.Date;
/**
 * 内容管理模版
 * @author lijing
 * @time 2015 08 31
 */
public class ForumModel implements Serializable {
	/**主键id*/
    private Integer id;
    /**模版类型的名字 V1代表banner  V2代表快捷入口   V3代表热点头条   V4代表卡卷推荐 V5代表活动推荐    V6代表明星店铺  如果还有新的依次推下去*/
    private String name;
    /**图片的格式 如png jpg 如果有多个 用;隔开*/
    private String imageFormat;
    /**图片像素大小的限制 如 500*500 */
    private String imagePixel;
    /**图片大小的显示 如 30   以K为单位*/
    private Integer imageSize;
    /**创建人*/
    private String createUser;
    /**创建时间*/
    private Date createAt;
    /**记录状态 0待发布、1已发布、2已关闭*/
    private Integer status;

    
    
    public String getCreateUser() {
		return createUser;
	}

	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}

	public Date getCreateAt() {
		return createAt;
	}

	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImageFormat() {
        return imageFormat;
    }

    public void setImageFormat(String imageFormat) {
        this.imageFormat = imageFormat;
    }

    public String getImagePixel() {
        return imagePixel;
    }

    public void setImagePixel(String imagePixel) {
        this.imagePixel = imagePixel;
    }

    public Integer getImageSize() {
        return imageSize;
    }

    public void setImageSize(Integer imageSize) {
        this.imageSize = imageSize;
    }

}
package com.rongyi.easy.contentnew.entity;

import java.io.Serializable;
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
    /**只有模块是热点推荐的才有3个默认的热点图标，使用;隔开*/
    private String hotImages;
    
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

    public String getHotImages() {
        return hotImages;
    }

    public void setHotImages(String hotImages) {
        this.hotImages = hotImages;
    }
}
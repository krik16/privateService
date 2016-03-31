package com.rongyi.easy.content_v2.vo;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import java.io.Serializable;

/**
 * 容易逛首页-热点头条
 * Created by Breggor on 2015/9/10.
 */
public class HotHeadlineVO implements Serializable {
    private Integer id;//id
    private String title;  //标题
    private String hotPic; //热点图标
    private String provId; //省份Id
    private String cityId; //城市Id
    private int type;  //文章类型
    private String typeVal;  // 文章Id
    private String publishBeginAt; //发布开始时间
    private String publishEndAt; //发布结束时间

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getHotPic() {
        return hotPic;
    }

    public void setHotPic(String hotPic) {
        this.hotPic = hotPic;
    }

    public String getProvId() {
        return provId;
    }

    public void setProvId(String provId) {
        this.provId = provId;
    }

    public String getCityId() {
        return cityId;
    }

    public void setCityId(String cityId) {
        this.cityId = cityId;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getTypeVal() {
        return typeVal;
    }

    public void setTypeVal(String typeVal) {
        this.typeVal = typeVal;
    }

    public String getPublishBeginAt() {
        return publishBeginAt;
    }

    public void setPublishBeginAt(String publishBeginAt) {
        this.publishBeginAt = publishBeginAt;
    }

    public String getPublishEndAt() {
        return publishEndAt;
    }

    public void setPublishEndAt(String publishEndAt) {
        this.publishEndAt = publishEndAt;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("id", id)
                .append("title", title)
                .append("hotPic", hotPic)
                .append("provId", provId)
                .append("cityId", cityId)
                .append("type", type)
                .append("typeVal", typeVal)
                .append("publishBeginAt", publishBeginAt)
                .append("publishEndAt", publishEndAt)
                .toString();
    }
}
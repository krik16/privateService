package com.rongyi.easy.content_v2.vo;

import java.io.Serializable;

/**
 * Created by WUH on 2017/1/4.
 * 断码好货详情VO
 */
public class ShortSizeVO implements Serializable {
    private static final long serialVersionUID = 1L;
    private Integer id;
    private Integer typeVal;
    private String title;       //标题
    private String headPic;     //头图
    private String introduction; //介绍文案
    private String url;                //跳转地址

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTypeVal() {
        return typeVal;
    }

    public void setTypeVal(Integer typeVal) {
        this.typeVal = typeVal;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getHeadPic() {
        return headPic;
    }

    public void setHeadPic(String headPic) {
        this.headPic = headPic;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}

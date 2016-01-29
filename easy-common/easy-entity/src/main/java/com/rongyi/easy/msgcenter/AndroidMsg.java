package com.rongyi.easy.msgcenter;

import java.io.Serializable;

/**
 * Description:
 * Author: 袁波
 * DATE: 2016/1/20 15:07
 * Package:com.rongyi.message.entity.dto
 * Project:easy-common
 */
public class AndroidMsg implements Serializable{
    private String title;
    private String description;
    private Integer notification_builder_id;
    private Integer notification_basic_style;
    private Integer open_type;
    private String url;
    private String pkg_content;
    private CustomContent custom_content;

    public AndroidMsg(String title,String content,Integer type,String code){
        this.custom_content=new CustomContent(code,type);
        this.title=title;
        this.description=content;
    }
    public AndroidMsg(String title,String content){
        this.title=title;
        this.description=content;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getNotification_builder_id() {
        return notification_builder_id;
    }

    public void setNotification_builder_id(Integer notification_builder_id) {
        this.notification_builder_id = notification_builder_id;
    }

    public Integer getNotification_basic_style() {
        return notification_basic_style;
    }

    public void setNotification_basic_style(Integer notification_basic_style) {
        this.notification_basic_style = notification_basic_style;
    }

    public Integer getOpen_type() {
        return open_type;
    }

    public void setOpen_type(Integer open_type) {
        this.open_type = open_type;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getPkg_content() {
        return pkg_content;
    }

    public void setPkg_content(String pkg_content) {
        this.pkg_content = pkg_content;
    }

    public CustomContent getCustom_content() {
        return custom_content;
    }

    public void setCustom_content(CustomContent custom_content) {
        this.custom_content = custom_content;
    }
}


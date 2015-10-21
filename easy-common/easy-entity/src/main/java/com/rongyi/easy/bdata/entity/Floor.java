package com.rongyi.easy.bdata.entity;

import org.apache.commons.lang.StringUtils;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;

import java.io.Serializable;
import java.util.List;

/**
 * Desc: floor info
 * User: chris
 * Date: 2015/10/25 12:52
 */

@Entity("zones")
public class Floor implements Serializable {
    @Id
    private String id;

    private String name;
    private Integer systemStatus;
    private Integer position;
    private List<String> parent_ids;
    private String parent_id;
    private String navigation_pic;
    private String pathImg;
    private String picture;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSystemStatus() {
        return systemStatus;
    }

    public void setSystemStatus(Integer systemStatus) {
        this.systemStatus = systemStatus;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    public List<String> getParent_ids() {
        return parent_ids;
    }

    public void setParent_ids(List<String> parent_ids) {
        this.parent_ids = parent_ids;
    }

    public String getParent_id() {
        return parent_id;
    }

    public void setParent_id(String parent_id) {
        this.parent_id = parent_id;
    }

    public String getNavigation_pic() {
        return navigation_pic;
    }

    public String getFullNavigation_pic() {
        if (StringUtils.isNotBlank(navigation_pic)) {
            return "http://rongyi.b0.upaiyun.com/system/mall_area/navigation_pic/2014/9/" + id + "/" + navigation_pic;
        } else {
            return null;
        }
    }

    public void setNavigation_pic(String navigation_pic) {
        this.navigation_pic = navigation_pic;
    }

    public String getPathImg() {
        return pathImg;
    }

    public String getFullPathImg() {
        if (StringUtils.isNotBlank(pathImg)) {
            return "http://rongyi.b0.upaiyun.com/system/mall_area/picture/" + id + "/" + pathImg;
        } else {
            return null;
        }
    }

    public void setPathImg(String pathImg) {
        this.pathImg = pathImg;
    }

    public String getPicture() {
        return picture;
    }

    public String getFullPicture() {
        if (StringUtils.isNotBlank(picture)) {
            return "http://rongyi.b0.upaiyun.com/system/mall_area/picture/" + id + "/" + picture;
        } else {
            return null;
        }
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

}

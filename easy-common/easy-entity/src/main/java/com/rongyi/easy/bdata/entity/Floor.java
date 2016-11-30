package com.rongyi.easy.bdata.entity;

import org.apache.commons.lang.StringUtils;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * Desc: floor info
 * User: chris
 * Date: 2015/10/25 12:52
 */

@Entity(value="zones", noClassnameStored = true)
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
    //private String swfpic;//步步高新增楼层动态导航图片 支持swf svg格式
    private Date   created_at;
    private Integer mall_valid ;

    private String swf;//swf图--商家后台用的
    private String fmap;//fmap图--商家后台用的
    private String aliasename;
    private String aliasname;
    private String   tMap;//图聚版地图


    public String gettMap() {
        return tMap;
    }

    public void settMap(String tMap) {
        this.tMap = tMap;
    }


    public String getAliasename() {
        return aliasename;
    }

    public void setAliasename(String aliasename) {
        this.aliasename = aliasename;
    }

    public String getAliasname() {
        return aliasname;
    }

    public void setAliasname(String aliasname) {
        this.aliasname = aliasname;
    }

    public String getSwf() {
		return swf;
	}
	public String getFmap() {
		return fmap;
	}



	public String getFullFmap() {
		 if (StringUtils.isNotBlank(fmap)) {
	            return "http://rongyi.b0.upaiyun.com/system/mall_area/picture/" + id + "/" + fmap;
	        } else {
	            return null;
	        }
	}
	public void setFmap(String fmap) {
		this.fmap = fmap;
	}
	public String getFullSwf() {
		 if (StringUtils.isNotBlank(swf)) {
	            return "http://rongyi.b0.upaiyun.com/system/mall_area/picture/" + id + "/" + swf;
	        } else {
	            return null;
	        }
	}
	public void setSwf(String swf) {
		this.swf = swf;
	}

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

    public Date getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }

    public String getNavigation_pic() {
        return navigation_pic;
    }

    public String getFullNavigation_pic() {
        if (StringUtils.isNotBlank(navigation_pic)) {
            //Calendar calendar = Calendar.getInstance();
            //calendar.setTime(created_at);
            //return "http://rongyi.b0.upaiyun.com/system/mall_area/navigation_pic/" + calendar.get(Calendar.YEAR) + "/" + (calendar.get(Calendar.MONTH) + 1) + "/" + id + "/" + navigation_pic;
            return "http://rongyi.b0.upaiyun.com/system/mall_area/navigation_pic/" + (new Date(created_at.toString()).getYear()+1900) + "/" + (new Date(created_at.toString()).getMonth() + 1) + "/" + id + "/" + navigation_pic;
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


	public Integer getMall_valid() {
		return mall_valid;
	}

	public void setMall_valid(Integer mall_valid) {
		this.mall_valid = mall_valid;
	}

    @Override
    public String toString() {
        return "Floor{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", systemStatus=" + systemStatus +
                ", position=" + position +
                ", parent_ids=" + parent_ids +
                ", parent_id='" + parent_id + '\'' +
                ", navigation_pic='" + navigation_pic + '\'' +
                ", pathImg='" + pathImg + '\'' +
                ", picture='" + picture + '\'' +
                ", created_at=" + created_at +
                ", mall_valid=" + mall_valid +
                ", swf='" + swf + '\'' +
                ", fmap='" + fmap + '\'' +
                ", aliasename='" + aliasename + '\'' +
                ", aliasname='" + aliasname + '\'' +
                '}';
    }
}

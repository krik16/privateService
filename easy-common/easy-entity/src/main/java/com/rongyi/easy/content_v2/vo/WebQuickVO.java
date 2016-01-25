package com.rongyi.easy.content_v2.vo;

import java.io.Serializable;
import java.util.List;

/**
 * Created by lijing on 2015/10/20.
 * 快捷入口详情
 */
public class WebQuickVO implements Serializable {
    /**快捷入口id*/
    private Integer id;
    /**ios版本*/
    private String iosVersion;
    /**安卓版本*/
    private String androidVersion;
    /**创建人*/
    private String createUser;
    /**创建时间*/
    private String createAt;
    /**修改人*/
    private String updateUser;
    /**修改时间*/
    private String updateAt;
    /**快捷列表*/
    private List<QuickDetailVO> quickList;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIosVersion() {
        return iosVersion;
    }

    public void setIosVersion(String iosVersion) {
        this.iosVersion = iosVersion;
    }

    public String getAndroidVersion() {
        return androidVersion;
    }

    public void setAndroidVersion(String androidVersion) {
        this.androidVersion = androidVersion;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public String getCreateAt() {
        return createAt;
    }

    public void setCreateAt(String createAt) {
        this.createAt = createAt;
    }

    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }

    public String getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(String updateAt) {
        this.updateAt = updateAt;
    }

    public List<QuickDetailVO> getQuickList() {
        return quickList;
    }

    public void setQuickList(List<QuickDetailVO> quickList) {
        this.quickList = quickList;
    }

    @Override
    public String toString() {
        return "WebQuickVO{" +
                "id=" + id +
                ", iosVersion='" + iosVersion + '\'' +
                ", androidVersion='" + androidVersion + '\'' +
                ", createUser='" + createUser + '\'' +
                ", createAt='" + createAt + '\'' +
                ", updateUser='" + updateUser + '\'' +
                ", updateAt='" + updateAt + '\'' +
                ", quickList=" + quickList +
                '}';
    }
}

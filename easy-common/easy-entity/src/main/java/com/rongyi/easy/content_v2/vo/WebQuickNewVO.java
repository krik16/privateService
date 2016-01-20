package com.rongyi.easy.content_v2.vo;

import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;
import java.util.List;

/**
 * Created by lijing on 2015/12/23 17:22
 * .com.rongyi.easy.content_v2.vo
 * easy-api
 */
public class WebQuickNewVO implements Serializable {
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

    private Integer positionId;

    /**
     * 快捷图标个数
     */
    private Integer quickCount;

    /**
     * 快捷入口备注
     */
    private String quickRemarks;
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

    public Integer getPositionId() {
        return positionId;
    }

    public void setPositionId(Integer positionId) {
        this.positionId = positionId;
    }

    public Integer getQuickCount() {
        return quickCount;
    }

    public void setQuickCount(Integer quickCount) {
        this.quickCount = quickCount;
    }

    public String getQuickRemarks() {
        return quickRemarks;
    }

    public void setQuickRemarks(String quickRemarks) {
        this.quickRemarks = quickRemarks;
    }

    public List<QuickDetailVO> getQuickList() {
        return quickList;
    }

    public void setQuickList(List<QuickDetailVO> quickList) {
        this.quickList = quickList;
    }


    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("id", id)
                .append("iosVersion", iosVersion)
                .append("androidVersion", androidVersion)
                .append("createUser", createUser)
                .append("createAt", createAt)
                .append("updateUser", updateUser)
                .append("updateAt", updateAt)
                .append("positionId", positionId)
                .append("quickCount", quickCount)
                .append("quickRemarks", quickRemarks)
                .append("quickList", quickList)
                .toString();
    }
}

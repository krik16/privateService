package com.rongyi.easy.code;

import java.io.Serializable;

/**
 * Created by shaozhou on 2016/7/21.
 */
public class HannelsUserInfoSearchParam implements Serializable {
    private String userAccount;//账号
    private String userNickName;//用户昵称
    private String userPhone;//用户手机号码
    private Integer identity;//身份 -1 全部 4:店长；5：导购
    private String mallId;//商场id
    private String shopId;//店铺id
    private int currentPage;//当前页（从1开始）
    private int pageSize;//每页显示数量（默认10）
    private int startIndex = 0;
    private int allSearch;// 0 不查询全部，1 查询全部

    public String getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(String userAccount) {
        this.userAccount = userAccount;
    }

    public String getUserNickName() {
        return userNickName;
    }

    public void setUserNickName(String userNickName) {
        this.userNickName = userNickName;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public Integer getIdentity() {
        return identity;
    }

    public void setIdentity(Integer identity) {
        this.identity = identity;
    }

    public String getMallId() {
        return mallId;
    }

    public void setMallId(String mallId) {
        this.mallId = mallId;
    }

    public String getShopId() {
        return shopId;
    }

    public void setShopId(String shopId) {
        this.shopId = shopId;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getStartIndex() {
        return startIndex;
    }

    public void setStartIndex(int startIndex) {
        this.startIndex = startIndex;
    }

    public int getAllSearch() {
        return allSearch;
    }

    public void setAllSearch(int allSearch) {
        this.allSearch = allSearch;
    }

    @Override
    public String toString() {
        return "HannelsUserInfoSearchParam{" +
                "userAccount='" + userAccount + '\'' +
                ", userNickName='" + userNickName + '\'' +
                ", userPhone='" + userPhone + '\'' +
                ", identity=" + identity +
                ", mallId='" + mallId + '\'' +
                ", shopId='" + shopId + '\'' +
                ", currentPage=" + currentPage +
                ", pageSize=" + pageSize +
                ", startIndex=" + startIndex +
                ", allSearch=" + allSearch +
                '}';
    }
}

package com.rongyi.easy.malllife.param;/*
 * Copyright (C),上海容易网电子商务有限公司
 * Author:  俞志坚
 * Description:  
 * time:  2015/9/15
 * History: 变更记录
 * <author>           <time>             <version>        <desc>
 * 俞志坚             2015/9/15              1.0            创建文件
 *
 */

import java.io.Serializable;

import org.apache.commons.lang.builder.ToStringBuilder;

public class MalllifeBaseParam implements Serializable {

    private static final long serialVersionUID = 1L;

    private String  jsessionid;//用户信息jsessionid
    private String  appVersion; //APP版本号
    private String  appType; // 0 表示 ios,1表示 android
    @Deprecated  // 当前 前端未传值 获取数据错误！！！！！！！ 直接使用from
    private Integer currentPage; //当前页数
    private Integer pageSize = Integer.MAX_VALUE;//每页显示数

    // 设备号
    private String uuId;

    public String getJsessionid() {
        return jsessionid;
    }

    public void setJsessionid(String jsessionid) {
        this.jsessionid = jsessionid;
    }

    public String getAppVersion() {
        return appVersion;
    }

    public void setAppVersion(String appVersion) {
        this.appVersion = appVersion;
    }

    public String getAppType() {
        return appType;
    }

    public void setAppType(String appType) {
        this.appType = appType;
    }

    public Integer getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public String getUuId() {
        return uuId;
    }

    public void setUuId(String uuId) {
        this.uuId = uuId;
    }

    @Override
	public String toString() {
		return "MalllifeBaseParam [jsessionid=" + jsessionid + ", appVersion=" + appVersion + ", appType=" + appType
				+ ", currentPage=" + currentPage + ", pageSize=" + pageSize + "]";
	}
}

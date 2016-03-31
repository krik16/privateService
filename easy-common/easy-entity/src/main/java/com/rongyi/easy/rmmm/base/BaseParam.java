package com.rongyi.easy.rmmm.base;/*
 * Copyright (C),上海容易网电子商务有限公司
 * Author:  俞志坚
 * Description:  参数基类
 * time:  2015/9/10
 * History: 变更记录
 * <author>           <time>             <version>        <desc>
 * 俞志坚             2015/9/10              1.0            创建文件
 *
 */

import java.io.Serializable;

public class BaseParam implements Serializable{
    private static final long serialVersionUID = 1L;

    private String  jsessionid;//用户信息jsessionid
    private String  appVersion; //APP版本号
    private String  appType; // 0 表示 ios,1表示 android


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
}

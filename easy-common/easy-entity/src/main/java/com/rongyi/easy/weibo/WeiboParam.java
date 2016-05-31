package com.rongyi.easy.weibo;

import com.rongyi.easy.malllife.param.MalllifeBaseParam;

/*
 * Description:  
 * Author: yuzhijian 
 * History: 变更记录
 * <Author>     <time>    <version>    <desc>
 * yuzhijian      2016/5/9    1.0        创建文件 
 * Copyright (C): 上海容易网电子商务股份有限公司
 */
public class WeiboParam extends MalllifeBaseParam {


    private String redirectUrl; //需要访问的地址

    private String responseType;

    private String code;

    private String accessToken;

    private String uid;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getResponseType() {
        return responseType;
    }

    public void setResponseType(String responseType) {
        this.responseType = responseType;
    }

    public String getRedirectUrl() {
        return redirectUrl;
    }

    public void setRedirectUrl(String redirectUrl) {
        this.redirectUrl = redirectUrl;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }
}

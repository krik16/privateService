package com.rongyi.easy.malllife.vo;

import java.io.Serializable;

/*
 * Description:  
 * Author: yuzhijian 
 * History: 变更记录
 * <Author>     <time>    <version>    <desc>
 * 俞志坚       2017/1/11    1.0        创建文件 
 * Copyright (C): 上海容易网电子商务股份有限公司
 */
public class ShareTitleVo implements Serializable {


    static final long serialVersionUID = 1L;

   private  String objId;
    private  String shareTile;
    private  String  shareDesc;
    private  String shareUrl;
    private String picUrl;

    private String activityUrl;

    public String getObjId() {
        return objId;
    }

    public void setObjId(String objId) {
        this.objId = objId;
    }

    public String getShareTile() {
        return shareTile;
    }

    public void setShareTile(String shareTile) {
        this.shareTile = shareTile;
    }

    public String getShareDesc() {
        return shareDesc;
    }

    public void setShareDesc(String shareDesc) {
        this.shareDesc = shareDesc;
    }

    public String getShareUrl() {
        return shareUrl;
    }

    public void setShareUrl(String shareUrl) {
        this.shareUrl = shareUrl;
    }

    public String getPicUrl() {
        return picUrl;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
    }

    public String getActivityUrl() {
        return activityUrl;
    }

    public void setActivityUrl(String activityUrl) {
        this.activityUrl = activityUrl;
    }
}

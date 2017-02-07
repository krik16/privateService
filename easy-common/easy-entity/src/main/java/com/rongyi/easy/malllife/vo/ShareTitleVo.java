package com.rongyi.easy.malllife.vo;

import java.io.Serializable;

/*
 * Description:  
 * Author: yuzhijian 
 * History: 变更记录
 * <Author>     <time>    <version>    <desc>
 * 俞志坚       2016/12/26    1.0        创建文件 
 * Copyright (C): 上海容易网电子商务股份有限公司
 */
public class ShareTitleVo implements Serializable {

    static final long serialVersionUID = 1L;

    private String shareTile;//对象标题

    private String shareUrl;//对象ＵＲＬ地址

    private String shareDesc; //描述 没有为空

    private String objId; //对象Id


    public String getShareTile() {
        return shareTile;
    }

    public void setShareTile(String shareTile) {
        this.shareTile = shareTile;
    }

    public String getShareUrl() {
        return shareUrl;
    }

    public void setShareUrl(String shareUrl) {
        this.shareUrl = shareUrl;
    }

    public String getShareDesc() {
        return shareDesc;
    }

    public void setShareDesc(String shareDesc) {
        this.shareDesc = shareDesc;
    }

    public String getObjId() {
        return objId;
    }

    public void setObjId(String objId) {
        this.objId = objId;
    }
}

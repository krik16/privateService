package com.rongyi.easy.malllife.red.vo;

import com.rongyi.easy.malllife.vo.MalllifeVoBase;

import java.io.Serializable;

/*
 * Description:  
 * Author: yuzhijian 
 * History: 变更记录
 * <Author>     <time>    <version>    <desc>
 * yuzhijian      2016/5/6    1.0        创建文件 
 * Copyright (C): 上海容易网电子商务股份有限公司
 */
public class ShareRedVo extends MalllifeVoBase {


    private String  picBackUrl;//	背景图片
    private String  picShareUrl;//	分享图片
    private String  picUrl;//	悬浮图片
    private int  redNum;//	红包数量		@mock=12
    private String  shareDes;//	分享描述
    private String  shareTitle;//	分享标题
    private String  shareUrl;//	配置地址分享地址

    public String getPicBackUrl() {
        return picBackUrl;
    }

    public void setPicBackUrl(String picBackUrl) {
        this.picBackUrl = picBackUrl;
    }

    public String getPicShareUrl() {
        return picShareUrl;
    }

    public void setPicShareUrl(String picShareUrl) {
        this.picShareUrl = picShareUrl;
    }

    public String getPicUrl() {
        return picUrl;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
    }

    public int getRedNum() {
        return redNum;
    }

    public void setRedNum(int redNum) {
        this.redNum = redNum;
    }

    public String getShareDes() {
        return shareDes;
    }

    public void setShareDes(String shareDes) {
        this.shareDes = shareDes;
    }

    public String getShareTitle() {
        return shareTitle;
    }

    public void setShareTitle(String shareTitle) {
        this.shareTitle = shareTitle;
    }

    public String getShareUrl() {
        return shareUrl;
    }

    public void setShareUrl(String shareUrl) {
        this.shareUrl = shareUrl;
    }
}

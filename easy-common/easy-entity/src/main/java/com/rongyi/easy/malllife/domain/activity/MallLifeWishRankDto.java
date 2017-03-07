package com.rongyi.easy.malllife.domain.activity;

import java.io.Serializable;

/*
 * Description:  
 * Author: yuzhijian 
 * History: 变更记录
 * <Author>     <time>    <version>    <desc>
 * 俞志坚       2017/2/20    1.0        创建文件 
 * Copyright (C): 上海容易网电子商务股份有限公司
 */
public class MallLifeWishRankDto implements Serializable {


   private static final long serialVersionUID = 1L;


    private int rankCount;//排行榜

    private String logPic;  //容易逛头像

    private String nickName;  //容易逛呢称

    private int wishCount;  //点赞计数

    private int isYou=0;//1 表示当前登录者

    private String wechatLog;  //微信头像

    private String wechatNickName;  //微信呢称


    public int getRankCount() {
        return rankCount;
    }

    public void setRankCount(int rankCount) {
        this.rankCount = rankCount;
    }

    public String getLogPic() {
        return logPic;
    }

    public void setLogPic(String logPic) {
        this.logPic = logPic;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public int getWishCount() {
        return wishCount;
    }

    public void setWishCount(int wishCount) {
        this.wishCount = wishCount;
    }

    public int getIsYou() {
        return isYou;
    }

    public void setIsYou(int isYou) {
        this.isYou = isYou;
    }

    public String getWechatLog() {
        return wechatLog;
    }

    public void setWechatLog(String wechatLog) {
        this.wechatLog = wechatLog;
    }

    public String getWechatNickName() {
        return wechatNickName;
    }

    public void setWechatNickName(String wechatNickName) {
        this.wechatNickName = wechatNickName;
    }
}

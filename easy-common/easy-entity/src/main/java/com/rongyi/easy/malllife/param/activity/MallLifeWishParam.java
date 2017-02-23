package com.rongyi.easy.malllife.param.activity;

import com.rongyi.easy.malllife.param.MalllifeBaseParam;
import org.apache.commons.lang.builder.ReflectionToStringBuilder;

/**
 * Created by wuhui on 2017/2/17.
 * 蜜桃节与前端交互对象
 */
public class MallLifeWishParam extends MalllifeBaseParam {
    private int id;
    private String wishName; //姓名
    private String wishContent;  //许愿内容
    private String wishPreInstall; //蜜桃节预设文案
    private String wishPicture; //蜜桃节许愿图片
    private String openId;  //openId
    private String wechatLog;  //微信头像
    private String wechatNickName;  //微信呢称
    private String logPic;  //容易逛头像
    private String nickName;  //容易逛呢称

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getWishName() {
        return wishName;
    }

    public void setWishName(String wishName) {
        this.wishName = wishName;
    }

    public String getWishContent() {
        return wishContent;
    }

    public void setWishContent(String wishContent) {
        this.wishContent = wishContent;
    }

    public String getWishPreInstall() {
        return wishPreInstall;
    }

    public void setWishPreInstall(String wishPreInstall) {
        this.wishPreInstall = wishPreInstall;
    }

    public String getWishPicture() {
        return wishPicture;
    }

    public void setWishPicture(String wishPicture) {
        this.wishPicture = wishPicture;
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
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

    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}

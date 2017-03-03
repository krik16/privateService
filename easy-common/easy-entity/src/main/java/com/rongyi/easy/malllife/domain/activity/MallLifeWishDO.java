package com.rongyi.easy.malllife.domain.activity;

import com.rongyi.easy.malllife.param.activity.MallLifeWishParam;
import org.apache.commons.lang.builder.ReflectionToStringBuilder;
import org.springframework.util.Assert;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by wuhui on 2017/2/17.
 * 蜜桃节活动与数据库交互对象
 */
public class MallLifeWishDO implements Serializable {
    private int id;
    private String wishName; //姓名
    private String wishContent;  //许愿内容
    private String wishPreInstall; //蜜桃节预设文案
    private String wishPicture; //蜜桃节许愿图片
    private String userId;  //用户ID
    private String openId;  //openId
    private String wechatLog;  //微信头像
    private String wechatNickName;  //微信呢称
    private Date createAt;  //创建时间
    private String logPic;  //容易逛头像
    private String nickName;  //容易逛呢称
    private int wishCount;  //点赞计数
    private Date updateAt;  //更新时间

    public MallLifeWishDO(){}

    public MallLifeWishDO(MallLifeWishParam mallLifeWishParam){
        Assert.notNull(mallLifeWishParam);
        this.setId(mallLifeWishParam.getId());
        this.setWishName(mallLifeWishParam.getWishName());
        this.setWishContent(mallLifeWishParam.getWishContent());
        this.setWishPreInstall(mallLifeWishParam.getWishPreInstall());
        this.setWishPicture(mallLifeWishParam.getWishPicture());
        this.setOpenId(mallLifeWishParam.getOpenId());
        this.setWechatLog(mallLifeWishParam.getWechatLog());
        this.setWechatNickName(mallLifeWishParam.getWechatNickName());
        this.setLogPic(mallLifeWishParam.getLogPic());
        this.setNickName(mallLifeWishParam.getNickName());
    }

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

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
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

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
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

    public Date getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }

    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}

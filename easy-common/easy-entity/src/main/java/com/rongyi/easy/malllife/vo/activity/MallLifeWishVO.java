package com.rongyi.easy.malllife.vo.activity;

import com.rongyi.easy.malllife.domain.activity.MallLifeWishDO;
import com.rongyi.easy.malllife.domain.activity.MallLifeWishRecordDO;
import org.apache.commons.lang.builder.ReflectionToStringBuilder;
import org.springframework.util.Assert;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by wuhui on 2017/2/17.
 * 蜜桃节返回前端对象
 */
public class MallLifeWishVO implements Serializable {
    private int id;
    private String wishName; //姓名
    private String wishContent;  //许愿内容
    private String userId;  //用户ID
    private String openId;  //openId
    private String wechatLog;  //微信头像
    private String wechatNickName;  //微信呢称
    private Date createAt;  //创建时间
    private String logPic;  //容易逛头像
    private String nickName;  //容易逛呢称
    private int wishCount;  //点赞计数
    private Date updateAt;  //更新时间
    private int rank;  //排行榜

    public MallLifeWishVO(){}

    public MallLifeWishVO(MallLifeWishDO wishDO){
        Assert.notNull(wishDO);
        this.setId(wishDO.getId());
        this.setWishName(wishDO.getWishName());
        this.setWishContent(wishDO.getWishContent());
        this.setUserId(wishDO.getUserId());
        this.setOpenId(wishDO.getOpenId());
        this.setWechatLog(wishDO.getWechatLog());
        this.setWechatNickName(wishDO.getWechatNickName());
        this.setCreateAt(wishDO.getCreateAt());
        this.setLogPic(wishDO.getLogPic());
        this.setNickName(wishDO.getNickName());
        this.setWishCount(wishDO.getWishCount());
        this.setUpdateAt(wishDO.getUpdateAt());

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

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}

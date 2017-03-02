package com.rongyi.easy.malllife.domain.activity;

import com.rongyi.easy.malllife.param.activity.MallLifeWishParam;
import org.apache.commons.lang.builder.ReflectionToStringBuilder;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by wuhui on 2017/2/17.
 * 蜜桃节活动点赞与数据库交互对象
 */
public class MallLifeWishRecordDO implements Serializable {
    private int id;
    private int wishId;
    private String userId;
    private String openId;
    private Date createAt;

    public MallLifeWishRecordDO(){}

    public MallLifeWishRecordDO(MallLifeWishParam mallLifeWishParam){
        this.setWishId(mallLifeWishParam.getId());
        this.setOpenId(mallLifeWishParam.getOpenId());
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getWishId() {
        return wishId;
    }

    public void setWishId(int wishId) {
        this.wishId = wishId;
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

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}

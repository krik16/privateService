package com.rongyi.easy.malllife.webchat;

import com.rongyi.easy.coupon.vo.ActivityCouponVO;

import java.io.Serializable;
import java.util.List;

/*
 * Description:  
 * Author: yuzhijian 
 * History: 变更记录
 * <Author>     <time>    <version>    <desc>
 * 俞志坚       2017/2/7    1.0        创建文件 
 * Copyright (C): 上海容易网电子商务股份有限公司
 */
public class ActivityRedVo implements Serializable {

    static final long serialVersionUID = 1L;


    //当前系统时间
    private Long  activityTime=0L;


    //用户电话号码
    private String userPhone;


    //卡券信息
    List<ActivityCouponVO>  activityCouponVOList;

    //是否已经领取过
    private Boolean istrue=false;

    public Boolean getIstrue() {
        return istrue;
    }

    public void setIstrue(Boolean istrue) {
        this.istrue = istrue;
    }

    public Long getActivityTime() {
        return activityTime;
    }

    public void setActivityTime(Long activityTime) {
        this.activityTime = activityTime;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public List<ActivityCouponVO> getActivityCouponVOList() {
        return activityCouponVOList;
    }

    public void setActivityCouponVOList(List<ActivityCouponVO> activityCouponVOList) {
        this.activityCouponVOList = activityCouponVOList;
    }
}

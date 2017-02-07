package com.rongyi.easy.malllife.param.user;/*
 * Copyright (C),上海容易网电子商务有限公司
 * Author:  俞志坚
 * Description:  
 * time:  2016/3/17
 * History: 变更记录
 * <author>           <time>             <version>        <desc>
 * 俞志坚             2016/3/17              1.0            创建文件
 *
 */

import com.rongyi.easy.malllife.param.MalllifeBaseParam;

public class WebChatParam extends MalllifeBaseParam {

    private String openId;//微信openId

   // Valentine's day (情人节代码 VALDAY )
    private String activityCode;//活动代码

    private String activityTitle;//活动代码

    public String getActivityCode() {
        return activityCode;
    }

    public void setActivityCode(String activityCode) {
        this.activityCode = activityCode;
    }

    public String getActivityTitle() {
        return activityTitle;
    }

    public void setActivityTitle(String activityTitle) {
        this.activityTitle = activityTitle;
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }
}

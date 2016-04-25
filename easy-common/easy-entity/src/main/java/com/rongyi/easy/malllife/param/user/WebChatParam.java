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


    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }
}

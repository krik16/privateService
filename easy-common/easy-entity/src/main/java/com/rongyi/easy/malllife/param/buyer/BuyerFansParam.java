package com.rongyi.easy.malllife.param.buyer;/*
 * Copyright (C),上海容易网电子商务有限公司
 * Author:  俞志坚
 * Description:  
 * time:  2015/10/20
 * History: 变更记录
 * <author>           <time>             <version>        <desc>
 * 俞志坚             2015/10/20              1.0            创建文件
 *
 */

import com.rongyi.easy.malllife.param.MalllifeBaseParam;

public class BuyerFansParam extends MalllifeBaseParam{

    private Integer userId;//卖家Id

    private String mallLifeUserId;//买

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}

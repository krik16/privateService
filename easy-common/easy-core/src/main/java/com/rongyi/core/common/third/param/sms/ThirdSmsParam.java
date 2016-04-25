package com.rongyi.core.common.third.param.sms;/*
 * Copyright (C),上海容易网电子商务有限公司
 * Author:  俞志坚
 * Description:  
 * time:  2016/4/8
 * History: 变更记录
 * <author>           <time>             <version>        <desc>
 * 俞志坚             2016/4/8              1.0            创建文件
 *
 */

import com.rongyi.core.common.third.param.ThirdBaseParam;

public class ThirdSmsParam extends ThirdBaseParam{

    private int sendType=0;//1通知类短信 2 营销类短信

    public int getSendType() {
        return sendType;
    }

    public void setSendType(int sendType) {
        this.sendType = sendType;
    }
}

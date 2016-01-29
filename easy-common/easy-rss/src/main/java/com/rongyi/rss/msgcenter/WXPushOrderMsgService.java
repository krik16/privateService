package com.rongyi.rss.msgcenter;

import com.rongyi.easy.msgcenter.OrderPushParam;

/**
 * Description:微信端推送订单状态消息给用户
 * Author: 袁波
 * DATE: 2016/1/13 14:43
 * Package:com.rongyi.rss.msgcenter
 * Project:message-center
 */
public interface WXPushOrderMsgService {
    public void pushMessage(OrderPushParam orderPushParam);
}

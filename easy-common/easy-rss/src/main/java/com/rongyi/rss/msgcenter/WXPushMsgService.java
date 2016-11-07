package com.rongyi.rss.msgcenter;

import com.rongyi.easy.msgcenter.wx.SWXMessageParam;

/**
 * Description:给微信用户发送消息
 * Author: 袁波
 * DATE: 2016/10/19 10:39
 * Package:com.rongyi.rss.msgcenter
 * Project:easy-market
 */
public interface WXPushMsgService {
    /**
     *  openid 需要发送对象的微信openId
     *  mallid 发送对象所关注的公众号的商场id
     *  templateid  发送消息的模板
     *  url 消息点击的跳转的链接
     *  WXMsgContent 消息内容
     * @param swxMessageParam
     * @return
     */
    public Boolean pushMsg(SWXMessageParam  swxMessageParam);
}

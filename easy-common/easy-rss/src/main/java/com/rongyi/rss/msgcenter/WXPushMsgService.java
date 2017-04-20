package com.rongyi.rss.msgcenter;

import com.rongyi.easy.msgcenter.wx.SWXMessageBaseParam;
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
     *  SWXMessageBaseParam 子类
     *      SWXMessageParam 固定 keyword1...keyword5
     *      SWXMessageUnsetParam 自定义参数名和值
     * @param swxMessageBaseParam
     * @return
     */
    public Boolean pushMsg(SWXMessageBaseParam swxMessageBaseParam);


}

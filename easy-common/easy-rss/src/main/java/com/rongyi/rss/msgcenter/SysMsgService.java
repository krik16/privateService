package com.rongyi.rss.msgcenter;

import com.rongyi.easy.msgcenter.MessageDTO;

/**
 * Description:系统消息对外接口
 * Author: 袁波
 * DATE: 2016/6/7 18:30
 * Package:com.rongyi.rss.msgcenter
 * Project:easy-mobile
 */
public interface SysMsgService {
    public void createSysMsg(MessageDTO messageDTO);
}

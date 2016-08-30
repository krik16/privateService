package com.rongyi.rss.msgcenter;

import com.rongyi.easy.msgcenter.MessageDTO;
import com.rongyi.easy.msgcenter.UserMsgDTO;

/**
 * Description:系统消息对外接口
 * Author: 袁波
 * DATE: 2016/6/7 18:30
 * Package:com.rongyi.rss.msgcenter
 * Project:easy-mobile
 */
public interface SysMsgService {
    /**
     * 商品下架系统消息接口
     * @param messageDTO
     */
    public void createSysMsg(MessageDTO messageDTO);

    /**
     * 心愿单回复创建一条系统消息
     * @param userMsgDTO
     */
    public void createUserSysMsg(UserMsgDTO userMsgDTO);

}

package com.rongyi.rss.msgcenter;

import com.rongyi.easy.msgcenter.PushAppMsgDTO;

import java.util.List;

/**
 * Created by shaozhou on 2016/8/8.
 */
public interface PushAppMsgService {
    /**
     * 给app推送消息
     * @param userIds
     * @param message
     * @param title
     */
    void pushAppMessage(PushAppMsgDTO pushAppMsgDTO);
}

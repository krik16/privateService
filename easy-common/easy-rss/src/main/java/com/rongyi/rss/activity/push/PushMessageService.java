package com.rongyi.rss.activity.push;

import com.rongyi.easy.msgcenter.PushMessageDTO;

/**
 * Description:
 * Author: 袁波
 * Time: 16:42
 * Package:com.rongyi.rss.activity.push
 * Project:easy-market
 */
public interface PushMessageService {
    public String pushMsgToSingleDevice(PushMessageDTO pushSingleDeviceDTO);
    public String pushMsgToAll(PushMessageDTO pushMessageDTO) ;
}

package com.rongyi.rss.activity.push;

import com.rongyi.easy.activity.entity.dto.PushMessageDTO;

/**
 * Description:
 * Author: 袁波
 * Time: 16:42
 * Package:com.rongyi.rss.activity.push
 * Project:easy-market
 */
public interface PushMessageService {
    public void pushMsgToSingleDevice(PushMessageDTO pushSingleDeviceDTO);
    public void pushMsgToAll(PushMessageDTO pushMessageDTO) ;
}

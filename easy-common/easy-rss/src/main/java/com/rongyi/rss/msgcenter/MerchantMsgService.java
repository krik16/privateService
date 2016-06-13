package com.rongyi.rss.msgcenter;

import com.rongyi.easy.content.entity.ContentSysMsg;
import com.rongyi.easy.msgcenter.merchant.MsgListParam;
import com.rongyi.easy.msgcenter.merchant.StatisticsVO;

import java.util.List;

/**
 * Description:商家后台系统消息接口
 * Author: 袁波
 * DATE: 2016/6/13 14:18
 * Package:com.rongyi.content.service
 * Project:easy-mobile
 */
public interface MerchantMsgService {

    public ContentSysMsg findById(Integer id);

    /**
     * 新建
     * @return
     */
    public boolean create(ContentSysMsg contentSysMsg);


    /**
     *
     * @return
     */
    public List<ContentSysMsg> getMsgList(MsgListParam msgListParam);

    /**
     * 标记为已读
     * @param ids
     * @return
     */
    public boolean read(List<Integer> ids);

    /**
     * 批量删除
     * @param ids
     * @return
     */
    public boolean delete(List<Integer> ids);

    /**
     * 统计
     * @return
     */
    public StatisticsVO statistics();

}

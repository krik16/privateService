package com.rongyi.rss.messagement;

import com.rongyi.easy.messagemanage.param.CNoticeParam;

public interface MMShopNoticeService {
    /**
     * 新增店铺公告
     * @param np
     * @return
     * @throws Exception
     */
    public Boolean saveNotice(CNoticeParam np) throws Exception;
    
    /**
     * 修改店铺公告
     * @param np
     * @return
     * @throws Exception
     */
    public Boolean updateNotice(CNoticeParam np) throws Exception;
    
    /**
     * 删除店铺公告 通过id
     * @param id
     * @param updateUserId 用户id
     * @return
     * @throws Exception
     */
    public Boolean deleteNotice(Integer id,String updateUserId) throws Exception;
}

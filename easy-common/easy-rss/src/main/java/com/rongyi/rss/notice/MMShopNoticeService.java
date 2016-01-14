package com.rongyi.rss.notice;

import com.rongyi.core.common.PagingVO;
import com.rongyi.easy.notice.param.CNoticeParam;
import com.rongyi.easy.notice.param.MMNoticeParam;
import com.rongyi.easy.notice.param.MSNoticeParam;
import com.rongyi.easy.notice.vo.MMNoticeVO;
import com.rongyi.easy.notice.vo.NoticeVO;

public interface MMShopNoticeService {
    /**
     * 新增店铺公告
     *
     * @param np
     * @return
     * @throws Exception
     */
    public Boolean saveNotice(CNoticeParam np) throws Exception;

    /**
     * 修改店铺公告
     *
     * @param np
     * @return
     * @throws Exception
     */
    public Boolean updateNotice(CNoticeParam np) throws Exception;

    /**
     * 删除店铺公告 通过id
     *
     * @param id
     * @param updateUserId 用户id
     * @return
     * @throws Exception
     */
    public Boolean deleteNotice(Integer id, String updateUserId) throws Exception;

    /**
     * 通过店铺公告id 查询
     *
     * @param id
     * @return
     */
    public NoticeVO findNoticePById(Integer id) throws Exception;

    /**
     * 容易逛查询店铺公告的的接口
     *
     * @param mmnotice
     * @return
     */
    public PagingVO<MMNoticeVO> findNoticesByParam(MMNoticeParam mmnotice);

    /**
     * 摩店查询店铺公告的接口
     *
     * @param msnotice
     * @return
     */
    public PagingVO<MMNoticeVO> findNoticesByMSParam(MSNoticeParam msnotice);

    /**
     * 根据店铺查询公告
     *
     * @param shopId
     * @return
     */
    String findNoticeByShopId(String shopId);
}

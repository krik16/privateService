package com.rongyi.rss.notice;

import com.rongyi.core.common.PagingVO;
import com.rongyi.easy.notice.entity.NoticeEntity;
import com.rongyi.easy.notice.param.CheckParam;
import com.rongyi.easy.notice.param.NoticeQueryParam;
import com.rongyi.easy.notice.vo.MMNoticeVO;

import java.util.List;

/**
 * Descriptions: 后台页面接口类
 * Created by 袁波
 * Created at 2015/9/17 14:55.
 */
public interface INoticeService {
    /**
     * 审核店铺公告
     *
     * @param checkParam
     * @return
     */
    public Boolean checkNotice(CheckParam checkParam, String userId);

    /**
     * 下线店铺公告
     *
     * @param checkParam
     * @param userId
     * @return
     */
    public Boolean logOffNotice(CheckParam checkParam, String userId);
    /**
     * 后台查询店铺公告列表接口
     *
     * @param param
     * @return
     */
    public PagingVO<MMNoticeVO> findNotices(NoticeQueryParam param);
    /**
     * 用于定时任务的   执行自动审核通过的
     * @return
     */
    public List<NoticeEntity> findNoticesByTimer();

    /**
     * 用于定时任务审核店铺公告
     *
     * @param
     * @return
     */
    public Boolean checkNoticeTimer(Integer Id, Integer status, String userId);


}

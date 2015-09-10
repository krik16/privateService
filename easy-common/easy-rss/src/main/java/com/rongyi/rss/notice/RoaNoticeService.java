package com.rongyi.rss.notice;

import com.rongyi.easy.notice.entity.NoticePraisedEntity;
import com.rongyi.easy.notice.param.CNoticeParam;

/***
 * 消息管理的店铺公告的
 * @author lijing
 * @time 2015-09-09
 *
 */
public interface RoaNoticeService {
	/**
	 * 点赞
	 * @param ne
	 * @return
	 * @throws Exception
	 */
	public Boolean saveNoticePraise(NoticePraisedEntity ne) throws Exception;
	/**
	 * 取消点赞
	 * @param ne
	 * @return
	 * @throws Exception
	 */
    public Boolean deleteNoticePraise(NoticePraisedEntity ne) throws Exception;
    /**
     * 查询
     * @param id
     * @return
     */
    public NoticePraisedEntity findNoticePraOneById(Integer id);
    /**
     * 通过店铺公告查询点赞数量
     * @param id
     * @return
     */
    public int findCountPraByNoticeId(Integer id);
    /**
     * 判断这个用户是否对这个公告点赞了
     * @param npr
     * @return
     */
    public Boolean isPraiseByUserN(NoticePraisedEntity npr);
    
    
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

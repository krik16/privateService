package com.rongyi.rss.messagement;

import com.rongyi.easy.messagemanage.entity.NoticePraisedEntity;

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
}

package com.rongyi.rss.notice;

import com.rongyi.core.common.PagingVO;
import com.rongyi.easy.notice.entity.NoticePraisedEntity;
import com.rongyi.easy.notice.param.CNoticeParam;
import com.rongyi.easy.notice.param.MMNoticeParam;
import com.rongyi.easy.notice.param.MSNoticeParam;
import com.rongyi.easy.notice.vo.MMNoticeVO;
import com.rongyi.easy.notice.vo.MSNoticeVO;
import com.rongyi.easy.notice.vo.NoticeOVo;

/***
 * 消息管理的店铺公告的
 * @author lijing
 * @time 2015-09-09
 *
 */
public interface ROANoticeService {
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
    
    /**
     * 通过店铺公告id 查询
     * @param id
     * @return
     */
    public NoticeOVo findNoticePById(Integer id);
    
    /**
     * 容易逛查询店铺公告的的接口
     * @param mmnotice
     * @return
     */
    public PagingVO<MMNoticeVO> findNoticesByParam(MMNoticeParam mmnotice);
    
    /**
     * 摩店查询店铺公告的接口
     * @param msnotice
     * @return
     */
    public PagingVO<MMNoticeVO> findNoticesByMSParam(MSNoticeParam msnotice);
}

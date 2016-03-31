package com.rongyi.rss.mallshop.shop;

import com.rongyi.easy.malllife.domain.NoticeEntity;
import com.rongyi.easy.rmmm.entity.RmmmUserInfoEntity;
import com.rongyi.easy.rmmm.entity.SysNoticeEntity;
import com.rongyi.easy.rmmm.param.NoticeParam;
import com.rongyi.easy.rmmm.vo.NoticeVO;


public interface ROANoticeService {
	

	/**
	 * 根据店铺id获取公告
	 */
	public SysNoticeEntity getNoticeByShopId(NoticeParam param) throws Exception;
	/**
	 * 获取公告VO
	 * 
	 * @param param
	 * @return
	 * @throws Exception
	 */
	public NoticeVO getNoticeVO(NoticeParam param) throws Exception;

	/**
	 * 添加公告
	 * 
	 * @return
	 */
	public int insertNotice(NoticeParam param, Integer userId) throws Exception;

	/**
	 * 修改公告
	 * 
	 * @return
	 */
	public int updateNotice(NoticeParam param, Integer userId) throws Exception;

	/**
	 * 判断是插入还是删除
	 * 
	 * @param param
	 * @param user
	 * @return
	 */
	public void checkInsertOrUpdate(NoticeParam param, RmmmUserInfoEntity user)
			throws Exception;
	
	/**
     * 从rongyi.app.content 移过来的接口
     * @Description 
     * @author 袁波
     * @param shopId
     * @return
     */
    public NoticeEntity getNoticeByShopId(Integer shopId);
}

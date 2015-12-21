package com.rongyi.rss.msob;

import com.rongyi.easy.rmmm.entity.UserGuideChatEntity;
import com.rongyi.easy.rmmm.vo.UserinfoVO;

public interface IUserGuideChatService {
	
	/**
     * 插入用户与导购聊天的记录
     * @param mallUserId
     * @param userId
     * @throws Exception
     */
    public int insert(String mallUserId,Integer userId) throws Exception;
    
    /**
     * 获取默认导购id
     * @param mallUserId
     * @param shopId
     * @return
     * @throws Exception
     */
    public Integer getDefaultGuideIdByMallUserIdAndShopMid(String mallUserId,Integer shopId) throws Exception;
    /**
     * 获取最新聊天导购记录
     * @param mallUserId
     * @param shopId
     * @return
     * @throws Exception
     */
    public UserGuideChatEntity getLatestUserGuideChatInfo(String mallUserId,Integer shopId) throws Exception;
    /**
     * 获取最新聊天导购的个人详细信息
     * @param mallUserId
     * @param shopId
     * @return
     * @throws Exception
     */
    public UserinfoVO getDefaultGuideInfo(String mallUserId,Integer shopId) throws Exception;
}

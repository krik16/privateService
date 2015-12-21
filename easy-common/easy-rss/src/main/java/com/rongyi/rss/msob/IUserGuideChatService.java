package com.rongyi.rss.msob;

public interface IUserGuideChatService {
	
	/**
     * 插入用户与导购聊天的记录
     * @param mallUserId
     * @param userId
     * @throws Exception
     */
    public void insert(String mallUserId,Integer userId) throws Exception;
    
    /**
     * 获取默认导购id
     * @param mallUserId
     * @param shopId
     * @return
     * @throws Exception
     */
    public Integer getDefaultGuideIdByMallUserIdAndShopMid(String mallUserId,Integer shopId) throws Exception;
    
}

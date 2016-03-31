package com.rongyi.rss.roa;


/**
 * 
* @ClassName: ROAPersonManagementService 
* @Description: 个人管理
* @author wzh
* @date 2015年5月27日 上午11:15:10 
*
 */
public interface ROAPersonManagementService {
	
	/**
	 * 联系客服
	 * @param contact
	 * @param content
	 * @param userId
	 * @param name
	 * @throws Exception
	 */
	public void contactShopAssistant(String contact, String content,String name) throws Exception;
	
	/**
	 * 给卖家评分
	 * @param userId
	 * @param userScore
	 * @param sellerId
	 * @throws Exception
	 */
	public void mark(String  userId,Integer userScore,Integer sellerId) throws Exception;
	
	/**
	 * 获得卖家评分
	 * @param userId
	 * @return
	 * @throws Exception
	 */
	public Double getScore(Integer userId) throws Exception;
}

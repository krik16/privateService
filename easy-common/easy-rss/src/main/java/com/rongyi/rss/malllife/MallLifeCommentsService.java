package com.rongyi.rss.malllife;

import java.util.Map;


/**
 * 类CommentsService.java的实现描述：TODO 类实现描述 
 * @author rongyi-13 2014年8月21日 下午8:53:49
 */
public interface MallLifeCommentsService {

	/**
	 * 返回用户的评论
	 * @param userId
	 * @param page
	 * @param pageSize
	 * @return
	 * @throws Exception
	 */
	public Map<String, Object> queryCommentsByUserId(String userId, Integer page, Integer pageSize) throws Exception ;
	
	/**
	 * 添加评论
	 * 20140822 lim
	 * @param objects
	 * @param id
	 * @param rank
	 * @param content
	 * @throws Exception
	 */
	public void addComments(String objects, String id, Integer rank, String content, String userId) throws Exception ;
	
	/**
	 * 返回评论列表
	 * @param objects
	 * @param typeId
	 * @param page
	 * @param pageSize
	 * @return
	 * @throws Exception
	 */
	public Map<String, Object> queryCommentsByTypeAndId(String objects, String typeId, Integer page, Integer pageSize) throws Exception;
	/**
     * 返回店铺，商场等的评分
     * @param objects
     * @param typeId
     * @return
     * @throws Exception
     */
    public String queryCommentRankByTypeAndId(String objects, String typeId) throws Exception;
}

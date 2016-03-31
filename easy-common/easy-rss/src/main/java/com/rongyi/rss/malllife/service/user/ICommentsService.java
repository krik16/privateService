package com.rongyi.rss.malllife.service.user;

import com.rongyi.easy.malllife.vo.CommentsVO;

import java.util.List;
import java.util.Map;

/*
 * Copyright (C),上海容易网电子商务有限公司
 * Author:  俞志坚
 * Description:  用户评论
 * time:  2015/6/4
 * History: 变更记录
 * <author>           <time>             <version>        <desc>
 * 俞志坚             2015/6/4              1.0            创建文件
 *
 */
public interface ICommentsService {

    /**
     * 返回用户的评论j
     * @param userId
     * @param page
     * @param pageSize
     * @return
     * @throws Exception
     */
    public Map<String, Object> queryCommentsByUserId(String userId, Integer page, Integer pageSize) throws Exception;


    /**
     * 添加评论
     * @param objects
     * @param id
     * @param rank
     * @param content
     * @throws Exception
     */
    public void addComments(String objects, String id, Integer rank, String content, String userId) throws Exception;



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

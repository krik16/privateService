package com.rongyi.rss.malllife;

import java.util.List;
import java.util.Map;

import com.rongyi.easy.malllife.vo.CommentsVO;
import com.rongyi.easy.malllife.vo.FavourableVO;
import com.rongyi.easy.malllife.vo.GroupVO;

/*
 * Description:  
 * Author: yuzhijian 
 * History: 变更记录
 * <Author>     <time>    <version>    <desc>
 * yuzhijian       2017/4/6    1.0        创建文件 
 * Copyright (C): 上海容易网电子商务股份有限公司
 */
public interface IFavService {


    public String insert(String userId, String contentId);

    public void delete(String userId, String contentId);

    public String getContentByContentId(String userId, String contentId);

    public Map<String, Object> listPageContentIds(Integer page, Integer pageSize, String userId, String collectableType);


    public  List<GroupVO> listActivities(List<String> ids);

    public FavourableVO updateShareNum(String activityId);

    public List<CommentsVO> getComments(String commentable_id)throws Exception;

    public String insertShop(String userId, String shopId);

    public String insert(String userId, String contentId, String collectableType);

    public void delete(String userId, String contentId, String collectableType);

}

package com.rongyi.rss.malllife;

import java.util.List;
import java.util.Map;


/*
 * Description:  
 * Author: yuzhijian 
 * History: 变更记录
 * <Author>     <time>    <version>    <desc>
 * yuzhijian       2017/4/6    1.0        创建文件 
 * Copyright (C): 上海容易网电子商务股份有限公司
 */
public interface IFavService {


    public void insert(String userId, String contentId);

    public void delete(String userId, String contentId);

    public String getContentByContentId(String userId, String contentId);

    public Map<String, Object> listPageContentIds(Integer page, Integer pageSize, String userId, String collectableType);


    public  List<GroupVO> listActivities(List<String> ids);
}

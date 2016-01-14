package com.rongyi.rss.malllife;

import java.util.List;


import com.rongyi.easy.malllife.vo.AppRecommendVo;



public interface MallLifeRecommendService {

    
    /**
     * 根据类型查询应用推荐
     * 将logo拼接成url方式
     * @param type
     * @return
     */
    public List<AppRecommendVo> selectListByCondition(String type);
}

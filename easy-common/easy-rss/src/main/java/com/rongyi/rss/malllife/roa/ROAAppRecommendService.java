
/**   
 * @Title: ROAAppRecommendService.java 
 * @Package: com.rongyi.rss.malllife.roa 
 * @Description: TODO
 * @author user  
 * @date 2015年6月4日 上午10:16:01 
 */


package com.rongyi.rss.malllife.roa;

import java.util.List;

import com.rongyi.easy.malllife.vo.AppRecommendVo;

/** 
 * @Description 
 * @author 袁波
 * @date 2015年6月4日 上午10:16:01 
 */

public interface ROAAppRecommendService {
    /**
     * 根据类型查询应用推荐
     * 将logo拼接成url方式
     * @param type
     * @return
     */
    public List<AppRecommendVo> selectListByCondition(String type);
}

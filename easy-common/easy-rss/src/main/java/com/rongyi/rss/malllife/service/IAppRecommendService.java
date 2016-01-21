
/**   
 * @Title: IAppRecommendService.java 
 * @Package: com.rongyi.rss.msob 
 * @Description: TODO
 * @author user  
 * @date 2015年6月2日 下午3:20:37 
 */


package com.rongyi.rss.malllife.service;

import java.util.List;
import java.util.Map;

import com.rongyi.easy.malllife.vo.AppRecommendVo;

/** 
 * @Description rongyi.app.content com.rongyi.app.biz.mapper.AppRecommendMapper 中接口迁移
 * @author yuanbo
 * @date 2015年6月2日 下午3:20:37 
 */

public interface IAppRecommendService {
    /**
     * 根据类型查询应用推荐
     * 将logo拼接成url方式
     * @param type
     * @return
     */
    public List<AppRecommendVo> selectListByCondition(String type);
}

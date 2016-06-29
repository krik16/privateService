
package com.rongyi.rss.report;

import java.util.List;
import java.util.Map;

import com.rongyi.easy.bsoms.entity.SessionUserInfo;


/**
 * @Description: 商家后台接口
 * @author wangjh
 * @date 2016年2月15日 下午4:38:09
 */
public interface IBusinessPlatformService {

    /**
     * 获取商家后台昨日数据
     * params｛mallId : 商场ID，userId : 用户ID，date : 时间<yyyy-MM-dd>｝
     */
    public List<Map<String, Object>> getLastDayData(SessionUserInfo user);
    
    public List<Map<String, Object>> getLastDayData(String shopId,String userId);
}
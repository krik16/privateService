
package com.rongyi.rss.report;

import java.util.Map;

import com.rongyi.easy.activitymanage.param.ActivityParam;



/**
 * 
 * @ClassName     IActivityStatisticsPlatformService.java 
 * @Description   TODO
 * @copyright	    上海容易网电子商务股份有限公司. 		
 * @author        PC 
 * @version       V1.0   
 * @Date          2016年10月31日 下午2:40:38
 */
public interface IActivityStatisticsPlatformService {

    
    public Map<String, Object> getActivityStatisticsData(ActivityParam ap);
    
}
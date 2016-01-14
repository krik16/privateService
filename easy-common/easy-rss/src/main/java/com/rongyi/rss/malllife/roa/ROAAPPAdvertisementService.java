
/**   
 * @Title: ROAAPPAdvertisementService.java 
 * @Package: com.rongyi.rss.malllife.roa 
 * @Description: TODO
 * @author user  
 * @date 2015年6月4日 上午10:13:04 
 */


package com.rongyi.rss.malllife.roa;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.rongyi.easy.malllife.domain.AppAdvertisement;
import com.rongyi.easy.malllife.vo.AppAdvertisementQuery;

/** 
 * @Description 
 * @author 袁波
 * @date 2015年6月4日 上午10:13:04 
 */

public interface ROAAPPAdvertisementService {
    
    /**
     * 获取广告记录
     * @param map
     * @return List<Map<String, Object>>
     */
    public List<Map<String, Object>> getAdertisements(Map<String, Object> map,String version);
}

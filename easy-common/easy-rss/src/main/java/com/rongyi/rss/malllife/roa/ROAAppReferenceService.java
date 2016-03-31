
/**   
 * @Title: ROAAppReferenceService.java 
 * @Package: com.rongyi.rss.malllife.roa 
 * @Description: TODO
 * @author user  
 * @date 2015年6月4日 上午10:17:11 
 */


package com.rongyi.rss.malllife.roa;

import java.util.List;

import com.rongyi.easy.malllife.domain.AppReference2DO;
import com.rongyi.easy.malllife.domain.AppReferenceDO;

/** 
 * @Description 
 * @author 袁波
 * @date 2015年6月4日 上午10:17:11 
 */

public interface ROAAppReferenceService {
   
    public void updateAllLngLatById() throws Exception ;
    /**
     * 更新经纬度
     * 20140814 lim
     * @param map
     */
    public void updateLngLatById(double lng, double lat, int id, String cityId, String cityName) ;
    /**
     * Get Appreference2DO list by activity or article id.
     * */
    public List<AppReference2DO> getActivityMall(Integer id);
}

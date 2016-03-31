
/**   
 * @Title: IAppReferenceService.java 
 * @Package: com.rongyi.rss.msob 
 * @Description: TODO
 * @author user  
 * @date 2015年6月2日 下午3:22:16 
 */


package com.rongyi.rss.malllife.service;

import java.util.List;
import java.util.Map;

import com.rongyi.easy.malllife.domain.AppReferenceDO;

/** 
 * @Description rongyi.app.content com.rongyi.app.biz.mapper.AppReferenceMapper 中接口迁移
 * @author yuanbo
 * @date 2015年6月2日 下午3:22:16 
 */

public interface IAppReferenceService {
    public AppReferenceDO getById(Integer id);
    
    /**
     * According to mallID equals reference_field1 
     * to get all of data which is reference the article or activity.
     * */
    public List<AppReferenceDO> getReferenceID (String mallID);
    /**
     * 查询全部的关系商场和店铺 
     * 20140814 lim
     * @return
     */
    public List<AppReferenceDO> queryMallAndShopRef();
    
    /**
     * 查询全部的关系商场和店铺 
     * 20140814 lim
     * @return
     * @throws Exception 
     */
//    public void updateAllLngLatById() throws Exception ;
    /**
     * 更新经纬度
     * 20140814 lim
     * @param map
     */
    public void updateLngLatById(double lng, double lat, int id, String cityId, String cityName) ;
}

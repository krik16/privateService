
/**   
 * @Title: IAppAdvertisementService.java 
 * @Package: com.rongyi.rss.msob 
 * @Description: TODO
 * @author user  
 * @date 2015年6月2日 下午2:59:32 
 */


package com.rongyi.rss.malllife.service;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.rongyi.easy.malllife.domain.AppAdvertisement;
import com.rongyi.easy.malllife.vo.AppAdvertisementQuery;



/** 
 * @Description rongyi.app.content com.rongyi.app.biz.mapper.AppAdvertisementMapper 中接口迁移
 * @author yuanbo
 * @date 2015年6月2日 下午2:59:32 
 */

public interface IAppAdvertisementService {
    public int countByExample(AppAdvertisementQuery query);

    public int deleteByExample(AppAdvertisementQuery query);

    public int deleteByPrimaryKey(Integer id);

    public int insert(AppAdvertisement record);

    public int insertSelective(AppAdvertisement record);

    public List<AppAdvertisement> selectByExample(AppAdvertisementQuery query);

    public AppAdvertisement selectByPrimaryKey(Integer id);

    public int updateByExampleSelective(@Param("record") AppAdvertisement record, @Param("example") AppAdvertisementQuery query);

    public int updateByExample(@Param("record") AppAdvertisement record, @Param("example") AppAdvertisementQuery query);

    public int updateByPrimaryKeySelective(AppAdvertisement record);

    public int updateByPrimaryKey(AppAdvertisement record);
    /**
     * 获取广告记录
     * @param map
     * @return List<Map<String, Object>>
     */
    public List<AppAdvertisement> getAdertisements(Map<String, Object> map);
    
    /**
     * 获取广告记录
     * @param map
     * @return List<Map<String, Object>>
     */
    public List<Map<String, Object>> getAdertisements(Map<String, Object> map,String version);
}

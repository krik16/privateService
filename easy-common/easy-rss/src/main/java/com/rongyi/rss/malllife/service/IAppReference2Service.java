
/**   
 * @Title: IAppReference2Service.java 
 * @Package: com.rongyi.rss.msob 
 * @Description: TODO
 * @author user  
 * @date 2015年6月2日 下午3:21:33 
 */


package com.rongyi.rss.malllife.service;

import java.util.List;

import com.rongyi.easy.malllife.domain.AppReference2DO;

/** 
 * @Description rongyi.app.content com.rongyi.app.biz.dao.AppReference2Dao 中接口迁移
 * @author yuanbo
 * @date 2015年6月2日 下午3:21:33 
 */

public interface IAppReference2Service {
    /**
     * Get Appreference2DO list by activity or article id.
     * */
    public List<AppReference2DO> getActivityMall(Integer id);
}

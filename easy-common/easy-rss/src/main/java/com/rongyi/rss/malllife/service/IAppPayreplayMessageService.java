
/**   
 * @Title: IAppPayreplayMessageService.java 
 * @Package: com.rongyi.rss.msob 
 * @Description: TODO
 * @author user  
 * @date 2015年6月2日 下午3:19:41 
 */


package com.rongyi.rss.malllife.service;

import com.rongyi.easy.malllife.domain.AppOrderInfo;
import com.rongyi.easy.malllife.domain.AppPayreplayMessage;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/** 
 * @Description rongyi.app.content com.rongyi.app.biz.dao.AppPayreplayMessageDao 
 *              com.rongyi.app.biz.service.AppPayreplayMessageService 中接口迁移
 * @author yuanbo
 * @date 2015年6月2日 下午3:19:41 
 */

public interface IAppPayreplayMessageService {
    /**
     * 将支付宝或微信支付返回信息存入MySql数据库中
     * 
     * @param appPayreplayMessage
     * @return exception为存储异常，success 为正常
     */
    public Map<String, String> insert(AppPayreplayMessage appPayreplayMessage);
    /**
     * 根据server返回的数据更新数据库数据
     * 
     * @param orderInfo
     */
    public void updateAppOrder(AppOrderInfo orderInfo) throws Exception;
    /**
     * 获取微信支付买家信息
     * 
     * @param request
     * @return
     * @throws Exception
     */
    public Map<String, String> parseXml(HttpServletRequest request) throws Exception ;
}

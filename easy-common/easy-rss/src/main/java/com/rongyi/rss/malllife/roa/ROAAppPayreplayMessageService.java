
/**   
 * @Title: ROAAppPayreplayMessageService.java 
 * @Package: com.rongyi.rss.malllife.roa 
 * @Description: TODO
 * @author user  
 * @date 2015年6月4日 上午10:15:06 
 */


package com.rongyi.rss.malllife.roa;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import com.rongyi.easy.malllife.domain.AppOrderInfo;
import com.rongyi.easy.malllife.domain.AppPayreplayMessage;

/** 
 * @Description 
 * @author 袁波
 * @date 2015年6月4日 上午10:15:06 
 */

public interface ROAAppPayreplayMessageService {
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
     * @param tradeWay
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


/**   
 * @Title: IPushServiceTrigger.java 
 * @Package: com.rongyi.rss.service.trigger 
 * @Description: TODO
 * @author 袁波 
 * @date 2015年7月1日 上午11:02:46 
 */


package com.rongyi.rss.service.trigger;

/** 
 *
 * @Description  推送定时任务接口
 * @author 袁波
 * @date 2015年7月1日 上午11:02:46 
 */

public interface IPushServiceTrigger {
    /**
     * 定时去查询库中推送任务，执行到了推送时间的任务
     * @Description 
     * @author 袁波
     */
    public void sendPushTask();
}

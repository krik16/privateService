
/**   
 * @Title: ISalesCommissionTrgger.java 
 * @Package: com.rongyi.rss.service.trigger 
 * @Description: TODO
 * @author 袁波 
 * @date 2015年7月1日 上午11:09:36 
 */


package com.rongyi.rss.service.trigger;

/** 
 *
 * @Description 
 * @author 袁波
 * @date 2015年7月1日 上午11:09:36 
 */

public interface ISalesCommissionTrigger {
    /**
     * 定时统计每个卖家的当前时间段内通过审核的返佣的总额，并通过MQ发送到VA
     * @Description 
     * @author 袁波
     */
    void statisticsCommissionAmountTrigger();

    /**
     * 定时统计每个买手的当前时间段内通过审核的返佣的总额，并通过MQ发送到VA
     */
    void statisticsBuyerCommissionAmountTrigger();

    /**
     *每日定时检查更新前一天生成的导购/买手的超限佣金
     */
    void statisticsCheckLimitTrigger();

}

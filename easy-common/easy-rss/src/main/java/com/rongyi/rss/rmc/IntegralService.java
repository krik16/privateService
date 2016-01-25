/**
 * Project Name:easy-rss File Name:GiftService.java Package Name:com.rongyi.rss.rmc
 * Date:2015年7月19日下午10:01:49 Copyright (c) 2015, rongyi.com All Rights Reserved.
 * 
 */

package com.rongyi.rss.rmc;

import com.rongyi.core.framework.exception.RYServiceException;
import com.rongyi.easy.rmc.param.MemberBonusParam;



/**
 * ClassName: GiftService <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: 积分服务. <br/>
 * date: 2015年7月19日 下午10:01:49 <br/>
 * 
 * @author bin.zhang
 * @version
 * @since JDK 1.6
 */
public interface IntegralService {
  /**
   * 
   * bonusAdjustment:调整积分. <br/>
   * 
   * @author bin .zhang
   * @param memberBonusParam
   * @since JDK 1.6
   */
  void bonusAdjustment(MemberBonusParam memberBonusParam) throws RYServiceException;

}

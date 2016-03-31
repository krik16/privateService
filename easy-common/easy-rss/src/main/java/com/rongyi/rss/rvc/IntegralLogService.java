package com.rongyi.rss.rvc;

import com.rongyi.core.common.Page;
import com.rongyi.core.common.PageList;
import com.rongyi.core.framework.exception.RYServiceException;
import com.rongyi.easy.rvc.entity.IntegralLog;

/**
 * ClassName:IntegralHistoryService <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: 积分增加历史表. <br/>
 * Date: 2015年3月13日 下午8:16:26 <br/>
 * 
 * @author bin.zhang
 * @version
 * @since JDK 1.6
 * @see
 */
public interface IntegralLogService {
  /**
   * 
   * insertSelective:增加<br/>
   * 
   * @author bin.zhang
   * @param record
   * @return
   * @since JDK 1.6
   */
  public void save(IntegralLog integralLog) throws RYServiceException;

  public PageList<IntegralLog> queryMemberLog(IntegralLog integralLog, Page page)
      throws RYServiceException;

}

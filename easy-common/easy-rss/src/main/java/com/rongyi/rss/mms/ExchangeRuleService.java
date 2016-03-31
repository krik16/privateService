package com.rongyi.rss.mms;

import com.rongyi.core.framework.exception.RYServiceException;
import com.rongyi.easy.mms.ExchangeRule;

public interface ExchangeRuleService {
  /**
   * 插入或更新
   * 
   * @param exchangeRule
   */
  void insertOrUpdate(ExchangeRule exchangeRule);


  /**
   * 
   * @param mallId
   * @return
   * @throws RYServiceException
   */
  ExchangeRule queryByMallId(String mallId) throws RYServiceException;

  /**
   * 得到当前限制的数量
   * 
   * @param mallId
   * @return
   * @throws RYServiceException
   */
  Integer getNumber(String mallId) throws RYServiceException;
}

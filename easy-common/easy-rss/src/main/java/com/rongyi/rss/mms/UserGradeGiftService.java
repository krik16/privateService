package com.rongyi.rss.mms;


import java.util.List;

import com.rongyi.core.framework.exception.RYServiceException;
import com.rongyi.easy.entity.IntegralCommodity;
import com.rongyi.easy.mms.UserGradeGift;

/**
 * 
 * @author bin.zhang 用户等级积分
 *
 */
public interface UserGradeGiftService {
  /**
   * 用户等级积分
   * 
   * @param gradeId
   * @param giftId
   * @return
   * @throws RYServiceException
   */
  public UserGradeGift queryByGradeIdAndGiftId(Integer gradeId, Long giftId)
      throws RYServiceException;

  /**
   * 查礼品的等级对应积分
   * 
   * @param giftId
   * @return
   * @throws RYServiceException
   */
  public List<UserGradeGift> queryByGiftId(Long giftId) throws RYServiceException;

  public void insertOrUpdate(UserGradeGift userGradeIntegral) throws RYServiceException;

  /**
   * 批量插入
   * 
   * @param list
   * @throws RYServiceException
   */
  public void insertOrUpdate(List<UserGradeGift> list, IntegralCommodity integralComm)
      throws RYServiceException;
}

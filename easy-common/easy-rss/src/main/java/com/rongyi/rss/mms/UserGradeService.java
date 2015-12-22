package com.rongyi.rss.mms;

import java.util.List;

import com.rongyi.core.framework.exception.RYServiceException;
import com.rongyi.easy.mms.UserGrade;
import com.rongyi.easy.mms.vo.UserGradeGiftVO;

/**
 * 
 * @author bin.zhang 用户等级、
 *
 */
public interface UserGradeService {
  /**
   * 用户等级查询
   * 
   * @param mallId
   * @return
   * @throws RYServiceException
   */
  public List<UserGrade> selectByMallId(String mallId) throws RYServiceException;

  /**
   * 根据mallgrade 查询等级信息
   * 
   * @param mallId
   * @param grade
   * @return
   * @throws RYServiceException
   */
  public UserGrade selectByMallIdAndGrade(String mallId, String grade) throws RYServiceException;

  /**
   * 查询积分的等级相关信息
   * 
   * @param mallId
   * @param giftId
   * @return
   * @throws RYServiceException
   */
  public List<UserGradeGiftVO> qeueryByMallIdAndGiftId(String mallId, Long giftId)
      throws RYServiceException;
}

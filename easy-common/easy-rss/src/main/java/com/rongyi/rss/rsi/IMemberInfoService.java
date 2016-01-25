package com.rongyi.rss.rsi;

import com.rongyi.core.framework.exception.RYServiceException;
import com.rongyi.easy.mms.vo.UserDetailVO;

/**
 * 类IMemberInfoService.java的实现描述：会员接口
 * @author rongyi-13 2015年1月19日 下午8:52:24
 */
public interface IMemberInfoService {
  /**
   * 20150119 查询会员
   * 
   * @param memberNo
   */
  public UserDetailVO findByMemberNo(String memberNo);

  /**
   * 
   * findByMallIdAndMemberNo:根据会员卡号与商场id来查询实体会员相关信息. <br/>
   * 
   * @author bin.zhang
   * @param mallId
   * @param memberNo
   * @return
   * @since JDK 1.6
   */
  public UserDetailVO findByMallIdAndMemberNo(String mallId, String memberNo)
      throws RYServiceException;
}

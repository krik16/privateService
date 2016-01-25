/**
 * Project Name:easy-rss File Name:GiftService.java Package Name:com.rongyi.rss.rmc
 * Date:2015年7月19日下午10:01:49 Copyright (c) 2015, rongyi.com All Rights Reserved.
 * 
 */

package com.rongyi.rss.rmc;

import java.util.List;

import com.rongyi.core.common.PageList;
import com.rongyi.core.framework.exception.RYServiceException;
import com.rongyi.easy.mms.vo.IntegralCommodityVO;
import com.rongyi.easy.rmc.param.MemberGiftParam;
import com.rongyi.easy.rvc.entity.IntegralHistory;
import com.rongyi.easy.rvc.param.IntegralGiftParam;

/**
 * ClassName: GiftService <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: 礼品服务. <br/>
 * date: 2015年7月19日 下午10:01:49 <br/>
 * 
 * @author bin.zhang
 * @version
 * @since JDK 1.6
 */
public interface GiftService {
  /**
   * 
   * getMemberBonusPointsLedger:获取会员消费明细 <br/>
   * 
   * @author bin.zhang
   * @param adapterEntity
   * @param memberGiftParam
   * @return
   * @since JDK 1.6
   */
  List<IntegralHistory> getMemberBonusPointsLedger(MemberGiftParam memberGiftParam)
      throws RYServiceException;

  /**
   * 
   * getMemberGift:获取一个会员的兑换礼品记录<br/>
   * 
   * @author bin.zhang
   * @param adapterEntity
   * @param memberGiftParam
   * @return
   * @since JDK 1.6
   */
  PageList<IntegralGiftParam> getMemberGift(MemberGiftParam memberGiftParam)
      throws RYServiceException;

  /**
   * 
   * getMemberGiftRedeem:礼品兑换. <br/>
   * 
   * @author bin.zhang
   * @param adapterEntity
   * @param memberGiftParam
   * @return 返回礼品兑换码
   * @since JDK 1.6
   */
  String getMemberGiftRedeem(MemberGiftParam memberGiftParam) throws RYServiceException;

  /**
   * 获取积分商城礼品列表
   * 
   * @return
   */
  PageList<IntegralCommodityVO> getMemberGiftList(MemberGiftParam memberGiftParam)
      throws RYServiceException;

  /**
   * 
   * getGiftInfo:得到商品详情. <br/>
   * 
   * @author bin.zhang
   * @param giftId
   * @return
   * @throws RYServiceException
   * @since JDK 1.6
   */
  IntegralCommodityVO getGiftInfo(MemberGiftParam memberGiftParam) throws RYServiceException;
}

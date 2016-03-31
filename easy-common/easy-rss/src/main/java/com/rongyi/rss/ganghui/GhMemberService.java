package com.rongyi.rss.ganghui;

/**
 * Project Name:easy-ganghui File Name:MemberService.java Package Name:com.rongyi.ganghui.service
 * Date:2015年6月18日下午2:26:25 Copyright (c) 2015, rongyi.com All Rights Reserved.
 * 
 */

import java.util.List;

import com.rongyi.core.framework.exception.RYServiceException;
import com.rongyi.easy.ganghui.GhMember;
import com.rongyi.easy.ganghui.IntegralGift;
import com.rongyi.easy.ganghui.IntegralHistory;


/**
 * ClassName: MemberService <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: 会员服务 <br/>
 * date: 2015年6月18日 下午2:26:25 <br/>
 * 
 * @author bin.zhang
 * @version
 * @since JDK 1.6
 */
public interface GhMemberService {
  /**
   * 
   * getByMobile:通过手机号查询会员信息 <br/>
   * 
   * @author bin.zhang
   * @param mobile
   * @return
   * @since JDK 1.6
   */
  GhMember getByMobileOrMemberNo(String mobile,String memberNo);

  /**
   * 
   * registerMember:用户注册 <br/>
   * 
   * @author bin.zhang
   * @param identity 身份证号
   * @param mobile 手机号
   * @param sureName 用户名
   * @since JDK 1.6
   */
  GhMember registerMember(String identity, String mobile, String sureName);

  /**
   * 
   * bonusAdjustment:积分调整. <br/>
   * 
   * @author bin.zhang
   * @param mobile 手机号
   * @param bonuspoint 调整积分<0 减少积分 >0 增加积分
   * @param adjreason 备注
   * @param docno 流水号
   * @since JDK 1.6
   */
  void bonusAdjustment(String mobile, int bonuspoint, String adjreason, String docno);
  /**
   * 签到送积分
   * @param mobile
   */
  void signIn(String mobile,String memberNo);

  /**
   * 
   * GetMemberBonusLedger:获取会员积分记录. <br/>
   * 
   * @author bin.zhang
   * @param mobile 手机号
   * @param memberNo 会员卡
   * @param startrow 起始行
   * @param endrow 结束行
   * @return
   * @since JDK 1.6
   */
  List<IntegralHistory> getMemberBonusLedger(String mobile,String memberNo, int startrow, int endrow)throws RYServiceException;

  /**
   * 
   * getMemberRedeem:. 获取会员兑换礼品记录<br/>
   * 
   * @author bin.zhang
   * @param mobile
   * @param startrow
   * @param endrow
   * @return
   * @since JDK 1.6
   */
  List<IntegralGift> getMemberRedeem(String mobile, int startrow, int endrow);
  


}

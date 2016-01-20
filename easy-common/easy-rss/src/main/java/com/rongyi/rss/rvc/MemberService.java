package com.rongyi.rss.rvc;

import java.util.Map;

import com.rongyi.core.bean.ResponseResult;
import com.rongyi.easy.rvc.entity.IntegralHistory;
import com.rongyi.easy.rvc.param.MemberBaseInfo;


/**
 * 20150106 lim 类MemberService.java的实现描述：会员
 * 
 * @author rongyi-13 2015年1月6日 下午2:38:28
 */
public interface MemberService {


  /**
   * 20150106 lim 接口1：创建会员
   * 
   * @param member
   * @return
   */
  public ResponseResult createMember(MemberBaseInfo memberBaseInfo) throws Exception;

  /**
   * 20150106 lim 接口2：更新会员基本信息
   * 
   * @param member
   * @return
   */
  public ResponseResult updateMemberInfo(Map<String, Object> memberMap) throws Exception;

  /**
   * 20150106 lim 接口3：获取会员简要信息（也可用于验证会员，login）
   * 
   * @param memberBaseInfo
   * @return
   */
  public ResponseResult getMemberBaseInfo(MemberBaseInfo memberBaseInfo) throws Exception;

  /**
   * 20150106 lim 接口4：获取会员详细信息
   * 
   * @param memberBaseInfo
   * @return
   * @throws Exception
   */
  public ResponseResult getMemberAllInfo(MemberBaseInfo memberBaseInfo) throws Exception;

  /**
   * 20150106 lim 接口5：更新会员积分
   * 
   * @param id
   * @param integral 调整积分值（增加为正积分，减少为负积分）
   * @param memo
   * @return
   * @throws Exception
   */
  public ResponseResult updateMemberBonusPoints(String memberNo, IntegralHistory integralHistory)
      throws Exception;

  /**
   * 20150106 lim 接口6,7：获取会员积分记录
   * 
   * @return
   * @throws Exception
   */
  public ResponseResult getMemberBonusPointsLedger(String owner, String memberNo, Integer pageSize,
      Integer currentPage) throws Exception;

  /**
   * 20150107 lim 接口8：取得礼品库存
   * 
   * @param owner
   * @param giftId
   * @return
   * @throws Exception
   */
  public ResponseResult getGiftQoh(String owner, String mallId, String giftId) throws Exception;

  /**
   * 20150107 lim 接口9：获取会员礼品列表,就是全部礼品列表
   * 
   * @param owner
   * @param returnNoQohGift 不返回无库存礼品（yes, no)
   * @return
   * @throws Exception
   */
  // public List<Object> getMemberGiftList(String owner, boolean returnNoQohGift) throws Exception;
  // public Map<String,Object> getMemberGiftList(Map<String,Object> params, int currentpage, int
  // pagesize) throws Exception;

  /**
   * 20150107 lim 接口10：会员礼品兑换/退还
   * 
   * @param memberNo
   * @param memberName
   * @param giftName
   * @param owner
   * @param mallId
   * @param giftId
   * @param giftNum 礼品数量（+代表兑换数量，-代表退还数量）
   * @param channel
   * @param giftCode 退还的时候需要giftCode
   * @return
   * @throws Exception
   */
  public ResponseResult updateMemberGiftRedeem(String memberNo, String memberName, String giftName,
      String owner, String mallId, String giftId, int giftNum, int channel, String giftCode, String phone)
      throws Exception;

  /**
   * 20150109 lim 接口11：会员领取礼品之后，调用这个接口，修改兑换记录的状态
   * 
   * @throws Exception
   */
  public ResponseResult finishExchangeRecord(String giftCode) throws Exception;

  /**
   * 20150106 lim 接口 获取会员礼品记录
   * 
   * @return
   * @throws Exception
   */
  public ResponseResult getMemberGift(String owner, String mallId, String memberNo,
      Integer pageSize, Integer currentPage) throws Exception;

  /**
   * 20150128 lim 批量查询会员记录，为了调试方便
   * 
   * @param groupId
   * @return
   * @throws Exception
   */
  public ResponseResult queryByGroupId(String groupId) throws Exception;
}

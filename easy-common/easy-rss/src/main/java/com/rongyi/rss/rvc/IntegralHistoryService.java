/**
 * Project Name:easy-rss File Name:IntegralHistoryService.java Package Name:com.rongyi.rss.rvc
 * Date:2015年3月13日下午8:16:26
 * 
 */

package com.rongyi.rss.rvc;

import java.util.List;

import com.rongyi.core.common.Page;
import com.rongyi.core.common.PageList;
import com.rongyi.core.common.PagingVO;
import com.rongyi.core.framework.exception.RYServiceException;
import com.rongyi.easy.domain.member.MemberType;
import com.rongyi.easy.rvc.entity.IntegralHistory;
import com.rongyi.easy.rvc.param.IntegralGiftParam;

/**
 * ClassName:IntegralHistoryService <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: 礼品历史服务. <br/>
 * Date: 2015年3月13日 下午8:16:26 <br/>
 * 
 * @author bin.zhang
 * @version
 * @since JDK 1.6
 * @see
 */
public interface IntegralHistoryService {
  /**
   * 
   * insertSelective:插入礼品的历史记录<br/>
   * 大宁项目使用
   * 
   * @author bin.zhang
   * @param record
   * @return
   * @since JDK 1.6
   */
  public int insertSelective(IntegralHistory record);

  /**
   * 
   * pagingMemberGift:获取礼品服务. <br/>
   * 
   * @author bin.zhang
   * @param owner
   * @param mallId
   * @param memberId
   * @param pageSize
   * @param currentPage
   * @return
   * @since JDK 1.6
   */
  public PagingVO<IntegralHistory> pagingMemberGift(String owner, String mallId, String memberId,
      Integer pageSize, Integer currentPage, MemberType memberType) throws Exception;

  /**
   * 
   * queryExistByCondition:找出礼品兑换历史 <br/>
   * 
   * @author bin.zhang
   * @param memberId
   * @param owner
   * @param mallId
   * @param giftId
   * @return
   * @since JDK 1.6
   */
  public List<IntegralHistory> queryIntegralHistoryBYCondition(String memberId, String owner,
      String mallId, String giftId, MemberType memberType);

  /**
   * 
   * countToday:查询当天兑换的记录数. <br/>
   * 
   * @author bin.zhang
   * @param memberId
   * @param mallId
   * @return
   * @since JDK 1.6
   */
  public int countToday(String memberId, String mallId, MemberType memberType);

  /**
   * 
   * getMemberGift:礼品列表查询. <br/>
   * 
   * @author bin.zhang
   * @param mallId
   * @param memberId
   * @param page
   * @return
   * @throws Exception
   * @since JDK 1.6
   */
  public PageList<IntegralGiftParam> getMemberGift(String mallId, String memberId, Page page,
      MemberType memberType) throws RYServiceException;

}

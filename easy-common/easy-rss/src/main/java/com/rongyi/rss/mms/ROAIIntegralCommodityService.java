package com.rongyi.rss.mms;

import java.util.Map;

import com.rongyi.core.common.Page;
import com.rongyi.core.common.PageList;
import com.rongyi.core.framework.exception.RYServiceException;
import com.rongyi.easy.mms.vo.IntegralCommodityVO;

/**
 * 类ROAIIntegralCommodityService.java的实现描述：TODO 类实现描述
 * 
 * @author Limeng 2015年1月8日 下午2:49:20
 */
public interface ROAIIntegralCommodityService {

  /**
   * 根据搜索参数查询数据
   * 
   * @param params
   * @param currentpage
   * @param pagesize
   * @return
   * @throws Exception
   */
  public Map searchIntegralCommList(Map params, int currentpage, int pagesize) throws Exception;

  /**
   * 根据积分商品id查询积分商品
   * 
   * @param inteCommId
   * @return
   * @throws Exception
   */
  public IntegralCommodityVO getIntegralCommById(String inteCommId) throws RYServiceException;

  /**
   * @param inteCommId 积分商品id
   * @param exchangeNum 兑换数量大于零兑换 小于0 退产品
   * @return
   * @throws Exception
   */
  public String exchangeIntegralComm(String memberId, String inteCommId, int exchangeNum,
      String phone) throws RYServiceException;

  /**
   * 
   * queryIntegralCommList:查看礼品列表. <br/>
   * 
   * @author bin.zhang
   * @param params
   * @param page
   * @return
   * @throws RYServiceException
   * @since JDK 1.6
   */
  public PageList<IntegralCommodityVO> queryIntegralCommList(Map params, Page page)
      throws RYServiceException;
}

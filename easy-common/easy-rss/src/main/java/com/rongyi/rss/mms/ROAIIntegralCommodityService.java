package com.rongyi.rss.mms;

import java.util.List;
import java.util.Map;

import com.rongyi.core.common.Page;
import com.rongyi.core.common.PageList;
import com.rongyi.core.framework.exception.RYServiceException;
import com.rongyi.easy.entity.IntegralCommodity;
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
  /**
   * 
  * @Title: insertOrUpdateIntegralComm 
  * @Description: 新增或修改礼品列表
  * @param @param params
  * @param @throws RYServiceException    设定文件 
  * @return void    返回类型 
  * @author shaozhou 
  * @date 2015年10月14日 下午4:47:26
  * @throws
   */
  public void insertOrUpdateIntegralComm(List<Map<String,Object>> params)throws RYServiceException;
  /**
   * 
  * @Title: searchcommityByMap 
  * @Description: 通过礼品部分数据获取礼品实体
  * @param @param param
  * @param @return
  * @param @throws RYServiceException    设定文件 
  * @return IntegralCommodity    返回类型 
  * @author shaozhou 
  * @date 2015年10月14日 下午7:01:54
  * @throws
   */
  public long searchcommityIdByMap(Map<String,Object> param) throws RYServiceException;
  
  public String getGiftCodeByGiftId(Map<String,Object> param) throws RYServiceException;
}

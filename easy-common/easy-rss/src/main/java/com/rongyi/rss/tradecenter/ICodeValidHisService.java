package com.rongyi.rss.tradecenter;

import com.rongyi.core.common.PagingVO;
import com.rongyi.easy.coupon.vo.CouponHistoryVO;
import com.rongyi.easy.coupon.vo.ValidCommissionVO;
import com.rongyi.easy.tradecenter.TradeValidRecord;
import com.rongyi.easy.tradecenter.param.BizzValidHistoryParam;
import com.rongyi.easy.tradecenter.param.CodeValidHisParam;
import com.rongyi.easy.tradecenter.vo.BizzValidHistoryVO;

import java.util.Map;

/**
 * @author yujisun
 * @version 2015/9/2
 */
public interface ICodeValidHisService {

	/**
     * 分页查询验证历史记录
     * @param paramMap
     * @return
     */
     PagingVO<CouponHistoryVO> searchCouponCodeListAndCount(Map<String,Object> paramMap);

     /**
      * 
      * @param tradeValidRecord
      */
     void saveValidHistory(TradeValidRecord tradeValidRecord);

     /**
      * 
      * @param param
      * @return
      */
     PagingVO<TradeValidRecord> getValidHistoryPage(CodeValidHisParam param);
    
     /**
      * 核销佣金列表
      * @param param
      * @return
      */
     PagingVO<CouponHistoryVO> getValidCommissionPageVO(CodeValidHisParam param);

     /**
      * 查询用户当天该类优惠券的使用次数
      * @param referenceId
      * @param userId
      * @return
      */
	int getDailyCount(String referenceId, String userId);

	/**
	 * 核销佣金列表（新需求）
	 * @param param
	 * @return
	 */
	ValidCommissionVO getValidCommissionPaging(CodeValidHisParam param);

     /**
      * 核销佣金明细（新需求）
      * @param couponCode 券码
      * @return
      */
     CouponHistoryVO getValidCommissionDetail(String couponCode);

     /**
      * 商家验码记录列表
      * @param param
      * @return
      */
     BizzValidHistoryVO getBizzValidHistoryPage(BizzValidHistoryParam param);

    /**
     * 商家验码记录列表
     * @param param
     * @return
     */
    BizzValidHistoryVO getValidHisByPage(BizzValidHistoryParam param);

    /**
     * @param param 查询验券记录
     * @return
     */
    TradeValidRecord getTradeValidRecord(BizzValidHistoryParam param);
}

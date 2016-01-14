package com.rongyi.rss.tradecenter;

import java.util.Map;

import com.rongyi.core.common.PagingVO;
import com.rongyi.easy.coupon.vo.CouponHistoryVO;
import com.rongyi.easy.coupon.vo.ValidCommissionVO;
import com.rongyi.easy.tradecenter.TradeValidRecord;
import com.rongyi.easy.tradecenter.param.BizzValidHistoryParam;
import com.rongyi.easy.tradecenter.param.CodeValidHisParam;
import com.rongyi.easy.tradecenter.vo.BizzValidHistoryVO;

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
      * @param validHistory
      */
     void saveValidHistory(TradeValidRecord tradeValidRecord);

     /**
      * 
      * @param params
      * @return
      */
     PagingVO<TradeValidRecord> getValidHistoryPage(CodeValidHisParam param);
    
     /**
      * 核销佣金列表
      * @param params
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
	 * @param params
	 * @return
	 */
	ValidCommissionVO getValidCommissionPaging(CodeValidHisParam param);

     /**
      * 商家验码记录列表
      * @param param
      * @return
      */
     BizzValidHistoryVO getBizzValidHistoryPage(BizzValidHistoryParam param);
}

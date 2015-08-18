package com.rongyi.rss.coupon;

import java.util.Map;

import com.rongyi.core.common.PagingVO;
import com.rongyi.easy.coupon.param.MMValidHistoryParam;
import com.rongyi.easy.coupon.vo.CouponHistoryVO;
import com.rongyi.easy.roa.entity.ValidHistory;
/**
 * 优惠券验证历史记录相关
 * 1) 查询验证列表   1) 保存验证记录
 * @author hebo  2015/06/15
 */
public interface RoaValidHistoryService {

	 /**
     * 分页查询验证历史记录
     * @param paramMap
     * @return
     */
     PagingVO<CouponHistoryVO> searchCouponCodeListAndCount(Map paramMap);

     /**
      * 
      * @param validHistory
      */
     void saveValidHistory(ValidHistory validHistory);

     /**
      * 
      * @param params
      * @return
      */
     PagingVO<ValidHistory> getValidHistoryPage(MMValidHistoryParam params);
    
     /**
      * 核销佣金列表
      * @param params
      * @return
      */
     PagingVO<CouponHistoryVO> getValidCommissionPageVO(MMValidHistoryParam params);

     /**
      * 查询用户当天该类优惠券的使用次数
      * @param referenceId
      * @param userId
      * @return
      */
	int getDailyCount(String referenceId, String userId);
	
}

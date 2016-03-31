package com.rongyi.rss.tradecenter;

import com.rongyi.core.common.PagingVO;
import com.rongyi.easy.coupon.param.MMValidHistoryParam;
import com.rongyi.easy.coupon.vo.CouponHistoryVO;
import com.rongyi.easy.coupon.vo.ValidCommissionVO;
import com.rongyi.easy.roa.entity.ValidHistory;

import java.util.Map;

/**
 * Description:
 * 现有coupon-service相关接口的代理实现，
 * 和之前接口请求和返回类型一样，
 * 目的是最小代价将依赖从coupon-service切换过来
 *
 * @author yujisun
 * @date 2015/9/2
 */
public interface ProxyCodeValidHisService {

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
      * 核销佣金明细
      * @param couponCode 券码
      * @return
      */
     CouponHistoryVO getValidCommissionDetail(String couponCode);

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
	ValidCommissionVO getValidCommissionPaging(MMValidHistoryParam params);

}

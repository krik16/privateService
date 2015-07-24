package com.rongyi.rss.coupon;

import com.rongyi.core.common.PagingVO;
import com.rongyi.easy.coupon.param.MMValidHistoryParam;
import com.rongyi.easy.coupon.vo.CouponHistoryVO;
import com.rongyi.easy.roa.entity.ValidHistory;

/**
 * 验证历史记录
 * @author hebo 07/01
 *
 */
public interface MMValidHistoryService {
	
	/**
     * 分页查询验证历史记录
     * @param param
     * @return
     */
     PagingVO<ValidHistory> getValidHostoryPage(MMValidHistoryParam params);
	
     /**
      * 分页查询核销佣金
      * @param params
      * @return
      */
     PagingVO<CouponHistoryVO> getValidCommissionPage(MMValidHistoryParam params);
     
}

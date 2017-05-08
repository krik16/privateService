package com.rongyi.rss.checkout;

import com.rongyi.core.bean.DubboVO;
import com.rongyi.easy.pos.param.ReductionQueryParam;
import com.rongyi.easy.pos.vo.ReductionQueryVO;

/**
 * 满减服务
 *
 * @author wangjh7
 * @date 2017-03-01
 */
public interface ReductionService {

    /**
     * 计算满减扣减金额
     *
     * @param param
     * @return
     */
    DubboVO<ReductionQueryVO> getReductionFee(ReductionQueryParam param);
}

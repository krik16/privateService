package com.rongyi.rss.roa;

import com.rongyi.easy.roa.param.MemberBonusParam;

/**
 * 更新会员积分
 * @author baodk
 */
public interface IMemberBonusAdjustmentService {
    
    public String bonusAdjustment(MemberBonusParam memberBonusParam, String methodName);
}

package com.rongyi.rss.settle;

/**
 * Created by kejun on 2015/12/9.
 */
public interface GoodPayService {

    /**
     * @Description:验证是否需要打款到买家虚拟账号
     * @param:shopId 店铺ID
     * @param:userId 用户ID
     * @param:guideType 用户角色(1:导购,2:买手)
     * @return true	打款，false 不打款
     * @Author:  柯军
     **/

    boolean validateNeedPay(String shopId,String userId,Integer guideType);
}

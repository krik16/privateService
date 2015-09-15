package com.rongyi.rss.roa;

import com.rongyi.easy.va.vo.VirtualAccountVO;

public interface ROAVirtualAccountGeneralService {

    /**
     * 虚拟账户查询
     *
     * @param userId 用户id
     * @return
     * @author ZhangZp
     * @date 2015年5月30日
     */
    public VirtualAccountVO queryVirtualAccount(String userId);

    /**
     * 账号冻结/解冻
     *
     * @param userId      用户Id
     * @param isSuspended true=冻结，false=false
     * @return
     * @author ZhangZp
     * @date 2015年5月30日
     */
    public boolean setAccountSuspend(String userId, boolean isSuspended, String stopReason);
}

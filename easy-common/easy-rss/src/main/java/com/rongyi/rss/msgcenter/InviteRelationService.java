package com.rongyi.rss.msgcenter;

import com.rongyi.core.common.PagingVO;
import com.rongyi.easy.msgcenter.InviteRecordSearchParam;
import com.rongyi.easy.msgcenter.vo.InviteRelationVo;
import com.rongyi.easy.msgcenter.vo.OldPushNewInviteTotalVo;

import java.util.Date;
import java.util.List;

/** 用户红包关联service
 * Created by shaozhou on 2016/8/26.
 */
public interface InviteRelationService {
    /**
     * 根据用户id获取领取红包详情
     * @param userId
     * @return
     */
    PagingVO<InviteRelationVo> getInviteRecordByUserId(InviteRecordSearchParam param);

    /**
     * 根据用户id获取领取红包汇总信息
     * @param userId
     * @return
     */
    OldPushNewInviteTotalVo getInviteRecordTotalVo(String userId);

    /**
     * 根据老用户id获取是否有最新的老推新记录
     * @param userId
     * @return
     */
    int getUpTodateInviteRecord(String userId,Date searchTime);
}

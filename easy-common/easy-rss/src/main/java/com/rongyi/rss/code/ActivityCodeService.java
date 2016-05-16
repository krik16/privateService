package com.rongyi.rss.code;

import com.rongyi.easy.code.ImportInviteCodeParam;
import com.rongyi.easy.code.InviteCodeVO;

import java.util.List;

/**
 * Description: 活动相关的码需求接口
 * Author: 袁波
 * DATE: 2016/5/16 16:04
 * Package:com.rongyi.rss.code
 * Project:easy-market
 */
public interface ActivityCodeService {
    /**
     * 生成邀请码
     * @param param
     * @return
     */
    public List<InviteCodeVO> generateInviteCode(ImportInviteCodeParam param);

    /**
     * 根据券id 返回券码
     * @param couponId 卡券id
     * @param count 数量
     * @return
     */
    public List<String> getCouponCodesFromCouponId(String couponId,Integer count);
}

package com.rongyi.rss.code;

import com.rongyi.core.framework.exception.CodeServiceException;
import com.rongyi.easy.malllife.vo.UserInfoVO;

/**
 * Description:容易逛 邀请码红包和推广码红包接口
 * Author: 袁波
 * DATE: 2016/7/3 10:58
 * Package:com.rongyi.rss.code
 * Project:easy-market
 */
public interface MSHannelsService {
    public void getCouponsByInviteCode(String code,UserInfoVO userInfoVO) throws CodeServiceException;
}

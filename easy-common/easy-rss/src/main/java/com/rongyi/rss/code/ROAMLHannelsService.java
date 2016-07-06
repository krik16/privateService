package com.rongyi.rss.code;

import com.rongyi.core.bean.ResponseVO;
import com.rongyi.core.framework.exception.CodeServiceException;
import com.rongyi.easy.code.MLHannelsVO;
import com.rongyi.easy.malllife.vo.UserInfoVO;

/**
 * Description:容易逛 邀请码红包和推广码红包接口
 * Author: 袁波
 * DATE: 2016/7/3 11:04
 * Package:com.rongyi.rss.code
 * Project:easy-market
 */
public interface ROAMLHannelsService {
    /**
     * 根据邀请码或者推广码获取红包
     * @param code 6位表示邀请码，10位表示推广码
     * @param userInfoVO 容易逛用户信息
     * @throws CodeServiceException
     */
    public MLHannelsVO getCouponsByInviteCode(String code,UserInfoVO userInfoVO) throws CodeServiceException;
}

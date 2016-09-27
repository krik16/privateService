package com.rongyi.rss.code;

import com.rongyi.core.bean.ResponseResult;
import com.rongyi.easy.coupon.param.RmmmValidCodeParam;
import com.rongyi.easy.rmmm.entity.RmmmUserInfoEntity;
import com.rongyi.easy.rmmm.param.ValidHistoryParam;

/**
 * Description: 积分2.1 验码接口
 * Author: 袁波
 * DATE: 2016/9/27 16:13
 * Package:com.rongyi.rss.code
 * Project:easy-common
 */
public interface IntegralValidService {
    /**
     * 扫码接口
     * @param param
     * @param userInfoEntity
     * @return
     */
    public ResponseResult sweepCodeToValid(RmmmValidCodeParam param, RmmmUserInfoEntity userInfoEntity);

    /**
     * 根据数量验证券码
     * @param param
     * @param userInfoEntity
     * @return
     */
    public ResponseResult validCouponCodeByNum(RmmmValidCodeParam param, RmmmUserInfoEntity userInfoEntity);

    /**
     * 获取验码记录接口
     * @param param
     * @param userInfoEntity
     * @return
     */
    public ResponseResult myValidHistoryList(ValidHistoryParam param, RmmmUserInfoEntity userInfoEntity);

}

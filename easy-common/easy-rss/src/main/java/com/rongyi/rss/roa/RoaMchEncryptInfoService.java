package com.rongyi.rss.roa;

import com.rongyi.easy.roa.entity.MchEncryptInfo;

/**
 * conan
 * 2017/2/9 10:49
 **/
public interface RoaMchEncryptInfoService {

    /**
     *根据商户id查询商户加密参数信息
     * @param ryMchId 容易商户号
     * @return MchEncryptInfo
     */
    MchEncryptInfo getByRyMchId(String ryMchId);
}

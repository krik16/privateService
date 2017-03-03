package com.rongyi.rss.lightning;

import com.rongyi.easy.roa.vo.RyMchAppVo;

/**
 * conan
 * 2017/2/21 14:18
 **/
public interface RoaRyMchAppService {


    /**
     * 根据容易商户号和容易appId查询开放入住商户信息
     * @param ryMchId 容易商户号
     * @param ryAppId 容易商户应用号
     * @return RyMchAppVo
     */
    RyMchAppVo getByMchIdAndAppId(String ryMchId,String ryAppId);
}

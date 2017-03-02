package com.rongyi.rss.rpb;

import com.rongyi.easy.rpb.vo.RyMchVo;
import com.rongyi.easy.rpb.vo.WwPunchCardPayVo;

import java.util.Map;

/**
 * 微众支付服务接口
 * conan
 * 2017/2/27 13:46
 **/
public interface IweBankService {

    /**
     * 微众微信刷卡支付
     * @param ryMchVo 容易商户信息
     * @param wwPunchCardPayVo 刷卡支付业务参数
     * @return map
     */
    Map<String,Object> webankWechatPunchCardPay(RyMchVo ryMchVo,WwPunchCardPayVo wwPunchCardPayVo);

    Map<String,Object> weBankWechatPayQuery(RyMchVo ryMchVo);
}

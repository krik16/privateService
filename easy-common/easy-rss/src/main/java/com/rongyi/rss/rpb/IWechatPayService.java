package com.rongyi.rss.rpb;

import com.rongyi.easy.rpb.vo.WechatConfigureVo;
import com.rongyi.easy.rpb.vo.WechatPaySignVo;

import java.util.Map;

/**
 * conan
 * 2017/2/6 16:51
 **/
public interface IWechatPayService {

    /**
     * 获取微信支付签名(app或者jsapi)
     * @param wechatPaySignVo 业务参数
     * @param wechatConfigureVo 支付参数
     * @return map 签名内容
     */
    Map<String, Object> getPaySign(WechatPaySignVo wechatPaySignVo, WechatConfigureVo wechatConfigureVo);

    /**
     * 普通支付退款
     * orderNo 订单号
     * refundFee 退款金额(单位分)
     * wechatConfigureVo 支付参数
     **/
    Map<String,Object> refund(String orderNo, int refundFee, WechatConfigureVo wechatConfigureVo);

    /**
     * 刷卡支付
     * @param wechatPaySignVo 业务参数
     * @param wechatConfigureVo 支付参数
     * @return map 签名内容
     */
    Map<String,Object> punchCardPay(WechatPaySignVo wechatPaySignVo, WechatConfigureVo wechatConfigureVo);

    /**
     * 刷卡支付订单查询
     * @param orderNo 订单号
     * @param wechatConfigureVo 支付参数
     * @return map 查询结果
     */
    Map<String,Object> punchCardPayQueryOrder(String orderNo, WechatConfigureVo wechatConfigureVo);


    /**
     * 获取用户openId
     * @param code code码
     * @param state 自定义参数
     * @param wechatConfigureVo 支付参数
     * @return map
     */
    Map<String,Object> getOpenId(String code, String state, WechatConfigureVo wechatConfigureVo);


}

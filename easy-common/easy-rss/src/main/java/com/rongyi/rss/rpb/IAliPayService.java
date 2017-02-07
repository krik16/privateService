package com.rongyi.rss.rpb;

import com.rongyi.easy.rpb.vo.AliConfigureVo;
import com.rongyi.easy.rpb.vo.AliPaySignVo;

import java.util.Map;

/**
 * conan
 * 2017/2/7 17:04
 **/
public interface IAliPayService {

    /**
     * 获取支付宝扫码支付签名
     * @param aliPaySignVo 业务参数
     * @param aliConfigureVo 支付参数
     * @return map 签名内容
     */
    Map<String, Object> getPaySign(AliPaySignVo aliPaySignVo, AliConfigureVo aliConfigureVo);

    /**
     * 面对面支付退款
     * @param orderNo 订单号
     * @param refundAmount 退款金额
     * @param refundReason 退款原因
     * @param aliConfigureVo 支付参数
     * @return map
     */
    Map<String,Object> f2fPayRefund(String orderNo, Integer refundAmount, String refundReason, AliConfigureVo aliConfigureVo);

    /**
     * 获取用户支付授权链接
     * @param storeId 商户id
     * @param authType 授权类型，1商户授权，2:用户授权
     * @param redirectUrl 支付宝回调地址
     * @param aliConfigureVo 支付参数
     * @return String
     */
    String getUserAuthUrl(String storeId,Integer authType,String redirectUrl, AliConfigureVo aliConfigureVo);


}

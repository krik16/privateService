package com.rongyi.pay.core.unit;

import com.rongyi.pay.core.Exception.ParamNullException;
import com.rongyi.pay.core.Exception.TradeException;
import com.rongyi.pay.core.Exception.WeChatException;
import com.rongyi.pay.core.constants.ConstantEnum;
import com.rongyi.pay.core.wechat.model.*;
import com.rongyi.pay.core.wechat.service.*;
import com.rongyi.pay.core.wechat.util.*;
import net.sf.json.JSONObject;
import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.MessageFormat;
import java.util.HashMap;
import java.util.Map;


/**
 * 微信支付
 * conan
 * 2016/10/11 14:49
 **/
public class WeChatPayUnit {

    private static final Logger LOGGER = LoggerFactory.getLogger(WeChatPayUnit.class);

    private static final long retryInterval = 4000;//等待时间

    /**
     * 获取微信支付签名
     * wechatPaySignData 支付参数信息
     * wechatConfigure 账号配置信息
     * notifyUrl 异步通知地址
     **/
    public static Map<String, Object> getPaySign(WechatPaySignData wechatPaySignData, WechatConfigure wechatConfigure, String notifyUrl) {
        LOGGER.info("获取微信支付签名,wechatPaySignData={},wechatConfigure={},notifyUrl={}", wechatPaySignData, wechatConfigure, notifyUrl);
        Map<String, Object> map = new HashMap<>();
        try {
            if (StringUtils.isEmpty(wechatPaySignData.getPayNo()) || null == wechatPaySignData.getTotalFee() || StringUtils.isEmpty(wechatPaySignData.getBody())) {
                throw new ParamNullException();
            }
            //封装请求参数类
            UnifedOrderReqData unifedOrderReqData = new UnifedOrderReqData(wechatPaySignData.getBody(), wechatPaySignData.getPayNo(), wechatPaySignData.getTotalFee().intValue(),
                    notifyUrl, wechatPaySignData.getTimeStart(), wechatPaySignData.getTimeExpire(), wechatPaySignData.getOpenId(), wechatConfigure);
            UnifiedOrderService unifiedOrderService = new UnifiedOrderService();
            //发送请求
            String result = unifiedOrderService.request(unifedOrderReqData, wechatConfigure);
            LOGGER.info("签名返回结果result={}", result);
            String timestamp = WXUtil.getTimeStamp();
            Map<String, Object> resultMap = XMLParser.getMapFromXML(result);

            if (resultMap != null) {
                if(!"SUCCESS".equals(resultMap.get("return_code"))){
                    throw new WeChatException("-1", resultMap.get("return_msg").toString());
                }
                if (ConstantEnum.WEIXIN_PAY_TRADE_TYPE_APP.getValueStr().equals(wechatConfigure.getTradeType())) {//APP支付签名
                    map.put("timeStamp", timestamp);
                    map.put("appId", wechatConfigure.getAppID());
                    map.put("partnerId", wechatConfigure.getMchID());
                    map.put("package", "Sign=WXPay");
                    if (resultMap.get("prepay_id") == null)
                        throw new WeChatException(ConstantEnum.EXCEPTION_WEIXIN_SIGN_FAIL.getCodeStr(), ConstantEnum.EXCEPTION_WEIXIN_SIGN_FAIL.getValueStr());
                    map.put("prepayId", resultMap.get("prepay_id"));
                    map.put("nonceStr", resultMap.get("nonce_str"));
                } else {//微信公众号支付签名
                    map.put("timeStamp", timestamp);
                    map.put("appId", wechatConfigure.getAppID());
                    map.put("signType", "MD5");
                    map.put("package", "prepay_id=" + resultMap.get("prepay_id"));
                    map.put("nonceStr", resultMap.get("nonce_str"));
                }
                String sign = Signature.getSign(map, wechatConfigure.getKey());
                map.put("appSignature", sign);
            }
            map.put("payNo",wechatPaySignData.getPayNo());
        } catch (WeChatException | ParamNullException e) {
            throw e;
        } catch (Exception e) {
            LOGGER.error("获取微信支付签名,e.getMessage={}", e.getMessage(), e);
            e.printStackTrace();
            throw new WeChatException(ConstantEnum.EXCEPTION_WEIXIN_SIGN_FAIL.getCodeStr(), ConstantEnum.EXCEPTION_WEIXIN_SIGN_FAIL.getValueStr());
        }
        return map;
    }

    /**
     * 退款
     * payNo 付款单号
     * refundFee 退款金额(单位分)
     * totalFee 原付款金额(单位分)
     * newPayNo 退款单号
     * wechatConfigure 账号配置信息
     **/

    public static RefundResData refund(String payNo, int refundFee, int totalFee, String newPayNo, WechatConfigure wechatConfigure) {
        LOGGER.info("退款申请,refund payNo={},refundFee={},totalFee={},newPayNo={}", payNo, refundFee, totalFee, newPayNo);
        String result = null;
        try {
            if (StringUtils.isEmpty(payNo) || refundFee <= 0 || totalFee < refundFee || StringUtils.isEmpty(newPayNo)) {
                throw new ParamNullException();
            }
            //封装退款请求参数类
            RefundReqData refundReqData = new RefundReqData(null, payNo, null, newPayNo, totalFee, refundFee, null, wechatConfigure);
            //发送退款请求
            RefundService refundService = new RefundService();
            result = refundService.request(refundReqData, wechatConfigure);
            RefundResData refundResData = (RefundResData) Util.getObjectFromXML(result, RefundResData.class);
            // 验证退款申请操作结果,最终退款结果以退款查询接口的结果为准
            if ("SUCCESS".equals(refundResData.getReturn_code()) && "SUCCESS".equals(refundResData.getResult_code())) {
                LOGGER.info("退款申请操作成功,refundResData={}", refundResData);
                return refundResData;
            } else {
                LOGGER.info("退款申请操作失败 result={}", result);
                throw new WeChatException(ConstantEnum.EXCEPTION_WEIXIN_REFUND_FAIL.getCodeStr(), !StringUtils.isEmpty(refundResData.getErr_code_des()) ? refundResData.getErr_code_des() : ConstantEnum.EXCEPTION_WEIXIN_REFUND_FAIL.getValueStr());
            }
        } catch (WeChatException | ParamNullException e) {
            throw e;
        } catch (Exception e) {
            LOGGER.error("微信退款申请失败,result={}e.getMessage={}", result, e.getMessage(), e);
            e.printStackTrace();
            throw new WeChatException(ConstantEnum.EXCEPTION_WEIXIN_REFUND_FAIL.getCodeStr(), ConstantEnum.EXCEPTION_WEIXIN_REFUND_FAIL.getValueStr());
        }
    }

    /**
     * 验证退款查询结果是否正确
     * param:tradeNo 交易流水号
     * param:payNo 付款单号
     * param:refundNo 退款单号
     **/

    public static void checkRefundQueryResult(String tradeNo, String payNo, String refundNo, WechatConfigure wechatConfigure) {
        LOGGER.info("退款申请操作结果检查,checkRefundQueryResult tradeNo={},payNo={},refundNo={}", tradeNo, payNo, refundNo);
        RefundQueryResData refundQueryResData = refundQuery(tradeNo, payNo, refundNo, wechatConfigure);
        if (ConstantEnum.WEIXIN_REFUND_RESULT_SUCCESS.getCodeStr().equals(refundQueryResData.getRefund_status_0())
                || ConstantEnum.WEIXIN_REFUND_RESULT_PROCESSING.getCodeStr().equals(refundQueryResData.getRefund_status_0())) {// 退款成功
            LOGGER.info("退款结果检查成功");
        } else if (ConstantEnum.WEIXIN_REFUND_RESULT_NOTSURE.getCodeStr().equals(refundQueryResData.getRefund_status_0())) {
            throw new WeChatException(ConstantEnum.WEIXIN_REFUND_RESULT_NOTSURE.getCodeStr(), ConstantEnum.WEIXIN_REFUND_RESULT_NOTSURE.getValueStr());
        } else if (ConstantEnum.WEIXIN_REFUND_RESULT_CHANGE.getCodeStr().equals(refundQueryResData.getRefund_status_0())) {
            throw new WeChatException(ConstantEnum.WEIXIN_REFUND_RESULT_CHANGE.getCodeStr(), ConstantEnum.WEIXIN_REFUND_RESULT_CHANGE.getValueStr());
        } else if (ConstantEnum.WEIXIN_REFUND_RESULT_FAIL.getCodeStr().equals(refundQueryResData.getRefund_status_0())) {
            throw new WeChatException(ConstantEnum.WEIXIN_REFUND_RESULT_FAIL.getCodeStr(), ConstantEnum.WEIXIN_REFUND_RESULT_CHANGE.getValueStr());
        } else {
            LOGGER.info("退款成功，但是查询结果异常，忽略查询结果，查询结果内容=" + refundQueryResData.toString());
        }
    }

    /**
     * 微信退款查询
     **/

    public static RefundQueryResData refundQuery(String tradeNo, String payNo, String refundNo, WechatConfigure wechatConfigure) {
        LOGGER.info("退款查询,refundQuery tradeNo={},payNo={},refundNo={},wechatConfigure={}", tradeNo, payNo, refundNo, wechatConfigure);
        RefundQueryResData refundQueryResData;
        String result = null;
        try {
            if (StringUtils.isEmpty(tradeNo) && StringUtils.isEmpty(payNo) && StringUtils.isEmpty(refundNo)) {
                throw new ParamNullException();
            }
            RefundQueryService refundQueryService = new RefundQueryService();
            RefundQueryReqData refundQueryReqData = new RefundQueryReqData(tradeNo, payNo, null, refundNo, null, wechatConfigure);
            result = refundQueryService.request(refundQueryReqData, wechatConfigure);
            refundQueryResData = (RefundQueryResData) Util.getObjectFromXML(result, RefundQueryResData.class);
        } catch (TradeException e) {
            throw e;
        } catch (Exception e) {
            LOGGER.error("微信退款查询失败,result={},e.getMessage={}", result, e.getMessage(), e);
            e.printStackTrace();
            throw new WeChatException(ConstantEnum.EXCEPTION_WEIXIN_REFUND_QUERY_ORDER.getCodeStr(), ConstantEnum.EXCEPTION_WEIXIN_REFUND_QUERY_ORDER.getValueStr());
        }
        return refundQueryResData;
    }

    /**
     * 关闭订单
     */
    public static void closeOrder(String payNo, WechatConfigure wechatConfigure) {
        LOGGER.info("关闭订单,closeOrder payNo={},wechatConfigure={}", payNo, wechatConfigure);
        String result = null;
        try {
            if (StringUtils.isEmpty(payNo)) {
                throw new ParamNullException();
            }
            ReverseService reverseService = new ReverseService();
            ReverseReqData reverseReqData = new ReverseReqData(null, payNo, wechatConfigure);
            result = reverseService.request(reverseReqData, wechatConfigure);
            if (!result.contains("CDATA[SUCCESS]")) {
                LOGGER.error("关闭订单失败. result={}", result);
                throw new WeChatException(ConstantEnum.EXCEPTION_WEIXIN_ORDER_CLOSE.getCodeStr(), ConstantEnum.EXCEPTION_WEIXIN_ORDER_CLOSE.getValueStr());
            }
        } catch (WeChatException e) {
            throw e;
        } catch (Exception e) {
            LOGGER.error("关闭订单失败,result={},e.getMessage={}", result, e.getMessage(), e);
            e.printStackTrace();
            throw new WeChatException(ConstantEnum.EXCEPTION_WEIXIN_ORDER_CLOSE.getCodeStr(), ConstantEnum.EXCEPTION_WEIXIN_ORDER_CLOSE.getValueStr());
        }
    }


    /**
     * 扫码刷卡支付
     **/
    public static PunchCardPayResData punchCardPay(WechatPaySignData wechatPaySignData, WechatConfigure wechatConfigure) {
        LOGGER.info("微信刷卡支付,wechatPaySignData={},wechatConfigure={}", wechatPaySignData, wechatConfigure);
        PunchCardPayResData punchCardPayResData;
        String result = null;
        try {
            if (StringUtils.isEmpty(wechatPaySignData.getPayNo()) || null == wechatPaySignData.getTotalFee()
                    || StringUtils.isEmpty(wechatPaySignData.getBody())) {
                throw new ParamNullException();
            }
            //封装请求参数
            PunchCardPayReqData punchCardPayReqData = new PunchCardPayReqData(wechatPaySignData.getAuthCode(), wechatPaySignData.getBody(), "",
                    wechatPaySignData.getPayNo(), wechatPaySignData.getTotalFee(), "", "", "", "", "", wechatConfigure);
            PunchCardPayService punchCardPayService = new PunchCardPayService();
            //发起支付请求
            result = punchCardPayService.request(punchCardPayReqData, wechatConfigure);
            //处理支付结果
            punchCardPayResData = (PunchCardPayResData) Util.getObjectFromXML(result, PunchCardPayResData.class);
            LOGGER.info("punchCardPayResData={}", punchCardPayResData);
            if ("FAIL".equals(punchCardPayResData.getReturn_code())) {//通信错误
                throw new WeChatException(ConstantEnum.EXCEPTION_WEIXIN_PUNCH_CARD_FAIL.getCodeStr(), ConstantEnum.EXCEPTION_WEIXIN_PUNCH_CARD_FAIL.getValueStr());
            } else if ("FAIL".equals(punchCardPayResData.getResult_code())) {//业务错误
                if ("USERPAYING".equals(punchCardPayResData.getErr_code())) {
                    LOGGER.info("用户正在输入密码，等待中...");
                    waitUserPaying(wechatPaySignData.getPayNo(), wechatConfigure,punchCardPayResData,8);
                } else {
                    throw new WeChatException(punchCardPayResData.getErr_code(), punchCardPayResData.getErr_code_des());
                }
            } else if (!"SUCCESS".equals(punchCardPayResData.getReturn_code()) || !"SUCCESS".equals(punchCardPayResData.getResult_code())){
                throw new WeChatException(punchCardPayResData.getErr_code(), punchCardPayResData.getErr_code_des());
            }

        } catch (WeChatException | ParamNullException e) {
            throw e;
        } catch (Exception e) {
            LOGGER.error("刷卡失败,result={},e.getMessage={}", result, e.getMessage(), e);
            throw new WeChatException(ConstantEnum.EXCEPTION_WEIXIN_PUNCH_CARD_FAIL.getCodeStr(), ConstantEnum.EXCEPTION_WEIXIN_PUNCH_CARD_FAIL.getValueStr());
        }
        LOGGER.info("支付结果,punchCardPayResData={}",punchCardPayResData);
        return punchCardPayResData;
    }

    /**
     * 原生刷卡支付
     **/
    public static PunchCardPayResData punchCardNativePay(WechatPaySignData wechatPaySignData, WechatConfigure wechatConfigure) {
        LOGGER.info("微信原生刷卡支付,wechatPaySignData={},wechatConfigure={}", wechatPaySignData, wechatConfigure);
        PunchCardPayResData punchCardPayResData;
        String result = null;
        try {
            if (StringUtils.isEmpty(wechatPaySignData.getPayNo()) || null == wechatPaySignData.getTotalFee()
                    || StringUtils.isEmpty(wechatPaySignData.getBody())) {
                throw new ParamNullException();
            }
            //封装请求参数
            PunchCardPayReqData punchCardPayReqData = new PunchCardPayReqData(wechatPaySignData.getAuthCode(), wechatPaySignData.getBody(), "",
                    wechatPaySignData.getPayNo(), wechatPaySignData.getTotalFee(), "", "", "", "", "", wechatConfigure);
            PunchCardPayService punchCardPayService = new PunchCardPayService();
            //发起支付请求
            result = punchCardPayService.request(punchCardPayReqData, wechatConfigure);
            //处理支付结果
            punchCardPayResData = (PunchCardPayResData) Util.getObjectFromXML(result, PunchCardPayResData.class);
            LOGGER.info("punchCardPayResData={}", punchCardPayResData);
            if ("FAIL".equals(punchCardPayResData.getReturn_code())) {//通信错误
                throw new WeChatException(ConstantEnum.EXCEPTION_WEIXIN_PUNCH_CARD_FAIL.getCodeStr(), ConstantEnum.EXCEPTION_WEIXIN_PUNCH_CARD_FAIL.getValueStr());
            } else if ("FAIL".equals(punchCardPayResData.getResult_code())) {//业务错误
                if ("USERPAYING".equals(punchCardPayResData.getErr_code())) {
                    LOGGER.info("用户正在输入密码...");
                    return punchCardPayResData;
                } else {
                    throw new WeChatException(punchCardPayResData.getErr_code(), punchCardPayResData.getErr_code_des());
                }
            } else if (!"SUCCESS".equals(punchCardPayResData.getReturn_code()) || !"SUCCESS".equals(punchCardPayResData.getResult_code())){
                throw new WeChatException(punchCardPayResData.getErr_code(), punchCardPayResData.getErr_code_des());
            }

        } catch (WeChatException | ParamNullException e) {
            throw e;
        } catch (Exception e) {
            LOGGER.error("刷卡失败,result={},e.getMessage={}", result, e.getMessage(), e);
            throw new WeChatException(ConstantEnum.EXCEPTION_WEIXIN_PUNCH_CARD_FAIL.getCodeStr(), ConstantEnum.EXCEPTION_WEIXIN_PUNCH_CARD_FAIL.getValueStr());
        }
        LOGGER.info("支付结果,punchCardPayResData={}",punchCardPayResData);
        return punchCardPayResData;
    }

    /**
     * 扫码支付等待用户支付处理
     *
     * @param orderNo   订单号
     * @param wechatConfigure 商户配置信息
     */
    public static void waitUserPaying(String orderNo, WechatConfigure wechatConfigure,PunchCardPayResData punchCardPayResData,Integer retryTimes) {
        LOGGER.info("刷卡支付等待用户输入密码,最多等待{}s,orderNo={}", retryTimes*retryInterval/1000, orderNo);

        boolean result = false;//支付结果
        for (int i = 1; i <= retryTimes; i++) {
            try {
                PunchCardPayQueryResData punchCardPayQueryResData = punchCardPayQueryOrder(null, orderNo, wechatConfigure);
                LOGGER.info("等待次数times={},punchCardPayQueryResData={}", i, punchCardPayQueryResData);
                if ("SUCCESS".equals(punchCardPayQueryResData.getReturn_code()) && "SUCCESS".equals(punchCardPayQueryResData.getResult_code())
                        && "SUCCESS".equals(punchCardPayQueryResData.getTrade_state())) {
                    LOGGER.info("用户密码输入完成，成功支付");
                    result = true;
                    BeanUtils.copyProperties(punchCardPayResData,punchCardPayQueryResData);
                    break;
                }else if("SUCCESS".equals(punchCardPayQueryResData.getReturn_code()) && "SUCCESS".equals(punchCardPayQueryResData.getResult_code())
                        && !"USERPAYING".equals(punchCardPayQueryResData.getTrade_state())){
                    throw new WeChatException(punchCardPayQueryResData.getTrade_state(),punchCardPayQueryResData.getTrade_state_desc());
                }
                Thread.sleep(retryInterval);
            }catch (WeChatException e){
                throw e;
            }catch (Exception e) {
                e.printStackTrace();
                if (i == retryTimes - 1) {
                    LOGGER.error("wait user paying failed after retry {} times!", retryTimes);
                    break;
                }
                try {
                    Thread.sleep(retryInterval);
                } catch (InterruptedException e1) {
                    LOGGER.warn("wait user paying has been blocked. Wait {} seconds and retry {}", retryInterval / 1000, i + 1);
                }
            }
        }
        if (!result) {
            LOGGER.warn("用户超时未完成支付,需重新支付");
            reverseOrder(orderNo, wechatConfigure);
            throw new WeChatException(ConstantEnum.EXCEPTION_WEIXIN_REVERSE_SUCCESS.getCodeStr(),ConstantEnum.EXCEPTION_WEIXIN_REVERSE_SUCCESS.getValueStr());
        }
    }

    /**
     * Description:扫码支付订单查询
     * param:
     * Author: 柯军
     **/

    public static PunchCardPayQueryResData punchCardPayQueryOrder(String tradeNo, String orderNo, WechatConfigure wechatConfigure) {
        LOGGER.info("刷卡支付订单查询,punchCardPayQueryOrder tradeNo={},orderNo={},wechatConfigure={}", tradeNo, orderNo, wechatConfigure);
        String result = null;
        try {
            if (StringUtils.isEmpty(tradeNo) && StringUtils.isEmpty(orderNo)) {
                throw new ParamNullException();
            }
            PayQueryService payQueryService = new PayQueryService();
            PunchCardPayQueryReqData punchCardPayQueryReqData = new PunchCardPayQueryReqData(tradeNo, orderNo, wechatConfigure);
            result = payQueryService.request(punchCardPayQueryReqData, wechatConfigure);
            return (PunchCardPayQueryResData) Util.getObjectFromXML(result, PunchCardPayQueryResData.class);
        } catch (Exception e) {
            LOGGER.info("刷卡支付订单查询失败，result={}", result);
            e.printStackTrace();
            throw new WeChatException(ConstantEnum.EXCEPTION_WEIXIN_QUERY_ORDER.getCodeStr(), ConstantEnum.EXCEPTION_WEIXIN_QUERY_ORDER.getValueStr());
        }
    }

    /**
     * 撤销订单
     *
     * @param orderNo   订单号
     * @param wechatConfigure 商户配置信息
     */
    public static void reverseOrder(String orderNo, WechatConfigure wechatConfigure) {

        LOGGER.info("撤销订单开始,reverseOrder orderNo={}", orderNo);
        String result = null;
        try {
            Thread.sleep(retryInterval);
            if (StringUtils.isEmpty(orderNo)) {
                throw new ParamNullException();
            }
            ReverseService reverseService = new ReverseService();
            ReverseReqData reverseReqData = new ReverseReqData(null, orderNo, wechatConfigure);
            result = reverseService.request(reverseReqData, wechatConfigure);
            ReverseResData reverseResData = (ReverseResData) Util.getObjectFromXML(result, ReverseResData.class);
            if (!"SUCCESS".equals(reverseResData.getReturn_code()) || !"SUCCESS".equals(reverseResData.getResult_code())) {
                LOGGER.error("撤销订单失败，result={}", result);
                throw new WeChatException(ConstantEnum.EXCEPTION_WEIXIN_ORDER_CLOSE.getCodeStr(), ConstantEnum.EXCEPTION_WEIXIN_ORDER_CLOSE.getValueStr());
            }
            LOGGER.info("撤销订单完成");
        } catch (WeChatException e) {
            throw e;
        } catch (Exception e) {
            LOGGER.info("撤销订单失败，e.getMessage={},result={}", result, e.getMessage());
            e.printStackTrace();
            throw new WeChatException(ConstantEnum.EXCEPTION_WEIXIN_ORDER_CLOSE.getCodeStr(), ConstantEnum.EXCEPTION_WEIXIN_ORDER_CLOSE.getValueStr());
        }
    }

    /**
     * 刷卡支付退款
     **/

    public static RefundResData punchCardRefund(String orderNo, int refundFee, int totalFee, String refundNo, WechatConfigure wechatConfigure) {
        LOGGER.info("开始退款,weixinRefund orderNo={},refundFee={},totalFee={},newPayNo={},wechatConfigure={}", orderNo, refundFee, totalFee, refundNo, wechatConfigure);
        String result = null;
        try {
            if (StringUtils.isEmpty(orderNo) || refundFee <= 0 || totalFee < refundFee || StringUtils.isEmpty(refundNo)) {
                throw new ParamNullException();
            }
            RefundReqData refundReqData = new RefundReqData(null, orderNo, null, refundNo, refundFee, totalFee, null, wechatConfigure);
            RefundService refundService = new RefundService();
            result = refundService.request(refundReqData, wechatConfigure);
            RefundResData refundResData = (RefundResData) Util.getObjectFromXML(result, RefundResData.class);
            if ("SUCCESS".equals(refundResData.getReturn_code()) && "SUCCESS".equals(refundResData.getResult_code())) {// 退款申请成功后查询退款结果
                LOGGER.info("退款成功,refundResData={}", refundResData);
                return refundResData;
            } else {
                LOGGER.info("退款失败 result={}", result);
                throw new WeChatException(ConstantEnum.EXCEPTION_WEIXIN_REFUND_FAIL.getCodeStr(), !StringUtils.isEmpty(refundResData.getErr_code_des()) ? refundResData.getErr_code_des() : ConstantEnum.EXCEPTION_WEIXIN_REFUND_FAIL.getValueStr());
            }
        } catch (WeChatException e) {
            throw e;
        } catch (Exception e) {
            LOGGER.error("刷卡支付退款失败,result={},e.getMessage={}", result, e.getMessage());
            e.printStackTrace();
            throw new WeChatException(ConstantEnum.EXCEPTION_WEIXIN_REFUND_FAIL.getCodeStr(), ConstantEnum.EXCEPTION_WEIXIN_REFUND_FAIL.getValueStr());
        }
    }
    /**
     * Description:订单查询
     **/

//    public static WeixinQueryOrderParamVO queryOrder(String tradeNo, String payNo, WechatConfigure configure) {
//        LOGGER.info("订单查询,queryOrder tradeNo={},payNo={},configure={}", tradeNo, payNo, configure);
//        String result = null;
//        try {
//            if (StringUtils.isEmpty(tradeNo) && StringUtils.isEmpty(payNo)) {
//                throw new ParamNullException();
//            }
//            PayQueryService payQueryService = new PayQueryService();
//            ScanPayQueryReqData scanPayQueryReqData = new ScanPayQueryReqData(tradeNo, payNo, configure);
//            result = payQueryService.request(scanPayQueryReqData, configure);
//            return (WeixinQueryOrderParamVO) Util.getObjectFromXML(result, WeixinQueryOrderParamVO.class);
//        } catch (Exception e) {
//            LOGGER.error("订单查询,e.getMessage={},result={}", e.getMessage(), result, e);
//            e.printStackTrace();
//            throw new WeChatException(ConstantEnum.EXCEPTION_WEIXIN_QUERY_ORDER.getCodeStr(), ConstantEnum.EXCEPTION_WEIXIN_QUERY_ORDER.getValueStr());
//        }
//    }

    public static GetOpenIdResData getOpenId(String code, String state, WechatConfigure wechatConfigure) {
        LOGGER.info("获取openId查询, getOpenId code={},state={},wechatConfigure={}", code, state, wechatConfigure);
        String result = null;
        try {
            if (StringUtils.isEmpty(code)) {
                throw new ParamNullException();
            }

            GetOpenIdService getOpenIdService = new GetOpenIdService(MessageFormat.format(
                    WechatConfigure.WEB_GET_OPEN_ID, wechatConfigure.getAppID(), wechatConfigure.getAppSecret(), code));
            result = getOpenIdService.webGetOpenId(null, wechatConfigure);
            LOGGER.info("result={}",result);
            return (GetOpenIdResData) JSONObject.toBean(JSONObject.fromObject(result), GetOpenIdResData.class);
        } catch (Exception e) {
            LOGGER.info("获取openId查询, result={}", result);
            e.printStackTrace();
            throw new WeChatException(ConstantEnum.EXCEPTION_WEIXIN_QUERY_ORDER.getCodeStr(),
                    ConstantEnum.EXCEPTION_WEIXIN_QUERY_ORDER.getValueStr());
        }
    }
}

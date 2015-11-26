package com.rongyi.rpb.unit;

import com.google.common.base.Strings;
import com.rongyi.rpb.Exception.ParamNullException;
import com.rongyi.rpb.Exception.TradeException;
import com.rongyi.rpb.Exception.WeixinException;
import com.rongyi.rpb.common.pay.weixin.model.*;
import com.rongyi.rpb.common.pay.weixin.service.RefundQueryService;
import com.rongyi.rpb.common.pay.weixin.service.RefundService;
import com.rongyi.rpb.common.pay.weixin.service.ReverseService;
import com.rongyi.rpb.common.pay.weixin.service.UnifiedorderService;
import com.rongyi.rpb.common.pay.weixin.util.Signature;
import com.rongyi.rpb.common.pay.weixin.util.Util;
import com.rongyi.rpb.common.pay.weixin.util.WXUtil;
import com.rongyi.rpb.common.pay.weixin.util.XMLParser;
import com.rongyi.rpb.constants.ConstantEnum;
import com.rongyi.rpb.constants.ConstantUtil;
import com.rongyi.rpb.constants.Constants;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by kejun on 2015/11/25.
 */
@Component
public class WeixinPayUnit {

    private static final Logger LOGGER = LoggerFactory.getLogger(WeixinPayUnit.class);


    /**
     * @param payNo
     * @param totalFee
     * @param body
     * @return
     * @Description: 获取微信支付签名
     * @Author: 柯军
     * @datetime:2015年9月2日下午1:32:08
     **/
    public Map<String, Object> getWeXinPaySign(String payNo, Integer totalFee, String body, String timeStart, String timeExpire) {
        LOGGER.info("getAppWeXinSign payNo={},totalFee={},body={},timeStart={},timeExpire={}", payNo, totalFee, body, timeStart, timeExpire);
        Map<String, Object> map = new HashMap<String, Object>();
        try {
            if (Strings.isNullOrEmpty(payNo) || null == totalFee || Strings.isNullOrEmpty(body) || Strings.isNullOrEmpty(timeStart) || Strings.isNullOrEmpty(timeExpire)) {
                throw new ParamNullException();
            }
            UnifedOrderReqData unifedOrderReqData = new UnifedOrderReqData(body, payNo, totalFee, ConstantUtil.PayWeiXin_V3.WEIXIN_NOTIFY_URL, ConstantUtil.PayWeiXin_V3.TRADE_TYPE, timeStart, timeExpire);
            UnifiedorderService unifiedorderService = new UnifiedorderService();
            String result = unifiedorderService.request(unifedOrderReqData);
            String timestamp = WXUtil.getTimeStamp();
            Map<String, Object> resultMap = XMLParser.getMapFromXML(result);
            if (resultMap != null) {
                map.put("appid", ConstantUtil.PayWeiXin_V3.APP_ID);
                map.put("partnerid", ConstantUtil.PayWeiXin_V3.MCH_ID);
                map.put("package", "Sign=WXPay");
                map.put("prepayid", resultMap.get("prepay_id"));
                map.put("noncestr", resultMap.get("nonce_str"));
                map.put("timestamp", timestamp);
                String sign = Signature.getSign(map);
                map.put("app_signature", sign);
            }
        } catch (WeixinException e){
            throw e;
        }catch (Exception e) {
            LOGGER.error("getAppWeXinSign error. exception={}", e.getMessage());
            throw new WeixinException(ConstantEnum.EXCEPTION_WEIXIN_SIGN_FAIL.getCodeStr(), ConstantEnum.EXCEPTION_WEIXIN_SIGN_FAIL.getValueStr());
        }
        return map;
    }

    public RefundResData weixinRefund(String payNo, double refundFee, double totalFee, String newPayNo) {
        LOGGER.info("weixinRefund payNo={},refundFee={},totalFee={},newPayNo={}",payNo,refundFee,totalFee,newPayNo);
        try {
            if(Strings.isNullOrEmpty(payNo)||refundFee < 0d || totalFee < refundFee||Strings.isNullOrEmpty(newPayNo)){
                throw new ParamNullException();
            }
            RefundService refundService = new RefundService();
            BigDecimal bigTotalFee = new BigDecimal(totalFee + "").multiply(new BigDecimal(100)).setScale(0, BigDecimal.ROUND_HALF_UP);
            BigDecimal bigRefundFee = new BigDecimal(refundFee + "").multiply(new BigDecimal(100)).setScale(0, BigDecimal.ROUND_HALF_UP);
            RefundReqData refundReqData = new RefundReqData(null, payNo, null, newPayNo, bigTotalFee.intValue(), bigRefundFee.intValue(), ConstantUtil.PayWeiXin_V3.MCH_ID, null);
            String result = refundService.request(refundReqData);
            RefundResData refundResData = (RefundResData) Util.getObjectFromXML(result, RefundResData.class);
            if (Constants.RESULT.SUCCESS.equals(refundResData.getReturn_code()) && Constants.RESULT.SUCCESS.equals(refundResData.getResult_code())) {// 退款申请成功后查询退款结果
                LOGGER.info("退款操作成功");
                return refundResData;
            } else {
                LOGGER.info("退款失败 result={}", result);
                throw new WeixinException(ConstantEnum.EXCEPTION_WEIXIN_REFUND_FAIL.getCodeStr(),!StringUtils.isEmpty(refundResData.getErr_code_des())?refundResData.getErr_code_des(): ConstantEnum.EXCEPTION_WEIXIN_REFUND_FAIL.getValueStr());
            }
        } catch (WeixinException e){
            throw e;
        }catch (Exception e) {
            LOGGER.error("weixin refund fail. exception={}",e.getMessage());
            throw new WeixinException(ConstantEnum.EXCEPTION_WEIXIN_REFUND_FAIL.getCodeStr(), ConstantEnum.EXCEPTION_WEIXIN_REFUND_FAIL.getValueStr());
        }
    }

    /**
     * @Description:验证退款查询结果是否正确
     * @param:tradeNo 交易流水号
     * @param:payNo 付款单号
     * @param:refundNo 退款单号
     * @Author:  柯军
     **/

    public void checkRefundQueryResult(String tradeNo, String payNo, String refundNo){
            RefundQueryResData refundQueryResData = refundQuery(tradeNo, payNo, refundNo);
            LOGGER.info("退款状态 status={}", refundQueryResData.getRefund_status_0());
            if (ConstantEnum.WEIXIN_REFUND_RESULT_SUCCESS.getCodeStr().equals(refundQueryResData.getRefund_status_0())
                    || ConstantEnum.WEIXIN_REFUND_RESULT_PROCESSING.getCodeStr().equals(refundQueryResData.getRefund_status_0())) {// 退款成功
               LOGGER.info("退款成功");
            } else if (ConstantEnum.WEIXIN_REFUND_RESULT_NOTSURE.getCodeStr().equals(refundQueryResData.getRefund_status_0())) {
                throw new WeixinException(ConstantEnum.WEIXIN_REFUND_RESULT_NOTSURE.getCodeStr(), ConstantEnum.WEIXIN_REFUND_RESULT_NOTSURE.getValueStr());
            } else if (ConstantEnum.WEIXIN_REFUND_RESULT_CHANGE.getCodeStr().equals(refundQueryResData.getRefund_status_0())) {
                throw new WeixinException(ConstantEnum.WEIXIN_REFUND_RESULT_CHANGE.getCodeStr(), ConstantEnum.WEIXIN_REFUND_RESULT_CHANGE.getValueStr());
            } else if (ConstantEnum.WEIXIN_REFUND_RESULT_FAIL.getCodeStr().equals(refundQueryResData.getRefund_status_0())) {
                throw new WeixinException(ConstantEnum.WEIXIN_REFUND_RESULT_FAIL.getCodeStr(), ConstantEnum.WEIXIN_REFUND_RESULT_CHANGE.getValueStr());
            } else {
                throw new WeixinException(ConstantEnum.EXCEPTION_WEIXIN_REFUND_FAIL.getCodeStr(), ConstantEnum.EXCEPTION_WEIXIN_REFUND_FAIL.getValueStr());
            }
    }

    /**
     * @Description: 微信退款查询
     * @param:
     * @Author:  柯军
     **/

    public RefundQueryResData refundQuery(String tradeNo, String payNo, String refundNo) {
        LOGGER.info("refundQuery tradeNo={},payNo={},refundNo={}",tradeNo,payNo,refundNo);
        RefundQueryResData refundQueryResData = new RefundQueryResData();
        try {
            if(Strings.isNullOrEmpty(tradeNo) && Strings.isNullOrEmpty(payNo) && Strings.isNullOrEmpty(refundNo)){
                throw new ParamNullException();
            }
            RefundQueryService refundQueryService = new RefundQueryService();
            RefundQueryReqData refundQueryReqData = new RefundQueryReqData(tradeNo, payNo, null, refundNo, null);
            String result = refundQueryService.request(refundQueryReqData);
            refundQueryResData = (RefundQueryResData) Util.getObjectFromXML(result, RefundQueryResData.class);
        }catch (TradeException e){
            throw  e;
        }catch (Exception e) {
            LOGGER.error("weixin refund query fail. exception={}",e.getMessage());
            throw new WeixinException(ConstantEnum.EXCEPTION_WEIXIN_REFUND_QUERY_ORDER.getCodeStr(), ConstantEnum.EXCEPTION_WEIXIN_REFUND_QUERY_ORDER.getValueStr());
        }
        return refundQueryResData;
    }

    public void closeOrder(String payNo) {
        LOGGER.info("closeOrder payNo={}",payNo);
        try {
            if(Strings.isNullOrEmpty(payNo)){
                throw new ParamNullException();
            }
            ReverseService reverseService = new ReverseService();
            ReverseReqData reverseReqData = new ReverseReqData(null, payNo);
            String response = reverseService.request(reverseReqData);
            if (!response.contains("CDATA[SUCCESS]")) {
                LOGGER.error("closeOrder fail. response={}",response);
                throw new WeixinException(ConstantEnum.EXCEPTION_WEIXIN_ORDER_CLOSE.getCodeStr(), ConstantEnum.EXCEPTION_WEIXIN_ORDER_CLOSE.getValueStr());
            }
        }catch (WeixinException e){
            throw  e;
        }catch (Exception e) {
            e.printStackTrace();
            throw new WeixinException(ConstantEnum.EXCEPTION_WEIXIN_ORDER_CLOSE.getCodeStr(), ConstantEnum.EXCEPTION_WEIXIN_ORDER_CLOSE.getValueStr());
        }
    }

}

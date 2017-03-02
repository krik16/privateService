package com.rongyi.pay.core.unit;

import com.rongyi.pay.core.Exception.ParamNullException;
import com.rongyi.pay.core.Exception.WebankException;
import com.rongyi.pay.core.constants.ConstantEnum;
import com.rongyi.pay.core.webank.config.WebankConfigure;
import com.rongyi.pay.core.webank.model.*;
import com.rongyi.pay.core.webank.param.WaPunchCardPayParam;
import com.rongyi.pay.core.webank.param.WwPunchCardPayParam;
import com.rongyi.pay.core.webank.service.WebankPayService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 微众支付
 * Created by sujuan on 2017/2/15.
 */
public class WebankPayUnit {

    private static final Logger LOGGER = LoggerFactory.getLogger(WebankPayUnit.class);

    //微众微信支付配置信息
    private static WebankConfigure configure = WebankConfigure.getInstance() ;

    private static final long retryInterval = 5000;//等待时间


    /**
     * 微众 微信刷卡支付
     * @param param 业务请求参数
     */
    public static WwPunchCardResData webankWechatPunchCardPay(WwPunchCardPayParam param) {
        LOGGER.info("微众刷卡支付 param:{},configure:{}",param,configure);
        WwPunchCardResData resData ;
        try {
            //检查参数
            ParamUnit.checkWebankWechatPunchCardPay(param, configure);
            WebankPayService webankPayService = new WebankPayService();
            resData = webankPayService.wechatPunchCardPay(param, configure);
            LOGGER.info("微众刷卡支付返回结果 resData:{}",resData);
            if ("0".equals(resData.getResult().getErrno())&&"PAYING".equals(resData.getPayment())) {
                //用户正在支付中  循环调用接口查询支付状态
                waitUserWechatPaying(param,resData);
            }else if("0".equals(resData.getResult().getErrno())&&!"SUCCESS".equals(resData.getPayment())){
                throw new WebankException(resData.getResult().getErrno(), resData.getResult().getErrmsg());
            }
        } catch (WebankException | ParamNullException e) {
            throw e ;
        } catch (Exception e) {
            LOGGER.info("微众微信刷卡失败 ,e.getMessage:{}", e.getMessage());
            e.printStackTrace();
            throw new WebankException(ConstantEnum.EXCEPTION_WEBANK_PUNCHCARD_FAIL);
        }
        return resData;
    }

    /**
     * 微众微信刷卡支付等待用户支付处理
     * @param resData 支付请求返回的结果
     */
    public static void waitUserWechatPaying(WwPunchCardPayParam param , WwPunchCardResData resData) {
        int retryTimes = 9;
        boolean result = false;
        LOGGER.info("微众微信刷卡支付等待用户输入密码,最多等待{}s,param={},configure={}", retryTimes*retryInterval/1000, param,configure);
        //参数转换
        WwPunchCardQueryOrderReqData reqData = new WwPunchCardQueryOrderReqData(param.getOrderNo(), param.getMerchantCode());
        for (int i = 1; i <= retryTimes; i++) {
            try {
                resData = webankWechatPunchCardPayQueryOrder(reqData);
                LOGGER.info("等待次数times={},WwPunchCardResData={}", i, resData);
                if ("0".equals(resData.getResult().getErrno())&&"SUCCESS".equals(resData.getPayment())) {
                    LOGGER.info("用户密码输入完成，成功支付");
                    result = true;
                    break;
                }else if("0".equals(resData.getResult().getErrno())&&!"PAYING".equals(resData.getPayment())){
                    throw new WebankException(resData.getResult().getErrno(), resData.getResult().getErrmsg());
                }
                Thread.sleep(retryInterval);
            } catch (WebankException | ParamNullException e) {
                throw e;
            } catch (Exception e) {
                e.printStackTrace();
                LOGGER.error("微众微信刷卡支付循环查询{}次后失败", retryTimes);
                try {
                    Thread.sleep(retryInterval);
                } catch (InterruptedException e1) {
                    LOGGER.warn("wait user paying has been blocked. Wait {} seconds and retry {}", retryInterval / 1000, i + 1);
                }
            }
        }
        if (!result) {
            LOGGER.warn("微众微信刷卡用户超时未完成支付,需重新支付 orderNo:{}",param.getOrderNo());
            //调用撤销订单接口
            waitWechatPunchCardReverse(param);
            throw new WebankException(ConstantEnum.EXCEPTION_WEBANK_REVERSE_SUCCESS);
        }
    }

    public static void waitUserAlipayPaying(WaPunchCardPayParam param, WaPunchCardPayResData resData) {
        int retryTimes = 9;
        boolean result = false;
        WaQueryTradeResData queryTradeResData ;
        WaQueryTradeReqData reqData = new WaQueryTradeReqData(param.getWbMerchantId(), param.getOrderId());
        LOGGER.info("微众支付宝刷卡支付等待用户输入密码，最多等待{}s,param:{}",retryTimes*retryInterval/1000,param);
        for (int i = 1; i <= retryTimes; i++) {
            try {
                queryTradeResData = alipayQueryTrade(reqData);
                LOGGER.info("等待次数times={},WaQueryTradeResData={}", i, queryTradeResData);
                if (ConstantEnum.WEBANK_CODE_0.getCodeStr().equals(queryTradeResData.getCode())) {
                    LOGGER.info("用户密码输入完成，成功支付");
                    result = true;
                    break;
                }
//                else if("0".equals(resData.getResult().getErrno())&&!"PAYING".equals(resData.getPayment())){
//                    throw new WebankException(resData.getResult().getErrno(), resData.getResult().getErrmsg());
//                }
                Thread.sleep(retryInterval);
            } catch (WebankException | ParamNullException e) {
                throw e;
            } catch (Exception e) {
                e.printStackTrace();
                LOGGER.error("微众微信刷卡支付循环查询{}次后失败", retryTimes);
                try {
                    Thread.sleep(retryInterval);
                } catch (InterruptedException e1) {
                    LOGGER.warn("wait user paying has been blocked. Wait {} seconds and retry {}", retryInterval / 1000, i + 1);
                }
            }
        }
        if (!result) {
            LOGGER.warn("微众支付宝刷卡用户超时未完成支付,需重新支付 orderId:{}", param.getOrderId());
            //调用撤销订单接口
            throw new WebankException(ConstantEnum.EXCEPTION_WEBANK_REVERSE_SUCCESS);
        }
    }

    /**
     * 微众微信刷卡调用冲正接口
     * @param param
     */
    public static void waitWechatPunchCardReverse(WwPunchCardPayParam param ) {
        WwPunchCardReverseReqData reqData = new WwPunchCardReverseReqData(param);
        webankWechatPunchCardReverse(reqData);
    }

    /**
     * 微众微信刷卡支付订单查询
     * @param reqData 请求参数
     * @return 返回结果
     */
    public static WwPunchCardResData webankWechatPunchCardPayQueryOrder(WwPunchCardQueryOrderReqData reqData) {
        LOGGER.info("微众微信刷卡支付订单查询 reqData:{},configure:{}",reqData,configure);
        WwPunchCardResData resData;
        try {
            //检查参数
            ParamUnit.checkWebankWechatPunchCardQueryOrder(reqData, configure);
            WebankPayService webankPayService = new WebankPayService();
            resData = webankPayService.wechatPunchCardQueryOrder(reqData, configure);
        } catch (WebankException | ParamNullException e) {
            throw e ;
        }catch (Exception e) {
            LOGGER.info("微众微信刷卡支付订单查询失败");
            e.printStackTrace();
            throw new WebankException(ConstantEnum.EXCEPTION_WEBANK_PUNCHCARDQUERY_FAIL);
        }
        return resData;
    }

    /**
     * 微众微信刷卡支付撤销订单
     * @param reqData 请求参数
     * @return 返回结果
     */
    public static WwPunchCardReverseResData webankWechatPunchCardReverse(WwPunchCardReverseReqData reqData) {
        LOGGER.info("微众微信刷卡支付撤销订单 reqData:{}",reqData);
        WwPunchCardReverseResData resData;
        try {
            //检查参数
            ParamUnit.checkWebankWechatPunchCardReverse(reqData);
            WebankPayService webankPayService = new WebankPayService();
            resData = webankPayService.wechatPunchCardReverse(reqData, configure);
        } catch (WebankException | ParamNullException e) {
            throw e;
        } catch (Exception e) {
            LOGGER.info("微众微信刷卡支付撤销订单失败");
            e.printStackTrace();
            throw new WebankException(ConstantEnum.EXCEPTION_WEBANK_PUNCHCARDREVERSE_FAIL);
        }
        return  resData;
    }

    /**
     * 微众微信刷卡支付退款
     * @param reqData 请求参数
     * @return 返回结果
     */
    public static WwPunchCardRefundResData webankWechatPunchCardRefund(WwpunchCardRefundReqData reqData) {
        LOGGER.info("微众微信刷卡支付退款 reqData:{}",reqData);
        WwPunchCardRefundResData resData;
        try {
            ParamUnit.checkWebankWechatPunchCardRefund(reqData);
            WebankPayService webankPayService = new WebankPayService();
            resData = webankPayService.wechatPunchCardRefund(reqData, configure);
        } catch (WebankException | ParamNullException e) {
            throw e;
        } catch (Exception e) {
            LOGGER.info("微众微信刷卡支付退款失败");
            e.printStackTrace();
            throw new WebankException(ConstantEnum.EXCEPTION_WEBANK_PUNCHCARDREFUND_FAIL);
        }
        return resData;
    }

    /**
     * 微众微信刷卡支付退款结果查询
     * @param reqData 请求参数
     * @return 返回结果
     */
    public static WwPunchCardRefundResData webankWechatPunchCardRefundQuery(WwpunchCardRefundReqData reqData) {
        LOGGER.info("微众微信刷卡支付退款结果查询 reqData:{}",reqData);
        WwPunchCardRefundResData resData;
        try {
            ParamUnit.checkWebankWechatPunchCardRefundQuery(reqData);
            WebankPayService webankPayService = new WebankPayService();
            resData = webankPayService.wechatPunchCardRefundQuery(reqData, configure);
        } catch (WebankException | ParamNullException e) {
            throw e;
        } catch (Exception e) {
            LOGGER.info("微众微信刷卡支付退款查询失败");
            e.printStackTrace();
            throw new WebankException(ConstantEnum.EXCEPTION_WEBANK_PUNCHCARDREFUNDQUERY_FAIL);
        }
        return resData;
    }

    /**
     * 微众支付宝刷卡支付
     * @param param 请求参数
     * @return 返回结果
     */
    public static WaPunchCardPayResData alipayPunchCardPay(WaPunchCardPayParam param) {
        LOGGER.info("微众支付宝刷卡支付 param:{}",param);
        WaPunchCardPayResData resData = null;
        try {
            ParamUnit.checkWebankAlipayPunchCardPay(param, configure);
            WebankPayService webankPayService = new WebankPayService();
            resData = webankPayService.alipayPunchCardPay(param, configure);
            //用户支付中  循环查询用户实际支付状态
            if ("!0".equals(resData.getCode())) {
                throw new WebankException(ConstantEnum.EXCEPTION_WEBANK_PUNCHCARD_FAIL);
            }else if ("0".equals(resData.getCode()) && ConstantEnum.WA_PUNCHCARDPAY_PAYING.getCodeStr().equals(resData.getRetCode())) {

            }else if ("0".equals(resData.getCode()) && ConstantEnum.WA_PUNCHCARDPAY_SYSERR.getCodeStr().equals(resData.getRetCode())) {
                LOGGER.info("微众返回系统异常 再次调用查询接口查询实际支付状态");
                throw new Exception();
            }else if ("0".equals(resData.getCode()) && !ConstantEnum.WA_PUNCHCARDPAY_SUCCESS.getCodeStr().equals(resData.getRetCode())) {
                throw new WebankException(resData.getRetCode(), resData.getRetMsg());
            }
        } catch (WebankException | ParamNullException e) {
            throw e ;
        } catch (Exception e) {
            e.printStackTrace();
            LOGGER.info("系统异常，再次调用查询接口查询订单实际支付状态 orderId:{}", param.getOrderId());
        }
        return resData;
    }

    /**
     * 微众支付宝订单查询
     * @param reqData 请求参数
     * @return 返回结果
     */
    public static WaQueryTradeResData alipayQueryTrade(WaQueryTradeReqData reqData) {
        LOGGER.info("微众支付宝订单查询 reqData:{}",reqData);
        WaQueryTradeResData resData =null;
        try {
            ParamUnit.checkWebankAlipayQueryTrade(reqData, configure);
            WebankPayService webankPayService = new WebankPayService();
            resData = webankPayService.alipayQueryTrade(reqData, configure);
        } catch (Exception e) {
            LOGGER.info("微众支付宝订单查询系统异常");
            e.printStackTrace();
        }
        return resData;
    }

    /**
     * 微众支付宝撤销订单
     * @param reqData 请求参数
     * @return 返回结果
     */
    public static WaReverseTradeResData alipayReverseTrade(WaReverseTradeReqData reqData) {
        LOGGER.info("微众支付宝撤销订单 reqData:{}",reqData);
        WaReverseTradeResData resData = null;
        try {

        } catch (WebankException | ParamNullException e) {
            throw e;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return resData;
    }

    /**
     * 微众支付宝退款
     * @param reqData 请求参数
     * @return 返回结果
     */
    public static WaRefundResData alipayRefund(WaRefundReqData reqData) {
        LOGGER.info("微众支付宝退款 reqData:{}",reqData);
        WaRefundResData resData = null;
        try {

        } catch (WebankException | ParamNullException e) {
            throw e ;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return resData;
    }

    public static WaRefundQueryResData alipayRefundQuery(WaRefundQueryReqData reqData) {
        LOGGER.info("微众支付宝退款查询 reqData:{}",reqData);
        WaRefundQueryResData resData = null ;
        try {

        } catch (WebankException | ParamNullException e) {
            throw e ;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return resData;
    }

}

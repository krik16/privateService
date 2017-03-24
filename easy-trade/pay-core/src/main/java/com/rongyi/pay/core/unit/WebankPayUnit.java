package com.rongyi.pay.core.unit;

import com.alipay.api.internal.util.StringUtils;
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
    public static WwPunchCardResData wechatPunchCardPay(WwPunchCardPayParam param) {
        LOGGER.info("微众刷卡支付 param:{},configure:{}",param,configure);
        WwPunchCardResData resData ;
        try {
            //检查参数
            ParamUnit.checkWebankWechatPunchCardPay(param, configure);
            WebankPayService webankPayService = new WebankPayService();
            resData = webankPayService.wechatPunchCardPay(param, configure);
            LOGGER.info("微众刷卡支付返回结果 resData:{}",resData);
            //返回用户正在支付中
            if (ConstantEnum.WW_PUNCHCARDPAY_USERPAYING.getCodeStr().equals(resData.getResult().getErrno())) {
                //用户正在支付中  循环调用接口查询支付状态
                resData= waitUserWechatPaying(param);
            }
            //返回状态不是正在支付中 也没有支付成功 则失败 直接抛异常
            else if(!(ConstantEnum.WEBANK_CODE_0.getCodeStr().equals(resData.getResult().getErrno())&&
                    ConstantEnum.WEBANK_PAYEMENT_1.getCodeStr().equals(resData.getPayment()))){
                throw new WebankException(resData.getResult().getErrno(),"".equals(resData.getResult().getErrmsg())?ConstantEnum.EXCEPTION_WEBANK_PUNCHCARD_FAIL.getValueStr() :resData.getResult().getErrmsg());
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
     */
    private static WwPunchCardResData waitUserWechatPaying(WwPunchCardPayParam param) {
        WwPunchCardResData resData =null;
        int retryTimes = 6;
        boolean result = false;
        LOGGER.info("微众微信刷卡支付等待用户输入密码,最多等待{}s,param={},configure={}", retryTimes*retryInterval/1000, param,configure);
        //参数转换
        WwPunchCardQueryOrderReqData reqData = new WwPunchCardQueryOrderReqData(param.getMerchantCode(),param.getOrderNo());
        for (int i = 1; i <= retryTimes; i++) {
            try {
                resData = wechatPunchCardPayQueryOrder(reqData);
                LOGGER.info("等待次数times={},WwPunchCardResData={}", i, resData);
                //用户支付成功
                if (ConstantEnum.WEBANK_CODE_0.getCodeStr().equals(resData.getResult().getErrno())&&
                        ConstantEnum.WEBANK_PAYEMENT_1.getCodeStr().equals(resData.getPayment())) {
                    LOGGER.info("用户密码输入完成，成功支付");
                    result = true;
                    break;
                }else if(!ConstantEnum.WW_PUNCHCARDPAY_USERPAYING.getCodeStr().equals(resData.getResult().getErrno())){
                    throw new WebankException(resData.getResult().getErrno(),
                            "".equals(resData.getResult().getErrmsg())?ConstantEnum.EXCEPTION_WEBANK_PUNCHCARD_FAIL.getValueStr() :resData.getResult().getErrmsg());
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
        }else {
            return resData;
        }
    }

    private static WaPunchCardPayResData waitUserAlipayPaying(WaPunchCardPayParam param) {
        return waitUserAlipayPaying(param, 6);
    }

    private static WaPunchCardPayResData waitUserAlipayPaying(WaPunchCardPayParam param , int retryTimes) {
        boolean result = false;
        WaPunchCardPayResData resData ;
        WaQueryTradeResData queryTradeResData = new WaQueryTradeResData();
        WaQueryTradeReqData reqData = new WaQueryTradeReqData(param.getWbMerchantId(), param.getOrderId());
        LOGGER.info("微众支付宝刷卡支付等待用户输入密码，最多等待{}s,param:{}",retryTimes*retryInterval/1000,param);
        for (int i = 1; i <= retryTimes; i++) {
            try {
                queryTradeResData = alipayQueryTrade(reqData);
                LOGGER.info("等待次数times={},WaQueryTradeResData={}", i, queryTradeResData);
                if (ConstantEnum.WEBANK_CODE_0.getCodeStr().equals(queryTradeResData.getCode())&&
                        ConstantEnum.WA_TRADESTATUS_01.getCodeStr().equals(queryTradeResData.getTradeStatus())) {
                    LOGGER.info("用户密码输入完成，成功支付");
                    result = true;
                    break;
                }
                else if(!(ConstantEnum.WEBANK_CODE_0.getCodeStr().equals(queryTradeResData.getCode())&&
                        ConstantEnum.WA_TRADESTATUS_03.getCodeStr().equals(queryTradeResData.getTradeStatus()))){
                    throw new WebankException(queryTradeResData.getCode(), queryTradeResData.getMsg());
                }
                if(i!=retryTimes)
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
            WaReverseTradeReqData reverseTradeReqData = new WaReverseTradeReqData(param.getWbMerchantId(),param.getOrderId());
            alipayReverseTrade(reverseTradeReqData);
            throw new WebankException(ConstantEnum.EXCEPTION_WEBANK_REVERSE_SUCCESS);
        }else{
            //将查询返回的结果转换为下单返回的结果
            resData = new WaPunchCardPayResData();
            resData.setCode(queryTradeResData.getCode());
            resData.setMsg(queryTradeResData.getMsg());
            resData.setTransactionTime(queryTradeResData.getTransactionTime());
            resData.setBizSeqNo(queryTradeResData.getBizSeqNo());
            resData.setSuccess(queryTradeResData.getSuccess());
            resData.setTradeNo(queryTradeResData.getTradeNo());
            resData.setOutTradeNo(queryTradeResData.getOutTradeNo());
            resData.setRetCode(ConstantEnum.WA_PUNCHCARDPAY_SUCCESS.getCodeStr());
            resData.setBuyerLogonId(queryTradeResData.getBuyerLogonId());
            resData.setTotalAmount(queryTradeResData.getTotalAmount());
            resData.setReceiptAmount(queryTradeResData.getReceiptAmount());
            resData.setBuyerPayAmount(queryTradeResData.getBuyerPayAmount());
            resData.setPointAmount(queryTradeResData.getPointAmount());
            resData.setInvoiceAmount(queryTradeResData.getInvoiceAmount());
            resData.setGmtPayment(queryTradeResData.getSendPayDate());
            resData.setStoreName(queryTradeResData.getStoreName());
            resData.setBuyerUserId(queryTradeResData.getBuyerUserId());
            resData.setExternalInfo(queryTradeResData.getExternalInfo());
        }
        return resData;
    }

    /**
     * 微众微信刷卡调用冲正接口
     * @param param
     */
    public static void waitWechatPunchCardReverse(WwPunchCardPayParam param ) {
        WwPunchCardReverseReqData reqData = new WwPunchCardReverseReqData(param);
        reqData.setTerminal_serialno(System.currentTimeMillis()+"");
        wechatPunchCardReverse(reqData);
    }

    /**
     * 微众微信刷卡支付订单查询
     * @param reqData 请求参数
     * @return 返回结果
     */
    public static WwPunchCardResData wechatPunchCardPayQueryOrder(WwPunchCardQueryOrderReqData reqData) {
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
    public static WwPunchCardReverseResData wechatPunchCardReverse(WwPunchCardReverseReqData reqData) {
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
    public static WwPunchCardRefundResData wechatPunchCardRefund(WwpunchCardRefundReqData reqData) {
        LOGGER.info("微众微信刷卡支付退款 reqData:{}",reqData);
        WwPunchCardRefundResData resData;
        try {
            ParamUnit.checkWebankWechatPunchCardRefund(reqData);
            WebankPayService webankPayService = new WebankPayService();
            resData = webankPayService.wechatPunchCardRefund(reqData, configure);
            //检查是否退款成功
            if(resData.getResult() == null){
                throw new WebankException(ConstantEnum.EXCEPTION_WEBANK_PUNCHCARDREFUND_FAIL);
            }else if(!ConstantEnum.WEBANK_CODE_0.getCodeStr().equals(resData.getResult().getErrno())) {
                throw new WebankException(resData.getResult().getErrno(), resData.getResult().getErrmsg());
            }
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
    public static WwPunchCardRefundResData wechatPunchCardRefundQuery(WwpunchCardRefundReqData reqData) {
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

            if (!ConstantEnum.WEBANK_CODE_0.getCodeStr().equals(resData.getCode())) {
                throw new WebankException(ConstantEnum.EXCEPTION_WEBANK_PUNCHCARD_FAIL);
            }else if ( ConstantEnum.WA_PUNCHCARDPAY_PAYING.getCodeStr().equals(resData.getRetCode())) {
                //用户支付中  循环查询用户实际支付状态
                resData = waitUserAlipayPaying(param);
            }else if (ConstantEnum.WA_PUNCHCARDPAY_SYSERR.getCodeStr().equals(resData.getRetCode())) {
                LOGGER.info("微众返回系统异常 再次调用查询接口查询实际支付状态");
                resData = waitUserAlipayPaying(param, 1);
            }else if (!ConstantEnum.WA_PUNCHCARDPAY_SUCCESS.getCodeStr().equals(resData.getRetCode())) {
                throw new WebankException(resData.getRetCode(), resData.getSubMsg() != null ? resData.getSubMsg() : resData.getRetMsg());
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
            ParamUnit.checkWebankAlipayReverseTrade(reqData, configure);
            WebankPayService webankPayService = new WebankPayService();
            resData = webankPayService.alipayReverseTrade(reqData, configure);
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
            ParamUnit.checkWebankAlipayRefund(reqData, configure);
            WebankPayService  webankPayService = new WebankPayService();
            resData = webankPayService.alipayRefundTrade(reqData, configure);
            if (!resData.getCode().equals(ConstantEnum.WEBANK_CODE_0.getCodeStr())) {
                throw new WebankException(resData.getCode(), StringUtils.isEmpty(resData.getSubMsg()) ? resData.getMsg() : resData.getSubMsg());
            }
        } catch (WebankException | ParamNullException e) {
            throw e ;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return resData;
    }

    /**
     * 微众支付宝退款查询
     * @param reqData 请求参数
     * @return 返回结果
     */
    public static WaRefundQueryResData alipayRefundQuery(WaRefundQueryReqData reqData) {
        LOGGER.info("微众支付宝退款查询 reqData:{}",reqData);
        WaRefundQueryResData resData = null ;
        try {
            ParamUnit.checkWebankAlipayRefundQuery(reqData, configure);
            WebankPayService webankPayService = new WebankPayService();
            resData = webankPayService.alipayRefundTradeQuery(reqData, configure);
        } catch (WebankException | ParamNullException e) {
            throw e ;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return resData;
    }

    /**
     * 微众支付宝获取token (用于获取签名所需的ticket)
     * @return
     */
    public static WaAccessTokenResData alipayGetToken() {
        LOGGER.info("微众支付宝获取token");
        WaAccessTokenResData resData = null;
        try {
            WebankPayService webankPayService = new WebankPayService();
            resData = webankPayService.alipayGetToken(configure);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return resData;
    }

    /**
     * 微众支付宝获取ticket(用于签名)
     * @param token token
     */
    public static WaTicketResData alipayGetTicket(String token) {
        LOGGER.info("微众支付宝获取ticket token:{}",token);
        WaTicketResData resData = null;
        try {
            WebankPayService webankPayService  = new WebankPayService();
            resData = webankPayService.alipayGetTicket(token,configure);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return  resData;
    }

}

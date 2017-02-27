package com.rongyi.pay.core.unit;

import com.rongyi.pay.core.Exception.ParamNullException;
import com.rongyi.pay.core.Exception.WebankException;
import com.rongyi.pay.core.constants.ConstantEnum;
import com.rongyi.pay.core.webank.config.WwConfigure;
import com.rongyi.pay.core.webank.model.WwPunchCardQueryOrderReqData;
import com.rongyi.pay.core.webank.model.WwPunchCardResData;
import com.rongyi.pay.core.webank.model.WwPunchCardReverseReqData;
import com.rongyi.pay.core.webank.model.WwPunchCardReverseResData;
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
    private static WwConfigure configure = WwConfigure.getInstance() ;

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
                waitUserPaying(param,resData);
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
    public static void waitUserPaying(WwPunchCardPayParam param , WwPunchCardResData resData) {
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

    /**
     * 微众微信刷卡调用冲正接口
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

    public static WwConfigure getConfigure() {
        return configure;
    }

    public static void setConfigure(WwConfigure configure) {
        WebankPayUnit.configure = configure;
    }

}

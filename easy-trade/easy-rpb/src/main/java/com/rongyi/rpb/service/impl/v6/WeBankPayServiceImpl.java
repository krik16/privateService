package com.rongyi.rpb.service.impl.v6;

import com.rongyi.core.Exception.TradePayException;
import com.rongyi.core.util.BeanMapUtils;
import com.rongyi.easy.rpb.vo.RyMchVo;
import com.rongyi.easy.rpb.vo.WwPunchCardPayVo;
import com.rongyi.pay.core.Exception.ParamNullException;
import com.rongyi.pay.core.Exception.WebankException;
import com.rongyi.pay.core.constants.ConstantEnum;
import com.rongyi.pay.core.webank.model.WwPunchCardRefundResData;
import com.rongyi.pay.core.webank.model.WwPunchCardResData;
import com.rongyi.pay.core.webank.param.WwPunchCardPayParam;
import com.rongyi.rpb.bizz.PayBizz;
import com.rongyi.rpb.bizz.QueryBizz;
import com.rongyi.rpb.bizz.RefundBizz;
import com.rongyi.rss.rpb.IweBankService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Map;

/**
 * conan
 * 2017/2/27 13:45
 **/
public class WeBankPayServiceImpl  extends BaseServiceImpl implements IweBankService{

    @Autowired
    PayBizz payBizz;

    @Autowired
    QueryBizz queryBizz;

    @Autowired
    RefundBizz refundBizz;

    private static final Logger log = LoggerFactory.getLogger(WeBankPayServiceImpl.class);

    @Override
    public Map<String, Object> webankWechatPunchCardPay(RyMchVo ryMchVo, WwPunchCardPayVo wwPunchCardPayVo) {
        log.info("微众微信刷卡支付,ryMchVo={},wwPunchCardPayVo={}", ryMchVo, wwPunchCardPayVo);
        try {
            //检查开放商户信息
            checkMchParam(ryMchVo);
            //初始化业务参数
            WwPunchCardPayParam wwPunchCardPayParam = getAliPaySignData(wwPunchCardPayVo);

            WwPunchCardResData wwPunchCardResData = payBizz.webankWechatPunchCardPay(ryMchVo, wwPunchCardPayParam);

            Map<String, Object> map = BeanMapUtils.toMap(wwPunchCardResData);

            //外部订单号
            map.put("orderNo", wwPunchCardPayVo.getOrderNo());
            //容易网交易号
            map.put("payNo", wwPunchCardResData.getTerminal_serialno());

            log.info("微众微信刷卡支付结果,map={}", map);
            return map;
        } catch (WebankException | ParamNullException e) {
            throw new TradePayException(e.getCode(), e.getMessage());
        } catch (TradePayException e) {
            log.error("微众微信刷卡支付失败,e={}", e.getMessage(), e);
            throw e;
        } catch (Exception e) {
            log.error("微众微信刷卡支付异常,e={}", e.getMessage(), e);
            throw new TradePayException(ConstantEnum.EXCEPTION_WEIXIN_PUNCH_CARD_FAIL.getCodeStr(), ConstantEnum.EXCEPTION_WEIXIN_PUNCH_CARD_FAIL.getValueStr());
        }
    }

    @Override
    public Map<String, Object> weBankWechatPayQuery(RyMchVo ryMchVo, String orderNo,Integer payType,String weBankMchNo) {
        try {
            WwPunchCardResData resData = queryBizz.webankWechatPunchCardPayQueryOrder(orderNo, payType, weBankMchNo);

            Map<String, Object> map = BeanMapUtils.toMap(resData);
            //外部订单号
            map.put("orderNo", orderNo);
            //容易网交易号
            map.put("payNo", resData.getTerminal_serialno());
            return map;
        }  catch (WebankException | ParamNullException e) {
            throw new TradePayException(e.getCode(), e.getMessage());
        } catch (TradePayException e) {
            log.error("微众微信刷卡查询失败,e={}", e.getMessage(), e);
            throw e;
        } catch (Exception e) {
            log.error("微众微信刷卡查询异常,e={}", e.getMessage(), e);
            throw new TradePayException(ConstantEnum.EXCEPTION_WEIXIN_QUERY_ORDER.getCodeStr(), ConstantEnum.EXCEPTION_WEIXIN_QUERY_ORDER.getValueStr());
        }
    }

    @Override
    public Map<String, Object> webankWechatRefund(String orderNo, Integer refundAmount, String refundReason, String weBankMchNo) {
        try {
            WwPunchCardRefundResData resData = refundBizz.webankWechatRefund(orderNo, refundAmount, weBankMchNo);
            Map<String, Object> map = BeanMapUtils.toMap(resData);
            //外部订单号
            map.put("orderNo", orderNo);
            //容易网交易号
            map.put("payNo", resData.getPayNo());
            //微众银行退款单号
            map.put("tradeNo",resData.getRefundid());
            return map;
        }  catch (WebankException | ParamNullException e) {
            throw new TradePayException(e.getCode(), e.getMessage());
        } catch (TradePayException e) {
            log.error("微众微信退款失败,e={}", e.getMessage(), e);
            throw e;
        } catch (Exception e) {
            log.error("微众微信退款异常,e={}", e.getMessage(), e);
            throw new TradePayException(ConstantEnum.EXCEPTION_WEIXIN_REFUND_FAIL.getCodeStr(), ConstantEnum.EXCEPTION_WEIXIN_REFUND_FAIL.getValueStr());
        }
    }

    @Override
    public Map<String, Object> webankWechatRefundQuery(String orderNo,Integer payType, String weBankMchNo) {
        try {
            WwPunchCardRefundResData resData = queryBizz.webankWechatPunchCardRefundQuery(orderNo, payType, weBankMchNo);
            Map<String, Object> map = BeanMapUtils.toMap(resData);
            //外部订单号
            map.put("orderNo", orderNo);
            //容易网交易号
            map.put("payNo", resData.getPayNo());
            //微众银行退款单号
            map.put("tradeNo",resData.getRefundid());
            return map;
        }  catch (WebankException | ParamNullException e) {
            throw new TradePayException(e.getCode(), e.getMessage());
        } catch (TradePayException e) {
            log.error("微众微信退款失败,e={}", e.getMessage(), e);
            throw e;
        } catch (Exception e) {
            log.error("微众微信退款异常,e={}", e.getMessage(), e);
            throw new TradePayException(ConstantEnum.EXCEPTION_WEIXIN_REFUND_QUERY_ORDER.getCodeStr(), ConstantEnum.EXCEPTION_WEIXIN_REFUND_QUERY_ORDER.getValueStr());
        }
    }

    //设置微众微信刷卡支付业务参数
    private WwPunchCardPayParam getAliPaySignData(WwPunchCardPayVo wwPunchCardPayVo) {
        WwPunchCardPayParam wwPunchCardPayParam = new WwPunchCardPayParam();
        BeanUtils.copyProperties(wwPunchCardPayVo, wwPunchCardPayParam);
        return wwPunchCardPayParam;
    }
}

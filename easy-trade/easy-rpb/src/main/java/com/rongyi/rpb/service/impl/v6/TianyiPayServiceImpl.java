package com.rongyi.rpb.service.impl.v6;

import com.rongyi.core.Exception.TradePayException;
import com.rongyi.core.common.util.DateUtil;
import com.rongyi.core.common.util.StringUtil;
import com.rongyi.easy.rpb.vo.TianyiPayVo;
import com.rongyi.easy.ryoms.entity.WechatTianyiPayVo;
import com.rongyi.pay.core.Exception.ParamNullException;
import com.rongyi.pay.core.Exception.TianyiException;
import com.rongyi.pay.core.Exception.WebankException;
import com.rongyi.pay.core.constants.ConstantEnum;
import com.rongyi.pay.core.tianyi.param.PayDetailParam;
import com.rongyi.pay.core.tianyi.param.TianyiOrderParam;
import com.rongyi.pay.core.tianyi.param.TianyiParam;
import com.rongyi.rpb.bizz.PaySignBizz;
import com.rongyi.rpb.bizz.RefundBizz;
import com.rongyi.rpb.unit.PayConfigInitUnit;
import com.rongyi.rss.rpb.ItianyiPayService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

/**
 * conan
 * 2017/4/12 11:28
 **/
public class TianyiPayServiceImpl implements ItianyiPayService {

    @Autowired
    RefundBizz refundBizz;

    @Autowired
    PaySignBizz paySignBizz;

    @Autowired
    PayConfigInitUnit payConfigInitUnit;

    private static final Logger log = LoggerFactory.getLogger(TianyiPayServiceImpl.class);

    @Override
    public Map<String,Object> h5Pay(WechatTianyiPayVo wechatTianyiPayVo , TianyiPayVo tianyiPayVo) throws TradePayException {
        log.info("翼支付H5支付,wechatTianyiPayVo:{},tianyiPayVo:{}",wechatTianyiPayVo.toString(),tianyiPayVo.toString());
        try {
            payConfigInitUnit.init();
            Map<String, Object> map = new HashMap<>();
            TianyiParam tianyiParam = getTianyiParam(wechatTianyiPayVo, tianyiPayVo);
            String result = paySignBizz.tianyiH5Pay(wechatTianyiPayVo, tianyiParam, tianyiPayVo.getOrderType(), tianyiPayVo.getSource());
            log.info("获取到的唤起h5支付url:{}", result);
            map.put("h5url", result);
            return map;
        } catch (TianyiException | ParamNullException e) {
            log.error("翼支付H5支付接口获取失败,e={}", e.getMessage(), e);
            throw new TradePayException(e.getCode(), e.getMessage());
        } catch (TradePayException e) {
            log.error("翼支付H5支付接口获取失败,e={}", e.getMessage(), e);
            throw e ;
        } catch (Exception e) {
            e.printStackTrace();
            log.error("翼支付H5支付接口获取异常,e={}", e.getMessage(), e);
            throw new TradePayException(ConstantEnum.EXCEPTION_WEIXIN_RERVERSE_FAIL.getCodeStr(), ConstantEnum.EXCEPTION_WEIXIN_RERVERSE_FAIL.getValueStr());
        }
    }

    @Override
    public Map<String, Object> refund(String orderNo, int refundAmount) throws TradePayException {
        log.info("翼支付退款,orderNo={},refundAmount={}",orderNo,refundAmount);
        try {
            refundBizz.tianyiRefund(orderNo,refundAmount);
            return new HashMap<>();
        } catch (WebankException | ParamNullException e) {
            log.warn("翼支付退款失败,e={}", e.getMessage(), e);
            throw new TradePayException(e.getCode(), e.getMessage());
        } catch (TradePayException e) {
            log.warn("翼支付退款失败,e={}", e.getMessage(), e);
            throw e;
        } catch (Exception e) {
            log.error("翼支付退款异常,e={}", e.getMessage(), e);
            throw new TradePayException(ConstantEnum.EXCEPTION_TIANYI_TRADEREFUND_FAIL.getCodeStr(), ConstantEnum.EXCEPTION_TIANYI_TRADEREFUND_FAIL.getValueStr());
        }
    }

    private TianyiParam getTianyiParam(WechatTianyiPayVo wechatTianyiPayVo,TianyiPayVo tianyiPayVo) {
        TianyiParam tianyiParam = new TianyiParam();
        TianyiOrderParam tianyiOrderParam = new TianyiOrderParam();
        PayDetailParam payDetailParam = new PayDetailParam();
        String orderReqTime = DateUtil.getCurrentDateyyyyMMddhhmmss();;
        String orderAmount = new BigDecimal(tianyiPayVo.getTotalAmount()).divide(new BigDecimal(100), 2, BigDecimal.ROUND_HALF_UP).toString();

        String subject = StringUtil.isEmpty(tianyiPayVo.getProductDesc()) ? "容易网" : tianyiPayVo.getProductDesc();
        tianyiOrderParam.setMerchantId(wechatTianyiPayVo.getMerchatId());
        tianyiOrderParam.setKey(wechatTianyiPayVo.getMerchatKey());
        tianyiOrderParam.setOrderSeq(tianyiPayVo.getOrderNo());
        tianyiOrderParam.setOrderAmt(tianyiPayVo.getTotalAmount().toString());
        tianyiOrderParam.setProductDesc(subject);
        tianyiOrderParam.setOrderReqTime(orderReqTime);
        //TODO
        tianyiOrderParam.setRiskControlInfo("风控信息");

        payDetailParam.setMerchantId(wechatTianyiPayVo.getMerchatId());
        payDetailParam.setMerchantPwd(wechatTianyiPayVo.getMerchatPwd());
        payDetailParam.setBeforeMerchantUrl(tianyiPayVo.getCallBackUrl());
        payDetailParam.setOrderSeq(tianyiPayVo.getOrderNo());
        payDetailParam.setOrderTime(orderReqTime);
        payDetailParam.setOrderAmount(orderAmount);
        payDetailParam.setProductDesc(subject);
        payDetailParam.setSubject(subject);
        payDetailParam.setProductAmount(orderAmount);
        payDetailParam.setKey(wechatTianyiPayVo.getMerchatKey());
        tianyiParam.setPayDetailParam(payDetailParam);
        tianyiParam.setTianyiOrderParam(tianyiOrderParam);
        return tianyiParam ;
    }
}

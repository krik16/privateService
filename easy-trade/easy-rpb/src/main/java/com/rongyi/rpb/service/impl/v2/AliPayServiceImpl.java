package com.rongyi.rpb.service.impl.v2;

import com.alipay.api.response.AlipayTradeRefundResponse;
import com.rongyi.core.common.util.StringUtil;
import com.rongyi.easy.rpb.vo.AliConfigureVo;
import com.rongyi.easy.rpb.vo.AliPaySignVo;
import com.rongyi.pay.core.Exception.AliPayException;
import com.rongyi.pay.core.Exception.WeChatException;
import com.rongyi.pay.core.ali.config.AliConfigure;
import com.rongyi.pay.core.ali.model.reqData.AliScanPayReqData;
import com.rongyi.pay.core.constants.ConstantEnum;
import com.rongyi.pay.core.unit.AliPayUnit;
import com.rongyi.rpb.bizz.PayBizz;
import com.rongyi.rpb.bizz.RefundBizz;
import com.rongyi.rss.rpb.IAliPayService;
import org.apache.commons.beanutils.BeanMap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Map;

/**
 * conan
 * 2017/2/7 17:05
 **/
public class AliPayServiceImpl implements IAliPayService{

    private static final Logger log = LoggerFactory.getLogger(AliPayServiceImpl.class);

    @Autowired
    PayBizz payBizz;
    @Autowired
    RefundBizz refundBizz;

    @Override
    public Map<String, Object> getPaySign(AliPaySignVo aliPaySignVo, AliConfigureVo aliConfigureVo) {

        log.info("获取支付宝扫码签名,aliPaySignVo={},aliConfigureVo={}",aliPaySignVo,aliConfigureVo);
        try {
            //初始化业务参数
            AliScanPayReqData aliScanPayReqData = getAliPaySignData(aliPaySignVo,aliConfigureVo);
            //初始化支付参数
            AliConfigure aliConfigure = getAliConfigure(aliConfigureVo);
            //获取签名
            Map<String,Object> map = payBizz.aliScanPaySign(aliScanPayReqData,aliConfigure);
            log.info("支付宝扫码签名结果,map={}",map);
            return map;
        } catch (AliPayException e){
            throw e;
        }catch (Exception e) {
            log.error("获取支付宝扫码支付签名失败,e={}", e.getMessage(), e);
            throw new WeChatException(ConstantEnum.EXCEPTION_ALI_PAY_SIGN_FAIL.getCodeStr(), ConstantEnum.EXCEPTION_ALI_PAY_SIGN_FAIL.getValueStr());
        }
    }

    @Override
    @SuppressWarnings("unchecked")
    public Map<String, Object> f2fPayRefund(String orderNo, Integer refundAmount, String refundReason, AliConfigureVo aliConfigureVo) {

        log.info("支付宝面对面退款,orderNo={},refundAmount={},refundReson={},aliConfigUreVo={}",orderNo,refundAmount,refundReason,aliConfigureVo);
        try {
            //初始化支付参数
            AliConfigure aliConfigure = getAliConfigure(aliConfigureVo);

            AlipayTradeRefundResponse alipayTradeRefundResponse = refundBizz.aliRefund(orderNo, refundAmount, refundReason, aliConfigure);

            Map<String,Object> map = new BeanMap(alipayTradeRefundResponse);

            log.info("支付宝面对面支付退款,map={}",map);
            return map;
        } catch (AliPayException e){
            throw e;
        }catch (Exception e) {
            log.error("支付宝面对面支付退款失败,e={}", e.getMessage(), e);
            throw new WeChatException(ConstantEnum.EXCEPTION_ALI_REFUND_FAIL.getCodeStr(), ConstantEnum.EXCEPTION_ALI_REFUND_FAIL.getValueStr());
        }
    }

    @Override
    public String getUserAuthUrl(String storeId,Integer authType,String redirectUrl, AliConfigureVo aliConfigureVo){

        //初始化支付参数
        AliConfigure aliConfigure = getAliConfigure(aliConfigureVo);

        return AliPayUnit.getAuthUrl(aliConfigure, storeId, "auth_base", authType, redirectUrl);

    }

    //设置支付参数
    private AliConfigure getAliConfigure(AliConfigureVo aliConfigureVo){
        AliConfigure aliConfigure = AliConfigure.getInstance();
        BeanUtils.copyProperties(aliConfigureVo, aliConfigure);
        return aliConfigure;
    }

    //设置业务参数
    private AliScanPayReqData getAliPaySignData(AliPaySignVo aliPaySignVo,AliConfigureVo aliConfigureVo){
        AliScanPayReqData aliScanPayReqData = new AliScanPayReqData();
        BeanUtils.copyProperties(aliPaySignVo,aliScanPayReqData);
        if(StringUtil.isEmpty(aliPaySignVo.getSellerId())){
            aliScanPayReqData.setSellerId(aliConfigureVo.getPid());
        }
        return aliScanPayReqData;
    }
}

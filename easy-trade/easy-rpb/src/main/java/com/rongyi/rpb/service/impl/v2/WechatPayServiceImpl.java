package com.rongyi.rpb.service.impl.v2;

import com.rongyi.easy.rpb.vo.WechatConfigureVo;
import com.rongyi.easy.rpb.vo.WechatPaySignVo;
import com.rongyi.pay.core.Exception.ParamNullException;
import com.rongyi.pay.core.Exception.WeChatException;
import com.rongyi.pay.core.constants.ConstantEnum;
import com.rongyi.pay.core.unit.WeChatPayUnit;
import com.rongyi.pay.core.wechat.model.*;
import com.rongyi.pay.core.wechat.util.WechatConfigure;
import com.rongyi.rpb.bizz.PayBizz;
import com.rongyi.rpb.bizz.RefundBizz;
import com.rongyi.rss.rpb.IWechatPayService;
import org.apache.commons.beanutils.BeanMap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * conan
 * 2017/2/6 17:06
 **/
@Service
public class WechatPayServiceImpl implements IWechatPayService{

    private static final Logger log = LoggerFactory.getLogger(WechatPayServiceImpl.class);

    @Autowired
    PayBizz payBizz;
    @Autowired
    RefundBizz refundBizz;

    @Override
    public Map<String, Object> getPaySign(WechatPaySignVo wechatPaySignVo, WechatConfigureVo wechatConfigureVo) throws WeChatException,ParamNullException {

        log.info("获取微信支付签名,wechatPaySignVo={},wechatConfigureVo={}",wechatPaySignVo,wechatConfigureVo);
        try {
            //设置业务参数
            WechatPaySignData wechatPaySignData = getWechatPaySignData(wechatPaySignVo);
            //设置支付参数
            WechatConfigure wechatConfigure = getWechatConfigure(wechatConfigureVo);
            //获取微信支付签名
            Map<String,Object> map =  payBizz.wechatScanPaySign(wechatPaySignData, wechatConfigure);
            log.info("返回签名结果,map={}",map);
            return map;
        } catch (WeChatException | ParamNullException e){
            throw e;
        }catch (Exception e) {
            log.error("获取微信签名失败,e={}",e.getMessage(),e);
            throw new WeChatException(ConstantEnum.EXCEPTION_WEIXIN_SIGN_FAIL.getCodeStr(), ConstantEnum.EXCEPTION_WEIXIN_SIGN_FAIL.getValueStr());
        }
    }

    @Override
    @SuppressWarnings("unchecked")
    public Map<String, Object> refund(String orderNo, int refundFee, WechatConfigureVo wechatConfigureVo) {
        log.info("微信退款,orderNo={}refundFee={},wechatConfigureVo={}",orderNo,refundFee,wechatConfigureVo);
        try {
            //设置支付参数
            WechatConfigure wechatConfigure = getWechatConfigure(wechatConfigureVo);
            RefundResData refundResData = refundBizz.weChatRefund(orderNo, refundFee, wechatConfigure);
            Map<String,Object> map = new BeanMap(refundResData);
            log.info("退款结果,map={}",map);
            return map;
        }  catch (WeChatException | ParamNullException e) {
            throw e;
        }catch (Exception e) {
            log.error("退款失败,e={}", e.getMessage(), e);
            throw new WeChatException(ConstantEnum.EXCEPTION_WEIXIN_REFUND_FAIL.getCodeStr(), ConstantEnum.EXCEPTION_WEIXIN_REFUND_FAIL.getValueStr());
        }
    }

    @Override
    @SuppressWarnings("unchecked")
    public Map<String, Object> punchCardPay(WechatPaySignVo wechatPaySignVo, WechatConfigureVo wechatConfigureVo) {
        log.info("发起微信刷卡支付,wechatPaySignVo={},wechatConfigureVo={}",wechatPaySignVo,wechatConfigureVo);
        try {
            //设置业务参数
            WechatPaySignData wechatPaySignData = getWechatPaySignData(wechatPaySignVo);
            //设置支付参数
            WechatConfigure wechatConfigure = getWechatConfigure(wechatConfigureVo);
            //发起支付
            PunchCardPayResData punchCardPayResData = payBizz.wechatPunchCardPay(wechatPaySignData, wechatConfigure);
            Map<String,Object> map = new BeanMap(punchCardPayResData);
            log.info("返回刷卡支付结果,map={}",map);
            return map;
        }  catch (WeChatException | ParamNullException e) {
            throw e;
        } catch (Exception e) {
            log.error("刷卡支付失败,e={}", e.getMessage(), e);
            throw new WeChatException(ConstantEnum.EXCEPTION_WEIXIN_PUNCH_CARD_FAIL.getCodeStr(), ConstantEnum.EXCEPTION_WEIXIN_PUNCH_CARD_FAIL.getValueStr());
        }
    }

    @Override
    @SuppressWarnings("unchecked")
    public Map<String, Object> punchCardPayQueryOrder(String orderNo, WechatConfigureVo wechatConfigureVo) {
        log.info("微信订单查询,orderNo={},wechatCongfigVo={}",orderNo,wechatConfigureVo);
        //设置支付参数
        try {
            WechatConfigure wechatConfigure = getWechatConfigure(wechatConfigureVo);
            PunchCardPayQueryResData punchCardPayQueryResData = payBizz.wechatPunchCardPayQueryOrder(orderNo, wechatConfigure);
            Map<String,Object> map = new BeanMap(punchCardPayQueryResData);
            log.info("订单查询结果,map={}",map);
            return map;
        } catch (WeChatException e){
            throw e;
        }catch (Exception e){
            log.error("订单查询失败,e={}",e.getMessage(),e);
            throw new WeChatException(ConstantEnum.EXCEPTION_WEIXIN_QUERY_ORDER.getCodeStr(), ConstantEnum.EXCEPTION_WEIXIN_QUERY_ORDER.getValueStr());
        }
    }

    @Override
    @SuppressWarnings("unchecked")
    public Map<String, Object> getOpenId(String code, String state, WechatConfigureVo wechatConfigureVo) {
        //设置支付参数
        WechatConfigure wechatConfigure = getWechatConfigure(wechatConfigureVo);
        GetOpenIdResData getOpenIdResData = WeChatPayUnit.getOpenId(code, state, wechatConfigure);
        return new BeanMap(getOpenIdResData);
    }

    //设置支付参数
    private WechatConfigure getWechatConfigure(WechatConfigureVo wechatConfigureVo){
        WechatConfigure wechatConfigure = new WechatConfigure();
        BeanUtils.copyProperties(wechatConfigureVo,wechatConfigure);
        return wechatConfigure;
    }

    //设置业务参数
    private WechatPaySignData getWechatPaySignData(WechatPaySignVo wechatPaySignVo){
        WechatPaySignData wechatPaySignData = new WechatPaySignData();
        BeanUtils.copyProperties(wechatPaySignVo,wechatPaySignData);
        return wechatPaySignData;
    }
}

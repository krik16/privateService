package com.rongyi.rss.rpb;

import com.rongyi.core.Exception.TradePayException;
import com.rongyi.easy.rpb.vo.TianyiPayVo;
import com.rongyi.easy.ryoms.entity.WechatTianyiPayVo;

import java.util.Map;

/**
 * 天翼支付服务接口
 * Created by sujuan on 2017/4/11.
 */
public interface ItianyiPayService {

    /**
     * 天翼支付h5支付
     * @param tianyiPayVo 请求参数
     * @return 返回唤起H5收银台的url
     * @throws TradePayException
     */
    Map<String,Object> h5Pay(WechatTianyiPayVo wechatTianyiPayVo ,TianyiPayVo tianyiPayVo) throws TradePayException ;

    /**
     * 普通支付退款
     * orderNo 订单号
     * refundAmount 退款金额(单位分)
     * wechatConfigureVo 支付参数
     **/
    Map<String, Object> refund(String orderNo, int refundAmount) throws TradePayException;

}

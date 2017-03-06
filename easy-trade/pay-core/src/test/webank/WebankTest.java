package webank;

import com.rongyi.pay.core.unit.WebankPayUnit;
import com.rongyi.pay.core.webank.config.WebankConfigure;
import com.rongyi.pay.core.webank.model.*;
import com.rongyi.pay.core.webank.param.WaPunchCardPayParam;
import com.rongyi.pay.core.webank.param.WwPunchCardPayParam;
import com.sun.org.glassfish.gmbal.Description;
import net.sf.json.JSONObject;
import org.apache.commons.lang.StringUtils;
import org.junit.Test;

import java.math.BigDecimal;

/**
 *
 * Created by sujuan on 2017/3/2.
 */
public class WebankTest {

    String merchantCode  = "107100000000014";

    @Test
    @Description("微信刷卡支付")
    public void wechatPunchCardPay(){
        init();
        WebankPayUnit webankPayUnit = new WebankPayUnit();
        WwPunchCardPayParam param = new WwPunchCardPayParam();
        param.setMerchantCode("107100000000014");
        param.setTerminalCode("web");
        param.setOrderNo(getOrderNO());
        param.setAmount(new BigDecimal("0.01").setScale(2, BigDecimal.ROUND_HALF_UP));
        param.setProduct("测试");
        param.setAuthCode("130187622836349194");
        WwPunchCardResData resData = webankPayUnit.webankWechatPunchCardPay(param);
        System.out.println(resData);
    }

    @Test
    @Description("微信刷卡支付查询")
    public void wechatPunchCardQuery(){
        init();
        WebankPayUnit webankPayUnit = new WebankPayUnit();
        WwPunchCardQueryOrderReqData reqData = new WwPunchCardQueryOrderReqData("1488610970424","107100000000014");
        WwPunchCardResData resData = webankPayUnit.webankWechatPunchCardPayQueryOrder(reqData);
        System.out.println(resData);
    }

    @Test
     @Description("微信刷卡支付撤销订单")
     public void wechatPunchCardReverse(){
        init();
        WebankPayUnit webankPayUnit = new WebankPayUnit();
        WwPunchCardReverseReqData reqData = new WwPunchCardReverseReqData();
        reqData.setMerchant_code("107100000000014");
        reqData.setTerminal_code("web");
        reqData.setO_terminal_serialno("1488610970424");
        reqData.setTerminal_serialno(getOrderNO());
        reqData.setAmount(new BigDecimal("10001").setScale(2, BigDecimal.ROUND_HALF_UP));
        WwPunchCardReverseResData resData = webankPayUnit.webankWechatPunchCardReverse(reqData);
        System.out.println(resData);
    }

    @Test
    @Description("微信刷卡支付退款")
    public void wechatPunchCardRefund(){
        init();
        WebankPayUnit webankPayUnit = new WebankPayUnit();
        WwpunchCardRefundReqData reqData = new WwpunchCardRefundReqData();
        reqData.setMerchant_code(merchantCode);
        reqData.setTerminal_serialno("1488614365160");
        reqData.setRefund_amount(new BigDecimal("0.01").setScale(2, BigDecimal.ROUND_HALF_UP));
        WwPunchCardRefundResData resData = webankPayUnit.webankWechatPunchCardRefund(reqData);
        System.out.println(resData);
    }

    @Test
    @Description("微信刷卡支付退款查询")
    public void wechatPunchCardRefundQuery(){
        init();
        WebankPayUnit webankPayUnit = new WebankPayUnit();
        WwpunchCardRefundReqData reqData = new WwpunchCardRefundReqData();
        reqData.setMerchant_code(merchantCode);
        reqData.setTerminal_serialno("1488614365160");
        WwPunchCardRefundResData resData = webankPayUnit.webankWechatPunchCardRefundQuery(reqData);
        System.out.println(resData);
    }

    @Test
    @Description("支付宝获取token")
    public void alipayGetToken(){
        init();
        WebankPayUnit webankPayUnit = new WebankPayUnit();
        WaAccessTokenResData resData = webankPayUnit.alipayGetToken();
        System.out.println(resData);
    }

    @Test
    @Description("支付宝获取ticket")
    public void alipayGetTicket() {
        init();
        WebankPayUnit webankPayUnit = new WebankPayUnit();
        String token = "WLA0f-dGGlQHTVClazkxtmW6FX_nRhpUB01QpWs5MbZluhUZR0G5aLXVc9BuMu3iBonwHSWB03GkAIOzWLrwHqIJCw";
        webankPayUnit.alipayGetTicket(token);
    }

    @Test
    @Description("支付宝刷卡支付")
    public void alipayPunchCardPay() {
        init();
        WebankPayUnit webankPayUnit = new WebankPayUnit();
        WaPunchCardPayParam param = new WaPunchCardPayParam();
        param.setWbMerchantId("107075571030015");
        param.setAuthCode("283733809390933428");
        param.setTotalAmount(new BigDecimal("0.01").setScale(2));
        param.setOrderId(getOrderNO());
        param.setSubject("test");
        webankPayUnit.alipayPunchCardPay(param);
    }

    @Test
    @Description("支付宝刷订单查询")
    public void alipayQueyrTrade() {
        init();
        WebankPayUnit webankPayUnit = new WebankPayUnit();
        
    }

    public static void init() {
        WebankConfigure configure = WebankConfigure.getInstance();
        if (StringUtils.isEmpty(configure.getKey())) {
            configure.setKey("123");
            configure.setWechatPunchCardPayUrl("https://test-svrapi.webank.com/l/wbap-bbfront/mao");
            configure.setWechatPunchCardPayQueryOrderUrl("https://test-svrapi.webank.com/l/wbap-bbfront/mgos");
            configure.setWechatPunchCardPayReverseOrderUrl("https://test-svrapi.webank.com/l/wbap-bbfront/ro");
            configure.setWechatPunchCardRefundUrl("https://test-svrapi.webank.com/l/wbap-bbfront/nro");
            configure.setWechatPunchCardRefundQueryUrl("https://test-svrapi.webank.com/l/wbap-bbfront/nros");

            configure.setWechatKeyStorePath("D:\\cert\\www.rongyi.com\\www.rongyi.com.p12");
            configure.setWechatTrustStorePath("D:\\Users\\sujuan\\webank-trust.jks");
            configure.setWechatKeyStorePwd("www.rongyi.com");

            configure.setAppId("W0000036");
            configure.setSecret("mJBdgcPLLRYvJzZYmtEz97ekHGZaoGLFallg6JjOXcptcw6xOtU6JceY15sQH8mb");
            configure.setAlipayGetTokenUrl("https://l.test-svrapi.webank.com/api/oauth2/access_token");
            configure.setAlipayGetTicketUrl("https://l.test-svrapi.webank.com/api/oauth2/api_ticket");
            configure.setTicket("0MepBKauz3RqTQZRvqwehqoOxCiVgpR2XM3UhWwvrTLeJPqpIB60JDa0iAp7HjoN");

            configure.setAlipayPunchCardPayUrl("https://l.test-svrapi.webank.com/api/acq/server/alipay/pay");
        }
    }

    public static String getOrderNO() {
        Long orderNo = System.currentTimeMillis();
        return orderNo.toString();
    }

    public static void main(String args[]) {
//        WwPunchCardReqData param = new WwPunchCardReqData();
//        param.setAttach("adfafd");
//        param.setSub_appid("45546656465");
//        param.setGoods_tag("");
//        JSONObject jsonObject = JSONObject.fromObject(param);
        BigDecimal num = new BigDecimal(1.00).setScale(2);
        System.out.println(num.toString());
        JSONObject json = new JSONObject();
        json.put("num", num+"");
        System.out.println(json.toString());
        System.out.println();
    }

}

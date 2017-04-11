package webank;

import com.rongyi.pay.core.unit.WebankPayUnit;
import com.rongyi.pay.core.webank.config.WebankConfigure;
import com.rongyi.pay.core.webank.model.*;
import com.rongyi.pay.core.webank.model.res.WwScanPayResData;
import com.rongyi.pay.core.webank.model.res.WwScanQueryResData;
import com.rongyi.pay.core.webank.param.*;
import com.rongyi.pay.core.webank.util.Signature;
import com.sun.org.glassfish.gmbal.Description;
import org.apache.commons.lang.StringUtils;
import org.junit.Test;

import java.math.BigDecimal;

/**
 *
 * Created by sujuan on 2017/3/2.
 */
//@RunWith(JUnit4Runner.class)
public class WebankTest {

    String merchantCode  = "107290054110002";
    String wbMerchatId = "107075571030015";
    static String domain = "https://test-svrapi.webank.com/l/";
//  String domain = "https://svrapi.webank.com/";

    @Test
    @Description("微信刷卡支付")
    public void wechatPunchCardPay(){
        init();
        WebankPayUnit webankPayUnit = new WebankPayUnit();
        WwPunchCardPayParam param = new WwPunchCardPayParam();
        param.setMerchantCode(merchantCode);
        param.setTerminalCode("web");
        param.setOrderNo(getOrderNO());
        param.setAmount(new BigDecimal("0.01").setScale(2, BigDecimal.ROUND_HALF_UP));
        param.setProduct("test");
        param.setAuthCode("130026195640709141");
//        param.setOpenid("99999999999999");
//        param.setSubAppid("000000000000");
//        param.setGoodsTag("测试商品");
//        param.setAttach("附加信息");
        WwPunchCardResData resData = webankPayUnit.wechatPunchCardPay(param);
        System.out.println(resData+".....");
    }

    @Test
    @Description("微信刷卡支付查询")
    public void wechatPunchCardQuery(){
        init();
        WebankPayUnit webankPayUnit = new WebankPayUnit();
        WwPunchCardQueryOrderReqData reqData = new WwPunchCardQueryOrderReqData("107100000000014","1488792891971");
        WwPunchCardResData resData = webankPayUnit.wechatPunchCardPayQueryOrder(reqData);
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
        reqData.setO_terminal_serialno("1490775093186");
        reqData.setTerminal_serialno(getOrderNO());
        reqData.setAmount(new BigDecimal("10001").setScale(2, BigDecimal.ROUND_HALF_UP));
        WwPunchCardReverseResData resData = webankPayUnit.wechatPunchCardReverse(reqData);
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
        WwPunchCardRefundResData resData = webankPayUnit.wechatPunchCardRefund(reqData);
        System.out.println(resData);
    }

    @Test
    @Description("微信刷卡支付退款查询")
    public void wechatPunchCardRefundQuery(){
        init();
        WebankPayUnit webankPayUnit = new WebankPayUnit();
        WwpunchCardRefundReqData reqData = new WwpunchCardRefundReqData();
        reqData.setMerchant_code(merchantCode);
        reqData.setTerminal_serialno("1490860084481");
        WwPunchCardRefundResData resData = webankPayUnit.wechatPunchCardRefundQuery(reqData);
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
        String token = "WLA0f-dGGlQHTVClazkxtmW6FX_nRhpUB01QpWs5MbZluhUWgTOVo4XvWHZuEqevzbjASf2bGbAjUISAu5pliXxh1g";
        webankPayUnit.alipayGetTicket(token);
    }

    @Test
    @Description("支付宝刷卡支付")
    public void alipayPunchCardPay() {
        init();
        WebankPayUnit webankPayUnit = new WebankPayUnit();
        WaPunchCardPayParam param = new WaPunchCardPayParam();
        param.setWbMerchantId(wbMerchatId);
        param.setAuthCode("287162303729376278");
        param.setTotalAmount(new BigDecimal("0.01").setScale(2));
        param.setOrderId(getOrderNO());
        param.setSubject("test");
        webankPayUnit.alipayPunchCardPay(param);
    }

    @Test
    @Description("支付宝订单查询")
    public void alipayQueyrTrade() {
        init();
        WebankPayUnit webankPayUnit = new WebankPayUnit();
        WaQueryTradeReqData reqData = new WaQueryTradeReqData(wbMerchatId, "1490686823004");
        WaQueryTradeResData resData = webankPayUnit.alipayQueryTrade(reqData);
        System.out.println(resData);
    }

    @Test
    @Description("支付宝冲正订单")
    public void alipayReverseTrade() {
        init();
        WebankPayUnit webankPayUnit = new WebankPayUnit();
        WaReverseTradeReqData reqData = new WaReverseTradeReqData(wbMerchatId,"1488773144113");
        WaReverseTradeResData resData = webankPayUnit.alipayReverseTrade(reqData);
        System.out.println(resData);
    }

    @Test
    @Description("支付宝退款")
    public void alipayRefundOrder() {
        init();
        WebankPayUnit webankPayUnit = new WebankPayUnit();
        WaRefundReqData reqData = new WaRefundReqData();
        reqData.setWbMerchantId(wbMerchatId);
        reqData.setOrderId("1488771549778");
        reqData.setRefundAmount(new BigDecimal("0.01").setScale(2, BigDecimal.ROUND_HALF_UP));
        reqData.setOutRequestNo(getOrderNO());
        WaRefundResData resData = webankPayUnit.alipayRefund(reqData);
        System.out.println(resData);
    }

    @Test
    @Description("支付宝退款查询")
    public void alipayRefundOrderQuery() {
        init();
        WebankPayUnit webankPayUnit = new WebankPayUnit();
        WaRefundQueryReqData reqData = new WaRefundQueryReqData();
        reqData.setWbMerchantId(wbMerchatId);
        reqData.setOrderId("1488771549778");
        WaRefundQueryResData resData = webankPayUnit.alipayRefundQuery(reqData);
        System.out.println(resData);
    }

    @Test
    @Description("微信公众号支付")
    public void wechatScanPay() {
        init();
        WebankPayUnit webankPayUnit = new WebankPayUnit();
        WwScanPayParam param = new WwScanPayParam();
        param.setMchId(merchantCode);
        param.setOutTradeNo(getOrderNO());
        param.setBody("交易描述");
        param.setSubAppid("wx6adc3ad9a28954bc");
        param.setSubOpenid("o5XVuwq7HBFKaSHtlU1w2OrErAPM");
        param.setTotalFee(1);
        WwScanPayResData resData = webankPayUnit.wechatScanPay(param);
        System.out.println(resData);
    }

    @Test
    @Description("微信公众号支付订单查询")
    public void wechatScanQuery() {
        init();
        WebankPayUnit webankPayUnit = new WebankPayUnit();
        WwScanQueryParam param = new WwScanQueryParam();
        param.setOutTradeNo("1490775093186");
        param.setMchId(merchantCode);
        WwScanQueryResData resData = webankPayUnit.wechatScanQuery(param);
        System.out.println(resData);
    }

    @Test
    @Description("支付宝扫码支付")
    public void alipayScanPay() {
        init();
        WebankPayUnit webankPayUnit = new WebankPayUnit();
        WaScanPayParam payParam = new WaScanPayParam();
        payParam.setWbMerchantId(wbMerchatId);
        payParam.setOrderId(getOrderNO());
        payParam.setSubject("海贼王手办");
        payParam.setTotalAmount("0.01");
        webankPayUnit.alipayScanPay(payParam);
    }

    public static void init() {
        WebankConfigure configure = WebankConfigure.getInstance();
        if (StringUtils.isEmpty(configure.getKey())) {
            configure.setKey("rongyiwang170324");
            configure.setWechatPunchCardPayUrl("https://svrapi.webank.com/wbap-bbfront/mao");
            configure.setWechatPunchCardPayQueryOrderUrl("https://test-svrapi.webank.com/l/wbap-bbfront/mgos");
            configure.setWechatPunchCardPayReverseOrderUrl("https://te st-svrapi.webank.com/l/wbap-bbfront/ro");
            configure.setWechatPunchCardRefundUrl("https://test-svrapi.webank.com/l/wbap-bbfront/nro");
            configure.setWechatPunchCardRefundQueryUrl("https://test-svrapi.webank.com/l/wbap-bbfront/nros");

            configure.setWechatKeyStorePath("E:\\itemnew\\微众\\微众生产环境证书\\rongyiwang\\rongyiwang.p12");
            configure.setWechatTrustStorePath("D:\\Users\\sujuan\\webank-trust.jks");
            configure.setWechatKeyStorePwd("App1234.");

            configure.setAppId("W0000036");
            configure.setSecret("mJBdgcPLLRYvJzZYmtEz97ekHGZaoGLFallg6JjOXcptcw6xOtU6JceY15sQH8mb");
            configure.setAlipayGetTokenUrl("https://l.test-svrapi.webank.com/api/oauth2/access_token");
            configure.setAlipayGetTicketUrl("https://l.test-svrapi.webank.com/api/oauth2/api_ticket");
            configure.setTicket("VghGm11lygUvPVdM3Yy3k6PUsOo50p89Ln4mk93dyEIbTXCxU7Q7HdhPbyl0dhNN");

            configure.setAlipayPunchCardPayUrl("https://l.test-svrapi.webank.com/api/acq/server/alipay/pay");
            configure.setAlipayQueryTradeUrl("https://l.test-svrapi.webank.com/api/acq/server/alipay/querytrade");
            configure.setAlipayReverseTradeUrl("https://l.test-svrapi.webank.com/api/acq/server/alipay/cancel");
            configure.setAlipayRefundUrl("https://l.test-svrapi.webank.com/api/acq/server/alipay/refund");
            configure.setAlipayRefundQueryUrl("https://l.test-svrapi.webank.com/api/acq/server/alipay/queryrefund");

            //条码支付url
            configure.setWechatScanPayUrl(domain + "wbap-bbfront/AddOrder");
            configure.setWechatScanNotifyUrl("http://c.rongyi.com/ryoms/users/login");
            configure.setAlipayScanPayUrl(domain + "api/acq/server/alipay/precreatetrade");
            configure.setWechatScanQueryUrl(domain + "wbap-bbfront/GetOrderStatus");
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
//        BigDecimal num = new BigDecimal(1.00).setScale(2);
//        System.out.println(num.toString());
//        JSONObject json = new JSONObject();
//        json.put("num", num+"");
//        System.out.println(json.toString());
        WwPunchCardQueryOrderReqData reqData = new WwPunchCardQueryOrderReqData("107100000000014", "1488787331617");
        System.out.println(Signature.getWechatSign(reqData,"123"));
    }

}

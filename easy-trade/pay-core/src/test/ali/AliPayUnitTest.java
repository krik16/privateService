package ali;

import base.JUnit4Runner;
import com.alipay.api.response.AlipayTradePayResponse;
import com.rongyi.pay.core.ali.config.AliConfigure;
import com.rongyi.pay.core.ali.model.reqData.AliPunchCardPayReqData;
import com.rongyi.pay.core.ali.model.reqData.AliScanPayReqData;
import com.rongyi.pay.core.ali.model.result.AlipayF2FQueryResult;
import com.rongyi.pay.core.ali.model.result.AlipayF2FRefundResult;
import com.rongyi.pay.core.unit.AliPayUnit;
import com.sun.org.glassfish.gmbal.Description;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;

/**
 * conan
 * 2016/10/31 13:50
 **/
@RunWith(JUnit4Runner.class)
public class AliPayUnitTest{

    private static final Logger LOGGER = LoggerFactory.getLogger(AliPayUnitTest.class);

    @Test
    @Description("测试获取扫码支付签名")
    public void testGetPaySign(){

//        String outTradeNo = System.currentTimeMillis() + (long)(Math.random() * 10000000L) +"";
        String outTradeNo = "123456781";

        // (必填) 订单标题，粗略描述用户的支付目的。如“xxx品牌xxx门店消费”
        String subject = "xxx品牌xxx门店当面付消费";

        // (必填) 订单总金额，单位为分，不能超过1亿元
        // 如果同时传入了【打折金额】,【不可打折金额】,【订单总金额】三者,则必须满足如下条件:【订单总金额】=【打折金额】+【不可打折金额】
        Integer totalAmount = 1;

        // (必填) 付款条码，用户支付宝钱包手机app点击“付款”产生的付款条码
        String buyerId = "20881003550732247006383602412124"; // 条码示例，286648048691290423

        // 卖家支付宝账号ID，用于支持一个签约账号下支持打款到不同的收款账号，(打款到sellerId对应的支付宝账号)
        // 如果该字段为空，则默认为与支付宝签约的商户的PID，也就是appid对应的PID
//        String sellerId = "test@rongyi.com";

        // 订单描述，可以对交易或商品进行一个详细地描述，比如填写"购买商品3件共20.00元"
//        String body = "购买商品3件共20.00元";

        // 商户操作员编号，添加此参数可以为商户操作员做销售统计
//        String operatorId = "test_operator_id";

        // (必填) 商户门店编号，通过门店号和商家后台可以配置精准到门店的折扣信息，详询支付宝技术支持
        String storeId = "test_store_id";

        // 支付超时，线下扫码交易定义为5分钟
        String timeoutExpress = "5m";

        String appAuthToken = "201611BB1117ec6b58b94007aa3ede588b35fX21";//根据真实值填写
//        String appAuthToken = "201610BBcd47e91d61e1433195666d4eaf542F46";//子商户
//        tradeNo=2016110221001004240241155063

        AliScanPayReqData aliScanPayReqData = new AliScanPayReqData();
        aliScanPayReqData.setAppAuthToken(appAuthToken);
        aliScanPayReqData.setBuyerId(buyerId);
        aliScanPayReqData.setStoreId(storeId);
//        aliScanPayReqData.setBody(body);
        aliScanPayReqData.setTimeoutExpress(timeoutExpress);
        aliScanPayReqData.setOutTradeNo(outTradeNo);
        aliScanPayReqData.setSubject(subject);
        aliScanPayReqData.setTotalAmount(totalAmount);
        AliConfigure aliConfigure  = AliConfigure.init();
        try {
            Map<String,Object> map = AliPayUnit.getScanPaySign(aliConfigure, aliScanPayReqData);
            LOGGER.info("map={}",map);
        } catch (Exception e) {
            LOGGER.warn(e.getMessage());
        }
    }

    @Test
    @Description("测试当面付刷卡支付")
    public void testPunchCardPay(){

//        String outTradeNo = System.currentTimeMillis() + (long)(Math.random() * 10000000L) +"";
        String outTradeNo = "1234222";

        // (必填) 订单标题，粗略描述用户的支付目的。如“xxx品牌xxx门店消费”
        String subject = "xxx品牌xxx门店当面付消费";

        // (必填) 订单总金额，单位为分，不能超过1亿元
        // 如果同时传入了【打折金额】,【不可打折金额】,【订单总金额】三者,则必须满足如下条件:【订单总金额】=【打折金额】+【不可打折金额】
        Integer totalAmount = 1;

        // (必填) 付款条码，用户支付宝钱包手机app点击“付款”产生的付款条码
        String authCode = "282154659681494229"; // 条码示例，286648048691290423

        // 卖家支付宝账号ID，用于支持一个签约账号下支持打款到不同的收款账号，(打款到sellerId对应的支付宝账号)
        // 如果该字段为空，则默认为与支付宝签约的商户的PID，也就是appid对应的PID
        String sellerId = "";

        // 订单描述，可以对交易或商品进行一个详细地描述，比如填写"购买商品3件共20.00元"
        String body = "购买商品3件共20.00元";

        // 商户操作员编号，添加此参数可以为商户操作员做销售统计
//        String operatorId = "test_operator_id";

        // (必填) 商户门店编号，通过门店号和商家后台可以配置精准到门店的折扣信息，详询支付宝技术支持
        String storeId = "test_store_id";

        // 支付超时，线下扫码交易定义为5分钟
        String timeoutExpress = "5m";

//        String appAuthToken = "201611BB1117ec6b58b94007aa3ede588b35fX21";//根据真实值填写
//        String appAuthToken = "201610BB9d7516f650e242718ef9eef7d82bfX46";//子商户
        String appAuthToken = "201611BBfe7b467695b840be8350a423473cdB46";//子商户2
//        tradeNo=2016110221001004240241155063

        AliPunchCardPayReqData aliPunchCardPayReqData = new AliPunchCardPayReqData();
        aliPunchCardPayReqData.setAppAuthToken(appAuthToken);
        aliPunchCardPayReqData.setAuthCode(authCode);
        aliPunchCardPayReqData.setStoreId(storeId);
        aliPunchCardPayReqData.setBody(body);
        aliPunchCardPayReqData.setTimeoutExpress(timeoutExpress);
        aliPunchCardPayReqData.setOutTradeNo(outTradeNo);
        aliPunchCardPayReqData.setSubject(subject);
        aliPunchCardPayReqData.setTotalAmount(totalAmount);
        AliConfigure aliConfigure  = AliConfigure.init();
        try {
            AlipayTradePayResponse alipayTradePayResponse = AliPayUnit.punchCardPay(aliConfigure, aliPunchCardPayReqData);
            LOGGER.info("tradeNo={},orderNo={}",alipayTradePayResponse.getTradeNo(),alipayTradePayResponse.getOutTradeNo());
        } catch (Exception e) {
            LOGGER.warn(e.getMessage());
        }
    }

    @Test
    @Description("测试当面付支付查询")
    public void testf2fPayQuery(){
        AliConfigure aliConfigure  = AliConfigure.init();
        try {
            AlipayF2FQueryResult result = AliPayUnit.f2fPayQuery(aliConfigure, "12345678", "2016110421001004240244517494");
            LOGGER.info("result={}",result);
        } catch (Exception e) {
            LOGGER.warn(e.getMessage());
        }

    }

    @Test
    @Description("测试当面付支付退款")
    public void testF2fPayRefund(){
        AliConfigure aliConfigure  = AliConfigure.init();
        try {
            AlipayF2FRefundResult result = AliPayUnit.f2fPayRefund(aliConfigure, "1234", 1, "1111111112", "买错了", "11");
            LOGGER.info("result={}",result);
        } catch (Exception e) {
            LOGGER.warn(e.getMessage());
        }

    }

    @Test
    @Description("测试生成授权链接")
    public void testGetAuthUrl(){
        try {
            AliConfigure aliConfigure  = AliConfigure.init();
            String redirectUri = "http://120.25.197.98:8090/fuwuchuanDemo/gateway.do";

            //商户授权地址
            String mchAuthUrl =  AliPayUnit.getAuthUrl(aliConfigure,"1111",null,1,redirectUri);
            LOGGER.info("mchAuthUrl={}", mchAuthUrl);

            //用户授权地址
            String userAuthUrl =  AliPayUnit.getAuthUrl(aliConfigure,"2222","auth_base",2,redirectUri);
            LOGGER.info("userAuthUrl={}",userAuthUrl);
        }catch (Exception e){
            LOGGER.warn(e.getMessage());
        }
    }

    @Test
    @Description("测试支付通知验签")
    public void testValidateNotify(){
        AliConfigure aliConfigure  = AliConfigure.init();
//        AlipayNotify.verifyNotify();
    }

    @Test
    @Description("测试获取支付宝用户id")
    public  void testGetAliBuyerId(){
        AliConfigure aliConfigure  = AliConfigure.init();
        try {
            AliPayUnit.getAuthToken(aliConfigure,"dbc9a8e6988b4a8aa17f1c029a16RX24","2016091201888052","1","",2);
        } catch (Exception e) {
            LOGGER.warn(e.getMessage());
        }
    }
}

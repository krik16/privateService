package wechat;

import base.JUnit4Runner;
import com.rongyi.pay.core.unit.TimeExpireUnit;
import com.rongyi.pay.core.unit.WeChatPayUnit;
import com.rongyi.pay.core.wechat.model.WechatPaySignData;
import com.rongyi.pay.core.wechat.util.WechatConfigure;
import com.sun.org.glassfish.gmbal.Description;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;

/**
 * conan
 * 2016/10/10 11:49
 **/
@RunWith(JUnit4Runner.class)
public class WeChatPayUnitTest {

    private static final Logger LOGGER = LoggerFactory.getLogger(WeChatPayUnitTest.class);

    @Test
    @Description("获取APP支付签名")
    public void getAppPaySignTest(){
        WechatPaySignData wechatPaySignData = new WechatPaySignData();
        wechatPaySignData.setBody("test");
        wechatPaySignData.setPayNo("123456789102");
        wechatPaySignData.setTotalFee(1);
        wechatPaySignData.setOpenId("o0BDmjqmpLdwY86VCHNxpiZ8OP6c");
        Map<String,String> map = TimeExpireUnit.weChatPayTimeExpire(null, null,1);
        wechatPaySignData.setTimeStart(map.get("timeStart"));
        wechatPaySignData.setTimeExpire(map.get("timeExpire"));
        //获取app支付签名
        WechatConfigure wechatConfigure = new WechatConfigure();
        wechatConfigure.setAppID("wx796a60734e64eef1");
        wechatConfigure.setKey("b24aaabb1ea8a155c4572570cd260313");
        wechatConfigure.setMchID("1416983302");
        wechatConfigure.setCertPassword("1416983302");
        wechatConfigure.setCertLocalPath("/data/images/score-order-cret/1416983302.p12");
        wechatConfigure.setTradeType("APP");
        try {
            Map<String,Object> appMap = WeChatPayUnit.getPaySign(wechatPaySignData, wechatConfigure,"test");
            LOGGER.info("APP签名结果,resultMap={}", appMap);
        } catch (Exception e) {
            LOGGER.warn(e.getMessage());
        }


    }
    @Test
    @Description("获取JSAPI支付签名")
    public void getJSAPIPaySignTest(){
        WechatPaySignData wechatPaySignData = new WechatPaySignData();
        wechatPaySignData.setBody("test");
        wechatPaySignData.setPayNo("12345678912");
        wechatPaySignData.setTotalFee(1);
        wechatPaySignData.setOpenId("oaVqEwXlcEqak2pC_FCe_Op-QJXI");
        Map<String,String> map = TimeExpireUnit.weChatPayTimeExpire(null, null,1);
        wechatPaySignData.setTimeStart(map.get("timeStart"));
        wechatPaySignData.setTimeExpire(map.get("timeExpire"));
        //获取公众号支付签名
        WechatConfigure wechatConfigure = new WechatConfigure();
        wechatConfigure.setAppID("wx796a60734e64eef1");
        wechatConfigure.setKey("b24aaabb1ea8a155c4572570cd260313");
        wechatConfigure.setMchID("1416983302");
        wechatConfigure.setCertPassword("1416983302");
        wechatConfigure.setCertLocalPath("/data/images/score-order-cret/1416983302.p12");
        wechatConfigure.setTradeType("JSAPI");
        try {
            Map<String,Object> resultMap = WeChatPayUnit.getPaySign(wechatPaySignData, wechatConfigure,"test");
            LOGGER.info("公众号签名结果,resultMap={}",resultMap);
        } catch (Exception e) {
            LOGGER.warn(e.getMessage());
        }
    }

    @Test
    @Description("刷卡支付")
    public void punchCardPayTest(){
        WechatPaySignData wechatPaySignData = new WechatPaySignData();
        wechatPaySignData.setBody("test");
        wechatPaySignData.setPayNo("123456789101121222");
        wechatPaySignData.setTotalFee(1);
        Map<String,String> map = TimeExpireUnit.weChatPayTimeExpire(null, null,1);
        wechatPaySignData.setTimeStart(map.get("timeStart"));
        wechatPaySignData.setTimeExpire(map.get("timeExpire"));
        wechatPaySignData.setAuthCode("130137435387799907");
        //刷卡支付
        WechatConfigure wechatConfigure = new WechatConfigure();
        wechatConfigure.setAppID("wx796a60734e64eef1");
        wechatConfigure.setKey("b24aaabb1ea8a155c4572570cd260313");
        wechatConfigure.setMchID("1416983302");
        wechatConfigure.setCertPassword("1416983302");
        wechatConfigure.setCertLocalPath("/data/images/score-order-cret/1416983302.p12");
        wechatConfigure.setTradeType("NATIVE");
        try {
            WeChatPayUnit.punchCardPay(wechatPaySignData, wechatConfigure);
        } catch (Exception e) {
            LOGGER.warn(e.getMessage());
        }
    }

    @Test
    @Description("服务商模式刷卡支付")
    public void punchCardPayTest2(){
        WechatPaySignData wechatPaySignData = new WechatPaySignData();
        wechatPaySignData.setBody("容易网");
        wechatPaySignData.setPayNo("130195064518035460");
        wechatPaySignData.setTotalFee(1);
        Map<String,String> map = TimeExpireUnit.weChatPayTimeExpire(null, null,1);
        wechatPaySignData.setTimeStart(map.get("timeStart"));
        wechatPaySignData.setTimeExpire(map.get("timeExpire"));
        wechatPaySignData.setAuthCode("130247378709053426");
        //刷卡支付
        WechatConfigure wechatConfigure = new WechatConfigure();
        wechatConfigure.setAppID("wx985652af47226440");
        wechatConfigure.setKey("b24aaabb1ea8a155c4572570cd260313");
        wechatConfigure.setMchID("1272843501");
        wechatConfigure.setCertPassword("1272843501");
        wechatConfigure.setSubMchID("1394906802");
        wechatConfigure.setSubAppID("wx34652f2ae71ef03a");
        wechatConfigure.setCertLocalPath("/data/etc/projects/pbs/1272843501.p12");
        wechatConfigure.setTradeType("NATIVE");
        try {
            WeChatPayUnit.punchCardPay(wechatPaySignData, wechatConfigure);
        } catch (Exception e) {
            LOGGER.warn(e.getMessage());
        }
    }

    @Test
    @Description("微信刷卡支付退款")
    public void punchCardRefund(){
        //刷卡支付退款
        WechatConfigure wechatConfigure = new WechatConfigure();
        wechatConfigure.setAppID("wxf6922aee3bcf0ae8");
        wechatConfigure.setKey("b24aaabb1ea8a155c4572570cd260313");
        wechatConfigure.setMchID("1268956601");
        wechatConfigure.setCertPassword("1268956601");
        wechatConfigure.setCertLocalPath("/data/etc/projects/easy-rpb-cert/1268956601.p12");
        wechatConfigure.setTradeType("NATIVE");
        try {
            WeChatPayUnit.punchCardRefund("5110943588352133655", 200,200,"12313212",wechatConfigure);
        } catch (Exception e) {
            LOGGER.warn(e.getMessage());
        }
    }

}

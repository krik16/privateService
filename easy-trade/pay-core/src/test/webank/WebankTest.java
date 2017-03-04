package webank;

import com.rongyi.pay.core.unit.WebankPayUnit;
import com.rongyi.pay.core.webank.config.WebankConfigure;
import com.rongyi.pay.core.webank.model.WaAccessTokenResData;
import com.rongyi.pay.core.webank.model.WwPunchCardResData;
import com.rongyi.pay.core.webank.param.WaPunchCardPayParam;
import com.rongyi.pay.core.webank.param.WwPunchCardPayParam;
import com.sun.org.glassfish.gmbal.Description;
import org.apache.commons.lang.StringUtils;
import org.junit.Test;

import java.math.BigDecimal;

/**
 *
 * Created by sujuan on 2017/3/2.
 */
public class WebankTest {

    @Test
    @Description("微信刷卡支付")
    public void wechatPunchCardPay(){
        init();
        WebankPayUnit webankPayUnit = new WebankPayUnit();
        WwPunchCardPayParam param = new WwPunchCardPayParam();
        param.setMerchantCode("107100000000014");
        param.setTerminalCode("web");
        param.setOrderNo(getOrderNO());
        param.setAmount(new BigDecimal("0.01").setScale(2));
        param.setProduct("测试");
        param.setAuthCode("130253771579836491");
        System.out.println(param.getAmount().compareTo(new BigDecimal(0)));
        if (param.getAmount() != null && StringUtils.isNotEmpty(param.getAmount().toString()) && param.getAmount().compareTo(BigDecimal.ZERO) == 1) {
            System.out.println(".......");
        }
        WwPunchCardResData resData = webankPayUnit.webankWechatPunchCardPay(param);
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
        String token = "WLA0f-dGGlQHTVClazkxtmW6FX_nRhpUB01QpWs5MbZluhUy6rWiA44f33ZLN19LCQAtXeF_9VzFNbMTZpWYULITgA";
        webankPayUnit.alipayGetTicket(token);
    }

    @Test
    @Description("支付宝刷卡支付")
    public void alipayPunchCardPay() {
        init();
        WebankPayUnit webankPayUnit = new WebankPayUnit();
        WaPunchCardPayParam param = new WaPunchCardPayParam();
        param.setWbMerchantId("107100000000014");
        param.setAuthCode("288659374216425075");
        param.setTotalAmount(new BigDecimal("0.01").setScale(2));
        param.setOrderId(getOrderNO());
        param.setSubject("test");
        webankPayUnit.alipayPunchCardPay(param);
    }

    public static void init() {
        WebankConfigure configure = WebankConfigure.getInstance();
        if (StringUtils.isEmpty(configure.getKey())) {
            configure.setKey("123");
            configure.setWechatPunchCardPayUrl("https://test-svrapi.webank.com/l/wbap-bbfront/mao");
            configure.setWechatKeyStorePath("D:\\cert\\www.rongyi.com\\www.rongyi.com.p12");
            configure.setWechatTrustStorePath("D:\\Users\\sujuan\\webank-trust.jks");
            configure.setWechatKeyStorePwd("www.rongyi.com");

            configure.setAppId("W0000036");
            configure.setSecret("mJBdgcPLLRYvJzZYmtEz97ekHGZaoGLFallg6JjOXcptcw6xOtU6JceY15sQH8mb");
            configure.setAlipayGetTokenUrl("https://l.test-svrapi.webank.com/api/oauth2/access_token");
            configure.setAlipayGetTicketUrl("https://l.test-svrapi.webank.com/api/oauth2/api_ticket");
            configure.setTicket("KVM4KuR4JlpWduqXYS5OAemMY49Z5wLbYWim3B7WeUmHE5QFSd1xUukNY4shSiTe");

            configure.setAlipayPunchCardPayUrl("https://l.test-svrapi.webank.com/api/acq/server/alipay/pay");
        }
    }

    public static String getOrderNO() {
        Long orderNo = System.currentTimeMillis();
        return orderNo.toString();
    }

}

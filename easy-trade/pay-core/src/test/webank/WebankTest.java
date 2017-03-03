package webank;

import com.rongyi.pay.core.unit.WebankPayUnit;
import com.rongyi.pay.core.webank.config.WebankConfigure;
import com.rongyi.pay.core.webank.model.WwPunchCardResData;
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
    @Description("获取APP支付签名")
    public void wechatPunchCardPay(){
        init();
        WebankPayUnit webankPayUnit = new WebankPayUnit();
        WwPunchCardPayParam param = new WwPunchCardPayParam();
        param.setMerchantCode("107100000000014");
        param.setTerminalCode("web");
        param.setOrderNo(getOrderNO());
        param.setAmount(new BigDecimal(0.01));
        param.setProduct("测试");
        param.setAuthCode("3434343434343");
        System.out.println(param.getAmount().compareTo(new BigDecimal(0)));
        if (param.getAmount() != null && StringUtils.isNotEmpty(param.getAmount().toString()) && param.getAmount().compareTo(BigDecimal.ZERO) == 1) {
            System.out.println(".......");
        }
        WwPunchCardResData resData = webankPayUnit.webankWechatPunchCardPay(param);
        System.out.println(resData);
    }

    public static void init() {
        WebankConfigure configure = WebankConfigure.getInstance();
        if (StringUtils.isEmpty(configure.getKey())) {
            configure.setKey("123");
            configure.setWechatPunchCardPayUrl("https://test-svrapi.webank.com/1/wbap-bbfront/mao");
            configure.setWechatKeyStorePath("D:\\cert\\www.rongyi.com\\www.rongyi.com.p12");
            configure.setWechatTrustStorePath("D:\\cert\\www.rongyi.com\\webank_keystore.jks");
            configure.setWechatKeyStorePwd("www.rongyi.com");
        }
    }

    public static String getOrderNO() {
        Long orderNo = System.currentTimeMillis();
        return orderNo.toString();
    }

}

package tianyi;

import com.rongyi.pay.core.tianyi.config.TianyiConfigure;
import com.rongyi.pay.core.tianyi.param.PayDetailParam;
import com.rongyi.pay.core.tianyi.param.TianyiOrderParam;
import com.rongyi.pay.core.tianyi.param.TianyiParam;
import com.rongyi.pay.core.unit.TianyiPayUnit;
import com.sun.org.glassfish.gmbal.Description;
import org.junit.Test;

/**
 * Created by yangyang on 2017/4/10.
 */
public class TianyiTest {

    private static String ORDERSEQ="20160830092048436461232233124";
    private static String ORDERTRANSEQL="20160830092048436461232233124";
    private static String ORDERTIME="20160830092048";
    private static String ORDERVALIDITYTIME="20160830092048";

    @Test
    @Description("天翼支付")
    public void testTianyiPay(){
        init();
        TianyiParam param = new TianyiParam();
        TianyiOrderParam tianyiOrderParam =   getTianyiOrderParam();
        PayDetailParam payDetailParam =getPayDetailParam();
        param.setTianyiOrderParam(tianyiOrderParam);
        param.setPayDetailParam(payDetailParam);
        String s = TianyiPayUnit.tianyiPay(param);
        System.out.println("weburl="+s);

    }

    private PayDetailParam getPayDetailParam(){
        PayDetailParam payDetailParam = new PayDetailParam();
        payDetailParam.setService("mobile.securitypay.pay");
        payDetailParam.setMerchantId("02310103030380547");
        payDetailParam.setMerchantPwd("736685");
        payDetailParam.setSubmerchantId("");
        payDetailParam.setBeforeMerchantUrl("https://www.baidu.com");
        payDetailParam.setBackMerchantUrl("http://127.0.0.1:8080/wapBgNotice.action");
        payDetailParam.setSignType("MD5");
//        payDetailParam.setSign("");
        payDetailParam.setWapChannel("");
        payDetailParam.setUserLanguage("zh");
        payDetailParam.setRemark("");
        payDetailParam.setOrderSeq(ORDERSEQ);
        payDetailParam.setOrderReqTranseq(ORDERTRANSEQL);
        payDetailParam.setOrderTime(ORDERTIME);
        payDetailParam.setOrderValidityTime(ORDERVALIDITYTIME);
        payDetailParam.setOrderAmount("0.01");
        payDetailParam.setCurType("RMB");
        payDetailParam.setProductId("04");
        payDetailParam.setProductDesc("测试");
        payDetailParam.setSubject("测试");
        payDetailParam.setProductAmount("0.01");
        payDetailParam.setAttachAmount("0");
        payDetailParam.setAttach("");
        payDetailParam.setDivDetails("");
        payDetailParam.setAccountId("");
        payDetailParam.setCustomerId("011113120892181");
        payDetailParam.setUserIp("");
        payDetailParam.setBusiType("04");
        payDetailParam.setSwtichAcc("true");
        payDetailParam.setCityCode("");
        payDetailParam.setProvinceCode("");
        payDetailParam.setTid("");
        payDetailParam.setKey_index("");
        payDetailParam.setKey_tid("");
        return payDetailParam;
    }

    private TianyiOrderParam getTianyiOrderParam() {
        TianyiOrderParam tianyiOrderParam = new TianyiOrderParam();
        tianyiOrderParam.setMerchantId("02310103030380547");
        tianyiOrderParam.setSubMerchantId("");
        tianyiOrderParam.setKey("5C8014544E835D3BCE562AEFCD6F7C81AD9F9C067937BA7A");
        tianyiOrderParam.setOrderSeq(ORDERSEQ);
        tianyiOrderParam.setOrderReqTranseq(ORDERSEQ);
        tianyiOrderParam.setOrderReqTime(ORDERTIME);
        tianyiOrderParam.setTransCode("01");
        tianyiOrderParam.setOrderAmt("1");
        tianyiOrderParam.setOrderCcy("RMB");
        tianyiOrderParam.setServiceCode("05");
        tianyiOrderParam.setProductId("04");
        tianyiOrderParam.setProductDesc("测试");
        tianyiOrderParam.setLoginNo("");
        tianyiOrderParam.setProvinceCode("");
        tianyiOrderParam.setCityCode("");
        tianyiOrderParam.setDivDetails("");
        tianyiOrderParam.setEncodeType("1");
//        tianyiOrderParam.setMac("");
        tianyiOrderParam.setSessionKey("");
        tianyiOrderParam.setEncode("");
        tianyiOrderParam.setAccach("");
        tianyiOrderParam.setRequestSystem("1");
        tianyiOrderParam.setRiskControlInfo("风控提供");
        return tianyiOrderParam;
    }

    private void init() {
        TianyiConfigure configure = TianyiConfigure.getInstance();
        configure.setEnv("2");
        configure.setSwtichacc("true");
        configure.setBeforeBackUrl("https://www.baidu.com");
        configure.setBackMerchantUrl("http://127.0.0.1:8080/wapBgNotice.action");
        configure.setProductId("04");
        configure.setBusiType("04");
        configure.setUserLanguage("ch");
        configure.setRiskControlInfo("风控提供");
        configure.setOrderUrl("https://webpaywg.bestpay.com.cn/order.action");
        configure.setPublicKeyUrl("https://capi.bestpay.com.cn/common/interface");
        configure.setPayUrl("https://capi.bestpay.com.cn/geteway.pay");
        configure.setCheckStandH5Url("");
        configure.setPayQueryUrl("https://capi.bestpay.com.cn/query/queryOrder");
        configure.setRefundUrl("https://capi.bestpay.com.cn/refund/commonRefund");
        configure.setRefundBackUrl("");

    }
}

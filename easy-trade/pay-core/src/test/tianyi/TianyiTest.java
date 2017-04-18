package tianyi;

import com.rongyi.pay.core.tianyi.config.TianyiConfigure;
import com.rongyi.pay.core.tianyi.param.*;
import com.rongyi.pay.core.unit.TianyiPayUnit;
import com.sun.org.glassfish.gmbal.Description;
import net.sf.json.JSONObject;
import org.junit.Test;

import java.math.BigDecimal;

/**
 * Created by yangyang on 2017/4/10.
 */
public class TianyiTest {

    private static String ORDERSEQ="1041868855808152641";
    private static String ORDERTRANSEQL="0041889687808152648";
    private static String ORDERTIME="20170418032648";
    private static String ORDERVALIDITYTIME="20170418032648";
    private static String REFUNDREQNO="3049696233697232933";

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

    }

    @Test
    @Description("天翼支付查询")
    public void testTianyiTradeQuery(){
        init();
        PayQueryParam payQueryParam = new PayQueryParam();
        payQueryParam.setMerchantId("02310103030380547");
        payQueryParam.setOrderNo(ORDERSEQ);
        payQueryParam.setOrderReqNo(ORDERTRANSEQL);
        payQueryParam.setOrderDate("20170418");//取交易当天日期
        payQueryParam.setKey("5C8014544E835D3BCE562AEFCD6F7C81AD9F9C067937BA7A");
        TianyiTradeQueryRes tianyiTradeQueryRes = TianyiPayUnit.tradeQuery(payQueryParam);
        System.out.println("tianyiTradeQueryRes="+tianyiTradeQueryRes);
    }

    @Test
    @Description("翼支付退款")
    public void testTianyiTradeRefund(){
        init();
        RefundParam refundParam = new RefundParam();
        refundParam.setMerchantId("02310103030380547");
        refundParam.setSubMerchantId("");
        refundParam.setMerchantPwd("736685");
        refundParam.setOldOrderNo(ORDERSEQ);
        refundParam.setOldOrderReqNo(ORDERTRANSEQL);
        refundParam.setRefundReqNo(REFUNDREQNO);
        refundParam.setRefundReqDate("20160615");
        refundParam.setTransAmt("1");
        refundParam.setLedgerDetail("1");
        refundParam.setChannel("05");
        refundParam.setBgUrl("http://116.236.251.150:10096/easy-rpb/tianyi/refund/notify");
        refundParam.setKey("5C8014544E835D3BCE562AEFCD6F7C81AD9F9C067937BA7A");
        boolean result = TianyiPayUnit.tradeRefund(refundParam);
        System.out.println("tianyiTradeRefundRes="+result);
    }

    @Test
    public void testAmount(){
        String totalPrice = "0.10";
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("totalPrice","0.10");
        Integer totalAmount = new BigDecimal(jsonObject.getString("totalPrice")).multiply(new BigDecimal(100)).setScale(0, BigDecimal.ROUND_HALF_UP).intValue();
        System.out.println("result="+totalAmount);
    }

    @Test
    public void testZhengze(){

    }

    private PayDetailParam getPayDetailParam(){
        PayDetailParam payDetailParam = new PayDetailParam();
        payDetailParam.setService("mobile.securitypay.pay");
        payDetailParam.setMerchantId("02310103030380547");
        payDetailParam.setMerchantPwd("736685");
        payDetailParam.setSubmerchantId("");
        payDetailParam.setBeforeMerchantUrl("http://wx.dev4.rongyi.com/manage/front/card/paysuccess?id=041760311552163008&mall_id=58aec2a6821e776169314c6f&flag=1");
        payDetailParam.setBackMerchantUrl("http://127.0.0.1:8080/wapBgNotice.action");
        payDetailParam.setSignType("MD5");
//      payDetailParam.setSign("");
        payDetailParam.setWapChannel("");
        payDetailParam.setUserLanguage("zh");
        payDetailParam.setRemark("");
        payDetailParam.setOrderSeq(ORDERSEQ);
        payDetailParam.setOrderReqTranseq(ORDERTRANSEQL);
        payDetailParam.setOrderTime(ORDERTIME);
//        payDetailParam.setOrderValidityTime("");
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
        payDetailParam.setKey("5C8014544E835D3BCE562AEFCD6F7C81AD9F9C067937BA7A");
        return payDetailParam;
    }

    private TianyiOrderParam getTianyiOrderParam() {
        TianyiOrderParam tianyiOrderParam = new TianyiOrderParam();
        tianyiOrderParam.setMerchantId("02310103030380547");
        tianyiOrderParam.setSubMerchantId("");
        tianyiOrderParam.setKey("5C8014544E835D3BCE562AEFCD6F7C81AD9F9C067937BA7A");
        tianyiOrderParam.setOrderSeq(ORDERSEQ);
        tianyiOrderParam.setOrderReqTranseq(ORDERTRANSEQL);
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
        configure.setSwtichacc("true");
//        configure.setBeforeBackUrl("https://www.baidu.com");
        configure.setBackMerchantUrl("http://116.236.251.150:10096/easy-rpb/tianyi/h5pay/notify");
        configure.setProductId("04");
        configure.setBusiType("04");
        configure.setUserLanguage("ch");
        configure.setRiskControlInfo("风控提供");
        configure.setOrderUrl("https://webpaywg.bestpay.com.cn/order.action");
        configure.setPublicKeyUrl("https://capi.bestpay.com.cn/common/interface");
        configure.setPayUrl("https://capi.bestpay.com.cn/gateway.pay");
        configure.setCheckStandH5Url("");
        configure.setPayQueryUrl("https://webpaywg.bestpay.com.cn/query/queryOrder");
        configure.setRefundUrl("https://webpaywg.bestpay.com.cn/refund/commonRefund");
        configure.setRefundBackUrl("http://116.236.251.150:10096/easy-rpb/tianyi/refund/notify");

    }
}

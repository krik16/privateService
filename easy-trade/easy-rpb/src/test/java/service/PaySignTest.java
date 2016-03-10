package service;

import base.BaseTest;
import com.rongyi.core.common.util.DateUtil;
import com.rongyi.core.constant.PaymentEventType;
import com.rongyi.easy.mq.MessageEvent;
import com.rongyi.rpb.service.PaymentService;
import com.rongyi.rss.rpb.OrderNoGenService;
import net.sf.json.JSONObject;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Description;
import org.testng.annotations.Test;

import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

/**
 * kejun
 * 2016/3/10 10:14
 **/
public class PaySignTest extends BaseTest{

    @Autowired
    PaymentService paymentService;

    @Autowired
    OrderNoGenService orderNoGenService;

    @Test
    @Description("支付宝APP支付签名接口")
    public void testAliAppPay(){
        MessageEvent rpbEvent = getRpbEvent("osm", PaymentEventType.APP,null,null,null);
        Map<String, Object> map = paymentService.getSendMessage(rpbEvent);
        System.err.println("aliResult="+map);
        JSONObject jsonObject = (JSONObject)map.get("body");
        assert(StringUtils.isNotBlank(jsonObject.getString("zhifubaoSign")));
        assert (StringUtils.isNotBlank(jsonObject.getString("title")));
        assert (StringUtils.isNotBlank(jsonObject.getString("totlePrice")));
        assert(map.get("body").toString().contains("seller_id"));
        assert(map.get("body").toString().contains("sign"));
        assert(map.get("body").toString().contains("orderNum"));

    }

    @Test
    @Description("支付宝网页支付签名接口")
    public void testAliWebPay(){
        MessageEvent rpbEvent = getRpbEvent("osm", PaymentEventType.PAYMENT,null,null,null);
        Map<String, Object> map = paymentService.getSendMessage(rpbEvent);
        System.err.println("aliResult="+map);
        JSONObject jsonObject = (JSONObject)map.get("body");
        assert (StringUtils.isNotBlank(jsonObject.getString("sHtmlText")));
        assert(map.get("body").toString().contains("orderNum"));
        assert(map.get("body").toString().contains("request_token"));
        assert(map.get("body").toString().contains("alipaysubmit"));
    }

    @Test
    @Description("微信APP支付签名接口")
    public void testWeixinAppPay(){
        MessageEvent rpbEvent = getRpbEvent("osm", PaymentEventType.WEIXIN_PAY,null,null,0);
        Map<String, Object> map = paymentService.getSendMessage(rpbEvent);
        System.err.println("weixinResult="+map);
        JSONObject jsonObject = (JSONObject)map.get("body");
        assert(StringUtils.isNotBlank(jsonObject.getString("noncestr")));
        assert (StringUtils.isNotBlank(jsonObject.getString("partnerid")));
        assert (StringUtils.isNotBlank(jsonObject.getString("totlePrice")));
        assert (StringUtils.isNotBlank(jsonObject.getString("app_signature")));
        assert (StringUtils.isNotBlank(jsonObject.getString("prepayid")));
        assert (StringUtils.isNotBlank(jsonObject.getString("package")));
        assert (StringUtils.isNotBlank(jsonObject.getString("orderNum")));
        assert (StringUtils.isNotBlank(jsonObject.getString("appid")));
    }

    @Test
    @Description("微信公众支付签名接口")
    public void testWeixinPublicPay(){
        MessageEvent rpbEvent = getRpbEvent("osm", PaymentEventType.WEIXIN_PAY,"wx749527272cae4b9b","oljTBs38XyvzEv_o-4ot6Ca_ynSA",1);
        Map<String, Object> map = paymentService.getSendMessage(rpbEvent);
        System.err.println("weixinResult="+map);
        JSONObject jsonObject = (JSONObject)map.get("body");
        assert(StringUtils.isNotBlank(jsonObject.getString("appId")));
        assert (StringUtils.isNotBlank(jsonObject.getString("app_signature")));
        assert (StringUtils.isNotBlank(jsonObject.getString("signType")));
        assert (StringUtils.isNotBlank(jsonObject.getString("package")));
        assert (StringUtils.isNotBlank(jsonObject.getString("orderNum")));
        assert (StringUtils.isNotBlank(jsonObject.getString("nonceStr")));
    }

    public MessageEvent getRpbEvent(String soruce, String type,String appId,String openId,Integer weixinPayType) {
        MessageEvent event = new MessageEvent();
        Map<String, Object> bodyMap = new HashMap<>();
        bodyMap.put("orderNum",orderNoGenService.getOrderNo("4"));
        bodyMap.put("totalPrice","0.01");
        bodyMap.put("paymentId", orderNoGenService.getOrderNo("0"));
        String timeStart = DateUtil.dateToString(DateUtil.getCurrDateTime());
        String  timeExpire = DateUtil.dateToString(DateUtil.addTime(DateUtil.getCurrDateTime(), 30, Calendar.MINUTE));
        bodyMap.put("timeStart",timeStart);
        bodyMap.put("timeExpire",timeExpire);
        bodyMap.put("appId",appId);
        bodyMap.put("openId",openId);
        bodyMap.put("weixinPayType",weixinPayType);
        bodyMap.put("title","test");
        event.setBody(JSONObject.fromObject(bodyMap));
        event.setSource(soruce);
        event.setTarget("rpb");
        event.setTimestamp(Long.valueOf("1428565002336"));
        event.setType(type);
        return event;
    }
}

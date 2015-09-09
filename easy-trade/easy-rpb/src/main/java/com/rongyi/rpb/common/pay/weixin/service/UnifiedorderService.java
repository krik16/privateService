/**
 * @Copyright (C),上海容易网电子商务有限公司	
 * @Author: 柯军 
 * @datetime:2015年9月2日上午10:39:20
 * @Description: TODO
 *
 **/

package com.rongyi.rpb.common.pay.weixin.service;

import java.util.HashMap;
import java.util.Map;

import com.rongyi.rpb.common.pay.weixin.model.UnifedOrderReqData;
import com.rongyi.rpb.common.pay.weixin.util.Configure;
import com.rongyi.rpb.common.pay.weixin.util.XMLParser;
import com.rongyi.rpb.constants.ConstantUtil;

/**
 * @Author: 柯军
 * @Description: 统一下单接口服务
 * @datetime:2015年9月2日上午10:39:20
 * 
 **/

public class UnifiedorderService extends BaseService{
	
    public UnifiedorderService() throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        super(Configure.UNIFIED_ORDER_API);
    }

    /**
     * 请求支付服务
     * @param unifedOrderReqData 这个数据对象里面包含了API要求提交的各种数据字段
     * @return API返回的数据
     * @throws Exception
     */
    public String request(UnifedOrderReqData unifedOrderReqData) throws Exception {

        //--------------------------------------------------------------------
        //发送HTTPS的Post请求到API地址
        //--------------------------------------------------------------------
        String responseString = sendPost(unifedOrderReqData);
        return responseString;
    }

	/**	
	 * @Description: 获取微信支付签名 
	 * @param payNo
	 * @param totalFee
	 * @param body
	 * @return	
	 * @Author:  柯军
	 * @datetime:2015年9月2日下午1:32:08
	 **/
	public Map<String,Object> getAppWeXinSign(String payNo, Integer totalFee, String body) {
		Map<String,Object> map = new HashMap<String,Object>();
		UnifedOrderReqData unifedOrderReqData = new UnifedOrderReqData(body,payNo, totalFee,ConstantUtil.PayWeiXin_V3.WEIXIN_NOTIFY_URL,ConstantUtil.PayWeiXin_V3.TRADE_TYPE);
		try {
			 String result = request(unifedOrderReqData);
			Map<String,Object> resultMap = XMLParser.getMapFromXML(result);
			if(resultMap != null){
				map.put("app_signature", resultMap.get("sign"));
				map.put("prepayid", resultMap.get("prepay_id"));
				map.put("noncestr", resultMap.get("nonce_str"));
			}
			 System.err.println(map.toString()); 
		} catch (Exception e) {
			e.printStackTrace();
		}
		return map;
	}
}

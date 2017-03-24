package com.rongyi.pay.core.webank.util;

import com.google.gson.Gson;
import com.rongyi.pay.core.Exception.WebankException;
import com.rongyi.pay.core.constants.ConstantEnum;
import com.rongyi.pay.core.webank.model.Result;
import com.rongyi.pay.core.webank.model.WwPunchCardResData;
import net.sf.json.JSONObject;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

/**
 * 基础工具类
 * Created by sujuan on 2017/2/22.
 */
public class Util {

    /**
     * 将json字符串转换成object
     * @param jsonStr
     * @return
     */
    public static Object getObjectFromString(String jsonStr,Class t) {
        Object obj;
        try {
            Gson gson = new Gson();
            obj = gson.fromJson(jsonStr, t);
//            JSONObject jsonObject = JSONObject.fromObject(jsonStr);
//            obj = jsonObject.toBean(jsonObject, t);
        } catch (Exception e) {
            e.printStackTrace();
            throw new WebankException(ConstantEnum.EXCEPTION_WEBANK_RES_FAIL);
        }
        return obj;
    }

    /**
     * 将xml字符串转换成object
     * @param xmlStr xml字符串
     * @param t bean class
     * @return object对象
     */
    public static Object getObjectFromXmlStr(String xmlStr, Class t){
        Object obj ;
        try {
            Gson gson = new Gson();
            Map<String, Object> map = getMapFromXML(xmlStr);
            String jsonStr =  gson.toJson(map);
            obj =getObjectFromString(jsonStr, t);
        } catch  (Exception e) {
            e.printStackTrace();
            throw new WebankException(ConstantEnum.EXCEPTION_WEBANK_RES_FAIL);
        }
        return obj;
    }

    /**
     * xml格式转换成MAP
     * @param xmlString xml字符串
     * @return map
     * @throws ParserConfigurationException
     * @throws IOException
     * @throws SAXException
     */
    public static Map<String,Object> getMapFromXML(String xmlString) throws ParserConfigurationException, IOException, SAXException {
        //这里用Dom的方式解析回包的最主要目的是防止API新增回包字段
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        InputStream is =  com.rongyi.pay.core.wechat.util.Util.getStringStream(xmlString);
        Document document = builder.parse(is);

        //获取到document里面的全部结点
        NodeList allNodes = document.getFirstChild().getChildNodes();
        Node node;
        Map<String, Object> map = new HashMap<String, Object>();
        int i=0;
        while (i < allNodes.getLength()) {
            node = allNodes.item(i);
            if(node instanceof Element){
                map.put(node.getNodeName(),node.getTextContent());
            }
            i++;
        }
        return map;
    }

    public static void main(String args[]) {
        WwPunchCardResData cardResData = new WwPunchCardResData();
        cardResData.setSign("asdfafdsff");
        cardResData.setBank_type("999");
        cardResData.setFee_type("dfdfd");
        cardResData.setOpenid("dfdfdfdfdfdf");
        cardResData.setOrderid("335435454");
        Result result = new Result();
        result.setErrmsg("SUCCESS");
        result.setErrno("1");
        cardResData.setResult(result);
        JSONObject object = JSONObject.fromObject(cardResData);
        String str = object.toString();
        System.out.println(str);
        WwPunchCardResData obj  =(WwPunchCardResData) getObjectFromString("",WwPunchCardResData.class);
        System.out.println(obj);
    }
}

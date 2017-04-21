package com.rongyi.pay.core.webank.util;

import com.google.gson.Gson;
import com.rongyi.pay.core.Exception.WebankException;
import com.rongyi.pay.core.constants.ConstantEnum;
import com.rongyi.pay.core.webank.model.Result;
import com.rongyi.pay.core.webank.model.WwPunchCardResData;
import net.sf.json.JSONObject;
import org.apache.commons.collections.set.MapBackedSet;
import org.jdom.Namespace;
import org.jdom.input.SAXBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringReader;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
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
            Map<String, Object> map = getMapFromXml(xmlStr);
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

    public static Map<String,Object> getMapFromXml(String xmlString){
        Map entity = new HashMap();
        try {
            // 创建一个新的字符串
            StringReader read = new StringReader(xmlString);
            // 创建新的输入源SAX 解析器将使用 InputSource 对象来确定如何读取 XML 输入
            InputSource source = new InputSource(read);
            // 创建一个新的SAXBuilder
            SAXBuilder sb = new SAXBuilder();
            // 通过输入源构造一个Document
            org.jdom.Document doc = sb.build(source);
            // 取的根元素
            org.jdom.Element root = doc.getRootElement();
            // System.out.println(root.getName());//输出根元素的名称（测试）
            // 得到根元素所有子元素的集合
            List jiedian = root.getChildren();
            // 获得XML中的命名空间（XML中未定义可不写）
            Namespace ns = root.getNamespace();
            org.jdom.Element et = null;

            for (int i = 0; i < jiedian.size(); i++) {
                et = (org.jdom.Element) jiedian.get(i);// 循环依次得到子元素
                entity.put(et.getName(), et.getText());
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        return entity;
    }

    public static void main(String args[]) {
        String xmlStr = "<xml><appid>wx90bfe8ac7aa1338a</appid><version>2.0</version><charset>UTF-8</charset><sign_type>MD5</sign_type><status>1</status><message>签名不匹配</message></xml>";
        Map<String, Object> map = getMapFromXml(xmlStr);
        System.out.println(map);
    }
}

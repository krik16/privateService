package com.rongyi.core.util.soap;

import javax.xml.soap.*;
import java.io.ByteArrayInputStream;
import java.util.Iterator;

/*
 * Description:  
 * Author: yuzhijian 
 * History: 变更记录
 * <Author>     <time>    <version>    <desc>
 * 俞志坚       2017/3/13    1.0        创建文件 
 * Copyright (C): 上海容易网电子商务股份有限公司
 */
public class SoapXmlUtil {

    /**
     * 解析soapXML
     * @param soapXML
     * @return
     */
    public static String parseSoapMessage(String soapXML) {
        String str="";
        try {
            SOAPMessage msg = formatSoapString(soapXML);
            SOAPBody body = msg.getSOAPBody();
            Iterator<SOAPElement> iterator = body.getChildElements();
            while (iterator.hasNext()) {
                SOAPElement element = (SOAPElement) iterator.next();
                if(element.getFirstChild().getNodeName().equals("return")){
                    str=element.getFirstChild().getFirstChild().getNodeValue();
                    break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return str;
    }


    /**
     * 把soap字符串格式化为SOAPMessage
     *
     * @param soapString
     * @return
     * @see [类、类#方法、类#成员]
     */
    private static SOAPMessage formatSoapString(String soapString) {
        MessageFactory msgFactory;
        try {
            msgFactory = MessageFactory.newInstance();
            SOAPMessage reqMsg = msgFactory.createMessage(new MimeHeaders(),
                    new ByteArrayInputStream(soapString.getBytes("UTF-8")));
            reqMsg.saveChanges();
            return reqMsg;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}

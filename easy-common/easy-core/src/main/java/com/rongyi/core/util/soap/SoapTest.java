package com.rongyi.core.util.soap;

import org.apache.commons.lang.StringUtils;
import sun.misc.BASE64Decoder;

import java.io.IOException;
import java.net.URL;

/*
 * Description:  
 * Author: yuzhijian 
 * History: 变更记录
 * <Author>     <time>    <version>    <desc>
 * 俞志坚       2017/3/13    1.0        创建文件 
 * Copyright (C): 上海容易网电子商务股份有限公司
 */
public class SoapTest {

    public static void main(String  ...args) {

        //测试功能
        try {
            SoapTest soapTest = new SoapTest();

            //获取店铺
            soapTest.getShopInfo();

            //获取分类
            soapTest.getCategory();
        } catch (Exception e) {
        }

    }

    //下载分类信息
    public void getCategory(){
        try {
            SoapTest soapTest = new SoapTest();
            //请求体
            String soap = "<soapenv:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:urn=\"urn:HsNavWebSrvIntf-IHsNavWebSrv\">\n" +
                    "   <soapenv:Header/>\n" +
                    "   <soapenv:Body>\n" +
                    "      <urn:INavOperateIntf soapenv:encodingStyle=\"http://schemas.xmlsoap.org/soap/encoding/\">\n" +
                    "         <psOperateTypeCode xsi:type=\"xsd:int\">2025</psOperateTypeCode>\n" +
                    "         <psDataType xsi:type=\"xsd:string\">0</psDataType>\n" +
                    "         <psXMLData xsi:type=\"xsd:string\">\n" +
                    "         <IMPORTDATA>\n" +
                    "        <OPERATION>1</OPERATION>\n" +
                    "        </IMPORTDATA>\n" +
                    "         </psXMLData>\n" +
                    "      </urn:INavOperateIntf>\n" +
                    "   </soapenv:Body>\n" +
                    "</soapenv:Envelope>";
            URL wsUrl = new URL("http://192.168.1.218:8080/HsNavWebSrv.dll/soap/IHsNavWebSrv?psOperateTypeCode=2025");
            String result = SoapClientUtil.post(soap, wsUrl);
            String ss = SoapXmlUtil.parseSoapMessage(result);

            System.out.println("下载分类信息:====" + soapTest.decode(ss));
        } catch (Exception e) {
        }

    }



    /**
     * 获取店信息
     */
    public  void getShopInfo(){

        try {
            SoapTest soapTest = new SoapTest();
        //请求体
        String soap = "<soapenv:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:urn=\"urn:HsNavWebSrvIntf-IHsNavWebSrv\">" +
                "   <soapenv:Header/>" +
                "   <soapenv:Body>" +
                "      <urn:INavOperateIntf soapenv:encodingStyle=\"http://schemas.xmlsoap.org/soap/encoding/\">" +
                "         <psOperateTypeCode xsi:type=\"xsd:int\">2001</psOperateTypeCode>" +
                "         <psDataType xsi:type=\"xsd:string\">0</psDataType>" +
                "         <psXMLData xsi:type=\"xsd:string\">" +
                "         <IMPORTDATA>" +
                "         <OPERATION>1</OPERATION>" +
                "         </IMPORTDATA>" +
                "         </psXMLData>" +
                "      </urn:INavOperateIntf>" +
                "   </soapenv:Body>" +
                "</soapenv:Envelope>";
        URL wsUrl = new URL("http://192.168.1.218:8080/HsNavWebSrv.dll/soap/IHsNavWebSrv?psOperateTypeCode=2001");
        String result = SoapClientUtil.post(soap, wsUrl);
        String ss = SoapXmlUtil.parseSoapMessage(result);

        System.out.println("下载店铺信息:====" + soapTest.decode(ss));
        } catch (Exception e) {
        }
    }

    /**
     * 解码 转码
     * @param str
     * @return
     */
    public String decode(String str){
        byte[] bt = null;
        String strResult="";
        try {
            if(StringUtils.isNotBlank(str)) {
                BASE64Decoder decoder = new  BASE64Decoder();
                bt = decoder.decodeBuffer(new String(str));
               /* System.out.println("11==="+new String(bt));

                System.out.println("gbk to UTF-8==="+new String(new String(bt).getBytes("gbk"), "UTF-8"));
                System.out.println("gbk=="+new String(bt,"gbk"));
                strResult= new String(bt,"UTF-8");
                System.out.println("UTF-8=="+strResult);
                System.out.println("UTF-8 to gbk ==="+new String(new String(bt).getBytes("UTF-8"), "gbk"));
*/
                //strResult= new String(strResult.getBytes("GBK"), "UTF-8");
                strResult= new String(bt,"gbk");
                return strResult;
            }
            return strResult;
        } catch (IOException e) {
            e.printStackTrace();
            return strResult;
        }
    }




}




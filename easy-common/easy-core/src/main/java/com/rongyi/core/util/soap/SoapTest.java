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
            //soapTest.getShopInfo();

            //获取分类
            //soapTest.getCategory();

            //品牌

            //soapTest.getBrand();

            //实时 商品信息
            soapTest.getmcmc();

            //订单
            //soapTest.sumbitOrder();
        } catch (Exception e) {
        }

    }



    public void sumbitOrder(){
        try {
            SoapTest soapTest = new SoapTest();
            //请求体
            String soap = "<soapenv:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:urn=\"urn:HsNavWebSrvIntf-IHsNavWebSrv\">\n" +
                    "   <soapenv:Header/>\n" +
                    "   <soapenv:Body>\n" +
                    "      <urn:INavOperateIntf soapenv:encodingStyle=\"http://schemas.xmlsoap.org/soap/encoding/\">\n" +
                    "         <psOperateTypeCode xsi:type=\"xsd:int\">2018</psOperateTypeCode>\n" +
                    "         <psDataType xsi:type=\"xsd:string\">0</psDataType>\n" +
                    "         <psXMLData xsi:type=\"xsd:string\">\n" +
                    "        <IMPORTDATA>\n" +
                    "    <OPERATION>1</OPERATION>\n" +
                    "    <BILLHEAD>\n" +
                    "        <BILLNO>1</BILLNO>\n" +
                    "        <ORGCODE>001</ORGCODE>\n" +
                    "        <PLACE>1</PLACE>\n" +
                    "        <PFCUSTCODE>1</PFCUSTCODE>\n" +
                    "        <CUSTNAME>1</CUSTNAME>\n" +
                    "        <CUSTPHONE>15821658716</CUSTPHONE>\n" +
                    "        <CUSTADDR>1</CUSTADDR>\n" +
                    "        <DEPCODE>001</DEPCODE>\n" +
                    "        <DATA>2017-03-14</DATA>\n" +
                    "        <TIME>14:11:33</TIME>\n" +
                    "        <STAFFCODE>001002005</STAFFCODE>\n" +
                    "        <REMARK>1</REMARK>\n" +
                    "    </BILLHEAD>\n" +
                    "    <BILLBODY>\n" +
                    "        <PLUDATA>\n" +
                    "            <BILLNO>1</BILLNO>\n" +
                    "            <SERIALNO>1</SERIALNO>\n" +
                    "            <PLUCODE>1</PLUCODE>\n" +
                    "            <PLUNAME>1</PLUNAME>\n" +
                    "            <PFCOUNT>1</PFCOUNT>\n" +
                    "            <PFPRICE>1</PFPRICE>\n" +
                    "            <BARCODE>1</BARCODE>\n" +
                    "        </PLUDATA>      \n" +
                    "    </BILLBODY>\n" +
                    "   </IMPORTDATA>\n" +
                    "         </psXMLData>\n" +
                    "      </urn:INavOperateIntf>\n" +
                    "   </soapenv:Body>\n" +
                    "</soapenv:Envelope>";
            URL wsUrl = new URL("http://192.168.1.218:8080/HsNavWebSrv.dll/soap/IHsNavWebSrv?psOperateTypeCode=2018");
            String result = SoapClientUtil.post(soap, wsUrl);
            String ss = SoapXmlUtil.parseSoapMessage(result);

            System.out.println("订单信息信息:====" + soapTest.decode(ss));
        } catch (Exception e) {
        }

    }








    //商品信息
    public void getmcmc(){
        try {
            SoapTest soapTest = new SoapTest();
            //请求体
            String soap = "<soapenv:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:urn=\"urn:HsNavWebSrvIntf-IHsNavWebSrv\">\n" +
                    "   <soapenv:Header/>\n" +
                    "   <soapenv:Body>\n" +
                    "      <urn:INavOperateIntf soapenv:encodingStyle=\"http://schemas.xmlsoap.org/soap/encoding/\">\n" +
                    "         <psOperateTypeCode xsi:type=\"xsd:int\">2006</psOperateTypeCode>\n" +
                    "         <psDataType xsi:type=\"xsd:string\">0</psDataType>\n" +
                    "         <psXMLData xsi:type=\"xsd:string\">\n" +
                    "         <IMPORTDATA>\n" +
                    "        <OPERATION>1</OPERATION>\n" +
                    "        <ORGCODE>001</ORGCODE>\n" +
                    "         <BARCODE>0801006</BARCODE>\n" +
                    "        </IMPORTDATA>\n" +
                    "         </psXMLData>\n" +
                    "      </urn:INavOperateIntf>\n" +
                    "   </soapenv:Body>\n" +
                    "</soapenv:Envelope>";
            URL wsUrl = new URL("http://192.168.1.218:8080/HsNavWebSrv.dll/soap/IHsNavWebSrv?psOperateTypeCode=2006");
            String result = SoapClientUtil.post(soap, wsUrl);
            String ss = SoapXmlUtil.parseSoapMessage(result);

            System.out.println("商品实时信息:====" + soapTest.decode(ss));
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



    //下载分类信息
    public void getBrand(){
        try {
            SoapTest soapTest = new SoapTest();
            //请求体
            String soap = "<soapenv:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:urn=\"urn:HsNavWebSrvIntf-IHsNavWebSrv\">\n" +
                    "   <soapenv:Header/>\n" +
                    "   <soapenv:Body>\n" +
                    "      <urn:INavOperateIntf soapenv:encodingStyle=\"http://schemas.xmlsoap.org/soap/encoding/\">\n" +
                    "         <psOperateTypeCode xsi:type=\"xsd:int\">2026</psOperateTypeCode>\n" +
                    "         <psDataType xsi:type=\"xsd:string\">0</psDataType>\n" +
                    "         <psXMLData xsi:type=\"xsd:string\">\n" +
                    "         <IMPORTDATA>\n" +
                    "        <OPERATION>1</OPERATION>\n" +
                    "        </IMPORTDATA>\n" +
                    "         </psXMLData>\n" +
                    "      </urn:INavOperateIntf>\n" +
                    "   </soapenv:Body>\n" +
                    "</soapenv:Envelope>";
            URL wsUrl = new URL("http://192.168.1.218:8080/HsNavWebSrv.dll/soap/IHsNavWebSrv?psOperateTypeCode=2026");
            String result = SoapClientUtil.post(soap, wsUrl);
            String ss = SoapXmlUtil.parseSoapMessage(result);

            System.out.println("下载品牌信息:====" + soapTest.decode(ss));
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




package com.rongyi.core.util.soap;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

/*
 * Description:  
 * Author: yuzhijian 
 * History: 变更记录
 * <Author>     <time>    <version>    <desc>
 * 俞志坚       2017/3/13    1.0        创建文件 
 * Copyright (C): 上海容易网电子商务股份有限公司
 */
public class SoapClientUtil {



    public static String post(String paramXml, URL url)
            throws Exception {
        long date = System.currentTimeMillis();
        // 如果有目录则加上目录,没有目录就是在根目录下
        //logger.debug("xmlReqeust:" + paramXml);
        HttpURLConnection httpConn = (HttpURLConnection) url.openConnection();
        byte[] buf = paramXml.getBytes();
        httpConn.setRequestProperty("Content-Length", String.valueOf(buf.length));
        httpConn.setRequestProperty("Content-Type", "text/xml; charset=utf-8");
        httpConn.setRequestMethod("POST");
        httpConn.setDoOutput(true);
        httpConn.setDoInput(true);
        OutputStream out = httpConn.getOutputStream();
        out.write(buf);
        out.close();
        byte[] datas = readInputStream(httpConn.getInputStream());
        String result = new String(datas);
        httpConn.disconnect();
       // System.out.println("result:" + result);
        return result;
    }



    /**
     * 从输入流中读取数据
     *
     * @param inStream
     * @return
     * @throws Exception
     */
    public static byte[] readInputStream(InputStream inStream) throws Exception {
        ByteArrayOutputStream outStream = new ByteArrayOutputStream();
        byte[] buffer = new byte[1024];
        int len = 0;
        while ((len = inStream.read(buffer)) != -1) {
            outStream.write(buffer, 0, len);
        }
        byte[] data = outStream.toByteArray();// 网页的二进制数据
        outStream.close();
        inStream.close();
        return data;
    }
}

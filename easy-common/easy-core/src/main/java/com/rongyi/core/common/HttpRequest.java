package com.rongyi.core.common;

import org.apache.http.HttpEntity;
import org.apache.http.HttpStatus;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;


/**
 * http请求
 *
 * @author wangjh7
 * @date 2016-04-23
 */
public class HttpRequest {

    private final static Logger logger = LoggerFactory.getLogger(HttpRequest.class);

    public final static String DEFAULT_CHARSET_UTF8 = "UTF-8";
    public final static String DEFAULT_CHARSET_GBK = "GBK";

    /**
     * 发送 GET 请求（HTTP）
     *
     * @param url
     * @return
     */
    public static String get(String url) {
        return get(url, DEFAULT_CHARSET_UTF8);
    }

    /**
     * 发送 GET 请求（HTTP）
     *
     * @param url     URL
     * @param charset 编码
     * @return HTML
     * @author wangjh7
     * @ti 2016-04-26
     */
    public static String get(String url, String charset) {
        StringBuilder sb = new StringBuilder();
        HttpGet httpGet = null;
        try {
            httpGet = new HttpGet(url);
            CloseableHttpResponse response = getClient(url).execute(httpGet);
            int statusCode = response.getStatusLine().getStatusCode();
            HttpEntity entity = response.getEntity();
            if (entity != null) {
                if (HttpStatus.SC_OK == statusCode) {
                    BufferedReader rd = new BufferedReader(
                            new InputStreamReader(response.getEntity().getContent(), charset));
                    String line = "";
                    while (null != (line = rd.readLine())) {
                        sb.append(line);
                        sb.append("\n");
                    }
                }
            }
        } catch (IOException e) {
            logger.error("~GET请求出错,URL={},ERRROR = {}：~", url, e);
            return "";
        } finally {
            if (null != httpGet) {
                httpGet.releaseConnection();
            }
        }
        return sb.toString();
    }


    /**
     * 获取不同的CLIENT
     *
     * @param url
     * @return
     */
    private static synchronized CloseableHttpClient getClient(String url) {
        CloseableHttpClient httpClient = HttpClients.createDefault();
        return httpClient;
    }
}

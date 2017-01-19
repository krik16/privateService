package com.rongyi.core.common;

import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpStatus;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;


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
     * POST请求
     *
     * @param url 请求URL地址
     * @param map POST数据
     * @return
     */
    public static String post(String url, Map<String, String> map) {
        StringBuilder sb = new StringBuilder();
        HttpPost httpPost = null;
        try {
            httpPost = new HttpPost(url);
            if (null != map) {
                List<NameValuePair> pairList = new ArrayList<NameValuePair>(map.size());
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    NameValuePair pair = new BasicNameValuePair(entry.getKey(), entry.getValue());
                    pairList.add(pair);
                }
                httpPost.setEntity(new UrlEncodedFormEntity(pairList, Charset.forName(DEFAULT_CHARSET_UTF8)));
            }

            CloseableHttpResponse response = getClient(url).execute(httpPost);
            int statusCode = response.getStatusLine().getStatusCode();
            if (HttpStatus.SC_OK == statusCode) {
                HttpEntity resEntity = response.getEntity();
                if (resEntity != null) {
                    return EntityUtils.toString(resEntity, DEFAULT_CHARSET_UTF8);
                }
            } else if (HttpStatus.SC_MOVED_PERMANENTLY == statusCode || HttpStatus.SC_MOVED_TEMPORARILY == statusCode) {
                // 处理http返回码301\302的情况
                // 从头中取出转向的地址
                Header locationHeader = response.getLastHeader("location");
                String location = null;
                if (locationHeader != null) {
                    location = locationHeader.getValue();
                    return post(location, map);// 用跳转后的页面重新请求。
                } else {
                    System.err.println("Location field value is null.");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            return "-1";
        } finally {
            if (null != httpPost) {
                httpPost.releaseConnection();
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

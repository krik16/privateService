package com.rongyi.rpb.common.pay.util;

import net.sf.json.JSONObject;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;
import java.util.Map.Entry;


/**
 * http 服务
 */
public class HttpUtil {
	private static Logger	logger = LoggerFactory.getLogger(HttpUtil.class);


	public static String httpGET(String url) {
		URL u;
		HttpURLConnection con = null;
		logger.info("send_url:" + url);
		try {
			u = new URL(url);
			con = (HttpURLConnection) u.openConnection();
			con.setRequestMethod("GET");
			con.setDoOutput(true);
			con.setDoInput(true);
			con.setUseCaches(false);
			con.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
		} catch (Exception e) {
			e.printStackTrace();
			logger.info("http请求报错哦！");
		} finally {
			if (con != null) {
				con.disconnect();
			}
		}
		StringBuilder buffer = new StringBuilder();
		try {
			assert con != null;
			BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream(), "UTF-8"));
			String temp;
			while ((temp = br.readLine()) != null) {
				buffer.append(temp);
			}
		} catch (Exception e) {
			e.printStackTrace();
			logger.info("http请求报错哦！");
		}
		return buffer.toString();
	}

	public static String httpPOST(String url, Map<String, Object> params) {
		URL u;
		HttpURLConnection con = null;
		StringBuilder sb = new StringBuilder();
		String param = "";
		if (params != null) {
			for (Entry<String, Object> e : params.entrySet()) {
				sb.append(e.getKey());
				sb.append("=");
				sb.append(e.getValue());
				sb.append("&");
			}
			param = sb.substring(0, sb.length() - 1);
		}
		logger.info("send_url:" + url);
		logger.info("send_data:" + param);
		try {
			u = new URL(url);
			con = (HttpURLConnection) u.openConnection();

			con.setRequestMethod("POST");
			con.setDoOutput(true);
			con.setDoInput(true);
			con.setUseCaches(false);
			con.setConnectTimeout(20000);
			con.setReadTimeout(30000);
			con.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
			OutputStreamWriter osw = new OutputStreamWriter(con.getOutputStream(), "UTF-8");
			osw.write(param);
			osw.flush();
			osw.close();
		} catch (Exception e) {
			e.printStackTrace();
			logger.info("http请求报错哦！");
		} finally {
			if (con != null) {
				con.disconnect();
			}
		}

		StringBuilder buffer = new StringBuilder();
		try {
			assert con != null;
			BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream(), "UTF-8"));
			String temp;
			while ((temp = br.readLine()) != null) {
				buffer.append(temp);
			}
		} catch (Exception e) {
			e.printStackTrace();
			logger.info("http请求报错哦！");
		}
		return buffer.toString();
	}

	/**
	 * post请求，传输json格式的参数
	 */
	public static String httpPOSTJson(String url, Map<String, String> params) {
        URL u;
        HttpURLConnection con = null;
        StringBuilder sb = new StringBuilder();
        String param = "";
        if (params != null) {
            for (Entry<String, String> e : params.entrySet()) {
                sb.append(e.getValue());
                sb.append("&");
            }
            param = sb.substring(0, sb.length() - 1);
        }
        logger.info("send_url:" + url);
        logger.info("send_data:" + param);
        try {
            u = new URL(url);
            con = (HttpURLConnection) u.openConnection();

            con.setRequestMethod("POST");
            con.setDoOutput(true);
            con.setDoInput(true);
            con.setUseCaches(false);
            con.setRequestProperty("Content-Type", "application/json");
            OutputStreamWriter osw = new OutputStreamWriter(con.getOutputStream(), "UTF-8");
            osw.write(param);
            osw.flush();
            osw.close();
        } catch (Exception e) {
            e.printStackTrace();
            logger.info("http请求报错哦！");
        } finally {
            if (con != null) {
                con.disconnect();
            }
        }

        StringBuilder buffer = new StringBuilder();
        try {
			assert con != null;
			BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream(), "UTF-8"));
            String temp;
            while ((temp = br.readLine()) != null) {
                buffer.append(temp);
            }
        } catch (Exception e) {
            e.printStackTrace();
            logger.info("http请求报错哦！");
        }
        return buffer.toString();
    }

	public static String httpPostWithJSON(String url, JSONObject jsonObject) {

        HttpPost httpPost = new HttpPost(url);
        CloseableHttpClient client = HttpClients.createDefault();
        String respContent = null;

//        json方式
        StringEntity entity = new StringEntity(jsonObject.toString(),"utf-8");//解决中文乱码问题
        entity.setContentEncoding("UTF-8");
        entity.setContentType("application/json");
        httpPost.setEntity(entity);
        System.out.println();

        HttpResponse resp;
		try {
			resp = client.execute(httpPost);
			 if(resp.getStatusLine().getStatusCode() == 200) {
	            HttpEntity he = resp.getEntity();
	            respContent = EntityUtils.toString(he,"UTF-8");
	        }
		} catch (IOException e) {
			e.printStackTrace();
		}
        return respContent;
    }

}
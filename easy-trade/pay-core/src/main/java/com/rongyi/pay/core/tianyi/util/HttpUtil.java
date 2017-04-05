package com.rongyi.pay.core.tianyi.util;

import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;

/**
 * Created by yangyang on 2017/4/5.
 */
public class HttpUtil {

    public static String sendHttpRequest(String ENV_URL, String requestBody) throws IOException {
        HttpPost httpPost = new HttpPost(ENV_URL);
        httpPost.addHeader("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8");
        StringEntity se = new StringEntity(requestBody, "UTF-8");
        httpPost.setEntity(se);
        HttpResponse httpResponse = HttpClients.createDefault().execute(httpPost);
        return EntityUtils.toString(httpResponse.getEntity(), "UTF-8");
    }

    public static String doPost(String url,String jsonStr) throws IOException {
        HttpPost post = new HttpPost(url);
        String result="";
        StringEntity se = new StringEntity(jsonStr);
        se.setContentEncoding("UTF-8");
        se.setContentType("application/json");//发送json数据需要设置contentType
        post.setEntity(se);
        org.apache.http.HttpResponse res = HttpClients.createDefault().execute(post);
        if(res.getStatusLine().getStatusCode() == HttpStatus.SC_OK){
            result = EntityUtils.toString(res.getEntity());// 返回json格式：
        }
        return result;
    }
}

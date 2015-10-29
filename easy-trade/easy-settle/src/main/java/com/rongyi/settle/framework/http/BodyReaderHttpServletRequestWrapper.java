package com.rongyi.settle.framework.http;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.servlet.ServletInputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;


/**
 * 解决ajax请求getReader()和getInputStream()方法只能读取一次的问题
 * @author baodk
 */
public class BodyReaderHttpServletRequestWrapper extends HttpServletRequestWrapper{

    private byte[] body;
    
    public BodyReaderHttpServletRequestWrapper(HttpServletRequest request) {
        super(request);
        this.getRequestPayload(request);
    }
    
    @Override
    public BufferedReader getReader() throws IOException {
        return new BufferedReader(new InputStreamReader(getInputStream())); 
    }
    
    @Override
    public ServletInputStream getInputStream() throws IOException {
        final ByteArrayInputStream bais = new ByteArrayInputStream(body);  
        return new ServletInputStream() {  
            @Override  
            public int read() throws IOException {  
                return bais.read();  
            }  
        };  
    }
    
    private void getRequestPayload(HttpServletRequest request){
        StringBuilder sb = new StringBuilder();
        try {
            request.setCharacterEncoding("UTF-8");  
            BufferedReader reader = request.getReader();
            char[] buff = new char[1024];
            int len;
            while((len = reader.read(buff)) != -1) {
                sb.append(buff,0, len);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        body = sb.toString().getBytes();
    }
}

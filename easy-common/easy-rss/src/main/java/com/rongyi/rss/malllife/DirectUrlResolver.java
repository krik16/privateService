package com.rongyi.rss.malllife;
import javax.servlet.http.HttpServletRequest;

/** 
 * Created by IntelliJ IDEA. 
 * User: Zhong Gang 
 * Date: 12-11-9 
 * Time: 下午7:11 
 */  
public interface DirectUrlResolver {  
  
    boolean support(HttpServletRequest request);  
  
    String directUrl();  
}  
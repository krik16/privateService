package com.rongyi.rss.malllife;

import org.springframework.security.core.Authentication;

import javax.servlet.http.HttpServletRequest;

/** 
 * Created by IntelliJ IDEA. 
 * User: Zhong Gang 
 * Date: 12-11-9 
 * Time: 下午10:08 
 */  
public interface AuthenticationTokenResolver {  
  
    boolean support(HttpServletRequest request);  
  
  
    Authentication resolve(HttpServletRequest request);  
  
}  
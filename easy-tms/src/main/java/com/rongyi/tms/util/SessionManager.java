package com.rongyi.tms.util;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.commons.lang.StringUtils;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;

import com.rongyi.core.common.util.AuthorityUtil;
import com.rongyi.tms.moudle.vo.UserInfo;

/**
 * session 管理类
 * @author baodk
 */
public class SessionManager {

    private static final ThreadLocal<HttpSession> httpSession = new ThreadLocal<HttpSession>();
    
    public static final String TOKEN = "token";
    
    /**
     * 设置session
     * @param session
     * @throws Exception 
     */
    public static void setSession(HttpServletRequest request,HttpSession session) throws Exception{
        httpSession.set(session);
        getSessionUser(request);
    }
    
    /**
     * 获取session
     * @return
     */
    public static HttpSession getSession(){
        return httpSession.get();
    }
    
    
    /**
     * 设置属性
     * @param attribute
     * @param obj
     */
    public static void setAttribute(String attribute, Object obj){
        HttpSession session = getSession();
        if(session != null){
            session.setAttribute(attribute, obj);
        }
    }
    
    /**
     * 清空session
     */
    public static void clean(){
        HttpSession session = getSession();
        if(session != null){
            session.invalidate();
            httpSession.set(null);
        }
    }
    
    /**
     * 登出
     */
    public static void logut(){
        clean();
    }
    
    /**
     * 获取当前session里面的用户
     * @return
     */
    public static UserInfo getSessionUser(HttpServletRequest request){
    	HttpSession session = getSession();
    	UserInfo user = (UserInfo)session.getAttribute(TOKEN);
        if(user == null){
			UserDetails userDetails = (UserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
			String account = userDetails.getUsername();
			user = new UserInfo();
			user.setUsername(account);
			
			Map<String, Object> attributes = AuthorityUtil.getAttributes(request);
//			Collection<GrantedAuthority> authorities = AuthorityUtil.getAuthorities(request);
			
			if(attributes != null && attributes.size() >= 0){
				String mallId = attributes.get("mallId") == null ? "" : attributes.get("mallId").toString();
				if(StringUtils.isNotBlank(mallId)){
					user.setMallId(mallId);
				}
			}
			session.setAttribute(TOKEN, user);
			httpSession.set(session);
		}
        return user;
    }
}

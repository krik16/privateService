package com.rongyi.tms.web.filter;

import java.io.BufferedReader;
import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.codec.binary.Base64;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;

import com.rongyi.core.bean.ResponseResult;
import com.rongyi.core.common.PropertyConfigurer;
import com.rongyi.core.common.util.JsonUtil;
import com.rongyi.tms.framework.http.BodyReaderHttpServletRequestWrapper;
import com.rongyi.tms.moudle.vo.UserInfo;
import com.rongyi.tms.util.SessionManager;

/**
 * 登录过滤器
 * @author baodk
 */
public class LoginFilter implements Filter{
	
//	@Autowired
//	private PropertyConfigurer propertyConfigurer;
    
//    private static final String LEGLE_REMOTE_URL = "0:0:0:0:0:0:0:1";
	private static final String LEGLE_REMOTE_URL = "127.0.0.1";
//	private static final String FROM_WHERE = "http://127.0.0.1:9081/main/left";
//	private static final String THIS_HOST = "http://127.0.0.1:8081/easy-mms";
    
    private Logger logger = LoggerFactory.getLogger(LoginFilter.class);

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        
    }

    @Override
    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws IOException,
                                                                                             ServletException {
        HttpServletRequest request = (HttpServletRequest) req;
        
        ServletRequest requestWrapper = null;  
        if(request instanceof HttpServletRequest) {  
            requestWrapper = new BodyReaderHttpServletRequestWrapper((HttpServletRequest) request);  
        }  
        
        HttpServletResponse response = (HttpServletResponse) resp;
        String remoteAddr = getRemortIP(request);
        //<<<
//        remoteAddr = LEGLE_REMOTE_URL;
        //>>>
        String referer = request.getHeader("Referer");
        ApplicationContext context = new ClassPathXmlApplicationContext("/spring/applicationContext-base.xml");  
        PropertyConfigurer propertyConfigurer = (PropertyConfigurer)context.getBean("propertyConfigurer"); // 获取远程服务代理  
        String FROM_WHERE = propertyConfigurer.getProperty("FROM_WHERE").toString();
        String THIS_HOST = propertyConfigurer.getProperty("THIS_HOST").toString();
        logger.info("FROM_WHERE:"+FROM_WHERE);
        logger.info("THIS_HOST:"+THIS_HOST);
        logger.info("referer:"+referer);
        //if(!FROM_WHERE.equals(referer) && referer.indexOf(THIS_HOST)==-1){
            /*logger.info("No Permission to request resource {}!", request.getRequestURI());
            
            ResponseResult responseResult = new ResponseResult();
            responseResult.setCode("404");
            responseResult.setMessage("No Permission to request resource {" + request.getRequestURI() + "}!");
            
            response.getWriter().write(JsonUtil.getJSONString(responseResult));
            return;*/
        //}else if(FROM_WHERE.equals(referer)){
        	HttpSession session = request.getSession();
        	//SessionManager.setSession(session);
	        String parameter = this.getRequestPayload(requestWrapper);
        	//<<<
    //    	String paramsJsonEncode = request.getParameter("paramsJson");
    //    	logger.info("\n paramsJsonEncode:"+paramsJsonEncode);
    //    	String paramsJson = new String(Base64.decodeBase64(paramsJsonEncode.getBytes()));
    //    	logger.info("\n paramsJson:"+paramsJson);
     //   	        parameter = "{\"username\":\"rongyiboy\",\"password\":\"1234567890\",\"mallId\":\"51f9d7f731d6559b7d00014f\",\"mallName\":\"第一八佰伴\",\"type\":\"mallAdmin\"}";
        	//>>>
    //    	UserInfo userInfo = (UserInfo) JsonUtil.getDTO(parameter, UserInfo.class);
    //    	SessionManager.setAttribute(SessionManager.TOKEN, userInfo);
        //}
	        
	        
		UserInfo user = new UserInfo();
		user = (UserInfo)request.getSession().getAttribute(SessionManager.TOKEN);
		if(user == null){
		    user = (UserInfo)session.getAttribute(SessionManager.TOKEN);
		}
//		if(user == null){
//			SecurityContext context2 = SecurityContextHolder.getContext();
//			UserDetails userDetails = (UserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
//			String account = userDetails.getUsername();
//			user = new UserInfo();
//			user.setUsername(account);
//			request.getSession().setAttribute(SessionManager.TOKEN, user);
//		}
        chain.doFilter(request, response);
    }

    @Override
    public void destroy() {
        
    }
    
    private String getRemortIP(HttpServletRequest request) {
        if (request.getHeader("x-forwarded-for") == null) {
         return request.getRemoteAddr();
        }
        return request.getHeader("x-forwarded-for");
    }
    
    /**
     * 获取ajax请求参数
     * @param request
     * @return
     */
    private String getRequestPayload(ServletRequest requestWrapper){
        StringBuilder sb = new StringBuilder();
        try {
            BufferedReader reader = requestWrapper.getReader();
            char[] buff = new char[1024];
            int len;
            while((len = reader.read(buff)) != -1) {
                sb.append(buff,0, len);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return sb.toString();
    }

}

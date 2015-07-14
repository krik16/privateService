package com.rongyi.tms.web.filter;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Collection;
import java.util.Map;

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
import org.jasig.cas.client.authentication.AttributePrincipal;
import org.jasig.cas.client.util.AbstractCasFilter;
import org.jasig.cas.client.validation.Assertion;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.security.cas.authentication.CasAuthenticationToken;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;

import com.rongyi.core.common.util.AuthorityUtil;

/**
 * 登录过滤器
 * 
 * @author pingkang
 */
public class AccessFilter implements Filter {

    private Logger logger = LoggerFactory.getLogger(AccessFilter.class);

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws IOException,
            ServletException {
        HttpServletRequest request = (HttpServletRequest) req;
        HttpServletResponse response = (HttpServletResponse) resp;
       /* StringBuffer requestURL = request.getRequestURL();
        if (requestURL.toString().indexOf("404.html") == -1 && requestURL.toString().indexOf("/interfaces/") == -1) {
            Collection<GrantedAuthority> authorities = AuthorityUtil.getAuthorities(request);
            if (authorities != null && authorities.size() > 0) {
                // has authority, do nothing
            } else {
                logger.info("No Permission to request resource {}!", request.getRequestURI());
                throw new ServletException("no authority");
            }
        }

        ServletRequest requestWrapper = null;

        String remoteAddr = getRemortIP(request);
        String referer1 = request.getHeader("Referer");*/
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
     * 
     * @param request
     * @return
     */
    private String getRequestPayload(ServletRequest requestWrapper) {
        StringBuilder sb = new StringBuilder();
        try {
            BufferedReader reader = requestWrapper.getReader();
            char[] buff = new char[1024];
            int len;
            while ((len = reader.read(buff)) != -1) {
                sb.append(buff, 0, len);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return sb.toString();
    }

}

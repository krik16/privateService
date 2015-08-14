package com.rongyi.tms.web.controller;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;

import com.rongyi.core.common.util.AuthorityUtil;
import com.rongyi.core.common.util.JsonUtil;
import com.rongyi.easy.solr.MallsDocument;
import com.rongyi.tms.constants.Constant;
import com.rongyi.tms.moudle.vo.UserInfo;

/**
  * 
  * @Title: BaseController.java 
  * @Package com.rongyi.mms.web.controller 
  * @Description: TODO
  * @author 平康  pingkang@rongyi.com
  * @date 2015年4月22日 下午6:23:30 
  * @version V1.0   
  * Copyright (C),上海容易网电子商务有限公司
  */

public class BaseController {
//	private Logger logger = LoggerFactory.getLogger(BaseController.class);
	protected static final Integer PAGE_SIZE = 10;
	@Autowired
	private com.rongyi.rss.solr.MallService solrMallService;
	 /**
     * 返回totalPage
     */
    protected Integer getTotalPage(Integer totalNum) {
        return (totalNum % PAGE_SIZE == 0 ? totalNum / PAGE_SIZE : (totalNum / PAGE_SIZE + 1));
    }

    /**
     * 返回totalPage
     */
    protected Integer getTotalPage(Integer totalNum, int pageSize) {
        return (totalNum % pageSize == 0 ? totalNum / pageSize : (totalNum / pageSize + 1));
    }

    protected Integer getStartRecordIndex(Integer nowPageIndex) {
        return nowPageIndex * PAGE_SIZE;
    }

    /**
   	 * 直接输出json
   	 */
   	public void responseJson(String json, HttpServletResponse  response) {
   		doPrint(json, "application/json;charset=UTF-8", response);
   	}

   	/**
	 * 向客户端输出指定格式的文档
	 * @param response 		响应
	 * @param text   		要发的内容
	 * @param contentType   发送的格式
	 */
	public void doPrint(String text, String contentType, HttpServletResponse  response) {
		try {
			response.setContentType(contentType);
			response.getWriter().write(text);
		} catch (IOException e) {
			System.out.println("向客户端输出时发生异常 : " + e.getMessage());
		}
	}
	
	/**
     * 获取当前session里面的用户
     * @return
     */
    public UserInfo getSessionUser(HttpServletRequest request, HttpSession session) throws Exception{
    	
    	UserInfo user = new UserInfo();
        user = (UserInfo)request.getSession().getAttribute(Constant.USER_SESSION_KEY);
        if(user == null){
            user = (UserInfo)session.getAttribute(Constant.USER_SESSION_KEY);
        }
        if(user == null){
			UserDetails userDetails = (UserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
			String account = userDetails.getUsername();
			user = new UserInfo();
			user.setUsername(account);


			Map<String, Object> attributes = AuthorityUtil.getAttributes(request);
			if(attributes != null && attributes.size() >= 0){
				String mallId = attributes.get("mallId") == null ? "" : attributes.get("mallId").toString();
				if(StringUtils.isNotBlank(mallId)){
					user.setMallId(mallId);
					MallsDocument md = solrMallService.selectMallIndexById(mallId);
					if(md != null){
						user.setMallName(md.getName());
					}
				}
			}
			/*Map<String, Object> attributes = AuthorityUtil.getAttributes(request);
			Collection<GrantedAuthority> authorities = AuthorityUtil.getAuthorities(request);*/
			request.getSession().setAttribute(Constant.USER_SESSION_KEY, user);
		}
        return user;
    }
    @SuppressWarnings("unchecked")
	public  Map<String, Object> getJsonMap(HttpServletRequest request) {
		try {
			request.setCharacterEncoding("utf-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		String paramsJson = request.getParameter("paramsJson");
		if (paramsJson == null) {
			Map<String, Object> resultMap = new HashMap<String, Object>();
			resultMap.put("msg", "参数为NULL，请关闭再重试！");
			resultMap.put("status", 0);
			return null;
		}
		return JsonUtil.getMapFromJson(paramsJson);
	}
}

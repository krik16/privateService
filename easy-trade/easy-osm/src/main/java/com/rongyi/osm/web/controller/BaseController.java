package com.rongyi.osm.web.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.dom4j.Element;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

//import com.rongyi.gcc.bean.Users;



/**
 * 类BaseController.java的实现描述：TODO 类实现描述
 * 
 * @author jiejie 2014年6月19日 下午1:40:49
 */
public class BaseController {
	private Logger logger = LoggerFactory.getLogger(BaseController.class);
    protected static final Integer PAGE_SIZE = 10;
//    protected HttpServletRequest   request;
//    protected HttpServletResponse  response;
//    protected HttpSession          session;
//    protected Map<String,Object> resultMap=new HashMap<String,Object>();
//	protected String json;
//	protected Map<String,Object> paramsMap;

//    @ModelAttribute
//    public void setReqAndResp(HttpServletRequest request, HttpServletResponse response) {
//        this.request = request;
//        this.response = response;
//        this.session = request.getSession();
//    }

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
	 * 直接输出纯字符串.
	 */
	public void responseText(String text, HttpServletResponse  response) {
		doPrint(text, "application/plain;charset=UTF-8", response);
	}

	/**
	 * 直接输出纯XML
	 */
	public void responseXml(Element res, HttpServletResponse  response) {
		String text = res.asXML();
		doPrint(text, "text/xml;charset=UTF-8", response);
	}

	/**
	 * 直接输出纯HTML.
	 */
	public void responseHtml(String text, HttpServletResponse  response) {
		doPrint(text, "text/html;charset=UTF-8", response);
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
			logger.error("向客户端输出时发生异常 : " + e.getMessage());
			e.printStackTrace();
		}
	}
	
//		/**
//		 * 获取当前session里面的用户
//		 * @return
//		 */
//		public Users getSessionUser(HttpServletRequest request, HttpSession session) throws Exception{
//			Users user = new Users();
//			user = (Users)request.getSession().getAttribute("USER_SESSIONKEY_");
//			if(user == null){
//				user = (Users)session.getAttribute("USER_SESSIONKEY_");
//			}
//			return user;
//		}

}

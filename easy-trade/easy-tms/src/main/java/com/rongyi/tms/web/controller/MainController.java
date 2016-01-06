package com.rongyi.tms.web.controller;

import com.rongyi.core.common.PropertyConfigurer;
import com.rongyi.core.common.util.DateUtil;
import com.rongyi.core.common.util.JsonUtil;
import com.rongyi.easy.roa.vo.MallVO;
import com.rongyi.easy.roa.vo.ShopVO;
import com.rongyi.rss.roa.ROAMallService;
import com.rongyi.rss.roa.ROAShopService;
import com.rongyi.tms.moudle.vo.UserInfo;
import com.rongyi.tms.util.SessionManager;
import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.UnsupportedEncodingException;
import java.security.Principal;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/main")
public class MainController extends BaseController {

    private Logger logger = Logger.getLogger(this.getClass());
    @Autowired
    private PropertyConfigurer propertyConfigurer;
    @Autowired
    private ROAMallService mallService;
    @Autowired
    private ROAShopService shopService;

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index(ModelMap model, HttpServletRequest request, HttpServletResponse response, HttpSession session) {
        return "index";
    }

    /**
     * 会员管理 > 会员搜索
     *
     * @param model
     * @return
     */
    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String home(ModelMap model, String currentMallId, HttpServletRequest request, HttpServletResponse response,
                       HttpSession session) {
        try {
            UserInfo user = getSessionUser(request, session);

            logger.info(">>>home \n currentMallId>>>" + currentMallId);
            /*
             * String _currentMallId = user.getMallId(); if (StringUtils.isNotBlank(currentMallId)) { _currentMallId =
             * currentMallId; } String area = ""; if (StringUtils.isNotBlank(_currentMallId)) { MallsDocument md =
             * solrMallService.selectMallIndexById(_currentMallId); if (md != null) {
             * SessionManager.setMallId(_currentMallId); SessionManager.setMallName(md.getName()); area = md.getArea1();
             * } }
             */
            model.addAttribute("currentMallId", user.getMallId());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {

        }
        return "/main";
    }

    /**
     * 左侧
     *
     * @param model
     * @param principal
     * @return
     */
    @RequestMapping(value = "/left", method = RequestMethod.GET)
    public String left(ModelMap model, HttpServletRequest request, HttpServletResponse response, HttpSession session,
                       Principal principal) {
        try {
            logger.info(">>>left");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {

        }
        return "left";
    }

    /**
     * 顶部
     *
     * @param model
     * @return
     */
    @RequestMapping(value = "/top", method = RequestMethod.GET)
    public String top(ModelMap model, String currentMallId, HttpServletRequest request, HttpServletResponse response,
                      HttpSession session) {
        try {
            logger.info(">>>top");
            UserInfo user = getSessionUser(request, session);
            /*
             * String _currentMallId = SessionManager.getMallId(); if (StringUtils.isNotBlank(currentMallId)) {
             * _currentMallId = currentMallId; } if (StringUtils.isNotBlank(_currentMallId)) { MallsDocument md =
             * solrMallService.selectMallIndexById(_currentMallId); if (md != null) {
             * SessionManager.setMallId(_currentMallId); SessionManager.setMallName(md.getName()); } }
             */
            model.put("mallName", user.getMallName());
            model.put("name", user.getUsername());
            // model.put("role", "管理员");
            model.put("curdate", DateUtil.dateToString(new Date(), "yyyy年MM月dd日"));
        } catch (Exception e) {
            e.printStackTrace();
        } finally {

        }
        return "top";
    }

    /**
     * 注销
     *
     * @param model
     * @param principal
     * @return
     */
    @RequestMapping(value = "/logout", method = RequestMethod.GET)
    public String logout(ModelMap model, HttpServletRequest request, HttpServletResponse response, HttpSession session,
                         Principal principal) {
        String LOGOUT_URL = null;
        try {
            logger.info(">>>logout");
            session.removeAttribute(SessionManager.TOKEN);
            LOGOUT_URL = propertyConfigurer.getProperty("LOGOUT_URL").toString();
            model.addAttribute("LOGOUT_URL", LOGOUT_URL);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {

        }
        // return "redirect:"+LOGOUT_URL;// 重定向方式
        return "logout";
    }

    @SuppressWarnings("unchecked")
    @RequestMapping(value = "/ajaxGetMalls")
    public String ajaxGetMalls(HttpServletRequest request, HttpServletResponse response, String paramsJson) {
//        logger.info("paramsJson:" + paramsJson);
        Map<String, Object> resultMap = new HashMap<String, Object>();
        try {
            request.setCharacterEncoding("utf-8");
        } catch (UnsupportedEncodingException e1) {
            logger.error("ajaxGetMalls+request.setCharacterEncoding(utf-8);转换错误" + e1.getMessage());
            logger.error(e1);
        }
        Map<String, Object> paramsMap;
        if (paramsJson == null) {
            resultMap.put("msg", "参数传递有误！");
            resultMap.put("status", 0);
            logger.info(resultMap);
            return null;
        }
        paramsMap = JsonUtil.getMapFromJson(paramsJson);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("name", paramsMap.get("keywords"));
//        logger.info("map:" + map.toString());
        try {
            Map<String, Object> result = mallService.getMalls(map, 1, 10);
            if (result != null && result.get("list") != null) {
                List<MallVO> malls = (List<MallVO>) result.get("list");
                resultMap.put("msg", malls);
            }
        } catch (Exception e) {
//            e.printStackTrace();
//            logger.error(e);
//            logger.error("得到商场dubbo错误或则没有数据！");
        }
        String json = JsonUtil.getJSONString(resultMap);
        responseJson(json, response);
        return null;
    }

    @SuppressWarnings("unchecked")
    @RequestMapping(value = "/ajaxGetShops")
    public String ajaxGetShops(HttpServletRequest request, HttpServletResponse response, String paramsJson)
            throws Exception {
        Map<String, Object> resultMap = new HashMap<String, Object>();
        try {
            request.setCharacterEncoding("utf-8");
        } catch (UnsupportedEncodingException e1) {
            logger.error("ajaxGetShops+request.setCharacterEncoding(utf-8);转换错误" + e1.getMessage());
            logger.error(e1);

        }
        Map<String, Object> paramsMap;
        if (paramsJson == null) {
            resultMap.put("msg", "参数传递有误！");
            resultMap.put("status", 0);
            return null;
        }
        paramsMap = JsonUtil.getMapFromJson(paramsJson);
        String mallId = (String) paramsMap.get("mallId");
        if (StringUtils.isNotEmpty(mallId)) {
            String keywords = (String) paramsMap.get("keywords");
            Map<String, Object> map = new HashMap<String, Object>();
//            map.put("mallId", mallId);
//            map.put("name", keywords);
            map.put("name", "五角场巴黎春天特卖场");
            Map<String, Object> result = shopService.getShops(map, 1, 10);
            if (result != null && result.get("list") != null) {
                List<ShopVO> malls = (List<ShopVO>) result.get("list");
                resultMap.put("msg", malls);
            }
        }
        String json = JsonUtil.getJSONString(resultMap);
        responseJson(json, response);
        return null;
    }
}

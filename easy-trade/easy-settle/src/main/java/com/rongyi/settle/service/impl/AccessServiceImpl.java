package com.rongyi.settle.service.impl;

import com.rongyi.rss.roa.ROAUserInfoService;
import com.rongyi.rss.ryoms.ROARyUserService;
import com.rongyi.settle.constants.CodeEnum;
import com.rongyi.settle.constants.ResponseData;
import com.rongyi.settle.service.AccessService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

/**
 * Created by xgq on 2015/10/12.
 */
@Service
public class AccessServiceImpl implements AccessService {

    private static Logger logger = LoggerFactory.getLogger(AccessServiceImpl.class);

    @Autowired
    private ROARyUserService ryUserService;

    @Autowired
    private ROAUserInfoService userInfoService;

    @Override
    public ResponseData check(HttpServletRequest request, String needAuthority) throws Exception {
        return checkUser(request, needAuthority, true);
    }

    @Override
    public ResponseData checkMerchant(HttpServletRequest request, String needAuthority) throws Exception {
        return checkUser(request, needAuthority, false);
    }

    private ResponseData checkUser(HttpServletRequest request, String needAuthority, boolean isMarketing) throws Exception {
        String ryst = "";
        String bsst = "";
        Cookie c[] = request.getCookies();
        if (c == null || c.length == 0) {
            return ResponseData.failure(CodeEnum.FIAL_USER_PARAMS_PAYMENT.getCodeInt(), CodeEnum.FIAL_USER_PARAMS_PAYMENT.getValueStr());
        }
        for (int i = 0; i < c.length; i++) {
            if (isMarketing && "RYST".equals(c[i].getName())) {
                ryst = c[i].getValue();
                break;
            }
            if ((!isMarketing) && "BSST".equals(c[i].getName())) {
                bsst = c[i].getValue();
                break;
            }
        }
        logger.info("访问地址：" + request.getServletPath() + " RYST=" + ryst + " BSST=" + bsst);
        if (StringUtils.isEmpty(ryst) && StringUtils.isEmpty(bsst)) {
            return ResponseData.failure(CodeEnum.FIAL_USER_PARAMS_PAYMENT.getCodeInt(), CodeEnum.FIAL_USER_PARAMS_PAYMENT.getValueStr());
        }
        Map user;
        if (!StringUtils.isEmpty(ryst)) {
            user = ryUserService.getSessionUser(ryst, false);
        } else {
            user = userInfoService.getSessionUser(bsst, true);
        }
        if (user == null || !user.containsKey("userInfo")) {
            logger.error("没有找到登录用户信息。");
            return ResponseData.failure(CodeEnum.FIAL_USER_PARAMS_PAYMENT.getCodeInt(), CodeEnum.FIAL_USER_PARAMS_PAYMENT.getValueStr());
        }
        List<String> authorities = (List<String>) user.get("authorities");

        if (authorities.contains(needAuthority)) {
            return ResponseData.success();
        } else {
            return ResponseData.failure(CodeEnum.FIAL_NO_AUTHORITY_PAYMENT.getCodeInt(), CodeEnum.FIAL_NO_AUTHORITY_PAYMENT.getValueStr());
        }
    }
}

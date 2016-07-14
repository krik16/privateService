package com.rongyi.settle.service.impl;

import com.alibaba.dubbo.common.utils.Log;
import com.rongyi.easy.bsoms.entity.SessionUserInfo;
import com.rongyi.easy.ryoms.entity.RyUserInfo;
import com.rongyi.rss.roa.ROAUserInfoService;
import com.rongyi.rss.ryoms.ROARyUserService;
import com.rongyi.settle.constants.CodeEnum;
import com.rongyi.settle.constants.ResponseData;
import com.rongyi.settle.exception.BizException;
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

	private ResponseData checkUser(HttpServletRequest request, String needAuthority, boolean isMarketing)
			throws Exception {
		String ryst = "";
		String bsst = "";
		Cookie c[] = request.getCookies();
		if (c == null || c.length == 0) {
			return ResponseData.failure(CodeEnum.FIAL_USER_PARAMS_PAYMENT.getCodeInt(),
					CodeEnum.FIAL_USER_PARAMS_PAYMENT.getValueStr());
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
		logger.info("访问地址：" + request.getServletPath() + " RYST=" + ryst + " BSST=" + bsst + " needAuthority="
				+ needAuthority);
		if (StringUtils.isEmpty(ryst) && StringUtils.isEmpty(bsst)) {
			return ResponseData.failure(CodeEnum.FIAL_USER_PARAMS_PAYMENT.getCodeInt(),
					CodeEnum.FIAL_USER_PARAMS_PAYMENT.getValueStr());
		}
		Map user;
		if (!StringUtils.isEmpty(ryst)) {
			user = ryUserService.getSessionUser(ryst, true);
			if (user == null || !user.containsKey("userInfo")) {
				logger.error("没有找到运营后台登录用户信息。");
				return ResponseData.failure(CodeEnum.FIAL_USER_PARAMS_PAYMENT.getCodeInt(),
						CodeEnum.FIAL_USER_PARAMS_PAYMENT.getValueStr());
			}
			RyUserInfo ryUserInfo = (RyUserInfo) user.get("userInfo");
			request.getSession().setAttribute("userName", ryUserInfo.getName());
		} else {
			user = userInfoService.getSessionUser(bsst, true);
			if (user == null || !user.containsKey("userInfo")) {
				logger.error("没有找到商家后台登录用户信息。");
				return ResponseData.failure(CodeEnum.FIAL_USER_PARAMS_PAYMENT.getCodeInt(),
						CodeEnum.FIAL_USER_PARAMS_PAYMENT.getValueStr());
			}
			SessionUserInfo sessionUserInfo = (SessionUserInfo) user.get("userInfo");
			request.getSession().setAttribute("userName", sessionUserInfo.getUserAccount());
			logger.info("当前登录账号=" + sessionUserInfo.getUserAccount());
		}
		List<String> authorities = (List<String>) user.get("authorities");
		// logger.info("需要权限: " + needAuthority + " 拥有权限:" +
		// authorities.toString());
		if (authorities.contains(needAuthority)) {
			return ResponseData.success();
		} else {
			return ResponseData.failure(CodeEnum.FIAL_NO_AUTHORITY_PAYMENT.getCodeInt(),
					CodeEnum.FIAL_NO_AUTHORITY_PAYMENT.getValueStr());
		}
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public RyUserInfo getRyUserInfo(HttpServletRequest request, String needAuthority) {
		String ryst = "";
		RyUserInfo ryUserInfo;
		Cookie c[] = request.getCookies();
		if (c == null || c.length == 0) {
			throw new BizException(CodeEnum.FIAL_USER_PARAMS_PAYMENT);
		}
		for (int i = 0; i < c.length; i++) {
			if ("RYST".equals(c[i].getName())) {
				ryst = c[i].getValue();
				break;
			}
		}
		logger.info("访问地址：" + request.getServletPath() + " RYST=" + ryst + " needAuthority=" + needAuthority);
		if (StringUtils.isEmpty(ryst)) {
			throw new BizException(CodeEnum.FIAL_USER_PARAMS_PAYMENT);
		}
		Map user;
		try {
			user = ryUserService.getSessionUser(ryst, true);
		} catch (Exception e) {
			logger.error("AccessService - 接口getRyUserInfo.ryUserService获取用户信息异常", e);
			throw new BizException(CodeEnum.ERROR_SYSTEM);
		}
		if (user == null || !user.containsKey("userInfo")) {
			logger.error("没有找到运营后台登录用户信息。");
			throw new BizException(CodeEnum.FIAL_USER_PARAMS_PAYMENT);
		}
		ryUserInfo = (RyUserInfo) user.get("userInfo");
		if (null == ryUserInfo || null == ryUserInfo.getId()) {
			throw new BizException(CodeEnum.FIAL_USER_IDENTITY);
		}
		request.getSession().setAttribute("userName", ryUserInfo.getName());
		List<String> authorities = (List<String>) user.get("authorities");
		if (!this.checkNeedAuthority(needAuthority, authorities)) {
			throw new BizException(CodeEnum.FIAL_NO_AUTHORITY_PAYMENT);
		}
		return ryUserInfo;
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public SessionUserInfo getSessionUserInfo(HttpServletRequest request, String needAuthority) {
		String bsst = "";
		SessionUserInfo sessionUserInfo;
		Cookie c[] = request.getCookies();
		if (c == null || c.length == 0) {
			throw new BizException(CodeEnum.FIAL_USER_PARAMS_PAYMENT);
		}
		for (int i = 0; i < c.length; i++) {
			if ("BSST".equals(c[i].getName())) {
				bsst = c[i].getValue();
				break;
			}
		}
		logger.info("访问地址：" + request.getServletPath() + " BSST=" + bsst + " needAuthority=" + needAuthority);
		if (StringUtils.isEmpty(bsst)) {
			throw new BizException(CodeEnum.FIAL_USER_PARAMS_PAYMENT);
		}
		Map user;
		try {
			user = userInfoService.getSessionUser(bsst, true);
		} catch (Exception e) {
			logger.error("AccessService - 接口getSessionUserInfo.userInfoService获取用户信息异常", e);
			throw new BizException(CodeEnum.ERROR_SYSTEM);
		}
		if (user == null || !user.containsKey("userInfo")) {
			logger.error("没有找到商家后台登录用户信息。");
			throw new BizException(CodeEnum.FIAL_USER_PARAMS_PAYMENT);
		}
		sessionUserInfo = (SessionUserInfo) user.get("userInfo");
		request.getSession().setAttribute("userName", sessionUserInfo.getUserAccount());
		logger.info("当前登录账号=" + sessionUserInfo.getUserAccount());

		if (null == sessionUserInfo || null == sessionUserInfo.getId() || null == sessionUserInfo.getIdentity()) {
			throw new BizException(CodeEnum.FIAL_USER_IDENTITY);
		}
		List<String> authorities = (List<String>) user.get("authorities");
		if (!this.checkNeedAuthority(needAuthority, authorities)) {
			throw new BizException(CodeEnum.FIAL_NO_AUTHORITY_PAYMENT);
		}
		return sessionUserInfo;
	}

	private Boolean checkNeedAuthority(String needAuthority, List<String> authorities) {
		if (authorities.contains(needAuthority)) {
			return Boolean.TRUE;
		} else {
			return Boolean.FALSE;
		}
	}
}

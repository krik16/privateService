package com.rongyi.settle.service;

import com.rongyi.easy.bsoms.entity.SessionUserInfo;
import com.rongyi.easy.ryoms.entity.RyUserInfo;
import com.rongyi.settle.constants.ResponseData;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by xgq on 2015/10/12.
 */
public interface AccessService {
	ResponseData check(HttpServletRequest request, String needAuthority) throws Exception;

	ResponseData checkMerchant(HttpServletRequest request, String needAuthority) throws Exception;

	RyUserInfo getRyUserInfo(HttpServletRequest request, String needAuthority);
	
	SessionUserInfo getSessionUserInfo(HttpServletRequest request, String needAuthority);
}

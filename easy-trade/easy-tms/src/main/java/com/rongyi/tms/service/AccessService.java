package com.rongyi.tms.service;


import com.rongyi.core.bean.ResponseData;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by xgq on 2015/10/12.
 */
public interface AccessService {
    ResponseData check(HttpServletRequest request, String needAuthority) throws Exception;

    ResponseData checkMerchant(HttpServletRequest request, String needAuthority) throws Exception;
}

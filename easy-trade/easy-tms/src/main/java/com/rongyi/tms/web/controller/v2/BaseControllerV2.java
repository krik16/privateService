package com.rongyi.tms.web.controller.v2;

import com.rongyi.core.bean.ResponseData;
import com.rongyi.tms.Exception.PermissionException;
import com.rongyi.tms.service.AccessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import javax.servlet.http.HttpServletRequest;

/**
 * Copyright (C), 上海容易网电子商务有限公司
 * kejun
 * 2016/3/2 18:09
 **/
@Controller
public class BaseControllerV2 {

    @Autowired
   private AccessService accessService;

    /**
     * 权限验证
     * @param request request
     * @param permissionName 权限名称
     */
    public void permissionCheck(HttpServletRequest request,String permissionName){
        try {
            ResponseData responseData = accessService.check(request, permissionName);
            if (responseData.getMeta().getErrno() != 0) {
                throw new PermissionException(String.valueOf(responseData.getMeta().getErrno()),responseData.getMeta().getMsg());
            }
        }catch (PermissionException e){
            throw e;
        }catch (Exception e){
            e.printStackTrace();
            throw new RuntimeException();
        }
    }
}

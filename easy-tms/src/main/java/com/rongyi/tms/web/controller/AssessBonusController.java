
/**   
 * @Title: AssessBonusController.java 
 * @Package: com.rongyi.tms.web.controller 
 * @Description: TODO
 * @author user  
 * @date 2015年5月28日 上午10:23:31 
 */


package com.rongyi.tms.web.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.rongyi.core.bean.ResponseResult;
import com.rongyi.tms.service.SalesCommissionAuditLogService;
import com.rongyi.tms.service.SalesCommissionService;

/** 
 * @Description 考核奖金controller
 * @author 袁波
 * @date 2015年5月28日 上午10:23:31 
 */
@Controller
@RequestMapping("/ab")
public class AssessBonusController extends BaseController {
    private static final Log LOGGER = LogFactory.getLog(AssessBonusController.class);

    protected ResponseResult result = new ResponseResult();
    
    @Autowired
    private SalesCommissionService commissionService;

    @Autowired
    private SalesCommissionAuditLogService commissionAuditLogService;
}

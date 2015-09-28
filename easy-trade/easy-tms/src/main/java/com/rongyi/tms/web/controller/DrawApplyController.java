
/**   
 * @Title: DrawApplyController.java 
 * @Package: com.rongyi.tms.web.controller 
 * @Description: TODO
 * @author user  
 * @date 2015年5月14日 下午2:34:57 
 */


package com.rongyi.tms.web.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import net.sf.json.JSONObject;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.rongyi.core.bean.ResponseResult;
import com.rongyi.core.common.PagingVO;
import com.rongyi.easy.tms.entity.DrawApply;
import com.rongyi.easy.tms.entity.DrawVerifyLog;
import com.rongyi.easy.va.entity.VirtualAccountEntity;
import com.rongyi.rss.roa.ROAVirtualAccountGeneralService;
import com.rongyi.tms.constants.CodeEnum;
import com.rongyi.tms.constants.Constant;
import com.rongyi.tms.moudle.vo.CheckParam;
import com.rongyi.tms.moudle.vo.DrawApplyPageParam;
import com.rongyi.tms.moudle.vo.UserInfo;
import com.rongyi.tms.service.DrawApplyService;
import com.rongyi.tms.service.DrawVerifyLogService;

/** 
 * @Description 提现申请 controller
 * @author 袁波
 * @date 2015年5月14日 下午2:34:57 
 */
@Controller
@RequestMapping("/bs")
public class DrawApplyController extends BaseController {
    private static final Log LOGGER = LogFactory.getLog(DrawApplyController.class);
    @Autowired
    private DrawApplyService drawService;
    
    @Autowired
    private DrawVerifyLogService drawVerifyLogService;
    
    @Autowired
    ROAVirtualAccountGeneralService rOAVirtualAccountGeneralService;
    
    @RequestMapping("/search")
    public String searchIntegralComm(String module) {
        return module+"/draw_apply-search";
    }
    @RequestMapping(value="/list")
    public String findByPage(@ModelAttribute("param")DrawApplyPageParam param,String module,ModelMap modelMap,HttpServletRequest request){
        try{
            Map<String,Object> params=param.toParamsMap();
//            LOGGER.info("params:"+params);
            PagingVO<DrawApply> pagingvos=drawService.findByPage(params);
            request.setAttribute("list", pagingvos.getDataList());
            request.setAttribute("currpage", pagingvos.getCurrentPage());
            request.setAttribute("rowCont", pagingvos.getTotalPage());
            if(module.equals("merchant")){
                if(param.getCheck().equals("0")){
                    return module+"/draw_apply-search-list";
                }else{
                    return module+"/draw_apply_checked-list";
                }
            }else{
                if(param.getCheck().equals("1")){
                    return module+"/draw_apply-search-list";
                }else{
                    return module+"/draw_apply_checked-list";
                }
            }
           
        }catch(Exception e){
            LOGGER.info(e);
            modelMap.addAttribute(Constant.VIEW_MSG.MSG, "获取数据失败");
            modelMap.addAttribute(Constant.VIEW_MSG.DETAIL, e.getMessage());
            return Constant.VIEW_MSG.ERROR;
        }
    }
    
    @RequestMapping(value="/check")
    @ResponseBody
    public ResponseResult checkDrawApply(CheckParam params,HttpSession session,HttpServletRequest request){
    	ResponseResult result = new ResponseResult();
    	try {
            LOGGER.info("checkParams:"+params);
           if(StringUtils.isBlank(params.getIds())||params.getStatus()==null||(params.getStatus()==-1&&StringUtils.isBlank(params.getReason()))){
               result.setCode(CodeEnum.ERROR_PARAM.getActionCode());
               result.setMessage(CodeEnum.ERROR_PARAM.getMessage());
               result.setSuccess(false);
           }else{
               UserInfo userInfo=this.getSessionUser(request, session);
               if(userInfo!=null){
                   int updateResult=drawService.updateForCheckApplys(params,userInfo.getUsername());
                   if(updateResult>0){
                       result.setCode(CodeEnum.SUCCESS.getActionCode());
                       result.setMessage(CodeEnum.SUCCESS.getMessage());
                       result.setSuccess(true);
                   }else{
                       result.setCode(CodeEnum.ERROR_UPDATE.getActionCode());
                       result.setMessage(CodeEnum.ERROR_UPDATE.getMessage());
                       result.setSuccess(false);
                   }
               }else{
                   result.setCode(CodeEnum.ERROR_LOGIN.getActionCode());
                   result.setMessage(CodeEnum.ERROR_LOGIN.getMessage());
                   result.setSuccess(false);
                   
               }
           }
        }  catch (Exception e) {
            e.printStackTrace();
            LOGGER.info(e);
            result.setCode(CodeEnum.ERROR_SYSTEM.getActionCode());
            result.setMessage(CodeEnum.ERROR_SYSTEM.getMessage());
            result.setSuccess(false);
        }
        return result;
    }
    
    @RequestMapping(value="/detail")
    public String checkDrawApply(int id,String module,HttpServletRequest request,ModelMap modelMap){
        try{
            if (id==0) {
                request.setAttribute("msg", "参数传递有误！");
                return Constant.VIEW_MSG.ERROR;
            }else{
                DrawApply drawApply=drawService.getOneById(id);
                VirtualAccountEntity vaEntity = rOAVirtualAccountGeneralService.selectByUserId(drawApply.getDrawUserId());
                modelMap.addAttribute("apply", drawApply);
                modelMap.addAttribute("balance",vaEntity.getBalance());
                if(drawApply.getStatus()<0){
                    DrawVerifyLog verifyLog= drawVerifyLogService.getLogByApplyId(drawApply.getId());
                    modelMap.addAttribute("log",verifyLog);
                }
            }
            return module+"/draw_apply-detail";
        }catch(Exception e){
            LOGGER.error(e);
            request.setAttribute(Constant.VIEW_MSG.MSG, "获取数据失败");
            request.setAttribute(Constant.VIEW_MSG.DETAIL, e.getMessage());
            return Constant.VIEW_MSG.ERROR;
        }
    }
    @RequestMapping(value="getReason")
    public void getUnPassReason(int id,HttpServletResponse response){
        Map<String, Object> resultMap=new HashMap<String, Object>();
        if(id==0){
            resultMap.put("msg", "");
        }else{
            DrawVerifyLog log= drawVerifyLogService.getLogByApplyId(id);
            resultMap.put("msg", log==null?"":log.getMemo());
        }
        JSONObject json=JSONObject.fromObject(resultMap);
        responseJson(json.toString(), response);
    }
}

package com.rongyi.tms.web.controller.v2;

import com.rongyi.core.bean.ResponseData;
import com.rongyi.easy.tms.vo.v2.SalesCommissionVO;
import com.rongyi.tms.Exception.PermissionException;
import com.rongyi.tms.constants.CodeEnum;
import com.rongyi.tms.constants.Constant;
import com.rongyi.tms.constants.ConstantEnum;
import com.rongyi.tms.service.v2.SalesCommissionService;
import com.rongyi.tms.web.controller.SalesCommissionController;
import com.rongyi.easy.tms.vo.v2.VerifyCommissionParam;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

/**
 * 佣金相关Controller
 * Created by hebo on 2016/2/26.
 */
@Controller
@RequestMapping("/v2/salesCommission")
public class SalesCommissionControllerV2 extends BaseControllerV2{
    private static final Logger LOGGER = LoggerFactory.getLogger(SalesCommissionController.class);

    @Autowired
    private SalesCommissionService salesCommissionService;

    @RequestMapping("/expandList")
    @ResponseBody
    public ResponseData findExpandList(HttpServletRequest request,@RequestBody Map<String, Object> map) {
        ResponseData result;
        try {
            LOGGER.info("findExpandList begin paramMap={}", map);
            if (!map.containsKey("currentPage") || !map.containsKey("searchType")){
                return ResponseData.failure(Integer.valueOf(CodeEnum.ERROR_PARAM.getActionCode()),CodeEnum.ERROR_PARAM.getMessage());
            }
            if(ConstantEnum.SERCHER_TYPE_0.getCodeStr().equals(map.get("searchType").toString())){
                permissionCheck(request,"CUSTOM_EXTRT_VIEW");
            }else{
                permissionCheck(request,"FNC_EXTRT_VIEW");
            }
            map.put("pageSize", Constant.PAGE.PAGESIZE);
            map.put("type", ConstantEnum.COMMISSION_TYPE_0.getCodeInt());
            int currentPage = map.containsKey("currentPage")?Integer.valueOf(map.get("currentPage").toString()):1;
            map.put("startRecord", (currentPage-1)*Constant.PAGE.PAGESIZE);
            List<SalesCommissionVO> list = salesCommissionService.findCommissionList(map);
            int totalAccount = salesCommissionService.countCommission(map);
            result = ResponseData.success(list, currentPage,Constant.PAGE.PAGESIZE, totalAccount);
            LOGGER.info("findExpandList end");
        } catch (PermissionException e){
            LOGGER.error(e.getMessage());
            e.printStackTrace();
            return ResponseData.failure(Integer.valueOf(e.getCode()), e.getMessage());
        }catch (Exception e) {
            e.printStackTrace();
            result = ResponseData.failure(Integer.valueOf(CodeEnum.ERROR_SYSTEM.getActionCode()), CodeEnum.ERROR_SYSTEM.getMessage());
        }
        return result;
    }

    @RequestMapping("/firstOrderList")
    @ResponseBody
    public ResponseData findFirstOrderList(HttpServletRequest request,@RequestBody Map<String, Object> map) {
        ResponseData result;
        try {
            LOGGER.info("findFirstOrderList begin paramMap={}", map);
            if (!map.containsKey("currentPage") || !map.containsKey("searchType")){
                return ResponseData.failure(Integer.valueOf(CodeEnum.ERROR_PARAM.getActionCode()),CodeEnum.ERROR_PARAM.getMessage());
            }
            if(ConstantEnum.SERCHER_TYPE_0.getCodeStr().equals(map.get("searchType").toString())){
                permissionCheck(request,"CUSTOM_FIRRT_VIEW");
            }else{
                permissionCheck(request,"FNC_FIRRT_VIEW");
            }
            map.put("pageSize", Constant.PAGE.PAGESIZE);
            map.put("type", ConstantEnum.COMMISSION_TYPE_1.getCodeInt());
            int currentPage = map.containsKey("currentPage")?Integer.valueOf(map.get("currentPage").toString()):1;
            map.put("startRecord", (currentPage-1)*Constant.PAGE.PAGESIZE);
            List<SalesCommissionVO> list = salesCommissionService.findCommissionList(map);
            int totalAccount = salesCommissionService.countCommission(map);
            result = ResponseData.success(list, currentPage,Constant.PAGE.PAGESIZE, totalAccount);
            LOGGER.info("findFirstOrderList end");
        }  catch (PermissionException e){
            LOGGER.error(e.getMessage());
            e.printStackTrace();
            return ResponseData.failure(Integer.valueOf(e.getCode()), e.getMessage());
        }catch (Exception e) {
            e.printStackTrace();
            result = ResponseData.failure(Integer.valueOf(CodeEnum.ERROR_SYSTEM.getActionCode()), CodeEnum.ERROR_SYSTEM.getMessage());
        }
        return result;
    }

    @RequestMapping("/detail")
    @ResponseBody
    public ResponseData detail(HttpServletRequest request) {
        ResponseData result;
        try {
            Integer id = Integer.valueOf(request.getParameter("id"));
            LOGGER.info("detail begin id={}", id);
            if (id == null){
                return ResponseData.failure(Integer.valueOf(CodeEnum.ERROR_PARAM.getActionCode()),CodeEnum.ERROR_PARAM.getMessage());
            }
            SalesCommissionVO salesCommissionVO = salesCommissionService.getCommissionDetail(id);
            result = ResponseData.success(salesCommissionVO);
            LOGGER.info("detail end");
        } catch (Exception e) {
            e.printStackTrace();
            result = ResponseData.failure(Integer.valueOf(CodeEnum.ERROR_SYSTEM.getActionCode()), CodeEnum.ERROR_SYSTEM.getMessage());
        }
        return result;
    }

    @RequestMapping("/verify")
    @ResponseBody
    public ResponseData verifyCommission(HttpServletRequest request,@RequestBody VerifyCommissionParam param) {
        ResponseData result;
        try {
            LOGGER.info("verifyCommission begin param={}", param);
            if (StringUtils.isBlank(param.getIds()) || param.getStatus()==null
                    || (param.getStatus()<0 && StringUtils.isBlank(param.getDesc()))){
                return ResponseData.failure(Integer.valueOf(CodeEnum.ERROR_PARAM.getActionCode()),CodeEnum.ERROR_PARAM.getMessage());
            }
            //推广返佣客服审核
            if(ConstantEnum.COMMISSION_CONFIG_TYPE_0.getCodeInt().equals(param.getType()) &&
                    (ConstantEnum.COMMISSION_STATUS_1_UNCHECK.getCodeInt().equals(param.getStatus()) ||
                    ConstantEnum.COMMISSION_STATUS_2.getCodeInt().equals(param.getStatus()))){
                permissionCheck(request,"CUSTOM_EXTRT_VFY");
            //推广佣金财务审核
            }else if(ConstantEnum.COMMISSION_CONFIG_TYPE_0.getCodeInt().equals(param.getType()) &&
                    (ConstantEnum.COMMISSION_STATUS_2_UNCHECK.getCodeInt().equals(param.getStatus()) ||
                            ConstantEnum.COMMISSION_STATUS_3.getCodeInt().equals(param.getStatus()))){
                permissionCheck(request,"FNC_EXTRT_VFY");
            //首单返佣客服审核
            }else if(ConstantEnum.COMMISSION_CONFIG_TYPE_1.getCodeInt().equals(param.getType()) &&
                    (ConstantEnum.COMMISSION_STATUS_1_UNCHECK.getCodeInt().equals(param.getStatus()) ||
                            ConstantEnum.COMMISSION_STATUS_2.getCodeInt().equals(param.getStatus()))){
                permissionCheck(request,"CUSTOM_FIRRT_VFY");
             //首单返佣财务审核
            }else if(ConstantEnum.COMMISSION_CONFIG_TYPE_1.getCodeInt().equals(param.getType()) &&
                    (ConstantEnum.COMMISSION_STATUS_2_UNCHECK.getCodeInt().equals(param.getStatus()) ||
                            ConstantEnum.COMMISSION_STATUS_3.getCodeInt().equals(param.getStatus()))){
                permissionCheck(request,"FNC_FIRRT_VFY");
            }else{
                LOGGER.info("不存在该审核条件");
                permissionCheck(request, "NO_PERMISSION");
            }

            if (salesCommissionService.verifyCommission(param, getUserName(request)))
                result = ResponseData.success();
            else
                result = ResponseData.failure(Integer.valueOf(CodeEnum.ERROR_UPDATE.getActionCode()), CodeEnum.ERROR_UPDATE.getMessage());
            LOGGER.info("verifyCommission end");
        } catch (PermissionException e){
            LOGGER.error(e.getMessage());
            e.printStackTrace();
            return ResponseData.failure(Integer.valueOf(e.getCode()), e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
            result = ResponseData.failure(Integer.valueOf(CodeEnum.ERROR_SYSTEM.getActionCode()), CodeEnum.ERROR_SYSTEM.getMessage());
        }
        return result;
    }

}

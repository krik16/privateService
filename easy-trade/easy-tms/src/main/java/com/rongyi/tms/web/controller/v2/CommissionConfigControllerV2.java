package com.rongyi.tms.web.controller.v2;

import com.rongyi.core.bean.ResponseData;
import com.rongyi.core.common.util.DateUtil;
import com.rongyi.easy.settle.entity.OperationLog;
import com.rongyi.easy.tms.entity.v2.CommissionConfig;
import com.rongyi.rss.malllife.roa.ROARedisService;
import com.rongyi.tms.Exception.PermissionException;
import com.rongyi.tms.constants.Constant;
import com.rongyi.tms.constants.ConstantEnum;
import com.rongyi.tms.service.v2.CommissionConfigService;
import com.rongyi.tms.util.MapUtils;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Copyright (C), 上海容易网电子商务有限公司
 * kejun
 * 2016/2/26 13:44
 * 新版本佣金规则Controller
 **/
@Controller
@RequestMapping("/v2/commissionConfig")
public class CommissionConfigControllerV2 extends BaseControllerV2{


    private static final Logger LOGGER = LoggerFactory.getLogger(CommissionConfigControllerV2.class);
    @Autowired
    CommissionConfigService commissionConfigService;

    @Autowired
    ROARedisService rOARedisService;



    @RequestMapping("/list")
    @ResponseBody
    public ResponseData list(HttpServletRequest request,@RequestBody Map<String, Object> map) {
        LOGGER.info("佣金规则配置列表,map={}", map);
        try {
            permissionCheck(request, "FNC_RULELIST_VIEW");
            Integer currentPage = Integer.valueOf(map.get("currentPage").toString());
            List<CommissionConfig> list = commissionConfigService.selectPageList(map, currentPage, Constant.PAGE.PAGESIZE);
            Integer count = commissionConfigService.selectPageCount(map);
            return ResponseData.success(list, currentPage, Constant.PAGE.PAGESIZE, count);
        }catch (PermissionException e){
            LOGGER.error(e.getMessage());
            e.printStackTrace();
            return ResponseData.failure(Integer.valueOf(e.getCode()), e.getMessage());
        }catch (Exception e) {
            LOGGER.error(e.getMessage());
            e.printStackTrace();
            return ResponseData.failure(ConstantEnum.COMMISSION_CONFIG_LIST_FAIL.getCodeInt(), ConstantEnum.COMMISSION_CONFIG_LIST_FAIL.getValueStr());
        }
    }

    @RequestMapping("/save")
    @ResponseBody
    public ResponseData save(HttpServletRequest request,@RequestBody Map<String, Object> map) {
        LOGGER.info("佣金规则保存,map={}", map);
        try {
            permissionCheck(request, "FNC_RULELIST_ADD");
            CommissionConfig commissionConfig = new CommissionConfig();
            MapUtils.toObject(commissionConfig, map);
            boolean result = commissionConfigService.validateIsExist(commissionConfig.getType(), commissionConfig.getInviteType(), commissionConfig.getRegisterType(), commissionConfig.getEffectStartTime(), commissionConfig.getEffectEndTime());
            if (result) {
                LOGGER.info("此佣金规则配置已存在");
                return ResponseData.failure(ConstantEnum.COMMISSION_CONFIG_EXIST.getCodeInt(), ConstantEnum.COMMISSION_CONFIG_EXIST.getValueStr());
            }
            commissionConfig.setCreateAt(DateUtil.getCurrDateTime());
            commissionConfig.setStatus(ConstantEnum.COMMISSION_CONFIG_STATUS_0.getCodeByte());
            String ruleCode = getRuleCode(commissionConfig.getType());
            if (StringUtils.isNotBlank(ruleCode) && ruleCode.length() > 10) {
                rOARedisService.set(ruleCode.substring(0, 8), ruleCode);
                rOARedisService.expire(ruleCode.substring(0, 9), 60 * 60 * 48);// 两天后失效
            }
            commissionConfig.setRuleCode(ruleCode);
            commissionConfig.setCreateBy(getUserName(request));
            //TODO 生效时间此版本前端未传默认设置当前时间
            commissionConfig.setEffectStartTime(DateUtil.getCurrDateTime());
            commissionConfig.setEffectEndTime(DateUtil.getCurrDateTime());
            commissionConfigService.insert(commissionConfig);
            return ResponseData.success();
        }catch (PermissionException e){
            LOGGER.error(e.getMessage());
            e.printStackTrace();
            return ResponseData.failure(Integer.valueOf(e.getCode()), e.getMessage());
        } catch (Exception e) {
            LOGGER.error(e.getMessage());
            e.printStackTrace();
            return ResponseData.failure(ConstantEnum.COMMISSION_CONFIG_SAVE_FAIL.getCodeInt(), ConstantEnum.COMMISSION_CONFIG_SAVE_FAIL.getValueStr());
        }
    }

    @RequestMapping("/verify")
    @ResponseBody
    public ResponseData verify(HttpServletRequest request,@RequestBody Map<String, Object> map) {
        LOGGER.info("佣金规则审核,map={}", map);
        try {
            permissionCheck(request, "FNC_RULELIST_VFY");
          return updateStatus(map, getUserName(request));
        } catch (PermissionException e){
            LOGGER.error(e.getMessage());
            e.printStackTrace();
            return ResponseData.failure(Integer.valueOf(e.getCode()), e.getMessage());
        }catch (Exception e) {
            LOGGER.error(e.getMessage());
            e.printStackTrace();
            return ResponseData.failure(ConstantEnum.COMMISSION_CONFIG_VERIFY_FAIL.getCodeInt(), ConstantEnum.COMMISSION_CONFIG_VERIFY_FAIL.getValueStr());
        }
    }

    @RequestMapping("/freeze")
    @ResponseBody
    public ResponseData freeze(HttpServletRequest request,@RequestBody Map<String, Object> map) {
        LOGGER.info("佣金规则启用/停用,map={}", map);
        try {
            permissionCheck(request, "FNC_RULELIST_VFY");
          return  updateStatus(map, getUserName(request));
        }catch (PermissionException e){
            LOGGER.error(e.getMessage());
            e.printStackTrace();
            return ResponseData.failure(Integer.valueOf(e.getCode()), e.getMessage());
        } catch (Exception e) {
            LOGGER.error(e.getMessage());
            e.printStackTrace();
            return ResponseData.failure(ConstantEnum.COMMISSION_CONFIG_VERIFY_FAIL.getCodeInt(), ConstantEnum.COMMISSION_CONFIG_VERIFY_FAIL.getValueStr());
        }
    }

    @RequestMapping("/detail")
    @ResponseBody
    public ResponseData detail(HttpServletRequest request,@RequestBody Map<String, Object> map) {
        LOGGER.info("佣金规则详情,map={}", map);
        try {
            permissionCheck(request, "FNC_RULELIST_VIEW");
            CommissionConfig commissionConfig = commissionConfigService.selectById(Integer.valueOf(map.get("id").toString()));
            return ResponseData.success(commissionConfig);
        }catch (PermissionException e){
            LOGGER.error(e.getMessage());
            e.printStackTrace();
            return ResponseData.failure(Integer.valueOf(e.getCode()), e.getMessage());
        } catch (Exception e) {
            LOGGER.error(e.getMessage());
            e.printStackTrace();
            return ResponseData.failure(ConstantEnum.COMMISSION_CONFIG_DETAIL_FAIL.getCodeInt(), ConstantEnum.COMMISSION_CONFIG_DETAIL_FAIL.getValueStr());
        }

    }


    private ResponseData updateStatus(Map<String, Object> map,String userName) {
        CommissionConfig commissionConfig = commissionConfigService.selectById(Integer.valueOf(map.get("id").toString()));
        commissionConfig.setStatus(Byte.valueOf(map.get("status").toString()));
        //审核通过和启用是验证是否有存在冲突的佣金配置
        if(ConstantEnum.COMMISSION_CONFIG_STATUS_1.getCodeByte().equals(commissionConfig.getStatus()) || ConstantEnum.COMMISSION_CONFIG_STATUS_3.getCodeByte().equals(commissionConfig.getStatus())) {
            boolean result = commissionConfigService.validateIsExist(commissionConfig.getType(), commissionConfig.getInviteType(), commissionConfig.getRegisterType(), commissionConfig.getEffectStartTime(), commissionConfig.getEffectEndTime());
            if (result) {
                LOGGER.info("此佣金规则配置已存在");
                return ResponseData.failure(ConstantEnum.COMMISSION_CONFIG_EXIST.getCodeInt(), ConstantEnum.COMMISSION_CONFIG_EXIST.getValueStr());
            }
        }
        //TODO 此版本不考虑时间条件，置默认值
        commissionConfig.setEffectStartTime(DateUtil.getCurrDateTime());
        commissionConfig.setEffectEndTime(DateUtil.getCurrDateTime());
        commissionConfig.setUpdateAt(DateUtil.getCurrDateTime());
        commissionConfig.setUpdateBy(userName);

        OperationLog log = new OperationLog();
        log.setOperationId(commissionConfig.getId());
        log.setCreateAt(new Date());
        log.setOperationType(commissionConfig.getStatus());
        log.setDesc(map.get("desc") + "");
        log.setCreateUserId(userName);
        log.setOperationModel(ConstantEnum.OP_MODEL_2.getCodeByte());
        commissionConfigService.update(commissionConfig, log);
        return ResponseData.success();
    }

    /**
     * 生成规则编码
     * return
     * Author: 柯军
     * date:2015年9月22日下午3:37:03
     **/
    private String getRuleCode(byte type) {
        StringBuilder sb = new StringBuilder();
        try {
            if (ConstantEnum.COMMISSION_CONFIG_TYPE_0.getCodeByte().equals(type)) {
                sb.append("IR");
            } else if (ConstantEnum.COMMISSION_CONFIG_TYPE_1.getCodeByte().equals(type)) {
                sb.append("FR");
            } else {
                sb.append("");
            }
            sb.append(DateUtil.getCurrentDateYYMMDD());
            String key = sb.toString();
            String ruleCode = rOARedisService.get(key);
            if (StringUtils.isEmpty(ruleCode) || ruleCode.length() < 12) {
                sb.append("0001");
            } else {
                int num = Integer.valueOf(ruleCode.substring(9, 12));
                String str = String.format("%04d", ++num);
                sb.append(str);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return sb.toString();
    }
}

package com.rongyi.tms.web.controller.v2;

import com.rongyi.core.bean.ResponseData;
import com.rongyi.core.common.util.DateUtil;
import com.rongyi.easy.tms.entity.v2.CommissionConfig;
import com.rongyi.rss.malllife.roa.ROARedisService;
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
public class CommissionConfigControllerV2 {


    private static final Logger LOGGER = LoggerFactory.getLogger(CommissionConfigControllerV2.class);
    @Autowired
    CommissionConfigService commissionConfigService;

    @Autowired
    private ROARedisService redisService;

    @RequestMapping("/list")
    @ResponseBody
    public ResponseData list(@RequestBody Map<String, Object> map) {
        LOGGER.info("佣金规则配置列表,map={}", map);
        try {
            Integer currentPage = Integer.valueOf(map.get("currentPage").toString());
            List<CommissionConfig> list = commissionConfigService.selectPageList(map, currentPage, Constant.PAGE.PAGESIZE);
            Integer count = commissionConfigService.selectPageCount(map);
            return ResponseData.success(list, currentPage, Constant.PAGE.PAGESIZE, count);
        } catch (Exception e) {
            LOGGER.error(e.getMessage());
            e.printStackTrace();
            return ResponseData.failure(ConstantEnum.COMMISSION_CONFIG_LIST_FAIL.getCodeInt(), ConstantEnum.COMMISSION_CONFIG_LIST_FAIL.getValueStr());
        }
    }

    @RequestMapping("/save")
    @ResponseBody
    public ResponseData save(@RequestBody Map<String, Object> map) {
        LOGGER.info("佣金规则保存,map={}", map);
        try {
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
                redisService.set(ruleCode.substring(0, 8), ruleCode);
                redisService.expire(ruleCode.substring(0, 9), 60 * 60 * 48);// 两天后失效
            }
            commissionConfig.setRuleCode(ruleCode);
            commissionConfigService.insert(commissionConfig);
            return ResponseData.success();
        } catch (Exception e) {
            LOGGER.error(e.getMessage());
            e.printStackTrace();
            return ResponseData.failure(ConstantEnum.COMMISSION_CONFIG_SAVE_FAIL.getCodeInt(), ConstantEnum.COMMISSION_CONFIG_SAVE_FAIL.getValueStr());
        }
    }

    @RequestMapping("/verify")
    @ResponseBody
    public ResponseData verify(@RequestBody Map<String, Object> map) {
        LOGGER.info("佣金规则审核,map={}", map);
        try {
            updateStatus(map);
            return ResponseData.success();
        } catch (Exception e) {
            LOGGER.error(e.getMessage());
            e.printStackTrace();
            return ResponseData.failure(ConstantEnum.COMMISSION_CONFIG_VERIFY_FAIL.getCodeInt(), ConstantEnum.COMMISSION_CONFIG_VERIFY_FAIL.getValueStr());
        }
    }

    @RequestMapping("/freeze")
    @ResponseBody
    public ResponseData freeze(@RequestBody Map<String, Object> map) {
        LOGGER.info("佣金规则启用/停用,map={}", map);
        try {
            updateStatus(map);
            return ResponseData.success();
        } catch (Exception e) {
            LOGGER.error(e.getMessage());
            e.printStackTrace();
            return ResponseData.failure(ConstantEnum.COMMISSION_CONFIG_VERIFY_FAIL.getCodeInt(), ConstantEnum.COMMISSION_CONFIG_VERIFY_FAIL.getValueStr());
        }
    }

    @RequestMapping("/detail")
    @ResponseBody
    public ResponseData detail(@RequestBody Map<String, Object> map) {
        LOGGER.info("佣金规则详情,map={}", map);
        try {
            CommissionConfig commissionConfig = commissionConfigService.selectById(Integer.valueOf(map.get("id").toString()));
            return ResponseData.success(commissionConfig);
        } catch (Exception e) {
            LOGGER.error(e.getMessage());
            e.printStackTrace();
            return ResponseData.failure(ConstantEnum.COMMISSION_CONFIG_DETAIL_FAIL.getCodeInt(), ConstantEnum.COMMISSION_CONFIG_DETAIL_FAIL.getValueStr());
        }

    }

    private void updateStatus(Map<String, Object> map) {
        CommissionConfig commissionConfig = commissionConfigService.selectById(Integer.valueOf(map.get("id").toString()));
        commissionConfig.setStatus(Byte.valueOf(map.get("status").toString()));
        //TODO 此版本不考虑时间条件，置默认值
        commissionConfig.setEffectStartTime(null);
        commissionConfig.setEffectEndTime(null);
        commissionConfigService.update(commissionConfig);
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
            String ruleCode = redisService.get(key);
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

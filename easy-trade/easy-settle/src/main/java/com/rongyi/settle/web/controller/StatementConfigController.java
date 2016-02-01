/**
 * @Copyright (C), 上海容易网电子商务有限公司
 * @Author: 柯军
 * @datetime:2015年9月17日下午2:31:18
 * @Description: TODO
 **/

package com.rongyi.settle.web.controller;

import com.rongyi.core.common.PagingVO;
import com.rongyi.core.common.util.DateTool;
import com.rongyi.core.common.util.DateUtil;
import com.rongyi.easy.roa.entity.AreaEntity;
import com.rongyi.easy.roa.entity.MallEntity;
import com.rongyi.easy.roa.vo.*;
import com.rongyi.easy.settle.entity.BussinessInfo;
import com.rongyi.easy.settle.entity.ConfigShop;
import com.rongyi.easy.settle.entity.StatementConfig;
import com.rongyi.easy.settle.vo.ConfigShopVO;
import com.rongyi.easy.settle.vo.StatementConfigVO;
import com.rongyi.easy.shop.entity.ShopEntity;
import com.rongyi.rss.malllife.roa.ROARedisService;
import com.rongyi.rss.roa.*;
import com.rongyi.rss.shop.IShopService;
import com.rongyi.settle.constants.CodeEnum;
import com.rongyi.settle.constants.ConstantEnum;
import com.rongyi.settle.constants.ResponseData;
import com.rongyi.settle.service.AccessService;
import com.rongyi.settle.service.StatementConfigService;
import com.rongyi.settle.util.MapUtils;
import com.rongyi.settle.web.controller.params.FindAccountParam;
import com.rongyi.settle.web.controller.params.RelevanceParam;
import com.rongyi.settle.web.controller.vo.RelevanceVO;
import com.rongyi.settle.web.controller.vo.UserInfoVo;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.bson.types.ObjectId;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author: 柯军
 * @Description: 对账单配置controller
 * @datetime:2015年9月17日下午2:31:18
 *
 **/
@Controller
@RequestMapping("/statementConfig")
public class StatementConfigController extends BaseController {

    private static final Logger LOGGER = LoggerFactory.getLogger(StatementConfigController.class);

    @Autowired
    StatementConfigService statementConfigService;

    @Autowired
    private ROARedisService redisService;

    @Autowired
    private ROAMallGroupService roaMallGroupService;

    @Autowired
    private ROAMallService rOAMallService;

    @Autowired
    private ROAAreaService rOAAreaService;

    @Autowired
    private RoaBrandService roaBrandService;

    @Autowired
    private ROAShopService roaShopService;

    @Autowired
    private ROAFilialeService rOAFilialeService;

    @Autowired
    private AccessService accessService;

    @Autowired
    private IShopService iShopService;

    /**
     * @Description: 分页查询配置列表
     * @param request
     * @return
     * @Author: 柯军
     * @datetime:2015年9月17日下午2:55:37
     **/
    @RequestMapping("/list")
    @ResponseBody
    public ResponseData getPageList(HttpServletRequest request, @RequestBody Map<String, Object> map) {
        LOGGER.info("====configList map={}" + map);
        try {
            if (map.containsKey("searchStatus")) {
                ResponseData responseData = accessService.check(request, "FNC_STLCONF_VIEW");
                if (responseData.getMeta().getErrno() != 0) {
                    return responseData;
                }
            } else {
                ResponseData responseData = accessService.check(request, "FNC_STL_VIEW");
                if (responseData.getMeta().getErrno() != 0) {
                    return responseData;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseData.failure(CodeEnum.ERROR_SYSTEM.getCodeInt(), CodeEnum.ERROR_SYSTEM.getValueStr());
        }
        try {
            Integer currentPage = Integer.valueOf(map.get("currentPage").toString());
            List<Byte> statusList = new ArrayList<>();
            if (map.get("searchStatus") != null && map.get("searchStatus").equals(0)) {
                statusList.add((byte) 0);
            } else if (map.get("searchStatus") != null && map.get("searchStatus").equals(1)) {
                statusList.add((byte) 1);
                statusList.add((byte) 2);
            }
            if (!statusList.isEmpty())
                map.put("statusList", statusList);
            List<StatementConfigVO> list = statementConfigService.selectPageList(map, currentPage, ConstantEnum.PAGE_SIZE.getCodeInt());
            Integer count = statementConfigService.selectPageListCount(map);
            return ResponseData.success(list, currentPage, ConstantEnum.PAGE_SIZE.getCodeInt(), count);
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseData.failure(CodeEnum.FIAL_CONFIG_LIST.getCodeInt(), CodeEnum.FIAL_CONFIG_LIST.getValueStr());
        }

    }

    /**
     * @Description: 增加配置
     * @return
     * @Author: 柯军
     * @datetime:2015年9月21日下午2:55:32
     **/
    @RequestMapping("/add")
    @ResponseBody
    public ResponseData add() {
        LOGGER.info("====config add====");
        return ResponseData.success(getRuleCode());
    }

    /**
     * @Description: 保存配置
     * @param request
     * @param map
     * @return
     * @Author: 柯军
     * @datetime:2015年9月21日下午2:57:11
     **/
    @RequestMapping("/save")
    @ResponseBody
    public ResponseData save(HttpServletRequest request, @RequestBody Map<String, Object> map) {
        LOGGER.info("====config save==== params={}", map.toString());
        try {
            ResponseData responseData = accessService.check(request, "FNC_STL_ADD");
            if (responseData.getMeta().getErrno() != 0) {
                return responseData;
            }
            if (!map.containsKey("bussinessType") || !map.containsKey("bussinessCode") || !map.containsKey("bussinessAccount") || !map.containsKey("payMode") || !map.containsKey("countCycle")) {
                return ResponseData.failure(CodeEnum.FIAL_PARAMS_ERROR.getCodeInt(), CodeEnum.FIAL_PARAMS_ERROR.getValueStr());
            }
            //验证商家财务账户
            if (CollectionUtils.isEmpty(statementConfigService.getAccountInfoByParam(1, Integer.valueOf(map.get("bussinessType").toString()), null, map.get("bussinessCode").toString(), map.get("bussinessAccount").toString())))
                return ResponseData.failure(CodeEnum.FIAL_CONFIG_BIZ_NOACCOUNT.getCodeInt(), CodeEnum.FIAL_CONFIG_BIZ_NOACCOUNT.getValueStr());
            StatementConfig statementConfig = new StatementConfig();
            BussinessInfo bussinessInfo = new BussinessInfo();
            MapUtils.toObject(statementConfig, map);
            if (!map.containsKey("id")) {
                statementConfig.setCreateAt(DateUtil.getCurrDateTime());
            }
            statementConfig.setCreateBy(getUserName(request));
            statementConfig.setBussinessId(statementConfig.getBussinessCode());
            if (map.containsKey("effectStartTime") && map.containsKey("effectEndTime")) {
                statementConfig.setEffectStartTime(DateTool.string2Date(map.get("effectStartTime").toString(), DateTool.FORMAT_DATETIME));
                statementConfig.setEffectEndTime(DateTool.string2Date(map.get("effectEndTime").toString(), DateTool.FORMAT_DATETIME));
            }
            MapUtils.toObject(bussinessInfo, map);
            bussinessInfo.setCreateAt(DateUtil.getCurrDateTime());
            String[] linkShopIds = null;
            if (map.containsKey("linkId")) {
               linkShopIds = map.get("linkId").toString().split(",");
            }
            List<Byte> statuses = new ArrayList<>();
            statuses.add(ConstantEnum.CONFIG_STATUS_1.getCodeByte());
            statuses.add(ConstantEnum.CONFIG_STATUS_0.getCodeByte());
            Map<String, Object> checkMap = statementConfigService.validateIsExist(statementConfig, statuses, linkShopIds);
//			LOGGER.info("=========================== checkMap"+checkMap);
            boolean checkResult = (boolean) checkMap.get("result");
            if (checkResult) {
                if (checkMap.containsKey("errorNo")) {
                    return ResponseData.failure(Integer.valueOf(checkMap.get("errorNo").toString()), checkMap.get("errorMsg").toString());
                }
                return ResponseData.failure(CodeEnum.FIAL_CONFIG_BIZ_EXIST.getCodeInt(), CodeEnum.FIAL_CONFIG_BIZ_EXIST.getValueStr());
            }
            List<ConfigShop> shopConfigs = (List<ConfigShop>) checkMap.get("shopConfigs");
            String ruleCode = getRuleCode();
            if (statementConfig.getId()==null) {
                if (StringUtils.isNotBlank(ruleCode) && ruleCode.length() > 10) {
                    redisService.set(ruleCode.substring(0, 9), ruleCode);
                    redisService.expire(ruleCode.substring(0, 9), 60 * 60 * 48);// 两天后失效
                }
                statementConfig.setRuleCode(ruleCode);
            }
            statementConfigService.saveStatementConfigAndInfo(statementConfig, bussinessInfo, shopConfigs);
            return ResponseData.success();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ResponseData.failure(CodeEnum.FIAL_SAVE_CONFIG.getCodeInt(), CodeEnum.FIAL_SAVE_CONFIG.getValueStr());
    }

    /**
     * @Description: 修改配置
     * @param map
     * @return ResponseData
     * @Author: 柯军
     * @datetime:2015年9月21日下午2:59:22
     **/
    @RequestMapping("/update")
    @ResponseBody
    public ResponseData update(@RequestBody Map<String, Object> map, HttpServletRequest request) {
        LOGGER.info("====config update==== params={}", map.toString());
        ResponseData responseData;
        try {
            responseData = accessService.check(request, "FNC_STL_EDIT");
            if (responseData.getMeta().getErrno() != 0) {
                return responseData;
            }
            if (!map.containsKey("id")) {
                return ResponseData.failure(CodeEnum.FIAL_PARAMS_ERROR.getCodeInt(), CodeEnum.FIAL_PARAMS_ERROR.getValueStr());
            }
            StatementConfigVO statementConfigVO = statementConfigService.selectConfigInfoById(Integer.valueOf(map.get("id").toString()));
            responseData = ResponseData.success(statementConfigVO);
        } catch (Exception e) {
            e.printStackTrace();
            responseData = ResponseData.failure(CodeEnum.ERROR_SYSTEM.getCodeInt(), CodeEnum.ERROR_SYSTEM.getValueStr());
        }
        return responseData;
    }

    /**
     * @Description: 复制配置
     * @param map
     * @return ResponseData
     * @Author: 柯军
     * @datetime:2015年9月21日下午2:59:22
     **/
    @RequestMapping("/copy")
    @ResponseBody
    public ResponseData copy(@RequestBody Map<String, Object> map, HttpServletRequest request) {
        LOGGER.info("====config copy==== params={}", map.toString());
        ResponseData responseData;
        try {
            responseData = accessService.check(request, "FNC_STL_CHANGE");
            if (responseData.getMeta().getErrno() != 0) {
                return responseData;
            }
            if (!map.containsKey("id")) {
                return ResponseData.failure(CodeEnum.FIAL_PARAMS_ERROR.getCodeInt(), CodeEnum.FIAL_PARAMS_ERROR.getValueStr());
            }
            StatementConfigVO statementConfigVO = statementConfigService.selectConfigInfoById(Integer.valueOf(map.get("id").toString()));
            statementConfigVO.setId(null);
            statementConfigVO.setRuleCode(null);
            statementConfigVO.setCycleStartTime(null);
            statementConfigVO.setCycleEndTime(null);
            statementConfigVO.setCycleDay(null);
            statementConfigVO.setCycleRegularDay(null);
            statementConfigVO.setEffectStartTime(null);
            statementConfigVO.setEffectEndTime(null);
            responseData = ResponseData.success(statementConfigVO);
        } catch (Exception e) {
            e.printStackTrace();
            responseData = ResponseData.failure(CodeEnum.ERROR_SYSTEM.getCodeInt(), CodeEnum.ERROR_SYSTEM.getValueStr());
        }
        return responseData;
    }

    /**
     * @Description: 变更配置
     * @param request
     * @param map
     * @return
     * @Author: 柯军
     * @datetime:2015年9月21日下午2:59:34
     **/
    @RequestMapping("/modify")
    @ResponseBody
    public ResponseData modify(HttpServletRequest request, @RequestBody Map<String, Object> map) {
        LOGGER.info("====config modify==== params={}", map.toString());
        try {
            ResponseData responseData = accessService.check(request, "FNC_STL_CHANGE");
            if (responseData.getMeta().getErrno() != 0) {
                return responseData;
            }
        } catch (Exception e) {
            e.printStackTrace();
            ResponseData.failure(CodeEnum.ERROR_SYSTEM.getCodeInt(), CodeEnum.ERROR_SYSTEM.getValueStr());
        }
        return null;
    }

    /**
     * @Description: 配置详情
     * @param request
     * @param map
     * @return
     * @Author: 柯军
     * @datetime:2015年9月21日下午3:00:10
     **/
    @RequestMapping("/info")
    @ResponseBody
    public ResponseData info(HttpServletRequest request, @RequestBody Map<String, Object> map) {
        LOGGER.info("====config info==== params={}", map.toString());
        StatementConfigVO statementConfigVO = new StatementConfigVO();
        try {
            ResponseData responseData = accessService.check(request, "FNC_STLCONF_VIEW");
            if (responseData.getMeta().getErrno() != 0) {
                return responseData;
            }
            statementConfigVO = statementConfigService.selectConfigInfoById(Integer.valueOf(map.get("id").toString()));

        } catch (Exception e) {
            e.printStackTrace();
            ResponseData.failure(CodeEnum.ERROR_SYSTEM.getCodeInt(), CodeEnum.ERROR_SYSTEM.getValueStr());
        }
        return ResponseData.success(statementConfigVO);
    }

    /**
     * @Description: 账号详情（分页）
     * @param request
     * @param map
     * @return
     * @Author: 柯军
     * @datetime:2015年9月21日下午3:00:10
     **/
    @RequestMapping("/accountInfo")
    @ResponseBody
    public ResponseData accountInfo(HttpServletRequest request, @RequestBody Map<String, Object> map) {
        LOGGER.info("====accountInfo==== params={}", map.toString());
        List<ConfigShopVO> configShopVOs;
        ResponseData result = null;
        try {
            ResponseData responseData = accessService.check(request, "FNC_STLCONF_VIEW");
            if (responseData.getMeta().getErrno() != 0) {
                return responseData;
            }
            if (!map.containsKey("id")) {
                return ResponseData.failure(CodeEnum.FIAL_PARAMS_ERROR.getCodeInt(), CodeEnum.FIAL_PARAMS_ERROR.getValueStr());
            }
            int currPage = map.containsKey("currPage") ? Integer.valueOf(map.get("currPage").toString()) : 1;
            int pageSize = map.containsKey("pageSize") ? Integer.valueOf(map.get("pageSize").toString()) : 10;
            Map<String, Object> paramsMap = new HashMap<>();
            paramsMap.put("configId", Integer.valueOf(map.get("id").toString()));
            configShopVOs = statementConfigService.selectConfigShopsPage(paramsMap, currPage, pageSize);
            int totalCount = statementConfigService.selectConfigShopsPageCount(paramsMap);
            result = ResponseData.success(configShopVOs, currPage, pageSize, totalCount);
        } catch (Exception e) {
            e.printStackTrace();
            ResponseData.failure(CodeEnum.ERROR_SYSTEM.getCodeInt(), CodeEnum.ERROR_SYSTEM.getValueStr());
        }
        return result;
    }

    /**
     * @Description: 审核配置
     * @param request
     * @param map
     * @return
     * @Author: 柯军
     * @datetime:2015年9月21日下午3:00:26
     **/
    @RequestMapping("/verify")
    @ResponseBody
    public ResponseData verify(HttpServletRequest request, @RequestBody Map<String, Object> map) {
        LOGGER.info("====config verify==== params={}", map.toString());
        ResponseData result;
        try {
            ResponseData responseData = accessService.check(request, "FNC_STLCONF_VFY");
            if (responseData.getMeta().getErrno() != 0) {
                return responseData;
            }
            // 获取用户
            String userId = getUserName(request);
            String idStr = map.containsKey("ids") ? map.get("ids").toString() : null;
            Integer status = map.containsKey("status") ? Integer.valueOf(map.get("status").toString()) : null;
            String desc = map.containsKey("desc") ? map.get("desc").toString() : null;
            if (org.apache.commons.lang.StringUtils.isBlank(idStr) || status == null) {
                return ResponseData.failure(CodeEnum.FIAL_PARAMS_ERROR.getCodeInt(), CodeEnum.FIAL_PARAMS_ERROR.getValueStr());
            }
            List<Integer> ids = new ArrayList<>();
            for (String id : idStr.split(",")) {
                ids.add(Integer.valueOf(id.trim()));
            }
            if (statementConfigService.updatePaymentStatusByIds(ids, status, desc, userId)) {
                result = ResponseData.success();
            } else {
                result = ResponseData.failure(CodeEnum.FIAL_UPDATE_PAYMENT.getCodeInt(), CodeEnum.FIAL_UPDATE_PAYMENT.getValueStr());
            }

        } catch (Exception e) {
            e.printStackTrace();
            result = ResponseData.failure(CodeEnum.ERROR_SYSTEM.getCodeInt(), CodeEnum.ERROR_SYSTEM.getValueStr());
        }
        LOGGER.info(result.toString());
        return result;
    }

    /**
     * 生成规则编码
     * @return
     * @Author: 柯军
     * @date:2015年9月22日下午3:37:03
     **/
    private String getRuleCode() {
        StringBuilder sb = new StringBuilder();
        try {
            sb.append("BSR");
            sb.append(DateUtil.getCurrentDateYYMMDD());
            String key = sb.toString();
            String ruleCode = redisService.get(key);
            if (StringUtils.isEmpty(ruleCode) || ruleCode.length() < 13) {
                sb.append("0001");
            } else {
                int num = Integer.valueOf(ruleCode.substring(10, 13));
                String str = String.format("%04d", ++num);
                sb.append(str);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return sb.toString();
    }

    /**
     * @Description: 根据类型，名称模糊搜索
     * @Author: he
     **/
    @RequestMapping("/relevance")
    @ResponseBody
    public ResponseData relevance(@RequestBody RelevanceParam params) {
        ResponseData result = null;
        try {
            LOGGER.info("================  relevance params={}", params);
            if (params.getType() == null) {
                return ResponseData.failure(CodeEnum.FIAL_PARAMS_ERROR.getCodeInt(), CodeEnum.FIAL_PARAMS_ERROR.getValueStr());
            }
            int type = Integer.valueOf(params.getType().toString());
            Integer currpage = params.getCurrPage() != null ? Integer.valueOf(params.getCurrPage().toString()) : 1;
            Integer pagesize = params.getPageSize() != null ? Integer.valueOf(params.getPageSize().toString()) : 15;
            Map<String, Object> searchMap = getSearchMapByParams(params);
            searchMap.put("currpage", currpage);
            searchMap.put("pagesize", pagesize);
            if (type == 0) {// 店铺
                Map resultMap = roaShopService.getShops(searchMap, currpage, pagesize);
                List<ShopVO> shopVOs = (List<ShopVO>) resultMap.get("list");
                List<RelevanceVO> reList = new ArrayList<>();
                if (CollectionUtils.isNotEmpty(shopVOs)) {
                    for (ShopVO shopVO : shopVOs) {
                        RelevanceVO shop = new RelevanceVO();
                        shop.setId(shopVO.getId());
                        shop.setName(shopVO.getName());
                        shop.setPosition(shopVO.getPosition());
                        shop.setBrandName(shopVO.getBrandName());
                        if (shopVO.getPosition() != null) {
                            shop.setMallName(shopVO.getPosition().getMall());
                        }
                        reList.add(shop);
                    }
                }
                int count = resultMap.containsKey("totalCount") ? Integer.valueOf(resultMap.get("totalCount").toString()) : 0;
                result = ResponseData.success(reList, currpage, pagesize, count);
            } else if (type == 1) {// 商场
                Map<String, Object> resultMap = rOAMallService.getMalls(searchMap, currpage, pagesize);
                List<MallVO> mallVOs = (List<MallVO>) resultMap.get("list");
                List<RelevanceVO> reList = new ArrayList<>();
                if (CollectionUtils.isNotEmpty(mallVOs)) {
                    for (MallVO mallVO : mallVOs) {
                        RelevanceVO mall = new RelevanceVO();
                        mall.setId(mallVO.getId());
                        mall.setName(mallVO.getName());
                        mall.setMallAddress(mallVO.getMallAddress());
                        reList.add(mall);
                    }
                }
                int count = resultMap.containsKey("totalCount") ? Integer.valueOf(resultMap.get("totalCount").toString()) : 0;
                result = ResponseData.success(reList, currpage, pagesize, count);
            } else if (type == 2) {// 品牌
                PagingVO<BrandVO> brands = roaBrandService.getBrandListByMap(searchMap, currpage, pagesize);
                result = ResponseData.success(brands.getDataList(), currpage, pagesize, brands.getRowCnt());
            } else if (type == 3) {// 分公司
                List<FilialeVo> list = rOAFilialeService.getFilialeList(searchMap, currpage, pagesize);
                int totalCount = rOAFilialeService.getFilialeList(searchMap, 0, 0).size();
                result = ResponseData.success(list, currpage, pagesize, totalCount);
            } else if (type == 4) {// 集团
                List<MallGroupVO> list = roaMallGroupService.getMallGroups(searchMap);
                int count;
                searchMap.put("currpage", null);
                count = roaMallGroupService.getMallGroups(searchMap).size();
                result = ResponseData.success(list, currpage, pagesize, count);
            }
        } catch (RuntimeException e) {
            result = ResponseData.success(null, 1, 10, 0);
            LOGGER.info(e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
            result = ResponseData.failure(CodeEnum.ERROR_SYSTEM.getCodeInt(), CodeEnum.ERROR_SYSTEM.getValueStr());
        }
        LOGGER.info("result={}" + result);
        return result;
    }

    private Map<String, Object> getSearchMapByParams(RelevanceParam params) {
        Map<String, Object> reMap = new HashMap<>();
        switch (params.getType()) {
            case 0:
                if (StringUtils.isNotBlank(params.getShopId())) {
                    reMap.put("id", params.getShopId());
                }
                if (StringUtils.isNotBlank(params.getShopName())) {
                    reMap.put("shopName", params.getShopName());
                }
                if (StringUtils.isNotBlank(params.getZoneId())) {
                    reMap.put("zoneId", params.getZoneId());
                }
                reMap.put("sort", "noSort");// 暂未定排序字段
                break;
            case 1:
                if (StringUtils.isNotBlank(params.getZoneId())) {
                    reMap.put("zoneId", params.getZoneId());
                }
                if (StringUtils.isNotBlank(params.getMallId())) {
                    reMap.put("mallId", params.getMallId());
                }
                if (StringUtils.isNotBlank(params.getMallName())) {
                    reMap.put("name", params.getMallName());
                }
                break;
            case 2:
                if (StringUtils.isNotBlank(params.getBrandId())) {
                    reMap.put("id", params.getBrandId());
                }
                if (StringUtils.isNotBlank(params.getBrandNameC())) {
                    reMap.put("cname", params.getBrandNameC());
                }
                if (StringUtils.isNotBlank(params.getBrandNameE())) {
                    reMap.put("ename", params.getBrandNameE());
                }
                break;
            case 3:
                if (StringUtils.isNotBlank(params.getFilialeId())) {
                    reMap.put("id", params.getFilialeId());
                }
                if (StringUtils.isNotBlank(params.getFilialeName())) {
                    reMap.put("name", params.getFilialeName());
                }
                if (StringUtils.isNotBlank(params.getBrandId())) {
                    reMap.put("brandId", params.getBrandId());
                }
                break;
            case 4:
                if (StringUtils.isNotBlank(params.getGroupId())) {
                    reMap.put("id", params.getGroupId());
                }
                if (StringUtils.isNotBlank(params.getGroupName())) {
                    reMap.put("name", params.getGroupName());
                }
                break;
        }

        return reMap;
    }

    @RequestMapping(value = "getAreaList")
    @ResponseBody
    public ResponseData getAreaList(@RequestBody Map<String, Object> map) {
        LOGGER.info("======================== getAreaList param:" + map);
        String type = map.containsKey("type") ? map.get("type").toString() : "";
        String id = map.containsKey("id") ? map.get("id").toString() : "";
        List<AreaEntity> areaList;
        try {
            //如果type不为空，查询市  区 商圈
            if (StringUtils.isNotEmpty(type)) {
                areaList = rOAAreaService.getSub(type, id);
            } else {  //查询省信息
                areaList = rOAAreaService.getPro();
            }
            return ResponseData.success(areaList);
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseData.failure(CodeEnum.ERROR_SYSTEM.getCodeInt(), CodeEnum.ERROR_SYSTEM.getValueStr());
        }
    }

    /**
     * @Description: 根据类型，名称模糊搜索
     * @Author: he
     **/
    @RequestMapping("/linkShop")
    @ResponseBody
    public ResponseData relevanceShop(@RequestBody RelevanceParam params) {
        ResponseData result;
        try {
            LOGGER.info("================ relevance params={}", params);
            if (params.getType() == null || StringUtils.isBlank(params.getId())) {
                return ResponseData.failure(CodeEnum.FIAL_PARAMS_ERROR.getCodeInt(), CodeEnum.FIAL_PARAMS_ERROR.getValueStr());
            }
            Integer currpage = params.getCurrPage() != null ? Integer.valueOf(params.getCurrPage().toString()) : 1;
            Integer pagesize = params.getPageSize() != null ? Integer.valueOf(params.getPageSize().toString()) : 15;
            Map<String, Object> searchMap = new HashMap<>();
            searchMap.put("currpage", currpage);
            searchMap.put("pagesize", pagesize);
            if (StringUtils.isNotBlank(params.getShopId())) {
                searchMap.put("id", params.getShopId());
            }
            if (StringUtils.isNotBlank(params.getShopName())) {
                searchMap.put("shopName", params.getShopName());
            }
            if (StringUtils.isNotBlank(params.getZoneId())) {
                searchMap.put("zoneId", params.getZoneId());
            }
            searchMap.put("sort", "noSort");// 暂未定排序字段
            Map resultMap;
            List<ShopVO> shopVOs = null;
            int count = 0;
            switch (params.getType()) {
                case 0:
                    if (StringUtils.isNotBlank(params.getShopId()) && !params.getId().equals(params.getShopId())) {
                        return ResponseData.success(null, currpage, pagesize, 0);
                    }
                    searchMap.put("id", params.getId());
                    break;
                case 1:
                    searchMap.put("mallId", params.getId());
                    break;
                case 2:
                    searchMap.put("brandId", params.getId());
                    break;
                case 3:
                    shopVOs = new ArrayList<>();
                    if (ObjectId.isValid(params.getId()))
                        searchMap.put("filiale_id", new ObjectId(params.getId()));
                    else
                        break;
                    if (StringUtils.isNotBlank(params.getZoneId())) {
                        searchMap.put("zone_id", params.getZoneId());
                    }
                    List<ShopEntity> shopEntities = iShopService.searchShop(searchMap, currpage - 1, pagesize);
                    count = iShopService.searchShopCount(searchMap).intValue();
                    List<ObjectId> shopIds;
                    if (CollectionUtils.isNotEmpty(shopEntities)) {
                        shopIds = new ArrayList<>();
                        for (ShopEntity shopEntity : shopEntities) {
                            shopIds.add(shopEntity.getId());
                        }
                        shopVOs = roaShopService.getShopsByIds(shopIds);
                    }
                    break;
                case 4:
                    List<MallEntity> mallEntities = rOAMallService.getMallEntitysByGroupId(params.getId());
                    List<String> mallIds = new ArrayList<>();
                    if (CollectionUtils.isNotEmpty(mallEntities)) {
                        for (MallEntity mallEntity : mallEntities) {
                            mallIds.add(mallEntity.getId().toString());
                        }
                    }
                    searchMap.put("zoneIds", mallIds);
                    break;
                default:
                    return ResponseData.failure(CodeEnum.FIAL_PARAMS_ERROR.getCodeInt(), CodeEnum.FIAL_PARAMS_ERROR.getValueStr());
            }

            resultMap = roaShopService.getShops(searchMap, currpage, pagesize);
            if (shopVOs == null) {
                shopVOs = (List<ShopVO>) resultMap.get("list");
                count = resultMap.containsKey("totalCount") ? Integer.valueOf(resultMap.get("totalCount").toString()) : 0;
            }
            List<RelevanceVO> reList = new ArrayList<>();
            if (CollectionUtils.isNotEmpty(shopVOs)) {
                for (ShopVO shopVO : shopVOs) {
                    RelevanceVO shop = new RelevanceVO();
                    shop.setId(shopVO.getId());
                    shop.setName(shopVO.getName());
                    shop.setPosition(shopVO.getPosition());
//                    //查询店铺关联账号信息
//                    List<UserInfoVo> userAccounts = statementConfigService.getAccountInfoByParam(0, 0, 1, shopVO.getId(), null);
//                    shop.setUserAccounts(userAccounts);
                    reList.add(shop);
                }
            }
            result = ResponseData.success(reList, currpage, pagesize, count);
        } catch (Exception e) {
            e.printStackTrace();
            result = ResponseData.failure(CodeEnum.ERROR_SYSTEM.getCodeInt(), CodeEnum.ERROR_SYSTEM.getValueStr());
        }
        return result;
    }

    @RequestMapping("/findAccount")
    @ResponseBody
    public ResponseData findAccount(@RequestBody FindAccountParam params) {
        try {
            LOGGER.info("================ findAccount params={}", params);
            if (params.getGuideType() == null || StringUtils.isBlank(params.getId())
                    || params.getIsOneself() == null || (params.getIsOneself() == 1 && params.getType() == null)) {
                return ResponseData.failure(CodeEnum.FIAL_PARAMS_ERROR.getCodeInt(), CodeEnum.FIAL_PARAMS_ERROR.getValueStr());
            }
            List<UserInfoVo> userAccounts = statementConfigService.getAccountInfoByParam(params.getIsOneself(), params.getType(), params.getGuideType(), params.getId(), null);
            return ResponseData.success(userAccounts);
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseData.failure(CodeEnum.ERROR_SYSTEM.getCodeInt(), CodeEnum.ERROR_SYSTEM.getValueStr());
        }
    }

}

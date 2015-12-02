/**
 * @Copyright (C),上海容易网电子商务有限公司	
 * @Author: 柯军 
 * @datetime:2015年9月17日下午2:31:18
 * @Description: TODO
 *
 **/

package com.rongyi.settle.web.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import com.rongyi.core.bean.ResponseVO;
import com.rongyi.easy.roa.vo.*;
import com.rongyi.settle.web.controller.params.RelevanceParam;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.rongyi.core.common.PagingVO;
import com.rongyi.core.common.util.DateUtil;
import com.rongyi.easy.settle.entity.BussinessInfo;
import com.rongyi.easy.settle.entity.StatementConfig;
import com.rongyi.easy.settle.vo.StatementConfigVO;
import com.rongyi.rss.malllife.roa.ROARedisService;
import com.rongyi.rss.roa.ROAFilialeService;
import com.rongyi.rss.roa.ROAMallGroupService;
import com.rongyi.rss.roa.ROAMallService;
import com.rongyi.rss.roa.ROAShopService;
import com.rongyi.rss.roa.RoaBrandService;
import com.rongyi.settle.constants.CodeEnum;
import com.rongyi.settle.constants.ConstantEnum;
import com.rongyi.settle.constants.ResponseData;
import com.rongyi.settle.service.AccessService;
import com.rongyi.settle.service.StatementConfigService;
import com.rongyi.settle.util.MapUtils;
import com.rongyi.settle.web.controller.vo.RelevanceVO;

/**
 * @Author: 柯军
 * @Description: 对账单配置controller
 * @datetime:2015年9月17日下午2:31:18
 * 
 **/
@Controller
@RequestMapping("/statementConfig")
public class StatementConfigController extends BaseController{

	private static final Logger LOGGER = LoggerFactory.getLogger(StatementConfigController.class);

	@Autowired
	StatementConfigService statementConfigService;

	@Autowired
	private ROARedisService redisService;

	@Autowired
	private ROAMallGroupService roaMallGroupService;

	@Autowired
	private ROAMallService rOAMallService;

	// @Autowired
	// private ROAAreaService rOAAreaService ;

	@Autowired
	private RoaBrandService roaBrandService;

	@Autowired
	private ROAShopService roaShopService;

	@Autowired
	private ROAFilialeService rOAFilialeService;

	@Autowired
	private AccessService accessService;

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
		LOGGER.info("====configList map={}"+map);
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
		LOGGER.info("====config save==== params={}",map.toString());
		try {
			ResponseData responseData = accessService.check(request, "FNC_STL_ADD");
			if (responseData.getMeta().getErrno() != 0) {
				return responseData;
			}
			StatementConfig oldStatementConfig = statementConfigService.selectByRuleCode(map.get("ruleCode").toString());
			if(oldStatementConfig != null)
				return ResponseData.failure(CodeEnum.FIAL_CONFIG_EXIST.getCodeInt(), CodeEnum.FIAL_CONFIG_EXIST.getValueStr());
			StatementConfig statementConfig = new StatementConfig();
			BussinessInfo bussinessInfo = new BussinessInfo();
			MapUtils.toObject(statementConfig, map);
			statementConfig.setCreateAt(DateUtil.getCurrDateTime());
			statementConfig.setCreateBy(getUserName(request));
			statementConfig.setBussinessId(statementConfig.getBussinessCode());
			MapUtils.toObject(bussinessInfo, map);
			bussinessInfo.setCreateAt(DateUtil.getCurrDateTime());
			if(statementConfigService.validateIsExist(statementConfig.getCooperateType(), statementConfig.getBussinessType(), statementConfig.getBussinessId(), ConstantEnum.STATUS_2.getCodeByte()
					, statementConfig.getEffectStartTime(), statementConfig.getEffectEndTime())){
				return ResponseData.failure(CodeEnum.FIAL_CONFIG_BIZ_EXIST.getCodeInt(), CodeEnum.FIAL_CONFIG_BIZ_EXIST.getValueStr());
			}
				
			statementConfigService.saveStatementConfigAndInfo(statementConfig, bussinessInfo);
			String ruleCode = statementConfig.getRuleCode();
			if (StringUtils.isNotBlank(ruleCode) && ruleCode.length() > 10) {
				redisService.set(ruleCode.substring(0, 9), ruleCode);
				redisService.expire(ruleCode.substring(0, 9), 60 * 60 * 48);// 两天后失效
			}
			return ResponseData.success();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ResponseData.failure(CodeEnum.FIAL_SAVE_CONFIG.getCodeInt(), CodeEnum.FIAL_SAVE_CONFIG.getValueStr());
	}

	/**
	 * @Description: 修改配置
	 * @param request
	 * @param map
	 * @return ResponseData
	 * @Author: 柯军
	 * @datetime:2015年9月21日下午2:59:22
	 **/
	@RequestMapping("/update")
	@ResponseBody
	public ResponseData update(HttpServletRequest request, @RequestBody Map<String, Object> map) {
		LOGGER.info("====config update==== params={}",map.toString());
		try {
			ResponseData responseData = accessService.check(request, "FNC_STL_EDIT");
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
		LOGGER.info("====config modify==== params={}",map.toString());
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
		LOGGER.info("====config info==== params={}",map.toString());
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
		LOGGER.info("====config verify==== params={}",map.toString());
		ResponseData result;
		try {
			ResponseData responseData = accessService.check(request, "FNC_STLCONF_VFY");
			if (responseData.getMeta().getErrno() != 0) {
				return responseData;
			}
			// 获取用户
			String userId =getUserName(request);
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
	 * @Description: 生成规则编码
	 * @return
	 * @Author: 柯军
	 * @datetime:2015年9月22日下午3:37:03
	 **/
	private String getRuleCode() {
		StringBuffer sb = new StringBuffer();
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
	@SuppressWarnings("unchecked")
	@RequestMapping("/relevance")
	@ResponseBody
	public ResponseData relevance(@RequestBody RelevanceParam params) {
		ResponseData result = null;
		try {
			LOGGER.info("================ 》》》》》》》》》》》》 relevance params={}", params);
			if (params.getType()==null){
				return ResponseData.failure(CodeEnum.FIAL_PARAMS_ERROR.getCodeInt(), CodeEnum.FIAL_PARAMS_ERROR.getValueStr());
			}
			int type = Integer.valueOf(params.getType().toString());
			Integer currpage = params.getCurrPage() != null ? Integer.valueOf(params.getCurrPage().toString()) : 1;
			Integer pagesize = params.getPageSize() != null ? Integer.valueOf(params.getPageSize().toString()) : 15;
			Map<String, Object> searchMap = getSearchMapByParams(params);
			searchMap.put("currpage", currpage);
			searchMap.put("pagesize", pagesize);
			if (type == 0) {// 店铺
				Map<String, Object> resultMap = roaShopService.getShops(searchMap, currpage, pagesize);
				List<ShopVO> shopVOs = (List<ShopVO>) resultMap.get("list");
				List<RelevanceVO> reList = new ArrayList<>();
				if (CollectionUtils.isNotEmpty(shopVOs)) {
					for (ShopVO shopVO : shopVOs){
                        RelevanceVO shop = new RelevanceVO();
                        shop.setId(shopVO.getId());
                        shop.setName(shopVO.getName());
                        shop.setPosition(shopVO.getPosition());
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
					for (MallVO mallVO : mallVOs){
						RelevanceVO mall = new RelevanceVO();
						mall.setId(mallVO.getId());
						mall.setName(mallVO.getName());
						mall.setMallAddress(mallVO.getMallAddress());
						reList.add(mall);
					}
				}
				int count = resultMap.containsKey("totalCount") ? Integer.valueOf(resultMap.get("totalCount").toString()) : 0;
				result = ResponseData.success(resultMap.get("list"), currpage, pagesize, count);
			} else if (type == 2) {// 品牌
				PagingVO<BrandVO> brands = roaBrandService.getBrandListByMap(searchMap, currpage, pagesize);
				result = ResponseData.success(brands.getDataList(), currpage, pagesize, brands.getRowCnt());
			} else if (type == 3) {// 分公司
				List<FilialeVo> list = rOAFilialeService.getFilialeList(searchMap, currpage, pagesize);
				int totalCount = rOAFilialeService.getFilialeList(searchMap, 0,0).size();
				result = ResponseData.success(list, currpage, pagesize, totalCount);
			} else if (type == 4) {// 集团
				List<MallGroupVO> list = roaMallGroupService.getMallGroups(searchMap);
				int count = 0;
				if (currpage == 1) {
					searchMap.put("currpage", null);
					count = roaMallGroupService.getMallGroups(searchMap).size();
				}
				result = ResponseData.success(list, currpage, pagesize, count);
			}
		} catch (Exception e) {
			e.printStackTrace();
			result = ResponseData.failure(CodeEnum.ERROR_SYSTEM.getCodeInt(), CodeEnum.ERROR_SYSTEM.getValueStr());
		}
		LOGGER.info("result={}"+result);
		return result;
	}

	private Map<String, Object> getSearchMapByParams(RelevanceParam params) {
		Map<String, Object> reMap = new HashMap<>();
		switch (params.getType()){
			case 0:
				if (StringUtils.isNotBlank(params.getShopId())) {
					reMap.put("id", params.getShopId());
				}
				if (StringUtils.isNotBlank(params.getShopName())){
					reMap.put("shopName", params.getShopName());
				}
				if (StringUtils.isNotBlank(params.getZoneId())){
					reMap.put("zoneId", params.getZoneId());
				}
				reMap.put("sort", "noSort");// 暂未定排序字段
				break;
			case 1:
				if (StringUtils.isNotBlank(params.getZoneId())){
					reMap.put("zoneId", params.getZoneId());
				}
				if (StringUtils.isNotBlank(params.getMallId())){
					reMap.put("mallId", params.getMallId());
				}
				if (StringUtils.isNotBlank(params.getMallName())){
					reMap.put("name", params.getMallName());
				}
				break;
			case 2:
				if (StringUtils.isNotBlank(params.getBrandId())){
					reMap.put("brandId", params.getBrandId());
				}
				if (StringUtils.isNotBlank(params.getBrandNameC())){
					reMap.put("cname", params.getBrandNameC());
				}
				if (StringUtils.isNotBlank(params.getBrandNameE())){
					reMap.put("ename", params.getBrandNameE());
				}
				break;
			case 3:
				if (StringUtils.isNotBlank(params.getFilialeId())){
					reMap.put("id", params.getFilialeId());
				}
				if (StringUtils.isNotBlank(params.getFilialeName())){
					reMap.put("name", params.getFilialeName());
				}
				if (StringUtils.isNotBlank(params.getBrandId())){
					reMap.put("brandId", params.getBrandId());
				}
				break;
			case 4:
				if (StringUtils.isNotBlank(params.getGroupId())){
					reMap.put("id", params.getGroupId());
				}
				if (StringUtils.isNotBlank(params.getGroupName())){
					reMap.put("name", params.getGroupName());
				}
				break;
		}

		return reMap;
	}

}

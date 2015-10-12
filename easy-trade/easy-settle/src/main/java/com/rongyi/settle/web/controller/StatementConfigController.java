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

import com.rongyi.core.common.PagingVO;
import com.rongyi.easy.roa.vo.BrandVO;
import com.rongyi.easy.roa.vo.FilialeVo;
import com.rongyi.easy.roa.vo.MallGroupVO;
import com.rongyi.easy.roa.vo.ShopVO;
import com.rongyi.rss.roa.*;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.rongyi.core.common.util.DateUtil;
import com.rongyi.easy.settle.entity.BussinessInfo;
import com.rongyi.easy.settle.entity.StatementConfig;
import com.rongyi.rss.malllife.roa.ROARedisService;
import com.rongyi.settle.constants.CodeEnum;
import com.rongyi.settle.constants.ConstantEnum;
import com.rongyi.settle.constants.ResponseData;
import com.rongyi.settle.service.StatementConfigService;
import com.rongyi.settle.util.MapUtils;

/**
 * @Author: 柯军
 * @Description: 对账单配置controller
 * @datetime:2015年9月17日下午2:31:18
 * 
 **/
@Controller
@RequestMapping("/statementConfig")
public class StatementConfigController {

	Logger logger = LoggerFactory.getLogger(StatementConfigController.class);

	@Autowired
	StatementConfigService statementConfigService;

	@Autowired
	private ROARedisService redisService;

	@Autowired
	private ROAMallGroupService roaMallGroupService ;

	@Autowired
	private ROAMallService rOAMallService;

//	@Autowired
//	private ROAAreaService rOAAreaService ;

	@Autowired
	private RoaBrandService roaBrandService;

	@Autowired
	private ROAShopService roaShopService;

	@Autowired
	private ROAFilialeService rOAFilialeService;

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
		try {
			Integer currentPage = Integer.valueOf(map.get("currentPage").toString());
			List<StatementConfig> list = statementConfigService.selectPageList(map, currentPage, ConstantEnum.PAGE_SIZE.getCodeInt());
			Integer count = statementConfigService.selectPageListCount(map);
			return ResponseData.success(list, currentPage, ConstantEnum.PAGE_SIZE.getCodeInt(), count);
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseData.failure(CodeEnum.FIAL_CONFIG_LIST.getCodeInt(), CodeEnum.FIAL_CONFIG_LIST.getValueStr());
		}

	}

	/**
	 * @Description: 增加配置
	 * @param request
	 * @param map
	 * @return
	 * @Author: 柯军
	 * @datetime:2015年9月21日下午2:55:32
	 **/
	@RequestMapping("/add")
	@ResponseBody
	public ResponseData add(HttpServletRequest request) {
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
		try {
			StatementConfig statementConfig = new StatementConfig();
			BussinessInfo bussinessInfo = new BussinessInfo();
			MapUtils.toObject(statementConfig, map);
			statementConfig.setCreateAt(DateUtil.getCurrDateTime());
			MapUtils.toObject(bussinessInfo, map);
			bussinessInfo.setCreateAt(DateUtil.getCurrDateTime());
			statementConfigService.saveStatementConfigAndInfo(statementConfig, bussinessInfo);
			return ResponseData.success();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ResponseData.failure(CodeEnum.FIAL_CONFIG_LIST.getCodeInt(), CodeEnum.FIAL_CONFIG_LIST.getValueStr());
	}

	/**
	 * @Description: 修改配置
	 * @param request
	 * @param map
	 * @return
	 * @Author: 柯军
	 * @datetime:2015年9月21日下午2:59:22
	 **/
	@RequestMapping("/update")
	@ResponseBody
	public ResponseData update(HttpServletRequest request, @RequestBody Map<String, Object> map) {
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
		return null;
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
		ResponseData result = null;
		try {
			// 获取用户
			String userId = "1";

			logger.info("============ 对账配置批量审核 =============");
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
		logger.info(result.toString());
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
			redisService.set(key, sb.toString());
			redisService.expire(key, 60 * 60 * 48);// 两天后失效
		} catch (Exception e) {
			e.printStackTrace();
		}
		return sb.toString();
	}

	/**
	 * @Description: 定时任务查询符合条件的对账配置
	 * @Author: xgq
	 **/
	@RequestMapping("/selectForSchedule")
	@ResponseBody
	public ResponseData selectForSchedule() {
		try {
			List<StatementConfig> list = statementConfigService.selectForSchedule();
			return ResponseData.success(list);
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseData.failure(CodeEnum.FIAL_CONFIG_LIST.getCodeInt(), CodeEnum.FIAL_CONFIG_LIST.getValueStr());
		}
	}

	/**
	 * @Description: 根据类型，名称模糊搜索
	 * @Author: he
	 **/
	@RequestMapping("/relevance")
	@ResponseBody
	public ResponseData relevance(HttpServletRequest request, @RequestBody Map<String, Object> map) {
		ResponseData result = null;
		try {
			logger.info("============ 类型，名称模糊搜索 =============");
			logger.info(map+"");
			String name = map.containsKey("name") ? map.get("name").toString() : null;
			Integer type = map.containsKey("type") ? Integer.valueOf(map.get("type").toString()) : null;
			Integer currpage = map.get("currpage")!=null?Integer.parseInt(map.get("currpage").toString()):1;
			Integer pagesize = 15;
			if (org.apache.commons.lang.StringUtils.isBlank(name)) {
				return ResponseData.failure(CodeEnum.FIAL_PARAMS_ERROR.getCodeInt(), CodeEnum.FIAL_PARAMS_ERROR.getValueStr());
			}
			Map<String, Object> searchMap = new HashMap<>();
			searchMap.put("currpage", currpage);
			searchMap.put("pagesize", pagesize);
			if (type.intValue()==0){//集团
				searchMap.put("name", name);
				List<MallGroupVO> list =  roaMallGroupService.getMallGroups(searchMap);
				int count = 0;
				if(currpage==1){
					searchMap.put("currpage", null);
					count = roaMallGroupService.getMallGroups(searchMap).size();
 				}
				result = ResponseData.success(list, currpage, pagesize, count);
			}else if(type.intValue()==1){//商场
				searchMap.put("name", name);
				Map<String, Object> resultMap = rOAMallService.getMalls(searchMap, currpage, pagesize);
				//如果当前页为1 查询总记录数
				int count = resultMap.containsKey("totalCount")?Integer.valueOf(resultMap.get("totalCount").toString()):0;
				result = ResponseData.success(resultMap.get("list"), currpage, pagesize, count);
			}else if(type.intValue()==2){//品牌
				searchMap.put("cname", name);
				PagingVO<BrandVO> brands = roaBrandService.getBrandListByMap(searchMap, currpage, pagesize);
				logger.info("brandsCount" + brands.getRowCnt());
				result = ResponseData.success(brands.getDataList(), currpage, pagesize, brands.getRowCnt());
			}else if (type.intValue()==3){//分公司
				searchMap.put("name", name);
				List<FilialeVo> list = rOAFilialeService.getFilialeList(searchMap, currpage, pagesize);
				int totalCount = rOAFilialeService.getFilialeList(searchMap, 0,0).size();
				result = ResponseData.success(list, currpage, pagesize, totalCount);
			}else if (type.intValue()==4){//店铺
				searchMap.put("shopName", name);
				searchMap.put("sort", "noSort");//暂未定排序字段
				Map<String, Object> resultMap = roaShopService.getShops(searchMap, currpage, pagesize);
				logger.info("此次查询关联店铺数"+resultMap.get("totalCount"));
				List<ShopVO> list = (List<ShopVO>) resultMap.get("list");
				int count = resultMap.containsKey("totalCount")?Integer.valueOf(resultMap.get("totalCount").toString()):0;
				result = ResponseData.success(list, currpage, pagesize, count);
			}
		} catch (Exception e) {
			e.printStackTrace();
			result = ResponseData.failure(CodeEnum.ERROR_SYSTEM.getCodeInt(), CodeEnum.ERROR_SYSTEM.getValueStr());
		}
		logger.info(result.toString());
		return result;
	}

}
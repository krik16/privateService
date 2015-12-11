/**
 * @Copyright (C),上海容易网电子商务有限公司	
 * @Author: 柯军 
 * @datetime:2015年9月17日上午11:10:16
 * @Description: TODO
 *
 **/

package com.rongyi.settle.service.impl;

import java.util.*;

import com.rongyi.easy.bsoms.entity.UserInfo;
import com.rongyi.easy.roa.entity.MallEntity;
import com.rongyi.easy.roa.vo.ShopVO;
import com.rongyi.easy.settle.entity.ConfigShop;
import com.rongyi.rss.bsoms.IUserInfoService;
import com.rongyi.rss.roa.ROAMallService;
import com.rongyi.rss.roa.ROAShopService;
import com.rongyi.settle.constants.CodeEnum;
import com.rongyi.settle.constants.ConstantEnum;
import com.rongyi.settle.service.ConfigShopService;
import com.rongyi.settle.web.controller.vo.UserInfoVo;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rongyi.core.framework.mybatis.service.impl.BaseServiceImpl;
import com.rongyi.easy.settle.entity.BussinessInfo;
import com.rongyi.easy.settle.entity.OperationLog;
import com.rongyi.easy.settle.entity.StatementConfig;
import com.rongyi.easy.settle.vo.StatementConfigVO;
import com.rongyi.settle.mapper.OperationLogMapper;
import com.rongyi.settle.mapper.StatementConfigMapper;
import com.rongyi.settle.service.BussinessInfoService;
import com.rongyi.settle.service.StatementConfigService;

/**
 * @Author: 柯军
 * @Description: 对账单配置实现
 * @datetime:2015年9月17日上午11:10:16
 * 
 **/
@Service
public class StatementConfigServiceImpl extends BaseServiceImpl implements StatementConfigService {

	private static final String NAMESPACE = "com.rongyi.settle.mapper.StatementConfigMapper";

	private Logger logger = LoggerFactory.getLogger(StatementConfigServiceImpl.class);

	@Autowired
	private OperationLogMapper operationLogMapper;

	@Autowired
	private StatementConfigMapper statementConfigMapper;

	@Autowired
	BussinessInfoService bussinessInfoService;

	@Autowired
	ROAShopService roaShopService;
	@Autowired
	private ROAMallService rOAMallService;

	@Autowired
	private IUserInfoService iUserInfoService;

	@Autowired
	private ConfigShopService configShopService;

	@Override
	public List<StatementConfigVO> selectPageList(Map<String, Object> map, Integer currentPage, Integer pageSize) {
		map.put("currentPage", (currentPage - 1) * pageSize);
		map.put("pageSize", pageSize);
		return this.getBaseDao().selectListBySql(NAMESPACE + ".selectPageList", map);
	}

	@Override
	public Integer selectPageListCount(Map<String, Object> map) {
		return this.getBaseDao().selectOneBySql(NAMESPACE + ".selectPageListCount", map);
	}

	@Override
	public int insert(StatementConfig statementConfig) {
		return this.getBaseDao().insertBySql(NAMESPACE + ".insert", statementConfig);
	}

	@Override
	public void update(StatementConfig statementConfig) {
		this.getBaseDao().updateBySql(NAMESPACE + ".update", statementConfig);
	}

	@Override
	public StatementConfig selectById(Integer id) {
		Map<String, Object> map = new HashMap<>();
		map.put("id", id);
		return this.getBaseDao().selectOneBySql(NAMESPACE + ".selectById", map);
	}

	@Override
	public void saveStatementConfigAndInfo(StatementConfig statementConfig, BussinessInfo bussinessInfo,List<ConfigShop> shopConfigs) {
		insert(statementConfig);
		bussinessInfo.setConfigId(statementConfig.getId());
		bussinessInfoService.insert(bussinessInfo);
		for (ConfigShop configShop :shopConfigs){
			configShop.setConfigId(statementConfig.getId());
			configShopService.insert(configShop);
		}
	}

	@Override
	public List<StatementConfig> selectForSchedule() {
		Map<String, Object> map = new HashMap<>();
		map.put("currentTime", new Date());
		return this.getBaseDao().selectListBySql(NAMESPACE + ".selectForSchedule", map);
	}

	@Override
	public boolean updatePaymentStatusByIds(List<Integer> ids, Integer status, String desc, String userId) {
		boolean result = false;
		try {
			if (CollectionUtils.isNotEmpty(ids) && status != null) {
				Map<String, Object> paramsMap = new HashMap<>();
				paramsMap.put("ids", ids);
				paramsMap.put("status", status);
				statementConfigMapper.updateStatusByIds(paramsMap);
				for (Integer id : ids) {
					saveOperationLog(id, status, desc, userId);
				}
				result = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
			logger.info(e.getMessage());
		}
		return result;
	}

	/**
	 * 插入日志记录
	 * 
	 * @param id
	 * @param status
	 * @param desc
	 * @param userId
	 */
	private void saveOperationLog(Integer id, Integer status, String desc, String userId) {
		OperationLog operatioLog = new OperationLog();
		operatioLog.setCreateUserId(userId);
		operatioLog.setDesc(desc);
		operatioLog.setOperationModel((byte) 0);
		operatioLog.setOperationType(Byte.valueOf(status.toString()));
		operatioLog.setCreateAt(new Date());
		operatioLog.setOperationId(id);
		operatioLog.setIsDelete((byte) 0);
		operationLogMapper.insertSelective(operatioLog);
	}

	@Override
	public StatementConfig selectByRuleCode(String ruleCode) {
		Map<String, Object> map = new HashMap<>();
		map.put("ruleCode", ruleCode);
		return this.getBaseDao().selectOneBySql(NAMESPACE + ".selectByRuleCode", map);
	}

	@Override
	public StatementConfigVO selectConfigInfoById(Integer id) {
		Map<String, Object> map = new HashMap<>();
		map.put("id", id);
		return this.getBaseDao().selectOneBySql(NAMESPACE + ".selectConfigInfoById", map);
	}

	@Override
	public Map<String, Object> validateIsExist(byte cooperateType, byte bussinessType, String bussinessId, List<Byte> statuses, Date effectStartTime, Date effectEndTime, Byte lintType, Map linkMap, Byte linkShopOp ) throws Exception {
		boolean result = false;
		int isOneself;
		linkShopOp = linkShopOp==null?0:linkShopOp;
		List<ConfigShop> shopConfigs = new ArrayList<>();
		Map<String, Object> ReMap = new HashMap<>();
		Map<String, Object> map = new HashMap<>();
		map.put("cooperateType", cooperateType);
		map.put("bussinessType", bussinessType);
		map.put("bussinessId", bussinessId);
		map.put("statuses", statuses);
		map.put("effectStartTime", effectStartTime);
		map.put("effectEndTime", effectEndTime);
		if (lintType==null){
			result = true;
		}else {
			if (lintType==0)
			{
				//全部: 1、验自身
				if (bussinessType==1 || bussinessType==4)
				{//商场、集团
					if (checkConfigExist(map)) {
						logger.info("全部: 1、验自身 ---配置已有");
						ReMap.put("result", true);
						return ReMap;
					}
					isOneself = 1;
					ConfigShop configShop = convertToShopConfig(isOneself, bussinessId, bussinessType,linkShopOp, null, shopConfigs);
					if (configShop==null){
						ReMap.put("result", true);
						ReMap.put("errorMsg", CodeEnum.FIAL_CONFIG_NO_ACCOUNT.getValueStr());
						ReMap.put("errorNo", CodeEnum.FIAL_CONFIG_NO_ACCOUNT.getCodeInt());
						return ReMap;
					}
				}
				//2、全部店铺
				List<ShopVO> shopVOs = getShopIdByParam(bussinessType, bussinessId);
				if (CollectionUtils.isNotEmpty(shopVOs)){
					for (ShopVO shopVO : shopVOs) {
						map.put("shopId", shopVO.getId());
						if (checkConfigExist(map)) {
							ReMap.put("result", true);
							return ReMap;
						}
						isOneself = 0;
						convertToShopConfig(isOneself, shopVO.getId(), bussinessType,linkShopOp, null, shopConfigs );
					}
				}
			}
			else if (lintType==1)
			{
				//自身
				if (bussinessType==1 || bussinessType==4){//商场、集团
					if (checkConfigExist(map)) {
						ReMap.put("result", true);
						return ReMap;
					}
					isOneself = 1;
					ConfigShop configShop = convertToShopConfig(isOneself, bussinessId, bussinessType,linkShopOp, null, shopConfigs);
					if (configShop==null){
						ReMap.put("result", true);
						ReMap.put("errorMsg", CodeEnum.FIAL_CONFIG_NO_ACCOUNT.getValueStr());
						ReMap.put("errorNo", CodeEnum.FIAL_CONFIG_NO_ACCOUNT.getCodeInt());
						return ReMap;
					}
					if (linkMap!=null) {
						Set<String> shopIds = linkMap.keySet();
						for (String shopId : shopIds){
                            map.put("shopId",shopId);
                            if (checkConfigExist(map)) {
                                ReMap.put("result", true);
                                return ReMap;
                            }
                            isOneself = 0;
                            String userAccounts = linkMap.get(shopId).toString();
                            convertToShopConfig(isOneself, shopId, bussinessType,linkShopOp, userAccounts, shopConfigs );
                        }
					}
				}else {
					logger.info("参数错误  //自身");
					ReMap.put("result", true);
					return ReMap;
				}
			}
			else if (lintType==2)
			{
				//部分
				if (linkMap!=null) {
					Set<String> shopIds = linkMap.keySet();
					for (String shopId : shopIds){
                        map.put("shopId",shopId);
                        if (checkConfigExist(map)) {
                            ReMap.put("result", true);
                            return ReMap;
                        }
                        isOneself = 0;
                        String userAccounts = linkMap.get(shopId).toString();
                        convertToShopConfig(isOneself, shopId, bussinessType,linkShopOp, userAccounts, shopConfigs );
                    }
				}else {
					logger.info(" lintType==2 参数错误  //自身");
					ReMap.put("result", true);
					return ReMap;
				}
			}else {
				result = true;
			}
		}
		ReMap.put("result", result);
		ReMap.put("shopConfigs", shopConfigs);
		return ReMap;
	}

	private ConfigShop convertToShopConfig(int isOneself, String id, Byte businessType, Byte linkShopOp, String userAccounts, List<ConfigShop> shopConfigs) {
		ConfigShop shopConfig = null;
		String accounts = "";
		if (isOneself==1){
			//自身
			List<UserInfoVo> userInfoVos =  getAccountInfoByParam(isOneself, Integer.valueOf(businessType), null, id);
			if (CollectionUtils.isNotEmpty(userInfoVos)){
				for (UserInfoVo userInfoVo : userInfoVos){
					if (StringUtils.isBlank(accounts)){
						accounts += userInfoVo.getId();
					}
					else {
						accounts += ", "+ userInfoVo.getId();
					}
				}
				shopConfig = new ConfigShop();
				shopConfig.setUserList(accounts);
				shopConfig.setRealUserList(accounts);
			}else {
				logger.info("================== 查自身 没有账户");
			}
		}else if (isOneself==0){
			if (linkShopOp.intValue()==0){
				shopConfig = new ConfigShop();
				shopConfig.setUserList(userAccounts);
				shopConfig.setRealUserList(userAccounts);
				shopConfig.setShopId(id);
			}else if (linkShopOp.intValue()==1){
				shopConfig = new ConfigShop();
				shopConfig.setUserList(userAccounts);
				shopConfig.setShopId(id);
				List<UserInfoVo> userInfoVos =  getAccountInfoByParam(isOneself, null, 5, id);//目前只有导购
				List<String> allUser = new ArrayList<>();
				if (CollectionUtils.isNotEmpty(userInfoVos)){
					for (UserInfoVo user : userInfoVos){
						allUser.add(user.getId().toString());
					}
				}
				if (StringUtils.isNotBlank(userAccounts)) {
					allUser.removeAll(Arrays.asList(userAccounts.split(",")));
				}
				if (CollectionUtils.isNotEmpty(allUser)) {
					String realUser = allUser.toString();
					shopConfig.setRealUserList(realUser.substring(1,realUser.length()-1));
				}
			}else {
				logger.info(" linkShopOp is error:" +linkShopOp);
			}
		}
		if (shopConfig!=null){
			shopConfigs.add(shopConfig);
		}
		return shopConfig;
	}

	@Override
	public boolean validateNeedPay(String shopId, String userId, Integer guideType) {
		Map<String, Object> map = new HashMap<>();
		map.put("shopId", shopId);
		map.put("status", ConstantEnum.CONFIG_STATUS_1.getCodeInt());
		map.put("nowTime", new Date());
		map.put("userId", userId);
		map.put("linkRole", guideType);//
		return !checkConfigExist(map);
	}

	@Override
	public List<StatementConfig> checkeffectStart(Map<String, Object> paramsMap) {
		return this.getBaseDao().selectListBySql(NAMESPACE + ".selectStatementConfigByMap", paramsMap);
	}

	/**
	 * 判断对账配置是否存在
	 * @param paramsMap
	 * @return
	 */
	private boolean checkConfigExist( Map<String, Object> paramsMap) {
		boolean result = false;
		int count = this.getBaseDao().selectOneBySql(NAMESPACE + ".validateIsExist", paramsMap);
		if (count > 0){
			result = true;
		}
		return result;
	}

	private List<ShopVO> getShopIdByParam(byte bussinessType, String bussinessId) throws Exception {
		Map<String, Object> searchMap = new HashMap<>() ;
		Map reMap;
		List<ShopVO> shopVOs = new ArrayList<>();
		switch (bussinessType){
			case 0: searchMap.put("id", bussinessId); break;
			case 1: searchMap.put("mallId", bussinessId); break;
			case 2: searchMap.put("brandId", bussinessId); break;
			case 3: searchMap.put("filialeId", bussinessId); break;
			case 4:
				List<MallEntity> mallEntities = rOAMallService.getMallEntitysByGroupId(bussinessId);
				List<String> mallIds = new ArrayList<>();
				if (CollectionUtils.isNotEmpty(mallEntities)){
					for (MallEntity mallEntity : mallEntities){
						mallIds.add(mallEntity.getId().toString());
					}
				}
				searchMap.put("zoneIds", mallIds);
				break;
			default: return shopVOs;
		}
		reMap = roaShopService.getShops(searchMap,1,1000);
		shopVOs = (List<ShopVO>) reMap.get("list");
		return shopVOs;
	}

	@Override
	public List<UserInfoVo> getAccountInfoByParam(Integer isOneself, Integer type, Integer guideType, String id ){
		Map<String, Object> paramsMap = new HashMap<>();
		paramsMap.put("isDisabled", 0);
		if (isOneself==1){
			switch (type){
				case 0: paramsMap.put("shopId", id); paramsMap.put("identity", 4); break;
				case 1: paramsMap.put("mallId", id); paramsMap.put("identity", 1); break;
				case 2: paramsMap.put("brandId", id); paramsMap.put("identity", 2); break;
				case 3: paramsMap.put("filialeId", id); paramsMap.put("identity", 3); break;
				case 4: paramsMap.put("groupId", id); paramsMap.put("identity", 0); break;
				default: return null;
			}
		}else if (isOneself==0){
			if (guideType==1) //产品确认该情况（店长+导购）
            {
                List<Integer> identitys = new ArrayList<>();
                identitys.add(5);
                identitys.add(4);
				paramsMap.put("identitys", identitys);
			}
			if (guideType==2){
				paramsMap.put("identity" ,6);
			}
			paramsMap.put("shopId", id);
		}
		List<UserInfo> userInfos = iUserInfoService.getFullUserInfoByRelevanceId(paramsMap);
		List<UserInfoVo> userAccounts = new ArrayList<>();
		if (CollectionUtils.isNotEmpty(userInfos)){
			for (UserInfo userInfo :userInfos){
				UserInfoVo userInfoVo = new UserInfoVo();
				userInfoVo.setId(userInfo.getId());
				userInfoVo.setUserAccount(userInfo.getUserAccount());
				userAccounts.add(userInfoVo);
			}
		}
		return userAccounts;
	}

}

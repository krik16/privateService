/**
 * @Copyright (C),上海容易网电子商务有限公司	
 * @Author: 柯军 
 * @datetime:2015年9月17日上午11:10:16
 * @Description: TODO
 *
 **/

package com.rongyi.settle.service.impl;

import java.util.*;

import com.rongyi.easy.roa.entity.MallEntity;
import com.rongyi.easy.roa.vo.ShopVO;
import com.rongyi.rss.roa.ROAMallGroupService;
import com.rongyi.rss.roa.ROAMallService;
import com.rongyi.rss.roa.ROAShopService;
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
	/**
	 * 判断账号打款配置
	 *
	 * @param id          : 关联id
	 * @param userAccount ： 账号
	 * @return
	 */
	@Override
	public boolean checkUserAccountConfig(String id, String userAccount) throws Exception {
		boolean result = false;
		ShopVO shopVO = roaShopService.getShopVOById(id);
		if (shopVO!=null){//判断所有
//			String
		}

		return result;
	}

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
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("id", id);
		return this.getBaseDao().selectOneBySql(NAMESPACE + ".selectById", map);
	}

	@Override
	public void saveStatementConfigAndInfo(StatementConfig statementConfig, BussinessInfo bussinessInfo) {
		insert(statementConfig);
		bussinessInfo.setConfigId(statementConfig.getId());
		bussinessInfoService.insert(bussinessInfo);
	}

	@Override
	public List<StatementConfig> selectForSchedule() {
		Map<String, Object> map = new HashMap<String, Object>();
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
		operatioLog.setIsDelete(Byte.valueOf((byte) 0));
		operationLogMapper.insertSelective(operatioLog);
	}

	@Override
	public StatementConfig selectByRuleCode(String ruleCode) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("ruleCode", ruleCode);
		return this.getBaseDao().selectOneBySql(NAMESPACE + ".selectByRuleCode", map);
	}

	@Override
	public StatementConfigVO selectConfigInfoById(Integer id) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("id", id);
		return this.getBaseDao().selectOneBySql(NAMESPACE + ".selectConfigInfoById", map);
	}

	@Override
	public boolean validateIsExist(byte cooperateType, byte bussinessType, String bussinessId, byte status, Date effectStartTime, Date effectEndTime, String linkShopId) throws Exception {
		boolean result = false;
		if (StringUtils.isBlank(linkShopId)){
			result = true;
		}else {
			if ("-1".equals(linkShopId)){
				List<ShopVO> shopVOs = getShopIdByParam(bussinessType, bussinessId);
				List<String> shopIds = new ArrayList<>();
				if (CollectionUtils.isNotEmpty(shopVOs)){
					for (ShopVO shopVO : shopVOs) {
						shopIds.add(shopVO.getId());
					}
				}
				for (String shopId : shopIds){
					if (checkShopExist(shopId)){
						result = true;
						break;
					}
				}
			}
			Map<String, Object> map = new HashMap<>();
			map.put("cooperateType", cooperateType);
			map.put("bussinessType", bussinessType);
			map.put("bussinessId", bussinessId);
			map.put("status", status);
			map.put("effectStartTime", effectStartTime);
			map.put("effectEndTime", effectEndTime);
			int count = this.getBaseDao().selectOneBySql(NAMESPACE + ".validateIsExist", map);
			if (count > 0){
				result = true;
//				break;
			}
		}
		return result;
	}

	/**
	 * 验证单签店铺id的对账配置的合法性
	 * @param shopId
	 * @return
	 */
	private boolean checkShopExist(String shopId) {
		return false;
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
}

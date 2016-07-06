/** 
 * @Title: SalesCommissionServiceImpl.java 
 * @Package com.rongyi.tms.service.impl 
 * @Description: TODO
 * @author 郑亦�?  zhengyiliang@rongyi.com
 * @date 2015�?5�?22�? 下午3:48:12 
 * @version V1.0   
 * Copyright (C),上海容易网电子商务有限公�?
 */
package com.rongyi.tms.service.impl;

import com.rongyi.core.common.PagingVO;
import com.rongyi.core.common.util.JsonUtil;
import com.rongyi.core.constant.Constants;
import com.rongyi.core.constant.VirtualAccountEventTypeEnum;
import com.rongyi.core.framework.mybatis.service.impl.BaseServiceImpl;
import com.rongyi.easy.gcc.TransConfigurations;
import com.rongyi.easy.malllife.vo.UserInfoVO;
import com.rongyi.easy.mq.MessageEvent;
import com.rongyi.easy.tms.entity.SalesCommission;
import com.rongyi.easy.tms.entity.SalesCommissionAuditLog;
import com.rongyi.easy.tms.vo.SalesCommissionParam;
import com.rongyi.easy.tms.vo.SalesCommissionVO;
import com.rongyi.rss.malllife.roa.ROARedisService;
import com.rongyi.rss.malllife.roa.user.ROAMalllifeUserService;
import com.rongyi.tms.constants.Constant;
import com.rongyi.tms.moudle.vo.*;
import com.rongyi.tms.mq.Sender;
import com.rongyi.tms.service.SalesCommissionAuditLogService;
import com.rongyi.tms.service.SalesCommissionService;
import com.rongyi.tms.util.ValidateUtil;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.apache.commons.collections.CollectionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.*;

/**
 * @author ZhengYl
 * 
 */
@Service
public class SalesCommissionServiceImpl extends BaseServiceImpl implements SalesCommissionService {
	private static final String NAMESPACE_SALESCOMMISSION = "com.rongyi.tms.mapper.xml.SalesCommissionMapper";

	private static final Logger LOGGER = LoggerFactory.getLogger(SalesCommissionServiceImpl.class);

	@Autowired
	private SalesCommissionAuditLogService logService;

	@Autowired
	private ROAMalllifeUserService roaMalllifeUserService;

	@Autowired
	private ROARedisService roaRedisService;

	@Autowired
	Sender sender;

	/*
	 * (non-Javadoc)
	 * 
	 * @param salesCommission
	 * 
	 * @return
	 * 
	 * @see
	 * com.rongyi.tms.service.SalesCommissionService#insert(com.rongyi.easy.
	 * tms.entity.SalesCommission)
	 */
	@Override
	public int insert(SalesCommission salesCommission) {
		return this.getBaseDao().insertBySql(NAMESPACE_SALESCOMMISSION + ".insert", salesCommission);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @param orderNo
	 * 
	 * @return
	 * 
	 * @see
	 * com.rongyi.tms.service.SalesCommissionService#selectByOrderNo(java.lang
	 * .String)
	 */
	@Override
	public SalesCommission selectByOrderNo(String orderNo) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("orderNo", orderNo);
		return this.getBaseDao().selectOneBySql(NAMESPACE_SALESCOMMISSION + ".selectByOrderNo", map);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @param salesCommission
	 * 
	 * @return
	 * 
	 * @see
	 * com.rongyi.tms.service.SalesCommissionService#updateAll(com.rongyi.easy
	 * .tms.entity.SalesCommission)
	 */
	public int updateByOrderNo(SalesCommission salesCommission) {
		return this.getBaseDao().updateBySql(NAMESPACE_SALESCOMMISSION + ".updateByOrderNo", salesCommission);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @param messageEvent
	 * 
	 * @return
	 * 
	 * @see
	 * com.rongyi.tms.service.SalesCommissionService#addDrawApplyByMQ(com.rongyi
	 * .tms.mq.MessageEvent)
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Map<String, Object> addCommissionByMQ(MessageEvent messageEvent) {
		Map<String, Object> resultMap = new HashMap<String, Object>();
		try {
			Map<String, Object> bodyMap = JsonUtil.getMapFromJson(messageEvent.getBody().toString());
			if (bodyMap != null) {
				MQCommissionParam mqCommissionParam = MQCommissionParam.mapToEntity(bodyMap);

				// 查数据库中是否有此订单的记录（因小票上传而产生）
				SalesCommission salesCommission = selectByOrderNo(mqCommissionParam.getOrderNo());
				if (salesCommission == null)
					salesCommission = new SalesCommission();

				// 传入的佣金数
				salesCommission.setCommissionAmount(mqCommissionParam.getCommissionAmount());
				salesCommission.setGuideId(mqCommissionParam.getGuideId());
				salesCommission.setOrderNo(mqCommissionParam.getOrderNo());
				salesCommission.setGuideType(mqCommissionParam.getGuideType());
				String buyerId = mqCommissionParam.getBuyerId();
				LOGGER.debug("[Commission Add] buyerId: " + buyerId);
				if (buyerId != null) {
					UserInfoVO user = roaMalllifeUserService.getByUid(buyerId);
					if (user != null) {
						salesCommission.setBuyerAccount(user.getUserPhone());
					}
				}

				if (salesCommission.getId() != null) {
					if(salesCommission.getCommissionAmount().compareTo(BigDecimal.ZERO) < 1){
						salesCommission.setStatus(5);
					}
					// 记录存在，在佣金生成前已上传过小票
					updateByOrderNo(salesCommission);
				} else {
					// 记录不存在，未传过小票
					salesCommission.setStatus(0);
					if(salesCommission.getCommissionAmount().compareTo(BigDecimal.ZERO) < 1){
						salesCommission.setStatus(5);
					}
					insert(salesCommission);
				}
			}
		} catch (Exception e) {
			LOGGER.error(e.getMessage());
			e.printStackTrace();
		}

		return resultMap;
	}

	/**
	 * Description
	 * 
	 * @param params
	 * @return
	 * @see com.rongyi.tms.service.SalesCommissionService#(java.util.Map)
	 */

	@Override
	public PagingVO<SalesCommissionVO> findByPage(SalesCommissionParam params) {
		Map<String, Object> parameterMap = params.paramsToMap();
		int count = this.getBaseDao().count(NAMESPACE_SALESCOMMISSION + ".selectAllInfoCount", parameterMap);
		List<SalesCommissionVO> commissions = this.getBaseDao().selectListBySql(NAMESPACE_SALESCOMMISSION + ".selectAllInfoByPage", parameterMap);
		PagingVO<SalesCommissionVO> pagingVO = new PagingVO<SalesCommissionVO>(params.getPageSize(), params.getPage(), count);
		pagingVO.setDataList(commissions);
		return pagingVO;
	}

	/**
	 * Description
	 * 
	 * @param id
	 * @return
	 * @see SalesCommissionService#selectOneById(int)
	 */

	@Override
	public SalesCommissionVO selectOneById(int id) {
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("id", id);
		return this.getBaseDao().selectOneBySql(NAMESPACE_SALESCOMMISSION + ".selectOneById", params);
	}

	/**
	 * Description
	 * 
	 * @return
	 * @see com.rongyi.tms.service.SalesCommissionService#(java.util.List)
	 */

	@Override
	public int updateBatch(CheckParam param, String user) {
//		TransConfigurations transConf;
//		if (param.getGuideType()!=null&&param.getGuideType()==2) {
//			//买手
//			transConf = roaRedisService.get(Constants.ConfigType.BUYER_TRANS_CONFIGURATIONS,TransConfigurations.class);
//		}else {
//			//前端传0表表示无渠道类型，默认查商家类型
//			if (param.getGuideType()!=null && param.getGuideType()==0)
//				param.setGuideType(1);
//			transConf = roaRedisService.get(Constants.ConfigType.TRANS_CONFIGURATIONS,TransConfigurations.class);
//		}
//		if (transConf==null) {
//			transConf = new TransConfigurations();
//		}
//		LOGGER.info("读取的参数为:" + transConf.getCommissionCountMax());
		Map<String, Object> searchMap = new HashMap<>();
		String[] ids = param.getIds().trim().split(",");
		searchMap.put("ids",ids);
		List<SalesCommissionVO> salesCommissionVOs = this.getBaseDao().selectListBySql(NAMESPACE_SALESCOMMISSION + ".selectOneById", searchMap);
		int result = 0;
		if (CollectionUtils.isNotEmpty(salesCommissionVOs)){
			for (SalesCommissionVO vo : salesCommissionVOs){
				Map<String, Object> paramsMap = param.paramToMap();
				paramsMap.put("guideId",vo.getGuideId());
				paramsMap.put("buyerId",vo.getBuyerId());
//				Integer dailyCount = this.getBaseDao().selectOneBySql(NAMESPACE_SALESCOMMISSION + ".selectDailyCount", paramsMap);
//				if (dailyCount==null)
//					dailyCount=0;
				searchMap.put("id", vo.getId());
				searchMap.put("status", param.getStatus());
//				if (dailyCount<=transConf.getCommissionCountMax()){
//				}else {
//					searchMap.put("status", 5);
//				}
				LOGGER.info("searchMap: "+searchMap.toString());
				int updateResult =  this.getBaseDao().updateBySql(NAMESPACE_SALESCOMMISSION + ".updateStatus", searchMap);
				if (updateResult>0)
					result++;
			}
		}
		if (result > 0) {
			for (Integer id : (ValidateUtil.StringToIntList(param.getIds()))) {
				SalesCommissionAuditLog auditLog = new SalesCommissionAuditLog();
				auditLog.setCreateAt(new Date());
				auditLog.setAuditUserId(user);
				auditLog.setSalesCommissionId(id);
				auditLog.setOperateBiz(param.getOperateBiz());
				if (param.getStatus() == -1 || param.getStatus() == -2)
					auditLog.setMemo(param.getReason());
				logService.createCommissionAuditLog(auditLog);
			}
			LOGGER.info(param.getStatus() > 0 ? param.getStatus() + "级审核操作通过" : (-param.getStatus() + "级审核未通过"));
			return 1;
		} else {
			return -1;
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @param userId
	 * 
	 * @return
	 * 
	 * @see
	 * com.rongyi.tms.service.SalesCommissionService#selectCommissionInfo(java
	 * .lang.String)
	 */
	@Override
	public CommissionInfoVO selectCommissionInfo(String userId) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("userId", userId);
		return this.getBaseDao().selectOneBySql(NAMESPACE_SALESCOMMISSION + ".selectCommissionInfoByUserId", map);
	}


	/**
	 *
	 * @param guideType: 渠道：买手-2\商家-1
	 * @see SalesCommissionService#statisticsCommissionAmountTrigger(Integer guideType)
	 */
	@Override
	public void statisticsCommissionAmountTrigger(Integer guideType) {
		Map<String,Object> paramsMap = new HashMap<>();
		paramsMap.put("guideType", guideType);
		List<CommissionAmountTotalVO> vos = this.getBaseDao().selectListBySql(NAMESPACE_SALESCOMMISSION + ".commissionAmountTotal", paramsMap);
		LOGGER.info("查询到需要发送到  VA 的记录数为：" + vos.size()+",guideType="+guideType);
		if (!vos.isEmpty()) {
			// 每次MQ 消息发送多发，每次50条记录，超过50的话，分次发送
			int times = vos.size() % Constant.SENDSIZE.SIZE == 0 ? vos.size() / Constant.SENDSIZE.SIZE : (vos.size() / Constant.SENDSIZE.SIZE + 1);
			LOGGER.info("times:" + times);
			for (int i = 0; i < times; i++) {
				long version = UUID.randomUUID().getMostSignificantBits();
				LOGGER.info("version:" + version);
				List<CommissionAmountTotalVO> newList;
				if ((vos.size() - i * Constant.SENDSIZE.SIZE) > Constant.SENDSIZE.SIZE) {
					newList = vos.subList(i * Constant.SENDSIZE.SIZE, (i + 1) * Constant.SENDSIZE.SIZE);
				} else {
					newList = vos.subList(i * Constant.SENDSIZE.SIZE, vos.size());
				}
				int updateResult = this.updateBatchHadSendedVA(newList, version);
				LOGGER.info("updateResult size={}",updateResult);
				if (updateResult > 0) {
					try {
						Thread.sleep(2000);//防止数据库未更新完成等待2s再去查询要打款的佣金
					}catch (Exception e){
						LOGGER.warn("ignore this exception ...");
					}
					LOGGER.info("更新成功，发送消息到 va");
					Map<String, Object> paramMap = new HashMap<>();
					Map<String, Object> bodyMap = new HashMap<>();
					paramMap.put("version", version);
					JSONArray array = new JSONArray();
					List<CommissionAmountTotalVO> commissions = this.getBaseDao().selectListBySql(NAMESPACE_SALESCOMMISSION + ".commissionAmountTotalByVersion", paramMap);
					LOGGER.info("commissionSize={}",commissions.size());
					for (CommissionAmountTotalVO commission : commissions) {
						JSONObject jsonObject = JSONObject.fromObject(commission);
						array.add(jsonObject);
					}
					bodyMap.put("detailList", array);
					LOGGER.info("array={}",array);
					MessageEvent event = MessageEvent.getMessageEvent(bodyMap, "tms", "va", VirtualAccountEventTypeEnum.COMMISSION_BATCH_POST.getCode());
					sender.convertAndSend(event);
				} else {
					LOGGER.info("更新失败");
				}
			}
		} else {
			LOGGER.info("定时查询总金额没有查询到数据");
		}

	}

	/**
	 * Description
	 * 
	 * @param param
	 * @return
	 * @see SalesCommissionService#findBonusByPage(BonusPageParam)
	 */

	@Override
	public SalesCommission findBonusByPage(BonusPageParam param) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * Description
	 * 
	 * @param id
	 * @return
	 * @see SalesCommissionService#getUserAccountById(Integer)
	 */

	@Override
	public String getUserAccountById(Integer id) {
		Map<String, Object> parameterMap = new HashMap<String, Object>();
		parameterMap.put("userId", id);
		return this.getBaseDao().selectOneBySql(NAMESPACE_SALESCOMMISSION + ".selectUserPhoneByUserId", parameterMap);
	}

	/**
	 * Description
	 * 
	 * @param account
	 * @return
	 * @see SalesCommissionService#getUserIdByUserAccount(String)
	 */

	@Override
	public Integer getUserIdByUserAccount(String account) {
		// TODO Auto-generated method stub
		Map<String, Object> parameterMap = new HashMap<String, Object>();
		parameterMap.put("userPhone", account);
		return this.getBaseDao().selectOneBySql(NAMESPACE_SALESCOMMISSION + ".selectUserIdByUserAccount", parameterMap);
	}

	/**
	 * Description
	 * 
	 * @param commission
	 * @return
	 * @see SalesCommissionService#updateBonus(SalesCommission)
	 */

	@Override
	public int updateBonus(SalesCommission commission) {
		if (commission.getId() == null) {
			return this.getBaseDao().insertBySql(NAMESPACE_SALESCOMMISSION + ".insertBonus", commission);
		} else {
			return this.getBaseDao().updateBySql(NAMESPACE_SALESCOMMISSION + ".updateByPrimaryKey", commission);
		}
	}

	@Override
	public int updateBatchHadSendedVA(List<CommissionAmountTotalVO> ids, long version) {
		Map<String, Object> paramsMap = new HashMap<String, Object>();
		int count = 0;
		for (CommissionAmountTotalVO commissionAmountTotalVO : ids) {
			paramsMap.put("guideId", commissionAmountTotalVO.getGuideId());
			paramsMap.put("oldVersion", commissionAmountTotalVO.getVersion());
			paramsMap.put("version", version);
			this.getBaseDao().updateBySql(NAMESPACE_SALESCOMMISSION + ".updateSendVA", paramsMap);
			count++;
		}
		return count;
	}

	@Override
	public CommissionInfoVO selectFaleCommission(String userId) {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("userId", userId);
		return this.getBaseDao().selectOneBySql(NAMESPACE_SALESCOMMISSION + ".selectFaleCommission", paramMap);
	}

	@Override
	public void statisticsCheckLimitTrigger() {
		LOGGER.info("定时任务自动处理昨日超上限的返佣记录开始");
		List<SalesCommission> list = selectYesterdayGuideInfo();
		for(SalesCommission salesCommission :list){
			calcCommissioinLimit(salesCommission.getGuideId(),salesCommission.getGuideType());
		}
		LOGGER.info("定时任务自动处理昨日超上限的返佣记录结束");
	}


	@Override
	public void calcCommissioinLimit(String guideId,Integer guideType){
		LOGGER.info("计算需处理的超上限的返佣记录,guideId={},guideType={}",guideId,guideType);
		List<SalesCommissionVO> resultList = new ArrayList<>();//需要显示的待审核佣金记录
		List<SalesCommissionVO> overLimitList = new ArrayList<>();//超出限制的佣金记录
		TransConfigurations transConfigurations;
		if(guideType == 1) {
			transConfigurations = roaRedisService.get(Constants.ConfigType.BUYER_TRANS_CONFIGURATIONS, TransConfigurations.class);
		}else{
			transConfigurations = roaRedisService.get(Constants.ConfigType.BUYER_CONFIGURATIONS, TransConfigurations.class);
		}
		LOGGER.info("countMax={},dailyMax={}",transConfigurations.getCommissionCountMax(),transConfigurations.getCommissionDailyMax());
		//查询出该导购/买手在昨天的所有佣金记录
		List<SalesCommissionVO> list = this.selectGuideYesterdayCommission(guideId, guideType);
		//买手id对应返佣记录map
		Map<String,List<SalesCommissionVO>> map = new HashMap<>();
		for (SalesCommissionVO salesCommissionVO : list){
			if(map.containsKey(salesCommissionVO.getBuyerId())){//如果key存在map则加进去
				map.get(salesCommissionVO.getBuyerId()).add(salesCommissionVO);
			}else{//不存在，新建key
				List<SalesCommissionVO> salesCommissionVOList = new ArrayList<>();
				salesCommissionVOList.add(salesCommissionVO);
				map.put(salesCommissionVO.getBuyerId(),salesCommissionVOList);
			}
		}
		//导购对应的每个买家的佣金记录数
		List<SalesCommissionVO> buyerCommissionList;
		for(String key :map.keySet()){
			buyerCommissionList = map.get(key);
			//如果超出每天同一买家限制次数上限则丢弃超出部分
			if(transConfigurations.getCommissionCountMax() < buyerCommissionList.size()){
				overLimitList.addAll(buyerCommissionList.subList(transConfigurations.getCommissionCountMax(),buyerCommissionList.size()));
				buyerCommissionList = buyerCommissionList.subList(0,transConfigurations.getCommissionCountMax());
			}
			resultList.addAll(buyerCommissionList);
		}
		if(transConfigurations.getCommissionDailyMax() < resultList.size()){
//			resultList.subList(0,transConfigurations.getCommissionDailyMax());
			Collections.sort(resultList);//按佣金金额倒叙
			overLimitList.addAll(resultList.subList(transConfigurations.getCommissionDailyMax(), resultList.size()));
		}

		Map<String,Object> paramMap = new HashMap<>();
		for(SalesCommissionVO salesCommissionVO :overLimitList){
			paramMap.put("id",salesCommissionVO.getId());
			paramMap.put("status", 5);
			updateStatus(paramMap);
		}
		LOGGER.info("昨日guideId={}的用户超上限佣金记录为overLimitList={}",guideId,overLimitList);
	}

	@Override
	public List<SalesCommissionVO> selectGuideYesterdayCommission(String guideId,Integer guideType) {
		Map<String, Object> paramMap = new HashMap<>();
		paramMap.put("guideId", guideId);
		paramMap.put("guideType", guideType);
		return this.getBaseDao().selectListBySql(NAMESPACE_SALESCOMMISSION + ".selectGuideYesterdayCommission", paramMap);
	}

	/**
	 *按导购id分组查询昨天返佣的导购信息
	 * @return list
	 */
	private List<SalesCommission> selectYesterdayGuideInfo() {
		return this.getBaseDao().selectListBySql(NAMESPACE_SALESCOMMISSION + ".selectYesterdayGuideInfo");
	}

	private void updateStatus(Map<String,Object> paramMap){
		this.getBaseDao().updateBySql(NAMESPACE_SALESCOMMISSION + ".updateStatus", paramMap);
	}
}

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

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rongyi.core.common.PagingVO;
import com.rongyi.core.common.util.JsonUtil;
import com.rongyi.core.constant.VirtualAccountEventTypeEnum;
import com.rongyi.core.framework.mybatis.service.impl.BaseServiceImpl;
import com.rongyi.easy.gcc.TransConfigurations;
import com.rongyi.easy.malllife.vo.UserInfoVO;
import com.rongyi.easy.mq.MessageEvent;
import com.rongyi.easy.tms.entity.SalesCommission;
import com.rongyi.easy.tms.entity.SalesCommissionAuditLog;
import com.rongyi.easy.tms.vo.SalesCommissionParam;
import com.rongyi.easy.tms.vo.SalesCommissionVO;
import com.rongyi.rss.gcc.RmmmSettingsService;
import com.rongyi.rss.malllife.roa.user.ROAMalllifeUserService;
import com.rongyi.tms.constants.Constant;
import com.rongyi.tms.moudle.vo.BonusPageParam;
import com.rongyi.tms.moudle.vo.CheckParam;
import com.rongyi.tms.moudle.vo.CommissionAmountTotalVO;
import com.rongyi.tms.moudle.vo.CommissionInfoVO;
import com.rongyi.tms.moudle.vo.MQCommissionParam;
import com.rongyi.tms.mq.Sender;
import com.rongyi.tms.service.SalesCommissionAuditLogService;
import com.rongyi.tms.service.SalesCommissionService;
import com.rongyi.tms.util.ValidateUtil;

/**
 * @author ZhengYl
 * 
 */
@Service
public class SalesCommissionServiceImpl extends BaseServiceImpl implements SalesCommissionService {
	private static final String NAMESPACE_SALESCOMMISSION = "com.rongyi.tms.mapper.xml.SalesCommissionMapper";

	private static final Logger LOGGER = Logger.getLogger(SalesCommissionServiceImpl.class);

	@Autowired
	private SalesCommissionAuditLogService logService;

	@Autowired
	private ROAMalllifeUserService roaMalllifeUserService;

	@Autowired
	private RmmmSettingsService rmmmSettingsService;

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

				// �?查数据库中是否有此订单的记录（因小票上传而产生）
				SalesCommission salesCommission = selectByOrderNo(mqCommissionParam.getOrderNo());
				if (salesCommission == null)
					salesCommission = new SalesCommission();

				// 传入的佣金数�?
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
					// 记录存在，在佣金生成前已上传过小�?
					updateByOrderNo(salesCommission);
				} else {
					// 记录不存在，未传过小�?
					salesCommission.setStatus(0);
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
	 */

	@Override
	public int updateBatch(CheckParam param, String user) {
		Map<String, Object> paramsMap = param.paramToMap();
		TransConfigurations transConf = rmmmSettingsService.getLatestTransConfigurations();
		LOGGER.info("读取的参数为�?" + transConf.getCommissionCountMax());
		paramsMap.put("guideType", param.getGuideType());
		if (param.getGuideType()==2) {
			//买手
			paramsMap.put("max_commission_times", transConf.getMaiShouCommissionCountMax() == 0 ? 5 : transConf.getMaiShouCommissionCountMax());
		}else {
			//导购
			paramsMap.put("max_commission_times", transConf.getCommissionCountMax() == 0 ? 5 : transConf.getCommissionCountMax());
		}
		LOGGER.info("MAP:" + paramsMap);
		int result = this.getBaseDao().updateBySql(NAMESPACE_SALESCOMMISSION + ".batchUpdate", paramsMap);
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
			LOGGER.info(param.getStatus() > 0 ? param.getStatus() + "级审核操作�?�过" : (-param.getStatus() + "级审核未通过"));
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
	 * Description
	 * 
	 * @see SalesCommissionService#statisticsCommissionAmountTrigger()
	 */

	@Override
	public void statisticsCommissionAmountTrigger() {
		List<CommissionAmountTotalVO> vos = this.getBaseDao().selectListBySql(NAMESPACE_SALESCOMMISSION + ".commissionAmountTotal");
		LOGGER.info("查询到需要发送到  VA 的记录数为：" + vos.size());
		if (!vos.isEmpty()) {
			// 每次MQ 消息�?多发�?50条记录，超过50的话，分次发�?
			int times = vos.size() % Constant.SENDSIZE.SIZE == 0 ? vos.size() / Constant.SENDSIZE.SIZE : (vos.size() / Constant.SENDSIZE.SIZE + 1);
			LOGGER.info("times:" + times);
			for (int i = 0; i < times; i++) {
				long version = UUID.randomUUID().getMostSignificantBits();
				LOGGER.info("version:" + version);
				List<CommissionAmountTotalVO> newList = new ArrayList<CommissionAmountTotalVO>();
				if ((vos.size() - i * Constant.SENDSIZE.SIZE) > Constant.SENDSIZE.SIZE) {
					newList = vos.subList(i * Constant.SENDSIZE.SIZE, (i + 1) * Constant.SENDSIZE.SIZE);
				} else {
					newList = vos.subList(i * Constant.SENDSIZE.SIZE, vos.size());
				}
				int updateResult = this.updateBatchHadSendedVA(newList, version);
				LOGGER.info(updateResult);
				if (updateResult > 0) {
					LOGGER.info("更新成功，发送消息到 va");
					Map<String, Object> paramMap = new HashMap<String, Object>();
					Map<String, Object> bodyMap = new HashMap<String, Object>();
					paramMap.put("version", version);
					JSONArray array = new JSONArray();
					List<CommissionAmountTotalVO> commissions = this.getBaseDao().selectListBySql(NAMESPACE_SALESCOMMISSION + ".commissionAmountTotalByVersion", paramMap);
					for (CommissionAmountTotalVO commission : commissions) {
						JSONObject jsonObject = JSONObject.fromObject(commission);
						array.add(jsonObject);
					}
					bodyMap.put("detailList", array);
					LOGGER.info(array);
					MessageEvent event = MessageEvent.getMessageEvent(bodyMap, "tms", "va", VirtualAccountEventTypeEnum.COMMISSION_BATCH_POST.getCode());
					sender.convertAndSend(event);
				} else {
					LOGGER.info("更新失败�?");
				}
			}
		} else {
			LOGGER.info("定时查询总金额没有查询到数据�?");
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
}

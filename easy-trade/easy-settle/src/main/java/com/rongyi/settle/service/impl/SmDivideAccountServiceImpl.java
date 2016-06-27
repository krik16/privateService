package com.rongyi.settle.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rongyi.easy.rpb.dto.DivideAccountDto;
import com.rongyi.easy.settle.entity.SmDivideAccount;
import com.rongyi.easy.settle.entity.SmDivideAccountDetail;
import com.rongyi.settle.constants.DivideAccountConstant;
import com.rongyi.settle.mapper.SmDivideAccountDetailMapper;
import com.rongyi.settle.mapper.SmDivideAccountMapper;
import com.rongyi.settle.service.SmDivideAccountService;
import com.rongyi.settle.util.DateUtils;
import com.rongyi.settle.vo.DivideAccountVo;

@Service
public class SmDivideAccountServiceImpl implements SmDivideAccountService {

	@Autowired
	private SmDivideAccountMapper smDivideAccountMapper;
	
	@Autowired
	private SmDivideAccountDetailMapper smDivideAccountDetailMapper;

	/**
	 * @see com.rongyi.settle.service.DivideAccountService#findPageList(com.rongyi.settle.dto.DivideAccountDto)
	 */
	public List<DivideAccountVo> findPageList(DivideAccountDto divideAccountDto) {
		return smDivideAccountMapper.findPageList(divideAccountDto);
	}

	/**
	 * @see com.rongyi.settle.service.SmDivideAccountService#findDetailPageList(com.rongyi.easy.rpb.dto.DivideAccountDto)
	 */
	public List<DivideAccountVo> findDetailPageList(DivideAccountDto divideAccountDto) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * @see com.rongyi.settle.service.SmDivideAccountService#generateDivideAccount()
	 */
	public void generateDivideAccount() {
		Date date = DateUtils.formatDate(new Date());
		DivideAccountDto divideAccountDto = new DivideAccountDto();
		divideAccountDto.setAccountDate(date);
		// 查询前一天B端商品订单
		List<DivideAccountVo> productOrderList = this.initProductOrderList(divideAccountDto);
		// 查询前一天B端卡券订单
		List<DivideAccountVo> tradeOrderList = this.initTradeOrderList(divideAccountDto);
		// 筛选出非通用券订单
		tradeOrderList = this.getNoUniveralCouponList(tradeOrderList);
		// 合并商品订单、卡券订单
		productOrderList.addAll(tradeOrderList);
		// for循环结果集，增加分账记录、分账详情记录
		this.addSmDivideAccount(productOrderList);
	}

	/**
	 * @Description 调用卡券接口，筛选出非通用券订单
	 * @param divideAccountVoList
	 */
	private List<DivideAccountVo> getNoUniveralCouponList(List<DivideAccountVo> divideAccountVoList) {
		List<DivideAccountVo> resultList = new ArrayList<>();
		// 筛选非通用券订单
		if (CollectionUtils.isNotEmpty(divideAccountVoList)) {
			Map<String, DivideAccountVo> divideAccountMap = new HashMap<>();
			List<String> couponIdList = new ArrayList<>();
			for (DivideAccountVo vo : divideAccountVoList) {
				if (null != vo && null != vo.getCouponId()) {
					String couponId = vo.getCouponId();
					couponIdList.add(couponId);
					divideAccountMap.put(couponId, vo);
				}
			}

			if (CollectionUtils.isNotEmpty(couponIdList)) {
				// TODO 调用接口判断非通用券
				List<String> couponList = null;
				for (String coupon : couponList) {
					if (divideAccountMap.containsKey(coupon)) {
						resultList.add(divideAccountMap.get(coupon));
					}
				}
			}
		}
		return resultList;
	}

	/**
	 * @Description 填充分账记录, 分账详情记录
	 * @param divideAccountVo
	 * @param accountMap
	 * @param accountDetailMap
	 */
	private void fillDivideAccountMap(Date billDate, String billBatchNo, DivideAccountVo divideAccountVo,
			Map<Integer, SmDivideAccount> accountMap, Map<Integer, List<SmDivideAccountDetail>> accountDetailMap) {
		Integer mallId = divideAccountVo.getMallId();
		SmDivideAccount smDivideAccount = null;
		List<SmDivideAccountDetail> detailList = null;
		if (!accountMap.containsKey(mallId)) {
			smDivideAccount = this.initSmDivideAccount(billDate, billBatchNo, divideAccountVo);// 初始化分账信息
			detailList = this.initSmDivdeAccountDetail(billDate, billBatchNo, divideAccountVo);// 初始化分账详情信息
		} else {
			smDivideAccount = accountMap.get(mallId);
			this.replaceSmDivideAccount(divideAccountVo, smDivideAccount);// 更新分账详情信息

			detailList = accountDetailMap.get(mallId);
			this.replaceSmDivideAccountDetail(divideAccountVo, detailList);// 更新分账详情信息
		}
		accountMap.put(mallId, smDivideAccount);
		accountDetailMap.put(mallId, detailList);
	}

	/**
	 * @Description 初始化分账信息
	 * @param divideAccountVo
	 * @return
	 */
	private SmDivideAccount initSmDivideAccount(Date billDate, String billBatchNo, DivideAccountVo divideAccountVo) {
		SmDivideAccount smDivideAccount = new SmDivideAccount();
		smDivideAccount.setMallId(divideAccountVo.getMallId());
		smDivideAccount.setOrderNum(DivideAccountConstant.ORDER_NUM);
		smDivideAccount.setBillBatchNo(billBatchNo);
		smDivideAccount.setBillDate(billDate);
		if (DivideAccountConstant.ORDER_TYPE_PRODUCT.equals(divideAccountVo.getOrderType())) {// 商品订单
			smDivideAccount.setUnitNum(divideAccountVo.getTotalQuantity());// 商品数量
			smDivideAccount.setPayAmount(divideAccountVo.getTotalAmount());// 支付金额
		} else if (DivideAccountConstant.ORDER_TYPE_TRADE.equals(divideAccountVo.getOrderType())) {// 卡券订单
			smDivideAccount.setUnitNum(DivideAccountConstant.UNIT_NUM);// 系统无法区分每次核销了几张卡券，因此默认每使用一次卡券，都单独是一次核销
			smDivideAccount.setPayAmount(divideAccountVo.getUnitPrice());// 支付金额，每使用一次卡券都是一次核销，所以金额就是单价
		}
		return smDivideAccount;
	}

	/**
	 * @Description 初始化分账详情信息
	 * @param divideAccountVo
	 * @return
	 */
	private List<SmDivideAccountDetail> initSmDivdeAccountDetail(Date billDate, String billBatchNo,
			DivideAccountVo divideAccountVo) {
		List<SmDivideAccountDetail> smDivideAccountDetailList = new ArrayList<>();
		SmDivideAccountDetail smDivideAccountDetail = new SmDivideAccountDetail();
		smDivideAccountDetail.setMallId(divideAccountVo.getMallId());
		smDivideAccountDetail.setShopId(divideAccountVo.getShopId());
		smDivideAccountDetail.setOrderNum(DivideAccountConstant.ORDER_NUM);
		smDivideAccountDetail.setBillBatchNo(billBatchNo);
		smDivideAccountDetail.setBillDate(billDate);
		if (DivideAccountConstant.ORDER_TYPE_PRODUCT.equals(divideAccountVo.getOrderType())) {// 商品订单
			smDivideAccountDetail.setUnitNum(divideAccountVo.getTotalQuantity());// 商品数量
			smDivideAccountDetail.setPayAmount(divideAccountVo.getTotalAmount());// 支付金额
		} else if (DivideAccountConstant.ORDER_TYPE_TRADE.equals(divideAccountVo.getOrderType())) {// 卡券订单
			smDivideAccountDetail.setUnitNum(DivideAccountConstant.UNIT_NUM);// 系统无法区分每次核销了几张卡券，因此默认每使用一次卡券，都单独是一次核销
			smDivideAccountDetail.setPayAmount(divideAccountVo.getUnitPrice());// 支付金额，每使用一次卡券都是一次核销，所以金额就是单价
		}
		smDivideAccountDetailList.add(smDivideAccountDetail);
		return smDivideAccountDetailList;
	}

	/**
	 * @Description 添加分账信息
	 * @param divideAccountVo
	 * @param smDivideAccount
	 */
	private void replaceSmDivideAccount(DivideAccountVo divideAccountVo, SmDivideAccount smDivideAccount) {
		smDivideAccount.setOrderNum(smDivideAccount.getOrderNum() + DivideAccountConstant.ORDER_NUM);// 订单数自增
		if (DivideAccountConstant.ORDER_TYPE_PRODUCT.equals(divideAccountVo.getOrderType())) {// 商品订单
			smDivideAccount.setPayAmount(smDivideAccount.getPayAmount() + divideAccountVo.getTotalAmount());// 支付金额
			smDivideAccount.setUnitNum(smDivideAccount.getUnitNum() + divideAccountVo.getTotalQuantity());
		} else if (DivideAccountConstant.ORDER_TYPE_TRADE.equals(divideAccountVo.getOrderType())) {// 卡券订单
			smDivideAccount.setPayAmount(smDivideAccount.getPayAmount() + divideAccountVo.getUnitPrice());
			smDivideAccount.setUnitNum(smDivideAccount.getUnitNum() + DivideAccountConstant.UNIT_NUM);
		}
	}

	/**
	 * @Description 添加分账详情信息
	 * @param divideAccountVo
	 * @param detailList
	 */
	private void replaceSmDivideAccountDetail(DivideAccountVo divideAccountVo, List<SmDivideAccountDetail> detailList) {
		Integer shopId = divideAccountVo.getShopId();
		SmDivideAccountDetail smDivideAccountDetail;
		Map<Integer, SmDivideAccountDetail> detailMap = new HashMap<>();
		for (SmDivideAccountDetail detail : detailList) {
			if (null != detail && null != detail.getShopId()) {
				detailMap.put(detail.getShopId(), detail);
			}
		}
		if (!detailMap.containsKey(shopId)) {
			smDivideAccountDetail = new SmDivideAccountDetail();
			smDivideAccountDetail.setMallId(divideAccountVo.getMallId());
			smDivideAccountDetail.setShopId(shopId);
			smDivideAccountDetail.setOrderNum(DivideAccountConstant.ORDER_NUM);
			if (DivideAccountConstant.ORDER_TYPE_PRODUCT.equals(divideAccountVo.getOrderType())) {// 商品订单
				smDivideAccountDetail.setPayAmount(divideAccountVo.getTotalAmount());
				smDivideAccountDetail.setUnitNum(divideAccountVo.getTotalQuantity());
			} else if (DivideAccountConstant.ORDER_TYPE_TRADE.equals(divideAccountVo.getOrderType())) {// 卡券订单
				smDivideAccountDetail.setPayAmount(divideAccountVo.getTotalAmount());
				smDivideAccountDetail.setUnitNum(DivideAccountConstant.UNIT_NUM);
			}
			detailList.add(smDivideAccountDetail);
		} else {
			smDivideAccountDetail = detailMap.get(shopId);
			if (DivideAccountConstant.ORDER_TYPE_PRODUCT.equals(divideAccountVo.getOrderType())) {// 商品订单
				smDivideAccountDetail
						.setPayAmount(smDivideAccountDetail.getPayAmount() + divideAccountVo.getTotalAmount());
				smDivideAccountDetail
						.setUnitNum(smDivideAccountDetail.getUnitNum() + divideAccountVo.getTotalQuantity());
			} else if (DivideAccountConstant.ORDER_TYPE_TRADE.equals(divideAccountVo.getOrderType())) {// 卡券订单
				smDivideAccountDetail
						.setPayAmount(smDivideAccountDetail.getPayAmount() + divideAccountVo.getTotalAmount());
				smDivideAccountDetail.setUnitNum(smDivideAccountDetail.getUnitNum() + DivideAccountConstant.UNIT_NUM);
			}
			detailMap.put(shopId, smDivideAccountDetail);

			detailList = new ArrayList<>(detailMap.values());
		}
	}

	/**
	 * @Description 填充分账信息，分账详情信息
	 * @param divideAccountList
	 * @param smDivideAccountList
	 * @param smDivideAccountDetailList
	 */
	private void addSmDivideAccount(List<DivideAccountVo> divideAccountList) {
		if (CollectionUtils.isNotEmpty(divideAccountList)) {// 商品、卡券订单集合
			// 分账信息map
			Map<Integer, SmDivideAccount> mallMap = new HashMap<>();
			// 分账详情信息map
			Map<Integer, List<SmDivideAccountDetail>> shopMap = new HashMap<>();
			// 账期，前一天
			Date billDate = DateUtils.getYesterdayDate();
			String dateStr = DateUtils.getYesterdayDateSimpleStr();
			// 循环订单集合，分别初始化账单信息、账单详情信息
			Integer num = DivideAccountConstant.BILL_BATCH_NO_DEFAULT;
			for (DivideAccountVo vo : divideAccountList) {
				if (null != vo && null != vo.getShopId() && null != vo.getMallId()) {
					String billBatchNo = this.getBillBatchNo(dateStr, num);
					// 填充分账信息, 分账详情信息
					this.fillDivideAccountMap(billDate, billBatchNo, vo, mallMap, shopMap);
					num++;
				}
			}
			
			List<SmDivideAccount> smDivideAccountList = new ArrayList<>(mallMap.values());
			// TODO 新增分账记录
		}
	}

	/**
	 * @Description 根据shopId查询mallId
	 * @param divideAccountDto
	 * @return
	 */
	private List<DivideAccountVo> initProductOrderList(DivideAccountDto divideAccountDto) {
		List<DivideAccountVo> productOrderList = smDivideAccountMapper.findProductOrderList(divideAccountDto);
		// 循环获取shopId
		if (CollectionUtils.isNotEmpty(productOrderList)) {
			List<Integer> shopIdList = new ArrayList<>();
			for (DivideAccountVo vo : productOrderList) {
				if (null != vo && null != vo.getShopId()) {
					Integer shopId = vo.getShopId();
					shopIdList.add(shopId);
				}
			}
			// TODO 调用接口，根据店铺ID查询商场ID
		}
		return productOrderList;
	}

	/**
	 * @Description 根据店铺mongoID查询店铺ID，根据商场mongoID查询商场ID
	 * @param divideAccountDto
	 * @return
	 */
	private List<DivideAccountVo> initTradeOrderList(DivideAccountDto divideAccountDto) {
		List<DivideAccountVo> tradeOrderList = smDivideAccountMapper.findTradeOrderList(divideAccountDto);
		// 循环获取shopId
		if (CollectionUtils.isNotEmpty(tradeOrderList)) {
			List<String> shopIdList = new ArrayList<>();
			List<String> mallIdList = new ArrayList<>();
			for (DivideAccountVo vo : tradeOrderList) {
				if (null != vo) {
					String shopMid = vo.getShopMid();
					String mallMid = vo.getMallMid();
					if (StringUtils.isNotBlank(shopMid) && StringUtils.isNotBlank(mallMid)) {
						shopIdList.add(shopMid);
						mallIdList.add(mallMid);
					}
				}
			}
			// TODO 调用接口，根据店铺mongoID查询店铺ID
			// TODO 调用接口，根据商场mongoID查询商场ID
		}
		return tradeOrderList;
	}

	/**
	 * @Description 批量插入分账、分账详情 
	 * @param smDivideAccountList
	 * @param smDivideAccountMap
	 */
	private void batchAddDivideAccount(List<SmDivideAccount> smDivideAccountList,
			Map<Integer, List<SmDivideAccountDetail>> smDivideAccountMap) {
		Map<Integer, Integer> acountKeyMap = new HashMap<>();
		List<SmDivideAccountDetail> resultList = new ArrayList<>();
		for (SmDivideAccount sm:smDivideAccountList) {
			smDivideAccountMapper.insertSelective(sm);
			acountKeyMap.put(sm.getMallId(), sm.getId());
		}
		for (Map.Entry<Integer, List<SmDivideAccountDetail>> entry : smDivideAccountMap.entrySet()) {
			Integer mallId = entry.getKey();
			List<SmDivideAccountDetail> entryList = entry.getValue();
			for (SmDivideAccountDetail sm:entryList) {
				sm.setDivideAccountId(acountKeyMap.get(mallId));
			}
			resultList.addAll(entryList);
		}
		
	}

	/**
	 * @Description 获取账单批次号
	 * @param dateStr
	 * @param num
	 * @return
	 */
	private String getBillBatchNo(String dateStr, Integer num) {
		return dateStr + String.format("%04d", num);
	}
}

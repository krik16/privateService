package com.rongyi.settle.service;

import com.rongyi.easy.settle.dto.PaymentStatementDto;
import com.rongyi.easy.settle.entity.PaymentStatement;
import com.rongyi.easy.settle.entity.StatementConfig;
import com.rongyi.settle.dto.CouponExcelDto;
import com.rongyi.settle.dto.CouponStatementDetailDto;
import com.rongyi.settle.dto.OrderSettlementDetailDto;
import com.rongyi.settle.dto.OrderSettlementTopDto;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Created by xgq on 2015/9/22.
 */
public interface PaymentStatementService {
	/**
	 * @param map
	 * @param currentPage
	 * @param pageSize
	 * @Description: 分页查询
	 **/
	List<PaymentStatementDto> selectPageList(Map<String, Object> map, Integer currentPage, Integer pageSize);

	List<PaymentStatementDto> selectPageListForMerchant(Map<String, Object> map, Integer currentPage, Integer pageSize);

	Integer selectPageListCount(Map<String, Object> map);

	Integer selectPageListCountForMerchant(Map<String, Object> map);

	Integer insert(PaymentStatement paymentStatement);

	List<PaymentStatement> selectByCycleTime(Integer configId, Date yesterdayFirstSecond, Date yesterdayLastSecond);

	/**
	 * 批量修改对账单状态
	 * 
	 * @param ids
	 * @return
	 */
	boolean updatePaymentStatusByIds(List<Integer> ids, Integer status, String desc, String userId);

	List<CouponStatementDetailDto> selectForStatementDetails(String shopId, Date startTime, Date endTime, Date cycleStartTime, Date cycleEndTime, String shopName,
			String mallId, String mallName);

	/**
	 * 根据MongoId获取优惠券对账单明细数据
	 * 
	 * @param mallId
	 *            商场MongoId
	 * @param brandId
	 *            品牌MongoId
	 * @param shopId
	 *            店铺MongoId
	 * @param startTime
	 *            开始时间
	 * @param endTime
	 *            结束时间
	 * @return
	 * @author ZhengYl
	 * @date 2015年12月9日 上午10:27:05
	 */
	List<CouponStatementDetailDto> selectForStatementDetails(String mallId, String brandId, String shopId, Date startTime, Date endTime);

	List<CouponExcelDto> selectForCouponExcelDto(String shopId, Date startTime, Date endTime);

	List<CouponExcelDto> selectForCouponExcelDto(String mallId, String brandId, String shopId, Date startTime, Date endTime);

	List<CouponExcelDto> selectForCouponExcelDtoByUsers(String userIds, Date startTime, Date endTime);

	/**
	 * 根据配置id获取中间表数据
	 * 
	 * @param configId
	 *            配置id
	 * @return
	 * @author ZhengYl
	 * @date 2015年12月9日 上午10:44:29
	 */
	List<String> selectForConfigShops(Integer configId);

	/**
	 * 获取商品对账单表头
	 * 
	 * @param shopId
	 *            店铺mongoId
	 * @param mallId
	 *            商场
	 * @param brandId
	 *            品牌
	 * @param userIds
	 *            导购ids
	 * @param startTime
	 * @param endTime
	 * @return
	 * @author ZhengYl
	 * @date 2015年12月9日 下午3:08:05
	 */
	List<OrderSettlementTopDto> selectForOrderTopDto(String shopId, String mallId, String brandId, String userIds, Date startTime, Date endTime);

	/**
	 * 获取商品对账单明细
	 * 
	 * @param shopId
	 *            店铺mongoId
	 * @param mallId
	 *            商场
	 * @param brandId
	 *            品牌
	 * @param userIds
	 *            导购ids
	 * @param startTime
	 * @param endTime
	 * @return
	 * @author ZhengYl
	 * @date 2015年12月9日 下午3:03:50
	 */
	List<OrderSettlementDetailDto> selectForOrderDetailDto(String shopId, String mallId, String brandId, String userIds, Date startTime, Date endTime);

	List<CouponStatementDetailDto> selectForStatementDetailsByUsers(String userIds, Date startTime, Date endTime);

	void cancel(Integer id);

	PaymentStatement get(Integer id);

	void generate(Integer id, String userId) throws Exception;

	void createExcel(Integer id, PaymentStatement paymentStatement, StatementConfig statementConfig, String userId) throws Exception;
	
	String getBatchNo();

	Integer selectCountByConfigId(Integer configId);
}

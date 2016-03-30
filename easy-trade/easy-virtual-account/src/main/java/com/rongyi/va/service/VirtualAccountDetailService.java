/** 
* @Title: VirtualAccountDetailService.java 
* @Package com.rongyi.va.service 
* @Description: TODO
* @author 郑亦梁  zhengyiliang@rongyi.com
* @date 2015年5月13日 下午7:34:17 
* @version V1.0   
* Copyright (C),上海容易网电子商务有限公司
*/
package com.rongyi.va.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.rongyi.core.common.util.DateUtil;
import com.rongyi.core.constant.Constants;
import com.rongyi.core.framework.mybatis.service.impl.BaseServiceImpl;
import com.rongyi.easy.tms.vo.BonusDetailVO;
import com.rongyi.easy.tms.vo.BonusListVO;
import com.rongyi.easy.va.entity.VirtualAccountDetailEntity;
import com.rongyi.va.vo.VirtualAccountQuerySumVO;

/**
 * @author ZhengYl
 *
 */
@Service
public class VirtualAccountDetailService extends BaseServiceImpl {

	private static final String MAPPER_NAMESPACE = "com.rongyi.easy.va.entity.VirtualAccountDetailMapper";

	/**
	* 新增账户明细
	* @param virtualAccountEntity 
	* @return
	*/
	public int insertAndGetId(VirtualAccountDetailEntity virtualAccountDetailEntity) {
		this.getBaseDao().insertBySql(MAPPER_NAMESPACE + ".insertAndGetId", virtualAccountDetailEntity);
		return virtualAccountDetailEntity.getId();
	}

	/**
	* 付款成功后更新提现明细
	* @param virtualAccountDetailEntity
	*/
	public int updateCollectedResult(VirtualAccountDetailEntity virtualAccountDetailEntity) {
		return this.getBaseDao().updateBySql(MAPPER_NAMESPACE + ".updateCollectedResult", virtualAccountDetailEntity);
	}

	/**
	 * 虚拟账户明细总和分类查询
	 * 
	 * @author ZhengYl
	 * @date 2015年6月18日 上午10:52:26 
	 * @param userId
	 * @return
	 */
	public VirtualAccountQuerySumVO selectAccountSumByUserId(String userId) {
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("userId", userId);
		return this.getBaseDao().selectOneBySql(MAPPER_NAMESPACE + ".selectAccountSumByUserId", params);
	}


	/**
	 * 获取奖金明细
	 * 
	 * @author ZhengYl
	 * @date 2015年6月18日 下午2:03:32 
	 * @param params
	 * @return
	 */
	public BonusListVO selectBonusByUserId(Map<String, Object> params) {
		BonusListVO result = new BonusListVO();

		int totalSize = this.getBaseDao().selectOneBySql(MAPPER_NAMESPACE + ".selectBonusPageCount", params);
		int totalPage = totalSize % (int) params.get("pageSize") == 0 ? totalSize / (int) params.get("pageSize")
				: (totalSize / (int) params.get("pageSize") + 1);

		List<VirtualAccountDetailEntity> detailList = this.getBaseDao().selectListBySql(
				MAPPER_NAMESPACE + ".selectBonusByUserId", params);

		if (detailList != null) {
			List<BonusDetailVO> resultList = new ArrayList<BonusDetailVO>();
			for (VirtualAccountDetailEntity detailEntity : detailList) {
				BonusDetailVO detailVO = new BonusDetailVO();
				detailVO.setAmount(String.valueOf(detailEntity.getAmount()));
				detailVO.setDate(DateUtil.dateToString(detailEntity.getCreateAt(), "yyyy-MM-dd HH:mm"));
				detailVO.setFrom(Constants.DrawApplyStatus.BONUS_DEFAULT_MSG);
				detailVO.setStatus(String.valueOf(Constants.DrawApplyStatus.SEND));
				detailVO.setAwardReason(detailEntity.getRemark());
				resultList.add(detailVO);
			}
			result.setDetailList(resultList);
			result.setCurrentPage((int) params.get("currentPage"));
			result.setPageSize((int) params.get("pageSize"));
			result.setTotalPage(totalPage);
		}
		return result;
	}

}

/** 
* @Title: RmmmCouponQueryListVO.java 
* @Package com.rongyi.easy.coupon.param 
* @Description: TODO
* @author 郑亦梁  zhengyiliang@rongyi.com
* @date 2015年4月24日 下午4:40:46 
* @version V1.0   
* Copyright (C),上海容易网电子商务有限公司
*/
package com.rongyi.easy.coupon.vo;

import com.rongyi.easy.rmmm.vo.PageVO;

import java.io.Serializable;
import java.util.List;

/**
 * @author ZhengYl
 *
 */
public class MSCouponQueryVO extends PageVO implements Serializable{

	private static final long serialVersionUID = 1L;
	List<MSCouponVO> msCouponVOList;
	private Integer validCount;//上线卡券数量

	public List<MSCouponVO> getRmmmCouponQueryVoList() {
		return msCouponVOList;
	}

	public void setRmmmCouponQueryVoList(
			List<MSCouponVO> msCouponVOList) {
		this.msCouponVOList = msCouponVOList;
	}

	public Integer getValidCount() {
		return validCount;
	}

	public void setValidCount(Integer validCount) {
		this.validCount = validCount;
	}

	@Override
	public String toString() {
		return "MSCouponQueryVO{" +
				"msCouponVOList=" + msCouponVOList +
				", validCount=" + validCount +
				'}';
	}
}

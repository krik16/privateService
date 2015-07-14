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
public class RmmmCouponQueryListVO extends PageVO implements Serializable{

	private static final long serialVersionUID = 1L;
	List<RmmmCouponVO> rmmmCouponQueryVoList;

	public List<RmmmCouponVO> getRmmmCouponQueryVoList() {
		return rmmmCouponQueryVoList;
	}

	public void setRmmmCouponQueryVoList(
			List<RmmmCouponVO> rmmmCouponQueryVoList) {
		this.rmmmCouponQueryVoList = rmmmCouponQueryVoList;
	}

}

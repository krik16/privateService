package com.rongyi.easy.rmmm.vo;

import java.io.Serializable;
import java.util.List;

import com.rongyi.easy.coupon.vo.UserCouponVO;

public class CouponListVO extends PageVO implements Serializable{

	private List<UserCouponVO> myCouponList;//抵扣券返回

	public List<UserCouponVO> getMyCouponList() {
		return myCouponList;
	}

	public void setMyCouponList(List<UserCouponVO> myCouponList) {
		this.myCouponList = myCouponList;
	}

}

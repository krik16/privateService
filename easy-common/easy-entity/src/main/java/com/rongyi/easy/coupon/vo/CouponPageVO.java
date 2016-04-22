package com.rongyi.easy.coupon.vo;

import java.io.Serializable;
import java.util.List;

import com.rongyi.easy.coupon.entity.Coupon;
import com.rongyi.easy.rmmm.vo.PageVO;
import com.rongyi.easy.roa.vo.CouponVO;

/** 
 * Roa 卡券VO 分页对象
 * @author	作者：刘磊
 * @date	时间：2016年1月28日 上午11:41:06 
 * @version	版本：1.0
 */
public class CouponPageVO extends PageVO implements Serializable {

	private static final long serialVersionUID = -6925376223372060588L;
	
	private List<Coupon> list;

	public List<Coupon> getList() {
		return list;
	}

	public void setList(List<Coupon> list) {
		this.list = list;
	}

}

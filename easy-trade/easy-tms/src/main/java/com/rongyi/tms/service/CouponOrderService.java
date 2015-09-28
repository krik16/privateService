/**
 * @Copyright (C),上海容易网电子商务有限公司	
 * @Author: 柯军 
 * @datetime:2015年9月7日上午11:23:38
 * @Description: TODO
 *
 **/

package com.rongyi.tms.service;

import java.util.List;
import java.util.Map;

import com.rongyi.tms.moudle.vo.CouponOrderVO;

/**	
 * @Author:  柯军
 * @Description: 优惠券订单 
 * @datetime:2015年9月7日上午11:23:38
 *
 **/

public interface CouponOrderService {

	/**	
	 * @Description: 分页查询列表 
	 * @param currentPage
	 * @param pageSize
	 * @param map
	 * @return	
	 * @Author:  柯军
	 * @datetime:2015年9月7日上午11:26:24
	 **/
	public abstract List<CouponOrderVO> selectPageList(Integer currentPage,Integer pageSize,Map<String,Object> map);
	
	/**	
	 * @Description: 列表总数 
	 * @param map
	 * @return	
	 * @Author:  柯军
	 * @datetime:2015年9月7日上午11:27:50
	 **/
	public abstract Integer selectPageListCount(Map<String,Object> map);
	
	/**	
	 * @Description: 根据ID查询 
	 * @param id
	 * @return	
	 * @Author:  柯军
	 * @datetime:2015年9月7日下午6:10:57
	 **/
	public abstract CouponOrderVO selectById(Integer id);
	
}

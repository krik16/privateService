/**
 * @Copyright (C),上海容易网电子商务有限公司	
 * @Author: 柯军 
 * @datetime:2015年9月21日上午11:15:53
 * @Description: TODO
 *
 **/

package com.rongyi.settle.web.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.rongyi.core.bean.ResponseData;

/**	
 * @Author:  柯军
 * @Description: 对账单列表 
 * @datetime:2015年9月21日上午11:15:53
 *
 **/
@Controller
@RequestMapping("/paymentStatement")
public class PaymentStatementController {

	/**	
	 * @Description: 对账单列表（包括所有列表，审核列表，商家对账单列表） 
	 * @param request
	 * @param map
	 * @return	
	 * @Author:  柯军
	 * @datetime:2015年9月21日下午3:01:04
	 **/
	@RequestMapping("/list")
	public ResponseData list(HttpServletRequest request,@RequestBody Map<String, Object> map){
		return null;
	}
	
	/**	
	 * @Description: 生成对账单 
	 * @param request
	 * @param map
	 * @return	
	 * @Author:  柯军
	 * @datetime:2015年9月21日下午3:02:46
	 **/
	@RequestMapping("/generate")
	public ResponseData generate(HttpServletRequest request,@RequestBody Map<String, Object> map){
		return null;
	}
	
	/**	
	 * @Description: 对账单明细 
	 * @param request
	 * @param map
	 * @return	
	 * @Author:  柯军
	 * @datetime:2015年9月21日下午3:02:58
	 **/
	@RequestMapping("/info")
	public ResponseData info(HttpServletRequest request,@RequestBody Map<String, Object> map){
		return null;
	}
	
	/**	
	 * @Description: 对账单审核 
	 * @param request
	 * @param map
	 * @return	
	 * @Author:  柯军
	 * @datetime:2015年9月21日下午3:03:17
	 **/
	@RequestMapping("/verify")
	public ResponseData verify(HttpServletRequest request,@RequestBody Map<String, Object> map){
		return null;
	}
	
	/**	
	 * @Description:  导出对账单明细（财务操作）
	 * @param request
	 * @param map
	 * @return	
	 * @Author:  柯军
	 * @datetime:2015年9月21日下午3:03:26
	 **/
	@RequestMapping("/exportFinanceExcel")
	public ResponseData exportFinanceExcel(HttpServletRequest request,@RequestBody Map<String, Object> map){
		return null;
	}
	
	/**	
	 * @Description: 作废 
	 * @param request
	 * @param map
	 * @return	
	 * @Author:  柯军
	 * @datetime:2015年9月21日下午3:04:09
	 **/
	@RequestMapping("/invalid")
	public ResponseData invalid(HttpServletRequest request,@RequestBody Map<String, Object> map){
		return null;
	}
	
	/**	
	 * @Description: 商品订单查询(商家操作) 
	 * @param request
	 * @param map
	 * @return	
	 * @Author:  柯军
	 * @datetime:2015年9月21日下午3:04:23
	 **/
	@RequestMapping("/merchandiseList")
	public ResponseData merchandiseList(HttpServletRequest request,@RequestBody Map<String, Object> map){
		return null;
	}
	
	/**	
	 * @Description: 导出商品订单明细(商家操作) 
	 * @param request
	 * @param map
	 * @return	
	 * @Author:  柯军
	 * @datetime:2015年9月21日下午3:04:46
	 **/
	@RequestMapping("exportMerchandiseExcel")
	public ResponseData exportMerchandiseExcel(HttpServletRequest request,@RequestBody Map<String, Object> map){
		return null;
	}
	
	/**	
	 * @Description: 优惠券订单查询(商家操作) 
	 * @param request
	 * @param map
	 * @return	
	 * @Author:  柯军
	 * @datetime:2015年9月21日下午3:05:09
	 **/
	@RequestMapping("/couponList")
	public ResponseData couponList(HttpServletRequest request,@RequestBody Map<String, Object> map){
		return null;
	}
	/**	
	 * @Description:  导出优惠券订单明细(商家操作)  
	 * @param request
	 * @param map
	 * @return	
	 * @Author:  柯军
	 * @datetime:2015年9月21日下午3:05:30
	 **/
	@RequestMapping("exportCouponExcel")
	public ResponseData exportCouponExcel(HttpServletRequest request,@RequestBody Map<String, Object> map){
		return null;
	}
	
}


/**
 * @Copyright (C),上海容易网电子商务有限公司	
 * @Author: 柯军 
 * @datetime:2015年9月7日上午11:18:04
 * @Description: TODO
 *
 **/

package com.rongyi.tms.web.controller;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.bson.types.ObjectId;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.rongyi.core.common.util.JsonUtil;
import com.rongyi.easy.coupon.entity.Coupon;
import com.rongyi.easy.coupon.entity.UserCoupon;
import com.rongyi.easy.coupon.vo.UserCouponVO;
import com.rongyi.rss.coupon.RoaCouponService;
import com.rongyi.rss.coupon.RoaUserCashCouponService;
import com.rongyi.rss.coupon.RoaUserCouponService;
import com.rongyi.tms.constants.Constant;
import com.rongyi.tms.moudle.vo.CouponOrderDetailVO;
import com.rongyi.tms.moudle.vo.CouponOrderDetailVO.CouponVO;
import com.rongyi.tms.moudle.vo.CouponOrderVO;
import com.rongyi.tms.service.CouponOrderService;

/**
 * @Author: 柯军
 * @Description: 优惠券订单列表
 * @datetime:2015年9月7日上午11:18:04
 * 
 **/

@Controller
@RequestMapping("/couponOrder")
public class CouponOrderController extends BaseController {

	@Autowired
	CouponOrderService couponOrderService;

	@Autowired
	RoaUserCashCouponService roaUserCashCouponService;

	@Autowired
	RoaUserCouponService roaUserCouponService;

	@Autowired
	RoaCouponService roaCouponService;

	private static final Logger LOGGER = Logger.getLogger(CouponOrderController.class);

	/**
	 * @Description: 优惠券订单
	 * @param model
	 * @param currpage
	 * @return
	 * @Author: 柯军
	 * @datetime:2015年9月7日下午1:24:10
	 **/
	@RequestMapping(value = "/search", method = RequestMethod.GET)
	public String search(ModelMap model, String currpage) {
		model.addAttribute("currpage", currpage);
		return "/couponOrder/couponOrder";
	}

	/**
	 * @Description: 优惠券订单列表
	 * @param model
	 * @param request
	 * @return
	 * @Author: 柯军
	 * @datetime:2015年9月6日下午6:24:34
	 **/
	@SuppressWarnings("unchecked")
	@RequestMapping(value = "/list", method = RequestMethod.POST)
	public String list(ModelMap model, HttpServletRequest request) {
		try {
			LOGGER.info("----- couponOrder list -----");
			try {
				request.setCharacterEncoding("utf-8");
			} catch (UnsupportedEncodingException e1) {
				LOGGER.error(e1);
			}
			String paramsJson = request.getParameter("paramsJson");
			if (paramsJson == null) {
				Map<String, Object> resultMap = new HashMap<String, Object>();
				resultMap.put("msg", "参数为NULL，请关闭再重试！");
				resultMap.put("status", 0);
				return null;
			}
			Map<String, Object> map = JsonUtil.getMapFromJson(paramsJson);
			Integer currpage = Integer.valueOf(map.get("currpage").toString());
			List<CouponOrderVO> list = couponOrderService.selectPageList(currpage, Constant.PAGE.PAGESIZE, map);
			double pageTotle = couponOrderService.selectPageListCount(map);
			Integer rowContNum = (int) Math.ceil(pageTotle / Constant.PAGE.PAGESIZE);
			model.addAttribute("rowCont", rowContNum);
			model.addAttribute("currpage", currpage);
			model.addAttribute("list", list);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "/couponOrder/couponOrder_list";
	}

	@RequestMapping("/info")
	public String getCouponOrderInfo(ModelMap model,Integer id) {
		CouponOrderDetailVO couponOrderDetailVO = new CouponOrderDetailVO();
		CouponOrderVO couponOrderVO = couponOrderService.selectById(id);
		BeanUtils.copyProperties(couponOrderVO,couponOrderDetailVO);
		// 已购买的优惠券信息
		List<UserCoupon> list = roaUserCouponService.findUserCouponList(id.longValue(), null);
		if (!list.isEmpty()) {
			Coupon coupon = roaCouponService.getCouponById(new ObjectId(list.get(0).getCouponId()));
			CouponVO couponVO = couponOrderDetailVO.new CouponVO();
			BeanUtils.copyProperties(coupon, couponVO);
			couponVO.setCount(list.size());
			List<CouponVO> couponVOList = new ArrayList<CouponVO>();
			couponVOList.add(couponVO);
			couponOrderDetailVO.setCouponList(couponVOList);
		}
		// 红包信息
		UserCouponVO userCouponVO = roaUserCashCouponService.getCashCoupon(couponOrderVO.getHbCode());
		if (userCouponVO != null) {
			BeanUtils.copyProperties(userCouponVO, couponOrderDetailVO);
			List<UserCouponVO> userCouponVOlist = new ArrayList<UserCouponVO>();
			userCouponVOlist.add(userCouponVO);
			couponOrderDetailVO.setHbList(userCouponVOlist);
		}
		model.addAttribute("entity", couponOrderDetailVO);
		return "/couponOrder/couponOrder_info";
	}
}

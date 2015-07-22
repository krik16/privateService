package com.rongyi.tms.web.controller;

import com.rongyi.core.common.PagingVO;
import com.rongyi.core.common.util.JsonUtil;
import com.rongyi.easy.coupon.vo.MMUserCouponVO;
import com.rongyi.easy.malllife.vo.UserInfoVO;
import com.rongyi.easy.mcmc.vo.CommodityWebVO;
import com.rongyi.easy.osm.entity.OrderDetailFormEntity;
import com.rongyi.easy.osm.entity.OrderFormEntity;
import com.rongyi.easy.rmmm.entity.MallCooperateEntity;
import com.rongyi.easy.rmmm.entity.ShopInfoEntity;
import com.rongyi.easy.rmmm.vo.OrderManagerVO;
import com.rongyi.easy.rmmm.vo.ParentOrderVO;
import com.rongyi.easy.rmmm.vo.SonOrderVO;
import com.rongyi.rss.coupon.MMUserCouponService;
import com.rongyi.rss.malllife.roa.ROACommodityService;
import com.rongyi.rss.malllife.roa.user.ROAMalllifeUserService;
import com.rongyi.rss.mallshop.order.ROAOrderDetailFormService;
import com.rongyi.rss.mallshop.order.ROAOrderFormService;
import com.rongyi.rss.mallshop.order.ROAOrderService;
import com.rongyi.rss.mallshop.shop.ROACooperationMallService;
import com.rongyi.rss.mallshop.shop.ROAShopService;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import java.io.UnsupportedEncodingException;
import java.math.BigDecimal;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 订单管理
 * @author hebo :2015.5.13
 */
@Controller
@RequestMapping("/orderManager")
public class OrderManagerController extends BaseController {
	Logger logger = LoggerFactory.getLogger(OrderManagerController.class);

	@Resource
	ROACooperationMallService roaCooperationMallService;

	@Resource
	ROAShopService roaShopService;

	@Autowired
	ROAOrderFormService roaOrderFormService;

	@Autowired
	ROAOrderDetailFormService roaOrderDetailFormService;

	@Autowired
	ROAOrderService roaOrderService;

	@Autowired
	ROAMalllifeUserService roaMalllifeUserService;

	@Autowired
	MMUserCouponService mMUserCouponService;

	@Autowired
	ROACommodityService commodityService;

	@RequestMapping("/orderInfo")
	public String orderInfo(String orderId, String module, ModelMap model, String type) {
		logger.info("userId={}, module={}", orderId, module);
		if (StringUtils.isBlank(orderId)) {
			throw new RuntimeException("userId is null or orderId is null");
		}
		model.addAttribute("orderId", orderId);
		model.addAttribute("module", module);
		model.addAttribute("type", type);
		return module + "/order_info";
	}

	/**
	 * 根据订单号查询订单明细
	 * 
	 * @author ZhengYl
	 * @date 2015年7月8日 上午11:19:30 
	 * @param orderNo
	 * @param module
	 * @param model
	 * @param type
	 * @return
	 */
	@RequestMapping("/orderInfoByNo")
	public String orderInfoByNo(String orderNo, String module, ModelMap model, String type) {
		logger.info("userId={}, module={}", orderNo, module);
		if (StringUtils.isBlank(orderNo)) {
			logger.error("orderNo is null");
			throw new RuntimeException("orderNo is null");
		}
		String orderId = null;
		try {
			orderId = roaOrderFormService.getOrderFormByOrderNum(orderNo).getId().toString();
		} catch (Exception e) {
			logger.error(e.getMessage());
			e.printStackTrace();
		}
		if (orderId == null) {
			logger.error("cannot find order");
			throw new RuntimeException("cannot find order");
		}
		model.addAttribute("orderId", orderId);
		model.addAttribute("module", module);
		model.addAttribute("type", type);
		return module + "/order_info";
	}

	@RequestMapping("/OrderInfoByOrderNo")
	public String orderInfo(String orderNo, ModelMap model, String type) {
		if (StringUtils.isBlank(orderNo)) {
			throw new RuntimeException("orderNo is null");
		}
		try {
			OrderFormEntity entity = roaOrderFormService.getOrderFormByOrderNum(orderNo);
			model.addAttribute("orderId", entity.getId());
			model.addAttribute("module", "order");
			model.addAttribute("type", type);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return "order/order_info";
	}


	@RequestMapping("/infoDetails")
	public String orderInfoDetail(String orderId, String module, String type, HttpServletRequest request, ModelMap model) {
		logger.info("==================== infoDetails ====================");
		logger.info("orderId={}, module={}, type={}", orderId, module, type);

		try {
			if (StringUtils.isBlank(orderId)) {
				throw new RuntimeException("orderId is null or empty");
			}
			ParentOrderVO orderDetailVo = roaOrderService.getParentOrderVO(Integer.valueOf(orderId));
			List<MMUserCouponVO> cashCoupons = new ArrayList<MMUserCouponVO>();
			List<SonOrderVO> sonOrderList = orderDetailVo.getSonOrderList();
			BigDecimal discountTotal = new BigDecimal("0.00");//总红包（抵扣）
			BigDecimal commidityTotalPice = new BigDecimal("0.00");//商品总价
			if (!CollectionUtils.isEmpty(sonOrderList)) {
				for (SonOrderVO sonOrderVo : sonOrderList) {
					commidityTotalPice = commidityTotalPice.add(new BigDecimal(sonOrderVo.getNum())
							.multiply(new BigDecimal(sonOrderVo.getCommodityCurrentPrice())));
					if (StringUtils.isNotBlank(sonOrderVo.getCouponCode())) {
						MMUserCouponVO userCouponVO = mMUserCouponService.getUserCouponByCouponCode(sonOrderVo
								.getCouponCode());
						if (userCouponVO != null) {
							if (userCouponVO.getDiscount().compareTo(sonOrderVo.getRealAmount()) == 1) {
								userCouponVO.setRealDiscount(sonOrderVo.getRealAmount());
								discountTotal = discountTotal.add(sonOrderVo.getRealAmount());
							}else{
								userCouponVO.setRealDiscount(userCouponVO.getDiscount());
								discountTotal = discountTotal.add(userCouponVO.getDiscount());
							}
							cashCoupons.add(userCouponVO);
						}
					}
				}
			}
			if (StringUtils.isNotBlank(orderDetailVo.getCommitOrderTime())) {
				orderDetailVo.setCommitOrderTime(orderDetailVo.getCommitOrderTime().substring(0, 16));
			}
			if (StringUtils.isNotBlank(orderDetailVo.getDeliverTime())) {
				orderDetailVo.setDeliverTime(orderDetailVo.getDeliverTime().substring(0, 16));
			}
			if (StringUtils.isNotBlank(orderDetailVo.getPayTime())) {
				orderDetailVo.setPayTime(orderDetailVo.getPayTime().substring(0, 16));
			}
			//订单过程包含（">|<4,"）就是正常关闭
			if(StringUtils.isNotBlank(orderDetailVo.getStatusRoute()) 
					&& orderDetailVo.getStatusRoute().contains(">|<4,")){
				orderDetailVo.setParentOrderStatus("6");
			}
			model.addAttribute("order", orderDetailVo);
			model.addAttribute("cashCoupons", cashCoupons);
			model.addAttribute("discountTotal", discountTotal);
			model.addAttribute("type", type);
			model.addAttribute("commidityTotalPice", commidityTotalPice);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return module + "/order_infoDetail";
	}

	@RequestMapping("/search")
	public String searchIntegralComm(String module) {
		return module + "/order_search";
	}


	/**
	 * 条件查询订单列表
	 * @return
	 * @throws Exception
	 */
	@SuppressWarnings("unchecked")
	@RequestMapping("/ajaxSearchOrderList")
	public String ajaxSearchOrderList(HttpServletRequest request, HttpServletResponse response, HttpSession session,
			ModelMap model, String paramsJson) {
		try {
			Map<String, Object> resultMap = new HashMap<String, Object>();
			Map<String, Object> paramsMap = new HashMap<String, Object>();
			Map<String, Object> searchMap = new HashMap<String, Object>();
			try {
				request.setCharacterEncoding("utf-8");
			} catch (UnsupportedEncodingException e) {
				e.printStackTrace();
			}
			if (StringUtils.isBlank(paramsJson)) {
				resultMap.put("msg", "参数为NULL，请关闭再重试！");
				resultMap.put("status", 0);
				return null;
			}
			logger.info("paramsjson={}", paramsJson);
			paramsMap = JsonUtil.getMapFromJson(paramsJson);
			String orderNo = (String) paramsMap.get("orderNo");
			String mallId = (String) paramsMap.get("mallId");
			String shopName = (String) paramsMap.get("shopName");
			String nickname = (String) paramsMap.get("nickname");
			String username = (String) paramsMap.get("username");
			String status = (String) paramsMap.get("status");
			//查询用户条件
			List<UserInfoVO> users = null;
			if (StringUtils.isNotBlank(nickname) || StringUtils.isNotBlank(username)) {
				if (StringUtils.isNotBlank(nickname)) {
					nickname = URLDecoder.decode(nickname, "utf-8");
				}
				if (StringUtils.isNotBlank(username)) {
					username = URLDecoder.decode(username, "utf-8");
				}
				users = roaMalllifeUserService.getUsersByNicknameUsername(nickname, username);
			}
			List<String> userList = null;
			if (!CollectionUtils.isEmpty(users)) {
				userList = getIdFromUser(users);
			}

			List<Integer> shopList = null;
			if (StringUtils.isNotBlank(mallId)) {
				searchMap.put("mallId", mallId);
			}
			//搜索店铺必须是指定商场下的店铺
			if (StringUtils.isNotBlank(shopName) && StringUtils.isNotBlank(mallId)) {
				shopName = URLDecoder.decode(shopName, "utf-8");
				searchMap.put("shopName", shopName);
			}
			if (searchMap.containsKey("mallId") || searchMap.containsKey("shopName")) {
				shopList = roaShopService.getAllShopIdBuMallId(searchMap);
			}
			searchMap.clear();
			if (!CollectionUtils.isEmpty(userList)) {
				searchMap.put("userList", userList);
			}
			if (!CollectionUtils.isEmpty(shopList)) {
				searchMap.put("shopList", shopList);
			}
			if (StringUtils.isNotBlank(status) && !"0".equals(status)) {
				if ("6".equals(status)) {
					searchMap.put("statusRoute", ">|<4,");
					searchMap.put("status", 5);
				} else {
					searchMap.put("status", status);
				}
			}
			if (StringUtils.isNotBlank(orderNo)) {
				searchMap.put("orderNo", orderNo);
			}
			if (StringUtils.isNotBlank((String) paramsMap.get("currpage"))) {
				searchMap.put("currentPage", paramsMap.get("currpage"));
			}
			PagingVO<OrderManagerVO> pagingVO = roaOrderFormService.searchListByMap(searchMap);
			List<OrderManagerVO> orderForms = pagingVO.getDataList();
			List<OrderManagerVO> orderFormList = new ArrayList<OrderManagerVO>();
			if (!CollectionUtils.isEmpty(orderForms)) {
				for (OrderManagerVO orderManagerVO : orderForms) {
					OrderManagerVO orderVo = setOrderTotalAmount(orderManagerVO);
					orderFormList.add(orderVo);
				}
			}
			if (!CollectionUtils.isEmpty(orderFormList)) {
				logger.info(">>>>>>>>>>>>> 得到 " + orderFormList.size() + " 个订单信息");
				logger.info(orderFormList.toString());
			}
			int totalPage = pagingVO.getTotalPage();
			int currentPage = pagingVO.getCurrentPage();
			model.addAttribute("orderForms", orderFormList);
			model.addAttribute("rowCont", totalPage);
			model.addAttribute("currpage", currentPage);
		} catch (Exception e) {
			e.printStackTrace();
			logger.info("======== 查询订单列表失败了 ============");
		}
		return "order/order_searchajax_list";
	}

	private OrderManagerVO setOrderTotalAmount(OrderManagerVO orderManagerVO) throws Exception {
		List<OrderDetailFormEntity> list = roaOrderDetailFormService.selectByParentNum(orderManagerVO.getOrderNo());
		BigDecimal orderTotalAmount = new BigDecimal("0.00");//订单商品总价
		if (!CollectionUtils.isEmpty(list)) {
			for (OrderDetailFormEntity detailForm : list) {
				orderTotalAmount = orderTotalAmount.add(new BigDecimal(detailForm.getQuantity()).multiply(detailForm
						.getUnitPrice()));
			}
		}
		orderManagerVO.setOrderTotalAmount(orderTotalAmount);
		//包含（">|<4,"）就是正常关闭
		if (StringUtils.isNotBlank(orderManagerVO.getStatusRoute())
				&& orderManagerVO.getStatusRoute().contains(">|<4,")) {
			orderManagerVO.setStatus("6");
		}
		return orderManagerVO;
	}

	private List<String> getIdFromUser(List<UserInfoVO> users) {
		List<String> list = new ArrayList<String>();
		for (UserInfoVO user : users) {
			String userId = null;
			if (user.getUserId() != null) {
				userId = user.getUserId();
				list.add(userId);
			}
		}
		return list;
	}

	/**
	 * 模糊搜索商场(Ajax)
	 */
	@SuppressWarnings("unchecked")
	@RequestMapping("/ajaxGetMalls")
	public String ajaxGetMalls(HttpServletRequest request, HttpServletResponse response, String paramsJson) {
		Map<String, Object> result = new HashMap<String, Object>();
		Map<String, Object> paramsMap = new HashMap<String, Object>();
		try {
			request.setCharacterEncoding("utf-8");
			if (StringUtils.isBlank(paramsJson)) {
				result.put("msg", "参数为NULL，请重试");
				result.put("status", 0);
				return null;
			}
			logger.info("paramsJson={},", paramsJson);
			paramsMap = JsonUtil.getMapFromJson(paramsJson);
			String name = (String) paramsMap.get("keywords");
			if (StringUtils.isNotBlank(name)) {
				name = URLDecoder.decode(name, "utf-8");
			}
			List<MallCooperateEntity> reList = roaCooperationMallService.getMallListByMallName(name);
			result.put("msg", reList);
			result.put("status", 1);
		} catch (Exception e) {
			logger.info(">>>>>>>>>>>>>>>>获取商场信息失败：" + e.getMessage());
			e.printStackTrace();
		} finally {
			String json = JsonUtil.getJSONString(result);
			logger.info(json);
			responseJson(json, response);
		}
		return null;
	}

	/**
	 * 根据mallId和店铺名模糊搜索店铺(Ajax)
	 * @param request
	 * @param response
	 * @param paramsJson
	 * @return
	 * @throws Exception
	 */
	@SuppressWarnings("unchecked")
	@RequestMapping("/ajaxGetShops")
	public String ajaxGetShops(HttpServletRequest request, HttpServletResponse response, String paramsJson)
			{
		Map<String, Object> paramsMap = new HashMap<String, Object>();
		Map<String, Object> result = new HashMap<String, Object>();
		try {
			request.setCharacterEncoding("utf-8");
			if (StringUtils.isBlank(paramsJson)) {
				logger.info(">>>>>>>>>>>>>>>>>paramsJson参数为空");
				result.put("msg", "参数为null，请重试");
				result.put("status", 0);
				return null;
			}
			logger.info("paramsJson={} ", URLDecoder.decode(paramsJson, "utf-8"));
			paramsMap = JsonUtil.getMapFromJson(paramsJson);
			String mallId = (String) paramsMap.get("mallId");
			String name = (String) paramsMap.get("keywords");
			if (StringUtils.isBlank(mallId)) {
				throw new RuntimeException("mallId为空");
			}
			name = URLDecoder.decode(name, "utf-8");
			mallId = URLDecoder.decode(mallId, "utf-8");
			Map<String, Object> searchMap = new HashMap<String, Object>();
			searchMap.put("mallId", mallId);
			searchMap.put("name", name);
			List<ShopInfoEntity> reList = roaShopService.getShopListByShopName(name, Integer.valueOf(mallId));
			result.put("msg", reList);
			result.put("status", 1);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
			logger.info(">>>>>>>>>>>>>获取店铺信息失败：" + e.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			String json = JsonUtil.getJSONString(result);
			logger.info(">>>>>>>>>>>>>>>>>>>>>>>>>>>>店铺" + json);
			responseJson(json, response);
		}
		return null;
	}

	/**
	 * 模糊查询会员昵称(Ajax)
	 * @param request
	 * @param response
	 * @param paramsJson
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@RequestMapping("/ajaxGetUsers")
	public String ajaxGetNickName(HttpServletRequest request, HttpServletResponse response, String paramsJson) {
		Map<String, Object> paramsMap = new HashMap<String, Object>();
		Map<String, Object> result = new HashMap<String, Object>();
		List<UserInfoVO> reList = null;
		try {
			request.setCharacterEncoding("utf-8");
			if (StringUtils.isBlank(paramsJson)) {
				logger.info(">>>>>>>>>>>>>>>>>paramsJson参数为空");
				result.put("msg", "参数为null，请重试");
				result.put("status", 0);
				return null;
			}
			logger.info("paramsjson={}", paramsJson);
			paramsMap = JsonUtil.getMapFromJson(paramsJson);
			String nickname = (String) paramsMap.get("keyWords");
			nickname = URLDecoder.decode(nickname, "utf-8");
			if (StringUtils.isNotBlank(nickname)) {
				reList = roaMalllifeUserService.getUserDetailByNickname(nickname);
			}
			result.put("msg", reList);
			result.put("status", 1);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			String json = JsonUtil.getJSONString(result);
			logger.info(">>>>>>>>>>>>>>>>>>>>>>>>>>>>昵称" + json);
			responseJson(json, response);
		}
		return null;
	}

	/**
	 * 商品详情(暂时在这)
	 * @param request
	 * @param response
	 * @param session
	 * @param model
	 * @param commodityId
	 * @param shopId
	 * @param currpage
	 * @return
	 */
	@RequestMapping(value = "/commodityDetail")
	public String commodityDetail(HttpServletRequest request, HttpServletResponse response, HttpSession session,
			ModelMap model, String commodityId, String shopId, String currpage) {
		logger.info(">>>commodity detail");
		try {
			List<String> picList = commodityService.getCommodityPicList(commodityId);
			List<String> picListForEight = new ArrayList<String>();
			if (picList != null && picList.size() > 8) {
				for (int i = 0; i < 8; i++) {
					picListForEight.add(picList.get(i));
				}
			}
			//			List<CommoditySpecWebVO> voList = commoditySpceService.listCommoditySpecByCommodityId(commodityId);
			CommodityWebVO commodityVO = commodityService.getCommodityWebVoById(commodityId);
			if (commodityVO == null) {
				model.addAttribute("Exception", "参数有错或则是系统错误");

			} else {
				model.addAttribute("commodityvo", commodityVO);//这是返回商品的信息

			}
			if (picList != null && picList.size() > 8) {
				model.addAttribute("picList", picListForEight);
				model.addAttribute("picListCount", picListForEight.size());
			} else if (!CollectionUtils.isEmpty(picList)) {
				model.addAttribute("picList", picList);
				model.addAttribute("picListCount", picList.size());
			}
			//图片拿出完成
			List<String> columns = commodityService.listCommoditySpecColumns(commodityId);
			List<String[]> columnValues = commodityService.listSpecColumnValues(commodityId);
			model.addAttribute("shopId", shopId);
			model.addAttribute("currpage", currpage);
			model.addAttribute("columns", columns);
			model.addAttribute("columnValues", columnValues);
			model.addAttribute("columnValuesSize", columnValues.size());

		} catch (Exception e) {
			logger.info(e.getMessage());
			model.addAttribute("Exception", e.getMessage());
		}
		return "order/commodity_detail";
	}

}

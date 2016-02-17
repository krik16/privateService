package com.rongyi.tms.web.controller;

import com.rongyi.core.common.PagingVO;
import com.rongyi.core.common.util.JsonUtil;
import com.rongyi.easy.bsoms.entity.UserInfo;
import com.rongyi.easy.coupon.vo.MMUserCouponVO;
import com.rongyi.easy.malllife.vo.UserInfoVO;
import com.rongyi.easy.mcmc.vo.CommodityWebVO;
import com.rongyi.easy.osm.entity.OrderFormEntity;
import com.rongyi.easy.osm.vo.OrderCartFormVO;
import com.rongyi.easy.rmmm.entity.MallCooperateEntity;
import com.rongyi.easy.rmmm.entity.ShopInfoEntity;
import com.rongyi.easy.rmmm.vo.OrderManagerVO;
import com.rongyi.easy.rmmm.vo.ParentOrderVO;
import com.rongyi.easy.rmmm.vo.SonOrderVO;
import com.rongyi.rss.bsoms.IUserInfoService;
import com.rongyi.rss.coupon.mall.shop.MSUserCouponService;
import com.rongyi.rss.malllife.roa.ROACommodityService;
import com.rongyi.rss.malllife.roa.user.ROAMalllifeUserService;
import com.rongyi.rss.mallshop.order.ROAOrderFormService;
import com.rongyi.rss.mallshop.shop.ROACooperationMallService;
import com.rongyi.rss.mallshop.shop.ROAShopService;

import com.rongyi.rss.solr.McmcCommoditySolrService;
import com.rongyi.rss.tradecenter.osm.IOrderCartService;
import com.rongyi.rss.tradecenter.osm.IOrderQueryService;
import com.rongyi.tms.constants.ConstantEnum;
import com.rongyi.tms.excel.ExportOsmOrderExcel;
import com.rongyi.tms.moudle.vo.ParentOrderCartVO;
import com.rongyi.tms.moudle.vo.ResponseResult;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.StringUtils;
import org.bson.types.ObjectId;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.UnsupportedEncodingException;
import java.math.BigDecimal;
import java.net.URLDecoder;
import java.util.*;

/**
 * 订单管理
 * @author hebo :2015.5.13
 */
@Controller
@RequestMapping("/orderManager")
public class OrderManagerController extends BaseController {
	Logger logger = LoggerFactory.getLogger(OrderManagerController.class);

	@Resource
	private ROACooperationMallService roaCooperationMallService;

	@Resource
	private ROAShopService roaShopService;

	@Autowired
	private ROAOrderFormService roaOrderFormService;

	@Autowired
	private IOrderQueryService iOrderQueryService;

	@Autowired
	private ROAMalllifeUserService roaMalllifeUserService;

	@Autowired
	private ROACommodityService commodityService;

	@Autowired
	private IOrderCartService iOrderCartService;
	@Autowired
	private McmcCommoditySolrService mcmcCommoditySolrService;

	@Autowired
	private IUserInfoService iUserInfoService;

	@Autowired
	private ExportOsmOrderExcel exportOsmOrderExcel;

	@Autowired
	private MSUserCouponService msUserCouponService;

	@RequestMapping("/orderCartSearch")
	public String orderCartSearch(String orderCartNo, ModelMap model) {
		model.addAttribute("orderCartNo", orderCartNo);
		return "order/order_cart_search";
	}

	@RequestMapping("/ajaxOrderCartList")
	public String ajaxOrderCartList(ModelMap model, String paramsJson) {
		try {
			logger.info("orderCart params = {}", paramsJson);
			Map<String, Object> paramsMap = JsonUtil.getMapFromJson(paramsJson);
			if (paramsMap.containsKey("payChannel")){
				paramsMap.put("payChannels", paramsMap.get("payChannel").toString().split(","));
			}
			if (paramsMap.containsKey("userAccount")){
				String phone = paramsMap.get("userAccount").toString();
				UserInfoVO userInfo = roaMalllifeUserService.getByPhone(phone);
				if (userInfo==null){
					model.addAttribute("orderCartForms", null);
					model.addAttribute("currpage", 1);
					model.addAttribute("rowCont", 0);
					return "order/order_cart_list";
				}
				paramsMap.put("buyerId", userInfo.getUserId());
			}
			PagingVO<OrderCartFormVO> page = iOrderCartService.searchListByMap(paramsMap);
			int currPage = paramsMap.containsKey("currPage")?Integer.valueOf(paramsMap.get("currPage").toString()):1;
			List<ParentOrderCartVO> orderCartVOs = convertToOrderCart(page.getDataList());
			model.addAttribute("orderCartForms", orderCartVOs);
			model.addAttribute("currpage", currPage);
			model.addAttribute("rowCont", page.getTotalPage());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "order/order_cart_list";
	}

	private List<ParentOrderCartVO> convertToOrderCart(List<OrderCartFormVO> dataList) throws Exception {
		if (CollectionUtils.isEmpty(dataList)){
			return null;
		}
		List<ParentOrderCartVO> orderCartVOs = new ArrayList<>();
		for (OrderCartFormVO orderCartVO : dataList){
			ParentOrderCartVO orderCart = new ParentOrderCartVO();
			orderCart.setId(orderCartVO.getId());
			orderCart.setOrderNo(orderCartVO.getOrderNo());
			orderCart.setRealAmount(orderCartVO.getRealAmount());
			orderCart.setPayAmount(orderCartVO.getPayAmount());
			orderCart.setStatus(orderCartVO.getStatus());
			orderCart.setOrderSource(0);
			orderCart.setPayChannel(orderCartVO.getPayChannel());
			orderCart.setCreateAt(orderCartVO.getCreateAt());
			orderCart.setPayAt(orderCartVO.getPayAt());
			UserInfoVO userInfo = roaMalllifeUserService.getByUid(orderCartVO.getBuyerId());
			if (userInfo!=null){
				orderCart.setBuyerAccount(userInfo.getUserPhone());
				orderCart.setBuyerPhone(userInfo.getUserPhone());
				orderCart.setBuyerName(userInfo.getUserName());
			}
			orderCartVOs.add(orderCart);
		}
		return orderCartVOs;
	}

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
	public String orderInfoDetail(String orderId, String module, String type, ModelMap model) {
		logger.info("==================== infoDetails ====================");
		logger.info("orderId={}, module={}, type={}", orderId, module, type);

		try {
			if (StringUtils.isBlank(orderId)) {
				throw new RuntimeException("orderId is null or empty");
			}
			ParentOrderVO orderDetailVo = iOrderQueryService.searchRYOrderDetail(Integer.valueOf(orderId));
			List<SonOrderVO> sonOrderList = orderDetailVo.getSonOrderList();
			BigDecimal discountTotal = new BigDecimal("0.00");//总红包（抵扣）
			BigDecimal commidityTotalPice = new BigDecimal("0.00");//商品总价
			if (!CollectionUtils.isEmpty(sonOrderList)) {
				//目前一个订单只会有一种商品，直播也是一个
				orderDetailVo.setLiveName(sonOrderList.get(0).getLiveName());
				for (SonOrderVO sonOrderVo : sonOrderList) {
					commidityTotalPice = commidityTotalPice.add(new BigDecimal(sonOrderVo.getNum())
							.multiply(new BigDecimal(sonOrderVo.getCommodityCurrentPrice()))).setScale(2, BigDecimal.ROUND_HALF_UP);
					if (StringUtils.isNotBlank(sonOrderVo.getCouponCode())) {
						MMUserCouponVO userCouponVO = msUserCouponService.getUserCouponByCouponCode(sonOrderVo
								.getCouponCode());
						if (userCouponVO != null) {
							if (userCouponVO.getDiscount().compareTo(sonOrderVo.getRealAmount()) == 1) {
								userCouponVO.setRealDiscount(sonOrderVo.getRealAmount());
								discountTotal = discountTotal.add(sonOrderVo.getRealAmount());
							}else{
								userCouponVO.setRealDiscount(userCouponVO.getDiscount());
								discountTotal = discountTotal.add(userCouponVO.getDiscount());
							}
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
			model.addAttribute("order", orderDetailVo);
//			discountTotal.setScale(2,4);
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
	public String ajaxSearchOrderList(HttpServletRequest request, ModelMap model, String paramsJson) {
		try {
			Map<String, Object> paramsMap;
			try {
				request.setCharacterEncoding("utf-8");
			} catch (UnsupportedEncodingException e) {
				e.printStackTrace();
			}
			logger.info("paramsjson={}", paramsJson);
			paramsMap = warpToParamMap(paramsJson);
			if (paramsMap == null){
				model.addAttribute("orderForms", null);
				model.addAttribute("rowCont", 0);
				model.addAttribute("currpage", 1);
				return "order/order_searchajax_list";
			}
			PagingVO<OrderManagerVO> pagingVO = roaOrderFormService.searchListByMap(paramsMap);
			List<OrderManagerVO> orderForms = pagingVO.getDataList();
			if (!CollectionUtils.isEmpty(orderForms)) {
				logger.info(">>>>>>>>>>>>> 得到 " + orderForms.size() + " 个订单信息");
			}
			int totalPage = pagingVO.getTotalPage();
			int currentPage = pagingVO.getCurrentPage();
			model.addAttribute("orderForms", orderForms);
			model.addAttribute("rowCont", totalPage);
			model.addAttribute("currpage", currentPage);
		} catch (Exception e) {
			e.printStackTrace();
			logger.info("======== 查询订单列表失败了 ============");
		}
		return "order/order_searchajax_list";
	}

	/**
	 * @return
	 * @Description: 导出订单
	 * @Author: 何波
	 **/
	@RequestMapping("/exportOrderExcel")
	public void exportOsmOrder(String paramsJson, HttpServletResponse response, HttpServletRequest request) {
		try {
			if (StringUtils.isBlank(paramsJson))
				return;
			logger.info("export OsmOrder paramsJson={}", paramsJson);
			Map<String, Object> paramsMap = warpToParamMap(URLDecoder.decode(paramsJson, "utf-8"));
			logger.info("export OsmOrder paramsMap={}", paramsMap);
			if (paramsMap != null) {
				exportOsmOrderExcel.exportExcel(request, response, paramsMap);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	/**
	 * @Description: 验证导出报表总数是否超过限制
	 * @param paramsJson
	 * @return
	 * @Author: 何波
	 **/
	@SuppressWarnings("unchecked")
	@RequestMapping(value = "/validateExcelCount")
	@ResponseBody
	public ResponseResult validateExcelCount(String paramsJson) {
		logger.info("validateExcelCount begin");
		ResponseResult result = new ResponseResult();
		result.setSuccess(false);
		try {
			Map<String, Object> paramsMap = warpToParamMap(paramsJson);
			PagingVO<OrderManagerVO> pagingVO = iOrderQueryService.searchListByMap(paramsMap);
			if (pagingVO!=null && pagingVO.getRowCnt()<= ConstantEnum.EXCEL_LIMIT_COUNT.getCodeInt())
                result.setSuccess(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	private Map<String, Object> warpToParamMap(String  paramsJson) throws Exception{
		Map<String, Object>  paramsMap = JsonUtil.getMapFromJson(paramsJson);
		Map<String, Object> searchMap = new HashMap<>();
		String mallId = (String) paramsMap.get("mallId");
		String shopName = (String) paramsMap.get("shopName");
		String nickname = (String) paramsMap.get("nickname");
		String username = (String) paramsMap.get("username");
		//查询用户条件
		List<UserInfoVO> users = null;
		if (StringUtils.isNotBlank(username)) {
//				if (StringUtils.isNotBlank(nickname)) {
//					nickname = URLDecoder.decode(nickname, "utf-8");
//				}
			if (StringUtils.isNotBlank(username)) {
				username = URLDecoder.decode(username, "utf-8");
			}
			users = roaMalllifeUserService.getUsersByNicknameUsername(nickname, username);
			if(users == null || users.isEmpty()){
				return null;
			}
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
		if (StringUtils.isNotBlank(shopName)) {
			shopName = URLDecoder.decode(shopName, "utf-8");
			String[] shopNames = shopName.split("-");
			searchMap.put("shopName", shopNames[0]);
			if(shopNames.length > 1){
				List<String> shopMids = new ArrayList<>();
				shopMids.add(shopNames[1]);
				searchMap.put("shopMids",shopMids);
			}
		}
		if (searchMap.containsKey("mallId") || searchMap.containsKey("shopName")) {
			shopList = roaShopService.getAllShopIdBuMallId(searchMap);
			if (CollectionUtils.isEmpty(shopList)){
				return null;
			}
		}
		if (!CollectionUtils.isEmpty(userList)) {
			paramsMap.put("userList", userList);
		}
		if (!CollectionUtils.isEmpty(shopList)) {
			paramsMap.put("shopList", shopList);
		}
		if(paramsMap.containsKey("commodityNo")){
			logger.info(" commodityNo={} ", URLDecoder.decode(paramsMap.get("commodityNo").toString(), "utf-8"));
			List<String> commodityIds = new ArrayList<>();
			List<ObjectId> ids = mcmcCommoditySolrService.selectCommodityIndexByNameCode(URLDecoder.decode(paramsMap.get("commodityNo").toString(), "utf-8"), null);
			if (CollectionUtils.isEmpty(ids)){
				return null;
			}
			for (ObjectId id : ids){
				commodityIds.add(id.toString());
			}
			paramsMap.put("commodityIds", commodityIds);
		}
		if (paramsMap.containsKey("sellerAccount")){
			List<Integer> guideIds = new ArrayList<>();
			Map<String, Object> map = new HashMap<>();
			map.put("userAccount",paramsMap.get("sellerAccount").toString());
			map.put("isDisabled", 0);
			UserInfo userInfo = iUserInfoService.getUserByMap(map);//导购(商场品牌)
			if (userInfo!=null)
				guideIds.add(userInfo.getId());
			map.put("type", ConstantEnum.USER_TYPE_2.getCodeInt());
			UserInfo userInfo2 = iUserInfoService.getUserByMap(map);//买手
			if (userInfo2!=null)
				guideIds.add(userInfo2.getId());
			if (CollectionUtils.isNotEmpty(guideIds))
				paramsMap.put("guideIds",guideIds);
			else {
				return null;
			}
		}
		return paramsMap;
	}

	private List<String> getIdFromUser(List<UserInfoVO> users) {
		List<String> list = new ArrayList<>();
		for (UserInfoVO user : users) {
			String userId;
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
		Map<String, Object> result = new HashMap<>();
		Map<String, Object> paramsMap;
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
		Map<String, Object> paramsMap ;
		Map<String, Object> result = new HashMap<>();
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
			Integer mallId = null;
			if(paramsMap.get("mallId") != null && StringUtils.isNotBlank(paramsMap.get("mallId").toString())) {
				mallId = Integer.valueOf(paramsMap.get("mallId").toString());
			}
			String name = (String) paramsMap.get("keywords");
//			if (StringUtils.isBlank(mallId)) {
//				throw new RuntimeException("mallId为空");
//			}
			name = URLDecoder.decode(name, "utf-8");
			List<ShopInfoEntity> reList = roaShopService.getShopListByShopName(name,mallId);
			if(mallId == null) {
				for (ShopInfoEntity shopInfoEntity : reList) {
					shopInfoEntity.setShopName(shopInfoEntity.getShopName()+"-"+shopInfoEntity.getShopMid());
				}
			}

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
		Map<String, Object> paramsMap;
		Map<String, Object> result = new HashMap<>();
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
	 * @param model
	 * @param commodityId
	 * @param shopId
	 * @param currpage
	 * @return
	 */
	@RequestMapping(value = "/commodityDetail")
	public String commodityDetail(ModelMap model, String commodityId, String shopId, String currpage) {
		logger.info(">>>commodity detail");
		try {
			List<String> picList = commodityService.getCommodityPicList(commodityId);
			List<String> picListForEight = new ArrayList<>();

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

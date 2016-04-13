package com.rongyi.tms.web.controller.v2;

import com.rongyi.core.bean.ResponseData;
import com.rongyi.core.common.PagingVO;
import com.rongyi.easy.bsoms.entity.UserInfo;
import com.rongyi.easy.coupon.vo.MMUserCouponVO;
import com.rongyi.easy.malllife.vo.UserInfoVO;
import com.rongyi.easy.mcmc.vo.CommodityVO;
import com.rongyi.easy.mcmc.vo.CommodityWebVO;
import com.rongyi.easy.rmmm.vo.OrderManagerVO;
import com.rongyi.easy.rmmm.vo.ParentOrderVO;
import com.rongyi.easy.rmmm.vo.SonOrderVO;
import com.rongyi.easy.tms.vo.v2.CommodityDetailVO;
import com.rongyi.easy.tms.vo.v2.SubOrderDetailVO;
import com.rongyi.rss.bsoms.IUserInfoService;
import com.rongyi.rss.coupon.mall.shop.MSUserCouponService;
import com.rongyi.rss.malllife.roa.ROACommodityService;
import com.rongyi.rss.malllife.roa.user.ROAMalllifeUserService;
import com.rongyi.rss.mallshop.order.ROAOrderFormService;
import com.rongyi.rss.solr.McmcCommoditySolrService;
import com.rongyi.rss.tradecenter.osm.IOrderQueryService;
import com.rongyi.tms.Exception.PermissionException;
import com.rongyi.tms.constants.Constant;
import com.rongyi.tms.constants.ConstantEnum;
import com.rongyi.tms.excel.ExportOsmOrderExcel;
import com.rongyi.tms.web.controller.BaseController;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.StringUtils;
import org.bson.types.ObjectId;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 订单管理
 * kejun
 */
@Controller
    @RequestMapping("/v2/subOrder")
public class SubOrderController extends BaseControllerV2 {
    private static final Logger LOGGER = LoggerFactory.getLogger(SubOrderController.class);


    @Autowired
    private ROAMalllifeUserService roaMalllifeUserService;

    @Autowired
    private McmcCommoditySolrService mcmcCommoditySolrService;

    @Autowired
    private IUserInfoService iUserInfoService;

    @Autowired
    private ExportOsmOrderExcel exportOsmOrderExcel;

    @Autowired
    private MSUserCouponService msUserCouponService;

    @Autowired
    ROACommodityService commodityService;

    @Autowired
    IOrderQueryService iOrderQueryService;

    /**
     * 条件查询订单列表
     *
     * @return
     * @throws Exception
     */
    @RequestMapping("/list")
    @ResponseBody
    public ResponseData list(@RequestBody Map<String, Object> paramsMap,HttpServletRequest request) {
        ResponseData responseData;
        try {
            LOGGER.info("子订单列表:paramsMap={}", paramsMap);
            permissionCheck(request,"");
            warpToParamMap(paramsMap);
            PagingVO<OrderManagerVO> pagingVO = iOrderQueryService.searchSubListByMap(paramsMap);

            // 通过商品编号，商品规格id，获得商品信息
//            CommodityVO commodityVO = commodityService.getCommoditySpecInfoById(commodityId, specId);
            List<OrderManagerVO> orderForms = pagingVO.getDataList();
            for(OrderManagerVO orderManagerVO : orderForms){
                CommodityVO commodityVO = commodityService.getCommoditySpecInfoById(orderManagerVO.getCommodityMid(), orderManagerVO.getCommoditySpecMid());
                if(commodityVO != null) {
                    orderManagerVO.setCommodityName(commodityVO.getCommodityName());
                    orderManagerVO.setCommoditySpecColumnList(commodityVO.getCommoditySpecList().get(0).getSpecColumnValues());
                    orderManagerVO.setCommodityNo(commodityVO.getCommodityCode());
                }
            }
            int totalPage = pagingVO.getTotalPage();
            int currentPage = pagingVO.getCurrentPage();
            responseData = ResponseData.success(orderForms, currentPage, Constant.PAGE.PAGESIZE, totalPage);
        } catch (PermissionException e){
            LOGGER.error(e.getMessage());
            e.printStackTrace();
            return ResponseData.failure(Integer.valueOf(e.getCode()), e.getMessage());
        }catch (Exception e) {
            responseData = ResponseData.failure(ConstantEnum.LIST_QUERY_EXCEPTION.getCodeInt(), ConstantEnum.LIST_QUERY_EXCEPTION.getValueStr());
            e.printStackTrace();
            LOGGER.error("子订单查询失败,message={}", e);
        }
        return responseData;
    }

    @RequestMapping("/detail")
    @ResponseBody
    public ResponseData detail(HttpServletRequest request,Integer id) {
        LOGGER.info("子订单详情:id={}", id);
        ResponseData responseData;
        try {
            permissionCheck(request,"");
            ParentOrderVO orderDetailVo = iOrderQueryService.searchRYOrderDetail(id);
            List<SonOrderVO> sonOrderList = orderDetailVo.getSonOrderList();
            BigDecimal discountTotal = new BigDecimal("0.00");//总卡券信息（包含抵扣券）
            discountTotal = discountTotal.add(orderDetailVo.getCouponDiscount()).add(orderDetailVo.getOrderCouponDiscount());//抵扣信息
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
                            userCouponVO.setRealDiscount(sonOrderVo.getRealAmount());
                            discountTotal = discountTotal.add(sonOrderVo.getHbDiscount());
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
            SubOrderDetailVO subOrderDetailVO = new SubOrderDetailVO();
            BeanUtils.copyProperties(orderDetailVo, subOrderDetailVO);
            //商品合计总价
            subOrderDetailVO.setCommiditySumTotalPice(commidityTotalPice.subtract(orderDetailVo.getDiscountFee()).setScale(2, 4));
            //订单合计
            if (commidityTotalPice.subtract(orderDetailVo.getDiscountFee()).compareTo(BigDecimal.ZERO) < 0) {
                subOrderDetailVO.setOrderTotalPrice(new BigDecimal(orderDetailVo.getCommodityPostage()).setScale(2, 4));
            } else {
                subOrderDetailVO.setOrderTotalPrice(commidityTotalPice.subtract(orderDetailVo.getDiscountFee()).add(new BigDecimal(orderDetailVo.getCommodityPostage()).setScale(2, 4)));
            }
            //卡券合计
            if (discountTotal.subtract((commidityTotalPice.subtract(orderDetailVo.getDiscountFee()))).compareTo(BigDecimal.ZERO) > 0) {
                subOrderDetailVO.setCouponDiscountPrice(commidityTotalPice.subtract(orderDetailVo.getDiscountFee()).setScale(2, 4));
            }else{
                subOrderDetailVO.setCouponDiscountPrice(discountTotal);
            }
            responseData = ResponseData.success(subOrderDetailVO);
        }catch (PermissionException e){
            LOGGER.error(e.getMessage());
            e.printStackTrace();
            return ResponseData.failure(Integer.valueOf(e.getCode()), e.getMessage());
        } catch (Exception e) {
            responseData = ResponseData.failure(ConstantEnum.DETAIL_QUERY_EXCEPTION.getCodeInt(), ConstantEnum.DETAIL_QUERY_EXCEPTION.getValueStr());
            e.printStackTrace();
            LOGGER.error("子订单详情查询失败,message={}", e);
        }
        return responseData;
    }


    /**
     * 导出订单
     **/
    @RequestMapping("/exportExcel")
    public void exportExcel(@RequestBody Map<String, Object> paramsMap, HttpServletResponse response, HttpServletRequest request) {
        try {
            LOGGER.info("报表导出:paramsMap={}", paramsMap);
            permissionCheck(request, "");
            warpToParamMap(paramsMap);
            exportOsmOrderExcel.exportExcel(request, response, paramsMap);
        }catch (PermissionException e){
            LOGGER.error(e.getMessage(),e);
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    /**
     * 验证导出报表总数是否超过限制
     **/
    /**
     * 验证导出报表总数是否超过限制
     **/
    @SuppressWarnings("unchecked")
    @RequestMapping(value = "/validateExcelCount")
    @ResponseBody
    public ResponseData validateExcelCount(@RequestBody Map<String, Object> paramsMap,HttpServletRequest request) {
        LOGGER.info("validateExcelCount:paramsMap={}", paramsMap);
        ResponseData responseData = ResponseData.failure();
        try {
            permissionCheck(request,"");
            warpToParamMap(paramsMap);
            PagingVO<OrderManagerVO> pagingVO = iOrderQueryService.searchListByMap(paramsMap);
            if (pagingVO != null && pagingVO.getRowCnt() <= ConstantEnum.EXCEL_LIMIT_COUNT.getCodeInt())
                responseData = ResponseData.success();
        } catch (PermissionException e){
            LOGGER.error(e.getMessage(),e);
            e.printStackTrace();
            return ResponseData.failure(Integer.valueOf(e.getCode()), e.getMessage());
        }catch (Exception e) {
            e.printStackTrace();
            LOGGER.error("报表导出上限检查失败,message={}", e);
        }
        return responseData;
    }


    /**
     * 商品详情
     */
    @RequestMapping(value = "/commodityDetail")
    @ResponseBody
    public ResponseData commodityDetail(String commodityId,HttpServletRequest request) {
        LOGGER.info("商品详情:commodityId={}", commodityId);
        ResponseData responseData;
        try {
            permissionCheck(request,"");
            CommodityDetailVO commodityDetailVO = new CommodityDetailVO();
            List<String> picList = commodityService.getCommodityPicList(commodityId);
            List<String> picListForEight = new ArrayList<>();

            if (picList != null && picList.size() > 8) {
                for (int i = 0; i < 8; i++) {
                    picListForEight.add(picList.get(i));
                }
            }
            CommodityWebVO commodityVO = commodityService.getCommodityWebVoById(commodityId);
            BeanUtils.copyProperties(commodityVO, commodityDetailVO);
            //获取图片
            if (picList != null && picList.size() > 8) {
                commodityDetailVO.setPicList(picListForEight);
            } else if (!CollectionUtils.isEmpty(picList)) {
                commodityDetailVO.setPicList(picList);
            }

            List<String[]> columnValues = commodityService.listSpecColumnValues(commodityId);
            commodityDetailVO.setColumnValues(columnValues);
            responseData = ResponseData.success(commodityDetailVO);
        } catch (PermissionException e){
            LOGGER.error(e.getMessage(),e);
            e.printStackTrace();
            return ResponseData.failure(Integer.valueOf(e.getCode()), e.getMessage());
        }catch (Exception e) {
            responseData = ResponseData.failure(ConstantEnum.DETAIL_QUERY_EXCEPTION.getCodeInt(), ConstantEnum.DETAIL_QUERY_EXCEPTION.getValueStr());
            e.printStackTrace();
            LOGGER.error("获取商品详情失败,message={}", e);
        }
        return responseData;
    }


    private Map<String, Object> warpToParamMap(Map<String, Object> paramsMap) throws Exception {
        String shopId = (String) paramsMap.get("shopId");
        String commodityNo = (String) paramsMap.get("commodityNo");
        String nickname = (String) paramsMap.get("nickname");
        String username = (String) paramsMap.get("username");
        //查询用户条件
        List<UserInfoVO> users = null;
        if (StringUtils.isNotBlank(username)) {
            users = roaMalllifeUserService.getUsersByNicknameUsername(nickname, username);
            if (users == null || users.isEmpty()) {
                paramsMap.put("buyerId", "-1");
            }
        }
        List<String> userList = null;
        if (!CollectionUtils.isEmpty(users)) {
            userList = getIdFromUser(users);
        }

        if (!CollectionUtils.isEmpty(userList)) {
            paramsMap.put("userList", userList);
        }
        if (StringUtils.isNotEmpty(shopId)) {
            List<String> shopList = new ArrayList<>();
            shopList.add(shopId);
            paramsMap.put("shopList", shopList);
        }
        if (StringUtils.isNotEmpty(commodityNo)) {
            List<String> commodityIds = new ArrayList<>();
            List<ObjectId> ids = mcmcCommoditySolrService.selectCommodityIndexByNameCode(commodityNo, null);
            if (CollectionUtils.isEmpty(ids)) {
                return null;
            }
            for (ObjectId id : ids) {
                commodityIds.add(id.toString());
            }
            paramsMap.put("commodityIds", commodityIds);
        }
        if (paramsMap.containsKey("sellerAccount")) {
            List<Integer> guideIds = new ArrayList<>();
            Map<String, Object> map = new HashMap<>();
            map.put("userAccount", paramsMap.get("sellerAccount").toString());
            map.put("isDisabled", 0);
            UserInfo userInfo = iUserInfoService.getUserByMap(map);//导购(商场品牌)
            if (userInfo != null)
                guideIds.add(userInfo.getId());
            map.put("type", ConstantEnum.USER_TYPE_2.getCodeInt());
            UserInfo userInfo2 = iUserInfoService.getUserByMap(map);//买手
            if (userInfo2 != null)
                guideIds.add(userInfo2.getId());
            if (CollectionUtils.isNotEmpty(guideIds))
                paramsMap.put("guideIds", guideIds);
            else {
                guideIds.add(-1);
                paramsMap.put("guideIds", guideIds);
            }
        }
        LOGGER.info("warpToParamMap end paramsMap={}", paramsMap);
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

}

package com.rongyi.tms.web.controller.v2;

import com.rongyi.core.bean.ResponseData;
import com.rongyi.core.common.PagingVO;
import com.rongyi.easy.bsoms.entity.UserInfo;
import com.rongyi.easy.coupon.vo.MMUserCouponVO;
import com.rongyi.easy.malllife.vo.UserInfoVO;
import com.rongyi.easy.mcmc.vo.CommodityWebVO;
import com.rongyi.easy.rmmm.entity.MallCooperateEntity;
import com.rongyi.easy.rmmm.vo.OrderManagerVO;
import com.rongyi.easy.rmmm.vo.ParentOrderVO;
import com.rongyi.easy.rmmm.vo.SonOrderVO;
import com.rongyi.easy.tms.vo.v2.CommodityDetailVO;
import com.rongyi.easy.tms.vo.v2.SubOrderDetailVO;
import com.rongyi.easy.tms.vo.v2.SubOrderExcelVO;
import com.rongyi.rss.bsoms.IUserInfoService;
import com.rongyi.rss.coupon.mall.shop.MSUserCouponService;
import com.rongyi.rss.malllife.roa.ROACommodityService;
import com.rongyi.rss.malllife.roa.user.ROAMalllifeUserService;
import com.rongyi.rss.mallshop.shop.ROACooperationMallService;
import com.rongyi.rss.mallshop.shop.ROAShopService;
import com.rongyi.rss.mcmc.CommodityService;
import com.rongyi.rss.tradecenter.osm.IOrderQueryService;
import com.rongyi.tms.Exception.BizException;
import com.rongyi.tms.Exception.PermissionException;
import com.rongyi.tms.constants.Constant;
import com.rongyi.tms.constants.ConstantEnum;
import com.rongyi.tms.excel.ExportOsmOrderExcel;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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
    private IUserInfoService iUserInfoService;

    @Autowired
    private ExportOsmOrderExcel exportOsmOrderExcel;

    @Autowired
    private MSUserCouponService msUserCouponService;

    @Autowired
    ROACommodityService commodityService;

    @Autowired
    IOrderQueryService iOrderQueryService;

    @Autowired
    private ROAShopService roaShopService;

    @Autowired
    private CommodityService mcmcCommodityService;

    @Autowired
    private ROACooperationMallService roaCooperationMallService;

    /**
     * 条件查询订单列表
     *
     * @return
     * @throws Exception
     */
    @RequestMapping("/list")
    @ResponseBody
    public ResponseData list(@RequestBody Map<String, Object> paramsMap, HttpServletRequest request) {
        ResponseData responseData;
        try {
            LOGGER.info("子订单列表:paramsMap={}", paramsMap);
//            permissionCheck(request, "ORDER_GOODSON_VIEW");
            this.replaceListToNull(paramsMap);// 过滤前台传入的空字符串
            warpToParamMap(paramsMap);
            PagingVO<OrderManagerVO> pagingVO = iOrderQueryService.searchListByMap(paramsMap);

            List<OrderManagerVO> orderForms = pagingVO.getDataList();
            if (orderForms == null)
                orderForms = new ArrayList<>();
            int totalPage = pagingVO.getTotalSize();
            int currentPage = pagingVO.getCurrentPage();
            responseData = ResponseData.success(orderForms, currentPage, Constant.PAGE.PAGESIZE, totalPage);
        } catch (BizException e) {
            LOGGER.error(e.getMessage());
            responseData = ResponseData.success();
        } catch (PermissionException e) {
            LOGGER.error(e.getMessage());
            e.printStackTrace();
            return ResponseData.failure(Integer.valueOf(e.getCode()), e.getMessage());
        } catch (Exception e) {
            responseData = ResponseData.failure(ConstantEnum.LIST_QUERY_EXCEPTION.getCodeInt(), ConstantEnum.LIST_QUERY_EXCEPTION.getValueStr());
            e.printStackTrace();
            LOGGER.error("子订单查询失败,message={}", e);
        }
        return responseData;
    }

    @RequestMapping("/detail")
    @ResponseBody
    public ResponseData detail(HttpServletRequest request, Integer id) {
        LOGGER.info("子订单详情:id={}", id);
        ResponseData responseData;
        try {
//            permissionCheck(request, "ORDER_GOODSON_VIEW");
            ParentOrderVO orderDetailVo = iOrderQueryService.searchRYOrderDetail(id);
            List<SonOrderVO> sonOrderList = orderDetailVo.getSonOrderList();
            BigDecimal rebateDiscountTotal = BigDecimal.ZERO;//抵扣券抵扣总金额
//            BigDecimal discountTotal =  BigDecimal.ZERO;//总卡券信息（包含抵扣券）
            BigDecimal hbDisCountTotal = BigDecimal.ZERO;//红包抵扣总额
            rebateDiscountTotal = rebateDiscountTotal.add(orderDetailVo.getCouponDiscount()).add(orderDetailVo.getOrderCouponDiscount());//抵扣信息
            BigDecimal commidityTotalPice = new BigDecimal("0.00");//商品总价
            if (!CollectionUtils.isEmpty(sonOrderList)) {
                //目前一个订单只会有一种商品，直播也是一个
                orderDetailVo.setLiveName(sonOrderList.get(0).getLiveName());
                for (SonOrderVO sonOrderVo : sonOrderList) {
                    hbDisCountTotal = hbDisCountTotal.add(sonOrderVo.getHbDiscount());
                    commidityTotalPice = commidityTotalPice.add(new BigDecimal(sonOrderVo.getNum())
                            .multiply(new BigDecimal(sonOrderVo.getCommodityCurrentPrice()))).setScale(2, BigDecimal.ROUND_HALF_UP);
                    if (StringUtils.isNotBlank(sonOrderVo.getCouponCode())) {
                        MMUserCouponVO userCouponVO = msUserCouponService.getUserCouponByCouponCode(sonOrderVo
                                .getCouponCode());
                        if (userCouponVO != null) {
                            userCouponVO.setRealDiscount(sonOrderVo.getRealAmount());
                        }
                    }
                }
            }
            //抵扣券合计
            if (rebateDiscountTotal.subtract((commidityTotalPice.subtract(orderDetailVo.getDiscountFee()))).compareTo(BigDecimal.ZERO) > 0) {
                orderDetailVo.setDeductCouponAmount(commidityTotalPice.subtract(orderDetailVo.getDiscountFee()).setScale(2, 4).toString());
            } else {
                orderDetailVo.setDeductCouponAmount(rebateDiscountTotal.toString());
            }
            //红包抵扣合计
            orderDetailVo.setTotalHongBaoAmount(hbDisCountTotal);
            if (StringUtils.isNotBlank(orderDetailVo.getCommitOrderTime())) {
                orderDetailVo.setCommitOrderTime(orderDetailVo.getCommitOrderTime().substring(0, 16));
            }
            if (StringUtils.isNotBlank(orderDetailVo.getDeliverTime())) {
                orderDetailVo.setDeliverTime(orderDetailVo.getDeliverTime().substring(0, 16));
            }
            if (StringUtils.isNotBlank(orderDetailVo.getPayTime())) {
                orderDetailVo.setPayTime(orderDetailVo.getPayTime().substring(0, 16));
            }
            responseData = ResponseData.success(orderDetailVo);
        } catch (PermissionException e) {
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
    public void exportExcel(SubOrderExcelVO subOrderExcelVO, HttpServletResponse response, HttpServletRequest request) {
        LOGGER.info("报表导出:subOrderExcelVO={}", subOrderExcelVO);
        try {
            Map<String, Object> paramsMap = subOrderExcelVO.toMap();
            permissionCheck(request, "ORDER_GOODSON_EXPORT");
            this.replaceListToNull(paramsMap);// 过滤前台传入的空字符串
            warpToParamMap(paramsMap);
            exportOsmOrderExcel.exportExcel(request, response, paramsMap);
        } catch (BizException e) {
            LOGGER.error(e.getMessage());
        } catch (PermissionException e) {
            LOGGER.error(e.getMessage(), e);
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
    @RequestMapping(value = "/validateExcelCount")
    @ResponseBody
    public ResponseData validateExcelCount(@RequestBody Map<String, Object> paramsMap, HttpServletRequest request) {
        LOGGER.info("validateExcelCount:paramsMap={}", paramsMap);
        ResponseData responseData = ResponseData.failure();
        try {
            permissionCheck(request, "ORDER_GOODSON_EXPORT");
            this.replaceListToNull(paramsMap);// 过滤前台传入的空字符串
            warpToParamMap(paramsMap);
            PagingVO<OrderManagerVO> pagingVO = iOrderQueryService.searchListByMap(paramsMap);
            if (pagingVO != null && pagingVO.getRowCnt() <= ConstantEnum.EXCEL_LIMIT_COUNT.getCodeInt())
                responseData = ResponseData.success();
        } catch (PermissionException e) {
            LOGGER.error(e.getMessage(), e);
            e.printStackTrace();
            return ResponseData.failure(Integer.valueOf(e.getCode()), e.getMessage());
        } catch (BizException e) {
            LOGGER.error(e.getMessage());
            responseData = ResponseData.success();
        } catch (Exception e) {
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
    public ResponseData commodityDetail(String commodityId, HttpServletRequest request) {
        LOGGER.info("商品详情:commodityId={}", commodityId);
        ResponseData responseData;
        try {
            permissionCheck(request, "ORDER_GOODSON_VIEW");
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
        } catch (PermissionException e) {
            LOGGER.error(e.getMessage(), e);
            e.printStackTrace();
            return ResponseData.failure(Integer.valueOf(e.getCode()), e.getMessage());
        } catch (Exception e) {
            responseData = ResponseData.failure(ConstantEnum.DETAIL_QUERY_EXCEPTION.getCodeInt(), ConstantEnum.DETAIL_QUERY_EXCEPTION.getValueStr());
            e.printStackTrace();
            LOGGER.error("获取商品详情失败,message={}", e);
        }
        return responseData;
    }


    private Map<String, Object> warpToParamMap(Map<String, Object> paramsMap) throws BizException {
        String commodityNo = (String) paramsMap.get("commodityNo");
        String userName = (String) paramsMap.get("username");
        //查询用户条件
        UserInfoVO userInfoVO;
        if (StringUtils.isNotBlank(userName)) {
            try {
                userInfoVO = roaMalllifeUserService.getByPhone(userName);
            } catch (Exception e) {
                e.printStackTrace();
                LOGGER.error("获取商品详情失败,message={}", e);
                throw new BizException(ConstantEnum.EXCEPTION_INTERFACE);
            }
            if (userInfoVO == null || StringUtils.isBlank(userInfoVO.getUserId())) {
                throw new BizException(ConstantEnum.RESULT_IS_EMPTY);
            }
            paramsMap.put("buyerId", userInfoVO.getUserId());
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
            if (CollectionUtils.isEmpty(guideIds)) {
                throw new BizException(ConstantEnum.RESULT_IS_EMPTY);
            }
            paramsMap.put("guideIds", guideIds);
        }

        // 根据商场名称，模糊查询商铺ID集合
        Object mallId = paramsMap.get("mallId");
        if (null != mallId && StringUtils.isNotBlank(mallId.toString())) {
            List<Integer> shopIdList = this.getShopIdListByMallName(mallId.toString());
            if (CollectionUtils.isEmpty(shopIdList)) {
                throw new BizException(ConstantEnum.RESULT_IS_EMPTY);
            }
            paramsMap.put("shopList", shopIdList);
        }
        // 根据商铺名称，模糊查询商铺ID集合
        Object shopId = paramsMap.get("shopId");
        if (null != shopId && StringUtils.isNotBlank(shopId.toString())) {
            List<Integer> shopIdList;
            try {
                shopIdList = this.getShopIdListByShopName(paramsMap.get("shopId").toString());
            } catch (Exception e) {
                e.printStackTrace();
                LOGGER.error("获取商品详情失败,message={}", e);
                throw new BizException(ConstantEnum.EXCEPTION_INTERFACE);
            }
            if (CollectionUtils.isEmpty(shopIdList)) {
                throw new BizException(ConstantEnum.RESULT_IS_EMPTY);
            }
            paramsMap.put("shopIdFromShopList", shopIdList);
        }

        // 根据商品名称，商品编码模糊查询订单
        String commodityName = (String) paramsMap.get("commodityName");
        if (StringUtils.isNotBlank(commodityName) || StringUtils.isNotBlank(commodityNo)) {
            List<String> commodityIdList = mcmcCommodityService.selectCommodityByNameAndCode(commodityName, commodityNo);
            if (CollectionUtils.isEmpty(commodityIdList)) {
                throw new BizException(ConstantEnum.RESULT_IS_EMPTY);
            }
            paramsMap.put("commodityIds", commodityIdList);
        }
        // 根据商品名称，商品编码模糊查询订单
        String commodityId = (String) paramsMap.get("commodityId");
        if (StringUtils.isNotBlank(commodityId) || StringUtils.isNotBlank(commodityId)) {
            List<String> commodityIdList = new ArrayList<>();
            commodityIdList.add(commodityId);
            paramsMap.put("commodityIds", commodityIdList);
        }

        LOGGER.info("warpToParamMap end paramsMap={}", paramsMap);
        return paramsMap;
    }

    private void replaceListToNull(Map<String, Object> paramsMap) {
        if (null != paramsMap) {
            if (null != paramsMap.get("orderCartNo") && StringUtils.isBlank(paramsMap.get("orderCartNo").toString())) {
                paramsMap.remove("orderCartNo");
            }
        }
        if (null != paramsMap) {
            if (null != paramsMap.get("orderNo") && StringUtils.isBlank(paramsMap.get("orderNo").toString())) {
                paramsMap.remove("orderNo");
            }
        }
        if (null != paramsMap) {
            if (null != paramsMap.get("mallId") && StringUtils.isBlank(paramsMap.get("mallId").toString())) {
                paramsMap.remove("mallId");
            }
        }
        if (null != paramsMap) {
            if (null != paramsMap.get("shopId") && StringUtils.isBlank(paramsMap.get("shopId").toString())) {
                paramsMap.remove("shopId");
            }
        }
        if (null != paramsMap) {
            if (null != paramsMap.get("sellerAccount") && StringUtils.isBlank(paramsMap.get("sellerAccount").toString())) {
                paramsMap.remove("sellerAccount");
            }
        }
        if (null != paramsMap) {
            if (null != paramsMap.get("userPhone") && StringUtils.isBlank(paramsMap.get("userPhone").toString())) {
                paramsMap.remove("userPhone");
            }
        }
        if (null != paramsMap) {
            if (null != paramsMap.get("username") && StringUtils.isBlank(paramsMap.get("username").toString())) {
                paramsMap.remove("username");
            }
        }
        if (null != paramsMap) {
            if (null != paramsMap.get("commodityNo") && StringUtils.isBlank(paramsMap.get("commodityNo").toString())) {
                paramsMap.remove("commodityNo");
            }
        }
        if (null != paramsMap) {
            if (null != paramsMap.get("commodityId") && StringUtils.isBlank(paramsMap.get("commodityId").toString())) {
                paramsMap.remove("commodityId");
            }
        }
        if (null != paramsMap) {
            if (null != paramsMap.get("commodityName") && StringUtils.isBlank(paramsMap.get("commodityName").toString())) {
                paramsMap.remove("commodityName");
            }
        }
        if (null != paramsMap) {
            if (null != paramsMap.get("payChannel") && StringUtils.isBlank(paramsMap.get("payChannel").toString())) {
                paramsMap.remove("payChannel");
            }
        }
        if (null != paramsMap) {
            if (null != paramsMap.get("amountType") && StringUtils.isBlank(paramsMap.get("amountType").toString())) {
                paramsMap.remove("amountType");
            }
        }
        if (null != paramsMap) {
            if (null != paramsMap.get("realAmountBegin") && StringUtils.isBlank(paramsMap.get("realAmountBegin").toString())) {
                paramsMap.remove("realAmountBegin");
            }
        }
        if (null != paramsMap) {
            if (null != paramsMap.get("realAmountEnd") && StringUtils.isBlank(paramsMap.get("realAmountEnd").toString())) {
                paramsMap.remove("realAmountEnd");
            }
        }
        if (null != paramsMap) {
            if (null != paramsMap.get("guideType") && StringUtils.isBlank(paramsMap.get("guideType").toString())) {
                paramsMap.remove("guideType");
            }
        }
        if (null != paramsMap) {
            if (null != paramsMap.get("orderSource") && StringUtils.isBlank(paramsMap.get("orderSource").toString())) {
                paramsMap.remove("orderSource");
            }
        }
        if (null != paramsMap) {
            if (null != paramsMap.get("status") && StringUtils.isBlank(paramsMap.get("status").toString())) {
                paramsMap.remove("status");
            }
        }
        if (null != paramsMap) {
            if (null != paramsMap.get("commodityId") && StringUtils.isBlank(paramsMap.get("commodityId").toString())) {
                paramsMap.remove("commodityId");
            }
        }
    }

    /**
     * 根据商场名称，模糊查询店铺ID集合
     *
     * @param mallName
     * @return
     * @throws Exception
     */
    private List<Integer> getShopIdListByMallName(String mallName) throws BizException {
        List<Integer> shopIdList = null;
        // 根据mallName 查询mallId集合
        List<MallCooperateEntity> mallCooperateEntityList;
        try {
            mallCooperateEntityList = roaCooperationMallService.getMallListByMallName(mallName);
        } catch (Exception e) {
            e.printStackTrace();
            LOGGER.error("获取商品详情失败,message={}", e);
            throw new BizException(ConstantEnum.EXCEPTION_INTERFACE);
        }
        if (CollectionUtils.isNotEmpty(mallCooperateEntityList)) {
            // 循环商场结果集，获取商场ID集合
            List<String> mallIdList = new ArrayList<>();
            for (MallCooperateEntity mallCooperateEntity : mallCooperateEntityList) {
                if (null != mallCooperateEntity && null != mallCooperateEntity.getId()) {
                    mallIdList.add(mallCooperateEntity.getId().toString());
                }
            }
            // 根据mallIdList，查询shopIdList
            if (CollectionUtils.isNotEmpty(mallIdList)) {
                Map<String, Object> map = new HashMap<>();
                map.put("mallIds", mallIdList);
                shopIdList = roaShopService.getAllShopIdBuMallId(map);
            }
        }
        return shopIdList;
    }

    /**
     * 根据店铺名称，模糊查询店铺ID集合
     *
     * @param shopName
     * @return
     * @throws Exception
     */
    private List<Integer> getShopIdListByShopName(String shopName) throws Exception {
        // 根据mallIdList，查询shopIdList
        Map<String, Object> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        sb.append("%").append(shopName).append("%");
        map.put("vagueShopName", sb.toString());
        // 接口的sql模糊查询没有写%，需要手动拼接到参数
        return roaShopService.getAllShopIdBuMallId(map);
    }
}

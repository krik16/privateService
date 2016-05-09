/**
 * @Copyright (C), 上海容易网电子商务有限公司
 * @Author: 柯军
 * @datetime:2015年9月7日上午11:18:04
 * @Description: TODO
 **/

package com.rongyi.tms.web.controller.v2;

import com.rongyi.core.bean.ResponseData;
import com.rongyi.easy.coupon.vo.TCCouponVO;
import com.rongyi.easy.tradecenter.TradeSubOrder;
import com.rongyi.easy.tradecenter.TradeUserCode;
import com.rongyi.easy.usercenter.entity.MalllifeUserInfoEntity;
import com.rongyi.rss.coupon.RoaCouponService;
import com.rongyi.rss.malllife.roa.user.ROAMalllifeUserService;
import com.rongyi.rss.tradecenter.ITradeOrderService;
import com.rongyi.rss.tradecenter.ITradeUserCodeService;
import com.rongyi.tms.Exception.PermissionException;
import com.rongyi.tms.constants.Constant;
import com.rongyi.tms.constants.ConstantEnum;
import com.rongyi.tms.moudle.vo.CouponOrderDetailVO;
import com.rongyi.tms.moudle.vo.CouponOrderDetailVO.CouponVO;
import com.rongyi.tms.moudle.vo.CouponOrderVO;
import com.rongyi.tms.service.CouponOrderService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Author: 柯军
 * Description: 优惠券订单列表
 *
 **/

@Controller
@RequestMapping("/v2/couponOrder")
public class CouponOrderControllerV2 extends BaseControllerV2 {

    @Autowired
    CouponOrderService couponOrderService;

    @Autowired
    ITradeOrderService iTradeOrderService;

    @Autowired
    RoaCouponService roaCouponService;

    @Autowired
    ITradeUserCodeService iTradeUserCodeService;

    @Autowired
    ROAMalllifeUserService roaMalllifeUserService;

    private static final Logger LOGGER = LoggerFactory.getLogger(CouponOrderControllerV2.class);


    /**
     * 优惠券订单列表
     **/
    @RequestMapping("/list")
    @ResponseBody
    public ResponseData list(@RequestBody Map<String, Object> paramsMap, HttpServletRequest request) {
        LOGGER.info("优惠券订单列表:paramsMap={}", paramsMap);
        ResponseData responseData;
        try {
            permissionCheck(request, "ORDER_COUPON_VIEW");
            Integer currpage = Integer.valueOf(paramsMap.get("currentPage").toString());
            List<CouponOrderVO> list = couponOrderService.selectPageList(currpage, Constant.PAGE.PAGESIZE, paramsMap);
            Integer pageTotle = couponOrderService.selectPageListCount(paramsMap);
            responseData = ResponseData.success(list, currpage, Constant.PAGE.PAGESIZE, pageTotle);
        } catch (PermissionException e) {
            LOGGER.error(e.getMessage());
            e.printStackTrace();
            return ResponseData.failure(Integer.valueOf(e.getCode()), e.getMessage());
        } catch (Exception e) {
            responseData = ResponseData.failure(ConstantEnum.LIST_QUERY_EXCEPTION.getCodeInt(), ConstantEnum.LIST_QUERY_EXCEPTION.getValueStr());
            e.printStackTrace();
            LOGGER.error("优惠券订单查询失败,message={}", e);
        }
        return responseData;
    }

    @RequestMapping("/info")
    @ResponseBody
    public ResponseData getCouponOrderInfo(Integer id, HttpServletRequest request) {
        LOGGER.info("优惠券订单详情:id={}", id);
        ResponseData responseData;
        try {
            permissionCheck(request, "ORDER_COUPON_VIEW");
            CouponOrderDetailVO couponOrderDetailVO = new CouponOrderDetailVO();
            CouponOrderVO couponOrderVO = couponOrderService.selectById(id);
            BeanUtils.copyProperties(couponOrderVO, couponOrderDetailVO);
            List<CouponVO> couponVOList = new ArrayList<>();
            List<TradeSubOrder> subOrderList = iTradeOrderService.findTradeSubOrdersById(couponOrderVO.getId().intValue());
            if (subOrderList.isEmpty()) {
                LOGGER.info("子订单为空");
                return ResponseData.failure();
            }
            MalllifeUserInfoEntity malllifeUserInfoEntity = roaMalllifeUserService.getEntityByUid(couponOrderVO.getUserId());
            if (malllifeUserInfoEntity != null) {
                couponOrderDetailVO.setUserPhone(malllifeUserInfoEntity.getPhone());
                couponOrderDetailVO.setUserName(malllifeUserInfoEntity.getNickName());
            }
            TradeSubOrder tradeSubOrder = subOrderList.get(0);
            //红包抵扣总金额
            couponOrderDetailVO.setHbDiscountTotalPrice(new BigDecimal(couponOrderVO.getHbDiscount()).divide(new BigDecimal(100), BigDecimal.ROUND_HALF_UP).setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue());

            List<TradeUserCode> tradeUserCodeList = iTradeUserCodeService.findTradeUserCodeList(id, tradeSubOrder.getUnitId());
            Integer origTotalPrice = 0;//券面值总价
            Integer unitTotalPrice = 0;//券现价总价
            if (tradeUserCodeList != null && !tradeUserCodeList.isEmpty()) {
                //红包分摊抵扣(分)
                BigDecimal avgHbDiscount = new BigDecimal(couponOrderVO.getHbDiscount()).divide(new BigDecimal(tradeSubOrder.getUnitCount()), 2, BigDecimal.ROUND_HALF_DOWN).setScale(0, BigDecimal.ROUND_HALF_DOWN);
                //红包分摊最后剩余红包金额
                BigDecimal lastHbDiscount = new BigDecimal(couponOrderVO.getHbDiscount()).subtract(avgHbDiscount.multiply(new BigDecimal(tradeSubOrder.getUnitCount() - 1))).setScale(0, BigDecimal.ROUND_HALF_UP);
                //积分分摊抵扣(元)
                BigDecimal avgScoreDiscount = new BigDecimal(couponOrderVO.getScoreDiscount()).divide(new BigDecimal(tradeSubOrder.getUnitCount()), 2, BigDecimal.ROUND_HALF_DOWN).setScale(2, BigDecimal.ROUND_HALF_DOWN);
                //积分分摊最后剩余积分
                BigDecimal lastScoreDiscount = new BigDecimal(couponOrderVO.getScoreDiscount()).subtract(avgScoreDiscount.multiply(new BigDecimal(tradeSubOrder.getUnitCount() - 1))).setScale(2, BigDecimal.ROUND_HALF_UP);
                //抵扣券分摊抵扣(元)
                BigDecimal avgRebateDiscount = new BigDecimal(couponOrderVO.getRebateDiscount()).divide(new BigDecimal(tradeSubOrder.getUnitCount()), 2, BigDecimal.ROUND_HALF_DOWN).setScale(2, BigDecimal.ROUND_HALF_DOWN);
                //抵扣券分摊最后剩余抵扣
                BigDecimal lastRebateDiscount = new BigDecimal(couponOrderVO.getRebateDiscount()).subtract(avgRebateDiscount.multiply(new BigDecimal(tradeSubOrder.getUnitCount() - 1))).setScale(2, BigDecimal.ROUND_HALF_UP);
                //实际支付金额分摊(元)
                BigDecimal avgPayAmount = new BigDecimal(couponOrderVO.getTotalAmount()).divide(new BigDecimal(tradeSubOrder.getUnitCount()), 2, BigDecimal.ROUND_HALF_UP).setScale(2, BigDecimal.ROUND_HALF_UP);
                //有效期
                TCCouponVO tCCouponVO = roaCouponService.findTCCouponById(tradeSubOrder.getUnitId());

                for (TradeUserCode tradeUserCode : tradeUserCodeList) {
                    origTotalPrice += tradeUserCode.getOrigPrice();
                    unitTotalPrice += tradeUserCode.getUnitPrice();
                    CouponVO couponVO = couponOrderDetailVO.new CouponVO();
                    BeanUtils.copyProperties(tradeUserCode, couponVO);
//					couponVO.setTitle(tradeSubOrder.getUnitName());
                    couponVO.setHbDiscount(avgHbDiscount.divide(new BigDecimal(100), 2, BigDecimal.ROUND_HALF_UP).setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue());
                    couponVO.setRebateDisCount(avgRebateDiscount.doubleValue());
                    couponVO.setScoreDisCount(avgScoreDiscount.doubleValue());
                    couponVO.setPayAmount(avgPayAmount.subtract(avgRebateDiscount).subtract(avgScoreDiscount).subtract(avgHbDiscount.divide(new BigDecimal(100), 2, BigDecimal.ROUND_HALF_UP)).doubleValue());
                    couponVO.setValidBeginDate(tCCouponVO.getValidBeginDate());
                    couponVO.setValidEndDate(tCCouponVO.getValidEndDate());
                    couponVOList.add(couponVO);
                }
                //最后一笔券获得剩余优惠
                if (couponVOList.size() > 1) {
                    couponVOList.get(couponVOList.size() - 1).setHbDiscount(lastHbDiscount.divide(new BigDecimal(100), 2, BigDecimal.ROUND_HALF_UP).setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue());
                    couponVOList.get(couponVOList.size() - 1).setRebateDisCount(lastRebateDiscount.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue());
                    couponVOList.get(couponVOList.size() - 1).setScoreDisCount(lastScoreDiscount.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue());
                    //最后一笔实际支付金额=平均支付金额-(最后一笔红包优惠)-(最后一笔抵扣券优惠)-(最后一笔积分优惠)
                    couponVOList.get(couponVOList.size() - 1).setPayAmount(avgPayAmount.subtract(lastHbDiscount.divide(new BigDecimal(100), 2, BigDecimal.ROUND_HALF_UP)).subtract(lastRebateDiscount).subtract(lastScoreDiscount).doubleValue());
                }

            }
            couponOrderDetailVO.setCouponList(couponVOList);
            couponOrderDetailVO.setOrigTotalPrice(new BigDecimal(origTotalPrice).divide(new BigDecimal(100), BigDecimal.ROUND_HALF_UP).setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue());
            couponOrderDetailVO.setUnitTotalPrice(new BigDecimal(unitTotalPrice).divide(new BigDecimal(100), BigDecimal.ROUND_HALF_UP).setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue());
            responseData = ResponseData.success(couponOrderDetailVO);
        } catch (PermissionException e) {
            LOGGER.error(e.getMessage());
            e.printStackTrace();
            return ResponseData.failure(Integer.valueOf(e.getCode()), e.getMessage());
        } catch (Exception e) {
            responseData = ResponseData.failure(ConstantEnum.DETAIL_QUERY_EXCEPTION.getCodeInt(), ConstantEnum.DETAIL_QUERY_EXCEPTION.getValueStr());
            e.printStackTrace();
            LOGGER.error("优惠券订单查询失败,message={}", e);
        }

        return responseData;
    }
}

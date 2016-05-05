package com.rongyi.tms.web.controller.v2;

import com.rongyi.core.bean.ResponseData;
import com.rongyi.core.common.PagingVO;
import com.rongyi.core.constant.PaymentEventType;
import com.rongyi.easy.malllife.vo.UserInfoVO;
import com.rongyi.easy.osm.vo.OrderCartFormVO;
import com.rongyi.easy.tms.vo.v2.CartOrderExcelVO;
import com.rongyi.rss.malllife.roa.user.ROAMalllifeUserService;
import com.rongyi.rss.tradecenter.osm.IOrderCartService;
import com.rongyi.rss.tradecenter.osm.IOrderQueryService;
import com.rongyi.tms.Exception.PermissionException;
import com.rongyi.tms.constants.Constant;
import com.rongyi.tms.constants.ConstantEnum;
import com.rongyi.tms.excel.ExportOsmOrderExcel;
import com.rongyi.tms.moudle.vo.ParentOrderCartVO;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * 母订单列表
 * kejun
 */
@Controller
@RequestMapping("/v2/cartOrder")
public class CartOrderController extends BaseControllerV2 {
    private static final Logger LOGGER = LoggerFactory.getLogger(CartOrderController.class);

    @Autowired
    private IOrderQueryService iOrderQueryService;

    @Autowired
    private ROAMalllifeUserService roaMalllifeUserService;

    @Autowired
    private IOrderCartService iOrderCartService;

    @Autowired
    private ExportOsmOrderExcel exportOsmOrderExcel;


    @RequestMapping("/list")
    @ResponseBody
    public ResponseData list(@RequestBody Map<String, Object> paramsMap,HttpServletRequest request) {
        LOGGER.info("母订单列表:parramsMap={}",paramsMap);
        ResponseData responseData;
        try {
            permissionCheck(request, "ORDER_GOODS_VIEW");
            this.replaceListToNull(paramsMap);
            warpToParamMap(paramsMap);
            int currPage = paramsMap.containsKey("currentPage") ? Integer.valueOf(paramsMap.get("currentPage").toString()) : 1;
            paramsMap.put("currPage",currPage);
            PagingVO<OrderCartFormVO> page = iOrderCartService.searchListByMap(paramsMap);
            List<ParentOrderCartVO> orderCartVOs = convertToOrderCart(page.getDataList());
            responseData = ResponseData.success(orderCartVOs, currPage, Constant.PAGE.PAGESIZE, page.getTotalSize());
        } catch (PermissionException e){
            LOGGER.error(e.getMessage());
            e.printStackTrace();
            return ResponseData.failure(Integer.valueOf(e.getCode()), e.getMessage());
        }catch (Exception e) {
            responseData = ResponseData.failure(ConstantEnum.LIST_QUERY_EXCEPTION.getCodeInt(), ConstantEnum.LIST_QUERY_EXCEPTION.getValueStr());
            e.printStackTrace();
            LOGGER.error("母订单查询失败,message={}", e);
        }
        return responseData;
    }

    private List<ParentOrderCartVO> convertToOrderCart(List<OrderCartFormVO> dataList) throws Exception {
        if (CollectionUtils.isEmpty(dataList)) {
            return new ArrayList<>();
        }
        List<ParentOrderCartVO> orderCartVOs = new ArrayList<>();
        for (OrderCartFormVO orderCartVO : dataList) {
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
            if (userInfo != null) {
                orderCart.setBuyerAccount(userInfo.getUserPhone());
                orderCart.setBuyerPhone(userInfo.getUserPhone());
                orderCart.setBuyerName(userInfo.getUserName());
            }
            orderCartVOs.add(orderCart);
        }
        return orderCartVOs;
    }
    /**
     * 导出母订单
     **/
    @RequestMapping("/exportExcel")
    @ResponseBody
    public void exportOsmOrder(CartOrderExcelVO cartOrderExcelVO, HttpServletResponse response, HttpServletRequest request) {
        LOGGER.info("报表导出:cartOrderExcelVO={}", cartOrderExcelVO);
        try {
            Map<String,Object> paramsMap = cartOrderExcelVO.toMap();
            permissionCheck(request,"ORDER_GOODS_EXPORT");
           warpToParamMap(paramsMap);
            if (paramsMap != null) {
                exportOsmOrderExcel.exportExcel(request, response, paramsMap);
            }
        } catch (PermissionException e){
            LOGGER.error(e.getMessage(),e);
            e.printStackTrace();
        }catch (Exception e) {
            e.printStackTrace();
            LOGGER.error("报表导出失败,message={}", e);
        }
    }

    /**
     * 验证导出报表总数是否超过限制
     **/
    @SuppressWarnings("unchecked")
    @RequestMapping(value = "/validateExcelCount")
    @ResponseBody
    public ResponseData validateExcelCount(@RequestBody Map<String, Object> paramsMap,HttpServletRequest request) {
        LOGGER.info("validateExcelCount:paramsMap={}",paramsMap);
        ResponseData responseData = ResponseData.failure(ConstantEnum.EXCEPTION_LIMIT_COUNT.getCodeInt(),ConstantEnum.EXCEPTION_LIMIT_COUNT.getValueStr());
        try {
            permissionCheck(request,"ORDER_GOODS_EXPORT");
           warpToParamMap(paramsMap);
            PagingVO<OrderCartFormVO> pagingVO = iOrderCartService.searchListByMap(paramsMap);
            LOGGER.info("要导出的数据总数:totalCount={}",pagingVO.getRowCnt());
            if (pagingVO != null && pagingVO.getRowCnt() <= ConstantEnum.EXCEL_LIMIT_COUNT.getCodeInt())
                responseData = ResponseData.success();
        } catch (PermissionException e){
            LOGGER.error(e.getMessage());
            e.printStackTrace();
            return ResponseData.failure(Integer.valueOf(e.getCode()), e.getMessage());
        }catch (Exception e) {
            e.printStackTrace();
            LOGGER.error("报表导出上限检查失败,message={}", e);
        }
        return responseData;
    }

    private Map<String, Object> warpToParamMap(Map<String, Object> paramsMap) throws Exception {
        if (paramsMap.get("userAccount") != null && StringUtils.isNotEmpty(paramsMap.get("userAccount").toString())) {
            String phone = paramsMap.get("userAccount").toString();
            UserInfoVO userInfo = roaMalllifeUserService.getByPhone(phone);
            if (userInfo == null) {//用户不存在
                paramsMap.put("buyerId", "-1");
            }
            paramsMap.put("buyerId", userInfo.getUserId());
        }
        if(paramsMap.get("payChannel") != null && StringUtils.isNotEmpty(paramsMap.get("payChannel").toString())){
            String payChannel = paramsMap.get("payChannel").toString();
            List<String> payChannels = new ArrayList<>();
            if(Integer.valueOf(payChannel) == 0){
                payChannels.add(PaymentEventType.PAYMENT);
                payChannels.add(PaymentEventType.APP);
                paramsMap.put("payChannels",payChannels);
            }else if(Integer.valueOf(payChannel) == 1){
                paramsMap.put("payChannel",PaymentEventType.WEIXIN_PAY);
            }
        }
        return paramsMap;
    }

    private void replaceListToNull(Map<String, Object> paramsMap) {
        if (null != paramsMap) {
            if (null != paramsMap.get("cartOrderNo") && StringUtils.isBlank(paramsMap.get("cartOrderNo").toString())) {
                paramsMap.remove("cartOrderNo");
            }
        }
        if (null != paramsMap) {
            if (null != paramsMap.get("userAccount") && StringUtils.isBlank(paramsMap.get("userAccount").toString())) {
                paramsMap.remove("userAccount");
            }
        }
        if (null != paramsMap) {
            if (null != paramsMap.get("orderSource") && StringUtils.isBlank(paramsMap.get("payChannel").toString())) {
                paramsMap.remove("orderSource");
            }
        }
        if (null != paramsMap) {
            if (null != paramsMap.get("payChannel") && StringUtils.isBlank(paramsMap.get("payChannel").toString())) {
                paramsMap.remove("payChannel");
            }
        }
        if (null != paramsMap) {
            if (null != paramsMap.get("createAtBegin") && StringUtils.isBlank(paramsMap.get("createAtBegin").toString())) {
                paramsMap.remove("createAtBegin");
            }
        }
        if (null != paramsMap) {
            if (null != paramsMap.get("createAtEnd") && StringUtils.isBlank(paramsMap.get("createAtEnd").toString())) {
                paramsMap.remove("createAtEnd");
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
            if (null != paramsMap.get("status") && StringUtils.isBlank(paramsMap.get("status").toString())) {
                paramsMap.remove("status");
            }
        }
    }
}

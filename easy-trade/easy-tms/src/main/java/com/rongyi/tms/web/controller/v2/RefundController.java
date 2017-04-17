package com.rongyi.tms.web.controller.v2;

import com.rongyi.core.bean.DubboVO;
import com.rongyi.core.bean.ResponseVO;
import com.rongyi.easy.osm.vo.RefundFormVO;
import com.rongyi.easy.rmmm.vo.ExpressDataVO;
import com.rongyi.easy.rmmm.vo.ExpressPushVO;
import com.rongyi.easy.tradecenter.param.RefundQueryParam;
import com.rongyi.rss.tradecenter.osm.IOrderRefundQueryService;
import com.rongyi.tms.constants.CodeEnum;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

/**
 * 大运营后台-退款
 *
 * @author wangjh7
 * @date 2017-04-15
 */
@Controller
@RequestMapping("/v2/refund")
public class RefundController extends BaseControllerV2 {

    private final static Logger LOG = LoggerFactory.getLogger(RefundController.class);

    @Autowired
    private IOrderRefundQueryService orderRefundQueryService;

    /**
     * 获取退款列表
     */
    @RequestMapping("/list.htm")
    @ResponseBody
    public ResponseVO list(@RequestBody RefundQueryParam param, HttpServletRequest request) {
        ResponseVO result = ResponseVO.failure();
        try {
            LOG.info("获取退款列表 | param={}", param);
            permissionCheck(request, "GOOD_ORDER_APPEAL");
            // 初始参数
            buildPrarm(param);
            DubboVO<Integer> dubboVO = orderRefundQueryService.queryForCount(param);
            if (dubboVO.isSuccess()) {
                // 统计总数成功
                int total = dubboVO.getObject();
                LOG.info("获取统计总数：{}", total);
                if (0 < total) {
                    DubboVO<List<RefundFormVO>> list = orderRefundQueryService.queryForList(param);
                    if (list.isSuccess()) {
                        // 成功
                        LOG.info("success");
                        result = ResponseVO.success(list.getObject(), param.getCurrentPage(), param.getPageSize(), total);
                    } else {
                        result = ResponseVO.failure(dubboVO.getCode(), dubboVO.getMessage());
                    }
                } else {
                    result = ResponseVO.success(null, param.getCurrentPage(), param.getPageSize(), total);
                }
            } else {
                result = ResponseVO.failure(dubboVO.getCode(), dubboVO.getMessage());
            }
        } catch (Exception e) {
            LOG.error("获取申诉列表 e={}", e.getMessage(), e);
            e.printStackTrace();
            result = ResponseVO.failure(-1, CodeEnum.ERROR_SYSTEM.getMessage());
        }
        LOG.info(result.getMeta().toString());
        return result;
    }

    /**
     * 初始化数据
     *
     * @param param
     */
    private void buildPrarm(RefundQueryParam param) {
        if (null == param) {
            param = new RefundQueryParam();
        }
        if (1 > param.getCurrentPage()) {
            param.setCurrentPage(1);
        }
        if (1 > param.getPageSize()) {
            param.setPageSize(DEFAULT_PAGE_SIZE);
        }
        param.setStart((param.getCurrentPage() - 1) * param.getPageSize());
        // 查询全部退款状态
        if (new Integer(0).equals(param.getStatus())) {
            param.setStatus(null);
        }
        // 查询全部退款类型
        if (new Integer(0).equals(param.getType())) {
            param.setType(null);
        }
        // 查询全部申诉状态
        if (new Integer(0).equals(param.getComplaintStatus())) {
            param.setComplaintStatus(null);
        }
    }
}

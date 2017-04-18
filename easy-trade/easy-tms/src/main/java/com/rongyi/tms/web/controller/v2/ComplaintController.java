package com.rongyi.tms.web.controller.v2;

import com.rongyi.core.bean.DubboVO;
import com.rongyi.core.bean.ResponseVO;
import com.rongyi.easy.osm.vo.ComplaintFormVO;
import com.rongyi.easy.tradecenter.param.ComplaintQueryParam;
import com.rongyi.rss.tradecenter.osm.IOrderComplaintQueryService;
import com.rongyi.tms.Exception.PermissionException;
import com.rongyi.tms.constants.CodeEnum;
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
 * 大运营后台-申诉
 *
 * @author wangjh7
 * @date 2017-04-15
 */
@Controller
@RequestMapping("/v2/complaint")
public class ComplaintController extends BaseControllerV2 {

    private final static Logger LOG = LoggerFactory.getLogger(ComplaintController.class);

    @Autowired
    private IOrderComplaintQueryService orderComplaintQueryService;

    /**
     * 获取申诉列表
     */
    @RequestMapping("/list.htm")
    @ResponseBody
    public ResponseVO list(@RequestBody ComplaintQueryParam param, HttpServletRequest request) {
        ResponseVO result = ResponseVO.failure();
        try {
            LOG.info("获取申诉列表 | param={}", param);
            try {
                permissionCheck(request, "ORDER_GOODS_APPEAL_VIEW");
            } catch (PermissionException e) {
                return ResponseVO.failure(-1, e.getMessage());
            }
            // 初始参数
            buildPrarm(param);
            DubboVO<Integer> dubboVO = orderComplaintQueryService.queryForCount(param);
            if (dubboVO.isSuccess()) {
                // 统计总数成功
                int total = dubboVO.getObject();
                LOG.info("获取统计总数：{}", total);
                if (0 < total) {
                    DubboVO<List<ComplaintFormVO>> list = orderComplaintQueryService.queryForList(param);
                    if (list.isSuccess()) {
                        // 成功
                        LOG.info("success");
                        result = ResponseVO.success(list.getObject(), param.getPageIndex(), param.getPageSize(), total);
                    } else {
                        result = ResponseVO.failure(dubboVO.getCode(), dubboVO.getMessage());
                    }
                } else {
                    result = ResponseVO.success(new ArrayList<>(), param.getPageIndex(), param.getPageSize(), total);
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
    private void buildPrarm(ComplaintQueryParam param) {
        if (null == param) {
            param = new ComplaintQueryParam();
        }
        if (1 > param.getPageIndex()) {
            param.setPageIndex(1);
        }
        if (1 > param.getPageSize()) {
            param.setPageSize(DEFAULT_PAGE_SIZE);
        }
        param.setStart((param.getPageIndex() - 1) * param.getPageSize());
    }
}

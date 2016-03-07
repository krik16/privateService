/**
 * @Title: DrawApplySearchServiceImpl.java
 * @Package com.rongyi.tms.service.impl
 * @Description: TODO
 * @author 郑亦梁  zhengyiliang@rongyi.com
 * @date 2015年5月28日 下午1:13:02
 * @version V1.0
 * Copyright (C),上海容易网电子商务有限公司
 */
package com.rongyi.tms.service.impl;

import com.rongyi.core.constant.Constants;
import com.rongyi.easy.tms.entity.DrawApply;
import com.rongyi.easy.tms.entity.DrawVerifyLog;
import com.rongyi.easy.tms.vo.DrawApplyDetailVO;
import com.rongyi.easy.tms.vo.DrawApplyListVO;
import com.rongyi.easy.tms.vo.DrawApplySearchParam;
import com.rongyi.rss.tms.DrawApplySearchService;
import com.rongyi.tms.service.DrawApplyService;
import com.rongyi.tms.service.DrawVerifyLogService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

/**
 * @author ZhengYl
 */
@Service
public class DrawApplySearchServiceImpl implements DrawApplySearchService {
    private Logger logger = Logger.getLogger(getClass());

    @Autowired
    private DrawApplyService drawApplyService;

    @Autowired
    private DrawVerifyLogService drawVerifyLogService;

    /* (non-Javadoc)
    * @param param
    * @return
    * @see com.rongyi.rss.tms.DrawApplySearchService#drawApplySearch(com.rongyi.easy.tms.vo.DrawApplySearchParam)
    */
    @Override
    public DrawApplyListVO drawApplySearch(DrawApplySearchParam param) {
        DrawApplyListVO result = new DrawApplyListVO();
        Map<String, Object> searchMap = new HashMap<String, Object>();
        searchMap.put("userId", param.getUserId());
        searchMap.put("currentPage", param.getCurrentPage());
        searchMap.put("pageSize", param.getPageSize());

        Integer progress[] = {0, 1, 2};
        Integer done[] = {3};
        Integer failed[] = {-1, -2};

        if (param.getStatus() == Constants.DrawApplyStatus.PROCESSING) {
            searchMap.put("status", progress);
        } else if (param.getStatus() == Constants.DrawApplyStatus.SEND) {
            searchMap.put("status", done);
        } else if (param.getStatus() == Constants.DrawApplyStatus.FAIL) {
            searchMap.put("status", failed);
        }

        if (param.getTimeRange() == Constants.TMSTimeRangeType.DAY) {
            searchMap.put("dayRange", 1);
        } else if (param.getTimeRange() == Constants.TMSTimeRangeType.WEEK) {
            searchMap.put("weekRange", 1);
        } else if (param.getTimeRange() == Constants.TMSTimeRangeType.MONTH) {
            searchMap.put("monthRange", 1);
        }
        try {
            result = drawApplyService.selectDrawApplyList(searchMap);

        } catch (Exception e) {
            logger.error(e.getMessage());
            e.printStackTrace();
        }
        return result;
    }

    /**
     * 提现记录详情
     *
     * @param id 提现记录id
     * @return
     * @author ZhengYl
     * @date 2016年3月7日
     */
    public DrawApplyDetailVO drawApplyInfo(Integer id) {
        DrawApplyDetailVO resultVO = new DrawApplyDetailVO();
        DrawApply drawApplyInfo = drawApplyService.getOneById(id);
        if (drawApplyInfo != null) {
            resultVO.setId(drawApplyInfo.getId());
            //TODO 因为暂时只有支付宝一种提款方式，以后增加了银行卡或者其他的途径后这里要改 by erliang mallshop v1.8.0
            resultVO.setPayAccountType(drawApplyInfo.getPayType() == 0 ? "支付宝" : "其他");
            Integer status = drawApplyInfo.getStatus();
            if (status < 0) {
                resultVO.setStatus(Constants.DrawApplyStatus.FAIL);
                resultVO.setTraceStatus(2);
            } else if (status >= 0 && status < 2) {
                resultVO.setStatus(Constants.DrawApplyStatus.PROCESSING);
                resultVO.setTraceStatus(0);
            } else if (status == 2) {
                resultVO.setStatus(Constants.DrawApplyStatus.PROCESSING);
                resultVO.setTraceStatus(1);
            } else if (status == 3) {
                resultVO.setStatus(Constants.DrawApplyStatus.SEND);
                resultVO.setTraceStatus(3);
            }
            resultVO.setCreateAt(drawApplyInfo.getCreateAt());
            resultVO.setDrawAmount(new BigDecimal(drawApplyInfo.getDrawAmount() == null ? 0 : drawApplyInfo.getDrawAmount()));
            resultVO.setDrawApplyAccount(drawApplyInfo.getPayAccount());
            if (drawApplyInfo.getId() != null) {
                DrawVerifyLog verifyLog = drawVerifyLogService.getLatestLogByApplyId(drawApplyInfo.getId());
                if (verifyLog != null) {
                    resultVO.setVerifyAt(verifyLog.getCreateAt());
                    resultVO.setFailReason(verifyLog.getMemo());
                }
            }
            resultVO.setPayAt(drawApplyInfo.getTradeAt());

        }
        return resultVO;
    }

}

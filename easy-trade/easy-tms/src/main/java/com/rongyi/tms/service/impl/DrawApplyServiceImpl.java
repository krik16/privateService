/**
 * @Copyright (C), 上海容易网电子商务有限公司
 * @Author: 柯军
 * @datetime:2015年5月11日下午3:26:58
 * @Description: TODO
 **/

package com.rongyi.tms.service.impl;

import com.rongyi.core.common.PagingVO;
import com.rongyi.core.common.util.DateUtil;
import com.rongyi.core.common.util.JsonUtil;
import com.rongyi.core.constant.Constants;
import com.rongyi.core.constant.PaymentEventType;
import com.rongyi.core.constant.VirtualAccountEventType;
import com.rongyi.core.constant.VirtualAccountEventTypeEnum;
import com.rongyi.core.framework.mybatis.service.impl.BaseServiceImpl;
import com.rongyi.easy.mq.MessageEvent;
import com.rongyi.easy.rmmm.dto.user.UserShopMallAccountDto;
import com.rongyi.easy.tms.entity.DrawApply;
import com.rongyi.easy.tms.entity.DrawVerifyLog;
import com.rongyi.easy.tms.vo.DrawApplyDetailVO;
import com.rongyi.easy.tms.vo.DrawApplyListVO;
import com.rongyi.easy.va.entity.VirtualAccountDetailEntity;
import com.rongyi.rss.mallshop.user.ROAUserService;
import com.rongyi.rss.rpb.OrderNoGenService;
import com.rongyi.tms.constants.Constant;
import com.rongyi.tms.constants.ConstantEnum;
import com.rongyi.tms.moudle.vo.CheckParam;
import com.rongyi.tms.moudle.vo.DrawApplyInfoVO;
import com.rongyi.tms.moudle.vo.MQDrawParam;
import com.rongyi.tms.mq.Sender;
import com.rongyi.tms.service.DrawApplyService;
import com.rongyi.tms.service.DrawVerifyLogService;
import com.rongyi.tms.util.ValidateUtil;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.*;

/**
 * @Author: 柯军
 * @Description: 提现申请sevice实现
 * @datetime:2015年5月11日下午3:26:58
 **/

@Service
public class DrawApplyServiceImpl extends BaseServiceImpl implements DrawApplyService {

    private static final String INTEGRAL_COMM_NAMESPACE_DRAWAPPLY = "com.rongyi.tms.mapper.xml.DrawApplyMapper";

    private static final Logger LOGGER = Logger.getLogger(DrawApplyServiceImpl.class);

    @Autowired
    ROAUserService rOAUserService;

    @Autowired
    OrderNoGenService orderNoGenService;

    @Autowired
    private DrawVerifyLogService drawVerifyLogService;

    @Autowired
    Sender sender;

    @Override
    public int insert(DrawApply drawApply) {
        return this.getBaseDao().insertBySql(INTEGRAL_COMM_NAMESPACE_DRAWAPPLY + ".insert", drawApply);
    }

    @Override
    public PagingVO<DrawApply> findByPage(Map<String, Object> params) {
        PagingVO<DrawApply> paging = new PagingVO<DrawApply>(Constant.PAGE.PAGESIZE, Constant.PAGE.CURRENTPAGE);
        if (params.get("pageNo") != null) {
            paging.setCurrentPage((int) params.get("pageNo"));
        }
        if (params.get("pageSize") != null) {
            paging.setPageSize((int) params.get("pageSize"));
        }
        int totalSize = this.getBaseDao().selectOneBySql(INTEGRAL_COMM_NAMESPACE_DRAWAPPLY + ".countAll", params);
        paging.setRowCnt(totalSize);
        paging.setTotalPage(totalSize % paging.getPageSize() == 0 ? totalSize / paging.getPageSize() : (totalSize / paging.getPageSize() + 1));
        List<DrawApply> drawApplys = this.getBaseDao().selectListBySql(
                INTEGRAL_COMM_NAMESPACE_DRAWAPPLY + ".selectByPage", params);
        paging.setDataList(drawApplys);
        return paging;
    }

    @Override
    public DrawApply getOneById(int id) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("id", id);
        return this.getBaseDao().selectOneBySql(INTEGRAL_COMM_NAMESPACE_DRAWAPPLY + ".selectByPrimaryKey", map);
    }

    @Override
    public DrawApply getOneByDrawNo(String drawNo) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("drawNo", drawNo);
        return this.getBaseDao().selectOneBySql(INTEGRAL_COMM_NAMESPACE_DRAWAPPLY + ".selectByPrimaryKey", map);
    }

    @SuppressWarnings("unchecked")
    @Override
    public int updateForCheckApplys(CheckParam params, String userName) {
        Map<String, Object> paramsMap = params.paramDrawApplyToMap();
        LOGGER.info("传入sql的map:" + paramsMap);
        int result = this.getBaseDao().updateBySql(INTEGRAL_COMM_NAMESPACE_DRAWAPPLY + ".batchUpdate", paramsMap);
        if (result > 0) {
            for (Integer id : ((List<Integer>) paramsMap.get("ids"))) {
                DrawVerifyLog verifyLog = new DrawVerifyLog();
                verifyLog.setCreateAt(new Date());
                verifyLog.setCreateName(userName);
                verifyLog.setDrawApplyId(id);
                verifyLog.setOperateBiz(params.getOperateBiz());
                if (params.getStatus() == -1 || params.getStatus() == -2)
                    verifyLog.setMemo(params.getReason());
                drawVerifyLogService.createDrawVerifyLog(verifyLog);
            }
            LOGGER.info(params.getStatus() > 0 ? params.getStatus() + "审核通过！" : -params.getStatus() + "审核未通过！");
            //2级审核通过之后，发送MQ消息  审核失败也需发送MQ消息
            if (params.getStatus() != 1) {
                sendBatchMQ(params.getIds(), params.getStatus());
            }
            return 1;
        } else {
            return -1;
        }
    }


    @SuppressWarnings("unchecked")
    public Map<String, Object> addDrawApplyByMQ(MessageEvent messageEvent) {
        Map<String, Object> map = new HashMap<String, Object>();
        DrawApply drawApply = new DrawApply();
        try {
            drawApply.setCreateAt(DateUtil.getCurrDateTime());
            drawApply.setStatus(ConstantEnum.DRAWAPPLY_STATUS_0.getCodeInt());
//            drawApply.setDrawNo(orderNoGenService.getOrderNo());
            Map<String, Object> bodyMap = JsonUtil.getMapFromJson(messageEvent.getBody().toString());
            if (bodyMap != null) {
                MQDrawParam mqDrawParam = MQDrawParam.mapToEntity(bodyMap);
                drawApply.setDrawNo(mqDrawParam.getDrawNo());
                drawApply.setPayType(mqDrawParam.getPayType());
                drawApply.setPayAccount(mqDrawParam.getPayAccount());
                drawApply.setPayName(mqDrawParam.getPayName());
                drawApply.setDrawAmount(mqDrawParam.getDrawAmount());
                drawApply.setGuideType(mqDrawParam.getGuideType());

                UserShopMallAccountDto user = rOAUserService.getUserShopMallAccountInfo(Integer.valueOf(mqDrawParam
                        .getUserId()));
                if (user != null) {
                    if (user.getMallId() != null)
                        drawApply.setMallId(user.getMallId().toString());
                    drawApply.setMallName(user.getMallName());
                    if (user.getShopId() != null)
                        drawApply.setShopId(user.getShopId().toString());
                    drawApply.setShopName(user.getShopName());
                    drawApply.setSellerAccount(user.getUserPhone());
                    drawApply.setSellerName(user.getUserName());
                    if (user.getUserId() != null)
                        drawApply.setDrawUserId(user.getUserId().toString());
                    drawApply.setDrawUsername(user.getUserName());
                }
            }
            insert(drawApply);
            map.put("code", ConstantEnum.DRAWAPPLY_SUCCESS.getCode());
            map.put("message", ConstantEnum.DRAWAPPLY_SUCCESS.getValue());
        } catch (Exception e) {
            map.put("code", ConstantEnum.DRAWAPPLY_FAULT.getCode());
            map.put("message", ConstantEnum.DRAWAPPLY_FAULT.getValue() + e.getMessage());
            LOGGER.error("生成提现记录失败，失败原因:");
            e.printStackTrace();
        }

        return map;
    }

    @Override
    public void updateDrawApplyByMQ(MessageEvent messageEvent) {
        if (messageEvent != null) {
            String jsonDataString = JsonUtil.getJSONString(messageEvent.getBody());
            JSONObject responseJsonObject = JSONObject.fromObject(jsonDataString);
            if (responseJsonObject != null) {
                List<DrawApply> drawApplies = new ArrayList<DrawApply>();
                JSONArray drawApplyArray = responseJsonObject.getJSONArray("drawApplyList");
                for (int i = 0, length = drawApplyArray.size(); i < length; i++) {
                    JSONObject jsonObject = drawApplyArray.getJSONObject(i);
                    DrawApply apply = new DrawApply();
                    apply.setDrawNo(jsonObject.getString("drawNo"));
                    apply.setTradeNo(jsonObject.getString("tradeNo"));
                    apply.setTradeAt(new Date(messageEvent.getTimestamp()));
                    apply.setStatus(ConstantEnum.DRAWAPPLY_STATUS_3.getCodeInt());
                    drawApplies.add(apply);
                }
                updateBatchDrawApplysByDrawNo(drawApplies);
            }


        } else {
            LOGGER.info("MessageEvent 为空！");
        }
    }

    protected void sendBatchMQ(String ids, Integer status) {
        List<Integer> idsList = ValidateUtil.StringToIntList(ids);
        if (!idsList.isEmpty()) {
            for (int i = 0, length = idsList.size(); i < length; i++) {
                DrawApply apply = this.getOneById(idsList.get(i));
                Map<String, Object> bodyMap = new HashMap<String, Object>();

                bodyMap.put("userId", apply.getDrawUserId());

                if (status < 0) {
                    // 审核不通过，金额返还给虚拟账号(va)，项目类型依然为提现(VirtualAccountEventType.DRAW)
                    VirtualAccountDetailEntity virtualAccountDetailEntity = new VirtualAccountDetailEntity();
                    virtualAccountDetailEntity.setUserId(apply.getDrawUserId());
                    virtualAccountDetailEntity.setSign(1); // 提现审核失败时，金额返还账号，故符号为正
                    virtualAccountDetailEntity.setAmount(new BigDecimal(apply.getDrawAmount() != null ? apply.getDrawAmount().toString() : null));
                    virtualAccountDetailEntity.setApplicationNo(apply.getDrawNo());
                    virtualAccountDetailEntity.setItemType(VirtualAccountEventType.DRAW);
                    bodyMap.put("detail", virtualAccountDetailEntity);
                    MessageEvent event = MessageEvent.getMessageEvent(bodyMap, Constants.MQRequestParam.REQUEST_QUEUENAME_TMS,
                            Constants.MQRequestParam.REQUEST_QUEUENAME_VA, VirtualAccountEventTypeEnum.ACCOUNT_POST.getCode());
                    sender.convertAndSend(event);
                    continue;
                }

                bodyMap.put("drawAmount", apply.getDrawAmount());
                bodyMap.put("drawNo", apply.getDrawNo());
                bodyMap.put("payType", apply.getPayType());
                bodyMap.put("payAccount", apply.getPayAccount());
                bodyMap.put("payName", apply.getPayName());
                // 审核通过之后发送消息到rpb
                if (status == 2) {
                    MessageEvent event = MessageEvent.getMessageEvent(bodyMap, Constants.MQRequestParam.REQUEST_QUEUENAME_TMS, Constants.MQRequestParam.REQUEST_QUEUENAME_RPB,
                            PaymentEventType.DRAW_PAY);
                    sender.convertAndSend(event);
                }
            }
        }
    }

    @Override
    public int updateBatchDrawApplysByDrawNo(List<DrawApply> applies) {
        return this.getBaseDao().updateBySql(INTEGRAL_COMM_NAMESPACE_DRAWAPPLY + ".batchUpdateDrawApplisByDrawNo", applies);
    }

    /* (non-Javadoc)
    * @param userId
    * @return
    * @see com.rongyi.tms.service.DrawApplyService#selectDrawApplyInfo(java.lang.String)
    */
    @Override
    public DrawApplyInfoVO selectDrawApplyInfo(String userId) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("userId", userId);
        return this.getBaseDao().selectOneBySql(INTEGRAL_COMM_NAMESPACE_DRAWAPPLY + ".selectDrawInfoByUserId", map);
    }

    /* (non-Javadoc)
    * @param searchValueMap
    * @return
    * @see com.rongyi.tms.service.DrawApplyService#selectDrawApplyList(java.util.Map)
    */
    @Override
    public DrawApplyListVO selectDrawApplyList(Map<String, Object> params) {
        int pageStart = (int) params.get("currentPage") * (int) params.get("pageSize");
        params.put("pageStart", pageStart);

        int totalSize = this.getBaseDao().selectOneBySql(INTEGRAL_COMM_NAMESPACE_DRAWAPPLY + ".selectDrawApplyByPageCount", params);
        int totalPage = totalSize % (int) params.get("pageSize") == 0 ? totalSize / (int) params.get("pageSize") : (totalSize / (int) params.get("pageSize") + 1);

        List<DrawApply> list = this.getBaseDao().selectListBySql(
                INTEGRAL_COMM_NAMESPACE_DRAWAPPLY + ".selectDrawApplyByPage", params);
        List<DrawApplyDetailVO> detailList = new ArrayList<DrawApplyDetailVO>();
        for (DrawApply drawApply : list) {
            DrawApplyDetailVO vo = new DrawApplyDetailVO();
            vo.setId(drawApply.getId());
            vo.setCreateAt(drawApply.getCreateAt());
            vo.setDrawAmount(new BigDecimal(drawApply.getDrawAmount()));
            vo.setDrawApplyAccount(drawApply.getPayAccount());
            if (drawApply.getPayType() == 0) {
                //TODO 因为暂时只有支付宝一种提款方式，以后增加了银行卡或者其他的途径后这里要改 by erliang mallshop v1.8.0
                vo.setPayAccountType("支付宝");
            } else {
                vo.setPayAccountType("其他");
            }
            vo.setStatus(drawApply.getStatus());
            detailList.add(vo);
        }
        DrawApplyListVO listVO = new DrawApplyListVO();
        listVO.setDrawApplyDetailList(detailList);
        listVO.setCurrentPage((int) params.get("currentPage"));
        listVO.setPageSize((int) params.get("pageSize"));
        listVO.setTotalPage(totalPage);
        return listVO;

    }
}

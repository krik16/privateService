/**
 * @Copyright (C), 上海容易网电子商务有限公司
 * @Author: 柯军
 * @datetime:2015年8月12日上午10:27:10
 * @Description: TODO
 **/

package com.rongyi.cheat.service.impl;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rongyi.cheat.constants.Constant;
import com.rongyi.cheat.constants.ConstantEnum;
import com.rongyi.cheat.service.AccountBlacklistService;
import com.rongyi.cheat.unit.SendEmailUnit;
import com.rongyi.cheat.unit.SendMsUnit;
import com.rongyi.core.common.util.DateUtil;
import com.rongyi.core.framework.mybatis.service.impl.BaseServiceImpl;
import com.rongyi.easy.cheat.AccountBlacklist;
import com.rongyi.easy.rpb.vo.PayAccountUseTotal;
import com.rongyi.rss.rpb.IRpbService;

/**
 * @Author: 柯军
 * @Description: 黑名单列表接口实现
 * @datetime:2015年8月12日上午10:27:10
 *
 **/
@Service
public class AccountBlacklistServiceImpl extends BaseServiceImpl implements AccountBlacklistService {

    @Autowired
    IRpbService rpbService;

    @Autowired
    SendEmailUnit sendEmailUnit;

    @Autowired
    SendMsUnit sendMsUnit;

    private static final String NAMESPACE = "com.rongyi.cheat.mapper.xml.AccountBlacklistMapper";

    private static final Logger LOGGER = Logger.getLogger(AccountBlacklistServiceImpl.class);

    @Override
    public void insert(AccountBlacklist accountBlacklist) {
        this.getBaseDao().insertBySql(NAMESPACE + ".insert", accountBlacklist);
    }

    @Override
    public void update(AccountBlacklist accountBlacklist) {
        this.getBaseDao().updateBySql(NAMESPACE + ".updateByPrimaryKeySelective", accountBlacklist);

    }

    @Override
    public AccountBlacklist selectById(Integer id) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("id", id);
        return this.getBaseDao().selectOneBySql(NAMESPACE + ".selectByPrimaryKey", map);
    }

    @Override
    public AccountBlacklist selectByPayAccount(String payAccount, Byte payType, Byte status) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("payAccount", payAccount);
        map.put("payType", payType);
        map.put("status", status);
        return this.getBaseDao().selectOneBySql(NAMESPACE + ".selectByPayAccount", map);
    }

    @Override
    public void valadatePayAccount(Map<String, Object> map) {
        Date endTime = DateUtil.getCurrDateTime();
        Date startTime = getStartTime(endTime);
        map.put("startTime", startTime);
        map.put("endTime", endTime);
        List<PayAccountUseTotal> list = getPayAccountUserTotalList(map);
        LOGGER.info("符合黑名单条数，list.size="+list.size());
        List<AccountBlacklist> mailWranList = new ArrayList<AccountBlacklist>();
        for (PayAccountUseTotal payAccountUseTotal : list) {
            AccountBlacklist accountBlacklist = selectByPayAccount(payAccountUseTotal.getPayAccount(), Integer.valueOf(payAccountUseTotal.getPayType()).byteValue(), null);
            if (accountBlacklist == null) {//黑名单列表无记录
                accountBlacklist = getAccountBlacklist(payAccountUseTotal);
                insert(accountBlacklist);
                mailWranList.add(accountBlacklist);
            } else {//黑名单列表有记录
                map.put("payAccount", accountBlacklist.getPayAccount());
                List<PayAccountUseTotal> newList = rpbService.selectPayAccountUseTotal(map);
                if (newList != null && !newList.isEmpty() && newList.get(0).getCount() > accountBlacklist.getCount()) {
                    accountBlacklist.setCount(payAccountUseTotal.getCount());
                    accountBlacklist.setUpdateAt(DateUtil.getCurrDateTime());
                    update(accountBlacklist);
                    if (ConstantEnum.BLACK_ROLL_STATUS_0.getCodeByte().equals(accountBlacklist.getStatus()))
                        mailWranList.add(accountBlacklist);
                }
            }
            //购买超出自动冻结条数，自动冻结
            if (accountBlacklist.getCount() >= Integer.valueOf(Constant.BLACKLIST_CONFIG.FREEZE_COUNT)) {
                accountBlacklist.setUpdateAt(DateUtil.getCurrDateTime());
                accountBlacklist.setStatus(ConstantEnum.BLACK_ROLL_STATUS_1.getCodeByte());
                update(accountBlacklist);
            }
        }
        if (!mailWranList.isEmpty()) {
            sendEmailUnit.sendWranEmail(mailWranList, startTime, endTime);// 发送邮件
            sendMsUnit.sendBlackListMs(mailWranList, startTime, endTime);// 发送短信
        }
    }

    @Override
    public List<PayAccountUseTotal> getPayAccountUserTotalList(Map<String,Object> map){
        map.put("count", Constant.BLACKLIST_CONFIG.WARN_COUNT);
        map.put("notPayAccountList", getNoPayAccountList());
        map.put("orderType", Constant.BLACKLIST_CONFIG.ORDER_TYPE);
        LOGGER.info("扫描是否有账号符合黑名单条件，购买次数大于" + Constant.BLACKLIST_CONFIG.WARN_COUNT + ",map=" + map);
        return rpbService.selectPayAccountUseTotal(map);
    }

    /**
     * @Description: 不扫描的支付账号列表
     * @return
     * @Author: 柯军
     * @datetime:2015年10月26日上午11:27:33
     **/
    private List<String> getNoPayAccountList() {
        List<String> notPayAccountList = new ArrayList<String>();
        notPayAccountList.add("kehuzijinbu001@alipay.com");
        return notPayAccountList;
    }


    private Date getStartTime(Date endTime) {
        try {
            int blackHour = Integer.valueOf(Constant.BLACKLIST_CONFIG.BLACK_SECOND);
            Date startTime = DateUtil.addTime(endTime, -blackHour, Calendar.SECOND);
            return DateUtil.dateToTimestamp(startTime);
        } catch (Exception e) {
            LOGGER.error("获取开始时间失败," + e.getMessage());
        }
        return null;
    }

    @Override
    public Map<String, Object> selectPageList(Integer currentPage, Integer pageSize, Map<String, Object> map) {
        Map<String, Object> resultMap = new HashMap<String, Object>();
        map.put("currentPage", (currentPage - 1) * pageSize);
        map.put("pageSize", pageSize);
        List<AccountBlacklist> list = this.getBaseDao().selectListBySql(NAMESPACE + ".selectPageList", map);
        Integer count = this.getBaseDao().selectOneBySql(NAMESPACE + ".selectPageListCount", map);
        resultMap.put("list", list);
        resultMap.put("count", count);
        return resultMap;
    }

    @Override
    public Map<String, Object> updateFrozenAccount(String[] ids, Byte status) {
        Map<String, Object> map = new HashMap<String, Object>();
        try {
            for (String id : ids) {
                AccountBlacklist accountBlacklist = selectById(Integer.valueOf(id));
                accountBlacklist.setStatus(status);
                update(accountBlacklist);
            }
            map.put("success", true);
            if (ConstantEnum.BLACK_ROLL_STATUS_0.getCodeByte().equals(status))
                map.put("message", "解冻账号成功");
            else
                map.put("message", "冻结账号成功");
        } catch (Exception e) {
            map.put("success", false);
            map.put("message", "冻结账号失败");
            e.printStackTrace();
        }
        return map;
    }





    private AccountBlacklist getAccountBlacklist(PayAccountUseTotal payAccountUseTotal) {
        AccountBlacklist accountBlacklist = new AccountBlacklist();
        accountBlacklist.setCreateAt(DateUtil.getCurrDateTime());
        accountBlacklist.setStatus(ConstantEnum.BLACK_ROLL_STATUS_0.getCodeInt().byteValue());
        accountBlacklist.setPayAccount(payAccountUseTotal.getPayAccount());
        accountBlacklist.setPayType(Integer.valueOf(payAccountUseTotal.getPayType()).byteValue());
        accountBlacklist.setCount(payAccountUseTotal.getCount());
        return accountBlacklist;

    }
}

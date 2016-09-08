/**
 * @Title: VirtualAccountService.java
 * @Package com.rongyi.va.service
 * @Description: 虚拟账户数据库服务接口
 * @author 郑亦梁  zhengyiliang@rongyi.com
 * @date 2015年5月11日 下午9:05:27
 * @version V1.0
 * Copyright (C),上海容易网电子商务有限公司
 */
package com.rongyi.va.service;

import com.rongyi.core.framework.mybatis.service.impl.BaseServiceImpl;
import com.rongyi.easy.va.entity.VirtualAccountDetailEntity;
import com.rongyi.easy.va.entity.VirtualAccountEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author ZhengYl
 */
@Service
public class VirtualAccountService extends BaseServiceImpl {

    private static final String MAPPER_NAMESPACE = "com.rongyi.easy.va.entity.VirtualAccountMapper";

    private static final Logger LOGGER = LoggerFactory.getLogger(VirtualAccountService.class);

    @Autowired
    private VirtualAccountDetailService virtualAccountDetailService;

    /**
     * 创建新的虚拟账户
     *
     * @param virtualAccountEntity
     * @return
     */
    public int insertAndGetId(VirtualAccountEntity virtualAccountEntity) {
        int id = 0;
        this.getBaseDao().insertBySql(MAPPER_NAMESPACE + ".insertAndGetId", virtualAccountEntity);
        LOGGER.info("insertAndGetId:virtualAccountEntity={}", virtualAccountEntity);
        if (virtualAccountEntity.getId() != null) {
            id = virtualAccountEntity.getId();
        }
        return id;
    }

    /**
     * 更新虚拟账户
     *
     * @param virtualAccountEntity
     * @return
     */
    public int update(VirtualAccountEntity virtualAccountEntity) {
        return this.getBaseDao().updateBySql(MAPPER_NAMESPACE + ".updateAccountInfo", virtualAccountEntity);
    }

    /**
     * 账户余额变更
     *
     * @param userId
     * @param amount
     * @param detailEntity
     * @return 插入明细行Id
     * @author ZhengYl
     * @date 2015年7月17日 下午6:26:14
     */
    public int updateBalance(String userId, BigDecimal amount, VirtualAccountDetailEntity detailEntity) {
        LOGGER.info("userId={},amount={}", userId, amount);
        int rowCount;
        int detailId = 0;
        VirtualAccountEntity virtualAccountEntity = this.selectByUserId(userId);
        VirtualAccountEntity lockVirtualAccountEntity = this.selectByIdWithLock(virtualAccountEntity.getId());
        //设置修改前余额
        detailEntity.setBalanceBefore(lockVirtualAccountEntity.getBalance());
        BigDecimal balance = lockVirtualAccountEntity.getBalance().add(amount);
        lockVirtualAccountEntity.setBalance(balance);
//        Map<String, Object> params = new HashMap<>();
//        params.put("userId", userId);
//        params.put("amount", amount);
//        rowCount = this.getBaseDao().updateBySql(MAPPER_NAMESPACE + ".updateBalance", params);
        rowCount = this.getBaseDao().updateBySql(MAPPER_NAMESPACE + ".updateBalanceWithLock", lockVirtualAccountEntity);
        if (rowCount > 0) {
            detailId = virtualAccountDetailService.insertAndGetId(detailEntity);
        }
        return detailId;
    }

    public VirtualAccountEntity selectByIdWithLock(Integer id) {
        Map<String, Object> parms = new HashMap<>();
        parms.put("id", id);
        return this.getBaseDao().selectOneBySql(MAPPER_NAMESPACE + ".selectByIdWithLock", parms);
    }

    /**
     * 验证用户是否可以提现(废弃)
     *
     * @param userId
     * @return
     */
    @Deprecated
    public int checkWithdrawPermission(String userId, BigDecimal amount, int drawTimeLimit) {
        Map<String, Object> parms = new HashMap<String, Object>();
        parms.put("p_user_id", userId);
        parms.put("p_draw_amount", amount);
        parms.put("p_draw_limit", drawTimeLimit);
        this.getBaseDao().updateBySql(MAPPER_NAMESPACE + ".checkWithdrawPermission", parms);
        int result = (int) parms.get("result");
        return result;
    }

    /**
     * @param userId
     * @param amount
     * @param drawTimeLimit
     * @return
     * @Description: 验证用户是否可以提现
     * @Author: 柯军
     * @datetime:2015年11月5日下午7:24:55
     **/
    public int validateWithdrawPermission(String userId, BigDecimal amount, int drawTimeLimit) {
        Map<String, Object> parms = new HashMap<String, Object>();
        parms.put("userId", userId);
        parms.put("amount", amount);
        parms.put("drawTimeLimit", drawTimeLimit);
        return this.getBaseDao().selectOneBySql(MAPPER_NAMESPACE + ".validateWithdrawPermission", parms);
    }

    /**
     * 查询
     *
     * @param userId
     * @return
     * @author ZhengYl
     * @date 2015年5月29日 下午5:39:56
     */
    public VirtualAccountEntity selectByUserId(String userId) {
        Map<String, Object> parms = new HashMap<String, Object>();
        parms.put("userId", userId);
        return this.getBaseDao().selectOneBySql(MAPPER_NAMESPACE + ".selectByUserId", parms);
    }

    /**
     * 冻结/解冻
     *
     * @param userId
     * @param amount
     * @return
     * @author ZhengYl
     * @date 2015年5月29日 下午5:42:24
     */
    public int updateSuspended(String userId, Boolean isSuspended, String stopReason) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("userId", userId);
        params.put("isSuspended", isSuspended);
        params.put("stopReason", stopReason);
        params.put("stopAt", new Date());
        return this.getBaseDao().updateBySql(MAPPER_NAMESPACE + ".updateSuspended", params);
    }

    /**
     * @param drawNo
     * @return
     * @Description:删除提现
     * @Author: 柯军
     * @datetime:2015年9月25日下午4:47:51
     **/
    public int deleteByDrawNo(String drawNo) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("drawNo", drawNo);
        return this.getBaseDao().updateBySql(MAPPER_NAMESPACE + ".deleteByDrawNo", params);
    }

    /**
     * 保存提现密码
     *
     * @param userId
     * @param password
     * @return
     */
    public int saveDrawPassword(String userId, String password) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("userId", userId);
        params.put("drawPassword", password);
        return this.getBaseDao().updateBySql(MAPPER_NAMESPACE + ".saveDrawPassword", params);
    }

}

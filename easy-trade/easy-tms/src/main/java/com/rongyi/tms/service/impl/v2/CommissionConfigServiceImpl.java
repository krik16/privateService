package com.rongyi.tms.service.impl.v2;

import com.rongyi.core.framework.mybatis.service.impl.BaseServiceImpl;
import com.rongyi.easy.settle.entity.OperationLog;
import com.rongyi.easy.tms.entity.v2.CommissionConfig;
import com.rongyi.tms.constants.ConstantEnum;
import com.rongyi.tms.service.v2.CommissionConfigLogService;
import com.rongyi.tms.service.v2.CommissionConfigService;
import org.apache.commons.collections.CollectionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.*;

/**
 * @Copyright (C), 上海容易网电子商务有限公司
 * kejun
 * 2016/2/25 17:54
 **/
@Repository
public class CommissionConfigServiceImpl extends BaseServiceImpl implements CommissionConfigService{

    private static final Logger LOGGER = LoggerFactory.getLogger(CommissionConfigServiceImpl.class);

    private static final String NAMESPACE = "com.rongyi.tms.mapper.xml.v2.CommissionConfigMapper";

    @Autowired
    private CommissionConfigLogService configLogService;

    @Override
    public void insert(CommissionConfig commissionConfig) {

        this.getBaseDao().insertBySql(NAMESPACE + ".insertSelective", commissionConfig);
    }

    @Override
    public void update(CommissionConfig commissionConfig, OperationLog log) {
        configLogService.insert(log);
        this.getBaseDao().updateBySql(NAMESPACE + ".updateByPrimaryKeySelective", commissionConfig);
    }

    @Override
    public CommissionConfig selectById(Integer id) {
        Map<String,Object> map = new HashMap<>();
        map.put("id", id);
        return this.getBaseDao().selectOneBySql(NAMESPACE+".selectByPrimaryKey",map);
    }

    @Override
    public List<CommissionConfig> selectPageList(Map<String, Object> map, Integer currentPage, Integer pageSize) {
        map.put("currentPage", (currentPage - 1) * pageSize);
        map.put("pageSize", pageSize);
        List<CommissionConfig> commissionConfigs = this.getBaseDao().selectListBySql(NAMESPACE + ".selectPageList", map);
        List<CommissionConfig> reList = new ArrayList<>();
        if (CollectionUtils.isNotEmpty(commissionConfigs)){
            Map<String, Object> searchMap = new HashMap<>();
            searchMap.put("opType", ConstantEnum.OP_MODEL_2);
            for (CommissionConfig config : commissionConfigs){
                if (ConstantEnum.COMMISSION_CONFIG_STATUS_2.getCodeByte().equals(config.getStatus()) || ConstantEnum.COMMISSION_CONFIG_STATUS_4.getCodeByte().equals(config.getStatus())){
                    searchMap.put("opId", config.getId());
                    OperationLog log = configLogService.getLogByMap(searchMap);
                    if(log != null) {
                        config.setDesc(log.getDesc());
                    }
                }
                reList.add(config);
            }
        }
        return reList;
    }

    public Integer selectPageCount(Map<String, Object> map){
        Integer count = this.getBaseDao().selectOneBySql(NAMESPACE + ".selectPageCount", map);
        return count == null ? 0 : count;
    }

    @Override
    public CommissionConfig selectByTypes(Integer type, Integer inviteType, Integer registerType, Date effectTime) {
        LOGGER.info("selectByTypes:type={},inviteType={},registerType={},effectTime={}",type,inviteType,registerType,effectTime);
        Map<String,Object> map = new HashMap<>();
        map.put("type",type);
        map.put("inviteType",inviteType);
        if(ConstantEnum.REGISTER_TYPE_2.getCodeInt().equals(registerType) ||ConstantEnum.REGISTER_TYPE_3.getCodeInt().equals(registerType)){
            List<Byte> list = new ArrayList<>();
            list.add(registerType.byteValue());
            list.add(ConstantEnum.REGISTER_TYPE_4.getCodeByte());
            map.put("registerTypeList",list);
        }else{
            map.put("registerType", registerType);
        }
        map.put("effectTime",effectTime);
        return this.getBaseDao().selectOneBySql(NAMESPACE+".selectByTypes",map);
    }

    @Override
    public boolean validateIsExist(byte type,byte inviteType,byte registerType, Date effectStartTime,Date effectEndTime){
        Map<String,Object> map = new HashMap<>();
        map.put("type",type);
        map.put("inviteType",inviteType);
        map.put("effectStartTime",effectStartTime);
        if(ConstantEnum.REGISTER_TYPE_2.getCodeByte().equals(registerType) ||ConstantEnum.REGISTER_TYPE_3.getCodeByte().equals(registerType)){
            List<Byte> list = new ArrayList<>();
            list.add(registerType);
            list.add(ConstantEnum.REGISTER_TYPE_4.getCodeByte());
            map.put("registerTypeList",list);
        }else{
            map.put("registerType", registerType);
        }
        map.put("effectEndTime",effectEndTime);
        CommissionConfig commissionConfig = this.getBaseDao().selectOneBySql(NAMESPACE + ".validateIsExist", map);
        return commissionConfig != null;
    }
}

package com.rongyi.osm.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rongyi.core.framework.mybatis.service.impl.BaseServiceImpl;
import com.rongyi.easy.osm.entity.ApplicationFormEntity;
import com.rongyi.osm.listener.OSMStandbyStatus;

/**
 * 退款维权申请详情表service
 * @author baodk
 */
@Service
public class ApplicationFormServiceImpl extends BaseServiceImpl{

	@Autowired
	protected OSMStandbyStatus osmStandbyStatus;
	
    private static final String MAPPER_NAMESPACE = "com.rongyi.easy.osm.entity.ApplicationFormMapper";
    
    public int insertAndGetId(ApplicationFormEntity applicationFormEntity) {
    	this.getBaseDao().insertBySql(MAPPER_NAMESPACE + ".insertAndGetId", applicationFormEntity);
    	return applicationFormEntity.getId();
    }
    
    public List<ApplicationFormEntity> selectAll(){
        Map<String, Object> params = new HashMap<String, Object>();
        return this.getBaseDao().selectListBySql(MAPPER_NAMESPACE + ".selectByCondition", params);
    }
    
    public ApplicationFormEntity selectById(int id) {
    	Map<String, Object> params = new HashMap<String, Object>();
    	params.put("id", id);
    	return this.getBaseDao().selectOneBySql(MAPPER_NAMESPACE + ".selectById", params);
    }

    /**
     * @param applicationFormEntity
     * @return
     * 由于application表中的picUrls与osm事实对象中的不同步，故更新表时忽略picUrls字段
     * edit by ZhengYiliang 2015/4/15
     */
    public int updateAll(ApplicationFormEntity applicationFormEntity) {
    	return this.getBaseDao().updateBySql(MAPPER_NAMESPACE + ".updateAll", applicationFormEntity);
    }
}

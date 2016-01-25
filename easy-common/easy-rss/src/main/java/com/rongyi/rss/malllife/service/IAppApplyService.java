
/**   
 * @Title: IAppApplyService.java 
 * @Package: com.rongyi.rss.msob 
 * @Description: TODO
 * @author user  
 * @date 2015年6月2日 下午3:05:12 
 */


package com.rongyi.rss.malllife.service;

import java.util.List;
import java.util.Map;

import com.rongyi.easy.malllife.domain.AppApply;
import com.rongyi.easy.malllife.vo.PagingVO;


/** 
 @Description rongyi.app.content com.rongyi.app.biz.mapper.AppApplyMapper 中接口迁移
 * @author yuanbo
 * @date 2015年6月2日 下午3:05:12 
 */

public interface IAppApplyService {
    /**
     * 返回对象
     * @param id
     * @return
     */
    public AppApply getById(Long id);
    /**
     * insert appapply
     * @param a
     */
    public int insert(AppApply a) ;
    
    /**
     * 分页显示 报名小伙伴
     * 20140806 lim
     * @param map
     * @return
     */
    public List<AppApply> pagingByEntityTypeAndEntityId(String entityId, int startRecordIndex, int pageSize, Short entityType) throws Exception;
    /**
     * 统计报名数量
     * 20140806 lim
     * @param map
     * @return
     */
    public Integer countByEntityTypeAndEntityId(String entityId, Short entityType)  throws Exception;
    /**
     * 更新
     * @param record
     * @return
     * @throws Exception
     */
    public int updateByPrimaryKeySelective(AppApply record)  throws Exception ;
    /**
     * 返回报名
     * 20140807 lim
     * @param map
     * @return
     */
    public AppApply getByEntityTypeEndityIdAndUserId(String userId, Short entityType, String entityId)  throws Exception;
    /**
     * 统计报名人数
     * 20140807 lim
     * @param map
     * @return
     */
    public Integer sumApplyNumByEntityTypeAndEntityId(String entityId, Short entityType)  throws Exception;
    
    /**
     * 获得同城报名人
     *  xuyang
     * @param entityId
     * @return 
     */
    /**
     * 返回对象
     * @param id
     * @return
     */
    public List<AppApply> getAppApplyHeadImg(String entityId);
    /**
     * 判断用户是否报名了某个,如果大于0则已经报名
     * @param map
     * @return
     */
    public int countByEntityTypeEndityIdAndUserId(String userId, Short entityType, String entityId) ;
    
    /**
     * user apply samecity
     * 有可能存在同步的问题，所以加了synchronized
     * @param sameCityId
     * @param userId
     * @param tel
     * @param applyNum
     * @throws Exception
     */
    public  void apply(int sameCityId, String userId, String tel, int applyNum) throws Exception;
    /**
     * user cancel samecity 用户取消报名
     * @param sameCityId
     * @param userId
     * @param tel
     * @param applyNum
     * @throws Exception
     */
    public void cancel(int sameCityId, String userId) throws Exception ;
    /**
     * user modifyApply samecity
     * 修改报名
     * @param sameCityId
     * @param userId
     * @param tel
     * @param applyNum
     * @throws Exception
     */
    public void modifyApply(int sameCityId, String userId, String tel, int applyNum) throws Exception;
    /**
     * 分页显示报名小伙伴
     * 20140806 lim
     * @param entityId
     * @param pageSize
     * @param currentPage
     * @param params
     * @return
     * @throws Exception
     */
    public PagingVO<AppApply> pagingByEntityTypeAndEntityId(String entityId, int pageSize, Integer currentPage, short entityType) throws Exception;
}

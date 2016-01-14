
/**
 * @Title: ROAAppApplyService.java
 * @Package: com.rongyi.rss.malllife.roa
 * @Description: TODO
 * @author user
 * @date 2015年6月4日 上午10:14:02 
 */


package com.rongyi.rss.malllife.roa;

import java.util.List;

import com.rongyi.easy.malllife.domain.AppApply;
import com.rongyi.easy.malllife.vo.PagingVO;

/**
 * @Description
 * @author user
 * @date 2015年6月4日 上午10:14:02 
 */

public interface ROAAppApplyService {
    /**
     * 返回对象
     * @param id
     * @return
     */
    public AppApply getById(Long id);
   
    /**
     * 返回对象
     * @param id
     * @return
     */
    public List<AppApply> getAppApplyHeadImg(String entityId);
   

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
    public PagingVO<AppApply> pagingByEntityTypeAndEntityIdd(String entityId, int pageSize, Integer currentPage, short entityType) throws Exception;
}

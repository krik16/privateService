package com.rongyi.rss.solr;

<<<<<<< HEAD
=======
import com.rongyi.easy.roa.vo.CouponVO;

>>>>>>> develop-yuzhijian
import java.util.List;

import com.rongyi.easy.roa.vo.CouponVO;

public interface ROAActivitySolrService {

<<<<<<< HEAD
//	public boolean updateActivity(SolrInputDocument doc);
	public boolean updateActivity(CouponVO couponVO,String id,List<String> picList,List<String> categoryIds,int limitCount);
=======
    //	public boolean updateActivity(SolrInputDocument doc);
    public boolean updateActivity(CouponVO couponVO, String id, List<String> picList, List<String> categoryIds, int limitCount);
>>>>>>> develop-yuzhijian

    public void updateActivityStatus(String couponId, int status);

	/**
	 * 直播距离排序
	 * 
	 * @author ZhengYl
	 * @date 2015年10月26日 下午10:18:07 
	 * @param idList
	 * @param position
	 * @param rows
	 */
	public List<String> sortLiveByLocation(List<String> idList, List<Double> position, Integer rows);
}

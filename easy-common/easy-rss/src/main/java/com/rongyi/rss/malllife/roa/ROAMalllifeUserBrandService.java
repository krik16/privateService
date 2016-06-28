/**
 * 
 */
package com.rongyi.rss.malllife.roa;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.rongyi.easy.malllife.entity.UserBrand;
import com.rongyi.easy.rmmm.entity.MalllifeUserOperateEntity;
 
/**
 * 爱品牌
 * @author dell
 *
 */
public interface ROAMalllifeUserBrandService {
	/**
	 * 批量增加
	 * @param list
	 * @param userId
	 */
	public void batchUserBrand( List<Map> list,String userId )  throws Exception ;
	/**
	 * 删除
	 * @param userId
	 */
	public void delUserBrand(String userId)  throws Exception ;
	
	public List<String> getUserBrand(String userId)  throws Exception ;
	public List<UserBrand> getUserBrandDetailList(String userId)  throws Exception ;
	public void updateByBrandId(String brandId)  throws Exception ;
	public List<String> getUserBrandAndLove(String userId)  throws Exception ;
}

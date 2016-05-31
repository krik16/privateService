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
	public void batchUserBrand( List<Map> list,String userId );
	/**
	 * 删除
	 * @param userId
	 */
	public void delUserBrand(String userId);
	
	public List<String> getUserBrand(String userId);
	public List<UserBrand> getUserBrandDetailList(String userId);
	public void updateByBrandId(String brandId);
	public List<String> getUserBrandAndLove(String userId);
}

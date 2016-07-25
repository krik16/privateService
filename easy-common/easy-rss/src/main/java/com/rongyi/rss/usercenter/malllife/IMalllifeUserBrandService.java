/**
 * 
 */
package com.rongyi.rss.usercenter.malllife;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.rongyi.easy.malllife.entity.UserBrand;
import com.rongyi.easy.rmmm.entity.MalllifeUserOperateEntity;
 
public interface IMalllifeUserBrandService {

	public void batchUserBrand( List<Map> list,String userId )  throws Exception ;
	public void delUserBrand(String userId)  throws Exception ;
	public List<String> getUserBrand(String userId)  throws Exception ;
	public List<UserBrand> getUserBrandDetailList(String userId)  throws Exception ;
	public void updateByBrandId(String brandId)  throws Exception ;
	public List<String> getUserBrandAndLove(String userId)  throws Exception ;
	
	/**
	 * 开通订阅之后，自动帮提交过对应品牌信息的用户完成订阅
	 * @param brandIds 开通订阅品牌的id集合
	 * @author chenjun
	 */
	public void toHelpUserSubscribe(List<String> brandIds)  throws Exception;
}

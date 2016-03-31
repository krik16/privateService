package com.rongyi.rss.activity.flopgo;

import java.util.List;
import java.util.Map;

import com.rongyi.easy.flopgo.entity.FlopgoRecordEntity;

public interface CMFlopgoRecordService {
	/**
	 * 得到这个翻牌购记录集合
	 * @param map
	 * @param currentpage
	 * @param pagesize
	 * @return
	 */
	public Map getFlopGoList(Map map, int currentpage, int pagesize);
	/**
	 * 通过用户名字和用户的渠道和当天的时间判断用户的次数
	 * @param map
	 * @return
	 */
	public int getNumberbyNameAndCustScr(Map map);
	
	/**
	 * 通过用户名字和用户的渠道得到用户的所有翻牌记录
	 * @param map
	 * @return
	 */
	public List<FlopgoRecordEntity> getUserFlopRecordByNameAndCustScr(Map map);
	
	/**
	 * 添加优惠卷记录
	 * @param flopgoRecordEntity
	 * @return
	 */
	public String insertFlopRecord(FlopgoRecordEntity flopgoRecordEntity);
	
	/**
	 * 修改领取的状态
	 * @param flopgoRecordEntity
	 * @param State
	 */
	public int updateReceiveTrue(FlopgoRecordEntity flopgoRecordEntity,String State) throws Exception;
	
	/**
	 * 通过用户id，渠道，奖品id，卷码得到详细的用户信息
	 * @param flopgoRecordEntity
	 * @return
	 */
	public List<FlopgoRecordEntity> selectFlopRecordByFop(FlopgoRecordEntity flopgoRecordEntity);
	
	/**
	 * 查询出需要返回库存的数据   通过prize_type!=00,is_receive=1,时间《=现在的时间。并且type=0这些条件来查询
	 * @return
	 */
	public List<FlopgoRecordEntity> selectReturnStockByN();
	
	/**
	 * 提供给定时用的修改  
	 * @param flopgoRecordEntity
	 * @param State
	 * @return
	 */
	public int updateReceiveS(FlopgoRecordEntity flopgoRecordEntity);
	
	
	/**
	 * 
	 */
	public FlopgoRecordEntity selectRecordEById(String id);
}

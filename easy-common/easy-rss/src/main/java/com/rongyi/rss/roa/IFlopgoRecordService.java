package com.rongyi.rss.roa;

import java.util.List;
import java.util.Map;

import com.rongyi.easy.flopgo.entity.FlopgoRecordEntity;

public interface IFlopgoRecordService {
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
	public int insertFlopRecord(FlopgoRecordEntity flopgoRecordEntity);
}

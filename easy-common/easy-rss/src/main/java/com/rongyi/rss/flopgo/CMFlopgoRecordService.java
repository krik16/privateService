package com.rongyi.rss.flopgo;

import java.util.List;
import java.util.Map;

import com.rongyi.easy.flopgo.entity.FlopgoRecordEntity;
import com.rongyi.easy.flopgo.vo.FlopRecordVo;

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
	public int insertFlopRecord(FlopgoRecordEntity flopgoRecordEntity);
	
	/**
	 * 修改领取的状态
	 * @param flopgoRecordEntity
	 * @param State
	 */
	public void updateReceiveTrue(FlopgoRecordEntity flopgoRecordEntity,String State) throws Exception;
}

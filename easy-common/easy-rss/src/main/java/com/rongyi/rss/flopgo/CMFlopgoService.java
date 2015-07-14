package com.rongyi.rss.flopgo;

import java.util.Map;

import com.rongyi.easy.flopgo.entity.FlopgoActivity;

public interface CMFlopgoService {
	/**
	 * 得到这个翻牌购集合
	 * @param map
	 * @param currentpage
	 * @param pagesize
	 * @return
	 */
	public Map getFlopGoList(Map map, int currentpage, int pagesize);
	/**
	 * 得到对应的单个翻牌购详细信息
	 * @param paramMap
	 * @return
	 */
	public Map getFlopGoInfo(Map paramMap);
	/**
	 * 逻辑删除翻牌购
	 * @param flopgoId
	 * @return
	 */
	public int deleteFlopGO(String flopgoId,String userId);
	/**
	 * 插入一条翻牌购
	 * @param flopgoEntity
	 * @return
	 */
	public int insertFlopGo(FlopgoActivity flopgoEntity);
	/**
	 * 修改翻牌购
	 * @param flopgo
	 * @return
	 */
	public int editFlopGo(FlopgoActivity flopgo);
	/**
	 * 按照库存得到一条随机的奖品
	 */
	public Map randomGetPrizeByStock(Map paramMap);
	/**
	 * 得到翻牌购信息  专用于消耗次数得到奖品
	 * 
	 */
	public FlopgoActivity getFlopInFoByTime(String id);
	/**
	 * 修改翻牌购状态
	 * @param flopgoId
	 * @param userid
	 * @param status
	 * @return
	 */
	public int updateFlopGoStatus(String flopgoId,String userid,String status);
}

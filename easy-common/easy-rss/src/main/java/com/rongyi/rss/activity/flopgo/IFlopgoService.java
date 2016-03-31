package com.rongyi.rss.activity.flopgo;

import com.rongyi.easy.flopgo.entity.FlopPrizeDEntity;
import com.rongyi.easy.flopgo.entity.FlopgoActivity;
import com.rongyi.easy.flopgo.vo.FlopSPrizeDailyVO;

import java.util.List;
import java.util.Map;

public interface IFlopgoService {
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
	public int deleteFlopGo(String flopgoId,String userid)throws Exception;
	/**
	 * 插入一条翻牌购
	 * @param flopgoEntity
	 * @return
	 */
	public int insertFlopGo(FlopgoActivity flopgoEntity)throws Exception;

	/**
	 * 修改翻牌购信息
	 * @param flopgo
	 * @return
	 */
	public int editFlopGo(FlopgoActivity flopgo)throws Exception;
	/**
	 * 通过库存随机得到奖品
	 */
	public Map randomGetPrizeByStock(Map paramMap);
	/**
	 * 为了消耗次数得到这个奖品专门提供的
	 * @param
	 * @return
	 */
	public FlopgoActivity getFlopInFoByTime(String id);
	/**
	 * 修改翻牌购是否为发布或则关闭状态
	 * @param flopgoId
	 * @param userid
	 * @param status
	 * @return
	 */
	public int updateFlopGoStatus(String flopgoId,String userid,String status) throws Exception;
	
	
	 /**
     * 修改翻牌购中的过期的活动，状态为1发布，3草稿的定时任务
     * @Description  
     * @author lijing
     */
	public void updateFlopGoValid();
	
	/**
	 * 通过翻牌狗的id查询翻牌购的信息和每日奖品信息
	 * @param id
	 * @return
	 */
	public FlopSPrizeDailyVO selectFPDByActivityId(String id) throws Exception;
	
	/**
	 * 这是做修改 做每日配置的数量修改
	 *  步骤查询 
	 *     删除
	 *     插入
	 *     
	 * @return
	 * @throws Exception
	 */
	public int updateDailyPrizes(List<FlopPrizeDEntity> dafe,String state,String flopId) throws Exception;
	
}

package com.rongyi.rss.activity.flopgo;

import java.util.List;
import java.util.Map;

import org.bson.types.ObjectId;

import com.rongyi.easy.flopgo.entity.FlopPrizeDEntity;
import com.rongyi.easy.flopgo.entity.FlopgoActivity;
import com.rongyi.easy.flopgo.vo.FlopPrizeVO;
import com.rongyi.easy.flopgo.vo.FlopSPrizeDailyVO;

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
	public int editFlopGo(FlopgoActivity flopgo) throws Exception;
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
	public FlopSPrizeDailyVO selectFPDByActivityId(String id);
	
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
	
	/**
	 * 得到俞当前时间最近的时间的活动Id，并且必须是发布状态，并且不是删除了的
	 * @return
	 */
	public String getNewActivityId();
	
	/**
	 * 修改数量+1
	 * @param dafe
	 * @return
	 */
	public int updateCountDaily(FlopPrizeDEntity dafe);
	
	/**
	 * 通过 活动id 时间 奖品id 查询出奖品信息
	 * @param f
	 * @return
	 */
	public FlopPrizeDEntity selectByFlopEntity(FlopPrizeDEntity f);
	
	/**
	 * 通过商场id得到最新的翻牌购活动
	 * @param mallId
	 * @return
	 */
	public String getActivityIdByMallId(String mallId);

	/***
	 * 通过活动ids 查询活动信息
	 * @param params
	 * @return
	 */
	public List<FlopgoActivity> getFlopgoActivityByIds(List<ObjectId> params);

	/**
	 *  通过活动的id去查询奖品的预览  只给大转盘用
	 * @param activtyId  活动id
	 * @return
	 */
	public List<FlopPrizeVO> getReturnTablePrize(String activtyId);
}

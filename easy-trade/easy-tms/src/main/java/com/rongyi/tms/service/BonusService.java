/**   
 * @Title: BonusService.java 
 * @Package: com.rongyi.tms.service 
 * @Description: TODO
 * @author 袁波 
 * @date 2015年6月16日 上午11:40:58 
 */


package com.rongyi.tms.service;

import java.util.List;

import com.rongyi.easy.malllife.vo.PagingVO;
import com.rongyi.tms.moudle.vo.BonusPageParam;
import com.rongyi.tms.moudle.vo.BonusVO;
import com.rongyi.tms.moudle.vo.CheckParam;

/** 
 *
 * @Description 考核奖金接口
 * @author 袁波
 * @date 2015年6月16日 上午11:40:58 
 */

public interface BonusService {
    /**
     * 
     * @Description 分页查找奖金 
     * @author 袁波
     * @param params
     * @return
     */
    public PagingVO<BonusVO> findByPage(BonusPageParam params);
    
    /**
     * 
     * @Description 更新 
     * @author 袁波
     * @param bonus
     * @return
     */
    public int updateBonus(BonusVO bonus);
    
    /**
     * 
     * @Description 导入考核奖金
     * @author 袁波
     * @return
     */
    public int inputBonusByExcel();
    
    /**
     * 
     * @Description  
     * @author 袁波
     * @return
     */
    public BonusVO getById(int id);
    
    /**
     * 批量插入
     * @Description 
     * @author 袁波
     * @param vos
     * @return
     */
    public int batchInsertBonus(List<BonusVO> vos);
    
    /**
     * 批量审核
     * @Description 
     * @author 袁波
     * @param param
     * @return
     */
    public int batchUpdate(CheckParam param,String user);
}

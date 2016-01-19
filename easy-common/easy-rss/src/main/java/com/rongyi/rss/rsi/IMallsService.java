package com.rongyi.rss.rsi;

import com.rongyi.easy.entity.MallEntity;


/**
 * 类IMallsService.java的实现描述：会员接口
 * @author rongyi-13 2015年1月19日 下午8:52:24
 */
public interface IMallsService {
	/**
     * 查找商场
     * @param _id
     * @return
     */
    public MallEntity findById(String _id);
}

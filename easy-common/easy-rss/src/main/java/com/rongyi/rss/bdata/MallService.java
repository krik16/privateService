package com.rongyi.rss.bdata;

import com.rongyi.core.bean.ResponseVO;

/**
 * Desc: mall service
 * User: chris
 * Date: 2015/10/24 18:32
 */

public interface MallService {
    /**
     * 获取商场详情
     * @param mallId	商场ID
     * @return
     * @throws Exception 
     */

    ResponseVO getMall(String mallId);
    
    /**
	 * 通过商场ID列表获取商场详情
	 * @param ids 商场id列表
	 * @return 带List&lt;MallVO&gt;的ResponseVO
	 */
	ResponseVO getMallsByIds(String ids);

    /**
     * 获取商场楼层
     * @param mallId	商场ID
     * @return
     */
    ResponseVO getFloorsByMallId(String mallId);

    /**
     * 获取楼层详细
     * @param ids	floorId列表（，分隔）
     * @return
     */
    ResponseVO getFloorById(String ids);

    /**
     * 获取全部类别
     * @return
     */
    ResponseVO getAllCategories();

    /**
     * 根据商场ID获取自定义类别
     * @param mallId	商场ID
     * @return
     */
    ResponseVO getCustomCategoriesByMallId(String mallId);

    /**
     *
     * @param brndId
     * @return
     */
    ResponseVO getBrandById(String brndId);

    /**
     *
     * @param mallId
     * @return
     */
    ResponseVO getAds(String mallId);


    /**
     * get communal facility
     * @param floorId
     * @return
     */
    ResponseVO getCommunalFacility(String floorId);

    /**
     * 根据类型和父级ID获取区域信息
     * @param type		类型
     * @param parentId	父级ID
     * @return
     */
    ResponseVO getArea(Integer type, String parentId);
    
    /**
     * 根据商场名称 模糊匹配查询商场列表
     * @param mallName		商场名称
     * @param page			当前页
     * @param pageSize		每页显示条数
     * @return	ResponseVO 对象
     */
    ResponseVO getMallList(String mallName, Integer page, Integer pageSize);

}

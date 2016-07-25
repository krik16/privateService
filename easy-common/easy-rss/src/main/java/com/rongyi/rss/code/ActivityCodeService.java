package com.rongyi.rss.code;

import com.rongyi.easy.code.ImportInviteCodeParam;
import com.rongyi.easy.code.InviteCodeVO;

import java.util.List;
import java.util.Map;

/**
 * Description: 活动相关的码需求接口
 * Author: 袁波
 * DATE: 2016/5/16 16:04
 * Package:com.rongyi.rss.code
 * Project:easy-market
 */
public interface ActivityCodeService {
    /**
     * 生成邀请码
     * @param param
     * @return
     */
    public List<String> generateInviteCode(ImportInviteCodeParam param);

    /**
     * 根据券id 返回券码
     * @param couponId 卡券id
     * @param count 数量
     * @return
     */
    public List<String> getCouponCodesFromCouponId(String couponId,Integer count);


    /**
     * 生成礼品码
     * @param param
     * @return
     */
    public List<String> getGiftCodes(ImportInviteCodeParam param);

    /**
     *
     * @param count 要插入数量
     * @param hannelsId 推广码模板id
     * @param type 2：邀请码；3：推广码
     * @return
     */
    public boolean insertHannelsCodes(int count, Integer hannelsId, int type);

    /**
     * 推广码id查询生成的码code和创建时间
     * @param id
     * @return
     */


    List<Map<String,Object>> getCouponCodesByHannelsId(Integer id);

    /**
     * 推广码id查询生成的码code
     * @param param
     * @return
     */
    List<String> getCouponCodesByHannelsId(Map<String, Object> param);

    /**
     * 作废推广码修改关联的码状态
     * @param updateParam
     * @return
     */
    int updateAcvityCode(String hannels_id,int status);
}

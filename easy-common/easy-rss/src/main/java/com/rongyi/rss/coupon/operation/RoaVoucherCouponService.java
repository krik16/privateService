package com.rongyi.rss.coupon.operation;

import com.rongyi.core.bean.ResponseResult;
import com.rongyi.core.common.PagingVO;
import com.rongyi.core.framework.mybatis.pojo.Page;
import com.rongyi.easy.coupon.entity.Coupon;
import com.rongyi.easy.coupon.entity.CouponChannel;
import com.rongyi.easy.coupon.entity.CouponSort;
import com.rongyi.easy.coupon.param.CouponParam;
import com.rongyi.easy.coupon.param.VoucherCouponParam;
import com.rongyi.easy.coupon.vo.operation.CouponCountVO;
import com.rongyi.easy.coupon.vo.operation.VoucherCouponVO;

import java.util.Date;
import java.util.List;

/**
 * Description:大运营平台代金券接口
 * author:lqy
 * time:2015年7月21日 下午3:24:21
 */
public interface RoaVoucherCouponService {


    /**
     * param coupon 代金券entity
     * return 成功：true 失败：false
     * Description:创建代金券
     * author:lqy
     */
    boolean create(Coupon coupon);

    /**
     * param coupon 代金券entity
     * return 成功：true 失败：false
     * Description:修改代金券
     * author:lqy
     */
    boolean update(Coupon coupon);


    /**
     * param id 代金券id
     * return 成功：true 失败：false
     * throws Exception
     * Description:根据id删除代金券
     * author:lqy
     */
    boolean remove(String id);

    /**
     * param param 参数对象
     * return VoucherCouponVO集合
     * Description:多条件分页查询代金券
     * author:lqy
     */
    PagingVO<VoucherCouponVO> findAllByPage(VoucherCouponParam param);

    /**
     * param param 参数对象
     * return CouponCountVO
     * Description:统计卡券各个状态下数量
     * author:lqy
     */
    CouponCountVO countByStatus(VoucherCouponParam param);

    /**
     * param ids    代金券id
     * param status 审核状态 ：待审核[0] 未通过[1] 已通过[2]
     * param reason 未通过原因
     * return 成功：true 失败：false
     * Description:审核代金券
     * author:lqy
     */
    boolean submitVerify(List<String> ids, Integer status,
                         String reason);

    /**
<<<<<<< HEAD
=======
     * 卡券发布时没有选择集团、品牌、商场下的店铺，审核通过时，关联卡券对应类型下所有的店铺
     * @param coupon
     * @return
     */
    boolean relationShops(Coupon coupon);

    /**
>>>>>>> develop-yuzhijian
     * param ids    代金券id
     * param reason 下架原因
     * return 成功：true 失败：false
     * Description:下架代金券
     * author:lqy
     */
    boolean submitOffStock(List<String> ids, String reason)
    ;

    /**
     * param id 代金券id
     * return 返回coupon
     * Description:根据id查询代金券
     * author:lqy
     */
    Coupon findOneById(String id);

    /**
     * param id    代金券id
     * param count 追加数量
     * return
     * Description:追加代金券
     * author:lqy
     */
    boolean addCouponCount(String id, int count);

    /**
     * param ids           卡券集合
     * param displayRegion 展示区域： 常规区域,活动区域;未选中[0]，选中[1] 例如 "1,1"表示都选中
     * return
     * Description:设置展示区域
     * author:lqy
     */
    ResponseResult submitDeployRegion(List<String> ids, String displayRegion);

    /**
     * 查看卡券导入渠道和推广渠道
     * <p/>
     * return List<CouponChannel>
     */
    List<CouponChannel> getCouponChannels();

    /**
     * 追加第三方券码数量，第三方券码是通过导入excel插入到coupon_code,该方法只修改coupon的总量和库存
     *
     * @param id    代金券
     * @param count 追加的数量
     * @return
     */
    boolean addThirdCouponCount(String id, int count);


    /***********置顶代金券 start***************/

    /**
     * 分页查询置顶代金券列表
     * <p/>
     * param param 查询参数
     * return
     */
    PagingVO<VoucherCouponVO> findAllStickByPage(VoucherCouponParam param);

    /**
     * param couponSortList 置顶对象集合
     * return
     * Description:代金券置顶
     * author:lqy
     */
    ResponseResult submitStick(List<CouponSort> couponSortList);

    /**
     * param id 代金券id
     * return 成功返回true 失败返回false
     * Description:代金券取消置顶
     * author:lqy
     */
    boolean submitUnstick(String id);

    /**
     * param couponSortId 排序id
     * param sortIdx      排序值
     * param cityId       城市id
     * return 成功返回true 失败返回false
     * Description:置顶代金券排序
     * author:lqy
     */
    boolean submitSort(Integer couponSortId, int sortIdx, String cityId);


    /***********置顶代金券 end***************/


    /**
     * 摩店：通用查询
     *
     * @param couponParam
     * @return
     */
    Page findAllByPage(CouponParam couponParam);

    /**
     * 摩店：下架操作
     *
     * @param couponId
     * @param status
     * @return
     */
    boolean updateOffStock(String couponId, boolean status);

    public boolean appendCouponCount(String couponId, Integer quantity);

    /**
     * 数据迁移
     *
     * @return
     */
    boolean dataMigration();

    CouponChannel findCouponChannelById(Integer id);
}

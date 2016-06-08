//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.rongyi.rss.tradecenter.osm;

import com.rongyi.core.common.PagingVO;
import com.rongyi.easy.osm.entity.OrderDetailFormEntity;
import com.rongyi.easy.osm.entity.OrderEventEntity;
import com.rongyi.easy.osm.entity.OrderFormEntity;
import com.rongyi.easy.osm.entity.OrderFormExtraEntity;
import com.rongyi.easy.rmmm.param.MaxIntegralParam;
import com.rongyi.easy.rmmm.param.MyDealParam;
import com.rongyi.easy.rmmm.param.MyOrderParam;
import com.rongyi.easy.rmmm.param.TransactionDetailParam;
import com.rongyi.easy.rmmm.vo.CartOrderDetailVO;
import com.rongyi.easy.rmmm.vo.DetailVO;
import com.rongyi.easy.rmmm.vo.MyOrderCountVO;
import com.rongyi.easy.rmmm.vo.OrderManagerVO;
import com.rongyi.easy.rmmm.vo.OrderVO;
import com.rongyi.easy.rmmm.vo.ParentOrderListVO;
import com.rongyi.easy.rmmm.vo.ParentOrderVO;
import com.rongyi.easy.rmmm.vo.ShopMallVO;
import com.rongyi.easy.rmmm.vo.TransactionDetailVO;
import java.util.List;
import java.util.Map;

public interface IOrderQueryService {
	ParentOrderListVO getMyOrderList(MyOrderParam var1, String var2) throws Exception;

	ParentOrderVO getParentOrderVO(Integer var1) throws Exception;

	MyOrderCountVO getMyOrderCount(String var1) throws Exception;

	MyOrderCountVO getMyOrderCountForCart(String var1) throws Exception;

	TransactionDetailVO getTransactionDetail(TransactionDetailParam var1, String var2) throws Exception;

	List<TransactionDetailVO> getTransactionDetailForCart(TransactionDetailParam var1, String var2) throws Exception;

	ShopMallVO getShopMallVOByOrderNum(String var1) throws Exception;

	OrderVO getOrderInfo(String var1, String var2) throws Exception;

	OrderFormEntity getOrderFormByOrderNum(String var1) throws Exception;

	OrderFormEntity getOrderFormByOrderId(Integer var1) throws Exception;

	List<OrderDetailFormEntity> selectByParentNum(String var1) throws Exception;

	ParentOrderVO searchRYOrderDetail(Integer var1) throws Exception;

	PagingVO<OrderManagerVO> searchListByMap(Map<String, Object> var1) throws Exception;

	OrderEventEntity getOrderEventByType(String var1, String var2) throws Exception;

	Integer getMaxIntegral(MaxIntegralParam var1, double var2, double var4);

	Map<String, String> getRouteByStatusRoute(String var1);

	List<OrderFormEntity> selectOrderList(Map var1) throws Exception;

	int selectOrderListCount(String var1, String var2) throws Exception;

	DetailVO getMyDealAmount(MyDealParam var1) throws Exception;

	DetailVO getMyDealCommission(MyDealParam var1) throws Exception;

	ParentOrderListVO getMyOrderListForCart(MyOrderParam var1, String var2) throws Exception;

	CartOrderDetailVO getMyOrderDetailForCart(String var1) throws Exception;

	Map<String, Object> getMaxIntegralForCart(List<MaxIntegralParam> var1, double var2, double var4, double var6);

	List<OrderFormEntity> getShopOrderNoByCartNo(String var1);

	OrderFormExtraEntity getNewAddressByOrderNo(String var1);
}

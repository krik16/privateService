package com.rongyi.osm.knowledge;

import net.sf.json.JSONObject;

import com.rongyi.core.common.util.JsonUtil;
import com.rongyi.easy.osm.entity.OrderDetailFormEntity;
import com.rongyi.easy.osm.entity.OrderFormEntity;

public class OrderCreateEvent extends UserEvent{
	/**  */
	private static final long serialVersionUID = 6583937891398955261L;
	
	private OrderFormEntity orderFormEntity;
	private OrderDetailFormEntity[] orderDetailFormEntityList;
	
	public void load(JSONObject json) throws Exception {
		// 调用父类分析函数
		super.load(json);
	
		JSONObject param = (JSONObject)getBody();

		setOrderFormEntity((OrderFormEntity)
				JsonUtil.getDTO(
						param.get("order").toString(),
						OrderFormEntity.class));
		
		OrderFormEntity orderFormEntity = getOrderFormEntity();
		if(orderFormEntity.getJsonDiscountInfo()!=null){
			orderFormEntity.setDiscountInfo(orderFormEntity.getJsonDiscountInfo().toString());
		}
		
		Object[] objList = JsonUtil.getDTOArray(
				param.get("orderDetailList").toString(), 
				OrderDetailFormEntity.class);
		
		OrderDetailFormEntity[] list = new OrderDetailFormEntity[objList.length];
		int i = 0;
		for (Object obj : objList) {
			list[i] = (OrderDetailFormEntity)obj;
			i++;
		}
		
		setOrderDetailFormEntityList(list);
	}
	
	@Override
	public String getName() {
		return "买家下单";
	}
	
	public OrderFormEntity getOrderFormEntity() {
		return orderFormEntity;
	}
	
	public void setOrderFormEntity(OrderFormEntity orderFormEntity) {
		this.orderFormEntity = orderFormEntity;
	}
	
	public OrderDetailFormEntity[] getOrderDetailFormEntityList() {
		return orderDetailFormEntityList;
	}

	public void setOrderDetailFormEntityList(OrderDetailFormEntity[] orderDetailFormEntityList) {
		this.orderDetailFormEntityList = orderDetailFormEntityList;
	}


}

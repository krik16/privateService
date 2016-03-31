package com.rongyi.rss.ryoms.callcenter;

import java.util.List;

import com.rongyi.easy.ryoms.callcenter.param.OrderReportParam;
import com.rongyi.easy.ryoms.callcenter.vo.OrderReportResult;
import com.rongyi.easy.ryoms.callcenter.vo.UserOrderReportResult;
import com.rongyi.easy.ryoms.entity.RyUserInfo;

public interface OrderReportService {
	public OrderReportResult getOrderReport(OrderReportParam orderReportParam,boolean type);
	
	public UserOrderReportResult getUserOrderReport(OrderReportParam orderReportParam, boolean type);

	public List<RyUserInfo> getReportUsers();
}

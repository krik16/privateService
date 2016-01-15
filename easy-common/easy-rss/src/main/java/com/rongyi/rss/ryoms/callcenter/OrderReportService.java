package com.rongyi.rss.ryoms.callcenter;

import com.rongyi.easy.ryoms.callcenter.param.OrderReportParam;
import com.rongyi.easy.ryoms.callcenter.vo.OrderReportResult;
import com.rongyi.easy.ryoms.callcenter.vo.UserOrderReportResult;

public interface OrderReportService {
	public OrderReportResult getOrderReport(OrderReportParam orderReportParam,boolean type);
	
	public UserOrderReportResult getUserOrderReport(OrderReportParam orderReportParam, boolean type);
}

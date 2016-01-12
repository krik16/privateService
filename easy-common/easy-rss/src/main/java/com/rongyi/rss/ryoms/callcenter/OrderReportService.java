package com.rongyi.rss.ryoms.callcenter;

import java.util.List;

import com.rongyi.easy.ryoms.callcenter.param.OrderReportParam;
import com.rongyi.easy.ryoms.callcenter.vo.OrderReportVo;

public interface OrderReportService {
	public List<OrderReportVo> getOrderReport(OrderReportParam orderReportParam);
}

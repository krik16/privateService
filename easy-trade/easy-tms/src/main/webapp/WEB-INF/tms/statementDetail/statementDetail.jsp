<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<%@ include file="../common/tag.jsp"%>
<%@ include file="../common/massageBox.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <title>订单详情</title>
        <link href="${ctx}/css/index.css" type="text/css" rel="stylesheet" />
        <link href="${ctx}/css/poshytip/tip-yellowsimple/tip-yellowsimple.css"
              type="text/css" rel="stylesheet" />
        <link href="${ctx}/css/jquery.timepicker.css" type="text/css"
              rel="stylesheet" />
        <!-- 日期控件css -->
        <link href="${ctx}/js/util/bootstrap/bootstrap.css" rel="stylesheet"
              type="text/css" />
        <script src="${ctx}/js/jquery/jquery.js" type="text/javascript"></script>
        <script src="${ctx}/js/util/util.js" type="text/javascript"></script>
        <script src="${ctx}/js/util/msgBoxBg.js" type="text/javascript"></script>
        <script src="${ctx}/js/jquery/jquery.poshytip.min.js" type="text/javascript"></script>
        <script src="${ctx}/js/util/list_common.js" type="text/javascript"></script>
        <script src="${ctx}/js/common.js" type="text/javascript"></script>
        <link href="${ctx}/css/jquery-ui.css" type="text/css" rel="stylesheet" />
        <script src="${ctx}/js/jquery/jquery-ui.js" type="text/javascript"></script>
        <!-- 日期控件js -->
        <script src="${ctx}/js/jquery/jquery.jtimepicker.js"
        type="text/javascript"></script>
        <script src="${ctx}/js/jquery/jquery-ui-timepicker-addon.js"
        type="text/javascript"></script>
        <!-- 日期控件js end-->
        <script src="${ctx}/js/jquery/jquery.nicescroll.js"
        type="text/javascript"></script>
        <script src="${ctx}/js/jquery/jquery-ui-timepicker-zh-CN.js"
        type="text/javascript"></script>
        <script src="${ctx}/js/index.js" type="text/javascript"></script>
        <script src="${ctx}/js/util/bootstrap/bootstrap.min.js"
        type="text/javascript"></script>
          <script src="${ctx}/js/statementDetail/statementDetail.js" type="text/javascript"></script>
        <style type="text/css">
            body {
                background: #fff;
            }
        </style>
    </head>

    <body>
        <div class="memSuper">
            <div class="memSuper-title">对账管理 >结算明细</div>
            <div class="memSuper-main">
                <div class="search" style="height: 60px;">
                    <input id="currpage" type="hidden" name="currpage" value="${currpage}" />
                    <div class="memSuper-search" style="height:130px;width: 100%;">
					<input type="hidden" value="1" name="pageNo" id="currpage">
					<ur>
						<li>
						账单批次号:
						<input id="batchNo" type="text" maxlength="50" style="vertical-align:middle;"/></input>
						</li>
						<li>
							付款单号:
							<input id="payNo"  class="detail" type="text" maxlength="50" /></input>
						</li>
							<li>
							交易流水号:
							<input id="tradeNo"  class="detail" type="text" maxlength="50" /></input>
						</li>
						<li >付款账号：
							<input id="payAccount"  type="text"  class="detail" style="width:100px"></input>
						</li>
						<li style="margin-top: 25px;">结算方式：
							<select id="payChannel" style="width: 90px">
								<option value="">--全部--</option>
								<option value="0">支付宝</option>
								<option value="1">微信</option>
								<option value="2">银行卡</option>
								<option value="3">现金</option>
								<option value="4">银行转账</option>
							</select>
						</li>
						
						<li><span id="search-time" style="width: 76px;">付款时间:</span>
							<input name="start" type="text" value="" class="min bg2 startTime" id="payStartTime" style="width:160px"/><span style="margin: 0 -55px 0 -15px">至</span> 
							<input name="end" type="text" value="" class="min bg2 endTime" id="payEndTime"  style="width:160px"/> 
						</li>
						
						<li>
							<span id="search-price">付款金额：</span>
							<input type="text" id="minTotalPrice"  style="width: 80px"></input><span style="margin: 0 -55px 0 -15px">至</span> 
							<input type="text" id="maxTotalPrice"  style="width: 80px"></input>
						</li>
						<li>
							<a href="javascript:void(0);" class="btnsearch checked" id="search-button">查询</a>
						</li>
						<li>
							<sec:authorize ifAnyGranted="TMS_TRADE_EXPORT" >
							 <a  href="javascript:void(0);" target="_parent" class="btnsearch" id="exportExcel"  style="border:0px;float: right;width: 100px">导出交易明细</a>
						 </sec:authorize>
						</li>
					</ur>
				</div>
                </div>
                <div id="result" style="margin: 0 30px;"></div>

            </div>

        </div>
    </body>
</html>
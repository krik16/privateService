<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<%@ include file="../common/tag.jsp"%>
<%@ include file="../common/massageBox.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <title>付款</title>
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
        <script src="${ctx}/js/pay/pay.js" type="text/javascript"></script>
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
        <style type="text/css">
            body {
                background: #fff;
            }
            .memSuper-search span{
            	line-height:0px;
            }
             .memSuper-search li {
			  margin-left: 0px;
			}
        </style>
    </head>

    <body>
        <div class="memSuper">
            <div class="memSuper-title">财务管理 >付款</div>
	           <div class="memSuper-main">
	             <div style="font-size: 16px;">
					<a class="change-color" id="drawApply" href="javascript:void(0);"
						onclick="switchCheck(0)">提现付款</a> 
						|<a class="now" href="javascript:void(0);" id="tradeRefund" onclick="switchCheck(1)">交易退款</a>
						|<a class="now" href="javascript:void(0);" id="exceTrade" onclick="switchCheck(2)">异常交易付款</a>
						<!-- |<a class="now" href="javascript:void(0);" id="paySeller" onclick="switchCheck(3)">打款到卖家</a> -->
				</div>
				<div class="memSuper-search" style="height: auto !important;min-height:140px; width: 100%">
					<input type="hidden" value="1" name="pageNo" id="currpage">
					<ur>
						<div style="display: block;" id="search-drawNo">
						<li>
							<span id="search-drawNo-label">提现流水号:</span>
							<input id="drawNo" class="drawNo" type="text" maxlength="50" /></input>
						</li>
						</div>
						<div style="display: none;" id="search-payNo">
							<li>
								异常交易号:
								<input id="payNo" class="payNo" type="text" maxlength="50" /></input>
							</li>
						</div>
						<div style="display: none;" id ="search-orderNo">
						<li>
							订单号:
							<input id="orderNo"  class="orderNo" type="text" maxlength="50" style="width: 120px"/></input>
						</li>
						</div>
						<li class="xiala">商场：
							<input type="text" name="mallId" style="width: 110px"></input>
						</li>
						<li class="xiala">店铺：
							<input type="text" name="shopId" style="width: 110px">
						</input>
						</li>
						<div style="display: block;" id ="search-sellerName">
							<li>卖家姓名：
								<input id="sellerName"  type="text" style="width: 100px"></input>
							</li>
						</div>
							<div style="display: none;" id ="search-buyerAccount">
							<li>买家账号：
								<input id="buyerAccount"  type="text" style="width: 100px"></input>
							</li>
						</div>
						<!-- <div style="display: none;" id ="search-buyerName">
							<li>买家姓名：
								<input id="buyerName"  type="text" style="width: 100px"></input>
							</li>
						</div> -->
						<li>打款方式：
							<select id="payChannel" style="width: 100px">
								<option value="">--全部--</option>
								<option value="0">支付宝</option>
								<!-- <option value="1">微信</option> --> 
								<option value="2">银行卡</option>
							</select>
						</li>
						<li><span id="search-time" style="width: 100px;margin-left: 26px;">申请提现时间段:</span>
							<input name="start" type="text" value="" class="min bg2 startTime" id="payStartTime"/><span style="margin: 0 -55px 0 -15px">至</span> 
							<input name="end" type="text" value="" class="min bg2 endTime" id="payEndTime"  style="margin-right: 0px;"/> 
						</li>
						<li style="margin-left: 10px">
							<span id="search-price">提现金额：</span>
							<input type="text" id="minTotalPrice" style="width: 80px"></input><span style="margin:0 -55px 0 -15px">至</span> 
							<input type="text" id="maxTotalPrice" style="width: 80px"></input>
						</li>
						<li>
							<a href="javascript:void(0);" class="btnsearch checked" id="search-button">查询</a>
						</li>
						<li>
							 <sec:authorize ifAnyGranted="TMS_F_PAY" ><a  href="javascript:void(0);" target="_parent" class="btnsearch" id="morePay"  style="border:0px;float: right;">批量付款</a></sec:authorize>
						</li>
					</ur>
				</div>
		
                <div id="result" style="margin: 0 30px;"></div>

            </div>

        </div>
    </body>
</html>

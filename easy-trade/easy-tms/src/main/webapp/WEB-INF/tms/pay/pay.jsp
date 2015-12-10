<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ include file="../common/tag.jsp" %>
<%@ include file="../common/massageBox.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <title>付款</title>
    <link href="${ctx}/css/index.css" type="text/css" rel="stylesheet"/>
    <link href="${ctx}/css/poshytip/tip-yellowsimple/tip-yellowsimple.css"
          type="text/css" rel="stylesheet"/>
    <link href="${ctx}/css/jquery.timepicker.css" type="text/css"
          rel="stylesheet"/>
    <!-- 日期控件css -->
    <link href="${ctx}/js/util/bootstrap/bootstrap.css" rel="stylesheet"
          type="text/css"/>
    <script src="${ctx}/js/jquery/jquery.js" type="text/javascript"></script>
    <script src="${ctx}/js/util/util.js" type="text/javascript"></script>
    <script src="${ctx}/js/util/msgBoxBg.js" type="text/javascript"></script>
    <script src="${ctx}/js/jquery/jquery.poshytip.min.js" type="text/javascript"></script>
    <script src="${ctx}/js/pay/pay.js" type="text/javascript"></script>
    <script src="${ctx}/js/util/list_common.js" type="text/javascript"></script>
    <script src="${ctx}/js/common.js" type="text/javascript"></script>
    <link href="${ctx}/css/jquery-ui.css" type="text/css" rel="stylesheet"/>
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

        .memSuper-search span {
            line-height: 0px;
        }

        .memSuper-search li {
            margin-left: 0px;
        }
    </style>
</head>

<body>
<div class="memSuper">
    <div class="memSuper-title">财务管理 >付款</div>
    <div class="p-list">
        <div style="font-size: 16px;">
            <a class="change-color" id="drawApply" href="javascript:void(0);"
               onclick="switchCheck(0)">提现付款</a>
            |<a class="now" href="javascript:void(0);" id="tradeRefund" onclick="switchCheck(1)">交易退款</a>
            |<a class="now" href="javascript:void(0);" id="exceTrade" onclick="switchCheck(2)">异常交易付款</a>
            |<a class="now" href="javascript:void(0);" id="statementPay" onclick="switchCheck(3)">对账单付款</a>
        </div>
        <div class="form-inline ng-valid ng-dirty ng-valid-parse">
            <input type="hidden" value="1" name="pageNo" id="currpage">
            <div class="form-group"  id="search-drawNo">
                <label id="search-drawNo-label">提现流水号:</label>
                <input id="drawNo" type="text" class="form-control ng-pristine ng-untouched ng-valid">
            </div>
            <div class="form-group" style="display: none;" id="search-payNo">
                <label>付款单号:</label>
                <input id="payNo" type="text" class="form-control ng-pristine ng-untouched ng-valid">
            </div>
            <div class="form-group" style="display: none;" id="search-orderNo">
                <label>订单号:</label>
                <input id="orderNo" type="text" class="form-control ng-pristine ng-untouched ng-valid">
            </div>
            <div class="form-group"  id="search-guideType">
                <label id="search-guideType-label">渠道：</label>
                <select id="guideType" class="form-control ng-pristine ng-untouched ng-valid">
                    <option value="">--全部--</option>
                    <option value="1">商家</option>
                    <option value="2">买手</option>
                </select>
            </div>
            <div class="form-group" style="list-style-type:none;">
                    <label>商场：</label>
                    <input name="mallId" type="text" class="form-control ng-pristine ng-untouched ng-valid xiala">
            </div>
            <div class="form-group" style="list-style-type:none;">
                    <label>店铺：</label>
                    <input name="shopId" type="text" class="form-control ng-pristine ng-untouched ng-valid xiala">
            </div>
            <div class="form-group"  id="search-sellerName">
                <label>卖家姓名：</label>
                <input id="sellerName" type="text" class="form-control ng-pristine ng-untouched ng-valid">
            </div>
            <div class="form-group" style="display: none;" id="search-buyerAccount">
                <label>买家账号：</label>
                <input id="buyerAccount" type="text" class="form-control ng-pristine ng-untouched ng-valid">
            </div>
            <div class="form-group" style="display: none;" id="search-batchNo">
                <label>账单批次：</label>
                <input id="batchNo" type="text" class="form-control ng-pristine ng-untouched ng-valid">
            </div>
            <div class="form-group" style="display: none;">
                <label id="search-bussinessType">>商户类型：</label>
                <select id="bussinessType" class="form-control ng-pristine ng-untouched ng-valid">
                 		<option value="">--全部--</option>
						<option value="0">店铺</option>
						<option value="1">商场</option> 
						<option value="2">品牌</option>
						<option value="3">分公司</option>
						<option value="4">集团公司</option>
                </select>
            </div>
             <div class="form-group" style="display: none;" id ="search-bussinessName">
                <label>商户名称：</label>
                <input id="bussinessName" type="text" class="form-control ng-pristine ng-untouched ng-valid">
            </div>
            <div class="form-group">
                <label id="search-payChannel-label">打款方式：</label>
                <select id="payChannel" class="form-control ng-pristine ng-untouched ng-valid">
                    <option value="">--全部--</option>
                    <option value="0">支付宝</option>
                    <option value="1">微信</option>
                    <option value="2">银行卡</option>
                </select>
            </div>
            <div class="form-group">
                <label id="search-time">申请提现时间段:</label>
                <input name="start" type="text" value=""
                       class=" form-control ng-pristine ng-untouched ng-valid startTime" id="payStartTime"/>
                <label>&nbsp;至&nbsp;<label>
                <input name="end" type="text" value=""
                       class="form-control ng-pristine ng-untouched ng-valid endTime" id="payEndTime"
                       style="width:160px"/>
            </div>

            <div class="form-group">
                <label id="search-price">提现金额：</label>
                <input type="text" id="minTotalPrice" class=" form-control ng-pristine ng-untouched ng-valid"/>
                <label>&nbsp;至&nbsp;</label>
                <input type="text" id="maxTotalPrice" class="form-control ng-pristine ng-untouched ng-valid"/>
            </div>
            <div class="form-group">
                <a href="javascript:void(0);" class="btnsearch checked" id="search-button">查询</a>
            </div>
            <div class="form-group">
                <sec:authorize ifAnyGranted="TMS_F_PAY" >
                	<a  href="javascript:void(0);" onclick="morePayClick()" target="_parent" class="btnsearch" id="morePay"  style="border:0px;float: right;">
                		批量付款
                	</a>
                </sec:authorize>
            </div>
        </div>
        <div id="result" style="margin: 0 30px;"></div>

    </div>

</div>
</body>
</html>
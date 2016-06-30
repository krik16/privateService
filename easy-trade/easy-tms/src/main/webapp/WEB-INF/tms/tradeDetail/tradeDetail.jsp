<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ include file="../common/tag.jsp" %>
<%@ include file="../common/massageBox.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <title>订单详情</title>
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
    <script src="${ctx}/js/tradeDetail/tradeDetail_search.js" type="text/javascript"></script>
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
    </style>
</head>

<body>
<div class="memSuper">
    <div class="memSuper-title">对账管理 >交易明细</div>
    <div class="p-list">
        <div class="form-inline ng-valid ng-dirty ng-valid-parse">
            <input id="currpage" type="hidden" name="currpage" value="${currpage}"/>
            <div class="form-group">
                <label>交易流水号:</label>
                <input id="tradeNo" type="text" class="form-control ng-pristine ng-untouched ng-valid">
            </div>
            <div class="form-group">
                <label>订单号:</label>
                <input id="orderNo" type="text" class="form-control ng-pristine ng-untouched ng-valid">
            </div>
            <div class="form-group">
                <label>付款单号:</label>
                <input id="payNo" type="text" class="form-control ng-pristine ng-untouched ng-valid">
            </div>
          <%--  <div class="form-group">
                <label>渠道：</label>
                <select id="guideType" class="form-control ng-pristine ng-untouched ng-valid">
                    <option value="">--全部--</option>
                    <option value="1">商家</option>
                    <option value="2">买手</option>
                </select>
            </div>--%>
        <%--    <div class="form-group">
                <li class="xiala" style="list-style-type:none;">
                    <label>商场：</label>
                    <input name="mallId" type="text" class="form-control ng-pristine ng-untouched ng-valid">
                </li>
            </div>
            <div class="form-group">
                <li class="xiala" style="list-style-type:none;">
                    <label>店铺：</label>
                    <input name="shopId" type="text" class="form-control ng-pristine ng-untouched ng-valid">
                </li>
            </div>--%>
            <%--<div class="form-group">
                <li class="xiala" style="list-style-type:none;">
                    <label>街边店：</label>
                    <input name="curbshopName" type="text" class="form-control ng-pristine ng-untouched ng-valid">
                    <input id="curbshopId" type="hidden" value=""/>
                </li>
            </div>--%>
            <div class="form-group">
                <label>买家账号：</label>
                <input id="buyerAccount" type="text" class="form-control ng-pristine ng-untouched ng-valid">
            </div>
            <div class="form-group">
                <label>买家付款账号：</label>
                <input id="buyerPayAccount" type="text" class="form-control ng-pristine ng-untouched ng-valid">
            </div>
            <%--<div class="form-group">
                <label>卖家账号：</label>
                <input id="sellerAccount" type="text" class="form-control ng-pristine ng-untouched ng-valid">
            </div>--%>
            <div class="form-group">
                <label>收支类型：</label>
                <select id="tradeType" class="form-control ng-pristine ng-untouched ng-valid">
                    <option value="">--全部--</option>
                    <option value="0">收入</option>
                    <option value="1">支出</option>
                </select>
            </div>
            <div class="form-group">
                <label>打款方式：</label>
                <select id="payChannel" class="form-control ng-pristine ng-untouched ng-valid">
                    <option value="">--全部--</option>
                    <option value="0">支付宝</option>
                    <option value="1">微信</option>
                    <option value="2">银行卡</option>
                </select>
            </div>
            <div class="form-group">
                <label>订单类型:</label>
                <select id="orderType" class="form-control ng-pristine ng-untouched ng-valid">
                    <option value="">--全部--</option>
                    <option value="0">商品订单</option>
                    <option value="1">优惠券订单</option>
                    <option value="2">积分商城订单</option>
                </select>
            </div>

            <div class="form-group">
                <label>优惠方式:</label>
                <select id="favorType" class="form-control ng-pristine ng-untouched ng-valid">
                    <option value="">--全部--</option>
                    <option value="0">未使用优惠</option>
                    <option value="1">红包</option>
                    <option value="2">积分</option>
                    <option value="3">红包加积分</option>
                    <option value="4">抵扣券</option>
                    <option value="5">抵扣券加积分</option>
                </select>
            </div>

            <div class="form-group">
                <label>交易时间段:</label>
                <input name="start" type="text" value=""
                       class=" form-control ng-pristine ng-untouched ng-valid startTime" id="tradeStartTime"
                       style="width:160px"/>
                <label>至</label>
                    <input name="end" type="text" value=""
                           class="form-control ng-pristine ng-untouched ng-valid endTime" id="tradeEndTime"
                           style="width:160px"/>
              </div>
            <div class="form-group">
                <label>交易金额：</label>
                <input type="text" id="minTotalPrice" class=" form-control ng-pristine ng-untouched ng-valid"/>
                <label>至</label>
                <input type="text" id="maxTotalPrice" class="form-control ng-pristine ng-untouched ng-valid"/>
            </div>
            <div class="form-group">
                <a href="javascript:void(0);" class="btnsearch checked" id="search-button">查询</a>
            </div>
            <div class="form-group">
                <sec:authorize ifAnyGranted="TMS_TRADE_EXPORT">
                    <a href="javascript:void(0);" target="_parent" class="btnsearch" id="exportExcel"
                       style="border:0px;float: right;width: 100px">导出交易明细</a>
                </sec:authorize>
            </div>
        </div>
        <div id="result" style="margin: 0 30px;"></div>

    </div>

</div>
</body>
</html>

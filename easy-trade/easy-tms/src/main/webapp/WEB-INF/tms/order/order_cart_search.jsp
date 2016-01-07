<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ include file="/_include/_jsp_tags.jsp" %>
<%@include file="/_include/_jsp_variable.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <title>优惠券管理系统</title>
    <link href="${ctx}/css/index.css" type="text/css" rel="stylesheet"/>
    <link href="${ctx}/css/poshytip/tip-yellowsimple/tip-yellowsimple.css" type="text/css" rel="stylesheet"/>
    <link href="${ctx}/js/util/bootstrap/bootstrap.css" type="text/css" rel="stylesheet"/>
    <link href="${ctx}/css/jquery-ui.css" type="text/css" rel="stylesheet" />
    <link href="${ctx}/css/jquery.timepicker.css" type="text/css" rel="stylesheet" />


    <script src="${ctx}/js/jquery/jquery.js" type="text/javascript"></script>
    <script src="${ctx}/js/jquery/jquery-ui.js" type="text/javascript"></script>
    <!-- 日期控件js -->
    <script src="${ctx}/js/jquery/jquery.jtimepicker.js" type="text/javascript"></script>
    <script src="${ctx}/js/jquery/jquery-ui-timepicker-addon.js" type="text/javascript"></script>
    <!-- 日期控件js end-->
    <script src="${ctx}/js/jquery/jquery.nicescroll.js" type="text/javascript"></script>
    <script src="${ctx}/js/jquery/jquery-ui-timepicker-zh-CN.js" type="text/javascript"></script>
    <script src="${ctx}/js/index.js" type="text/javascript"></script>
    <script src="${ctx}/js/util/bootstrap/bootstrap.min.js" type="text/javascript"></script>
    <script src="${ctx}/js/util/util.js" type="text/javascript"></script>
    <script src="${ctx}/js/common.js" type="text/javascript"></script>

    <script src="${ctx}/js/layer/layer.js" type="text/javascript"></script>
    <script src="${ctx}/js/jquery/jquery.poshytip.min.js" type="text/javascript"></script>
    <script src="${ctx}/js/order/order_cart.js" type="text/javascript"></script>
    <style type="text/css">
        body {
            background: #fff;
        }
    </style>
</head>
<body>
<div class="memSuper">
    <div class="memSuper-title">订单管理 >母订单</div>
    <div class="p-list">
        <div class="form-inline ng-valid ng-dirty ng-valid-parse" style="margin-bottom: 40px;">
            <input type="hidden" value="1" id="currpage"/>

            <div class="form-group">
                <label>订单号：</label>
                <c:if test="${orderCartNo!=null}">
                    <input id="orderNo" value="${orderCartNo}" readonly="true" type="text" class="form-control ng-pristine ng-untouched ng-valid">
                </c:if>
                <c:if test="${orderCartNo==null}">
                    <input id="orderNo" value="" type="text" class="form-control ng-pristine ng-untouched ng-valid">
                </c:if>
            </div>

            <div class="form-group">
                <label>买家账号：</label>
                <input id="userAccount" name="userAccount" type="text" class="form-control ng-pristine ng-untouched ng-valid">
            </div>

            <div class="form-group">
                <label>支付方式：</label>
                <select id="payChannel" class="form-control ng-pristine ng-untouched ng-valid">
                    <option value="">--全部--</option>
                    <option value="1,3">支付宝</option>
                    <option value="5">微信</option>
                </select>
            </div>

            <div class="form-group">
                <div class="memSuper-search">
                    <select id="timeType" class="form-control ng-pristine ng-untouched ng-valid">
                        <option value="1">下单时间段</option>
                        <option value="2">支付时间段</option>
                    </select>
                    <input name="timeBegin" type="text" value="" class="min bg2 startTime" id="timeBegin"/>
                    <span style="margin: 0 -55px 0 -15px">至</span>
                    <input name="timeEnd" type="text" value="" class="min bg2 endTime" id="timeEnd"  style="margin-right: 20px;"/>
                </div>
            </div>
            <div class="form-group">
                <label>订单状态：</label>
                <select id="status" class="form-control ng-pristine ng-untouched ng-valid">
                    <option value="">-- 全部 --</option>
                    <option value="1">未付款</option>
                    <option value="2">已付款</option>
                    <option value="3">超时关闭</option>
                    <option value="4">买家关闭</option>
                    <option value="5">失效</option>
                </select>
            </div>

            <div class="form-group">
                <div class="memSuper-search">
                    <select id="amountType" class="form-control ng-pristine ng-untouched ng-valid">
                        <option value="1">订单金额</option>
                        <option value="2">支付金额</option>
                    </select>
                    <input name="amountBegin" type="text" value="" class="detail" id="amountBegin"/>
                    <span style="margin: 0 -55px 0 -15px">至</span>
                    <input name="amountEnd" type="text" value="" class="detail" id="amountEnd"  style="margin-right: 20px;"/>
                </div>
            </div>

            <div class="form-group">
                <a href="javascript:void(0);" class="search-button1 checked" id="search">查询</a>
            </div>
        </div>
        <div id="result" style="margin-top: -35px;">
        </div>
    </div>
</div>
<div class="MsgBoxBg"></div>
<div class="MsgBoxBgTip"></div>
<div class="MsgBoxConfirm">
    <div class="MsgBoxTitle">提示</div>
    <div class="MsgBoxMain">
        <p></p>
        <a href="javascript:void(0);" class="Button cancel">取消</a> <a
            href="javascript:void(0);" class="Button checked" id="MsgBoxBtn">确定</a>
    </div>
</div>

<div class="MsgBoxTip">
    <div class="MsgBoxTitle">提示</div>
    <div class="MsgBoxMain">
        <p></p>
        <a style="margin: 0 auto; display: block; float: none;"
           href="javascript:void(0);" class="Button checked" id="MsgBoxTipBtn">确定</a>
    </div>
</div>
</body>
</html>

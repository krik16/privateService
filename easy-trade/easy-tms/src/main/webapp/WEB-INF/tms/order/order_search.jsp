<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ include file="/_include/_jsp_tags.jsp" %>
<%@include file="/_include/_jsp_variable.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <title>优惠券管理系统</title>
    <link href="${ctx}/css/index4.css" type="text/css" rel="stylesheet"/>
    <link href="${ctx}/css/index.css" type="text/css" rel="stylesheet"/>
    <link href="${ctx}/css/poshytip/tip-yellowsimple/tip-yellowsimple.css" type="text/css" rel="stylesheet"/>
    <link href="${ctx}/js/util/bootstrap/bootstrap.css" type="text/css" rel="stylesheet"/>

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
    <script src="${ctx}/js/order/order_list.js" type="text/javascript"></script>
    <style type="text/css">
        body {
            background: #fff;
        }
    </style>
</head>
<body>
<div class="memSuper">
    <div class="memSuper-title">订单管理 >商品订单</div>
    <div class="p-list">
        <div class="form-inline ng-valid ng-dirty ng-valid-parse" style="margin-bottom: 40px;">
            <input type="hidden" value="1" id="currpage"/>

            <div class="form-group">
                <label>母订单号：</label>
                <input id="orderCartNo" name="orderCartNo" type="text" class="form-control ng-pristine ng-untouched ng-valid" />
            </div>

            <div class="form-group">
                <label>子订单号：</label>
                <input id="orderNo" name="orderNo" type="text" class="form-control ng-pristine ng-untouched ng-valid"/>
            </div>
            <div class="form-group">
                <label>渠道：</label>
                <select id="guideType" class="form-control ng-pristine ng-untouched ng-valid">
                    <option value="">--全部--</option>
                    <option value="1">商家</option>
                    <option value="2">买手</option>
                </select>
            </div>

            <div class="form-group">
                <label>商场：</label>
                <input id="mall" name="mall" type="text" class="form-control ng-pristine ng-untouched ng-valid">
                <input id="mallId" type="hidden" value=""/>
            </div>


            <div class="form-group">
                <label>店铺：</label>
                <input id="shop" name="shop" type="text" class="form-control ng-pristine ng-untouched ng-valid">
                <input id="shopId" type="hidden" value=""/>
            </div>
            <div class="form-group">
                <label>卖家账号：</label>
                <input id="sellerAccount" name="sellerAccount" type="text" class="form-control ng-pristine ng-untouched ng-valid"/>
            </div>
            <div class="form-group">
                <label>支付方式：</label>
                <select id="payChannel" class="form-control ng-pristine ng-untouched ng-valid" title="">
                    <option value="">-- 全部 --</option>
                    <option value="1">支付宝网页</option>
                    <option value="3">支付宝app</option>
                    <option value="5">微信</option>
                </select>
            </div>
         <%--   <div class="form-group">
                <label>昵称：</label>
                <input id="nickname" name="nickname" type="text" class="form-control ng-pristine ng-untouched ng-valid"/>
                <input id="userId" type="hidden" value=""/>
            </div>

--%>
            <div class="form-group">
                <label>买家账号：</label>
                <input id="username" name="username" type="text" class="form-control ng-pristine ng-untouched ng-valid"/>
            </div>

            <div class="form-group">
                <label>商品编码：</label>
                <input id="commodityNo" name="commodityNo" type="text" class="form-control ng-pristine ng-untouched ng-valid"/>
            </div>

            <div class="form-group">
                <label>下单时间段：</label>
                <input name="timeBegin" type="text" value="" class="min bg2 startTime" id="timeBegin"/>
                <span style="margin: 0 -55px 0 -15px">至</span>
                <input name="timeEnd" type="text" value="" class="min bg2 endTime" id="timeEnd"  style="margin-right: 20px;"/>
            </div>
            <div class="form-group">
                <label>支付金额：</label>
                <input name="amountBegin" type="text" value="" class="min bg2 startTime" id="amountBegin"/>
                <span style="margin: 0 -55px 0 -15px">至</span>
                <input name="amountEnd" type="text" value="" class="min bg2 endTime" id="amountEnd"  style="margin-right: 20px;"/>
            </div>
            <div class="form-group">
                <label>订单状态：</label>
                <select id="status" class="form-control ng-pristine ng-untouched ng-valid" title="">
                    <option value="">-- 全部 --</option>
                    <option value="1">未付款</option>
                    <option value="2">待发货</option>
                    <option value="3">已发货</option>
                    <option value="4">已完成</option>
                    <option value="5">已关闭</option>
                    <option value="8">已退款</option>
                </select>
            </div>
            <div class="form-group">
                <label>订单来源：</label>
                <select id="orderSource" class="form-control ng-pristine ng-untouched ng-valid" title="">
                    <option value="">-- 全部 --</option>
                    <option value="1">未付款</option>
                    <option value="2">待发货</option>
                    <option value="3">已发货</option>
                    <option value="4">已完成</option>
                    <option value="5">已关闭</option>
                    <option value="8">已退款</option>
                </select>
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

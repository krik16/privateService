<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/_include/_jsp_tags.jsp"%>
<%@include file="/_include/_jsp_variable.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<title>优惠券管理系统</title>
	<link href="${ctx}/css/index4.css" type="text/css" rel="stylesheet" />
	<link href="${ctx}/css/poshytip/tip-yellowsimple/tip-yellowsimple.css" type="text/css" rel="stylesheet" />
	<link href="${ctx}/js/util/bootstrap/bootstrap.css" type="text/css" rel="stylesheet" />
	
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
	body{
		background: #fff;
	}
</style>
</head>
<body>
	<div class="memSuper">
		<div class="shops-title">订单管理 >商品订单</div>
		<div class="shopSelect">
			<input type="hidden" value="1" id="currpage"/>
			<div class="search">
				<table width="100%" border="0" cellspacing="0" cellpadding="0">
					<tr style="height: 50px;">
						<td width="80"><span class="search-span">订单号：</span></td>
						<td width="10%"><input id="orderNo" name="orderNo" type="text" class="min-input4" value="" maxlength="18" /></td>
						
						<td width="60"><span class="search-span">商场：</span></td>
						<td width="10%">
							<input id="mall" name="mall" type="text" class="min-input4" value="" maxlength="18" />
							<input id="mallId" type="hidden"  value="" />
						</td>
						
						<td width="60"><span class="search-span">店铺：</span></td>
						<td width="10%">
							<input id="shop" name="shop" type="text" class="min-input4" value="" maxlength="18" />
							<input id="shopId" type="hidden"  value="" />
						</td>
						
						<td width="60"><span class="search-span">昵称：</span></td>
						<td width="10%">
							<input id="nickname" name="nickname" type="text" class="min-input4" value="" maxlength="18" />
							<input id="userId" type="hidden"  value="" />
						</td>
						
						<td width="60"><span class="search-span">账号：</span></td>
						<td width="10%"><input id="username" name="username" type="text" class="min-input4" value="" maxlength="18" /></td>
						
						<td width="73"><span class="search-span">状态：</span></td>
						<td width="8%">
							<select id="status"  style="width:100px;" class="search-input1">
								<option value="0">-- 全部 --</option>
								<option value="1">未付款</option>
								<option value="2">待发货</option>
								<option value="3">已发货</option>
								<option value="4">确认收货</option>
								<option value="6">已完成</option>
								<option value="5">已关闭</option>
							</select>
						</td>
						<td> <a href="javascript:void(0);" class="search-button1 checked" id="search">查询</a>
						</td>
					</tr>
				</table>
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

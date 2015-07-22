<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/_include/_jsp_tags.jsp"%>
<%@include file="/_include/_jsp_variable.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>容易会员管理后台</title>
<link href="${ctx}/css/jquery-ui.css" type="text/css" rel="stylesheet" />
<link href="${ctx}/css/jquery.timepicker.css" type="text/css"
	rel="stylesheet" />
	
<link href="${ctx}/css/poshytip/tip-green/tip-green.css" type="text/css" rel="stylesheet" />
<!-- 日期控件css -->
<link href="${ctx}/css/index.css" type="text/css" rel="stylesheet" />
<link href="${ctx}/js/util/bootstrap/bootstrap.css" rel="stylesheet"
	type="text/css" />
<link href="${ctx}/css/poshytip/tip-yellowsimple/tip-yellowsimple.css" type="text/css" rel="stylesheet" />
<script src="${ctx}/js/jquery/jquery.js" type="text/javascript"></script>
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
<script src="${ctx}/js/util/util.js" type="text/javascript"></script>
<script src="${ctx}/js/common.js" type="text/javascript"></script>
<script src="${ctx}/js/layer/layer.js" type="text/javascript"></script>
<script src="${ctx}/js/jquery/jquery.poshytip.min.js" type="text/javascript"></script>
<script src="${ctx}/js/abnormal/abnormal.js" type="text/javascript"></script>
<script type="text/javascript">
	$("#save").click(function() {
		
	});
	</script>
</head>
<body>
	<div class="memSuper">
		<div class="memSuper-title">财务管理 >异常账务</div>
		<div class="memSuper-main">
			<div style="font-size: 16px;">
				<a class="change-color" id="uncheck" href="javascript:void(0);"
					onclick="switchCheck(0)">待审核</a>| <a class="now"
					href="javascript:void(0);" id="checked" onclick="switchCheck(1)">已审核</a>
			</div>
			<div class="memSuper-search" style="height: 130px; width: 100%">

				<input type="hidden" value="1" name="pageNo" id="currpage">
					<input type="hidden" value="0" id="isChecked" />
				<ur>
				<li>异常交易号:<input type="text" id="liushui-no"></input>
				</li>
				<li>订单号：<input type="text" name="orderNo"></input>
				</li>
				<li>买家账号：<input type="text" name="userAccount"></input>
				</li>
				<li class="xiala">打款方式：<select id="channel">
						<option value="">--全部--</option>
						<option value="0">支付宝</option>
						<option value="1">银行卡</option>
				</select>
				<li class="xiala">订单类型：<select id="orderType">
						<option value="">--全部--</option>
						<option value="0">商品订单</option>
						<option value="1">优惠券订单</option>
				</select>
				</li>
				<li class="xiala" id="checkLi" style="display:none;">审核：<select id="hadChecked">
						<option value="0">--全部--</option>
						<option value="1">已通过</option>
						<option value="-1">未通过</option>
				</select>
				</li>
				<li>创建时间段:<input name="start" type="text" value="" class="min bg2 startTime" id="payStartTime"/><span style="margin: 0 -30px 0 15px">至</span> 
							<input name="end" type="text" value="" class="min bg2 endTime" id="payEndTime"  style="margin-right: 0px;"/> 
				</li>
				<li>异常付款金额：<input type="text"
					id="amountMin"></input>至<input type="text" id="amountMax"></input>
				</li>
				<li><a href="javascript:void(0);" class="btnsearch"
					 id="search">查询</a> 
				</li>
				<sec:authorize ifAnyGranted="TMS_F_AB_ADD"><li style="float: right;margin-right: 20px;"><a href="${ctx}/ab/edit?id=0" target="mainFrame"
					class="btnsearchLong" style="float: right" id="create" >新建异常账务</a>
				</li></sec:authorize>
				<sec:authorize ifAnyGranted="TMS_F_AB_VERIFY"><li style="float: right;margin-right:20px;"><a href="javascript:void(0);"
					class="btnsearchLong" style="float: right" id="batchCheck" onclick="batchCheck();">批量审核通过</a>
				</li></sec:authorize>
				</ur>
			</div>
		</div>
		<div id="resultList" class="memSuper-list member-search-list">
			<input id="currpage" type="hidden" name="currpage"
				value="<c:out value='${currpage}'/>" />
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

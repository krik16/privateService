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
<!-- 日期控件css -->
<link href="${ctx}/css/index7.css" type="text/css" rel="stylesheet" />
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
<script src="${ctx}/js/jquery/jquery.poshytip.min.js" type="text/javascript"></script>
<script src="${ctx}/js/bonus/bonus-edit.js" type="text/javascript"></script>
<style type="text/css">
.shopSelectList table thead tr:first-child td {
	height: 40px;
	background: #f4f5f9;
}
</style>
</head>
<body>
	<div class="memSuper">
		<div class="memSuper-title">财务管理 >考核奖金</div>
		<div class="memSuper-main">
			<div style="font-size: 16px;">
				<a class="change-color" id="uncheck" href="javascript:void(0);"
					onclick="switchCheck(0)">待审核</a>| <a class="now"
					href="javascript:void(0);" id="checked" onclick="switchCheck('-1,1,2')">已审核</a>
			</div>
			<div class="memSuper-search" style="height: 130px; width: 100%">

				<input type="hidden" value="1" name="pageNo" id="currpage">
					<input type="hidden" value="0" id="isChecked" />
				<ur>
				<li>流水号:<input type="text" id="liushui-no"></input>
				</li>
				
				<li>卖家账号：<input id="account" type="text"></input>
				<li>类型：<select id="operateType">
						<option value="">--全部--</option>
						<option value="1">交易佣金</option>
						<option value="2">验码佣金</option>
				</select>
				<li>考核方式：<select id="type">
						<option value="">--全部--</option>
						<option value="1">奖励</option>
						<option value="2">惩罚</option>
				</select>
				<li id="li-checked" style="display:none;">审核：
				<select id="select-checked">
						<option value="0">--全部--</option>
						<option value="1,2">已通过</option>
						<option value="-1">未通过</option>
				</select>
				<li>创建时间段：<input name="start" type="text" value="" class="min bg2 startTime" id="startTime"/><span style="margin: 0 -30px 0 15px">至</span> 
							<input name="end" type="text" value="" class="min bg2 endTime" id="endTime"  style="margin-right: 0px;"/> 
				 </li>
				<li><a href="javascript:void(0);" class="btnsearch"
					id="search" >查询</a> 
				</li>
				<li style="float: right;margin-right: 20px;">
					<sec:authorize ifAnyGranted="TMS_F_EXM_ADD"><a href="../bonus/edit" class="btnsearch" style="float: right;width:80px;" id="create">新建考核明细</a></sec:authorize>
				</li>
				<li style="float: right;margin-right: 20px;"><sec:authorize ifAnyGranted="TMS_F_EXM_IMPORT"><a href="../bonus/upload"
					class="btnsearch" style="float: right;width:80px;" id="input" >导入考核明细</a></sec:authorize>
				</li>
				<li style="float: right;margin-right: 20px;"><sec:authorize ifAnyGranted="TMS_F_EXM_VERIFY"><a href="javascript:void(0);"
					class="btnsearch" style="float: right;width:80px;" id="batch-check" onclick="batchCheck();">批量审核通过</a></sec:authorize>
				</li>
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

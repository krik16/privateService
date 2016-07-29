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
<link href="${ctx}/css/index.css" type="text/css" rel="stylesheet" />
<link href="${ctx}/js/util/bootstrap/bootstrap.css" rel="stylesheet"
	type="text/css" />

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
<script src="${ctx}/js/finance/sales_commission-edit.js" type="text/javascript"></script>
<script src="${ctx}/js/jquery/jquery.poshytip.min.js" type="text/javascript"></script>



<script type="text/javascript" src="${ctx}/js/fancyBox/source/jquery.fancybox.js?v=2.1.5"></script>
	<link rel="stylesheet" type="text/css" href="${ctx}/js/fancyBox/source/jquery.fancybox.css?v=2.1.5" media="screen" />

	<!-- Add Button helper (this is optional) -->
	<link rel="stylesheet" type="text/css" href="${ctx}/js/fancyBox/source/helpers/jquery.fancybox-buttons.css?v=1.0.5" />
	<script type="text/javascript" src="${ctx}/js/fancyBox/source/helpers/jquery.fancybox-buttons.js?v=1.0.5"></script>

<style type="text/css">
</style>
</head>
<body>
	<div class="memSuper">
		<div class="memSuper-title">财务管理>返佣审核</div>
		<div class="memSuper-main">
		
			<div style="font-size: 16px;">
				<a class="change-color" id="uncheck" href="javascript:void(0);"
					onclick="switchCheck(2)">待审核</a>| <a class="now"
					href="javascript:void(0);" id="checked" onclick="switchCheck('-2,3')">已审核</a>
				| <a class="now" href="javascript:void(0);" id="overLimit" onclick="switchCheck(5)">超出上限</a>
			</div>
			 <div class="search" style="height: 60px;">
			<div class="memSuper-search" style="height: 130px; width: 100%">

				<input type="hidden" value="1" name="pageNo" id="currpage"/>
					<input type="hidden" value="2" id="isChecked" />
				<ul>
				<li>返佣流水号:<input type="text" id="liushui-no"/>
				</li>
				<li>渠道:
					<select id="guideType"  style="width: 90px">
						<option value="">--全部--</option>
						<option value="1">商家</option>
						<option value="2">买手</option>
					</select>
				</li>
				
				<li class="xiala">商场：<input type="text" name='mallid' class="detail"/>
				</li>
				
				<li class="xiala">店铺：<input type="text" name="shopid" class="detail"/>
				</li>
				
				<li>卖家姓名：<input id="name" type="text" class="detail"/>
				</li>
				</li>
				
				<li id="checkLi" style="display:none;">审核：
				<select id="hadChecked" style="width: 100px">
						<option value="0">--全部--</option>
						
						<option value="3,4,5,6">已通过</option>
						<option value="-2">未通过</option>
				</select>
				</li>
				<li id="vaStatusLi" style="display:none;">返佣状态：
				<select id="vaStatus" style="width: 100px">
						<option value="">--全部--</option>
						<option value="6">已到账</option>
						<option value="-2,-1,0,1,2,3,4,5">未到账</option>
				</select>
				</li>
				
				<a id="tt1" class="fancybox-buttons" data-fancybox-group="button" href=""><img width="50" height="50" style="display:none;" src="${ctx}/images/icon_1.png" alt="点击放大" /></a>
				<li>小票上传时间段:
			
					<input name="start" type="text" value="" class="min bg2 startTime" id="payStartTime"/>
						<span style="margin: 0 -55px 0 -15px">至</span>  
					<input name="end" type="text" value="" class="min bg2 endTime" id="payEndTime"  style="margin-right: 10px;"/> 
				</li>
				
				<li>返佣金额：
					<input type="text" id="jine-start"/>
						<span style="margin: 0 -55px 0 -15px">至</span> 
					<input type="text" id="jine-end"/>
				</li>
				<li><a href="javascript:void(0);" class="btnsearch"
					id="search">查询</a> 
				</li>
				<li>
				<sec:authorize ifAnyGranted="TMS_F_SC_VERIFY" >
					<a href="javascript:void(0);" class="btnsearch" style="border:0px;float: right;width: 100px" id="batch-check" onclick="batchCheck();" >批量审核通过</a></sec:authorize>
				</li>
					</ul>
				<%-- <a href="javascript:void(0);" class="btnsearch" style="border:0px;float: right;width: 100px" onclick="payingNow();" >立即打款</a> --%>
			</div>
			</div>
		</div>
		<div id="resultList" class="memSuper-list member-search-list">
			<input <%--id="currpage"--%> type="hidden" name="currpage"
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

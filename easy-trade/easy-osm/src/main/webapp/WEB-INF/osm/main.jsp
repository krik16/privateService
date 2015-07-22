<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/common/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>OSM HOME</title>
<script src="${ctx}/js/jquery.js" type="text/javascript"></script>
<script src="${ctx}/js/jquery-ui.js" type="text/javascript"></script>
<script src="${ctx}/js/util.js" type="text/javascript"></script>
<script src="${ctx}/js/msgBoxBg.js" type="text/javascript"></script>
<link href="${ctx}/css/jquery-ui.css" type="text/css" rel="stylesheet" />
<link href="${ctx}/css/jquery.timepicker.css" type="text/css"
	rel="stylesheet" />
<!-- 日期控件css -->
<link href="${ctx}/css/ui.fancytree.css" type="text/css"
	rel="stylesheet" />
<!-- 树状插件css-->
<link href="${ctx}/css/index.css" type="text/css" rel="stylesheet" />
<script type="text/javascript">
	$.ajaxSetup({
		cache : false
	});

	function save() {
		var orderNo = $("#orderNo").val();
		var paramsJson_ = {};

		if ($.trim(orderNo) == "") {
			_util.cmsTip("参数不能为空!");
			return false;
		} else {
			paramsJson_['orderNo'] = orderNo;
		}

		var url_ = "./osm/order_query";
		_util.ajaxSubmit(url_, paramsJson_, function(data) {
			if (data.status == 1) {
				var tableStr = "";
/* 				for (var i = 0; i < data.info.length; i++) {
					tableStr += "<tr><td>" + data.info[i].text + "</td><td>"
							+ data.info[i].value + "</td></tr>";
				} */
				var hehe = data.info;
				for(col in hehe){
					tableStr += "<tr><td>" + col + "</td><td>"
					+ data.info[col] + "</td></tr>";
				}
				document.getElementById("resultTable").innerHTML = tableStr;
			} else {
				_util.cmsTip(data.msg);
			}
		});
	}
</script>

</head>
<body>
	Welcome to OSM! _(:3 」∠)_

	<div class="shopSelectList1" id="shopSelectList1">
		<table width="100%" border="0" cellspacing="0" cellpadding="0" id="resultTable">
		</table>
	</div>

	<div class="shops">
		<div class="shops-main">
			<div class="shopsName">Order No：</div>
			<div class="shopsData">
				<input type="text" id="orderNo" name="orderNo" class="max-input"
					value="">
			</div>
			<div class="shopsButton" style="width: 505px">
				<a href="#" onclick="save();" class="Button checked">确认</a>
			</div>
		</div>
	</div>
	
	<div class="MsgBoxBg"></div>
	<div class="MsgBoxConfirm">
		<div class="MsgBoxTitle">提示</div>
		<div class="MsgBoxMain">
			<p></p>
			<a href="javascript:;" class="Button cancel">取消</a> <a
				href="javascript:void(0);" class="Button checked" id="MsgBoxBtn">确定</a>
		</div>
	</div>

	<div class="MsgBoxTip">
		<div class="MsgBoxTitle">提示</div>
		<div class="MsgBoxMain">
			<p></p>
			<sec:authorize ifAnyGranted="CMC_INTEGRAL_EDIT,CMC_INTEGRAL">
				<a style="margin: 0 auto; display: block; float: none;"
					href="javascript:;" class="Button checked" id="MsgBoxTipBtn">确定</a>
			</sec:authorize>
		</div>
	</div>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/_include/_jsp_tags.jsp"%>
<%@include file="/_include/_jsp_variable.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>容易会员管理后台</title>
<link href="${ctx}/css/jquery-ui.css" type="text/css" rel="stylesheet" />
<link href="${ctx}/css/jquery.timepicker.css" type="text/css" rel="stylesheet" /> <!-- 日期控件css -->
<link href="${ctx}/css/index.css" type="text/css" rel="stylesheet" />
<link href="${ctx}/js/util/bootstrap/bootstrap.css"rel="stylesheet" type="text/css" />

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
<script src="${ctx}/js/mm/member-search.js" type="text/javascript"></script>
<script src="${ctx}/js/util/util.js" type="text/javascript"></script>
<style type="text/css">
body{
	background: #fff;
}
</style>
<script type="text/javascript">
$(function(){
	var _SearchExactMain= $(".memSuper-search-exact-main");
	var _btnNext = $("#btnNext");

	_btnNext.toggle(
		function(){
			_SearchExactMain.show();
			_btnNext.addClass("bg");
		},
		function(){
			_SearchExactMain.hide();
			_btnNext.removeClass("bg");
		}
	);
	
// 	_SearchExactMain.show();//调试的时候用用，结束了删除掉
})
</script>
</head>
<body>
<div class="memSuper">
	<div class="memSuper-title">会员管理 > 会员搜索
	</div>
	<div class="memSuper-main">
		<%--<c:if test="${sessionScope.token.type == sessionScope.token.typeSuper}">
			<div class="memSuper-search">
				<span>商场搜索</span>
				 <c:if test="${not empty sessionScope.token.mallName}">
					<span class="span1">${area}--${sessionScope.token.mallName}</span><a href="#" class="c-green show-search-txt">切换</a>
					<input type="text" id="super-admin-search-mall" value="" currentMallId="" style="display:none"/>
				</c:if>
				<c:if test="${empty sessionScope.token.mallName}">
					<input type="text" id="super-admin-search-mall" value="" currentMallId=""/>
				</c:if> 
			</div>
		</c:if>--%>
<!-- 			<div class="memSuper-search"> -->
<!-- 				<span>商场搜索</span> -->
<!-- 				<span class="span1">北京--王府井</span><a href="#" class="c-green">切换</a> -->
<%-- 				<input type="text" id="super-admin-search-mall" value="${currentMallName}" currentMallId="${currentMallId}"/> --%>
<!-- 			</div> -->
		<div class="memSuper-search">
			<span class="currentMallId" currentMallId="${currentMallId}">全局搜索</span>
			<input class="max search-keyword" type="text" placeholder="会员名称/会员手机号/会员编号/会员性别" />
			<a href="#" class="btnsearch">搜索</a>
		</div>

		<div class="memSuper-search-exact">
			<form action="#" class="_exact_form" id="_exact_form" name="_exact_form">
			<div class="memSuper-search-exact-title">
				<span>精确查找</span>
				<a href="#" id="btnNext"></a>
			</div>
			<div class="memSuper-search-exact-main">
				<table class="searchExact" width="100%" border="0" cellspacing="0" cellpadding="0">
					<tr>
						<td width="30"><input type="checkbox" class="_member_type" value="e"/></td>
						<td width="100">电子会员</td>
						<td width="30"><input type="checkbox" class="_member_type" value="s"/></td>
						<td width="100">实体会员</td>
						<td width="30"><input type="checkbox" class="_member_type" value="b"/></td>
						<td>绑定会员</td>
					</tr>
				</table>
				<table class="searchExact" width="100%" border="0" cellspacing="0" cellpadding="0">
					<tr>
						<td width="90">会员名称</td>
						<td width="215"><input class="max _member_name" type="text"/></td>
						<td width="90">会员手机号</td>
						<td width="215"><input class="max _member_mobile" type="text"/></td>
						<td>&nbsp;</td>
					</tr>
				</table>
				<table class="searchExact" width="100%" border="0" cellspacing="0" cellpadding="0">
					<tr>
						<td width="90">会员编号</td>
						<td width="215"><input class="max _member_no" type="text" /></td>
						<td width="90">性别</td>
						<td width="25"><input type="checkbox" name="_sex" class="_member_sex" value="M"/></td>
						<td width="60">男</td>
						<td width="16" style="text-align:center;">&nbsp;</td>
						<td width="25"><input type="checkbox" name="_sex" class="_member_sex" value="F"/></td>
						<td width="60">女</td>
						<td>&nbsp;</td>
					</tr>
				</table>
				<table class="searchExact" width="100%" border="0" cellspacing="0" cellpadding="0">
					<tr>
						<td width="90">会员生日</td>
						<td width="215">
							<div class="date-input">
								<input type="text" value="" class="bg _member_birthday max2" id="Date0"/>
							</div>
						</td>
						<td width="90">当前积分</td>
						<td width="88"><input class="min _member_integral_min" type="text" /></td>
						<td width="16" style="text-align:center;">-</td>
						<td width="90"><input class="min _member_integral_max" type="text" /></td>
						<td>&nbsp;</td>
					</tr>
				</table>
				<table class="searchExact" width="100%" border="0" cellspacing="0" cellpadding="0">
					<tr>
						<td width="90">首次交易时间</td>
						<td width="192">
							<div class="date-input">
								<input type="text" value="" class="bg _first_consume_time_start max2" id="Date"/>
							</div>
						</td>
						<td width="30" style="text-align:center;">至</td>
						<td width="215">
							<div class="date-input">
								<input type="text" value="" class="bg _first_consume_time_end max2" id="Date2"/>
							</div>
						</td>
						<td>&nbsp;</td>
						<td>&nbsp;</td>
					</tr>
				</table>
				<table class="searchExact" width="100%" border="0" cellspacing="0" cellpadding="0">
					<tr>
						<td width="90">最后交易时间</td>
						<td width="192">
							<div class="date-input">
								<input type="text" value="" class="bg _last_consume_time_start max2" id="Date3"/>
							</div>
						</td>
						<td width="30" style="text-align:center;">至</td>
						<td width="215">
							<div class="date-input">
								<input type="text" value="" class="bg _last_consume_time_end max2" id="Date4"/>
							</div>
						</td>
						<td>&nbsp;</td>
						<td width="95"><a href="#" class="btnsearchExact">在结果中查询</a></td>
					</tr>
				</table>
			</div>
			</form>
		</div>

		<div class="memSuper-list member-search-list">
			<table class="memSupertable" width="100%" border="0" cellspacing="0" cellpadding="0">
				<tr>
					<td>所属商场</td>
					<td>会员编号</td>
					<td>会员姓名</td>
					<td>可用积分</td>
					<td>联系方式</td>
					<td>会员性质</td>
					<td>首次交易时间</td>
				</tr>
			</table>
		</div>

	</div>
	
</div>
</body>
</html>

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
<link href="${ctx}/css/ui.fancytree.css" type="text/css" rel="stylesheet" />     <!-- 树状插件css-->
<link href="${ctx}/css/index.css" type="text/css" rel="stylesheet" />

<script src="${ctx}/js/jquery/jquery.js" type="text/javascript"></script>
<script src="${ctx}/js/jquery/jquery-ui.js" type="text/javascript"></script>
<!-- 日期控件js -->
<script src="${ctx}/js/jquery/jquery.jtimepicker.js" type="text/javascript"></script>
<script src="${ctx}/js/jquery/jquery-ui-timepicker-addon.js" type="text/javascript"></script>
<!-- 日期控件js end-->
<script src="${ctx}/js/jquery/jquery.nicescroll.js" type="text/javascript"></script>
<script src="${ctx}/js/jquery/jquery-ui-timepicker-zh-CN.js" type="text/javascript"></script>
<script src="${ctx}/js/index.js" type="text/javascript"></script>
<script>
$(function(){
	

});
</script>
</head>
<body>
<div class="top topH">
	<div class="top-main">
		<div class="top-left">
			<div class="logo"></div>
			<span><a href="${ctx}/main/index" target="_parent">容易会员管理系统</a>  |  
				<c:if test="${sessionScope.token.type == sessionScope.token.typeSuper}">
					容易网
				</c:if>
				<c:if test="${sessionScope.token.type == sessionScope.token.typeMall}">
					${sessionScope.token.mallName}
				</c:if>
			</span>
		</div>
		<div class="top-right">
			<span>${curdate}</span>
			<span>欢迎：${name} |  &nbsp;<a href="${ctx}/main/logout" target="_parent">注销</a></span>
		</div>
	</div>

</div>
<div class="memDetail-min-width">
	<div class="memDetail">
		<div class="memDetail-title">会员详情</div>
		<div class="memDetail-main">
			<div class="memDetail-main-left">
				<p>基本信息</p>
				<ul>
					<li class="name">所属商场</li>
					<li class="bar">|</li>
					<li class="data">${userDetailVO.mallName}</li>
					
					<li class="name">会员编号</li>
					<li class="bar">|</li>
					<li class="data">${userDetailVO.memberNo}</li>

					<li class="name">会员姓名</li>
					<li class="bar">|</li>
					<li class="data">${userDetailVO.name}</li>

					<li class="name">联系方式</li>
					<li class="bar">|</li>
					<li class="data">${userDetailVO.phone1}</li>

					<li class="name">注册时间</li>
					<li class="bar">|</li>
					<li class="data"><fmt:formatDate value="${userDetailVO.registrationTime}" pattern="yyyy/MM/dd HH:mm:ss" /></li>

					<li class="name">会员生日</li>
					<li class="bar">|</li>
					<li class="data"><c:if test="${userDetailVO.birthYear != null && userDetailVO.birthYear != ''}">${userDetailVO.birthYear}/${userDetailVO.birthMonth}/${userDetailVO.birthDay}</c:if></li>

					<li class="name">实体积分</li>
					<li class="bar">|</li>
					<li class="data">${userDetailVO.entityIntegral}</li>

					<li class="name">电子积分</li>
					<li class="bar">|</li>
					<li class="data">${userDetailVO.electronicIntegral}</li>

					<li class="name">会员性别</li>
					<li class="bar">|</li>
					<li class="data">
						<c:if test="${not empty userDetailVO.sex}">
							${(userDetailVO.sex == 'M' || userDetailVO.sex == 'm') ? '男' : '女'}
						</c:if>
					</li>

					<li class="name">可用积分</li>
					<li class="bar">|</li>
					<li class="data">${userDetailVO.useIntegral}</li>

					<li class="name">会员性质</li>
					<li class="bar">|</li>
					<li class="data">
						<c:if test="${userDetailVO.memberNature == 1}">实体会员</c:if>
						<c:if test="${userDetailVO.memberNature == 2}">电子会员</c:if>
					</li>
				</ul>

			</div>
			<div class="memDetail-main-right">
				<p>积分兑换记录</p>
				<table class="memSupertable" width="100%" border="0" cellspacing="0" cellpadding="0">
					<tr>
						<td>兑换奖品</td>
						<td>所需积分</td>
						<td>兑换码</td>
						<td>兑换状态</td>
						<td>兑换时间</td>
					</tr>
					<c:if test="${exchangeRecords.dataList== null || fn:length(exchangeRecords.dataList) == 0}">
						<tr>
							<td colspan="5">暂无记录</td>
						</tr>
					</c:if>
					<c:forEach items="${exchangeRecords.dataList}" var="exchangeRecord">
						<tr>
							<td>${exchangeRecord.title}</td>
							<td>${exchangeRecord.exchangeIntegral*-1}</td>
							<td>${exchangeRecord.code}</td>
							<td>${exchangeRecord.status == 0 ? '未使用' : ''}${exchangeRecord.status == 2 ? '已领取' : ''}</td>
							<td><fmt:formatDate value="${exchangeRecord.exchangeDate}" pattern="yyyy/MM/dd" /></td>
						</tr>
					</c:forEach>
				</table>
				<c:if test="${exchangeRecords.dataList!= null && fn:length(exchangeRecords.dataList) != 0}">
				<div class="page">
					<a href="javascript:_jump();" class="page">跳转</a>
					<input type="text" class="jump-to-num" value="${exchangeRecords.currentPage}" onkeyup="this.value=this.value.replace(/\D/g,'')" />
					<c:if test="${exchangeRecords.currentPage < exchangeRecords.totalPage}">
						<a href="${contextPath}/mm/memberDetail.htm?memberNo=${memberNo}&currentPage=${exchangeRecords.currentPage+1}" class="icon-page"></a>
					</c:if>
					<c:if test="${exchangeRecords.currentPage >= exchangeRecords.totalPage}">
						<a href="${contextPath}/mm/memberDetail.htm?memberNo=${memberNo}&currentPage=${exchangeRecords.currentPage}" class="icon-page"></a>
					</c:if>
					<span>${exchangeRecords.currentPage}/${exchangeRecords.totalPage}</span>
					
					<c:if test="${exchangeRecords.currentPage > 1}">
						<a href="${contextPath}/mm/memberDetail.htm?memberNo=${memberNo}&currentPage=${exchangeRecords.currentPage-1}" currentPage="${exchangeRecords.currentPage-1}" class="icon-page-left"></a>
					</c:if>
					<c:if test="${exchangeRecords.currentPage <= 1}">
						<a href="${contextPath}/mm/memberDetail.htm?memberNo=${memberNo}&currentPage=1" currentPage="1" class="icon-page-left"></a>
					</c:if>
					
				</div>
				</c:if>
			</div>


	
		</div>

		<div class="shopsButton shopsButton_w_160">
<%-- 			<a href="${contextPath}/main/home.htm" class="Button">返回</a> --%>
			<a href="javascript:parent.window.opener=null;parent.window.open('','_self');parent.window.close();" class="Button">关闭</a>
		</div>
		
		
	</div>
</div>
<script type="text/javascript">
 var _totalPage = '${exchangeRecords.totalPage}';
 function _jump() {
	 var p = $('.jump-to-num').val();
	 if(parseInt(p) > parseInt(_totalPage)) {
		 p = _totalPage;
	 }else if(parseInt(p) <= 0) {
		 p = 1;
	 }
	 location.href='${contextPath}/mm/memberDetail.htm?memberNo=${memberNo}&currentPage='+p;
 }
</script>
</body>
</html>

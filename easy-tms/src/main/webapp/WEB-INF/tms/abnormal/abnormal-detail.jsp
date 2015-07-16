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
<link href="${ctx}/css/ui.fancytree.css" type="text/css"
	rel="stylesheet" />
<!-- 树状插件css-->
<link href="${ctx}/css/index.css" type="text/css" rel="stylesheet" />
<link href="${ctx}/css/index3.css" type="text/css" rel="stylesheet" />
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
<script>
	
</script>
</head>
<body>
	<div class="coupon-min-width">
		<div class="coupon">
			<div class="coupon-title">财务管理>异常支付详情</div>
			<form id="account_form" name="account_form" action="" method="post">
				<div class="coupon-main">
					<div class="coupon-new">
						<input type="hidden" name="id" class="accountId"
							value="<c:out value='${abnormal.id}'/>"> </input>
						<div class="coupon-new-title">异常支付详情</div>
						<div class="w_100">
							<ul>
								<li class="li1">订单类型：</li>
								<li class="li2"><c:choose>
										<c:when test="${abnormal.paymentOrderType==0 }">商品订单</c:when>
										<c:when test="${abnormal.paymentOrderType==1 }">优惠券订单</c:when>
										<c:otherwise>其他</c:otherwise>
									</c:choose></li>
								<li class="li1">买家账号：</li>
								<li class="li2"><span class="msg">${abnormal.userAccount}</span>
								</li>
								<li class="li1">订单号：</li>
								<li class="li2">${abnormal.orderNo}</li>
								<li class="li1">打款方式：</li>
								<li class="li2"><c:choose>
										<c:when test="${abnormal.paymentType==0 }">支付宝</c:when>
										<c:when test="${abnormal.paymentType==1 }">银行卡</c:when>
										<c:otherwise>其他</c:otherwise>
									</c:choose></li>
								<li class="li1">审核：</li>
								<li class="li2"><c:choose>
										<c:when test="${abnormal.status==0 }">未审核</c:when>
										<c:when test="${abnormal.status==1 }">通过</c:when>
										<c:when test="${abnormal.status==-1 }">未通过</c:when>
									</c:choose></li>
								<c:choose>
									<c:when test="${abnormal.paymentType==0 }">
										<li class="li1">支付宝账号：</li>
									</c:when>
									<c:when test="${abnormal.paymentType==1 }">
										<li class="li1">银行卡账号：</li>
									</c:when>
									<c:otherwise>
										<li class="li1">账号：</li>
									</c:otherwise>
								</c:choose>
								<li class="li2">${abnormal.paymentAccount}</li>
								<c:choose>
									<c:when test="${abnormal.paymentType==0 }">
										<li class="li1">支付宝姓名：</li>
									</c:when>
									<c:when test="${abnormal.paymentType==1 }">
										<li class="li1">银行卡姓名：</li>
									</c:when>
									<c:otherwise>
										<li class="li1">账号姓名：</li>
									</c:otherwise>
								</c:choose>
								<li class="li2">${abnormal.paymentName}</li>
								<c:if test="${abnormal.paymentType==1}">
									<li class="li1">银行：</li>
									<li class="li2">${abnormal.paymentBank}</li>
								</c:if>
								<c:if test="${abnormal.status >= 0 }">
									<li class="li1">备注：</li>
									<li class="li2">${abnormal.remarks}</li>
								</c:if>
							</ul>
							<ul>
								<li class="li1"
									style="color: red; font-size: 16px; font-weight: bold;">金额：</li>
								<li class="li2"
									style="color: red; font-size: 16px; font-weight: bold;">${abnormal.amount}元</li>
							</ul>

						</div>
						<div style="color: red; font-size: 16px;">
							<c:if test="${abnormal.status<0 }">
								审核未通过理由：${abnormal.remarks }
							</c:if>
						</div>

					</div>
				</div>

				<div class="shopsButton">
					<a href="javascript:window.close()" class="Button">返回</a>
				</div>
			</form>
		</div>
	</div>
</body>
</html>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/_include/_jsp_tags.jsp"%>
<%@include file="/_include/_jsp_variable.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Frameset//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-frameset.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>交易管理系统</title>
<link href="${ctx}/css/jquery-ui.css" type="text/css" rel="stylesheet" />
<link href="${ctx}/css/index5.css" type="text/css" rel="stylesheet" />
<script src="${ctx}/js/jquery/jquery.js" type="text/javascript"></script>

</head>

<body>
<div class="content">
		<div class="mall-min-width">
		<div class="mallNew">
			<div class="mallNew-title">优惠券订单  >  订单详情</div>
			<div class="mallNew-main">
				<div class="mallNew-main-left">
					<ul>
						<li class="w_100 lvse size-14">买家信息</li>

						<li class="name">账号</li>
						<li class="line">|</li>
						<li class="data max2">${entity.userPhone}</li>
					</ul>
				</div>

				<div class="mallNew-main-left">
					<ul>
						<li class="w_100 lvse size-14"></li>

						<li class="name">昵称</li>
						<li class="line">|</li>
						<li class="data max2">${entity.userName}</li>
					</ul>
				</div>
			</div>

			<div class="mallNew-main">
				<div class="mallNew-main-left">
					<ul>
						<li class="w_100 lvse size-14">订单信息</li>

						<li class="name">订单号</li>
						<li class="line">|</li>
						<li class="data max2">${entity.orderNo}</li>
						<li class="name">下单时间</li>
						<li class="line">|</li>
						<li class="data max2"><fmt:formatDate value="${entity.createAt}" pattern="yyyy-MM-dd HH:mm:ss"/></li>
					</ul>
				</div>

				<div class="mallNew-main-left">
					<ul>
						<li class="w_100 lvse size-14"></li>

						<li class="name">订单状态</li>
						<li class="line">|</li>
						<li class="data max2">
							<c:choose>
								<c:when test="${entity.status == 0}"> 待付款     </c:when>
								<c:when test="${entity.status == 1}"> 已付款     </c:when>
								<c:when test="${entity.status == 2}"> 已取消     </c:when>
								<c:when test="${entity.status == 3}"> 已删除 </c:when>
								<c:when test="${entity.status == 4}"> 退款中</c:when>
								<c:when test="${entity.status == 5}"> 已退款 </c:when>
							</c:choose>
						</li>

						<li class="name">付款时间</li>
						<li class="line">|</li>
						<li class="data max2">
							<c:if test="${entity.payTime!=null}"><fmt:formatDate value="${entity.payTime}" pattern="yyyy-MM-dd HH:mm:ss"/></c:if>
							<c:if test="${entity.payTime==null}">--</c:if>
						</li>
					</ul>
				</div>
			</div>

			<div class="mallNew-main">
				<table class="accounttable max" width="100%" border="0" cellspacing="0" cellpadding="0">
					<tr>
						<td>优惠券名称</td>
						<td>有效期</td>
						<td>单价(元)</td>
						<td>数量</td>
						<td>总价(元)</td>
					</tr>
						<c:forEach var="item" items="${entity.couponList}">
							<tr>
								<td>${item.title }</td>
								<td><fmt:formatDate value="${item.validBeginDate }" pattern="yyyy-MM-dd HH:mm:ss"/>-<fmt:formatDate value="${item.validEndDate }" pattern="yyyy-MM-dd HH:mm:ss"/></td>
								<td>${item.originalPrice}</td>
								<td>${item.count}</td>
								<td>${item.realDiscount*item.count}</td>
							</tr>
						</c:forEach>
					</table>

				<p class="lvse m-b-10 m-t-10 size-14">抵用卡券信息</p>
				<table class="accounttable" width="100%" border="0" cellspacing="0" cellpadding="0">
					<tr>
						<td>卡券类型</td>
						<td>卡券名称</td>
						<td>有效期</td>
						<td>面值(元)</td>
						<td>抵扣金额(元)</td>
					</tr>

					<tr>
						<c:choose>
							<c:when test="${entity.hbList}">
								<c:forEach var="item" items="${entity.hbList}" varStatus="status">
									<tr>
										<td>现金券</td>
										<td>${item.title }</td>
										<td>${item.validBeginDate } - ${item.validEndDate }</td>
										<td>${item.discount }</td>
										<td>${item.realDiscount }</td>
									</tr>
								</c:forEach>
							</c:when>
							<c:otherwise>
								<tr>
									<td style="text-align: center;" colspan="9">暂无记录</td>
								</tr>
							</c:otherwise>
						</c:choose>
					</tr>
				</table>
			</div>

			<div class="mallNew-main">
				<div class="mallNew-main-left">
					<ul>
						<li class="w_100 lvse size-14">抵用积分</li>
						
						<li class="name">抵扣积分</li>
						<li class="line">|</li>
						<li class="data max2">
							<c:if test="${entity.score==null }">0</c:if>
							<c:if test="${entity.score!=null }">${entity.score }</c:if>
						</li>
					</ul>
				</div>
			</div>
					<div class="shopsButton shopsButton_w_160">
						<a href="javascript:window.top.close()" class="Button">关闭</a>
					</div>

			</div>
	</div>

</div>

</body>
</html>

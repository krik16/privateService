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
			<div class="mallNew-title">商品订单  >  订单详情</div>
			<div class="mallNew-main">
				<div class="mallNew-main-left">
					<ul>
						<li class="w_100 lvse size-14">订单信息</li>
						<li class="name">母订单号</li>
						<li class="line">|</li>
						<li class="data max2">${order.orderCartNo }</li>

						<li class="name">子订单号</li>
						<li class="line">|</li>
						<li class="data max2">${order.orderNum }</li>

						<li class="name">下单时间</li>
						<li class="line">|</li>
						<li class="data max2">${order.commitOrderTime}</li>

						<li class="name">发货时间</li>
						<li class="line">|</li>
						<li class="data max2">
							<c:if test="${order.deliverTime!=null}">${order.deliverTime}</c:if>
							<c:if test="${order.deliverTime==null}">--</c:if>
						</li>

						<li class="name">收货时间</li>
						<li class="line">|</li>
						<li class="data max2">
							<c:if test="${order.receiveTime!=null}">${order.receiveTime}</c:if>
							<c:if test="${order.receiveTime==null}">--</c:if>
						</li>

						<li class="name">支付方式</li>
						<li class="line">|</li>
						<li class="data max2">
							<c:choose>
								<c:when test="${order.payChannel==1 or order.payChannel==3 }">支付宝</c:when>
								<c:when test="${order.payChannel==5 }">微信</c:when>
								<c:otherwise>--</c:otherwise>
							</c:choose>
						</li>

					</ul>
				</div>

				<div class="mallNew-main-left">
					<ul>
						<li class="w_100 lvse size-14"></li>

						<li class="name">订单状态</li>
						<li class="line">|</li>
						<li class="data max2">
							<c:choose>
								<c:when test="${order.parentOrderStatus == 1}"> 未付款     </c:when>
								<c:when test="${order.parentOrderStatus == 2}"> 待发货     </c:when>
								<c:when test="${order.parentOrderStatus == 3}"> 已发货 （<span class="lvse">发货人：${order.userName }</span>） </c:when>
								<c:when test="${order.parentOrderStatus == 4}"> 已完成 （<span class="lvse">发货人：${order.userName }</span>） </c:when>
								<c:when test="${order.parentOrderStatus == 5}"> 已关闭 （<span class="lvse">发货人：${order.userName }</span>） </c:when>
								<c:when test="${order.parentOrderStatus == 8}"> 已退款   	</c:when>
							</c:choose>
						</li>

						<li class="name">付款时间</li>
						<li class="line">|</li>
						<li class="data max2">
							<c:if test="${order.payTime!=null}">${order.payTime}</c:if>
							<c:if test="${order.payTime==null}">--</c:if>
						</li>

						<li class="name">发货方式</li>
						<li class="line">|</li>
						<li class="data max2">
							<c:if test="${order.receiveType==0 }" >快递（<span style="color: red">${order.expressName }【${order.expressBillId }】</span>）</c:if>
							<c:if test="${order.receiveType==1 }" >无需快递</c:if>
						</li>

						<li class="name">支付流水号</li>
						<li class="line">|</li>
						<li class="data max2">${order.paymentIdList }</li>

						<li class="name">券码</li>
						<li class="line">|</li>
						<li class="data max2">${order.couponCodes }</li>
					</ul>
				</div>
			</div>

			<div class="mallNew-main">
				<table class="accounttable max" width="100%" border="0" cellspacing="0" cellpadding="0">
					<tr>
						<td>商品图片</td>
						<td>商品</td>
						<td>商品规格</td>
						<td>单价（元）</td>
						<td>数量</td>
						<td>商品总价（元）</td>
						<td>折扣抵扣（元）</td>
						<td>红包</td>
						<td>平台促销券（元）</td>
						<td>容颜值抵扣（元）</td>
						<td>商品实收（元）</td>
					</tr>
					<c:forEach var="sonOrder" items="${order.sonOrderList }" >
						<tr>
						<td>
							<div class="pic ">
								<img src="${sonOrder.commodityPic }">
							</div>
						</td>
						<td><a href="${ctx }/orderManager/commodityDetail?commodityId=${sonOrder.commodityId }&shopId=&currpage=1" style="text-decoration:underline" target="_parent">${sonOrder.commodityName }</a>
							<br>
							商品编码：${sonOrder.commodityNo }
						</td>
						<td>
							<c:forEach var="specColumnValue" items="${sonOrder.specColumnValues }" >
								${specColumnValue.columnName }:${specColumnValue.columnValue } &nbsp;
							</c:forEach>
						</td>
						<td>${sonOrder.commodityCurrentPrice }</td>
						<td>${sonOrder.num }</td>
						<td>${sonOrder.commodityAmount }</td>
						<td>${sonOrder.commodityDiscount }</td>
						<td>${sonOrder.hbDiscount }</td>
						<td>${sonOrder.voucherDiscount }</td>
						<td>${sonOrder.integralDiscount }</td>
						<td>
							<c:choose>
								<c:when test="${orderForm.status==1 or orderForm.status==5}"> 0.00 </c:when>
								<c:otherwise>${sonOrder.realAmount }</c:otherwise>
							</c:choose>
						</td>
						</tr>
					</c:forEach>
				</table>

			</div>

			<div class="mallNew-main">
				<div class="mallNew-main-left">
					<%--<ul>
						<li class="w_100 lvse size-14">抵用积分</li>

						<li class="name">抵扣积分</li>
						<li class="line">|</li>
						<li class="data max2">
							<c:if test="${order.score==null }">0</c:if>
							<c:if test="${order.score!=null }">${order.score }</c:if>
						</li>
					</ul>--%>

					<ul>
						<li class="w_100 lvse size-14">订单信息</li>

						<li class="name">商品合计总价</li>
						<li class="line">|</li>
						<li class="data max2">
							<c:choose>
								<c:when test="${(commidityTotalPice - order.discountFee)<0}">0.00（元）</c:when>
								<c:otherwise>${commidityTotalPice - order.discountFee}（元）</c:otherwise>
							</c:choose>
						</li>

						<li class="name">运费</li>
						<li class="line">|</li>
						<li class="data max2">${order.commodityPostage }（元）</li>

						<li class="name">折扣抵扣</li>
						<li class="line">|</li>
						<li class="data max2">${order.discountFee }（元）</li>

						<li class="name">订单总价</li>
						<li class="line">|</li>
						<li class="data max2">
							<c:choose>
								<c:when test="${(commidityTotalPice - order.discountFee)<0}">${order.commodityPostage }（元）</c:when>
								<c:otherwise>${commidityTotalPice - order.discountFee + order.commodityPostage}（元）</c:otherwise>
							</c:choose>
						</li>

						<li class="name">卡券抵扣金额</li>
						<li class="line">|</li>
						<li class="data max2">${0-discountTotal }（元）</li>

						<li class="name">积分抵扣金额</li>
						<li class="line">|</li>
						<li class="data max2">
							<c:if test="${order.scoreDeduction==null }">0.00</c:if>
							<c:if test="${order.scoreDeduction!=null }">${0-order.scoreDeduction }</c:if>（元）
						</li>

						<li class="name">买家实付金额</li>
						<li class="line">|</li>
						<li class="data max2">${order.payAmount }（元）</li>
					</ul>
				</div>
			</div>

			<div class="mallNew-main">
				<div class="mallNew-main-left">
					<ul>
						<li class="w_100 lvse size-14">卖家信息</li>

						<li class="name">商场</li>
						<li class="line">|</li>
						<li class="data max2">
							<c:choose>
								<c:when test="${order.guideType==2 }"></c:when>
								<c:otherwise>${order.mallName }</c:otherwise>
							</c:choose>
						</li>

						<li class="name">卖家联系方式</li>
						<li class="line">|</li>
						<li class="data max2">${order.userPhone }</li>

						<li class="name">卖家姓名</li>
						<li class="line">|</li>
						<li class="data max2">${order.userName }</li>
					</ul>
				</div>

				<div class="mallNew-main-left">
					<ul>
						<li class="w_100 lvse size-14"></li>

						<li class="name">店铺</li>
						<li class="line">|</li>
						<li class="data max2">${order.shopName }</li>

						<li class="name">卖家昵称</li>
						<li class="line">|</li>
						<li class="data max2">${order.nickName }</li>

						<li class="name">渠道</li>
						<li class="line">|</li>
						<li class="data max2" style="line-height: 17px">
							<c:if test="${order.guideType==1 }">商家<c:if test="${order.liveName!=null}">（<span style="color:red" >直播：${order.liveName}</span>）</c:if></c:if>
							<c:if test="${order.guideType==2 }">买手<c:if test="${order.liveName!=null}">（<span style="color:red">直播：${order.liveName}</span>）</c:if></c:if>
						</li>
					</ul>
				</div>
			</div>
			<div class="mallNew-main">
				<div class="mallNew-main-left">
					<ul>
						<li class="w_100 lvse size-14">买家信息</li>

						<li class="name">账号</li>
						<li class="line">|</li>
						<li class="data max2">${order.buyerPhone }</li>

						<li class="name">收货人姓名</li>
						<li class="line">|</li>
						<li class="data max2">${order.consignee }</li>

						<li class="name">收货人地址</li>
						<li class="line">|</li>
						<li class="data max2">${order.address }</li>

						<li class="name">备注</li>
						<li class="line">|</li>
						<li class="data max2">${order.comment }</li>
					</ul>
				</div>

				<div class="mallNew-main-left">
					<ul>
						<li class="w_100 lvse size-14"></li>

						<li class="name">昵称</li>
						<li class="line">|</li>
						<li class="data max2">${order.buyerNickName }</li>

						<li class="name max">收货人联系方式</li>
						<li class="line">|</li>
						<li class="data max2">${order.phone }</li>
					</ul>
				</div>
			</div>

				<c:choose>
					<c:when test="${type eq 'tradeDetail'}">
						<div class="shopsButton shopsButton_w_160">
							<a href="javascript:history.go(-1);" target="_parent" class="Button checked" id="returnButton">返回</a>
						</div>
					</c:when>
					<c:otherwise>
						<div class="shopsButton shopsButton_w_160">
							<a href="javascript:window.top.close()" class="Button">关闭</a>
						</div>
					</c:otherwise>
				</c:choose>
			</div>
	</div>

</div>

</body>
</html>

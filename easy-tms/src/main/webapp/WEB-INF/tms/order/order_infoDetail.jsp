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
						<li class="w_100 lvse size-14">卖家信息</li>

						<li class="name">商场</li>
						<li class="line">|</li>
						<li class="data max2">${order.mallName }</li>

						<li class="name">昵称</li>
						<li class="line">|</li>
						<li class="data max2">${order.nickName }</li>

						<li class="name">联系方式</li>
						<li class="line">|</li>
						<li class="data max2">${order.userPhone }</li>
					</ul>
				</div>

				<div class="mallNew-main-left">
					<ul>
						<li class="w_100 lvse size-14"></li>

						<li class="name">店铺</li>
						<li class="line">|</li>
						<li class="data max2">${order.shopName }</li>

						<li class="name">真实姓名</li>
						<li class="line">|</li>
						<li class="data max2">${order.userName }</li>
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

			<div class="mallNew-main">
				<div class="mallNew-main-left">
					<ul>
						<li class="w_100 lvse size-14">订单信息</li>

						<li class="name">订单号</li>
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

						<li class="name">快递公司</li>
						<li class="line">|</li>
						<li class="data max2">${order.expressName }</li>
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
								<c:when test="${order.parentOrderStatus == 3}"> 已发货  （<span class="lvse">发货人：${order.userName }</span>）   </c:when>
								<c:when test="${order.parentOrderStatus == 4}"> 确认收货 （<span class="lvse">发货人：${order.userName }</span>） </c:when>
								<c:when test="${order.parentOrderStatus == 6}"> 已完成  （<span class="lvse">发货人：${order.userName }</span>） </c:when>
								<c:when test="${order.parentOrderStatus == 5}"> 已关闭    （<span class="lvse">发货人：${order.userName }</span>） </c:when>
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
							<c:if test="${order.receiveType==0 }" >快递</c:if>
							<c:if test="${order.receiveType==1 }" >无需快递</c:if>
						</li>

						<li class="name">快递单号</li>
						<li class="line">|</li>
						<li class="data max2">${order.expressBillId }</li>
					</ul>
				</div>
			</div>

			<div class="mallNew-main">
				<table class="accounttable max" width="100%" border="0" cellspacing="0" cellpadding="0">
					<tr>
						<td>商品图片</td>
						<td>商品名称</td>
						<td>商品规格</td>
						<td>子状态</td>
						<td>单价（元）</td>
						<td>数量</td>
						<td>商品总价（元）</td>
					</tr>
					<c:forEach var="sonOrder" items="${order.sonOrderList }" >
						<tr>
						<td>
							<div class="pic ">
								<img src="${sonOrder.commodityPic }">
								<!-- <a href="#" class="icon_close"></a> -->
							</div>
						</td>
						<td><a href="${ctx }/orderManager/commodityDetail?commodityId=${sonOrder.commodityId }&shopId=&currpage=1" target="_parent">${sonOrder.commodityName }</a></td>
						<td>
							<c:forEach var="specColumnValue" items="${sonOrder.specColumnValues }" >
								${specColumnValue.columnName }:${specColumnValue.columnValue } &nbsp;
							</c:forEach>
						</td>
						<td>
							<c:choose>
								<c:when test="${sonOrder.sonOrderStatus == 0}">
									<c:choose>
										<c:when test="${order.parentOrderStatus == 1}"> 未付款      </c:when>
										<c:when test="${order.parentOrderStatus == 2}"> 待发货      </c:when>
										<c:when test="${order.parentOrderStatus == 3}"> 已发货      </c:when>
										<c:when test="${order.parentOrderStatus == 4}"> 确认收货   </c:when>
										<c:when test="${order.parentOrderStatus == 6}"> 已完成  </c:when>
										<c:when test="${order.parentOrderStatus == 5}"> 已关闭       </c:when>
									</c:choose>
								</c:when>
								<c:when test="${sonOrder.sonOrderStatus == 2}"> 待退款     </c:when>
								<c:when test="${sonOrder.sonOrderStatus == 3}"> 已关闭    </c:when>
								<c:when test="${sonOrder.sonOrderStatus == 4}"> 维权中 </c:when>
							</c:choose>
						</td>
						<td>${sonOrder.commodityCurrentPrice }</td>
						<td>${sonOrder.num }</td>
						<td>${sonOrder.commodityCurrentPrice * sonOrder.num }</td>
						</tr>
					</c:forEach>
				</table>

				<p class="lvse m-b-10 m-t-10 size-14">抵用卡卷信息</p>
				<table class="accounttable" width="100%" border="0" cellspacing="0" cellpadding="0">
					<tr>
						<td>卡卷类型</td>
						<td>卡卷名称</td>
						<td>有效期</td>
						<td>面值（元）</td>
						<td>抵扣金额（元）</td>
					</tr>

					<tr>
						<c:choose>
							<c:when test="${not empty cashCoupons}">
								<c:forEach var="item" items="${cashCoupons}" varStatus="status">
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
					<!-- <tr>
						<td>现金券</td>
						<td>抵扣60元</td>
						<td>2015/05/01 17:45 - 2015/05/02 17:45</td>
						<td>60</td>
					</tr> -->
				</table>
			</div>

			<div class="mallNew-main">
				<div class="mallNew-main-left">
					<ul>
						<li class="w_100 lvse size-14">订单信息</li>

						<li class="name">商品实际总价</li>
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
						<li class="data max2">${discountTotal }（元）</li>

						<li class="name">积分抵扣金额</li>
						<li class="line">|</li>
						<li class="data max2">--（元）</li>
						
						<li class="name">买家应付金额</li>
						<li class="line">|</li>
						<li class="data max2">${order.totalPrice }（元）</li>
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

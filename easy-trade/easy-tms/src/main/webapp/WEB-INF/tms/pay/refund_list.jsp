<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="../common/tag.jsp"%>
<div class="shopSelectList" id="commodityCategoryList">
	<input id="rowCont" type="hidden" name="rowCont" value="<c:out value='${rowCont}'/>" /> 
	<input id="jumpPage" type="hidden" name="jumpPage">
	<table width="100%" border="0" cellspacing="0" cellpadding="0">
		<tr>
		 <td style="text-align: center;"><input type="checkbox" id="select-all" onclick="selectAll()"/></td>
			<td>付款单号</td>
			<td>订单号</td>
			<td>渠道</td>
			<td>申请退款时间</td>
			<td>打款方式</td>
			<td>商场</td>
			<td>店铺</td>
			<td>买家账号</td>
			<td>买家姓名</td>
			<td>退款金额</td>
			<td>操作</td>
		</tr>
		<c:choose>
			<c:when test="${not empty list}">
				<c:forEach var="item" items="${list}" varStatus="status">
					<tr>
						<td style="text-align: center;"><input type="checkbox" name="subBox" id="${item.id}" payChannel="${item.payChannel}" ></td>
						<td>${item.payNo}</td>
						<c:choose>
							<c:when test="${item.orderType eq 0}">
								<td><a href="${ctx}/orderManager/orderInfo?orderId=${item.orderId}&userId=${item.orderUserId}&module=order&type=tradeDetail" target="_parent"  style="text-decoration:underline" >${item.orderNo}</a></td>
							</c:when>
							<c:otherwise>
								<td>${item.orderNo}</a></td>
							</c:otherwise>
						</c:choose>
						<c:choose>
							<c:when test="${item.guideType eq 1}">
								<td>商家</td>
							</c:when>
							<c:when test="${item.guideType eq 2}">
								<td>买手</td>
							</c:when>
							<c:otherwise><td></td></c:otherwise>
						</c:choose>
						<td><fmt:formatDate value="${item.orderTime}" pattern="yyyy-MM-dd HH:mm:ss"/></td>
						<c:choose>
						<c:when test="${item.payChannel eq 0}">
							<td>支付宝</td>
						</c:when>
						<c:when test="${item.payChannel eq 1}">
							<td>微信</td>
						</c:when>
						<c:otherwise><td>一行卡</td></c:otherwise>
						</c:choose>
						<td>${item.mallName}</td>
						<td>${item.shopName}</td>
						<td>${item.buyerAccount}</td>
						<td>${item.buyerName}</td>
						<td>${item.orderPrice}</td>
						<c:choose>
						<c:when test="${item.payChannel eq 0}">
							<td><sec:authorize ifAnyGranted="TMS_F_PAY" ><a onclick="morePay(${item.id},2, ${item.payChannel})" class="btnsearch" id="pay-button" target="_blank">付款</a></sec:authorize></td>
						</c:when>
						<c:otherwise>
							<td><a href="javascript:void(0);" class="btnsearch checked" id="weixin-refund-button" onclick="weixinRefund(${item.id},${item.refundRejected})">退款</a>
							<c:choose>
								<c:when test="${item.refundRejected eq 0}">
									<a href="javascript:void(0);" class="btnsearch checked" id="weixin-refund-rejected-button" onclick="weixinRefundRejected(${item.id},1)">拒绝</a>
								</c:when>
								<c:otherwise>
									<a href="javascript:void(0);" class="btnsearch checked" id="weixin-refund-agree-button" onclick="weixinRefundRejected(${item.id},0)">同意</a>
								</c:otherwise>
							</c:choose>
						</c:otherwise>
						</c:choose>
						</td>
			 		</td>
					</tr>
				</c:forEach>
			</c:when>
			<c:otherwise>
				<tr>
					<td style="text-align: center;" colspan="12">暂无记录</td>
				</tr>
			</c:otherwise>
		</c:choose>
	</table>
</div>
<%@ include file="../footer.jsp"%>
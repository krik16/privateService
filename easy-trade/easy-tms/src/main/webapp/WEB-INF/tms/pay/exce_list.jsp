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
			<td>申请退款时间</td>
			<td>打款方式</td>
			<td>商场</td>
			<td>店铺</td>
			<td>买家账号</td>
			<td>买家姓名</td>
			<td>异常交易金额</td>
			<td>操作</td>
		</tr>
		<c:choose>
			<c:when test="${not empty list}">
				<c:forEach var="item" items="${list}" varStatus="status">
					<tr>
						<c:choose>
							<c:when test="${item.rePay}">
								<td style="text-align: center;"><input type="checkbox" name="subBox" id="${item.id}"  payChannel="${item.payChannel}"></td>
							</c:when>
							<c:otherwise>
								<td style="text-align: center;"><input type="checkbox" name="subBox" id="${item.id}" payChannel="${item.payChannel}" disabled="disabled"></td>
							</c:otherwise>
						</c:choose>

						<td>${item.payNo}</td>
						<c:choose>
							<c:when test="${item.orderType eq 0}">
								<td><a href="${ctx}/orderManager/orderInfo?orderId=${item.orderId}&userId=${item.orderUserId}&module=order&type=tradeDetail" target="_parent"  style="text-decoration:underline" >${item.orderNo}</a></td>
							</c:when>
							<c:otherwise><td>${item.orderNo}</td></c:otherwise>
						</c:choose>
						<td><fmt:formatDate value="${item.orderTime}" pattern="yyyy-MM-dd HH:mm:ss"/></td>
						<c:choose>
						<c:when test="${item.payChannel eq 0}">
							<td>支付宝</td>
						</c:when>
						<c:when test="${item.payChannel eq 1}">
							<td>微信</td>
						</c:when>
						<c:otherwise><td>银行卡</td></c:otherwise>	
						</c:choose>
						<td>${item.mallName}</td>
						<td>${item.shopName}</td>
						<td>${item.buyerAccount}</td>
						<td>${item.buyerName}</td>
						<td>${item.orderPrice}</td>

						<if test="${item.refundRejected == 0}">
							<c:choose>
								<c:when test="${item.rePay}">
									<td><sec:authorize ifAnyGranted="TMS_F_PAY" ><a onclick="morePay(${item.id},4, ${item.payChannel})"  class="btnsearch" id="pay-button" target="_blank">付款</a></sec:authorize>
								</c:when>
								<c:otherwise>
									<td><sec:authorize ifAnyGranted="TMS_F_PAY" ><button class="btn-class" disabled="disabled">付款</button></sec:authorize>
								</c:otherwise>
							</c:choose>
								<sec:authorize ifAnyGranted="TMS_F_PAY" ><a onclick="excePayCancel(${item.id},1)" class="btnsearch" id="cancePay" >取消</a></sec:authorize>
							</td>
						</if>
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
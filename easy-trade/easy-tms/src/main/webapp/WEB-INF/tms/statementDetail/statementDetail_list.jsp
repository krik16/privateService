<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="../common/tag.jsp"%>
<div class="shopSelectList" id="commodityCategoryList">
	<input id="rowCont" type="hidden" name="rowCont" value="<c:out value='${rowCont}'/>" /> 
	<input id="jumpPage" type="hidden" name="jumpPage">
	<table width="100%" border="0" cellspacing="0" cellpadding="0">
		<tr>
		 <td style="text-align: center;"><input type="checkbox" id="select-all" onclick="selectAll()"/></td>
			<td>账单批次号</td>
			<td>付款单号</td>
			<td>交易流水单号</td>
			<td>名称</td>
			<td>付款账号</td>
			<td>付款姓名</td>
			<td>结算方式</td>
			<td>付款金额</td>
			<td>付款时间</td>
		</tr>
		<c:choose>
			<c:when test="${not empty list}">
				<c:forEach var="item" items="${list}" varStatus="status">
					<tr>
						<td style="text-align: center;"><input type="checkbox" name="subBox" id="${item.id}"></td>
						<td>${item.batchNo}</td>
						<td>${item.payNo}</td>
						<td>${item.tradeNo}</td>
						<td>${item.bussinessName}</td>
						<td>${item.payAccount}</td>
						<td>${item.payName}</td>
						<td>
						<c:choose>
							<c:when test="${item.payChannel eq 1}">
								微信
							</c:when>
							<c:when test="${item.payChannel eq 2}">
								银联
							</c:when>
							<c:when test="${item.payChannel eq 3}">
								现金
							</c:when>
							<c:when test="${item.payChannel eq 4}">
								银行转账
							</c:when>
							<c:otherwise>
								支付宝
							</c:otherwise>
						</c:choose>
						</td>
						<td>${item.payTotal/100}</td>
						<td><fmt:formatDate value="${item.payTime}" pattern="yyyy-MM-dd HH:mm:ss"/></td>
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

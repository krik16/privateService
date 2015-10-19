<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="../common/tag.jsp"%>
<div class="shopSelectList" id="commodityCategoryList">
	<input id="rowCont" type="hidden" name="rowCont" value="<c:out value='${rowCont}'/>" /> 
	<input id="jumpPage" type="hidden" name="jumpPage">
	<table width="100%" border="0" cellspacing="0" cellpadding="0">
		<tr>
		  <td style="text-align: center;"><input type="checkbox" id="select-all" onclick="selectAll()"/></td>
			<td>提现流水号</td>
			<td>提现申请时间</td>
			<td>打款方式</td>
			<td>商场</td>
			<td>店铺</td>
			<td>卖家账号</td>
			<td>卖家姓名</td>
			<td>提现金额</td>
			<td>操作</td>
		</tr>
		<c:choose>
			<c:when test="${not empty list}">
				<c:forEach var="item" items="${list}" varStatus="status">
					<tr>
						<td style="text-align: center;"><input type="checkbox" name="subBox" class="subBox" id="${item.id}" payChannel="${item.payChannel}"></td>
						<td><a href="${ctx}/bs/detail?id=${item.drawApplyId}&module=merchant" target="_blank" style="text-decoration: underline;">${item.orderNo}</a></td>
						<td><fmt:formatDate value="${item.orderTime}" pattern="yyyy-MM-dd HH:mm:ss"/></td>
						<c:choose>
						<c:when test="${item.payChannel eq 0}">
							<td>支付宝</td>
						</c:when>
						<c:when test="${item.payChannel eq 1}">
							<td>微信</td>
						</c:when>
						<c:otherwise><td>银联</td></c:otherwise>	
						</c:choose>
						<td>${item.mallName}</td>
						<td>${item.shopName}</td>
						<td>${item.sellerAccount}</td>
						<td>${item.sellerName}</td>
						<td>${item.orderPrice}</td>
						<td><sec:authorize ifAnyGranted="TMS_F_PAY" ><a href="javascript:void(0);" onclick="validateAccount(${item.id},null,0,${item.payChannel})" class="btnsearch" id="pay-button" target="_blank">付款</a></sec:authorize></td>
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
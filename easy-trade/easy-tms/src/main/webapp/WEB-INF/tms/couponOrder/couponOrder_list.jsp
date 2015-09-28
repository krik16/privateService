<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="../common/tag.jsp"%>
<div class="shopSelectList" id="commodityCategoryList">
	<input id="rowCont" type="hidden" name="rowCont" value="<c:out value='${rowCont}'/>" /> 
	<input id="jumpPage" type="hidden" name="jumpPage">
	<table width="100%" border="0" cellspacing="0" cellpadding="0">
		<tr>
			<td>订单号</td>
			<td>昵称</td>
			<td>账号</td>
			<td>状态</td>
			<td>优惠券名称</td>
			<td>订单金额(元)</td>
			<td>下单时间</td>
		</tr>
		<c:choose>
			<c:when test="${not empty list}">
				<c:forEach var="entity" items="${list}" varStatus="status">
					<tr>
						<td><a href="${ctx}/couponOrder/info?id=${entity.id}"  target="_blank" style="text-decoration: underline;">${entity.orderNo}</a></td>
						<td>${entity.userName}</td>
						<td>${entity.userPhone}</td>
						<td>
							${empty entity.status ? '' : ''}
							${entity.status eq '0' ? '待付款' : ''}
							${entity.status eq '1' ? '已付款' : ''}
							${entity.status eq '2' ? '已取消 ' : ''}
							${entity.status eq '3' ? '已删除 ' : ''}
							${entity.status eq '4' ? '退款中 ' : ''}
							${entity.status eq '5' ? '已退款 ' : ''}
						</td>
							<td>${entity.title}</td>
							<td>${entity.totalAmount}</td>
						<td><fmt:formatDate value="${entity.createAt}" pattern="yyyy-MM-dd HH:mm:ss"/></td>
					</tr>
				</c:forEach>
			</c:when>
			<c:otherwise>
				<tr>
					<td style="text-align: center;" colspan="15">暂无记录</td>
				</tr>
			</c:otherwise>
		</c:choose>
	</table>
</div>
<%@ include file="../footer.jsp"%>

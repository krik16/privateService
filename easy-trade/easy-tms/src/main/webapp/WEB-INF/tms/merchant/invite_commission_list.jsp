<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="../common/tag.jsp"%>
<div class="shopSelectList" id="commodityCategoryList">
	<input id="rowCont" type="hidden" name="rowCont" value="<c:out value='${rowCont}'/>" /> 
	<input id="jumpPage" type="hidden" name="jumpPage">
	<table width="100%" border="0" cellspacing="0" cellpadding="0">
		<tr>
			<td>卖家账号</td>
			<td>卖家姓名</td>
			<td>注册人账号</td>
			<td>注册人姓名</td>
			<td>佣金金额</td>
			<td>状态</td>
			<td>创建时间</td>
		</tr>
		<c:choose>
			<c:when test="${not empty list}">
				<c:forEach var="entity" items="${list}" varStatus="status">
					<tr>
						<td>${entity.sellerAccount}</td>
						<td>${entity.sellerName}</td>
						<td>${entity.buyerAccount}</td>
						<td>${entity.buyerName}</td>
						<td>${entity.commissionAmount}</td>
						<td>
							${empty entity.status ? '' : ''}
							${entity.status eq '0' ? '未审核' : ''}
							${entity.status eq '1' ? '审核未通过' : ''}
							${entity.status eq '2' ? '审核通过 ' : ''}
						</td>
						<td><fmt:formatDate value="${entity.tradeTime}" pattern="yyyy-MM-dd HH:mm:ss"/></td>
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

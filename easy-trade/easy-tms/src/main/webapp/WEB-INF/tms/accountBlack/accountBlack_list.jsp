<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="../common/tag.jsp"%>
<div class="shopSelectList" id="commodityCategoryList">
	<input id="rowCont" type="hidden" name="rowCont" value="<c:out value='${rowCont}'/>" /> 
	<input id="jumpPage" type="hidden" name="jumpPage">
	<table width="100%" border="0" cellspacing="0" cellpadding="0">
		<tr>
		 <td style="text-align: center;"><input type="checkbox" id="select-all" onclick="selectAll()"/></td>
			<td>支付账号</td>
			<td>账号类型</td>
			<td>购买总数</td>
			<td>创建时间</td>
			<td>是否冻结</td>
			<td>操作</td>
		</tr>
		<c:choose>
			<c:when test="${not empty list}">
				<c:forEach var="item" items="${list}" varStatus="status">
					<tr>
						<td style="text-align: center;"><input type="checkbox" name="subBox" id="${item.id}" ></td>
						<td>${item.payAccount}</td>
						<c:choose>
							<c:when test="${item.payType eq 0}">
								<td>支付宝</td>
							</c:when>
							<c:when test="${item.payType eq 1}">
								<td>微信</td>
							</c:when>
							<c:otherwise><td>银联</td></c:otherwise>	
						</c:choose>
						<td>${item.count}</td>
						<td><fmt:formatDate value="${item.createAt}" pattern="yyyy-MM-dd HH:mm:ss"/></td>	
						<c:choose>
							<c:when test="${item.status eq 0}">
								<td>正常</td>
							</c:when>
							<c:otherwise><td>冻结</td></c:otherwise>	
						</c:choose>
						
						<c:choose>
							<c:when test="${item.status eq 0}">
							<td><a href="javascript:void(0);" class="btnsearch checked" id="frozen-button" onclick="frozenAccount(${item.id},1)">冻结</a></td>
							</c:when>
							<c:otherwise>
							<td><a href="javascript:void(0);" class="btnsearch checked" id="frozen-button" onclick="frozenAccount(${item.id},0)">解冻</a></td>
							</c:otherwise>	
						</c:choose>
			 		</td>
					</tr>
				</c:forEach>
			</c:when>
			<c:otherwise>
				<tr>
					<td style="text-align: center;" colspan="6">暂无记录</td>
				</tr>
			</c:otherwise>
		</c:choose>
	</table>
</div>
<%@ include file="../footer.jsp"%>
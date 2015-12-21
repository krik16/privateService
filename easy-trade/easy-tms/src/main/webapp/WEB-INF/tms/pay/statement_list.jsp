<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="../common/tag.jsp"%>
<div class="shopSelectList" id="commodityCategoryList">
	<input id="rowCont" type="hidden" name="rowCont" value="<c:out value='${rowCont}'/>" /> 
	<input id="jumpPage" type="hidden" name="jumpPage">
	<table width="100%" border="0" cellspacing="0" cellpadding="0">
		<tr>
		 <td style="text-align: center;"><input type="checkbox" id="select-all" onclick="selectAll()"/></td>
			<td>对账单批次</td>
			<td>付款单号</td>
			<td>商户类型</td>
			<td>结算账期</td>
			<td>名称</td>
			<td>结算方式</td>
			<td>账号</td>
			<td>开户行名称</td>
			<td>应付总金额</td>
			<td>创建时间</td>
			<td>对账状态</td>
			<td>操作</td>
		</tr>
		<c:choose>
			<c:when test="${not empty list}">
				<c:forEach var="item" items="${list}" varStatus="status">
					<tr>
						<td style="text-align: center;"><input type="checkbox" name="subBox" id="${item.id}" payChannel="${item.payChannel}" paymentId="${item.paymentId}"></td>
						<td>${item.batchNo}</td>
						<td>${item.payNo}</td>
						<td><c:choose>
								<c:when test="${item.bussinessType eq 1}">
									商场
								</c:when>
								<c:when test="${item.bussinessType eq 2}">
									品牌
								</c:when>
								<c:when test="${item.bussinessType eq 3}">
									分公司
								</c:when>
								<c:when test="${item.bussinessType eq 4}">
									集团公司
								</c:when>
								<c:otherwise>店铺</c:otherwise>
							</c:choose> 
						</td>
						<td><fmt:formatDate value="${item.cycleStartTime}" pattern="yyyy-MM-dd HH:mm:ss"/>
						- <fmt:formatDate value="${item.cycleEndTime}" pattern="yyyy-MM-dd HH:mm:ss"/></td>
						<td>${item.bussinessName}</td>
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
							<c:otherwise>
								支付宝
							</c:otherwise>
						</c:choose>
						</td>
						<td>${item.payAccount}</td>
						<td>${item.blankName}</td>
						<td>${item.payTotal/100}</td>
						<td><fmt:formatDate value="${item.createAt}" pattern="yyyy-MM-dd HH:mm:ss"/></td>
						<td>
						<c:choose>
							<c:when test="${item.status eq 9}">
								付款冻结
							</c:when>
							<c:otherwise>
								待付款
							</c:otherwise>
						</c:choose>
						</td>
						<td>
							<c:choose>
								<c:when test="${item.status eq 9}">
									<sec:authorize ifAnyGranted="TMS_F_PAY" ><a onclick="payFreeze(${item.id},10)" class="btnsearch" id="pay-button" target="_blank">解冻</a></sec:authorize>
								</c:when>
								<c:when test="${item.status eq 6 or item.status eq 10}">
									<sec:authorize ifAnyGranted="TMS_F_PAY" ><a onclick="payFreeze(${item.id},9)" class="btnsearch" id="pay-button" target="_blank">冻结</a></sec:authorize>
									<sec:authorize ifAnyGranted="TMS_F_PAY" ><a onclick="statementPay(${item.paymentId},6, ${item.payChannel},${item.id})" class="btnsearch" id="pay-button" target="_blank">付款</a></sec:authorize>
								</c:when>
								<c:otherwise>
								<sec:authorize ifAnyGranted="TMS_F_PAY" ><a onclick="statementPay(${item.paymentId},6, ${item.payChannel},${item.id})" class="btnsearch" id="pay-button" target="_blank">付款</a></sec:authorize>
								</c:otherwise>
							</c:choose>
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

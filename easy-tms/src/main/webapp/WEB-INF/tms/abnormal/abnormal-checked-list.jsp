<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/_include/_jsp_tags.jsp"%>
<%@include file="/_include/_jsp_variable.jsp"%>
<div class="shopSelectList" id="shopSelectList">
	<input id="rowCont" type="hidden" name="rowCont"
		value="<c:out value='${rowCont}'/>" /> <input id="jumpPage"
		type="hidden" name="jumpPage">
	<table width="100%" border="0" cellspacing="0" cellpadding="0"
		style="font-size: 12px;">
		<tr>
			<td style="text-align: center;">异常交易号</td>
			<td style="text-align: center;">订单号</td>
			<td style="text-align: center;" name="checkStatusTd">审核</td>
			<td style="text-align: center;">打款方式</td>
			<td style="text-align: center;">买家帐号</td>
			<td style="text-align: center;">异常交易金额(元)</td>
			<td style="text-align: center;">创建时间</td>
			<td style="text-align: center;">创建人</td>
		</tr>
		<c:choose>
			<c:when test="${not empty list}">
				<c:forEach var="item" items="${list}" varStatus="status">
					<tr>
						<td style="text-align: center;"><a
							href="${ctx}/ab/view?id=${item.id}" target="_blank"
							style="text-decoration: underline;">${item.idNo}</a></td>
						<td style="text-align: center;"><a
							href="${ctx}/orderManager/orderInfoByNo?orderNo=${item.orderNo}&module=order"
							style="text-decoration: underline" target="_blank">${item.orderNo}</a></td>
						<td style="text-align: center;" name="checkStatusTd"><c:choose>
								<c:when test="${item.status==0 }">未审核</c:when>
								<c:when test="${item.status==-1 }">
									<a name="remote" reason="${item.remarks}" href="#">未通过</a>
								</c:when>
								<c:when test="${item.status==1 }">通过</c:when>
							</c:choose></td>
						<td style="text-align: center;"><c:choose>
								<c:when test="${item.paymentType==0 }">支付宝</c:when>
								<c:when test="${item.paymentType==1 }">银行卡</c:when>
								<c:when test="${item.paymentType==2 }">微信</c:when>
								<c:when test="${item.paymentType==3 }">其他</c:when>
							</c:choose></td>
						<td style="text-align: center;">${item.userAccount }</td>
						<td style="text-align: center;">${item.amount }</td>
						<td style="text-align: center;"><fmt:formatDate
								value="${item.createAt}" pattern="yyyy-MM-dd HH:mm:ss" /></td>
						<td style="text-align: center;">${item.createUser}</td>
					</tr>
				</c:forEach>
			</c:when>
			<c:otherwise>
				<tr>
					<td style="text-align: center;" colspan="10">暂无记录</td>
				</tr>
			</c:otherwise>
		</c:choose>

		</tr>
	</table>
</div>
<div class="page">
	<a href="javascript:void(0);" class="page" id="gopage"
		clickAction="gopage">跳转</a> <input type="text" name="jumpPageIn"
		id="jumpPageIn" /> <a href="javascript:void(0);" class="icon-page"
		id="downPage" clickAction="downPage"></a> <span><c:out
			value="${currpage}" /> <c:if test="${rowCont>1}">/<c:out
				value="${rowCont}" />
		</c:if> </span> <a href="javascript:void(0);" class="icon-page-left" id="upPage"
		clickAction="upPage"></a>
</div>
<%-- <site:pagination pagination="${pagination}" searchFormId="searchForm" ajaxForm="true"/> --%>




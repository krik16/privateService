<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/_include/_jsp_tags.jsp"%>
<%@include file="/_include/_jsp_variable.jsp"%>
<div class="shopSelectList" id="commodityCategoryList">
    <input id="rowCont" type="hidden" name="rowCont" value="<c:out value='${rowCont}'/>" />
   	<input id="jumpPage" type="hidden" name="jumpPage">
	<table width="100%" border="0" cellspacing="0" cellpadding="0">
		<tbody>
		<tr>
			<td>订单号</td>
			<td>渠道</td>
			<td>昵称</td>
			<td>账号</td>
			<td>商场</td>
			<td>店铺</td>
			<td>状态</td>
			<td>订单总价</td>
			<td>下单时间</td>
		</tr>
		<c:choose>
			<c:when test="${not empty orderForms}">
				<c:forEach var="orderForm" items="${orderForms}" varStatus="status">
			  		<tr>
						<td><a href="${ctx}/orderManager/orderInfo?orderId=${orderForm.orderId}&module=order" style="text-decoration:underline" target="_blank">${orderForm.orderNo}</a></td>
						<td>
							<c:if test="${item.guideType==1}">商家</c:if>
							<c:if test="${item.guideType==2}">买手</c:if>
						</td>
						<td>${orderForm.nickname}</td>
						<td>${orderForm.username}</td>
						<td>${orderForm.mallName}</td>
						<td>${orderForm.shopName}</td>
						<td>
							<c:choose>
								<c:when test="${orderForm.status == 1}"> 未付款     </c:when>
								<c:when test="${orderForm.status == 2}"> 待发货     </c:when>
								<c:when test="${orderForm.status == 3}"> 已发货     </c:when>
								<c:when test="${orderForm.status == 4}"> 确认收货 </c:when>
								<c:when test="${orderForm.status == 6}"> 已完成 </c:when>
								<c:when test="${orderForm.status == 5}"> 已关闭     </c:when>
							</c:choose>
						</td>
						<td>
							<c:choose>
								<c:when test="${(orderForm.orderTotalAmount - orderForm.discountFee)<0}">${orderForm.expressFee }（元）</c:when>
								<c:otherwise>${orderForm.orderTotalAmount - orderForm.discountFee + orderForm.expressFee}（元）</c:otherwise>
							</c:choose>
						</td>
						<td><fmt:formatDate value="${orderForm.createAt}" pattern="yyyy-MM-dd HH:mm"/></td>
					</tr>    
			  </c:forEach>
			</c:when>
			<c:otherwise>
				<tr>
					<td style="text-align: center;" colspan="12">暂无记录</td>
				</tr>
			</c:otherwise>
		</c:choose>
	  	</tbody>
	</table>
</div>
 <div class="page">
	<a href="javascript:void(0);" class="page" id="gopage" clickAction="gopage">跳转</a> 
	<input type="text" name="jumpPageIn" id="jumpPageIn"/>
	<a href="javascript:void(0);" class="icon-page" id="downPage" clickAction="downPage" ></a>
	<span><c:out value="${currpage}"/>
		<c:if test="${rowCont>1}">   
			/<c:out value="${rowCont}"/>
		</c:if>
	</span>
	<a href="javascript:void(0);" class="icon-page-left" id="upPage" clickAction="upPage"></a>
</div>
<%-- <site:pagination pagination="${pagination}" searchFormId="searchForm" ajaxForm="true"/> --%>




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
			<td>买家账号</td>
			<td>订单金额（元）</td>
			<td>支付金额（元）</td>
			<td>订单状态</td>
			<td>订单来源</td>
			<td>支付方式</td>
			<td>下单时间</td>
			<td>支付时间</td>
			<td>收货人信息</td>
		</tr>
		<c:choose>
			<c:when test="${not empty orderCartForms}">
				<c:forEach var="orderCart" items="${orderCartForms}" varStatus="status">
			  		<tr>
						<td>${orderCart.orderNo}</td>
						<td>${orderCart.buyerAccount}</td>
						<td>${orderCart.realAmount}</td>
						<td>${orderCart.payAmount}</td>
						<td>
							<c:choose>
								<c:when test="${orderCart.status == 1}"> 未付款    </c:when>
								<c:when test="${orderCart.status == 2}"> 已付款    </c:when>
								<c:when test="${orderCart.status == 3}"> 超时关闭  </c:when>
								<c:when test="${orderCart.status == 4}"> 买家关闭 	</c:when>
								<c:when test="${orderCart.status == 5}"> 失效      </c:when>
							</c:choose>
						</td>
						<td>
							<c:choose>
								<c:when test="${orderCart.orderSource == 0}"> 容易逛   </c:when>
								<c:when test="${orderCart.orderSource == 1}"> 微网站   </c:when>
								<c:when test="${orderCart.orderSource == 2}"> 终端机   </c:when>
								<c:when test="${orderCart.orderSource == 3}"> 其它     </c:when>
							</c:choose>
						</td>
						<td>
							<c:choose>
								<c:when test="${orderCart.payChannel == 1}"> 支付宝网页  </c:when>
								<c:when test="${orderCart.payChannel == 3}"> 支付宝app   </c:when>
								<c:when test="${orderCart.payChannel == 5}"> 微信        </c:when>
							</c:choose>
						</td>
						<td><fmt:formatDate value="${orderCart.createAt}" pattern="yyyy-MM-dd HH:mm"/></td>
						<td><fmt:formatDate value="${orderCart.payAt}" pattern="yyyy-MM-dd HH:mm"/></td>
						<td>
								${orderCart.buyerName}  ${orderCart.buyerPhone}
						</td>
					</tr>
			  </c:forEach>
			</c:when>
			<c:otherwise>
				<tr>
					<td style="text-align: center;" colspan="10">暂无记录</td>
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




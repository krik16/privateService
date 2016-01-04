<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/_include/_jsp_tags.jsp"%>
<%@include file="/_include/_jsp_variable.jsp"%>
<div class="shopSelectList" id="commodityCategoryList">
    <input id="rowCont" type="hidden" name="rowCont" value="<c:out value='${rowCont}'/>" />
   	<input id="jumpPage" type="hidden" name="jumpPage">
	<table width="100%" border="0" cellspacing="0" cellpadding="0">
		<tbody>
		<tr>
			<td>母订单号</td>
			<td>订单号</td>
			<td>卖家账号</td>
			<td>买家账号</td>
			<td>商场</td>
			<td>店铺</td>
			<td>订单金额（元）</td>
			<td>平台促销券（元）</td>
			<td>积分（元）</td>
			<td>支付金额（元）</td>
			<td>订单状态</td>
			<td>订单来源</td>
			<td>支付方式</td>
			<td>下单时间</td>
			<td>渠道</td>
		</tr>
		<c:choose>
			<c:when test="${not empty orderForms}">
				<c:forEach var="orderForm" items="${orderForms}" varStatus="status">
			  		<tr>
						<td>${orderForm.orderCartNo}</td>
						<td>${orderForm.orderNo}</td>
						<td>${orderForm.sellerAccount}</td>
						<td>${orderForm.username}</td>
						<td>${orderForm.mallName}</td>
						<td>${orderForm.shopName}</td>
						<td>${orderForm.realAmount}</td>
						<td><%--${orderForm.realAmount}--%></td>
						<td>${orderForm.integralAmount}</td>
						<td>${orderForm.payAmount}</td>
						<td>
							<c:choose>
								<c:when test="${orderForm.status == 1}"> 未付款     </c:when>
								<c:when test="${orderForm.status == 2}"> 待发货     </c:when>
								<c:when test="${orderForm.status == 3}"> 已发货     </c:when>
								<c:when test="${orderForm.status == 4}"> 确收货 	 </c:when>
								<c:when test="${orderForm.status == 5}"> 已关闭     </c:when>
								<c:when test="${orderForm.status == 8}"> 已取消 	 </c:when>
							</c:choose>
						</td>
						<td>
							<c:choose>
								<c:when test="${orderForm.orderSource == 0}"> 容易逛     </c:when>
								<c:when test="${orderForm.orderSource == 1}"> 微网站     </c:when>
								<c:when test="${orderForm.orderSource == 2}"> 终端机     </c:when>
								<c:when test="${orderForm.orderSource == 3}"> 其他      </c:when>
							</c:choose>
						</td>
						<td>
							<c:choose>
								<c:when test="${orderForm.payChannel == 1 or orderForm.payChannel == 3}"> 支付宝     </c:when>
								<c:when test="${orderForm.payChannel == 5}"> 微信     </c:when>
							</c:choose>
						</td>
						<td><fmt:formatDate value="${orderForm.createAt}" pattern="yyyy-MM-dd HH:mm"/></td>
						<td>
							<c:if test="${orderForm.guideType==1}">商家</c:if>
							<c:if test="${orderForm.guideType==2}">买手</c:if>
						</td>
					</tr>    
			  </c:forEach>
			</c:when>
			<c:otherwise>
				<tr>
					<td style="text-align: center;" colspan="15">暂无记录</td>
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




<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/_include/_jsp_tags.jsp"%>
<%@include file="/_include/_jsp_variable.jsp"%>
<div class="shopSelectList" id="shopSelectList">
	<div>
		<center>
		<span style="font-size: 22px;font-weight: 500;;">提现</span><br>
		<span style="font-size: 18px;color: red;">${totalAmount }</span><br>
		<span style="font-size: 18px;color: gray;">${size }笔</span>
		</center>
	</div>
    <input id="rowCont" type="hidden" name="rowCont" value="<c:out value='${rowCont}'/>" />
    <input id="jumpPage" type="hidden" name="jumpPage">
    <table width="100%" border="0" cellspacing="0" cellpadding="0" style="font-size: 12px;">
        <tr>

            <td style="text-align: center;">交易流水号</td>
            <td style="text-align: center;">渠道</td>
            <td style="text-align: center;">交易时间</td>
            <td style="text-align: center;">打款方式</td>
            <td style="text-align: center;">商场</td>
            <td style="text-align: center;">店铺</td>
            <td style="text-align: center;">提现流水号</td>
            <td style="text-align: center;">卖家账号</td>
            <td style="text-align: center;">卖家姓名</td>
            <td style="text-align: center;">提现金额</td>
        </tr>
        <c:choose>
            <c:when test="${not empty list}">
                <c:forEach var="item" items="${list}" varStatus="status">
                    <tr>

                        <td style="text-align: center;"><a href="${ctx}/drawDetail/detail?id=${item.id}" target="mainFrame" style="text-decoration: underline;">${item.tradeNo}</a></td>
                       	<td>
							<c:if test="${item.guideType==1}">商家</c:if>
							<c:if test="${item.guideType==2}">买手</c:if>
						</td>
                        <td style="text-align: center;"><fmt:formatDate value="${item.tradeAt}" pattern="yyyy-MM-dd HH:mm:ss"/></td>
                        <td style="text-align: center;">
						 			<c:choose>
						 				<c:when test="${item.payType==0 }">支付宝</c:when>
						 				<c:when test="${item.payType==1 }">银行卡</c:when>
						 				<c:when test="${item.payType==2 }">微信</c:when>
						 				<c:when test="${item.payType==3 }">其他</c:when>
						 			</c:choose>
						</td>
                        <td style="text-align: center;">${item.mallName }</td>
                        <td style="text-align: center;">${item.shopName }</td>
                        <td style="text-align: center;">${item.drawNo }</td>
                        <td style="text-align: center;">${item.sellerAccount }</td>
                        <td style="text-align: center;">${item.sellerName }</td>
                        <td style="text-align: center;">${item.drawAmount }</td>
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
<c:if test="${rowCont>1}">
    <%@ include file="../footer.jsp"%>
</c:if>
<%-- <site:pagination pagination="${pagination}" searchFormId="searchForm" ajaxForm="true"/> --%>




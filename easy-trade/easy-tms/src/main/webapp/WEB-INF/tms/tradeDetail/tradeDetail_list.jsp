<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ include file="../common/tag.jsp" %>
<div class="shopSelectList" id="commodityCategoryList">
    <input id="rowCont" type="hidden" name="rowCont" value="<c:out value='${rowCont}'/>"/>
    <input id="jumpPage" type="hidden" name="jumpPage">

    <div>
        <div style="float: left;margin-left: 200px">
            <span style="font-size: 22px;font-weight: 500;">收入</span><br>
            <span style="font-size: 18px;color: green;">+${inocmeAmount} &nbsp;元</span><br>
            <span style="font-size: 18px;color: gray;">${inocmeTotal}笔</span>
        </div>
        <div style="float: right;margin-right: 200px">
            <span style="font-size: 22px;font-weight: 500;">支出</span><br>
            <span style="font-size: 18px;color: red;">-${expenseAmount}&nbsp;元</span><br>
            <span style="font-size: 18px;color: gray;">${expenseTotal}笔</span>
        </div>
    </div>
    <table width="100%" border="0" cellspacing="0" cellpadding="0">
        <tr>
            <td>交易流水号</td>
            <td>付款单号</td>
            <td>渠道</td>
            <td>交易时间</td>
            <td>收支类型</td>
            <td>打款方式</td>
            <td>优惠方式</td>
            <td>商场</td>
            <td>店铺</td>
            <td>订单号</td>
            <td>订单类型</td>
            <td>下单时间</td>
            <td>买家账号</td>
            <td>买家姓名</td>
            <td>卖家账号</td>
            <td>卖家姓名</td>
            <td>交易金额</td>
        </tr>
        <c:choose>
            <c:when test="${not empty list}">
                <c:forEach var="entity" items="${list}" varStatus="status">
                    <tr>
                        <td><a href="${ctx}/tradeDetail/info?id=${entity.id}&tradeNo=${entity.tradeNo}" target="_blank"
                               style="text-decoration: underline;">${entity.tradeNo}</a></td>
                        <td>
                            <c:choose>
                                <c:when test="${entity.guideType eq 1}">商家</c:when>
                                <c:when test="${entity.guideType eq 2}">买手</c:when>
                            </c:choose>
                        </td>
                        <td>${entity.payNo}</td>
                        <td><fmt:formatDate value="${entity.tradeTime}" pattern="yyyy-MM-dd HH:mm:ss"/></td>
                        <td>
                            <c:choose>
                                <c:when test="${entity.tradeType eq 0}">收入</c:when>
                                <c:when test="${entity.tradeType eq 5}">重复支付收入</c:when>
                                <c:otherwise>支出</c:otherwise>
                            </c:choose>
                        </td>
                        <td>
                                ${empty entity.payChannel ? '' : ''}
                                ${entity.payChannel eq '0' ? '支付宝 ' : ''}
                                ${entity.payChannel eq '1' ? '微信' : ''}
                                ${entity.payChannel eq '2' ? '银行卡 ' : ''}
                        </td>
                        <c:choose>
                            <c:when test="${entity.score > 0 && (not empty entity.orderCouponCode || entity.hbDiscount > 0)}">
                                <td>红包加积分</td>
                            </c:when>
                            <c:when test="${entity.score > 0 }">
                                <td>积分</td>
                            </c:when>
                            <c:when test="${not empty entity.orderCouponCode || entity.hbDiscount > 0}">
                                <td>红包</td>
                            </c:when>
                            <c:otherwise>
                                <td></td>
                            </c:otherwise>
                        </c:choose>

                        <td>${entity.mallName}</td>
                        <td>${entity.shopName}</td>
                        <c:choose>
                            <c:when test="${entity.orderType eq 0}">
                                <td>
                                    <a href="${ctx}/orderManager/orderInfo?orderId=${entity.orderId}&userId=${entity.orderUserId}&module=order&type=tradeDetail"
                                       target="_parent" style="text-decoration:underline">${entity.orderNo}</a></td>
                            </c:when>
                            <c:otherwise>
                                <td>${entity.orderNo}</td>
                            </c:otherwise>
                        </c:choose>
                        <c:choose>
                            <c:when test="${entity.orderType eq 0}">
                                <td>商品订单</td>
                            </c:when>
                            <c:otherwise>
                                <td>优惠券订单</td>
                            </c:otherwise>
                        </c:choose>
                        <td><fmt:formatDate value="${entity.orderTime}" pattern="yyyy-MM-dd HH:mm:ss"/></td>
                        <td>${entity.buyerAccount}</td>
                        <td>${entity.buyerName}</td>
                        <td>${entity.sellerAccount}</td>
                        <td>${entity.sellerName}</td>
                        <td>
                            <c:if test="${not empty entity.orderPrice}">
                                <c:choose>
                                    <c:when test="${entity.tradeType eq 0 or entity.tradeType eq 5}">+</c:when>
                                    <c:otherwise>-</c:otherwise>
                                </c:choose>
                                ${entity.orderPrice}
                            </c:if>
                        </td>
                    </tr>
                </c:forEach>
            </c:when>
            <c:otherwise>
                <tr>
                    <td style="text-align: center;" colspan="18">暂无记录</td>
                </tr>
            </c:otherwise>
        </c:choose>
    </table>
</div>
<%@ include file="../footer.jsp" %>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="../common/tag.jsp"%>
<div class="shopSelectList" id="commodityCategoryList">
	<input id="rowCont" type="hidden" name="rowCont" value="<c:out value='${rowCont}'/>" /> 
	<input id="jumpPage" type="hidden" name="jumpPage">
	<table width="100%" border="0" cellspacing="0" cellpadding="0">
		<tr>
		 <td style="text-align: center;"><input type="checkbox" id="select-all" onclick="selectAll()"/></td>
			<td>对账单批次</td>
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
						<td style="text-align: center;"><input type="checkbox" name="subBox" id="${item.id}" payChannel="${item.payChannel}" ></td>
						<td>${item.batchNo}</td>
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
						<td>${item.payTotal}</td>
						<td><fmt:formatDate value="${item.createAt}" pattern="yyyy-MM-dd HH:mm:ss"/></td>
						<td>${item.status}</td>
						<c:choose>
						<c:when test="${item.payChannel eq 0}">
							<td><sec:authorize ifAnyGranted="TMS_F_PAY" ><a onclick="morePay(${item.id},6, ${item.payChannel})" class="btnsearch" id="pay-button" target="_blank">付款</a></sec:authorize></td>
						</c:when>
						<c:otherwise>
							<td><a href="javascript:void(0);" class="btnsearch checked" id="weixin-refund-button" onclick="weixinRefund(${item.id},${item.refundRejected})">退款</a>
							<c:choose>
								<c:when test="${item.refundRejected eq 0}">
									<a href="javascript:void(0);" class="btnsearch checked" id="weixin-refund-rejected-button" onclick="weixinRefundRejected(${item.id},1)">拒绝</a>
								</c:when>
								<c:otherwise>
									<a href="javascript:void(0);" class="btnsearch checked" id="weixin-refund-agree-button" onclick="weixinRefundRejected(${item.id},0)">同意</a>
								</c:otherwise>
							</c:choose>
						</c:otherwise>
						</c:choose>
						</td>
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
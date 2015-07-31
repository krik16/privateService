<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/_include/_jsp_tags.jsp"%>
<%@include file="/_include/_jsp_variable.jsp"%>
<div class="shopSelectList" id="shopSelectList">
    <input id="rowCont" type="hidden" name="rowCont" value="<c:out value='${rowCont}'/>" />
   
   	<input id="jumpPage" type="hidden" name="jumpPage">
	<table width="100%" border="0" cellspacing="0" cellpadding="0" style="font-size: 12px;">
		 <tr>
            <td style="text-align: center;">全选<input type="checkbox" id="select-all"/></td>
            <td style="text-align: center;">票据</td>
            <td style="text-align: center;">返佣流水号</td>
            <td style="text-align: center;">商场</td>
            <td style="text-align: center;">店铺</td>
            <td style="text-align: center;">小票上传时间</td>
            <td style="text-align: center;">订单号</td>
            <td style="text-align: center;">下单时间</td>
            <td style="text-align: center;">买家账号</td>
            <td style="text-align: center;">卖家账号</td>
            <td style="text-align: center;">卖家姓名</td>
            <td style="text-align: center;">返佣金额</td>
            <td style="text-align: center;">返佣状态</td>
            <td style="text-align: center;" name="operate">操作</td>
        </tr>
		<c:choose>
			<c:when test="${not empty list}">
			  	<c:forEach var="item" items="${list}" varStatus="status">
			 		<tr>
			 		<td style="text-align: center;"><input type="checkbox" name="subBox" id="${item.id }"></td>
			 		
			 		<td style="text-align: center;">
			 			<c:set value="${ fn:split(item.picUrls, ';') }" var="urls" />
			 			<c:forEach items="${urls }" var="url" begin="0" end="0">
			 				<img name="fangda" width="50" height="50" src="${url}" style="cursor: pointer;" alt="点击放大" />
			 			</c:forEach>
			 		</td>
			 		<td style="text-align: center;"><a href="${ctx}/sc/detail?id=${item.id}&module=finance" target="_blank" style="text-decoration: underline;">${item.id+100000000}</a></td>
			 		<td style="text-align: center;">${item.mallName }</td>
			 		<td style="text-align: center;">${item.shopName }</td>
			 		<td style="text-align: center;"><fmt:formatDate value="${item.picUploadAt}" pattern="yyyy-MM-dd HH:mm:ss"/></td>
			 		<td style="text-align: center;"><a href="${ctx}/orderManager/OrderInfoByOrderNo?orderNo=${item.orderNo}" target="_blank">${item.orderNo }</a></td>
			 		<td style="text-align: center;"><fmt:formatDate value="${item.orderAt}" pattern="yyyy-MM-dd HH:mm:ss"/></td>
			 		<td style="text-align: center;">${item.buyerAccount }</td>
			 		<td style="text-align: center;">${item.sellerAccount }</td>
			 		<td style="text-align: center;">${item.sellerName }</td>
			 		<td style="text-align: center;">${item.commissionAmount }</td>
			 		<td style="text-align: center;">未到账</td>
			 		<td style="text-align: center;" name="operate">
			 			<sec:authorize ifAnyGranted="TMS_F_SC_VERIFY" >
				 			<a href="javascript:void(0);" class="btnsearch" id="checkok-${item.id }" onclick="checkApplys(${item.id},3)">审核通过</a>
				 			<a href="javascript:void(0);" class="btnsearch" id="checkok-${item.id }" onclick="checkUnpass(${item.id });">审核不通过</a>
			 			</sec:authorize>
			 		</td>
					</tr>
			 	</c:forEach>
			</c:when>
			<c:otherwise>
				<tr>
					<td style="text-align: center;" colspan="14">暂无记录</td>
				</tr>
			</c:otherwise>
		</c:choose>
	  	
	  </tr>
	</table>
</div>
<div class="page">
	<a href="javascript:void(0);" class="page" id="gopage" clickAction="gopage">跳转</a> 
	<input type="text" name="jumpPageIn" id="jumpPageIn" />
	<a href="javascript:void(0);" class="icon-page" id="downPage" clickAction="downPage"></a> 
	 <span><c:out value="${currpage}" />
	 <c:if test="${rowCont>1}">/<c:out value="${rowCont}" /></c:if> 
	 </span> <a href="javascript:void(0);" class="icon-page-left" id="upPage" clickAction="upPage"></a>
</div>
<%-- <site:pagination pagination="${pagination}" searchFormId="searchForm" ajaxForm="true"/> --%>


<script type="text/javascript">


</script>

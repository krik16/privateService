<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/_include/_jsp_tags.jsp"%>
<%@include file="/_include/_jsp_variable.jsp"%>
<div class="shopSelectList" id="shopSelectList">
    <input id="rowCont" type="hidden" name="rowCont" value="<c:out value='${rowCont}'/>" />
   
   	<input id="jumpPage" type="hidden" name="jumpPage">
	<table width="100%" border="0" cellspacing="0" cellpadding="0" style="font-size: 12px;">
		 <tr>
            <td style="text-align: center;">提现流水号</td>
            <td style="text-align: center;">渠道</td>
            <td style="text-align: center;">申请提现时间</td>
            <td style="text-align: center;">审核</td>
            <td style="text-align: center;">打款方式</td>
            <td style="text-align: center;">商场</td>
            <td style="text-align: center;">店铺</td>
            <td style="text-align: center;">卖家账号</td>
            <td style="text-align: center;">卖家姓名</td>
            <td style="text-align: center;">提现金额</td>
        </tr>
		<c:choose>
			<c:when test="${not empty list}">
			  	<c:forEach var="item" items="${list}" varStatus="status">
			 		<tr>
			 		<td style="text-align: center;"><a href="${ctx}/bs/detail?id=${item.id}&module=merchant" target="_blank" style="text-decoration: underline;">${item.drawNo}</a></td>
					<td>
						<c:if test="${item.guideType==1}">商家</c:if>
						<c:if test="${item.guideType==2}">买手</c:if>
					</td>
					<td style="text-align: center;"><fmt:formatDate value="${item.createAt}" pattern="yyyy-MM-dd HH:mm:ss"/></td>
			 		<td style="text-align: center;" >
			 			<c:choose>
			 				<c:when test="${item.status>0 }">已通过</c:when>
			 				<c:when test="${item.status==-2 }">已通过</c:when>
			 				<c:when test="${item.status==-1 }"><a name="remote" id="${item.id }" href="#">未通过</a> </c:when>
			 			</c:choose>
			 		</td>
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

	$('a:[name="remote"]').poshytip({ 
	    alignY: 'bottom', 
	    content: function(updateCallback) { 
	    	var id=$(this).attr("id");
	    	$.get("../bs/getReason?id="+id,function(data){
	            updateCallback("原因："+data.msg); 
	    	},"json"); 
	        return 'Loading...'; 
	    }  
	}); 
</script>


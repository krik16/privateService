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
		<thead>
			<tr>
				<c:if test="${checked==1 }">
					<td style="text-align: center;" id="td-select-all">全选<input
						type="checkbox" id="select-all" /></td>
				</c:if>

				<td style="text-align: center;">流水号</td>
				<td style="text-align: center;">卖家账号</td>
				<c:if test="${checked==2}">
					<td style="text-align: center;" id="td-check">审核</td>
				</c:if>

				<td style="text-align: center;">考核方式</td>
				<td style="text-align: center;">类型</td>
				<td style="text-align: center;">金额(元)</td>
				<td style="text-align: center;">创建时间</td>
				<td style="text-align: center;">创建人</td>
				<c:if test="${checked==1 }">
					<td style="text-align: center;" id="td-operate">操作</td>
				</c:if>
			</tr>
		</thead>
		<c:choose>
			<c:when test="${not empty list}">
				<c:forEach var="item" items="${list}" varStatus="status">
					<tr>
						<c:if test="${checked==1 }">
							<td style="text-align: center;"><input type="checkbox"
								name="subBox" id="${item.id }"></td>
						</c:if>
						<td style="text-align: center;"><a
							href="${ctx}/bonus/detail?id=${item.id}" target="_blank"
							style="text-decoration: underline;">${item.sdNo}</a></td>
						<td style="text-align: center;">${item.sellerAccount }</td>
						<c:if test="${checked==2}">
							<td style="text-align: center;"><c:choose>
									<c:when test="${item.status==1 }">已通过</c:when>
									<c:when test="${item.status==-1 }">
										<a name="remote" id="${item.id }" href="#">未通过</a>
									</c:when>
								</c:choose></td>
						</c:if>
						<td style="text-align: center;">
								<c:choose>
								<c:when test="${item.bonusType==1 || item.bonusType==3}">奖励</c:when>
								<c:when test="${item.bonusType==2 || item.bonusType==4}">惩罚</c:when>
							</c:choose>
						</td>
						<td style="text-align: center;">
								<c:choose>
								<c:when test="${item.bonusType==1 || item.bonusType==2}">交易佣金</c:when>
								<c:when test="${item.bonusType==3 || item.bonusType==4}">验码佣金</c:when>
							</c:choose>
						</td>
						<td style="text-align: center;"><c:choose>
								<c:when test="${item.bonusType==1 || item.bonusType==3}">${item.amount }</c:when>
								<c:when test="${item.bonusType==2 || item.bonusType==4}">-${item.amount }</c:when>
							</c:choose></td>
						<td style="text-align: center;"><fmt:formatDate
								value="${item.createAt}" pattern="yyyy-MM-dd HH:mm:ss" /></td>
						<td style="text-align: center;">${item.createUser }</td>
						<c:if test="${checked==1 }">
							<td style="text-align: center;" name="operate"><sec:authorize
									ifAnyGranted="TMS_F_EXM_EDIT">
									<a href="${ctx}/bonus/edit?id=${item.id}" class="btnsearch">修改</a>
								</sec:authorize> <sec:authorize ifAnyGranted="TMS_F_EXM_DELETE">
									<a href="javascript:void(0);" class="btnsearch"
										id="checkok-${item.id }" onclick="deleteBonus(${item.id},${item.sdNo});">删除</a>
								</sec:authorize> <sec:authorize ifAnyGranted="TMS_F_EXM_VERIFY">
									<a href="javascript:void(0);" class="btnsearch"
										id="checkok-${item.id }" onclick="checkApplys(${item.id},1)">审核通过</a>
								</sec:authorize> <sec:authorize ifAnyGranted="TMS_F_EXM_VERIFY">
									<a href="javascript:void(0);" class="btnsearch"
										id="checkok-${item.id }" onclick="checkUnpass(${item.id });">审核不通过</a>
								</sec:authorize></td>
						</c:if>
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
<script>
$('a:[name="remote"]').poshytip({ 
    alignY: 'bottom', 
    content: function(updateCallback) { 
    	var id=$(this).attr("id");
    	$.get("../sc/getReason?id="+id+"&operate=1",function(data){
            updateCallback("原因："+data.msg); 
    	},"json"); 
        return 'Loading...'; 
    }  
}); 

</script>



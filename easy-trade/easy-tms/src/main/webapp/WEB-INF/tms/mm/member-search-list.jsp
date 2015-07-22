<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/_include/_jsp_tags.jsp"%>
<%@include file="/_include/_jsp_variable.jsp"%>
<table class="memSupertable" width="100%" border="0" cellspacing="0" cellpadding="0">
	<tr>
		<td>所属商场</td>
		<td>会员编号</td>
		<td>会员姓名</td>
		<td>可用积分</td>
		<td>联系方式</td>
		<td>会员性质</td>
		<td>首次交易时间</td>
	</tr>
	<c:if test="${paging.dataList== null || fn:length(paging.dataList) == 0}">
		<tr>
			<td colspan="7">暂无记录</td>
		</tr>
	</c:if>
	<c:forEach items="${paging.dataList}" var="member">
		<tr>
			<td>${member.mallName}</td>
			<td class="c-green member-no" style="cursor:pointer;">${member.memberNo}</td>
			<td>${member.name}</td>
			<td>
				<c:if test="${member.memberNature == 1}">${member.entityIntegral}</c:if>
				<c:if test="${member.memberNature == 2}">${member.elecIntegral}</c:if>
			</td>
			<td>${member.phone1}</td>
			<td>
				<c:if test="${member.memberNature == 1}">实体会员</c:if>
				<c:if test="${member.memberNature == 2}">电子会员</c:if>
			</td>
			<td><fmt:formatDate value="${member.firstConsumeTime}" pattern="yyyy/MM/dd" /></td>
		</tr>
	</c:forEach>
</table>
<c:if test="${paging.dataList!= null && fn:length(paging.dataList) != 0}">
<div class="page">
	<a href="javascript:MEMBER_SEARCH._jump();" class="page total_page" total_page="${paging.totalPage}">跳转</a>
	<input type="text" class="jump-to-num" value="${paging.currentPage}" onkeyup="this.value=this.value.replace(/\D/g,'')"/>
	<c:if test="${paging.currentPage < paging.totalPage}">
		<a href="javascript:MEMBER_SEARCH._jump('${paging.currentPage+1}');" currentPage="${paging.currentPage+1}" class="icon-page"></a>
	</c:if>
	<c:if test="${paging.currentPage >= paging.totalPage}">
		<a href="javascript:MEMBER_SEARCH._jump('${paging.currentPage}');" currentPage="${paging.currentPage}" class="icon-page"></a>
	</c:if>
	<span>${paging.currentPage}/${paging.totalPage}</span>
	<c:if test="${paging.currentPage > 1}">
		<a href="javascript:MEMBER_SEARCH._jump('${paging.currentPage-1}');" currentPage="${paging.currentPage-1}" class="icon-page-left"></a>
	</c:if>
	<c:if test="${paging.currentPage <= 1}">
		<a href="javascript:MEMBER_SEARCH._jump('1');" currentPage="1" class="icon-page-left"></a>
	</c:if>
</div>
</c:if>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/_include/_jsp_tags.jsp"%>
<%@include file="/_include/_jsp_variable.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>容易会员管理后台</title>
<link href="${ctx}/css/jquery-ui.css" type="text/css" rel="stylesheet" />
<link href="${ctx}/css/jquery.timepicker.css" type="text/css" rel="stylesheet" /> <!-- 日期控件css -->
<link href="${ctx}/css/ui.fancytree.css" type="text/css" rel="stylesheet" />     <!-- 树状插件css-->
<link href="${ctx}/css/index.css" type="text/css" rel="stylesheet" />
<link href="${ctx}/css/index3.css" type="text/css" rel="stylesheet" />
<script src="${ctx}/js/jquery/jquery.js" type="text/javascript"></script>
<script src="${ctx}/js/jquery/jquery-ui.js" type="text/javascript"></script>
<!-- 日期控件js -->
<script src="${ctx}/js/jquery/jquery.jtimepicker.js" type="text/javascript"></script>
<script src="${ctx}/js/jquery/jquery-ui-timepicker-addon.js" type="text/javascript"></script>
<!-- 日期控件js end-->
<script src="${ctx}/js/jquery/jquery.nicescroll.js" type="text/javascript"></script>
<script src="${ctx}/js/jquery/jquery-ui-timepicker-zh-CN.js" type="text/javascript"></script>
<script src="${ctx}/js/index.js" type="text/javascript"></script>
<script>
</script>
</head>
<body>
<div class="coupon-min-width">
		<div class="coupon">
			<div class="coupon-title">财务管理>提现申请详情</div>
			<form id="account_form" name="account_form" action=""
				method="post">
				<div class="coupon-main">
					<div class="coupon-new">
						<input type="hidden" name="id" class="accountId"
							value="<c:out value='${apply.id}'/>"> </input>
						<div class="coupon-new-title">提现申请详情</div>
						<div class="w_100">
							<ul>
								<li class="li1">提现流水号：</li>
								<li class="li2"><span class="msg">${apply.drawNo}</span>
								</li>
								<li class="li1">对应商场：</li>
								<li class="li2">${apply.mallName}</li>
								<li class="li1" >打款方式：</li>
								<li class="li2"  ><c:choose>
									<c:when test="${apply.payType==0 }">支付宝</c:when>
									<c:when test="${apply.payType==1 }">银行卡</c:when>
									<c:when test="${apply.payType==3 }">未知</c:when>
								</c:choose></li>
								<li class="li1">卖家账号：</li>
								<li class="li2">${apply.sellerAccount }</li>
								<c:if test="${apply.payType==0 }">
									<li class="li1">卖家支付宝账号：</li>
								</c:if>
								<c:if test="${apply.payType==1 }">
									<li class="li1">卖家银行卡账号：</li>
								</c:if>
								<li class="li2">${apply.payAccount }</li>
								
								<li class="li1" style="color: red;font-size: 16px;">提现金额：</li>
								<li class="li2" style="color: red;font-size: 16px;">${apply.drawAmount}元</li>
							</ul>
							<ul>
								<li class="li1">提现申请时间：</li>
								<li class="li2"><fmt:formatDate value='${apply.createAt}' pattern='yyyy-MM-dd HH:mm'/></li>
								<li class="li1">对应店铺：</li>
								<li class="li2">${apply.shopName }</li>
								<li class="li1">审核：</li>
								<li class="li2">
									<c:if test="${apply.status ==-2}">财务审核未通过</c:if>
									<c:if test="${apply.status ==-1}">客服审核未通过</c:if>
									<c:if test="${apply.status == 0}">未审核</c:if> 
									<c:if test="${apply.status == 1}">客服审核通过</c:if> 
									<c:if test="${apply.status == 2}">财务审核通过</c:if></li>
									<li class="li1">卖家姓名：</li>
								<li class="li2">${apply.sellerName }</li>
								<c:if test="${apply.payType==0 }">
									<li class="li1">卖家支付宝姓名：</li>
								</c:if>
								<c:if test="${apply.payType==1 }">
									<li class="li1">卖家银行卡姓名：</li>
								</c:if>
									
								<li class="li2">${apply.payName }</li>
							</ul>
							
						</div>
						<div style="color: red;font-size: 16px;">
							<c:if test="${apply.status<0 }">
								审核未通过理由：${log.memo }
							</c:if>
						</div>
						
					</div>
				</div>

				<div class="shopsButton">
					<a href="javascript:window.close();" class="Button">关闭</a>
				</div>
			</form>
		</div>
	</div>
</body>
</html>

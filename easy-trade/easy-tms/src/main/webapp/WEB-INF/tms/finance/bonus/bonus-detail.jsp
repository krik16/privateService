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
<div class="coupon-min-width" style="height: 100%;">
		<div class="coupon">
			<div class="coupon-title">财务管理>考核奖金详情</div>
			<form id="account_form" name="account_form" action=""
				method="post">
				<div class="coupon-main">
					<div class="coupon-new">
						<input type="hidden" name="id" class="accountId"
							value="<c:out value='${bonus.id}'/>"> </input>
						<div class="coupon-new-title">考核奖金详情</div>
						<div class="w_100">
							<ul>
								<li class="li1">卖家账号：</li>
								<li class="li2"><span class="msg">${bonus.sellerAccount}</span>
								</li>
								<li class="li1">渠道：</li>
								<li class="li2">
									<c:if test="${bonus.guideType==1 }">商家</c:if>
									<c:if test="${bonus.guideType==2 }">买手</c:if>
								</li>
								<li class="li1">金额：</li>
								<li class="li2">${bonus.amount}</li>
								<li class="li1" >备注：</li>
								<li class="li2"  >${bonus.marks}</li>
							</ul>
							<ul>
								<li class="li1">考核方式：</li>
								<li class="li2">
									<c:if test="${bonus.bonusType==1 || bonus.bonusType == 3}">奖励</c:if>
									<c:if test="${bonus.bonusType==2 || bonus.bonusType == 4}">惩罚</c:if>
								</li>
									<li class="li1">类型：</li>
								<li class="li2">
									<c:if test="${bonus.bonusType==1 || bonus.bonusType == 2}">交易佣金</c:if>
									<c:if test="${bonus.bonusType==3 || bonus.bonusType == 4}">验码佣金</c:if>
								</li>
								<li class="li1">审核：</li>
								<li class="li2">
									<c:if test="${bonus.status <0}">审核未通过</c:if>
									<c:if test="${bonus.status == 0}">未审核</c:if>
									<c:if test="${bonus.status == 1}">通过</c:if>
									<c:if test="${bonus.status == 2}">已成功打钱</c:if>
								</li>
							</ul>
							
						</div>
						<div style="color: red;font-size: 16px;">
							<c:if test="${bonus.status<0 }">
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

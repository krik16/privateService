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
<script type="text/javascript" src="${ctx}/js/fancyBox/source/jquery.fancybox.js?v=2.1.5"></script>
	<link rel="stylesheet" type="text/css" href="${ctx}/js/fancyBox/source/jquery.fancybox.css?v=2.1.5" media="screen" />

	<!-- Add Button helper (this is optional) -->
	<link rel="stylesheet" type="text/css" href="${ctx}/js/fancyBox/source/helpers/jquery.fancybox-buttons.css?v=1.0.5" />
	<script type="text/javascript" src="${ctx}/js/fancyBox/source/helpers/jquery.fancybox-buttons.js?v=1.0.5"></script>
<script>
$('.fancybox').fancybox();
$('.fancybox-buttons').fancybox({
	openEffect  : 'none',
	closeEffect : 'none',

	prevEffect : 'none',
	nextEffect : 'none',

	closeBtn  : false,

	helpers : {
		title : {
			type : 'inside'
		},
		buttons	: {}
	},

	afterLoad : function() {
		
		this.title = 'Image ' + (this.index + 1) + ' of ' + this.group.length + (this.title ? ' - ' + this.title : '');
	}
});
</script>
</head>
<body>
<div class="coupon-min-width">
		<div class="coupon">
			<div class="coupon-title">商家服务>返佣详情</div>
			<form id="account_form" name="account_form" action=""
				method="post">
				<div class="coupon-main">
					<div class="coupon-new">
						<input type="hidden" name="id" class="accountId"
							value="<c:out value='${apply.id}'/>"> </input>
						<div class="coupon-new-title">返佣详情</div>
						<div class="w_100">
							<ul>
								<li class="li1">返佣流水号：</li>
								<li class="li2"><span class="msg">${apply.id+100000000 }</span>
								</li>

								<li class="li1">订单号：</li>
								<li class="li2">${apply.orderNo}</li>
								<li class="li1">商场：</li>
								<li class="li2">${apply.mallName }</li>
								<li class="li1">卖家账号：</li>
								<li class="li2">${apply.sellerAccount }</li>
								<li class="li1" style="color: red;font-size: 16px;">返佣金额：</li>
								<li class="li2" style="color: red;font-size: 16px;" >${apply.commissionAmount}</li>

							</ul>
							<ul>
								<li class="li1">小票上传时间：</li>
								<li class="li2"><fmt:formatDate value='${apply.picUploadAt}'
										pattern='yyyy-MM-dd HH:mm:ss' /></li>
								<li class="li1">审核：</li>
								<li class="li2"><c:choose>
										<c:when test="${apply.status==6 }">财务审核通过</c:when>
										<c:when test="${apply.status==5 }">财务审核通过</c:when>
										<c:when test="${apply.status==4 }">财务审核通过</c:when>
										<c:when test="${apply.status==3 }">财务审核通过</c:when>
										<c:when test="${apply.status==2 }">客服审核通过</c:when>
										<c:when test="${apply.status==1 }">未审核</c:when>
										<c:when test="${apply.status==-1 }">客服审核未通过</c:when>
										<c:when test="${apply.status==-2 }">财务审核未通过</c:when>
										
									</c:choose></li>
								<li class="li1">店铺：</li>
								<li class="li2">${apply.shopName}</li>
								<li class="li1">卖家姓名：</li>
								<li class="li2">${apply.sellerName }</li>
								<li class="li1">返佣状态：</li>
								<c:choose>
									<c:when test="${apply.status eq 6 }">
										<li class="li2">已到账</li>
									</c:when>
									<c:otherwise>
										<li class="li2">未到账</li>
									</c:otherwise>
								</c:choose>
							</ul>
							
						</div>
						<div style="color: red;font-size: 16px;">
								<c:if test="${apply.status<0 }">
								审核未通过理由：${ apply.reason}
								</c:if>
						</div>
						<div class="coupon-new-title">小票图片</div>
						<div>
							<c:set value="${ fn:split(apply.picUrls, ';') }" var="urls" />
				 			<c:forEach items="${urls }" var="url">
				 				
				 				<a  class="fancybox-buttons" data-fancybox-group="button" href="${url }"><img width="50" height="50"  src="${url }" alt="点击放大" /></a>
				 			</c:forEach>
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

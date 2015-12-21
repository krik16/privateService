<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/_include/_jsp_tags.jsp"%>
<%@include file="/_include/_jsp_variable.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>容易账号管理系统</title>

<link href="${ctx}/css/jquery-ui3.css" type="text/css" rel="stylesheet" />
<link href="${ctx}/css/jquery.timepicker3.css" type="text/css"
	rel="stylesheet" />
<!-- 日期控件css -->
<link href="${ctx}/css/index3.css" type="text/css" rel="stylesheet" />
<link href="${ctx}/css/index.css" type="text/css" rel="stylesheet" />
</head>

</head>
<body>
	<div class="coupon-min-width">
		<div class="coupon">
			<div class="coupon-title">提现明细>提现详情</div>
			<form id="account_form" name="account_form" action="${ctx}/push/save"
				method="post">
				<div class="coupon-main">
					<div class="coupon-new">
						<input type="hidden" name="id" class="accountId"
							value="<c:out value='${apply.id}'/>"> </input>
						<div class="coupon-new-title">提现详情</div>
						<div class="w_100">
							<ul>
								<li class="li1">交易流水号：</li>
								<li class="li2"><span class="msg">${apply.tradeNo }</span>
								</li>

								<li class="li1">提现流水号：</li>
								<li class="li2">${apply.drawNo}</li>
								
								<li class="li1">商场：</li>
								<li class="li2">${apply.mallName }</li>
								<li class="li1">卖家账号：</li>
								<li class="li2">${apply.sellerAccount }
									（<span style="color:red">余额：${balance }</span>）</li>
								<li class="li1">
									<c:if test="${apply.payType==0 }">卖家支付宝账号：</c:if>
									<c:if test="${apply.payType==1 }">卖家银行卡账号：</c:if>
								</li>
								<li class="li2">${apply.payAccount }</li>
								<li class="li1">提现金额：</li>
								<li class="li2" style="color:red">${apply.drawAmount}</li>

							</ul>
							<ul>
								<li class="li1">交易时间：</li>
								<li class="li2"><fmt:formatDate value='${apply.tradeAt}'
										pattern='yyyy-MM-dd HH:mm:ss' /></li>
								<li class="li1">打款方式：</li>
								<li class="li2"><c:choose>

										<c:when test="${apply.payType==0 }">支付宝</c:when>
										<c:when test="${apply.payType==1 }">银行卡</c:when>
									</c:choose></li>
								<li class="li1">店铺：</li>
								<li class="li2">${apply.shopName}</li>
								<li class="li1">卖家姓名：</li>
								<li class="li2">${apply.sellerName }</li>
								<li class="li1">
									<c:if test="${apply.payType==0 }">卖家支付宝姓名：</c:if>
									<c:if test="${apply.payType==1 }">卖家银行卡姓名：</c:if>
								</li>
								<li class="li2">${apply.payName }</li>
								<li class="li1">渠道：</li>
								<li class="li2">
									<c:if test="${apply.guideType==1 }">商家</c:if>
									<c:if test="${apply.guideType==2 }">买手</c:if>
								</li>
							</ul>
						</div>
					</div>
				</div>

				<div class="shopsButton">
					<a href="javascript:history.back()" class="Button">返回</a>
				</div>
			</form>
		</div>
	</div>

	</div>
</body>
</html>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/_include/_jsp_tags.jsp"%>
<%@include file="/_include/_jsp_variable.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>容易会员管理后台</title>
<link href="${ctx}/css/jquery-ui.css" type="text/css" rel="stylesheet" />
<link href="${ctx}/css/index2.css" type="text/css" rel="stylesheet" />

<link href="${ctx}/css/index3.css" type="text/css" rel="stylesheet" />
<script src="${ctx}/js/jquery/jquery.js" type="text/javascript"></script>
<script src="${ctx}/js/jquery/jquery-ui.js" type="text/javascript"></script>

<script src="${ctx}/js/jquery/jquery.nicescroll.js"
	type="text/javascript"></script>

<script src="${ctx}/js/util/bootstrap/bootstrap.min.js"
	type="text/javascript"></script>
<script src="${ctx}/js/util/util.js" type="text/javascript"></script>
<style type="text/css">
body {
	background: #FFF;
}

.max-input {
	width: 135px;
}

.brandLinkList {
	height: 182px;
}

.shopsImg .pic .cancel {
	/* 	top:0px; */
	/* 	right:0px; */
	z-index: 0;
}

.shops-main-left {
	width: 424px;
}

.errorData {
	color: red;
}
</style>
</head>
<body>

	<div class="role-min-width">
		<div class="role">
			<c:if test="${abnormal.id != null}">
				<div class="role-title">异常支付> 修改异常支付</div>
			</c:if>
			<c:if test="${abnormal.id == null}">
				<div class="role-title">异常支付> 新建异常支付</div>
			</c:if>
			<form id="account_form" name="account_form"
				action="${ctx}/bonus/update" method="post">
				<div class="role-main">
					<div class="role-new">
						<input type="hidden" name="id" class="accountId"
							value="<c:out value='${abnormal.id == null ? 0 : abnormal.id}'/>">
						</input>
						<ul>

							<li class="w_100 lvse size-14">异常支付信息</li>
							<li class="name">买家账号：</li>

							<li class="detail"><input id="account" name="userAccount"
								type="text" value="${abnormal.userAccount}" check="1"
								onblur="checkAccount(this.value)" /> <span class="msg">(*请输入支付异常的买家账号)</span>
								<span style="width: 80px">订单号：</span> <input id="orderNo"
								name="orderNo" type="text" value="${abnormal.orderNo}" /> <span
								class="msg">(*请输入出现支付异常的订单号)</span></li>
							<li class="name">金额：</li>
							<li class="detail"><input id="amount" name="amount"
								type="text" value="${abnormal.amount}" check="1"
								onblur="checkAmount(this.value)" /> <span class="msg">(*请输入数字，小数点后面保留2位)</span>
								<span style="width: 80px">打款方式：</span> <select id="paymentType"
								name="paymentType">
									<c:choose>
										<c:when test="${abnormal!=null &&abnormal.paymentType==0}">
											<option value="0" selected="selected">支付宝</option>
											<option value="1">银行卡</option>
										</c:when>
										<c:when test="${abnormal!=null &&abnormal.paymentType==1}">
											<option value="0">支付宝</option>
											<option value="1" selected="selected">银行卡</option>
										</c:when>
										<c:otherwise>
											<option value="0" selected="selected">支付宝</option>
											<option value="1">银行卡</option>
										</c:otherwise>
									</c:choose>

							</select></li>

							<li class="name">支付账号：</li>
							<li class="detail"><input id="paymentAccount"
								name="paymentAccount" type="text"
								value="${abnormal.paymentAccount}" /> <span class="msg">(*请输入进行支付的账号)</span>
								<span style="width: 80px">账号姓名：</span> <input id="paymentName"
								name="paymentName" type="text" value="${abnormal.paymentName}" />
								<span class="msg">(*请输入支付账号对应开户人姓名)</span></li>

							<li class="name">支付银行：</li>
							<li class="detail"><input id="paymentBank"
								name="paymentBank" type="text" value="${abnormal.paymentBank}" />
								<span class="msg">(*请输入支付账号对应银行(仅当支付类型为银行卡时))</span></li>

							<li class="name">备注：</li>
							<li class="detail"><textarea rows="10" cols="10"
									id="remarks" name="remarks">${abnormal.remarks}</textarea></li>
						</ul>

					</div>
				</div>
				<div class="shopsButton">
					<a href="javascript:history.back()" class="Button">返回</a> <a
						href="JavaScript:void(0);" style="margin-left: 20px;"
						class="Button saveAccount  checked" id="save">保存</a>
				</div>
			</form>
		</div>
	</div>
	<div class="MsgBoxBg"></div>
	<div class="MsgBoxConfirm">
		<div class="MsgBoxTitle">提示</div>
		<div class="MsgBoxMain">
			<p></p>
			<a href="javascript:;" class="Button cancel">取消</a> <a
				href="javascript:void(0);" class="Button checked" id="MsgBoxBtn">确定</a>
		</div>
	</div>

	<div class="MsgBoxTip">
		<div class="MsgBoxTitle">提示</div>
		<div class="MsgBoxMain">
			<p></p>
			<a style="margin: 0 auto; display: block; float: none;"
				href="javascript:;" class="Button checked" id="MsgBoxTipBtn">确定</a>
		</div>
	</div>
</body>
<script type="text/javascript">
	$("#save").click(function() {
		var id = $("input:[name='id']").val();
		if ($("#amount").attr("check") == 0) {
			_util.cmsTip("请输入正确的金额，小数点后面保留2位!");
			return;
		}
		var userAccount = $("input:[name='userAccount']").val();
		if (!userAccount) {
			_util.cmsTip("请输入买家账号!");
			return;
		}
		var orderNo = $("input:[name='orderNo']").val();
		if (!orderNo) {
			_util.cmsTip("请输入订单号!");
			return;
		}
		var paymentType = $("select:[name='paymentType']").val();
		if (!paymentType) {
			_util.cmsTip("请选择打款方式!");
			return;
		}
		var paymentAccount = $("input:[name='paymentAccount']").val();
		if (!paymentAccount) {
			_util.cmsTip("请输入支付账号!");
			return;
		}
		var paymentBank = $("input:[name='paymentBank']").val();
		if (!paymentBank && paymentType == 1) {
			_util.cmsTip("请输入支付账号银行!");
			return;
		}
		var paymentName = $("input:[name='paymentName']").val();
		if (!paymentName) {
			_util.cmsTip("请输入账号姓名!");
			return;
		}
		var amount = $("input:[name='amount']").val();
		if (!amount) {
			_util.cmsTip("请输入金额!");
			return;
		} else if (amount <= 0) {
			_util.cmsTip("输入金额必须大于零!");
			return;
		}
		var remarks = $("textarea:[name='remarks']").val();
		if (!remarks) {
			_util.cmsTip("请输入备注!");
			return;
		}
		$.post("../ab/update", {
			id : id,
			userAccount : userAccount,
			orderNo : orderNo,
			paymentType : paymentType,
			paymentAccount : paymentAccount,
			paymentBank : paymentBank,
			paymentName : paymentName,
			remarks : remarks,
			amount : amount
		}, function(data) {
			if (data.success == true) {
				_util.cmsTip("操作成功!");
				window.history.go(-1);
			} else {
				_util.cmsTip(data.message);
			}
		}, "json")
	})
	function checkAccount(value) {
		if (value.replace(/(^\s*)|(\s*$)/g, "") == "") {
			$("#account").next(".msg").css("color", "red");
			$("#account").attr("check", "0");
			return;
		} else {
			$("#account").next(".msg").css("color", "#9c9c9c");
			$("#account").attr("check", "1");
		}
	}
	function checkAmount(value) {
		var reg = /^\+?(\d*\.\d{2})$/;
		if (value.replace(/(^\s*)|(\s*$)/g, "") == "" || !reg.test(value)) {
			$("#amount").next(".msg").css("color", "red");
			$("#amount").attr("check", "0");
			return;
		} else {
			$("#amount").next(".msg").css("color", "#9c9c9c");
			$("#amount").attr("check", "1");
		}
	}
</script>
</html>


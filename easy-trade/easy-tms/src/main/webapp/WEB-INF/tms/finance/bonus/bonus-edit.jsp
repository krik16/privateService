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
	height : 182px;
}
.shopsImg .pic .cancel {
/* 	top:0px; */
/* 	right:0px; */
	z-index:0;
}
.shops-main-left {
	width: 424px;
}

.errorData{
	color: red;
}
</style>
</head>
<body>
	<div class="role-min-width">
		<div class="role">
			<c:if test="${bonus.id != null}"><div class="role-title">考核奖金> 修改考核奖金</div></c:if>
			<c:if test="${bonus.id == null}"><div class="role-title">考核奖金> 新建考核奖金</div></c:if>
			<form id="account_form" name="account_form" action="${ctx}/bonus/update" method="post">
			<div class="role-main">
				<div class="role-new">
					<input type="hidden" name="id" class="accountId" value="<c:out value='${bonus.id}'/>"> </input>
					<ul>
						
						<li class="w_100 lvse size-14">卖家账号</li>
						<li class="detail" >
								<input id="account" name="sellerAccount" type="text" value="${bonus.sellerAccount}" onblur="checkAccount(this.value)"/>
								<span class="msg" >(*请输入卖家账号)</span>
								<span style="width:80px">考核方式：</span>
									<select id="type" name="type">
										<c:choose>
											<c:when test="${bonus==null }">
												<option value="1">奖励</option>
												<option value="2">惩罚</option>
											</c:when>
											<c:when test="${bonus!=null &&(bonus.bonusType==1 || bonus.bonusType==3)}">
												<option value="1" selected="selected">奖励</option>
												<option value="2">惩罚</option>
											</c:when>
											<c:when test="${bonus!=null &&(bonus.bonusType==2 || bonus.bonusType==4)}">
												<option value="1" >奖励</option>
												<option value="2" selected="selected">惩罚</option>
											</c:when>
										</c:choose>
									</select>
						</li>
						<li  class="w_100 lvse size-14">
							金额
						</li>
						<li class="detail" >
								<input id="amount" name="amount" type="text" value="${bonus.amount}" onblur="checkAmount(this.value);"/>
								<span class="msg">(*请输入数字，小数点后面保留2位)</span>
									<span style="width:80px">类型：</span>
									<select id="operateType" name="operateType">
										<c:choose>
											<c:when test="${bonus eq null }">
												<option value="1">交易佣金</option>
												<option value="2">验码佣金</option>
											</c:when>
											<c:when test="${bonus!=null &&(bonus.bonusType==1||bonus.bonusType==2)}">
												<option value="1" selected="selected">交易佣金</option>
												<option value="2">验码佣金</option>
											</c:when>
											<c:otherwise>
												<option value="1" >交易佣金</option>
												<option value="2" selected="selected">验码佣金</option>
											</c:otherwise>
										</c:choose>
									</select>
						</li>
						<li class="detail" >
								<span style="width:80px">渠道：</span>
								<select id="guideType" name="">
									<c:choose>
										<c:when test="${bonus==null }">
											<option value="1" selected>商家</option>
											<option value="2">买手</option>
										</c:when>
										<c:when test="${bonus!=null}">
											<option value="1" <c:if test="${bonus.guideType==1 }">selected="selected"</c:if>>商家</option>
											<option value="2" <c:if test="${bonus.guideType==2 }">selected="selected"</c:if>>买手</option>
										</c:when>
									</c:choose>
								</select>
						</li>
						
						<li class="w_100 lvse size-14">备注</li>
						<li class="detail" >
								<textarea rows="10" cols="10" id="marks" name="marks">${bonus.marks}</textarea>
						</li>
					</ul>
				
				</div>
			</div>
			<div class="shopsButton">
				<a href="javascript:history.go(-1);" class="Button">返回</a>
				<a href="JavaScript:void(0);" style="margin-left: 20px;" class="Button saveAccount  checked" id="save">保存</a>
			</div>
			</form>
		</div>
	</div>
	<div class="MsgBoxBg"></div>
	<div class="MsgBoxConfirm">
		<div class="MsgBoxTitle">提示</div>
		<div class="MsgBoxMain">
			<p></p>
			<a href="javascript:;" class="Button cancel">取消</a>
			<a href="javascript:void(0);" class="Button checked" id="MsgBoxBtn">确定</a>
		</div>
	</div>
	
	<div class="MsgBoxTip">
	    <div class="MsgBoxTitle">提示</div>
	    <div class="MsgBoxMain">
		<p></p>
		<a style="margin: 0 auto;display: block;float: none;" href="javascript:;" class="Button checked" id="MsgBoxTipBtn">确定</a>
		</div>
	</div> 
</body>
<script type="text/javascript">
var originalSellerAccount=$("input:[name='sellerAccount']").val();
var originalType=$("select:[name='type']").val();
var originalAmount=$("input:[name='amount']").val();
var originalMarks=$("textarea:[name='marks']").val();
var originalOperateType = $("select:[name='operateType']").val();
var originalGuideType = $("#guideType").val();
	$("#save").click(function(){
		var id=$("input:[name='id']").val();
		var laterSellerAccount=$("input:[name='sellerAccount']").val();
		var laterType=$("select:[name='type']").val();
		var laterAmount=$("input:[name='amount']").val();
		var laterMarks=$("textarea:[name='marks']").val();
		var guideType = $("#guideType").val();
		var operateType = $("select:[name='operateType']").val();
		var type,marks,amount,temp=0;
		if(laterSellerAccount==originalSellerAccount){
			temp++;
		}
			sellerAccount=laterSellerAccount;
		
		if(laterType==originalType&&id!=""){
			temp++;
		}
			type=laterType;
		
		if(laterAmount==originalAmount){
			temp++;
		}
			amount=laterAmount;
		
		if(originalMarks==laterMarks){
			temp++;
		}
			marks=laterMarks;
		if(operateType == originalOperateType){
			temp++;
		}
		if(originalGuideType == guideType){
			temp++;
		}
			
		if(temp==6){
			_util.cmsTip("未作任何修改！!");
			return; 
		}
		if(parseFloat(amount)==0){
			_util.cmsTip("金额不能为0");
			return;
		}
		var reg = /^\+?(\d*\.\d{2})$/;
		if(amount.replace(/(^\s*)|(\s*$)/g, "")==""||!reg.test(amount)){
			_util.cmsTip("金额不正确，请重新输入！");
			return;
		}
		if(sellerAccount.replace(/(^\s*)|(\s*$)/g, "")==""){
			_util.cmsTip("账号不为空！");
			return;
		}
		$.get("../bonus/update",{id:id,sellerAccount:sellerAccount,type:type,marks:marks,amount:amount,operateType:operateType,guideType:guideType},
			function(data){
				if (data.success == true) {
					_util.cmsTip("操作成功!");
					window.history.go(-1);
				} else {
					if(data.code=='-20'){
						_util.cmsTip("您输入的账号有误，请重新输入");
					}else if(data.code=='-21'){
						_util.cmsTip("该账号的虚拟账户不存在");
					}else if(data.code=='-26'){
						_util.cmsTip("卖家的提现账户已被停用，无法对该账户进行操作");
					}else if(data.code=='-17'){
						_util.cmsTip("数据更新异常");
					}else if(data.code=='-11'){
						_util.cmsTip("系统故障");
					}else if(data.code=='-13'){
						_util.cmsTip("必要参数传递有误！");
					}else if(data.code=='-22'){
						_util.cmsTip("该账号已经被停用，无法对该账户进行操作！");
					}else{
						_util.cmsTip("未知异常！");
					}
				}
			},"json"		
		)
	})
	function checkAccount(value){
		if(value.replace(/(^\s*)|(\s*$)/g, "")==""){
			$("#account").next(".msg").css("color","red");
			return;
		}else{
			$("#account").next(".msg").css("color","#9c9c9c");
		}
	}
	function checkAmount(value){
		var reg = /^\+?(\d*\.\d{2})$/;
		if(value.replace(/(^\s*)|(\s*$)/g, "")==""||!reg.test(value)){
			$("#amount").next(".msg").css("color","red");
		}else{
			$("#amount").next(".msg").css("color","#9c9c9c");
		}
		if(parseFloat(value)==0){
			_util.cmsTip("金额不能为0");
		}
	}
	
</script>
</html>


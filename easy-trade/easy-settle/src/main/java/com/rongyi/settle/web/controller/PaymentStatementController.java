/**
 * @Copyright (C),上海容易网电子商务有限公司	
 * @Author: 柯军 
 * @datetime:2015年9月21日上午11:15:53
 * @Description: TODO
 *
 **/

package com.rongyi.settle.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.rongyi.core.bean.ResponseData;

/**	
 * @Author:  柯军
 * @Description: 对账单列表 
 * @datetime:2015年9月21日上午11:15:53
 *
 **/
@Controller
@RequestMapping("/paymentStatement")
public class PaymentStatementController {

	@RequestMapping("/list")
	public ResponseData list(){
		return null;
	}
	
	@RequestMapping("/generate")
	public ResponseData generate(){
		return null;
	}
	
	@RequestMapping("/info")
	public ResponseData info(){
		return null;
	}
	
	@RequestMapping("/verify")
	public ResponseData verify(){
		return null;
	}
	
	@RequestMapping("/exportFinanceExcel")
	public ResponseData exportFinanceExcel(){
		return null;
	}
}


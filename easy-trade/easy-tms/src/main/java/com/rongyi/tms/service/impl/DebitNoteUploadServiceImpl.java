/** 
 * @Title: DebitNoteUploadServiceImpl.java 
 * @Package com.rongyi.tms.service.impl 
 * @Description: 佣金关联小票上传接口实现
 * @author 郑亦梁  zhengyiliang@rongyi.com
 * @date 2015年5月22日 下午3:17:57 
 * @version V1.0   
 * Copyright (C),上海容易网电子商务有限公司
 */
package com.rongyi.tms.service.impl;

import com.rongyi.core.bean.ResponseResult;
import com.rongyi.core.enumerate.CodeEnum;
import com.rongyi.easy.tms.entity.SalesCommission;
import com.rongyi.easy.tms.entity.SalesCommissionAuditLog;
import com.rongyi.easy.tms.vo.DebitNoteVO;
import com.rongyi.rss.tms.DebitNoteUploadService;
import com.rongyi.tms.service.SalesCommissionAuditLogService;
import com.rongyi.tms.service.SalesCommissionService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Date;

/**
 * @author ZhengYl
 * 
 */
@Service
public class DebitNoteUploadServiceImpl implements DebitNoteUploadService {
	private Logger logger = LoggerFactory.getLogger(getClass());

	@Autowired
	private SalesCommissionService salesCommissionService;
	
	@Autowired
	private SalesCommissionAuditLogService salesCommissionAuditLogService;

	/* (non-Javadoc) 
	* @param pic_urls
	* @param orderNo
	* @param userId
	* @return 
	* @see com.rongyi.rss.tms.DebitNoteUploadService#uploadDebitNote(java.lang.String, java.lang.String, java.lang.String) 
	*/
	@Override
	public ResponseResult uploadDebitNote(String pic_urls, String orderNo, String userId) {
		logger.info(">>>>>>>>>小票上传开始,pic_urls={},orderNo={},userId={}",pic_urls,pic_urls,userId);
		ResponseResult result = new ResponseResult();
		
		try {
			SalesCommission salesCommission = salesCommissionService.selectByOrderNo(orderNo);
			if (salesCommission == null) {
				salesCommission = new SalesCommission();
				salesCommission.setPicUploadAt(new Date());
			} else if (salesCommission.getStatus() == 3 || salesCommission.getStatus() == 4 || salesCommission.getStatus() == 5) {
				//审核中的小票不能再次上传
				result.setCode(CodeEnum.ERROR_DEBIT_NOTE_STAUTS.getActionCode());
				result.setMessage(CodeEnum.ERROR_DEBIT_NOTE_STAUTS.getMessage());
				result.setSuccess(false);
				result.setInfo(null);
				logger.error(">>>>>>>>>小票状态不正确，结束");
				return result;
			}
			if(salesCommission.getUpdateDate() == null){
				salesCommission.setPicUploadAt(new Date());
			}

			salesCommission.setPicUrls(pic_urls);
			salesCommission.setOrderNo(orderNo);
			salesCommission.setGuideId(userId);
			salesCommission.setStatus(1);

			if (salesCommission.getId() != null) {
				// 记录存在
				salesCommissionService.updateByOrderNo(salesCommission);
			} else {
				// 记录不存在，佣金未生成
				salesCommissionService.insert(salesCommission);
			}
			result.setCode(CodeEnum.SUCCESS.getActionCode());
			result.setMessage("小票上传成功");
			result.setInfo(null);
			result.setSuccess(true);

		} catch (Exception e) {
			result.setCode(CodeEnum.ERROR_DEBIT_NOTE.getActionCode());
			result.setMessage(CodeEnum.ERROR_DEBIT_NOTE.getMessage());
			result.setSuccess(false);
			result.setInfo(null);
			e.printStackTrace();
			logger.error(e.getMessage());
		}

		logger.debug(">>>>>>>>>小票上传结束");
		return result;
	}


	/* (non-Javadoc) 
	* @param orderNo
	* @return 
	* @see com.rongyi.rss.tms.DebitNoteUploadService#queryDebitNote(java.lang.String) 
	*/
	@Override
	public ResponseResult queryDebitNote(String orderNo) {
		logger.info("queryDebitNote:orderNo={}",orderNo);
		ResponseResult result = new ResponseResult();
		
		try {
			SalesCommission salesCommission = salesCommissionService.selectByOrderNo(orderNo);
			logger.info("queryDebitNote:salesCommission={}",salesCommission);
			if (salesCommission == null) {
				// 未查到数据
				result.setCode(CodeEnum.SUCCESS.getActionCode());
				result.setMessage(CodeEnum.SUCCESS.getMessage());
				result.setSuccess(true);
				DebitNoteVO debitNoteVO= new DebitNoteVO();
				debitNoteVO.setTicketStatus(0);
				result.setInfo(debitNoteVO);
				return result;
			} else {
				DebitNoteVO debitNoteVO= new DebitNoteVO();
				debitNoteVO.setOrderNo(orderNo);
				
				Integer status = salesCommission.getStatus();
				if(status == 1 || status == 2)  // 1：已提交，2：一级审核通过
					status = 1;  
				if (status >= 3) // 3：二级审核，4：已到账
					status = 2;
				if (status < 0) // -1，-2：审核未通过
					status = 3;
				debitNoteVO.setTicketStatus(status);
				
				// 未通过时查询未通过原因
				if (status == 3) {
					SalesCommissionAuditLog log = salesCommissionAuditLogService.selectFailedLog(salesCommission.getId());
					if(log != null)
					debitNoteVO.setRefuseReason(log.getMemo());
				}
				
				// 图片URL分割
				if(salesCommission.getPicUrls() != null){
					debitNoteVO.setTicketPicList(Arrays.asList(salesCommission.getPicUrls().split(";")));
				}
				
				result.setInfo(debitNoteVO);
				result.setCode(CodeEnum.SUCCESS.getActionCode());
				result.setMessage(CodeEnum.SUCCESS.getMessage());
				result.setSuccess(true);
			}
		} catch (Exception e) {
			result.setCode(CodeEnum.ERROR_SYSTEM.getActionCode());
			result.setMessage(CodeEnum.ERROR_SYSTEM.getMessage());
			result.setSuccess(false);
			result.setInfo(null);
			e.printStackTrace();
			logger.error(e.getMessage());
			return result;
		}
		return result;
	}
}

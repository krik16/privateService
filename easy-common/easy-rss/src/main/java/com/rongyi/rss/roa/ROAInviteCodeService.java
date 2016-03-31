package com.rongyi.rss.roa;

import java.util.List;
import java.util.Map;

import com.rongyi.easy.merchant.entity.ApplyRecordEntity;
import com.rongyi.easy.merchant.entity.InviteCodeEntity;
import com.rongyi.easy.rmmm.vo.merchant_inviteCode.InviteCodeVO;

public interface ROAInviteCodeService {
	
	/**
	 * 验证邀请码
	 * @param code
	 * @throws Exception
	 */
	public boolean validationInviteCode(String code) throws Exception;

	/**
	 * 验证邀请码
	 * @param code
     * @param type  用户类型  1商家  2买手
	 * @throws Exception
	 */
	public boolean validationInviteCode(String code,Integer type) throws Exception;
	/**
	 * 生成邀请码并将数据存入数据库
	 * @param paramsMap
	 * @throws Exception
	 */
	public void insertInviteCode(Map<String, Object> paramsMap) throws Exception;

	/**
	 * 根据邀请码获取信息
	 * @param inviteCode
	 * @return
	 * @throws Exception
	 */
	public InviteCodeEntity getByCode(String inviteCode)throws Exception;

	/**
	 * 根据邀请码 进行更新
	 * @param inviteCode
	 * @throws MallShopException
	 */
	public Integer UpdateByCode(String inviteCode,Integer userId) throws Exception;

	/**
	 * 查邀请码申请记录表数据数量
	 * @return
	 * @throws Exception
	 */
	public Integer getTotalRecord() throws Exception;
	/**
	 * 获取申请记录表列表信息
	 * @return
	 * @throws Exception
	 */
	public List<ApplyRecordEntity> getAllApplyRecordInfo(Map<String,Object> paramMap) throws Exception;
	/**
	 * 根据申请人账号查邀请码申请记录表数据数量
	 * @param paramMap
	 * @return
	 * @throws Exception
	 */
	public Integer getTotalRecordByProposerAccount(Map<String,Object> paramMap) throws Exception;
	/**
	 * 根据申请人账号查邀请码申请记录表信息
	 * @param paramMap
	 * @return
	 * @throws Exception
	 */
	public List<ApplyRecordEntity> getApplyRecordInfoByProposerAccount(Map<String,Object> paramMap) throws Exception;
	/**
	 * 根据申请记录表id查对应的已使用的邀请码的数量
	 * @param paramMap
	 * @return
	 * @throws Exception
	 */
	public Integer getUsedTotalRecord(Integer applyId) throws Exception;
	/**
	 * 根据申请记录表id查对应的已作废的邀请码的数量
	 * @param paramMap
	 * @return
	 * @throws Exception
	 */
	public Integer getInvalidTotalRecord(Integer applyId) throws Exception;
	/**
	 * 根据申请记录表id将剩余的邀请码状态变为0（作废）
	 * @param applyId
	 * @throws Exception
	 */
	public void updateInviteCodeToInvalid(Integer applyId) throws Exception;
	/**
	 * 根据申请记录表id获取对应的要导出的信息
	 * @param applyId
	 * @return
	 * @throws Exception
	 */
	public List<InviteCodeVO> getInviteCodeVOList(Integer applyId) throws Exception;
	/**
	 * 根据申请记录表的id查所有对应的邀请码
	 * @param applyId
	 * @return
	 * @throws Exception
	 */
	public List<InviteCodeEntity> getInviteCodeInfoByApplyId(Integer applyId) throws Exception;
	public Integer insertInviteCode2(Map<String, Object> paramMap) throws Exception;
}

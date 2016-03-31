package com.rongyi.easy.rmmm.vo.draw;

import java.io.Serializable;
import java.util.List;

import com.rongyi.easy.rmmm.vo.NodeVO;

/**
* @ClassName: DrawDetailVO
* @Description: TODO(提现记录VO)
* @author lqy
* @date 2015年5月29日 上午9:47:24
*
*/
public class DrawDetailVO implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * @Fields date : TODO(时间 2015.02.08 11:14:12)
	 */
	private String date;
	/**
	 * @Fields from : TODO(提现账号)
	 */
	private String accountNo;
	/**
	 * @Fields amount : TODO(金额)
	 */
	private String amount;
	/**
	 * @Fields status : TODO(状态: 全部[0] 已发放[1] 处理中[2] 失败[3])
	 */
	private String status;
	
	private Integer drawId;//提现记录id
	
	private List<NodeVO> nodeList;// 节点数据

	

	public List<NodeVO> getNodeList() {
		return nodeList;
	}

	public void setNodeList(List<NodeVO> nodeList) {
		this.nodeList = nodeList;
	}

	public Integer getDrawId() {
		return drawId;
	}

	public void setDrawId(Integer drawId) {
		this.drawId = drawId;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "DrawDetailVO [date=" + date + ", accountNo=" + accountNo + ", amount=" + amount + ", status=" + status
				+ ", drawId=" + drawId + ", nodeList=" + nodeList + "]";
	}

}

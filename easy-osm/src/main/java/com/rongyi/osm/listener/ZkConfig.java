/** 
* @Title: ZkConfig.java 
* @Package com.rongyi.osm.listener 
* @Description: TODO
* @author 郑亦梁  zhengyiliang@rongyi.com
* @date 2015年6月18日 下午3:35:27 
* @version V1.0   
* Copyright (C),上海容易网电子商务有限公司
*/
package com.rongyi.osm.listener;

/**
 * @author ZhengYl
 *
 */
public class ZkConfig {

	/** zookeeper地址 */
	private String zkAddress;

	/** osm根节点 */
	private String zkNodeRoot;

	/** 监视节点 */
	private String zkMonitor;

	/** 本机节点 */
	private String zkEgo;

	/** 本机节点信息 */
	private String zkNodeInfo;
	
	/** 当前节点路径 */
	private String currentNodePath;

	/** 当前节点序列 */
	private long currentNodeSequence;
	
	public long getCurrentNodeSequence() {
		return currentNodeSequence;
	}

	public void setCurrentNodeSequence(long currentNodeSequence) {
		this.currentNodeSequence = currentNodeSequence;
	}

	public String getZkAddress() {
		return zkAddress;
	}

	public void setZkAddress(String zkAddress) {
		this.zkAddress = zkAddress;
	}

	public String getZkNodeRoot() {
		return zkNodeRoot;
	}

	public void setZkNodeRoot(String zkNodeRoot) {
		this.zkNodeRoot = zkNodeRoot;
	}

	public String getZkMonitor() {
		return zkMonitor;
	}

	public void setZkMonitor(String zkMonitor) {
		this.zkMonitor = zkMonitor;
	}

	public String getZkEgo() {
		return zkEgo;
	}

	public void setZkEgo(String zkEgo) {
		this.zkEgo = zkEgo;
	}

	public String getZkNodeInfo() {
		return zkNodeInfo;
	}

	public void setZkNodeInfo(String zkNodeInfo) {
		this.zkNodeInfo = zkNodeInfo;
	}

	public String getCurrentNodePath() {
		return currentNodePath;
	}

	public void setCurrentNodePath(String currentNodePath) {
		this.currentNodePath = currentNodePath;
	}

	/**
	 * @param zkAddress
	 * @param zkNodeRoot
	 * @param zkMonitor
	 * @param zkEgo
	 * @param zkNodeInfo
	 */
	ZkConfig(String zkAddress, String zkNodeRoot, String zkMonitor, String zkEgo, String zkNodeInfo) {
		super();
		this.zkAddress = zkAddress;
		this.zkNodeRoot = zkNodeRoot.startsWith("/") ? zkNodeRoot : ("/" + zkNodeRoot);
		this.zkMonitor = this.zkNodeRoot + (zkMonitor.startsWith("/") ? zkMonitor : ("/" + zkMonitor));
		this.zkEgo = this.zkNodeRoot + "/osmnode-";
		this.zkNodeInfo = zkNodeInfo;
	}

	public ZkConfig() {

	}

}

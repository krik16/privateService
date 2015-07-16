/** 
 * @Title: OSMStandbyService.java 
 * @Package com.rongyi.osm.listener 
 * @Description: OSM双机热备 节点监控
 * @author 郑亦梁  zhengyiliang@rongyi.com
 * @date 2015年6月8日 上午9:42:54 
 * @version V1.0   
 * Copyright (C),上海容易网电子商务有限公司
 */
package com.rongyi.osm.listener;

import java.util.List;

import javax.annotation.Resource;

import org.I0Itec.zkclient.IZkChildListener;
import org.I0Itec.zkclient.IZkStateListener;
import org.I0Itec.zkclient.ZkClient;
import org.apache.zookeeper.CreateMode;
import org.apache.zookeeper.Watcher.Event.KeeperState;
import org.kie.api.runtime.KieSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.listener.SimpleMessageListenerContainer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.stereotype.Component;

import com.rongyi.osm.knowledge.ClockUpdater;
import com.rongyi.osm.knowledge.RuleProcessor;

/**
 * @author ZhengYl
 * 
 */
@Component
public class OSMStandbyService {
	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Resource(name = "osmZkClient")
	private ZkClient zkClient4subChild;

	@Resource(name = "osmZkConfig")
	private ZkConfig zkConfig;

	@Autowired
	private OSMStandbyStatus osmStandbyStatus;

	@Autowired
	private RuleProcessor ruleProcessor;

	@Autowired
	private ClockUpdater clockUpdater;

	@Resource(name = "workListener")
	private SimpleMessageListenerContainer msgContainer;

	@Resource(name = "syncInsertListener")
	private SimpleMessageListenerContainer syncMsgInsertContainer;

	@Resource(name = "syncUpdateListener")
	private SimpleMessageListenerContainer syncMsgUpdateContainer;

	@Resource(name = "syncDeleteListener")
	private SimpleMessageListenerContainer syncMsgDeleteContainer;

	@Resource(name = "ksession")
	private KieSession kSession;

	public static void main(String[] args) {
		try {
			SimpleMailMessage mailMessage = new SimpleMailMessage();
			mailMessage.setFrom("zhengyiliang@rongyi.com");
			mailMessage.setTo("zhuze@rongyi.com");
			mailMessage.setText("TEST HEHE");
			mailMessage.setSubject("OSM Error Report");
			JavaMailSenderImpl mailSender = new JavaMailSenderImpl();
			mailSender.setHost("smtp.rongyi.com");
			mailSender.setUsername("zhengyiliang@rongyi.com");
			mailSender.setPassword("samsung28");
			mailSender.send(mailMessage);
		} catch (Exception exception) {
			exception.printStackTrace();
		}

	}

	/**
	 * Register node to zk, and get the node's role
	 * 
	 * @author ZhengYl
	 * @date 2015年6月11日 上午10:53:58
	 */
	public void nodeHeartBeatWatching() {
		try {
			if (zkConfig == null) {
				logger.error(">>>>>>>>>>>> cannot init zkConfig");
				return;
			}

			// zk registering child, to determine master or slave
			if (zkClient4subChild.exists(zkConfig.getZkNodeRoot())) {
				List<String> childs = zkClient4subChild.getChildren(zkConfig.getZkNodeRoot());
				if (childs.size() > 0) {
					String currentNodePath = zkClient4subChild.create(zkConfig.getZkEgo(), zkConfig.getZkNodeInfo()
							+ "[slave]", CreateMode.EPHEMERAL_SEQUENTIAL);
					logger.info(">>>>>>>>>>>> Starting with SLAVE MODE, currentNodePath : " + currentNodePath);
					zkConfig.setCurrentNodePath(currentNodePath);
					zkConfig.setCurrentNodeSequence(Long.parseLong(currentNodePath.substring(currentNodePath
							.lastIndexOf('-') + 1)));
				} else {
					String currentNodePath = zkClient4subChild.create(zkConfig.getZkEgo(), zkConfig.getZkNodeInfo()
							+ "[master]", CreateMode.EPHEMERAL_SEQUENTIAL);
					logger.info(">>>>>>>>>>>> Starting with MASTER MODE, currentNodePath : " + currentNodePath);
					zkConfig.setCurrentNodePath(currentNodePath);
					zkConfig.setCurrentNodeSequence(Long.parseLong(currentNodePath.substring(currentNodePath
							.lastIndexOf('-') + 1)));

					osmStandbyStatus.wakeUp();
				}
			} else {
				zkClient4subChild.create(zkConfig.getZkNodeRoot(), "osm_root", CreateMode.PERSISTENT);

				String currentNodePath = zkClient4subChild.create(zkConfig.getZkEgo(), zkConfig.getZkNodeInfo()
						+ "[master]", CreateMode.EPHEMERAL_SEQUENTIAL);
				logger.info(">>>>>>>>>>>> Starting with MASTER MODE, currentNodePath : " + currentNodePath);
				
				zkConfig.setCurrentNodePath(currentNodePath);
				zkConfig.setCurrentNodeSequence(Long.parseLong(currentNodePath.substring(currentNodePath
						.lastIndexOf('-') + 1)));

				osmStandbyStatus.wakeUp();
			}

			// zk connect changing event, usually called when network was
			// reconnected or disconnected
			zkClient4subChild.subscribeStateChanges(new IZkStateListener() {

				@Override
				public void handleNewSession() throws Exception {
					logger.info(">>>>>>>>>>>> handleNewSession()");
				}

				@Override
				public void handleStateChanged(KeeperState stat) throws Exception {
					logger.info(">>>>>>>>>>>> handleStateChanged, stat:" + stat);

					if (stat.equals(KeeperState.Disconnected)) {
						// zk disconnect, kill self
						try {
							logger.error(">>>>>>>>>>>> Disconnected from zookeeper, killing self ...");
							Process pid = null;
							String[] cmd = { "/bin/sh", "-c", "/usr/local/kill_osm.sh" };
							pid = Runtime.getRuntime().exec(cmd);
							logger.info(">>>>>>>>>>>> Success to execute" + pid.toString());
						} catch (Exception e) {
							e.printStackTrace();
							logger.error(e.getMessage());
						}
					}
				}
			});

			// zk child changing event, trigger for master's rule engine
			zkClient4subChild.subscribeChildChanges(zkConfig.getZkNodeRoot(), new IZkChildListener() {
				@Override
				public void handleChildChange(String parentPath, List<String> currentChildren) throws Exception {
					logger.info(">>>>>>>>>>>>>>>>>>>>>");
					logger.info("Child changing event has been fired ...");
					logger.info(">>>>>>>>>>>>>>>>>>>>>");
					logger.info("children of path " + parentPath + ":" + currentChildren);
					long targetSequence = 9999999999L;

					if (osmStandbyStatus.isActive()) {
						if (currentChildren.size() < 2) {
							logger.info(">>>>>>>>>>>> Current slave is offline ...");
							osmStandbyStatus.slaveOffline();
						} else {
							for (String nodePath : currentChildren) {
								nodePath = zkConfig.getZkNodeRoot() + "/" + nodePath;
								if (!nodePath.equals(zkConfig.getCurrentNodePath())) {
									long newNodeSequence = Long.parseLong(nodePath.substring(nodePath.lastIndexOf('-') + 1));
									if (newNodeSequence < targetSequence) {
										targetSequence = newNodeSequence;
									}
								}
							}
							if (targetSequence > zkConfig.getCurrentNodeSequence()) {
								logger.info(">>>>>>>>>>>> New slave is online ...");
								osmStandbyStatus.slaveOnline();
							} else {
								logger.info(">>>>>>>>>>>> Changing to SLAVE MODE ...");
								osmStandbyStatus.block();
								osmStandbyStatus.slaveOffline();

								// halt drools
								kSession.halt();
								// interrupt drools clock updater
								clockUpdater.interrupt();
							}
						}
					} else {
						for (String nodePath : currentChildren) {
							nodePath = zkConfig.getZkNodeRoot() + "/" + nodePath;
							if (!nodePath.equals(zkConfig.getCurrentNodePath())) {
								long newNodeSequence = Long.parseLong(nodePath.substring(nodePath.lastIndexOf('-') + 1));
								if (newNodeSequence < targetSequence) {
									targetSequence = newNodeSequence;
								}
							}
						}
						if (targetSequence > zkConfig.getCurrentNodeSequence()) {
							logger.info(">>>>>>>>>>>> Changing to MASTER MODE ...");
							if (targetSequence == 9999999999L) {
								osmStandbyStatus.slaveOffline();
							} else {
								osmStandbyStatus.slaveOnline();
							}
							zkClient4subChild.writeData(zkConfig.getCurrentNodePath(), zkConfig.getZkNodeInfo()
									+ "[master]");
							osmStandbyStatus.wakeUp();
							ruleProcessor.start();
						}
					}
				}
			});
		} catch (Exception e) {
			e.printStackTrace();
			logger.error(e.getMessage());
		}
	}
}

/** 
 * @Title: PaymentActionSerializeUtil.java 
 * @Package com.rongyi.osm.knowledge 
 * @Description: Payment Action 序列化工具类
 * @author 郑亦梁  zhengyiliang@rongyi.com
 * @date 2015年4月29日 下午4:06:32 
 * @version V1.0   
 * Copyright (C),上海容易网电子商务有限公司
 */
package com.rongyi.osm.knowledge;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author ZhengYl
 * 
 */
public class PaymentActionSerializeUtil {
	static Logger logger = LoggerFactory.getLogger(PaymentActionSerializeUtil.class);
	
	public static byte[] serialize(PaymentAction object) {
		ObjectOutputStream oos = null;
		ByteArrayOutputStream baos = null;
		try {
			// 序列化
			baos = new ByteArrayOutputStream();
			oos = new ObjectOutputStream(baos);
			oos.writeObject(object);
			byte[] bytes = baos.toByteArray();
			return bytes;
		} catch (Exception e) {
			logger.info(e.getMessage());
			e.printStackTrace();
		}
		return null;
	}

	public static PaymentAction unserialize(byte[] bytes) {
		ByteArrayInputStream bais = null;
		try {
			// 反序列化
			bais = new ByteArrayInputStream(bytes);
			ObjectInputStream ois = new ObjectInputStream(bais);
			Object obj = ois.readObject();
			if (obj == null || obj.getClass() != PaymentAction.class)
				return null;
			return (PaymentAction) obj;
		} catch (Exception e) {
			logger.info(e.getMessage());
			e.printStackTrace();
		}
		return null;
	}
}

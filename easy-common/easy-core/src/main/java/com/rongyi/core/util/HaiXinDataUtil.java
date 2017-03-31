package com.rongyi.core.util;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.rongyi.core.common.util.JsonUtil;
import net.sf.json.xml.XMLSerializer;
import org.apache.axis.client.Call;
import org.apache.axis.client.Service;
import org.apache.axis.encoding.XMLType;
import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.apache.poi.ss.formula.functions.T;
import sun.misc.BASE64Decoder;

import javax.xml.rpc.ParameterMode;
import javax.xml.rpc.ServiceException;
import java.rmi.RemoteException;
import java.util.List;
import java.util.Map;

public class HaiXinDataUtil {

	private static Logger logger = Logger.getLogger(HaiXinDataUtil.class);

	/**
	 * 
	 * @param url
	 *            路径
	 * @param type
	 *            类型 如: 2026 品牌，2025 类目,psXMLData：传入的XML报文,psOperateTypeCode
	 * @return
	 * @throws ServiceException
	 * @throws RemoteException
	 */
	public static <T> List<T> invokeRemoteFuc(String url,Integer psOperateTypeCode, Integer psDataType, String psXMLData) throws ServiceException, RemoteException {
		Service service = new Service();
		Call call = (Call) service.createCall();
		call.setTargetEndpointAddress(url);
		// WSDL里面描述的接口名称(要调用的方法)
		call.setOperationName("INavOperateIntf");
		// 接口方法的参数名, 参数类型,参数模式 IN(输入), OUT(输出) or INOUT(输入输出)
		call.addParameter("psOperateTypeCode", XMLType.XSD_STRING,ParameterMode.IN);
		call.addParameter("psDataType", XMLType.XSD_STRING, ParameterMode.IN);
		call.addParameter("psXMLData", XMLType.XSD_STRING, ParameterMode.IN);
		// String
		// xml="<?xml version=\"1.0\" encoding=\"UTF-8\"?><IMPORTDATA><OPERATION>1</OPERATION></IMPORTDATA>";
		// 设置被调用方法的返回值类型
		call.setReturnType(XMLType.XSD_STRING);
		// 设置方法中参数的值
		Object[] paramValues = new Object[] { psOperateTypeCode, psDataType,psXMLData };
		// 给方法传递参数，并且调用方法
		String result = (String) call.invoke(paramValues);
		if (StringUtils.isEmpty(result)) {
			return null;
		}
		// base64解码
		result = getFromBase64(result);
		logger.info("海信返回result:" + result);
		// 解析xml
		result = xml2JSON(result);
		Map<String, Object> map = JsonUtil.getMapFromJson(result);
		List<T> ls = JSON.parseObject(map.get("RESULT_DATA").toString(),new TypeReference<List<T>>(){});
		return ls;
	}

	private static String getFromBase64(String s) {
		byte[] b = null;
		String result = null;
		if (s != null) {
			BASE64Decoder decoder = new BASE64Decoder();
			try {
				b = decoder.decodeBuffer(s);
				result = new String(b, "GBK");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return result;
	}

	private static String xml2JSON(String xml) {
		return new XMLSerializer().read(xml).toString();
	}

	public static String invokeRemoteHaiXinData(String url,Integer psOperateTypeCode, Integer psDataType, String psXMLData) throws ServiceException, RemoteException {
		Service service = new Service();
		Call call = (Call) service.createCall();
		call.setTargetEndpointAddress(url);
		// WSDL里面描述的接口名称(要调用的方法)
		call.setOperationName("INavOperateIntf");
		// 接口方法的参数名, 参数类型,参数模式 IN(输入), OUT(输出) or INOUT(输入输出)
		call.addParameter("psOperateTypeCode", XMLType.XSD_STRING,ParameterMode.IN);
		call.addParameter("psDataType", XMLType.XSD_STRING, ParameterMode.IN);
		call.addParameter("psXMLData", XMLType.XSD_STRING, ParameterMode.IN);
		// String
		// xml="<?xml version=\"1.0\" encoding=\"UTF-8\"?><IMPORTDATA><OPERATION>1</OPERATION></IMPORTDATA>";
		// 设置被调用方法的返回值类型
		call.setReturnType(XMLType.XSD_STRING);
		// 设置方法中参数的值
		Object[] paramValues = new Object[] { psOperateTypeCode, psDataType,psXMLData };
		// 给方法传递参数，并且调用方法
		String result = (String) call.invoke(paramValues);
		if (StringUtils.isEmpty(result)) {
			return null;
		}
		// base64解码
		result = getFromBase64(result);
		logger.info("海信返回result:" + result);
		// 解析xml
		result = xml2JSON(result);
		return result;
	}
}

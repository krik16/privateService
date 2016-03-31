package com.rongyi.easy.malllife.common.util;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;

/**
 * @author LiuChao 2014年7月
 */
public class PicFileUpYun {
	private static final String BUCKET_NAME = "rongyi"; // 云服务器上的空间名
	private static final String YUN_USERNAME = "gongzhen";
	private static final String YUN_PASSWORD = "rynw87^%43";

	// Get the root source flooder by PicFileUpYun.class.getResource(""),
	// but there is the "file:" before this string.
	// We can remove the unnecessary "file" by the method which is named
	// "getRealUrl" .
	private final static String LocalPicUrl = PicFileUpYun.class.getResource("").toString() + "tempImg/";

	private static String YUNPANUrl = "http://rongyi.b0.upaiyun.com";

	/**
	 * file 直接上传到云服务器上
	 * 
	 * @param flag
	 *            is validating which file should be uploaded.
	 */
	public static Map<String, String> uploadFile2Yun(String picName, String netPicUrl, boolean flag) {

		Map<String, String> map = new HashMap<String, String>();
		String localPicUrl = getRealUrl(LocalPicUrl);
		
		// If the flag is false, means the local picture should not be contracted.
		if (flag) {
			localPicUrl = localPicUrl + getNewName(picName) + "." + getSuffix(picName);
		} else {
			localPicUrl = localPicUrl + picName;
		}

		final String middleNetPicUrl = getNetUrl(netPicUrl) + "/" + getNewName(picName) + "." + getSuffix(picName);
		final UpYun upYun = new UpYun(BUCKET_NAME, YUN_USERNAME, YUN_PASSWORD);
		final File upload = new File(localPicUrl);

		try {
			byte[] bytes = FileUtils.readFileToByteArray(upload);
			if (bytes.length > 0) {
				boolean boo = upYun.writeFile(middleNetPicUrl, bytes, true);
			}
		} catch (Exception e) {
			Logger.getLogger("").info("图片保存至网络失败");
		}
		String newMiddleNetPicUrl = YUNPANUrl + middleNetPicUrl;
		map.put("newPicUrl", newMiddleNetPicUrl);
		map.put("newPicName", getNewName(picName) + "." + getSuffix(picName));

		String oldPicUrl = getRealUrl(LocalPicUrl) + picName;
		File file2 = new File(oldPicUrl);

		try {
			while (file2.exists()) {
				file2.delete();
			}
			while (upload.exists()) {
				upload.delete();
			}
		} catch (Exception ioE) {
			Logger.getLogger("").info("删除本地文件失败");
		}
		return map;
	}

	/**
	 * Get the suffix of image name.
	 * 
	 * @param image
	 * 
	 * */
	private static String getSuffix(String uploadFileName) {
		if (Argument.isBlank(uploadFileName)) {
			return null;
		}
		int index = uploadFileName.lastIndexOf(".");
		if (index == -1) {
			return null;
		}
		String suffix = uploadFileName.substring(index + 1, uploadFileName.length());
		return suffix;
	}

	/**
	 * Get new picture name which is added "middle".
	 * 
	 * */
	private static String getNewName(String uploadFileName) {
		if (Argument.isBlank(uploadFileName)) {
			return null;
		}
		int index = uploadFileName.lastIndexOf(".");
		if (index == -1) {
			return null;
		}
		String newName = uploadFileName.substring(0, index);
		newName = newName + "_middle";
		return newName;
	}

	/**
	 * Remove the String like "http://..." from the url.
	 * */
	private static String getNetUrl(String netPicUrl) {
		if (Argument.isBlank(netPicUrl)) {
			return null;
		}
		int endIndex = netPicUrl.lastIndexOf("/");
		int startIndex = netPicUrl.indexOf("/system/");
		if (endIndex == -1 || startIndex == -1) {
			return null;
		}
		String netUrl = netPicUrl.substring(startIndex, endIndex);
		return netUrl;
	}

	/**
	 * Remove "file:" from the root url which is getting from "PicFileUpYun.class.getResource("")" method.
	 * 
	 * */
	public static String getRealUrl(String url) {
		if (Argument.isBlank(url)) {
			return null;
		}
		String removeFile = "file:";
		int index = url.lastIndexOf(removeFile);
		if (index == -1) {
			return null;
		}
		url = url.substring(index + removeFile.length(), url.length());
		return url;
	}
}
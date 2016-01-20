package com.rongyi.easy.malllife.common.util;

import java.io.File;
import java.io.IOException;

public class UpPicToYun {

	private static final String BUCKET_NAME = "rongyi"; // 云服务器上的空间名
	private static final String YUN_USERNAME = "gongzhen";
	private static final String YUN_PASSWORD = "rynw87^%43";

	/**
	 * 同步上传图片 e
	 * 
	 * @return
	 * @throws IOException
	 */
	public boolean uploadPicBySync(String filePath, String picUrl) throws IOException {
		UpYun upyun = new UpYun(BUCKET_NAME, YUN_USERNAME, YUN_PASSWORD);
		File file = new File(filePath);
		boolean result = upyun.writeFile(picUrl, file, true);
		return result;

	}

}

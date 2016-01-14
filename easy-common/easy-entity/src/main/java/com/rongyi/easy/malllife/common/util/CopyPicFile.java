package com.rongyi.easy.malllife.common.util;

import java.io.File;

public class CopyPicFile {

	private static String FileUrl = PicFileUpYun.getRealUrl(CopyPicFile.class.getResource("").toString() + "tempImg/");

	/**
	 * 
	 * Validate the size of image from the YunPan, if it less than 100kb, just
	 * copy it rather than contraction.
	 * 
	 * */
	public static boolean validatePicSize(String imgName) {
		String imgUrl = FileUrl + imgName;
		File file = new File(imgUrl);
		if (file.length() < 102000) {
			return false;
		}
		return true;
	}

}

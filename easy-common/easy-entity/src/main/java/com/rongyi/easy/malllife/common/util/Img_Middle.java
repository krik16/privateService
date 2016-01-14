//package com.rongyi.easy.malllife.common.util;
//
//import java.awt.Color;
//import java.awt.Graphics2D;
//import java.awt.Image;
//import java.awt.image.BufferedImage;
//import java.io.File;
//import java.io.FileOutputStream;
//import java.io.IOException;
//import java.util.logging.Level;
//import java.util.logging.Logger;
//
//import com.sun.image.codec.jpeg.JPEGCodec;
//import com.sun.image.codec.jpeg.JPEGEncodeParam;
//import com.sun.image.codec.jpeg.JPEGImageEncoder;
//
///**
// * 
// * @author Liu Chao
// */
//public class Img_Middle {
//	public void img_change(String url, String name) {
//		Tosmallerpic(url, new File(url + name), "_middle", name, 188, 165, (float) 0.7);
//		Tosmallerpic(url, new File(url + name), "_small", name, 45, 45, (float) 0.7);
//		Tosmallerpic(url, new File(url + name), "_smaller", name, 116, 100, (float) 0.7);
//	}
//
//	/**
//	 * 
//	 * @param f
//	 *            图片所在的文件夹路径
//	 * @param filelist
//	 *            图片路径
//	 * @param ext
//	 *            扩展名
//	 * @param n
//	 *            图片名
//	 * @param w
//	 *            目标宽按照原图百分比缩图
//	 * @param h
//	 *            目标高
//	 * @param per
//	 *            百分比
//	 */
//	
//	private static String Tosmallerpic(String f, File filelist, String ext, String n, double w, double h, float per) {
//		String newPicName = n.substring(0, n.indexOf(".")) + ext + n.substring(n.indexOf("."));
//		Image src;
//		try {
//			src = javax.imageio.ImageIO.read(filelist); // 构造Image对象
//
//			String img_midname = f + n.substring(0, n.indexOf(".")) + ext + n.substring(n.indexOf("."));
//			int old_w = src.getWidth(null); // 得到源图宽
//			int old_h = src.getHeight(null);
//
//			int new_w = (int) (w * old_w);
//			int new_h = (int) (h * old_h);
//
//			BufferedImage tag = new BufferedImage(new_w, new_h, BufferedImage.TYPE_INT_RGB);
//
//			tag.getGraphics().drawImage(src.getScaledInstance(new_w, new_h, Image.SCALE_SMOOTH), 0, 0, null);
//			FileOutputStream newimage = new FileOutputStream(img_midname); // 输出到文件流
//			JPEGImageEncoder encoder = JPEGCodec.createJPEGEncoder(newimage);
//			JPEGEncodeParam jep = JPEGCodec.getDefaultJPEGEncodeParam(tag);
//			/* 压缩质量 */
//			jep.setQuality(per, true);
//			encoder.encode(tag, jep);
//
//			newimage.close();
//			
//			
//			return newPicName;
//		} catch (IOException ex) {
//			Logger.getLogger(Img_Middle.class.getName()).log(Level.SEVERE, null, ex);
//		}
//		return newPicName;
//	}
///**
// * Compress the file.
// * */
//	public static boolean convertPicInTempFloder(String imgName) {
//		//缩图百分比 默认为0.9
//		double per =0.9;
//		
//		String f = Img_Middle.class.getResource("").toString() + "tempImg/";
//		String n = imgName;
//		f = PicFileUpYun.getRealUrl(f);
//		String filelist = f + imgName;
//		File file = new File(filelist);
//
//		boolean boo = file.exists();
//		if (boo) {
//			while(CopyPicFile.validatePicSize(imgName)){
//
//				imgName = Tosmallerpic(f, file, "_middle", n, per, per, (float) 0.7);
//				per = per*0.9;
//			
//			}
//		}
//		return boo;
//	}
//
//}

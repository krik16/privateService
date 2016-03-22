package com.rongyi.easy.mcmc.constant;

import java.util.HashMap;
import java.util.Map;

/**
 * 商品显示终端常量定义
 * 1.容易逛
 * 2.互动屏
 * 3.容易逛、互动屏
 * 4.微信
 * 5.微信、容易逛
 * 6.微信、互动屏
 * 7.容易逛、互动屏、微信
 * (转换成二进制数个位1有容易逛第二位1有 互动屏第三位1有 微商)
 * Created by ll on 2016/03/17.
 */
public interface CommodityTerminalType {
	/** 终端类别：容易逛 **/
	public static final int TERMINAL_TYPE_1 = 1;
	/** 终端类别：互动屏 **/
	public static final int TERMINAL_TYPE_2 = 2;
	/** 终端类别：容易逛、互动屏 **/
	public static final int TERMINAL_TYPE_3 = 3;
	/** 终端类别：微信 **/
	public static final int TERMINAL_TYPE_4 = 4;
	/** 终端类别：微信、容易逛 **/
	public static final int TERMINAL_TYPE_5 = 5;
	/** 终端类别：微信、互动屏 **/
	public static final int TERMINAL_TYPE_6 = 6;
	/** 终端类别：容易逛、互动屏、微信 **/
	public static final int TERMINAL_TYPE_7 = 7;
	
	/**
	 * 终端索引工具类
	 */
	public class CommodityTerminalCommon {
		private final static Map<Integer, String> typeDic = new HashMap<Integer, String>() {
			private static final long serialVersionUID = 4706393527769535138L;
			{
				put(TERMINAL_TYPE_1, "容易逛");
				put(TERMINAL_TYPE_2, "互动屏");
				put(TERMINAL_TYPE_3, "容易逛、互动屏");
				put(TERMINAL_TYPE_4, "微信");
				put(TERMINAL_TYPE_5, "容易逛、微信");
				put(TERMINAL_TYPE_6, "互动屏、微信");
				put(TERMINAL_TYPE_7, "容易逛、互动屏、微信");
			}
		};
		
		/**
		 * 返回终端对应描述索引
		 * @return
		 */
		public final static Map<Integer, String> getNameIndex() {
			return typeDic;
		}
		
		/**
		 * 返回对应的终端显示描述
		 * @param index
		 * @return
		 */
		public final static String getName(Integer index) {
			return typeDic.get(index);
		}
	}

	interface weAndTeStatus{//商品在终端屏的展示状态，1为终端屏展示，2为微信端展示，3为都展示，4为都不展示。
		String STATUS_1="1";
		String STATUS_2="2";
		String STATUS_3="3";
		String STATUS_4="4";
	}
	
}

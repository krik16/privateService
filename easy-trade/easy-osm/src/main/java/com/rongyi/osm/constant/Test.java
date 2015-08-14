package com.rongyi.osm.constant;

import java.math.BigDecimal;
import java.math.RoundingMode;

import net.sf.json.JSONObject;

public class Test {

	public static void main(String[] args) {
		double value1=9.840;
		double value2=1.22;
        System.out.println(new BigDecimal(sub(value1,value2)));
        BigDecimal ratioOrderPrice =new BigDecimal(0.02);
        BigDecimal scoreExchangeMoney =new BigDecimal(0.01);
        int transformScore=(ratioOrderPrice.divide(scoreExchangeMoney,2, BigDecimal.ROUND_HALF_UP)).intValue();
        System.out.println (transformScore);
        System.out.println (new java.text.DecimalFormat("#.000").format(0.114));
        
        BigDecimal ratioOrderPrice1 =new BigDecimal(0.14);
        BigDecimal scoreExchangeMoney1 =new BigDecimal(0.01);
//        int transformScore1=ratioOrderPrice1.divide(scoreExchangeMoney1);
        System.out.println ("aswsd   "+ratioOrderPrice1.divide(scoreExchangeMoney1, 1, BigDecimal.ROUND_HALF_DOWN));
        
        
        JSONObject jsonObject=new JSONObject();
	}
	public static String sub(double value1,double value2){
		BigDecimal b1 = new BigDecimal(Double.valueOf(value1));
		BigDecimal b2 = new BigDecimal(Double.valueOf(value2));
		java.text.DecimalFormat   df   =new   java.text.DecimalFormat("#.00"); 
		df.format(b1.subtract(b2));
		;
		return new java.text.DecimalFormat("#.00").format(b1.subtract(b2));
		}

}

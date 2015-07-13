package com.rongyi.core.common.util.malllife;

import com.rongyi.core.enumerate.malllife.AppReferenceEnum;
import java.text.SimpleDateFormat;


/**
 * @author LiuChao 2014年7月9日 下午1:26:21
 */
public class AppUtil{
	public static SimpleDateFormat dateFormat1 = new SimpleDateFormat("yyyy年M月dd日");
	public static SimpleDateFormat dateFormat2 = new SimpleDateFormat("M月dd日");
//	private  static String domain ;
	
//	private static String domain = propertyConfigurer.getProperty("domain").toString();
	
	private String token = "";

	public static String getShareUrl(Integer id, String type, String refType,String version,String domain) {
		if (type.equals("article")) {
			if (AppReferenceEnum.isMall(refType) || AppReferenceEnum.isShop(refType)) {
			    
				if(version!=null&&version.equalsIgnoreCase("v5_6")){
		            return domain + "/v5_1/share/articleRefOne.htm?id=" + id;
		        }
				//李靖修改的！
				if(version!=null&&version.equalsIgnoreCase("v5_7")){
                    return domain + "/v5_7/share/articleRefOne.htm?id=" + id;
                }
				return domain + "/recommend/share-articleRefOne.htm?id=" + id;
			} else {
			    if(version!=null&&version.equalsIgnoreCase("v5_6")){
		            return domain + "/v5_1/share/article.htm?id=" + id;
		        }
			  //李靖修改的！
			    if(version!=null&&version.equalsIgnoreCase("v5_7")){
                    return domain + "/v5_7/share/article.htm?id=" + id;
                }
				return domain + "/recommend/share-article.htm?id=" + id;
			}
		}else if("sameCity".equals(type)){
			if(version!=null){
//				return domain + "/cityShare/cityShare.htm?id=" + id;
			    if(version.equalsIgnoreCase("v5_1")){
			        return domain + "/v5/samecity/share-sameCity.htm?sameCityId=" + id;
			    }
			  //李靖修改的！
			    if(version.equalsIgnoreCase("v5_7")){
                    return domain + "/v5_7/share/share-sameCity.htm?sameCityId=" + id;
                }
			    if(version.equalsIgnoreCase("v5_6")){
			        return domain + "/v5_1/share/share-sameCity.htm?sameCityId=" + id;
			    }
			    
				return domain + "/v5/samecity/share-sameCity.htm?sameCityId=" + id;
			}else{
				return domain + "/v5/samecity/share-sameCity.htm?sameCityId=" + id;
			}
		} else {
			if(version!=null){
			    if(version.equalsIgnoreCase("v5_1")){
			        return domain + "/cityShare/cityShare.htm?id=" + id;
                }
			    //李靖修改的！
			    if(version.equalsIgnoreCase("v5_7")){
                    return domain + "/v5_7/share/shareactivity.htm?id=" + id;
                }
                if(version.equalsIgnoreCase("v5_6")){
                    return domain + "/v5_1/share/shareactivity.htm?id=" + id;
                }
                
				return domain + "/cityShare/cityShare.htm?id=" + id;
			}else{
				return domain + "/recommend/share-activity.htm?id=" + id;
			}
		}
	}
	
	 /**
     * 当文章关联为City 或者 Brand 时返回的url v5版本
     * */
    public static String getArticleUrlV5(Integer id, String version,String domain) {
        if(version!=null&&version.equalsIgnoreCase("v5_6")){
            return domain + "/v5_1/share/article.htm?id=" + id;
        }
        if(version!=null&&version.equalsIgnoreCase("v5_7")){
            return domain + "/v5_1/share/article.htm?id=" + id;
        }
        
        if(version!=null&&version.equalsIgnoreCase("v5_1")){
            return domain + "/v5/recommend/article.htm?id=" + id;
        }
        
        return domain + "/v5/recommend/article.htm?id=" + id;
    }
    
    /**
	 * 获得百度地图
	 */
	public static String getMapPicture(double logX, double logY) {
		if(logX!=0.0&&logY!=0.0){
			StringBuilder sb = new StringBuilder(200);
			sb.append("http://api.map.baidu.com/staticimage?");
			sb.append("width=600").append("&").append("height=360");
			sb.append("&").append("center=").append(logX).append(",").append(logY);
			sb.append("&").append("markers=").append(logX).append(",").append(logY);
			sb.append("&").append("markerStyles=m,,0xff0000");
			sb.append("&").append("zoom=16");
			return sb.toString();
		}else{
			return "";
		}
	}

	public static String getContentTitle(String title) {
		StringBuilder sb = new StringBuilder(100);

		sb.append(title);

		return sb.toString();
	}
	
	/**
     * 当文章关联为Mall 或者 Shop 时返回的url v5版本
     * */
    public static String getRefShopOrMallArticleUrlV5(Integer id, String version,String domain) {
        
        if(version!=null&&version.equalsIgnoreCase("v5_6")){
            return domain + "/v5_1/share/articleRefOne.htm?id=" + id;
        }
        
        if(version!=null&&version.equalsIgnoreCase("v5_1")){
            return domain + "/v5/recommend/articleRefOne.htm?id=" + id;
        }
        if(version!=null&&version.equalsIgnoreCase("v5_7")){
            return domain + "/v5_1/share/articleRefOne.htm?id=" + id;
        }
        return domain + "/v5/recommend/articleRefOne.htm?id=" + id;
        
    }
    

}
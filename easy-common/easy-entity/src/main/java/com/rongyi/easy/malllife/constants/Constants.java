package com.rongyi.easy.malllife.constants;



public interface Constants {


    /**
     * AppReferenceDO type
     */
    interface AppReferenceDOType {
    	String TYPE_CITY = "city";
    	String TYPE_MALL = "mall";
    	String TYPE_BRAND = "brand";
    	String TYPE_SHOP = "shop";
    }
    interface ContentDO {
    	/**
    	 * app_content action_picture_name字段图片逗号隔开，无图片的时候显示noImgupLoad
    	 */
    	String NO_IMAGE_UPLOAD = "noImgupLoad";
    }
    interface AppApply {
    	/**
    	 * 同城 type
    	 */
    	Short ENTITY_TYPE_SAME_CITY_1 = 1;
    	/**
    	 * status,1正常,2取消
    	 */
    	Short STATUS_NORMAL = 1;
    	/**
    	 * status,1正常,2取消
    	 */
    	Short STATUS_CANCEL = 2;
    	/**
    	 * 同城一次最大的报名数量
    	 */
    	int MAX_APPLY_NUM = 3;
    	
    }
    interface JSON_RESULT {
    	/**
    	 * 正常返回状态
    	 */
    	short STATUS_NORMAL = 0;
    	/**
    	 * 异常返回状态
    	 */
    	short STATUS_ABNORMAL = 1;
    	/**
    	 * 没有权限访问
    	 */
    	short STATUS_DENIED = 11;
    	/**
    	 * 未登录不可访问
    	 */
    	short STATUS_UN_LOGIN = 21;
    	/**
    	 * 敏感词
    	 */
    	short STATUS_SENSITIVE = 2;
    }
    interface PageSize {
    	/**
    	 * 已经报名的小伙伴一页数量
    	 */
    	int ALREADY_APPLY_USERS =  100;//
    	/**
    	 * 我的报名一页的数量
    	 */
    	int MINE_APPLYS = 100; 
    	/**
    	 * 首页一页的数量
    	 */
    	int HOME_INDEX = 100;
    	/**
    	 * 我的订单每页数量
    	 * */
    	int MY_ORDER = 100;
    	
    }
    /**
     * 登录用户的session key
     */
    String USER_SESSION_KEY = "user_session_key"; //
    /**
     * 
     * 类Constants.java的实现描述：版本控制
     * @author lim 2014年8月8日 上午11:24:56
     */
    interface ControlVersion {
    	String ACCEPT = "Accept";
    	String VERSION = "V5";
    }
    
    /**
     * app列表页推荐类型：文章、 活动和同城
     * @author user LiuChao 2014年8月12日 下午17:24:56
     *
     */
    interface AppRecommendType {
    	String ARTICLE = "article";
    	String ACTIVITY = "activity";
    	String SAMECITY = "sameCity";
    }
    /**
     * RSA加密相关
     * @author lim 2014年8月13日 下午8:43:44
     */
    interface RSA {
    	String PUBLIC_KEY = "publicKey";
    	String PRIVATE_KEY = "privateKey";
    }

    /**
     *
     * add By 俞志坚
     */
    interface SOME_TIME {

        int MALLLIFE_USERLOGIN_BYKEY=60*10;//MALLLIFE 快速登录短信时间
        int MALLLIFE_USERLOGIN_GETPUBLIC_KEY=60*5;//MALLLIFE 公共KEY
        int MALLLIFE_USERLOGIN_GETPRIVATE_KEY=60*5;//MALLLIFE 私有KEY
        int MALLLIFE_USERLOGIN_FORGETPWD_KEY=60*15;//MALLLIFE 找回密码
        int MALLLIFE_USERLOGIN_BINDPHONE_KEY=60*15;//MALLLIFE 绑定手机号
        int MALLLIFE_USERLOGIN_WECHAT_KEY=60*15;//MALLLIFE 微信绑定手机号
        int MALLLIFE_QRCODE_KEY=60*15;//MALLLIFE 登录码
        int MALLSHOP_WITHDRAWCASH_KEY=60*15;//MALLSHOP 摩店设置 提现密码
        int MALLSHOP_WITHDRAWRADOM_KEY=60*15;//MALLSHOP 摩店设置 修改保存密码随机码
        int SESSION_REGIST_TIME = 30 * 60;//注册时的验证码有效期为30分钟
        int SESSION_LEFT_TIME = 60 * 60 * 24 * 30;//一个月的时间吧
    }


    interface LOCK_TIME {
        int LOGIN_RED_TIME = 60 * 10;// loginRed 10分钟
        int PHONE_REGIST_TIME = 60*1;// 手机注册 1分钟
    }



    /**
     * 文章分类
     * 类Constants.java的实现描述：TODO 类实现描述 
     * @author rongyi-13 2014年8月14日 下午3:36:26
     */
    interface APP_CONTENT_CATEGORY {
    	String activity = "activity";
    	String art = "art";
    	String benifit = "benifit";
    	String child = "child";
    	String eat = "eat";
    	String model = "model";
    	String special = "special";
    	String strategy = "strategy";
    }
    

    
    interface AppContent {
    	/**
    	 * 文章，分类
    	 * 20140814 lim
    	 */
        PropertyDate[] CATEGORY      = { 
        		new PropertyDate("all", "全部分类"), 
        		new PropertyDate("eat", "Mall·聚餐地"), 
        		new PropertyDate("benifit", "Mall·福利社"), 
        		new PropertyDate("child", "Mall·亲子乐"),
                new PropertyDate("activity", "Mall·摩活动"),
                new PropertyDate("model", "Mall·时髦货")};
        String CATEGORY_ICON = "app_content.category.icon.url.";
    }
    /**
     * 共同类型
     */
    interface Common {
        // 图片目录
        String UPLOAD_DIR       = "upload.dir";
        /**
         * 容易云服务图片路径
         */
        String RONGYI_IMG_URL = "http://rongyi.b0.upaiyun.com/";
        /**
         * 用户上传头像的路径
         */
        String USER_HEAD_IMG = "system/user/avatar/";
        /**
         * 返回验证码的描述短信
         */
        String SEND_PHONE_VERIFY_CODE_MSG = "send.phone.verify.code.msg";
        /**
         * 返回验证码的描述的电话内容
         */
        String CALL_PHONE_VERIFY_CODE_MSG = "call.phone.verify.code.msg";
        /**
         * 商场mall icon
         */
        String UPAIYUN_URL_MALL_ICON = "http://rongyi.b0.upaiyun.com/system/mall/icon/";              // 云盘路径-商场icon

        /**
         * 文章urldomain
         */
        String ARTICLE_URL="article.url";
        
        /**
         * 使用哪个短信通道,1:云短信通道 ，2：百悟短信通道 3：建周
         */
        String MESSAGE_CHANNEL = "message_channel";
        /**
         * 云通讯回调地址
         */
        String YTX_CALLBACK_URL="ytxCallBackUrl";

        /**
         * 微信授权
         */
        String WEBCHAT_CALL = "webchat_call";
    }
    interface MongoTableName {

        String ACTIVITIES         = "activities";
        String AD_ZONES           = "ad_zones";
        String ADMIN_USERS        = "admin_users";
        String ADVERTISEMENTS     = "advertisements";
        String ARTICLES           = "articles";
        String BRANDS             = "brands";
        // String BRAND_KEYS = "brand_keys";
        String BUSINESS_DISTRICTS = "business_keys";
        String CARD_TRANSACTIONS  = "card_transactions";
        String CARD_TYPES         = "card_types";
        String CARDS              = "cards";
        String CATEGORIES         = "categories";
        String CKEDITOR_ASSETS    = "ckeditor_assets";
        String COLLECTIONS        = "collections";
       // String COMMENT_STORES     = "";
        String COMMENT_STORES     = "comment_stores";
        String COMMENTS           = "comments";
        String CRAWLER_CONFS      = "crawler_confs";
        String EXCHANGE_LOGS      = "exchange_logs";
        String EXCHANGES          = "exchanges";
        String FEEDBACKS          = "feedbacks";
        String LOTTERIES          = "lotteries";
        String PAGES              = "pages";
        String PARKING_TICKETS    = "parking_tickets";
        String PHOTOS             = "photos";
        String PRODUCTIONS        = "productions";
        String REDEEM_LINE_ITEMS  = "redeem_line_items";
        String REDEEMS            = "redeems";
        String SEARCHES           = "searches";
        String SETTINGS           = "setting";
        String SHOPS              = "shops";
        String SUBSCRIPTIONS      = "subscriptions";
        String SUPPLIERS          = "suppliers";
        String TERMINALS          = "terminals";
        String USERS              = "users";
        String ZONES              = "zones";
        String COMMONTYPES        = "common_types";
        String CustomCategory        = "custom_category";
        String MallActivitirs     = "mall_activities";
        String TERMINALMEMBERS        = "terminal_members";
    }
    
    /**
     * APP开放的城市:上海（已开放）、北京、广州、深圳、重庆、沈阳
     */
    String[] OPEN_CITYS = {"上海","北京","广州","深圳","重庆","沈阳","哈尔滨"};
    /**
     * APP开放的城市id:上海（已开放）、北京、广州、深圳、重庆、沈阳 ,
     */
    String[] OPEN_CITY_IDS = {"51f9d7f231d6559b7d000002","51f9d7f331d6559b7d00003c","51f9d7f331d6559b7d000021","51f9d7f431d6559b7d000087","52099e5531d6557be300001a","51f9d7f531d6559b7d0000c2","51f9d7f531d6559b7d0000dc"};
    
    /**
     * APP开放的城市id:上海（已开放）、北京、广州、深圳、重庆、沈阳
     */
    int[] OPEN_CITY_BAIDUIDS = {289,131,257,340,132,58,48};
    /**
     * 默认上海的ID
     */
    String SHANGHAI_ZONES_ID = "51f9d7f231d6559b7d000002";
    /**
     * 默认上海的百度ID
     */
    String SHANGHAI_BAIDU_ID = "289";
    /**
     * 默认总分类
     */
    /**
     * 默认类别父ID
     */
    String DEFAULT_CATEGORY_PARENT_ID = "51f9da1731d65584ab001f0f";
    /**
     * 店铺状态valid
     *
     * @author rongyi-13
     */
    interface Valid {
        int OPEN   = 0;
        int CLOSE  = 1;
        int DELETE = 2;
    }
    
    interface VderStatus{
    	int NOT_PAY = 0;//待付款
    	int HAD_PAY = 1;//已付款
    	int HAD_CANCEL = 2;//已取消
    	int HAD_DELETE = 3;//已删除
    	int REFUND = 5; //退款状态,包括退款中和已退款
    	PropertyDate[] vderStatusProperty= { new PropertyDate("0", "待付款"), new PropertyDate("1", "已付款"),
         new PropertyDate("2", "已取消"),new PropertyDate("3", "已删除")};
    }
	/**
	 * 只用于优惠券列表展示, 待付款、已付款、已取消、已删除值与VderStatus同，不再重复赋值。 新增 4退款中, 5未消费, 6已退款,
	 * 7已过期, 8已使用
	 * 
	 * @author Lc
	 *
	 */
	interface ActivityDisplayStatus {
		int REFUNDING = 4;
		int NOT_USE = 5;
		int REFUNDED = 6;
		int EXPIRED = 7;
		int HAS_USED = 8;
		int OUT_CODE = 9;
	}
   /**
    * 优惠券使用状态. 未使用:0,已使用:1,退款中:2,已退款:3,已过期:4
    * @author LiuChao 2014/10/22
    *
    */
    interface ActivityStatus{
    	int NOT_USE = 0;
    	int HAS_USED = 1;
    	int REFUNDING = 2;
    	int REFUNDED = 3;
    	int EXPIRED = 4;
    }
    
    /**
     * 退款状态, 未处理:0,已通过:1,已驳回:2
     * @author LiuChao 2014/10/24
     */
    interface RefundStatus{
    	int NOT_REFUND = 0;
    	int HAS_REFUND = 1;
    	int REJECT     = 2;
    }
    interface Images {
        String BRAND_ICON_URL                      = "http://rongyi.b0.upaiyun.com/system/brand/icon/";             // 品牌图片路径
        String UPAIYUN_Url_Mall_ICON               = "http://rongyi.b0.upaiyun.com/system/mall/icon/";              // 云盘路径-商场icon
    }
    
    interface orderSign{
    	String PRIVATE_KEY = "MIICdgIBADANBgkqhkiG9w0BAQEFAASCAmAwggJcAgEAAoGBAKzzEv3f+2RSlEaXSlVEp2/ZRVa6EZavxfeqB6s71slX8wuSFrkdx2j2BWpMMhGYM0fld1ZD5MF4bFMAozH62TUHfRxswc/AFMf4tTV3jzchNeRCxDmnI+Fu6f0mTvw5lXcFoIyAb0pBXWDioB8/S5bchMLr3EUF9B890zTd4gBLAgMBAAECgYBCLgmYaDsUWp0unfntwwWnQSbNVwof9Ub1zHR+y7kW9rakONTFJWYG/g14bYvDO9BztJUDx5sjhWc+I8JO/8RZaxVClKUY9pGtC9Waa1Sy/77i+uyghf2Gvc7UvWzRLpdaEln8iPteTapKbM5XpSHemjjIAiWbSiiC6aGD/Kta0QJBAOBDKnmwcGa0CzRP0W+Ur9YAapTJvHeXk1tZnaG1Mqk4Tv5KVFQNXJlt6uOQCjB91z2ycAQPKkct3U9fgvL9hcUCQQDFbOMg0va9Sep2vwlAMZZ/1+Er+LKwyGH3/GPiawxaB9mshkU1odF4kEJAD3xO9OjhfLIObslzLMb7qCs1et7PAkBbtRu5h51vYlDyo3FR38vIB4OONLENdr6brJn5ds+ww4YKFvtFI/GqDHjxdgW0rsFGSaHlBw6S7P6DZtt14pbBAkAT18TgWLPaBKLfOoY4gINq6AzGuaFkKU/HeAOmDzJXnjBfqcMtB82g+4bdH3FUEkOR3lGbJ8FxpQ9+3cEyB957AkEAqaEy5vffZVfxS6oAFC4cL8M3n6bKkQbq2Q14irks38zPRhKLNayBr1QUlGgVQ1h5fS8/EOzo1fhaKtEhYpgzHA==";
        String INPUT_CHARSET = "utf-8";
        String ALI_PUBLIC_KEY = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCnxj/9qwVfgoUh/y2W89L6BkRAFljhNhgPdyPuBV64bfQNN1PjbCzkIM6qRdKBoLPXmKKMiFYnkd6rAoprih3/PrQEB/VsW8OoM8fxn67UDYuyBTqA23MML9q1+ilIZwBC2AQ2UBVOrFXfFl75p6/B5KsiNG9zpgmLCUYuLkxpLQIDAQAB";
    }
    interface MyOrder{
    	String ORDER_SPLIT =","; 
    	int NOT_OUT_DATE = 0;
    	int OUT_DATE = 1;
    }
    
    /**
     * The following constants for indicating types of content, created by Brady
     */
    interface ContentType {
    	int ARTICLE = 1;
    	int ACTIVITY = 2;
    	int SAME_CITY = 3;
    	int COUPON = 4;
    	int GROUP_PURCHASE = 5;
    }
    
    interface AppVersion {
    	/**
    	 * 
    	 * 20141201 史学成
    	 */
        PropertyDate[] versionList  = {
        		new PropertyDate("24", "v5.6.0"), 
        		new PropertyDate("23", "v5.5.0"), 
        		new PropertyDate("19", "v5.2.5"), 
        		new PropertyDate("17", "v5.10"), 
        		new PropertyDate("12", "v4.2.0"), 
        		new PropertyDate("11", "v4.1.0"),
                new PropertyDate("10", "v4.0.0"),
                new PropertyDate("9", "v3.5.0"),
                new PropertyDate("8", "v3.0.0"),
                new PropertyDate("7", "v2.2.5"),
                new PropertyDate("6", "v2.1.2"),
                new PropertyDate("2", "v2.0.0"),
                new PropertyDate("1", "v1.0.0"),
        		};

    }
    interface SHARE_USER_TYPE{
    	/**容易逛用户*/
    	Integer MALLLIFE = 1;
    	/**导购*/
    	Integer MALL_GUIDE = 2;
    	/**买手*/
    	Integer MALL_BUYER = 3;
    	/**摩店用户*/
    	Integer MALLSHOP = 4;
    }
}









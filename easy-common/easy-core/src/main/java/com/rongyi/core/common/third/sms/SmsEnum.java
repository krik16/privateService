package com.rongyi.core.common.third.sms;/*
 * Copyright (C),上海容易网电子商务有限公司
 * Author:  俞志坚
 * Description:  短信发送通道配置
 * time:  2016/4/13
 * History: 变更记录
 * <author>           <time>             <version>        <desc>
 * 俞志坚             2016/4/13              1.0            创建文件
 *
 */
public enum SmsEnum {


    //使用渠道 活动通道 通知类
    /**渠道  RYNTCSMS**/
    ACTIVITY_NOTICE_CHANNEL("RYNTCSMS","RYNTCSMS"),
    /**公钥*/
    ACTIVITY_NOTICE_PUBLIC_KEY_STR("RYNTCSMS_PUBLICKEY","MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCPlfQ8LMfY3W1OiibaorvA2T/y55ciDM82y3Aq+73btR9ijM4kZwr2QoYLa3aPM7DN7KIaXXgLmv+at76ztypb//167tD9vXIaqC+QoA8PwC0ZK5DXhuhwelIupqX6JS1+GPR7G7RzEZg6UDRCBV1C+tI0B+zsKDZkNug0aaIArwIDAQAB"),
    /**私钥*/
    ACTIVITY_NOTICE_PRIVATE_KEY_STR("RYNTCSMS_PRIVATEKEY","MIICdQIBADANBgkqhkiG9w0BAQEFAASCAl8wggJbAgEAAoGBAI+V9Dwsx9jdbU6KJtqiu8DZP/LnlyIMzzbLcCr7vdu1H2KMziRnCvZChgtrdo8zsM3sohpdeAua/5q3vrO3Klv//Xru0P29chqoL5CgDw/ALRkrkNeG6HB6Ui6mpfolLX4Y9HsbtHMRmDpQNEIFXUL60jQH7OwoNmQ26DRpogCvAgMBAAECgYAYGrpnp7TdCT8iYjrnlU4jr9T2eD587t2Se1CXRq+2xI9CQhURM2M5uC08mYvLuofB6inEd1CB0kF6vcH79ZHcoWgM8YUwjCKsAgxwC790d8Ud34g6ZD4hBxAlA//NT14JfYrjZAlwNvV8RiABbgcK7JyKYhbsKPjOdPMGg70d8QJBAPjaZ8Jwpxm15o4RzoWjAALQ4zy04KeJ8cGTIcSusgtbBfLmrl4/P0mY8lXbPHdIwN7cX8lEq/s8uaKjiKAwvR0CQQCTtZybaRX4CCYH9NmZnoyR54ETP7HkzUUgrsKzCaIfa/mT6z9ivOjwxURzPo1xN1ehBaDmWJ69xqDnuJtvQyc7AkBpaJnq0qz1RweRxhkkohavGqwmWreOP/AXfqsfFKB2DuhGK1BQu5mjIxYDKApEvJx1ygMIzf3LPb2kFoEY2YxBAkB25qOZCn9vuId8siGTomg/bt6dMxGtP3uc8nCyFFgX+R/fbWgJwE22uuT96+WJtGXqrZA2vDGUTFbsENO2PZVPAkAPWBDJUoXbA4d6OHc69hB8xTSiPOFzyw3n8svb4ciQo0uLVSTcy757Lo7EeuLu5o+EcBUt7Gp2ZqELv0aANHl7"),
    /**token*/
    ACTIVITY_NOTICE_TOKEN("RYNTCSMS_TOKEN","BAC3CR7A64678625YZJ4F96B9C82E418"),

    //活动类 营销类 短信 MARKETING
    /**渠道  RYMARKSMS**/
    ACTIVITY_MARKETING_CHANNEL("RYMARKSMS","RYMARKSMS"),
    /**公钥*/
    ACTIVITY_MARKETING_PUBLIC_KEY_STR("RYMARKSMS_PUBLICKEY","MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCW96pzk0ZYB3JNhlECjgB/iibR6VGUnDMEAUDF1jiQjYPu3ROSLvW3yW3L+4lJ8GTF2F9PQdFIR5BKUVZKNrrpjmUatQgtrhpaFDYd6IYRknr4lj0ZJ0hfXR3+PvE/oUoUC+mglcFUjvJcnObwpnndc49ptRiUafAj51hhIu1kuwIDAQAB"),
    /**私钥*/
    ACTIVITY_MARKETING_PRIVATE_KEY_STR("RYMARKSMS_PRIVATEKEY","MIICdwIBADANBgkqhkiG9w0BAQEFAASCAmEwggJdAgEAAoGBAJb3qnOTRlgHck2GUQKOAH+KJtHpUZScMwQBQMXWOJCNg+7dE5Iu9bfJbcv7iUnwZMXYX09B0UhHkEpRVko2uumOZRq1CC2uGloUNh3ohhGSeviWPRknSF9dHf4+8T+hShQL6aCVwVSO8lyc5vCmed1zj2m1GJRp8CPnWGEi7WS7AgMBAAECgYEAkfnE/aBoonIA2mmIJ5o7bRee1dZvpe0rfzHe+e1cIJpV+kAWzoFN43qICneclrw2FQBVmIOh4+we312qvHQTYoG556kt+ey4lxOC9L1opgpQVlmhhfu/pAffYStfmESreV2wh0wyDvqMsYzI+FMpCOaC/SzOc/p2D+Y3EprXjuECQQD0QSOehaTtQtgeypKDSn/2NmazPYGdLTqZrZLpWIoXRUwDNKW0yEyYazlFq1HqisnNFE8d6h0t4qBb+hGpbc0ZAkEAnjohPAZOkdt1mLk2SL8pkP7RC2eX36lmnRR0LawmYoj4cR6CyB1aGNnfP6Fmyni4LPklVk/8DOJiQ4FOw5Im8wJAUn0xP1cZJPu/K170bhyZ7JfgxUXPYTqmIMJq7B13vXYsvqRoFg7TN2J23B2Is7IdhwIF2i93nUh9KbLhhhvL+QJAYdrLgQbZgqU6Fii9ZMIs38pn2GjJ6X4nww/KRhDIcHoLRFI9Sau1c9cSlZSpMKD2LoIrUDUJSaKcaOlIn/T8dwJBAPBMSgoRvvZ3hS3cGTlOdT7taM25nqrbrXTCFdQ6taHxn6t+EYA7J/nzjucL9n1F0zqrpQhexyJYF5dVc5/NFLc="),
    /**token*/
    ACTIVITY_MARKETING_TOKEN("RYMARKSMS_TOKEN","BACYZJ3A64678625CFA4F96CR782E418");


    private String names;
    private String valus;

    private SmsEnum(String names, String valus) {
        this.names = names;
        this.valus = valus;
    }


  //获取对应的功能名称
    public static String getName(String names) {
        for (SmsEnum s : SmsEnum.values()) {
            if (s.getNames().equals(names)) {
                return s.valus;
            }
        }
        return null;
    }


    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public String getValus() {
        return valus;
    }

    public void setValus(String valus) {
        this.valus = valus;
    }
}

package com.rongyi.core.common.third.malllife;/*
 * Copyright (C),上海容易网电子商务有限公司
 * Author:  俞志坚
 * Description:  第三方对接参数
 * time:  2015/9/16
 * History: 变更记录
 * <author>           <time>             <version>        <desc>
 * 俞志坚             2015/9/16              1.0            创建文件
 *
 */

public class MallLifeThirdConfig {


    /**
     * 第三方公钥私钥 参数 (仅供全民财富使用)
     */
    public abstract class THIRD_RSACODER{
        public static final String PUBLIC_KEY_STR = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCEinizGfKxLiFNlnjOBiEffFmCuPD+FKQif0HRjTI0507s9f7/BnK1BZY12OJt6JhYBcDhN7Z4f08MZs9oicd3NBvM5UkgfO0tUJWPjGuhffSUfmsqHaI99mctCCf6Zs91AMCKOBf2DI2cE9bOuCmlMWrpAlPmWWzPLvB8r2RMJwIDAQAB";
        public static final String PRIVATE_KEY_STR = "MIICdgIBADANBgkqhkiG9w0BAQEFAASCAmAwggJcAgEAAoGBAISKeLMZ8rEuIU2WeM4GIR98WYK48P4UpCJ/QdGNMjTnTuz1/v8GcrUFljXY4m3omFgFwOE3tnh/Twxmz2iJx3c0G8zlSSB87S1QlY+Ma6F99JR+ayodoj32Zy0IJ/pmz3UAwIo4F/YMjZwT1s64KaUxaukCU+ZZbM8u8HyvZEwnAgMBAAECgYBSMRCyeFfg+ita0wItOO3XeaSEhS2lUqWKYwIs8fN9jSeLmO09twDxMvq4f7vCzqeShlbbE1KLnN8nYKYkPLS9V8648PbqI6OTJjVxY4WYvQZSOvf+x6mpmXp6X2AJ1EDM7QhnGrHv1X5rA3uAz44RYoSzdMpY2y2VXtgnjQoKiQJBANJlftG4OPZTBvvk4t4JsdbZq/Th17JSgFnFmszMl1/hxTVf2/tD+HccEiTJMf5LgQxiaxy9uTLeogd59tSzcusCQQChROrPwfEg3I/hEtD+1ywtLiAK78CkanwdBJ5Yi1JFDVadCisifDQcq4srRnP7vnnosApjTfDllYlZy6IcUSS1AkA94sbLz0FKCx/5xdiJcRaTWNGApVF5zVSdk0c2SFOaS2Fjkr+1B8g02NfpZBjFcNYTm3tgJ9oqwVutkU1uQR5jAkEAlug0igDDsKp0AHtpEm8rKYP1/AXp0HDMfyLpQZXtgCxBFmaDgpuS8Bkd+3rL4ZCV50WEEvTGLS/G/T3uDm1n2QJAK2jWxskvXAEvt2EZ19UrJ0EMhDmy0WtuL5JTb37YXrLRPXLpq3fDF3YaYQmU8iXDW+saxCM1tY9HUDDb0uVEkg==";
    }

    /**
     * 全民财富对接参数
     *
     */
    public abstract class QMCAIFU_CHANNEL{
        public static final String CHANNEL="QMCAIFU";//全民财富www.qmcaifu.com
        public static final String TOKEN="631YU17EF8F7D21Z0HI0E36259JI9AN7F371F";
    }


    /**
     * TO_B业务
     * 哈根达斯—老虎机活动
     */
    public abstract class TOB_RSACODER{
        public static final String PUBLIC_KEY_STR = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCbAA+CNGEIW3FHmYbxOYzResWe9POriYNGKSWZiWW7Wv/0k3yPyxleAWKliAXNnka4/W3cA1yokf9WnQUhJxSB7IV9xumEN7qOm8LagZ3XJzoR+K5f37SGltVDmJXo2T+r2VSMAj1/Ct9nSz7roVblVGfGZMyvRii0TVqwm+irAQIDAQAB";
        public static final String PRIVATE_KEY_STR = "MIICdQIBADANBgkqhkiG9w0BAQEFAASCAl8wggJbAgEAAoGBAJsAD4I0YQhbcUeZhvE5jNF6xZ7086uJg0YpJZmJZbta//STfI/LGV4BYqWIBc2eRrj9bdwDXKiR/1adBSEnFIHshX3G6YQ3uo6bwtqBndcnOhH4rl/ftIaW1UOYlejZP6vZVIwCPX8K32dLPuuhVuVUZ8ZkzK9GKLRNWrCb6KsBAgMBAAECgYBsNQaep2J2KyBSE+QY00xzkXoVFnxl7IIwoNkW7syOl2DIpY339Jmo/t6XIPasLSrCSmo/hjlRlVrkZIoIMvglBEzHY1eyE3e8578e/KjT8tFT5Xmn/FfxG5K5oNMmeL9okQcqnByaJNMbhk/s4p079Po1LnHMBbQS3A2i4H96gQJBANshNSon1+cmUTe4m4rkGNnpfds69EvVTwxXTLg62RZA0XZ6ePpQv76lX6bucEmlYj7QNKC6hqdlaF5raq+eYkUCQQC1FIo7++EpiRd6tl32oxcAhD4K19aHHWg5OcLXgrnAAh0JMWMBFJidTte8x81hCXq+/F0e8hgx5geUVNi2KI+NAkBjSPKLvS3H38ag1pYzIhJYecC6mkWiLm34i32JY7CEsq21Xtx9niSivs9OFW7vD24qQ6/0u07TfdECJu1Z0Qt5AkAiOyjKoBn3hR/4JaNrrXb6tQUZfaXjUu7R6pZnsSG2J3AfvcNOf/s9uZrU6BxuHKGkmwZrhC6IuEh0hPmWreI9AkBFF3Z1ag1ECHLE3WrYhBvc8i5MsYprXjmRTikjtulNfyGCClUXPtudjWrDK35wGxBEwZ+AB2LQDM+EiNKy9HAj";
    }

    /**
     * TO_B业务
     * 哈根达斯—老虎机活动
     */
    public abstract class TOB_CHANNEL{
        public static final String CHANNEL="HGDSLHJ";//哈根达斯—老虎机活动
        public static final String TOKEN="31Y8U3422688B03J9D5F1CFF1IAN66F";
    }

}

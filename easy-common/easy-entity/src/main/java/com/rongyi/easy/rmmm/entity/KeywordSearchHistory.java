package com.rongyi.easy.rmmm.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.bson.types.ObjectId;

import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;

/**
 * 用户关键词搜索-mongodb-实体
 *
 * @author wangjh7
 * @date 2016-07-22
 */
@Entity("keyword_search_log")
public class KeywordSearchHistory implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = -5272491144809432057L;
    @Id
    private ObjectId id;
    private String userId;
    private int user_type; // 1 for phone_user
    private String request_ip;
    private int search_type; // 1for commodity  2for shop/mall 3for activity
    private String keyword; ///< 关键字
    private Date create_at;
    private int total_count; ///< 对应商品总数
    // 搜索次数
    private int search_count = 0;
    // 0：全部 1：品牌 2：商城 3：店铺 4：特卖列表 5：直播列表 6：买手列表
    private int src_type;
    // 对应ID
    private String src_id;
    // 预搜索的字段（目前包含中文、全拼、简拼）
    private List<String> keyword_suggest;

    /**
     * @return 1：商品 2：店铺/商场 3：优惠
     */
    public int getSearch_type() {
        return search_type;
    }

    /**
     * @param search_type 1：商品 2：店铺/商场 3：优惠
     */
    public void setSearch_type(int search_type) {
        this.search_type = search_type;
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public int getUser_type() {
        return user_type;
    }

    public void setUser_type(int user_type) {
        this.user_type = user_type;
    }

    public String getRequest_ip() {
        return request_ip;
    }

    public void setRequest_ip(String request_ip) {
        this.request_ip = request_ip;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public Date getCreate_at() {
        return create_at;
    }

    public void setCreate_at(Date create_at) {
        this.create_at = create_at;
    }

    public int getTotal_count() {
        return total_count;
    }

    public void setTotal_count(int total_count) {
        this.total_count = total_count;
    }

    public int getSearch_count() {
        return search_count;
    }

    public void setSearch_count(int search_count) {
        this.search_count = search_count;
    }

    /**
     * 0：全部（对应空） 1：品牌（对应品牌id） 2：商场（对应商场id） 3：店铺（对应店铺id） 4：特卖列表（对应空） 5：直播列表（对应空） 6：买手列表（对应空）
     *
     * @return
     */
    public String getSrc_id() {
        return src_id;
    }

    /**
     * @param src_id 0：全部（对应空） 1：品牌（对应品牌id） 2：商场（对应商场id） 3：店铺（对应店铺id） 4：特卖列表（对应空） 5：直播列表（对应空） 6：买手列表（对应空）
     */
    public void setSrc_id(String src_id) {
        this.src_id = src_id;
    }

    /**
     * @return 0：全部 1：品牌 2：商场 3：店铺 4：特卖列表 5：直播列表 6：买手列表
     */
    public int getSrc_type() {
        return src_type;
    }

    /**
     * @param src_type 0：全部 1：品牌 2：商场 3：店铺 4：特卖列表 5：直播列表 6：买手列表
     */
    public void setSrc_type(int src_type) {
        this.src_type = src_type;
    }

    /**
     * 预搜索的字段（目前包含中文、全拼、简拼）
     *
     * @return
     */
    public List<String> getKeyword_suggest() {
        return keyword_suggest;
    }

    /**
     * 预搜索的字段（目前包含中文、全拼、简拼）
     *
     * @param keyword_suggest
     */
    public void setKeyword_suggest(List<String> keyword_suggest) {
        this.keyword_suggest = keyword_suggest;
    }

    @Override
    public String toString() {
        return "KeywordSearchHistory{" +
                "create_at=" + create_at +
                ", id=" + id +
                ", userId='" + userId + '\'' +
                ", user_type=" + user_type +
                ", request_ip='" + request_ip + '\'' +
                ", search_type=" + search_type +
                ", keyword='" + keyword + '\'' +
                ", total_count=" + total_count +
                ", search_count=" + search_count +
                ", src_type=" + src_type +
                ", src_id='" + src_id + '\'' +
                ", keyword_suggest='" + keyword_suggest + '\'' +
                '}';
    }
}

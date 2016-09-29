package com.rongyi.easy.msgcenter;

import com.rongyi.easy.mcmc.Commodity;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * 商品下架消息推送对象
 *
 * @author yaoyiwei
 * @date 2016-06-06
 * @version 1.0
 */
public class MessageDTO implements Serializable {
    private static final long serialVersionUID = -3022699601318372461L;

    private String title;                     // 消息标题
    private String messageType;               // 消息分类  1.商品类 2 卡券类 3活动类
    private String receiveDate;               // 接收时间
    private String pushDate;                  // 推送时间
    private String createDate;                // 创建时间
    private String pushType;                  // 推送类型  1.系统推送 0.人工推送
    private Map<Integer, String> relevantSellerMap;      // 对应卖家(店铺名称or买手账号)
    private String messageLink;               // 消息外链
    private String messageContent;            // 消息内容
    private PushInfoDTO pushInfoDTO;
    private boolean isRead = false;           // 是否已读

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMessageType() {
        return messageType;
    }

    public void setMessageType(String messageType) {
        this.messageType = messageType;
    }

    public String getReceiveDate() {
        return receiveDate;
    }

    public void setReceiveDate(String receiveDate) {
        this.receiveDate = receiveDate;
    }

    public String getPushDate() {
        return pushDate;
    }

    public void setPushDate(String pushDate) {
        this.pushDate = pushDate;
    }

    public String getPushType() {
        return pushType;
    }

    public void setPushType(String pushType) {
        this.pushType = pushType;
    }

    public Map<Integer, String> getRelevantSellerMap() {
        return relevantSellerMap;
    }

    public void setRelevantSellerMap(Map<Integer, String> relevantSellerMap) {
        this.relevantSellerMap = relevantSellerMap;
    }

    public String getMessageLink() {
        return messageLink;
    }

    public void setMessageLink(String messageLink) {
        this.messageLink = messageLink;
    }

    public String getMessageContent() {
        return messageContent;
    }

    public void setMessageContent(String messageContent) {
        this.messageContent = messageContent;
    }

    public PushInfoDTO getPushInfoDTO() {
        return pushInfoDTO;
    }

    public void setPushInfoDTO(PushInfoDTO pushInfoDTO) {
        this.pushInfoDTO = pushInfoDTO;
    }

    public boolean isRead() {
        return isRead;
    }

    public void setIsRead(boolean isRead) {
        this.isRead = isRead;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public String generateMessageTitle(Commodity commodity) {
        return "商品" + '"' + commodity.getName()+ '"' + "下架通知!";
    }

    public String generateOffReason(Commodity commodity) {
        return "尊敬的用户，" + commodity.getName() + "商品由于" +  commodity.getReason() +
                "的原因，已下架！请修改后重新上传或致电客服400-040-8989。";
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("MessageDTO{");
        sb.append("title='").append(title).append('\'');
        sb.append(", messageType='").append(messageType).append('\'');
        sb.append(", receiveDate='").append(receiveDate).append('\'');
        sb.append(", pushDate='").append(pushDate).append('\'');
        sb.append(", createDate='").append(createDate).append('\'');
        sb.append(", pushType='").append(pushType).append('\'');
        sb.append(", relevantSeller=").append(relevantSellerMap);
        sb.append(", messageLink='").append(messageLink).append('\'');
        sb.append(", messageContent='").append(messageContent).append('\'');
        sb.append(", pushInfoDTO=").append(pushInfoDTO);
        sb.append(", isRead=").append(isRead);
        sb.append('}');
        return sb.toString();
    }
}

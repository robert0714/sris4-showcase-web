/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.domain;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;

/**
 * The Class Rl05320QueryDTO.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Rl05320QueryDTO", propOrder = { "messageId", "senderSiteId", "receiveDate", "receiveTime", "status",
        "completeDate", "completeTime", "count", "sendDate", "sendTime" })
@XmlRootElement(name = "Rl05320QueryDTO")
public class Rl05320QueryDTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 8431788095599023197L;

    /** 通報識別碼 */
    @XmlElement(name = "MessageId", required = true)
    @FieldName("通報識別碼")
    private String messageId;

    /** 傳送端 */
    @XmlElement(name = "SenderSiteId", required = true)
    @FieldName("傳送端")
    private String senderSiteId;

    /** 接收日期 */
    @XmlElement(name = "ReceiveDate", required = true)
    @FieldName("接收日期")
    private String receiveDate;

    /** 接收時間 */
    @XmlElement(name = "ReceiveTime", required = true)
    @FieldName("接收時間")
    private String receiveTime;

    /** 處理狀況 */
    @XmlElement(name = "Status", required = true)
    @FieldName("處理狀況")
    private String status;

    /** 處理成功日期 */
    @XmlElement(name = "CompleteDate", required = true)
    @FieldName("處理成功日期")
    private String completeDate;

    /** 處理成功時間 */
    @XmlElement(name = "CompleteTime", required = true)
    @FieldName("處理成功時間")
    private String completeTime;

    /** 筆數 */
    @XmlElement(name = "Count", required = true)
    @FieldName("筆數")
    private String count;

    /** 發送日期 */
    @XmlElement(name = "SendDate", required = true)
    @FieldName("發送日期")
    private String sendDate = "";

    /** 發送時間 */
    @XmlElement(name = "SendTime", required = true)
    @FieldName("發送時間")
    private String sendTime = "";

    public String getMessageId() {
        return messageId;
    }

    public void setMessageId(final String messageId) {
        this.messageId = messageId;
    }

    public String getSenderSiteId() {
        return senderSiteId;
    }

    public void setSenderSiteId(final String senderSiteId) {
        this.senderSiteId = senderSiteId;
    }

    public String getReceiveDate() {
        return receiveDate;
    }

    public void setReceiveDate(final String receiveDate) {
        this.receiveDate = receiveDate;
    }

    public String getReceiveTime() {
        return receiveTime;
    }

    public void setReceiveTime(final String receiveTime) {
        this.receiveTime = receiveTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(final String status) {
        this.status = status;
    }

    public String getCompleteDate() {
        return completeDate;
    }

    public void setCompleteDate(final String completeDate) {
        this.completeDate = completeDate;
    }

    public String getCompleteTime() {
        return completeTime;
    }

    public void setCompleteTime(final String completeTime) {
        this.completeTime = completeTime;
    }

    public String getCount() {
        return count;
    }

    public void setCount(final String count) {
        this.count = count;
    }

    public String getSendDate() {
        return sendDate;
    }

    public void setSendDate(String sendDate) {
        this.sendDate = sendDate;
    }

    public String getSendTime() {
        return sendTime;
    }

    public void setSendTime(String sendTime) {
        this.sendTime = sendTime;
    }

}

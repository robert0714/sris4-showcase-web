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

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl05310ResultDTO", propOrder = { "MessageId", "ReceiveSiteId", "SendDate", "SendTime", "Status",
        "Count" })
@XmlRootElement(name = "Rl05310ResultDTO")
public class Rl05310ResultDTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** 通報識別碼 */
    @XmlElement(name = "MessageId", required = true)
    @FieldName("通報識別碼")
    private String messageId;

    /** 接收端戶所 */
    @XmlElement(name = "ReceiveSiteId", required = true)
    @FieldName("接收端戶所")
    private String receiveSiteId;

    /** 接收日期 */
    @XmlElement(name = "SendDate", required = true)
    @FieldName("接收日期")
    private String sendDate;

    /** 接收時間 */
    @XmlElement(name = "SendTime", required = true)
    @FieldName("接收時間")
    private String sendTime;

    /** 接收時間 */
    @XmlElement(name = "Status", required = true)
    @FieldName("接收時間")
    private String status;

    /** 筆數 */
    @XmlElement(name = "Count", required = true)
    @FieldName("筆數")
    private String count;

    public String getMessageId() {
        return messageId;
    }

    public void setMessageId(final String messageId) {
        this.messageId = messageId;
    }

    public String getReceiveSiteId() {
        return receiveSiteId;
    }

    public void setReceiveSiteId(final String receiveSiteId) {
        this.receiveSiteId = receiveSiteId;
    }

    public String getSendDate() {
        return sendDate;
    }

    public void setSendDate(final String sendDate) {
        this.sendDate = sendDate;
    }

    public String getSendTime() {
        return sendTime;
    }

    public void setSendTime(final String sendTime) {
        this.sendTime = sendTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(final String status) {
        this.status = status;
    }

    public String getCount() {
        return count;
    }

    public void setCount(final String count) {
        this.count = count;
    }

}

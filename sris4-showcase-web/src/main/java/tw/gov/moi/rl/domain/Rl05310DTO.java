/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.domain;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl05310DTO", propOrder = { "SendDateStart", "SendDateEnd", "SendDataList" })
@XmlRootElement(name = "Rl05310DTO")
public class Rl05310DTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 8431788095599023197L;

    /** 通報資料產生日期-起 */
    @XmlElement(name = "SendDateStart", required = true)
    @FieldName("通報資料產生日期-起")
    private String sendDateStart;

    /** 通報資料產生日期-迄 */
    @XmlElement(name = "SendDateEnd", required = true)
    @FieldName("通報資料產生日期-迄")
    private String sendDateEnd;

    /** 外來通報狀況 */
    @XmlElement(name = "SendDataList", required = true)
    @FieldName("外來通報狀況")
    private List<Rl05310ResultDTO> sendDataList;

    public String getSendDateStart() {
        return sendDateStart;
    }

    public void setSendDateStart(final String sendDateStart) {
        this.sendDateStart = sendDateStart;
    }

    public String getSendDateEnd() {
        return sendDateEnd;
    }

    public void setSendDateEnd(final String sendDateEnd) {
        this.sendDateEnd = sendDateEnd;
    }

    public List<Rl05310ResultDTO> getSendDataList() {
        return sendDataList;
    }

    public void setSendDataList(final List<Rl05310ResultDTO> sendDataList) {
        this.sendDataList = sendDataList;
    }

}

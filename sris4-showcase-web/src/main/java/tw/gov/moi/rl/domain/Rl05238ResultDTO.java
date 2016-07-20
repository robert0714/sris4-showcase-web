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
 * The Class Rl05238ResultDTO.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Rl05238ResultDTO", propOrder = { "SeqNo", "ReceiveDate", "ApplyCode", "PersonId", "Village",
        "Neighbor", "SiteId", "ProcessMark" })
@XmlRootElement(name = "Rl05238ResultDTO")
public class Rl05238ResultDTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** 明細簿序號 */
    @FieldName("明細簿序號")
    @XmlElement(name = "SeqNo")
    private String seqNo;

    /** 明細簿登錄日期 */
    @FieldName("明細簿登錄日期")
    @XmlElement(name = "ReceiveDate")
    private String receiveDate;

    /** 申請書種類 */
    @FieldName("申請書種類")
    @XmlElement(name = "ApplyCode")
    private String applyCode;

    /** 當事人統一編號 */
    @FieldName("當事人統一編號")
    @XmlElement(name = "PersonId")
    private String personId;

    /** 當事人所在地村里 */
    @FieldName("當事人所在地村里")
    @XmlElement(name = "Village")
    private String village;

    /** 當事人所在地鄰 */
    @FieldName("當事人所在地鄰")
    @XmlElement(name = "Neighbor")
    private String neighbor;

    /** 來文戶政事務所 */
    @FieldName("來文戶政事務所")
    @XmlElement(name = "SiteId")
    private String siteId;

    /** 處理註記 */
    @FieldName("處理註記")
    @XmlElement(name = "ProcessMark")
    private String processMark;

    public String getSeqNo() {
        return seqNo;
    }

    public void setSeqNo(String seqNo) {
        this.seqNo = seqNo;
    }

    public String getReceiveDate() {
        return receiveDate;
    }

    public void setReceiveDate(String receiveDate) {
        this.receiveDate = receiveDate;
    }

    public String getApplyCode() {
        return applyCode;
    }

    public void setApplyCode(String applyCode) {
        this.applyCode = applyCode;
    }

    public String getPersonId() {
        return personId;
    }

    public void setPersonId(String personId) {
        this.personId = personId;
    }

    public String getVillage() {
        return village;
    }

    public void setVillage(String village) {
        this.village = village;
    }

    public String getNeighbor() {
        return neighbor;
    }

    public void setNeighbor(String neighbor) {
        this.neighbor = neighbor;
    }

    public String getSiteId() {
        return siteId;
    }

    public void setSiteId(String siteId) {
        this.siteId = siteId;
    }

    public String getProcessMark() {
        return processMark;
    }

    public void setProcessMark(String processMark) {
        this.processMark = processMark;
    }

}

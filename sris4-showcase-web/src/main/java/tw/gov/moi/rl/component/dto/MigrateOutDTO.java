/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.component.dto;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.rs.annotations.FieldDescription;

/**
 * 遷徙作業共用 MoveinOutDTO
 * 
 * @author Marcus Chen
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "migrateOutDTO", propOrder = { "seqId", "personId", "moveoutSiteId", "sourceSiteId", "personDataKind",
        "registerDate", "registerTime", "operationCode" })
@XmlRootElement(name = "MigrateOutDTO")
public class MigrateOutDTO implements Serializable {

    /**
     * serail id
     */
    private static final long serialVersionUID = 1L;

    /** 作業順序編號 */
    @XmlElement(name = "seqId")
    @FieldDescription(desc = "作業順序編號")
    private Integer seqId;

    /** 當事人統號 */
    @XmlElement(name = "personId")
    @FieldDescription(desc = "當事人統號")
    private String personId;

    /** 遷出地戶籍地作業點 */
    @XmlElement(name = "moveoutSiteId")
    @FieldDescription(desc = "遷出地戶籍地作業點")
    private String moveoutSiteId;

    /** 資料來源戶籍地作業點 */
    @XmlElement(name = "sourceSiteId")
    @FieldDescription(desc = "資料來源戶籍地作業點")
    private String sourceSiteId;

    /** 當事人資料種類 */
    @XmlElement(name = "personDataKind")
    @FieldDescription(desc = "當事人資料種類")
    private String personDataKind;

    /** 遷徙紀錄登記日期 */
    @XmlElement(name = "registerDate")
    @FieldDescription(desc = "遷徙紀錄登記日期")
    private String registerDate;

    /** 遷徙紀錄登記時間 */
    @XmlElement(name = "registerTime")
    @FieldDescription(desc = "遷徙紀錄登記時間")
    private String registerTime;

    /** 作業編號 */
    @XmlElement(name = "operationCode")
    @FieldDescription(desc = "作業編號")
    private String operationCode;

    public MigrateOutDTO() {

    }

    /**
     * @param seqId
     * @param personId
     * @param moveoutSiteId
     * @param sourceSiteId
     * @param personDataKind
     * @param registerDate
     * @param registerTime
     * @param operationCode
     */
    public MigrateOutDTO(Integer seqId, String personId, String moveoutSiteId, String sourceSiteId,
            String personDataKind, String registerDate, String registerTime, String operationCode) {
        super();
        this.seqId = seqId;
        this.personId = personId;
        this.moveoutSiteId = moveoutSiteId;
        this.sourceSiteId = sourceSiteId;
        this.personDataKind = personDataKind;
        this.registerDate = registerDate;
        this.registerTime = registerTime;
        this.operationCode = operationCode;
    }

    /**
     * @return the seqId
     */
    public Integer getSeqId() {
        return seqId;
    }

    /**
     * @param seqId
     *            the seqId to set
     */
    public void setSeqId(Integer seqId) {
        this.seqId = seqId;
    }

    /**
     * @return the personId
     */
    public String getPersonId() {
        return personId;
    }

    /**
     * @param personId
     *            the personId to set
     */
    public void setPersonId(String personId) {
        this.personId = personId;
    }

    /**
     * @return the moveoutSiteId
     */
    public String getMoveoutSiteId() {
        return moveoutSiteId;
    }

    /**
     * @param moveoutSiteId
     *            the moveoutSiteId to set
     */
    public void setMoveoutSiteId(String moveoutSiteId) {
        this.moveoutSiteId = moveoutSiteId;
    }

    /**
     * @return the sourceSiteId
     */
    public String getSourceSiteId() {
        return sourceSiteId;
    }

    /**
     * @param sourceSiteId
     *            the sourceSiteId to set
     */
    public void setSourceSiteId(String sourceSiteId) {
        this.sourceSiteId = sourceSiteId;
    }

    /**
     * @return the personDataKind
     */
    public String getPersonDataKind() {
        return personDataKind;
    }

    /**
     * @param personDataKind
     *            the personDataKind to set
     */
    public void setPersonDataKind(String personDataKind) {
        this.personDataKind = personDataKind;
    }

    /**
     * @return the registerDate
     */
    public String getRegisterDate() {
        return registerDate;
    }

    /**
     * @param registerDate
     *            the registerDate to set
     */
    public void setRegisterDate(String registerDate) {
        this.registerDate = registerDate;
    }

    /**
     * @return the registerTime
     */
    public String getRegisterTime() {
        return registerTime;
    }

    /**
     * @param registerTime
     *            the registerTime to set
     */
    public void setRegisterTime(String registerTime) {
        this.registerTime = registerTime;
    }

    /**
     * @return the operationCode
     */
    public String getOperationCode() {
        return operationCode;
    }

    /**
     * @param operationCode
     *            the operationCode to set
     */
    public void setOperationCode(String operationCode) {
        this.operationCode = operationCode;
    }

}
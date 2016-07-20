/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.common.dto;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.rl.domain.xldf.XLDFPersonDataDomainObject;
import tw.gov.moi.rs.annotations.FieldDescription;

/**
 * 遷徙作業共用DTO
 * 
 * @author Marcus Chen
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "migrateInDTO", propOrder = { "seqId", "personId", "moveinSiteId", "originSiteId", "sourceSiteId",
        "personDataKind", "registerDate", "registerTime", "hasHouseholdAtMoveinPlace", "operationCode" })
@XmlRootElement(name = "MigrateInDTO")
public class MigrateInDTO implements Serializable {

    /**
     * serail id
     */
    private static final long serialVersionUID = 1L;

    /** 作業順序編號 */
    @XmlElement(name = "SeqId")
    @FieldDescription(desc = "作業順序編號")
    private Integer seqId;

    /** 當事人統號 */
    @XmlElement(name = "PersonId")
    @FieldDescription(desc = "當事人統號")
    private String personId;

    /** 擬入戶籍地作業點 */
    @XmlElement(name = "MoveinSiteId")
    @FieldDescription(desc = "擬入戶籍地作業點")
    private String moveinSiteId;

    /** 遷出地作業點 */
    @XmlElement(name = "OriginSiteId")
    @FieldDescription(desc = "遷出地作業點")
    private String originSiteId;

    /** 資料來源戶籍地作業點 */
    @XmlElement(name = "SourceSiteId")
    @FieldDescription(desc = "資料來源戶籍地作業點")
    private String sourceSiteId;

    /** 當事人資料種類 */
    @XmlElement(name = "PersonDataKind")
    @FieldDescription(desc = "當事人資料種類")
    private String personDataKind;

    /** 遷徙紀錄登記日期 */
    @XmlElement(name = "RegisterDate")
    @FieldDescription(desc = "遷徙紀錄登記日期")
    private String registerDate;

    /** 遷徙紀錄登記時間 */
    @XmlElement(name = "RegisterTime")
    @FieldDescription(desc = "遷徙紀錄登記時間")
    private String registerTime;

    /** 是否遷入地有現戶資料 */
    @XmlElement(name = "HasHouseholdAtMoveinPlace")
    @FieldDescription(desc = "是否遷入地有現戶資料")
    private boolean hasHouseholdAtMoveinPlace = Boolean.FALSE;

    /** 作業編號 */
    @XmlElement(name = "OperationCode")
    @FieldDescription(desc = "作業編號")
    private String operationCode;
    
    /** 個人基本資料 */
    @XmlElement(name = "PersonData")
    @FieldDescription(desc = "個人基本資料")
    private XLDFPersonDataDomainObject personData;

    public MigrateInDTO() {

    }

    public MigrateInDTO(Integer seqId, String personId, String moveinSiteId, String originSiteId, String sourceSiteId,
            String personDataKind, String registerDate, String registerTime, boolean hasHouseholdAtMoveinPlace,
            String operationCode) {
        super();
        this.seqId = seqId;
        this.personId = personId;
        this.moveinSiteId = moveinSiteId;
        this.originSiteId = originSiteId;
        this.sourceSiteId = sourceSiteId;
        this.personDataKind = personDataKind;
        this.registerDate = registerDate;
        this.registerTime = registerTime;
        this.hasHouseholdAtMoveinPlace = hasHouseholdAtMoveinPlace;
        this.operationCode = operationCode;
    }

    public XLDFPersonDataDomainObject getPersonData() {
		return personData;
	}

	public void setPersonData(XLDFPersonDataDomainObject personData) {
		this.personData = personData;
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
     * @return the moveinSiteId
     */
    public String getMoveinSiteId() {
        return moveinSiteId;
    }

    /**
     * @param moveinSiteId
     *            the moveinSiteId to set
     */
    public void setMoveinSiteId(String moveinSiteId) {
        this.moveinSiteId = moveinSiteId;
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

    /**
     * @return the originSiteId
     */
    public String getOriginSiteId() {
        return originSiteId;
    }

    /**
     * @param originSiteId
     *            the originSiteId to set
     */
    public void setOriginSiteId(String originSiteId) {
        this.originSiteId = originSiteId;
    }

    /**
     * @return the hasHouseholdAtMoveinPlace
     */
    public boolean isHasHouseholdAtMoveinPlace() {
        return hasHouseholdAtMoveinPlace;
    }

    /**
     * @param hasHouseholdAtMoveinPlace
     *            the hasHouseholdAtMoveinPlace to set
     */
    public void setHasHouseholdAtMoveinPlace(boolean hasHouseholdAtMoveinPlace) {
        this.hasHouseholdAtMoveinPlace = hasHouseholdAtMoveinPlace;
    }

}

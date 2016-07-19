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

import tw.gov.moi.ae.checker.annotation.FieldName;

/**
 * MasMovPersonldIdDTO
 * 
 * @author marcus
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "masMovPersonldIdDTO", propOrder = { "personId", "siteId", "gender", "birthYyymmdd", "educationMark",
        "processType" })
@XmlRootElement(name = "MasMovPersonldIdDTO")
public class MasMovPersonldIdDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    /** 國民身分證統一編號 */
    @XmlElement(name = "PersonId", required = true)
    @FieldName("國民身分證統一編號")
    private String personId;

    /** 性別 */
    @XmlElement(name = "Gender", required = true)
    @FieldName("性別")
    private String gender;

    /** 出生日期 */
    @XmlElement(name = "BirthYyymmdd", required = true)
    @FieldName("出生日期")
    private String birthYyymmdd;

    /** 教育程度註記 */
    @XmlElement(name = "EducationMark", required = true)
    @FieldName("教育程度註記")
    private String educationMark;

    /** 作業點代碼 */
    @XmlElement(name = "SiteId", required = true)
    @FieldName("作業點代碼")
    private String siteId;

    /** 處理代碼 */
    @XmlElement(name = "ProcessType", required = true)
    @FieldName("處理代碼")
    private MasMoveType processType;

    /** 姓名 */
    @XmlElement(name = "PersonName", required = true)
    @FieldName("姓名")
    private String personName;

    /** 印登日期 */
    @XmlElement(name = "SealYyymmdd", required = true)
    @FieldName("印登日期")
    private String sealApplyYyymmdd;

    /** 印登日期 */
    @XmlElement(name = "SealApplyCode", required = true)
    @FieldName("印登日期")
    private String sealApplyCode;

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
     * @return the siteId
     */
    public String getSiteId() {
        return siteId;
    }

    /**
     * @param siteId
     *            the siteId to set
     */
    public void setSiteId(String siteId) {
        this.siteId = siteId;
    }

    /**
     * @return the processType
     */
    public MasMoveType getProcessType() {
        return processType;
    }

    /**
     * @param processType
     *            the processType to set
     */
    public void setProcessType(MasMoveType processType) {
        this.processType = processType;
    }

    /**
     * @return the gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * @param gender
     *            the gender to set
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBirthYyymmdd() {
        return birthYyymmdd;
    }

    public void setBirthYyymmdd(String birthYyymmdd) {
        this.birthYyymmdd = birthYyymmdd;
    }

    public String getEducationMark() {
        return educationMark;
    }

    public void setEducationMark(String educationMark) {
        this.educationMark = educationMark;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getSealApplyYyymmdd() {
        return sealApplyYyymmdd;
    }

    public void setSealApplyYyymmdd(String sealApplyYyymmdd) {
        this.sealApplyYyymmdd = sealApplyYyymmdd;
    }

    public String getSealApplyCode() {
        return sealApplyCode;
    }

    public void setSealApplyCode(String sealApplyCode) {
        this.sealApplyCode = sealApplyCode;
    }

}

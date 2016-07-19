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
 * 遷出登記的當事人的個人基本資料DTO
 * 
 * @author Marcus Chen
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl01320PersonDTO", propOrder = { "cancel", "personId", "siteId", "personName", "birthYyymmdd",
        "householdHeadId", "moveinDate", "relationShip", "educationMark", "idCardLostApplyMark", "idCardLostApplyDate",
        "idCardLostApplyTime", "gender", "removeDate", "removeTime", "sourceSiteId" })
@XmlRootElement(name = "Rl01320PersonDTO")
public class Rl01320PersonDTO implements Serializable {

    /**
     * Serial id.
     */
    private static final long serialVersionUID = 1L;
    /** 統號 */
    @XmlElement(name = "PersonId", required = true)
    @FieldName("統號")
    private String personId;

    /** 作業點代碼 */
    @XmlElement(name = "SiteId", required = true)
    @FieldName("作業點代碼")
    private String siteId;

    /** 姓名 */
    @XmlElement(name = "PersonName", required = true)
    @FieldName("姓名")
    private String personName;

    /** 出生日期 */
    @XmlElement(name = "BirthYyymmdd", required = true)
    @FieldName("出生日期")
    private String birthYyymmdd;

    /** 戶長統號 */
    @XmlElement(name = "HouseholdHeadId", required = true)
    @FieldName("戶長統號")
    private String householdHeadId;

    /** 遷入日期 */
    @XmlElement(name = "MoveinDate", required = true)
    @FieldName("遷入日期")
    private String moveinDate;

    /** 稱謂 */
    @XmlElement(name = "Relationship", required = true)
    @FieldName("稱謂")
    private String relationship;

    /** 教育程度註記 */
    @XmlElement(name = "EducationMark", required = true)
    @FieldName("教育程度註記")
    private String educationMark;

    /** 國民身分證掛失註記 */
    @XmlElement(name = "IdCardLostApplyMark", required = true)
    @FieldName("國民身分證掛失註記")
    private boolean idCardLostApplyMark;

    /** 國民身分證掛失日期 */
    @XmlElement(name = "IdCardLostApplyDate", required = true)
    @FieldName("國民身分證掛失日期")
    private String idCardLostApplyDate;

    /** 國民身分證掛失時間 */
    @XmlElement(name = "IdCardLostApplyTime", required = true)
    @FieldName("國民身分證掛失時間")
    private String idCardLostApplyTime;

    /** 性別 */
    @XmlElement(name = "Gender", required = true)
    @FieldName("性別")
    private String gender;

    /** 除戶日期. */
    @XmlElement(name = "RemoveDate", required = true)
    @FieldName("除戶日期")
    private String removeDate;
    /** 除戶時間. */
    @XmlElement(name = "RemoveTime", required = true)
    @FieldName("除戶時間")
    private String removeTime;

    /** 來源作業點代碼. */
    @XmlElement(name = "SourceSiteId", required = true)
    @FieldName("來源作業點代")
    private String sourceSiteId;

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
     * @return the personName
     */
    public String getPersonName() {
        return personName;
    }

    /**
     * @param personName
     *            the personName to set
     */
    public void setPersonName(String personName) {
        this.personName = personName;
    }

    /**
     * @return the birthYyymmdd
     */
    public String getBirthYyymmdd() {
        return birthYyymmdd;
    }

    /**
     * @param birthYyymmdd
     *            the birthYyymmdd to set
     */
    public void setBirthYyymmdd(String birthYyymmdd) {
        this.birthYyymmdd = birthYyymmdd;
    }

    /**
     * @return the householdHeadId
     */
    public String getHouseholdHeadId() {
        return householdHeadId;
    }

    /**
     * @param householdHeadId
     *            the householdHeadId to set
     */
    public void setHouseholdHeadId(String householdHeadId) {
        this.householdHeadId = householdHeadId;
    }

    /**
     * @return the moveinDate
     */
    public String getMoveinDate() {
        return moveinDate;
    }

    /**
     * @param moveinDate
     *            the moveinDate to set
     */
    public void setMoveinDate(String moveinDate) {
        this.moveinDate = moveinDate;
    }

    /**
     * @return the relationShip
     */
    public String getRelationship() {
        return relationship;
    }

    /**
     * @param relationShip
     *            the relationShip to set
     */
    public void setRelationship(String relationship) {
        this.relationship = relationship;
    }

    /**
     * @return the educationMark
     */
    public String getEducationMark() {
        return educationMark;
    }

    /**
     * @param educationMark
     *            the educationMark to set
     */
    public void setEducationMark(String educationMark) {
        this.educationMark = educationMark;
    }

    /**
     * @return the idCardLostApplyMark
     */
    public boolean isIdCardLostApplyMark() {
        return idCardLostApplyMark;
    }

    /**
     * @param idCardLostApplyMark
     *            the idCardLostApplyMark to set
     */
    public void setIdCardLostApplyMark(boolean idCardLostApplyMark) {
        this.idCardLostApplyMark = idCardLostApplyMark;
    }

    /**
     * @return the idCardLostApplyDate
     */
    public String getIdCardLostApplyDate() {
        return idCardLostApplyDate;
    }

    /**
     * @param idCardLostApplyDate
     *            the idCardLostApplyDate to set
     */
    public void setIdCardLostApplyDate(String idCardLostApplyDate) {
        this.idCardLostApplyDate = idCardLostApplyDate;
    }

    /**
     * @return the idCardLostApplyTime
     */
    public String getIdCardLostApplyTime() {
        return idCardLostApplyTime;
    }

    /**
     * @param idCardLostApplyTime
     *            the idCardLostApplyTime to set
     */
    public void setIdCardLostApplyTime(String idCardLostApplyTime) {
        this.idCardLostApplyTime = idCardLostApplyTime;
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

    /**
     * @return the removeDate
     */
    public String getRemoveDate() {
        return removeDate;
    }

    /**
     * @param removeDate
     *            the removeDate to set
     */
    public void setRemoveDate(String removeDate) {
        this.removeDate = removeDate;
    }

    /**
     * @return the removeTime
     */
    public String getRemoveTime() {
        return removeTime;
    }

    /**
     * @param removeTime
     *            the removeTime to set
     */
    public void setRemoveTime(String removeTime) {
        this.removeTime = removeTime;
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

}

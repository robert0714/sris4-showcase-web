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
 * 個人基本資料
 * 
 * @author Marcus Chen
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl01804PersonDTO", propOrder = { "cancel", "personId", "personName", "birthYyymmdd",
        "householdHeadId", "moveinDate", "relationShip", "educationMark", "idCardLostApplyMark", "idCardLostApplyDate",
        "idCardLostApplyTime", "gender", "removeDate", "removeTime", "sourceSiteId", "rl6mRegisterDate",
        "rl6mRegisterTime", "siteId", "oriRelationship" })
@XmlRootElement(name = "Rl01804PersonDTO")
public class Rl01805PersonDTO implements Serializable {

    /**
     * Serial id.
     */
    private static final long serialVersionUID = 1L;
    /** 統號 */
    @XmlElement(name = "personId", required = true)
    @FieldName("統號")
    private String personId;

    /** 作業點代碼 */
    @XmlElement(name = "siteId", required = true)
    @FieldName("作業點代碼")
    private String siteId;

    /** 姓名 */
    @XmlElement(name = "personName", required = true)
    @FieldName("姓名")
    private String personName;

    /** 出生日期 */
    @XmlElement(name = "birthYyymmdd", required = true)
    @FieldName("出生日期")
    private String birthYyymmdd;

    /** 戶長統號 */
    @XmlElement(name = "householdHeadId", required = true)
    @FieldName("戶長統號")
    private String householdHeadId;

    /** 遷入日期 */
    @XmlElement(name = "moveinDate", required = true)
    @FieldName("遷入日期")
    private String moveinDate;

    /** 稱謂 */
    @XmlElement(name = "relationship", required = true)
    @FieldName("稱謂")
    private String relationship;

    /** 教育程度註記 */
    @XmlElement(name = "educationMark", required = true)
    @FieldName("教育程度註記")
    private String educationMark;

    /** 國民身分證掛失註記 */
    @XmlElement(name = "idCardLostApplyMark", required = true)
    @FieldName("國民身分證掛失註記")
    private boolean idCardLostApplyMark;

    /** 國民身分證掛失日期 */
    @XmlElement(name = "idCardLostApplyDate", required = true)
    @FieldName("國民身分證掛失日期")
    private String idCardLostApplyDate;

    /** 國民身分證掛失時間 */
    @XmlElement(name = "idCardLostApplyTime", required = true)
    @FieldName("國民身分證掛失時間")
    private String idCardLostApplyTime;

    /** 性別 */
    @XmlElement(name = "gender", required = true)
    @FieldName("性別")
    private String gender;

    /** 除戶日期. */
    @XmlElement(name = "removeDate", required = true)
    @FieldName("除戶日期")
    private String removeDate;
    /** 除戶時間. */
    @XmlElement(name = "removeTime", required = true)
    @FieldName("除戶時間")
    private String removeTime;

    /** 遷徙紀錄登記日期 */
    @XmlElement(name = "rl6mRegisterDate", required = true)
    @FieldName("遷徙紀錄登記日期")
    private String rl6mRegisterDate;

    /** 遷徙紀錄登記時間 */
    @XmlElement(name = "rl6mRegisterTime", required = true)
    @FieldName("遷徙紀錄登記時間")
    private String rl6mRegisterTime;

    /** 來源作業點代碼. */
    @XmlElement(name = "sourceSiteId", required = true)
    @FieldName("來源作業點代")
    private String sourceSiteId;

    /** 最後遷徙紀錄登記住址-鄰- */
    @XmlElement(name = "lastMoveNeighbor", required = true)
    @FieldName("最後遷徙紀錄登記住址-鄰-")
    private String lastMoveNeighbor;

    /** 最後遷徙紀錄登記住址-村里- */
    @XmlElement(name = "lastMoveVillage", required = true)
    @FieldName("最後遷徙紀錄登記住址-村里-")
    private String lastMoveVillage;
    /** 最後遷徙紀錄登記住址-街路門牌- */
    @XmlElement(name = "lastMoveStreetDoorplate", required = true)
    @FieldName("最後遷徙紀錄登記住址-街路門牌-")
    private String lastMoveStreetDoorplate;

    /** 原來的稱謂. */
    @XmlElement(name = "OriRelationship", required = true)
    @FieldName("原來的稱謂")
    private String oriRelationship;

    /** 撤銷後的印登代碼. */
    @XmlElement(name = "SealApplyCode", required = true)
    @FieldName("撤銷後的印登代碼")
    private String sealApplyCode;

    /** 撤銷後的印登日期. */
    @XmlElement(name = "SealApplyYyymmdd", required = true)
    @FieldName("撤銷後的印登日期")
    private String sealApplyYyymmdd;

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
     * @return the rl6mRegisterDate
     */
    public String getRl6mRegisterDate() {
        return rl6mRegisterDate;
    }

    /**
     * @param rl6mRegisterDate
     *            the rl6mRegisterDate to set
     */
    public void setRl6mRegisterDate(String rl6mRegisterDate) {
        this.rl6mRegisterDate = rl6mRegisterDate;
    }

    /**
     * @return the rl6mRegisterTime
     */
    public String getRl6mRegisterTime() {
        return rl6mRegisterTime;
    }

    /**
     * @param rl6mRegisterTime
     *            the rl6mRegisterTime to set
     */
    public void setRl6mRegisterTime(String rl6mRegisterTime) {
        this.rl6mRegisterTime = rl6mRegisterTime;
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

    /**
     * @return the lastMoveNeighbor
     */
    public String getLastMoveNeighbor() {
        return lastMoveNeighbor;
    }

    /**
     * @param lastMoveNeighbor
     *            the lastMoveNeighbor to set
     */
    public void setLastMoveNeighbor(String lastMoveNeighbor) {
        this.lastMoveNeighbor = lastMoveNeighbor;
    }

    /**
     * @return the lastMoveVillage
     */
    public String getLastMoveVillage() {
        return lastMoveVillage;
    }

    /**
     * @param lastMoveVillage
     *            the lastMoveVillage to set
     */
    public void setLastMoveVillage(String lastMoveVillage) {
        this.lastMoveVillage = lastMoveVillage;
    }

    /**
     * @return the lastMoveStreetDoorplate
     */
    public String getLastMoveStreetDoorplate() {
        return lastMoveStreetDoorplate;
    }

    /**
     * @param lastMoveStreetDoorplate
     *            the lastMoveStreetDoorplate to set
     */
    public void setLastMoveStreetDoorplate(String lastMoveStreetDoorplate) {
        this.lastMoveStreetDoorplate = lastMoveStreetDoorplate;
    }

    /**
     * @return the oriRelationship
     */
    public String getOriRelationship() {
        return oriRelationship;
    }

    /**
     * @param oriRelationship
     *            the oriRelationship to set
     */
    public void setOriRelationship(String oriRelationship) {
        this.oriRelationship = oriRelationship;
    }

    /**
     * @return the sealApplyCode
     */
    public String getSealApplyCode() {
        return sealApplyCode;
    }

    /**
     * @param sealApplyCode
     *            the sealApplyCode to set
     */
    public void setSealApplyCode(String sealApplyCode) {
        this.sealApplyCode = sealApplyCode;
    }

    /**
     * @return the sealApplyYyymmdd
     */
    public String getSealApplyYyymmdd() {
        return sealApplyYyymmdd;
    }

    /**
     * @param sealApplyYyymmdd
     *            the sealApplyYyymmdd to set
     */
    public void setSealApplyYyymmdd(String sealApplyYyymmdd) {
        this.sealApplyYyymmdd = sealApplyYyymmdd;
    }

}

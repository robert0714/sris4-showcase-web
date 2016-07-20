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
import tw.gov.moi.domain.Rldf010eType;

/**
 * The Class Rl07221ResultDTO.
 * 
 * @author Derek Wang
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Rl07221ResultDTO", propOrder = { "siteId", "adminOfficeCode", "areaCode", "birthYyymmdd",
        "householdHeadId", "householdId", "householdHeadName", "checked", "noRevisionReason", "personId",
        "verifyVillage", "verifyNeighbor", "dataObj" })
@XmlRootElement(name = "Rl07221ResultDTO")
public class Rl07221ResultDTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1885216546946124939L;

    /** 作業點代碼. */
    @XmlElement(name = "SiteId")
    @FieldName("作業點代碼")
    private String siteId;

    /** 戶所代碼. */
    @XmlElement(name = "AdminOfficeCode")
    @FieldName("戶所代碼")
    private String adminOfficeCode;

    /** 行政區域代碼. */
    @XmlElement(name = "AreaCode")
    @FieldName("行政區域代碼")
    private String areaCode;

    /** 出生日期. */
    @XmlElement(name = "BirthYyymmdd")
    @FieldName("出生日期")
    private String birthYyymmdd;

    /** 戶長統號. */
    @XmlElement(name = "HouseholdHeadId")
    @FieldName("戶長統號")
    private String householdHeadId;

    /** 戶號. */
    @XmlElement(name = "HouseholdId")
    @FieldName("戶號")
    private String householdId;

    /** 戶長姓名. */
    @XmlElement(name = "HouseholdHeadName")
    @FieldName("戶長姓名")
    private String householdHeadName;

    /** 驗證. */
    @XmlElement(name = "Checked")
    @FieldName("驗證")
    private boolean checked;

    /** 未教原因. */
    @XmlElement(name = "NoRevisionReason")
    @FieldName("未教原因")
    private String noRevisionReason;

    /** rldf010e 統號. */
    @XmlElement(name = "PersonId")
    @FieldName("rldf010e 統號")
    private String personId;

    /** 村里. */
    @XmlElement(name = "VerifyVillage")
    @FieldName("村里")
    private String verifyVillage;

    /** 鄰. */
    @XmlElement(name = "VerifyNeighbor")
    @FieldName("鄰")
    private String verifyNeighbor;

    /** rldf010e 物件. */
    @XmlElement(name = "DataObj")
    @FieldName("rldf010e 物件")
    private Rldf010eType dataObj;

    /**
     * Gets the site id.
     * 
     * @return the site id
     */
    public String getSiteId() {
        return siteId;
    }

    /**
     * Sets the site id.
     * 
     * @param siteId
     *            the new site id
     */
    public void setSiteId(String siteId) {
        this.siteId = siteId;
    }

    /**
     * Gets the admin office code.
     * 
     * @return the admin office code
     */
    public String getAdminOfficeCode() {
        return adminOfficeCode;
    }

    /**
     * Sets the admin office code.
     * 
     * @param adminOfficeCode
     *            the new admin office code
     */
    public void setAdminOfficeCode(String adminOfficeCode) {
        this.adminOfficeCode = adminOfficeCode;
    }

    /**
     * Gets the area code.
     * 
     * @return the area code
     */
    public String getAreaCode() {
        return areaCode;
    }

    /**
     * Sets the area code.
     * 
     * @param areaCode
     *            the new area code
     */
    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    /**
     * Gets the birth yyymmdd.
     * 
     * @return the birth yyymmdd
     */
    public String getBirthYyymmdd() {
        return birthYyymmdd;
    }

    /**
     * Sets the birth yyymmdd.
     * 
     * @param birthYyymmdd
     *            the new birth yyymmdd
     */
    public void setBirthYyymmdd(String birthYyymmdd) {
        this.birthYyymmdd = birthYyymmdd;
    }

    /**
     * Gets the household head id.
     * 
     * @return the household head id
     */
    public String getHouseholdHeadId() {
        return householdHeadId;
    }

    /**
     * Sets the household head id.
     * 
     * @param householdHeadId
     *            the new household head id
     */
    public void setHouseholdHeadId(final String householdHeadId) {
        this.householdHeadId = householdHeadId;
    }

    /**
     * Gets the household id.
     * 
     * @return the household id
     */
    public String getHouseholdId() {
        return householdId;
    }

    /**
     * Sets the household id.
     * 
     * @param householdId
     *            the new household id
     */
    public void setHouseholdId(final String householdId) {
        this.householdId = householdId;
    }

    /**
     * Gets the household head name.
     * 
     * @return the household head name
     */
    public String getHouseholdHeadName() {
        return householdHeadName;
    }

    /**
     * Sets the household head name.
     * 
     * @param householdHeadName
     *            the new household head name
     */
    public void setHouseholdHeadName(final String householdHeadName) {
        this.householdHeadName = householdHeadName;
    }

    /**
     * Checks if is checked.
     * 
     * @return true, if is checked
     */
    public boolean isChecked() {
        return checked;
    }

    /**
     * Sets the checked.
     * 
     * @param checked
     *            the new checked
     */
    public void setChecked(final boolean checked) {
        this.checked = checked;
    }

    /**
     * Gets the no revision reason.
     * 
     * @return the no revision reason
     */
    public String getNoRevisionReason() {
        return noRevisionReason;
    }

    /**
     * Sets the no revision reason.
     * 
     * @param noRevisionReason
     *            the new no revision reason
     */
    public void setNoRevisionReason(final String noRevisionReason) {
        this.noRevisionReason = noRevisionReason;
    }

    /**
     * Gets the person id.
     * 
     * @return the person id
     */
    public String getPersonId() {
        return personId;
    }

    /**
     * Sets the person id.
     * 
     * @param personId
     *            the new person id
     */
    public void setPersonId(String personId) {
        this.personId = personId;
    }

    /**
     * Gets the verify village.
     * 
     * @return the verify village
     */
    public String getVerifyVillage() {
        return verifyVillage;
    }

    /**
     * Sets the verify village.
     * 
     * @param verifyVillage
     *            the new verify village
     */
    public void setVerifyVillage(String verifyVillage) {
        this.verifyVillage = verifyVillage;
    }

    /**
     * Gets the verify neighbor.
     * 
     * @return the verify neighbor
     */
    public String getVerifyNeighbor() {
        return verifyNeighbor;
    }

    /**
     * Sets the verify neighbor.
     * 
     * @param verifyNeighbor
     *            the new verify neighbor
     */
    public void setVerifyNeighbor(String verifyNeighbor) {
        this.verifyNeighbor = verifyNeighbor;
    }

    /**
     * Gets the data obj.
     * 
     * @return the data obj
     */
    public Rldf010eType getDataObj() {
        return dataObj;
    }

    /**
     * Sets the data obj.
     * 
     * @param dataObj
     *            the new data obj
     */
    public void setDataObj(Rldf010eType dataObj) {
        this.dataObj = dataObj;
    }

}

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

import org.apache.commons.lang.StringUtils;

import tw.gov.moi.ae.checker.annotation.FieldName;
import tw.gov.moi.rl.common.constant.RlConstant;
import tw.gov.moi.rl.dto.rl00001.XLDFPhoneDataDTO;

/**
 * 簡要資料DTO.
 * 
 * @author DAXIONG
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "xLDFPersonBriefDataDTO", propOrder = { "ID", "name", "areaCode", "village", "neighbor", "street",
        "birthDate", "dayPhoneAreacode", "dayPhoneNumber", "dayPhoneExtension", "nightPhoneAreacode",
        "nightPhoneNumber", "nightPhoneExtension", "cellPhoneNumber", "siteId", "removeYyymmdd", "removeHhmmss",
        "relationId", "relationCode", "householdStatus", "gender", "personalMark" })
@XmlRootElement(name = "XLDFPersonBriefDataDTO", namespace = "http://tw.gov.moi/rl/dto/rl00001")
public class XLDFPersonBriefDataDTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** 國民身分證統一編號. */
    @XmlElement(name = "ID", required = true)
    @FieldName("國民身分證統一編號")
    private String ID;

    /** 姓名. */
    @XmlElement(name = "Name", required = true)
    @FieldName("姓名")
    private String name;

    /** 住址-行政區域代碼. */
    @XmlElement(name = "AreaCode", required = true)
    @FieldName("住址-行政區域代碼")
    private String areaCode;

    /** 住址-村里. */
    @XmlElement(name = "Village", required = true)
    @FieldName("住址-村里")
    private String village;

    /** 住址-鄰. */
    @XmlElement(name = "Neighbor", required = true)
    @FieldName("住址-鄰")
    private String neighbor;

    /** 住址-街路門牌. */
    @XmlElement(name = "Street", required = true)
    @FieldName("住址-街路門牌")
    private String street;

    /** 出生日期. */
    @XmlElement(name = "BirthDate", required = true)
    @FieldName("出生日期")
    private String birthDate;

    /** 日間電話-區域號碼. */
    @XmlElement(name = "DayPhoneAreacode", required = true)
    @FieldName("日間電話-區域號碼")
    private String dayPhoneAreacode;

    /** 日間電話-電話號碼. */
    @XmlElement(name = "DayPhoneNumber", required = true)
    @FieldName("日間電話-電話號碼")
    private String dayPhoneNumber;

    /** 日間電話-分機. */
    @XmlElement(name = "DayPhoneExtension", required = true)
    @FieldName("日間電話-分機")
    private String dayPhoneExtension;

    /** 夜間電話-區域號碼. */
    @XmlElement(name = "NightPhoneAreacode", required = true)
    @FieldName("夜間電話-區域號碼")
    private String nightPhoneAreacode;

    /** 夜間電話-電話號碼. */
    @XmlElement(name = "NightPhoneNumber", required = true)
    @FieldName("夜間電話-電話號碼")
    private String nightPhoneNumber;

    /** 夜間電話-分機. */
    @XmlElement(name = "NightPhoneExtension", required = true)
    @FieldName("夜間電話-分機")
    private String nightPhoneExtension;

    /** 行動電話號碼. */
    @XmlElement(name = "cellPhoneNumber", required = true)
    @FieldName("行動電話號碼")
    private String cellPhoneNumber;

    /** 作業點代碼. */
    @XmlElement(name = "SiteId", required = true)
    @FieldName("作業點代碼")
    private String siteId;

    /** 除戶日期. */
    @XmlElement(name = "RemoveYyymmdd")
    @FieldName("除戶日期")
    private String removeYyymmdd;

    /** 除戶時間. */
    @XmlElement(name = "RemoveHhmmss")
    @FieldName("除戶時間")
    private String removeHhmmss;

    /** 關係人統號. */
    @XmlElement(name = "RelationId")
    @FieldName("關係人統號")
    private String relationId = "";

    /** 關係人之彼此關係代碼. */
    @XmlElement(name = "RelationCode")
    @FieldName("關係人之彼此關係代碼")
    private String relationCode = "";

    /** 簿頁種類(M:現戶,H:除戶,T:補登). */
    @XmlElement(name = "HouseholdStatus")
    @FieldName("簿頁種類")
    private String householdStatus = "";

    /** 性別. */
    @XmlElement(name = "Gender", required = true)
    @FieldName("性別")
    private String gender;

    /** 個人註記. */
    @XmlElement(name = "PersonalMark", required = true)
    @FieldName("個人註記")
    private String personalMark;

    /**
     * Instantiates a new xLDF person brief data dto.
     */
    public XLDFPersonBriefDataDTO() {
        super();
    }

    /**
     * Instantiates a new xLDF person brief data dto.
     * 
     * @param iD
     *            the i d
     * @param name
     *            the name
     * @param areaCode
     *            the area code
     * @param village
     *            the village
     * @param neighbor
     *            the neighbor
     * @param street
     *            the street
     * @param birthDate
     *            the birth date
     * @param dayPhoneAreacode
     *            the day phone areacode
     * @param dayPhoneNumber
     *            the day phone number
     * @param dayPhoneExtension
     *            the day phone extension
     * @param nightPhoneAreacode
     *            the night phone areacode
     * @param nightPhoneNumber
     *            the night phone number
     * @param nightPhoneExtension
     *            the night phone extension
     * @param cellPhoneNumber
     *            the cell phone number
     * @param householdStatus
     *            the household status
     * @param siteId
     *            the site id
     * @param gender
     *            the gender
     */
    public XLDFPersonBriefDataDTO(String iD, String name, String areaCode, String village, String neighbor,
            String street, String birthDate, String dayPhoneAreacode, String dayPhoneNumber, String dayPhoneExtension,
            String nightPhoneAreacode, String nightPhoneNumber, String nightPhoneExtension, String cellPhoneNumber,
            String householdStatus, String siteId, String gender) {
        super();
        ID = iD;
        this.name = name;
        this.areaCode = areaCode;
        this.village = village;
        this.neighbor = neighbor;
        this.street = street;
        this.birthDate = birthDate;
        this.dayPhoneAreacode = dayPhoneAreacode;
        this.dayPhoneNumber = dayPhoneNumber;
        this.dayPhoneExtension = dayPhoneExtension;
        this.nightPhoneAreacode = nightPhoneAreacode;
        this.nightPhoneNumber = nightPhoneNumber;
        this.nightPhoneExtension = nightPhoneExtension;
        this.cellPhoneNumber = cellPhoneNumber;
        this.householdStatus = householdStatus;
        this.siteId = siteId;
        this.gender = gender;
    }

    /**
     * 取得行政區域代碼前5碼.
     * 
     * @return String
     */
    public String getCountyCode() {
        String result = RlConstant.EMPTY_STRING;
        if (StringUtils.isNotEmpty(areaCode)) {
            result = areaCode.substring(0, 5);
        }
        return result;
    }

    /**
     * Gets the day phone areacode.
     * 
     * @return the dayPhoneAreacode
     */
    public String getDayPhoneAreacode() {
        return dayPhoneAreacode;
    }

    /**
     * Sets the day phone areacode.
     * 
     * @param dayPhoneAreacode
     *            the dayPhoneAreacode to set
     */
    public void setDayPhoneAreacode(String dayPhoneAreacode) {
        this.dayPhoneAreacode = dayPhoneAreacode;
    }

    /**
     * Gets the day phone number.
     * 
     * @return the dayPhoneNumber
     */
    public String getDayPhoneNumber() {
        return dayPhoneNumber;
    }

    /**
     * Sets the day phone number.
     * 
     * @param dayPhoneNumber
     *            the dayPhoneNumber to set
     */
    public void setDayPhoneNumber(String dayPhoneNumber) {
        this.dayPhoneNumber = dayPhoneNumber;
    }

    /**
     * Gets the day phone extension.
     * 
     * @return the dayPhoneExtension
     */
    public String getDayPhoneExtension() {
        return dayPhoneExtension;
    }

    /**
     * Sets the day phone extension.
     * 
     * @param dayPhoneExtension
     *            the dayPhoneExtension to set
     */
    public void setDayPhoneExtension(String dayPhoneExtension) {
        this.dayPhoneExtension = dayPhoneExtension;
    }

    /**
     * Gets the night phone areacode.
     * 
     * @return the nightPhoneAreacode
     */
    public String getNightPhoneAreacode() {
        return nightPhoneAreacode;
    }

    /**
     * Sets the night phone areacode.
     * 
     * @param nightPhoneAreacode
     *            the nightPhoneAreacode to set
     */
    public void setNightPhoneAreacode(String nightPhoneAreacode) {
        this.nightPhoneAreacode = nightPhoneAreacode;
    }

    /**
     * Gets the night phone number.
     * 
     * @return the nightPhoneNumber
     */
    public String getNightPhoneNumber() {
        return nightPhoneNumber;
    }

    /**
     * Sets the night phone number.
     * 
     * @param nightPhoneNumber
     *            the nightPhoneNumber to set
     */
    public void setNightPhoneNumber(String nightPhoneNumber) {
        this.nightPhoneNumber = nightPhoneNumber;
    }

    /**
     * Gets the night phone extension.
     * 
     * @return the nightPhoneExtension
     */
    public String getNightPhoneExtension() {
        return nightPhoneExtension;
    }

    /**
     * Sets the night phone extension.
     * 
     * @param nightPhoneExtension
     *            the nightPhoneExtension to set
     */
    public void setNightPhoneExtension(String nightPhoneExtension) {
        this.nightPhoneExtension = nightPhoneExtension;
    }

    /**
     * Gets the iD.
     * 
     * @return the iD
     */
    public String getID() {
        return ID;
    }

    /**
     * Sets the iD.
     * 
     * @param iD
     *            the new iD
     */
    public void setID(String iD) {
        ID = iD;
    }

    /**
     * Gets the name.
     * 
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name.
     * 
     * @param name
     *            the new name
     */
    public void setName(String name) {
        this.name = name;
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
     * Gets the village.
     * 
     * @return the village
     */
    public String getVillage() {
        return village;
    }

    /**
     * Sets the village.
     * 
     * @param village
     *            the new village
     */
    public void setVillage(String village) {
        this.village = village;
    }

    /**
     * Gets the neighbor.
     * 
     * @return the neighbor
     */
    public String getNeighbor() {
        return neighbor;
    }

    /**
     * Sets the neighbor.
     * 
     * @param neighbor
     *            the new neighbor
     */
    public void setNeighbor(String neighbor) {
        this.neighbor = neighbor;
    }

    /**
     * Gets the street.
     * 
     * @return the street
     */
    public String getStreet() {
        return street;
    }

    /**
     * Sets the street.
     * 
     * @param street
     *            the new street
     */
    public void setStreet(String street) {
        this.street = street;
    }

    /**
     * Gets the birth date.
     * 
     * @return the birth date
     */
    public String getBirthDate() {
        return birthDate;
    }

    /**
     * Sets the birth date.
     * 
     * @param birthDate
     *            the new birth date
     */
    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    /**
     * Gets the day phone.
     * 
     * @return the day phone
     */
    public XLDFPhoneDataDTO getDayPhone() {
        return new XLDFPhoneDataDTO(dayPhoneAreacode, dayPhoneNumber, dayPhoneExtension);
    }

    /**
     * Gets the night phone.
     * 
     * @return the night phone
     */
    public XLDFPhoneDataDTO getNightPhone() {
        return new XLDFPhoneDataDTO(nightPhoneAreacode, nightPhoneNumber, nightPhoneExtension);
    }

    /**
     * Gets the cell phone number.
     * 
     * @return the cell phone number
     */
    public String getCellPhoneNumber() {
        return cellPhoneNumber;
    }

    /**
     * Sets the cell phone number.
     * 
     * @param cellPhoneNumber
     *            the new cell phone number
     */
    public void setCellPhoneNumber(String cellPhoneNumber) {
        this.cellPhoneNumber = cellPhoneNumber;
    }

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
     * Gets the removes the yyymmdd.
     * 
     * @return the removes the yyymmdd
     */
    public String getRemoveYyymmdd() {
        return removeYyymmdd;
    }

    /**
     * Sets the removes the yyymmdd.
     * 
     * @param removeYyymmdd
     *            the new removes the yyymmdd
     */
    public void setRemoveYyymmdd(String removeYyymmdd) {
        this.removeYyymmdd = removeYyymmdd;
    }

    /**
     * Gets the removes the hhmmss.
     * 
     * @return the removes the hhmmss
     */
    public String getRemoveHhmmss() {
        return removeHhmmss;
    }

    /**
     * Sets the removes the hhmmss.
     * 
     * @param removeHhmmss
     *            the new removes the hhmmss
     */
    public void setRemoveHhmmss(String removeHhmmss) {
        this.removeHhmmss = removeHhmmss;
    }

    /**
     * Gets the relation id.
     * 
     * @return the relation id
     */
    public String getRelationId() {
        return relationId;
    }

    /**
     * Sets the relation id.
     * 
     * @param relationId
     *            the new relation id
     */
    public void setRelationId(String relationId) {
        this.relationId = relationId;
    }

    /**
     * Gets the relation code.
     * 
     * @return the relation code
     */
    public String getRelationCode() {
        return relationCode;
    }

    /**
     * Sets the relation code.
     * 
     * @param relationCode
     *            the new relation code
     */
    public void setRelationCode(String relationCode) {
        this.relationCode = relationCode;
    }

    /**
     * Gets the household status.
     * 
     * @return the householdStatus
     */
    public String getHouseholdStatus() {
        return householdStatus;
    }

    /**
     * Sets the household status.
     * 
     * @param householdStatus
     *            the householdStatus to set
     */
    public void setHouseholdStatus(String householdStatus) {
        this.householdStatus = householdStatus;
    }

    /**
     * Gets the gender.
     * 
     * @return the gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * Sets the gender.
     * 
     * @param gender
     *            the gender to set
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * Gets the personal mark.
     * 
     * @return the personal mark
     */
    public String getPersonalMark() {
        return personalMark;
    }

    /**
     * Sets the personal mark.
     * 
     * @param personalMark
     *            the new personal mark
     */
    public void setPersonalMark(String personalMark) {
        this.personalMark = personalMark;
    }
}

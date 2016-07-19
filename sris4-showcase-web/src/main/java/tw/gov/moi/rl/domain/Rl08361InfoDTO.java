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
 * The Class Rl08361InfoDTO.
 * 
 * @author Weiren.Jheng
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl08361InfoDTO", propOrder = { "village", "neighbor", "householdHeadId", "householdId",
        "householdType", "personId", "personName", "gender", "birthYyymmdd", "birthOrderSex", "marriageCode",
        "educationMark", "livingStyleCode", "livingRaceType", "infoList" })
@XmlRootElement(name = "Rl08361InfoDTO")
public class Rl08361InfoDTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** The village. */
    @XmlElement(name = "Village")
    @FieldName("村里")
    private String village = "";

    /** The neighbor. */
    @XmlElement(name = "Neighbor")
    @FieldName("鄰")
    private String neighbor = "";

    /** The household head id. */
    @XmlElement(name = "HouseholdHeadId")
    @FieldName("戶長統號")
    private String householdHeadId = "";

    /** The household id. */
    @XmlElement(name = "HouseholdId")
    @FieldName("戶號")
    private String householdId = "";

    /** The household type. */
    @XmlElement(name = "HouseholdType")
    @FieldName("戶別")
    private String householdType = "";

    /** The person id. */
    @XmlElement(name = "PersonId")
    @FieldName("統一編號")
    private String personId = "";

    /** The person name. */
    @XmlElement(name = "PersonName")
    @FieldName("姓名")
    private String personName = "";

    /** The gender. */
    @XmlElement(name = "Gender")
    @FieldName("性別")
    private String gender = "";

    /** The birth yyymmdd. */
    @XmlElement(name = "BirthYyymmdd")
    @FieldName("出生日期")
    private String birthYyymmdd = "";

    /** The birth order sex. */
    @XmlElement(name = "BirthOrderSex")
    @FieldName("出生別")
    private String birthOrderSex = "";

    /** The marriage code. */
    @XmlElement(name = "MarriageCode")
    @FieldName("婚姻狀況")
    private String marriageCode = "";

    /** The education code. */
    @XmlElement(name = "EducationMark")
    @FieldName("教育程度")
    private String educationMark = "";

    /** The living style code. */
    @XmlElement(name = "LivingStyleCode")
    @FieldName("原住民身分")
    private String livingStyleCode = "";

    /** The living race type. */
    @XmlElement(name = "LivingRaceType")
    @FieldName("族別")
    private String livingRaceType = "";

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
    public void setHouseholdHeadId(String householdHeadId) {
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
    public void setHouseholdId(String householdId) {
        this.householdId = householdId;
    }

    /**
     * Gets the household type.
     * 
     * @return the household type
     */
    public String getHouseholdType() {
        return householdType;
    }

    /**
     * Sets the household type.
     * 
     * @param householdType
     *            the new household type
     */
    public void setHouseholdType(String householdType) {
        this.householdType = householdType;
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
     * Gets the person name.
     * 
     * @return the person name
     */
    public String getPersonName() {
        return personName;
    }

    /**
     * Sets the person name.
     * 
     * @param personName
     *            the new person name
     */
    public void setPersonName(String personName) {
        this.personName = personName;
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
     *            the new gender
     */
    public void setGender(String gender) {
        this.gender = gender;
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
     * Gets the birth order sex.
     * 
     * @return the birth order sex
     */
    public String getBirthOrderSex() {
        return birthOrderSex;
    }

    /**
     * Sets the birth order sex.
     * 
     * @param birthOrderSex
     *            the new birth order sex
     */
    public void setBirthOrderSex(String birthOrderSex) {
        this.birthOrderSex = birthOrderSex;
    }

    /**
     * Gets the marriage code.
     * 
     * @return the marriage code
     */
    public String getMarriageCode() {
        return marriageCode;
    }

    /**
     * Sets the marriage code.
     * 
     * @param marriageCode
     *            the new marriage code
     */
    public void setMarriageCode(String marriageCode) {
        this.marriageCode = marriageCode;
    }

    /**
     * Gets the living style code.
     * 
     * @return the living style code
     */
    public String getLivingStyleCode() {
        return livingStyleCode;
    }

    /**
     * Sets the living style code.
     * 
     * @param livingStyleCode
     *            the new living style code
     */
    public void setLivingStyleCode(String livingStyleCode) {
        this.livingStyleCode = livingStyleCode;
    }

    /**
     * Gets the living race type.
     * 
     * @return the living race type
     */
    public String getLivingRaceType() {
        return livingRaceType;
    }

    /**
     * Sets the living race type.
     * 
     * @param livingRaceType
     *            the new living race type
     */
    public void setLivingRaceType(String livingRaceType) {
        this.livingRaceType = livingRaceType;
    }

    public String getEducationMark() {
        return educationMark;
    }

    public void setEducationMark(String educationMark) {
        this.educationMark = educationMark;
    }

    @Override
    public String toString() {
        return "Rl08361InfoDTO [village=" + village + ", neighbor=" + neighbor + ", householdHeadId=" + householdHeadId
                + ", householdId=" + householdId + ", householdType=" + householdType + ", personId=" + personId
                + ", personName=" + personName + ", gender=" + gender + ", birthYyymmdd=" + birthYyymmdd
                + ", birthOrderSex=" + birthOrderSex + ", marriageCode=" + marriageCode + ", educationMark="
                + educationMark + ", livingStyleCode=" + livingStyleCode + ", livingRaceType=" + livingRaceType + "]";
    }

}

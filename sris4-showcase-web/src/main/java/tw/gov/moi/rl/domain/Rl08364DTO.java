/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;

/**
 * The Class Rl08364DTO.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl08364DTO", propOrder = { "deleteCondition", "village", "neighbor", "householdHeadId", "householdId",
        "householdType", "personId", "personName", "gender", "birthYyymmdd", "birthOrderSex", "marriageCode",
        "educationCode", "livingStyleCode", "livingRaceType", "infoList", "deleteList", "selected", "siteId",
        "birthPlaceCode" })
@XmlRootElement(name = "Rl08364DTO")
public class Rl08364DTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** 刪除條件. */
    @XmlElement(name = "DeleteCondition")
    @FieldName("刪除條件")
    private String deleteCondition;

    /** 村里. */
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
    @XmlElement(name = "EducationCode")
    @FieldName("教育程度")
    private String educationCode = "";

    /** The living style code. */
    @XmlElement(name = "LivingStyleCode")
    @FieldName("原住民身分")
    private String livingStyleCode = "";

    /** The living race type. */
    @XmlElement(name = "LivingRaceType")
    @FieldName("族別")
    private String livingRaceType = "";

    /** The info list. */
    @XmlElement(name = "InfoList")
    @FieldName("查詢結果集")
    private List<Rl08364DTO> infoList = new ArrayList<Rl08364DTO>();

    /** The delete list. */
    @XmlElement(name = "DeleteList")
    @FieldName("欲刪除的資料")
    private List<Rl08364DTO> deleteList = new ArrayList<Rl08364DTO>();

    /** The selected. */
    @XmlElement(name = "Selected")
    @FieldName("Selected")
    private boolean selected = false;

    /** 作業點代碼. */
    @XmlElement(name = "作業點代碼")
    @FieldName("作業點代碼")
    private String siteId = "";

    /** 出生地代碼. */
    @XmlElement(name = "出生地代碼")
    @FieldName("出生地代碼")
    private String birthPlaceCode = "";

    /**
     * Gets the delete condition.
     * 
     * @return the delete condition
     */
    public String getDeleteCondition() {
        return deleteCondition;
    }

    /**
     * Sets the delete condition.
     * 
     * @param deleteCondition
     *            the new delete condition
     */
    public void setDeleteCondition(String deleteCondition) {
        this.deleteCondition = deleteCondition;
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
     * Gets the education code.
     * 
     * @return the education code
     */
    public String getEducationCode() {
        return educationCode;
    }

    /**
     * Sets the education code.
     * 
     * @param educationCode
     *            the new education code
     */
    public void setEducationCode(String educationCode) {
        this.educationCode = educationCode;
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

    /**
     * Gets the info list.
     * 
     * @return the info list
     */
    public List<Rl08364DTO> getInfoList() {
        return infoList;
    }

    /**
     * Sets the info list.
     * 
     * @param infoList
     *            the new info list
     */
    public void setInfoList(List<Rl08364DTO> infoList) {
        this.infoList = infoList;
    }

    /**
     * Checks if is selected.
     * 
     * @return true, if is selected
     */
    public boolean isSelected() {
        return selected;
    }

    /**
     * Sets the selected.
     * 
     * @param selected
     *            the new selected
     */
    public void setSelected(boolean selected) {
        this.selected = selected;
    }

    /**
     * Gets the delete list.
     * 
     * @return the delete list
     */
    public List<Rl08364DTO> getDeleteList() {
        return deleteList;
    }

    /**
     * Sets the delete list.
     * 
     * @param deleteList
     *            the new delete list
     */
    public void setDeleteList(List<Rl08364DTO> deleteList) {
        this.deleteList = deleteList;
    }

    public String getSiteId() {
        return siteId;
    }

    public void setSiteId(String siteId) {
        this.siteId = siteId;
    }

    public String getBirthPlaceCode() {
        return birthPlaceCode;
    }

    public void setBirthPlaceCode(String birthPlaceCode) {
        this.birthPlaceCode = birthPlaceCode;
    }

}

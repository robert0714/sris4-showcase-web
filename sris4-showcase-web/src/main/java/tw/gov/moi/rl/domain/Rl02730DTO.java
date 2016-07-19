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
 * The Class Rl02730DTO.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl02730DTO", propOrder = { "householdHeadId", "personDTOList", "personId", "personName", "birthYyymmdd", "militaryCode", "father", "mother", "spouse", "birthOrderSex", "relationship", "personNoteDTOList", "siteId" })
@XmlRootElement(name = "Rl02730DTO")
public class Rl02730DTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** 戶長統號. */
    @XmlElement(name = "HouseholdHeadId")
    @FieldName("戶長統號")
    private String householdHeadId = "";

    /** 個人記事. */
    @XmlElement(name = "PersonNoteDTOList")
    @FieldName("個人記事")
    private List<Rl02730PersonDTO> personDTOList = new ArrayList<Rl02730PersonDTO>();

    /** 統號. */
    @XmlElement(name = "PersonId")
    @FieldName("統號")
    private String personId = "";

    /** 姓名. */
    @XmlElement(name = "PersonName")
    @FieldName("姓名")
    private String personName = "";

    /** 出生日期. */
    @XmlElement(name = "BirthYyymmdd")
    @FieldName("出生日期")
    private String birthYyymmdd = "";

    /** 役別代碼. */
    @XmlElement(name = "MilitaryCode")
    @FieldName("役別代碼")
    private String militaryCode = "";

    /** 父姓名. */
    @XmlElement(name = "Father")
    @FieldName("父姓名")
    private String father = "";

    /** 母姓名. */
    @XmlElement(name = "Mother")
    @FieldName("母姓名")
    private String mother = "";

    /** 配偶姓名. */
    @XmlElement(name = "Spouse")
    @FieldName("配偶姓名")
    private String spouse = "";

    /** 出生別代碼. */
    @XmlElement(name = "BirthOrderSex")
    @FieldName("出生別代碼")
    private String birthOrderSex = "";

    /** 與戶長關係. */
    @XmlElement(name = "Relationship")
    @FieldName("與戶長關係")
    private String relationship = "";

    /** 個人記事. */
    @XmlElement(name = "PersonNoteDTOList")
    @FieldName("個人記事")
    private List<Rl02730PersonNoteDTO> personNoteDTOList = new ArrayList<Rl02730PersonNoteDTO>();

    /** 作業點代碼. */
    @XmlElement(name = "SiteId")
    @FieldName("作業點代碼")
    private String siteId = "";

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
     * @param householdHeadId the new household head id
     */
    public void setHouseholdHeadId(String householdHeadId) {
        this.householdHeadId = householdHeadId;
    }

    /**
     * Gets the person dto list.
     *
     * @return the person dto list
     */
    public List<Rl02730PersonDTO> getPersonDTOList() {
        return personDTOList;
    }

    /**
     * Sets the person dto list.
     *
     * @param personDTOList the new person dto list
     */
    public void setPersonDTOList(List<Rl02730PersonDTO> personDTOList) {
        this.personDTOList = personDTOList;
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
     * @param personId the new person id
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
     * @param personName the new person name
     */
    public void setPersonName(String personName) {
        this.personName = personName;
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
     * @param birthYyymmdd the new birth yyymmdd
     */
    public void setBirthYyymmdd(String birthYyymmdd) {
        this.birthYyymmdd = birthYyymmdd;
    }

    /**
     * Gets the military code.
     *
     * @return the military code
     */
    public String getMilitaryCode() {
        return militaryCode;
    }

    /**
     * Sets the military code.
     *
     * @param militaryCode the new military code
     */
    public void setMilitaryCode(String militaryCode) {
        this.militaryCode = militaryCode;
    }

    /**
     * Gets the father.
     *
     * @return the father
     */
    public String getFather() {
        return father;
    }

    /**
     * Sets the father.
     *
     * @param father the new father
     */
    public void setFather(String father) {
        this.father = father;
    }

    /**
     * Gets the mother.
     *
     * @return the mother
     */
    public String getMother() {
        return mother;
    }

    /**
     * Sets the mother.
     *
     * @param mother the new mother
     */
    public void setMother(String mother) {
        this.mother = mother;
    }

    /**
     * Gets the spouse.
     *
     * @return the spouse
     */
    public String getSpouse() {
        return spouse;
    }

    /**
     * Sets the spouse.
     *
     * @param spouse the new spouse
     */
    public void setSpouse(String spouse) {
        this.spouse = spouse;
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
     * @param birthOrderSex the new birth order sex
     */
    public void setBirthOrderSex(String birthOrderSex) {
        this.birthOrderSex = birthOrderSex;
    }

    /**
     * Gets the relationship.
     *
     * @return the relationship
     */
    public String getRelationship() {
        return relationship;
    }

    /**
     * Sets the relationship.
     *
     * @param relationship the new relationship
     */
    public void setRelationship(String relationship) {
        this.relationship = relationship;
    }

    /**
     * Gets the person note dto list.
     *
     * @return the person note dto list
     */
    public List<Rl02730PersonNoteDTO> getPersonNoteDTOList() {
        return personNoteDTOList;
    }

    /**
     * Sets the person note dto list.
     *
     * @param personNoteDTOList the new person note dto list
     */
    public void setPersonNoteDTOList(List<Rl02730PersonNoteDTO> personNoteDTOList) {
        this.personNoteDTOList = personNoteDTOList;
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
     * @param siteId the new site id
     */
    public void setSiteId(String siteId) {
        this.siteId = siteId;
    }

}

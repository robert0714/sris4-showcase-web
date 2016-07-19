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
 * 特殊註記名冊資料 DTO
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rlrp08610DTO", propOrder = { "personId", "personName", "birthYyymmdd", "gender", "birthPlace",
        "military", "householdHeadName", "village", "neighbor", "streetDoorplate", "specialContent", "beginYyymmdd",
        "endYyymmdd", "docuNo", "content", "empty" })
@XmlRootElement(name = "Rlrp08610DTO")
public class Rlrp08610SubDTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 3174602706564609883L;

    /** 當事人統號. */
    @XmlElement(name = "PersonId")
    @FieldName("當事人統號")
    private String personId = "";

    /** 當事人姓名. */
    @XmlElement(name = "PersonName")
    @FieldName("當事人姓名")
    private String personName = "";

    /** 出生日期. */
    @XmlElement(name = "BirthYyymmdd")
    @FieldName("出生日期")
    private String birthYyymmdd = "";

    /** 性別. */
    @XmlElement(name = "Gender")
    @FieldName("性別")
    private String gender = "";

    /** 出生地. */
    @XmlElement(name = "BirthPlace")
    @FieldName("出生地")
    private String birthPlace = "";

    /** 役別. */
    @XmlElement(name = "Military")
    @FieldName("役別")
    private String military = "";

    /** 戶長姓名. */
    @XmlElement(name = "HouseholdHeadName")
    @FieldName("戶長姓名")
    private String householdHeadName = "";

    /** 村里. */
    @XmlElement(name = "Village")
    @FieldName("村里")
    private String village = "";

    /** 鄰別. */
    @XmlElement(name = "Neighbor")
    @FieldName("鄰別")
    private String neighbor = "";

    /** 街路門牌. */
    @XmlElement(name = "StreetDoorplate")
    @FieldName("街路門牌")
    private String streetDoorplate = "";

    /** 特殊註記. */
    @XmlElement(name = "SpecialContent")
    @FieldName("特殊註記")
    private String specialContent = "";

    /** 起始日期. */
    @XmlElement(name = "BeginYyymmdd")
    @FieldName("起始日期")
    private String beginYyymmdd = "";

    /** 終止日期. */
    @XmlElement(name = "EndYyymmdd")
    @FieldName("終止日期")
    private String endYyymmdd = "";

    /** 來文字號. */
    @XmlElement(name = "DocuNo")
    @FieldName("來文字號")
    private String docuNo = "";

    /** 內容摘要. */
    @XmlElement(name = "Content")
    @FieldName("內容摘要")
    private String content = "";

    /** 空白欄位. */
    @XmlElement(name = "Empty")
    @FieldName("空白欄位")
    private String empty = "";

    public String getPersonId() {
        return this.personId;
    }

    public void setPersonId(String personId) {
        this.personId = personId;
    }

    public String getPersonName() {
        return this.personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getBirthYyymmdd() {
        return this.birthYyymmdd;
    }

    public void setBirthYyymmdd(String birthYyymmdd) {
        this.birthYyymmdd = birthYyymmdd;
    }

    public String getGender() {
        return this.gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBirthPlace() {
        return this.birthPlace;
    }

    public void setBirthPlace(String birthPlace) {
        this.birthPlace = birthPlace;
    }

    public String getMilitary() {
        return this.military;
    }

    public void setMilitary(String military) {
        this.military = military;
    }

    public String getHouseholdHeadName() {
        return this.householdHeadName;
    }

    public void setHouseholdHeadName(String householdHeadName) {
        this.householdHeadName = householdHeadName;
    }

    public String getVillage() {
        return this.village;
    }

    public void setVillage(String village) {
        this.village = village;
    }

    public String getNeighbor() {
        return this.neighbor;
    }

    public void setNeighbor(String neighbor) {
        this.neighbor = neighbor;
    }

    public String getStreetDoorplate() {
        return this.streetDoorplate;
    }

    public void setStreetDoorplate(String streetDoorplate) {
        this.streetDoorplate = streetDoorplate;
    }

    public String getSpecialContent() {
        return this.specialContent;
    }

    public void setSpecialContent(String specialContent) {
        this.specialContent = specialContent;
    }

    public String getBeginYyymmdd() {
        return this.beginYyymmdd;
    }

    public void setBeginYyymmdd(String beginYyymmdd) {
        this.beginYyymmdd = beginYyymmdd;
    }

    public String getEndYyymmdd() {
        return this.endYyymmdd;
    }

    public void setEndYyymmdd(String endYyymmdd) {
        this.endYyymmdd = endYyymmdd;
    }

    public String getDocuNo() {
        return this.docuNo;
    }

    public void setDocuNo(String docuNo) {
        this.docuNo = docuNo;
    }

    public String getContent() {
        return this.content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getEmpty() {
        return this.empty;
    }

    public void setEmpty(String empty) {
        this.empty = empty;
    }

}

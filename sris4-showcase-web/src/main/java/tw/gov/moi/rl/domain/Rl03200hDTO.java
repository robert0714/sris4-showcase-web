/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.domain;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;
import tw.gov.moi.domain.Rldf001hType;
import tw.gov.moi.domain.Rldf002hType;
import tw.gov.moi.domain.Rldf004hType;
import tw.gov.moi.domain.Rldf005hType;
import tw.gov.moi.domain.Rldf008hType;
import tw.gov.moi.domain.Rldf047hType;
import tw.gov.moi.domain.Rldfm11hType;

/**
 * The Class Rl03200hDTO.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl03200hDTO", propOrder = { "rldf001h", "rldf002h", "rldf002hList", "rldf004h", "householdHead",
        "rldf004hList", "violence", "rldf005h", "rldf005hList", "rldf008h", "rldf008hList", "rldf047h", "rldfm11h",
        "personBirthYyymmdd", "sealApplyContent", "relationshipCode", "streetDoorplateFormat" })
@XmlRootElement(name = "Rl03200hDTO")
public class Rl03200hDTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** 除戶全戶基本資料 */
    @FieldName("除戶全戶基本資料")
    @XmlElement(name = "Rldf001h")
    private Rldf001hType rldf001h;

    /** 除戶全戶動態記事 */
    @FieldName("除戶全戶動態記事")
    @XmlElement(name = "Rldf002h")
    private Rldf002hType rldf002h;

    /** 除戶全戶動態記事清單 */
    @FieldName("除戶全戶動態記事清單")
    @XmlElement(name = "Rldf002hList")
    private List<Rldf002hType> rldf002hList;

    /** 除戶個人基本資料 */
    @FieldName("除戶個人基本資料")
    @XmlElement(name = "Rldf004h")
    private Rldf004hType rldf004h;

    /** 除戶戶長個人基本資料 */
    @FieldName("除戶戶長個人基本資料 ")
    @XmlElement(name = "HouseholdHead")
    private Rldf004hType householdHead;

    /** 除戶戶下成員 */
    @FieldName("除戶戶下成員")
    @XmlElement(name = "Rldf004hList")
    private List<Rldf004hType> rldf004hList;

    /** 除戶家暴被害 */
    @FieldName("除戶家暴被害")
    @XmlElement(name = "Violence")
    private List<Rldf004hType> violence;

    /** 除戶個人記事資料 */
    @FieldName("除戶個人記事資料")
    @XmlElement(name = "Rldf005h")
    private Rldf005hType rldf005h;

    /** 除戶個人記事資料清單 */
    @FieldName("除戶個人記事資料清單 ")
    @XmlElement(name = "Rldf005hList")
    private List<Rldf005hType> rldf005hList;

    /** 除戶特殊註記 */
    @FieldName("除戶特殊註記")
    @XmlElement(name = "Rldf008h")
    private Rldf008hType rldf008h;

    /** 除戶特殊註記清單 */
    @FieldName("除戶特殊註記清單")
    @XmlElement(name = "Rldf008hList")
    private List<Rldf008hType> rldf008hList;

    /** 除戶姓名羅馬拼音資料 */
    @FieldName("除戶姓名羅馬拼音資料")
    @XmlElement(name = "Rldf047h")
    private Rldf047hType rldf047h;

    /** 除戶個人姓氏資料 */
    @FieldName("除戶個人姓氏資料")
    @XmlElement(name = "Rldfm11h")
    private Rldfm11hType rldfm11h;

    /** 被選取人的出生日期. */
    @FieldName("被選取人的出生日期")
    @XmlElement(name = "PersonBirthYyymmdd")
    private String personBirthYyymmdd = "";

    /** 印鑑登記內容. */
    @FieldName("印鑑登記內容")
    @XmlElement(name = "SealApplyContent")
    private String sealApplyContent = "";

    /** 稱謂代碼. */
    @FieldName("稱謂代碼")
    @XmlElement(name = "RelationshipCode")
    private String relationshipCode = "";

    /** 街路門牌開根號. */
    @FieldName("街路門牌開根號")
    @XmlElement(name = "StreetDoorplateFormat")
    private String streetDoorplateFormat = "";

    public Rldf001hType getRldf001h() {
        return rldf001h;
    }

    public void setRldf001h(Rldf001hType rldf001h) {
        this.rldf001h = rldf001h;
    }

    public Rldf002hType getRldf002h() {
        return rldf002h;
    }

    public void setRldf002h(Rldf002hType rldf002h) {
        this.rldf002h = rldf002h;
    }

    public List<Rldf002hType> getRldf002hList() {
        return rldf002hList;
    }

    public void setRldf002hList(List<Rldf002hType> rldf002hList) {
        this.rldf002hList = rldf002hList;
    }

    public Rldf004hType getRldf004h() {
        return rldf004h;
    }

    public void setRldf004h(Rldf004hType rldf004h) {
        this.rldf004h = rldf004h;
    }

    public Rldf004hType getHouseholdHead() {
        return householdHead;
    }

    public void setHouseholdHead(Rldf004hType householdHead) {
        this.householdHead = householdHead;
    }

    public List<Rldf004hType> getRldf004hList() {
        return rldf004hList;
    }

    public void setRldf004hList(List<Rldf004hType> rldf004hList) {
        this.rldf004hList = rldf004hList;
    }

    public List<Rldf004hType> getViolence() {
        return violence;
    }

    public void setViolence(List<Rldf004hType> violence) {
        this.violence = violence;
    }

    public Rldf005hType getRldf005h() {
        return rldf005h;
    }

    public void setRldf005h(Rldf005hType rldf005h) {
        this.rldf005h = rldf005h;
    }

    public List<Rldf005hType> getRldf005hList() {
        return rldf005hList;
    }

    public void setRldf005hList(List<Rldf005hType> rldf005hList) {
        this.rldf005hList = rldf005hList;
    }

    public Rldf008hType getRldf008h() {
        return rldf008h;
    }

    public void setRldf008h(Rldf008hType rldf008h) {
        this.rldf008h = rldf008h;
    }

    public List<Rldf008hType> getRldf008hList() {
        return rldf008hList;
    }

    public void setRldf008hList(List<Rldf008hType> rldf008hList) {
        this.rldf008hList = rldf008hList;
    }

    public Rldf047hType getRldf047h() {
        return rldf047h;
    }

    public void setRldf047h(Rldf047hType rldf047h) {
        this.rldf047h = rldf047h;
    }

    public Rldfm11hType getRldfm11h() {
        return rldfm11h;
    }

    public void setRldfm11h(Rldfm11hType rldfm11h) {
        this.rldfm11h = rldfm11h;
    }

    public String getPersonBirthYyymmdd() {
        return personBirthYyymmdd;
    }

    public void setPersonBirthYyymmdd(String personBirthYyymmdd) {
        this.personBirthYyymmdd = personBirthYyymmdd;
    }

    public String getSealApplyContent() {
        return sealApplyContent;
    }

    public void setSealApplyContent(String sealApplyContent) {
        this.sealApplyContent = sealApplyContent;
    }

    public String getRelationshipCode() {
        return relationshipCode;
    }

    public void setRelationshipCode(String relationshipCode) {
        this.relationshipCode = relationshipCode;
    }

    public String getStreetDoorplateFormat() {
        return streetDoorplateFormat;
    }

    public void setStreetDoorplateFormat(String streetDoorplateFormat) {
        this.streetDoorplateFormat = streetDoorplateFormat;
    }

}

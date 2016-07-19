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
import tw.gov.moi.domain.Rldf001mType;
import tw.gov.moi.domain.Rldf002mType;
import tw.gov.moi.domain.Rldf004mType;
import tw.gov.moi.domain.Rldf005mType;
import tw.gov.moi.domain.Rldf008mType;
import tw.gov.moi.domain.Rldf030mType;
import tw.gov.moi.domain.Rldf047mType;
import tw.gov.moi.domain.Rldfm11mType;

/**
 * The Class Rl03200mDTO.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl03200mDTO", propOrder = { "rldf001m", "rldf002m", "rldf002mList", "rldf004m", "householdHead",
        "rldf004mList", "violence", "rldf005m", "rldf005mList", "rldf008m", "rldf008mList", "rldfm11m", "rldf030m",
        "rldf030mList", "rldf047m", "personBirthYyymmdd", "sealApplyContent", "relationshipCode",
        "streetDoorplateFormat" })
@XmlRootElement(name = "Rl03200mDTO")
public class Rl03200mDTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** 全戶基本資料 */
    @FieldName("全戶基本資料")
    @XmlElement(name = "Rldf001m")
    private Rldf001mType rldf001m;

    /** 全戶動態記事資料 */
    @FieldName("全戶動態記事資料")
    @XmlElement(name = "Rldf002m")
    private Rldf002mType rldf002m;

    /** 全戶動態記事資料清單 */
    @FieldName("全戶動態記事資料清單")
    @XmlElement(name = "Rldf002mList")
    private List<Rldf002mType> rldf002mList;

    /** 現戶個人基本資料 */
    @FieldName("現戶個人基本資料")
    @XmlElement(name = "Rldf004m")
    private Rldf004mType rldf004m;

    /** 現戶戶長個人基本資料 */
    @FieldName("現戶戶長個人基本資料")
    @XmlElement(name = "HouseholdHead")
    private Rldf004mType householdHead;

    /** 戶下成員 */
    @FieldName("戶下成員")
    @XmlElement(name = "Rldf004mList")
    private List<Rldf004mType> rldf004mList;

    /** 家暴被害 */
    @FieldName("家暴被害")
    @XmlElement(name = "Violence")
    private List<Rldf004mType> violence;

    /** 個人記事資料 */
    @FieldName("個人記事資料 ")
    @XmlElement(name = "Rldf005m")
    private Rldf005mType rldf005m;

    /** 個人記事資料清單 */
    @FieldName("個人記事資料清單 ")
    @XmlElement(name = "Rldf005mList")
    private List<Rldf005mType> rldf005mList;

    /** 特殊人口資料 */
    @FieldName("特殊人口資料 ")
    @XmlElement(name = "Rldf008m")
    private Rldf008mType rldf008m;

    /** 特殊人口資料清單 */
    @FieldName("特殊人口資料清單")
    @XmlElement(name = "Rldf008mLList")
    private List<Rldf008mType> rldf008mList;

    /** 個人姓氏資料檔 */
    @FieldName("個人姓氏資料檔")
    @XmlElement(name = "Rldfm11m")
    private Rldfm11mType rldfm11m;

    /** 所內記事資料 */
    @FieldName("所內記事資料")
    @XmlElement(name = "Rldf030m")
    private Rldf030mType rldf030m;

    /** 所內記事資料清單 */
    @FieldName("所內記事資料清單")
    @XmlElement(name = "Rldf030mList")
    private List<Rldf030mType> rldf030mList;

    /** 姓名羅馬拼音資料 */
    @FieldName("姓名羅馬拼音資料")
    @XmlElement(name = "Rldf047m")
    private Rldf047mType rldf047m;

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

    public Rldf001mType getRldf001m() {
        return rldf001m;
    }

    public void setRldf001m(Rldf001mType rldf001m) {
        this.rldf001m = rldf001m;
    }

    public Rldf002mType getRldf002m() {
        return rldf002m;
    }

    public void setRldf002m(Rldf002mType rldf002m) {
        this.rldf002m = rldf002m;
    }

    public List<Rldf002mType> getRldf002mList() {
        return rldf002mList;
    }

    public void setRldf002mList(List<Rldf002mType> rldf002mList) {
        this.rldf002mList = rldf002mList;
    }

    public Rldf004mType getRldf004m() {
        return rldf004m;
    }

    public void setRldf004m(Rldf004mType rldf004m) {
        this.rldf004m = rldf004m;
    }

    public Rldf004mType getHouseholdHead() {
        return householdHead;
    }

    public void setHouseholdHead(Rldf004mType householdHead) {
        this.householdHead = householdHead;
    }

    public List<Rldf004mType> getRldf004mList() {
        return rldf004mList;
    }

    public void setRldf004mList(List<Rldf004mType> rldf004mList) {
        this.rldf004mList = rldf004mList;
    }

    public List<Rldf004mType> getViolence() {
        return violence;
    }

    public void setViolence(List<Rldf004mType> violence) {
        this.violence = violence;
    }

    public Rldf005mType getRldf005m() {
        return rldf005m;
    }

    public void setRldf005m(Rldf005mType rldf005m) {
        this.rldf005m = rldf005m;
    }

    public List<Rldf005mType> getRldf005mList() {
        return rldf005mList;
    }

    public void setRldf005mList(List<Rldf005mType> rldf005mList) {
        this.rldf005mList = rldf005mList;
    }

    public Rldf008mType getRldf008m() {
        return rldf008m;
    }

    public void setRldf008m(Rldf008mType rldf008m) {
        this.rldf008m = rldf008m;
    }

    public List<Rldf008mType> getRldf008mList() {
        return rldf008mList;
    }

    public void setRldf008mList(List<Rldf008mType> rldf008mList) {
        this.rldf008mList = rldf008mList;
    }

    public Rldfm11mType getRldfm11m() {
        return rldfm11m;
    }

    public void setRldfm11m(Rldfm11mType rldfm11m) {
        this.rldfm11m = rldfm11m;
    }

    public Rldf030mType getRldf030m() {
        return rldf030m;
    }

    public void setRldf030m(Rldf030mType rldf030m) {
        this.rldf030m = rldf030m;
    }

    public List<Rldf030mType> getRldf030mList() {
        return rldf030mList;
    }

    public void setRldf030mList(List<Rldf030mType> rldf030mList) {
        this.rldf030mList = rldf030mList;
    }

    public Rldf047mType getRldf047m() {
        return rldf047m;
    }

    public void setRldf047m(Rldf047mType rldf047m) {
        this.rldf047m = rldf047m;
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

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
 * The Class Rl03100ConditionDTO.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl03100ConditionDTO", propOrder = { "personId", "personName", "siteId", "queryScope", "violenceMark",
        "removeYyyStrat", "removeYyyEnd", "personName1", "personName2", "personName3", "personName4" })
@XmlRootElement(name = "Rl03100ConditionDTO")
public class Rl03100ConditionDTO implements Serializable {

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 1L;

    /** 當事人國民身分證統一編號 */
    @FieldName("當事人國民身分證統一編號")
    @XmlElement(name = "PersonId")
    private String personId;

    /** 當事人國民身分證統一編號 */
    @FieldName("當事人國民身分證統一編號")
    @XmlElement(name = "PersonName")
    private String personName;

    /** 作業點代碼 */
    @FieldName("作業點代碼 ")
    @XmlElement(name = "SiteId")
    private String siteId;

    /** 查詢範圍 */
    @FieldName("查詢範圍")
    @XmlElement(name = "QueryScope")
    private String queryScope;

    /** 已檢核申請人非保護家庭暴力資料之相對人 */
    @FieldName("已檢核申請人非保護家庭暴力資料之相對人")
    @XmlElement(name = "ViolenceMark")
    private String violenceMark;

    /** 除戶年份-起 */
    @FieldName("除戶年份-起")
    @XmlElement(name = "RemoveYyyStrat")
    private String removeYyyStart;

    /** 除戶年份-迄 */
    @FieldName("除戶年份-迄")
    @XmlElement(name = "RemoveYyyEnd")
    private String removeYyyEnd;

    /** 部份人口姓名 */
    @FieldName("部份人口姓名1")
    @XmlElement(name = "PersonName1")
    private String personName1;

    /** 部份人口姓名 */
    @FieldName("部份人口姓名2")
    @XmlElement(name = "PersonName2")
    private String personName2;

    /** 部份人口姓名 */
    @FieldName("部份人口姓名3")
    @XmlElement(name = "PersonName3")
    private String personName3;

    /** 部份人口姓名 */
    @FieldName("部份人口姓名4")
    @XmlElement(name = "PersonName4")
    private String personName4;

    public String getPersonId() {
        return personId;
    }

    public void setPersonId(String personId) {
        this.personId = personId;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getSiteId() {
        return siteId;
    }

    public void setSiteId(String siteId) {
        this.siteId = siteId;
    }

    public String getQueryScope() {
        return queryScope;
    }

    public void setQueryScope(String queryScope) {
        this.queryScope = queryScope;
    }

    public String getViolenceMark() {
        return violenceMark;
    }

    public void setViolenceMark(String violenceMark) {
        this.violenceMark = violenceMark;
    }

    public String getRemoveYyyStart() {
        return removeYyyStart;
    }

    public void setRemoveYyyStart(String removeYyyStart) {
        this.removeYyyStart = removeYyyStart;
    }

    public String getRemoveYyyEnd() {
        return removeYyyEnd;
    }

    public void setRemoveYyyEnd(String removeYyyEnd) {
        this.removeYyyEnd = removeYyyEnd;
    }

    public String getPersonName1() {
        return personName1;
    }

    public void setPersonName1(String personName1) {
        this.personName1 = personName1;
    }

    public String getPersonName2() {
        return personName2;
    }

    public void setPersonName2(String personName2) {
        this.personName2 = personName2;
    }

    public String getPersonName3() {
        return personName3;
    }

    public void setPersonName3(String personName3) {
        this.personName3 = personName3;
    }

    public String getPersonName4() {
        return personName4;
    }

    public void setPersonName4(String personName4) {
        this.personName4 = personName4;
    }
}

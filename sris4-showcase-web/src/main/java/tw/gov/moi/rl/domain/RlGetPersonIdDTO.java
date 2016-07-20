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

import org.apache.commons.lang.builder.ToStringBuilder;

import tw.gov.moi.ae.checker.annotation.FieldName;
import tw.gov.moi.rl.common.constant.RlConstant;

/**
 * The Class RlGetPersonIdDTO.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rlGetPersonIdDTO", propOrder = { "personId", "siteId", "relationId", "relationCode",
        "householdHeadId", "householdId", "personIds", "removeYyymmdd", "removeTime", "registerYyymmdd",
        "registerHhmmss", "personMark" })
@XmlRootElement(name = "RlGetPersonIdDTO", namespace = RlConstant.Namespace_RL_DOMAIN)
public class RlGetPersonIdDTO implements Serializable {

    private static final long serialVersionUID = -5656277621449846115L;

    /** The person id. */
    @XmlElement(name = "PersonId", required = false)
    @FieldName("統號")
    private String personId;

    /** The site id. */
    @XmlElement(name = "SiteId", required = false)
    @FieldName("作業點代碼")
    private String siteId;

    /** 關係人統號. */
    @XmlElement(name = "RelationId")
    @FieldName("關係人統號")
    private String relationId = "";

    /** 關係人之彼此關係代碼. */
    @XmlElement(name = "RelationCode")
    @FieldName("關係人之彼此關係代碼")
    private String relationCode = "";

    /** 戶長統號. */
    @XmlElement(name = "HouseholdHeadId")
    @FieldName("戶長統號")
    private String householdHeadId = "";

    /** 戶號. */
    @XmlElement(name = "HouseholdId")
    @FieldName("戶號")
    private String householdId = "";

    /** 統號清單. */
    @XmlElement(name = "PersonIds")
    @FieldName("統號清單")
    private List<String> personIds = new ArrayList<String>();

    @XmlElement(name = "RemoveYyymmdd")
    @FieldName("除戶日期")
    private String removeYyymmdd;

    @XmlElement(name = "RemoveTime")
    @FieldName("除戶時間")
    private String removeTime;

    @XmlElement(name = "RegisterYyymmdd")
    @FieldName("登記日期")
    private String registerYyymmdd;

    @XmlElement(name = "RegisterHhmmss")
    @FieldName("登記時間")
    private String registerHhmmss;

    @XmlElement(name = "PersonMark", required = false)
    @FieldName("個人註記")
    private String personMark;

    public String getPersonMark() {
        return personMark;
    }

    public void setPersonMark(String personMark) {
        this.personMark = personMark;
    }

    public String getRemoveYyymmdd() {
        return removeYyymmdd;
    }

    public void setRemoveYyymmdd(String removeYyymmdd) {
        this.removeYyymmdd = removeYyymmdd;
    }

    public String getRemoveTime() {
        return removeTime;
    }

    public void setRemoveTime(String removeTime) {
        this.removeTime = removeTime;
    }

    public String getPersonId() {
        return personId;
    }

    public void setPersonId(String personId) {
        this.personId = personId;
    }

    public String getSiteId() {
        return siteId;
    }

    public void setSiteId(String siteId) {
        this.siteId = siteId;
    }

    public String getRelationId() {
        return relationId;
    }

    public void setRelationId(String relationId) {
        this.relationId = relationId;
    }

    public String getRelationCode() {
        return relationCode;
    }

    public void setRelationCode(String relationCode) {
        this.relationCode = relationCode;
    }

    public String getHouseholdHeadId() {
        return householdHeadId;
    }

    public void setHouseholdHeadId(String householdHeadId) {
        this.householdHeadId = householdHeadId;
    }

    public String getHouseholdId() {
        return householdId;
    }

    public void setHouseholdId(String householdId) {
        this.householdId = householdId;
    }

    public List<String> getPersonIds() {
        return personIds;
    }

    public void setPersonIds(List<String> personIds) {
        this.personIds = personIds;
    }

    public String getRegisterYyymmdd() {
        return registerYyymmdd;
    }

    public void setRegisterYyymmdd(String registerYyymmdd) {
        this.registerYyymmdd = registerYyymmdd;
    }

    public String getRegisterHhmmss() {
        return registerHhmmss;
    }

    public void setRegisterHhmmss(String registerHhmmss) {
        this.registerHhmmss = registerHhmmss;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}

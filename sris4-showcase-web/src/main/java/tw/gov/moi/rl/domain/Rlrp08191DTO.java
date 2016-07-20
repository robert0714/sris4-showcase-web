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
 * 戶籍人口統計月報表XX案件數清查表 DTO
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rlrp08191DTO", propOrder = { "village", "registerDate", "registerTime", "personName", "personId",
        "birthKindCode", "birthTypeCode", "motherNationalityCode", "outliveCaseFlag", "nationalityCode",
        "nowStateCode", "registerContent" })
@XmlRootElement(name = "Rlrp08191DTO")
public class Rlrp08191DTO implements Serializable {

    private static final long serialVersionUID = 2667336385157441851L;

    /** 村里. */
    @XmlElement(name = "Village")
    @FieldName("村里")
    private String village = "";

    /** 登記日期. */
    @XmlElement(name = "RegisterDate")
    @FieldName("登記日期")
    private String registerDate = "";

    /** 登記時間. */
    @XmlElement(name = "RegisterTime")
    @FieldName("登記時間")
    private String registerTime = "";

    /** 當事人姓名. */
    @XmlElement(name = "PersonName")
    @FieldName("當事人姓名")
    private String personName = "";

    /** 統號. */
    @XmlElement(name = "PersonId")
    @FieldName("統號")
    private String personId = "";

    /** 出生身分. */
    @XmlElement(name = "BirthKindCode")
    @FieldName("出生身分")
    private String birthKindCode = "";

    /** 胎別. */
    @XmlElement(name = "BirthTypeCode")
    @FieldName("胎別")
    private String birthTypeCode = "";

    /** 生母(原屬)國籍. */
    @XmlElement(name = "MotherNationalityCode")
    @FieldName("生母(原屬)國籍")
    private String motherNationalityCode = "";

    /** 非現住人口. */
    @XmlElement(name = "OutliveCaseFlag")
    @FieldName("非現住人口")
    private String outliveCaseFlag = "";

    /** 原屬國籍. */
    @XmlElement(name = "NationalityCode")
    @FieldName("原屬國籍")
    private String nationalityCode = "";

    /** 戶籍現況. */
    @XmlElement(name = "NowStateCode")
    @FieldName("戶籍現況")
    private String nowStateCode = "";

    /** 申請書備註. */
    @XmlElement(name = "RegisterContent")
    @FieldName("申請書備註")
    private String registerContent = "";

    public String getVillage() {
        return this.village;
    }

    public void setVillage(String village) {
        this.village = village;
    }

    public String getRegisterDate() {
        return this.registerDate;
    }

    public void setRegisterDate(String registerDate) {
        this.registerDate = registerDate;
    }

    public String getRegisterTime() {
        return this.registerTime;
    }

    public void setRegisterTime(String registerTime) {
        this.registerTime = registerTime;
    }

    public String getPersonName() {
        return this.personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getPersonId() {
        return this.personId;
    }

    public void setPersonId(String personId) {
        this.personId = personId;
    }

    public String getBirthKindCode() {
        return this.birthKindCode;
    }

    public void setBirthKindCode(String birthKindCode) {
        this.birthKindCode = birthKindCode;
    }

    public String getBirthTypeCode() {
        return this.birthTypeCode;
    }

    public void setBirthTypeCode(String birthTypeCode) {
        this.birthTypeCode = birthTypeCode;
    }

    public String getMotherNationalityCode() {
        return this.motherNationalityCode;
    }

    public void setMotherNationalityCode(String motherNationalityCode) {
        this.motherNationalityCode = motherNationalityCode;
    }

    public String getOutliveCaseFlag() {
        return this.outliveCaseFlag;
    }

    public void setOutliveCaseFlag(String outliveCaseFlag) {
        this.outliveCaseFlag = outliveCaseFlag;
    }

    public String getNationalityCode() {
        return this.nationalityCode;
    }

    public void setNationalityCode(String nationalityCode) {
        this.nationalityCode = nationalityCode;
    }

    public String getNowStateCode() {
        return this.nowStateCode;
    }

    public void setNowStateCode(String nowStateCode) {
        this.nowStateCode = nowStateCode;
    }

    public String getRegisterContent() {
        return this.registerContent;
    }

    public void setRegisterContent(String registerContent) {
        this.registerContent = registerContent;
    }
}

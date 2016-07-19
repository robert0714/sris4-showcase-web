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
 * The Class Rl08350DTO.
 * 
 * @author PeterYu
 */

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl08350DTO", propOrder = { "village", "personId", "age", "birthYyymmdd", "educationCode", "infoList" })
@XmlRootElement(name = "Rl08350DTO")
public class Rl08350DTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** The village. */
    @XmlElement(name = "Village")
    @FieldName("村里")
    private String village = "";

    /** The person id. */
    @XmlElement(name = "PersonId")
    @FieldName("統一編號")
    private String personId = "";

    /** The education. */
    @XmlElement(name = "EducationCode")
    @FieldName("教育程度")
    private String educationCode = "";

    /** The age. */
    @XmlElement(name = "Age")
    @FieldName("年齡")
    private String age = "";

    /** 出生日期. */
    @XmlElement(name = "BirthYyymmdd")
    @FieldName("出生日期")
    private String birthYyymmdd = "";

    /** The Message. */
    @XmlElement(name = "Msg")
    @FieldName("資料")
    private String msg = "";

    /** 統計基準日 */
    @XmlElement(name = "BeginDate")
    @FieldName("統計基準日")
    private String beginDate = "";

    /** 總資料項目數 */
    @XmlElement(name = "TlDataCount")
    @FieldName("總資料項目數")
    private String tlDataCount = "23";

    /** 半數資料項目數 */
    @XmlElement(name = "HfDataCount")
    @FieldName("半數資料項目數")
    private String hfDataCount = "12";

    /** 未詳總人口數 */
    @XmlElement(name = "Msg")
    @FieldName("資料")
    private String tlUnknownPersonCount = "0";

    /** 詳總人口數 */
    @XmlElement(name = "tlknownPersonCount")
    @FieldName("詳總人口數")
    private String tlknownPersonCount = "0";

    public String getVillage() {
        return village;
    }

    public void setVillage(String village) {
        this.village = village;
    }

    public String getPersonId() {
        return personId;
    }

    public void setPersonId(String personId) {
        this.personId = personId;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getBirthYyymmdd() {
        return birthYyymmdd;
    }

    public void setBirthYyymmdd(String birthYyymmdd) {
        this.birthYyymmdd = birthYyymmdd;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getBeginDate() {
        return beginDate;
    }

    public void setBeginDate(String beginDate) {
        this.beginDate = beginDate;
    }

    public String getTlDataCount() {
        return tlDataCount;
    }

    public void setTlDataCount(String tlDataCount) {
        this.tlDataCount = tlDataCount;
    }

    public String getHfDataCount() {
        return hfDataCount;
    }

    public void setHfDataCount(String hfDataCount) {
        this.hfDataCount = hfDataCount;
    }

    public String getTlUnknownPersonCount() {
        return tlUnknownPersonCount;
    }

    public void setTlUnknownPersonCount(String tlUnknownPersonCount) {
        this.tlUnknownPersonCount = tlUnknownPersonCount;
    }

    public String getTlknownPersonCount() {
        return tlknownPersonCount;
    }

    public void setTlknownPersonCount(String tlknownPersonCount) {
        this.tlknownPersonCount = tlknownPersonCount;
    }

    public String getEducationCode() {
        return educationCode;
    }

    public void setEducationCode(String educationCode) {
        this.educationCode = educationCode;
    }

}

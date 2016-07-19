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
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;

/**
 * 外籍者DTO
 * 
 * @author DAXIONG
 */

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XLDFForeignPersonDTO", propOrder = { "nationalityCode", "nationality", "nationCode", "foreignName",
        "foreignAddress", "ForeignBirthYyyymmdd", "OverseaPlace" })
public class XLDFForeignPersonDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    /** 外籍者(原屬)國籍代碼 */
    @XmlElement(name = "NationalityCode", required = true)
    @FieldName("外籍者(原屬)國籍代碼")
    private String nationalityCode;

    /** 外籍者(原屬)國籍 */
    @XmlElement(name = "Nationality", required = true)
    @FieldName("外籍者(原屬)國籍")
    private String nationality;

    /** 外籍者國籍或區域代碼 */
    @XmlElement(name = "NationCode", required = true)
    @FieldName("外籍者國籍或區域代碼")
    private String nationCode;

    /** 外籍者英文姓名 */
    @XmlElement(name = "ForeignName", required = true)
    @FieldName("外籍者英文姓名")
    private String foreignName;

    /** 外籍者國外地址 */
    @XmlElement(name = "ForeignAddress", required = true)
    @FieldName("外籍者國外地址")
    private String foreignAddress;

    /** 外籍者西元出生日期 */
    @XmlElement(name = "ForeignBirthYyyymmdd", required = true)
    @FieldName("外籍者西元出生日期")
    private String foreignBirthYyyymmdd;

    /** 僑居 */
    @XmlElement(name = "OverseaPlace", required = true)
    @FieldName("僑居")
    private String overseaPlace;

    public String getNationalityCode() {
        return nationalityCode;
    }

    public void setNationalityCode(final String nationalityCode) {
        this.nationalityCode = nationalityCode;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(final String nationality) {
        this.nationality = nationality;
    }

    public String getNationCode() {
        return nationCode;
    }

    public void setNationCode(final String nationCode) {
        this.nationCode = nationCode;
    }

    public String getForeignName() {
        return foreignName;
    }

    public void setForeignName(final String foreignName) {
        this.foreignName = foreignName;
    }

    public String getForeignAddress() {
        return foreignAddress;
    }

    public void setForeignAddress(final String foreignAddress) {
        this.foreignAddress = foreignAddress;
    }

    public String getForeignBirthYyyymmdd() {
        return foreignBirthYyyymmdd;
    }

    public void setForeignBirthYyyymmdd(final String foreignBirthYyyymmdd) {
        this.foreignBirthYyyymmdd = foreignBirthYyyymmdd;
    }

    public String getOverseaPlace() {
        return overseaPlace;
    }

    public void setOverseaPlace(final String overseaPlace) {
        this.overseaPlace = overseaPlace;
    }
}

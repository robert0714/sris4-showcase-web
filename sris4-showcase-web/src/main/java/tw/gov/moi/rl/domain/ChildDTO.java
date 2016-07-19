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
import tw.gov.moi.rl.component.xldf.dto.XLDFM05M;
import tw.gov.moi.rl.domain.xldf.XLDFHouseholdDataDomainObject;
import tw.gov.moi.rl.domain.xldf.XLDFPersonDataDomainObject;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "childDTO", propOrder = { "person", "householdHead", "personHousehold", "foreignPerson", "personForeignFlag", "bookFlag", "householdHeadFlag", "orgEducationMark", "deleteFlag", "fatherXldfm05m", "motherXldfm05m" })
@XmlRootElement(name = "ChildDTO")
public class ChildDTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** 當事人-個人基本資料 */
    @FieldName("當事人-個人基本資料")
    @XmlElement(name = "Person", required = false)
    private XLDFPersonDataDomainObject person;

    /** 戶長 */
    @FieldName("戶長")
    @XmlElement(name = "HouseholdHead", required = false)
    private XLDFPersonDataDomainObject householdHead;

    /** 當事人-全戶基本資料 */
    @FieldName("當事人-全戶基本資料")
    @XmlElement(name = "PersonHousehold", required = false)
    private XLDFHouseholdDataDomainObject personHousehold;

    /** 當事人-外籍者資料 */
    @FieldName("當事人-外籍者資料")
    @XmlElement(name = "ForeignPerson", required = false)
    private XLDFForeignPersonDTO foreignPerson;

    /** 當事人統號是否為外籍者 */
    @FieldName("當事人統號是否為外籍者")
    @XmlElement(name = "personForeignFlag", required = false)
    private String personForeignFlag;

    /** 當事人簿頁旗標 */
    @FieldName("當事人簿頁旗標")
    @XmlElement(name = "BookFlag", required = false)
    private String bookFlag;

    /** 事人是否為戶長旗標 */
    @FieldName("事人是否為戶長旗標")
    @XmlElement(name = "HouseholdHeadFlag", required = false)
    private boolean householdHeadFlag;

    /** 原教育程度註記 */
    @FieldName("原教育程度註記")
    @XmlElement(name = "OrgEducationMark", required = false)
    private String orgEducationMark;

    /** 刪除註記 */
    @FieldName("刪除註記")
    @XmlElement(name = "DeleteFlag", required = false)
    private boolean deleteFlag;

    /** 父-未成年子女權利義務行使負擔資料檔 */
    @FieldName("父-未成年子女權利義務行使負擔資料檔")
    @XmlElement(name = "FatherXldfm05m", required = false)
    private XLDFM05M fatherXldfm05m;

    /** 母-未成年子女權利義務行使負擔資料檔 */
    @FieldName("母-未成年子女權利義務行使負擔資料檔")
    @XmlElement(name = "MotherXldfm05m", required = false)
    private XLDFM05M motherXldfm05m;

    public String getBookFlag() {
        return bookFlag;
    }

    public XLDFM05M getFatherXldfm05m() {
        return fatherXldfm05m;
    }

    public XLDFForeignPersonDTO getForeignPerson() {
        return foreignPerson;
    }

    public XLDFPersonDataDomainObject getHouseholdHead() {
        return householdHead;
    }

    public XLDFM05M getMotherXldfm05m() {
        return motherXldfm05m;
    }

    public String getOrgEducationMark() {
        return orgEducationMark;
    }

    public XLDFPersonDataDomainObject getPerson() {
        return person;
    }

    public String getPersonForeignFlag() {
        return personForeignFlag;
    }

    public XLDFHouseholdDataDomainObject getPersonHousehold() {
        return personHousehold;
    }

    public boolean isDeleteFlag() {
        return deleteFlag;
    }

    public boolean isHouseholdHeadFlag() {
        return householdHeadFlag;
    }

    public void setBookFlag(String bookFlag) {
        this.bookFlag = bookFlag;
    }

    public void setDeleteFlag(boolean deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    public void setFatherXldfm05m(XLDFM05M fatherXldfm05m) {
        this.fatherXldfm05m = fatherXldfm05m;
    }

    public void setForeignPerson(XLDFForeignPersonDTO foreignPerson) {
        this.foreignPerson = foreignPerson;
    }

    public void setHouseholdHead(XLDFPersonDataDomainObject householdHead) {
        this.householdHead = householdHead;
    }

    public void setHouseholdHeadFlag(boolean householdHeadFlag) {
        this.householdHeadFlag = householdHeadFlag;
    }

    public void setMotherXldfm05m(XLDFM05M motherXldfm05m) {
        this.motherXldfm05m = motherXldfm05m;
    }

    public void setOrgEducationMark(String orgEducationMark) {
        this.orgEducationMark = orgEducationMark;
    }

    public void setPerson(XLDFPersonDataDomainObject person) {
        this.person = person;
    }

    public void setPersonForeignFlag(String personForeignFlag) {
        this.personForeignFlag = personForeignFlag;
    }

    public void setPersonHousehold(XLDFHouseholdDataDomainObject personHousehold) {
        this.personHousehold = personHousehold;
    }

}

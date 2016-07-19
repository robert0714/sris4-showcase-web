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
import tw.gov.moi.rl.domain.xldf.XLDFPersonDataDomainObject;

/**
 * 初設戶籍登記-初設戶籍者DTO.
 * 
 * @author Viva.Hong
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FirstPersonDataObject", propOrder = { "firstPersonData", "personRole", "specialId", "nationalityCode",
        "nationality", "nationCode", "personNoteFlag", "householdState", "orgEducationMark", "educationName",
        "livingStyleCodeName", "livingRaceTypeName", "admoApprovedDate", "acptAdmoName", "acptAdmoSign",
        "acptAdmoMarking", "orgLivingPlace", "entryDate", "obtainNationalityDate", "personId3rd", "originalSiteId",
        "reIssueDate", "birthOrderSexName", "birthPlaceCodeName", "color", "deleteFlag", "finishFlag" })
@XmlRootElement(name = "FirstPersonDataObject")
public class FirstPersonDataObject implements Serializable {

    /** serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** 初設戶籍者-個人基本資料. */
    @XmlElement(name = "FirstPersonData", required = true)
    @FieldName("初設戶籍者-個人基本資料")
    private XLDFPersonDataDomainObject firstPersonData;

    /** 初設戶籍者身分（1:統號第一碼為$「無戶籍外籍者」、2:國人、3:統號第三碼為6、7、8「外國人有統號」）. */
    @XmlElement(name = "PersonRole", required = true)
    @FieldName("初設戶籍者身分")
    private String personRole;

    /** 識別統號. */
    @XmlElement(name = "SspecialId", required = true)
    @FieldName("識別統號")
    private String specialId;

    /** 初設戶籍者-(原屬)國籍代碼[三碼]. */
    @XmlElement(name = "NationalityCode", required = true)
    @FieldName("初設戶籍者-(原屬)國籍代碼[三碼]")
    private String nationalityCode;

    /** 初設戶籍者-外籍者(原屬)國籍. */
    @XmlElement(name = "Nationality", required = true)
    @FieldName("初設戶籍者-外籍者(原屬)國籍")
    private String nationality;

    /** 初設戶籍者-外籍者國籍或區域代碼[一碼]. */
    @XmlElement(name = "NationCode", required = true)
    @FieldName("初設戶籍者-外籍者國籍或區域代碼[一碼]")
    private String nationCode;

    /** 初設戶籍者-個人記事類別旗標. */
    @XmlElement(name = "PersonNoteFlag", required = true)
    @FieldName("初設戶籍者-個人記事類別旗標")
    private String personNoteFlag;

    /** 戶籍簿頁狀態（M現戶）、（H除戶）、（T暫存）. */
    @XmlElement(name = "HouseholdState", required = true)
    @FieldName("戶籍簿頁狀態")
    private String householdState;

    /** 原初設戶籍者-原教育程度註記. */
    @XmlElement(name = "OrgEducationMark", required = true)
    @FieldName("原初設戶籍者-原教育程度註記")
    private String orgEducationMark;

    /** 原初設戶籍者-教育程度名稱. */
    @XmlElement(name = "EducationName", required = true)
    @FieldName("原初設戶籍者-教育程度名稱")
    private String educationName;

    /** 原初設戶籍者-原住民身分名稱. */
    @XmlElement(name = "LivingStyleCodeName", required = true)
    @FieldName("原初設戶籍者-原住民身分名稱")
    private String livingStyleCodeName;

    /** 原初設戶籍者-族別名稱. */
    @XmlElement(name = "LivingRaceTypeName", required = true)
    @FieldName("原初設戶籍者-族別名稱")
    private String livingRaceTypeName;

    /** 戶政事務所核准日期. */
    @XmlElement(name = "AdmoApprovedDate", required = true)
    @FieldName("戶政事務所核准日期")
    private String admoApprovedDate;

    /** 受理地戶政事務所名稱. */
    @XmlElement(name = "AcptAdmoName", required = true)
    @FieldName("受理地戶政事務所名稱")
    private String acptAdmoName;

    /** 受理地戶政事務所字. */
    @XmlElement(name = "AcptAdmoSign", required = true)
    @FieldName("受理地戶政事務所字")
    private String acptAdmoSign;

    /** 受理地戶政事務所號函. */
    @XmlElement(name = "AcptAdmoMarking", required = true)
    @FieldName("受理地戶政事務所號函")
    private String acptAdmoMarking;

    /** 原住地. */
    @XmlElement(name = "OrgLivingPlace", required = true)
    @FieldName("原住地")
    private String orgLivingPlace;

    /** 入境日期. */
    @XmlElement(name = "EntryDate", required = true)
    @FieldName("入境日期")
    private String entryDate;

    /** 取得國籍日期. */
    @XmlElement(name = "ObtainNationalityDate", required = true)
    @FieldName("取得國籍日期")
    private String obtainNationalityDate;

    /** 統號第3碼. */
    @XmlElement(name = "PersonId3rd", required = true)
    @FieldName("統號第3碼")
    private String personId3rd;

    /** 原申請設籍作業點代碼. */
    @XmlElement(name = "OriginalSiteId", required = true)
    @FieldName("原申請設籍作業點代碼")
    private String originalSiteId;

    /** 移民署函日期. */
    @XmlElement(name = "ReIssueDate", required = true)
    @FieldName("移民署函日期")
    private String reIssueDate;

    /** 出生別名稱. */
    @XmlElement(name = "BirthOrderSexName", required = true)
    @FieldName("出生別名稱")
    private String birthOrderSexName;

    /** 出生地名稱. */
    @XmlElement(name = "BirthPlaceCodeName", required = true)
    @FieldName("出生地名稱")
    private String birthPlaceCodeName;

    /** (DataTable)背景顏色. */
    @XmlElement(name = "Color", required = true)
    @FieldName("(DataTable)背景顏色")
    private String color;

    /** (DataTable)是否刪除. */
    @XmlElement(name = "DeleteFlag", required = true)
    @FieldName("(DataTable)是否刪除")
    private boolean deleteFlag = false;

    /** (DataTable)是否確定完成. */
    @XmlElement(name = "FinishFlag", required = true)
    @FieldName("(DataTable)是否確定完成")
    private boolean finishFlag = false;

    /**
     * Gets the first person data.
     * 
     * @return the first person data
     */
    public XLDFPersonDataDomainObject getFirstPersonData() {
        return firstPersonData;
    }

    /**
     * Sets the first person data.
     * 
     * @param firstPersonData
     *            the new first person data
     */
    public void setFirstPersonData(final XLDFPersonDataDomainObject firstPersonData) {
        this.firstPersonData = firstPersonData;
    }

    /**
     * Gets the person role.
     * 
     * @return the person role
     */
    public String getPersonRole() {
        return personRole;
    }

    /**
     * Sets the person role.
     * 
     * @param personRole
     *            the new person role
     */
    public void setPersonRole(final String personRole) {
        this.personRole = personRole;
    }

    /**
     * Gets the special id.
     * 
     * @return the special id
     */
    public String getSpecialId() {
        return specialId;
    }

    /**
     * Sets the special id.
     * 
     * @param specialId
     *            the new special id
     */
    public void setSpecialId(final String specialId) {
        this.specialId = specialId;
    }

    /**
     * Gets the nationality code.
     * 
     * @return the nationality code
     */
    public String getNationalityCode() {
        return nationalityCode;
    }

    /**
     * Sets the nationality code.
     * 
     * @param nationalityCode
     *            the new nationality code
     */
    public void setNationalityCode(final String nationalityCode) {
        this.nationalityCode = nationalityCode;
    }

    /**
     * Gets the nationality.
     * 
     * @return the nationality
     */
    public String getNationality() {
        return nationality;
    }

    /**
     * Sets the nationality.
     * 
     * @param nationality
     *            the new nationality
     */
    public void setNationality(final String nationality) {
        this.nationality = nationality;
    }

    /**
     * Gets the nation code.
     * 
     * @return the nation code
     */
    public String getNationCode() {
        return nationCode;
    }

    /**
     * Sets the nation code.
     * 
     * @param nationCode
     *            the new nation code
     */
    public void setNationCode(final String nationCode) {
        this.nationCode = nationCode;
    }

    /**
     * Gets the person note flag.
     * 
     * @return the person note flag
     */
    public String getPersonNoteFlag() {
        return personNoteFlag;
    }

    /**
     * Sets the person note flag.
     * 
     * @param personNoteFlag
     *            the new person note flag
     */
    public void setPersonNoteFlag(final String personNoteFlag) {
        this.personNoteFlag = personNoteFlag;
    }

    /**
     * Gets the household state.
     * 
     * @return the household state
     */
    public String getHouseholdState() {
        return householdState;
    }

    /**
     * Sets the household state.
     * 
     * @param householdState
     *            the new household state
     */
    public void setHouseholdState(final String householdState) {
        this.householdState = householdState;
    }

    /**
     * Gets the org education mark.
     * 
     * @return the org education mark
     */
    public String getOrgEducationMark() {
        return orgEducationMark;
    }

    /**
     * Sets the org education mark.
     * 
     * @param orgEducationMark
     *            the new org education mark
     */
    public void setOrgEducationMark(final String orgEducationMark) {
        this.orgEducationMark = orgEducationMark;
    }

    /**
     * Gets the admo approved date.
     * 
     * @return the admo approved date
     */
    public String getAdmoApprovedDate() {
        return admoApprovedDate;
    }

    /**
     * Sets the admo approved date.
     * 
     * @param admoApprovedDate
     *            the new admo approved date
     */
    public void setAdmoApprovedDate(final String admoApprovedDate) {
        this.admoApprovedDate = admoApprovedDate;
    }

    /**
     * Gets the acpt admo name.
     * 
     * @return the acpt admo name
     */
    public String getAcptAdmoName() {
        return acptAdmoName;
    }

    /**
     * Sets the acpt admo name.
     * 
     * @param acptAdmoName
     *            the new acpt admo name
     */
    public void setAcptAdmoName(final String acptAdmoName) {
        this.acptAdmoName = acptAdmoName;
    }

    /**
     * Gets the acpt admo sign.
     * 
     * @return the acpt admo sign
     */
    public String getAcptAdmoSign() {
        return acptAdmoSign;
    }

    /**
     * Sets the acpt admo sign.
     * 
     * @param acptAdmoSign
     *            the new acpt admo sign
     */
    public void setAcptAdmoSign(final String acptAdmoSign) {
        this.acptAdmoSign = acptAdmoSign;
    }

    /**
     * Gets the acpt admo marking.
     * 
     * @return the acpt admo marking
     */
    public String getAcptAdmoMarking() {
        return acptAdmoMarking;
    }

    /**
     * Sets the acpt admo marking.
     * 
     * @param acptAdmoMarking
     *            the new acpt admo marking
     */
    public void setAcptAdmoMarking(final String acptAdmoMarking) {
        this.acptAdmoMarking = acptAdmoMarking;
    }

    /**
     * Gets the org living place.
     * 
     * @return the org living place
     */
    public String getOrgLivingPlace() {
        return orgLivingPlace;
    }

    /**
     * Sets the org living place.
     * 
     * @param orgLivingPlace
     *            the new org living place
     */
    public void setOrgLivingPlace(final String orgLivingPlace) {
        this.orgLivingPlace = orgLivingPlace;
    }

    /**
     * Gets the entry date.
     * 
     * @return the entry date
     */
    public String getEntryDate() {
        return entryDate;
    }

    /**
     * Sets the entry date.
     * 
     * @param entryDate
     *            the new entry date
     */
    public void setEntryDate(final String entryDate) {
        this.entryDate = entryDate;
    }

    /**
     * Gets the obtain nationality date.
     * 
     * @return the obtain nationality date
     */
    public String getObtainNationalityDate() {
        return obtainNationalityDate;
    }

    /**
     * Sets the obtain nationality date.
     * 
     * @param obtainNationalityDate
     *            the new obtain nationality date
     */
    public void setObtainNationalityDate(final String obtainNationalityDate) {
        this.obtainNationalityDate = obtainNationalityDate;
    }

    /**
     * Gets the person id3rd.
     * 
     * @return the person id3rd
     */
    public String getPersonId3rd() {
        return personId3rd;
    }

    /**
     * Sets the person id3rd.
     * 
     * @param personId3rd
     *            the new person id3rd
     */
    public void setPersonId3rd(final String personId3rd) {
        this.personId3rd = personId3rd;
    }

    /**
     * Gets the original site id.
     * 
     * @return the original site id
     */
    public String getOriginalSiteId() {
        return originalSiteId;
    }

    /**
     * Sets the original site id.
     * 
     * @param originalSiteId
     *            the new original site id
     */
    public void setOriginalSiteId(final String originalSiteId) {
        this.originalSiteId = originalSiteId;
    }

    /**
     * Gets the re issue date.
     * 
     * @return the re issue date
     */
    public String getReIssueDate() {
        return reIssueDate;
    }

    /**
     * Sets the re issue date.
     * 
     * @param reIssueDate
     *            the new re issue date
     */
    public void setReIssueDate(final String reIssueDate) {
        this.reIssueDate = reIssueDate;
    }

    /**
     * Gets the color.
     * 
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * Sets the color.
     * 
     * @param color
     *            the new color
     */
    public void setColor(final String color) {
        this.color = color;
    }

    /**
     * Gets the delete flag.
     * 
     * @return the delete flag
     */
    public boolean getDeleteFlag() {
        return deleteFlag;
    }

    /**
     * Sets the delete flag.
     * 
     * @param deleteFlag
     *            the new delete flag
     */
    public void setDeleteFlag(final boolean deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    /**
     * Checks if is finish flag.
     * 
     * @return true, if is finish flag
     */
    public boolean isFinishFlag() {
        return finishFlag;
    }

    /**
     * Sets the finish flag.
     * 
     * @param finishFlag
     *            the new finish flag
     */
    public void setFinishFlag(final boolean finishFlag) {
        this.finishFlag = finishFlag;
    }

    /**
     * Gets the education name.
     * 
     * @return the education name
     */
    public String getEducationName() {
        return educationName;
    }

    /**
     * Sets the education name.
     * 
     * @param educationName
     *            the new education name
     */
    public void setEducationName(final String educationName) {
        this.educationName = educationName;
    }

    /**
     * Gets the living style code name.
     * 
     * @return the living style code name
     */
    public String getLivingStyleCodeName() {
        return livingStyleCodeName;
    }

    /**
     * Sets the living style code name.
     * 
     * @param livingStyleCodeName
     *            the new living style code name
     */
    public void setLivingStyleCodeName(final String livingStyleCodeName) {
        this.livingStyleCodeName = livingStyleCodeName;
    }

    /**
     * Gets the living race type name.
     * 
     * @return the living race type name
     */
    public String getLivingRaceTypeName() {
        return livingRaceTypeName;
    }

    /**
     * Sets the living race type name.
     * 
     * @param livingRaceTypeName
     *            the new living race type name
     */
    public void setLivingRaceTypeName(final String livingRaceTypeName) {
        this.livingRaceTypeName = livingRaceTypeName;
    }

    /**
     * Gets the birth order sex name.
     * 
     * @return the birth order sex name
     */
    public String getBirthOrderSexName() {
        return birthOrderSexName;
    }

    /**
     * Sets the birth order sex name.
     * 
     * @param birthOrderSexName
     *            the new birth order sex name
     */
    public void setBirthOrderSexName(final String birthOrderSexName) {
        this.birthOrderSexName = birthOrderSexName;
    }

    /**
     * Gets the birth place code name.
     * 
     * @return the birth place code name
     */
    public String getBirthPlaceCodeName() {
        return birthPlaceCodeName;
    }

    /**
     * Sets the birth place code name.
     * 
     * @param birthPlaceCodeName
     *            the new birth place code name
     */
    public void setBirthPlaceCodeName(final String birthPlaceCodeName) {
        this.birthPlaceCodeName = birthPlaceCodeName;
    }

}
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

import tw.gov.moi.ae.checker.annotation.FieldName;
import tw.gov.moi.domain.XldfefaplcType;
import tw.gov.moi.rl.component.dto.OpeningOperationDTO;
import tw.gov.moi.rl.component.xldf.dto.XLDFX0A8M;
import tw.gov.moi.rl.domain.xldf.XLDFHouseholdDataDomainObject;
import tw.gov.moi.rl.domain.xldf.XLDFHouseholdNoteDomainObject;
import tw.gov.moi.rl.domain.xldf.XLDFPersonDataDomainObject;
import tw.gov.moi.rl.domain.xldf.XLDFPersonNoteDomainObject;

/**
 * The Class Rl0171bDTO.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl0171bDTO", propOrder = { "openingOperationDTO", "person", "rl0171bAppData", "household", "apply1",
        "apply2", "delegated", "mustApply1", "mustApply2", "foreignPerson", "householdNoteList", "personNoteList",
        "personRole", "enforcedApplicant", "xldfx0a8mList" })
@XmlRootElement(name = "Rl0171bDTO")
public class Rl0171bDTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** 大簿控制各作業之資訊. */
    @FieldName("大簿控制各作業之資訊")
    @XmlElement(name = "OpeningOperationDTO", required = false)
    private OpeningOperationDTO openingOperationDTO;

    /** 當事人-個人基本資料. */
    @FieldName("戶長-個人基本資料")
    @XmlElement(name = "Person", required = false)
    private XLDFPersonDataDomainObject person;

    /** 當事人-申請資料. */
    @FieldName("當事人-申請資料")
    @XmlElement(name = "Rl0171bAppData", required = false)
    private Rl0171bAppDataDTO rl0171bAppData = new Rl0171bAppDataDTO();

    /** 當事人-全戶基本資料. */
    @FieldName("當事人-全戶基本資料")
    @XmlElement(name = "Household", required = false)
    private XLDFHouseholdDataDomainObject household;

    /** 申請人1. */
    @FieldName("申請人1")
    @XmlElement(name = "Apply1", required = false)
    private XLDFApplicantDataDTO apply1;

    /** 申請人2. */
    @FieldName("申請人2")
    @XmlElement(name = "Apply2", required = false)
    private XLDFApplicantDataDTO apply2;

    /** 受委託人. */
    @FieldName("受委託人")
    @XmlElement(name = "Delegated", required = false)
    private XLDFPersonBriefDataDTO delegated;

    /** 應申請人1. */
    @FieldName("應申請人1")
    @XmlElement(name = "MustApply1", required = false)
    private XLDFApplicantDataDTO mustApply1;

    /** 應申請人2. */
    @FieldName("應申請人2")
    @XmlElement(name = "MustApply2", required = false)
    private XLDFApplicantDataDTO mustApply2;

    /** 當事人-外籍者資料. */
    @FieldName("當事人-外籍者資料")
    @XmlElement(name = "ForeignPerson", required = false)
    private XLDFForeignPersonDTO foreignPerson;

    /** 全戶記事清單. */
    @FieldName("全戶記事清單")
    @XmlElement(name = "PersonNoteList", required = false)
    private List<XLDFHouseholdNoteDomainObject> householdNoteList = new ArrayList<XLDFHouseholdNoteDomainObject>();

    /** 個人記事清單. */
    @FieldName("個人記事清單")
    @XmlElement(name = "PersonNoteList", required = false)
    private List<XLDFPersonNoteDomainObject> personNoteList = new ArrayList<XLDFPersonNoteDomainObject>();

    /** 當事人-身分角色. */
    @FieldName("當事人-身分角色")
    @XmlElement(name = "PersonRole", required = false)
    private String personRole;

    /** 逕為登記申請人. */
    @FieldName("逕為登記申請人")
    @XmlElement(name = "EnforcedApplicant", required = false)
    private XldfefaplcType enforcedApplicant;

    /** 全戶記事欄位化. */
    @XmlElement(name = "Xldfx0a8mList")
    @FieldName("全戶記事欄位化")
    private List<XLDFX0A8M> xldfx0a8mList = new ArrayList<XLDFX0A8M>();

    /**
     * Gets the opening operation dto.
     * 
     * @return the opening operation dto
     */
    public OpeningOperationDTO getOpeningOperationDTO() {
        return openingOperationDTO;
    }

    /**
     * Sets the opening operation dto.
     * 
     * @param openingOperationDTO
     *            the new opening operation dto
     */
    public void setOpeningOperationDTO(OpeningOperationDTO openingOperationDTO) {
        this.openingOperationDTO = openingOperationDTO;
    }

    /**
     * Gets the person.
     * 
     * @return the person
     */
    public XLDFPersonDataDomainObject getPerson() {
        return person;
    }

    /**
     * Sets the person.
     * 
     * @param person
     *            the new person
     */
    public void setPerson(XLDFPersonDataDomainObject person) {
        this.person = person;
    }

    /**
     * Gets the rl0171b app data.
     * 
     * @return the rl0171b app data
     */
    public Rl0171bAppDataDTO getRl0171bAppData() {
        return rl0171bAppData;
    }

    /**
     * Sets the rl0171b app data.
     * 
     * @param rl0171bAppData
     *            the new rl0171b app data
     */
    public void setRl0171bAppData(Rl0171bAppDataDTO rl0171bAppData) {
        this.rl0171bAppData = rl0171bAppData;
    }

    /**
     * Gets the household.
     * 
     * @return the household
     */
    public XLDFHouseholdDataDomainObject getHousehold() {
        return household;
    }

    /**
     * Sets the household.
     * 
     * @param household
     *            the new household
     */
    public void setHousehold(XLDFHouseholdDataDomainObject household) {
        this.household = household;
    }

    /**
     * Gets the apply1.
     * 
     * @return the apply1
     */
    public XLDFApplicantDataDTO getApply1() {
        return apply1;
    }

    /**
     * Sets the apply1.
     * 
     * @param apply1
     *            the new apply1
     */
    public void setApply1(XLDFApplicantDataDTO apply1) {
        this.apply1 = apply1;
    }

    /**
     * Gets the apply2.
     * 
     * @return the apply2
     */
    public XLDFApplicantDataDTO getApply2() {
        return apply2;
    }

    /**
     * Sets the apply2.
     * 
     * @param apply2
     *            the new apply2
     */
    public void setApply2(XLDFApplicantDataDTO apply2) {
        this.apply2 = apply2;
    }

    /**
     * Gets the delegated.
     * 
     * @return the delegated
     */
    public XLDFPersonBriefDataDTO getDelegated() {
        return delegated;
    }

    /**
     * Sets the delegated.
     * 
     * @param delegated
     *            the new delegated
     */
    public void setDelegated(XLDFPersonBriefDataDTO delegated) {
        this.delegated = delegated;
    }

    /**
     * Gets the must apply1.
     * 
     * @return the must apply1
     */
    public XLDFApplicantDataDTO getMustApply1() {
        return mustApply1;
    }

    /**
     * Sets the must apply1.
     * 
     * @param mustApply1
     *            the new must apply1
     */
    public void setMustApply1(XLDFApplicantDataDTO mustApply1) {
        this.mustApply1 = mustApply1;
    }

    /**
     * Gets the must apply2.
     * 
     * @return the must apply2
     */
    public XLDFApplicantDataDTO getMustApply2() {
        return mustApply2;
    }

    /**
     * Sets the must apply2.
     * 
     * @param mustApply2
     *            the new must apply2
     */
    public void setMustApply2(XLDFApplicantDataDTO mustApply2) {
        this.mustApply2 = mustApply2;
    }

    /**
     * Gets the foreign person.
     * 
     * @return the foreign person
     */
    public XLDFForeignPersonDTO getForeignPerson() {
        return foreignPerson;
    }

    /**
     * Sets the foreign person.
     * 
     * @param foreignPerson
     *            the new foreign person
     */
    public void setForeignPerson(XLDFForeignPersonDTO foreignPerson) {
        this.foreignPerson = foreignPerson;
    }

    /**
     * Gets the household note list.
     * 
     * @return the household note list
     */
    public List<XLDFHouseholdNoteDomainObject> getHouseholdNoteList() {
        return householdNoteList;
    }

    /**
     * Sets the household note list.
     * 
     * @param householdNoteList
     *            the new household note list
     */
    public void setHouseholdNoteList(List<XLDFHouseholdNoteDomainObject> householdNoteList) {
        this.householdNoteList = householdNoteList;
    }

    /**
     * Gets the person note list.
     * 
     * @return the person note list
     */
    public List<XLDFPersonNoteDomainObject> getPersonNoteList() {
        return personNoteList;
    }

    /**
     * Sets the person note list.
     * 
     * @param personNoteList
     *            the new person note list
     */
    public void setPersonNoteList(List<XLDFPersonNoteDomainObject> personNoteList) {
        this.personNoteList = personNoteList;
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
    public void setPersonRole(String personRole) {
        this.personRole = personRole;
    }

    /**
     * Gets the enforced applicant.
     * 
     * @return the enforced applicant
     */
    public XldfefaplcType getEnforcedApplicant() {
        return enforcedApplicant;
    }

    /**
     * Sets the enforced applicant.
     * 
     * @param enforcedApplicant
     *            the new enforced applicant
     */
    public void setEnforcedApplicant(XldfefaplcType enforcedApplicant) {
        this.enforcedApplicant = enforcedApplicant;
    }

    /**
     * Gets the xldfx0a8m list.
     * 
     * @return the xldfx0a8m list
     */
    public List<XLDFX0A8M> getXldfx0a8mList() {
        return xldfx0a8mList;
    }

    /**
     * Sets the xldfx0a8m list.
     * 
     * @param xldfx0a8mList
     *            the new xldfx0a8m list
     */
    public void setXldfx0a8mList(final List<XLDFX0A8M> xldfx0a8mList) {
        this.xldfx0a8mList = xldfx0a8mList;
    }

    /**
     * Gets the operation maintain mode.
     * 
     * @return the operation maintain mode
     */
    public String getOperationMaintainMode() {
        return openingOperationDTO.getMaintainMode().name();
    }
}

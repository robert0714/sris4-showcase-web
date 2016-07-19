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
import tw.gov.moi.rl.component.xldf.dto.XLDFX0A1M;
import tw.gov.moi.rl.domain.xldf.XLDFHouseholdDataDomainObject;
import tw.gov.moi.rl.domain.xldf.XLDFHouseholdNoteDomainObject;
import tw.gov.moi.rl.domain.xldf.XLDFPersonDataDomainObject;

/**
 * The Class Rl0171aDTO.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl0171aDTO", propOrder = { "openingOperationDTO", "householdNoteList", "xldfHouseholdHeadPersonData",
        "applicant1", "applicant2", "delegatedPerson", "xldfHouseholdData", "rl0171aAppDataDTO", "householdMembers",
        "xldfefaplcType", "xldfx0a1mList" })
@XmlRootElement(name = "Rl0171aDTO")
public class Rl0171aDTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = -4260439079733402372L;

    /** The opening operation dto. */
    @XmlElement(name = "OpeningOperationDTO")
    @FieldName("開啟作業DTO")
    private OpeningOperationDTO openingOperationDTO;

    /** 全戶記事清單. */
    @XmlElement(name = "HouseholdNoteList")
    @FieldName("全戶記事清單")
    private List<XLDFHouseholdNoteDomainObject> householdNoteList = new ArrayList<XLDFHouseholdNoteDomainObject>();

    /** 戶長個人資料. */
    @XmlElement(name = "XldfHouseholdHeadPersonData")
    @FieldName("戶長個人資料")
    private XLDFPersonDataDomainObject xldfHouseholdHeadPersonData;

    /** 申請人1資料. */
    @XmlElement(name = "Applicant1")
    @FieldName("申請人1資料")
    private XLDFApplicantDataDTO applicant1;

    /** 申請人2資料. */
    @XmlElement(name = "Applicant2")
    @FieldName("申請人2資料")
    private XLDFApplicantDataDTO applicant2;

    /** 受委託人資料. */
    @XmlElement(name = "DelegatedPerson")
    @FieldName("受委託人資料")
    private XLDFPersonBriefDataDTO delegatedPerson;

    /** 全戶基本資料. */
    @XmlElement(name = "XldfHouseholdData")
    @FieldName("全戶基本資料")
    private XLDFHouseholdDataDomainObject xldfHouseholdData;

    /** 申請資料. */
    @XmlElement(name = "Rl0171aAppDataDTO")
    @FieldName("申請資料")
    private Rl0171aAppDataDTO rl0171aAppDataDTO = new Rl0171aAppDataDTO();

    /** 戶下人口. */
    @XmlElement(name = "HouseholdMembers")
    @FieldName("戶下人口")
    private List<XLDFPersonDataDomainObject> householdMembers = new ArrayList<XLDFPersonDataDomainObject>();

    /** 逕為登記申請人. */
    @XmlElement(name = "XldfefaplcType")
    @FieldName("逕為登記申請人")
    private transient XldfefaplcType xldfefaplcType;

    /** 罰緩參數. */
    @XmlElement(name = "FineParameterDTO")
    @FieldName("罰緩參數")
    private FineParameterDTO fineParameterDTO;

    /** 全戶記事欄位化. */
    @XmlElement(name = "Xldfx0a1mList")
    @FieldName("全戶記事欄位化")
    private List<XLDFX0A1M> xldfx0a1mList = new ArrayList<XLDFX0A1M>();

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
    public void setOpeningOperationDTO(final OpeningOperationDTO openingOperationDTO) {
        this.openingOperationDTO = openingOperationDTO;
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
    public void setHouseholdNoteList(final List<XLDFHouseholdNoteDomainObject> householdNoteList) {
        this.householdNoteList = householdNoteList;
    }

    /**
     * Gets the xldf household head person data.
     * 
     * @return the xldf household head person data
     */
    public XLDFPersonDataDomainObject getXldfHouseholdHeadPersonData() {
        return xldfHouseholdHeadPersonData;
    }

    /**
     * Sets the xldf household head person data.
     * 
     * @param xldfHouseholdHeadPersonData
     *            the new xldf household head person data
     */
    public void setXldfHouseholdHeadPersonData(final XLDFPersonDataDomainObject xldfHouseholdHeadPersonData) {
        this.xldfHouseholdHeadPersonData = xldfHouseholdHeadPersonData;
    }

    /**
     * Gets the applicant1.
     * 
     * @return the applicant1
     */
    public XLDFApplicantDataDTO getApplicant1() {
        return applicant1;
    }

    /**
     * Sets the applicant1.
     * 
     * @param applicant1
     *            the new applicant1
     */
    public void setApplicant1(final XLDFApplicantDataDTO applicant1) {
        this.applicant1 = applicant1;
    }

    /**
     * Gets the applicant2.
     * 
     * @return the applicant2
     */
    public XLDFApplicantDataDTO getApplicant2() {
        return applicant2;
    }

    /**
     * Sets the applicant2.
     * 
     * @param applicant2
     *            the new applicant2
     */
    public void setApplicant2(final XLDFApplicantDataDTO applicant2) {
        this.applicant2 = applicant2;
    }

    /**
     * Gets the delegated person.
     * 
     * @return the delegated person
     */
    public XLDFPersonBriefDataDTO getDelegatedPerson() {
        return delegatedPerson;
    }

    /**
     * Sets the delegated person.
     * 
     * @param delegatedPerson
     *            the new delegated person
     */
    public void setDelegatedPerson(final XLDFPersonBriefDataDTO delegatedPerson) {
        this.delegatedPerson = delegatedPerson;
    }

    /**
     * Gets the xldf household data.
     * 
     * @return the xldf household data
     */
    public XLDFHouseholdDataDomainObject getXldfHouseholdData() {
        return xldfHouseholdData;
    }

    /**
     * Sets the xldf household data.
     * 
     * @param xldfHouseholdData
     *            the new xldf household data
     */
    public void setXldfHouseholdData(final XLDFHouseholdDataDomainObject xldfHouseholdData) {
        this.xldfHouseholdData = xldfHouseholdData;
    }

    /**
     * Gets the rl0171a app data dto.
     * 
     * @return the rl0171a app data dto
     */
    public Rl0171aAppDataDTO getRl0171aAppDataDTO() {
        return rl0171aAppDataDTO;
    }

    /**
     * Sets the rl0171a app data dto.
     * 
     * @param rl0171aAppDataDTO
     *            the new rl0171a app data dto
     */
    public void setRl0171aAppDataDTO(final Rl0171aAppDataDTO rl0171aAppDataDTO) {
        this.rl0171aAppDataDTO = rl0171aAppDataDTO;
    }

    /**
     * Gets the household members.
     * 
     * @return the household members
     */
    public List<XLDFPersonDataDomainObject> getHouseholdMembers() {
        return householdMembers;
    }

    /**
     * Sets the household members.
     * 
     * @param householdMembers
     *            the new household members
     */
    public void setHouseholdMembers(final List<XLDFPersonDataDomainObject> householdMembers) {
        this.householdMembers = householdMembers;
    }

    /**
     * Gets the xldfefaplc type.
     * 
     * @return the xldfefaplc type
     */
    public XldfefaplcType getXldfefaplcType() {
        return xldfefaplcType;
    }

    /**
     * Sets the xldfefaplc type.
     * 
     * @param xldfefaplcType
     *            the new xldfefaplc type
     */
    public void setXldfefaplcType(final XldfefaplcType xldfefaplcType) {
        this.xldfefaplcType = xldfefaplcType;
    }

    /**
     * Gets the fine parameter dto.
     * 
     * @return the fine parameter dto
     */
    public FineParameterDTO getFineParameterDTO() {
        return fineParameterDTO;
    }

    /**
     * Sets the fine parameter dto.
     * 
     * @param fineParameterDTO
     *            the new fine parameter dto
     */
    public void setFineParameterDTO(final FineParameterDTO fineParameterDTO) {
        this.fineParameterDTO = fineParameterDTO;
    }

    /**
     * Gets the xldfx0a1m list.
     * 
     * @return the xldfx0a1m list
     */
    public List<XLDFX0A1M> getXldfx0a1mList() {
        return xldfx0a1mList;
    }

    /**
     * Sets the xldfx0a1m list.
     * 
     * @param xldfx0a1mList
     *            the new xldfx0a1m list
     */
    public void setXldfx0a1mList(final List<XLDFX0A1M> xldfx0a1mList) {
        this.xldfx0a1mList = xldfx0a1mList;
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

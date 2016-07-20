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
import tw.gov.moi.domain.Tldf004mType;
import tw.gov.moi.domain.XldfefaplcType;
import tw.gov.moi.rl.component.dto.OpeningOperationDTO;
import tw.gov.moi.rl.component.xldf.dto.XLDFY0ALM;
import tw.gov.moi.rl.domain.xldf.XLDFHouseholdDataDomainObject;
import tw.gov.moi.rl.domain.xldf.XLDFPersonDataDomainObject;
import tw.gov.moi.rl.domain.xldf.XLDFPersonNoteDomainObject;

/**
 * 親子關係更正父(母)姓名更正 DTO.
 * 
 * @author Jay Kan
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Rl0171sDTO", propOrder = { "openingOperationDTO", "rl0171sAppDataDTO", "xldfForeignPersonDTO",
        "personNoteList", "xldfPersonData", "beforeFatherPersonData", "afterFatherPersonData",
        "beforeMotherPersonData", "afterMotherPersonData", "xldfHouseholdHeadPersonData", "xldfHouseholdData",
        "beforeFatherHouseholdData", "afterFatherHouseholdData", "beforeMotherHouseholdData",
        "afterMotherHouseholdData", "applicant1", "applicant2", "delegatedPerson", "xldfefaplcType", "errorCode",
        "extMessage", "enableOtherCertificate", "xldfy0almList", "fineParameterDTO", "afterFatherMemoryPerson",
        "afterMotherMemoryPerson" })
@XmlRootElement(name = "Rl0171sDTO")
public class Rl0171sDTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = -3337942915174509652L;

    /** OpeningOperationDTO. */
    @XmlElement(name = "OpeningOperationDTO")
    @FieldName("開啟作業DTO")
    private OpeningOperationDTO openingOperationDTO;

    /** The rl0171s app data dto. */
    @XmlElement(name = "Rl0171sAppDataDTO")
    @FieldName("申請資料")
    private Rl0171sAppDataDTO rl0171sAppDataDTO = new Rl0171sAppDataDTO();

    /** 當事人外籍者資料. */
    @XmlElement(name = "XldfForeignPersonDTO")
    @FieldName("當事人外籍者資料")
    private XLDFForeignPersonDTO xldfForeignPersonDTO;

    /** The person note list. */
    @XmlElement(name = "PersonNoteList")
    @FieldName("個人記事清單")
    private List<XLDFPersonNoteDomainObject> personNoteList = new ArrayList<XLDFPersonNoteDomainObject>();

    /** 當事人資料. */
    @XmlElement(name = "XldfPersonData")
    @FieldName("當事人資料")
    private XLDFPersonDataDomainObject xldfPersonData;

    /** 原父親資料. */
    @XmlElement(name = "BeforeFatherPersonData")
    @FieldName("原父親資料")
    private XLDFPersonDataDomainObject beforeFatherPersonData;

    /** 新父親資料. */
    @XmlElement(name = "AfterFatherPersonData")
    @FieldName("新父親資料")
    private XLDFPersonDataDomainObject afterFatherPersonData;

    /** 原母親資料. */
    @XmlElement(name = "BeforeMotherPersonData")
    @FieldName("原母親資料")
    private XLDFPersonDataDomainObject beforeMotherPersonData;

    /** 新母親資料. */
    @XmlElement(name = "AfterMotherPersonData")
    @FieldName("新母親資料")
    private XLDFPersonDataDomainObject afterMotherPersonData;

    /** 戶長個人資料. */
    @XmlElement(name = "XldfHouseholdHeadPersonData")
    @FieldName("戶長個人資料")
    private XLDFPersonDataDomainObject xldfHouseholdHeadPersonData;

    /** 當事人全戶基本資料. */
    @XmlElement(name = "XldfHouseholdData")
    @FieldName("當事人全戶基本資料")
    private XLDFHouseholdDataDomainObject xldfHouseholdData;

    /** 原父親全戶資料. */
    @XmlElement(name = "BeforeFatherHouseholdData")
    @FieldName("原父親全戶資料")
    private XLDFHouseholdDataDomainObject beforeFatherHouseholdData;

    /** 新父親全戶資料. */
    @XmlElement(name = "AfterFatherHouseholdData")
    @FieldName("新父親全戶資料")
    private XLDFHouseholdDataDomainObject afterFatherHouseholdData;

    /** 原母親全戶資料. */
    @XmlElement(name = "BeforeMotherHouseholdData")
    @FieldName("原母親全戶資料")
    private XLDFHouseholdDataDomainObject beforeMotherHouseholdData;

    /** 新母親全戶資料. */
    @XmlElement(name = "AfterMotherHouseholdData")
    @FieldName("新母親全戶資料")
    private XLDFHouseholdDataDomainObject afterMotherHouseholdData;

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

    /** 逕為登記申請人. */
    @XmlElement(name = "XldfefaplcType")
    @FieldName("逕為登記申請人")
    private XldfefaplcType xldfefaplcType;

    /** 錯誤代碼. */
    @XmlElement(name = "ErrorCode")
    @FieldName("錯誤代碼")
    private String errorCode;

    /** 錯誤訊息. */
    @XmlElement(name = "ExtMessage")
    @FieldName("錯誤訊息")
    private String extMessage;

    /** 其他附繳證件開關. */
    @XmlElement(name = "EnableOtherCertificate")
    @FieldName("其他附繳證件開關")
    private boolean enableOtherCertificate = false;

    /** 個人記事欄位化. */
    @XmlElement(name = "xldfy0almList")
    @FieldName("個人記事欄位化")
    private List<XLDFY0ALM> xldfy0almList = new ArrayList<XLDFY0ALM>();

    /** 罰緩參數. */
    @XmlElement(name = "FineParameterDTO")
    @FieldName("罰緩參數")
    private FineParameterDTO fineParameterDTO;

    /** 更正父記憶人. */
    @XmlElement(name = "AfterFatherMemoryPerson")
    @FieldName("更正父記憶人")
    private Tldf004mType afterFatherMemoryPerson;

    /** 更正母記憶人. */
    @XmlElement(name = "AfterMotherMemoryPerson")
    @FieldName("更正母記憶人")
    private Tldf004mType afterMotherMemoryPerson;

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
     * Gets the rl0171s app data dto.
     * 
     * @return the rl0171s app data dto
     */
    public Rl0171sAppDataDTO getRl0171sAppDataDTO() {
        return rl0171sAppDataDTO;
    }

    /**
     * Sets the rl0171s app data dto.
     * 
     * @param rl0171sAppDataDTO
     *            the new rl0171s app data dto
     */
    public void setRl0171sAppDataDTO(final Rl0171sAppDataDTO rl0171sAppDataDTO) {
        this.rl0171sAppDataDTO = rl0171sAppDataDTO;
    }

    /**
     * Gets the xldf foreign person dto.
     * 
     * @return the xldf foreign person dto
     */
    public XLDFForeignPersonDTO getXldfForeignPersonDTO() {
        return xldfForeignPersonDTO;
    }

    /**
     * Sets the xldf foreign person dto.
     * 
     * @param xldfForeignPersonDTO
     *            the new xldf foreign person dto
     */
    public void setXldfForeignPersonDTO(final XLDFForeignPersonDTO xldfForeignPersonDTO) {
        this.xldfForeignPersonDTO = xldfForeignPersonDTO;
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
    public void setPersonNoteList(final List<XLDFPersonNoteDomainObject> personNoteList) {
        this.personNoteList = personNoteList;
    }

    /**
     * Gets the xldf person data.
     * 
     * @return the xldf person data
     */
    public XLDFPersonDataDomainObject getXldfPersonData() {
        return xldfPersonData;
    }

    /**
     * Sets the xldf person data.
     * 
     * @param xldfPersonData
     *            the new xldf person data
     */
    public void setXldfPersonData(final XLDFPersonDataDomainObject xldfPersonData) {
        this.xldfPersonData = xldfPersonData;
    }

    /**
     * Gets the before father person data.
     * 
     * @return the before father person data
     */
    public XLDFPersonDataDomainObject getBeforeFatherPersonData() {
        return beforeFatherPersonData;
    }

    /**
     * Sets the before father person data.
     * 
     * @param beforeFatherPersonData
     *            the new before father person data
     */
    public void setBeforeFatherPersonData(final XLDFPersonDataDomainObject beforeFatherPersonData) {
        this.beforeFatherPersonData = beforeFatherPersonData;
    }

    /**
     * Gets the after father person data.
     * 
     * @return the after father person data
     */
    public XLDFPersonDataDomainObject getAfterFatherPersonData() {
        return afterFatherPersonData;
    }

    /**
     * Sets the after father person data.
     * 
     * @param afterFatherPersonData
     *            the new after father person data
     */
    public void setAfterFatherPersonData(final XLDFPersonDataDomainObject afterFatherPersonData) {
        this.afterFatherPersonData = afterFatherPersonData;
    }

    /**
     * Gets the before mother person data.
     * 
     * @return the before mother person data
     */
    public XLDFPersonDataDomainObject getBeforeMotherPersonData() {
        return beforeMotherPersonData;
    }

    /**
     * Sets the before mother person data.
     * 
     * @param beforeMotherPersonData
     *            the new before mother person data
     */
    public void setBeforeMotherPersonData(final XLDFPersonDataDomainObject beforeMotherPersonData) {
        this.beforeMotherPersonData = beforeMotherPersonData;
    }

    /**
     * Gets the after mother person data.
     * 
     * @return the after mother person data
     */
    public XLDFPersonDataDomainObject getAfterMotherPersonData() {
        return afterMotherPersonData;
    }

    /**
     * Sets the after mother person data.
     * 
     * @param afterMotherPersonData
     *            the new after mother person data
     */
    public void setAfterMotherPersonData(final XLDFPersonDataDomainObject afterMotherPersonData) {
        this.afterMotherPersonData = afterMotherPersonData;
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
     * Gets the before father household data.
     * 
     * @return the before father household data
     */
    public XLDFHouseholdDataDomainObject getBeforeFatherHouseholdData() {
        return beforeFatherHouseholdData;
    }

    /**
     * Sets the before father household data.
     * 
     * @param beforeFatherHouseholdData
     *            the new before father household data
     */
    public void setBeforeFatherHouseholdData(final XLDFHouseholdDataDomainObject beforeFatherHouseholdData) {
        this.beforeFatherHouseholdData = beforeFatherHouseholdData;
    }

    /**
     * Gets the after father household data.
     * 
     * @return the after father household data
     */
    public XLDFHouseholdDataDomainObject getAfterFatherHouseholdData() {
        return afterFatherHouseholdData;
    }

    /**
     * Sets the after father household data.
     * 
     * @param afterFatherHouseholdData
     *            the new after father household data
     */
    public void setAfterFatherHouseholdData(final XLDFHouseholdDataDomainObject afterFatherHouseholdData) {
        this.afterFatherHouseholdData = afterFatherHouseholdData;
    }

    /**
     * Gets the before mother household data.
     * 
     * @return the before mother household data
     */
    public XLDFHouseholdDataDomainObject getBeforeMotherHouseholdData() {
        return beforeMotherHouseholdData;
    }

    /**
     * Sets the before mother household data.
     * 
     * @param beforeMotherHouseholdData
     *            the new before mother household data
     */
    public void setBeforeMotherHouseholdData(final XLDFHouseholdDataDomainObject beforeMotherHouseholdData) {
        this.beforeMotherHouseholdData = beforeMotherHouseholdData;
    }

    /**
     * Gets the after mother household data.
     * 
     * @return the after mother household data
     */
    public XLDFHouseholdDataDomainObject getAfterMotherHouseholdData() {
        return afterMotherHouseholdData;
    }

    /**
     * Sets the after mother household data.
     * 
     * @param afterMotherHouseholdData
     *            the new after mother household data
     */
    public void setAfterMotherHouseholdData(final XLDFHouseholdDataDomainObject afterMotherHouseholdData) {
        this.afterMotherHouseholdData = afterMotherHouseholdData;
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
     * Gets the error code.
     * 
     * @return the error code
     */
    public String getErrorCode() {
        return errorCode;
    }

    /**
     * Sets the error code.
     * 
     * @param errorCode
     *            the new error code
     */
    public void setErrorCode(final String errorCode) {
        this.errorCode = errorCode;
    }

    /**
     * Gets the ext message.
     * 
     * @return the ext message
     */
    public String getExtMessage() {
        return extMessage;
    }

    /**
     * Sets the ext message.
     * 
     * @param extMessage
     *            the new ext message
     */
    public void setExtMessage(final String extMessage) {
        this.extMessage = extMessage;
    }

    /**
     * Checks if is enable other certificate.
     * 
     * @return true, if is enable other certificate
     */
    public boolean isEnableOtherCertificate() {
        return enableOtherCertificate;
    }

    /**
     * Sets the enable other certificate.
     * 
     * @param enableOtherCertificate
     *            the new enable other certificate
     */
    public void setEnableOtherCertificate(final boolean enableOtherCertificate) {
        this.enableOtherCertificate = enableOtherCertificate;
    }

    /**
     * Gets the xldfy0alm list.
     * 
     * @return the xldfy0alm list
     */
    public List<XLDFY0ALM> getXldfy0almList() {
        return xldfy0almList;
    }

    /**
     * Sets the xldfy0alm list.
     * 
     * @param xldfy0almList
     *            the new xldfy0alm list
     */
    public void setXldfy0almList(final List<XLDFY0ALM> xldfy0almList) {
        this.xldfy0almList = xldfy0almList;
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
     * Gets the after father memory person.
     * 
     * @return the after father memory person
     */
    public Tldf004mType getAfterFatherMemoryPerson() {
        return afterFatherMemoryPerson;
    }

    /**
     * Sets the after father memory person.
     * 
     * @param afterFatherMemoryPerson
     *            the new after father memory person
     */
    public void setAfterFatherMemoryPerson(final Tldf004mType afterFatherMemoryPerson) {
        this.afterFatherMemoryPerson = afterFatherMemoryPerson;
    }

    /**
     * Gets the after mother memory person.
     * 
     * @return the after mother memory person
     */
    public Tldf004mType getAfterMotherMemoryPerson() {
        return afterMotherMemoryPerson;
    }

    /**
     * Sets the after mother memory person.
     * 
     * @param afterMotherMemoryPerson
     *            the new after mother memory person
     */
    public void setAfterMotherMemoryPerson(final Tldf004mType afterMotherMemoryPerson) {
        this.afterMotherMemoryPerson = afterMotherMemoryPerson;
    }
}

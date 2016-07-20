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
import tw.gov.moi.rl.component.dto.XLDFDomainObject;
import tw.gov.moi.rl.component.xldf.dto.XLDF021M;
import tw.gov.moi.rl.component.xldf.dto.XLDFX0BCM;
import tw.gov.moi.rl.domain.xldf.XLDFHouseholdDataDomainObject;
import tw.gov.moi.rl.domain.xldf.XLDFHouseholdNoteDomainObject;
import tw.gov.moi.rl.domain.xldf.XLDFPersonDataDomainObject;

/**
 * 戶號變更登記DTO.
 * 
 * @author Jay Kan
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Rl0172oDTO", propOrder = { "openingOperationDTO", "householdMembertList", "rl0172oAppDataDTO",
        "xldfForeignPersonDTO", "householdNoteList", "xldfPersonData", "xldfHouseholdHeadPersonData",
        "xldfHouseholdData", "applicant1", "applicant2", "delegatedPerson", "xldfefaplcType", "enableOtherCertificate",
        "errorCode", "fineParameterDTO", "xldfx0bcmList", "xldf021m", "xldfxData" })
@XmlRootElement(name = "Rl0172oDTO")
public class Rl0172oDTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 5055927184250473051L;

    /** OpeningOperationDTO. */
    @XmlElement(name = "OpeningOperationDTO")
    @FieldName("開啟作業DTO")
    private OpeningOperationDTO openingOperationDTO;

    /** 戶下人口清單. */
    @XmlElement(name = "HouseholdMembertList")
    @FieldName("戶下人口清單")
    private transient List<XLDFPersonDataDomainObject> householdMembertList = new ArrayList<XLDFPersonDataDomainObject>();

    /** The rl0172o app data dto. */
    @XmlElement(name = "Rl0172oAppDataDTO")
    @FieldName("申請資料")
    private Rl0172oAppDataDTO rl0172oAppDataDTO = new Rl0172oAppDataDTO();

    /** 當事人外籍者資料. */
    @XmlElement(name = "XldfForeignPersonDTO")
    @FieldName("當事人外籍者資料")
    private XLDFForeignPersonDTO xldfForeignPersonDTO;

    /** 全戶記事清單. */
    @XmlElement(name = "HouseholdNoteList")
    @FieldName("全戶記事清單")
    private transient List<XLDFHouseholdNoteDomainObject> householdNoteList = new ArrayList<XLDFHouseholdNoteDomainObject>();

    /** 當事人資料. */
    @XmlElement(name = "XldfPersonData")
    @FieldName("當事人資料")
    private transient XLDFPersonDataDomainObject xldfPersonData;

    /** 戶長個人資料. */
    @XmlElement(name = "XldfHouseholdHeadPersonData")
    @FieldName("戶長個人資料")
    private transient XLDFPersonDataDomainObject xldfHouseholdHeadPersonData;

    /** 全戶基本資料. */
    @XmlElement(name = "XldfHouseholdData")
    @FieldName("全戶基本資料")
    private transient XLDFHouseholdDataDomainObject xldfHouseholdData;

    /** 申請人1資料. */
    @XmlElement(name = "Applicant1")
    @FieldName("申請人1資料")
    private transient XLDFApplicantDataDTO applicant1;

    /** 申請人2資料. */
    @XmlElement(name = "Applicant2")
    @FieldName("申請人2資料")
    private transient XLDFApplicantDataDTO applicant2;

    /** 受委託人資料. */
    @XmlElement(name = "DelegatedPerson")
    @FieldName("受委託人資料")
    private transient XLDFPersonBriefDataDTO delegatedPerson;

    /** 逕為登記申請人. */
    @XmlElement(name = "XldfefaplcType")
    @FieldName("逕為登記申請人")
    private transient XldfefaplcType xldfefaplcType;

    /** 其他附繳證件開關. */
    @XmlElement(name = "EnableOtherCertificate")
    @FieldName("其他附繳證件開關")
    private boolean enableOtherCertificate = false;

    /** 錯誤代碼. */
    @XmlElement(name = "ErrorCode")
    @FieldName("錯誤代碼")
    private String errorCode;

    /** 罰緩參數. */
    @XmlElement(name = "FineParameterDTO")
    @FieldName("罰緩參數")
    private FineParameterDTO fineParameterDTO;

    /** 全戶記事欄位化. */
    @XmlElement(name = "Xldfx0bcmList")
    @FieldName("全戶記事欄位化")
    private List<XLDFX0BCM> xldfx0bcmList = new ArrayList<XLDFX0BCM>();

    /** 戶號配賦檔. */
    @XmlElement(name = "Xldf021m")
    @FieldName("戶號配賦檔")
    private XLDF021M xldf021m;

    /** 全戶記事欄位化資料. */
    @XmlElement(name = "XldfxData")
    @FieldName("全戶記事欄位化資料")
    private List<XLDFDomainObject> xldfxData = new ArrayList<XLDFDomainObject>();

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
     * Gets the household membert list.
     * 
     * @return the household membert list
     */
    public List<XLDFPersonDataDomainObject> getHouseholdMembertList() {
        return householdMembertList;
    }

    /**
     * Sets the household membert list.
     * 
     * @param householdMembertList
     *            the new household membert list
     */
    public void setHouseholdMembertList(final List<XLDFPersonDataDomainObject> householdMembertList) {
        this.householdMembertList = householdMembertList;
    }

    /**
     * Gets the rl0172o app data dto.
     * 
     * @return the rl0172o app data dto
     */
    public Rl0172oAppDataDTO getRl0172oAppDataDTO() {
        return rl0172oAppDataDTO;
    }

    /**
     * Sets the rl0172o app data dto.
     * 
     * @param rl0172oAppDataDTO
     *            the new rl0172o app data dto
     */
    public void setRl0172oAppDataDTO(final Rl0172oAppDataDTO rl0172oAppDataDTO) {
        this.rl0172oAppDataDTO = rl0172oAppDataDTO;
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
     * Gets the xldfx0bcm list.
     * 
     * @return the xldfx0bcm list
     */
    public List<XLDFX0BCM> getXldfx0bcmList() {
        return xldfx0bcmList;
    }

    /**
     * Sets the xldfx0bcm list.
     * 
     * @param xldfx0bcmList
     *            the new xldfx0bcm list
     */
    public void setXldfx0bcmList(final List<XLDFX0BCM> xldfx0bcmList) {
        this.xldfx0bcmList = xldfx0bcmList;
    }

    /**
     * Gets the operation maintain mode.
     * 
     * @return the operation maintain mode
     */
    public String getOperationMaintainMode() {
        return openingOperationDTO.getMaintainMode().name();
    }

    /**
     * Gets the xldf021m.
     * 
     * @return the xldf021m
     */
    public XLDF021M getXldf021m() {
        return xldf021m;
    }

    /**
     * Sets the xldf021m.
     * 
     * @param xldf021m
     *            the new xldf021m
     */
    public void setXldf021m(final XLDF021M xldf021m) {
        this.xldf021m = xldf021m;
    }

    /**
     * Gets the xldfx data.
     * 
     * @return the xldfx data
     */
    public List<XLDFDomainObject> getXldfxData() {
        return xldfxData;
    }

    /**
     * Sets the xldfx data.
     * 
     * @param xldfxData
     *            the new xldfx data
     */
    public void setXldfxData(final List<XLDFDomainObject> xldfxData) {
        this.xldfxData = xldfxData;
    }
}

/*
 * Copyright (c) 2010-2020 IISI. All rights reserved.
 * 
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;
import tw.gov.moi.rl.component.dto.OpeningOperationDTO;
import tw.gov.moi.rl.component.dto.XLDFDomainObject;
import tw.gov.moi.rl.component.xldf.dto.XLDF021M;
import tw.gov.moi.rl.component.xldf.dto.XLDFX0ADM;
import tw.gov.moi.rl.domain.XLDFApplicantDataDTO;
import tw.gov.moi.rl.domain.XLDFForeignPersonDTO;
import tw.gov.moi.rl.domain.XLDFPersonBriefDataDTO;
import tw.gov.moi.rl.domain.xldf.XLDFHouseholdDataDomainObject;
import tw.gov.moi.rl.domain.xldf.XLDFHouseholdNoteDomainObject;
import tw.gov.moi.rl.domain.xldf.XLDFPersonDataDomainObject;
import tw.gov.moi.rl.domain.xldf.XLDFPersonNoteDomainObject;

/**
 * 戶號更正登記 DTO.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl0171oDTO", propOrder = { "openingOperationDTO", "personData", "houseHeadData", "householdData",
        "sealNumber", "sealApplYyymmdd", "registerContent", "sealReason", "fee", "systemDate", "systemTime",
        "crossSiteEnabled", "applyPerson1", "applyPerson1Relationship", "applyPerson2", "applyPerson2Relationship",
        "delegated", "certificate", "otherCertificateStatus", "otherCertificate", "xldfx0admList", "xldf021m",
        "enableOtherCertificate", "errorCode", "errorMsg", "xldfxData" })
@XmlRootElement(name = "Rl0171oDTO")
public class Rl0171pDTO implements Serializable {

    /** Serial Id. */
    private static final long serialVersionUID = 598726909330491199L;

    /** The OpeningOperationDTO. */
    @XmlElement(name = "openingOperationDTO", required = true)
    private OpeningOperationDTO openingOperationDTO = new OpeningOperationDTO();

    /** 個人基本資料. */
    @XmlElement(name = "personData", required = true)
    @FieldName("個人基本資料")
    private XLDFPersonDataDomainObject personData;

    /** 戶長基本資料. */
    @XmlElement(name = "houseHeadData", required = true)
    @FieldName("戶長個人基本資料")
    private XLDFPersonDataDomainObject houseHeadData;

    /** 個人基本資料. */
    @XmlElement(name = "householdData", required = true)
    @FieldName("全戶基本資料")
    private XLDFHouseholdDataDomainObject householdData;

    /** The foreign person. */
    @XmlElement(name = "woman2Rlde808wType")
    @FieldName("查詢結果 ")
    private XLDFForeignPersonDTO foreignPerson = new XLDFForeignPersonDTO();

    /** 申請資料. */
    @XmlElement(name = "Rl0171pAppDataDTO")
    @FieldName("查詢結果 ")
    private Rl0171pAppDataDTO rl0171pAppDataDTO = new Rl0171pAppDataDTO();

    /** The person note list. */
    @XmlElement(name = "PersonNoteList")
    @FieldName("查詢結果 ")
    private List<XLDFPersonNoteDomainObject> personNoteList = new ArrayList<XLDFPersonNoteDomainObject>();

    // 全戶記事清單
    /** The household note list. */
    @XmlElement(name = "woman2Rlde808wType")
    @FieldName("查詢結果 ")
    private List<XLDFHouseholdNoteDomainObject> householdNoteList = new ArrayList<XLDFHouseholdNoteDomainObject>();

    /** 申請人1資料. */
    @XmlElement(name = "Applicant1")
    @FieldName("查詢結果 ")
    private XLDFApplicantDataDTO applicant1 = new XLDFApplicantDataDTO();

    /** 申請人2資料. */
    @XmlElement(name = "Applicant2")
    @FieldName("查詢結果 ")
    private XLDFApplicantDataDTO applicant2 = new XLDFApplicantDataDTO();

    /** 受委託人資料. */
    @XmlElement(name = "DelegatedPerson")
    @FieldName("查詢結果 ")
    private XLDFPersonBriefDataDTO delegatedPerson = new XLDFPersonBriefDataDTO();

    /** The household membert list. */
    @XmlElement(name = "woman2Rlde808wType")
    @FieldName("查詢結果 ")
    private List<XLDFPersonDataDomainObject> householdMembertList = new ArrayList<XLDFPersonDataDomainObject>();

    /** The verification. */
    @XmlElement(name = "Verification")
    @FieldName("查詢結果 ")
    private boolean verification = false;

    /** The do save xld f021 m. */
    @XmlElement(name = "woman2Rlde808wType")
    @FieldName("查詢結果 ")
    private boolean doSaveXLDF021M;

    /** 全戶記事欄位化. */
    @XmlElement(name = "Xldfx0admList")
    @FieldName("全戶記事欄位化")
    private List<XLDFX0ADM> xldfx0admList = new ArrayList<XLDFX0ADM>();

    /** 戶號配賦檔. */
    @XmlElement(name = "Xldf021m")
    @FieldName("戶號配賦檔")
    private XLDF021M xldf021m;

    /** 其他附繳證件開關. */
    @XmlElement(name = "EnableOtherCertificate")
    @FieldName("其他附繳證件開關")
    private boolean enableOtherCertificate = false;

    /** 錯誤代碼. */
    @XmlElement(name = "ErrorCode")
    @FieldName("錯誤代碼")
    private String errorCode;

    /** 錯誤訊息. */
    @XmlElement(name = "ErrorMsg")
    @FieldName("錯誤訊息")
    private String errorMsg;

    /** 全戶記事欄位化資料. */
    @XmlElement(name = "XldfxData")
    @FieldName("全戶記事欄位化資料")
    private List<XLDFDomainObject> xldfxData = new ArrayList<XLDFDomainObject>();

    /**
     * Gets the opening operation dto.
     * 
     * @return the openingOperationDTO
     */
    public OpeningOperationDTO getOpeningOperationDTO() {
        return openingOperationDTO;
    }

    /**
     * Sets the opening operation dto.
     * 
     * @param openingOperationDTO
     *            the openingOperationDTO to set
     */
    public void setOpeningOperationDTO(OpeningOperationDTO openingOperationDTO) {
        this.openingOperationDTO = openingOperationDTO;
    }

    /**
     * Gets the person data.
     * 
     * @return the personData
     */
    public XLDFPersonDataDomainObject getPersonData() {
        return personData;
    }

    /**
     * Sets the person data.
     * 
     * @param personData
     *            the personData to set
     */
    public void setPersonData(XLDFPersonDataDomainObject personData) {
        this.personData = personData;
    }

    /**
     * Gets the house head data.
     * 
     * @return the houseHeadData
     */
    public XLDFPersonDataDomainObject getHouseHeadData() {
        return houseHeadData;
    }

    /**
     * Sets the house head data.
     * 
     * @param houseHeadData
     *            the houseHeadData to set
     */
    public void setHouseHeadData(XLDFPersonDataDomainObject houseHeadData) {
        this.houseHeadData = houseHeadData;
    }

    /**
     * Gets the household data.
     * 
     * @return the householdData
     */
    public XLDFHouseholdDataDomainObject getHouseholdData() {
        return householdData;
    }

    /**
     * Sets the household data.
     * 
     * @param householdData
     *            the householdData to set
     */
    public void setHouseholdData(XLDFHouseholdDataDomainObject householdData) {
        this.householdData = householdData;
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
    public void setApplicant1(XLDFApplicantDataDTO applicant1) {
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
    public void setApplicant2(XLDFApplicantDataDTO applicant2) {
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
    public void setDelegatedPerson(XLDFPersonBriefDataDTO delegatedPerson) {
        this.delegatedPerson = delegatedPerson;
    }

    /**
     * Checks if is verification.
     * 
     * @return true, if is verification
     */
    public boolean isVerification() {
        return verification;
    }

    /**
     * Sets the verification.
     * 
     * @param verification
     *            the new verification
     */
    public void setVerification(boolean verification) {
        this.verification = verification;
    }

    /**
     * Gets the rl0171p app data dto.
     * 
     * @return the rl0171p app data dto
     */
    public Rl0171pAppDataDTO getRl0171pAppDataDTO() {
        return rl0171pAppDataDTO;
    }

    /**
     * Sets the rl0171p app data dto.
     * 
     * @param rl0171pAppDataDTO
     *            the new rl0171p app data dto
     */
    public void setRl0171pAppDataDTO(Rl0171pAppDataDTO rl0171pAppDataDTO) {
        this.rl0171pAppDataDTO = rl0171pAppDataDTO;
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
    public void setHouseholdMembertList(List<XLDFPersonDataDomainObject> householdMembertList) {
        this.householdMembertList = householdMembertList;
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
     * Checks if is do save xld f021 m.
     * 
     * @return true, if is do save xld f021 m
     */
    public boolean isDoSaveXLDF021M() {
        return doSaveXLDF021M;
    }

    /**
     * Sets the do save xld f021 m.
     * 
     * @param doSaveXLDF021M
     *            the new do save xld f021 m
     */
    public void setDoSaveXLDF021M(boolean doSaveXLDF021M) {
        this.doSaveXLDF021M = doSaveXLDF021M;
    }

    /**
     * Gets the xldfx0adm list.
     * 
     * @return the xldfx0adm list
     */
    public List<XLDFX0ADM> getXldfx0admList() {
        return xldfx0admList;
    }

    /**
     * Sets the xldfx0adm list.
     * 
     * @param xldfx0admList
     *            the new xldfx0adm list
     */
    public void setXldfx0admList(List<XLDFX0ADM> xldfx0admList) {
        this.xldfx0admList = xldfx0admList;
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
    public void setXldf021m(XLDF021M xldf021m) {
        this.xldf021m = xldf021m;
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
    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    /**
     * Gets the error msg.
     * 
     * @return the error msg
     */
    public String getErrorMsg() {
        return errorMsg;
    }

    /**
     * Sets the error msg.
     * 
     * @param errorMsg
     *            the new error msg
     */
    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
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
    public void setXldfxData(List<XLDFDomainObject> xldfxData) {
        this.xldfxData = xldfxData;
    }
}

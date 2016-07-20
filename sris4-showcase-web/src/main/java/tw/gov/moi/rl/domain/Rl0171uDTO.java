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
import tw.gov.moi.rl.common.constant.RlConstant;
import tw.gov.moi.rl.component.dto.OpeningOperationDTO;
import tw.gov.moi.rl.domain.xldf.XLDFHouseholdDataDomainObject;
import tw.gov.moi.rl.domain.xldf.XLDFPersonDataDomainObject;

/**
 * The Class Rl0171uDTO.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl0171uDTO", propOrder = { "openingOperationDTO", "motherPersonData", "xldfHouseholdHeadPersonData",
        "xldfHouseholdData", "applicant1", "applicant2", "delegatedPerson", "xldfefaplcType", "registerDate",
        "registerTime", "acceptAdminOfficeCode", "enforcedFlag", "rl0171uAppDataDTOList", "rl0171uAppDataDTO",
        "initializationFlag" })
@XmlRootElement(name = "Rl0171uDTO")
public class Rl0171uDTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = -508504289625492794L;

    /** OpeningOperationDTO. */
    @XmlElement(name = "OpeningOperationDTO")
    @FieldName("OpeningOperationDTO")
    private OpeningOperationDTO openingOperationDTO;

    /** 母親個人資料. */
    @XmlElement(name = "MotherPersonData")
    @FieldName("母親個人資料")
    private XLDFPersonDataDomainObject motherPersonData;

    /** 戶長個人資料. */
    @XmlElement(name = "XldfHouseholdHeadPersonData")
    @FieldName("戶長個人資料")
    private XLDFPersonDataDomainObject xldfHouseholdHeadPersonData;

    /** 全戶基本資料. */
    @XmlElement(name = "XldfHouseholdData")
    @FieldName("全戶基本資料")
    private XLDFHouseholdDataDomainObject xldfHouseholdData;

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

    /** 登記日期. */
    @XmlElement(name = "RegisterDate")
    @FieldName("登記日期")
    private String registerDate;

    /** 登記時間. */
    @XmlElement(name = "RegisterTime")
    @FieldName("登記時間")
    private String registerTime;

    /** 受理地戶所代碼. */
    @XmlElement(name = "AcceptAdminOfficeCode")
    @FieldName("受理地戶所代碼")
    private String acceptAdminOfficeCode;

    /** 逕為登記旗標. */
    @XmlElement(name = "EnforcedFlag")
    @FieldName("逕為登記旗標")
    private String enforcedFlag = RlConstant.NO_CHAR;

    /** 子女資料清單. */
    @XmlElement(name = "Rl0171uAppDataDTOList")
    @FieldName("子女資料清單")
    private List<RlChangeNameAppDataDTO> rl0171uAppDataDTOList = new ArrayList<RlChangeNameAppDataDTO>();

    /** 子女資料. */
    @XmlElement(name = "Rl0171uAppDataDTO")
    @FieldName("子女資料")
    private RlChangeNameAppDataDTO rl0171uAppDataDTO;

    /**
     * 初始化. <BR>
     * Default: true
     */
    @XmlElement(name = "InitializationFlag")
    @FieldName("初始化")
    private boolean initializationFlag = true;

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
     * Gets the mother person data.
     * 
     * @return the mother person data
     */
    public XLDFPersonDataDomainObject getMotherPersonData() {
        return motherPersonData;
    }

    /**
     * Sets the mother person data.
     * 
     * @param motherPersonData
     *            the new mother person data
     */
    public void setMotherPersonData(XLDFPersonDataDomainObject motherPersonData) {
        this.motherPersonData = motherPersonData;
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
    public void setXldfHouseholdHeadPersonData(XLDFPersonDataDomainObject xldfHouseholdHeadPersonData) {
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
    public void setXldfHouseholdData(XLDFHouseholdDataDomainObject xldfHouseholdData) {
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
    public void setXldfefaplcType(XldfefaplcType xldfefaplcType) {
        this.xldfefaplcType = xldfefaplcType;
    }

    /**
     * Gets the register date.
     * 
     * @return the register date
     */
    public String getRegisterDate() {
        return registerDate;
    }

    /**
     * Sets the register date.
     * 
     * @param registerDate
     *            the new register date
     */
    public void setRegisterDate(String registerDate) {
        this.registerDate = registerDate;
    }

    /**
     * Gets the register time.
     * 
     * @return the register time
     */
    public String getRegisterTime() {
        return registerTime;
    }

    /**
     * Sets the register time.
     * 
     * @param registerTime
     *            the new register time
     */
    public void setRegisterTime(String registerTime) {
        this.registerTime = registerTime;
    }

    /**
     * Gets the accept admin office code.
     * 
     * @return the accept admin office code
     */
    public String getAcceptAdminOfficeCode() {
        return acceptAdminOfficeCode;
    }

    /**
     * Sets the accept admin office code.
     * 
     * @param acceptAdminOfficeCode
     *            the new accept admin office code
     */
    public void setAcceptAdminOfficeCode(String acceptAdminOfficeCode) {
        this.acceptAdminOfficeCode = acceptAdminOfficeCode;
    }

    /**
     * Gets the enforced flag.
     * 
     * @return the enforced flag
     */
    public String getEnforcedFlag() {
        return enforcedFlag;
    }

    /**
     * Sets the enforced flag.
     * 
     * @param enforcedFlag
     *            the new enforced flag
     */
    public void setEnforcedFlag(String enforcedFlag) {
        this.enforcedFlag = enforcedFlag;
    }

    /**
     * Gets the rl0171u app data dto list.
     * 
     * @return the rl0171u app data dto list
     */
    public List<RlChangeNameAppDataDTO> getRl0171uAppDataDTOList() {
        return rl0171uAppDataDTOList;
    }

    /**
     * Sets the rl0171u app data dto list.
     * 
     * @param rl0171uAppDataDTOList
     *            the new rl0171u app data dto list
     */
    public void setRl0171uAppDataDTOList(List<RlChangeNameAppDataDTO> rl0171uAppDataDTOList) {
        this.rl0171uAppDataDTOList = rl0171uAppDataDTOList;
    }

    /**
     * Gets the rl0171u app data dto.
     * 
     * @return the rl0171u app data dto
     */
    public RlChangeNameAppDataDTO getRl0171uAppDataDTO() {
        return rl0171uAppDataDTO;
    }

    /**
     * Sets the rl0171u app data dto.
     * 
     * @param rl0171uAppDataDTO
     *            the new rl0171u app data dto
     */
    public void setRl0171uAppDataDTO(RlChangeNameAppDataDTO rl0171uAppDataDTO) {
        this.rl0171uAppDataDTO = rl0171uAppDataDTO;
    }

    /**
     * Checks if is initialization flag.
     * 
     * @return true, if is initialization flag
     */
    public boolean isInitializationFlag() {
        return initializationFlag;
    }

    /**
     * Sets the initialization flag.
     * 
     * @param initializationFlag
     *            the new initialization flag
     */
    public void setInitializationFlag(boolean initializationFlag) {
        this.initializationFlag = initializationFlag;
    }
}

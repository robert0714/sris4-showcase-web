/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.domain;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;
import tw.gov.moi.domain.Xldf005mType;
import tw.gov.moi.domain.XldfefaplcType;
import tw.gov.moi.rl.common.constant.RlConstant;
import tw.gov.moi.rl.component.dto.OpeningOperationDTO;
import tw.gov.moi.rl.domain.xldf.XLDFHouseholdDataDomainObject;
import tw.gov.moi.rl.domain.xldf.XLDFPersonDataDomainObject;

/**
 * 補填、更正個人記事 DTO.
 * 
 * @author Weiren.Jheng
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl01110DTO", propOrder = { "apply1", "apply2", "delegated", "openingOperationDTO", "enforceMode",
        "xldfefaplcType", "xldfPersonDataDomainObject", "xldfPersonDataDomainObjectByHousehold",
        "xldfHouseholdDataDomainObject", "xldf005mList", "appDataDTO", "xldf005mType", "registerFlag", "changeTitle" })
@XmlRootElement(name = "Rl01110DTO")
public class Rl01110DTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** 申請人1. */
    @XmlElement(name = "Apply1")
    @FieldName("申請人1")
    private XLDFApplicantDataDTO apply1 = new XLDFApplicantDataDTO();

    /** 申請人2. */
    @XmlElement(name = "Apply2")
    @FieldName("申請人2")
    private XLDFApplicantDataDTO apply2 = new XLDFApplicantDataDTO();

    /** 受委託人. */
    @XmlElement(name = "Delegated")
    @FieldName("受委託人")
    private XLDFPersonBriefDataDTO delegated = new XLDFPersonBriefDataDTO();

    /** 作業順序DTO. */
    @XmlElement(name = "OpeningOperationDTO")
    @FieldName("作業順序DTO")
    private OpeningOperationDTO openingOperationDTO;

    // /** 逕為登記. */
    // @XmlElement(name = "EnforceMode")
    // @FieldName("逕為登記")
    // private boolean enforceMode = Boolean.FALSE;

    /** 逕為登記申請人. */
    @XmlElement(name = "XldfefaplcType")
    @FieldName("逕為登記申請人")
    private transient XldfefaplcType xldfefaplcType;

    /** 當事人資料. */
    @XmlElement(name = "XldfPersonDataDomainObject")
    @FieldName("當事人資料")
    private XLDFPersonDataDomainObject xldfPersonDataDomainObject;

    /** 戶長個人資料. */
    @XmlElement(name = "XldfPersonDataDomainObjectByHousehold")
    @FieldName("戶長個人資料")
    private XLDFPersonDataDomainObject xldfPersonDataDomainObjectByHousehold;

    /** 全戶資料. */
    @XmlElement(name = "XldfHouseholdDataDomainObject")
    @FieldName("全戶資料")
    private XLDFHouseholdDataDomainObject xldfHouseholdDataDomainObject;

    /** 個人記事清單. */
    @XmlElement(name = "Xldf005mList")
    @FieldName("個人記事清單")
    private List<Xldf005mType> xldf005mList;

    /** 更正個人記事申請資料 DTO. */
    @XmlElement(name = "AppDataDto")
    @FieldName("更正個人記事申請資料 DTO")
    private Rl01110AppDataDTO appDataDTO = new Rl01110AppDataDTO();

    /** 個人記事. */
    @XmlElement(name = "Xldf005mType")
    @FieldName("個人記事")
    private Xldf005mType xldf005mType;

    /** 逕為登記旗標. */
    @XmlElement(name = "EnforcedFlag")
    @FieldName("逕為登記旗標")
    private String enforcedFlag = RlConstant.NO_CHAR;

    /** 補填或更正. */
    @XmlElement(name = "ChangeTitle")
    @FieldName("補填或更正")
    private String changeTitle;

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
     * Checks if is enforce mode.
     * 
     * @return true, if is enforce mode
     */
    // public boolean isEnforceMode() {
    // return enforceMode;
    // }

    /**
     * Sets the enforce mode.
     * 
     * @param enforceMode
     *            the new enforce mode
     */
    // public void setEnforceMode(boolean enforceMode) {
    // this.enforceMode = enforceMode;
    // }

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
     * Gets the xldf person data domain object.
     * 
     * @return the xldf person data domain object
     */
    public XLDFPersonDataDomainObject getXldfPersonDataDomainObject() {
        return xldfPersonDataDomainObject;
    }

    /**
     * Sets the xldf person data domain object.
     * 
     * @param xldfPersonDataDomainObject
     *            the new xldf person data domain object
     */
    public void setXldfPersonDataDomainObject(XLDFPersonDataDomainObject xldfPersonDataDomainObject) {
        this.xldfPersonDataDomainObject = xldfPersonDataDomainObject;
    }

    /**
     * Gets the xldf person data domain object by household.
     * 
     * @return the xldf person data domain object by household
     */
    public XLDFPersonDataDomainObject getXldfPersonDataDomainObjectByHousehold() {
        return xldfPersonDataDomainObjectByHousehold;
    }

    /**
     * Sets the xldf person data domain object by household.
     * 
     * @param xldfPersonDataDomainObjectByHousehold
     *            the new xldf person data domain object by household
     */
    public void setXldfPersonDataDomainObjectByHousehold(
            XLDFPersonDataDomainObject xldfPersonDataDomainObjectByHousehold) {
        this.xldfPersonDataDomainObjectByHousehold = xldfPersonDataDomainObjectByHousehold;
    }

    /**
     * Gets the xldf household data domain object.
     * 
     * @return the xldf household data domain object
     */
    public XLDFHouseholdDataDomainObject getXldfHouseholdDataDomainObject() {
        return xldfHouseholdDataDomainObject;
    }

    /**
     * Sets the xldf household data domain object.
     * 
     * @param xldfHouseholdDataDomainObject
     *            the new xldf household data domain object
     */
    public void setXldfHouseholdDataDomainObject(XLDFHouseholdDataDomainObject xldfHouseholdDataDomainObject) {
        this.xldfHouseholdDataDomainObject = xldfHouseholdDataDomainObject;
    }

    /**
     * Gets the xldf005m list.
     * 
     * @return the xldf005m list
     */
    public List<Xldf005mType> getXldf005mList() {
        return xldf005mList;
    }

    /**
     * Sets the xldf005m list.
     * 
     * @param xldf005mList
     *            the new xldf005m list
     */
    public void setXldf005mList(List<Xldf005mType> xldf005mList) {
        this.xldf005mList = xldf005mList;
    }

    /**
     * Gets the app data dto.
     * 
     * @return the app data dto
     */
    public Rl01110AppDataDTO getAppDataDTO() {
        return appDataDTO;
    }

    /**
     * Sets the app data dto.
     * 
     * @param appDataDTO
     *            the new app data dto
     */
    public void setAppDataDTO(Rl01110AppDataDTO appDataDTO) {
        this.appDataDTO = appDataDTO;
    }

    /**
     * Gets the xldf005m type.
     * 
     * @return the xldf005m type
     */
    public Xldf005mType getXldf005mType() {
        if (xldf005mType == null) {
            xldf005mType = new Xldf005mType();
        }
        return xldf005mType;
    }

    /**
     * Sets the xldf005m type.
     * 
     * @param xldf005mType
     *            the new xldf005m type
     */
    public void setXldf005mType(Xldf005mType xldf005mType) {
        this.xldf005mType = xldf005mType;
    }

    public String getChangeTitle() {
        return changeTitle;
    }

    public void setChangeTitle(String changeTitle) {
        this.changeTitle = changeTitle;
    }

    public String getEnforcedFlag() {
        return enforcedFlag;
    }

    public void setEnforcedFlag(String enforcedFlag) {
        this.enforcedFlag = enforcedFlag;
    }

}

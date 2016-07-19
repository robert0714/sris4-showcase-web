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
import tw.gov.moi.domain.Xldf002mType;
import tw.gov.moi.domain.XldfefaplcType;
import tw.gov.moi.rl.common.constant.RlConstant;
import tw.gov.moi.rl.component.dto.OpeningOperationDTO;
import tw.gov.moi.rl.domain.xldf.XLDFHouseholdDataDomainObject;
import tw.gov.moi.rl.domain.xldf.XLDFPersonDataDomainObject;

/**
 * 更正全戶動態記事 DTO.
 * 
 * @author Weiren.Jheng
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl01120DTO", propOrder = { "apply1", "apply2", "delegated", "openingOperationDTO", "enforceMode",
        "xldfefaplcType", "xldfPersonDataDomainObject", "xldfHouseholdHeadPersonDataDomainObject",
        "xldfHouseholdDataDomainObject", "xldf002mList", "xldf002mType", "appDataDTO", "registerFlag", "changeTitle" })
@XmlRootElement(name = "Rl01120DTO")
public class Rl01120DTO implements Serializable {

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

    /** 逕為登記. */
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
    @XmlElement(name = "XldfHouseholdHeadPersonDataDomainObject")
    @FieldName("戶長個人資料")
    private XLDFPersonDataDomainObject xldfHouseholdHeadPersonDataDomainObject;

    /** 全戶資料. */
    @XmlElement(name = "XldfHouseholdDataDomainObject")
    @FieldName("全戶資料")
    private XLDFHouseholdDataDomainObject xldfHouseholdDataDomainObject;

    /** 全戶記事清單. */
    @XmlElement(name = "Xldf002mList")
    @FieldName("全戶記事清單")
    private List<Xldf002mType> xldf002mList;

    /** 全戶記事清單. */
    @XmlElement(name = "xldf002mType")
    @FieldName("全戶記事清單")
    private Xldf002mType xldf002mType;

    /** 更正全戶記事申請資料 DTO. */
    @XmlElement(name = "AppDataDto")
    @FieldName("更正全戶記事申請資料 DTO")
    private Rl01120AppDataDTO appDataDTO = new Rl01120AppDataDTO();

    /** 逕為登記旗標. */
    // @XmlElement(name = "RegisterFlag")
    // @FieldName("逕為登記旗標")
    // private boolean registerFlag = false;

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
     * Gets the xldf household head person data domain object.
     * 
     * @return the xldf household head person data domain object
     */
    public XLDFPersonDataDomainObject getXldfHouseholdHeadPersonDataDomainObject() {
        return xldfHouseholdHeadPersonDataDomainObject;
    }

    /**
     * Sets the xldf household head person data domain object.
     * 
     * @param xldfHouseholdHeadPersonDataDomainObject
     *            the new xldf household head person data domain object
     */
    public void setXldfHouseholdHeadPersonDataDomainObject(
            XLDFPersonDataDomainObject xldfHouseholdHeadPersonDataDomainObject) {
        this.xldfHouseholdHeadPersonDataDomainObject = xldfHouseholdHeadPersonDataDomainObject;
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
     * Gets the xldf002m list.
     * 
     * @return the xldf002m list
     */
    public List<Xldf002mType> getXldf002mList() {
        return xldf002mList;
    }

    /**
     * Sets the xldf002m list.
     * 
     * @param xldf002mList
     *            the new xldf002m list
     */
    public void setXldf002mList(List<Xldf002mType> xldf002mList) {
        this.xldf002mList = xldf002mList;
    }

    /**
     * Gets the xldf002m type.
     * 
     * @return the xldf002m type
     */
    public Xldf002mType getXldf002mType() {
        if (xldf002mType == null) {
            xldf002mType = new Xldf002mType();
        }
        return xldf002mType;
    }

    /**
     * Sets the xldf002m type.
     * 
     * @param xldf002mType
     *            the new xldf002m type
     */
    public void setXldf002mType(Xldf002mType xldf002mType) {
        this.xldf002mType = xldf002mType;
    }

    /**
     * Gets the app data dto.
     * 
     * @return the app data dto
     */
    public Rl01120AppDataDTO getAppDataDTO() {
        return appDataDTO;
    }

    /**
     * Sets the app data dto.
     * 
     * @param appDataDTO
     *            the new app data dto
     */
    public void setAppDataDTO(Rl01120AppDataDTO appDataDTO) {
        this.appDataDTO = appDataDTO;
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

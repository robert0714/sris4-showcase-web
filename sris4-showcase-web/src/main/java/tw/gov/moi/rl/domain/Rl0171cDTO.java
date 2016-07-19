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
import tw.gov.moi.rl.component.dto.RelationData;
import tw.gov.moi.rl.component.dto.XLDFDomainObject;
import tw.gov.moi.rl.component.dto.XLDFRegDetailObnfParams;
import tw.gov.moi.rl.domain.xldf.XLDFHouseholdDataDomainObject;
import tw.gov.moi.rl.domain.xldf.XLDFHouseholdNoteDomainObject;
import tw.gov.moi.rl.domain.xldf.XLDFPersonDataDomainObject;
import tw.gov.moi.rl.domain.xldf.XLDFPersonNoteDomainObject;

/**
 * 統一編號更正登記DTO
 * 
 * @author Charles Chen
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Rl0171cDTO", propOrder = { "transactionId", "acceptSiteId", "userId", "initTime",
        "openingOperationDTO", "person", "personHousehold", "foreignPerson", "householdHead", "rl0171cAppData",
        "apply1", "apply2", "delegated", "mustApply1", "mustApply2", "domainKeyList", "householdNoteList",
        "personNoteList", "householdMemberList", "relationDataList", "regObnfList", "removeHPerson", "removeMPerson",
        "enforcedApplicant", "personRole", "buttonDisabled", "warningMessgeList", "initSuccess", "activeIndex",
        "lockMode" })
@XmlRootElement(name = "Rl0171cDTO")
public class Rl0171cDTO implements Serializable {

    /** serialVersion UID */
    private static final long serialVersionUID = -4502643394527264341L;

    /** 交易序號. */
    @XmlElement(name = "TransactionId", required = true)
    @FieldName("交易序號")
    private String transactionId;

    /** 受理地作業點代碼. */
    @XmlElement(name = "AcceptSiteId", required = true)
    @FieldName("受理地作業點代碼")
    private String acceptSiteId;

    /** 使用者帳號. */
    @XmlElement(name = "UserId", required = true)
    @FieldName("使用者帳號")
    private String userId;

    /** 初始化時間. */
    @XmlElement(name = "InitTime", required = true)
    @FieldName("初始化時間")
    private String initTime;

    /** 大簿控制各作業之資訊 */
    @FieldName("大簿控制各作業之資訊")
    @XmlElement(name = "OpeningOperationDTO", required = false)
    private OpeningOperationDTO openingOperationDTO = new OpeningOperationDTO();

    /** 當事人-個人基本資料 */
    @FieldName("當事人-個人基本資料")
    @XmlElement(name = "Person", required = false)
    private XLDFPersonDataDomainObject person;

    /** 當事人-全戶基本資料 */
    @FieldName("當事人-全戶基本資料")
    @XmlElement(name = "PersonHousehold", required = false)
    private XLDFHouseholdDataDomainObject personHousehold;

    /** 當事人-外籍者資料 */
    @FieldName("當事人-外籍者基本資料")
    @XmlElement(name = "ForeignPerson", required = false)
    private XLDFForeignPersonDTO foreignPerson = new XLDFForeignPersonDTO();

    /** 戶長-個人基本資料 */
    @FieldName("戶長-個人基本資料")
    @XmlElement(name = "HouseholdHead", required = false)
    private XLDFPersonDataDomainObject householdHead;

    /** 當事人-申請資料 */
    @FieldName("當事人-申請資料")
    @XmlElement(name = "Rl0171cAppData", required = false)
    private Rl0171cAppDataDTO rl0171cAppData = new Rl0171cAppDataDTO();

    /** 申請人1 */
    @FieldName("申請人1")
    @XmlElement(name = "Apply1", required = false)
    private XLDFApplicantDataDTO apply1 = new XLDFApplicantDataDTO();

    /** 申請人2 */
    @FieldName("申請人2")
    @XmlElement(name = "Apply2", required = false)
    private XLDFApplicantDataDTO apply2 = new XLDFApplicantDataDTO();

    /** 受委託人 */
    @FieldName("受委託人")
    @XmlElement(name = "Delegated", required = false)
    private XLDFPersonBriefDataDTO delegated = new XLDFPersonBriefDataDTO();

    /** 應申請人1 */
    @FieldName("應申請人1")
    @XmlElement(name = "MustApply1", required = false)
    private XLDFApplicantDataDTO mustApply1 = new XLDFApplicantDataDTO();

    /** 應申請人2 */
    @FieldName("應申請人2")
    @XmlElement(name = "MustApply2", required = false)
    private XLDFApplicantDataDTO mustApply2 = new XLDFApplicantDataDTO();

    /** 4M DomainKey清單. */
    @FieldName("4M DomainKey清單")
    @XmlElement(name = "DomainKeyList", required = false)
    private List<String> domainKeyList = new ArrayList<String>();

    /** 全戶記事清單 */
    @FieldName("全戶記事清單")
    @XmlElement(name = "HouseholdNoteList", required = false)
    private List<XLDFHouseholdNoteDomainObject> householdNoteList = new ArrayList<XLDFHouseholdNoteDomainObject>();

    /** 個人記事清單 */
    @FieldName("個人記事清單")
    @XmlElement(name = "PersonNoteList", required = false)
    private List<XLDFPersonNoteDomainObject> personNoteList = new ArrayList<XLDFPersonNoteDomainObject>();

    /** 戶下人口清單 */
    @FieldName("戶下人口清單")
    @XmlElement(name = "HouseholdMemberList", required = false)
    private List<XLDFDomainObject> householdMemberList = new ArrayList<XLDFDomainObject>();

    /** 關係人清單 */
    @FieldName("關係人清單")
    @XmlElement(name = "RelationDataList", required = false)
    private List<RelationData> relationDataList = new ArrayList<RelationData>();

    /** 特殊通報. */
    @XmlElement(name = "RegObnfList", required = true)
    @FieldName("特殊通報")
    private List<XLDFRegDetailObnfParams> regObnfList = new ArrayList<XLDFRegDetailObnfParams>();

    /** 當事人除戶簿頁 */
    @FieldName("當事人除戶簿頁 ")
    @XmlElement(name = "RemoveHPerson", required = false)
    private XLDFDomainObject removeHPerson;

    /** 當事人現戶簿頁 */
    @FieldName("當事人現戶簿頁 ")
    @XmlElement(name = "RemoveMPerson", required = false)
    private XLDFDomainObject removeMPerson;

    /** 逕為登記申請人 */
    @FieldName("逕為登記申請人")
    @XmlElement(name = "EnforcedApplicant", required = false)
    private XldfefaplcType enforcedApplicant;

    /** 當事人-身分角色 */
    @FieldName("當事人-身分角色")
    @XmlElement(name = "PersonRole", required = false)
    private String personRole;

    /** 頁面控制:按鈕狀態<LI>註解:true = disabled ，1 = enabled */
    @FieldName("頁面控制:按鈕狀態")
    @XmlElement(name = "ButtonDisabled", required = false)
    private Boolean buttonDisabled;

    /** 警告訊息清單 */
    @FieldName("警告訊息清單")
    @XmlElement(name = "WarningMessgeList", required = false)
    private List<RlWarningMessage> warningMessgeList = new ArrayList<RlWarningMessage>();

    /** 初始化是否成功 */
    @XmlElement(name = "InitSuccess", required = true)
    @FieldName("初始化是否成功")
    private boolean initSuccess;

    /** 頁籤索引 */
    @XmlElement(name = "ActiveIndex", required = true)
    @FieldName("頁籤索引")
    private String activeIndex;

    /** 鎖定頁面元件. */
    @XmlElement(name = "LockMode", required = true)
    @FieldName("鎖定頁面元件")
    private boolean lockMode = false;

    public OpeningOperationDTO getOpeningOperationDTO() {
        return openingOperationDTO;
    }

    public void setOpeningOperationDTO(OpeningOperationDTO openingOperationDTO) {
        this.openingOperationDTO = openingOperationDTO;
    }

    public XLDFPersonDataDomainObject getPerson() {
        return person;
    }

    public void setPerson(XLDFPersonDataDomainObject person) {
        this.person = person;
    }

    public XLDFHouseholdDataDomainObject getPersonHousehold() {
        return personHousehold;
    }

    public void setPersonHousehold(XLDFHouseholdDataDomainObject personHousehold) {
        this.personHousehold = personHousehold;
    }

    public XLDFForeignPersonDTO getForeignPerson() {
        return foreignPerson;
    }

    public void setForeignPerson(XLDFForeignPersonDTO foreignPerson) {
        this.foreignPerson = foreignPerson;
    }

    public XLDFPersonDataDomainObject getHouseholdHead() {
        return householdHead;
    }

    public void setHouseholdHead(XLDFPersonDataDomainObject householdHead) {
        this.householdHead = householdHead;
    }

    public Rl0171cAppDataDTO getRl0171cAppData() {
        return rl0171cAppData;
    }

    public void setRl0171cAppData(Rl0171cAppDataDTO rl0171cAppData) {
        this.rl0171cAppData = rl0171cAppData;
    }

    public XLDFApplicantDataDTO getApply1() {
        return apply1;
    }

    public void setApply1(XLDFApplicantDataDTO apply1) {
        this.apply1 = apply1;
    }

    public XLDFApplicantDataDTO getApply2() {
        return apply2;
    }

    public void setApply2(XLDFApplicantDataDTO apply2) {
        this.apply2 = apply2;
    }

    public XLDFPersonBriefDataDTO getDelegated() {
        return delegated;
    }

    public void setDelegated(XLDFPersonBriefDataDTO delegated) {
        this.delegated = delegated;
    }

    public XLDFApplicantDataDTO getMustApply1() {
        return mustApply1;
    }

    public void setMustApply1(XLDFApplicantDataDTO mustApply1) {
        this.mustApply1 = mustApply1;
    }

    public XLDFApplicantDataDTO getMustApply2() {
        return mustApply2;
    }

    public void setMustApply2(XLDFApplicantDataDTO mustApply2) {
        this.mustApply2 = mustApply2;
    }

    public List<XLDFHouseholdNoteDomainObject> getHouseholdNoteList() {
        return householdNoteList;
    }

    public void setHouseholdNoteList(List<XLDFHouseholdNoteDomainObject> householdNoteList) {
        this.householdNoteList = householdNoteList;
    }

    public List<XLDFPersonNoteDomainObject> getPersonNoteList() {
        return personNoteList;
    }

    public void setPersonNoteList(List<XLDFPersonNoteDomainObject> personNoteList) {
        this.personNoteList = personNoteList;
    }

    public List<XLDFDomainObject> getHouseholdMemberList() {
        return householdMemberList;
    }

    public void setHouseholdMemberList(List<XLDFDomainObject> householdMemberList) {
        this.householdMemberList = householdMemberList;
    }

    public List<RelationData> getRelationDataList() {
        return relationDataList;
    }

    public void setRelationDataList(List<RelationData> relationDataList) {
        this.relationDataList = relationDataList;
    }

    public XLDFDomainObject getRemoveHPerson() {
        return removeHPerson;
    }

    public void setRemoveHPerson(XLDFDomainObject removeHPerson) {
        this.removeHPerson = removeHPerson;
    }

    public XLDFDomainObject getRemoveMPerson() {
        return removeMPerson;
    }

    public void setRemoveMPerson(XLDFDomainObject removeMPerson) {
        this.removeMPerson = removeMPerson;
    }

    public XldfefaplcType getEnforcedApplicant() {
        return enforcedApplicant;
    }

    public void setEnforcedApplicant(XldfefaplcType enforcedApplicant) {
        this.enforcedApplicant = enforcedApplicant;
    }

    public String getPersonRole() {
        return personRole;
    }

    public void setPersonRole(String personRole) {
        this.personRole = personRole;
    }

    public Boolean getButtonDisabled() {
        return buttonDisabled;
    }

    public void setButtonDisabled(Boolean buttonDisabled) {
        this.buttonDisabled = buttonDisabled;
    }

    public List<RlWarningMessage> getWarningMessgeList() {
        return warningMessgeList;
    }

    public void setWarningMessgeList(List<RlWarningMessage> warningMessgeList) {
        this.warningMessgeList = warningMessgeList;
    }

    public boolean isInitSuccess() {
        return initSuccess;
    }

    public void setInitSuccess(boolean initSuccess) {
        this.initSuccess = initSuccess;
    }

    public String getActiveIndex() {
        return activeIndex;
    }

    public void setActiveIndex(final String activeIndex) {
        this.activeIndex = activeIndex;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(final String transactionId) {
        this.transactionId = transactionId;
    }

    public String getAcceptSiteId() {
        return acceptSiteId;
    }

    public void setAcceptSiteId(final String acceptSiteId) {
        this.acceptSiteId = acceptSiteId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(final String userId) {
        this.userId = userId;
    }

    public String getInitTime() {
        return initTime;
    }

    public void setInitTime(final String initTime) {
        this.initTime = initTime;
    }

    public boolean isLockMode() {
        return lockMode;
    }

    public void setLockMode(final boolean lockMode) {
        this.lockMode = lockMode;
    }

    public List<XLDFRegDetailObnfParams> getRegObnfList() {
        return regObnfList;
    }

    public void setRegObnfList(final List<XLDFRegDetailObnfParams> regObnfList) {
        this.regObnfList = regObnfList;
    }

    public List<String> getDomainKeyList() {
        return domainKeyList;
    }

    public void setDomainKeyList(final List<String> domainKeyList) {
        this.domainKeyList = domainKeyList;
    }

}

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
import tw.gov.moi.rl.component.dto.XLDFDomainObject;
import tw.gov.moi.rl.component.xldf.dto.XCDF001MRL;
import tw.gov.moi.rl.domain.xldf.XLDFHouseholdDataDomainObject;
import tw.gov.moi.rl.domain.xldf.XLDFHouseholdNoteDomainObject;
import tw.gov.moi.rl.domain.xldf.XLDFPersonDataDomainObject;
import tw.gov.moi.rl.domain.xldf.XLDFPersonNoteDomainObject;

/**
 * 死亡登記DTO.
 * 
 * @author Charles Chen
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl01220DTO", propOrder = { "openingOperationDTO", "deadPerson", "deadHousehold", "foreignPerson",
        "deadHouseholdHead", "spousePerson", "spouseHousehold", "spouseForeignPerson", "apply1", "apply2",
        "mustApply1", "mustApply2", "delegated", "rl01220AppData", "newMemberList", "removeMemberList", "newPerson",
        "newHousehold", "personNoteList", "householdNoteList", "operationFineList", "nonResidentList",
        "enforcedApplicant", "buttonDisabled", "fineDTO", "fineQueryDTO", "warningMessgeList", "toFine",
        "fineFreeFlag", "deleteFineDTOFlag", "needGetSpouseDataFlag", "finePerson", "disabledVerifyButton",
        "activeIndex", "personXcdf001mrl", "spouseXcdf001mrl", "memoryPerson" })
@XmlRootElement(name = "Rl01220DTO", namespace = "http://tw.gov.moi/rl/dto")
public class Rl01220DTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = -3983365826692454302L;

    /** 大簿控制各作業之資訊. */
    @FieldName("大簿控制各作業之資訊")
    @XmlElement(name = "OpeningOperationDTO", required = false)
    private OpeningOperationDTO openingOperationDTO = new OpeningOperationDTO();

    /** 當事人-個人基本資料. */
    @FieldName("當事人-個人基本資料")
    @XmlElement(name = "DeadPerson", required = false)
    private XLDFPersonDataDomainObject deadPerson;

    /** 當事人-全戶基本資料. */
    @FieldName("當事人-全戶基本資料")
    @XmlElement(name = "DeadHousehold", required = false)
    private XLDFHouseholdDataDomainObject deadHousehold;

    /** 當事人-外籍者基本資料. */
    @FieldName("當事人-外籍者基本資料")
    @XmlElement(name = "ForeignPerson", required = false)
    private XLDFForeignPersonDTO foreignPerson = new XLDFForeignPersonDTO();

    /** 死亡者戶長. */
    @FieldName("死亡者戶長")
    @XmlElement(name = "DeadHouseholdHead", required = false)
    private XLDFPersonDataDomainObject deadHouseholdHead;

    /** 死亡者配偶-個人基本資料. */
    @FieldName("死亡者配偶-個人基本資料")
    @XmlElement(name = "SpousePerson", required = false)
    private XLDFPersonDataDomainObject spousePerson;

    /** 死亡者配偶-全戶基本資料. */
    @FieldName("死亡者配偶-全戶基本資料")
    @XmlElement(name = "SpouseHousehold", required = false)
    private XLDFHouseholdDataDomainObject spouseHousehold;

    /** 死亡者配偶-外籍者基本資料. */
    @FieldName("死亡者配偶-全戶基本資料")
    @XmlElement(name = "SpouseForeignPerson", required = false)
    private XLDFForeignPersonDTO spouseForeignPerson = new XLDFForeignPersonDTO();

    /** 申請人1. */
    @FieldName("申請人1")
    @XmlElement(name = "Apply1", required = false)
    private XLDFApplicantDataDTO apply1 = new XLDFApplicantDataDTO();

    /** 申請人2. */
    @FieldName("申請人2")
    @XmlElement(name = "Apply2", required = false)
    private XLDFApplicantDataDTO apply2 = new XLDFApplicantDataDTO();

    /** 應申請人1. */
    @FieldName("應申請人1")
    @XmlElement(name = "MustpApply1", required = false)
    private XLDFApplicantDataDTO mustApply1 = new XLDFApplicantDataDTO();

    /** 應申請人2. */
    @FieldName("應申請人2")
    @XmlElement(name = "MustApply2", required = false)
    private XLDFApplicantDataDTO mustApply2 = new XLDFApplicantDataDTO();

    /** 受委託人. */
    @FieldName("受委託人")
    @XmlElement(name = "Delegated", required = false)
    private XLDFPersonBriefDataDTO delegated = new XLDFPersonBriefDataDTO();

    /** 申請資料. */
    @FieldName("申請資料")
    @XmlElement(name = "Rl01220AppData", required = false)
    private Rl01220AppDataDTO rl01220AppData = new Rl01220AppDataDTO();

    /** 新戶成員. */
    @FieldName("新戶成員")
    @XmlElement(name = "NewMemberList", required = false)
    private List<XLDFPersonDataDomainObject> newMemberList = new ArrayList<XLDFPersonDataDomainObject>();

    /** 下除戶戶下人口清單. */
    @FieldName("下除戶戶下人口清單")
    @XmlElement(name = "RemoveMemberList", required = false)
    private List<XLDFPersonDataDomainObject> removeMemberList = new ArrayList<XLDFPersonDataDomainObject>();

    /** 新戶長-個人基本資料. */
    @FieldName("新戶長-個人基本資料")
    @XmlElement(name = "NewPerson", required = false)
    private XLDFPersonDataDomainObject newPerson;

    /** 新戶長-全戶基本資料. */
    @FieldName("新戶長-全戶基本資料")
    @XmlElement(name = "NewHousehold", required = false)
    private XLDFHouseholdDataDomainObject newHousehold;

    /** 個人記事清單. */
    @FieldName("個人記事清單")
    @XmlElement(name = "PersonNoteList", required = false)
    private List<XLDFPersonNoteDomainObject> personNoteList = new ArrayList<XLDFPersonNoteDomainObject>();

    /** 全戶記事清單. */
    @FieldName("全戶記事清單")
    @XmlElement(name = "HouseholdNoteList", required = false)
    private List<XLDFHouseholdNoteDomainObject> householdNoteList = new ArrayList<XLDFHouseholdNoteDomainObject>();

    /** 罰鍰清單. */
    @FieldName("罰鍰清單")
    @XmlElement(name = "OperationFineList", required = false)
    private List<XLDFOperationFineDTO> operationFineList = new ArrayList<XLDFOperationFineDTO>();

    /** 戶下非現住人口清單. */
    @FieldName("戶下非現住人口清單")
    @XmlElement(name = "NonResidentList", required = false)
    private List<XLDFDomainObject> nonResidentList = new ArrayList<XLDFDomainObject>();

    /** 逕為登記申請人. */
    @FieldName("逕為登記申請人")
    @XmlElement(name = "EnforcedApplicant", required = false)
    private XldfefaplcType enforcedApplicant;

    /** 頁面按鈕控制. */
    @FieldName("頁面按鈕控制")
    @XmlElement(name = "ButtonDisabled", required = false)
    private Boolean buttonDisabled;

    /** 罰鍰資料. */
    @FieldName("罰鍰資料")
    @XmlElement(name = "fineDTO", required = false)
    private FineDTO fineDTO;

    /** 取得罰鍰資料. */
    @FieldName("取得罰鍰資料")
    @XmlElement(name = "fineQueryDTO", required = false)
    private FineQueryDTO fineQueryDTO = new FineQueryDTO();

    /** 警告訊息清單. */
    @FieldName("警告訊息清單")
    @XmlElement(name = "WarningMessgeList", required = false)
    private List<RlWarningMessage> warningMessgeList = new ArrayList<RlWarningMessage>();

    /** 進行逾期申報之罰鍰檢視. */
    @XmlElement(name = "ToFine", required = true)
    @FieldName("進行逾期申報之罰鍰檢視")
    private boolean toFine = false;

    /** fineFreeFlag. */
    @XmlElement(name = "FineFreeFlag", required = true)
    @FieldName("fineFreeFlag")
    private boolean fineFreeFlag = false;

    /** 刪除罰鍰處理資料旗標. */
    @XmlElement(name = "DeleteFineDTOFlag", required = true)
    @FieldName("刪除罰鍰處理資料旗標")
    private boolean deleteFineDTOFlag = false;

    /** 需要自畫面選取配偶旗標. */
    @XmlElement(name = "NeedGetSpouseDataFlag", required = true)
    @FieldName("需要自畫面選取配偶旗標")
    private boolean needGetSpouseDataFlag = false;

    /** 受處分人. */
    @XmlElement(name = "FinePerson", required = true)
    @FieldName("受處分人")
    private XLDFApplicantDataDTO finePerson = new XLDFApplicantDataDTO();

    /** 控制驗證按鈕. */
    @XmlElement(name = "DisabledVerifyButton", required = true)
    @FieldName("控制驗證按鈕")
    private boolean disabledVerifyButton = true;

    /** 頁籤索引. */
    @XmlElement(name = "ActiveIndex", required = true)
    @FieldName("頁籤索引")
    private String activeIndex;

    /** 死亡者XCDF001MRL. */
    @XmlElement(name = "PersonXcdf001mrl", required = true)
    @FieldName("死亡者XCDF001MRL")
    private XCDF001MRL personXcdf001mrl;

    /** 死亡者配偶XCDF001MRL. */
    @XmlElement(name = "SpouseXcdf001mrl", required = true)
    @FieldName("死亡者配偶XCDF001MRL")
    private XCDF001MRL spouseXcdf001mrl;

    /** 記憶人. */
    @XmlElement(name = "MemoryPerson")
    @FieldName("記憶人")
    private Tldf004mType memoryPerson;

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
     * Gets the dead person.
     * 
     * @return the dead person
     */
    public XLDFPersonDataDomainObject getDeadPerson() {
        return deadPerson;
    }

    /**
     * Sets the dead person.
     * 
     * @param deadPerson
     *            the new dead person
     */
    public void setDeadPerson(XLDFPersonDataDomainObject deadPerson) {
        this.deadPerson = deadPerson;
    }

    /**
     * Gets the dead household.
     * 
     * @return the dead household
     */
    public XLDFHouseholdDataDomainObject getDeadHousehold() {
        return deadHousehold;
    }

    /**
     * Sets the dead household.
     * 
     * @param deadHousehold
     *            the new dead household
     */
    public void setDeadHousehold(XLDFHouseholdDataDomainObject deadHousehold) {
        this.deadHousehold = deadHousehold;
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
     * Gets the dead household head.
     * 
     * @return the dead household head
     */
    public XLDFPersonDataDomainObject getDeadHouseholdHead() {
        return deadHouseholdHead;
    }

    /**
     * Sets the dead household head.
     * 
     * @param deadHouseholdHead
     *            the new dead household head
     */
    public void setDeadHouseholdHead(XLDFPersonDataDomainObject deadHouseholdHead) {
        this.deadHouseholdHead = deadHouseholdHead;
    }

    /**
     * Gets the spouse person.
     * 
     * @return the spouse person
     */
    public XLDFPersonDataDomainObject getSpousePerson() {
        return spousePerson;
    }

    /**
     * Sets the spouse person.
     * 
     * @param spousePerson
     *            the new spouse person
     */
    public void setSpousePerson(XLDFPersonDataDomainObject spousePerson) {
        this.spousePerson = spousePerson;
    }

    /**
     * Gets the spouse household.
     * 
     * @return the spouse household
     */
    public XLDFHouseholdDataDomainObject getSpouseHousehold() {
        return spouseHousehold;
    }

    /**
     * Sets the spouse household.
     * 
     * @param spouseHousehold
     *            the new spouse household
     */
    public void setSpouseHousehold(XLDFHouseholdDataDomainObject spouseHousehold) {
        this.spouseHousehold = spouseHousehold;
    }

    /**
     * Gets the spouse foreign person.
     * 
     * @return the spouse foreign person
     */
    public XLDFForeignPersonDTO getSpouseForeignPerson() {
        return spouseForeignPerson;
    }

    /**
     * Sets the spouse foreign person.
     * 
     * @param spouseForeignPerson
     *            the new spouse foreign person
     */
    public void setSpouseForeignPerson(XLDFForeignPersonDTO spouseForeignPerson) {
        this.spouseForeignPerson = spouseForeignPerson;
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
     * Gets the rl01220 app data.
     * 
     * @return the rl01220 app data
     */
    public Rl01220AppDataDTO getRl01220AppData() {
        return rl01220AppData;
    }

    /**
     * Sets the rl01220 app data.
     * 
     * @param rl01220AppData
     *            the new rl01220 app data
     */
    public void setRl01220AppData(Rl01220AppDataDTO rl01220AppData) {
        this.rl01220AppData = rl01220AppData;
    }

    /**
     * Gets the new member list.
     * 
     * @return the new member list
     */
    public List<XLDFPersonDataDomainObject> getNewMemberList() {
        return newMemberList;
    }

    /**
     * Sets the new member list.
     * 
     * @param newMemberList
     *            the new new member list
     */
    public void setNewMemberList(List<XLDFPersonDataDomainObject> newMemberList) {
        this.newMemberList = newMemberList;
    }

    /**
     * Gets the new person.
     * 
     * @return the new person
     */
    public XLDFPersonDataDomainObject getNewPerson() {
        return newPerson;
    }

    /**
     * Sets the new person.
     * 
     * @param newPerson
     *            the new new person
     */
    public void setNewPerson(XLDFPersonDataDomainObject newPerson) {
        this.newPerson = newPerson;
    }

    /**
     * Gets the new household.
     * 
     * @return the new household
     */
    public XLDFHouseholdDataDomainObject getNewHousehold() {
        return newHousehold;
    }

    /**
     * Sets the new household.
     * 
     * @param newHousehold
     *            the new new household
     */
    public void setNewHousehold(XLDFHouseholdDataDomainObject newHousehold) {
        this.newHousehold = newHousehold;
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
     * Gets the operation fine list.
     * 
     * @return the operation fine list
     */
    public List<XLDFOperationFineDTO> getOperationFineList() {
        return operationFineList;
    }

    /**
     * Sets the operation fine list.
     * 
     * @param operationFineList
     *            the new operation fine list
     */
    public void setOperationFineList(List<XLDFOperationFineDTO> operationFineList) {
        this.operationFineList = operationFineList;
    }

    /**
     * Gets the non resident list.
     * 
     * @return the non resident list
     */
    public List<XLDFDomainObject> getNonResidentList() {
        return nonResidentList;
    }

    /**
     * Sets the non resident list.
     * 
     * @param nonResidentList
     *            the new non resident list
     */
    public void setNonResidentList(List<XLDFDomainObject> nonResidentList) {
        this.nonResidentList = nonResidentList;
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
     * Gets the button disabled.
     * 
     * @return the button disabled
     */
    public Boolean getButtonDisabled() {
        return buttonDisabled;
    }

    /**
     * Sets the button disabled.
     * 
     * @param buttonDisabled
     *            the new button disabled
     */
    public void setButtonDisabled(Boolean buttonDisabled) {
        this.buttonDisabled = buttonDisabled;
    }

    /**
     * Gets the fine dto.
     * 
     * @return the fine dto
     */
    public FineDTO getFineDTO() {
        return fineDTO;
    }

    /**
     * Sets the fine dto.
     * 
     * @param fineDTO
     *            the new fine dto
     */
    public void setFineDTO(FineDTO fineDTO) {
        this.fineDTO = fineDTO;
    }

    /**
     * Gets the fine query dto.
     * 
     * @return the fine query dto
     */
    public FineQueryDTO getFineQueryDTO() {
        return fineQueryDTO;
    }

    /**
     * Sets the fine query dto.
     * 
     * @param fineQueryDTO
     *            the new fine query dto
     */
    public void setFineQueryDTO(FineQueryDTO fineQueryDTO) {
        this.fineQueryDTO = fineQueryDTO;
    }

    /**
     * Gets the warning messge list.
     * 
     * @return the warning messge list
     */
    public List<RlWarningMessage> getWarningMessgeList() {
        return warningMessgeList;
    }

    /**
     * Sets the warning messge list.
     * 
     * @param warningMessgeList
     *            the new warning messge list
     */
    public void setWarningMessgeList(List<RlWarningMessage> warningMessgeList) {
        this.warningMessgeList = warningMessgeList;
    }

    /**
     * Checks if is to fine.
     * 
     * @return true, if is to fine
     */
    public boolean isToFine() {
        return toFine;
    }

    /**
     * Sets the to fine.
     * 
     * @param toFine
     *            the new to fine
     */
    public void setToFine(boolean toFine) {
        this.toFine = toFine;
    }

    /**
     * Checks if is fine free flag.
     * 
     * @return true, if is fine free flag
     */
    public boolean isFineFreeFlag() {
        return fineFreeFlag;
    }

    /**
     * Sets the fine free flag.
     * 
     * @param fineFreeFlag
     *            the new fine free flag
     */
    public void setFineFreeFlag(boolean fineFreeFlag) {
        this.fineFreeFlag = fineFreeFlag;
    }

    /**
     * Gets the removes the member list.
     * 
     * @return the removes the member list
     */
    public List<XLDFPersonDataDomainObject> getRemoveMemberList() {
        return removeMemberList;
    }

    /**
     * Sets the removes the member list.
     * 
     * @param removeMemberList
     *            the new removes the member list
     */
    public void setRemoveMemberList(List<XLDFPersonDataDomainObject> removeMemberList) {
        this.removeMemberList = removeMemberList;
    }

    /**
     * Checks if is delete fine dto flag.
     * 
     * @return true, if is delete fine dto flag
     */
    public boolean isDeleteFineDTOFlag() {
        return deleteFineDTOFlag;
    }

    /**
     * Sets the delete fine dto flag.
     * 
     * @param deleteFineDTOFlag
     *            the new delete fine dto flag
     */
    public void setDeleteFineDTOFlag(boolean deleteFineDTOFlag) {
        this.deleteFineDTOFlag = deleteFineDTOFlag;
    }

    /**
     * Checks if is need get spouse data flag.
     * 
     * @return true, if is need get spouse data flag
     */
    public boolean isNeedGetSpouseDataFlag() {
        return needGetSpouseDataFlag;
    }

    /**
     * Sets the need get spouse data flag.
     * 
     * @param needGetSpouseDataFlag
     *            the new need get spouse data flag
     */
    public void setNeedGetSpouseDataFlag(boolean needGetSpouseDataFlag) {
        this.needGetSpouseDataFlag = needGetSpouseDataFlag;
    }

    /**
     * Gets the fine person.
     * 
     * @return the fine person
     */
    public XLDFApplicantDataDTO getFinePerson() {
        return finePerson;
    }

    /**
     * Sets the fine person.
     * 
     * @param finePerson
     *            the new fine person
     */
    public void setFinePerson(XLDFApplicantDataDTO finePerson) {
        this.finePerson = finePerson;
    }

    /**
     * Checks if is disabled verify button.
     * 
     * @return true, if is disabled verify button
     */
    public boolean isDisabledVerifyButton() {
        return disabledVerifyButton;
    }

    /**
     * Sets the disabled verify button.
     * 
     * @param disabledVerifyButton
     *            the new disabled verify button
     */
    public void setDisabledVerifyButton(boolean disabledVerifyButton) {
        this.disabledVerifyButton = disabledVerifyButton;
    }

    /**
     * Gets the active index.
     * 
     * @return the active index
     */
    public String getActiveIndex() {
        return activeIndex;
    }

    /**
     * Sets the active index.
     * 
     * @param activeIndex
     *            the new active index
     */
    public void setActiveIndex(String activeIndex) {
        this.activeIndex = activeIndex;
    }

    /**
     * Gets the person xcdf001mrl.
     * 
     * @return the person xcdf001mrl
     */
    public XCDF001MRL getPersonXcdf001mrl() {
        return personXcdf001mrl;
    }

    /**
     * Sets the person xcdf001mrl.
     * 
     * @param personXcdf001mrl
     *            the new person xcdf001mrl
     */
    public void setPersonXcdf001mrl(XCDF001MRL personXcdf001mrl) {
        this.personXcdf001mrl = personXcdf001mrl;
    }

    /**
     * Gets the spouse xcdf001mrl.
     * 
     * @return the spouse xcdf001mrl
     */
    public XCDF001MRL getSpouseXcdf001mrl() {
        return spouseXcdf001mrl;
    }

    /**
     * Sets the spouse xcdf001mrl.
     * 
     * @param spouseXcdf001mrl
     *            the new spouse xcdf001mrl
     */
    public void setSpouseXcdf001mrl(XCDF001MRL spouseXcdf001mrl) {
        this.spouseXcdf001mrl = spouseXcdf001mrl;
    }

    /**
     * Gets the memory person.
     * 
     * @return the memory person
     */
    public Tldf004mType getMemoryPerson() {
        return memoryPerson;
    }

    /**
     * Sets the memory person.
     * 
     * @param memoryPerson
     *            the new memory person
     */
    public void setMemoryPerson(Tldf004mType memoryPerson) {
        this.memoryPerson = memoryPerson;
    }

}

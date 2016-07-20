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

import org.apache.commons.lang.StringUtils;

import tw.gov.moi.ae.checker.annotation.FieldName;
import tw.gov.moi.domain.Rldfm10hType;
import tw.gov.moi.domain.XldfefaplcType;
import tw.gov.moi.rl.component.dto.OpeningOperationDTO;
import tw.gov.moi.rl.component.dto.XLDFDomainObject;
import tw.gov.moi.rl.component.xldf.dto.XLDF001M;
import tw.gov.moi.rl.component.xldf.dto.XLDF004M;
import tw.gov.moi.rl.component.xldf.dto.XLDF021M;
import tw.gov.moi.rl.component.xldf.dto.XLDFM10M;
import tw.gov.moi.rl.domain.xldf.XLDFHouseholdDataDomainObject;
import tw.gov.moi.rl.domain.xldf.XLDFHouseholdNoteDomainObject;
import tw.gov.moi.rl.domain.xldf.XLDFPersonDataDomainObject;
import tw.gov.moi.rl.domain.xldf.XLDFPersonNoteDomainObject;

/**
 * 死亡登記撤銷 DTO.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl01814DTO", propOrder = { "openingOperationDTO", "person", "rl01814AppDataDTO", "apply1", "apply2",
        "delegated", "personHousehold", "foreignPerson", "householdHead", "orgHouseholdHead", "enterHouseholdHead",
        "personNoteList", "householdNoteList", "xldf021m", "personRole", "buttonDisabled", "fineDTO", "fineQueryDTO",
        "enforcedApplicant", "m10mList", "viewM10m", "viewPostiveApplication", "selectedM10m",
        "selectedPostiveApplication", "isToFine", "fineFreeFlag", "finePerson", "m10hList", "viewM10h", "selectedM10h",
        "disabledVerifyButton", "activeIndex", "doM10MCheckFlag", "doM10HCheckFlag" })
@XmlRootElement(name = "Rl01814DTO", namespace = "http://tw.gov.moi/rl/domain")
public class Rl01814DTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 8315427744392697504L;

    /** 大簿控制各作業之資訊. */
    @FieldName("大簿控制各作業之資訊")
    @XmlElement(name = "OpeningOperationDTO", required = false)
    private OpeningOperationDTO openingOperationDTO = new OpeningOperationDTO();

    /** 當事人-個人基本資料. */
    @FieldName("當事人-個人基本資料")
    @XmlElement(name = "Person", required = false)
    private XLDFPersonDataDomainObject person;

    /** 當事人-申請資料. */
    @FieldName("當事人-申請資料")
    @XmlElement(name = "Rl01814AppDataDTO", required = false)
    private Rl01814AppDataDTO rl01814AppDataDTO = new Rl01814AppDataDTO();

    /** 申請人1. */
    @FieldName("申請人1")
    @XmlElement(name = "Apply1", required = false)
    private XLDFApplicantDataDTO apply1 = new XLDFApplicantDataDTO();

    /** 申請人2. */
    @FieldName("申請人2")
    @XmlElement(name = "Apply2", required = false)
    private XLDFApplicantDataDTO apply2 = new XLDFApplicantDataDTO();

    /** 受委託人. */
    @FieldName("受委託人")
    @XmlElement(name = "Delegated", required = false)
    private XLDFPersonBriefDataDTO delegated = new XLDFPersonBriefDataDTO();

    /** 當事人-全戶基本資料. */
    @FieldName("當事人-全戶基本資料")
    @XmlElement(name = "PersonHousehold", required = false)
    private XLDFDomainObject personHousehold = new XLDF001M(StringUtils.EMPTY, StringUtils.EMPTY, StringUtils.EMPTY);

    /** 當事人-外籍者資料. */
    @FieldName("當事人-外籍者資料")
    @XmlElement(name = "ForeignPerson", required = false)
    private XLDFForeignPersonDTO foreignPerson = new XLDFForeignPersonDTO();

    /** 戶長. */
    @FieldName("戶長")
    @XmlElement(name = "HouseholdHead", required = false)
    private XLDFDomainObject householdHead = new XLDF004M(StringUtils.EMPTY, StringUtils.EMPTY);

    /** 原戶長. */
    @FieldName("原戶長")
    @XmlElement(name = "OrgHouseholdHead", required = false)
    private XLDFPersonDataDomainObject orgHouseholdHead;

    /** 擬入戶長. */
    @FieldName("擬入戶長")
    @XmlElement(name = "EnterHouseholdHead", required = false)
    private XLDFHouseholdDataDomainObject enterHouseholdHead;

    /** 個人記事清單. */
    @FieldName("個人記事清單")
    @XmlElement(name = "PersonNoteList", required = false)
    private List<XLDFPersonNoteDomainObject> personNoteList = new ArrayList<XLDFPersonNoteDomainObject>();

    /** 全戶記事清單. */
    @FieldName("全戶記事清單")
    @XmlElement(name = "HouseholdNoteList", required = false)
    private List<XLDFHouseholdNoteDomainObject> householdNoteList = new ArrayList<XLDFHouseholdNoteDomainObject>();

    /** 自立新戶戶號配賦資料. */
    @FieldName("自立新戶戶號配賦資料")
    @XmlElement(name = "Xldf021m", required = false)
    private XLDF021M xldf021m;

    /** 當事人-身分角色. */
    @FieldName("當事人-身分角色")
    @XmlElement(name = "PersonRole", required = false)
    private String personRole;

    /** 頁面控制:按鈕狀態<LI>註解:true = disabled ，1 = enabled. */
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

    /** 逕為登記申請人. */
    @FieldName("逕為登記申請人")
    @XmlElement(name = "EnforcedApplicant", required = false)
    private XldfefaplcType enforcedApplicant;

    /** 擬撤銷之原登記申請書紀錄清單. */
    @XmlElement(name = "M10mList", required = true)
    @FieldName("擬撤銷之原登記申請書紀錄清單")
    private List<XLDFM10M> m10mList = new ArrayList<XLDFM10M>();

    /** 檢視的擬撤銷之原登記申請書紀錄. */
    @XmlElement(name = "ViewM10m", required = true)
    @FieldName("檢視的擬撤銷之原登記申請書紀錄")
    private XLDFM10M viewM10m;

    /** 檢視的擬撤銷之原登記申請書. */
    @XmlElement(name = "ViewPostiveApplication", required = true)
    @FieldName("檢視的擬撤銷之原登記申請書")
    private XLDFDomainObject viewPostiveApplication;

    /** 選取的擬撤銷之原登記申請書紀錄. */
    @XmlElement(name = "SelectedM10m", required = true)
    @FieldName("選取的擬撤銷之原登記申請書紀錄")
    private XLDFM10M selectedM10m;

    /** 選取的擬撤銷之原登記申請書. */
    @XmlElement(name = "SelectedPostiveApplication", required = true)
    @FieldName("選取的擬撤銷之原登記申請書")
    private XLDFDomainObject selectedPostiveApplication;

    /** 進行逾期申報之罰鍰檢視. */
    @XmlElement(name = "IsToFine", required = true)
    @FieldName("進行逾期申報之罰鍰檢視")
    private boolean isToFine = false;

    /** fineFreeFlag. */
    @XmlElement(name = "FineFreeFlag", required = true)
    @FieldName("fineFreeFlag")
    private boolean fineFreeFlag = false;

    /** 刪除罰鍰處理資料旗標. */
    @XmlElement(name = "DeleteFineDTOFlag", required = true)
    @FieldName("刪除罰鍰處理資料旗標")
    private boolean deleteFineDTOFlag = false;

    /** 受處分人. */
    @XmlElement(name = "FinePerson", required = true)
    @FieldName("受處分人")
    private XLDFApplicantDataDTO finePerson = new XLDFApplicantDataDTO();

    /** 擬撤銷之原登記申請書紀錄清單. */
    @XmlElement(name = "M10hList", required = true)
    @FieldName("擬撤銷之原登記申請書紀錄清單")
    private List<Rldfm10hType> m10hList = new ArrayList<Rldfm10hType>();

    /** 檢視的擬撤銷之原登記申請書紀錄. */
    @XmlElement(name = "ViewM10h", required = true)
    @FieldName("檢視的擬撤銷之原登記申請書紀錄")
    private Rldfm10hType viewM10h;

    /** 選取的擬撤銷之原登記申請書紀錄. */
    @XmlElement(name = "SelectedM10h", required = true)
    @FieldName("選取的擬撤銷之原登記申請書紀錄")
    private Rldfm10hType selectedM10h;

    /** 控制驗證按鈕. */
    @XmlElement(name = "DisabledVerifyButton", required = true)
    @FieldName("控制驗證按鈕")
    private boolean disabledVerifyButton = true;

    /** 頁籤索引. */
    @XmlElement(name = "ActiveIndex", required = true)
    @FieldName("頁籤索引")
    private String activeIndex;

    /** 以上皆非(勾原登記申請書). */
    @XmlElement(name = "DoM10MCheckFlag", required = true)
    @FieldName("以上皆非(勾原登記申請書)現戶")
    private boolean doM10MCheckFlag;

    /** 以上皆非(勾原登記申請書). */
    @XmlElement(name = "DoM10HCheckFlag", required = true)
    @FieldName("以上皆非(勾原登記申請書)除戶")
    private boolean doM10HCheckFlag;

    /**
     * Gets the opening operation dto.
     * 
     * @return the opening operation dto
     */
    public OpeningOperationDTO getOpeningOperationDTO() {
        return openingOperationDTO;
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
     * Gets the rl01814 app data dto.
     * 
     * @return the rl01814 app data dto
     */
    public Rl01814AppDataDTO getRl01814AppDataDTO() {
        return rl01814AppDataDTO;
    }

    /**
     * Sets the rl01814 app data dto.
     * 
     * @param rl01814AppDataDTO
     *            the new rl01814 app data dto
     */
    public void setRl01814AppDataDTO(Rl01814AppDataDTO rl01814AppDataDTO) {
        this.rl01814AppDataDTO = rl01814AppDataDTO;
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
     * Gets the person household.
     * 
     * @return the person household
     */
    public XLDFDomainObject getPersonHousehold() {
        return personHousehold;
    }

    /**
     * Sets the person household.
     * 
     * @param personHousehold
     *            the new person household
     */
    public void setPersonHousehold(XLDFDomainObject personHousehold) {
        this.personHousehold = personHousehold;
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
     * Gets the org household head.
     * 
     * @return the org household head
     */
    public XLDFPersonDataDomainObject getOrgHouseholdHead() {
        return orgHouseholdHead;
    }

    /**
     * Sets the org household head.
     * 
     * @param orgHouseholdHead
     *            the new org household head
     */
    public void setOrgHouseholdHead(XLDFPersonDataDomainObject orgHouseholdHead) {
        this.orgHouseholdHead = orgHouseholdHead;
    }

    /**
     * Gets the enter household head.
     * 
     * @return the enter household head
     */
    public XLDFHouseholdDataDomainObject getEnterHouseholdHead() {
        return enterHouseholdHead;
    }

    /**
     * Sets the enter household head.
     * 
     * @param enterHouseholdHead
     *            the new enter household head
     */
    public void setEnterHouseholdHead(XLDFHouseholdDataDomainObject enterHouseholdHead) {
        this.enterHouseholdHead = enterHouseholdHead;
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
     * Gets the household head.
     * 
     * @return the household head
     */
    public XLDFDomainObject getHouseholdHead() {
        return householdHead;
    }

    /**
     * Sets the household head.
     * 
     * @param householdHead
     *            the new household head
     */
    public void setHouseholdHead(XLDFDomainObject householdHead) {
        this.householdHead = householdHead;
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
     * Gets the m10m list.
     * 
     * @return the m10m list
     */
    public List<XLDFM10M> getM10mList() {
        return m10mList;
    }

    /**
     * Sets the m10m list.
     * 
     * @param m10mList
     *            the new m10m list
     */
    public void setM10mList(List<XLDFM10M> m10mList) {
        this.m10mList = m10mList;
    }

    /**
     * Gets the view m10m.
     * 
     * @return the view m10m
     */
    public XLDFM10M getViewM10m() {
        return viewM10m;
    }

    /**
     * Sets the view m10m.
     * 
     * @param viewM10m
     *            the new view m10m
     */
    public void setViewM10m(XLDFM10M viewM10m) {
        this.viewM10m = viewM10m;
    }

    /**
     * Gets the view postive application.
     * 
     * @return the view postive application
     */
    public XLDFDomainObject getViewPostiveApplication() {
        return viewPostiveApplication;
    }

    /**
     * Sets the view postive application.
     * 
     * @param viewPostiveApplication
     *            the new view postive application
     */
    public void setViewPostiveApplication(XLDFDomainObject viewPostiveApplication) {
        this.viewPostiveApplication = viewPostiveApplication;
    }

    /**
     * Gets the selected m10m.
     * 
     * @return the selected m10m
     */
    public XLDFM10M getSelectedM10m() {
        return selectedM10m;
    }

    /**
     * Sets the selected m10m.
     * 
     * @param selectedM10m
     *            the new selected m10m
     */
    public void setSelectedM10m(XLDFM10M selectedM10m) {
        this.selectedM10m = selectedM10m;
    }

    /**
     * Gets the selected postive application.
     * 
     * @return the selected postive application
     */
    public XLDFDomainObject getSelectedPostiveApplication() {
        return selectedPostiveApplication;
    }

    /**
     * Sets the selected postive application.
     * 
     * @param selectedPostiveApplication
     *            the new selected postive application
     */
    public void setSelectedPostiveApplication(XLDFDomainObject selectedPostiveApplication) {
        this.selectedPostiveApplication = selectedPostiveApplication;
    }

    /**
     * Checks if is to fine.
     * 
     * @return true, if is to fine
     */
    public boolean isToFine() {
        return isToFine;
    }

    /**
     * Sets the to fine.
     * 
     * @param isToFine
     *            the new to fine
     */
    public void setToFine(boolean isToFine) {
        this.isToFine = isToFine;
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
     * Gets the m10h list.
     * 
     * @return the m10h list
     */
    public List<Rldfm10hType> getM10hList() {
        return m10hList;
    }

    /**
     * Sets the m10h list.
     * 
     * @param m10hList
     *            the new m10h list
     */
    public void setM10hList(List<Rldfm10hType> m10hList) {
        this.m10hList = m10hList;
    }

    /**
     * Gets the view m10h.
     * 
     * @return the view m10h
     */
    public Rldfm10hType getViewM10h() {
        return viewM10h;
    }

    /**
     * Sets the view m10h.
     * 
     * @param viewM10h
     *            the new view m10h
     */
    public void setViewM10h(Rldfm10hType viewM10h) {
        this.viewM10h = viewM10h;
    }

    /**
     * Gets the selected m10h.
     * 
     * @return the selected m10h
     */
    public Rldfm10hType getSelectedM10h() {
        return selectedM10h;
    }

    /**
     * Sets the selected m10h.
     * 
     * @param selectedM10h
     *            the new selected m10h
     */
    public void setSelectedM10h(Rldfm10hType selectedM10h) {
        this.selectedM10h = selectedM10h;
    }

    public boolean isDisabledVerifyButton() {
        return disabledVerifyButton;
    }

    public void setDisabledVerifyButton(boolean disabledVerifyButton) {
        this.disabledVerifyButton = disabledVerifyButton;
    }

    public String getActiveIndex() {
        return activeIndex;
    }

    public void setActiveIndex(String activeIndex) {
        this.activeIndex = activeIndex;
    }

    public boolean isDoM10MCheckFlag() {
        return doM10MCheckFlag;
    }

    public void setDoM10MCheckFlag(boolean doM10MCheckFlag) {
        this.doM10MCheckFlag = doM10MCheckFlag;
    }

    public boolean isDoM10HCheckFlag() {
        return doM10HCheckFlag;
    }

    public void setDoM10HCheckFlag(boolean doM10HCheckFlag) {
        this.doM10HCheckFlag = doM10HCheckFlag;
    }

}

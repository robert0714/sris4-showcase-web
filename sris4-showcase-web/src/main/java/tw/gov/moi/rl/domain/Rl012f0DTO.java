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
import tw.gov.moi.rl.domain.xldf.XLDFHouseholdDataDomainObject;
import tw.gov.moi.rl.domain.xldf.XLDFHouseholdNoteDomainObject;
import tw.gov.moi.rl.domain.xldf.XLDFPersonDataDomainObject;
import tw.gov.moi.rl.domain.xldf.XLDFPersonNoteDomainObject;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Rl012f0DTO", propOrder = { "openingOperationDTO", "person", "rl012f0AppData", "personHousehold",
        "apply1", "apply2", "delegated", "mustApply1", "mustApply2", "foreignPerson", "householdHead",
        "householdNoteList", "personNoteList", "personRole", "enforcedApplicant", "father", "fatherHousehold",
        "fatherForeignPerson", "mother", "motherHousehold", "motherForeignPerson", "childList", "child",
        "warningMessgeList", "fineDTO", "fineQueryDTO", "initSuccess", "activeIndex", "fatherMemoryPerson",
        "motherMemoryPerson", "isOther" })
@XmlRootElement(name = "Rl012f0DTO")
public class Rl012f0DTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** 大簿控制各作業之資訊 */
    @FieldName("大簿控制各作業之資訊")
    @XmlElement(name = "OpeningOperationDTO", required = false)
    private OpeningOperationDTO openingOperationDTO;

    /** 當事人-個人基本資料 */
    @FieldName("當事人-個人基本資料")
    @XmlElement(name = "Person", required = false)
    private XLDFPersonDataDomainObject person;

    /** 當事人-申請資料 */
    @FieldName("當事人-申請資料")
    @XmlElement(name = "Rl012f0AppData", required = false)
    private Rl012f0AppDataDTO rl012f0AppData = new Rl012f0AppDataDTO();

    /** 當事人-全戶基本資料 */
    @FieldName("當事人-全戶基本資料")
    @XmlElement(name = "PersonHousehold", required = false)
    private XLDFHouseholdDataDomainObject personHousehold;

    /** 申請人1 */
    @FieldName("申請人1")
    @XmlElement(name = "Apply1", required = false)
    private XLDFApplicantDataDTO apply1;

    /** 申請人2 */
    @FieldName("申請人2")
    @XmlElement(name = "Apply2", required = false)
    private XLDFApplicantDataDTO apply2;

    /** 受委託人 */
    @FieldName("受委託人")
    @XmlElement(name = "Delegated", required = false)
    private XLDFPersonBriefDataDTO delegated;

    /** 應申請人1 */
    @FieldName("應申請人1")
    @XmlElement(name = "MustApply1", required = false)
    private XLDFApplicantDataDTO mustApply1;

    /** 應申請人2 */
    @FieldName("應申請人2")
    @XmlElement(name = "MustApply2", required = false)
    private XLDFApplicantDataDTO mustApply2;

    /** 當事人-外籍者資料 */
    @FieldName("當事人-外籍者資料")
    @XmlElement(name = "ForeignPerson", required = false)
    private XLDFForeignPersonDTO foreignPerson;

    /** 戶長 */
    @FieldName("戶長")
    @XmlElement(name = "HouseholdHead", required = false)
    private XLDFPersonDataDomainObject householdHead;

    /** 全戶記事清單 */
    @FieldName("全戶記事清單")
    @XmlElement(name = "PersonNoteList", required = false)
    private List<XLDFHouseholdNoteDomainObject> householdNoteList = new ArrayList<XLDFHouseholdNoteDomainObject>();

    /** 個人記事清單 */
    @FieldName("個人記事清單")
    @XmlElement(name = "PersonNoteList", required = false)
    private List<XLDFPersonNoteDomainObject> personNoteList = new ArrayList<XLDFPersonNoteDomainObject>();

    /** 當事人-身分角色 */
    @FieldName("當事人-身分角色")
    @XmlElement(name = "PersonRole", required = false)
    private String personRole;

    /** 逕為登記申請人 */
    @FieldName("逕為登記申請人")
    @XmlElement(name = "EnforcedApplicant", required = false)
    private XldfefaplcType enforcedApplicant;

    /** 權義負擔人父 */
    @FieldName("權義負擔人父")
    @XmlElement(name = "Father", required = false)
    private XLDFPersonDataDomainObject father;

    /** 權義負擔人父全戶基本資料 */
    @FieldName("權義負擔人父全戶基本資料")
    @XmlElement(name = "FatherHousehold", required = false)
    private XLDFHouseholdDataDomainObject fatherHousehold;

    /** 權義負擔人父-外籍者資料 */
    @FieldName("權義負擔人父-外籍者資料")
    @XmlElement(name = "FatherForeignPerson", required = false)
    private XLDFForeignPersonDTO fatherForeignPerson;

    /** 權義負擔人母 */
    @FieldName("權義負擔人母")
    @XmlElement(name = "Mother", required = false)
    private XLDFPersonDataDomainObject mother;

    /** 權義負擔人母全戶基本資料 */
    @FieldName("權義負擔人母全戶基本資料")
    @XmlElement(name = "MotherHousehold", required = false)
    private XLDFHouseholdDataDomainObject motherHousehold;

    /** 權義負擔人母-外籍者資料 */
    @FieldName("權義負擔人母-外籍者資料")
    @XmlElement(name = "MotherForeignPerson", required = false)
    private XLDFForeignPersonDTO motherForeignPerson;

    /** 未成年子女清單 */
    @FieldName("未成年子女清單")
    @XmlElement(name = "ChildList", required = false)
    private List<ChildDTO> childList;

    /** 未成年子女 */
    @FieldName("未成年子女")
    @XmlElement(name = "Child", required = false)
    private ChildDTO child;

    /** 警告訊息清單 */
    @FieldName("警告訊息清單")
    @XmlElement(name = "WarningMessgeList", required = false)
    private List<RlWarningMessage> warningMessgeList;

    /** 罰鍰資料 */
    @FieldName("罰鍰資料")
    @XmlElement(name = "fineDTO", required = false)
    private FineDTO fineDTO;

    /** 取得罰鍰資料 */
    @FieldName("取得罰鍰資料")
    @XmlElement(name = "fineQueryDTO", required = false)
    private FineQueryDTO fineQueryDTO = new FineQueryDTO();

    /** 初始化是否成功 */
    @XmlElement(name = "InitSuccess", required = true)
    @FieldName("初始化是否成功")
    private boolean initSuccess;

    /** 頁籤索引 */
    @XmlElement(name = "ActiveIndex", required = true)
    @FieldName("頁籤索引")
    private String activeIndex;

    /** 生父-補登個人基本資料 */
    @XmlElement(name = "FatherMemoryPerson", required = true)
    @FieldName("生父-補登個人基本資料")
    private Tldf004mType fatherMemoryPerson;

    /** 生母-補登個人基本資料 */
    @XmlElement(name = "MotherMemoryPerson", required = true)
    @FieldName("生母-補登個人基本資料")
    private Tldf004mType motherMemoryPerson;

    /** 是否有其他附繳證件 */
    @XmlElement(name = "IsOther", required = true)
    @FieldName("是否有其他附繳證件")
    private boolean isOther;

    /**
     * 取得生父-補登個人基本資料
     * 
     * @return 生父-補登個人基本資料
     */
    public Tldf004mType getFatherMemoryPerson() {
        return fatherMemoryPerson;
    }

    /**
     * 設定生父-補登個人基本資料
     * 
     * @param fatherMemoryPerson
     *            生父-補登個人基本資料
     */
    public void setFatherMemoryPerson(final Tldf004mType fatherMemoryPerson) {
        this.fatherMemoryPerson = fatherMemoryPerson;
    }

    /**
     * 取得生母-補登個人基本資料
     * 
     * @return 生母-補登個人基本資料
     */
    public Tldf004mType getMotherMemoryPerson() {
        return motherMemoryPerson;
    }

    /**
     * 設定生母-補登個人基本資料
     * 
     * @param motherMemoryPerson
     *            生母-補登個人基本資料
     */
    public void setMotherMemoryPerson(final Tldf004mType motherMemoryPerson) {
        this.motherMemoryPerson = motherMemoryPerson;
    }

    /**
     * 取得初始化是否成功
     * 
     * @return 初始化是否成功
     */
    public boolean isInitSuccess() {
        return initSuccess;
    }

    /**
     * 設定初始化是否成功
     * 
     * @param initSuccess
     *            初始化是否成功
     */
    public void setInitSuccess(final boolean initSuccess) {
        this.initSuccess = initSuccess;
    }

    /**
     * 取得頁籤索引
     * 
     * @return 頁籤索引
     */
    public String getActiveIndex() {
        return activeIndex;
    }

    /**
     * 設定頁籤索引
     * 
     * @param activeIndex
     *            頁籤索引
     */
    public void setActiveIndex(final String activeIndex) {
        this.activeIndex = activeIndex;
    }

    public XLDFHouseholdDataDomainObject getFatherHousehold() {
        return fatherHousehold;
    }

    public void setFatherHousehold(XLDFHouseholdDataDomainObject fatherHousehold) {
        this.fatherHousehold = fatherHousehold;
    }

    public XLDFHouseholdDataDomainObject getMotherHousehold() {
        return motherHousehold;
    }

    public void setMotherHousehold(XLDFHouseholdDataDomainObject motherHousehold) {
        this.motherHousehold = motherHousehold;
    }

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

    public Rl012f0AppDataDTO getRl012f0AppData() {
        return rl012f0AppData;
    }

    public void setRl012f0AppData(Rl012f0AppDataDTO rl012f0AppData) {
        this.rl012f0AppData = rl012f0AppData;
    }

    public XLDFHouseholdDataDomainObject getPersonHousehold() {
        return personHousehold;
    }

    public void setPersonHousehold(XLDFHouseholdDataDomainObject personHousehold) {
        this.personHousehold = personHousehold;
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

    public String getPersonRole() {
        return personRole;
    }

    public void setPersonRole(String personRole) {
        this.personRole = personRole;
    }

    public XldfefaplcType getEnforcedApplicant() {
        return enforcedApplicant;
    }

    public void setEnforcedApplicant(XldfefaplcType enforcedApplicant) {
        this.enforcedApplicant = enforcedApplicant;
    }

    public XLDFPersonDataDomainObject getFather() {
        return father;
    }

    public void setFather(XLDFPersonDataDomainObject father) {
        this.father = father;
    }

    public XLDFForeignPersonDTO getFatherForeignPerson() {
        return fatherForeignPerson;
    }

    public void setFatherForeignPerson(XLDFForeignPersonDTO fatherForeignPerson) {
        this.fatherForeignPerson = fatherForeignPerson;
    }

    public XLDFPersonDataDomainObject getMother() {
        return mother;
    }

    public void setMother(XLDFPersonDataDomainObject mother) {
        this.mother = mother;
    }

    public XLDFForeignPersonDTO getMotherForeignPerson() {
        return motherForeignPerson;
    }

    public void setMotherForeignPerson(XLDFForeignPersonDTO motherForeignPerson) {
        this.motherForeignPerson = motherForeignPerson;
    }

    public List<ChildDTO> getChildList() {
        return childList;
    }

    public void setChildList(List<ChildDTO> childList) {
        this.childList = childList;
    }

    public ChildDTO getChild() {
        return child;
    }

    public void setChild(ChildDTO child) {
        this.child = child;
    }

    public List<RlWarningMessage> getWarningMessgeList() {
        return warningMessgeList;
    }

    public void setWarningMessgeList(List<RlWarningMessage> warningMessgeList) {
        this.warningMessgeList = warningMessgeList;
    }

    public FineDTO getFineDTO() {
        return fineDTO;
    }

    public void setFineDTO(FineDTO fineDTO) {
        this.fineDTO = fineDTO;
    }

    public FineQueryDTO getFineQueryDTO() {
        return fineQueryDTO;
    }

    public void setFineQueryDTO(FineQueryDTO fineQueryDTO) {
        this.fineQueryDTO = fineQueryDTO;
    }

    public boolean isOther() {
        return isOther;
    }

    public void setOther(final boolean isOther) {
        this.isOther = isOther;
    }

}

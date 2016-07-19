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
import tw.gov.moi.rl.component.xldf.dto.XLDFM05M;
import tw.gov.moi.rl.domain.xldf.XLDFHouseholdDataDomainObject;
import tw.gov.moi.rl.domain.xldf.XLDFHouseholdNoteDomainObject;
import tw.gov.moi.rl.domain.xldf.XLDFPersonDataDomainObject;
import tw.gov.moi.rl.domain.xldf.XLDFPersonNoteDomainObject;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Rl01g22DTO", propOrder = { "openingOperationDTO", "person", "rl01g22AppData", "personHousehold", "apply1", "apply2", "delegated", "mustApply1", "mustApply2", "foreignPerson", "householdHead", "householdNoteList", "personNoteList", "personRole", "enforcedApplicant", "father", "fatherHousehold", "fatherForeignPerson", "mother", "motherHousehold", "motherForeignPerson", "warningMessgeList", "fineDTO", "fineQueryDTO", "initSuccess", "activeIndex", "fatherMemoryPerson", "motherMemoryPerson", "isOther", "isCancelOther", "fatherXldfm05m", "motherXldfm05m" })
@XmlRootElement(name = "Rl01g22DTO")
public class Rl01g22DTO implements Serializable {

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
    @XmlElement(name = "Rl01g22AppData", required = false)
    private Rl01g22AppDataDTO rl01g22AppData = new Rl01g22AppDataDTO();

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

    /** 權義負擔人父-未成年子女權利義務行使負擔資料檔 */
    @FieldName("權義負擔人父-未成年子女權利義務行使負擔資料檔")
    @XmlElement(name = "FatherXldfm05m", required = false)
    private XLDFM05M fatherXldfm05m;

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

    /** 權義負擔人母-未成年子女權利義務行使負擔資料檔 */
    @FieldName("權義負擔人母-未成年子女權利義務行使負擔資料檔")
    @XmlElement(name = "MotherXldfm05m", required = false)
    private XLDFM05M motherXldfm05m;

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

    /** 是否有其他廢止原因 */
    @XmlElement(name = "IsCancelOther", required = true)
    @FieldName("是否有其他廢止原因")
    private boolean isCancelOther;

    /**
     * 取得頁籤索引
     * 
     * @return 頁籤索引
     */
    public String getActiveIndex() {
        return activeIndex;
    }

    public XLDFApplicantDataDTO getApply1() {
        return apply1;
    }

    public XLDFApplicantDataDTO getApply2() {
        return apply2;
    }

    public XLDFPersonBriefDataDTO getDelegated() {
        return delegated;
    }

    public XldfefaplcType getEnforcedApplicant() {
        return enforcedApplicant;
    }

    public XLDFPersonDataDomainObject getFather() {
        return father;
    }

    public XLDFForeignPersonDTO getFatherForeignPerson() {
        return fatherForeignPerson;
    }

    public XLDFHouseholdDataDomainObject getFatherHousehold() {
        return fatherHousehold;
    }

    /**
     * 取得生父-補登個人基本資料
     * 
     * @return 生父-補登個人基本資料
     */
    public Tldf004mType getFatherMemoryPerson() {
        return fatherMemoryPerson;
    }

    public XLDFM05M getFatherXldfm05m() {
        return fatherXldfm05m;
    }

    public FineDTO getFineDTO() {
        return fineDTO;
    }

    public FineQueryDTO getFineQueryDTO() {
        return fineQueryDTO;
    }

    public XLDFForeignPersonDTO getForeignPerson() {
        return foreignPerson;
    }

    public XLDFPersonDataDomainObject getHouseholdHead() {
        return householdHead;
    }

    public List<XLDFHouseholdNoteDomainObject> getHouseholdNoteList() {
        return householdNoteList;
    }

    public XLDFPersonDataDomainObject getMother() {
        return mother;
    }

    public XLDFForeignPersonDTO getMotherForeignPerson() {
        return motherForeignPerson;
    }

    public XLDFHouseholdDataDomainObject getMotherHousehold() {
        return motherHousehold;
    }

    /**
     * 取得生母-補登個人基本資料
     * 
     * @return 生母-補登個人基本資料
     */
    public Tldf004mType getMotherMemoryPerson() {
        return motherMemoryPerson;
    }

    public XLDFM05M getMotherXldfm05m() {
        return motherXldfm05m;
    }

    public XLDFApplicantDataDTO getMustApply1() {
        return mustApply1;
    }

    public XLDFApplicantDataDTO getMustApply2() {
        return mustApply2;
    }

    public OpeningOperationDTO getOpeningOperationDTO() {
        return openingOperationDTO;
    }

    public XLDFPersonDataDomainObject getPerson() {
        return person;
    }

    public XLDFHouseholdDataDomainObject getPersonHousehold() {
        return personHousehold;
    }

    public List<XLDFPersonNoteDomainObject> getPersonNoteList() {
        return personNoteList;
    }

    public String getPersonRole() {
        return personRole;
    }

    public Rl01g22AppDataDTO getRl01g22AppData() {
        return rl01g22AppData;
    }

    public List<RlWarningMessage> getWarningMessgeList() {
        return warningMessgeList;
    }

    public boolean isCancelOther() {
        return isCancelOther;
    }

    /**
     * 取得初始化是否成功
     * 
     * @return 初始化是否成功
     */
    public boolean isInitSuccess() {
        return initSuccess;
    }

    public boolean isOther() {
        return isOther;
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

    public void setApply1(XLDFApplicantDataDTO apply1) {
        this.apply1 = apply1;
    }

    public void setApply2(XLDFApplicantDataDTO apply2) {
        this.apply2 = apply2;
    }

    public void setCancelOther(boolean isCancelOther) {
        this.isCancelOther = isCancelOther;
    }

    public void setDelegated(XLDFPersonBriefDataDTO delegated) {
        this.delegated = delegated;
    }

    public void setEnforcedApplicant(XldfefaplcType enforcedApplicant) {
        this.enforcedApplicant = enforcedApplicant;
    }

    public void setFather(XLDFPersonDataDomainObject father) {
        this.father = father;
    }

    public void setFatherForeignPerson(XLDFForeignPersonDTO fatherForeignPerson) {
        this.fatherForeignPerson = fatherForeignPerson;
    }

    public void setFatherHousehold(XLDFHouseholdDataDomainObject fatherHousehold) {
        this.fatherHousehold = fatherHousehold;
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

    public void setFatherXldfm05m(XLDFM05M fatherXldfm05m) {
        this.fatherXldfm05m = fatherXldfm05m;
    }

    public void setFineDTO(FineDTO fineDTO) {
        this.fineDTO = fineDTO;
    }

    public void setFineQueryDTO(FineQueryDTO fineQueryDTO) {
        this.fineQueryDTO = fineQueryDTO;
    }

    public void setForeignPerson(XLDFForeignPersonDTO foreignPerson) {
        this.foreignPerson = foreignPerson;
    }

    public void setHouseholdHead(XLDFPersonDataDomainObject householdHead) {
        this.householdHead = householdHead;
    }

    public void setHouseholdNoteList(List<XLDFHouseholdNoteDomainObject> householdNoteList) {
        this.householdNoteList = householdNoteList;
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

    public void setMother(XLDFPersonDataDomainObject mother) {
        this.mother = mother;
    }

    public void setMotherForeignPerson(XLDFForeignPersonDTO motherForeignPerson) {
        this.motherForeignPerson = motherForeignPerson;
    }

    public void setMotherHousehold(XLDFHouseholdDataDomainObject motherHousehold) {
        this.motherHousehold = motherHousehold;
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

    public void setMotherXldfm05m(XLDFM05M motherXldfm05m) {
        this.motherXldfm05m = motherXldfm05m;
    }

    public void setMustApply1(XLDFApplicantDataDTO mustApply1) {
        this.mustApply1 = mustApply1;
    }

    public void setMustApply2(XLDFApplicantDataDTO mustApply2) {
        this.mustApply2 = mustApply2;
    }

    public void setOpeningOperationDTO(OpeningOperationDTO openingOperationDTO) {
        this.openingOperationDTO = openingOperationDTO;
    }

    public void setOther(boolean isOther) {
        this.isOther = isOther;
    }

    public void setPerson(XLDFPersonDataDomainObject person) {
        this.person = person;
    }

    public void setPersonHousehold(XLDFHouseholdDataDomainObject personHousehold) {
        this.personHousehold = personHousehold;
    }

    public void setPersonNoteList(List<XLDFPersonNoteDomainObject> personNoteList) {
        this.personNoteList = personNoteList;
    }

    public void setPersonRole(String personRole) {
        this.personRole = personRole;
    }

    public void setRl01g22AppData(Rl01g22AppDataDTO rl01g22AppData) {
        this.rl01g22AppData = rl01g22AppData;
    }

    public void setWarningMessgeList(List<RlWarningMessage> warningMessgeList) {
        this.warningMessgeList = warningMessgeList;
    }

}

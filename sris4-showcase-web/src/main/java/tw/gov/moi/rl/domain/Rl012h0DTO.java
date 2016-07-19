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
import tw.gov.moi.domain.Rldfd009Type;
import tw.gov.moi.domain.XldfefaplcType;
import tw.gov.moi.rl.component.dto.OpeningOperationDTO;
import tw.gov.moi.rl.component.dto.XLDFDomainObject;
import tw.gov.moi.rl.component.xldf.dto.XLDF047M;
import tw.gov.moi.rl.domain.xldf.XLDFHouseholdDataDomainObject;
import tw.gov.moi.rl.domain.xldf.XLDFHouseholdNoteDomainObject;
import tw.gov.moi.rl.domain.xldf.XLDFPersonDataDomainObject;
import tw.gov.moi.rl.domain.xldf.XLDFPersonNoteDomainObject;

/**
 * 歸化國籍姓名羅馬拼音DTO
 * 
 * @author DAXIONG
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl012h0DTO", propOrder = { "nameRomanization", "openingOperationDTO", "warningMessgeList" })
@XmlRootElement(name = "Rl012h0DTO")
public class Rl012h0DTO implements Serializable {

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

    /** 當事人-姓名羅馬拼音 */
    @FieldName("當事人-姓名羅馬拼音")
    @XmlElement(name = "PersonXldf047m", required = false)
    private XLDF047M personXldf047m;

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

    /** 罰鍰資料 */
    @FieldName("罰鍰資料")
    @XmlElement(name = "FineDTO", required = false)
    private FineDTO fineDTO;

    /** 姓名羅馬拼音 */
    @FieldName("姓名羅馬拼音")
    @XmlElement(name = "NameRomanization", required = false)
    private String nameRomanization;

    /** 戶長統號 */
    @FieldName("戶長統號")
    @XmlElement(name = "HeadId", required = false)
    private String headId;

    /** 附繳證件 */
    @FieldName("附繳證件")
    @XmlElement(name = "CertificateList", required = false)
    private List<String> certificateList = new ArrayList<String>();

    /** 其他附繳證件 */
    @FieldName("其他附繳證件")
    @XmlElement(name = "OteherCertificate", required = false)
    private String otherCertificate;

    /** 適用法規依據 */
    @FieldName("適用法規依據")
    @XmlElement(name = "applyLaw", required = false)
    private String applyLaw;

    /** 當事人簿頁旗標 */
    @FieldName("當事人簿頁旗標")
    @XmlElement(name = "BookFlag", required = false)
    private String bookFlag;

    /** 收據號碼 */
    @FieldName("收據號碼")
    @XmlElement(name = "ReceiptId", required = false)
    private String receiptId;

    /** 警告訊息清單 */
    @XmlElement(name = "WarningMessgeList", required = true)
    @FieldName("警告訊息清單")
    private List<RlWarningMessage> warningMessgeList = new ArrayList<RlWarningMessage>();

    /** 是否可異地辦理 */
    @XmlElement(name = "CrossSiteEnabled", required = true)
    @FieldName("是否可異地辦理")
    private boolean crossSiteEnabled;

    /** 登記日期 */
    @FieldName("登記日期")
    @XmlElement(name = "RegisterDate", required = false)
    private String registerDate;

    /** 登記時間 */
    @FieldName("登記時間")
    @XmlElement(name = "RegisterTime", required = false)
    private String registerTime;

    /** 逕為登記旗標 */
    @FieldName("逕為登記旗標")
    @XmlElement(name = "EnforcedFlag", required = false)
    private String enforcedFlag;

    /** 受理地作業點代碼 */
    @FieldName("受理地作業點代碼")
    @XmlElement(name = "AcceptAdminOfficeCode", required = false)
    private String acceptAdminOfficeCode;

    /** 原住民身分代碼 */
    @FieldName("原住民身分代碼")
    @XmlElement(name = "LivingStyleCode", required = false)
    private String livingStyleCode;
    /** 登記類別 */
    @FieldName("登記類別")
    @XmlElement(name = "LivingStyle", required = false)
    private String livingStyle;

    /** 申請事由 */
    @FieldName("申請事由")
    @XmlElement(name = "ApplyReasonCode", required = false)
    private String applyReasonCode;

    /** 是否為異地 */
    @FieldName("是否為異地")
    @XmlElement(name = "IsRomet", required = false)
    private boolean isRomet;
    /** 最初申登日期 */
    @FieldName("最初申登日期")
    @XmlElement(name = "ApplyDate", required = false)
    private String applyDate;

    /** 申請書備註 */
    @FieldName("申請書備註")
    @XmlElement(name = "RegisterContent", required = false)
    private String registerContent;

    /** 姓名羅馬拼音 */
    @FieldName("原姓名羅馬拼音")
    @XmlElement(name = "OrgNameRomanization", required = false)
    private String orgNameRomanization;

    /** OperationCode */
    @FieldName("OperationCode")
    @XmlElement(name = "OperationCode", required = false)
    private String operationCode;

    /** 記事欄位化 */
    @FieldName("xldfy0xxmList")
    @XmlElement(name = "xldfy0xxmList", required = false)
    private List<XLDFDomainObject> xldfy0xxmList;

    // 罰鍰↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓
    @XmlElement(name = "CheckFine")
    @FieldName("進行逾期申報之罰鍰檢視")
    private boolean checkFine;

    @XmlElement(name = "LawDate")
    @FieldName("法定應申報日期")
    private String lawDate;

    @XmlElement(name = "punish")
    @FieldName("是否需要罰鍰")
    private boolean punish = Boolean.FALSE;

    @XmlElement(name = "ModifyToUnPunish")
    @FieldName("改為免罰")
    private boolean modifyToUnPunish;

    @XmlElement(name = "RemoveFeeReason")
    @FieldName("免罰原因")
    private String removeFeeReason;

    /** 罰緩參數. */
    @XmlElement(name = "FineParameterDTO")
    @FieldName("罰緩參數")
    private FineParameterDTO fineParameterDTO;

    @XmlElement(name = "FineReceiptId")
    @FieldName("收據號碼")
    private String fineReceiptId;

    @XmlElement(name = "FineList")
    @FieldName("罰鍰法令依據清單")
    private List<Rldfd009Type> fineList;

    @XmlElement(name = "FineAmount")
    @FieldName("罰鍰金額")
    private String fineAmount;

    @XmlElement(name = "FineSerialNumber")
    @FieldName("罰鍰裁處書識別序號")
    private String fineSerialNumber;

    // 罰鍰↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑

    public List<XLDFDomainObject> getXldfy0xxmList() {
        return xldfy0xxmList;
    }

    public String getFineReceiptId() {
        return fineReceiptId;
    }

    public void setFineReceiptId(String fineReceiptId) {
        this.fineReceiptId = fineReceiptId;
    }

    public List<Rldfd009Type> getFineList() {
        return fineList;
    }

    public void setFineList(List<Rldfd009Type> fineList) {
        this.fineList = fineList;
    }

    public String getFineAmount() {
        return fineAmount;
    }

    public void setFineAmount(String fineAmount) {
        this.fineAmount = fineAmount;
    }

    public String getFineSerialNumber() {
        return fineSerialNumber;
    }

    public void setFineSerialNumber(String fineSerialNumber) {
        this.fineSerialNumber = fineSerialNumber;
    }

    public boolean isCheckFine() {
        return checkFine;
    }

    public void setCheckFine(boolean checkFine) {
        this.checkFine = checkFine;
    }

    public String getLawDate() {
        return lawDate;
    }

    public void setLawDate(String lawDate) {
        this.lawDate = lawDate;
    }

    public boolean isPunish() {
        return punish;
    }

    public void setPunish(boolean punish) {
        this.punish = punish;
    }

    public boolean isModifyToUnPunish() {
        return modifyToUnPunish;
    }

    public void setModifyToUnPunish(boolean modifyToUnPunish) {
        this.modifyToUnPunish = modifyToUnPunish;
    }

    public String getRemoveFeeReason() {
        return removeFeeReason;
    }

    public void setRemoveFeeReason(String removeFeeReason) {
        this.removeFeeReason = removeFeeReason;
    }

    public FineParameterDTO getFineParameterDTO() {
        return fineParameterDTO;
    }

    public void setFineParameterDTO(FineParameterDTO fineParameterDTO) {
        this.fineParameterDTO = fineParameterDTO;
    }

    public void setXldfy0xxmList(List<XLDFDomainObject> xldfy0xxmList) {
        this.xldfy0xxmList = xldfy0xxmList;
    }

    public String getOrgNameRomanization() {
        return orgNameRomanization;
    }

    public void setOrgNameRomanization(String orgNameRomanization) {
        this.orgNameRomanization = orgNameRomanization;
    }

    public String getApplyDate() {
        return applyDate;
    }

    public void setApplyDate(String applyDate) {
        this.applyDate = applyDate;
    }

    public boolean isRomet() {
        return isRomet;
    }

    public String getRegisterContent() {
        return registerContent;
    }

    public void setRegisterContent(String registerContent) {
        this.registerContent = registerContent;
    }

    public void setRomet(boolean isRomet) {
        this.isRomet = isRomet;
    }

    public String getApplyReasonCode() {
        return applyReasonCode;
    }

    public void setApplyReasonCode(String applyReasonCode) {
        this.applyReasonCode = applyReasonCode;
    }

    public String getLivingStyle() {
        return livingStyle;
    }

    public void setLivingStyle(String livingStyle) {
        this.livingStyle = livingStyle;
    }

    public String getLivingStyleCode() {
        return livingStyleCode;
    }

    public void setLivingStyleCode(String livingStyleCode) {
        this.livingStyleCode = livingStyleCode;
    }

    public String getAcceptAdminOfficeCode() {
        return acceptAdminOfficeCode;
    }

    public void setAcceptAdminOfficeCode(String acceptAdminOfficeCode) {
        this.acceptAdminOfficeCode = acceptAdminOfficeCode;
    }

    public String getEnforcedFlag() {
        return enforcedFlag;
    }

    public void setEnforcedFlag(String enforcedFlag) {
        this.enforcedFlag = enforcedFlag;
    }

    public String getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(String registerDate) {
        this.registerDate = registerDate;
    }

    public String getRegisterTime() {
        return registerTime;
    }

    public void setRegisterTime(String registerTime) {
        this.registerTime = registerTime;
    }

    public List<RlWarningMessage> getWarningMessgeList() {
        return warningMessgeList;
    }

    public void setWarningMessgeList(List<RlWarningMessage> warningMessgeList) {
        this.warningMessgeList = warningMessgeList;
    }

    public boolean isCrossSiteEnabled() {
        return crossSiteEnabled;
    }

    public void setCrossSiteEnabled(boolean crossSiteEnabled) {
        this.crossSiteEnabled = crossSiteEnabled;
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

    public XLDF047M getPersonXldf047m() {
        return personXldf047m;
    }

    public void setPersonXldf047m(XLDF047M personXldf047m) {
        this.personXldf047m = personXldf047m;
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

    public FineDTO getFineDTO() {
        return fineDTO;
    }

    public void setFineDTO(FineDTO fineDTO) {
        this.fineDTO = fineDTO;
    }

    public String getNameRomanization() {
        return nameRomanization;
    }

    public void setNameRomanization(String nameRomanization) {
        this.nameRomanization = nameRomanization;
    }

    public String getHeadId() {
        return headId;
    }

    public void setHeadId(String headId) {
        this.headId = headId;
    }

    public List<String> getCertificateList() {
        return certificateList;
    }

    public void setCertificateList(List<String> certificateList) {
        this.certificateList = certificateList;
    }

    public String getOtherCertificate() {
        return otherCertificate;
    }

    public void setOtherCertificate(String otherCertificate) {
        this.otherCertificate = otherCertificate;
    }

    public String getApplyLaw() {
        return applyLaw;
    }

    public void setApplyLaw(String applyLaw) {
        this.applyLaw = applyLaw;
    }

    public String getBookFlag() {
        return bookFlag;
    }

    public void setBookFlag(String bookFlag) {
        this.bookFlag = bookFlag;
    }

    public String getReceiptId() {
        return receiptId;
    }

    public void setReceiptId(String receiptId) {
        this.receiptId = receiptId;
    }

    public String getOperationCode() {
        return operationCode;
    }

    public void setOperationCode(String operationCode) {
        this.operationCode = operationCode;
    }

}
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
import java.util.Map;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;
import tw.gov.moi.rl.component.dto.XLDFDomainObject;

/**
 * 死亡登記DTO.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl01220AppDataDTO", propOrder = { "registerDate", "registerTime", "registerContent", "enforcedFlag",
        "deathItem", "deathWay", "deathYyymmdd", "deathCountry", "otherDeathCountry", "deathPlace", "deathPlaceCode",
        "deathCause", "certificateList", "otherCertificate", "courtName", "sentenceDate", "sentenceNum",
        "sentenceWord", "returnId", "reportDate", "adDeathDate", "bookFlag", "spouseBookFlag", "householdHeadFlag",
        "householdMemberFlag", "hasSpouseFlag", "deathForeighFlag", "spouseForeignFlag", "spouseLiveFlag",
        "spouseMoveoutFlag", "spouseTempFlag", "sameHouseholdFlag", "concurrentFlag", "acceptAdminOfficeCode",
        "otherCertificateStatus", "orgEducationMark", "spOrgEducationMark", "doFineCheckFlag", "fineEventDate",
        "needFineFlag", "fineFreeFlag", "removeFeeReason", "receiptId", "spousePersonId", "spouseSiteId",
        "newMemberMap", "liveInOfficeFlag", "outliveCaseFlag", "rldf008mFlag", "personRemoveYyymmdd",
        "personRemoveTime", "spouseRemoveYyymmdd", "spouseRemoveTime", "rldf008mNum", "deathCertificateOrgCode",
        "deathCertificateOrg", "deathYyy", "deathMm", "deathDd", "previousDoFineCheckFlag", "previousFineEventDate",
        "showDeathData", "spouseRoleFlag", "personRoleFlag", "spRemoveYear", "spRemoveMonth", "spRemoveDay",
        "spRemoveHh", "spRemoveMm", "spRemoveSs", "sentenceType", "ifReport", "needChange", "responsibleForIdcard",
        "isBigHousehold", "isUpdate001M", "residentNum", "addSpouse5mFlag", "addSpouse5hFlag" })
@XmlRootElement(name = "Rl01220AppDataDTO", namespace = "http://tw.gov.moi/rl/domain")
public class Rl01220AppDataDTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1088432387086778636L;

    /** 登記日期. */
    @FieldName("登記日期")
    @XmlElement(name = "RegisterDate", required = false)
    private String registerDate;

    /** 登記時間. */
    @FieldName("登記時間")
    @XmlElement(name = "RegisterTime", required = false)
    private String registerTime;

    /** 備註. */
    @FieldName("備註")
    @XmlElement(name = "RegisterContent", required = false)
    private String registerContent;

    /** 逕為登記旗標 */
    @FieldName("逕為登記旗標")
    @XmlElement(name = "EnforcedFlag", required = false)
    private String enforcedFlag;

    /** 登記項目. */
    @FieldName("登記項目")
    @XmlElement(name = "DeathItem", required = false)
    private String deathItem;

    /** 死亡日期確定方式. */
    @FieldName("死亡日期確定方式")
    @XmlElement(name = "DeathWay", required = false)
    private String deathWay;

    /** 死亡日期. */
    @FieldName("死亡日期")
    @XmlElement(name = "DeathYyymmdd", required = false)
    private String deathYyymmdd;

    /** 死亡地點（國別）. */
    @FieldName("死亡地點（國別）")
    @XmlElement(name = "DeathCountry", required = false)
    private String deathCountry;

    /** 其他死亡地點（國別） */
    @FieldName("其他死亡地點（國別）")
    @XmlElement(name = "OtherDeathCountry", required = false)
    private String otherDeathCountry;

    /** 死亡地點(內容) */
    @FieldName("死亡地點(內容)")
    @XmlElement(name = "DeathPlace", required = false)
    private String deathPlace;

    /** 死亡地點性質代碼 */
    @FieldName("死亡地點性質代碼")
    @XmlElement(name = "DeathPlaceCode", required = false)
    private String deathPlaceCode;

    /** 死亡原因 */
    @FieldName("死亡原因")
    @XmlElement(name = "DeathCause", required = false)
    private String deathCause;

    /** 附繳證件 */
    @FieldName("附繳證件")
    @XmlElement(name = "CertificateList", required = false)
    private List<String> certificateList = new ArrayList<String>();

    /** 其他附繳證件. */
    @FieldName("其他附繳證件")
    @XmlElement(name = "OtherCertificate", required = false)
    private String otherCertificate;

    /** 判決法院名稱 */
    @FieldName("判決法院名稱")
    @XmlElement(name = "CourtName", required = false)
    private String courtName;

    /** 判決日期. */
    @FieldName("判決日期")
    @XmlElement(name = "SentenceDate", required = false)
    private String sentenceDate;

    /** 判決字. */
    @FieldName("判決字")
    @XmlElement(name = "SentenceNum", required = false)
    private String sentenceNum;

    /** 判決號. */
    @FieldName("判決號")
    @XmlElement(name = "SentenceWord", required = false)
    private String sentenceWord;

    /** 國民身分證繳回 */
    @FieldName("國民身分證繳回")
    @XmlElement(name = "ReturnId", required = false)
    private String returnId;

    /** 駐外館處通報日期 */
    @FieldName("駐外館處通報日期")
    @XmlElement(name = "ReportDate", required = false)
    private String reportDate;

    /** 國外死亡日期 */
    @FieldName("國外死亡日期")
    @XmlElement(name = "AdDeathDate", required = false)
    private String adDeathDate;

    /** 當事人簿頁旗標 */
    @FieldName("當事人簿頁旗標")
    @XmlElement(name = "BookFlag", required = false)
    private String bookFlag;

    /** 死亡者配偶簿頁旗標 */
    @FieldName("死亡者配偶簿頁旗標")
    @XmlElement(name = "SpouseBookFlag", required = false)
    private String spouseBookFlag;

    /** 死亡者是否為戶長 */
    @FieldName("死亡者是否為戶長")
    @XmlElement(name = "HouseholdHeadFlag", required = false)
    private Boolean householdHeadFlag;

    /** 死亡者是否為戶長且有戶下人口 */
    @FieldName("死亡者是否為戶長且有戶下人口")
    @XmlElement(name = "HouseholdMemberFlag", required = false)
    private Boolean householdMemberFlag;

    /** 死亡者是否有配偶 */
    @FieldName("死亡者是否有配偶")
    @XmlElement(name = "HasSpouseFlag", required = false)
    private Boolean hasSpouseFlag;

    /** 死亡者統號是否為外籍者. */
    @FieldName("死亡者統號是否為外籍者")
    @XmlElement(name = "DeathForeighFlag", required = false)
    private Boolean deathForeighFlag;

    /** 死亡者配偶是否為外籍者. */
    @FieldName("死亡者配偶是否為外籍者")
    @XmlElement(name = "SpouseForeignFlag", required = false)
    private Boolean spouseForeignFlag;

    /** 死亡者配偶是否為現住人口 */
    @FieldName("死亡者配偶是否為現住人口")
    @XmlElement(name = "SpouseLiveFlag", required = false)
    private Boolean spouseLiveFlag;

    /** 死亡者配偶是否為遷出國外 */
    @FieldName("死亡者配偶是否為遷出國外")
    @XmlElement(name = "SpouseMoveoutFlag", required = false)
    private Boolean spouseMoveoutFlag;

    /** 死亡者配偶是否為補登資料 */
    @FieldName("死亡者配偶是否為補登資料")
    @XmlElement(name = "SpouseTempFlag", required = false)
    private Boolean spouseTempFlag;

    /** 死亡者配偶是否為同戶 */
    @FieldName("死亡者配偶是否為同戶")
    @XmlElement(name = "SameHouseholdFlag", required = false)
    private Boolean sameHouseholdFlag;

    /** 僅餘兼任戶長旗標 */
    @FieldName("僅餘兼任戶長旗標")
    @XmlElement(name = "ConcurrentFlag", required = false)
    private Boolean concurrentFlag;

    /** 受理地戶所代碼 */
    @FieldName("受理地戶所代碼")
    @XmlElement(name = "AcceptAdminOfficeCode", required = false)
    private String acceptAdminOfficeCode;

    /** 其他附繳證件狀態 */
    @FieldName("其他附繳證件狀態 ")
    @XmlElement(name = "OtherCertificateStatus", required = false)
    private String otherCertificateStatus;

    /** 原教育程度註記 */
    @FieldName("原教育程度註記")
    @XmlElement(name = "OrgEducationMark", required = false)
    private String orgEducationMark;

    /** 配偶原教育程度註記 */
    @FieldName("配偶原教育程度註記")
    @XmlElement(name = "SpOrgEducationMark", required = false)
    private String spOrgEducationMark;

    /** 進行逾期申報之罰鍰檢視 */
    @FieldName("進行逾期申報之罰鍰檢視")
    @XmlElement(name = "DoFineCheckFlag", required = false)
    private String doFineCheckFlag;

    /** 判斷罰鍰之事件發生(確定)日期 */
    @FieldName("判斷罰鍰之事件發生(確定)日期")
    @XmlElement(name = "FineEventDate", required = false)
    private String fineEventDate;

    /** 判斷是否罰鍰旗標 */
    @FieldName("判斷是否罰鍰旗標")
    @XmlElement(name = "NeedFineFlag", required = false)
    private String needFineFlag;

    /** 免罰旗標 */
    @FieldName("免罰旗標")
    @XmlElement(name = "FineFreeFlag", required = false)
    private String fineFreeFlag;

    /** 免罰原因 */
    @FieldName("免罰原因")
    @XmlElement(name = "RemoveFeeReason", required = false)
    private String removeFeeReason;

    /** 收據號碼 */
    @FieldName("收據號碼")
    @XmlElement(name = "ReceiptId", required = false)
    private String receiptId;

    /** 死亡者配偶統號 */
    @FieldName("死亡者配偶統號")
    @XmlElement(name = "SpousePersonId", required = false)
    private String spousePersonId;

    /** 死亡者配偶作業點代碼 */
    @FieldName("死亡者配偶作業點代碼")
    @XmlElement(name = "SpouseSiteId", required = false)
    private String spouseSiteId;

    /** 死亡者配偶角色 */
    // @FieldName("死亡者配偶角色")
    // @XmlElement(name = "SpousePersonRole", required = false)
    // private String spousePersonRole;

    /** 新戶成員 */
    @FieldName("新戶成員")
    @XmlElement(name = "NewMemberMap", required = false)
    private Map<String, XLDFDomainObject> newMemberMap;

    /** 死亡者是否為逕遷戶所人口旗標. */
    @FieldName("死亡者是否為逕遷戶所人口旗標")
    @XmlElement(name = "LiveInOfficeFlag", required = false)
    private boolean liveInOfficeFlag = Boolean.FALSE;

    /** 非現住人口處理註記 */
    @FieldName("非現住人口處理註記")
    @XmlElement(name = "OutliveCaseFlag", required = false)
    private boolean outliveCaseFlag = false;

    /** 死亡者是否有死亡未辦登記之特殊人口資料 */
    @FieldName("死亡者是否有死亡未辦登記之特殊人口資料")
    @XmlElement(name = "Rldf008mFlag", required = false)
    private boolean rldf008mFlag = false;

    /** 死亡者除戶日期 */
    @FieldName("死亡者除戶日期")
    @XmlElement(name = "PersonRemoveYyymmdd", required = false)
    private String personRemoveYyymmdd = "";

    /** 死亡者除戶時間 */
    @FieldName("死亡者除戶時間")
    @XmlElement(name = "PersonRemoveTime", required = false)
    private String personRemoveTime = "";

    /** 配偶除戶日期 */
    @FieldName("配偶除戶日期")
    @XmlElement(name = "SpouseRemoveYyymmdd", required = false)
    private String spouseRemoveYyymmdd = "";

    /** 配偶除戶時間 */
    @FieldName("配偶除戶時間")
    @XmlElement(name = "SpouseRemoveTime", required = false)
    private String spouseRemoveTime = "";

    /** 8M筆數 */
    @FieldName("8M筆數")
    @XmlElement(name = "Rldf008mNum", required = false)
    private int rldf008mNum = 0;

    /** 死亡證明書開立單位代碼 */
    @FieldName("死亡證明書開立單位代碼")
    @XmlElement(name = "DeathCertificateOrgCode", required = false)
    private String deathCertificateOrgCode = "";

    /** 死亡證明書開立單位 */
    @FieldName("死亡證明書開立單位")
    @XmlElement(name = "DeathCertificateOrg", required = false)
    private String deathCertificateOrg = "";

    /** 死亡日期年 */
    @FieldName("死亡日期年")
    @XmlElement(name = "DeathYyy", required = false)
    private String deathYyy = "";

    /** 死亡日期月 */
    @FieldName("死亡日期月")
    @XmlElement(name = "DeathMm", required = false)
    private String deathMm = "";

    /** 死亡日期日 */
    @FieldName("死亡日期日")
    @XmlElement(name = "DeathDd", required = false)
    private String deathDd = "";

    /** 前一次資料驗證之是否進行逾期申報之罰鍰檢視旗標 */
    @XmlElement(name = "PreviousDoFineCheckFlag", required = true)
    @FieldName("前一次資料驗證之是否進行逾期申報之罰鍰檢視旗標")
    private String previousDoFineCheckFlag = "";

    /** 前一次資料驗證之事件發生(確定)日期 */
    @XmlElement(name = "PreviousFineEventDate", required = true)
    @FieldName("前一次資料驗證之事件發生(確定)日期")
    private String previousFineEventDate = "";

    /** 顯示死亡者資料. */
    @XmlElement(name = "ShowDeathData", required = true)
    @FieldName("顯示死亡者資料")
    private boolean showDeathData = true;

    /** 死亡者配偶身分角色. */
    @XmlElement(name = "SpouseRoleFlag", required = true)
    @FieldName("死亡者配偶身分角色")
    private String spouseRoleFlag = "";

    /** 死亡者身分角色. */
    @XmlElement(name = "PersonRoleFlag", required = true)
    @FieldName("死亡者身分角色")
    private String personRoleFlag = "";

    /** . */
    @XmlElement(name = "spRemoveYear", required = false)
    @FieldName("配偶除戶日期(年份)")
    private String spRemoveYear;

    /** 配偶除戶日期(月份). */
    @XmlElement(name = "SpRemoveMonth", required = false)
    @FieldName("配偶除戶日期(月份)")
    private String spRemoveMonth;

    /** 配偶除戶日期(日). */
    @XmlElement(name = "SpRemoveDay", required = false)
    @FieldName("配偶除戶日期(日)")
    private String spRemoveDay;

    /** 配偶除戶日期(時). */
    @XmlElement(name = "SpRemoveHh", required = false)
    @FieldName("配偶除戶日期(時)")
    private String spRemoveHh;

    /** 配偶除戶日期(分). */
    @XmlElement(name = "SpRemoveMm", required = false)
    @FieldName("配偶除戶日期(分)")
    private String spRemoveMm;

    /** 配偶除戶日期(秒). */
    @XmlElement(name = "SpRemoveSs", required = false)
    @FieldName("配偶除戶日期(秒)")
    private String spRemoveSs;

    /** 宣告類別. */
    @XmlElement(name = "SentenceType", required = false)
    @FieldName("宣告類別")
    private String sentenceType = "";

    /** 是否顯示駐外館處通報日期. */
    @XmlElement(name = "ShowReportDate", required = false)
    @FieldName("是否顯示駐外館處通報日期")
    private String ifReport = "";

    /** 是否顯示須換算日期. */
    @XmlElement(name = "ShowAdDeathDate", required = false)
    @FieldName("是否顯示須換算日期")
    private String needChange = "";

    /** 同意接受已截角之原證，並負保管責任. */
    @XmlElement(name = "ResponsibleForIdcard", required = false)
    @FieldName("同意接受已截角之原證，並負保管責任")
    private boolean responsibleForIdcard = false;

    /** 是否為大戶. */
    @XmlElement(name = "IsBigHousehold", required = false)
    @FieldName("是否為大戶")
    private boolean isBigHousehold = false;

    /** 是否更新全戶基本資料. */
    @XmlElement(name = "IsUpdate001M", required = false)
    @FieldName("是否更新全戶基本資料")
    private boolean isUpdate001M = false;

    /** 現住人口數. */
    @XmlElement(name = "ResidentNum", required = false)
    @FieldName("現住人口數")
    private int residentNum = 0;

    /** 配偶加5M註記. */
    @XmlElement(name = "AddSpouse5mFlag", required = false)
    @FieldName("配偶加5M註記")
    private boolean addSpouse5mFlag = false;

    /** 配偶加5H註記. */
    @XmlElement(name = "AddSpouse5hFlag", required = false)
    @FieldName("配偶加5H註記")
    private boolean addSpouse5hFlag = false;

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

    public String getRegisterContent() {
        return registerContent;
    }

    public void setRegisterContent(String registerContent) {
        this.registerContent = registerContent;
    }

    public String getEnforcedFlag() {
        return enforcedFlag;
    }

    public void setEnforcedFlag(String enforcedFlag) {
        this.enforcedFlag = enforcedFlag;
    }

    public String getDeathItem() {
        return deathItem;
    }

    public void setDeathItem(String deathItem) {
        this.deathItem = deathItem;
    }

    public String getDeathWay() {
        return deathWay;
    }

    public void setDeathWay(String deathWay) {
        this.deathWay = deathWay;
    }

    public String getDeathYyymmdd() {
        return deathYyymmdd;
    }

    public void setDeathYyymmdd(String deathYyymmdd) {
        this.deathYyymmdd = deathYyymmdd;
    }

    public String getDeathCountry() {
        return deathCountry;
    }

    public void setDeathCountry(String deathCountry) {
        this.deathCountry = deathCountry;
    }

    public String getOtherDeathCountry() {
        return otherDeathCountry;
    }

    public void setOtherDeathCountry(String otherDeathCountry) {
        this.otherDeathCountry = otherDeathCountry;
    }

    public String getDeathPlace() {
        return deathPlace;
    }

    public void setDeathPlace(String deathPlace) {
        this.deathPlace = deathPlace;
    }

    public String getDeathPlaceCode() {
        return deathPlaceCode;
    }

    public void setDeathPlaceCode(String deathPlaceCode) {
        this.deathPlaceCode = deathPlaceCode;
    }

    public String getDeathCause() {
        return deathCause;
    }

    public void setDeathCause(String deathCause) {
        this.deathCause = deathCause;
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

    public String getCourtName() {
        return courtName;
    }

    public void setCourtName(String courtName) {
        this.courtName = courtName;
    }

    public String getSentenceDate() {
        return sentenceDate;
    }

    public void setSentenceDate(String sentenceDate) {
        this.sentenceDate = sentenceDate;
    }

    public String getSentenceNum() {
        return sentenceNum;
    }

    public void setSentenceNum(String sentenceNum) {
        this.sentenceNum = sentenceNum;
    }

    public String getSentenceWord() {
        return sentenceWord;
    }

    public void setSentenceWord(String sentenceWord) {
        this.sentenceWord = sentenceWord;
    }

    public String getReturnId() {
        return returnId;
    }

    public void setReturnId(String returnId) {
        this.returnId = returnId;
    }

    public String getReportDate() {
        return reportDate;
    }

    public void setReportDate(String reportDate) {
        this.reportDate = reportDate;
    }

    public String getAdDeathDate() {
        return adDeathDate;
    }

    public void setAdDeathDate(String adDeathDate) {
        this.adDeathDate = adDeathDate;
    }

    public String getBookFlag() {
        return bookFlag;
    }

    public void setBookFlag(String bookFlag) {
        this.bookFlag = bookFlag;
    }

    public String getSpouseBookFlag() {
        return spouseBookFlag;
    }

    public void setSpouseBookFlag(String spouseBookFlag) {
        this.spouseBookFlag = spouseBookFlag;
    }

    public Boolean getHouseholdHeadFlag() {
        return householdHeadFlag;
    }

    public void setHouseholdHeadFlag(Boolean householdHeadFlag) {
        this.householdHeadFlag = householdHeadFlag;
    }

    public Boolean getHouseholdMemberFlag() {
        return householdMemberFlag;
    }

    public void setHouseholdMemberFlag(Boolean householdMemberFlag) {
        this.householdMemberFlag = householdMemberFlag;
    }

    public Boolean getHasSpouseFlag() {
        return hasSpouseFlag;
    }

    public void setHasSpouseFlag(Boolean hasSpouseFlag) {
        this.hasSpouseFlag = hasSpouseFlag;
    }

    public Boolean getDeathForeighFlag() {
        return deathForeighFlag;
    }

    public void setDeathForeighFlag(Boolean deathForeighFlag) {
        this.deathForeighFlag = deathForeighFlag;
    }

    public Boolean getSpouseForeignFlag() {
        return spouseForeignFlag;
    }

    public void setSpouseForeignFlag(Boolean spouseForeignFlag) {
        this.spouseForeignFlag = spouseForeignFlag;
    }

    public Boolean getSpouseLiveFlag() {
        return spouseLiveFlag;
    }

    public void setSpouseLiveFlag(Boolean spouseLiveFlag) {
        this.spouseLiveFlag = spouseLiveFlag;
    }

    public Boolean getSpouseMoveoutFlag() {
        return spouseMoveoutFlag;
    }

    public void setSpouseMoveoutFlag(Boolean spouseMoveoutFlag) {
        this.spouseMoveoutFlag = spouseMoveoutFlag;
    }

    public Boolean getSpouseTempFlag() {
        return spouseTempFlag;
    }

    public void setSpouseTempFlag(Boolean spouseTempFlag) {
        this.spouseTempFlag = spouseTempFlag;
    }

    public Boolean getSameHouseholdFlag() {
        return sameHouseholdFlag;
    }

    public void setSameHouseholdFlag(Boolean sameHouseholdFlag) {
        this.sameHouseholdFlag = sameHouseholdFlag;
    }

    public Boolean getConcurrentFlag() {
        return concurrentFlag;
    }

    public void setConcurrentFlag(Boolean concurrentFlag) {
        this.concurrentFlag = concurrentFlag;
    }

    public String getAcceptAdminOfficeCode() {
        return acceptAdminOfficeCode;
    }

    public void setAcceptAdminOfficeCode(String acceptAdminOfficeCode) {
        this.acceptAdminOfficeCode = acceptAdminOfficeCode;
    }

    public String getNeedFineFlag() {
        return needFineFlag;
    }

    public void setNeedFineFlag(String needFineFlag) {
        this.needFineFlag = needFineFlag;
    }

    public String getOtherCertificateStatus() {
        return otherCertificateStatus;
    }

    public void setOtherCertificateStatus(String otherCertificateStatus) {
        this.otherCertificateStatus = otherCertificateStatus;
    }

    public String getOrgEducationMark() {
        return orgEducationMark;
    }

    public void setOrgEducationMark(String orgEducationMark) {
        this.orgEducationMark = orgEducationMark;
    }

    public String getSpOrgEducationMark() {
        return spOrgEducationMark;
    }

    public void setSpOrgEducationMark(String spOrgEducationMark) {
        this.spOrgEducationMark = spOrgEducationMark;
    }

    public String getDoFineCheckFlag() {
        return doFineCheckFlag;
    }

    public void setDoFineCheckFlag(String doFineCheckFlag) {
        this.doFineCheckFlag = doFineCheckFlag;
    }

    public String getFineEventDate() {
        return fineEventDate;
    }

    public void setFineEventDate(String fineEventDate) {
        this.fineEventDate = fineEventDate;
    }

    public String getFineFreeFlag() {
        return fineFreeFlag;
    }

    public void setFineFreeFlag(String fineFreeFlag) {
        this.fineFreeFlag = fineFreeFlag;
    }

    public String getRemoveFeeReason() {
        return removeFeeReason;
    }

    public void setRemoveFeeReason(String removeFeeReason) {
        this.removeFeeReason = removeFeeReason;
    }

    public String getReceiptId() {
        return receiptId;
    }

    public void setReceiptId(String receiptId) {
        this.receiptId = receiptId;
    }

    public String getSpousePersonId() {
        return spousePersonId;
    }

    public void setSpousePersonId(String spousePersonId) {
        this.spousePersonId = spousePersonId;
    }

    public String getSpouseSiteId() {
        return spouseSiteId;
    }

    public void setSpouseSiteId(String spouseSiteId) {
        this.spouseSiteId = spouseSiteId;
    }

    // public String getSpousePersonRole() {
    // return spousePersonRole;
    // }
    //
    // public void setSpousePersonRole(String spousePersonRole) {
    // this.spousePersonRole = spousePersonRole;
    // }

    public Map<String, XLDFDomainObject> getNewMemberMap() {
        return newMemberMap;
    }

    public void setNewMemberMap(Map<String, XLDFDomainObject> newMemberMap) {
        this.newMemberMap = newMemberMap;
    }

    public boolean isLiveInOfficeFlag() {
        return liveInOfficeFlag;
    }

    public void setLiveInOfficeFlag(boolean liveInOfficeFlag) {
        this.liveInOfficeFlag = liveInOfficeFlag;
    }

    public String getPersonRemoveYyymmdd() {
        return personRemoveYyymmdd;
    }

    public void setPersonRemoveYyymmdd(String personRemoveYyymmdd) {
        this.personRemoveYyymmdd = personRemoveYyymmdd;
    }

    public String getPersonRemoveTime() {
        return personRemoveTime;
    }

    public void setPersonRemoveTime(String personRemoveTime) {
        this.personRemoveTime = personRemoveTime;
    }

    public String getSpouseRemoveYyymmdd() {
        return spouseRemoveYyymmdd;
    }

    public void setSpouseRemoveYyymmdd(String spouseRemoveYyymmdd) {
        this.spouseRemoveYyymmdd = spouseRemoveYyymmdd;
    }

    public String getSpouseRemoveTime() {
        return spouseRemoveTime;
    }

    public void setSpouseRemoveTime(String spouseRemoveTime) {
        this.spouseRemoveTime = spouseRemoveTime;
    }

    public int getRldf008mNum() {
        return rldf008mNum;
    }

    public void setRldf008mNum(int rldf008mNum) {
        this.rldf008mNum = rldf008mNum;
    }

    public boolean isOutliveCaseFlag() {
        return outliveCaseFlag;
    }

    public void setOutliveCaseFlag(boolean outliveCaseFlag) {
        this.outliveCaseFlag = outliveCaseFlag;
    }

    public boolean isRldf008mFlag() {
        return rldf008mFlag;
    }

    public void setRldf008mFlag(boolean rldf008mFlag) {
        this.rldf008mFlag = rldf008mFlag;
    }

    public String getDeathCertificateOrgCode() {
        return deathCertificateOrgCode;
    }

    public void setDeathCertificateOrgCode(String deathCertificateOrgCode) {
        this.deathCertificateOrgCode = deathCertificateOrgCode;
    }

    public String getDeathCertificateOrg() {
        return deathCertificateOrg;
    }

    public void setDeathCertificateOrg(String deathCertificateOrg) {
        this.deathCertificateOrg = deathCertificateOrg;
    }

    public String getDeathYyy() {
        return deathYyy;
    }

    public void setDeathYyy(String deathYyy) {
        this.deathYyy = deathYyy;
    }

    public String getDeathMm() {
        return deathMm;
    }

    public void setDeathMm(String deathMm) {
        this.deathMm = deathMm;
    }

    public String getDeathDd() {
        return deathDd;
    }

    public void setDeathDd(String deathDd) {
        this.deathDd = deathDd;
    }

    public String getPreviousDoFineCheckFlag() {
        return previousDoFineCheckFlag;
    }

    public void setPreviousDoFineCheckFlag(String previousDoFineCheckFlag) {
        this.previousDoFineCheckFlag = previousDoFineCheckFlag;
    }

    public String getPreviousFineEventDate() {
        return previousFineEventDate;
    }

    public void setPreviousFineEventDate(String previousFineEventDate) {
        this.previousFineEventDate = previousFineEventDate;
    }

    public boolean isShowDeathData() {
        return showDeathData;
    }

    public void setShowDeathData(boolean showDeathData) {
        this.showDeathData = showDeathData;
    }

    public String getSpouseRoleFlag() {
        return spouseRoleFlag;
    }

    public void setSpouseRoleFlag(String spouseRoleFlag) {
        this.spouseRoleFlag = spouseRoleFlag;
    }

    public String getPersonRoleFlag() {
        return personRoleFlag;
    }

    public void setPersonRoleFlag(String personRoleFlag) {
        this.personRoleFlag = personRoleFlag;
    }

    public String getSpRemoveYear() {
        return spRemoveYear;
    }

    public void setSpRemoveYear(String spRemoveYear) {
        this.spRemoveYear = spRemoveYear;
    }

    public String getSpRemoveMonth() {
        return spRemoveMonth;
    }

    public void setSpRemoveMonth(String spRemoveMonth) {
        this.spRemoveMonth = spRemoveMonth;
    }

    public String getSpRemoveDay() {
        return spRemoveDay;
    }

    public void setSpRemoveDay(String spRemoveDay) {
        this.spRemoveDay = spRemoveDay;
    }

    public String getSpRemoveHh() {
        return spRemoveHh;
    }

    public void setSpRemoveHh(String spRemoveHh) {
        this.spRemoveHh = spRemoveHh;
    }

    public String getSpRemoveMm() {
        return spRemoveMm;
    }

    public void setSpRemoveMm(String spRemoveMm) {
        this.spRemoveMm = spRemoveMm;
    }

    public String getSpRemoveSs() {
        return spRemoveSs;
    }

    public void setSpRemoveSs(String spRemoveSs) {
        this.spRemoveSs = spRemoveSs;
    }

    public String getSentenceType() {
        return sentenceType;
    }

    public void setSentenceType(String sentenceType) {
        this.sentenceType = sentenceType;
    }

    public String getIfReport() {
        return ifReport;
    }

    public void setIfReport(String ifReport) {
        this.ifReport = ifReport;
    }

    public String getNeedChange() {
        return needChange;
    }

    public void setNeedChange(String needChange) {
        this.needChange = needChange;
    }

    public boolean isResponsibleForIdcard() {
        return responsibleForIdcard;
    }

    public void setResponsibleForIdcard(boolean responsibleForIdcard) {
        this.responsibleForIdcard = responsibleForIdcard;
    }

    public boolean isBigHousehold() {
        return isBigHousehold;
    }

    public void setBigHousehold(boolean isBigHousehold) {
        this.isBigHousehold = isBigHousehold;
    }

    public boolean isUpdate001M() {
        return isUpdate001M;
    }

    public void setUpdate001M(boolean isUpdate001M) {
        this.isUpdate001M = isUpdate001M;
    }

    public int getResidentNum() {
        return residentNum;
    }

    public void setResidentNum(int residentNum) {
        this.residentNum = residentNum;
    }

    public boolean isAddSpouse5mFlag() {
        return addSpouse5mFlag;
    }

    public void setAddSpouse5mFlag(boolean addSpouse5mFlag) {
        this.addSpouse5mFlag = addSpouse5mFlag;
    }

    public boolean isAddSpouse5hFlag() {
        return addSpouse5hFlag;
    }

    public void setAddSpouse5hFlag(boolean addSpouse5hFlag) {
        this.addSpouse5hFlag = addSpouse5hFlag;
    }
}

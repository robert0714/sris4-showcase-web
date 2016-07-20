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
import tw.gov.moi.rl.component.xldf.dto.XLDF030T;
import tw.gov.moi.rl.component.xldf.dto.XLDFM11M;
import tw.gov.moi.rl.domain.xldf.XLDFHouseholdDataDomainObject;
import tw.gov.moi.rl.domain.xldf.XLDFHouseholdNoteDomainObject;
import tw.gov.moi.rl.domain.xldf.XLDFPersonDataDomainObject;
import tw.gov.moi.rl.domain.xldf.XLDFPersonNoteDomainObject;

/**
 * 姓名更正登記DTO.
 * 
 * @author DAXIONG
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl0171dDTO", propOrder = { "lockMode", "mainPersonHouseholdData", "mainPersonData", "mainPersonRole",
        "mainPersonSiteId", "mainPersonBookFlag", "mainPersonOrgEducationMark", "mainPersonForeignPersonData",
        "householdHead", "personXldfm11m", "relationDataList", "sameHouseholdChildren", "xldf030mList", "xldf030tList",
        "beforePersonName", "beforeLastName", "beforeFirstName", "beforeMidenName", "beforeMarriedName",
        "afterPersonName", "afterLastName", "afterFirstName", "afterMidenName", "afterMarriedName", "nameWay",
        "updateReasonCode", "updateYyymmdd", "lawCode", "nameWayShow", "spouseRl03100QueryShow", "certificate",
        "certificateList", "otherCertificate", "registerContent", "apply1", "apply2", "delegated", "householdNoteList",
        "personNoteList", "previousDoFineCheckFlag", "previousFineEventDate", "receiptId", "doFineCheckFlag",
        "fineEventDate", "needFineFlag", "fineFreeFlag", "removeFeeReason", "fineDTO", "deleteFineDTOFlag",
        "finePerson", "systemDate", "systemTime", "openingOperationDTO", "warningMessgeList", "crossSiteEnabled",
        "enforcedFlag", "outliveCase", "enforcedApplicant", "acceptAdminOfficeCode", "otherCertificateCode",
        "otherCertificateShow", "saveButtonShow", "fineButtonShow", "doFineCheckFlagOpen", "transactionId",
        "applySequenceId", "applySeq", "applyCaseNo", "operationCode", "initSuccess", "activeIndex",
        "styleForPersonId", "styleForSiteId", "ellipsisStyleForFirstName", "ellipsisStyleForLastName",
        "ellipsisStyleForPersonName" })
@XmlRootElement(name = "Rl0171dDTO")
public class Rl0171dDTO implements Serializable {

    /** 序列版本編號. */
    private static final long serialVersionUID = 1L;

    /** 鎖定頁面元件. */
    @XmlElement(name = "LockMode", required = true)
    @FieldName("鎖定頁面元件")
    private boolean lockMode;

    /** 當事人-全戶基本資料. */
    @XmlElement(name = "MainPersonHouseholdData", required = true)
    @FieldName("當事人-全戶基本資料")
    private XLDFHouseholdDataDomainObject mainPersonHouseholdData;

    /** 當事人-個人基本資料. */
    @XmlElement(name = "MainPersonData", required = true)
    @FieldName("當事人-個人基本資料")
    private XLDFPersonDataDomainObject mainPersonData;

    /** 當事人-身分角色. */
    @XmlElement(name = "MainPersonRole", required = true)
    @FieldName("當事人-身分角色")
    private String mainPersonRole;

    /** 當事人-作業點代碼. */
    @XmlElement(name = "MainPersonSiteId", required = true)
    @FieldName("當事人-作業點代碼")
    private String mainPersonSiteId;

    /** 當事人-簿頁旗標. */
    @XmlElement(name = "MainPersonBookFlag", required = true)
    @FieldName("當事人-簿頁旗標")
    private String mainPersonBookFlag;

    /** 當事人-原教育程度註記. */
    @XmlElement(name = "MainPersonOrgEducationMark", required = true)
    @FieldName("當事人-原教育程度註記")
    private String mainPersonOrgEducationMark;

    /** 當事人-外籍者資料. */
    @XmlElement(name = "MainPersonForeignPersonData", required = true)
    @FieldName("當事人-外籍者資料")
    private XLDFForeignPersonDTO mainPersonForeignPersonData = new XLDFForeignPersonDTO();

    /** 戶長-個人基本資料. */
    @XmlElement(name = "HouseholdHead", required = true)
    @FieldName("戶長-個人基本資料")
    private XLDFPersonDataDomainObject householdHead;

    /** 當事人XLDFM11M資料. */
    @XmlElement(name = "PersonXldfm11m", required = true)
    @FieldName("當事人XLDFM11M資料")
    private XLDFM11M personXldfm11m = new XLDFM11M();

    /** 關係人清單. */
    @XmlElement(name = "RelationDataList", required = true)
    @FieldName("關係人清單")
    private List<RelationData> relationDataList = new ArrayList<RelationData>();

    /** 同戶內是否有子女. */
    @XmlElement(name = "SameHouseholdChildren", required = true)
    @FieldName("同戶內是否有子女")
    private boolean sameHouseholdChildren;

    /** 所內記事清單. */
    @XmlElement(name = "Xldf030mList", required = true)
    @FieldName("所內記事清單")
    private List<XLDF030T> xldf030mList = new ArrayList<XLDF030T>();

    /** 行政協助清單. */
    @XmlElement(name = "Xldf030tList", required = true)
    @FieldName("行政協助清單")
    private List<XLDF030T> xldf030tList = new ArrayList<XLDF030T>();

    /** 原姓名. */
    @XmlElement(name = "BeforePersonName", required = true)
    @FieldName("原姓名")
    private String beforePersonName;

    /** 原姓. */
    @XmlElement(name = "BeforeLastName", required = true)
    @FieldName("原姓")
    private String beforeLastName;

    /** 原名. */
    @XmlElement(name = "BeforeFirstName", required = true)
    @FieldName("原名")
    private String beforeFirstName;

    /** 原本姓. */
    @XmlElement(name = "BeforeMidenName", required = true)
    @FieldName("原本姓")
    private String beforeMidenName;

    /** 原冠姓. */
    @XmlElement(name = "BeforeMarriedName", required = true)
    @FieldName("原冠姓")
    private String beforeMarriedName;

    /** 新姓名. */
    @XmlElement(name = "AfterPersonName", required = true)
    @FieldName("新姓名")
    private String afterPersonName;

    /** 新姓. */
    @XmlElement(name = "AfterLastName", required = true)
    @FieldName("新姓")
    private String afterLastName;

    /** 新名. */
    @XmlElement(name = "AfterFirstName", required = true)
    @FieldName("新名")
    private String afterFirstName;

    /** 新本姓. */
    @XmlElement(name = "AfterMidenName", required = true)
    @FieldName("新本姓")
    private String afterMidenName;

    /** 新冠姓. */
    @XmlElement(name = "AfterMarriedName", required = true)
    @FieldName("新冠姓")
    private String afterMarriedName;

    /** 從姓方式代碼. */
    @XmlElement(name = "NameWay", required = true)
    @FieldName("從姓方式代碼")
    private String nameWay;

    /** 更正原因代碼. */
    @XmlElement(name = "UpdateReasonCode", required = true)
    @FieldName("更正原因代碼")
    private String updateReasonCode;

    /** 更正日期. */
    @XmlElement(name = "UpdateYyymmdd", required = true)
    @FieldName("更正日期")
    private String updateYyymmdd;

    /** 引用法條代碼. */
    @XmlElement(name = "LawCode", required = true)
    @FieldName("引用法條代碼")
    private String lawCode;

    /** 從姓方式是否顯示. */
    @XmlElement(name = "NameWayShow", required = true)
    @FieldName("從姓方式是否顯示")
    private boolean nameWayShow;

    /** 配偶明細戶籍資料查詢是否顯示. */
    @XmlElement(name = "SpouseRl03100QueryShow", required = true)
    @FieldName("配偶明細戶籍資料查詢是否顯示")
    private boolean spouseRl03100QueryShow;

    /** 附繳證件代碼檔名. */
    @XmlElement(name = "Certificate", required = true)
    @FieldName("附繳證件代碼檔名")
    private String certificate;

    /** 附繳證件. */
    @XmlElement(name = "CertificateList", required = true)
    @FieldName("附繳證件")
    private List<String> certificateList = new ArrayList<String>();

    /** 其他附繳證件. */
    @XmlElement(name = "OtherCertificate", required = true)
    @FieldName("其他附繳證件")
    private String otherCertificate;

    /** 備註. */
    @XmlElement(name = "RegisterContent", required = true)
    @FieldName("備註")
    private String registerContent;

    /** 申請人1. */
    @XmlElement(name = "Apply1", required = true)
    @FieldName("申請人1")
    private XLDFApplicantDataDTO apply1 = new XLDFApplicantDataDTO();

    /** 申請人2. */
    @XmlElement(name = "Apply2", required = true)
    @FieldName("申請人2")
    private XLDFApplicantDataDTO apply2 = new XLDFApplicantDataDTO();

    /** 受委託人. */
    @XmlElement(name = "Delegated", required = true)
    @FieldName("受委託人")
    private XLDFPersonBriefDataDTO delegated = new XLDFPersonBriefDataDTO();

    /** 全戶記事清單. */
    @XmlElement(name = "HouseholdNoteList", required = true)
    @FieldName("全戶記事清單")
    private List<XLDFHouseholdNoteDomainObject> householdNoteList = new ArrayList<XLDFHouseholdNoteDomainObject>();

    /** 個人記事清單. */
    @XmlElement(name = "PersonNoteList", required = true)
    @FieldName("個人記事清單")
    private List<XLDFPersonNoteDomainObject> personNoteList = new ArrayList<XLDFPersonNoteDomainObject>();

    /** 前一次資料驗證之是否進行逾期申報之罰鍰檢視旗標. */
    @XmlElement(name = "PreviousDoFineCheckFlag", required = true)
    @FieldName("前一次資料驗證之是否進行逾期申報之罰鍰檢視旗標")
    private boolean previousDoFineCheckFlag;

    /** 前一次資料驗證之事件發生(確定)日期. */
    @XmlElement(name = "PreviousFineEventDate", required = true)
    @FieldName("前一次資料驗證之事件發生(確定)日期")
    private String previousFineEventDate;

    /** 收據號碼. */
    @XmlElement(name = "ReceiptId", required = true)
    @FieldName("收據號碼")
    private String receiptId;

    /** 是否進行逾期申報之罰鍰檢視旗標. */
    @XmlElement(name = "DoFineCheckFlag", required = true)
    @FieldName("是否進行逾期申報之罰鍰檢視旗標")
    private boolean doFineCheckFlag;

    /** 事件發生(確定)日期. */
    @XmlElement(name = "FineEventDate", required = true)
    @FieldName("事件發生(確定)日期")
    private String fineEventDate;

    /** 判斷是否罰鍰旗標. */
    @XmlElement(name = "NeedFineFlag", required = true)
    @FieldName("判斷是否罰鍰旗標")
    private String needFineFlag;

    /** 免罰旗標. */
    @XmlElement(name = "FineFreeFlag", required = true)
    @FieldName("免罰旗標")
    private boolean fineFreeFlag;

    /** 免罰原因. */
    @XmlElement(name = "RemoveFeeReason", required = true)
    @FieldName("免罰原因")
    private String removeFeeReason;

    /** 罰鍰處理資料. */
    @XmlElement(name = "FineDTO", required = true)
    @FieldName("罰鍰處理資料")
    private FineDTO fineDTO = new FineDTO();

    /** 刪除罰鍰處理資料旗標. */
    @XmlElement(name = "DeleteFineDTOFlag", required = true)
    @FieldName("刪除罰鍰處理資料旗標")
    private boolean deleteFineDTOFlag;

    /** 受處分人. */
    @XmlElement(name = "FinePerson", required = true)
    @FieldName("受處分人")
    private XLDFApplicantDataDTO finePerson = new XLDFApplicantDataDTO();

    /** 系統日期. */
    @XmlElement(name = "SystemDate", required = true)
    @FieldName("系統日期")
    private String systemDate;

    /** 系統時間. */
    @XmlElement(name = "SystemTime", required = true)
    @FieldName("系統時間")
    private String systemTime;

    /** 大簿控制各作業之資訊. */
    @XmlElement(name = "OpeningOperationDTO", required = true)
    @FieldName("大簿控制各作業之資訊")
    private OpeningOperationDTO openingOperationDTO;

    /** 警告訊息清單. */
    @XmlElement(name = "WarningMessgeList", required = true)
    @FieldName("警告訊息清單")
    private List<RlWarningMessage> warningMessgeList = new ArrayList<RlWarningMessage>();

    /** 是否可異地辦理. */
    @XmlElement(name = "CrossSiteEnabled", required = true)
    @FieldName("是否可異地辦理")
    private boolean crossSiteEnabled;

    /** 逕為登記旗標. */
    @XmlElement(name = "EnforcedFlag", required = true)
    @FieldName("逕為登記旗標")
    private boolean enforcedFlag;

    /** 是否開放除戶簿頁(當事人). */
    @XmlElement(name = "OutliveCase", required = true)
    @FieldName("是否開放除戶簿頁(當事人)")
    private boolean outliveCase;

    /** 逕為登記申請人. */
    @XmlElement(name = "EnforcedApplicant", required = true)
    @FieldName("逕為登記申請人")
    private XldfefaplcType enforcedApplicant;

    /** 受理地戶所代碼. */
    @XmlElement(name = "AcceptAdminOfficeCode", required = true)
    @FieldName("受理地戶所代碼")
    private String acceptAdminOfficeCode;

    /** 其他附繳證件代碼. */
    @XmlElement(name = "OtherCertificateCode", required = true)
    @FieldName("其他附繳證件代碼")
    private String otherCertificateCode;

    /** 其他附繳證件是否顯示. */
    @XmlElement(name = "OtherCertificateShow", required = true)
    @FieldName("其他附繳證件是否顯示")
    private boolean otherCertificateShow;

    /** 暫存按鈕是否顯示. */
    @XmlElement(name = "SaveButtonShow", required = true)
    @FieldName("暫存按鈕是否顯示")
    private boolean saveButtonShow;

    /** 罰鍰處理按鈕是否顯示. */
    @XmlElement(name = "FineButtonShow", required = true)
    @FieldName("罰鍰處理按鈕是否顯示")
    private boolean fineButtonShow;

    /** 進行逾期申報之罰鍰檢視核取方塊是否開放. */
    @XmlElement(name = "DoFineCheckFlagOpen", required = true)
    @FieldName("進行逾期申報之罰鍰檢視核取方塊是否開放")
    private boolean doFineCheckFlagOpen;

    /** 交易序號. */
    @XmlElement(name = "TransactionId", required = true)
    @FieldName("交易序號")
    private String transactionId;

    /** 作業順序編號. */
    @XmlElement(name = "ApplySequenceId", required = true)
    @FieldName("作業順序編號")
    private String applySequenceId;

    /** 申請書流水號. */
    @XmlElement(name = "ApplySeq", required = true)
    @FieldName("申請書流水號")
    private String applySeq;

    /** 申登案別. */
    @XmlElement(name = "ApplyCaseNo", required = true)
    @FieldName("申登案別")
    private String applyCaseNo;

    /** 作業代碼. */
    @XmlElement(name = "OperationCode", required = true)
    @FieldName("作業代碼")
    private String operationCode;

    /** 初始化是否成功. */
    @XmlElement(name = "InitSuccess", required = true)
    @FieldName("初始化是否成功")
    private boolean initSuccess;

    /** 頁籤索引. */
    @XmlElement(name = "ActiveIndex", required = true)
    @FieldName("頁籤索引")
    private String activeIndex;

    /** 統號樣式. */
    @XmlElement(name = "StyleForPersonId", required = true)
    @FieldName("統號樣式")
    private String styleForPersonId;

    /** 作業點樣式. */
    @XmlElement(name = "StyleForSiteId", required = true)
    @FieldName("作業點樣式")
    private String styleForSiteId;

    /** 省略元件樣式(名). */
    @XmlElement(name = "EllipsisStyleForFirstName", required = true)
    @FieldName("省略元件樣式(名)")
    private String ellipsisStyleForFirstName;

    /** 省略元件樣式(姓). */
    @XmlElement(name = "EllipsisStyleForLastName", required = true)
    @FieldName("省略元件樣式(姓)")
    private String ellipsisStyleForLastName;

    /** 省略元件樣式(姓名). */
    @XmlElement(name = "EllipsisStyleForPersonName", required = true)
    @FieldName("省略元件樣式(姓名)")
    private String ellipsisStyleForPersonName;

    /**
     * 取得鎖定頁面元件.
     * 
     * @return 鎖定頁面元件
     */
    public boolean isLockMode() {
        return lockMode;
    }

    /**
     * 設定鎖定頁面元件.
     * 
     * @param lockMode
     *            鎖定頁面元件
     */
    public void setLockMode(final boolean lockMode) {
        this.lockMode = lockMode;
    }

    /**
     * 取得當事人-全戶基本資料.
     * 
     * @return 當事人-全戶基本資料
     */
    public XLDFHouseholdDataDomainObject getMainPersonHouseholdData() {
        return mainPersonHouseholdData;
    }

    /**
     * 設定當事人-全戶基本資料.
     * 
     * @param mainPersonHouseholdData
     *            當事人-全戶基本資料
     */
    public void setMainPersonHouseholdData(final XLDFHouseholdDataDomainObject mainPersonHouseholdData) {
        this.mainPersonHouseholdData = mainPersonHouseholdData;
    }

    /**
     * 取得當事人-個人基本資料.
     * 
     * @return 當事人-個人基本資料
     */
    public XLDFPersonDataDomainObject getMainPersonData() {
        return mainPersonData;
    }

    /**
     * 設定當事人-個人基本資料.
     * 
     * @param mainPersonData
     *            當事人-個人基本資料
     */
    public void setMainPersonData(final XLDFPersonDataDomainObject mainPersonData) {
        this.mainPersonData = mainPersonData;
    }

    /**
     * 取得當事人-身分角色.
     * 
     * @return 當事人-身分角色
     */
    public String getMainPersonRole() {
        return mainPersonRole;
    }

    /**
     * 設定當事人-身分角色.
     * 
     * @param mainPersonRole
     *            當事人-身分角色
     */
    public void setMainPersonRole(final String mainPersonRole) {
        this.mainPersonRole = mainPersonRole;
    }

    /**
     * 取得當事人-作業點代碼.
     * 
     * @return 當事人-作業點代碼
     */
    public String getMainPersonSiteId() {
        return mainPersonSiteId;
    }

    /**
     * 設定當事人-作業點代碼.
     * 
     * @param mainPersonSiteId
     *            當事人-作業點代碼
     */
    public void setMainPersonSiteId(final String mainPersonSiteId) {
        this.mainPersonSiteId = mainPersonSiteId;
    }

    /**
     * 取得當事人-簿頁旗標.
     * 
     * @return 當事人-簿頁旗標
     */
    public String getMainPersonBookFlag() {
        return mainPersonBookFlag;
    }

    /**
     * 設定當事人-簿頁旗標.
     * 
     * @param mainPersonBookFlag
     *            當事人-簿頁旗標
     */
    public void setMainPersonBookFlag(final String mainPersonBookFlag) {
        this.mainPersonBookFlag = mainPersonBookFlag;
    }

    /**
     * 取得當事人-原教育程度註記.
     * 
     * @return 當事人-原教育程度註記
     */
    public String getMainPersonOrgEducationMark() {
        return mainPersonOrgEducationMark;
    }

    /**
     * 設定當事人-原教育程度註記.
     * 
     * @param mainPersonOrgEducationMark
     *            當事人-原教育程度註記
     */
    public void setMainPersonOrgEducationMark(final String mainPersonOrgEducationMark) {
        this.mainPersonOrgEducationMark = mainPersonOrgEducationMark;
    }

    /**
     * 取得當事人-外籍者資料.
     * 
     * @return 當事人-外籍者資料
     */
    public XLDFForeignPersonDTO getMainPersonForeignPersonData() {
        return mainPersonForeignPersonData;
    }

    /**
     * 設定當事人-外籍者資料.
     * 
     * @param mainPersonForeignPersonData
     *            當事人-外籍者資料
     */
    public void setMainPersonForeignPersonData(final XLDFForeignPersonDTO mainPersonForeignPersonData) {
        this.mainPersonForeignPersonData = mainPersonForeignPersonData;
    }

    /**
     * 取得戶長-個人基本資料.
     * 
     * @return 戶長-個人基本資料
     */
    public XLDFPersonDataDomainObject getHouseholdHead() {
        return householdHead;
    }

    /**
     * 設定戶長-個人基本資料.
     * 
     * @param householdHead
     *            戶長-個人基本資料
     */
    public void setHouseholdHead(final XLDFPersonDataDomainObject householdHead) {
        this.householdHead = householdHead;
    }

    /**
     * 取得當事人XLDFM11M資料.
     * 
     * @return 當事人XLDFM11M資料
     */
    public XLDFM11M getPersonXldfm11m() {
        return personXldfm11m;
    }

    /**
     * 設定當事人XLDFM11M資料.
     * 
     * @param personXldfm11m
     *            當事人XLDFM11M資料
     */
    public void setPersonXldfm11m(final XLDFM11M personXldfm11m) {
        this.personXldfm11m = personXldfm11m;
    }

    /**
     * 取得關係人清單.
     * 
     * @return 關係人清單
     */
    public List<RelationData> getRelationDataList() {
        return relationDataList;
    }

    /**
     * 設定關係人清單.
     * 
     * @param relationDataList
     *            關係人清單
     */
    public void setRelationDataList(final List<RelationData> relationDataList) {
        this.relationDataList = relationDataList;
    }

    /**
     * 取得同戶內是否有子女.
     * 
     * @return 同戶內是否有子女
     */
    public boolean isSameHouseholdChildren() {
        return sameHouseholdChildren;
    }

    /**
     * 設定同戶內是否有子女.
     * 
     * @param sameHouseholdChildren
     *            同戶內是否有子女
     */
    public void setSameHouseholdChildren(final boolean sameHouseholdChildren) {
        this.sameHouseholdChildren = sameHouseholdChildren;
    }

    /**
     * 取得所內記事清單.
     * 
     * @return 所內記事清單
     */
    public List<XLDF030T> getXldf030mList() {
        return xldf030mList;
    }

    /**
     * 設定所內記事清單.
     * 
     * @param xldf030mList
     *            所內記事清單
     */
    public void setXldf030mList(final List<XLDF030T> xldf030mList) {
        this.xldf030mList = xldf030mList;
    }

    /**
     * 取得行政協助清單.
     * 
     * @return 行政協助清單
     */
    public List<XLDF030T> getXldf030tList() {
        return xldf030tList;
    }

    /**
     * 設定行政協助清單.
     * 
     * @param xldf030tList
     *            行政協助清單
     */
    public void setXldf030tList(final List<XLDF030T> xldf030tList) {
        this.xldf030tList = xldf030tList;
    }

    /**
     * 取得原姓名.
     * 
     * @return 原姓名
     */
    public String getBeforePersonName() {
        return beforePersonName;
    }

    /**
     * 設定原姓名.
     * 
     * @param beforePersonName
     *            原姓名
     */
    public void setBeforePersonName(final String beforePersonName) {
        this.beforePersonName = beforePersonName;
    }

    /**
     * 取得原姓.
     * 
     * @return 原姓
     */
    public String getBeforeLastName() {
        return beforeLastName;
    }

    /**
     * 設定原姓.
     * 
     * @param beforeLastName
     *            原姓
     */
    public void setBeforeLastName(final String beforeLastName) {
        this.beforeLastName = beforeLastName;
    }

    /**
     * 取得原名.
     * 
     * @return 原名
     */
    public String getBeforeFirstName() {
        return beforeFirstName;
    }

    /**
     * 設定原名.
     * 
     * @param beforeFirstName
     *            原名
     */
    public void setBeforeFirstName(final String beforeFirstName) {
        this.beforeFirstName = beforeFirstName;
    }

    /**
     * 取得原本姓.
     * 
     * @return 原本姓
     */
    public String getBeforeMidenName() {
        return beforeMidenName;
    }

    /**
     * 設定原本姓.
     * 
     * @param beforeMidenName
     *            原本姓
     */
    public void setBeforeMidenName(final String beforeMidenName) {
        this.beforeMidenName = beforeMidenName;
    }

    /**
     * 取得原冠姓.
     * 
     * @return 原冠姓
     */
    public String getBeforeMarriedName() {
        return beforeMarriedName;
    }

    /**
     * 設定原冠姓.
     * 
     * @param beforeMarriedName
     *            原冠姓
     */
    public void setBeforeMarriedName(final String beforeMarriedName) {
        this.beforeMarriedName = beforeMarriedName;
    }

    /**
     * 取得新姓名.
     * 
     * @return 新姓名
     */
    public String getAfterPersonName() {
        return afterPersonName;
    }

    /**
     * 設定新姓名.
     * 
     * @param afterPersonName
     *            新姓名
     */
    public void setAfterPersonName(final String afterPersonName) {
        this.afterPersonName = afterPersonName;
    }

    /**
     * 取得新姓.
     * 
     * @return 新姓
     */
    public String getAfterLastName() {
        return afterLastName;
    }

    /**
     * 設定新姓.
     * 
     * @param afterLastName
     *            新姓
     */
    public void setAfterLastName(final String afterLastName) {
        this.afterLastName = afterLastName;
    }

    /**
     * 取得新名.
     * 
     * @return 新名
     */
    public String getAfterFirstName() {
        return afterFirstName;
    }

    /**
     * 設定新名.
     * 
     * @param afterFirstName
     *            新名
     */
    public void setAfterFirstName(final String afterFirstName) {
        this.afterFirstName = afterFirstName;
    }

    /**
     * 取得新本姓.
     * 
     * @return 新本姓
     */
    public String getAfterMidenName() {
        return afterMidenName;
    }

    /**
     * 設定新本姓.
     * 
     * @param afterMidenName
     *            新本姓
     */
    public void setAfterMidenName(final String afterMidenName) {
        this.afterMidenName = afterMidenName;
    }

    /**
     * 取得新冠姓.
     * 
     * @return 新冠姓
     */
    public String getAfterMarriedName() {
        return afterMarriedName;
    }

    /**
     * 設定新冠姓.
     * 
     * @param afterMarriedName
     *            新冠姓
     */
    public void setAfterMarriedName(final String afterMarriedName) {
        this.afterMarriedName = afterMarriedName;
    }

    /**
     * 取得從姓方式代碼.
     * 
     * @return 從姓方式代碼
     */
    public String getNameWay() {
        return nameWay;
    }

    /**
     * 設定從姓方式代碼.
     * 
     * @param nameWay
     *            從姓方式代碼
     */
    public void setNameWay(final String nameWay) {
        this.nameWay = nameWay;
    }

    /**
     * 取得更正原因代碼.
     * 
     * @return 更正原因代碼
     */
    public String getUpdateReasonCode() {
        return updateReasonCode;
    }

    /**
     * 設定更正原因代碼.
     * 
     * @param updateReasonCode
     *            更正原因代碼
     */
    public void setUpdateReasonCode(final String updateReasonCode) {
        this.updateReasonCode = updateReasonCode;
    }

    /**
     * 取得更正日期.
     * 
     * @return 更正日期
     */
    public String getUpdateYyymmdd() {
        return updateYyymmdd;
    }

    /**
     * 設定更正日期.
     * 
     * @param updateYyymmdd
     *            更正日期
     */
    public void setUpdateYyymmdd(final String updateYyymmdd) {
        this.updateYyymmdd = updateYyymmdd;
    }

    /**
     * 取得引用法條代碼.
     * 
     * @return 引用法條代碼
     */
    public String getLawCode() {
        return lawCode;
    }

    /**
     * 設定引用法條代碼.
     * 
     * @param lawCode
     *            引用法條代碼
     */
    public void setLawCode(final String lawCode) {
        this.lawCode = lawCode;
    }

    /**
     * 取得從姓方式是否顯示.
     * 
     * @return 從姓方式是否顯示
     */
    public boolean isNameWayShow() {
        return nameWayShow;
    }

    /**
     * 設定從姓方式是否顯示.
     * 
     * @param nameWayShow
     *            從姓方式是否顯示
     */
    public void setNameWayShow(final boolean nameWayShow) {
        this.nameWayShow = nameWayShow;
    }

    /**
     * 取得配偶明細戶籍資料查詢是否顯示.
     * 
     * @return 配偶明細戶籍資料查詢是否顯示
     */
    public boolean isSpouseRl03100QueryShow() {
        return spouseRl03100QueryShow;
    }

    /**
     * 設定配偶明細戶籍資料查詢是否顯示.
     * 
     * @param spouseRl03100QueryShow
     *            配偶明細戶籍資料查詢是否顯示
     */
    public void setSpouseRl03100QueryShow(final boolean spouseRl03100QueryShow) {
        this.spouseRl03100QueryShow = spouseRl03100QueryShow;
    }

    /**
     * 取得附繳證件代碼檔名.
     * 
     * @return 附繳證件代碼檔名
     */
    public String getCertificate() {
        return certificate;
    }

    /**
     * 設定附繳證件代碼檔名.
     * 
     * @param certificate
     *            附繳證件代碼檔名
     */
    public void setCertificate(final String certificate) {
        this.certificate = certificate;
    }

    /**
     * 取得附繳證件.
     * 
     * @return 附繳證件
     */
    public List<String> getCertificateList() {
        return certificateList;
    }

    /**
     * 設定附繳證件.
     * 
     * @param certificateList
     *            附繳證件
     */
    public void setCertificateList(final List<String> certificateList) {
        this.certificateList = certificateList;
    }

    /**
     * 取得其他附繳證件.
     * 
     * @return 其他附繳證件
     */
    public String getOtherCertificate() {
        return otherCertificate;
    }

    /**
     * 設定其他附繳證件.
     * 
     * @param otherCertificate
     *            其他附繳證件
     */
    public void setOtherCertificate(final String otherCertificate) {
        this.otherCertificate = otherCertificate;
    }

    /**
     * 取得備註.
     * 
     * @return 備註
     */
    public String getRegisterContent() {
        return registerContent;
    }

    /**
     * 設定備註.
     * 
     * @param registerContent
     *            備註
     */
    public void setRegisterContent(final String registerContent) {
        this.registerContent = registerContent;
    }

    /**
     * 取得申請人1.
     * 
     * @return 申請人1
     */
    public XLDFApplicantDataDTO getApply1() {
        return apply1;
    }

    /**
     * 設定申請人1.
     * 
     * @param apply1
     *            申請人1
     */
    public void setApply1(final XLDFApplicantDataDTO apply1) {
        this.apply1 = apply1;
    }

    /**
     * 取得申請人2.
     * 
     * @return 申請人2
     */
    public XLDFApplicantDataDTO getApply2() {
        return apply2;
    }

    /**
     * 設定申請人2.
     * 
     * @param apply2
     *            申請人2
     */
    public void setApply2(final XLDFApplicantDataDTO apply2) {
        this.apply2 = apply2;
    }

    /**
     * 取得受委託人.
     * 
     * @return 受委託人
     */
    public XLDFPersonBriefDataDTO getDelegated() {
        return delegated;
    }

    /**
     * 設定受委託人.
     * 
     * @param delegated
     *            受委託人
     */
    public void setDelegated(final XLDFPersonBriefDataDTO delegated) {
        this.delegated = delegated;
    }

    /**
     * 取得全戶記事清單.
     * 
     * @return 全戶記事清單
     */
    public List<XLDFHouseholdNoteDomainObject> getHouseholdNoteList() {
        return householdNoteList;
    }

    /**
     * 設定全戶記事清單.
     * 
     * @param householdNoteList
     *            全戶記事清單
     */
    public void setHouseholdNoteList(final List<XLDFHouseholdNoteDomainObject> householdNoteList) {
        this.householdNoteList = householdNoteList;
    }

    /**
     * 取得個人記事清單.
     * 
     * @return 個人記事清單
     */
    public List<XLDFPersonNoteDomainObject> getPersonNoteList() {
        return personNoteList;
    }

    /**
     * 設定個人記事清單.
     * 
     * @param personNoteList
     *            個人記事清單
     */
    public void setPersonNoteList(final List<XLDFPersonNoteDomainObject> personNoteList) {
        this.personNoteList = personNoteList;
    }

    /**
     * 取得前一次資料驗證之是否進行逾期申報之罰鍰檢視旗標.
     * 
     * @return 前一次資料驗證之是否進行逾期申報之罰鍰檢視旗標
     */
    public boolean isPreviousDoFineCheckFlag() {
        return previousDoFineCheckFlag;
    }

    /**
     * 設定前一次資料驗證之是否進行逾期申報之罰鍰檢視旗標.
     * 
     * @param previousDoFineCheckFlag
     *            前一次資料驗證之是否進行逾期申報之罰鍰檢視旗標
     */
    public void setPreviousDoFineCheckFlag(final boolean previousDoFineCheckFlag) {
        this.previousDoFineCheckFlag = previousDoFineCheckFlag;
    }

    /**
     * 取得前一次資料驗證之事件發生(確定)日期.
     * 
     * @return 前一次資料驗證之事件發生(確定)日期
     */
    public String getPreviousFineEventDate() {
        return previousFineEventDate;
    }

    /**
     * 設定前一次資料驗證之事件發生(確定)日期.
     * 
     * @param previousFineEventDate
     *            前一次資料驗證之事件發生(確定)日期
     */
    public void setPreviousFineEventDate(final String previousFineEventDate) {
        this.previousFineEventDate = previousFineEventDate;
    }

    /**
     * 取得收據號碼.
     * 
     * @return 收據號碼
     */
    public String getReceiptId() {
        return receiptId;
    }

    /**
     * 設定收據號碼.
     * 
     * @param receiptId
     *            收據號碼
     */
    public void setReceiptId(final String receiptId) {
        this.receiptId = receiptId;
    }

    /**
     * 取得是否進行逾期申報之罰鍰檢視旗標.
     * 
     * @return 是否進行逾期申報之罰鍰檢視旗標
     */
    public boolean isDoFineCheckFlag() {
        return doFineCheckFlag;
    }

    /**
     * 設定是否進行逾期申報之罰鍰檢視旗標.
     * 
     * @param doFineCheckFlag
     *            是否進行逾期申報之罰鍰檢視旗標
     */
    public void setDoFineCheckFlag(final boolean doFineCheckFlag) {
        this.doFineCheckFlag = doFineCheckFlag;
    }

    /**
     * 取得事件發生(確定)日期.
     * 
     * @return 事件發生(確定)日期
     */
    public String getFineEventDate() {
        return fineEventDate;
    }

    /**
     * 設定事件發生(確定)日期.
     * 
     * @param fineEventDate
     *            事件發生(確定)日期
     */
    public void setFineEventDate(final String fineEventDate) {
        this.fineEventDate = fineEventDate;
    }

    /**
     * 取得判斷是否罰鍰旗標.
     * 
     * @return 判斷是否罰鍰旗標
     */
    public String getNeedFineFlag() {
        return needFineFlag;
    }

    /**
     * 設定判斷是否罰鍰旗標.
     * 
     * @param needFineFlag
     *            判斷是否罰鍰旗標
     */
    public void setNeedFineFlag(final String needFineFlag) {
        this.needFineFlag = needFineFlag;
    }

    /**
     * 取得免罰旗標.
     * 
     * @return 免罰旗標
     */
    public boolean isFineFreeFlag() {
        return fineFreeFlag;
    }

    /**
     * 設定免罰旗標.
     * 
     * @param fineFreeFlag
     *            免罰旗標
     */
    public void setFineFreeFlag(final boolean fineFreeFlag) {
        this.fineFreeFlag = fineFreeFlag;
    }

    /**
     * 取得免罰原因.
     * 
     * @return 免罰原因
     */
    public String getRemoveFeeReason() {
        return removeFeeReason;
    }

    /**
     * 設定免罰原因.
     * 
     * @param removeFeeReason
     *            免罰原因
     */
    public void setRemoveFeeReason(final String removeFeeReason) {
        this.removeFeeReason = removeFeeReason;
    }

    /**
     * 取得罰鍰處理資料.
     * 
     * @return 罰鍰處理資料
     */
    public FineDTO getFineDTO() {
        return fineDTO;
    }

    /**
     * 設定罰鍰處理資料.
     * 
     * @param fineDTO
     *            罰鍰處理資料
     */
    public void setFineDTO(final FineDTO fineDTO) {
        this.fineDTO = fineDTO;
    }

    /**
     * 取得刪除罰鍰處理資料旗標.
     * 
     * @return 刪除罰鍰處理資料旗標
     */
    public boolean isDeleteFineDTOFlag() {
        return deleteFineDTOFlag;
    }

    /**
     * 設定刪除罰鍰處理資料旗標.
     * 
     * @param deleteFineDTOFlag
     *            刪除罰鍰處理資料旗標
     */
    public void setDeleteFineDTOFlag(final boolean deleteFineDTOFlag) {
        this.deleteFineDTOFlag = deleteFineDTOFlag;
    }

    /**
     * 取得受處分人.
     * 
     * @return 受處分人
     */
    public XLDFApplicantDataDTO getFinePerson() {
        return finePerson;
    }

    /**
     * 設定受處分人.
     * 
     * @param finePerson
     *            受處分人
     */
    public void setFinePerson(final XLDFApplicantDataDTO finePerson) {
        this.finePerson = finePerson;
    }

    /**
     * 取得系統日期.
     * 
     * @return 系統日期
     */
    public String getSystemDate() {
        return systemDate;
    }

    /**
     * 設定系統日期.
     * 
     * @param systemDate
     *            系統日期
     */
    public void setSystemDate(final String systemDate) {
        this.systemDate = systemDate;
    }

    /**
     * 取得系統時間.
     * 
     * @return 系統時間
     */
    public String getSystemTime() {
        return systemTime;
    }

    /**
     * 設定系統時間.
     * 
     * @param systemTime
     *            系統時間
     */
    public void setSystemTime(final String systemTime) {
        this.systemTime = systemTime;
    }

    /**
     * 取得大簿控制各作業之資訊.
     * 
     * @return 大簿控制各作業之資訊
     */
    public OpeningOperationDTO getOpeningOperationDTO() {
        return openingOperationDTO;
    }

    /**
     * 設定大簿控制各作業之資訊.
     * 
     * @param openingOperationDTO
     *            大簿控制各作業之資訊
     */
    public void setOpeningOperationDTO(final OpeningOperationDTO openingOperationDTO) {
        this.openingOperationDTO = openingOperationDTO;
    }

    /**
     * 取得警告訊息清單.
     * 
     * @return 警告訊息清單
     */
    public List<RlWarningMessage> getWarningMessgeList() {
        return warningMessgeList;
    }

    /**
     * 設定警告訊息清單.
     * 
     * @param warningMessgeList
     *            警告訊息清單
     */
    public void setWarningMessgeList(final List<RlWarningMessage> warningMessgeList) {
        this.warningMessgeList = warningMessgeList;
    }

    /**
     * 取得是否可異地辦理.
     * 
     * @return 是否可異地辦理
     */
    public boolean isCrossSiteEnabled() {
        return crossSiteEnabled;
    }

    /**
     * 設定是否可異地辦理.
     * 
     * @param crossSiteEnabled
     *            是否可異地辦理
     */
    public void setCrossSiteEnabled(final boolean crossSiteEnabled) {
        this.crossSiteEnabled = crossSiteEnabled;
    }

    /**
     * 取得逕為登記旗標.
     * 
     * @return 逕為登記旗標
     */
    public boolean isEnforcedFlag() {
        return enforcedFlag;
    }

    /**
     * 設定逕為登記旗標.
     * 
     * @param enforcedFlag
     *            逕為登記旗標
     */
    public void setEnforcedFlag(final boolean enforcedFlag) {
        this.enforcedFlag = enforcedFlag;
    }

    /**
     * 取得是否開放除戶簿頁(當事人).
     * 
     * @return 是否開放除戶簿頁(當事人)
     */
    public boolean isOutliveCase() {
        return outliveCase;
    }

    /**
     * 設定是否開放除戶簿頁(當事人).
     * 
     * @param outliveCase
     *            是否開放除戶簿頁(當事人)
     */
    public void setOutliveCase(final boolean outliveCase) {
        this.outliveCase = outliveCase;
    }

    /**
     * 取得逕為登記申請人.
     * 
     * @return 逕為登記申請人
     */
    public XldfefaplcType getEnforcedApplicant() {
        return enforcedApplicant;
    }

    /**
     * 設定逕為登記申請人.
     * 
     * @param enforcedApplicant
     *            逕為登記申請人
     */
    public void setEnforcedApplicant(final XldfefaplcType enforcedApplicant) {
        this.enforcedApplicant = enforcedApplicant;
    }

    /**
     * 取得受理地戶所代碼.
     * 
     * @return 受理地戶所代碼
     */
    public String getAcceptAdminOfficeCode() {
        return acceptAdminOfficeCode;
    }

    /**
     * 設定受理地戶所代碼.
     * 
     * @param acceptAdminOfficeCode
     *            受理地戶所代碼
     */
    public void setAcceptAdminOfficeCode(final String acceptAdminOfficeCode) {
        this.acceptAdminOfficeCode = acceptAdminOfficeCode;
    }

    /**
     * 取得其他附繳證件代碼.
     * 
     * @return 其他附繳證件代碼
     */
    public String getOtherCertificateCode() {
        return otherCertificateCode;
    }

    /**
     * 設定其他附繳證件代碼.
     * 
     * @param otherCertificateCode
     *            其他附繳證件代碼
     */
    public void setOtherCertificateCode(final String otherCertificateCode) {
        this.otherCertificateCode = otherCertificateCode;
    }

    /**
     * 取得其他附繳證件是否顯示.
     * 
     * @return 其他附繳證件是否顯示
     */
    public boolean isOtherCertificateShow() {
        return otherCertificateShow;
    }

    /**
     * 設定其他附繳證件是否顯示.
     * 
     * @param otherCertificateShow
     *            其他附繳證件是否顯示
     */
    public void setOtherCertificateShow(final boolean otherCertificateShow) {
        this.otherCertificateShow = otherCertificateShow;
    }

    /**
     * 取得暫存按鈕是否顯示.
     * 
     * @return 暫存按鈕是否顯示
     */
    public boolean isSaveButtonShow() {
        return saveButtonShow;
    }

    /**
     * 設定暫存按鈕是否顯示.
     * 
     * @param saveButtonShow
     *            暫存按鈕是否顯示
     */
    public void setSaveButtonShow(final boolean saveButtonShow) {
        this.saveButtonShow = saveButtonShow;
    }

    /**
     * 取得罰鍰處理按鈕是否顯示.
     * 
     * @return 罰鍰處理按鈕是否顯示
     */
    public boolean isFineButtonShow() {
        return fineButtonShow;
    }

    /**
     * 設定罰鍰處理按鈕是否顯示.
     * 
     * @param fineButtonShow
     *            罰鍰處理按鈕是否顯示
     */
    public void setFineButtonShow(final boolean fineButtonShow) {
        this.fineButtonShow = fineButtonShow;
    }

    /**
     * 取得進行逾期申報之罰鍰檢視核取方塊是否開放.
     * 
     * @return 進行逾期申報之罰鍰檢視核取方塊是否開放
     */
    public boolean isDoFineCheckFlagOpen() {
        return doFineCheckFlagOpen;
    }

    /**
     * 設定進行逾期申報之罰鍰檢視核取方塊是否開放.
     * 
     * @param doFineCheckFlagOpen
     *            進行逾期申報之罰鍰檢視核取方塊是否開放
     */
    public void setDoFineCheckFlagOpen(final boolean doFineCheckFlagOpen) {
        this.doFineCheckFlagOpen = doFineCheckFlagOpen;
    }

    /**
     * 取得交易序號.
     * 
     * @return 交易序號
     */
    public String getTransactionId() {
        return transactionId;
    }

    /**
     * 設定交易序號.
     * 
     * @param transactionId
     *            交易序號
     */
    public void setTransactionId(final String transactionId) {
        this.transactionId = transactionId;
    }

    /**
     * 取得作業順序編號.
     * 
     * @return 作業順序編號
     */
    public String getApplySequenceId() {
        return applySequenceId;
    }

    /**
     * 設定作業順序編號.
     * 
     * @param applySequenceId
     *            作業順序編號
     */
    public void setApplySequenceId(final String applySequenceId) {
        this.applySequenceId = applySequenceId;
    }

    /**
     * 取得申請書流水號.
     * 
     * @return 申請書流水號
     */
    public String getApplySeq() {
        return applySeq;
    }

    /**
     * 設定申請書流水號.
     * 
     * @param applySeq
     *            申請書流水號
     */
    public void setApplySeq(final String applySeq) {
        this.applySeq = applySeq;
    }

    /**
     * 取得申登案別.
     * 
     * @return 申登案別
     */
    public String getApplyCaseNo() {
        return applyCaseNo;
    }

    /**
     * 設定申登案別.
     * 
     * @param applyCaseNo
     *            申登案別
     */
    public void setApplyCaseNo(final String applyCaseNo) {
        this.applyCaseNo = applyCaseNo;
    }

    /**
     * 取得作業代碼.
     * 
     * @return 作業代碼
     */
    public String getOperationCode() {
        return operationCode;
    }

    /**
     * 設定作業代碼.
     * 
     * @param operationCode
     *            作業代碼
     */
    public void setOperationCode(final String operationCode) {
        this.operationCode = operationCode;
    }

    /**
     * 取得初始化是否成功.
     * 
     * @return 初始化是否成功
     */
    public boolean isInitSuccess() {
        return initSuccess;
    }

    /**
     * 設定初始化是否成功.
     * 
     * @param initSuccess
     *            初始化是否成功
     */
    public void setInitSuccess(final boolean initSuccess) {
        this.initSuccess = initSuccess;
    }

    /**
     * 取得頁籤索引.
     * 
     * @return 頁籤索引
     */
    public String getActiveIndex() {
        return activeIndex;
    }

    /**
     * 設定頁籤索引.
     * 
     * @param activeIndex
     *            頁籤索引
     */
    public void setActiveIndex(final String activeIndex) {
        this.activeIndex = activeIndex;
    }

    /**
     * 取得統號樣式.
     * 
     * @return 統號樣式
     */
    public String getStyleForPersonId() {
        return styleForPersonId;
    }

    /**
     * 設定統號樣式.
     * 
     * @param styleForPersonId
     *            統號樣式
     */
    public void setStyleForPersonId(final String styleForPersonId) {
        this.styleForPersonId = styleForPersonId;
    }

    /**
     * 取得作業點樣式.
     * 
     * @return 作業點樣式
     */
    public String getStyleForSiteId() {
        return styleForSiteId;
    }

    /**
     * 設定作業點樣式.
     * 
     * @param styleForSiteId
     *            作業點樣式
     */
    public void setStyleForSiteId(final String styleForSiteId) {
        this.styleForSiteId = styleForSiteId;
    }

    /**
     * 取得省略元件樣式(名).
     * 
     * @return 省略元件樣式(名)
     */
    public String getEllipsisStyleForFirstName() {
        return ellipsisStyleForFirstName;
    }

    /**
     * 設定省略元件樣式(名).
     * 
     * @param ellipsisStyleForFirstName
     *            省略元件樣式(名)
     */
    public void setEllipsisStyleForFirstName(final String ellipsisStyleForFirstName) {
        this.ellipsisStyleForFirstName = ellipsisStyleForFirstName;
    }

    /**
     * 取得省略元件樣式(姓).
     * 
     * @return 省略元件樣式(姓)
     */
    public String getEllipsisStyleForLastName() {
        return ellipsisStyleForLastName;
    }

    /**
     * 設定省略元件樣式(姓).
     * 
     * @param ellipsisStyleForLastName
     *            省略元件樣式(姓)
     */
    public void setEllipsisStyleForLastName(final String ellipsisStyleForLastName) {
        this.ellipsisStyleForLastName = ellipsisStyleForLastName;
    }

    /**
     * 取得省略元件樣式(姓名).
     * 
     * @return 省略元件樣式(姓名)
     */
    public String getEllipsisStyleForPersonName() {
        return ellipsisStyleForPersonName;
    }

    /**
     * 設定省略元件樣式(姓名).
     * 
     * @param ellipsisStyleForPersonName
     *            省略元件樣式(姓名)
     */
    public void setEllipsisStyleForPersonName(final String ellipsisStyleForPersonName) {
        this.ellipsisStyleForPersonName = ellipsisStyleForPersonName;
    }

}

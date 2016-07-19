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
import tw.gov.moi.domain.Rldfm05mType;
import tw.gov.moi.domain.Tldf004mType;
import tw.gov.moi.domain.XldfefaplcType;
import tw.gov.moi.rl.component.dto.OpeningOperationDTO;
import tw.gov.moi.rl.component.xldf.dto.XLDFY079DH;
import tw.gov.moi.rl.component.xldf.dto.XLDFY079DM;
import tw.gov.moi.rl.component.xldf.dto.XLDFY079H;
import tw.gov.moi.rl.component.xldf.dto.XLDFY079M;
import tw.gov.moi.rl.domain.xldf.XLDFHouseholdDataDomainObject;
import tw.gov.moi.rl.domain.xldf.XLDFHouseholdNoteDomainObject;
import tw.gov.moi.rl.domain.xldf.XLDFPersonDataDomainObject;
import tw.gov.moi.rl.domain.xldf.XLDFPersonNoteDomainObject;

/**
 * 監護登記DTO
 * 
 * @author DAXIONG
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl012e0DTO", propOrder = { "lockMode", "superviseType", "superviseReason", "mainPersonHouseholdData", "mainPersonData", "mainHouseholdheadPersonData", "mainPersonRole", "mainPersonSiteId", "mainPersonBookFlag", "mainPersonOrgEducationMark", "m05mList", "relatedPersonPersonId", "relatedPersonSiteId", "relatedPersonRemoveYyymmdd", "relatedPersonRemoveTime", "relatedMemoryPerson", "tempSupervisor", "supervisorList", "superviseStartDate", "superviseEndDate", "lawSuSupervisorChangeFlag", "lawSuJudgeDate", "lawSuJudgeWay", "lawSuSupervisorChangeReason", "lawSuOtherChangeReason", "lawSuPreviousSupervisorName", "lawSuPreviousFatherName", "lawSuPreviousMotherName", "willSuDecisionMaker", "delegateSuDelegateAsker", "delegateSuAskThing", "delegateSuSuperviorName", "decalreSuJudgeDate", "decalreSuJudgeWay", "certificate", "certificateList", "otherCertificate", "registerContent", "apply1", "apply2", "delegated", "householdNoteList", "personNoteList", "personNoteDetailList", "removedPersonNoteDetailList", "personNoteDetailSubList", "removedPersonNoteDetailSubList", "previousDoFineCheckFlag", "previousFineEventDate", "receiptId", "doFineCheckFlag", "fineEventDate", "needFineFlag", "fineFreeFlag", "removeFeeReason", "fineDTO", "deleteFineDTOFlag", "finePerson", "systemDate", "systemTime", "openingOperationDTO", "warningMessgeList", "crossSiteEnabled", "enforcedFlag", "outliveCase", "relatedOutliveCase", "enforcedApplicant", "acceptAdminOfficeCode", "otherCertificateCode", "otherCertificateShow", "saveButtonShow", "fineButtonShow", "doFineCheckFlagOpen", "transactionId", "applySequenceId", "applySeq", "applyCaseNo", "operationCode", "apply1ButtonRendered", "apply2ButtonRendered", "tempIsEmpty", "addSupervisorMode", "initSuccess", "activeIndex", "styleForPersonId", "styleForSiteId", "ellipsisStyleForFirstName", "ellipsisStyleForLastName", "ellipsisStyleForPersonName" })
@XmlRootElement(name = "Rl012e0DTO")
public class Rl012e0DTO implements Serializable {

    private static final long serialVersionUID = 1L;

    /** 鎖定頁面元件 */
    @XmlElement(name = "LockMode", required = true)
    @FieldName("鎖定頁面元件")
    private boolean lockMode;

    /** 監護類型 */
    @XmlElement(name = "SuperviseType", required = true)
    @FieldName("監護類型")
    private String superviseType;

    /** 監護原因 */
    @XmlElement(name = "SuperviseReason", required = true)
    @FieldName("監護原因")
    private String superviseReason;

    /** 受監護人-全戶基本資料 */
    @XmlElement(name = "MainPersonHouseholdData", required = true)
    @FieldName("受監護人-全戶基本資料")
    private XLDFHouseholdDataDomainObject mainPersonHouseholdData;

    /** 受監護人-個人基本資料 */
    @XmlElement(name = "MainPersonData", required = true)
    @FieldName("受監護人-個人基本資料")
    private XLDFPersonDataDomainObject mainPersonData;

    /** 受監護人戶長-個人基本資料 */
    @XmlElement(name = "MainHouseholdheadPersonData", required = true)
    @FieldName("受監護人戶長-個人基本資料")
    private XLDFPersonDataDomainObject mainHouseholdheadPersonData;

    /** 受監護人-身分角色 */
    @XmlElement(name = "MainPersonRole", required = true)
    @FieldName("受監護人-身分角色")
    private String mainPersonRole;

    /** 受監護人-作業點代碼 */
    @XmlElement(name = "MainPersonSiteId", required = true)
    @FieldName("受監護人-作業點代碼")
    private String mainPersonSiteId;

    /** 受監護人-簿頁旗標 */
    @XmlElement(name = "MainPersonBookFlag", required = true)
    @FieldName("受監護人-簿頁旗標")
    private String mainPersonBookFlag;

    /** 受監護人-原教育程度註記 */
    @XmlElement(name = "MainPersonOrgEducationMark", required = true)
    @FieldName("受監護人-原教育程度註記")
    private String mainPersonOrgEducationMark;

    /** 受監護人-監護資料檔清單 */
    @XmlElement(name = "M05mList", required = true)
    @FieldName("受監護人-監護資料檔清單")
    private List<Rldfm05mType> m05mList = new ArrayList<Rldfm05mType>();

    /** 監護人-統號 */
    @XmlElement(name = "RelatedPersonPersonId", required = true)
    @FieldName("監護人-統號")
    private String relatedPersonPersonId;

    /** 監護人-作業點代碼 */
    @XmlElement(name = "RelatedPersonSiteId", required = true)
    @FieldName("監護人-作業點代碼")
    private String relatedPersonSiteId;

    /** 監護人-除戶日期 */
    @XmlElement(name = "RelatedPersonRemoveYyymmdd", required = true)
    @FieldName("監護人-除戶日期")
    private String relatedPersonRemoveYyymmdd;

    /** 監護人-除戶時間 */
    @XmlElement(name = "RelatedPersonRemoveTime", required = true)
    @FieldName("監護人-除戶時間")
    private String relatedPersonRemoveTime;

    /** 監護人-補登個人基本資料 */
    @XmlElement(name = "RelatedMemoryPerson", required = true)
    @FieldName("監護人-補登個人基本資料")
    private Tldf004mType relatedMemoryPerson;

    /** 暫存-監護人 */
    @XmlElement(name = "TempSupervisor", required = true)
    @FieldName("暫存-監護人")
    private SupervisorDataDTO tempSupervisor = new SupervisorDataDTO();

    /** 監護人清單 */
    @XmlElement(name = "SupervisorList", required = true)
    @FieldName("監護人清單")
    private List<SupervisorDataDTO> supervisorList = new ArrayList<SupervisorDataDTO>();

    /** 監護日期(起) */
    @XmlElement(name = "SuperviseStartDate", required = true)
    @FieldName("監護日期(起)")
    private String superviseStartDate;

    /** 監護日期(迄) */
    @XmlElement(name = "SuperviseEndDate", required = true)
    @FieldName("監護日期(迄)")
    private String superviseEndDate;

    /** 法定監護-監護人變更旗標 */
    @XmlElement(name = "LawSuSupervisorChangeFlag", required = true)
    @FieldName("法定監護-監護人變更旗標")
    private String lawSuSupervisorChangeFlag;

    /** 法定監護-法院裁判日期 */
    @XmlElement(name = "LawSuJudgeDate", required = true)
    @FieldName("法定監護-法院裁判日期")
    private String lawSuJudgeDate;

    /** 法定監護-法院裁判方式 */
    @XmlElement(name = "LawSuJudgeWay", required = true)
    @FieldName("法定監護-法院裁判方式")
    private String lawSuJudgeWay;

    /** 法定監護-監護人變更原因 */
    @XmlElement(name = "LawSuSupervisorChangeReason", required = true)
    @FieldName("法定監護-監護人變更原因")
    private String lawSuSupervisorChangeReason;

    /** 法定監護-其他變更原因 */
    @XmlElement(name = "LawSuOtherChangeReason", required = true)
    @FieldName("法定監護-其他變更原因")
    private String lawSuOtherChangeReason;

    /** 法定監護-前監護人姓名 */
    @XmlElement(name = "LawSuPreviousSupervisorName", required = true)
    @FieldName("法定監護-前監護人姓名")
    private String lawSuPreviousSupervisorName;

    /** 法定監護-前父姓名 */
    @XmlElement(name = "LawSuPreviousFatherName", required = true)
    @FieldName("法定監護-前父姓名")
    private String lawSuPreviousFatherName;

    /** 法定監護-前母姓名 */
    @XmlElement(name = "LawSuPreviousMotherName", required = true)
    @FieldName("法定監護-前母姓名")
    private String lawSuPreviousMotherName;

    /** 遺囑監護-遺囑指定之決定者 */
    @XmlElement(name = "WillSuDecisionMaker", required = true)
    @FieldName("遺囑監護-遺囑指定之決定者")
    private String willSuDecisionMaker;

    /** 委託監護-委託者 */
    @XmlElement(name = "DelegateSuDelegateAsker", required = true)
    @FieldName("委託監護-委託者")
    private String delegateSuDelegateAsker;

    /** 委託監護-委託事項 */
    @XmlElement(name = "DelegateSuAskThing", required = true)
    @FieldName("委託監護-委託事項")
    private String delegateSuAskThing;

    /** 委託監護-監護人姓名 */
    @XmlElement(name = "DelegateSuSuperviorName", required = true)
    @FieldName("委託監護-監護人姓名")
    private String delegateSuSuperviorName;

    /** 監護宣告-法院裁判日期 */
    @XmlElement(name = "DecalreSuJudgeDate", required = true)
    @FieldName("監護宣告-法院裁判日期")
    private String decalreSuJudgeDate;

    /** 監護宣告-法院裁判方式 */
    @XmlElement(name = "DecalreSuJudgeWay", required = true)
    @FieldName("監護宣告-法院裁判方式")
    private String decalreSuJudgeWay;

    /** 附繳證件代碼檔名 */
    @XmlElement(name = "Certificate", required = true)
    @FieldName("附繳證件代碼檔名")
    private String certificate;

    /** 附繳證件 */
    @XmlElement(name = "CertificateList", required = true)
    @FieldName("附繳證件")
    private List<String> certificateList = new ArrayList<String>();

    /** 附繳證件-其他 */
    @XmlElement(name = "OtherCertificate", required = true)
    @FieldName("附繳證件-其他")
    private String otherCertificate;

    /** 備註 */
    @XmlElement(name = "RegisterContent", required = true)
    @FieldName("備註")
    private String registerContent;

    /** 申請人1 */
    @XmlElement(name = "Apply1", required = true)
    @FieldName("申請人1")
    private XLDFApplicantDataDTO apply1 = new XLDFApplicantDataDTO();

    /** 申請人2 */
    @XmlElement(name = "Apply2", required = true)
    @FieldName("申請人2")
    private XLDFApplicantDataDTO apply2 = new XLDFApplicantDataDTO();

    /** 受委託人 */
    @XmlElement(name = "Delegated", required = true)
    @FieldName("受委託人")
    private XLDFPersonBriefDataDTO delegated = new XLDFPersonBriefDataDTO();

    /** 全戶記事清單 */
    @XmlElement(name = "HouseholdNoteList", required = true)
    @FieldName("全戶記事清單")
    private List<XLDFHouseholdNoteDomainObject> householdNoteList = new ArrayList<XLDFHouseholdNoteDomainObject>();

    /** 個人記事清單 */
    @XmlElement(name = "PersonNoteList", required = true)
    @FieldName("個人記事清單")
    private List<XLDFPersonNoteDomainObject> personNoteList = new ArrayList<XLDFPersonNoteDomainObject>();

    /** 個人記事欄位化清單-主檔 */
    @XmlElement(name = "PersonNoteDetailList", required = true)
    @FieldName("個人記事欄位化清單-主檔")
    private List<XLDFY079M> personNoteDetailList = new ArrayList<XLDFY079M>();

    /** 除戶個人記事欄位化清單-主檔 */
    @XmlElement(name = "RemovedPersonNoteDetailList", required = true)
    @FieldName("除戶個人記事欄位化清單-主檔")
    private List<XLDFY079H> removedPersonNoteDetailList = new ArrayList<XLDFY079H>();

    /** 個人記事欄位化清單-子檔 */
    @XmlElement(name = "PersonNoteDetailSubList", required = true)
    @FieldName("個人記事欄位化清單-子檔")
    private List<XLDFY079DM> personNoteDetailSubList = new ArrayList<XLDFY079DM>();

    /** 除戶個人記事欄位化清單-子檔 */
    @XmlElement(name = "RemovedPersonNoteDetailSubList", required = true)
    @FieldName("除戶個人記事欄位化清單-子檔")
    private List<XLDFY079DH> removedPersonNoteDetailSubList = new ArrayList<XLDFY079DH>();

    /** 前一次資料驗證之是否進行逾期申報之罰鍰檢視旗標 */
    @XmlElement(name = "PreviousDoFineCheckFlag", required = true)
    @FieldName("前一次資料驗證之是否進行逾期申報之罰鍰檢視旗標")
    private boolean previousDoFineCheckFlag;

    /** 前一次資料驗證之事件發生(確定)日期 */
    @XmlElement(name = "PreviousFineEventDate", required = true)
    @FieldName("前一次資料驗證之事件發生(確定)日期")
    private String previousFineEventDate;

    /** 收據號碼 */
    @XmlElement(name = "ReceiptId", required = true)
    @FieldName("收據號碼")
    private String receiptId;

    /** 是否進行逾期申報之罰鍰檢視旗標 */
    @XmlElement(name = "DoFineCheckFlag", required = true)
    @FieldName("是否進行逾期申報之罰鍰檢視旗標")
    private boolean doFineCheckFlag;

    /** 事件發生(確定)日期 */
    @XmlElement(name = "FineEventDate", required = true)
    @FieldName("事件發生(確定)日期")
    private String fineEventDate;

    /** 判斷是否罰鍰旗標 */
    @XmlElement(name = "NeedFineFlag", required = true)
    @FieldName("判斷是否罰鍰旗標")
    private String needFineFlag;

    /** 免罰旗標 */
    @XmlElement(name = "FineFreeFlag", required = true)
    @FieldName("免罰旗標")
    private boolean fineFreeFlag;

    /** 免罰原因 */
    @XmlElement(name = "RemoveFeeReason", required = true)
    @FieldName("免罰原因")
    private String removeFeeReason;

    /** 罰鍰處理資料 */
    @XmlElement(name = "FineDTO", required = true)
    @FieldName("罰鍰處理資料")
    private FineDTO fineDTO = new FineDTO();

    /** 刪除罰鍰處理資料旗標 */
    @XmlElement(name = "DeleteFineDTOFlag", required = true)
    @FieldName("刪除罰鍰處理資料旗標")
    private boolean deleteFineDTOFlag;

    /** 受處分人 */
    @XmlElement(name = "FinePerson", required = true)
    @FieldName("受處分人")
    private XLDFApplicantDataDTO finePerson = new XLDFApplicantDataDTO();

    /** 系統日期 */
    @XmlElement(name = "SystemDate", required = true)
    @FieldName("系統日期")
    private String systemDate;

    /** 系統時間 */
    @XmlElement(name = "SystemTime", required = true)
    @FieldName("系統時間")
    private String systemTime;

    /** 大簿控制各作業之資訊 */
    @XmlElement(name = "OpeningOperationDTO", required = true)
    @FieldName("大簿控制各作業之資訊")
    private OpeningOperationDTO openingOperationDTO;

    /** 警告訊息清單 */
    @XmlElement(name = "WarningMessgeList", required = true)
    @FieldName("警告訊息清單")
    private List<RlWarningMessage> warningMessgeList = new ArrayList<RlWarningMessage>();

    /** 是否可異地辦理 */
    @XmlElement(name = "CrossSiteEnabled", required = true)
    @FieldName("是否可異地辦理")
    private boolean crossSiteEnabled;

    /** 逕為登記旗標 */
    @XmlElement(name = "EnforcedFlag", required = true)
    @FieldName("逕為登記旗標")
    private boolean enforcedFlag;

    /** 是否開放除戶簿頁(當事人) */
    @XmlElement(name = "OutliveCase", required = true)
    @FieldName("是否開放除戶簿頁(當事人)")
    private boolean outliveCase;

    /** 是否開放除戶簿頁(相關當事人) */
    @XmlElement(name = "RelatedOutliveCase", required = true)
    @FieldName("是否開放除戶簿頁(相關當事人)")
    private boolean relatedOutliveCase;

    /** 逕為登記申請人 */
    @XmlElement(name = "EnforcedApplicant", required = true)
    @FieldName("逕為登記申請人")
    private XldfefaplcType enforcedApplicant;

    /** 受理地戶所代碼 */
    @XmlElement(name = "AcceptAdminOfficeCode", required = true)
    @FieldName("受理地戶所代碼")
    private String acceptAdminOfficeCode;

    /** 其他附繳證件代碼 */
    @XmlElement(name = "OtherCertificateCode", required = true)
    @FieldName("其他附繳證件代碼")
    private String otherCertificateCode;

    /** 其他附繳證件是否顯示 */
    @XmlElement(name = "OtherCertificateShow", required = true)
    @FieldName("其他附繳證件是否顯示")
    private boolean otherCertificateShow;

    /** 暫存按鈕是否顯示 */
    @XmlElement(name = "SaveButtonShow", required = true)
    @FieldName("暫存按鈕是否顯示")
    private boolean saveButtonShow;

    /** 罰鍰處理按鈕是否顯示 */
    @XmlElement(name = "FineButtonShow", required = true)
    @FieldName("罰鍰處理按鈕是否顯示")
    private boolean fineButtonShow;

    /** 進行逾期申報之罰鍰檢視核取方塊是否開放 */
    @XmlElement(name = "DoFineCheckFlagOpen", required = true)
    @FieldName("進行逾期申報之罰鍰檢視核取方塊是否開放")
    private boolean doFineCheckFlagOpen;

    /** 交易序號 */
    @XmlElement(name = "TransactionId", required = true)
    @FieldName("交易序號")
    private String transactionId;

    /** 作業順序編號 */
    @XmlElement(name = "ApplySequenceId", required = true)
    @FieldName("作業順序編號")
    private String applySequenceId;

    /** 申請書流水號 */
    @XmlElement(name = "ApplySeq", required = true)
    @FieldName("申請書流水號")
    private String applySeq;

    /** 申登案別 */
    @XmlElement(name = "ApplyCaseNo", required = true)
    @FieldName("申登案別")
    private String applyCaseNo;

    /** 作業代碼 */
    @XmlElement(name = "OperationCode", required = true)
    @FieldName("作業代碼")
    private String operationCode;

    /** 頁面控制:新增申請人1為監護人之按鈕是否顯示 */
    @XmlElement(name = "Apply1ButtonRendered", required = true)
    @FieldName("頁面控制:新增申請人1為監護人之按鈕是否顯示")
    private boolean apply1ButtonRendered;

    /** 頁面控制:新增申請人2為監護人之按鈕是否顯示 */
    @XmlElement(name = "Apply2ButtonRendered", required = true)
    @FieldName("頁面控制:新增申請人2為監護人之按鈕是否顯示")
    private boolean apply2ButtonRendered;

    /** 頁面控制:暫存監護人資料是否空白 */
    @XmlElement(name = "TempIsEmpty", required = true)
    @FieldName("頁面控制:暫存監護人資料是否空白")
    private boolean tempIsEmpty;

    /** 頁面控制:新增監護人資料模式(true=申請人轉監護人;false=取得新監護人) */
    @XmlElement(name = "AddSupervisorMode", required = true)
    @FieldName("頁面控制:新增監護人資料模式(true=申請人轉監護人;false=取得新監護人)")
    private boolean addSupervisorMode;

    /** 初始化是否成功 */
    @XmlElement(name = "InitSuccess", required = true)
    @FieldName("初始化是否成功")
    private boolean initSuccess;

    /** 頁籤索引 */
    @XmlElement(name = "ActiveIndex", required = true)
    @FieldName("頁籤索引")
    private String activeIndex;

    /** 統號樣式 */
    @XmlElement(name = "StyleForPersonId", required = true)
    @FieldName("統號樣式")
    private String styleForPersonId;

    /** 作業點樣式 */
    @XmlElement(name = "StyleForSiteId", required = true)
    @FieldName("作業點樣式")
    private String styleForSiteId;

    /** 省略元件樣式(名) */
    @XmlElement(name = "EllipsisStyleForFirstName", required = true)
    @FieldName("省略元件樣式(名)")
    private String ellipsisStyleForFirstName;

    /** 省略元件樣式(姓) */
    @XmlElement(name = "EllipsisStyleForLastName", required = true)
    @FieldName("省略元件樣式(姓)")
    private String ellipsisStyleForLastName;

    /** 省略元件樣式(姓名) */
    @XmlElement(name = "EllipsisStyleForPersonName", required = true)
    @FieldName("省略元件樣式(姓名)")
    private String ellipsisStyleForPersonName;

    /**
     * 取得鎖定頁面元件
     * 
     * @return 鎖定頁面元件
     */
    public boolean isLockMode() {
        return lockMode;
    }

    /**
     * 設定鎖定頁面元件
     * 
     * @param lockMode
     *            鎖定頁面元件
     */
    public void setLockMode(final boolean lockMode) {
        this.lockMode = lockMode;
    }

    /**
     * 取得監護類型
     * 
     * @return 監護類型
     */
    public String getSuperviseType() {
        return superviseType;
    }

    /**
     * 設定監護類型
     * 
     * @param superviseType
     *            監護類型
     */
    public void setSuperviseType(final String superviseType) {
        this.superviseType = superviseType;
    }

    /**
     * 取得監護原因
     * 
     * @return 監護原因
     */
    public String getSuperviseReason() {
        return superviseReason;
    }

    /**
     * 設定監護原因
     * 
     * @param superviseReason
     *            監護原因
     */
    public void setSuperviseReason(final String superviseReason) {
        this.superviseReason = superviseReason;
    }

    /**
     * 取得受監護人-全戶基本資料
     * 
     * @return 受監護人-全戶基本資料
     */
    public XLDFHouseholdDataDomainObject getMainPersonHouseholdData() {
        return mainPersonHouseholdData;
    }

    /**
     * 設定受監護人-全戶基本資料
     * 
     * @param mainPersonHouseholdData
     *            受監護人-全戶基本資料
     */
    public void setMainPersonHouseholdData(final XLDFHouseholdDataDomainObject mainPersonHouseholdData) {
        this.mainPersonHouseholdData = mainPersonHouseholdData;
    }

    /**
     * 取得受監護人-個人基本資料
     * 
     * @return 受監護人-個人基本資料
     */
    public XLDFPersonDataDomainObject getMainPersonData() {
        return mainPersonData;
    }

    /**
     * 設定受監護人-個人基本資料
     * 
     * @param mainPersonData
     *            受監護人-個人基本資料
     */
    public void setMainPersonData(final XLDFPersonDataDomainObject mainPersonData) {
        this.mainPersonData = mainPersonData;
    }

    /**
     * 取得受監護人戶長-個人基本資料
     * 
     * @return 受監護人戶長-個人基本資料
     */
    public XLDFPersonDataDomainObject getMainHouseholdheadPersonData() {
        return mainHouseholdheadPersonData;
    }

    /**
     * 設定受監護人戶長-個人基本資料
     * 
     * @param mainHouseholdheadPersonData
     *            受監護人戶長-個人基本資料
     */
    public void setMainHouseholdheadPersonData(final XLDFPersonDataDomainObject mainHouseholdheadPersonData) {
        this.mainHouseholdheadPersonData = mainHouseholdheadPersonData;
    }

    /**
     * 取得受監護人-身分角色
     * 
     * @return 受監護人-身分角色
     */
    public String getMainPersonRole() {
        return mainPersonRole;
    }

    /**
     * 設定受監護人-身分角色
     * 
     * @param mainPersonRole
     *            受監護人-身分角色
     */
    public void setMainPersonRole(final String mainPersonRole) {
        this.mainPersonRole = mainPersonRole;
    }

    /**
     * 取得受監護人-作業點代碼
     * 
     * @return 受監護人-作業點代碼
     */
    public String getMainPersonSiteId() {
        return mainPersonSiteId;
    }

    /**
     * 設定受監護人-作業點代碼
     * 
     * @param mainPersonSiteId
     *            受監護人-作業點代碼
     */
    public void setMainPersonSiteId(final String mainPersonSiteId) {
        this.mainPersonSiteId = mainPersonSiteId;
    }

    /**
     * 取得受監護人-簿頁旗標
     * 
     * @return 受監護人-簿頁旗標
     */
    public String getMainPersonBookFlag() {
        return mainPersonBookFlag;
    }

    /**
     * 設定受監護人-簿頁旗標
     * 
     * @param mainPersonBookFlag
     *            受監護人-簿頁旗標
     */
    public void setMainPersonBookFlag(final String mainPersonBookFlag) {
        this.mainPersonBookFlag = mainPersonBookFlag;
    }

    /**
     * 取得受監護人-原教育程度註記
     * 
     * @return 受監護人-原教育程度註記
     */
    public String getMainPersonOrgEducationMark() {
        return mainPersonOrgEducationMark;
    }

    /**
     * 設定受監護人-原教育程度註記
     * 
     * @param mainPersonOrgEducationMark
     *            受監護人-原教育程度註記
     */
    public void setMainPersonOrgEducationMark(final String mainPersonOrgEducationMark) {
        this.mainPersonOrgEducationMark = mainPersonOrgEducationMark;
    }

    /**
     * 取得受監護人-監護資料檔清單
     * 
     * @return 受監護人-監護資料檔清單
     */
    public List<Rldfm05mType> getM05mList() {
        return m05mList;
    }

    /**
     * 設定受監護人-監護資料檔清單
     * 
     * @param m05mList
     *            受監護人-監護資料檔清單
     */
    public void setM05mList(final List<Rldfm05mType> m05mList) {
        this.m05mList = m05mList;
    }

    /**
     * 取得監護人-統號
     * 
     * @return 監護人-統號
     */
    public String getRelatedPersonPersonId() {
        return relatedPersonPersonId;
    }

    /**
     * 設定監護人-統號
     * 
     * @param relatedPersonPersonId
     *            監護人-統號
     */
    public void setRelatedPersonPersonId(final String relatedPersonPersonId) {
        this.relatedPersonPersonId = relatedPersonPersonId;
    }

    /**
     * 取得監護人-作業點代碼
     * 
     * @return 監護人-作業點代碼
     */
    public String getRelatedPersonSiteId() {
        return relatedPersonSiteId;
    }

    /**
     * 設定監護人-作業點代碼
     * 
     * @param relatedPersonSiteId
     *            監護人-作業點代碼
     */
    public void setRelatedPersonSiteId(final String relatedPersonSiteId) {
        this.relatedPersonSiteId = relatedPersonSiteId;
    }

    /**
     * 取得監護人-除戶日期
     * 
     * @return 監護人-除戶日期
     */
    public String getRelatedPersonRemoveYyymmdd() {
        return relatedPersonRemoveYyymmdd;
    }

    /**
     * 設定監護人-除戶日期
     * 
     * @param relatedPersonRemoveYyymmdd
     *            監護人-除戶日期
     */
    public void setRelatedPersonRemoveYyymmdd(final String relatedPersonRemoveYyymmdd) {
        this.relatedPersonRemoveYyymmdd = relatedPersonRemoveYyymmdd;
    }

    /**
     * 取得監護人-除戶時間
     * 
     * @return 監護人-除戶時間
     */
    public String getRelatedPersonRemoveTime() {
        return relatedPersonRemoveTime;
    }

    /**
     * 設定監護人-除戶時間
     * 
     * @param relatedPersonRemoveTime
     *            監護人-除戶時間
     */
    public void setRelatedPersonRemoveTime(final String relatedPersonRemoveTime) {
        this.relatedPersonRemoveTime = relatedPersonRemoveTime;
    }

    /**
     * 取得監護人-補登個人基本資料
     * 
     * @return 監護人-補登個人基本資料
     */
    public Tldf004mType getRelatedMemoryPerson() {
        return relatedMemoryPerson;
    }

    /**
     * 設定監護人-補登個人基本資料
     * 
     * @param relatedMemoryPerson
     *            監護人-補登個人基本資料
     */
    public void setRelatedMemoryPerson(final Tldf004mType relatedMemoryPerson) {
        this.relatedMemoryPerson = relatedMemoryPerson;
    }

    /**
     * 取得暫存-監護人
     * 
     * @return 暫存-監護人
     */
    public SupervisorDataDTO getTempSupervisor() {
        return tempSupervisor;
    }

    /**
     * 設定暫存-監護人
     * 
     * @param tempSupervisor
     *            暫存-監護人
     */
    public void setTempSupervisor(final SupervisorDataDTO tempSupervisor) {
        this.tempSupervisor = tempSupervisor;
    }

    /**
     * 取得監護人清單
     * 
     * @return 監護人清單
     */
    public List<SupervisorDataDTO> getSupervisorList() {
        return supervisorList;
    }

    /**
     * 設定監護人清單
     * 
     * @param supervisorList
     *            監護人清單
     */
    public void setSupervisorList(final List<SupervisorDataDTO> supervisorList) {
        this.supervisorList = supervisorList;
    }

    /**
     * 取得監護日期(起)
     * 
     * @return 監護日期(起)
     */
    public String getSuperviseStartDate() {
        return superviseStartDate;
    }

    /**
     * 設定監護日期(起)
     * 
     * @param superviseStartDate
     *            監護日期(起)
     */
    public void setSuperviseStartDate(final String superviseStartDate) {
        this.superviseStartDate = superviseStartDate;
    }

    /**
     * 取得監護日期(迄)
     * 
     * @return 監護日期(迄)
     */
    public String getSuperviseEndDate() {
        return superviseEndDate;
    }

    /**
     * 設定監護日期(迄)
     * 
     * @param superviseEndDate
     *            監護日期(迄)
     */
    public void setSuperviseEndDate(final String superviseEndDate) {
        this.superviseEndDate = superviseEndDate;
    }

    /**
     * 取得法定監護-監護人變更旗標
     * 
     * @return 法定監護-監護人變更旗標
     */
    public String getLawSuSupervisorChangeFlag() {
        return lawSuSupervisorChangeFlag;
    }

    /**
     * 設定法定監護-監護人變更旗標
     * 
     * @param lawSuSupervisorChangeFlag
     *            法定監護-監護人變更旗標
     */
    public void setLawSuSupervisorChangeFlag(final String lawSuSupervisorChangeFlag) {
        this.lawSuSupervisorChangeFlag = lawSuSupervisorChangeFlag;
    }

    /**
     * 取得法定監護-法院裁判日期
     * 
     * @return 法定監護-法院裁判日期
     */
    public String getLawSuJudgeDate() {
        return lawSuJudgeDate;
    }

    /**
     * 設定法定監護-法院裁判日期
     * 
     * @param lawSuJudgeDate
     *            法定監護-法院裁判日期
     */
    public void setLawSuJudgeDate(final String lawSuJudgeDate) {
        this.lawSuJudgeDate = lawSuJudgeDate;
    }

    /**
     * 取得法定監護-法院裁判方式
     * 
     * @return 法定監護-法院裁判方式
     */
    public String getLawSuJudgeWay() {
        return lawSuJudgeWay;
    }

    /**
     * 設定法定監護-法院裁判方式
     * 
     * @param lawSuJudgeWay
     *            法定監護-法院裁判方式
     */
    public void setLawSuJudgeWay(final String lawSuJudgeWay) {
        this.lawSuJudgeWay = lawSuJudgeWay;
    }

    /**
     * 取得法定監護-監護人變更原因
     * 
     * @return 法定監護-監護人變更原因
     */
    public String getLawSuSupervisorChangeReason() {
        return lawSuSupervisorChangeReason;
    }

    /**
     * 設定法定監護-監護人變更原因
     * 
     * @param lawSuSupervisorChangeReason
     *            法定監護-監護人變更原因
     */
    public void setLawSuSupervisorChangeReason(final String lawSuSupervisorChangeReason) {
        this.lawSuSupervisorChangeReason = lawSuSupervisorChangeReason;
    }

    /**
     * 取得法定監護-其他變更原因
     * 
     * @return 法定監護-其他變更原因
     */
    public String getLawSuOtherChangeReason() {
        return lawSuOtherChangeReason;
    }

    /**
     * 設定法定監護-其他變更原因
     * 
     * @param lawSuOtherChangeReason
     *            法定監護-其他變更原因
     */
    public void setLawSuOtherChangeReason(final String lawSuOtherChangeReason) {
        this.lawSuOtherChangeReason = lawSuOtherChangeReason;
    }

    /**
     * 取得法定監護-前監護人姓名
     * 
     * @return 法定監護-前監護人姓名
     */
    public String getLawSuPreviousSupervisorName() {
        return lawSuPreviousSupervisorName;
    }

    /**
     * 設定法定監護-前監護人姓名
     * 
     * @param lawSuPreviousSupervisorName
     *            法定監護-前監護人姓名
     */
    public void setLawSuPreviousSupervisorName(final String lawSuPreviousSupervisorName) {
        this.lawSuPreviousSupervisorName = lawSuPreviousSupervisorName;
    }

    /**
     * 取得法定監護-前父姓名
     * 
     * @return 法定監護-前父姓名
     */
    public String getLawSuPreviousFatherName() {
        return lawSuPreviousFatherName;
    }

    /**
     * 設定法定監護-前父姓名
     * 
     * @param lawSuPreviousFatherName
     *            法定監護-前父姓名
     */
    public void setLawSuPreviousFatherName(final String lawSuPreviousFatherName) {
        this.lawSuPreviousFatherName = lawSuPreviousFatherName;
    }

    /**
     * 取得法定監護-前母姓名
     * 
     * @return 法定監護-前母姓名
     */
    public String getLawSuPreviousMotherName() {
        return lawSuPreviousMotherName;
    }

    /**
     * 設定法定監護-前母姓名
     * 
     * @param lawSuPreviousMotherName
     *            法定監護-前母姓名
     */
    public void setLawSuPreviousMotherName(final String lawSuPreviousMotherName) {
        this.lawSuPreviousMotherName = lawSuPreviousMotherName;
    }

    /**
     * 取得遺囑監護-遺囑指定之決定者
     * 
     * @return 遺囑監護-遺囑指定之決定者
     */
    public String getWillSuDecisionMaker() {
        return willSuDecisionMaker;
    }

    /**
     * 設定遺囑監護-遺囑指定之決定者
     * 
     * @param willSuDecisionMaker
     *            遺囑監護-遺囑指定之決定者
     */
    public void setWillSuDecisionMaker(final String willSuDecisionMaker) {
        this.willSuDecisionMaker = willSuDecisionMaker;
    }

    /**
     * 取得委託監護-委託者
     * 
     * @return 委託監護-委託者
     */
    public String getDelegateSuDelegateAsker() {
        return delegateSuDelegateAsker;
    }

    /**
     * 設定委託監護-委託者
     * 
     * @param delegateSuDelegateAsker
     *            委託監護-委託者
     */
    public void setDelegateSuDelegateAsker(final String delegateSuDelegateAsker) {
        this.delegateSuDelegateAsker = delegateSuDelegateAsker;
    }

    /**
     * 取得委託監護-委託事項
     * 
     * @return 委託監護-委託事項
     */
    public String getDelegateSuAskThing() {
        return delegateSuAskThing;
    }

    /**
     * 設定委託監護-委託事項
     * 
     * @param delegateSuAskThing
     *            委託監護-委託事項
     */
    public void setDelegateSuAskThing(final String delegateSuAskThing) {
        this.delegateSuAskThing = delegateSuAskThing;
    }

    /**
     * 取得委託監護-監護人姓名
     * 
     * @return 委託監護-監護人姓名
     */
    public String getDelegateSuSuperviorName() {
        return delegateSuSuperviorName;
    }

    /**
     * 設定委託監護-監護人姓名
     * 
     * @param delegateSuSuperviorName
     *            委託監護-監護人姓名
     */
    public void setDelegateSuSuperviorName(final String delegateSuSuperviorName) {
        this.delegateSuSuperviorName = delegateSuSuperviorName;
    }

    /**
     * 取得監護宣告-法院裁判日期
     * 
     * @return 監護宣告-法院裁判日期
     */
    public String getDecalreSuJudgeDate() {
        return decalreSuJudgeDate;
    }

    /**
     * 設定監護宣告-法院裁判日期
     * 
     * @param decalreSuJudgeDate
     *            監護宣告-法院裁判日期
     */
    public void setDecalreSuJudgeDate(final String decalreSuJudgeDate) {
        this.decalreSuJudgeDate = decalreSuJudgeDate;
    }

    /**
     * 取得監護宣告-法院裁判方式
     * 
     * @return 監護宣告-法院裁判方式
     */
    public String getDecalreSuJudgeWay() {
        return decalreSuJudgeWay;
    }

    /**
     * 設定監護宣告-法院裁判方式
     * 
     * @param decalreSuJudgeWay
     *            監護宣告-法院裁判方式
     */
    public void setDecalreSuJudgeWay(final String decalreSuJudgeWay) {
        this.decalreSuJudgeWay = decalreSuJudgeWay;
    }

    /**
     * 取得附繳證件代碼檔名
     * 
     * @return 附繳證件代碼檔名
     */
    public String getCertificate() {
        return certificate;
    }

    /**
     * 設定附繳證件代碼檔名
     * 
     * @param certificate
     *            附繳證件代碼檔名
     */
    public void setCertificate(final String certificate) {
        this.certificate = certificate;
    }

    /**
     * 取得附繳證件
     * 
     * @return 附繳證件
     */
    public List<String> getCertificateList() {
        return certificateList;
    }

    /**
     * 設定附繳證件
     * 
     * @param certificateList
     *            附繳證件
     */
    public void setCertificateList(final List<String> certificateList) {
        this.certificateList = certificateList;
    }

    /**
     * 取得附繳證件-其他
     * 
     * @return 附繳證件-其他
     */
    public String getOtherCertificate() {
        return otherCertificate;
    }

    /**
     * 設定附繳證件-其他
     * 
     * @param otherCertificate
     *            附繳證件-其他
     */
    public void setOtherCertificate(final String otherCertificate) {
        this.otherCertificate = otherCertificate;
    }

    /**
     * 取得備註
     * 
     * @return 備註
     */
    public String getRegisterContent() {
        return registerContent;
    }

    /**
     * 設定備註
     * 
     * @param registerContent
     *            備註
     */
    public void setRegisterContent(final String registerContent) {
        this.registerContent = registerContent;
    }

    /**
     * 取得申請人1
     * 
     * @return 申請人1
     */
    public XLDFApplicantDataDTO getApply1() {
        return apply1;
    }

    /**
     * 設定申請人1
     * 
     * @param apply1
     *            申請人1
     */
    public void setApply1(final XLDFApplicantDataDTO apply1) {
        this.apply1 = apply1;
    }

    /**
     * 取得申請人2
     * 
     * @return 申請人2
     */
    public XLDFApplicantDataDTO getApply2() {
        return apply2;
    }

    /**
     * 設定申請人2
     * 
     * @param apply2
     *            申請人2
     */
    public void setApply2(final XLDFApplicantDataDTO apply2) {
        this.apply2 = apply2;
    }

    /**
     * 取得受委託人
     * 
     * @return 受委託人
     */
    public XLDFPersonBriefDataDTO getDelegated() {
        return delegated;
    }

    /**
     * 設定受委託人
     * 
     * @param delegated
     *            受委託人
     */
    public void setDelegated(final XLDFPersonBriefDataDTO delegated) {
        this.delegated = delegated;
    }

    /**
     * 取得全戶記事清單
     * 
     * @return 全戶記事清單
     */
    public List<XLDFHouseholdNoteDomainObject> getHouseholdNoteList() {
        return householdNoteList;
    }

    /**
     * 設定全戶記事清單
     * 
     * @param householdNoteList
     *            全戶記事清單
     */
    public void setHouseholdNoteList(final List<XLDFHouseholdNoteDomainObject> householdNoteList) {
        this.householdNoteList = householdNoteList;
    }

    /**
     * 取得個人記事清單
     * 
     * @return 個人記事清單
     */
    public List<XLDFPersonNoteDomainObject> getPersonNoteList() {
        return personNoteList;
    }

    /**
     * 設定個人記事清單
     * 
     * @param personNoteList
     *            個人記事清單
     */
    public void setPersonNoteList(final List<XLDFPersonNoteDomainObject> personNoteList) {
        this.personNoteList = personNoteList;
    }

    /**
     * 取得個人記事欄位化清單-主檔
     * 
     * @return 個人記事欄位化清單-主檔
     */
    public List<XLDFY079M> getPersonNoteDetailList() {
        return personNoteDetailList;
    }

    /**
     * 設定個人記事欄位化清單-主檔
     * 
     * @param personNoteDetailList
     *            個人記事欄位化清單-主檔
     */
    public void setPersonNoteDetailList(final List<XLDFY079M> personNoteDetailList) {
        this.personNoteDetailList = personNoteDetailList;
    }

    /**
     * 取得除戶個人記事欄位化清單-主檔
     * 
     * @return 除戶個人記事欄位化清單-主檔
     */
    public List<XLDFY079H> getRemovedPersonNoteDetailList() {
        return removedPersonNoteDetailList;
    }

    /**
     * 設定除戶個人記事欄位化清單-主檔
     * 
     * @param removedPersonNoteDetailList
     *            除戶個人記事欄位化清單-主檔
     */
    public void setRemovedPersonNoteDetailList(final List<XLDFY079H> removedPersonNoteDetailList) {
        this.removedPersonNoteDetailList = removedPersonNoteDetailList;
    }

    /**
     * 取得個人記事欄位化清單-子檔
     * 
     * @return 個人記事欄位化清單-子檔
     */
    public List<XLDFY079DM> getPersonNoteDetailSubList() {
        return personNoteDetailSubList;
    }

    /**
     * 設定個人記事欄位化清單-子檔
     * 
     * @param personNoteDetailSubList
     *            個人記事欄位化清單-子檔
     */
    public void setPersonNoteDetailSubList(final List<XLDFY079DM> personNoteDetailSubList) {
        this.personNoteDetailSubList = personNoteDetailSubList;
    }

    /**
     * 取得除戶個人記事欄位化清單-子檔
     * 
     * @return 除戶個人記事欄位化清單-子檔
     */
    public List<XLDFY079DH> getRemovedPersonNoteDetailSubList() {
        return removedPersonNoteDetailSubList;
    }

    /**
     * 設定除戶個人記事欄位化清單-子檔
     * 
     * @param removedPersonNoteDetailSubList
     *            除戶個人記事欄位化清單-子檔
     */
    public void setRemovedPersonNoteDetailSubList(final List<XLDFY079DH> removedPersonNoteDetailSubList) {
        this.removedPersonNoteDetailSubList = removedPersonNoteDetailSubList;
    }

    /**
     * 取得前一次資料驗證之是否進行逾期申報之罰鍰檢視旗標
     * 
     * @return 前一次資料驗證之是否進行逾期申報之罰鍰檢視旗標
     */
    public boolean isPreviousDoFineCheckFlag() {
        return previousDoFineCheckFlag;
    }

    /**
     * 設定前一次資料驗證之是否進行逾期申報之罰鍰檢視旗標
     * 
     * @param previousDoFineCheckFlag
     *            前一次資料驗證之是否進行逾期申報之罰鍰檢視旗標
     */
    public void setPreviousDoFineCheckFlag(final boolean previousDoFineCheckFlag) {
        this.previousDoFineCheckFlag = previousDoFineCheckFlag;
    }

    /**
     * 取得前一次資料驗證之事件發生(確定)日期
     * 
     * @return 前一次資料驗證之事件發生(確定)日期
     */
    public String getPreviousFineEventDate() {
        return previousFineEventDate;
    }

    /**
     * 設定前一次資料驗證之事件發生(確定)日期
     * 
     * @param previousFineEventDate
     *            前一次資料驗證之事件發生(確定)日期
     */
    public void setPreviousFineEventDate(final String previousFineEventDate) {
        this.previousFineEventDate = previousFineEventDate;
    }

    /**
     * 取得收據號碼
     * 
     * @return 收據號碼
     */
    public String getReceiptId() {
        return receiptId;
    }

    /**
     * 設定收據號碼
     * 
     * @param receiptId
     *            收據號碼
     */
    public void setReceiptId(final String receiptId) {
        this.receiptId = receiptId;
    }

    /**
     * 取得是否進行逾期申報之罰鍰檢視旗標
     * 
     * @return 是否進行逾期申報之罰鍰檢視旗標
     */
    public boolean isDoFineCheckFlag() {
        return doFineCheckFlag;
    }

    /**
     * 設定是否進行逾期申報之罰鍰檢視旗標
     * 
     * @param doFineCheckFlag
     *            是否進行逾期申報之罰鍰檢視旗標
     */
    public void setDoFineCheckFlag(final boolean doFineCheckFlag) {
        this.doFineCheckFlag = doFineCheckFlag;
    }

    /**
     * 取得事件發生(確定)日期
     * 
     * @return 事件發生(確定)日期
     */
    public String getFineEventDate() {
        return fineEventDate;
    }

    /**
     * 設定事件發生(確定)日期
     * 
     * @param fineEventDate
     *            事件發生(確定)日期
     */
    public void setFineEventDate(final String fineEventDate) {
        this.fineEventDate = fineEventDate;
    }

    /**
     * 取得判斷是否罰鍰旗標
     * 
     * @return 判斷是否罰鍰旗標
     */
    public String getNeedFineFlag() {
        return needFineFlag;
    }

    /**
     * 設定判斷是否罰鍰旗標
     * 
     * @param needFineFlag
     *            判斷是否罰鍰旗標
     */
    public void setNeedFineFlag(final String needFineFlag) {
        this.needFineFlag = needFineFlag;
    }

    /**
     * 取得免罰旗標
     * 
     * @return 免罰旗標
     */
    public boolean isFineFreeFlag() {
        return fineFreeFlag;
    }

    /**
     * 設定免罰旗標
     * 
     * @param fineFreeFlag
     *            免罰旗標
     */
    public void setFineFreeFlag(final boolean fineFreeFlag) {
        this.fineFreeFlag = fineFreeFlag;
    }

    /**
     * 取得免罰原因
     * 
     * @return 免罰原因
     */
    public String getRemoveFeeReason() {
        return removeFeeReason;
    }

    /**
     * 設定免罰原因
     * 
     * @param removeFeeReason
     *            免罰原因
     */
    public void setRemoveFeeReason(final String removeFeeReason) {
        this.removeFeeReason = removeFeeReason;
    }

    /**
     * 取得罰鍰處理資料
     * 
     * @return 罰鍰處理資料
     */
    public FineDTO getFineDTO() {
        return fineDTO;
    }

    /**
     * 設定罰鍰處理資料
     * 
     * @param fineDTO
     *            罰鍰處理資料
     */
    public void setFineDTO(final FineDTO fineDTO) {
        this.fineDTO = fineDTO;
    }

    /**
     * 取得刪除罰鍰處理資料旗標
     * 
     * @return 刪除罰鍰處理資料旗標
     */
    public boolean isDeleteFineDTOFlag() {
        return deleteFineDTOFlag;
    }

    /**
     * 設定刪除罰鍰處理資料旗標
     * 
     * @param deleteFineDTOFlag
     *            刪除罰鍰處理資料旗標
     */
    public void setDeleteFineDTOFlag(final boolean deleteFineDTOFlag) {
        this.deleteFineDTOFlag = deleteFineDTOFlag;
    }

    /**
     * 取得受處分人
     * 
     * @return 受處分人
     */
    public XLDFApplicantDataDTO getFinePerson() {
        return finePerson;
    }

    /**
     * 設定受處分人
     * 
     * @param finePerson
     *            受處分人
     */
    public void setFinePerson(final XLDFApplicantDataDTO finePerson) {
        this.finePerson = finePerson;
    }

    /**
     * 取得系統日期
     * 
     * @return 系統日期
     */
    public String getSystemDate() {
        return systemDate;
    }

    /**
     * 設定系統日期
     * 
     * @param systemDate
     *            系統日期
     */
    public void setSystemDate(final String systemDate) {
        this.systemDate = systemDate;
    }

    /**
     * 取得系統時間
     * 
     * @return 系統時間
     */
    public String getSystemTime() {
        return systemTime;
    }

    /**
     * 設定系統時間
     * 
     * @param systemTime
     *            系統時間
     */
    public void setSystemTime(final String systemTime) {
        this.systemTime = systemTime;
    }

    /**
     * 取得大簿控制各作業之資訊
     * 
     * @return 大簿控制各作業之資訊
     */
    public OpeningOperationDTO getOpeningOperationDTO() {
        return openingOperationDTO;
    }

    /**
     * 設定大簿控制各作業之資訊
     * 
     * @param openingOperationDTO
     *            大簿控制各作業之資訊
     */
    public void setOpeningOperationDTO(final OpeningOperationDTO openingOperationDTO) {
        this.openingOperationDTO = openingOperationDTO;
    }

    /**
     * 取得警告訊息清單
     * 
     * @return 警告訊息清單
     */
    public List<RlWarningMessage> getWarningMessgeList() {
        return warningMessgeList;
    }

    /**
     * 設定警告訊息清單
     * 
     * @param warningMessgeList
     *            警告訊息清單
     */
    public void setWarningMessgeList(final List<RlWarningMessage> warningMessgeList) {
        this.warningMessgeList = warningMessgeList;
    }

    /**
     * 取得是否可異地辦理
     * 
     * @return 是否可異地辦理
     */
    public boolean isCrossSiteEnabled() {
        return crossSiteEnabled;
    }

    /**
     * 設定是否可異地辦理
     * 
     * @param crossSiteEnabled
     *            是否可異地辦理
     */
    public void setCrossSiteEnabled(final boolean crossSiteEnabled) {
        this.crossSiteEnabled = crossSiteEnabled;
    }

    /**
     * 取得逕為登記旗標
     * 
     * @return 逕為登記旗標
     */
    public boolean isEnforcedFlag() {
        return enforcedFlag;
    }

    /**
     * 設定逕為登記旗標
     * 
     * @param enforcedFlag
     *            逕為登記旗標
     */
    public void setEnforcedFlag(final boolean enforcedFlag) {
        this.enforcedFlag = enforcedFlag;
    }

    /**
     * 取得是否開放除戶簿頁(當事人)
     * 
     * @return 是否開放除戶簿頁(當事人)
     */
    public boolean isOutliveCase() {
        return outliveCase;
    }

    /**
     * 設定是否開放除戶簿頁(當事人)
     * 
     * @param outliveCase
     *            是否開放除戶簿頁(當事人)
     */
    public void setOutliveCase(final boolean outliveCase) {
        this.outliveCase = outliveCase;
    }

    /**
     * 取得是否開放除戶簿頁(相關當事人)
     * 
     * @return 是否開放除戶簿頁(相關當事人)
     */
    public boolean isRelatedOutliveCase() {
        return relatedOutliveCase;
    }

    /**
     * 設定是否開放除戶簿頁(相關當事人)
     * 
     * @param relatedOutliveCase
     *            是否開放除戶簿頁(相關當事人)
     */
    public void setRelatedOutliveCase(final boolean relatedOutliveCase) {
        this.relatedOutliveCase = relatedOutliveCase;
    }

    /**
     * 取得逕為登記申請人
     * 
     * @return 逕為登記申請人
     */
    public XldfefaplcType getEnforcedApplicant() {
        return enforcedApplicant;
    }

    /**
     * 設定逕為登記申請人
     * 
     * @param enforcedApplicant
     *            逕為登記申請人
     */
    public void setEnforcedApplicant(final XldfefaplcType enforcedApplicant) {
        this.enforcedApplicant = enforcedApplicant;
    }

    /**
     * 取得受理地戶所代碼
     * 
     * @return 受理地戶所代碼
     */
    public String getAcceptAdminOfficeCode() {
        return acceptAdminOfficeCode;
    }

    /**
     * 設定受理地戶所代碼
     * 
     * @param acceptAdminOfficeCode
     *            受理地戶所代碼
     */
    public void setAcceptAdminOfficeCode(final String acceptAdminOfficeCode) {
        this.acceptAdminOfficeCode = acceptAdminOfficeCode;
    }

    /**
     * 取得其他附繳證件代碼
     * 
     * @return 其他附繳證件代碼
     */
    public String getOtherCertificateCode() {
        return otherCertificateCode;
    }

    /**
     * 設定其他附繳證件代碼
     * 
     * @param otherCertificateCode
     *            其他附繳證件代碼
     */
    public void setOtherCertificateCode(final String otherCertificateCode) {
        this.otherCertificateCode = otherCertificateCode;
    }

    /**
     * 取得其他附繳證件是否顯示
     * 
     * @return 其他附繳證件是否顯示
     */
    public boolean isOtherCertificateShow() {
        return otherCertificateShow;
    }

    /**
     * 設定其他附繳證件是否顯示
     * 
     * @param otherCertificateShow
     *            其他附繳證件是否顯示
     */
    public void setOtherCertificateShow(final boolean otherCertificateShow) {
        this.otherCertificateShow = otherCertificateShow;
    }

    /**
     * 取得暫存按鈕是否顯示
     * 
     * @return 暫存按鈕是否顯示
     */
    public boolean isSaveButtonShow() {
        return saveButtonShow;
    }

    /**
     * 設定暫存按鈕是否顯示
     * 
     * @param saveButtonShow
     *            暫存按鈕是否顯示
     */
    public void setSaveButtonShow(final boolean saveButtonShow) {
        this.saveButtonShow = saveButtonShow;
    }

    /**
     * 取得罰鍰處理按鈕是否顯示
     * 
     * @return 罰鍰處理按鈕是否顯示
     */
    public boolean isFineButtonShow() {
        return fineButtonShow;
    }

    /**
     * 設定罰鍰處理按鈕是否顯示
     * 
     * @param fineButtonShow
     *            罰鍰處理按鈕是否顯示
     */
    public void setFineButtonShow(final boolean fineButtonShow) {
        this.fineButtonShow = fineButtonShow;
    }

    /**
     * 取得進行逾期申報之罰鍰檢視核取方塊是否開放
     * 
     * @return 進行逾期申報之罰鍰檢視核取方塊是否開放
     */
    public boolean isDoFineCheckFlagOpen() {
        return doFineCheckFlagOpen;
    }

    /**
     * 設定進行逾期申報之罰鍰檢視核取方塊是否開放
     * 
     * @param doFineCheckFlagOpen
     *            進行逾期申報之罰鍰檢視核取方塊是否開放
     */
    public void setDoFineCheckFlagOpen(final boolean doFineCheckFlagOpen) {
        this.doFineCheckFlagOpen = doFineCheckFlagOpen;
    }

    /**
     * 取得交易序號
     * 
     * @return 交易序號
     */
    public String getTransactionId() {
        return transactionId;
    }

    /**
     * 設定交易序號
     * 
     * @param transactionId
     *            交易序號
     */
    public void setTransactionId(final String transactionId) {
        this.transactionId = transactionId;
    }

    /**
     * 取得作業順序編號
     * 
     * @return 作業順序編號
     */
    public String getApplySequenceId() {
        return applySequenceId;
    }

    /**
     * 設定作業順序編號
     * 
     * @param applySequenceId
     *            作業順序編號
     */
    public void setApplySequenceId(final String applySequenceId) {
        this.applySequenceId = applySequenceId;
    }

    /**
     * 取得申請書流水號
     * 
     * @return 申請書流水號
     */
    public String getApplySeq() {
        return applySeq;
    }

    /**
     * 設定申請書流水號
     * 
     * @param applySeq
     *            申請書流水號
     */
    public void setApplySeq(final String applySeq) {
        this.applySeq = applySeq;
    }

    /**
     * 取得申登案別
     * 
     * @return 申登案別
     */
    public String getApplyCaseNo() {
        return applyCaseNo;
    }

    /**
     * 設定申登案別
     * 
     * @param applyCaseNo
     *            申登案別
     */
    public void setApplyCaseNo(final String applyCaseNo) {
        this.applyCaseNo = applyCaseNo;
    }

    /**
     * 取得作業代碼
     * 
     * @return 作業代碼
     */
    public String getOperationCode() {
        return operationCode;
    }

    /**
     * 設定作業代碼
     * 
     * @param operationCode
     *            作業代碼
     */
    public void setOperationCode(final String operationCode) {
        this.operationCode = operationCode;
    }

    /**
     * 取得頁面控制:新增申請人1為監護人之按鈕是否顯示
     * 
     * @return 頁面控制:新增申請人1為監護人之按鈕是否顯示
     */
    public boolean isApply1ButtonRendered() {
        return apply1ButtonRendered;
    }

    /**
     * 設定頁面控制:新增申請人1為監護人之按鈕是否顯示
     * 
     * @param apply1ButtonRendered
     *            頁面控制:新增申請人1為監護人之按鈕是否顯示
     */
    public void setApply1ButtonRendered(final boolean apply1ButtonRendered) {
        this.apply1ButtonRendered = apply1ButtonRendered;
    }

    /**
     * 取得頁面控制:新增申請人2為監護人之按鈕是否顯示
     * 
     * @return 頁面控制:新增申請人2為監護人之按鈕是否顯示
     */
    public boolean isApply2ButtonRendered() {
        return apply2ButtonRendered;
    }

    /**
     * 設定頁面控制:新增申請人2為監護人之按鈕是否顯示
     * 
     * @param apply2ButtonRendered
     *            頁面控制:新增申請人2為監護人之按鈕是否顯示
     */
    public void setApply2ButtonRendered(final boolean apply2ButtonRendered) {
        this.apply2ButtonRendered = apply2ButtonRendered;
    }

    /**
     * 取得頁面控制:暫存監護人資料是否空白
     * 
     * @return 頁面控制:暫存監護人資料是否空白
     */
    public boolean isTempIsEmpty() {
        return tempIsEmpty;
    }

    /**
     * 設定頁面控制:暫存監護人資料是否空白
     * 
     * @param tempIsEmpty
     *            頁面控制:暫存監護人資料是否空白
     */
    public void setTempIsEmpty(final boolean tempIsEmpty) {
        this.tempIsEmpty = tempIsEmpty;
    }

    /**
     * 取得頁面控制:新增監護人資料模式(true=申請人轉監護人;false=取得新監護人)
     * 
     * @return 頁面控制:新增監護人資料模式(true=申請人轉監護人;false=取得新監護人)
     */
    public boolean isAddSupervisorMode() {
        return addSupervisorMode;
    }

    /**
     * 設定頁面控制:新增監護人資料模式(true=申請人轉監護人;false=取得新監護人)
     * 
     * @param addSupervisorMode
     *            頁面控制:新增監護人資料模式(true=申請人轉監護人;false=取得新監護人)
     */
    public void setAddSupervisorMode(final boolean addSupervisorMode) {
        this.addSupervisorMode = addSupervisorMode;
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

    /**
     * 取得統號樣式
     * 
     * @return 統號樣式
     */
    public String getStyleForPersonId() {
        return styleForPersonId;
    }

    /**
     * 設定統號樣式
     * 
     * @param styleForPersonId
     *            統號樣式
     */
    public void setStyleForPersonId(final String styleForPersonId) {
        this.styleForPersonId = styleForPersonId;
    }

    /**
     * 取得作業點樣式
     * 
     * @return 作業點樣式
     */
    public String getStyleForSiteId() {
        return styleForSiteId;
    }

    /**
     * 設定作業點樣式
     * 
     * @param styleForSiteId
     *            作業點樣式
     */
    public void setStyleForSiteId(final String styleForSiteId) {
        this.styleForSiteId = styleForSiteId;
    }

    /**
     * 取得省略元件樣式(名)
     * 
     * @return 省略元件樣式(名)
     */
    public String getEllipsisStyleForFirstName() {
        return ellipsisStyleForFirstName;
    }

    /**
     * 設定省略元件樣式(名)
     * 
     * @param ellipsisStyleForFirstName
     *            省略元件樣式(名)
     */
    public void setEllipsisStyleForFirstName(final String ellipsisStyleForFirstName) {
        this.ellipsisStyleForFirstName = ellipsisStyleForFirstName;
    }

    /**
     * 取得省略元件樣式(姓)
     * 
     * @return 省略元件樣式(姓)
     */
    public String getEllipsisStyleForLastName() {
        return ellipsisStyleForLastName;
    }

    /**
     * 設定省略元件樣式(姓)
     * 
     * @param ellipsisStyleForLastName
     *            省略元件樣式(姓)
     */
    public void setEllipsisStyleForLastName(final String ellipsisStyleForLastName) {
        this.ellipsisStyleForLastName = ellipsisStyleForLastName;
    }

    /**
     * 取得省略元件樣式(姓名)
     * 
     * @return 省略元件樣式(姓名)
     */
    public String getEllipsisStyleForPersonName() {
        return ellipsisStyleForPersonName;
    }

    /**
     * 設定省略元件樣式(姓名)
     * 
     * @param ellipsisStyleForPersonName
     *            省略元件樣式(姓名)
     */
    public void setEllipsisStyleForPersonName(final String ellipsisStyleForPersonName) {
        this.ellipsisStyleForPersonName = ellipsisStyleForPersonName;
    }

}
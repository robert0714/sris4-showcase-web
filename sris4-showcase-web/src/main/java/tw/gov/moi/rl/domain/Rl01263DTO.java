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
import tw.gov.moi.rl.component.xldf.dto.XCDF001MRL;
import tw.gov.moi.rl.component.xldf.dto.XLDFY061H;
import tw.gov.moi.rl.component.xldf.dto.XLDFY061M;
import tw.gov.moi.rl.domain.xldf.XLDFHouseholdDataDomainObject;
import tw.gov.moi.rl.domain.xldf.XLDFHouseholdNoteDomainObject;
import tw.gov.moi.rl.domain.xldf.XLDFPersonDataDomainObject;
import tw.gov.moi.rl.domain.xldf.XLDFPersonNoteDomainObject;

/**
 * 收養登記DTO
 * 
 * @author DAXIONG
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl01263DTO", propOrder = { "lockMode", "adoptType", "mainPersonHouseholdData", "mainPersonData", "mainHouseholdheadPersonData", "mainPersonRole", "mainPersonSiteId", "mainPersonBookFlag", "mainPersonOrgEducationMark", "mainPersonForeignPersonData", "mainPersonForeignBirthOrderSex", "mainXcdf001mrl", "fosterFatherPersonId", "fosterFatherSiteId", "fosterFatherRemoveYyymmdd", "fosterFatherRemoveTime", "fosterFatherHouseholdData", "fosterFatherPersonData", "fosterFatherRole", "fosterFatherBookFlag", "fosterFatherOrgEducationMark", "fosterFatherForeignPersonData", "fosterFatherMemoryPerson", "fosterMotherPersonId", "fosterMotherSiteId", "fosterMotherRemoveYyymmdd", "fosterMotherRemoveTime", "fosterMotherHouseholdData", "fosterMotherPersonData", "fosterMotherRole", "fosterMotherBookFlag", "fosterMotherOrgEducationMark", "fosterMotherForeignPersonData", "fosterMotherMemoryPerson", "businessDate", "certificate", "certificateList", "otherCertificate", "registerContent", "apply1", "apply2", "delegated", "householdNoteList", "personNoteList", "personNoteDetailList", "removedPersonNoteDetailList", "previousDoFineCheckFlag", "previousFineEventDate", "receiptId", "doFineCheckFlag", "fineEventDate", "needFineFlag", "fineFreeFlag", "removeFeeReason", "fineDTO", "deleteFineDTOFlag", "finePerson", "systemDate", "systemTime", "openingOperationDTO", "warningMessgeList", "crossSiteEnabled", "enforcedFlag", "outliveCase", "relatedOutliveCase", "enforcedApplicant", "acceptAdminOfficeCode", "otherCertificateCode", "otherCertificateShow", "saveButtonShow", "fineButtonShow", "doFineCheckFlagOpen", "transactionId", "applySequenceId", "applySeq", "applyCaseNo", "operationCode", "fosterFatherRendered", "fosterMotherRendered", "kinshipRelationMessage", "initSuccess", "activeIndex", "styleForPersonId", "styleForSiteId", "ellipsisStyleForFirstName", "ellipsisStyleForLastName", "ellipsisStyleForPersonName" })
@XmlRootElement(name = "Rl01263DTO")
public class Rl01263DTO implements Serializable {

    private static final long serialVersionUID = 1L;

    /** 鎖定頁面元件 */
    @XmlElement(name = "LockMode", required = true)
    @FieldName("鎖定頁面元件")
    private boolean lockMode;

    /** 收養類型 */
    @XmlElement(name = "AdoptType", required = true)
    @FieldName("收養類型")
    private String adoptType;

    /** 被收養者-全戶基本資料 */
    @XmlElement(name = "MainPersonHouseholdData", required = true)
    @FieldName("被收養者-全戶基本資料")
    private XLDFHouseholdDataDomainObject mainPersonHouseholdData;

    /** 被收養者-個人基本資料 */
    @XmlElement(name = "MainPersonData", required = true)
    @FieldName("被收養者-個人基本資料")
    private XLDFPersonDataDomainObject mainPersonData;

    /** 被收養者戶長-個人基本資料 */
    @XmlElement(name = "MainHouseholdheadPersonData", required = true)
    @FieldName("被收養者戶長-個人基本資料")
    private XLDFPersonDataDomainObject mainHouseholdheadPersonData;

    /** 被收養者-身分角色 */
    @XmlElement(name = "MainPersonRole", required = true)
    @FieldName("被收養者-身分角色")
    private String mainPersonRole;

    /** 被收養者-作業點代碼 */
    @XmlElement(name = "MainPersonSiteId", required = true)
    @FieldName("被收養者-作業點代碼")
    private String mainPersonSiteId;

    /** 被收養者-簿頁旗標 */
    @XmlElement(name = "MainPersonBookFlag", required = true)
    @FieldName("被收養者-簿頁旗標")
    private String mainPersonBookFlag;

    /** 被收養者-原教育程度註記 */
    @XmlElement(name = "MainPersonOrgEducationMark", required = true)
    @FieldName("被收養者-原教育程度註記")
    private String mainPersonOrgEducationMark;

    /** 被收養者-外籍者資料 */
    @XmlElement(name = "MainPersonForeignPersonData", required = true)
    @FieldName("被收養者-外籍者資料")
    private XLDFForeignPersonDTO mainPersonForeignPersonData = new XLDFForeignPersonDTO();

    /** 被收養者-外籍者-出生別 */
    @XmlElement(name = "MainPersonForeignBirthOrderSex", required = true)
    @FieldName("被收養者-外籍者-出生別")
    private String mainPersonForeignBirthOrderSex;

    /** 被收養者-全國個人資料摘要資料 */
    @XmlElement(name = "MainXcdf001mrl", required = true)
    @FieldName("被收養者-全國個人資料摘要資料")
    private XCDF001MRL mainXcdf001mrl;

    /** 養父-統號 */
    @XmlElement(name = "FosterFatherPersonId", required = true)
    @FieldName("養父-統號")
    private String fosterFatherPersonId;

    /** 養父-作業點代碼 */
    @XmlElement(name = "FosterFatherSiteId", required = true)
    @FieldName("養父-作業點代碼")
    private String fosterFatherSiteId;

    /** 養父-除戶日期 */
    @XmlElement(name = "FosterFatherRemoveYyymmdd", required = true)
    @FieldName("養父-除戶日期")
    private String fosterFatherRemoveYyymmdd;

    /** 養父-除戶時間 */
    @XmlElement(name = "FosterFatherRemoveTime", required = true)
    @FieldName("養父-除戶時間")
    private String fosterFatherRemoveTime;

    /** 養父-全戶基本資料 */
    @XmlElement(name = "FosterFatherHouseholdData", required = true)
    @FieldName("養父-全戶基本資料")
    private XLDFHouseholdDataDomainObject fosterFatherHouseholdData;

    /** 養父-個人基本資料 */
    @XmlElement(name = "FosterFatherPersonData", required = true)
    @FieldName("養父-個人基本資料")
    private XLDFPersonDataDomainObject fosterFatherPersonData;

    /** 養父-身分角色 */
    @XmlElement(name = "FosterFatherRole", required = true)
    @FieldName("養父-身分角色")
    private String fosterFatherRole;

    /** 養父-簿頁旗標 */
    @XmlElement(name = "FosterFatherBookFlag", required = true)
    @FieldName("養父-簿頁旗標")
    private String fosterFatherBookFlag;

    /** 養父-原教育程度註記 */
    @XmlElement(name = "FosterFatherOrgEducationMark", required = true)
    @FieldName("養父-原教育程度註記")
    private String fosterFatherOrgEducationMark;

    /** 養父-外籍者資料 */
    @XmlElement(name = "FosterFatherForeignPersonData", required = true)
    @FieldName("養父-外籍者資料")
    private XLDFForeignPersonDTO fosterFatherForeignPersonData = new XLDFForeignPersonDTO();

    /** 養父-補登個人基本資料 */
    @XmlElement(name = "FosterFatherMemoryPerson", required = true)
    @FieldName("養父-補登個人基本資料")
    private Tldf004mType fosterFatherMemoryPerson;

    /** 養母-統號 */
    @XmlElement(name = "FosterMotherPersonId", required = true)
    @FieldName("養母-統號")
    private String fosterMotherPersonId;

    /** 養母-作業點代碼 */
    @XmlElement(name = "FosterMotherSiteId", required = true)
    @FieldName("養母-作業點代碼")
    private String fosterMotherSiteId;

    /** 養母-除戶日期 */
    @XmlElement(name = "FosterMotherRemoveYyymmdd", required = true)
    @FieldName("養母-除戶日期")
    private String fosterMotherRemoveYyymmdd;

    /** 養母-除戶時間 */
    @XmlElement(name = "FosterMotherRemoveTime", required = true)
    @FieldName("養母-除戶時間")
    private String fosterMotherRemoveTime;

    /** 養母-全戶基本資料 */
    @XmlElement(name = "FosterMotherHouseholdData", required = true)
    @FieldName("養母-全戶基本資料")
    private XLDFHouseholdDataDomainObject fosterMotherHouseholdData;

    /** 養母-個人基本資料 */
    @XmlElement(name = "FosterMotherPersonData", required = true)
    @FieldName("養母-個人基本資料")
    private XLDFPersonDataDomainObject fosterMotherPersonData;

    /** 養母-身分角色 */
    @XmlElement(name = "FosterMotherRole", required = true)
    @FieldName("養母-身分角色")
    private String fosterMotherRole;

    /** 養母-簿頁旗標 */
    @XmlElement(name = "FosterMotherBookFlag", required = true)
    @FieldName("養母-簿頁旗標")
    private String fosterMotherBookFlag;

    /** 養母-原教育程度註記 */
    @XmlElement(name = "FosterMotherOrgEducationMark", required = true)
    @FieldName("養母-原教育程度註記")
    private String fosterMotherOrgEducationMark;

    /** 養母-外籍者資料 */
    @XmlElement(name = "FosterMotherForeignPersonData", required = true)
    @FieldName("養母-外籍者資料")
    private XLDFForeignPersonDTO fosterMotherForeignPersonData = new XLDFForeignPersonDTO();

    /** 養母-補登個人基本資料 */
    @XmlElement(name = "FosterMotherMemoryPerson", required = true)
    @FieldName("養母-補登個人基本資料")
    private Tldf004mType fosterMotherMemoryPerson;

    /** 收養日期 */
    @XmlElement(name = "BusinessDate", required = true)
    @FieldName("收養日期")
    private String businessDate;

    /** 附繳證件代碼檔名 */
    @XmlElement(name = "Certificate", required = true)
    @FieldName("附繳證件代碼檔名")
    private String certificate;

    /** 附繳證件 */
    @XmlElement(name = "CertificateList", required = true)
    @FieldName("附繳證件")
    private List<String> certificateList = new ArrayList<String>();

    /** 其他附繳證件 */
    @XmlElement(name = "OtherCertificate", required = true)
    @FieldName("其他附繳證件")
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

    /** 個人記事欄位化清單 */
    @XmlElement(name = "PersonNoteDetailList", required = true)
    @FieldName("個人記事欄位化清單")
    private List<XLDFY061M> personNoteDetailList = new ArrayList<XLDFY061M>();

    /** 除戶個人記事欄位化清單 */
    @XmlElement(name = "RemovedPersonNoteDetailList", required = true)
    @FieldName("除戶個人記事欄位化清單")
    private List<XLDFY061H> removedPersonNoteDetailList = new ArrayList<XLDFY061H>();

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

    /** 頁面控制:養父資料是否顯示 */
    @XmlElement(name = "FosterFatherRendered", required = true)
    @FieldName("頁面控制:養父資料是否顯示")
    private boolean fosterFatherRendered;

    /** 頁面控制:養母資料是否顯示 */
    @XmlElement(name = "FosterMotherRendered", required = true)
    @FieldName("頁面控制:養母資料是否顯示")
    private boolean fosterMotherRendered;

    /** 親等關係訊息 */
    @XmlElement(name = "KinshipRelationMessage", required = true)
    @FieldName("親等關係訊息")
    private String kinshipRelationMessage;

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
     * 取得收養類型
     * 
     * @return 收養類型
     */
    public String getAdoptType() {
        return adoptType;
    }

    /**
     * 設定收養類型
     * 
     * @param adoptType
     *            收養類型
     */
    public void setAdoptType(final String adoptType) {
        this.adoptType = adoptType;
    }

    /**
     * 取得被收養者-全戶基本資料
     * 
     * @return 被收養者-全戶基本資料
     */
    public XLDFHouseholdDataDomainObject getMainPersonHouseholdData() {
        return mainPersonHouseholdData;
    }

    /**
     * 設定被收養者-全戶基本資料
     * 
     * @param mainPersonHouseholdData
     *            被收養者-全戶基本資料
     */
    public void setMainPersonHouseholdData(final XLDFHouseholdDataDomainObject mainPersonHouseholdData) {
        this.mainPersonHouseholdData = mainPersonHouseholdData;
    }

    /**
     * 取得被收養者-個人基本資料
     * 
     * @return 被收養者-個人基本資料
     */
    public XLDFPersonDataDomainObject getMainPersonData() {
        return mainPersonData;
    }

    /**
     * 設定被收養者-個人基本資料
     * 
     * @param mainPersonData
     *            被收養者-個人基本資料
     */
    public void setMainPersonData(final XLDFPersonDataDomainObject mainPersonData) {
        this.mainPersonData = mainPersonData;
    }

    /**
     * 取得被收養者戶長-個人基本資料
     * 
     * @return 被收養者戶長-個人基本資料
     */
    public XLDFPersonDataDomainObject getMainHouseholdheadPersonData() {
        return mainHouseholdheadPersonData;
    }

    /**
     * 設定被收養者戶長-個人基本資料
     * 
     * @param mainHouseholdheadPersonData
     *            被收養者戶長-個人基本資料
     */
    public void setMainHouseholdheadPersonData(final XLDFPersonDataDomainObject mainHouseholdheadPersonData) {
        this.mainHouseholdheadPersonData = mainHouseholdheadPersonData;
    }

    /**
     * 取得被收養者-身分角色
     * 
     * @return 被收養者-身分角色
     */
    public String getMainPersonRole() {
        return mainPersonRole;
    }

    /**
     * 設定被收養者-身分角色
     * 
     * @param mainPersonRole
     *            被收養者-身分角色
     */
    public void setMainPersonRole(final String mainPersonRole) {
        this.mainPersonRole = mainPersonRole;
    }

    /**
     * 取得被收養者-作業點代碼
     * 
     * @return 被收養者-作業點代碼
     */
    public String getMainPersonSiteId() {
        return mainPersonSiteId;
    }

    /**
     * 設定被收養者-作業點代碼
     * 
     * @param mainPersonSiteId
     *            被收養者-作業點代碼
     */
    public void setMainPersonSiteId(final String mainPersonSiteId) {
        this.mainPersonSiteId = mainPersonSiteId;
    }

    /**
     * 取得被收養者-簿頁旗標
     * 
     * @return 被收養者-簿頁旗標
     */
    public String getMainPersonBookFlag() {
        return mainPersonBookFlag;
    }

    /**
     * 設定被收養者-簿頁旗標
     * 
     * @param mainPersonBookFlag
     *            被收養者-簿頁旗標
     */
    public void setMainPersonBookFlag(final String mainPersonBookFlag) {
        this.mainPersonBookFlag = mainPersonBookFlag;
    }

    /**
     * 取得被收養者-原教育程度註記
     * 
     * @return 被收養者-原教育程度註記
     */
    public String getMainPersonOrgEducationMark() {
        return mainPersonOrgEducationMark;
    }

    /**
     * 設定被收養者-原教育程度註記
     * 
     * @param mainPersonOrgEducationMark
     *            被收養者-原教育程度註記
     */
    public void setMainPersonOrgEducationMark(final String mainPersonOrgEducationMark) {
        this.mainPersonOrgEducationMark = mainPersonOrgEducationMark;
    }

    /**
     * 取得被收養者-外籍者資料
     * 
     * @return 被收養者-外籍者資料
     */
    public XLDFForeignPersonDTO getMainPersonForeignPersonData() {
        return mainPersonForeignPersonData;
    }

    /**
     * 設定被收養者-外籍者資料
     * 
     * @param mainPersonForeignPersonData
     *            被收養者-外籍者資料
     */
    public void setMainPersonForeignPersonData(final XLDFForeignPersonDTO mainPersonForeignPersonData) {
        this.mainPersonForeignPersonData = mainPersonForeignPersonData;
    }

    /**
     * 取得被收養者-外籍者-出生別
     * 
     * @return 被收養者-外籍者-出生別
     */
    public String getMainPersonForeignBirthOrderSex() {
        return mainPersonForeignBirthOrderSex;
    }

    /**
     * 設定被收養者-外籍者-出生別
     * 
     * @param mainPersonForeignBirthOrderSex
     *            被收養者-外籍者-出生別
     */
    public void setMainPersonForeignBirthOrderSex(final String mainPersonForeignBirthOrderSex) {
        this.mainPersonForeignBirthOrderSex = mainPersonForeignBirthOrderSex;
    }

    /**
     * 取得被收養者-全國個人資料摘要資料
     * 
     * @return 被收養者-全國個人資料摘要資料
     */
    public XCDF001MRL getMainXcdf001mrl() {
        return mainXcdf001mrl;
    }

    /**
     * 設定被收養者-全國個人資料摘要資料
     * 
     * @param mainXcdf001mrl
     *            被收養者-全國個人資料摘要資料
     */
    public void setMainXcdf001mrl(final XCDF001MRL mainXcdf001mrl) {
        this.mainXcdf001mrl = mainXcdf001mrl;
    }

    /**
     * 取得養父-統號
     * 
     * @return 養父-統號
     */
    public String getFosterFatherPersonId() {
        return fosterFatherPersonId;
    }

    /**
     * 設定養父-統號
     * 
     * @param fosterFatherPersonId
     *            養父-統號
     */
    public void setFosterFatherPersonId(final String fosterFatherPersonId) {
        this.fosterFatherPersonId = fosterFatherPersonId;
    }

    /**
     * 取得養父-作業點代碼
     * 
     * @return 養父-作業點代碼
     */
    public String getFosterFatherSiteId() {
        return fosterFatherSiteId;
    }

    /**
     * 設定養父-作業點代碼
     * 
     * @param fosterFatherSiteId
     *            養父-作業點代碼
     */
    public void setFosterFatherSiteId(final String fosterFatherSiteId) {
        this.fosterFatherSiteId = fosterFatherSiteId;
    }

    /**
     * 取得養父-除戶日期
     * 
     * @return 養父-除戶日期
     */
    public String getFosterFatherRemoveYyymmdd() {
        return fosterFatherRemoveYyymmdd;
    }

    /**
     * 設定養父-除戶日期
     * 
     * @param fosterFatherRemoveYyymmdd
     *            養父-除戶日期
     */
    public void setFosterFatherRemoveYyymmdd(final String fosterFatherRemoveYyymmdd) {
        this.fosterFatherRemoveYyymmdd = fosterFatherRemoveYyymmdd;
    }

    /**
     * 取得養父-除戶時間
     * 
     * @return 養父-除戶時間
     */
    public String getFosterFatherRemoveTime() {
        return fosterFatherRemoveTime;
    }

    /**
     * 設定養父-除戶時間
     * 
     * @param fosterFatherRemoveTime
     *            養父-除戶時間
     */
    public void setFosterFatherRemoveTime(final String fosterFatherRemoveTime) {
        this.fosterFatherRemoveTime = fosterFatherRemoveTime;
    }

    /**
     * 取得養父-全戶基本資料
     * 
     * @return 養父-全戶基本資料
     */
    public XLDFHouseholdDataDomainObject getFosterFatherHouseholdData() {
        return fosterFatherHouseholdData;
    }

    /**
     * 設定養父-全戶基本資料
     * 
     * @param fosterFatherHouseholdData
     *            養父-全戶基本資料
     */
    public void setFosterFatherHouseholdData(final XLDFHouseholdDataDomainObject fosterFatherHouseholdData) {
        this.fosterFatherHouseholdData = fosterFatherHouseholdData;
    }

    /**
     * 取得養父-個人基本資料
     * 
     * @return 養父-個人基本資料
     */
    public XLDFPersonDataDomainObject getFosterFatherPersonData() {
        return fosterFatherPersonData;
    }

    /**
     * 設定養父-個人基本資料
     * 
     * @param fosterFatherPersonData
     *            養父-個人基本資料
     */
    public void setFosterFatherPersonData(final XLDFPersonDataDomainObject fosterFatherPersonData) {
        this.fosterFatherPersonData = fosterFatherPersonData;
    }

    /**
     * 取得養父-身分角色
     * 
     * @return 養父-身分角色
     */
    public String getFosterFatherRole() {
        return fosterFatherRole;
    }

    /**
     * 設定養父-身分角色
     * 
     * @param fosterFatherRole
     *            養父-身分角色
     */
    public void setFosterFatherRole(final String fosterFatherRole) {
        this.fosterFatherRole = fosterFatherRole;
    }

    /**
     * 取得養父-簿頁旗標
     * 
     * @return 養父-簿頁旗標
     */
    public String getFosterFatherBookFlag() {
        return fosterFatherBookFlag;
    }

    /**
     * 設定養父-簿頁旗標
     * 
     * @param fosterFatherBookFlag
     *            養父-簿頁旗標
     */
    public void setFosterFatherBookFlag(final String fosterFatherBookFlag) {
        this.fosterFatherBookFlag = fosterFatherBookFlag;
    }

    /**
     * 取得養父-原教育程度註記
     * 
     * @return 養父-原教育程度註記
     */
    public String getFosterFatherOrgEducationMark() {
        return fosterFatherOrgEducationMark;
    }

    /**
     * 設定養父-原教育程度註記
     * 
     * @param fosterFatherOrgEducationMark
     *            養父-原教育程度註記
     */
    public void setFosterFatherOrgEducationMark(final String fosterFatherOrgEducationMark) {
        this.fosterFatherOrgEducationMark = fosterFatherOrgEducationMark;
    }

    /**
     * 取得養父-外籍者資料
     * 
     * @return 養父-外籍者資料
     */
    public XLDFForeignPersonDTO getFosterFatherForeignPersonData() {
        return fosterFatherForeignPersonData;
    }

    /**
     * 設定養父-外籍者資料
     * 
     * @param fosterFatherForeignPersonData
     *            養父-外籍者資料
     */
    public void setFosterFatherForeignPersonData(final XLDFForeignPersonDTO fosterFatherForeignPersonData) {
        this.fosterFatherForeignPersonData = fosterFatherForeignPersonData;
    }

    /**
     * 取得養父-補登個人基本資料
     * 
     * @return 養父-補登個人基本資料
     */
    public Tldf004mType getFosterFatherMemoryPerson() {
        return fosterFatherMemoryPerson;
    }

    /**
     * 設定養父-補登個人基本資料
     * 
     * @param fosterFatherMemoryPerson
     *            養父-補登個人基本資料
     */
    public void setFosterFatherMemoryPerson(final Tldf004mType fosterFatherMemoryPerson) {
        this.fosterFatherMemoryPerson = fosterFatherMemoryPerson;
    }

    /**
     * 取得養母-統號
     * 
     * @return 養母-統號
     */
    public String getFosterMotherPersonId() {
        return fosterMotherPersonId;
    }

    /**
     * 設定養母-統號
     * 
     * @param fosterMotherPersonId
     *            養母-統號
     */
    public void setFosterMotherPersonId(final String fosterMotherPersonId) {
        this.fosterMotherPersonId = fosterMotherPersonId;
    }

    /**
     * 取得養母-作業點代碼
     * 
     * @return 養母-作業點代碼
     */
    public String getFosterMotherSiteId() {
        return fosterMotherSiteId;
    }

    /**
     * 設定養母-作業點代碼
     * 
     * @param fosterMotherSiteId
     *            養母-作業點代碼
     */
    public void setFosterMotherSiteId(final String fosterMotherSiteId) {
        this.fosterMotherSiteId = fosterMotherSiteId;
    }

    /**
     * 取得養母-除戶日期
     * 
     * @return 養母-除戶日期
     */
    public String getFosterMotherRemoveYyymmdd() {
        return fosterMotherRemoveYyymmdd;
    }

    /**
     * 設定養母-除戶日期
     * 
     * @param fosterMotherRemoveYyymmdd
     *            養母-除戶日期
     */
    public void setFosterMotherRemoveYyymmdd(final String fosterMotherRemoveYyymmdd) {
        this.fosterMotherRemoveYyymmdd = fosterMotherRemoveYyymmdd;
    }

    /**
     * 取得養母-除戶時間
     * 
     * @return 養母-除戶時間
     */
    public String getFosterMotherRemoveTime() {
        return fosterMotherRemoveTime;
    }

    /**
     * 設定養母-除戶時間
     * 
     * @param fosterMotherRemoveTime
     *            養母-除戶時間
     */
    public void setFosterMotherRemoveTime(final String fosterMotherRemoveTime) {
        this.fosterMotherRemoveTime = fosterMotherRemoveTime;
    }

    /**
     * 取得養母-全戶基本資料
     * 
     * @return 養母-全戶基本資料
     */
    public XLDFHouseholdDataDomainObject getFosterMotherHouseholdData() {
        return fosterMotherHouseholdData;
    }

    /**
     * 設定養母-全戶基本資料
     * 
     * @param fosterMotherHouseholdData
     *            養母-全戶基本資料
     */
    public void setFosterMotherHouseholdData(final XLDFHouseholdDataDomainObject fosterMotherHouseholdData) {
        this.fosterMotherHouseholdData = fosterMotherHouseholdData;
    }

    /**
     * 取得養母-個人基本資料
     * 
     * @return 養母-個人基本資料
     */
    public XLDFPersonDataDomainObject getFosterMotherPersonData() {
        return fosterMotherPersonData;
    }

    /**
     * 設定養母-個人基本資料
     * 
     * @param fosterMotherPersonData
     *            養母-個人基本資料
     */
    public void setFosterMotherPersonData(final XLDFPersonDataDomainObject fosterMotherPersonData) {
        this.fosterMotherPersonData = fosterMotherPersonData;
    }

    /**
     * 取得養母-身分角色
     * 
     * @return 養母-身分角色
     */
    public String getFosterMotherRole() {
        return fosterMotherRole;
    }

    /**
     * 設定養母-身分角色
     * 
     * @param fosterMotherRole
     *            養母-身分角色
     */
    public void setFosterMotherRole(final String fosterMotherRole) {
        this.fosterMotherRole = fosterMotherRole;
    }

    /**
     * 取得養母-簿頁旗標
     * 
     * @return 養母-簿頁旗標
     */
    public String getFosterMotherBookFlag() {
        return fosterMotherBookFlag;
    }

    /**
     * 設定養母-簿頁旗標
     * 
     * @param fosterMotherBookFlag
     *            養母-簿頁旗標
     */
    public void setFosterMotherBookFlag(final String fosterMotherBookFlag) {
        this.fosterMotherBookFlag = fosterMotherBookFlag;
    }

    /**
     * 取得養母-原教育程度註記
     * 
     * @return 養母-原教育程度註記
     */
    public String getFosterMotherOrgEducationMark() {
        return fosterMotherOrgEducationMark;
    }

    /**
     * 設定養母-原教育程度註記
     * 
     * @param fosterMotherOrgEducationMark
     *            養母-原教育程度註記
     */
    public void setFosterMotherOrgEducationMark(final String fosterMotherOrgEducationMark) {
        this.fosterMotherOrgEducationMark = fosterMotherOrgEducationMark;
    }

    /**
     * 取得養母-外籍者資料
     * 
     * @return 養母-外籍者資料
     */
    public XLDFForeignPersonDTO getFosterMotherForeignPersonData() {
        return fosterMotherForeignPersonData;
    }

    /**
     * 設定養母-外籍者資料
     * 
     * @param fosterMotherForeignPersonData
     *            養母-外籍者資料
     */
    public void setFosterMotherForeignPersonData(final XLDFForeignPersonDTO fosterMotherForeignPersonData) {
        this.fosterMotherForeignPersonData = fosterMotherForeignPersonData;
    }

    /**
     * 取得養母-補登個人基本資料
     * 
     * @return 養母-補登個人基本資料
     */
    public Tldf004mType getFosterMotherMemoryPerson() {
        return fosterMotherMemoryPerson;
    }

    /**
     * 設定養母-補登個人基本資料
     * 
     * @param fosterMotherMemoryPerson
     *            養母-補登個人基本資料
     */
    public void setFosterMotherMemoryPerson(final Tldf004mType fosterMotherMemoryPerson) {
        this.fosterMotherMemoryPerson = fosterMotherMemoryPerson;
    }

    /**
     * 取得收養日期
     * 
     * @return 收養日期
     */
    public String getBusinessDate() {
        return businessDate;
    }

    /**
     * 設定收養日期
     * 
     * @param businessDate
     *            收養日期
     */
    public void setBusinessDate(final String businessDate) {
        this.businessDate = businessDate;
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
     * 取得其他附繳證件
     * 
     * @return 其他附繳證件
     */
    public String getOtherCertificate() {
        return otherCertificate;
    }

    /**
     * 設定其他附繳證件
     * 
     * @param otherCertificate
     *            其他附繳證件
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
     * 取得個人記事欄位化清單
     * 
     * @return 個人記事欄位化清單
     */
    public List<XLDFY061M> getPersonNoteDetailList() {
        return personNoteDetailList;
    }

    /**
     * 設定個人記事欄位化清單
     * 
     * @param personNoteDetailList
     *            個人記事欄位化清單
     */
    public void setPersonNoteDetailList(final List<XLDFY061M> personNoteDetailList) {
        this.personNoteDetailList = personNoteDetailList;
    }

    /**
     * 取得除戶個人記事欄位化清單
     * 
     * @return 除戶個人記事欄位化清單
     */
    public List<XLDFY061H> getRemovedPersonNoteDetailList() {
        return removedPersonNoteDetailList;
    }

    /**
     * 設定除戶個人記事欄位化清單
     * 
     * @param removedPersonNoteDetailList
     *            除戶個人記事欄位化清單
     */
    public void setRemovedPersonNoteDetailList(final List<XLDFY061H> removedPersonNoteDetailList) {
        this.removedPersonNoteDetailList = removedPersonNoteDetailList;
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
     * 取得頁面控制:養父資料是否顯示
     * 
     * @return 頁面控制:養父資料是否顯示
     */
    public boolean isFosterFatherRendered() {
        return fosterFatherRendered;
    }

    /**
     * 設定頁面控制:養父資料是否顯示
     * 
     * @param fosterFatherRendered
     *            頁面控制:養父資料是否顯示
     */
    public void setFosterFatherRendered(final boolean fosterFatherRendered) {
        this.fosterFatherRendered = fosterFatherRendered;
    }

    /**
     * 取得頁面控制:養母資料是否顯示
     * 
     * @return 頁面控制:養母資料是否顯示
     */
    public boolean isFosterMotherRendered() {
        return fosterMotherRendered;
    }

    /**
     * 設定頁面控制:養母資料是否顯示
     * 
     * @param fosterMotherRendered
     *            頁面控制:養母資料是否顯示
     */
    public void setFosterMotherRendered(final boolean fosterMotherRendered) {
        this.fosterMotherRendered = fosterMotherRendered;
    }

    /**
     * 取得親等關係訊息
     * 
     * @return 親等關係訊息
     */
    public String getKinshipRelationMessage() {
        return kinshipRelationMessage;
    }

    /**
     * 設定親等關係訊息
     * 
     * @param kinshipRelationMessage
     *            親等關係訊息
     */
    public void setKinshipRelationMessage(final String kinshipRelationMessage) {
        this.kinshipRelationMessage = kinshipRelationMessage;
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
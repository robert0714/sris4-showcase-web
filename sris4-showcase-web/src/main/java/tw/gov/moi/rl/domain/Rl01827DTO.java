/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import org.apache.commons.lang.StringUtils;

import tw.gov.moi.ae.checker.annotation.FieldName;
import tw.gov.moi.domain.XldfefaplcType;
import tw.gov.moi.rl.common.constant.RlConstant;
import tw.gov.moi.rl.component.dto.OpeningOperationDTO;
import tw.gov.moi.rl.component.dto.XLDFDomainObject;
import tw.gov.moi.rl.component.dto.XLDFRegDetailObnfParams;
import tw.gov.moi.rl.component.xldf.dto.XCDF001MRL;
import tw.gov.moi.rl.component.xldf.dto.XLDFM10H;
import tw.gov.moi.rl.component.xldf.dto.XLDFM10M;
import tw.gov.moi.rl.component.xldf.dto.XLDFX09QH;
import tw.gov.moi.rl.component.xldf.dto.XLDFX09QM;
import tw.gov.moi.rl.component.xldf.dto.XLDFY09QH;
import tw.gov.moi.rl.component.xldf.dto.XLDFY09QM;
import tw.gov.moi.rl.domain.xldf.XLDFHouseholdDataDomainObject;
import tw.gov.moi.rl.domain.xldf.XLDFHouseholdNoteDomainObject;
import tw.gov.moi.rl.domain.xldf.XLDFPersonDataDomainObject;
import tw.gov.moi.rl.domain.xldf.XLDFPersonNoteDomainObject;

/**
 * 撤銷廢止戶籍登記DTO.
 * 
 * @author Viva.Hong
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Rl01827DTO", propOrder = { "transactionId", "acceptSiteId", "userId", "initTime",
        "acceptAdminOfficeCode", "acceptAreaCode", "openingOperationDTO", "systemDate", "systemTime", "applyCode",
        "crossSiteEnabled", "delHousePersonIdMap", "unDelXCDF001MRLMap", "delHouseNonPersonList", "unDelPersonIdMap",
        "idNameMap", "xldfyxxhMap", "householdNoteFlag", "xldf004mDataFlag", "changeIsNewHouseholdFlag",
        "goBackHouseholdFlag", "currentUnDelPersonDataObject", "initErrorMessageList", "addPersonErrorMsgMap",
        "warningMessgeList", "addPersonErrorMessageList", "flagCreateXLDFPersonDataFlag", "manCount", "womanCount",
        "targetPersonData", "fineList", "regObnfList", "householdNoteList", "personNoteList", "xldfx09qmList",
        "xldfx09qhList", "xldfy09qmList", "xldfy09qhList", "certificateList", "registerDate", "registerTime",
        "applyDate", "enforcedFlag", "enforcedApplicant", "webHouseholdData", "webHouseholdHeadPersonData",
        "webHouseholdHeadSiteId", "webHouseholdHeadId", "webHouseholdId", "isNewHousehold", "oldHouseholdId",
        "delHouseholdData", "oldHouseholdData", "oldHouseholdHeadPersonData", "newHouseholdId", "newHouseholdMap",
        "newHouseholdData", "unDelPersonDataList", "personNoteFlag", "delYyymmdd", "approveNationalityDate",
        "delReason", "delReasonCode", "otherCertificate", "registerContent", "needFineFlag", "removeFeeReason",
        "fineSerialNumber", "feeAmount", "receiptId", "applySeq", "applyCaseNo", "fineEventDate", "operationCode",
        "applySequenceId", "doFineCheckFlag", "deleteFineDTOFlag", "previousDoFineCheckFlag", "previousFineEventDate",
        "fineFreeFlag", "doFineCheckFlagOpen", "fineDTO", "personId", "acceptAdminOfficeName", "settleCityCountyName",
        "settleTownName", "sealApplyYyymmdd", "apply1", "apply1Relatioinship", "apply2", "apply2Relatioinship",
        "delegated", "finePerson", "m10mList", "viewM10m", "viewPostiveApplication", "selectedM10m",
        "selectedPostiveApplication", "m10hList", "viewM10h", "selectedM10h", "otherCertificateFlag", "initSuccess",
        "activeIndex", "lockMode", "delReasonName", "bigHousehole" })
@XmlRootElement(name = "Rl01827DTO")
public class Rl01827DTO implements Serializable {

    /** serialVersion UID. */
    private static final long serialVersionUID = 1L;

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

    /** 受理地戶所代碼. */
    @XmlElement(name = "AcceptAdminOfficeCode", required = true)
    @FieldName("受理地戶所代碼")
    private String acceptAdminOfficeCode;

    /** 受理地行政區域代碼. */
    @XmlElement(name = "AcceptAreaCode", required = true)
    @FieldName("受理地行政區域代碼")
    private String acceptAreaCode;

    /** 大簿控制各作業之資訊. */
    @XmlElement(name = "OpeningOperationDTO", required = true)
    @FieldName("大簿控制各作業之資訊")
    private OpeningOperationDTO openingOperationDTO;

    /** 系統日期. */
    @XmlElement(name = "SystemDate", required = true)
    @FieldName("系統日期")
    private String systemDate;

    /** 系統時間. */
    @XmlElement(name = "SystemTime", required = true)
    @FieldName("系統時間")
    private String systemTime;

    /** 申請書類別. */
    @XmlElement(name = "ApplyCode", required = true)
    @FieldName("申請書類別")
    private String applyCode;

    /** 是否可異地辦理. */
    @XmlElement(name = "CrossSiteEnabled", required = true)
    @FieldName("是否可異地辦理")
    private String crossSiteEnabled;

    /** 廢止戶籍時的原住地人員-統號-人員物件MAP. */
    @XmlElement(name = "DelHousePersonIdMap", required = true)
    @FieldName("廢止戶籍時的原住地人員-統號-人員物件MAP")
    private Map<String, UnDelPersonDataObject> delHousePersonIdMap = new HashMap<String, UnDelPersonDataObject>();

    /** 撤銷廢止戶籍者-統號-XCDF001MRL物件MAP. */
    @XmlElement(name = "UnDelXCDF001MRLMap", required = true)
    @FieldName("撤銷廢止戶籍者-統號-XCDF001MRL物件MAP")
    private Map<String, XCDF001MRL> unDelXCDF001MRLMap = new HashMap<String, XCDF001MRL>();

    /** 廢止戶籍時的原住地人員-非現住人口清單. */
    @XmlElement(name = "DelHouseNonPersonList", required = true)
    @FieldName("廢止戶籍時的原住地人員-非現住人口清單")
    private List<XLDFDomainObject> delHouseNonPersonList;

    /** 撤銷廢止戶籍者-統號MAP. */
    @XmlElement(name = "UnDelPersonIdMap", required = true)
    @FieldName("撤銷廢止戶籍者-統號MAP")
    private Map<String, UnDelPersonDataObject> unDelPersonIdMap = new HashMap<String, UnDelPersonDataObject>();

    /** 統號姓名對應資料. */
    @XmlElement(name = "IdNameMap", required = true)
    @FieldName("統號姓名對應資料")
    private Map<String, String> idNameMap = new HashMap<String, String>();

    /** 個人記事欄位化清單. */
    @XmlElement(name = "XldfyxxhMap", required = true)
    @FieldName("個人記事欄位化清單 ")
    private Map<String, XLDFDomainObject> xldfyxxhMap = new HashMap<String, XLDFDomainObject>();

    /** 撤銷廢止戶籍者-全戶記事類別旗標. */
    @XmlElement(name = "HouseholdNoteFlag", required = true)
    @FieldName("撤銷廢止戶籍者-全戶記事類別旗標")
    private Boolean householdNoteFlag = false;

    /** xldf004m資料旗標 「true：表示有資料」. */
    @XmlElement(name = "Xldf004mDataFlag", required = true)
    @FieldName("xldf004m資料旗標 「true：表示有資料」")
    private Boolean xldf004mDataFlag = false;

    /** 是否能改變自立新戶旗標. */
    @XmlElement(name = "ChangeIsNewHouseholdFlag", required = true)
    @FieldName("是否能改變自立新戶旗標")
    private Boolean changeIsNewHouseholdFlag = false;

    /** 回原戶旗標. */
    @XmlElement(name = "GoBackHouseholdFlag", required = true)
    @FieldName("回原戶旗標")
    private Boolean goBackHouseholdFlag = false;

    /** 當下的撤銷廢止戶籍者(用於「檢核撤銷廢止戶籍者個人資料」、「組合記事」). */
    @XmlElement(name = "CurrentUnDelPersonDataObject", required = true)
    @FieldName("當下的撤銷廢止戶籍者(用於「檢核撤銷廢止戶籍者個人資料」、「組合記事」)")
    private UnDelPersonDataObject currentUnDelPersonDataObject;

    /** 初始1827時的錯誤訊息清單. */
    @XmlElement(name = "InitErrorMessageList", required = true)
    @FieldName("初始1827時的錯誤訊息清單")
    private List<List<String>> initErrorMessageList = new ArrayList<List<String>>();

    /** 新增廢止戶籍者的錯誤訊息. */
    @XmlElement(name = "AddPersonErrorMsgMap", required = true)
    @FieldName("新增廢止戶籍者的錯誤訊息")
    private Map<String, List<List<String>>> addPersonErrorMsgMap = new HashMap<String, List<List<String>>>();;

    /** 警告訊息清單. */
    @XmlElement(name = "DelXLDF004NMap", required = true)
    @FieldName("警告訊息清單")
    private List<List<String>> warningMessgeList = new ArrayList<List<String>>();

    /** 新增撤銷廢止戶籍者錯誤訊息清單. */
    @XmlElement(name = "AddPersonErrorMessageList", required = true)
    @FieldName("新增撤銷廢止戶籍者錯誤訊息清單")
    private List<List<String>> addPersonErrorMessageList = new ArrayList<List<String>>();

    /** f:生父、m:生母、p:撤銷廢止戶籍者. */
    @XmlElement(name = "FlagCreateXLDFPersonDataFlag", required = true)
    @FieldName("f:生父、m:生母、p:撤銷廢止戶籍者")
    private String flagCreateXLDFPersonDataFlag;

    /** 撤銷廢止戶籍者-男性人數. */
    @XmlElement(name = "ManCount", required = true)
    @FieldName("撤銷廢止戶籍者-男性人數")
    private int manCount = 0;

    /** 撤銷廢止戶籍者-女性人數. */
    @XmlElement(name = "WomanCount", required = true)
    @FieldName("撤銷廢止戶籍者-女性人數")
    private int womanCount = 0;

    /** 撤銷廢止戶籍者-大簿當事人(自立新戶時的戶長). */
    @XmlElement(name = "TargetPersonData", required = true)
    @FieldName("撤銷廢止戶籍者-大簿當事人(自立新戶時的戶長)")
    private UnDelPersonDataObject targetPersonData = new UnDelPersonDataObject();

    /** 罰鍰記事清單. */
    @XmlElement(name = "FineList", required = true)
    @FieldName("罰鍰記事清單")
    private List<XLDFOperationFineDTO> fineList = new ArrayList<XLDFOperationFineDTO>();

    /** 特殊通報. */
    @XmlElement(name = "RegObnfList", required = true)
    @FieldName("特殊通報")
    private List<XLDFRegDetailObnfParams> regObnfList = new ArrayList<XLDFRegDetailObnfParams>();

    /** 全戶記事清單. */
    @XmlElement(name = "HouseholdNoteList", required = true)
    @FieldName("全戶記事清單")
    private List<XLDFHouseholdNoteDomainObject> householdNoteList = new ArrayList<XLDFHouseholdNoteDomainObject>();

    /** 個人記事清單. */
    @XmlElement(name = "PersonNoteList", required = true)
    @FieldName("個人記事清單")
    private List<XLDFPersonNoteDomainObject> personNoteList = new ArrayList<XLDFPersonNoteDomainObject>();

    /** 全戶記事欄位化-現戶物件清單. */
    @XmlElement(name = "Xldfx09qmList", required = true)
    @FieldName("全戶記事欄位化-現戶物件清單")
    private List<XLDFX09QM> xldfx09qmList = new ArrayList<XLDFX09QM>();

    /** 全戶記事欄位化-除戶物件清單. */
    @XmlElement(name = "Xldfx09qhList", required = true)
    @FieldName("全戶記事欄位化-除戶物件清單")
    private List<XLDFX09QH> xldfx09qhList = new ArrayList<XLDFX09QH>();

    /** 個人記事欄位化-現戶物件清單. */
    @XmlElement(name = "Xldfy09qmList", required = true)
    @FieldName("個人記事欄位化-現戶物件清單")
    private List<XLDFY09QM> xldfy09qmList = new ArrayList<XLDFY09QM>();

    /** 個人記事欄位化-除戶物件清單. */
    @XmlElement(name = "Xldfy09qhList", required = true)
    @FieldName("個人記事欄位化-除戶物件清單")
    private List<XLDFY09QH> xldfy09qhList = new ArrayList<XLDFY09QH>();

    /** 附繳證件清單. */
    @XmlElement(name = "CertificateList", required = true)
    @FieldName("附繳證件清單")
    private List<String> certificateList = new ArrayList<String>();

    /** 登記日期. */
    @XmlElement(name = "RegisterDate", required = true)
    @FieldName("登記日期")
    private String registerDate;

    /** 登記時間. */
    @XmlElement(name = "RegisterTime", required = true)
    @FieldName("登記時間")
    private String registerTime;

    /** 申請日期. */
    @XmlElement(name = "ApplyDate", required = true)
    @FieldName("申請日期")
    private String applyDate;

    /** 逕為登記旗標. */
    @XmlElement(name = "EnforcedFlag", required = true)
    @FieldName("逕為登記旗標")
    private String enforcedFlag;

    /** 逕為登記申請人. */
    @XmlElement(name = "EnforcedApplicant", required = true)
    @FieldName("逕為登記申請人")
    private XldfefaplcType enforcedApplicant;

    /** 畫面-全戶基本資料. */
    @XmlElement(name = "WebHouseholdData", required = true)
    @FieldName(" 畫面-全戶基本資料")
    private XLDFHouseholdDataDomainObject webHouseholdData;

    /** 畫面-戶長-個人基本資料. */
    @XmlElement(name = "WebHouseholdHeadPersonData", required = true)
    @FieldName("畫面-戶長-個人基本資料")
    private XLDFPersonDataDomainObject webHouseholdHeadPersonData;

    /** 畫面-全戶基本資料區塊-作業點代碼. */
    @XmlElement(name = "WebHouseholdHeadSiteId", required = true)
    @FieldName("畫面-全戶基本資料區塊-作業點代碼")
    private String webHouseholdHeadSiteId;

    /** 畫面-全戶基本資料區塊-戶長統號. */
    @XmlElement(name = "WebHouseholdHeadId", required = true)
    @FieldName("畫面-全戶基本資料區塊-戶長統號")
    private String webHouseholdHeadId;

    /** 畫面-全戶基本資料區塊-戶號. */
    @XmlElement(name = "WebHouseholdId", required = true)
    @FieldName("畫面-全戶基本資料區塊-戶號")
    private String webHouseholdId;

    /** 是否自立新戶. */
    @XmlElement(name = "IsNewHousehold", required = true)
    @FieldName("是否自立新戶")
    private String isNewHousehold = RlConstant.STRING_TWO;

    /** 戶號(非自立新戶). */
    @XmlElement(name = "OldHouseholdId", required = true)
    @FieldName("戶號(非自立新戶)")
    private String oldHouseholdId;

    /** 廢止戶籍時的全戶基本資料(原住地). */
    @XmlElement(name = "DelHouseholdData", required = true)
    @FieldName("廢止戶籍時的全戶基本資料(原住地)")
    private XLDFHouseholdDataDomainObject delHouseholdData;

    /** 全戶基本資料(非自立新戶). */
    @XmlElement(name = "OldHouseholdData", required = true)
    @FieldName("全戶基本資料(非自立新戶)")
    private XLDFHouseholdDataDomainObject oldHouseholdData;

    /** 戶長-個人基本資料(非自立新戶). */
    @XmlElement(name = "OldHouseholdHeadPersonData", required = true)
    @FieldName("戶長-個人基本資料(非自立新戶)")
    private XLDFPersonDataDomainObject oldHouseholdHeadPersonData;

    /** 新戶號. */
    @XmlElement(name = "NewHouseholdId", required = true)
    @FieldName("新戶號")
    private String newHouseholdId;

    /** 新戶號Map. */
    @XmlElement(name = "NewHouseholdMap", required = true)
    @FieldName("新戶號Map ")
    private Map<String, String> newHouseholdMap = new HashMap<String, String>();

    /** 全戶基本資料(自立新戶). */
    @XmlElement(name = "NewHouseholdData", required = true)
    @FieldName("全戶基本資料(自立新戶)")
    private XLDFHouseholdDataDomainObject newHouseholdData;

    /** 撤銷廢止戶籍者資料清單. */
    @XmlElement(name = "UnDelPersonDataList", required = true)
    @FieldName("撤銷廢止戶籍者資料清單")
    private List<UnDelPersonDataObject> unDelPersonDataList = new ArrayList<UnDelPersonDataObject>();

    /** 撤銷廢止戶籍者-個人記事代碼. */
    @XmlElement(name = "PersonNoteFlag", required = true)
    @FieldName("撤銷廢止戶籍者-個人記事代碼")
    private String personNoteFlag;

    /** 撤銷廢止日期. */
    @XmlElement(name = "DelYyymmdd", required = true)
    @FieldName("撤銷廢止日期")
    private String delYyymmdd;

    /** 核准撤銷喪失國籍日期. */
    @XmlElement(name = "ApproveNationalityDate", required = true)
    @FieldName("核准撤銷喪失國籍日期")
    private String approveNationalityDate;

    /** 撤銷原因. */
    @XmlElement(name = "DelReason", required = true)
    @FieldName("撤銷原因")
    private String delReason;

    /** 撤銷原因代碼. */
    @XmlElement(name = "DelReasonCode", required = true)
    @FieldName("撤銷原因代碼")
    private String delReasonCode;

    /** 其他附繳證件名稱. */
    @XmlElement(name = "OtherCertificate", required = true)
    @FieldName("其他附繳證件名稱")
    private String otherCertificate = StringUtils.EMPTY;

    /** 申請書備註. */
    @XmlElement(name = "RegisterContent", required = true)
    @FieldName(" 申請書備註")
    private String registerContent;

    /** 判斷是否罰鍰旗標. */
    @XmlElement(name = "NeedFineFlag", required = true)
    @FieldName("判斷是否罰鍰旗標")
    private String needFineFlag = RlConstant.NO_CHAR;

    /** 免罰原因. */
    @XmlElement(name = "RemoveFeeReason", required = true)
    @FieldName("免罰原因")
    private String removeFeeReason = StringUtils.EMPTY;

    /** 罰鍰裁處書識別序號. */
    @XmlElement(name = "fineSerialNumber")
    @FieldName("罰鍰裁處書識別序號")
    private String fineSerialNumber = StringUtils.EMPTY;

    /** 戶籍罰鍰金額. */
    @XmlElement(name = "feeAmount")
    @FieldName("戶籍罰鍰金額")
    private String feeAmount = StringUtils.EMPTY;

    /** 收據號碼. */
    @XmlElement(name = "receiptId")
    @FieldName("收據號碼")
    private String receiptId = StringUtils.EMPTY;

    /** 申請書流水號. */
    @XmlElement(name = "ApplySeq", required = true)
    @FieldName("申請書流水號")
    private String applySeq;

    /** 申登案別. */
    @XmlElement(name = "ApplyCaseNo", required = true)
    @FieldName("申登案別")
    private String applyCaseNo;

    /** 事件發生(確定)日期. */
    @XmlElement(name = "FineEventDate", required = true)
    @FieldName("事件發生(確定)日期")
    private String fineEventDate;

    /** 作業代碼. */
    @XmlElement(name = "OperationCode", required = true)
    @FieldName("作業代碼")
    private String operationCode;

    /** 作業順序編號. */
    @XmlElement(name = "ApplySequenceId", required = true)
    @FieldName("作業順序編號")
    private String applySequenceId;

    /** 進行逾期申報之罰鍰檢視. */
    @XmlElement(name = "DoFineCheckFlag", required = true)
    @FieldName("進行逾期申報之罰鍰檢視")
    private boolean doFineCheckFlag;

    /** 刪除罰鍰處理資料旗標. */
    @XmlElement(name = "DeleteFineDTOFlag", required = true)
    @FieldName("刪除罰鍰處理資料旗標")
    private boolean deleteFineDTOFlag;

    /** 前一次資料驗證之是否進行逾期申報之罰鍰檢視旗標. */
    @XmlElement(name = "PreviousDoFineCheckFlag", required = true)
    @FieldName("前一次資料驗證之是否進行逾期申報之罰鍰檢視旗標")
    private boolean previousDoFineCheckFlag;

    /** 前一次資料驗證之事件發生(確定)日期. */
    @XmlElement(name = "PreviousFineEventDate", required = true)
    @FieldName("前一次資料驗證之事件發生(確定)日期")
    private String previousFineEventDate;

    /** 免罰旗標. */
    @XmlElement(name = "FineFreeFlag", required = true)
    @FieldName("免罰旗標")
    private boolean fineFreeFlag;

    /** 旗標-進行逾期申報之罰鍰檢視. */
    @XmlElement(name = "DoFineCheckFlagOpen", required = true)
    @FieldName("旗標-進行逾期申報之罰鍰檢視")
    private boolean doFineCheckFlagOpen;

    /** 罰鍰處理資料. */
    @XmlElement(name = "FineDTO", required = true)
    @FieldName("罰鍰處理資料")
    private FineDTO fineDTO = new FineDTO();

    /** 新增撤銷廢止戶籍者視窗-國民身分證統一編號. */
    @XmlElement(name = "PersonId", required = true)
    @FieldName("新增撤銷廢止戶籍者視窗-國民身分證統一編號  ")
    private String personId;

    /** 受理地戶政事務所名稱. */
    @XmlElement(name = "AcceptAdminOfficeName", required = true)
    @FieldName("受理地戶政事務所名稱")
    private String acceptAdminOfficeName;

    /** 戶籍地址-省市縣市名稱. */
    @XmlElement(name = "SettleCityCountyName", required = true)
    @FieldName("戶籍地址-省市縣市名稱")
    private String settleCityCountyName;

    /** 戶籍地址-鄉鎮市區名稱. */
    @XmlElement(name = "SettleTownName", required = true)
    @FieldName("戶籍地址-鄉鎮市區名稱")
    private String settleTownName;

    /** 印登日期. */
    @XmlElement(name = "SealApplyYyymmdd", required = true)
    @FieldName("印登日期")
    private String sealApplyYyymmdd;

    /** 申請人1. */
    @XmlElement(name = "Apply1", required = true)
    @FieldName("申請人1")
    private XLDFApplicantDataDTO apply1;

    /** 申請人1-與當事人關係. */
    @XmlElement(name = "Apply1Relatioinship", required = true)
    @FieldName("申請人1-與當事人關係")
    private String apply1Relatioinship;

    /** 申請人2. */
    @XmlElement(name = "Apply2", required = true)
    @FieldName(" 申請人2")
    private XLDFApplicantDataDTO apply2;

    /** 申請人2-與當事人關係. */
    @XmlElement(name = "Apply2Relatioinship", required = true)
    @FieldName("申請人2-與當事人關係")
    private String apply2Relatioinship;

    /** 受委託人. */
    @XmlElement(name = "Delegated", required = true)
    @FieldName("受委託人")
    private XLDFPersonBriefDataDTO delegated;

    /** 受處分人. */
    @XmlElement(name = "FinePerson", required = true)
    @FieldName("受處分人")
    private XLDFApplicantDataDTO finePerson = new XLDFApplicantDataDTO();

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

    /** 擬廢止之原登記申請書紀錄清單. */
    @XmlElement(name = "M10hList", required = true)
    @FieldName("擬廢止之原登記申請書紀錄清單")
    private List<XLDFM10H> m10hList = new ArrayList<XLDFM10H>();

    /** 檢視的擬廢止之原登記申請書紀錄. */
    @XmlElement(name = "ViewM10h", required = true)
    @FieldName("檢視的擬廢止之原登記申請書紀錄")
    private XLDFM10H viewM10h;

    /** 選取的擬廢止之原登記申請書紀錄. */
    @XmlElement(name = "SelectedM10h", required = true)
    @FieldName("選取的擬廢止之原登記申請書紀錄")
    private XLDFM10H selectedM10h;

    /** 旗標:其他附繳證件. */
    @XmlElement(name = "OtherCertificateFlag", required = true)
    @FieldName("旗標:其他附繳證件")
    private boolean otherCertificateFlag = false;

    /** 初始化是否成功. */
    @XmlElement(name = "InitSuccess", required = true)
    @FieldName("初始化是否成功")
    private boolean initSuccess = true;

    /** 頁籤索引. */
    @XmlElement(name = "ActiveIndex", required = true)
    @FieldName("頁籤索引")
    private String activeIndex;

    /** 鎖定頁面元件. */
    @XmlElement(name = "LockMode", required = true)
    @FieldName("鎖定頁面元件")
    private boolean lockMode = false;

    /** 廢止原因. */
    @XmlElement(name = "DelReasonName", required = true)
    @FieldName("廢止原因")
    private String delReasonName;

    /** 是否為大戶. */
    @XmlElement(name = "BigHousehole", required = true)
    @FieldName("是否為大戶")
    private boolean bigHousehole = false;

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
    public void setOpeningOperationDTO(final OpeningOperationDTO openingOperationDTO) {
        this.openingOperationDTO = openingOperationDTO;
    }

    /**
     * Gets the system date.
     * 
     * @return the system date
     */
    public String getSystemDate() {
        return systemDate;
    }

    /**
     * Sets the system date.
     * 
     * @param systemDate
     *            the new system date
     */
    public void setSystemDate(final String systemDate) {
        this.systemDate = systemDate;
    }

    /**
     * Gets the system time.
     * 
     * @return the system time
     */
    public String getSystemTime() {
        return systemTime;
    }

    /**
     * Sets the system time.
     * 
     * @param systemTime
     *            the new system time
     */
    public void setSystemTime(final String systemTime) {
        this.systemTime = systemTime;
    }

    /**
     * Gets the apply code.
     * 
     * @return the apply code
     */
    public String getApplyCode() {
        return applyCode;
    }

    /**
     * Sets the apply code.
     * 
     * @param applyCode
     *            the new apply code
     */
    public void setApplyCode(final String applyCode) {
        this.applyCode = applyCode;
    }

    /**
     * Gets the cross site enabled.
     * 
     * @return the cross site enabled
     */
    public String getCrossSiteEnabled() {
        return crossSiteEnabled;
    }

    /**
     * Sets the cross site enabled.
     * 
     * @param crossSiteEnabled
     *            the new cross site enabled
     */
    public void setCrossSiteEnabled(final String crossSiteEnabled) {
        this.crossSiteEnabled = crossSiteEnabled;
    }

    /**
     * Gets the del house person id map.
     * 
     * @return the del house person id map
     */
    public Map<String, UnDelPersonDataObject> getDelHousePersonIdMap() {
        return delHousePersonIdMap;
    }

    /**
     * Sets the del house person id map.
     * 
     * @param delHousePersonIdMap
     *            the del house person id map
     */
    public void setDelHousePersonIdMap(final Map<String, UnDelPersonDataObject> delHousePersonIdMap) {
        this.delHousePersonIdMap = delHousePersonIdMap;
    }

    /**
     * Gets the un del xcd f001 mrl map.
     * 
     * @return the un del xcd f001 mrl map
     */
    public Map<String, XCDF001MRL> getUnDelXCDF001MRLMap() {
        return unDelXCDF001MRLMap;
    }

    /**
     * Sets the un del xcd f001 mrl map.
     * 
     * @param unDelXCDF001MRLMap
     *            the un del xcd f001 mrl map
     */
    public void setUnDelXCDF001MRLMap(final Map<String, XCDF001MRL> unDelXCDF001MRLMap) {
        this.unDelXCDF001MRLMap = unDelXCDF001MRLMap;
    }

    /**
     * Gets the del house non person list.
     * 
     * @return the del house non person list
     */
    public List<XLDFDomainObject> getDelHouseNonPersonList() {
        return delHouseNonPersonList;
    }

    /**
     * Sets the del house non person list.
     * 
     * @param delHouseNonPersonList
     *            the new del house non person list
     */
    public void setDelHouseNonPersonList(final List<XLDFDomainObject> delHouseNonPersonList) {
        this.delHouseNonPersonList = delHouseNonPersonList;
    }

    /**
     * Gets the un del person id map.
     * 
     * @return the un del person id map
     */
    public Map<String, UnDelPersonDataObject> getUnDelPersonIdMap() {
        return unDelPersonIdMap;
    }

    /**
     * Sets the un del person id map.
     * 
     * @param unDelPersonIdMap
     *            the un del person id map
     */
    public void setUnDelPersonIdMap(final Map<String, UnDelPersonDataObject> unDelPersonIdMap) {
        this.unDelPersonIdMap = unDelPersonIdMap;
    }

    /**
     * Gets the id name map.
     * 
     * @return the id name map
     */
    public Map<String, String> getIdNameMap() {
        return idNameMap;
    }

    /**
     * Sets the id name map.
     * 
     * @param idNameMap
     *            the new id name map
     */
    public void setIdNameMap(final Map<String, String> idNameMap) {
        this.idNameMap = idNameMap;
    }

    /**
     * Gets the household note flag.
     * 
     * @return the household note flag
     */
    public Boolean getHouseholdNoteFlag() {
        return householdNoteFlag;
    }

    /**
     * Sets the household note flag.
     * 
     * @param householdNoteFlag
     *            the new household note flag
     */
    public void setHouseholdNoteFlag(final Boolean householdNoteFlag) {
        this.householdNoteFlag = householdNoteFlag;
    }

    /**
     * Gets the xldf004m data flag.
     * 
     * @return the xldf004m data flag
     */
    public Boolean getXldf004mDataFlag() {
        return xldf004mDataFlag;
    }

    /**
     * Sets the xldf004m data flag.
     * 
     * @param xldf004mDataFlag
     *            the new xldf004m data flag
     */
    public void setXldf004mDataFlag(final Boolean xldf004mDataFlag) {
        this.xldf004mDataFlag = xldf004mDataFlag;
    }

    /**
     * Gets the change is new household flag.
     * 
     * @return the change is new household flag
     */
    public Boolean getChangeIsNewHouseholdFlag() {
        return changeIsNewHouseholdFlag;
    }

    /**
     * Sets the change is new household flag.
     * 
     * @param changeIsNewHouseholdFlag
     *            the new change is new household flag
     */
    public void setChangeIsNewHouseholdFlag(final Boolean changeIsNewHouseholdFlag) {
        this.changeIsNewHouseholdFlag = changeIsNewHouseholdFlag;
    }

    /**
     * Gets the go back household flag.
     * 
     * @return the go back household flag
     */
    public Boolean getGoBackHouseholdFlag() {
        return goBackHouseholdFlag;
    }

    /**
     * Sets the go back household flag.
     * 
     * @param goBackHouseholdFlag
     *            the new go back household flag
     */
    public void setGoBackHouseholdFlag(final Boolean goBackHouseholdFlag) {
        this.goBackHouseholdFlag = goBackHouseholdFlag;
    }

    /**
     * Gets the current un del person data object.
     * 
     * @return the current un del person data object
     */
    public UnDelPersonDataObject getCurrentUnDelPersonDataObject() {
        return currentUnDelPersonDataObject;
    }

    /**
     * Sets the current un del person data object.
     * 
     * @param currentUnDelPersonDataObject
     *            the new current un del person data object
     */
    public void setCurrentUnDelPersonDataObject(final UnDelPersonDataObject currentUnDelPersonDataObject) {
        this.currentUnDelPersonDataObject = currentUnDelPersonDataObject;
    }

    /**
     * Gets the inits the error message list.
     * 
     * @return the inits the error message list
     */
    public List<List<String>> getInitErrorMessageList() {
        return initErrorMessageList;
    }

    /**
     * Sets the inits the error message list.
     * 
     * @param initErrorMessageList
     *            the new inits the error message list
     */
    public void setInitErrorMessageList(final List<List<String>> initErrorMessageList) {
        this.initErrorMessageList = initErrorMessageList;
    }

    /**
     * Gets the adds the person error msg map.
     * 
     * @return the adds the person error msg map
     */
    public Map<String, List<List<String>>> getAddPersonErrorMsgMap() {
        return addPersonErrorMsgMap;
    }

    /**
     * Sets the add person error msg map.
     * 
     * @param addPersonErrorMsgMap
     *            the add person error msg map
     */
    public void setAddPersonErrorMsgMap(final Map<String, List<List<String>>> addPersonErrorMsgMap) {
        this.addPersonErrorMsgMap = addPersonErrorMsgMap;
    }

    /**
     * Gets the warning messge list.
     * 
     * @return the warning messge list
     */
    public List<List<String>> getWarningMessgeList() {
        return warningMessgeList;
    }

    /**
     * Sets the warning messge list.
     * 
     * @param warningMessgeList
     *            the new warning messge list
     */
    public void setWarningMessgeList(final List<List<String>> warningMessgeList) {
        this.warningMessgeList = warningMessgeList;
    }

    /**
     * Gets the adds the person error message list.
     * 
     * @return the adds the person error message list
     */
    public List<List<String>> getAddPersonErrorMessageList() {
        return addPersonErrorMessageList;
    }

    /**
     * Sets the adds the person error message list.
     * 
     * @param addPersonErrorMessageList
     *            the new adds the person error message list
     */
    public void setAddPersonErrorMessageList(final List<List<String>> addPersonErrorMessageList) {
        this.addPersonErrorMessageList = addPersonErrorMessageList;
    }

    /**
     * Gets the flag create xldf person data flag.
     * 
     * @return the flag create xldf person data flag
     */
    public String getFlagCreateXLDFPersonDataFlag() {
        return flagCreateXLDFPersonDataFlag;
    }

    /**
     * Sets the flag create xldf person data flag.
     * 
     * @param flagCreateXLDFPersonDataFlag
     *            the new flag create xldf person data flag
     */
    public void setFlagCreateXLDFPersonDataFlag(final String flagCreateXLDFPersonDataFlag) {
        this.flagCreateXLDFPersonDataFlag = flagCreateXLDFPersonDataFlag;
    }

    /**
     * Gets the man count.
     * 
     * @return the man count
     */
    public int getManCount() {
        return manCount;
    }

    /**
     * Sets the man count.
     * 
     * @param manCount
     *            the new man count
     */
    public void setManCount(final int manCount) {
        this.manCount = manCount;
    }

    /**
     * Gets the woman count.
     * 
     * @return the woman count
     */
    public int getWomanCount() {
        return womanCount;
    }

    /**
     * Sets the woman count.
     * 
     * @param womanCount
     *            the new woman count
     */
    public void setWomanCount(final int womanCount) {
        this.womanCount = womanCount;
    }

    /**
     * Gets the target person data.
     * 
     * @return the target person data
     */
    public UnDelPersonDataObject getTargetPersonData() {
        return targetPersonData;
    }

    /**
     * Sets the target person data.
     * 
     * @param targetPersonData
     *            the new target person data
     */
    public void setTargetPersonData(final UnDelPersonDataObject targetPersonData) {
        this.targetPersonData = targetPersonData;
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
    public void setHouseholdNoteList(final List<XLDFHouseholdNoteDomainObject> householdNoteList) {
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
    public void setPersonNoteList(final List<XLDFPersonNoteDomainObject> personNoteList) {
        this.personNoteList = personNoteList;
    }

    /**
     * Gets the register date.
     * 
     * @return the register date
     */
    public String getRegisterDate() {
        return registerDate;
    }

    /**
     * Sets the register date.
     * 
     * @param registerDate
     *            the new register date
     */
    public void setRegisterDate(final String registerDate) {
        this.registerDate = registerDate;
    }

    /**
     * Gets the register time.
     * 
     * @return the register time
     */
    public String getRegisterTime() {
        return registerTime;
    }

    /**
     * Sets the register time.
     * 
     * @param registerTime
     *            the new register time
     */
    public void setRegisterTime(final String registerTime) {
        this.registerTime = registerTime;
    }

    /**
     * Gets the apply date.
     * 
     * @return the apply date
     */
    public String getApplyDate() {
        return applyDate;
    }

    /**
     * Sets the apply date.
     * 
     * @param applyDate
     *            the new apply date
     */
    public void setApplyDate(final String applyDate) {
        this.applyDate = applyDate;
    }

    /**
     * Gets the accept site id.
     * 
     * @return the accept site id
     */
    public String getAcceptSiteId() {
        return acceptSiteId;
    }

    /**
     * Sets the accept site id.
     * 
     * @param acceptSiteId
     *            the new accept site id
     */
    public void setAcceptSiteId(final String acceptSiteId) {
        this.acceptSiteId = acceptSiteId;
    }

    /**
     * Gets the accept admin office code.
     * 
     * @return the accept admin office code
     */
    public String getAcceptAdminOfficeCode() {
        return acceptAdminOfficeCode;
    }

    /**
     * Sets the accept admin office code.
     * 
     * @param acceptAdminOfficeCode
     *            the new accept admin office code
     */
    public void setAcceptAdminOfficeCode(final String acceptAdminOfficeCode) {
        this.acceptAdminOfficeCode = acceptAdminOfficeCode;
    }

    /**
     * Gets the accept area code.
     * 
     * @return the accept area code
     */
    public String getAcceptAreaCode() {
        return acceptAreaCode;
    }

    /**
     * Sets the accept area code.
     * 
     * @param acceptAreaCode
     *            the new accept area code
     */
    public void setAcceptAreaCode(final String acceptAreaCode) {
        this.acceptAreaCode = acceptAreaCode;
    }

    /**
     * Gets the enforced flag.
     * 
     * @return the enforced flag
     */
    public String getEnforcedFlag() {
        return enforcedFlag;
    }

    /**
     * Sets the enforced flag.
     * 
     * @param enforcedFlag
     *            the new enforced flag
     */
    public void setEnforcedFlag(final String enforcedFlag) {
        this.enforcedFlag = enforcedFlag;
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
    public void setEnforcedApplicant(final XldfefaplcType enforcedApplicant) {
        this.enforcedApplicant = enforcedApplicant;
    }

    /**
     * Gets the web household data.
     * 
     * @return the web household data
     */
    public XLDFHouseholdDataDomainObject getWebHouseholdData() {
        return webHouseholdData;
    }

    /**
     * Sets the web household data.
     * 
     * @param webHouseholdData
     *            the new web household data
     */
    public void setWebHouseholdData(final XLDFHouseholdDataDomainObject webHouseholdData) {
        this.webHouseholdData = webHouseholdData;
    }

    /**
     * Gets the web household head person data.
     * 
     * @return the web household head person data
     */
    public XLDFPersonDataDomainObject getWebHouseholdHeadPersonData() {
        return webHouseholdHeadPersonData;
    }

    /**
     * Sets the web household head person data.
     * 
     * @param webHouseholdHeadPersonData
     *            the new web household head person data
     */
    public void setWebHouseholdHeadPersonData(final XLDFPersonDataDomainObject webHouseholdHeadPersonData) {
        this.webHouseholdHeadPersonData = webHouseholdHeadPersonData;
    }

    /**
     * Gets the web household head site id.
     * 
     * @return the web household head site id
     */
    public String getWebHouseholdHeadSiteId() {
        return webHouseholdHeadSiteId;
    }

    /**
     * Sets the web household head site id.
     * 
     * @param webHouseholdHeadSiteId
     *            the new web household head site id
     */
    public void setWebHouseholdHeadSiteId(final String webHouseholdHeadSiteId) {
        this.webHouseholdHeadSiteId = webHouseholdHeadSiteId;
    }

    /**
     * Gets the web household head id.
     * 
     * @return the web household head id
     */
    public String getWebHouseholdHeadId() {
        return webHouseholdHeadId;
    }

    /**
     * Sets the web household head id.
     * 
     * @param webHouseholdHeadId
     *            the new web household head id
     */
    public void setWebHouseholdHeadId(final String webHouseholdHeadId) {
        this.webHouseholdHeadId = webHouseholdHeadId;
    }

    /**
     * Gets the web household id.
     * 
     * @return the web household id
     */
    public String getWebHouseholdId() {
        return webHouseholdId;
    }

    /**
     * Sets the web household id.
     * 
     * @param webHouseholdId
     *            the new web household id
     */
    public void setWebHouseholdId(final String webHouseholdId) {
        this.webHouseholdId = webHouseholdId;
    }

    /**
     * Gets the checks if is new household.
     * 
     * @return the checks if is new household
     */
    public String getIsNewHousehold() {
        return isNewHousehold;
    }

    /**
     * Sets the checks if is new household.
     * 
     * @param isNewHousehold
     *            the new checks if is new household
     */
    public void setIsNewHousehold(final String isNewHousehold) {
        this.isNewHousehold = isNewHousehold;
    }

    /**
     * Gets the old household id.
     * 
     * @return the old household id
     */
    public String getOldHouseholdId() {
        return oldHouseholdId;
    }

    /**
     * Sets the old household id.
     * 
     * @param oldHouseholdId
     *            the new old household id
     */
    public void setOldHouseholdId(final String oldHouseholdId) {
        this.oldHouseholdId = oldHouseholdId;
    }

    /**
     * Gets the del household data.
     * 
     * @return the del household data
     */
    public XLDFHouseholdDataDomainObject getDelHouseholdData() {
        return delHouseholdData;
    }

    /**
     * Sets the del household data.
     * 
     * @param delHouseholdData
     *            the new del household data
     */
    public void setDelHouseholdData(final XLDFHouseholdDataDomainObject delHouseholdData) {
        this.delHouseholdData = delHouseholdData;
    }

    /**
     * Gets the old household data.
     * 
     * @return the old household data
     */
    public XLDFHouseholdDataDomainObject getOldHouseholdData() {
        return oldHouseholdData;
    }

    /**
     * Sets the old household data.
     * 
     * @param oldHouseholdData
     *            the new old household data
     */
    public void setOldHouseholdData(final XLDFHouseholdDataDomainObject oldHouseholdData) {
        this.oldHouseholdData = oldHouseholdData;
    }

    /**
     * Gets the old household head person data.
     * 
     * @return the old household head person data
     */
    public XLDFPersonDataDomainObject getOldHouseholdHeadPersonData() {
        return oldHouseholdHeadPersonData;
    }

    /**
     * Sets the old household head person data.
     * 
     * @param oldHouseholdHeadPersonData
     *            the new old household head person data
     */
    public void setOldHouseholdHeadPersonData(final XLDFPersonDataDomainObject oldHouseholdHeadPersonData) {
        this.oldHouseholdHeadPersonData = oldHouseholdHeadPersonData;
    }

    /**
     * Gets the new household id.
     * 
     * @return the new household id
     */
    public String getNewHouseholdId() {
        return newHouseholdId;
    }

    /**
     * Sets the new household id.
     * 
     * @param newHouseholdId
     *            the new new household id
     */
    public void setNewHouseholdId(final String newHouseholdId) {
        this.newHouseholdId = newHouseholdId;
    }

    /**
     * Gets the new household map.
     * 
     * @return the new household map
     */
    public Map<String, String> getNewHouseholdMap() {
        return newHouseholdMap;
    }

    /**
     * Sets the new household map.
     * 
     * @param newHouseholdMap
     *            the new household map
     */
    public void setNewHouseholdMap(final Map<String, String> newHouseholdMap) {
        this.newHouseholdMap = newHouseholdMap;
    }

    /**
     * Gets the new household data.
     * 
     * @return the new household data
     */
    public XLDFHouseholdDataDomainObject getNewHouseholdData() {
        return newHouseholdData;
    }

    /**
     * Sets the new household data.
     * 
     * @param newHouseholdData
     *            the new new household data
     */
    public void setNewHouseholdData(final XLDFHouseholdDataDomainObject newHouseholdData) {
        this.newHouseholdData = newHouseholdData;
    }

    /**
     * Gets the un del person data list.
     * 
     * @return the un del person data list
     */
    public List<UnDelPersonDataObject> getUnDelPersonDataList() {
        return unDelPersonDataList;
    }

    /**
     * Sets the un del person data list.
     * 
     * @param unDelPersonDataList
     *            the new un del person data list
     */
    public void setUnDelPersonDataList(final List<UnDelPersonDataObject> unDelPersonDataList) {
        this.unDelPersonDataList = unDelPersonDataList;
    }

    /**
     * Gets the person note flag.
     * 
     * @return the person note flag
     */
    public String getPersonNoteFlag() {
        return personNoteFlag;
    }

    /**
     * Sets the person note flag.
     * 
     * @param personNoteFlag
     *            the new person note flag
     */
    public void setPersonNoteFlag(final String personNoteFlag) {
        this.personNoteFlag = personNoteFlag;
    }

    /**
     * Gets the del yyymmdd.
     * 
     * @return the del yyymmdd
     */
    public String getDelYyymmdd() {
        return delYyymmdd;
    }

    /**
     * Sets the del yyymmdd.
     * 
     * @param delYyymmdd
     *            the new del yyymmdd
     */
    public void setDelYyymmdd(final String delYyymmdd) {
        this.delYyymmdd = delYyymmdd;
    }

    /**
     * Gets the approve nationality date.
     * 
     * @return the approve nationality date
     */
    public String getApproveNationalityDate() {
        return approveNationalityDate;
    }

    /**
     * Sets the approve nationality date.
     * 
     * @param approveNationalityDate
     *            the new approve nationality date
     */
    public void setApproveNationalityDate(final String approveNationalityDate) {
        this.approveNationalityDate = approveNationalityDate;
    }

    /**
     * Gets the del reason.
     * 
     * @return the del reason
     */
    public String getDelReason() {
        return delReason;
    }

    /**
     * Sets the del reason.
     * 
     * @param delReason
     *            the new del reason
     */
    public void setDelReason(final String delReason) {
        this.delReason = delReason;
    }

    /**
     * Gets the other certificate.
     * 
     * @return the other certificate
     */
    public String getOtherCertificate() {
        return otherCertificate;
    }

    /**
     * Sets the other certificate.
     * 
     * @param otherCertificate
     *            the new other certificate
     */
    public void setOtherCertificate(final String otherCertificate) {
        this.otherCertificate = otherCertificate;
    }

    /**
     * Gets the register content.
     * 
     * @return the register content
     */
    public String getRegisterContent() {
        return registerContent;
    }

    /**
     * Sets the register content.
     * 
     * @param registerContent
     *            the new register content
     */
    public void setRegisterContent(final String registerContent) {
        this.registerContent = registerContent;
    }

    /**
     * Gets the fine event date.
     * 
     * @return the fine event date
     */
    public String getFineEventDate() {
        return fineEventDate;
    }

    /**
     * Sets the fine event date.
     * 
     * @param fineEventDate
     *            the new fine event date
     */
    public void setFineEventDate(final String fineEventDate) {
        this.fineEventDate = fineEventDate;
    }

    /**
     * Gets the do fine check flag.
     * 
     * @return the do fine check flag
     */
    public boolean isDoFineCheckFlag() {
        return doFineCheckFlag;
    }

    /**
     * Sets the do fine check flag.
     * 
     * @param doFineCheckFlag
     *            the new do fine check flag
     */
    public void setDoFineCheckFlag(final boolean doFineCheckFlag) {
        this.doFineCheckFlag = doFineCheckFlag;
    }

    /**
     * Gets the need fine flag.
     * 
     * @return the need fine flag
     */
    public String getNeedFineFlag() {
        return needFineFlag;
    }

    /**
     * Sets the need fine flag.
     * 
     * @param needFineFlag
     *            the new need fine flag
     */
    public void setNeedFineFlag(final String needFineFlag) {
        this.needFineFlag = needFineFlag;
    }

    /**
     * Gets the removes the fee reason.
     * 
     * @return the removes the fee reason
     */
    public String getRemoveFeeReason() {
        return removeFeeReason;
    }

    /**
     * Sets the removes the fee reason.
     * 
     * @param removeFeeReason
     *            the new removes the fee reason
     */
    public void setRemoveFeeReason(final String removeFeeReason) {
        this.removeFeeReason = removeFeeReason;
    }

    /**
     * Gets the person id.
     * 
     * @return the person id
     */
    public String getPersonId() {
        return personId;
    }

    /**
     * Sets the person id.
     * 
     * @param personId
     *            the new person id
     */
    public void setPersonId(final String personId) {
        this.personId = personId;
    }

    /**
     * Gets the accept admin office name.
     * 
     * @return the accept admin office name
     */
    public String getAcceptAdminOfficeName() {
        return acceptAdminOfficeName;
    }

    /**
     * Sets the accept admin office name.
     * 
     * @param acceptAdminOfficeName
     *            the new accept admin office name
     */
    public void setAcceptAdminOfficeName(final String acceptAdminOfficeName) {
        this.acceptAdminOfficeName = acceptAdminOfficeName;
    }

    /**
     * Gets the settle city county name.
     * 
     * @return the settle city county name
     */
    public String getSettleCityCountyName() {
        return settleCityCountyName;
    }

    /**
     * Sets the settle city county name.
     * 
     * @param settleCityCountyName
     *            the new settle city county name
     */
    public void setSettleCityCountyName(final String settleCityCountyName) {
        this.settleCityCountyName = settleCityCountyName;
    }

    /**
     * Gets the settle town name.
     * 
     * @return the settle town name
     */
    public String getSettleTownName() {
        return settleTownName;
    }

    /**
     * Sets the settle town name.
     * 
     * @param settleTownName
     *            the new settle town name
     */
    public void setSettleTownName(final String settleTownName) {
        this.settleTownName = settleTownName;
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
    public void setApply1(final XLDFApplicantDataDTO apply1) {
        this.apply1 = apply1;
    }

    /**
     * Gets the apply1 relatioinship.
     * 
     * @return the apply1 relatioinship
     */
    public String getApply1Relatioinship() {
        return apply1Relatioinship;
    }

    /**
     * Sets the apply1 relatioinship.
     * 
     * @param apply1Relatioinship
     *            the new apply1 relatioinship
     */
    public void setApply1Relatioinship(final String apply1Relatioinship) {
        this.apply1Relatioinship = apply1Relatioinship;
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
    public void setApply2(final XLDFApplicantDataDTO apply2) {
        this.apply2 = apply2;
    }

    /**
     * Gets the apply2 relatioinship.
     * 
     * @return the apply2 relatioinship
     */
    public String getApply2Relatioinship() {
        return apply2Relatioinship;
    }

    /**
     * Sets the apply2 relatioinship.
     * 
     * @param apply2Relatioinship
     *            the new apply2 relatioinship
     */
    public void setApply2Relatioinship(final String apply2Relatioinship) {
        this.apply2Relatioinship = apply2Relatioinship;
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
    public void setDelegated(final XLDFPersonBriefDataDTO delegated) {
        this.delegated = delegated;
    }

    /**
     * Gets the certificate list.
     * 
     * @return the certificate list
     */
    public List<String> getCertificateList() {
        return certificateList;
    }

    /**
     * Sets the certificate list.
     * 
     * @param certificateList
     *            the new certificate list
     */
    public void setCertificateList(final List<String> certificateList) {
        this.certificateList = certificateList;
    }

    /**
     * Gets the fine list.
     * 
     * @return the fine list
     */
    public List<XLDFOperationFineDTO> getFineList() {
        return fineList;
    }

    /**
     * Sets the fine list.
     * 
     * @param fineList
     *            the new fine list
     */
    public void setFineList(final List<XLDFOperationFineDTO> fineList) {
        this.fineList = fineList;
    }

    /**
     * Gets the reg obnf list.
     * 
     * @return the reg obnf list
     */
    public List<XLDFRegDetailObnfParams> getRegObnfList() {
        return regObnfList;
    }

    /**
     * Sets the reg obnf list.
     * 
     * @param regObnfList
     *            the new reg obnf list
     */
    public void setRegObnfList(final List<XLDFRegDetailObnfParams> regObnfList) {
        this.regObnfList = regObnfList;
    }

    /**
     * Gets the xldfx09qm list.
     * 
     * @return the xldfx09qm list
     */
    public List<XLDFX09QM> getXldfx09qmList() {
        return xldfx09qmList;
    }

    /**
     * Sets the xldfx09qm list.
     * 
     * @param xldfx09qmList
     *            the new xldfx09qm list
     */
    public void setXldfx09qmList(final List<XLDFX09QM> xldfx09qmList) {
        this.xldfx09qmList = xldfx09qmList;
    }

    /**
     * Gets the xldfx09qh list.
     * 
     * @return the xldfx09qh list
     */
    public List<XLDFX09QH> getXldfx09qhList() {
        return xldfx09qhList;
    }

    /**
     * Sets the xldfx09qh list.
     * 
     * @param xldfx09qhList
     *            the new xldfx09qh list
     */
    public void setXldfx09qhList(final List<XLDFX09QH> xldfx09qhList) {
        this.xldfx09qhList = xldfx09qhList;
    }

    /**
     * Gets the xldfy09qm list.
     * 
     * @return the xldfy09qm list
     */
    public List<XLDFY09QM> getXldfy09qmList() {
        return xldfy09qmList;
    }

    /**
     * Sets the xldfy09qm list.
     * 
     * @param xldfy09qmList
     *            the new xldfy09qm list
     */
    public void setXldfy09qmList(final List<XLDFY09QM> xldfy09qmList) {
        this.xldfy09qmList = xldfy09qmList;
    }

    /**
     * Gets the xldfy09qh list.
     * 
     * @return the xldfy09qh list
     */
    public List<XLDFY09QH> getXldfy09qhList() {
        return xldfy09qhList;
    }

    /**
     * Sets the xldfy09qh list.
     * 
     * @param xldfy09qhList
     *            the new xldfy09qh list
     */
    public void setXldfy09qhList(final List<XLDFY09QH> xldfy09qhList) {
        this.xldfy09qhList = xldfy09qhList;
    }

    /**
     * Gets the seal apply yyymmdd.
     * 
     * @return the seal apply yyymmdd
     */
    public String getSealApplyYyymmdd() {
        return sealApplyYyymmdd;
    }

    /**
     * Sets the seal apply yyymmdd.
     * 
     * @param sealApplyYyymmdd
     *            the new seal apply yyymmdd
     */
    public void setSealApplyYyymmdd(final String sealApplyYyymmdd) {
        this.sealApplyYyymmdd = sealApplyYyymmdd;
    }

    /**
     * Gets the fine serial number.
     * 
     * @return the fine serial number
     */
    public String getFineSerialNumber() {
        return fineSerialNumber;
    }

    /**
     * Sets the fine serial number.
     * 
     * @param fineSerialNumber
     *            the new fine serial number
     */
    public void setFineSerialNumber(final String fineSerialNumber) {
        this.fineSerialNumber = fineSerialNumber;
    }

    /**
     * Gets the fee amount.
     * 
     * @return the fee amount
     */
    public String getFeeAmount() {
        return feeAmount;
    }

    /**
     * Sets the fee amount.
     * 
     * @param feeAmount
     *            the new fee amount
     */
    public void setFeeAmount(final String feeAmount) {
        this.feeAmount = feeAmount;
    }

    /**
     * Gets the receipt id.
     * 
     * @return the receipt id
     */
    public String getReceiptId() {
        return receiptId;
    }

    /**
     * Sets the receipt id.
     * 
     * @param receiptId
     *            the new receipt id
     */
    public void setReceiptId(final String receiptId) {
        this.receiptId = receiptId;
    }

    /**
     * Gets the apply seq.
     * 
     * @return the apply seq
     */
    public String getApplySeq() {
        return applySeq;
    }

    /**
     * Sets the apply seq.
     * 
     * @param applySeq
     *            the new apply seq
     */
    public void setApplySeq(final String applySeq) {
        this.applySeq = applySeq;
    }

    /**
     * Gets the apply case no.
     * 
     * @return the apply case no
     */
    public String getApplyCaseNo() {
        return applyCaseNo;
    }

    /**
     * Sets the apply case no.
     * 
     * @param applyCaseNo
     *            the new apply case no
     */
    public void setApplyCaseNo(final String applyCaseNo) {
        this.applyCaseNo = applyCaseNo;
    }

    /**
     * Gets the transaction id.
     * 
     * @return the transaction id
     */
    public String getTransactionId() {
        return transactionId;
    }

    /**
     * Sets the transaction id.
     * 
     * @param transactionId
     *            the new transaction id
     */
    public void setTransactionId(final String transactionId) {
        this.transactionId = transactionId;
    }

    /**
     * Gets the operation code.
     * 
     * @return the operation code
     */
    public String getOperationCode() {
        return operationCode;
    }

    /**
     * Sets the operation code.
     * 
     * @param operationCode
     *            the new operation code
     */
    public void setOperationCode(final String operationCode) {
        this.operationCode = operationCode;
    }

    /**
     * Gets the apply sequence id.
     * 
     * @return the apply sequence id
     */
    public String getApplySequenceId() {
        return applySequenceId;
    }

    /**
     * Sets the apply sequence id.
     * 
     * @param applySequenceId
     *            the new apply sequence id
     */
    public void setApplySequenceId(final String applySequenceId) {
        this.applySequenceId = applySequenceId;
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
    public void setDeleteFineDTOFlag(final boolean deleteFineDTOFlag) {
        this.deleteFineDTOFlag = deleteFineDTOFlag;
    }

    /**
     * Checks if is previous do fine check flag.
     * 
     * @return true, if is previous do fine check flag
     */
    public boolean isPreviousDoFineCheckFlag() {
        return previousDoFineCheckFlag;
    }

    /**
     * Sets the previous do fine check flag.
     * 
     * @param previousDoFineCheckFlag
     *            the new previous do fine check flag
     */
    public void setPreviousDoFineCheckFlag(final boolean previousDoFineCheckFlag) {
        this.previousDoFineCheckFlag = previousDoFineCheckFlag;
    }

    /**
     * Gets the previous fine event date.
     * 
     * @return the previous fine event date
     */
    public String getPreviousFineEventDate() {
        return previousFineEventDate;
    }

    /**
     * Sets the previous fine event date.
     * 
     * @param previousFineEventDate
     *            the new previous fine event date
     */
    public void setPreviousFineEventDate(final String previousFineEventDate) {
        this.previousFineEventDate = previousFineEventDate;
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
    public void setFineFreeFlag(final boolean fineFreeFlag) {
        this.fineFreeFlag = fineFreeFlag;
    }

    /**
     * Checks if is do fine check flag open.
     * 
     * @return true, if is do fine check flag open
     */
    public boolean isDoFineCheckFlagOpen() {
        return doFineCheckFlagOpen;
    }

    /**
     * Sets the do fine check flag open.
     * 
     * @param doFineCheckFlagOpen
     *            the new do fine check flag open
     */
    public void setDoFineCheckFlagOpen(final boolean doFineCheckFlagOpen) {
        this.doFineCheckFlagOpen = doFineCheckFlagOpen;
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
    public void setFineDTO(final FineDTO fineDTO) {
        this.fineDTO = fineDTO;
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
    public void setM10mList(final List<XLDFM10M> m10mList) {
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
    public void setViewM10m(final XLDFM10M viewM10m) {
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
    public void setViewPostiveApplication(final XLDFDomainObject viewPostiveApplication) {
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
    public void setSelectedM10m(final XLDFM10M selectedM10m) {
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
    public void setSelectedPostiveApplication(final XLDFDomainObject selectedPostiveApplication) {
        this.selectedPostiveApplication = selectedPostiveApplication;
    }

    /**
     * Gets the del reason code.
     * 
     * @return the del reason code
     */
    public String getDelReasonCode() {
        return delReasonCode;
    }

    /**
     * Sets the del reason code.
     * 
     * @param delReasonCode
     *            the new del reason code
     */
    public void setDelReasonCode(final String delReasonCode) {
        this.delReasonCode = delReasonCode;
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
    public void setFinePerson(final XLDFApplicantDataDTO finePerson) {
        this.finePerson = finePerson;
    }

    /**
     * Checks if is inits the success.
     * 
     * @return true, if is inits the success
     */
    public boolean isInitSuccess() {
        return initSuccess;
    }

    /**
     * Sets the inits the success.
     * 
     * @param initSuccess
     *            the new inits the success
     */
    public void setInitSuccess(final boolean initSuccess) {
        this.initSuccess = initSuccess;
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
    public void setActiveIndex(final String activeIndex) {
        this.activeIndex = activeIndex;
    }

    /**
     * Gets the user id.
     * 
     * @return the user id
     */
    public String getUserId() {
        return userId;
    }

    /**
     * Sets the user id.
     * 
     * @param userId
     *            the new user id
     */
    public void setUserId(final String userId) {
        this.userId = userId;
    }

    /**
     * Gets the inits the time.
     * 
     * @return the inits the time
     */
    public String getInitTime() {
        return initTime;
    }

    /**
     * Sets the inits the time.
     * 
     * @param initTime
     *            the new inits the time
     */
    public void setInitTime(final String initTime) {
        this.initTime = initTime;
    }

    /**
     * Gets the m10h list.
     * 
     * @return the m10h list
     */
    public List<XLDFM10H> getM10hList() {
        return m10hList;
    }

    /**
     * Sets the m10h list.
     * 
     * @param m10hList
     *            the new m10h list
     */
    public void setM10hList(final List<XLDFM10H> m10hList) {
        this.m10hList = m10hList;
    }

    /**
     * Gets the view m10h.
     * 
     * @return the view m10h
     */
    public XLDFM10H getViewM10h() {
        return viewM10h;
    }

    /**
     * Sets the view m10h.
     * 
     * @param viewM10h
     *            the new view m10h
     */
    public void setViewM10h(final XLDFM10H viewM10h) {
        this.viewM10h = viewM10h;
    }

    /**
     * Gets the selected m10h.
     * 
     * @return the selected m10h
     */
    public XLDFM10H getSelectedM10h() {
        return selectedM10h;
    }

    /**
     * Sets the selected m10h.
     * 
     * @param selectedM10h
     *            the new selected m10h
     */
    public void setSelectedM10h(final XLDFM10H selectedM10h) {
        this.selectedM10h = selectedM10h;
    }

    /**
     * Checks if is other certificate flag.
     * 
     * @return true, if is other certificate flag
     */
    public boolean isOtherCertificateFlag() {
        return otherCertificateFlag;
    }

    /**
     * Sets the other certificate flag.
     * 
     * @param otherCertificateFlag
     *            the new other certificate flag
     */
    public void setOtherCertificateFlag(final boolean otherCertificateFlag) {
        this.otherCertificateFlag = otherCertificateFlag;
    }

    /**
     * Checks if is lock mode.
     * 
     * @return true, if is lock mode
     */
    public boolean isLockMode() {
        return lockMode;
    }

    /**
     * Sets the lock mode.
     * 
     * @param lockMode
     *            the new lock mode
     */
    public void setLockMode(final boolean lockMode) {
        this.lockMode = lockMode;
    }

    /**
     * Gets the del reason name.
     * 
     * @return the del reason name
     */
    public String getDelReasonName() {
        return delReasonName;
    }

    /**
     * Sets the del reason name.
     * 
     * @param delReasonName
     *            the new del reason name
     */
    public void setDelReasonName(final String delReasonName) {
        this.delReasonName = delReasonName;
    }

    /**
     * Gets the xldfyxxh map.
     * 
     * @return the xldfyxxh map
     */
    public Map<String, XLDFDomainObject> getXldfyxxhMap() {
        return xldfyxxhMap;
    }

    /**
     * Sets the xldfyxxh map.
     * 
     * @param xldfyxxhMap
     *            the xldfyxxh map
     */
    public void setXldfyxxhMap(final Map<String, XLDFDomainObject> xldfyxxhMap) {
        this.xldfyxxhMap = xldfyxxhMap;
    }

    /**
     * Checks if is big househole.
     * 
     * @return true, if is big househole
     */
    public boolean isBigHousehole() {
        return bigHousehole;
    }

    /**
     * Sets the big househole.
     * 
     * @param bigHousehole
     *            the new big househole
     */
    public void setBigHousehole(final boolean bigHousehole) {
        this.bigHousehole = bigHousehole;
    }

}

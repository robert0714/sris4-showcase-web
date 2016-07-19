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
import tw.gov.moi.rl.component.xldf.dto.XCDF001MRL;
import tw.gov.moi.rl.component.xldf.dto.XLDFX09JH;
import tw.gov.moi.rl.component.xldf.dto.XLDFX09JM;
import tw.gov.moi.rl.component.xldf.dto.XLDFY09JH;
import tw.gov.moi.rl.component.xldf.dto.XLDFY09JM;
import tw.gov.moi.rl.domain.xldf.XLDFHouseholdDataDomainObject;
import tw.gov.moi.rl.domain.xldf.XLDFHouseholdNoteDomainObject;
import tw.gov.moi.rl.domain.xldf.XLDFPersonNoteDomainObject;

/**
 * 廢止戶籍登記DTO.
 * 
 * @author Viva.Hong
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Rl01g19DTO", propOrder = { "transactionId", "acceptSiteId", "userId", "initTime",
        "acceptAdminOfficeCode", "acceptAreaCode", "openingOperationDTO", "systemTime", "applyCode",
        "crossSiteEnabled", "removeHouseholdFlag", "oldHousePersonIdMap", "delPersonIdMap", "delXCDF001MRLMap",
        "delXLDF004NMap", "targetPersonHouseholdHeadFlag", "delHouseholdHeadPersonFlag", "delAllFlag",
        "finishNewHouseFlag", "targetPersonData", "currentDelPersonDataObject", "oldHouseNonPersonList",
        "initErrorMessageList", "personId", "addPersonErrorMsgMap", "warningMessgeList", "addPersonErrorMessageList",
        "manCount", "womanCount", "oldHousePersonCnt", "delPersonCnt", "finalHousePersonCnt", "fineList",
        "householdNoteList", "personNoteList", "xldfx09jmList", "xldfx09jhList", "xldfy09jmList", "xldfy09jhList",
        "registerDate", "registerTime", "applyDate", "enforcedFlag", "enforcedApplicant", "applyTypeFlag",
        "oldHouseholdId", "oldHouseholdData", "oldHouseholdHeadPersonDataObject", "newHouseholdData",
        "newHouseholdHeadPersonDataObject", "newHouseholdHeadId", "newHouseholdHeadName", "delPersonDataList",
        "personNoteFlag", "orgHouseholdNote", "orgPersonNoteMap", "newHousePersonDataList", "delYyymmdd",
        "delNationalityDate", "delReason", "mainDelReason", "delReasonName", "businessDate", "fatherNationality",
        "fatherWebName", "motherNationality", "motherWebName", "spouseNationality", "spouseWebName",
        "fosterNationality", "fosterFatherWebName", "fosterMotherWebName", "chinaPassportDate", "chinaHouseholdDate",
        "otherCertificate", "certificateList", "registerContent", "needFineFlag", "removeFeeReason",
        "fineSerialNumber", "feeAmount", "receiptId", "applySeq", "applyCaseNo", "fineEventDate", "operationCode",
        "systemDate", "applySequenceId", "doFineCheckFlag", "deleteFineDTOFlag", "previousDoFineCheckFlag",
        "previousFineEventDate", "fineFreeFlag", "doFineCheckFlagOpen", "fineDTO", "acceptAdminOfficeName",
        "settleCityCountyName", "settleTownName", "oldHouseholdHeadName", "apply1", "apply1Relatioinship", "apply2",
        "apply2Relatioinship", "delegated", "finePerson", "cancelKind", "otherCertificateFlag", "initSuccess",
        "activeIndex", "lockMode", "applySeqNum", "bigHousehole" })
@XmlRootElement(name = "Rl01g19DTO")
public class Rl01g19DTO implements Serializable {

    /** serialVersionUID. */
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

    /** 大簿openingOperationDTO. */
    @XmlElement(name = "OpeningOperationDTO", required = true)
    @FieldName("大簿openingOperationDTO")
    private OpeningOperationDTO openingOperationDTO;

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

    /** (旗標)1:全戶撤銷 2:部分撤銷含戶長. */
    @XmlElement(name = "RemoveHouseholdFlag", required = true)
    @FieldName("(旗標)1:全戶撤銷  2:部分撤銷含戶長")
    private String removeHouseholdFlag;

    /** 原戶人員-統號-人員物件MAP. */
    @XmlElement(name = "OldHousePersonIdMap", required = true)
    @FieldName("原戶人員-統號-人員物件MAP")
    private Map<String, DelPersonDataObject> oldHousePersonIdMap = new HashMap<String, DelPersonDataObject>();

    /** 廢止戶籍者-統號-人員物件MAP. */
    @XmlElement(name = "DelPersonIdMap", required = true)
    @FieldName("廢止戶籍者-統號-人員物件MAP")
    private Map<String, DelPersonDataObject> delPersonIdMap = new HashMap<String, DelPersonDataObject>();

    /** 廢止戶籍者-統號-XCDF001MRL物件MAP. */
    @XmlElement(name = "DelXCDF001MRLMap", required = true)
    @FieldName("廢止戶籍者-統號-XCDF001MRL物件MAP")
    private Map<String, XCDF001MRL> delXCDF001MRLMap = new HashMap<String, XCDF001MRL>();

    /** 撤銷戶籍者-統號-記事文字. */
    @XmlElement(name = "DelXLDF004NMap", required = true)
    @FieldName("撤銷戶籍者-統號-記事文字")
    private Map<String, String> delXLDF004NMap = new HashMap<String, String>();

    /** 廢止戶籍-大簿當事人為戶長旗標. */
    @XmlElement(name = "TargetPersonHouseholdHeadFlag", required = true)
    @FieldName("廢止戶籍-大簿當事人為戶長旗標")
    private boolean targetPersonHouseholdHeadFlag;

    /** 廢止戶籍者包含戶長旗標. */
    @XmlElement(name = "DelHouseholdHeadPersonFlag", required = true)
    @FieldName("廢止戶籍者包含戶長旗標")
    private boolean delHouseholdHeadPersonFlag;

    /** 全戶廢止旗標. */
    @XmlElement(name = "DelAllFlag", required = true)
    @FieldName("全戶廢止旗標")
    private boolean delAllFlag = false;

    /** 完成確認「廢止後新戶」資料. */
    @XmlElement(name = "FinishNewHouseFlag", required = true)
    @FieldName("完成確認「廢止後新戶」資料")
    private boolean finishNewHouseFlag = false;

    /** 當下的廢止戶籍者. */
    @XmlElement(name = "TargetPersonData", required = true)
    @FieldName("當下的廢止戶籍者")
    private DelPersonDataObject targetPersonData;

    /** 當下的廢止戶籍者. */
    @XmlElement(name = "CurrentDelPersonDataObject", required = true)
    @FieldName("當下的廢止戶籍者")
    private DelPersonDataObject currentDelPersonDataObject;

    /** 原戶人員-非現住人口清單. */
    @XmlElement(name = "OldHouseNonPersonList", required = true)
    @FieldName("原戶人員-非現住人口清單")
    private List<XLDFDomainObject> oldHouseNonPersonList = new ArrayList<XLDFDomainObject>();

    /** 初始1G19時的錯誤訊息清單. */
    @XmlElement(name = "InitErrorMessageList", required = true)
    @FieldName("初始1G19時的錯誤訊息清單")
    private List<List<String>> initErrorMessageList = new ArrayList<List<String>>();

    /** 新增廢止戶籍者視窗-國民身分證統一編號. */
    @XmlElement(name = "PersonId", required = true)
    @FieldName("新增廢止戶籍者視窗-國民身分證統一編號")
    private String personId;

    /** 新增廢止戶籍者的錯誤訊息. */
    @XmlElement(name = "AddPersonErrorMsgMap", required = true)
    @FieldName("新增廢止戶籍者的錯誤訊息")
    private Map<String, List<List<String>>> addPersonErrorMsgMap = new HashMap<String, List<List<String>>>();;

    /** 警告訊息清單. */
    @XmlElement(name = "DelXLDF004NMap", required = true)
    @FieldName("警告訊息清單")
    private List<List<String>> warningMessgeList = new ArrayList<List<String>>();

    /** 新增廢止戶籍者錯誤訊息清單. */
    @XmlElement(name = "AddPersonErrorMessageList", required = true)
    @FieldName("新增廢止戶籍者錯誤訊息清單")
    private List<List<String>> addPersonErrorMessageList = new ArrayList<List<String>>();

    /** 廢止戶籍者-男性人數. */
    @XmlElement(name = "ManCount", required = true)
    @FieldName("廢止戶籍者-男性人數")
    private int manCount = 0;

    /** 廢止戶籍者-女性人數. */
    @XmlElement(name = "WomanCount", required = true)
    @FieldName("廢止戶籍者-女性人數")
    private int womanCount = 0;

    /** 原戶成員人數. */
    @XmlElement(name = "OldHousePersonCnt", required = true)
    @FieldName("原戶成員人數")
    private int oldHousePersonCnt = 0;

    /** 廢止戶籍者人數. */
    @XmlElement(name = "DelPersonCnt", required = true)
    @FieldName("廢止戶籍者人數")
    private int delPersonCnt = 0;

    /** 廢止後戶內成員數. */
    @XmlElement(name = "FinalHousePersonCnt", required = true)
    @FieldName("廢止後戶內成員數")
    private int finalHousePersonCnt = 0;

    /** 罰鍰記事清單. */
    @XmlElement(name = "FineList", required = true)
    @FieldName("罰鍰記事清單")
    private List<XLDFOperationFineDTO> fineList = new ArrayList<XLDFOperationFineDTO>();

    /** 全戶記事清單. */
    @XmlElement(name = "HouseholdNoteList", required = true)
    @FieldName("全戶記事清單")
    private List<XLDFHouseholdNoteDomainObject> householdNoteList = new ArrayList<XLDFHouseholdNoteDomainObject>();

    /** 個人記事清單. */
    @XmlElement(name = "PersonNoteList", required = true)
    @FieldName("個人記事清單")
    private List<XLDFPersonNoteDomainObject> personNoteList = new ArrayList<XLDFPersonNoteDomainObject>();

    /** 現戶-全戶記事欄位化清單. */
    @XmlElement(name = "xldfx09jmList", required = true)
    @FieldName("現戶-全戶記事欄位化清單")
    private List<XLDFX09JM> xldfx09jmList = new ArrayList<XLDFX09JM>();

    /** 除戶-全戶記事欄位化清單. */
    @XmlElement(name = "xldfx09jhList", required = true)
    @FieldName("除戶-全戶記事欄位化清單")
    private List<XLDFX09JH> xldfx09jhList = new ArrayList<XLDFX09JH>();

    /** 現戶-個人記事欄位化清單. */
    @XmlElement(name = "xldfy09jmList", required = true)
    @FieldName("現戶-個人記事欄位化清單")
    private List<XLDFY09JM> xldfy09jmList = new ArrayList<XLDFY09JM>();

    /** 除戶-個人記事欄位化清單. */
    @XmlElement(name = "xldfy09jhList", required = true)
    @FieldName("除戶-個人記事欄位化清單")
    private List<XLDFY09JH> xldfy09jhList = new ArrayList<XLDFY09JH>();

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

    /** 廢止戶籍登記-申請種類. */
    @XmlElement(name = "ApplyTypeFlag", required = true)
    @FieldName("廢止戶籍登記-申請種類")
    private String applyTypeFlag = RlConstant.STRING_TWO;

    /** (原戶)戶號. */
    @XmlElement(name = "OldHouseholdId", required = true)
    @FieldName("(原戶)戶號")
    private String oldHouseholdId;

    /** (原戶)全戶基本資料. */
    @XmlElement(name = "OldHouseholdData", required = true)
    @FieldName("(原戶)全戶基本資料")
    private XLDFHouseholdDataDomainObject oldHouseholdData;

    /** (原戶)戶長-個人資料物件. */
    @XmlElement(name = "OldHouseholdHeadPersonDataObject", required = true)
    @FieldName("(原戶)戶長-個人資料物件")
    private DelPersonDataObject oldHouseholdHeadPersonDataObject;

    /** (廢止後新戶)全戶基本資料. */
    @XmlElement(name = "NewHouseholdData", required = true)
    @FieldName("(廢止後新戶)全戶基本資料")
    private XLDFHouseholdDataDomainObject newHouseholdData;

    /** (廢止後新戶)戶長-個人資料物件. */
    @XmlElement(name = "NewHouseholdHeadPersonDataObject", required = true)
    @FieldName("(廢止後新戶)戶長-個人資料物件")
    private DelPersonDataObject newHouseholdHeadPersonDataObject = new DelPersonDataObject();

    /** (撤銷後新戶長)統號. */
    @XmlElement(name = "NewHouseholdHeadId", required = true)
    @FieldName("(撤銷後新戶長)統號")
    private String newHouseholdHeadId;

    /** (撤銷後新戶長)姓名. */
    @XmlElement(name = "NewHouseholdHeadName", required = true)
    @FieldName("(撤銷後新戶長)姓名")
    private String newHouseholdHeadName;

    /** 廢止戶籍者資料清單. */
    @XmlElement(name = "DelPersonDataList", required = true)
    @FieldName("廢止戶籍者資料清單")
    private List<DelPersonDataObject> delPersonDataList = new ArrayList<DelPersonDataObject>();

    /** 廢止戶籍者-個人記事代碼. */
    @XmlElement(name = "PersonNoteFlag", required = true)
    @FieldName("廢止戶籍者-個人記事代碼")
    private String personNoteFlag;

    /** 原始全戶記事. */
    @XmlElement(name = "OrgHouseholdNote", required = true)
    @FieldName("原始全戶記事")
    private String orgHouseholdNote;

    /** 原始個人記事. */
    @XmlElement(name = "OrgPersonNoteMap", required = true)
    @FieldName("原始個人記事")
    private Map<String, String> orgPersonNoteMap = new HashMap<String, String>();

    /** 新戶成員清單資料. */
    @XmlElement(name = "NewHousePersonDataList", required = true)
    @FieldName("新戶成員清單資料")
    private List<DelPersonDataObject> newHousePersonDataList = new ArrayList<DelPersonDataObject>();

    /** 廢止日期. */
    @XmlElement(name = "DelYyymmdd", required = true)
    @FieldName("廢止日期")
    private String delYyymmdd;

    /** 核准喪失國籍日期. */
    @XmlElement(name = "DelNationalityDate", required = true)
    @FieldName("核准喪失國籍日期")
    private String delNationalityDate;

    /** 廢止原因. */
    @XmlElement(name = "DelReason", required = true)
    @FieldName("廢止原因")
    private String delReason = StringUtils.EMPTY;

    /** 廢止原因-主類別. */
    @XmlElement(name = "MainDelReason", required = true)
    @FieldName("廢止原因-主類別")
    private String mainDelReason = StringUtils.EMPTY;

    /** 廢止原因名稱. */
    @XmlElement(name = "DelReasonName", required = true)
    @FieldName("廢止原因名稱")
    private String delReasonName;

    /** 認領日期. */
    @XmlElement(name = "BusinessDate", required = true)
    @FieldName("認領日期")
    private String businessDate;

    /** 生父國籍. */
    @XmlElement(name = "FatherNationality", required = true)
    @FieldName("生父國籍")
    private String fatherNationality;

    /** 生父姓名. */
    @XmlElement(name = "FatherWebName", required = true)
    @FieldName("生父姓名")
    private String fatherWebName;

    /** 生母國籍. */
    @XmlElement(name = "MotherNationality", required = true)
    @FieldName("生母國籍")
    private String motherNationality;

    /** 生母姓名. */
    @XmlElement(name = "MotherWebName", required = true)
    @FieldName("生母姓名")
    private String motherWebName;

    /** 配偶國籍. */
    @XmlElement(name = "SpouseNationality", required = true)
    @FieldName("配偶國籍")
    private String spouseNationality;

    /** 配偶姓名. */
    @XmlElement(name = "SpouseWebName", required = true)
    @FieldName("配偶姓名")
    private String spouseWebName;

    /** 養父(母)國籍. */
    @XmlElement(name = "FosterNationality", required = true)
    @FieldName("養父(母)國籍")
    private String fosterNationality;

    /** 養父姓名. */
    @XmlElement(name = "FosterFatherWebName", required = true)
    @FieldName("養父姓名")
    private String fosterFatherWebName;

    /** 養母姓名. */
    @XmlElement(name = "FosterMotherWebName", required = true)
    @FieldName("養母姓名")
    private String fosterMotherWebName;

    /** 領用大陸地區護照日期. */
    @XmlElement(name = "ChinaPassportDate", required = true)
    @FieldName("領用大陸地區護照日期")
    private String chinaPassportDate;

    /** 申報大陸地區戶籍日期. */
    @XmlElement(name = "ChinaHouseholdDate", required = true)
    @FieldName("申報大陸地區戶籍日期")
    private String chinaHouseholdDate;

    /** 其他附繳證件名稱. */
    @XmlElement(name = "OtherCertificate", required = true)
    @FieldName("其他附繳證件名稱")
    private String otherCertificate = StringUtils.EMPTY;

    /** 附繳證件清單. */
    @XmlElement(name = "CertificateList")
    @FieldName("附繳證件清單")
    private List<String> certificateList = new ArrayList<String>();

    /** 申請書備註. */
    @XmlElement(name = "RegisterContent", required = true)
    @FieldName("申請書備註")
    private String registerContent;

    /** 須進行罰鍰處理. */
    @XmlElement(name = "NeedFineFlag", required = true)
    @FieldName("須進行罰鍰處理")
    private String needFineFlag = RlConstant.NO_CHAR;

    /** 免罰原因. */
    @XmlElement(name = "RemoveFeeReason", required = true)
    @FieldName("免罰原因")
    private String removeFeeReason = StringUtils.EMPTY;

    /** 罰鍰裁處書識別序號. */
    @XmlElement(name = "FineSerialNumber")
    @FieldName("罰鍰裁處書識別序號")
    private String fineSerialNumber = StringUtils.EMPTY;

    /** 戶籍罰鍰金額. */
    @XmlElement(name = "FeeAmount")
    @FieldName("戶籍罰鍰金額")
    private String feeAmount = StringUtils.EMPTY;

    /** 收據號碼. */
    @XmlElement(name = "ReceiptId")
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

    /** 系統日期. */
    @XmlElement(name = "SystemDate", required = true)
    @FieldName("系統日期")
    private String systemDate;

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

    /** 戶長姓名. */
    @XmlElement(name = "OldHouseholdHeadName", required = true)
    @FieldName("戶長姓名")
    private String oldHouseholdHeadName;

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
    @FieldName("申請人2")
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

    /** 是否繳交國民身分證. */
    @XmlElement(name = "CancelKind", required = true)
    @FieldName("是否繳交國民身分證")
    private String cancelKind = "";

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

    /** 申請書流水號. */
    @XmlElement(name = "ApplySeqNum", required = true)
    @FieldName("申請書流水號")
    private int applySeqNum;

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
     * Gets the removes the household flag.
     * 
     * @return the removes the household flag
     */
    public String getRemoveHouseholdFlag() {
        return removeHouseholdFlag;
    }

    /**
     * Sets the removes the household flag.
     * 
     * @param removeHouseholdFlag
     *            the new removes the household flag
     */
    public void setRemoveHouseholdFlag(final String removeHouseholdFlag) {
        this.removeHouseholdFlag = removeHouseholdFlag;
    }

    /**
     * Gets the old house person id map.
     * 
     * @return the old house person id map
     */
    public Map<String, DelPersonDataObject> getOldHousePersonIdMap() {
        return oldHousePersonIdMap;
    }

    /**
     * Sets the old house person id map.
     * 
     * @param oldHousePersonIdMap
     *            the new old house person id map
     */
    public void setOldHousePersonIdMap(final Map<String, DelPersonDataObject> oldHousePersonIdMap) {
        this.oldHousePersonIdMap = oldHousePersonIdMap;
    }

    /**
     * Gets the del person id map.
     * 
     * @return the del person id map
     */
    public Map<String, DelPersonDataObject> getDelPersonIdMap() {
        return delPersonIdMap;
    }

    /**
     * Sets the del person id map.
     * 
     * @param delPersonIdMap
     *            the new del person id map
     */
    public void setDelPersonIdMap(final Map<String, DelPersonDataObject> delPersonIdMap) {
        this.delPersonIdMap = delPersonIdMap;
    }

    /**
     * Gets the del xcd f001 mrl map.
     * 
     * @return the del xcd f001 mrl map
     */
    public Map<String, XCDF001MRL> getDelXCDF001MRLMap() {
        return delXCDF001MRLMap;
    }

    /**
     * Sets the del xcd f001 mrl map.
     * 
     * @param delXCDF001MRLMap
     *            the new del xcd f001 mrl map
     */
    public void setDelXCDF001MRLMap(final Map<String, XCDF001MRL> delXCDF001MRLMap) {
        this.delXCDF001MRLMap = delXCDF001MRLMap;
    }

    /**
     * Gets the del xld f004 n map.
     * 
     * @return the del xld f004 n map
     */
    public Map<String, String> getDelXLDF004NMap() {
        return delXLDF004NMap;
    }

    /**
     * Sets the del xld f004 n map.
     * 
     * @param delXLDF004NMap
     *            the new del xld f004 n map
     */
    public void setDelXLDF004NMap(final Map<String, String> delXLDF004NMap) {
        this.delXLDF004NMap = delXLDF004NMap;
    }

    /**
     * Gets the target person household head flag.
     * 
     * @return the target person household head flag
     */
    public boolean getTargetPersonHouseholdHeadFlag() {
        return targetPersonHouseholdHeadFlag;
    }

    /**
     * Sets the target person household head flag.
     * 
     * @param targetPersonHouseholdHeadFlag
     *            the new target person household head flag
     */
    public void setTargetPersonHouseholdHeadFlag(final boolean targetPersonHouseholdHeadFlag) {
        this.targetPersonHouseholdHeadFlag = targetPersonHouseholdHeadFlag;
    }

    /**
     * Gets the del household head person flag.
     * 
     * @return the del household head person flag
     */
    public boolean getDelHouseholdHeadPersonFlag() {
        return delHouseholdHeadPersonFlag;
    }

    /**
     * Sets the del household head person flag.
     * 
     * @param delHouseholdHeadPersonFlag
     *            the new del household head person flag
     */
    public void setDelHouseholdHeadPersonFlag(final boolean delHouseholdHeadPersonFlag) {
        this.delHouseholdHeadPersonFlag = delHouseholdHeadPersonFlag;
    }

    /**
     * Gets the del all flag.
     * 
     * @return the del all flag
     */
    public boolean getDelAllFlag() {
        return delAllFlag;
    }

    /**
     * Sets the del all flag.
     * 
     * @param delAllFlag
     *            the new del all flag
     */
    public void setDelAllFlag(final boolean delAllFlag) {
        this.delAllFlag = delAllFlag;
    }

    /**
     * Gets the finish new house flag.
     * 
     * @return the finish new house flag
     */
    public boolean getFinishNewHouseFlag() {
        return finishNewHouseFlag;
    }

    /**
     * Sets the finish new house flag.
     * 
     * @param finishNewHouseFlag
     *            the new finish new house flag
     */
    public void setFinishNewHouseFlag(final boolean finishNewHouseFlag) {
        this.finishNewHouseFlag = finishNewHouseFlag;
    }

    /**
     * Gets the target person data.
     * 
     * @return the target person data
     */
    public DelPersonDataObject getTargetPersonData() {
        return targetPersonData;
    }

    /**
     * Sets the target person data.
     * 
     * @param targetPersonData
     *            the new target person data
     */
    public void setTargetPersonData(final DelPersonDataObject targetPersonData) {
        this.targetPersonData = targetPersonData;
    }

    /**
     * Gets the current del person data object.
     * 
     * @return the current del person data object
     */
    public DelPersonDataObject getCurrentDelPersonDataObject() {
        return currentDelPersonDataObject;
    }

    /**
     * Sets the current del person data object.
     * 
     * @param currentDelPersonDataObject
     *            the new current del person data object
     */
    public void setCurrentDelPersonDataObject(final DelPersonDataObject currentDelPersonDataObject) {
        this.currentDelPersonDataObject = currentDelPersonDataObject;
    }

    /**
     * Gets the old house non person list.
     * 
     * @return the old house non person list
     */
    public List<XLDFDomainObject> getOldHouseNonPersonList() {
        return oldHouseNonPersonList;
    }

    /**
     * Sets the old house non person list.
     * 
     * @param oldHouseNonPersonList
     *            the new old house non person list
     */
    public void setOldHouseNonPersonList(final List<XLDFDomainObject> oldHouseNonPersonList) {
        this.oldHouseNonPersonList = oldHouseNonPersonList;
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
     * Gets the old house person cnt.
     * 
     * @return the old house person cnt
     */
    public int getOldHousePersonCnt() {
        return oldHousePersonCnt;
    }

    /**
     * Sets the old house person cnt.
     * 
     * @param oldHousePersonCnt
     *            the new old house person cnt
     */
    public void setOldHousePersonCnt(final int oldHousePersonCnt) {
        this.oldHousePersonCnt = oldHousePersonCnt;
    }

    /**
     * Gets the del person cnt.
     * 
     * @return the del person cnt
     */
    public int getDelPersonCnt() {
        return delPersonCnt;
    }

    /**
     * Sets the del person cnt.
     * 
     * @param delPersonCnt
     *            the new del person cnt
     */
    public void setDelPersonCnt(final int delPersonCnt) {
        this.delPersonCnt = delPersonCnt;
    }

    /**
     * Gets the final house person cnt.
     * 
     * @return the final house person cnt
     */
    public int getFinalHousePersonCnt() {
        return finalHousePersonCnt;
    }

    /**
     * Sets the final house person cnt.
     * 
     * @param finalHousePersonCnt
     *            the new final house person cnt
     */
    public void setFinalHousePersonCnt(final int finalHousePersonCnt) {
        this.finalHousePersonCnt = finalHousePersonCnt;
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
     * Gets the apply type flag.
     * 
     * @return the apply type flag
     */
    public String getApplyTypeFlag() {
        return applyTypeFlag;
    }

    /**
     * Sets the apply type flag.
     * 
     * @param applyTypeFlag
     *            the new apply type flag
     */
    public void setApplyTypeFlag(final String applyTypeFlag) {
        this.applyTypeFlag = applyTypeFlag;
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
     * Gets the old household head person data object.
     * 
     * @return the old household head person data object
     */
    public DelPersonDataObject getOldHouseholdHeadPersonDataObject() {
        return oldHouseholdHeadPersonDataObject;
    }

    /**
     * Sets the old household head person data object.
     * 
     * @param oldHouseholdHeadPersonDataObject
     *            the new old household head person data object
     */
    public void setOldHouseholdHeadPersonDataObject(final DelPersonDataObject oldHouseholdHeadPersonDataObject) {
        this.oldHouseholdHeadPersonDataObject = oldHouseholdHeadPersonDataObject;
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
     * Gets the new household head person data object.
     * 
     * @return the new household head person data object
     */
    public DelPersonDataObject getNewHouseholdHeadPersonDataObject() {
        return newHouseholdHeadPersonDataObject;
    }

    /**
     * Sets the new household head person data object.
     * 
     * @param newHouseholdHeadPersonDataObject
     *            the new new household head person data object
     */
    public void setNewHouseholdHeadPersonDataObject(final DelPersonDataObject newHouseholdHeadPersonDataObject) {
        this.newHouseholdHeadPersonDataObject = newHouseholdHeadPersonDataObject;
    }

    /**
     * Gets the new household head id.
     * 
     * @return the new household head id
     */
    public String getNewHouseholdHeadId() {
        return newHouseholdHeadId;
    }

    /**
     * Sets the new household head id.
     * 
     * @param newHouseholdHeadId
     *            the new new household head id
     */
    public void setNewHouseholdHeadId(final String newHouseholdHeadId) {
        this.newHouseholdHeadId = newHouseholdHeadId;
    }

    /**
     * Gets the new household head name.
     * 
     * @return the new household head name
     */
    public String getNewHouseholdHeadName() {
        return newHouseholdHeadName;
    }

    /**
     * Sets the new household head name.
     * 
     * @param newHouseholdHeadName
     *            the new new household head name
     */
    public void setNewHouseholdHeadName(final String newHouseholdHeadName) {
        this.newHouseholdHeadName = newHouseholdHeadName;
    }

    /**
     * Gets the del person data list.
     * 
     * @return the del person data list
     */
    public List<DelPersonDataObject> getDelPersonDataList() {
        return delPersonDataList;
    }

    /**
     * Sets the del person data list.
     * 
     * @param delPersonDataList
     *            the new del person data list
     */
    public void setDelPersonDataList(final List<DelPersonDataObject> delPersonDataList) {
        this.delPersonDataList = delPersonDataList;
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
     * Gets the new house person data list.
     * 
     * @return the new house person data list
     */
    public List<DelPersonDataObject> getNewHousePersonDataList() {
        return newHousePersonDataList;
    }

    /**
     * Sets the new house person data list.
     * 
     * @param newHousePersonDataList
     *            the new new house person data list
     */
    public void setNewHousePersonDataList(final List<DelPersonDataObject> newHousePersonDataList) {
        this.newHousePersonDataList = newHousePersonDataList;
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
     * Gets the del nationality date.
     * 
     * @return the del nationality date
     */
    public String getDelNationalityDate() {
        return delNationalityDate;
    }

    /**
     * Sets the del nationality date.
     * 
     * @param delNationalityDate
     *            the new del nationality date
     */
    public void setDelNationalityDate(final String delNationalityDate) {
        this.delNationalityDate = delNationalityDate;
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
     * Gets the main del reason.
     * 
     * @return the main del reason
     */
    public String getMainDelReason() {
        return mainDelReason;
    }

    /**
     * Sets the main del reason.
     * 
     * @param mainDelReason
     *            the new main del reason
     */
    public void setMainDelReason(final String mainDelReason) {
        this.mainDelReason = mainDelReason;
    }

    /**
     * Gets the business date.
     * 
     * @return the business date
     */
    public String getBusinessDate() {
        return businessDate;
    }

    /**
     * Sets the business date.
     * 
     * @param businessDate
     *            the new business date
     */
    public void setBusinessDate(final String businessDate) {
        this.businessDate = businessDate;
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
     * Gets the old household head name.
     * 
     * @return the old household head name
     */
    public String getOldHouseholdHeadName() {
        return oldHouseholdHeadName;
    }

    /**
     * Sets the old household head name.
     * 
     * @param oldHouseholdHeadName
     *            the new old household head name
     */
    public void setOldHouseholdHeadName(final String oldHouseholdHeadName) {
        this.oldHouseholdHeadName = oldHouseholdHeadName;
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
     * Gets the xldfx09jm list.
     * 
     * @return the xldfx09jm list
     */
    public List<XLDFX09JM> getXldfx09jmList() {
        return xldfx09jmList;
    }

    /**
     * Sets the xldfx09jm list.
     * 
     * @param xldfx09jmList
     *            the new xldfx09jm list
     */
    public void setXldfx09jmList(final List<XLDFX09JM> xldfx09jmList) {
        this.xldfx09jmList = xldfx09jmList;
    }

    /**
     * Gets the xldfx09jh list.
     * 
     * @return the xldfx09jh list
     */
    public List<XLDFX09JH> getXldfx09jhList() {
        return xldfx09jhList;
    }

    /**
     * Sets the xldfx09jh list.
     * 
     * @param xldfx09jhList
     *            the new xldfx09jh list
     */
    public void setXldfx09jhList(final List<XLDFX09JH> xldfx09jhList) {
        this.xldfx09jhList = xldfx09jhList;
    }

    /**
     * Gets the xldfy09jm list.
     * 
     * @return the xldfy09jm list
     */
    public List<XLDFY09JM> getXldfy09jmList() {
        return xldfy09jmList;
    }

    /**
     * Sets the xldfy09jm list.
     * 
     * @param xldfy09jmList
     *            the new xldfy09jm list
     */
    public void setXldfy09jmList(final List<XLDFY09JM> xldfy09jmList) {
        this.xldfy09jmList = xldfy09jmList;
    }

    /**
     * Gets the xldfy09jh list.
     * 
     * @return the xldfy09jh list
     */
    public List<XLDFY09JH> getXldfy09jhList() {
        return xldfy09jhList;
    }

    /**
     * Sets the xldfy09jh list.
     * 
     * @param xldfy09jhList
     *            the new xldfy09jh list
     */
    public void setXldfy09jhList(final List<XLDFY09JH> xldfy09jhList) {
        this.xldfy09jhList = xldfy09jhList;
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
     * Checks if is do fine check flag.
     * 
     * @return true, if is do fine check flag
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
     * Gets the cancel kind.
     * 
     * @return the cancel kind
     */
    public String getCancelKind() {
        return cancelKind;
    }

    /**
     * Sets the cancel kind.
     * 
     * @param cancelKind
     *            the new cancel kind
     */
    public void setCancelKind(final String cancelKind) {
        this.cancelKind = cancelKind;
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
    public void setUserId(String userId) {
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
     * Gets the father nationality.
     * 
     * @return the father nationality
     */
    public String getFatherNationality() {
        return fatherNationality;
    }

    /**
     * Sets the father nationality.
     * 
     * @param fatherNationality
     *            the new father nationality
     */
    public void setFatherNationality(final String fatherNationality) {
        this.fatherNationality = fatherNationality;
    }

    /**
     * Gets the father web name.
     * 
     * @return the father web name
     */
    public String getFatherWebName() {
        return fatherWebName;
    }

    /**
     * Sets the father web name.
     * 
     * @param fatherWebName
     *            the new father web name
     */
    public void setFatherWebName(final String fatherWebName) {
        this.fatherWebName = fatherWebName;
    }

    /**
     * Gets the mother nationality.
     * 
     * @return the mother nationality
     */
    public String getMotherNationality() {
        return motherNationality;
    }

    /**
     * Sets the mother nationality.
     * 
     * @param motherNationality
     *            the new mother nationality
     */
    public void setMotherNationality(final String motherNationality) {
        this.motherNationality = motherNationality;
    }

    /**
     * Gets the mother web name.
     * 
     * @return the mother web name
     */
    public String getMotherWebName() {
        return motherWebName;
    }

    /**
     * Sets the mother web name.
     * 
     * @param motherWebName
     *            the new mother web name
     */
    public void setMotherWebName(final String motherWebName) {
        this.motherWebName = motherWebName;
    }

    /**
     * Gets the spouse nationality.
     * 
     * @return the spouse nationality
     */
    public String getSpouseNationality() {
        return spouseNationality;
    }

    /**
     * Sets the spouse nationality.
     * 
     * @param spouseNationality
     *            the new spouse nationality
     */
    public void setSpouseNationality(final String spouseNationality) {
        this.spouseNationality = spouseNationality;
    }

    /**
     * Gets the spouse web name.
     * 
     * @return the spouse web name
     */
    public String getSpouseWebName() {
        return spouseWebName;
    }

    /**
     * Sets the spouse web name.
     * 
     * @param spouseWebName
     *            the new spouse web name
     */
    public void setSpouseWebName(final String spouseWebName) {
        this.spouseWebName = spouseWebName;
    }

    /**
     * Gets the foster nationality.
     * 
     * @return the foster nationality
     */
    public String getFosterNationality() {
        return fosterNationality;
    }

    /**
     * Sets the foster nationality.
     * 
     * @param fosterNationality
     *            the new foster nationality
     */
    public void setFosterNationality(final String fosterNationality) {
        this.fosterNationality = fosterNationality;
    }

    /**
     * Gets the foster father web name.
     * 
     * @return the foster father web name
     */
    public String getFosterFatherWebName() {
        return fosterFatherWebName;
    }

    /**
     * Sets the foster father web name.
     * 
     * @param fosterFatherWebName
     *            the new foster father web name
     */
    public void setFosterFatherWebName(final String fosterFatherWebName) {
        this.fosterFatherWebName = fosterFatherWebName;
    }

    /**
     * Gets the foster mother web name.
     * 
     * @return the foster mother web name
     */
    public String getFosterMotherWebName() {
        return fosterMotherWebName;
    }

    /**
     * Sets the foster mother web name.
     * 
     * @param fosterMotherWebName
     *            the new foster mother web name
     */
    public void setFosterMotherWebName(final String fosterMotherWebName) {
        this.fosterMotherWebName = fosterMotherWebName;
    }

    /**
     * Gets the china passport date.
     * 
     * @return the china passport date
     */
    public String getChinaPassportDate() {
        return chinaPassportDate;
    }

    /**
     * Sets the china passport date.
     * 
     * @param chinaPassportDate
     *            the new china passport date
     */
    public void setChinaPassportDate(final String chinaPassportDate) {
        this.chinaPassportDate = chinaPassportDate;
    }

    /**
     * Gets the china household date.
     * 
     * @return the china household date
     */
    public String getChinaHouseholdDate() {
        return chinaHouseholdDate;
    }

    /**
     * Sets the china household date.
     * 
     * @param chinaHouseholdDate
     *            the new china household date
     */
    public void setChinaHouseholdDate(final String chinaHouseholdDate) {
        this.chinaHouseholdDate = chinaHouseholdDate;
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
     * Gets the org household note.
     * 
     * @return the org household note
     */
    public String getOrgHouseholdNote() {
        return orgHouseholdNote;
    }

    /**
     * Sets the org household note.
     * 
     * @param orgHouseholdNote
     *            the new org household note
     */
    public void setOrgHouseholdNote(final String orgHouseholdNote) {
        this.orgHouseholdNote = orgHouseholdNote;
    }

    /**
     * Gets the org person note map.
     * 
     * @return the org person note map
     */
    public Map<String, String> getOrgPersonNoteMap() {
        return orgPersonNoteMap;
    }

    /**
     * Sets the org person note map.
     * 
     * @param orgPersonNoteMap
     *            the org person note map
     */
    public void setOrgPersonNoteMap(final Map<String, String> orgPersonNoteMap) {
        this.orgPersonNoteMap = orgPersonNoteMap;
    }

    /**
     * Gets the apply seq num.
     * 
     * @return the apply seq num
     */
    public int getApplySeqNum() {
        return applySeqNum;
    }

    /**
     * Sets the apply seq num.
     * 
     * @param applySeqNum
     *            the new apply seq num
     */
    public void setApplySeqNum(final int applySeqNum) {
        this.applySeqNum = applySeqNum;
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

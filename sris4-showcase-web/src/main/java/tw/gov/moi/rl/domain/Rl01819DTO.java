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
import tw.gov.moi.rl.component.xldf.dto.XLDFX09IH;
import tw.gov.moi.rl.component.xldf.dto.XLDFX09IM;
import tw.gov.moi.rl.component.xldf.dto.XLDFY09IH;
import tw.gov.moi.rl.component.xldf.dto.XLDFY09IM;
import tw.gov.moi.rl.domain.xldf.XLDFHouseholdDataDomainObject;
import tw.gov.moi.rl.domain.xldf.XLDFHouseholdNoteDomainObject;
import tw.gov.moi.rl.domain.xldf.XLDFPersonDataDomainObject;
import tw.gov.moi.rl.domain.xldf.XLDFPersonNoteDomainObject;

/**
 * 撤銷戶籍登記.
 * 
 * @author Peter Yu
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Rl01819DTO", propOrder = { "transactionId", "acceptSiteId", "userId", "initTime",
        "acceptAdminOfficeCode", "acceptAreaCode", "openingOperationDTO", "webFinalPersonId", "webFinalPersonSiteId",
        "finalPersonData", "finalHouseholdData", "finalPersonOrgEducationMark", "oldHouseholdHeadPersonDataObject",
        "oldHouseholdData", "newHouseholdHeadPersonDataObject", "newHouseholdData", "targetPersonData",
        "beforeFinalFlag", "beforeFinalMoveInYyymmdd", "beforeFinalAreaCode", "beforeFinalCountyCode",
        "beforeFinalTownCode", "beforeFinalVillage", "beforeFinalNeighbor", "beforeFinalStreetDoorplate",
        "currentDelPersonDataObject", "apply1", "apply2", "delegated", "finePerson", "delPersonIdMap",
        "delXCDF001MRLMap", "delXLDF004NMap", "manCount", "womanCount", "delPersonCnt", "delHouseholdHeadPersonFlag",
        "removeHouseholdFlag", "crossSiteEnabled", "systemDate", "systemTime", "applyCode",
        "targetPersonHouseholdHeadFlag", "delAllFlag", "finishNewHouseFlag", "oldHousePersonCnt",
        "finalHousePersonCnt", "registerDate", "registerTime", "applyDate", "enforcedFlag", "enforcedApplicant",
        "oldHouseholdId", "delYyymmdd", "delReason", "delReasonName", "otherCertificate", "registerContent",
        "eventDate", "doFineCheckFlag", "needFineFlag", "fineFreeFlag", "removeFeeReason", "doFineCheckFlagOpen",
        "acceptAdminOfficeName", "settleCityCountyName", "settleTownName", "oldHouseholdHeadName",
        "apply1Relatioinship", "apply2Relatioinship", "outliveCaseFlag", "fineSerialNumber", "feeAmount", "applySeq",
        "applyCaseNo", "fineEventDate", "operationCode", "applySequenceId", "deleteFineDTOFlag",
        "previousDoFineCheckFlag", "previousFineEventDate", "fineDTO", "acceptRegistrarName", "acceptRegistrarId",
        "receiptId", "feeCancelFlag", "applyCancelFlag", "applyCancelDate", "fineList", "certificateList",
        "oldHouseNonPersonList", "initErrorMessageList", "addPersonErrorMsgMap", "oldHousePersonIdMap",
        "namePersonIdMap", "warningMessgeList", "addPersonErrorMessageList", "householdNoteList", "personNoteList",
        "orgHouseholdNote", "orgPersonNoteMap", "xldfx09ImList", "xldfx09IhList", "xldfy09ImList", "xldfy09IhList",
        "delPersonDataList", "newHousePersonDataList", "personNoteFlag", "fineReceiptId", "fgCheckBtn1", "cancelKind",
        "cancelPermit", "otherCertificateFlag", "initSuccess", "activeIndex", "lockMode", "bigHousehole" })
@XmlRootElement(name = "Rl01819DTO")
public class Rl01819DTO implements Serializable {

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

    /** (Web撤銷後設籍地)當事人統號. */
    @XmlElement(name = "WebFinalPersonId", required = true)
    @FieldName("(Web撤銷後設籍地)當事人統號")
    private String webFinalPersonId;

    /** (Web撤銷後設籍地)當事人作業點代碼. */
    @XmlElement(name = "WebFinalPersonSiteId", required = true)
    @FieldName("(Web撤銷後設籍地)當事人作業點代碼")
    private String webFinalPersonSiteId;

    /** (撤銷後設籍地)當事人個人基本資料. */
    @XmlElement(name = "FinalPersonData", required = true)
    @FieldName("(撤銷後設籍地)當事人個人基本資料")
    private XLDFPersonDataDomainObject finalPersonData;

    /** (撤銷後設籍地)當事人-全戶基本資料. */
    @XmlElement(name = "FinalHouseholdData", required = true)
    @FieldName("(撤銷後設籍地)當事人-全戶基本資料")
    private XLDFHouseholdDataDomainObject finalHouseholdData;

    /** (撤銷後設籍地)當事人-原教育程度註記. */
    @XmlElement(name = "FinalPersonOrgEducationMark", required = true)
    @FieldName("(撤銷後設籍地)當事人-原教育程度註記")
    private String finalPersonOrgEducationMark;

    /** (原戶)戶長-個人資料物件. */
    @XmlElement(name = "OldHouseholdHeadPersonDataObject", required = true)
    @FieldName("(原戶)戶長-個人資料物件")
    private DelPersonDataObject oldHouseholdHeadPersonDataObject;

    /** (原戶)全戶基本資料. */
    @XmlElement(name = "OldHouseholdData", required = true)
    @FieldName("(原戶)全戶基本資料")
    private XLDFHouseholdDataDomainObject oldHouseholdData;

    /** (撤銷後新戶)戶長-個人資料物件. */
    @XmlElement(name = "NewHouseholdHeadPersonDataObject", required = true)
    @FieldName("(撤銷後新戶)戶長-個人資料物件")
    private DelPersonDataObject newHouseholdHeadPersonDataObject = new DelPersonDataObject();

    /** (撤銷後新戶)全戶基本資料. */
    @XmlElement(name = "NewHouseholdData", required = true)
    @FieldName("(撤銷後新戶)全戶基本資料 ")
    private XLDFHouseholdDataDomainObject newHouseholdData;

    /** (撤銷戶籍)大簿當事人. */
    @XmlElement(name = "TargetPersonData", required = true)
    @FieldName("(撤銷戶籍)大簿當事人")
    private DelPersonDataObject targetPersonData;

    /** (原始設籍地)「原始設籍地」同「撤銷後設籍地」旗標. */
    @XmlElement(name = "BeforeFinalFlag", required = true)
    @FieldName("(撤銷戶籍)「原始設籍地」同「撤銷後設籍地」旗標")
    private String beforeFinalFlag = RlConstant.STRING_TWO;

    /** (原始設籍地)當事人-設籍日期. */
    @XmlElement(name = "BeforeFinalMoveInYyymmdd", required = true)
    @FieldName("(原始設籍地)當事人-設籍日期")
    private String beforeFinalMoveInYyymmdd;

    /** (原始設籍地)戶籍地址-省市縣市(行政區域代碼前5碼). */
    @XmlElement(name = "BeforeFinalAreaCode", required = true)
    @FieldName("(原始設籍地)戶籍地址-省市縣市(行政區域代碼前5碼)")
    private String beforeFinalAreaCode;

    /** (原始設籍地)戶籍地址-省市縣市(行政區域代碼前5碼). */
    @XmlElement(name = "BeforeFinalCountyCode", required = true)
    @FieldName("(原始設籍地)戶籍地址-省市縣市(行政區域代碼前5碼)")
    private String beforeFinalCountyCode;

    /** (原始設籍地)戶籍地址-鄉鎮市區(行政區域代碼). */
    @XmlElement(name = "BeforeFinalTownCode", required = true)
    @FieldName("(原始設籍地)戶籍地址-鄉鎮市區(行政區域代碼)")
    private String beforeFinalTownCode;

    /** (原始設籍地) 戶籍地址-村里. */
    @XmlElement(name = "BeforeFinalVillage", required = true)
    @FieldName("(原始設籍地)  戶籍地址-村里")
    private String beforeFinalVillage;

    /** (原始設籍地)戶籍地址-鄰. */
    @XmlElement(name = "BeforeFinalNeighbor", required = true)
    @FieldName("(原始設籍地)戶籍地址-鄰")
    private String beforeFinalNeighbor;

    /** (原始設籍地)戶籍地址-街路門牌. */
    @XmlElement(name = "BeforeFinalStreetDoorplate", required = true)
    @FieldName("(原始設籍地)戶籍地址-街路門牌")
    private String beforeFinalStreetDoorplate;

    /** 當下的撤銷戶籍者. */
    @XmlElement(name = "CurrentDelPersonDataObject", required = true)
    @FieldName("當下的撤銷戶籍者")
    private DelPersonDataObject currentDelPersonDataObject = new DelPersonDataObject();

    /** 申請人1. */
    @XmlElement(name = "Apply1", required = true)
    @FieldName("申請人1")
    private XLDFApplicantDataDTO apply1;

    /** 申請人2. */
    @XmlElement(name = "Apply2", required = true)
    @FieldName("申請人2")
    private XLDFApplicantDataDTO apply2;

    /** 受委託人. */
    @XmlElement(name = "Delegated", required = true)
    @FieldName("受委託人")
    private XLDFPersonBriefDataDTO delegated;

    /** 受處分人. */
    @XmlElement(name = "FinePerson", required = true)
    @FieldName("受處分人")
    private XLDFApplicantDataDTO finePerson = new XLDFApplicantDataDTO();

    /** (撤銷戶籍者)統號-人員物件MAP. */
    @XmlElement(name = "DelPersonIdMap", required = true)
    @FieldName("(撤銷戶籍者)統號-人員物件MAP")
    private Map<String, DelPersonDataObject> delPersonIdMap = new HashMap<String, DelPersonDataObject>();

    /** (撤銷戶籍者)統號-XCDF001MRL物件MAP. */
    @XmlElement(name = "DelXCDF001MRLMap", required = true)
    @FieldName("(撤銷戶籍者)統號-XCDF001MRL物件MAP")
    private Map<String, XCDF001MRL> delXCDF001MRLMap = new HashMap<String, XCDF001MRL>();

    /** (撤銷戶籍者)統號-XCDF001MRL物件MAP. */
    @XmlElement(name = "DelXLDF004NMap", required = true)
    @FieldName("(撤銷戶籍者)統號-XLDF004N物件MAP")
    private Map<String, String> delXLDF004NMap = new HashMap<String, String>();

    /** (撤銷戶籍者)男性人數. */
    @XmlElement(name = "ManCount", required = true)
    @FieldName("(撤銷戶籍者)男性人數")
    private int manCount;

    /** (撤銷戶籍者)女性人數. */
    @XmlElement(name = "WomanCount", required = true)
    @FieldName("(撤銷戶籍者)女性人數")
    private int womanCount;

    /** (撤銷戶籍者)人數. */
    @XmlElement(name = "DelPersonCnt", required = true)
    @FieldName("(撤銷戶籍者)人數")
    private int delPersonCnt;

    /** (撤銷戶籍者)包含戶長旗標. */
    @XmlElement(name = "DelHouseholdHeadPersonFlag", required = true)
    @FieldName("(撤銷戶籍者)包含戶長旗標")
    private boolean delHouseholdHeadPersonFlag;

    /** (旗標)1:全戶撤銷 2:部分撤銷含戶長. */
    @XmlElement(name = "RemoveHouseholdFlag", required = true)
    @FieldName("(旗標)1:全戶撤銷  2:部分撤銷含戶長")
    private String removeHouseholdFlag;

    /** 是否可異地辦理. */
    @XmlElement(name = "CrossSiteEnabled", required = true)
    @FieldName("是否可異地辦理")
    private String crossSiteEnabled;

    /** 系統日期. */
    @XmlElement(name = "SystemDate", required = true)
    @FieldName("系統日期 ")
    private String systemDate;

    /** 系統時間. */
    @XmlElement(name = "SystemTime", required = true)
    @FieldName("系統時間")
    private String systemTime;

    /** 申請書類別. */
    @XmlElement(name = "ApplyCode", required = true)
    @FieldName("申請書類別")
    private String applyCode;

    /** (撤銷戶籍)大簿當事人為戶長旗標. */
    @XmlElement(name = "TargetPersonHouseholdHeadFlag", required = true)
    @FieldName("(撤銷戶籍)大簿當事人為戶長旗標 ")
    private boolean targetPersonHouseholdHeadFlag;

    /** (旗標)全戶撤銷. */
    @XmlElement(name = "DelAllFlag", required = true)
    @FieldName("(旗標)全戶撤銷")
    private boolean delAllFlag;

    /** 完成確認「撤銷後新戶」資料. */
    @XmlElement(name = "FinishNewHouseFlag", required = true)
    @FieldName("完成確認「撤銷後新戶」資料 ")
    private boolean finishNewHouseFlag;

    /** 原戶成員人數. */
    @XmlElement(name = "OldHousePersonCnt", required = true)
    @FieldName("原戶成員人數")
    private int oldHousePersonCnt;

    /** 撤銷後戶內成員數. */
    @XmlElement(name = "FinalHousePersonCnt", required = true)
    @FieldName("撤銷後戶內成員數")
    private int finalHousePersonCnt;

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

    /** (原戶)戶號. */
    @XmlElement(name = "OldHouseholdId", required = true)
    @FieldName("(原戶)戶號")
    private String oldHouseholdId;

    /** 撤銷日期. */
    @XmlElement(name = "DelYyymmdd", required = true)
    @FieldName("撤銷日期 ")
    private String delYyymmdd;

    /** 撤銷原因. */
    @XmlElement(name = "DelReason", required = true)
    @FieldName("撤銷原因")
    private String delReason = RlConstant.STRING_ZERO + RlConstant.STRING_THREE;

    /** 撤銷原因名稱. */
    @XmlElement(name = "DelReasonName", required = true)
    @FieldName("撤銷原因名稱")
    private String delReasonName;

    /** 其他附繳證件名稱. */
    @XmlElement(name = "otherCertificate", required = true)
    @FieldName("其他附繳證件名稱")
    private String otherCertificate = StringUtils.EMPTY;

    /** 申請書備註. */
    @XmlElement(name = "RegisterContent", required = true)
    @FieldName("申請書備註")
    private String registerContent;

    /** 事件發生（確定）日期. */
    @XmlElement(name = "EventDate", required = true)
    @FieldName("事件發生（確定）日期")
    private String eventDate = StringUtils.EMPTY;

    /** 進行逾期申報之罰鍰檢視. */
    @XmlElement(name = "EventDate", required = true)
    @FieldName("進行逾期申報之罰鍰檢視")
    private boolean doFineCheckFlag;

    /** 判斷是否罰鍰旗標. */
    @XmlElement(name = "NeedFineFlag", required = true)
    @FieldName("判斷是否罰鍰旗標")
    private String needFineFlag = "N";

    /** 須進行罰鍰處理. */
    @XmlElement(name = "FineFreeFlag", required = true)
    @FieldName("目前有罰鍰，改為不須罰鍰")
    private boolean fineFreeFlag;

    /** 免罰原因. */
    @XmlElement(name = "RemoveFeeReason", required = true)
    @FieldName("免罰原因")
    private String removeFeeReason;

    /** 旗標-進行逾期申報之罰鍰檢視. */
    @XmlElement(name = "DoFineCheckFlagOpen", required = true)
    @FieldName("旗標-進行逾期申報之罰鍰檢視")
    private boolean doFineCheckFlagOpen;

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

    /** 申請人1-與當事人關係. */
    @XmlElement(name = "Apply1Relatioinship", required = true)
    @FieldName("申請人1-與當事人關係")
    private String apply1Relatioinship;

    /** 申請人2-與當事人關係. */
    @XmlElement(name = "Apply2Relatioinship", required = true)
    @FieldName("申請人2-與當事人關係")
    private String apply2Relatioinship;

    /** 撤銷戶籍者-非現住人口處理註記. */
    @XmlElement(name = "OutliveCaseFlag", required = true)
    @FieldName("撤銷戶籍者-非現住人口處理註記")
    private String outliveCaseFlag;

    /** 戶籍罰鍰條款註記. */
    @XmlElement(name = "FineSerialNumber", required = true)
    @FieldName("戶籍罰鍰條款註記")
    private String fineSerialNumber = "";

    /** 戶籍罰鍰金鍰. */
    @XmlElement(name = "FeeAmount", required = true)
    @FieldName("戶籍罰鍰金鍰")
    private String feeAmount = "";

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

    /** 罰鍰處理資料. */
    @XmlElement(name = "FineDTO", required = true)
    @FieldName("罰鍰處理資料")
    private FineDTO fineDTO = new FineDTO();

    /** 受理地戶籍員姓名. */
    @XmlElement(name = "AcceptRegistrarName", required = true)
    @FieldName("受理地戶籍員姓名")
    private String acceptRegistrarName;

    /** 受理地戶籍員帳號. */
    @XmlElement(name = "AcceptRegistrarId", required = true)
    @FieldName("受理地戶籍員帳號")
    private String acceptRegistrarId;

    /** 收據號碼. */
    @XmlElement(name = "ReceiptId", required = true)
    @FieldName("收據號碼 ")
    private String receiptId;

    /** 規費是否作廢. */
    @XmlElement(name = "FeeCancelFlag", required = true)
    @FieldName("規費是否作廢")
    private String feeCancelFlag;

    /** 撤銷作廢註記. */
    @XmlElement(name = "ApplyCancelFlag", required = true)
    @FieldName("撤銷作廢註記")
    private String applyCancelFlag;

    /** 撤銷作廢日期. */
    @XmlElement(name = "ApplyCancelDate", required = true)
    @FieldName("撤銷作廢日期")
    private String applyCancelDate;

    /** 罰鍰記事清單. */
    @XmlElement(name = "FineList", required = true)
    @FieldName("罰鍰記事清單")
    private List<XLDFOperationFineDTO> fineList = new ArrayList<XLDFOperationFineDTO>();

    /** 附繳證件清單. */
    @XmlElement(name = "CertificateList", required = true)
    @FieldName("附繳證件清單")
    private List<String> certificateList = new ArrayList<String>();

    /** 原戶人員-非現住人口清單. */
    @XmlElement(name = "OldHouseNonPersonList", required = true)
    @FieldName("原戶人員-非現住人口清單")
    private List<XLDFDomainObject> oldHouseNonPersonList = new ArrayList<XLDFDomainObject>();

    /** 初始1819時的錯誤訊息清單. */
    @XmlElement(name = "InitErrorMessageList", required = true)
    @FieldName("初始1819時的錯誤訊息清單")
    private List<List<String>> initErrorMessageList = new ArrayList<List<String>>();

    /** 新增撤銷戶籍者的錯誤訊息. */
    @XmlElement(name = "AddPersonErrorMsgMap", required = true)
    @FieldName("新增撤銷戶籍者的錯誤訊息")
    private Map<String, List<List<String>>> addPersonErrorMsgMap = new HashMap<String, List<List<String>>>();;

    /** 原戶人員-統號-人員物件MAP. */
    @XmlElement(name = "OldHousePersonIdMap", required = true)
    @FieldName("原戶人員-統號-人員物件MAP")
    private Map<String, DelPersonDataObject> oldHousePersonIdMap = new HashMap<String, DelPersonDataObject>();

    /** 統號-姓名 人員物件MAP. */
    @XmlElement(name = "NamePersonIdMap", required = true)
    @FieldName("原戶人員-統號-人員物件MAP")
    private Map<String, String> namePersonIdMap = new HashMap<String, String>();

    /** 警告訊息清單. */
    @XmlElement(name = "WarningMessgeList", required = true)
    @FieldName("警告訊息清單")
    private List<List<String>> warningMessgeList = new ArrayList<List<String>>();

    /** 新增撤銷戶籍者錯誤訊息清單. */
    @XmlElement(name = "AddPersonErrorMessageList", required = true)
    @FieldName("新增撤銷戶籍者錯誤訊息清單")
    private List<List<String>> addPersonErrorMessageList = new ArrayList<List<String>>();

    /** 全戶記事清單. */
    @XmlElement(name = "HouseholdNoteList", required = true)
    @FieldName("全戶記事清單")
    private List<XLDFHouseholdNoteDomainObject> householdNoteList = new ArrayList<XLDFHouseholdNoteDomainObject>();

    /** 個人記事清單. */
    @XmlElement(name = "PersonNoteList", required = true)
    @FieldName("個人記事清單")
    private List<XLDFPersonNoteDomainObject> personNoteList = new ArrayList<XLDFPersonNoteDomainObject>();

    /** 原始全戶記事. */
    @XmlElement(name = "OrgHouseholdNote", required = true)
    @FieldName("原始全戶記事")
    private String orgHouseholdNote;

    /** 原始個人記事. */
    @XmlElement(name = "OrgPersonNoteMap", required = true)
    @FieldName("原始個人記事")
    private Map<String, String> orgPersonNoteMap = new HashMap<String, String>();

    /** 現戶-全戶記事欄位化清單. */
    @XmlElement(name = "Xldfx09ImList", required = true)
    @FieldName("現戶-全戶記事欄位化清單")
    private List<XLDFX09IM> xldfx09ImList = new ArrayList<XLDFX09IM>();

    /** 除戶-全戶記事欄位化清單. */
    @XmlElement(name = "Xldfx09IhList", required = true)
    @FieldName("除戶-全戶記事欄位化清單")
    private List<XLDFX09IH> xldfx09IhList = new ArrayList<XLDFX09IH>();

    /** 現戶-個人記事欄位化清單. */
    @XmlElement(name = "Xldfy09ImList", required = true)
    @FieldName("現戶-個人記事欄位化清單")
    private List<XLDFY09IM> xldfy09ImList = new ArrayList<XLDFY09IM>();

    /** 除戶-個人記事欄位化清單. */
    @XmlElement(name = "Xldfy09IhList", required = true)
    @FieldName("除戶-個人記事欄位化清單")
    private List<XLDFY09IH> xldfy09IhList = new ArrayList<XLDFY09IH>();

    /** 撤銷戶籍者資料清單. */
    @XmlElement(name = "DelPersonDataList", required = true)
    @FieldName("撤銷戶籍者資料清單")
    private List<DelPersonDataObject> delPersonDataList = new ArrayList<DelPersonDataObject>();

    /** 新戶成員清單資料. */
    @XmlElement(name = "NewHousePersonDataList", required = true)
    @FieldName("新戶成員清單資料")
    private List<DelPersonDataObject> newHousePersonDataList = new ArrayList<DelPersonDataObject>();

    /** (撤銷戶籍者)個人記事代碼. */
    @XmlElement(name = "PersonNoteFlag", required = true)
    @FieldName("(撤銷戶籍者)個人記事代碼")
    private String personNoteFlag;

    /** 收據號碼. */
    @XmlElement(name = "FineReceiptId", required = true)
    @FieldName("收據號碼")
    private String fineReceiptId = "";

    /** 確認按紐. */
    @XmlElement(name = "FgCheckBtn1", required = true)
    @FieldName("確認按紐")
    private String fgCheckBtn1 = "0";

    /** 是否繳交國民身分證. */
    @XmlElement(name = "CancelKind", required = true)
    @FieldName("是否繳交國民身分證")
    private String cancelKind = "";

    /** 3個月內未繳銷原籍證明，撤銷定居許可. */
    @XmlElement(name = "CancelKind", required = true)
    @FieldName("3個月內未繳銷原籍證明，撤銷定居許可")
    private String cancelPermit = "";

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
     *            the del person id map
     */
    public void setDelPersonIdMap(final Map<String, DelPersonDataObject> delPersonIdMap) {
        this.delPersonIdMap = delPersonIdMap;
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
     * Checks if is del household head person flag.
     * 
     * @return true, if is del household head person flag
     */
    public boolean isDelHouseholdHeadPersonFlag() {
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
     * Checks if is target person household head flag.
     * 
     * @return true, if is target person household head flag
     */
    public boolean isTargetPersonHouseholdHeadFlag() {
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
     * Checks if is del all flag.
     * 
     * @return true, if is del all flag
     */
    public boolean isDelAllFlag() {
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
     * Checks if is finish new house flag.
     * 
     * @return true, if is finish new house flag
     */
    public boolean isFinishNewHouseFlag() {
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
     * Gets the othercertificate.
     * 
     * @return the othercertificate
     */
    public String getOtherCertificate() {
        return otherCertificate;
    }

    /**
     * Sets the othercertificate.
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
     * Gets the outlive case flag.
     * 
     * @return the outlive case flag
     */
    public String getOutliveCaseFlag() {
        return outliveCaseFlag;
    }

    /**
     * Sets the outlive case flag.
     * 
     * @param outliveCaseFlag
     *            the new outlive case flag
     */
    public void setOutliveCaseFlag(final String outliveCaseFlag) {
        this.outliveCaseFlag = outliveCaseFlag;
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
     * Gets the accept registrar name.
     * 
     * @return the accept registrar name
     */
    public String getAcceptRegistrarName() {
        return acceptRegistrarName;
    }

    /**
     * Sets the accept registrar name.
     * 
     * @param acceptRegistrarName
     *            the new accept registrar name
     */
    public void setAcceptRegistrarName(final String acceptRegistrarName) {
        this.acceptRegistrarName = acceptRegistrarName;
    }

    /**
     * Gets the accept registrar id.
     * 
     * @return the accept registrar id
     */
    public String getAcceptRegistrarId() {
        return acceptRegistrarId;
    }

    /**
     * Sets the accept registrar id.
     * 
     * @param acceptRegistrarId
     *            the new accept registrar id
     */
    public void setAcceptRegistrarId(final String acceptRegistrarId) {
        this.acceptRegistrarId = acceptRegistrarId;
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
     * Gets the fee cancel flag.
     * 
     * @return the fee cancel flag
     */
    public String getFeeCancelFlag() {
        return feeCancelFlag;
    }

    /**
     * Sets the fee cancel flag.
     * 
     * @param feeCancelFlag
     *            the new fee cancel flag
     */
    public void setFeeCancelFlag(final String feeCancelFlag) {
        this.feeCancelFlag = feeCancelFlag;
    }

    /**
     * Gets the apply cancel flag.
     * 
     * @return the apply cancel flag
     */
    public String getApplyCancelFlag() {
        return applyCancelFlag;
    }

    /**
     * Sets the apply cancel flag.
     * 
     * @param applyCancelFlag
     *            the new apply cancel flag
     */
    public void setApplyCancelFlag(final String applyCancelFlag) {
        this.applyCancelFlag = applyCancelFlag;
    }

    /**
     * Gets the apply cancel date.
     * 
     * @return the apply cancel date
     */
    public String getApplyCancelDate() {
        return applyCancelDate;
    }

    /**
     * Sets the apply cancel date.
     * 
     * @param applyCancelDate
     *            the new apply cancel date
     */
    public void setApplyCancelDate(final String applyCancelDate) {
        this.applyCancelDate = applyCancelDate;
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
     *            the old house person id map
     */
    public void setOldHousePersonIdMap(final Map<String, DelPersonDataObject> oldHousePersonIdMap) {
        this.oldHousePersonIdMap = oldHousePersonIdMap;
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
     * Gets the person note listnew.
     * 
     * @return the person note listnew
     */
    public List<XLDFPersonNoteDomainObject> getPersonNoteList() {
        return personNoteList;
    }

    /**
     * Sets the person note listnew.
     * 
     * @param personNoteList
     *            the new person note list
     */
    public void setPersonNoteList(final List<XLDFPersonNoteDomainObject> personNoteList) {
        this.personNoteList = personNoteList;
    }

    /**
     * Gets the xldfx09 im listnew.
     * 
     * @return the xldfx09 im listnew
     */
    public List<XLDFX09IM> getXldfx09ImList() {
        return xldfx09ImList;
    }

    /**
     * Sets the xldfx09 im listnew.
     * 
     * @param xldfx09ImList
     *            the new xldfx09 im list
     */
    public void setXldfx09ImList(final List<XLDFX09IM> xldfx09ImList) {
        this.xldfx09ImList = xldfx09ImList;
    }

    /**
     * Gets the xldfx09 ih listnew.
     * 
     * @return the xldfx09 ih listnew
     */
    public List<XLDFX09IH> getXldfx09IhList() {
        return xldfx09IhList;
    }

    /**
     * Sets the xldfx09 ih listnew.
     * 
     * @param xldfx09IhList
     *            the new xldfx09 ih list
     */
    public void setXldfx09IhList(final List<XLDFX09IH> xldfx09IhList) {
        this.xldfx09IhList = xldfx09IhList;
    }

    /**
     * Gets the xldfy09 im listnew.
     * 
     * @return the xldfy09 im listnew
     */
    public List<XLDFY09IM> getXldfy09ImList() {
        return xldfy09ImList;
    }

    /**
     * Sets the xldfy09 im listnew.
     * 
     * @param xldfy09ImList
     *            the new xldfy09 im list
     */
    public void setXldfy09ImList(final List<XLDFY09IM> xldfy09ImList) {
        this.xldfy09ImList = xldfy09ImList;
    }

    /**
     * Gets the xldfy09 ih listnew.
     * 
     * @return the xldfy09 ih listnew
     */
    public List<XLDFY09IH> getXldfy09IhList() {
        return xldfy09IhList;
    }

    /**
     * Sets the xldfy09 ih listnew.
     * 
     * @param xldfy09IhList
     *            the new xldfy09 ih list
     */
    public void setXldfy09IhList(final List<XLDFY09IH> xldfy09IhList) {
        this.xldfy09IhList = xldfy09IhList;
    }

    /**
     * Gets the del person data listnew.
     * 
     * @return the del person data listnew
     */
    public List<DelPersonDataObject> getDelPersonDataList() {
        return delPersonDataList;
    }

    /**
     * Sets the del person data listnew.
     * 
     * @param delPersonDataList
     *            the new del person data list
     */
    public void setDelPersonDataList(final List<DelPersonDataObject> delPersonDataList) {
        this.delPersonDataList = delPersonDataList;
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
     *            the del xcd f001 mrl map
     */
    public void setDelXCDF001MRLMap(final Map<String, XCDF001MRL> delXCDF001MRLMap) {
        this.delXCDF001MRLMap = delXCDF001MRLMap;
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
     * Gets the final person data.
     * 
     * @return the final person data
     */
    public XLDFPersonDataDomainObject getFinalPersonData() {
        return finalPersonData;
    }

    /**
     * Sets the final person data.
     * 
     * @param finalPersonData
     *            the new final person data
     */
    public void setFinalPersonData(final XLDFPersonDataDomainObject finalPersonData) {
        this.finalPersonData = finalPersonData;
    }

    /**
     * Gets the final household data.
     * 
     * @return the final household data
     */
    public XLDFHouseholdDataDomainObject getFinalHouseholdData() {
        return finalHouseholdData;
    }

    /**
     * Sets the final household data.
     * 
     * @param finalHouseholdData
     *            the new final household data
     */
    public void setFinalHouseholdData(final XLDFHouseholdDataDomainObject finalHouseholdData) {
        this.finalHouseholdData = finalHouseholdData;
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
     * Gets the final person org education mark.
     * 
     * @return the final person org education mark
     */
    public String getFinalPersonOrgEducationMark() {
        return finalPersonOrgEducationMark;
    }

    /**
     * Sets the final person org education mark.
     * 
     * @param finalPersonOrgEducationMark
     *            the new final person org education mark
     */
    public void setFinalPersonOrgEducationMark(final String finalPersonOrgEducationMark) {
        this.finalPersonOrgEducationMark = finalPersonOrgEducationMark;
    }

    /**
     * Gets the before final flag.
     * 
     * @return the before final flag
     */
    public String getBeforeFinalFlag() {
        return beforeFinalFlag;
    }

    /**
     * Sets the before final flag.
     * 
     * @param beforeFinalFlag
     *            the new before final flag
     */
    public void setBeforeFinalFlag(final String beforeFinalFlag) {
        this.beforeFinalFlag = beforeFinalFlag;
    }

    /**
     * Gets the before final move in yyymmdd.
     * 
     * @return the before final move in yyymmdd
     */
    public String getBeforeFinalMoveInYyymmdd() {
        return beforeFinalMoveInYyymmdd;
    }

    /**
     * Sets the before final move in yyymmdd.
     * 
     * @param beforeFinalMoveInYyymmdd
     *            the new before final move in yyymmdd
     */
    public void setBeforeFinalMoveInYyymmdd(final String beforeFinalMoveInYyymmdd) {
        this.beforeFinalMoveInYyymmdd = beforeFinalMoveInYyymmdd;
    }

    /**
     * Gets the before final county code.
     * 
     * @return the before final county code
     */
    public String getBeforeFinalCountyCode() {
        return beforeFinalCountyCode;
    }

    /**
     * Sets the before final county code.
     * 
     * @param beforeFinalCountyCode
     *            the new before final county code
     */
    public void setBeforeFinalCountyCode(final String beforeFinalCountyCode) {
        this.beforeFinalCountyCode = beforeFinalCountyCode;
    }

    /**
     * Gets the before final town code.
     * 
     * @return the before final town code
     */
    public String getBeforeFinalTownCode() {
        return beforeFinalTownCode;
    }

    /**
     * Sets the before final town code.
     * 
     * @param beforeFinalTownCode
     *            the new before final town code
     */
    public void setBeforeFinalTownCode(final String beforeFinalTownCode) {
        this.beforeFinalTownCode = beforeFinalTownCode;
    }

    /**
     * Gets the before final village.
     * 
     * @return the before final village
     */
    public String getBeforeFinalVillage() {
        return beforeFinalVillage;
    }

    /**
     * Sets the before final village.
     * 
     * @param beforeFinalVillage
     *            the new before final village
     */
    public void setBeforeFinalVillage(final String beforeFinalVillage) {
        this.beforeFinalVillage = beforeFinalVillage;
    }

    /**
     * Gets the before final neighbor.
     * 
     * @return the before final neighbor
     */
    public String getBeforeFinalNeighbor() {
        return beforeFinalNeighbor;
    }

    /**
     * Sets the before final neighbor.
     * 
     * @param beforeFinalNeighbor
     *            the new before final neighbor
     */
    public void setBeforeFinalNeighbor(final String beforeFinalNeighbor) {
        this.beforeFinalNeighbor = beforeFinalNeighbor;
    }

    /**
     * Gets the before final street doorplate.
     * 
     * @return the before final street doorplate
     */
    public String getBeforeFinalStreetDoorplate() {
        return beforeFinalStreetDoorplate;
    }

    /**
     * Sets the before final street doorplate.
     * 
     * @param beforeFinalStreetDoorplate
     *            the new before final street doorplate
     */
    public void setBeforeFinalStreetDoorplate(final String beforeFinalStreetDoorplate) {
        this.beforeFinalStreetDoorplate = beforeFinalStreetDoorplate;
    }

    /**
     * Gets the web final person id.
     * 
     * @return the web final person id
     */
    public String getWebFinalPersonId() {
        return webFinalPersonId;
    }

    /**
     * Sets the web final person id.
     * 
     * @param webFinalPersonId
     *            the new web final person id
     */
    public void setWebFinalPersonId(final String webFinalPersonId) {
        this.webFinalPersonId = webFinalPersonId;
    }

    /**
     * Gets the web final person site id.
     * 
     * @return the web final person site id
     */
    public String getWebFinalPersonSiteId() {
        return webFinalPersonSiteId;
    }

    /**
     * Sets the web final person site id.
     * 
     * @param webFinalPersonSiteId
     *            the new web final person site id
     */
    public void setWebFinalPersonSiteId(final String webFinalPersonSiteId) {
        this.webFinalPersonSiteId = webFinalPersonSiteId;
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
     *            the del xld f004 n map
     */
    public void setDelXLDF004NMap(final Map<String, String> delXLDF004NMap) {
        this.delXLDF004NMap = delXLDF004NMap;
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
     * Gets the name person id map.
     * 
     * @return the name person id map
     */
    public Map<String, String> getNamePersonIdMap() {
        return namePersonIdMap;
    }

    /**
     * Sets the name person id map.
     * 
     * @param namePersonIdMap
     *            the name person id map
     */
    public void setNamePersonIdMap(final Map<String, String> namePersonIdMap) {
        this.namePersonIdMap = namePersonIdMap;
    }

    /**
     * Gets the before final area code.
     * 
     * @return the before final area code
     */
    public String getBeforeFinalAreaCode() {
        return beforeFinalAreaCode;
    }

    /**
     * Sets the before final area code.
     * 
     * @param beforeFinalAreaCode
     *            the new before final area code
     */
    public void setBeforeFinalAreaCode(final String beforeFinalAreaCode) {
        this.beforeFinalAreaCode = beforeFinalAreaCode;
    }

    /**
     * Gets the event date.
     * 
     * @return the event date
     */
    public String getEventDate() {
        return eventDate;
    }

    /**
     * Sets the event date.
     * 
     * @param eventDate
     *            the new event date
     */
    public void setEventDate(final String eventDate) {
        this.eventDate = eventDate;
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
     * Gets the fine free flag.
     * 
     * @return the fine free flag
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
     * Gets the fine receipt id.
     * 
     * @return the fine receipt id
     */
    public String getFineReceiptId() {
        return fineReceiptId;
    }

    /**
     * Sets the fine receipt id.
     * 
     * @param fineReceiptId
     *            the new fine receipt id
     */
    public void setFineReceiptId(final String fineReceiptId) {
        this.fineReceiptId = fineReceiptId;
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
     * Gets the fg check btn1.
     * 
     * @return the fg check btn1
     */
    public String getFgCheckBtn1() {
        return fgCheckBtn1;
    }

    /**
     * Sets the fg check btn1.
     * 
     * @param fgCheckBtn1
     *            the new fg check btn1
     */
    public void setFgCheckBtn1(String fgCheckBtn1) {
        this.fgCheckBtn1 = fgCheckBtn1;
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
    public void setCancelKind(String cancelKind) {
        this.cancelKind = cancelKind;
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
    public void setDoFineCheckFlagOpen(boolean doFineCheckFlagOpen) {
        this.doFineCheckFlagOpen = doFineCheckFlagOpen;
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
     * Gets the cancel permit.
     * 
     * @return the cancel permit
     */
    public String getCancelPermit() {
        return cancelPermit;
    }

    /**
     * Sets the cancel permit.
     * 
     * @param cancelPermit
     *            the new cancel permit
     */
    public void setCancelPermit(final String cancelPermit) {
        this.cancelPermit = cancelPermit;
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

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
import tw.gov.moi.domain.Rcdf001mType;
import tw.gov.moi.domain.Tldf004mType;
import tw.gov.moi.domain.XldfefaplcType;
import tw.gov.moi.rl.common.constant.RlConstant;
import tw.gov.moi.rl.component.dto.OpeningOperationDTO;
import tw.gov.moi.rl.component.dto.RelationData;
import tw.gov.moi.rl.component.dto.XLDFRegDetailObnfParams;
import tw.gov.moi.rl.component.xldf.dto.XCDF001MRL;
import tw.gov.moi.rl.component.xldf.dto.XLDF004M;
import tw.gov.moi.rl.component.xldf.dto.XLDFX077H;
import tw.gov.moi.rl.component.xldf.dto.XLDFX077M;
import tw.gov.moi.rl.component.xldf.dto.XLDFY077H;
import tw.gov.moi.rl.component.xldf.dto.XLDFY077M;
import tw.gov.moi.rl.domain.xldf.XLDFHouseholdDataDomainObject;
import tw.gov.moi.rl.domain.xldf.XLDFHouseholdNoteDomainObject;
import tw.gov.moi.rl.domain.xldf.XLDFPersonDataDomainObject;
import tw.gov.moi.rl.domain.xldf.XLDFPersonNoteDomainObject;
import tw.gov.moi.rs.dto.NonRegisterDTO;

/**
 * 初設戶籍登記DTO.
 * 
 * @author Viva.Hong
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Rl01390DTO", propOrder = { "transactionId", "acceptSiteId", "userId", "initTime",
        "acceptAdminOfficeCode", "acceptAreaCode", "openingOperationDTO", "currentFirstPersonDataObject",
        "targetPersonData", "enforcedApplicant", "webHouseholdData", "webHouseholdHeadPersonData",
        "webHouseholdHeadSiteId", "webHouseholdHeadId", "webHouseholdId", "oldHouseholdData",
        "oldHouseholdHeadPersonData", "newHouseholdData", "newHousehold", "newHouseholdMap", "fatherHouseholdData",
        "fatherPersonData", "fatherHouseholdHeadFlag", "fatherPersonRole", "fatherHouseholdState", "fatherId",
        "fatherSiteId", "fatherRemoveDate", "fatherRemoveTime", "orgFatherEducationMark", "fatherCityCountyName",
        "fatherTownName", "fatherLivingStyleCodeName", "fatherLivingRaceTypeName", "fatherNoteFlag",
        "motherHouseholdData", "motherPersonData", "motherHouseholdState", "motherPersonRole", "motherId",
        "motherSiteId", "motherRemoveDate", "motherRemoveTime", "orgMotherEducationMark", "motherCityCountyName",
        "motherTownName", "motherLivingStyleCodeName", "motherLivingRaceTypeName", "foreignFatherId",
        "foreignFatherName", "foreignFatherLastName", "foreignFatherFirstName", "foreignMotherId", "foreignMotherName",
        "foreignMotherLastName", "foreignMotherFirstName", "acceptAdminOfficeName", "settleCityCountyName",
        "settleTownName", "apply1", "apply1Relatioinship", "apply2", "apply2Relatioinship", "delegated", "finePerson",
        "registerDate", "registerTime", "applyDate", "applyCode", "registerContent", "needFineFlag", "removeFeeReason",
        "fineSerialNumber", "feeAmount", "receiptId", "applySeq", "applyCaseNo", "fineEventDate", "operationCode",
        "systemDate", "systemTime", "applySequenceId", "doFineCheckFlag", "deleteFineDTOFlag",
        "previousDoFineCheckFlag", "previousFineEventDate", "fineFreeFlag", "doFineCheckFlagOpen", "fineDTO",
        "personId", "manCount", "womanCount", "crossSiteEnabled", "isNewHousehold", "firstPersonIdMap",
        "householdNoteFlag", "motherNoteFlag", "outliveCaseFlag", "certificateList", "initErrorMessageList",
        "addPersonErrorMsgMap", "warningMessgeList", "firstPersonDataList", "householdNoteList", "personNoteList",
        "fineList", "xldfx077mList", "xldfx077hList", "xldfy077mList", "xldfy077hList", "nonRegisterList", "spouseMap",
        "relationMap", "xcdf001mrlMap", "xldf004mMap", "specialIdMap", "regObnfList", "enforcedFlag",
        "certificate4OtherCertificate", "otherCertificateFlag", "flagCreateXLDFPersonDataFlag",
        "flagCreateXLDF2R9SFlag", "firstReasonCode", "initSuccess", "activeIndex", "foreignPerson", "lockMode",
        "applySeqNum" })
@XmlRootElement(name = "Rl01390DTO")
public class Rl01390DTO implements Serializable {

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

    /** 受理地戶所代碼 . */
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

    /** 當下組合記事的初設戶籍者. */
    @XmlElement(name = "CurrentFirstPersonDataObject", required = true)
    @FieldName("當下組合記事的初設戶籍者")
    private FirstPersonDataObject currentFirstPersonDataObject = new FirstPersonDataObject();

    /** 初設戶籍-大簿當事人(自立新戶時的戶長). */
    @XmlElement(name = "TargetPersonData", required = true)
    @FieldName("初設戶籍-大簿當事人(自立新戶時的戶長)")
    private FirstPersonDataObject targetPersonData = new FirstPersonDataObject();

    /** 逕為登記申請人. */
    @XmlElement(name = "EnforcedApplicant", required = true)
    @FieldName("逕為登記申請人")
    private XldfefaplcType enforcedApplicant;

    /** (畫面)全戶基本資料. */
    @XmlElement(name = "WebHouseholdData", required = true)
    @FieldName("(畫面)全戶基本資料")
    private XLDFHouseholdDataDomainObject webHouseholdData;

    /** (畫面)戶長-個人基本資料. */
    @XmlElement(name = "WebHouseholdHeadPersonData", required = true)
    @FieldName("(畫面)戶長-個人基本資料")
    private XLDFPersonDataDomainObject webHouseholdHeadPersonData;

    /** (畫面)全戶基本資料區塊-作業點代碼. */
    @XmlElement(name = "WebHouseholdHeadSiteId", required = true)
    @FieldName("(畫面)全戶基本資料區塊-作業點代碼")
    private String webHouseholdHeadSiteId;

    /** (畫面)全戶基本資料區塊-戶長統號. */
    @XmlElement(name = "WebHouseholdHeadId", required = true)
    @FieldName("(畫面)全戶基本資料區塊-戶長統號")
    private String webHouseholdHeadId;

    /** (畫面)全戶基本資料區塊-戶號. */
    @XmlElement(name = "WebHouseholdId", required = true)
    @FieldName("(畫面)全戶基本資料區塊-戶號")
    private String webHouseholdId;

    /** (非自立新戶)全戶基本資料. */
    @XmlElement(name = "OldHouseholdData", required = true)
    @FieldName("(非自立新戶)全戶基本資料")
    private XLDFHouseholdDataDomainObject oldHouseholdData;

    /** (非自立新戶)戶長-個人基本資料. */
    @XmlElement(name = "OldHouseholdHeadPersonData", required = true)
    @FieldName("(非自立新戶)戶長-個人基本資料")
    private XLDFPersonDataDomainObject oldHouseholdHeadPersonData;

    /** (自立新戶)全戶基本資料. */
    @XmlElement(name = "OldHouseholdData", required = true)
    @FieldName("(自立新戶)全戶基本資料")
    private XLDFHouseholdDataDomainObject newHouseholdData;

    /** (自立新戶)新戶號. */
    @XmlElement(name = "NewHousehold", required = true)
    @FieldName("(自立新戶)新戶號")
    private String newHousehold;

    /** (自立新戶)新戶號Map，key,value=(siteId作業點代碼 , 新戶號). */
    @XmlElement(name = "NewHouseholdMap", required = true)
    @FieldName("(自立新戶)新戶號Map")
    private Map<String, String> newHouseholdMap = new HashMap<String, String>();

    /** (生父)全戶基本資料. */
    @XmlElement(name = "FatherHouseholdData", required = true)
    @FieldName("(生父)全戶基本資料")
    private XLDFHouseholdDataDomainObject fatherHouseholdData;

    /** (生父)個人基本資料. */
    @XmlElement(name = "FatherPersonData", required = true)
    @FieldName("(生父)個人基本資料")
    private XLDFPersonDataDomainObject fatherPersonData;

    /** (生父)戶籍簿頁狀態（M現戶）、（H除戶）. */
    @XmlElement(name = "FatherHouseholdHeadFlag", required = true)
    @FieldName("(生父)戶籍簿頁狀態")
    private String fatherHouseholdHeadFlag;

    /** (生父)身分角色. */
    @XmlElement(name = "FatherPersonRole", required = true)
    @FieldName("(生父)身分角色")
    private String fatherPersonRole;

    /** (生父)戶籍簿頁狀態. */
    @XmlElement(name = "FatherHouseholdState", required = true)
    @FieldName("(生父)戶籍簿頁狀態")
    private String fatherHouseholdState;

    /** (生父)國民身分證統一編號. */
    @XmlElement(name = "FatherId", required = true)
    @FieldName("(生父)國民身分證統一編號")
    private String fatherId;

    /** (生父)作業點代碼. */
    @XmlElement(name = "FatherSiteId", required = true)
    @FieldName("(生父)作業點代碼")
    private String fatherSiteId;

    /** (生父)除戶日期. */
    @XmlElement(name = "FatherRemoveDate", required = true)
    @FieldName("(生父)除戶日期")
    private String fatherRemoveDate;

    /** (生父)除戶時間. */
    @XmlElement(name = "FatherRemoveTime", required = true)
    @FieldName("(生父)除戶時間")
    private String fatherRemoveTime;

    /** (生父)原教育程度註記. */
    @XmlElement(name = "OrgFatherEducationMark", required = true)
    @FieldName("(生父)原教育程度註記")
    private String orgFatherEducationMark;

    /** (生父)省市縣市名稱. */
    @XmlElement(name = "FatherCityCountyName", required = true)
    @FieldName("(生父)省市縣市名稱")
    private String fatherCityCountyName;

    /** (生父)鄉鎮市區名稱. */
    @XmlElement(name = "FatherTownName", required = true)
    @FieldName("(生父)鄉鎮市區名稱")
    private String fatherTownName;

    /** (生父)原住民身分名稱. */
    @XmlElement(name = "FatherLivingStyleCodeName", required = true)
    @FieldName("(生父)原住民身分名稱")
    private String fatherLivingStyleCodeName = StringUtils.EMPTY;

    /** (生父)族別名稱. */
    @XmlElement(name = "FatherLivingRaceTypeName", required = true)
    @FieldName("(生父)族別名稱")
    private String fatherLivingRaceTypeName = StringUtils.EMPTY;

    /** (生父)生父記事旗標. */
    @XmlElement(name = "FatherNoteFlag", required = true)
    @FieldName("(生父)生父記事旗標")
    private String fatherNoteFlag = RlConstant.NO_CHAR;

    /** (生母)全戶基本資料. */
    @XmlElement(name = "MotherHouseholdData", required = true)
    @FieldName("(生母)全戶基本資料")
    private XLDFHouseholdDataDomainObject motherHouseholdData;

    /** (生母)個人基本資料. */
    @XmlElement(name = "MotherPersonData", required = true)
    @FieldName("(生母)個人基本資料")
    private XLDFPersonDataDomainObject motherPersonData;

    /** (生母)戶籍簿頁狀態（M現戶）、（H除戶）. */
    @XmlElement(name = "MotherHouseholdState", required = true)
    @FieldName("(生母)戶籍簿頁狀態")
    private String motherHouseholdState;

    /** (生母)身分角色. */
    @XmlElement(name = "MotherPersonRole", required = true)
    @FieldName("(生母)身分角色")
    private String motherPersonRole;

    /** (生母)國民身分證統一編號. */
    @XmlElement(name = "MotherId", required = true)
    @FieldName("(生母)國民身分證統一編號")
    private String motherId;

    /** (生母)作業點代碼. */
    @XmlElement(name = "MotherSiteId", required = true)
    @FieldName("(生母)作業點代碼")
    private String motherSiteId;

    /** (生母)除戶日期. */
    @XmlElement(name = "MotherRemoveDate", required = true)
    @FieldName("(生母)除戶日期")
    private String motherRemoveDate;

    /** (生母)除戶時間. */
    @XmlElement(name = "MotherRemoveTime", required = true)
    @FieldName("(生母)除戶時間")
    private String motherRemoveTime;

    /** (生母)原教育程度註記. */
    @XmlElement(name = "OrgMotherEducationMark", required = true)
    @FieldName("(生母)原教育程度註記")
    private String orgMotherEducationMark;

    /** (生母)省市縣市名稱. */
    @XmlElement(name = "MotherCityCountyName", required = true)
    @FieldName("(生母)省市縣市名稱")
    private String motherCityCountyName;

    /** (生母)鄉鎮市區名稱. */
    @XmlElement(name = "MotherTownName", required = true)
    @FieldName("(生母)鄉鎮市區名稱")
    private String motherTownName;

    /** (生母)原住民身分名稱. */
    @XmlElement(name = "MotherLivingStyleCodeName", required = true)
    @FieldName("(生母)原住民身分名稱")
    private String motherLivingStyleCodeName = StringUtils.EMPTY;

    /** (生母)族別名稱. */
    @XmlElement(name = "MotherLivingRaceTypeName", required = true)
    @FieldName("(生母)族別名稱")
    private String motherLivingRaceTypeName = StringUtils.EMPTY;

    /** (外籍者-生父)國民身分證統一編號. */
    @XmlElement(name = "ForeignFatherId", required = true)
    @FieldName("(外籍者-生父)國民身分證統一編號")
    private String foreignFatherId;

    /** (外籍者-生父)姓名. */
    @XmlElement(name = "ForeignFatherName", required = true)
    @FieldName("(外籍者-生父)姓名")
    private String foreignFatherName;

    /** (外籍者-生父)姓. */
    @XmlElement(name = "ForeignFatherLastName", required = true)
    @FieldName("(外籍者-生父)姓")
    private String foreignFatherLastName;

    /** (外籍者-生父)名. */
    @XmlElement(name = "ForeignFatherFirstName", required = true)
    @FieldName("(外籍者-生父)名")
    private String foreignFatherFirstName;

    /** (外籍者-生母)國民身分證統一編號. */
    @XmlElement(name = "ForeignMotherId", required = true)
    @FieldName("(外籍者-生母)國民身分證統一編號")
    private String foreignMotherId;

    /** (外籍者-生母)姓名. */
    @XmlElement(name = "ForeignMotherName", required = true)
    @FieldName("(外籍者-生母)姓名")
    private String foreignMotherName;

    /** (外籍者-生母)姓. */
    @XmlElement(name = "ForeignMotherLastName", required = true)
    @FieldName("(外籍者-生母)姓")
    private String foreignMotherLastName;

    /** (外籍者-生母)名. */
    @XmlElement(name = "ForeignMotherFirstName", required = true)
    @FieldName("(外籍者-生母)名")
    private String foreignMotherFirstName;

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

    /** 申請人1. */
    @XmlElement(name = "Apply1", required = true)
    @FieldName("申請人1")
    private XLDFApplicantDataDTO apply1 = new XLDFApplicantDataDTO();;

    /** 申請人1-與當事人關係. */
    @XmlElement(name = "Apply1Relatioinship", required = true)
    @FieldName("申請人1-與當事人關係")
    private String apply1Relatioinship;

    /** 申請人2. */
    @XmlElement(name = "Apply2", required = true)
    @FieldName("申請人2")
    private XLDFApplicantDataDTO apply2 = new XLDFApplicantDataDTO();;

    /** 申請人2-與當事人關係. */
    @XmlElement(name = "Apply2Relatioinship", required = true)
    @FieldName("申請人2-與當事人關係")
    private String apply2Relatioinship;

    /** 受委託人. */
    @XmlElement(name = "Delegated", required = true)
    @FieldName("受委託人")
    private XLDFPersonBriefDataDTO delegated = new XLDFPersonBriefDataDTO();

    /** 受處分人. */
    @XmlElement(name = "FinePerson", required = true)
    @FieldName("受處分人")
    private XLDFApplicantDataDTO finePerson = new XLDFApplicantDataDTO();

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

    /** 申請代碼. */
    @XmlElement(name = "ApplyCode", required = true)
    @FieldName("申請代碼")
    private String applyCode;

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

    /** 系統日期. */
    @XmlElement(name = "SystemDate", required = true)
    @FieldName("系統日期")
    private String systemDate;

    /** 系統時間. */
    @XmlElement(name = "SystemTime", required = true)
    @FieldName("系統時間")
    private String systemTime;

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

    /** 新增初設戶籍者視窗-國民身分證統一編號. */
    @XmlElement(name = "PersonId", required = true)
    @FieldName("新增初設戶籍者視窗-國民身分證統一編號")
    private String personId;

    /** 初設戶籍者-男性人數. */
    @XmlElement(name = "ManCount", required = true)
    @FieldName("初設戶籍者-男性人數")
    private int manCount = 0;

    /** 初設戶籍者-女性人數. */
    @XmlElement(name = "WomanCount", required = true)
    @FieldName("初設戶籍者-女性人數")
    private int womanCount = 0;

    /** 是否可異地辦理. */
    @XmlElement(name = "CrossSiteEnabled", required = true)
    @FieldName("是否可異地辦理")
    private String crossSiteEnabled;

    /** 是否自立新戶. */
    @XmlElement(name = "IsNewHousehold", required = true)
    @FieldName("是否自立新戶")
    private String isNewHousehold;

    /** 初設戶籍者-統號MAP清單(用來檢核初設戶籍者 統號是否重複). */
    @XmlElement(name = "FirstPersonIdMap", required = true)
    @FieldName("初設戶籍者-統號MAP清單")
    private Map<String, FirstPersonDataObject> firstPersonIdMap = new HashMap<String, FirstPersonDataObject>();

    /** 初設戶籍者-全戶記事類別旗標. */
    @XmlElement(name = "HouseholdNoteFlag", required = true)
    @FieldName("初設戶籍者-全戶記事類別旗標")
    private Boolean householdNoteFlag;

    /** 初設戶籍者-生母記事旗標. */
    @XmlElement(name = "MotherNoteFlag", required = true)
    @FieldName("初設戶籍者-生母記事旗標")
    private String motherNoteFlag = RlConstant.NO_CHAR;

    /** 初設戶籍者-非現住人口處理註記. */
    @XmlElement(name = "OutliveCaseFlag", required = true)
    @FieldName("初設戶籍者-非現住人口處理註記")
    private String outliveCaseFlag;

    /** 附繳證件清單. */
    @XmlElement(name = "CertificateList", required = true)
    @FieldName("附繳證件清單")
    private List<String> certificateList = new ArrayList<String>();

    /** 錯誤訊息清單. */
    @XmlElement(name = "InitErrorMessageList", required = true)
    @FieldName("錯誤訊息清單")
    private List<List<String>> initErrorMessageList = new ArrayList<List<String>>();

    /** (datatable)新增初設戶籍者錯誤訊息清單. */
    @XmlElement(name = "AddPersonErrorMsgList", required = true)
    @FieldName("(datatable)新增初設戶籍者錯誤訊息清單")
    private Map<String, List<List<String>>> addPersonErrorMsgMap = new HashMap<String, List<List<String>>>();

    /** 警告訊息清單. */
    @XmlElement(name = "WarningMessgeList", required = true)
    @FieldName("警告訊息清單")
    private List<List<String>> warningMessgeList = new ArrayList<List<String>>();

    /** 初設戶籍者資料清單. */
    @XmlElement(name = "FirstPersonDataList", required = true)
    @FieldName("初設戶籍者資料清單")
    private List<FirstPersonDataObject> firstPersonDataList = new ArrayList<FirstPersonDataObject>();

    /** 全戶記事清單. */
    @XmlElement(name = "HouseholdNoteList", required = true)
    @FieldName("全戶記事清單")
    private List<XLDFHouseholdNoteDomainObject> householdNoteList = new ArrayList<XLDFHouseholdNoteDomainObject>();

    /** 個人記事清單. */
    @XmlElement(name = "PersonNoteList", required = true)
    @FieldName("個人記事清單")
    private List<XLDFPersonNoteDomainObject> personNoteList = new ArrayList<XLDFPersonNoteDomainObject>();

    /** 罰鍰記事清單. */
    @XmlElement(name = "FineList", required = true)
    @FieldName("罰鍰記事清單")
    private List<XLDFOperationFineDTO> fineList = new ArrayList<XLDFOperationFineDTO>();

    /** 全戶記事欄位化-現戶物件清單. */
    @XmlElement(name = "Xldfx077mList", required = true)
    @FieldName("全戶記事欄位化-現戶物件清單")
    private List<XLDFX077M> xldfx077mList = new ArrayList<XLDFX077M>();

    /** 全戶記事欄位化-除戶物件清單. */
    @XmlElement(name = "Xldfx077hList", required = true)
    @FieldName("全戶記事欄位化-除戶物件清單")
    private List<XLDFX077H> xldfx077hList = new ArrayList<XLDFX077H>();

    /** 個人記事欄位化-現戶物件清單. */
    @XmlElement(name = "Xldfy077mList", required = true)
    @FieldName("個人記事欄位化-現戶物件清單")
    private List<XLDFY077M> xldfy077mList = new ArrayList<XLDFY077M>();

    /** 個人記事欄位化-除戶物件清單. */
    @XmlElement(name = "Xldfy077hList", required = true)
    @FieldName("個人記事欄位化-除戶物件清單")
    private List<XLDFY077H> xldfy077hList = new ArrayList<XLDFY077H>();

    /** 通報物件清單. */
    @XmlElement(name = "NonRegisterList", required = true)
    @FieldName("通報物件清單")
    private List<NonRegisterDTO> nonRegisterList = new ArrayList<NonRegisterDTO>();

    /** 特殊統號清單. */
    @XmlElement(name = "SpouseMap", required = true)
    @FieldName("特殊統號清單")
    private Map<String, Rcdf001mType> spouseMap = new HashMap<String, Rcdf001mType>();

    /** 關係人清單. */
    @XmlElement(name = "RelationMap", required = true)
    @FieldName("關係人清單")
    private Map<String, List<RelationData>> relationMap = new HashMap<String, List<RelationData>>();

    /** 關係人全國個人資料摘要清單. */
    @XmlElement(name = "Xcdf001mrlMap", required = true)
    @FieldName("關係人全國個人資料摘要清單")
    private Map<String, XCDF001MRL> xcdf001mrlMap = new HashMap<String, XCDF001MRL>();

    /** 關係人個人基本資料清單. */
    @XmlElement(name = "Xldf004mMap", required = true)
    @FieldName("關係人個人基本資料清單")
    private Map<String, XLDF004M> xldf004mMap = new HashMap<String, XLDF004M>();

    /** 初設戶籍者配偶清單. */
    @XmlElement(name = "SpecialIdMap", required = true)
    @FieldName("初設戶籍者配偶清單")
    private Map<String, String> specialIdMap = new HashMap<String, String>();

    /** 特殊通報. */
    @XmlElement(name = "RegObnfList", required = true)
    @FieldName("特殊通報")
    private List<XLDFRegDetailObnfParams> regObnfList = new ArrayList<XLDFRegDetailObnfParams>();

    /** 逕為登記 . */
    @XmlElement(name = "EnforcedFlag", required = true)
    @FieldName("逕為登記 ")
    private String enforcedFlag;

    /** 附繳證件4名稱>>WEB「其他附繳證件」. */
    @XmlElement(name = "Certificate4OtherCertificate", required = true)
    @FieldName("附繳證件4名稱(其他附繳證件)")
    private String certificate4OtherCertificate = StringUtils.EMPTY;

    /** 旗標:其他附繳證件. */
    @XmlElement(name = "OtherCertificateFlag", required = true)
    @FieldName("旗標:其他附繳證件")
    private boolean otherCertificateFlag = false;

    /** CreateXLDFPersonData旗標. */
    @XmlElement(name = "FlagCreateXLDFPersonDataFlag", required = true)
    @FieldName("CreateXLDFPersonData旗標")
    private String flagCreateXLDFPersonDataFlag;

    /** CreateXLDF2R9S旗標. */
    @XmlElement(name = "FlagCreateXLDF2R9SFlag", required = true)
    @FieldName("CreateXLDF2R9S旗標")
    private String flagCreateXLDF2R9SFlag;

    /** 初設戶籍原因. */
    @XmlElement(name = "FirstReasonCode", required = true)
    @FieldName("初設戶籍原因")
    private String firstReasonCode;

    /** 初始化是否成功. */
    @XmlElement(name = "InitSuccess", required = true)
    @FieldName("初始化是否成功")
    private boolean initSuccess = true;

    /** 頁籤索引. */
    @XmlElement(name = "ActiveIndex", required = true)
    @FieldName("頁籤索引")
    private String activeIndex;

    /** 已選擇補登統號資料. */
    @XmlElement(name = "ForeignPerson", required = true)
    @FieldName("已選擇補登統號資料")
    private Tldf004mType foreignPerson = new Tldf004mType();

    /** 鎖定頁面元件. */
    @XmlElement(name = "LockMode", required = true)
    @FieldName("鎖定頁面元件")
    private boolean lockMode = false;

    /** 申請書流水號. */
    @XmlElement(name = "ApplySeqNum", required = true)
    @FieldName("申請書流水號")
    private int applySeqNum;

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
     * Gets the current first person data object.
     * 
     * @return the current first person data object
     */
    public FirstPersonDataObject getCurrentFirstPersonDataObject() {
        return currentFirstPersonDataObject;
    }

    /**
     * Sets the current first person data object.
     * 
     * @param currentFirstPersonDataObject
     *            the new current first person data object
     */
    public void setCurrentFirstPersonDataObject(final FirstPersonDataObject currentFirstPersonDataObject) {
        this.currentFirstPersonDataObject = currentFirstPersonDataObject;
    }

    /**
     * Gets the target person data.
     * 
     * @return the target person data
     */
    public FirstPersonDataObject getTargetPersonData() {
        return targetPersonData;
    }

    /**
     * Sets the target person data.
     * 
     * @param targetPersonData
     *            the new target person data
     */
    public void setTargetPersonData(final FirstPersonDataObject targetPersonData) {
        this.targetPersonData = targetPersonData;
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
     * Gets the new household.
     * 
     * @return the new household
     */
    public String getNewHousehold() {
        return newHousehold;
    }

    /**
     * Sets the new household.
     * 
     * @param newHousehold
     *            the new new household
     */
    public void setNewHousehold(final String newHousehold) {
        this.newHousehold = newHousehold;
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
     * Gets the father household data.
     * 
     * @return the father household data
     */
    public XLDFHouseholdDataDomainObject getFatherHouseholdData() {
        return fatherHouseholdData;
    }

    /**
     * Sets the father household data.
     * 
     * @param fatherHouseholdData
     *            the new father household data
     */
    public void setFatherHouseholdData(final XLDFHouseholdDataDomainObject fatherHouseholdData) {
        this.fatherHouseholdData = fatherHouseholdData;
    }

    /**
     * Gets the father person data.
     * 
     * @return the father person data
     */
    public XLDFPersonDataDomainObject getFatherPersonData() {
        return fatherPersonData;
    }

    /**
     * Sets the father person data.
     * 
     * @param fatherPersonData
     *            the new father person data
     */
    public void setFatherPersonData(final XLDFPersonDataDomainObject fatherPersonData) {
        this.fatherPersonData = fatherPersonData;
    }

    /**
     * Gets the father household head flag.
     * 
     * @return the father household head flag
     */
    public String getFatherHouseholdHeadFlag() {
        return fatherHouseholdHeadFlag;
    }

    /**
     * Sets the father household head flag.
     * 
     * @param fatherHouseholdHeadFlag
     *            the new father household head flag
     */
    public void setFatherHouseholdHeadFlag(final String fatherHouseholdHeadFlag) {
        this.fatherHouseholdHeadFlag = fatherHouseholdHeadFlag;
    }

    /**
     * Gets the father person role.
     * 
     * @return the father person role
     */
    public String getFatherPersonRole() {
        return fatherPersonRole;
    }

    /**
     * Sets the father person role.
     * 
     * @param fatherPersonRole
     *            the new father person role
     */
    public void setFatherPersonRole(final String fatherPersonRole) {
        this.fatherPersonRole = fatherPersonRole;
    }

    /**
     * Gets the father household state.
     * 
     * @return the father household state
     */
    public String getFatherHouseholdState() {
        return fatherHouseholdState;
    }

    /**
     * Sets the father household state.
     * 
     * @param fatherHouseholdState
     *            the new father household state
     */
    public void setFatherHouseholdState(final String fatherHouseholdState) {
        this.fatherHouseholdState = fatherHouseholdState;
    }

    /**
     * Gets the father id.
     * 
     * @return the father id
     */
    public String getFatherId() {
        return fatherId;
    }

    /**
     * Sets the father id.
     * 
     * @param fatherId
     *            the new father id
     */
    public void setFatherId(final String fatherId) {
        this.fatherId = fatherId;
    }

    /**
     * Gets the father site id.
     * 
     * @return the father site id
     */
    public String getFatherSiteId() {
        return fatherSiteId;
    }

    /**
     * Sets the father site id.
     * 
     * @param fatherSiteId
     *            the new father site id
     */
    public void setFatherSiteId(final String fatherSiteId) {
        this.fatherSiteId = fatherSiteId;
    }

    /**
     * Gets the father remove date.
     * 
     * @return the father remove date
     */
    public String getFatherRemoveDate() {
        return fatherRemoveDate;
    }

    /**
     * Sets the father remove date.
     * 
     * @param fatherRemoveDate
     *            the new father remove date
     */
    public void setFatherRemoveDate(final String fatherRemoveDate) {
        this.fatherRemoveDate = fatherRemoveDate;
    }

    /**
     * Gets the father remove time.
     * 
     * @return the father remove time
     */
    public String getFatherRemoveTime() {
        return fatherRemoveTime;
    }

    /**
     * Sets the father remove time.
     * 
     * @param fatherRemoveTime
     *            the new father remove time
     */
    public void setFatherRemoveTime(final String fatherRemoveTime) {
        this.fatherRemoveTime = fatherRemoveTime;
    }

    /**
     * Gets the org father education mark.
     * 
     * @return the org father education mark
     */
    public String getOrgFatherEducationMark() {
        return orgFatherEducationMark;
    }

    /**
     * Sets the org father education mark.
     * 
     * @param orgFatherEducationMark
     *            the new org father education mark
     */
    public void setOrgFatherEducationMark(final String orgFatherEducationMark) {
        this.orgFatherEducationMark = orgFatherEducationMark;
    }

    /**
     * Gets the father city county name.
     * 
     * @return the father city county name
     */
    public String getFatherCityCountyName() {
        return fatherCityCountyName;
    }

    /**
     * Sets the father city county name.
     * 
     * @param fatherCityCountyName
     *            the new father city county name
     */
    public void setFatherCityCountyName(final String fatherCityCountyName) {
        this.fatherCityCountyName = fatherCityCountyName;
    }

    /**
     * Gets the father town name.
     * 
     * @return the father town name
     */
    public String getFatherTownName() {
        return fatherTownName;
    }

    /**
     * Sets the father town name.
     * 
     * @param fatherTownName
     *            the new father town name
     */
    public void setFatherTownName(final String fatherTownName) {
        this.fatherTownName = fatherTownName;
    }

    /**
     * Gets the mother household data.
     * 
     * @return the mother household data
     */
    public XLDFHouseholdDataDomainObject getMotherHouseholdData() {
        return motherHouseholdData;
    }

    /**
     * Sets the mother household data.
     * 
     * @param motherHouseholdData
     *            the new mother household data
     */
    public void setMotherHouseholdData(final XLDFHouseholdDataDomainObject motherHouseholdData) {
        this.motherHouseholdData = motherHouseholdData;
    }

    /**
     * Gets the mother person data.
     * 
     * @return the mother person data
     */
    public XLDFPersonDataDomainObject getMotherPersonData() {
        return motherPersonData;
    }

    /**
     * Sets the mother person data.
     * 
     * @param motherPersonData
     *            the new mother person data
     */
    public void setMotherPersonData(final XLDFPersonDataDomainObject motherPersonData) {
        this.motherPersonData = motherPersonData;
    }

    /**
     * Gets the mother household state.
     * 
     * @return the mother household state
     */
    public String getMotherHouseholdState() {
        return motherHouseholdState;
    }

    /**
     * Sets the mother household state.
     * 
     * @param motherHouseholdState
     *            the new mother household state
     */
    public void setMotherHouseholdState(final String motherHouseholdState) {
        this.motherHouseholdState = motherHouseholdState;
    }

    /**
     * Gets the mother person role.
     * 
     * @return the mother person role
     */
    public String getMotherPersonRole() {
        return motherPersonRole;
    }

    /**
     * Sets the mother person role.
     * 
     * @param motherPersonRole
     *            the new mother person role
     */
    public void setMotherPersonRole(final String motherPersonRole) {
        this.motherPersonRole = motherPersonRole;
    }

    /**
     * Gets the mother id.
     * 
     * @return the mother id
     */
    public String getMotherId() {
        return motherId;
    }

    /**
     * Sets the mother id.
     * 
     * @param motherId
     *            the new mother id
     */
    public void setMotherId(final String motherId) {
        this.motherId = motherId;
    }

    /**
     * Gets the mother site id.
     * 
     * @return the mother site id
     */
    public String getMotherSiteId() {
        return motherSiteId;
    }

    /**
     * Sets the mother site id.
     * 
     * @param motherSiteId
     *            the new mother site id
     */
    public void setMotherSiteId(final String motherSiteId) {
        this.motherSiteId = motherSiteId;
    }

    /**
     * Gets the mother remove date.
     * 
     * @return the mother remove date
     */
    public String getMotherRemoveDate() {
        return motherRemoveDate;
    }

    /**
     * Sets the mother remove date.
     * 
     * @param motherRemoveDate
     *            the new mother remove date
     */
    public void setMotherRemoveDate(final String motherRemoveDate) {
        this.motherRemoveDate = motherRemoveDate;
    }

    /**
     * Gets the mother remove time.
     * 
     * @return the mother remove time
     */
    public String getMotherRemoveTime() {
        return motherRemoveTime;
    }

    /**
     * Sets the mother remove time.
     * 
     * @param motherRemoveTime
     *            the new mother remove time
     */
    public void setMotherRemoveTime(final String motherRemoveTime) {
        this.motherRemoveTime = motherRemoveTime;
    }

    /**
     * Gets the org mother education mark.
     * 
     * @return the org mother education mark
     */
    public String getOrgMotherEducationMark() {
        return orgMotherEducationMark;
    }

    /**
     * Sets the org mother education mark.
     * 
     * @param orgMotherEducationMark
     *            the new org mother education mark
     */
    public void setOrgMotherEducationMark(final String orgMotherEducationMark) {
        this.orgMotherEducationMark = orgMotherEducationMark;
    }

    /**
     * Gets the mother city county name.
     * 
     * @return the mother city county name
     */
    public String getMotherCityCountyName() {
        return motherCityCountyName;
    }

    /**
     * Sets the mother city county name.
     * 
     * @param motherCityCountyName
     *            the new mother city county name
     */
    public void setMotherCityCountyName(final String motherCityCountyName) {
        this.motherCityCountyName = motherCityCountyName;
    }

    /**
     * Gets the mother town name.
     * 
     * @return the mother town name
     */
    public String getMotherTownName() {
        return motherTownName;
    }

    /**
     * Sets the mother town name.
     * 
     * @param motherTownName
     *            the new mother town name
     */
    public void setMotherTownName(final String motherTownName) {
        this.motherTownName = motherTownName;
    }

    /**
     * Gets the foreign father id.
     * 
     * @return the foreign father id
     */
    public String getForeignFatherId() {
        return foreignFatherId;
    }

    /**
     * Sets the foreign father id.
     * 
     * @param foreignFatherId
     *            the new foreign father id
     */
    public void setForeignFatherId(final String foreignFatherId) {
        this.foreignFatherId = foreignFatherId;
    }

    /**
     * Gets the foreign father name.
     * 
     * @return the foreign father name
     */
    public String getForeignFatherName() {
        return foreignFatherName;
    }

    /**
     * Sets the foreign father name.
     * 
     * @param foreignFatherName
     *            the new foreign father name
     */
    public void setForeignFatherName(final String foreignFatherName) {
        this.foreignFatherName = foreignFatherName;
    }

    /**
     * Gets the foreign father last name.
     * 
     * @return the foreign father last name
     */
    public String getForeignFatherLastName() {
        return foreignFatherLastName;
    }

    /**
     * Sets the foreign father last name.
     * 
     * @param foreignFatherLastName
     *            the new foreign father last name
     */
    public void setForeignFatherLastName(final String foreignFatherLastName) {
        this.foreignFatherLastName = foreignFatherLastName;
    }

    /**
     * Gets the foreign father first name.
     * 
     * @return the foreign father first name
     */
    public String getForeignFatherFirstName() {
        return foreignFatherFirstName;
    }

    /**
     * Sets the foreign father first name.
     * 
     * @param foreignFatherFirstName
     *            the new foreign father first name
     */
    public void setForeignFatherFirstName(final String foreignFatherFirstName) {
        this.foreignFatherFirstName = foreignFatherFirstName;
    }

    /**
     * Gets the foreign mother id.
     * 
     * @return the foreign mother id
     */
    public String getForeignMotherId() {
        return foreignMotherId;
    }

    /**
     * Sets the foreign mother id.
     * 
     * @param foreignMotherId
     *            the new foreign mother id
     */
    public void setForeignMotherId(final String foreignMotherId) {
        this.foreignMotherId = foreignMotherId;
    }

    /**
     * Gets the foreign mother name.
     * 
     * @return the foreign mother name
     */
    public String getForeignMotherName() {
        return foreignMotherName;
    }

    /**
     * Sets the foreign mother name.
     * 
     * @param foreignMotherName
     *            the new foreign mother name
     */
    public void setForeignMotherName(final String foreignMotherName) {
        this.foreignMotherName = foreignMotherName;
    }

    /**
     * Gets the foreign mother last name.
     * 
     * @return the foreign mother last name
     */
    public String getForeignMotherLastName() {
        return foreignMotherLastName;
    }

    /**
     * Sets the foreign mother last name.
     * 
     * @param foreignMotherLastName
     *            the new foreign mother last name
     */
    public void setForeignMotherLastName(final String foreignMotherLastName) {
        this.foreignMotherLastName = foreignMotherLastName;
    }

    /**
     * Gets the foreign mother first name.
     * 
     * @return the foreign mother first name
     */
    public String getForeignMotherFirstName() {
        return foreignMotherFirstName;
    }

    /**
     * Sets the foreign mother first name.
     * 
     * @param foreignMotherFirstName
     *            the new foreign mother first name
     */
    public void setForeignMotherFirstName(final String foreignMotherFirstName) {
        this.foreignMotherFirstName = foreignMotherFirstName;
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
     * Gets the first person id map.
     * 
     * @return the first person id map
     */
    public Map<String, FirstPersonDataObject> getFirstPersonIdMap() {
        return firstPersonIdMap;
    }

    /**
     * Sets the first person id map.
     * 
     * @param firstPersonIdMap
     *            the first person id map
     */
    public void setFirstPersonIdMap(final Map<String, FirstPersonDataObject> firstPersonIdMap) {
        this.firstPersonIdMap = firstPersonIdMap;
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
     * Gets the father note flag.
     * 
     * @return the father note flag
     */
    public String getFatherNoteFlag() {
        return fatherNoteFlag;
    }

    /**
     * Sets the father note flag.
     * 
     * @param fatherNoteFlag
     *            the new father note flag
     */
    public void setFatherNoteFlag(final String fatherNoteFlag) {
        this.fatherNoteFlag = fatherNoteFlag;
    }

    /**
     * Gets the mother note flag.
     * 
     * @return the mother note flag
     */
    public String getMotherNoteFlag() {
        return motherNoteFlag;
    }

    /**
     * Sets the mother note flag.
     * 
     * @param motherNoteFlag
     *            the new mother note flag
     */
    public void setMotherNoteFlag(final String motherNoteFlag) {
        this.motherNoteFlag = motherNoteFlag;
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
     * Gets the first person data list.
     * 
     * @return the first person data list
     */
    public List<FirstPersonDataObject> getFirstPersonDataList() {
        return firstPersonDataList;
    }

    /**
     * Sets the first person data list.
     * 
     * @param firstPersonDataList
     *            the new first person data list
     */
    public void setFirstPersonDataList(final List<FirstPersonDataObject> firstPersonDataList) {
        this.firstPersonDataList = firstPersonDataList;
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
     * Gets the xldfx077m list.
     * 
     * @return the xldfx077m list
     */
    public List<XLDFX077M> getXldfx077mList() {
        return xldfx077mList;
    }

    /**
     * Sets the xldfx077m list.
     * 
     * @param xldfx077mList
     *            the new xldfx077m list
     */
    public void setXldfx077mList(final List<XLDFX077M> xldfx077mList) {
        this.xldfx077mList = xldfx077mList;
    }

    /**
     * Gets the xldfx077h list.
     * 
     * @return the xldfx077h list
     */
    public List<XLDFX077H> getXldfx077hList() {
        return xldfx077hList;
    }

    /**
     * Sets the xldfx077h list.
     * 
     * @param xldfx077hList
     *            the new xldfx077h list
     */
    public void setXldfx077hList(final List<XLDFX077H> xldfx077hList) {
        this.xldfx077hList = xldfx077hList;
    }

    /**
     * Gets the xldfy077m list.
     * 
     * @return the xldfy077m list
     */
    public List<XLDFY077M> getXldfy077mList() {
        return xldfy077mList;
    }

    /**
     * Sets the xldfy077m list.
     * 
     * @param xldfy077mList
     *            the new xldfy077m list
     */
    public void setXldfy077mList(final List<XLDFY077M> xldfy077mList) {
        this.xldfy077mList = xldfy077mList;
    }

    /**
     * Gets the xldfy077h list.
     * 
     * @return the xldfy077h list
     */
    public List<XLDFY077H> getXldfy077hList() {
        return xldfy077hList;
    }

    /**
     * Sets the xldfy077h list.
     * 
     * @param xldfy077hList
     *            the new xldfy077h list
     */
    public void setXldfy077hList(final List<XLDFY077H> xldfy077hList) {
        this.xldfy077hList = xldfy077hList;
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
     * Gets the father living style code name.
     * 
     * @return the father living style code name
     */
    public String getFatherLivingStyleCodeName() {
        return fatherLivingStyleCodeName;
    }

    /**
     * Sets the father living style code name.
     * 
     * @param fatherLivingStyleCodeName
     *            the new father living style code name
     */
    public void setFatherLivingStyleCodeName(final String fatherLivingStyleCodeName) {
        this.fatherLivingStyleCodeName = fatherLivingStyleCodeName;
    }

    /**
     * Gets the father living race type name.
     * 
     * @return the father living race type name
     */
    public String getFatherLivingRaceTypeName() {
        return fatherLivingRaceTypeName;
    }

    /**
     * Sets the father living race type name.
     * 
     * @param fatherLivingRaceTypeName
     *            the new father living race type name
     */
    public void setFatherLivingRaceTypeName(final String fatherLivingRaceTypeName) {
        this.fatherLivingRaceTypeName = fatherLivingRaceTypeName;
    }

    /**
     * Gets the mother living style code name.
     * 
     * @return the mother living style code name
     */
    public String getMotherLivingStyleCodeName() {
        return motherLivingStyleCodeName;
    }

    /**
     * Sets the mother living style code name.
     * 
     * @param motherLivingStyleCodeName
     *            the new mother living style code name
     */
    public void setMotherLivingStyleCodeName(final String motherLivingStyleCodeName) {
        this.motherLivingStyleCodeName = motherLivingStyleCodeName;
    }

    /**
     * Gets the mother living race type name.
     * 
     * @return the mother living race type name
     */
    public String getMotherLivingRaceTypeName() {
        return motherLivingRaceTypeName;
    }

    /**
     * Sets the mother living race type name.
     * 
     * @param motherLivingRaceTypeName
     *            the new mother living race type name
     */
    public void setMotherLivingRaceTypeName(final String motherLivingRaceTypeName) {
        this.motherLivingRaceTypeName = motherLivingRaceTypeName;
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
     * Gets the flag create xld f2 r9 s flag.
     * 
     * @return the flag create xld f2 r9 s flag
     */
    public String getFlagCreateXLDF2R9SFlag() {
        return flagCreateXLDF2R9SFlag;
    }

    /**
     * Sets the flag create xld f2 r9 s flag.
     * 
     * @param flagCreateXLDF2R9SFlag
     *            the new flag create xld f2 r9 s flag
     */
    public void setFlagCreateXLDF2R9SFlag(final String flagCreateXLDF2R9SFlag) {
        this.flagCreateXLDF2R9SFlag = flagCreateXLDF2R9SFlag;
    }

    /**
     * Gets the first reason code.
     * 
     * @return the first reason code
     */
    public String getFirstReasonCode() {
        return firstReasonCode;
    }

    /**
     * Sets the first reason code.
     * 
     * @param firstReasonCode
     *            the new first reason code
     */
    public void setFirstReasonCode(final String firstReasonCode) {
        this.firstReasonCode = firstReasonCode;
    }

    /**
     * Gets the non register list.
     * 
     * @return the non register list
     */
    public List<NonRegisterDTO> getNonRegisterList() {
        return nonRegisterList;
    }

    /**
     * Sets the non register list.
     * 
     * @param nonRegisterList
     *            the new non register list
     */
    public void setNonRegisterList(final List<NonRegisterDTO> nonRegisterList) {
        this.nonRegisterList = nonRegisterList;
    }

    /**
     * Gets the special id map.
     * 
     * @return the special id map
     */
    public Map<String, String> getSpecialIdMap() {
        return specialIdMap;
    }

    /**
     * Sets the special id map.
     * 
     * @param specialIdMap
     *            the special id map
     */
    public void setSpecialIdMap(final Map<String, String> specialIdMap) {
        this.specialIdMap = specialIdMap;
    }

    /**
     * Gets the relation map.
     * 
     * @return the relation map
     */
    public Map<String, List<RelationData>> getRelationMap() {
        return relationMap;
    }

    /**
     * Sets the relation map.
     * 
     * @param relationMap
     *            the relation map
     */
    public void setRelationMap(final Map<String, List<RelationData>> relationMap) {
        this.relationMap = relationMap;
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
     * Gets the foreign person.
     * 
     * @return the foreign person
     */
    public Tldf004mType getForeignPerson() {
        return foreignPerson;
    }

    /**
     * Sets the foreign person.
     * 
     * @param foreignPerson
     *            the new foreign person
     */
    public void setForeignPerson(final Tldf004mType foreignPerson) {
        this.foreignPerson = foreignPerson;
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
     * Gets the certificate4 other certificate.
     * 
     * @return the certificate4 other certificate
     */
    public String getCertificate4OtherCertificate() {
        return certificate4OtherCertificate;
    }

    /**
     * Sets the certificate4 other certificate.
     * 
     * @param certificate4OtherCertificate
     *            the new certificate4 other certificate
     */
    public void setCertificate4OtherCertificate(final String certificate4OtherCertificate) {
        this.certificate4OtherCertificate = certificate4OtherCertificate;
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
     * Gets the spouse map.
     * 
     * @return the spouse map
     */
    public Map<String, Rcdf001mType> getSpouseMap() {
        return spouseMap;
    }

    /**
     * Sets the spouse map.
     * 
     * @param spouseMap
     *            the spouse map
     */
    public void setSpouseMap(final Map<String, Rcdf001mType> spouseMap) {
        this.spouseMap = spouseMap;
    }

    /**
     * Gets the xcdf001mrl map.
     * 
     * @return the xcdf001mrl map
     */
    public Map<String, XCDF001MRL> getXcdf001mrlMap() {
        return xcdf001mrlMap;
    }

    /**
     * Sets the xcdf001mrl map.
     * 
     * @param xcdf001mrlMap
     *            the xcdf001mrl map
     */
    public void setXcdf001mrlMap(final Map<String, XCDF001MRL> xcdf001mrlMap) {
        this.xcdf001mrlMap = xcdf001mrlMap;
    }

    /**
     * Gets the xldf004m map.
     * 
     * @return the xldf004m map
     */
    public Map<String, XLDF004M> getXldf004mMap() {
        return xldf004mMap;
    }

    /**
     * Sets the xldf004m map.
     * 
     * @param xldf004mMap
     *            the xldf004m map
     */
    public void setXldf004mMap(final Map<String, XLDF004M> xldf004mMap) {
        this.xldf004mMap = xldf004mMap;
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

}
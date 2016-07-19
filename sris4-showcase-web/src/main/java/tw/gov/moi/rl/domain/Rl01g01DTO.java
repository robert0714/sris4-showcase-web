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
import tw.gov.moi.domain.Tldf004mType;
import tw.gov.moi.domain.XldfefaplcType;
import tw.gov.moi.rl.common.constant.RlConstant;
import tw.gov.moi.rl.component.dto.OpeningOperationDTO;
import tw.gov.moi.rl.component.xldf.dto.XCDF001MRL;
import tw.gov.moi.rl.component.xldf.dto.XLDFY0D1M;
import tw.gov.moi.rl.domain.xldf.XLDFHouseholdDataDomainObject;
import tw.gov.moi.rl.domain.xldf.XLDFPersonDataDomainObject;
import tw.gov.moi.rl.domain.xldf.XLDFPersonNoteDomainObject;

/**
 * 結婚廢止登記DTO.
 * 
 * @author Viva.Hong
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Rl01g01DTO", propOrder = { "transactionId", "acceptSiteId", "userId", "initTime",
        "openingOperationDTO", "backupDTO", "applyDTO1", "applyDTO2", "commDTO", "finePerson", "husbandHouseholdData",
        "husbandHPersonData", "husbandPersonData", "husbandForeignPerson", "hhPersonId", "hhSiteId", "hhOriginalName",
        "hhRemoveDate", "hhRemoveTime", "hhHouseholdHeadFlag", "hhPersonRole", "hhHouseholdState",
        "hhOrgEducationMark", "hhEducationMark", "hhEducationName", "hhCityCountyName", "hhTownName",
        "hhOutliveCaseFlag", "hhMarriageCode", "hhResidentNo", "hhPassportId", "hhOtherId", "hhFlagMarriageCode",
        "hhNowStateCode", "wifeHouseholdData", "wifeHPersonData", "wifePersonData", "wifeForeignPerson", "wwPersonId",
        "wwSiteId", "wwOriginalName", "wwRemoveDate", "wwRemoveTime", "wwHouseholdHeadFlag", "wwPersonRole",
        "wwHouseholdState", "wwOrgEducationMark", "wwEducationMark", "wwEducationName", "wwCityCountyName",
        "wwTownName", "wwOutliveCaseFlag", "wwMarriageCode", "wwResidentNo", "wwPassportId", "wwOtherId",
        "wwFlagMarriageCode", "wwNowStateCode", "registerDate", "registerTime", "applyDate", "applyCode",
        "acceptAdminOfficeCode", "enforcedFlag", "enforcedApplicant", "targetPersonFlag", "nonTargetPerson",
        "beforeWork", "delReason", "otherDelReason", "delYyymmdd", "mrgApplyDate", "delReasonName", "otherCertificate",
        "registerContent", "needFineFlag", "fineOverdueruleMark", "fineMoney", "acceptRegistrarName",
        "acceptRegistrarId", "certificateList", "applySeq", "applyCaseNo", "fineEventDate", "operationCode",
        "systemDate", "systemTime", "applySequenceId", "doFineCheckFlag", "deleteFineDTOFlag",
        "previousDoFineCheckFlag", "previousFineEventDate", "fineFreeFlag", "doFineCheckFlagOpen", "fineDTO",
        "removeFeeReason", "fineSerialNumber", "feeAmount", "receiptId", "initErrorMessageList", "mrgXCDF001MRLMap",
        "personNoteList", "xldfy0d1mList", "xldfy0d1hList", "fineList", "otherCertificateFlag",
        "flagGetSpouseDataHWFlag", "flagCreateXLDFPersonDataHWFlag", "flagCreateXLDFM02MHWFlag",
        "flagCreateXCDF001MRLHWFlag", "flagCreateXLDFM10MS0D1HWFlag", "flagCreateXLDFM10MR0D1HWFlag",
        "flagCreateXLDFS0D1HWFlag", "flagCreateXLDF008SHWFlag", "flagCreateXLDF088THWFlag", "flagCreateXLDFR0D1HWFlag",
        "flagCreateXLDF009SHWFlag", "flagCreateXLDF016SHWFlag", "initSuccess", "activeIndex", "foreignPerson",
        "lockMode" })
@XmlRootElement(name = "Rl01g01DTO")
public class Rl01g01DTO implements Serializable {

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

    /** openingOperation dto. */
    @XmlElement(name = "OpeningOperationDTO")
    @FieldName("openingOperation dto")
    private OpeningOperationDTO openingOperationDTO;

    /** backup dto. */
    @XmlElement(name = "BackupDTO")
    @FieldName("backup dto")
    private Rl01g01DTO backupDTO;

    /** 申請人1. */
    @XmlElement(name = "ApplyDTO1")
    @FieldName("申請人1")
    private XLDFApplicantDataDTO applyDTO1 = new XLDFApplicantDataDTO();

    /** 申請人2. */
    @XmlElement(name = "ApplyDTO2")
    @FieldName("申請人2")
    private XLDFApplicantDataDTO applyDTO2 = new XLDFApplicantDataDTO();

    /** 受委託人. */
    @XmlElement(name = "CommDTO")
    @FieldName("受委託人")
    private XLDFPersonBriefDataDTO commDTO = new XLDFPersonBriefDataDTO();

    /** 受處分人. */
    @XmlElement(name = "FinePerson", required = true)
    @FieldName("受處分人")
    private XLDFApplicantDataDTO finePerson = new XLDFApplicantDataDTO();

    /** (夫)全戶基本資料. */
    @XmlElement(name = "HusbandHouseholdData")
    @FieldName("(夫)全戶基本資料")
    private XLDFHouseholdDataDomainObject husbandHouseholdData;

    /** (夫)戶長個人基本資料. */
    @XmlElement(name = "HusbandHPersonData")
    @FieldName("(夫)戶長個人基本資料")
    private XLDFPersonDataDomainObject husbandHPersonData;

    /** (夫)個人基本資料. */
    @XmlElement(name = "HusbandPersonData")
    @FieldName("(夫)個人基本資料")
    private XLDFPersonDataDomainObject husbandPersonData;

    /** (夫)外籍者資料. */
    @XmlElement(name = "HusbandForeignPerson")
    @FieldName("(夫)外籍者資料")
    private XLDFForeignPersonDTO husbandForeignPerson = new XLDFForeignPersonDTO();

    /** (夫)統號. */
    @XmlElement(name = "HhPersonId")
    @FieldName("(夫)統號")
    private String hhPersonId;

    /** (夫)作業點代碼. */
    @XmlElement(name = "HhSiteId")
    @FieldName("(夫)作業點代碼")
    private String hhSiteId;

    /** (夫)原姓名. */
    @XmlElement(name = "HhOriginalName")
    @FieldName("(夫)原姓名")
    private String hhOriginalName;

    /** (夫)除戶日期. */
    @XmlElement(name = "HhRemoveDate")
    @FieldName("(夫)除戶日期")
    private String hhRemoveDate;

    /** (夫)除戶時間. */
    @XmlElement(name = "HhRemoveTime")
    @FieldName("(夫)除戶時間")
    private String hhRemoveTime;

    /** (夫)當事人為戶長-旗標. */
    @XmlElement(name = "HhHouseholdHeadFlag")
    @FieldName("(夫)當事人為戶長-旗標")
    private String hhHouseholdHeadFlag;

    /** (夫)結婚者身分（1:統號第一碼為$「無戶籍外籍者」、2:國人、3:統號第三碼為6、7、8「外國人有統號」）. */
    @XmlElement(name = "HhPersonRole")
    @FieldName("(夫)結婚者身分（1:統號第一碼為$「無戶籍外籍者」、2:國人、3:統號第三碼為6、7、8「外國人有統號」）")
    private String hhPersonRole;

    /** (夫)戶籍簿頁狀態（M現戶）、（H除戶）. */
    @XmlElement(name = "HhHouseholdState")
    @FieldName("(夫)戶籍簿頁狀態（M現戶）、（H除戶）")
    private String hhHouseholdState;

    /** (夫)原教育程度代碼. */
    @XmlElement(name = "HhOrgEducationMark")
    @FieldName("(夫)原教育程度代碼")
    private String hhOrgEducationMark;

    /** (夫)教育程度. */
    @XmlElement(name = "HhEducationMark")
    @FieldName("(夫)教育程度")
    private String hhEducationMark;

    /** (夫)教育程度名稱. */
    @XmlElement(name = "HhEducationName")
    @FieldName("(夫)教育程度名稱")
    private String hhEducationName;

    /** (夫)省市縣市名稱. */
    @XmlElement(name = "HhCityCountyName")
    @FieldName("(夫)省市縣市名稱")
    private String hhCityCountyName;

    /** (夫)鄉鎮市區名稱. */
    @XmlElement(name = "HhTownName")
    @FieldName("(夫)鄉鎮市區名稱")
    private String hhTownName;

    /** (夫)非現住人口處理註記. */
    @XmlElement(name = "HhOutliveCaseFlag")
    @FieldName("(夫)非現住人口處理註記")
    private String hhOutliveCaseFlag;

    /** (夫)婚姻狀況. */
    @XmlElement(name = "HhMarriageCode")
    @FieldName("(夫)婚姻狀況")
    private String hhMarriageCode;

    /** (夫)統一證號. */
    @XmlElement(name = "HhResidentNo")
    @FieldName("(夫)統一證號")
    private String hhResidentNo;

    /** (夫)護照號碼. */
    @XmlElement(name = "HhPassportId")
    @FieldName("(夫)護照號碼")
    private String hhPassportId;

    /** (夫)其他證號. */
    @XmlElement(name = "HhOtherId")
    @FieldName("(夫)其他證號")
    private String hhOtherId;

    /** (夫)旗標:是否已婚?. */
    @XmlElement(name = "HhFlagMarriageCode")
    @FieldName("(夫)旗標:是否已婚?")
    private String hhFlagMarriageCode;

    /** (夫)戶籍現況. */
    @XmlElement(name = "HhNowStateCode", required = true)
    @FieldName("(夫)戶籍現況")
    private String hhNowStateCode;

    /** (妻)全戶基本資料. */
    @XmlElement(name = "WifeHouseholdData")
    @FieldName("(妻)全戶基本資料")
    private XLDFHouseholdDataDomainObject wifeHouseholdData;

    /** (妻)戶長個人基本資料. */
    @XmlElement(name = "WifeHPersonData")
    @FieldName("(妻)戶長個人基本資料")
    private XLDFPersonDataDomainObject wifeHPersonData;

    /** (妻)個人基本資料. */
    @XmlElement(name = "WifePersonData")
    @FieldName("(妻)個人基本資料")
    private XLDFPersonDataDomainObject wifePersonData;

    /** (妻)外籍者資料. */
    @XmlElement(name = "WifeForeignPerson")
    @FieldName("(妻)外籍者資料")
    private XLDFForeignPersonDTO wifeForeignPerson = new XLDFForeignPersonDTO();

    /** (妻)統號. */
    @XmlElement(name = "WwPersonId")
    @FieldName("(妻)統號")
    private String wwPersonId;

    /** (妻)作業點代碼. */
    @XmlElement(name = "WwSiteId")
    @FieldName("(妻)作業點代碼")
    private String wwSiteId;

    /** (妻)原姓名. */
    @XmlElement(name = "WwOriginalName")
    @FieldName("(妻)原姓名")
    private String wwOriginalName;

    /** (妻)除戶日期. */
    @XmlElement(name = "WwRemoveDate")
    @FieldName("(妻)除戶日期")
    private String wwRemoveDate;

    /** (妻)除戶時間. */
    @XmlElement(name = "WwRemoveTime")
    @FieldName("(妻)除戶時間")
    private String wwRemoveTime;

    /** (妻)當事人為戶長-旗標. */
    @XmlElement(name = "WwHouseholdHeadFlag")
    @FieldName("(妻)當事人為戶長-旗標")
    private String wwHouseholdHeadFlag;

    /** (妻)結婚者身分（1:統號第一碼為$「無戶籍外籍者」、2:國人、3:統號第三碼為6、7、8「外國人有統號」）. */
    @XmlElement(name = "WwPersonRole")
    @FieldName("(妻)結婚者身分（1:統號第一碼為$「無戶籍外籍者」、2:國人、3:統號第三碼為6、7、8「外國人有統號」）")
    private String wwPersonRole;

    /** (妻)戶籍簿頁狀態（M現戶）、（H除戶）. */
    @XmlElement(name = "WwHouseholdState")
    @FieldName("(妻)戶籍簿頁狀態（M現戶）、（H除戶）")
    private String wwHouseholdState;

    /** (妻)原教育程度代碼. */
    @XmlElement(name = "WwOrgEducationMark")
    @FieldName("(妻)原教育程度代碼")
    private String wwOrgEducationMark;

    /** (妻)教育程度. */
    @XmlElement(name = "WwEducationMark")
    @FieldName("(妻)教育程度")
    private String wwEducationMark;

    /** (妻)教育程度名稱. */
    @XmlElement(name = "WwEducationName")
    @FieldName("(妻)教育程度名稱")
    private String wwEducationName;

    /** (妻)省市縣市名稱. */
    @XmlElement(name = "WwCityCountyName")
    @FieldName("(妻)省市縣市名稱")
    private String wwCityCountyName;

    /** (妻)鄉鎮市區名稱. */
    @XmlElement(name = "WwTownName")
    @FieldName("(妻)鄉鎮市區名稱")
    private String wwTownName;

    /** (妻)非現住人口處理註記. */
    @XmlElement(name = "WwOutliveCaseFlag")
    @FieldName("(妻)非現住人口處理註記")
    private String wwOutliveCaseFlag;

    /** (妻)婚姻狀況. */
    @XmlElement(name = "WwMarriageCode")
    @FieldName("(妻)婚姻狀況")
    private String wwMarriageCode;

    /** (妻)統一證號. */
    @XmlElement(name = "WwResidentNo")
    @FieldName("(妻)統一證號")
    private String wwResidentNo;

    /** (妻)護照號碼. */
    @XmlElement(name = "WwPassportId")
    @FieldName("(妻)護照號碼")
    private String wwPassportId;

    /** (妻)其他證號. */
    @XmlElement(name = "WwOtherId")
    @FieldName("(妻)其他證號")
    private String wwOtherId;

    /** (妻)旗標:是否已婚?. */
    @XmlElement(name = "WwFlagMarriageCode")
    @FieldName("(妻)旗標:是否已婚?")
    private String wwFlagMarriageCode;

    /** (妻)戶籍現況. */
    @XmlElement(name = "WwNowStateCode", required = true)
    @FieldName("(妻)戶籍現況")
    private String wwNowStateCode;

    /** 登記日期. */
    @XmlElement(name = "RegisterDate")
    @FieldName("登記日期")
    private String registerDate;

    /** 登記時間. */
    @XmlElement(name = "RegisterTime")
    @FieldName("登記時間")
    private String registerTime;

    /** 申請日期. */
    @XmlElement(name = "ApplyDate")
    @FieldName("申請日期")
    private String applyDate;

    /** 登記代碼. */
    @XmlElement(name = "ApplyCode")
    @FieldName("登記代碼")
    private String applyCode = RlConstant.STRING_ZERO_D_ONE;

    /** 受理地戶所代碼. */
    @XmlElement(name = "AcceptAdminOfficeCode")
    @FieldName("受理地戶所代碼")
    private String acceptAdminOfficeCode;

    /** 逕為登記旗標. */
    @XmlElement(name = "EnforcedFlag")
    @FieldName("逕為登記旗標")
    private String enforcedFlag;

    /** 逕為登記申請人. */
    @XmlElement(name = "EnforcedApplicant")
    @FieldName("逕為登記申請人")
    private XldfefaplcType enforcedApplicant;

    /** 大簿當事人註記. */
    @XmlElement(name = "TargetPersonFlag")
    @FieldName("大簿當事人註記")
    private String targetPersonFlag;

    /** 非大簿當事人註記(h:夫、 w:妻). */
    @XmlElement(name = "NonTargetPerson", required = true)
    @FieldName("非大簿當事人註記(h:夫、 w:妻)")
    private String nonTargetPerson;

    /** 原登記事項. */
    @XmlElement(name = "BeforeWork")
    @FieldName("原登記事項")
    private String beforeWork;

    /** 廢止原因. */
    @XmlElement(name = "DelReason")
    @FieldName("廢止原因")
    private String delReason;

    /** 其他廢止原因. */
    @XmlElement(name = "OtherDelReason")
    @FieldName("其他廢止原因")
    private String otherDelReason;

    /** 結婚廢止日期. */
    @XmlElement(name = "DelYyymmdd")
    @FieldName("結婚廢止日期")
    private String delYyymmdd;

    /** 結婚登記申請日期. */
    @XmlElement(name = "MrgApplyDate")
    @FieldName("結婚登記申請日期")
    private String mrgApplyDate;

    /** 廢止原因名稱. */
    @XmlElement(name = "DelReasonName")
    @FieldName("廢止原因名稱")
    private String delReasonName;

    /** 其他附繳證件. */
    @XmlElement(name = "OtherCertificate")
    @FieldName("其他附繳證件")
    private String otherCertificate = StringUtils.EMPTY;

    /** 備註. */
    @XmlElement(name = "RegisterContent")
    @FieldName("備註")
    private String registerContent;

    /** 須進行罰鍰處理. */
    @XmlElement(name = "NeedFineFlag")
    @FieldName("須進行罰鍰處理")
    private String needFineFlag = RlConstant.NO_CHAR;

    /** 戶籍罰鍰條款註記. */
    @XmlElement(name = "FineOverdueruleMark")
    @FieldName("戶籍罰鍰條款註記")
    private String fineOverdueruleMark;

    /** 戶籍罰鍰金鍰. */
    @XmlElement(name = "FineMoney")
    @FieldName("戶籍罰鍰金鍰")
    private String fineMoney;

    /** 受理地戶籍員姓名. */
    @XmlElement(name = "AcceptRegistrarName")
    @FieldName("受理地戶籍員姓名")
    private String acceptRegistrarName;

    /** 受理地戶籍員帳號. */
    @XmlElement(name = "AcceptRegistrarId")
    @FieldName("受理地戶籍員帳號")
    private String acceptRegistrarId;

    /** 附繳證件清單. */
    @XmlElement(name = "CertificateList")
    @FieldName("附繳證件清單")
    private List<String> certificateList = new ArrayList<String>();

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

    /** 免罰原因. */
    @XmlElement(name = "RemoveFeeReason")
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

    /** 初始1g01時的錯誤訊息清單. */
    @XmlElement(name = "InitErrorMessageList", required = true)
    @FieldName("初始1g01時的錯誤訊息清單")
    private List<List<String>> initErrorMessageList = new ArrayList<List<String>>();

    /** 結婚系列-統號-XCDF001MRL物件MAP. */
    @XmlElement(name = "結婚系列-統號-XCDF001MRL物件MAP")
    @FieldName("結婚系列-統號-XCDF001MRL物件MAP")
    private Map<String, XCDF001MRL> mrgXCDF001MRLMap = new HashMap<String, XCDF001MRL>();

    /** 個人記事清單. */
    @XmlElement(name = "PersonNoteList")
    @FieldName("個人記事清單")
    private List<XLDFPersonNoteDomainObject> personNoteList = new ArrayList<XLDFPersonNoteDomainObject>();

    /** 個人記事欄位化-現戶物件清單. */
    @XmlElement(name = "Xldfy090mList")
    @FieldName("個人記事欄位化-現戶物件清單")
    private List<XLDFY0D1M> xldfy0d1mList = new ArrayList<XLDFY0D1M>();

    /** 個人記事欄位化-除戶物件清單. */
    @XmlElement(name = "Xldfy0d1hList")
    @FieldName("個人記事欄位化-除戶物件清單")
    private List<XLDFY0D1M> xldfy0d1hList = new ArrayList<XLDFY0D1M>();

    /** 罰鍰記事清單. */
    @XmlElement(name = "FineList")
    @FieldName("罰鍰記事清單")
    private List<XLDFOperationFineDTO> fineList = new ArrayList<XLDFOperationFineDTO>();

    /** 旗標:其他附繳證件. */
    @XmlElement(name = "OtherCertificateFlag", required = true)
    @FieldName("旗標:其他附繳證件")
    private boolean otherCertificateFlag = false;

    /** getSpouseData flag. */
    @XmlElement(name = "FlagGetSpouseDataHWFlag")
    @FieldName("getSpouseData旗標")
    private String flagGetSpouseDataHWFlag;

    /** createXLDFPersonData flag. */
    @XmlElement(name = "FlagCreateXLDFPersonDataHWFlag")
    @FieldName("createXLDFPersonData旗標")
    private String flagCreateXLDFPersonDataHWFlag;

    /** createXLDFM02M flag. */
    @XmlElement(name = "FlagCreateXLDFM02MHWFlag")
    @FieldName("createXLDFM02M旗標")
    private String flagCreateXLDFM02MHWFlag;

    /** createXCDF001MRL flag. */
    @XmlElement(name = "FlagCreateXCDF001MRLHWFlag")
    @FieldName("createXCDF001MRL旗標")
    private String flagCreateXCDF001MRLHWFlag;

    /** createXLDFM10M S0D1 flag. */
    @XmlElement(name = "FlagCreateXLDFM10MS0D1HWFlag")
    @FieldName("createXLDFM10M旗標")
    private String flagCreateXLDFM10MS0D1HWFlag;

    /** createXLDFM10M R0D1 flag. */
    @XmlElement(name = "FlagCreateXLDFM10MR0D1HWFlag")
    @FieldName("createXLDFM10M旗標")
    private String flagCreateXLDFM10MR0D1HWFlag;

    /** createXLDFS0D1 flag. */
    @XmlElement(name = "FlagCreateXLDFS0D1HWFlag")
    @FieldName("createXLDFS0D1旗標")
    private String flagCreateXLDFS0D1HWFlag;

    /** createXLDF008S flag. */
    @XmlElement(name = "FlagCreateXLDF008SHWFlag")
    @FieldName("createXLDF008S旗標")
    private String flagCreateXLDF008SHWFlag;

    /** createXLDF088T flag. */
    @XmlElement(name = "FlagCreateXLDF088THWFlag")
    @FieldName("createXLDF088T旗標")
    private String flagCreateXLDF088THWFlag;

    /** createXLDFR0D1 flag. */
    @XmlElement(name = "FlagCreateXLDFR0D1HWFlag")
    @FieldName("createXLDFR0D1旗標")
    private String flagCreateXLDFR0D1HWFlag;

    /** createXLDF009S flag. */
    @XmlElement(name = "FlagCreateXLDF009SHWFlag")
    @FieldName("createXLDF009S旗標")
    private String flagCreateXLDF009SHWFlag;

    /** createXLDF016S flag. */
    @XmlElement(name = "FlagCreateXLDF016SHWFlag")
    @FieldName("createXLDF016S旗標")
    private String flagCreateXLDF016SHWFlag;

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
     * Gets the backup dto.
     * 
     * @return the backup dto
     */
    public Rl01g01DTO getBackupDTO() {
        return backupDTO;
    }

    /**
     * Sets the backup dto.
     * 
     * @param backupDTO
     *            the new backup dto
     */
    public void setBackupDTO(final Rl01g01DTO backupDTO) {
        this.backupDTO = backupDTO;
    }

    /**
     * Gets the apply dt o1.
     * 
     * @return the apply dt o1
     */
    public XLDFApplicantDataDTO getApplyDTO1() {
        return applyDTO1;
    }

    /**
     * Sets the apply dt o1.
     * 
     * @param applyDTO1
     *            the new apply dt o1
     */
    public void setApplyDTO1(final XLDFApplicantDataDTO applyDTO1) {
        this.applyDTO1 = applyDTO1;
    }

    /**
     * Gets the apply dt o2.
     * 
     * @return the apply dt o2
     */
    public XLDFApplicantDataDTO getApplyDTO2() {
        return applyDTO2;
    }

    /**
     * Sets the apply dt o2.
     * 
     * @param applyDTO2
     *            the new apply dt o2
     */
    public void setApplyDTO2(final XLDFApplicantDataDTO applyDTO2) {
        this.applyDTO2 = applyDTO2;
    }

    /**
     * Gets the comm dto.
     * 
     * @return the comm dto
     */
    public XLDFPersonBriefDataDTO getCommDTO() {
        return commDTO;
    }

    /**
     * Sets the comm dto.
     * 
     * @param commDTO
     *            the new comm dto
     */
    public void setCommDTO(final XLDFPersonBriefDataDTO commDTO) {
        this.commDTO = commDTO;
    }

    /**
     * Gets the husband household data.
     * 
     * @return the husband household data
     */
    public XLDFHouseholdDataDomainObject getHusbandHouseholdData() {
        return husbandHouseholdData;
    }

    /**
     * Sets the husband household data.
     * 
     * @param husbandHouseholdData
     *            the new husband household data
     */
    public void setHusbandHouseholdData(final XLDFHouseholdDataDomainObject husbandHouseholdData) {
        this.husbandHouseholdData = husbandHouseholdData;
    }

    /**
     * Gets the husband h person data.
     * 
     * @return the husband h person data
     */
    public XLDFPersonDataDomainObject getHusbandHPersonData() {
        return husbandHPersonData;
    }

    /**
     * Sets the husband h person data.
     * 
     * @param husbandHPersonData
     *            the new husband h person data
     */
    public void setHusbandHPersonData(final XLDFPersonDataDomainObject husbandHPersonData) {
        this.husbandHPersonData = husbandHPersonData;
    }

    /**
     * Gets the husband person data.
     * 
     * @return the husband person data
     */
    public XLDFPersonDataDomainObject getHusbandPersonData() {
        return husbandPersonData;
    }

    /**
     * Sets the husband person data.
     * 
     * @param husbandPersonData
     *            the new husband person data
     */
    public void setHusbandPersonData(final XLDFPersonDataDomainObject husbandPersonData) {
        this.husbandPersonData = husbandPersonData;
    }

    /**
     * Gets the husband foreign person.
     * 
     * @return the husband foreign person
     */
    public XLDFForeignPersonDTO getHusbandForeignPerson() {
        return husbandForeignPerson;
    }

    /**
     * Sets the husband foreign person.
     * 
     * @param husbandForeignPerson
     *            the new husband foreign person
     */
    public void setHusbandForeignPerson(final XLDFForeignPersonDTO husbandForeignPerson) {
        this.husbandForeignPerson = husbandForeignPerson;
    }

    /**
     * Gets the hh person id.
     * 
     * @return the hh person id
     */
    public String getHhPersonId() {
        return hhPersonId;
    }

    /**
     * Sets the hh person id.
     * 
     * @param hhPersonId
     *            the new hh person id
     */
    public void setHhPersonId(final String hhPersonId) {
        this.hhPersonId = hhPersonId;
    }

    /**
     * Gets the hh site id.
     * 
     * @return the hh site id
     */
    public String getHhSiteId() {
        return hhSiteId;
    }

    /**
     * Sets the hh site id.
     * 
     * @param hhSiteId
     *            the new hh site id
     */
    public void setHhSiteId(final String hhSiteId) {
        this.hhSiteId = hhSiteId;
    }

    /**
     * Gets the hh original name.
     * 
     * @return the hh original name
     */
    public String getHhOriginalName() {
        return hhOriginalName;
    }

    /**
     * Sets the hh original name.
     * 
     * @param hhOriginalName
     *            the new hh original name
     */
    public void setHhOriginalName(final String hhOriginalName) {
        this.hhOriginalName = hhOriginalName;
    }

    /**
     * Gets the hh remove date.
     * 
     * @return the hh remove date
     */
    public String getHhRemoveDate() {
        return hhRemoveDate;
    }

    /**
     * Sets the hh remove date.
     * 
     * @param hhRemoveDate
     *            the new hh remove date
     */
    public void setHhRemoveDate(final String hhRemoveDate) {
        this.hhRemoveDate = hhRemoveDate;
    }

    /**
     * Gets the hh remove time.
     * 
     * @return the hh remove time
     */
    public String getHhRemoveTime() {
        return hhRemoveTime;
    }

    /**
     * Sets the hh remove time.
     * 
     * @param hhRemoveTime
     *            the new hh remove time
     */
    public void setHhRemoveTime(final String hhRemoveTime) {
        this.hhRemoveTime = hhRemoveTime;
    }

    /**
     * Gets the hh household head flag.
     * 
     * @return the hh household head flag
     */
    public String getHhHouseholdHeadFlag() {
        return hhHouseholdHeadFlag;
    }

    /**
     * Sets the hh household head flag.
     * 
     * @param hhHouseholdHeadFlag
     *            the new hh household head flag
     */
    public void setHhHouseholdHeadFlag(final String hhHouseholdHeadFlag) {
        this.hhHouseholdHeadFlag = hhHouseholdHeadFlag;
    }

    /**
     * Gets the hh person role.
     * 
     * @return the hh person role
     */
    public String getHhPersonRole() {
        return hhPersonRole;
    }

    /**
     * Sets the hh person role.
     * 
     * @param hhPersonRole
     *            the new hh person role
     */
    public void setHhPersonRole(final String hhPersonRole) {
        this.hhPersonRole = hhPersonRole;
    }

    /**
     * Gets the hh household state.
     * 
     * @return the hh household state
     */
    public String getHhHouseholdState() {
        return hhHouseholdState;
    }

    /**
     * Sets the hh household state.
     * 
     * @param hhHouseholdState
     *            the new hh household state
     */
    public void setHhHouseholdState(final String hhHouseholdState) {
        this.hhHouseholdState = hhHouseholdState;
    }

    /**
     * Gets the hh education mark.
     * 
     * @return the hh education mark
     */
    public String getHhEducationMark() {
        return hhEducationMark;
    }

    /**
     * Sets the hh education mark.
     * 
     * @param hhEducationMark
     *            the new hh education mark
     */
    public void setHhEducationMark(final String hhEducationMark) {
        this.hhEducationMark = hhEducationMark;
    }

    /**
     * Gets the hh education name.
     * 
     * @return the hh education name
     */
    public String getHhEducationName() {
        return hhEducationName;
    }

    /**
     * Sets the hh education name.
     * 
     * @param hhEducationName
     *            the new hh education name
     */
    public void setHhEducationName(final String hhEducationName) {
        this.hhEducationName = hhEducationName;
    }

    /**
     * Gets the hh city county name.
     * 
     * @return the hh city county name
     */
    public String getHhCityCountyName() {
        return hhCityCountyName;
    }

    /**
     * Sets the hh city county name.
     * 
     * @param hhCityCountyName
     *            the new hh city county name
     */
    public void setHhCityCountyName(final String hhCityCountyName) {
        this.hhCityCountyName = hhCityCountyName;
    }

    /**
     * Gets the hh town name.
     * 
     * @return the hh town name
     */
    public String getHhTownName() {
        return hhTownName;
    }

    /**
     * Sets the hh town name.
     * 
     * @param hhTownName
     *            the new hh town name
     */
    public void setHhTownName(final String hhTownName) {
        this.hhTownName = hhTownName;
    }

    /**
     * Gets the hh outlive case flag.
     * 
     * @return the hh outlive case flag
     */
    public String getHhOutliveCaseFlag() {
        return hhOutliveCaseFlag;
    }

    /**
     * Sets the hh outlive case flag.
     * 
     * @param hhOutliveCaseFlag
     *            the new hh outlive case flag
     */
    public void setHhOutliveCaseFlag(final String hhOutliveCaseFlag) {
        this.hhOutliveCaseFlag = hhOutliveCaseFlag;
    }

    /**
     * Gets the hh marriage code.
     * 
     * @return the hh marriage code
     */
    public String getHhMarriageCode() {
        return hhMarriageCode;
    }

    /**
     * Sets the hh marriage code.
     * 
     * @param hhMarriageCode
     *            the new hh marriage code
     */
    public void setHhMarriageCode(final String hhMarriageCode) {
        this.hhMarriageCode = hhMarriageCode;
    }

    /**
     * Gets the hh resident no.
     * 
     * @return the hh resident no
     */
    public String getHhResidentNo() {
        return hhResidentNo;
    }

    /**
     * Sets the hh resident no.
     * 
     * @param hhResidentNo
     *            the new hh resident no
     */
    public void setHhResidentNo(final String hhResidentNo) {
        this.hhResidentNo = hhResidentNo;
    }

    /**
     * Gets the hh passport id.
     * 
     * @return the hh passport id
     */
    public String getHhPassportId() {
        return hhPassportId;
    }

    /**
     * Sets the hh passport id.
     * 
     * @param hhPassportId
     *            the new hh passport id
     */
    public void setHhPassportId(final String hhPassportId) {
        this.hhPassportId = hhPassportId;
    }

    /**
     * Gets the hh other id.
     * 
     * @return the hh other id
     */
    public String getHhOtherId() {
        return hhOtherId;
    }

    /**
     * Sets the hh other id.
     * 
     * @param hhOtherId
     *            the new hh other id
     */
    public void setHhOtherId(final String hhOtherId) {
        this.hhOtherId = hhOtherId;
    }

    /**
     * Gets the hh flag marriage code.
     * 
     * @return the hh flag marriage code
     */
    public String getHhFlagMarriageCode() {
        return hhFlagMarriageCode;
    }

    /**
     * Sets the hh flag marriage code.
     * 
     * @param hhFlagMarriageCode
     *            the new hh flag marriage code
     */
    public void setHhFlagMarriageCode(final String hhFlagMarriageCode) {
        this.hhFlagMarriageCode = hhFlagMarriageCode;
    }

    /**
     * Gets the ww flag marriage code.
     * 
     * @return the ww flag marriage code
     */
    public String getWwFlagMarriageCode() {
        return wwFlagMarriageCode;
    }

    /**
     * Sets the ww flag marriage code.
     * 
     * @param wwFlagMarriageCode
     *            the new ww flag marriage code
     */
    public void setWwFlagMarriageCode(final String wwFlagMarriageCode) {
        this.wwFlagMarriageCode = wwFlagMarriageCode;
    }

    /**
     * Gets the wife household data.
     * 
     * @return the wife household data
     */
    public XLDFHouseholdDataDomainObject getWifeHouseholdData() {
        return wifeHouseholdData;
    }

    /**
     * Sets the wife household data.
     * 
     * @param wifeHouseholdData
     *            the new wife household data
     */
    public void setWifeHouseholdData(final XLDFHouseholdDataDomainObject wifeHouseholdData) {
        this.wifeHouseholdData = wifeHouseholdData;
    }

    /**
     * Gets the wife h person data.
     * 
     * @return the wife h person data
     */
    public XLDFPersonDataDomainObject getWifeHPersonData() {
        return wifeHPersonData;
    }

    /**
     * Sets the wife h person data.
     * 
     * @param wifeHPersonData
     *            the new wife h person data
     */
    public void setWifeHPersonData(final XLDFPersonDataDomainObject wifeHPersonData) {
        this.wifeHPersonData = wifeHPersonData;
    }

    /**
     * Gets the wife person data.
     * 
     * @return the wife person data
     */
    public XLDFPersonDataDomainObject getWifePersonData() {
        return wifePersonData;
    }

    /**
     * Sets the wife person data.
     * 
     * @param wifePersonData
     *            the new wife person data
     */
    public void setWifePersonData(final XLDFPersonDataDomainObject wifePersonData) {
        this.wifePersonData = wifePersonData;
    }

    /**
     * Gets the wife foreign person.
     * 
     * @return the wife foreign person
     */
    public XLDFForeignPersonDTO getWifeForeignPerson() {
        return wifeForeignPerson;
    }

    /**
     * Sets the wife foreign person.
     * 
     * @param wifeForeignPerson
     *            the new wife foreign person
     */
    public void setWifeForeignPerson(final XLDFForeignPersonDTO wifeForeignPerson) {
        this.wifeForeignPerson = wifeForeignPerson;
    }

    /**
     * Gets the ww person id.
     * 
     * @return the ww person id
     */
    public String getWwPersonId() {
        return wwPersonId;
    }

    /**
     * Sets the ww person id.
     * 
     * @param wwPersonId
     *            the new ww person id
     */
    public void setWwPersonId(final String wwPersonId) {
        this.wwPersonId = wwPersonId;
    }

    /**
     * Gets the ww site id.
     * 
     * @return the ww site id
     */
    public String getWwSiteId() {
        return wwSiteId;
    }

    /**
     * Sets the ww site id.
     * 
     * @param wwSiteId
     *            the new ww site id
     */
    public void setWwSiteId(final String wwSiteId) {
        this.wwSiteId = wwSiteId;
    }

    /**
     * Gets the ww original name.
     * 
     * @return the ww original name
     */
    public String getWwOriginalName() {
        return wwOriginalName;
    }

    /**
     * Sets the ww original name.
     * 
     * @param wwOriginalName
     *            the new ww original name
     */
    public void setWwOriginalName(final String wwOriginalName) {
        this.wwOriginalName = wwOriginalName;
    }

    /**
     * Gets the ww remove date.
     * 
     * @return the ww remove date
     */
    public String getWwRemoveDate() {
        return wwRemoveDate;
    }

    /**
     * Sets the ww remove date.
     * 
     * @param wwRemoveDate
     *            the new ww remove date
     */
    public void setWwRemoveDate(final String wwRemoveDate) {
        this.wwRemoveDate = wwRemoveDate;
    }

    /**
     * Gets the ww remove time.
     * 
     * @return the ww remove time
     */
    public String getWwRemoveTime() {
        return wwRemoveTime;
    }

    /**
     * Sets the ww remove time.
     * 
     * @param wwRemoveTime
     *            the new ww remove time
     */
    public void setWwRemoveTime(final String wwRemoveTime) {
        this.wwRemoveTime = wwRemoveTime;
    }

    /**
     * Gets the ww household head flag.
     * 
     * @return the ww household head flag
     */
    public String getWwHouseholdHeadFlag() {
        return wwHouseholdHeadFlag;
    }

    /**
     * Sets the ww household head flag.
     * 
     * @param wwHouseholdHeadFlag
     *            the new ww household head flag
     */
    public void setWwHouseholdHeadFlag(final String wwHouseholdHeadFlag) {
        this.wwHouseholdHeadFlag = wwHouseholdHeadFlag;
    }

    /**
     * Gets the ww person role.
     * 
     * @return the ww person role
     */
    public String getWwPersonRole() {
        return wwPersonRole;
    }

    /**
     * Sets the ww person role.
     * 
     * @param wwPersonRole
     *            the new ww person role
     */
    public void setWwPersonRole(final String wwPersonRole) {
        this.wwPersonRole = wwPersonRole;
    }

    /**
     * Gets the ww household state.
     * 
     * @return the ww household state
     */
    public String getWwHouseholdState() {
        return wwHouseholdState;
    }

    /**
     * Sets the ww household state.
     * 
     * @param wwHouseholdState
     *            the new ww household state
     */
    public void setWwHouseholdState(final String wwHouseholdState) {
        this.wwHouseholdState = wwHouseholdState;
    }

    /**
     * Gets the ww education mark.
     * 
     * @return the ww education mark
     */
    public String getWwEducationMark() {
        return wwEducationMark;
    }

    /**
     * Sets the ww education mark.
     * 
     * @param wwEducationMark
     *            the new ww education mark
     */
    public void setWwEducationMark(final String wwEducationMark) {
        this.wwEducationMark = wwEducationMark;
    }

    /**
     * Gets the ww education name.
     * 
     * @return the ww education name
     */
    public String getWwEducationName() {
        return wwEducationName;
    }

    /**
     * Sets the ww education name.
     * 
     * @param wwEducationName
     *            the new ww education name
     */
    public void setWwEducationName(final String wwEducationName) {
        this.wwEducationName = wwEducationName;
    }

    /**
     * Gets the ww city county name.
     * 
     * @return the ww city county name
     */
    public String getWwCityCountyName() {
        return wwCityCountyName;
    }

    /**
     * Sets the ww city county name.
     * 
     * @param wwCityCountyName
     *            the new ww city county name
     */
    public void setWwCityCountyName(final String wwCityCountyName) {
        this.wwCityCountyName = wwCityCountyName;
    }

    /**
     * Gets the ww town name.
     * 
     * @return the ww town name
     */
    public String getWwTownName() {
        return wwTownName;
    }

    /**
     * Sets the ww town name.
     * 
     * @param wwTownName
     *            the new ww town name
     */
    public void setWwTownName(final String wwTownName) {
        this.wwTownName = wwTownName;
    }

    /**
     * Gets the ww outlive case flag.
     * 
     * @return the ww outlive case flag
     */
    public String getWwOutliveCaseFlag() {
        return wwOutliveCaseFlag;
    }

    /**
     * Sets the ww outlive case flag.
     * 
     * @param wwOutliveCaseFlag
     *            the new ww outlive case flag
     */
    public void setWwOutliveCaseFlag(final String wwOutliveCaseFlag) {
        this.wwOutliveCaseFlag = wwOutliveCaseFlag;
    }

    /**
     * Gets the ww marriage code.
     * 
     * @return the ww marriage code
     */
    public String getWwMarriageCode() {
        return wwMarriageCode;
    }

    /**
     * Sets the ww marriage code.
     * 
     * @param wwMarriageCode
     *            the new ww marriage code
     */
    public void setWwMarriageCode(final String wwMarriageCode) {
        this.wwMarriageCode = wwMarriageCode;
    }

    /**
     * Gets the ww resident no.
     * 
     * @return the ww resident no
     */
    public String getWwResidentNo() {
        return wwResidentNo;
    }

    /**
     * Sets the ww resident no.
     * 
     * @param wwResidentNo
     *            the new ww resident no
     */
    public void setWwResidentNo(final String wwResidentNo) {
        this.wwResidentNo = wwResidentNo;
    }

    /**
     * Gets the ww passport id.
     * 
     * @return the ww passport id
     */
    public String getWwPassportId() {
        return wwPassportId;
    }

    /**
     * Sets the ww passport id.
     * 
     * @param wwPassportId
     *            the new ww passport id
     */
    public void setWwPassportId(final String wwPassportId) {
        this.wwPassportId = wwPassportId;
    }

    /**
     * Gets the ww other id.
     * 
     * @return the ww other id
     */
    public String getWwOtherId() {
        return wwOtherId;
    }

    /**
     * Sets the ww other id.
     * 
     * @param wwOtherId
     *            the new ww other id
     */
    public void setWwOtherId(final String wwOtherId) {
        this.wwOtherId = wwOtherId;
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
     * Gets the target person flag.
     * 
     * @return the target person flag
     */
    public String getTargetPersonFlag() {
        return targetPersonFlag;
    }

    /**
     * Sets the target person flag.
     * 
     * @param targetPersonFlag
     *            the new target person flag
     */
    public void setTargetPersonFlag(final String targetPersonFlag) {
        this.targetPersonFlag = targetPersonFlag;
    }

    /**
     * Gets the non target person.
     * 
     * @return the non target person
     */
    public String getNonTargetPerson() {
        return nonTargetPerson;
    }

    /**
     * Sets the non target person.
     * 
     * @param nonTargetPerson
     *            the new non target person
     */
    public void setNonTargetPerson(final String nonTargetPerson) {
        this.nonTargetPerson = nonTargetPerson;
    }

    /**
     * Gets the before work.
     * 
     * @return the before work
     */
    public String getBeforeWork() {
        return beforeWork;
    }

    /**
     * Sets the before work.
     * 
     * @param beforeWork
     *            the new before work
     */
    public void setBeforeWork(final String beforeWork) {
        this.beforeWork = beforeWork;
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
     * Gets the other del reason.
     * 
     * @return the other del reason
     */
    public String getOtherDelReason() {
        return otherDelReason;
    }

    /**
     * Sets the other del reason.
     * 
     * @param otherDelReason
     *            the new other del reason
     */
    public void setOtherDelReason(final String otherDelReason) {
        this.otherDelReason = otherDelReason;
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
     * Gets the mrg apply date.
     * 
     * @return the mrg apply date
     */
    public String getMrgApplyDate() {
        return mrgApplyDate;
    }

    /**
     * Sets the mrg apply date.
     * 
     * @param mrgApplyDate
     *            the new mrg apply date
     */
    public void setMrgApplyDate(final String mrgApplyDate) {
        this.mrgApplyDate = mrgApplyDate;
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
     * Gets the fine overduerule mark.
     * 
     * @return the fine overduerule mark
     */
    public String getFineOverdueruleMark() {
        return fineOverdueruleMark;
    }

    /**
     * Sets the fine overduerule mark.
     * 
     * @param fineOverdueruleMark
     *            the new fine overduerule mark
     */
    public void setFineOverdueruleMark(final String fineOverdueruleMark) {
        this.fineOverdueruleMark = fineOverdueruleMark;
    }

    /**
     * Gets the fine money.
     * 
     * @return the fine money
     */
    public String getFineMoney() {
        return fineMoney;
    }

    /**
     * Sets the fine money.
     * 
     * @param fineMoney
     *            the new fine money
     */
    public void setFineMoney(final String fineMoney) {
        this.fineMoney = fineMoney;
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
     * Gets the mrg xcd f001 mrl map.
     * 
     * @return the mrg xcd f001 mrl map
     */
    public Map<String, XCDF001MRL> getMrgXCDF001MRLMap() {
        return mrgXCDF001MRLMap;
    }

    /**
     * Sets the mrg xcd f001 mrl map.
     * 
     * @param mrgXCDF001MRLMap
     *            the mrg xcd f001 mrl map
     */
    public void setMrgXCDF001MRLMap(final Map<String, XCDF001MRL> mrgXCDF001MRLMap) {
        this.mrgXCDF001MRLMap = mrgXCDF001MRLMap;
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
     * Gets the xldfy0d1m list.
     * 
     * @return the xldfy0d1m list
     */
    public List<XLDFY0D1M> getXldfy0d1mList() {
        return xldfy0d1mList;
    }

    /**
     * Sets the xldfy0d1m list.
     * 
     * @param xldfy0d1mList
     *            the new xldfy0d1m list
     */
    public void setXldfy0d1mList(final List<XLDFY0D1M> xldfy0d1mList) {
        this.xldfy0d1mList = xldfy0d1mList;
    }

    /**
     * Gets the xldfy0d1h list.
     * 
     * @return the xldfy0d1h list
     */
    public List<XLDFY0D1M> getXldfy0d1hList() {
        return xldfy0d1hList;
    }

    /**
     * Sets the xldfy0d1h list.
     * 
     * @param xldfy0d1hList
     *            the new xldfy0d1h list
     */
    public void setXldfy0d1hList(final List<XLDFY0D1M> xldfy0d1hList) {
        this.xldfy0d1hList = xldfy0d1hList;
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
     * Gets the flag get spouse data hw flag.
     * 
     * @return the flag get spouse data hw flag
     */
    public String getFlagGetSpouseDataHWFlag() {
        return flagGetSpouseDataHWFlag;
    }

    /**
     * Sets the flag get spouse data hw flag.
     * 
     * @param flagGetSpouseDataHWFlag
     *            the new flag get spouse data hw flag
     */
    public void setFlagGetSpouseDataHWFlag(final String flagGetSpouseDataHWFlag) {
        this.flagGetSpouseDataHWFlag = flagGetSpouseDataHWFlag;
    }

    /**
     * Gets the flag create xldf person data hw flag.
     * 
     * @return the flag create xldf person data hw flag
     */
    public String getFlagCreateXLDFPersonDataHWFlag() {
        return flagCreateXLDFPersonDataHWFlag;
    }

    /**
     * Sets the flag create xldf person data hw flag.
     * 
     * @param flagCreateXLDFPersonDataHWFlag
     *            the new flag create xldf person data hw flag
     */
    public void setFlagCreateXLDFPersonDataHWFlag(final String flagCreateXLDFPersonDataHWFlag) {
        this.flagCreateXLDFPersonDataHWFlag = flagCreateXLDFPersonDataHWFlag;
    }

    /**
     * Gets the flag create xldf m02 mhw flag.
     * 
     * @return the flag create xldf m02 mhw flag
     */
    public String getFlagCreateXLDFM02MHWFlag() {
        return flagCreateXLDFM02MHWFlag;
    }

    /**
     * Sets the flag create xldf m02 mhw flag.
     * 
     * @param flagCreateXLDFM02MHWFlag
     *            the new flag create xldf m02 mhw flag
     */
    public void setFlagCreateXLDFM02MHWFlag(final String flagCreateXLDFM02MHWFlag) {
        this.flagCreateXLDFM02MHWFlag = flagCreateXLDFM02MHWFlag;
    }

    /**
     * Gets the flag create xcd f001 mrlhw flag.
     * 
     * @return the flag create xcd f001 mrlhw flag
     */
    public String getFlagCreateXCDF001MRLHWFlag() {
        return flagCreateXCDF001MRLHWFlag;
    }

    /**
     * Sets the flag create xcd f001 mrlhw flag.
     * 
     * @param flagCreateXCDF001MRLHWFlag
     *            the new flag create xcd f001 mrlhw flag
     */
    public void setFlagCreateXCDF001MRLHWFlag(final String flagCreateXCDF001MRLHWFlag) {
        this.flagCreateXCDF001MRLHWFlag = flagCreateXCDF001MRLHWFlag;
    }

    /**
     * Gets the flag create xldf m10 m s0 d1 hw flag.
     * 
     * @return the flag create xldf m10 m s0 d1 hw flag
     */
    public String getFlagCreateXLDFM10MS0D1HWFlag() {
        return flagCreateXLDFM10MS0D1HWFlag;
    }

    /**
     * Sets the flag create xldf m10 m s0 d1 hw flag.
     * 
     * @param flagCreateXLDFM10MS0D1HWFlag
     *            the new flag create xldf m10 m s0 d1 hw flag
     */
    public void setFlagCreateXLDFM10MS0D1HWFlag(final String flagCreateXLDFM10MS0D1HWFlag) {
        this.flagCreateXLDFM10MS0D1HWFlag = flagCreateXLDFM10MS0D1HWFlag;
    }

    /**
     * Gets the flag create xldf m10 m r0 d1 hw flag.
     * 
     * @return the flag create xldf m10 m r0 d1 hw flag
     */
    public String getFlagCreateXLDFM10MR0D1HWFlag() {
        return flagCreateXLDFM10MR0D1HWFlag;
    }

    /**
     * Sets the flag create xldf m10 m r0 d1 hw flag.
     * 
     * @param flagCreateXLDFM10MR0D1HWFlag
     *            the new flag create xldf m10 m r0 d1 hw flag
     */
    public void setFlagCreateXLDFM10MR0D1HWFlag(final String flagCreateXLDFM10MR0D1HWFlag) {
        this.flagCreateXLDFM10MR0D1HWFlag = flagCreateXLDFM10MR0D1HWFlag;
    }

    /**
     * Gets the flag create xldf s0 d1 hw flag.
     * 
     * @return the flag create xldf s0 d1 hw flag
     */
    public String getFlagCreateXLDFS0D1HWFlag() {
        return flagCreateXLDFS0D1HWFlag;
    }

    /**
     * Sets the flag create xldf s0 d1 hw flag.
     * 
     * @param flagCreateXLDFS0D1HWFlag
     *            the new flag create xldf s0 d1 hw flag
     */
    public void setFlagCreateXLDFS0D1HWFlag(final String flagCreateXLDFS0D1HWFlag) {
        this.flagCreateXLDFS0D1HWFlag = flagCreateXLDFS0D1HWFlag;
    }

    /**
     * Gets the flag create xld f008 shw flag.
     * 
     * @return the flag create xld f008 shw flag
     */
    public String getFlagCreateXLDF008SHWFlag() {
        return flagCreateXLDF008SHWFlag;
    }

    /**
     * Sets the flag create xld f008 shw flag.
     * 
     * @param flagCreateXLDF008SHWFlag
     *            the new flag create xld f008 shw flag
     */
    public void setFlagCreateXLDF008SHWFlag(final String flagCreateXLDF008SHWFlag) {
        this.flagCreateXLDF008SHWFlag = flagCreateXLDF008SHWFlag;
    }

    /**
     * Gets the flag create xld f088 thw flag.
     * 
     * @return the flag create xld f088 thw flag
     */
    public String getFlagCreateXLDF088THWFlag() {
        return flagCreateXLDF088THWFlag;
    }

    /**
     * Sets the flag create xld f088 thw flag.
     * 
     * @param flagCreateXLDF088THWFlag
     *            the new flag create xld f088 thw flag
     */
    public void setFlagCreateXLDF088THWFlag(final String flagCreateXLDF088THWFlag) {
        this.flagCreateXLDF088THWFlag = flagCreateXLDF088THWFlag;
    }

    /**
     * Gets the flag create xldf r0 d1 hw flag.
     * 
     * @return the flag create xldf r0 d1 hw flag
     */
    public String getFlagCreateXLDFR0D1HWFlag() {
        return flagCreateXLDFR0D1HWFlag;
    }

    /**
     * Sets the flag create xldf r0 d1 hw flag.
     * 
     * @param flagCreateXLDFR0D1HWFlag
     *            the new flag create xldf r0 d1 hw flag
     */
    public void setFlagCreateXLDFR0D1HWFlag(final String flagCreateXLDFR0D1HWFlag) {
        this.flagCreateXLDFR0D1HWFlag = flagCreateXLDFR0D1HWFlag;
    }

    /**
     * Gets the flag create xld f009 shw flag.
     * 
     * @return the flag create xld f009 shw flag
     */
    public String getFlagCreateXLDF009SHWFlag() {
        return flagCreateXLDF009SHWFlag;
    }

    /**
     * Sets the flag create xld f009 shw flag.
     * 
     * @param flagCreateXLDF009SHWFlag
     *            the new flag create xld f009 shw flag
     */
    public void setFlagCreateXLDF009SHWFlag(final String flagCreateXLDF009SHWFlag) {
        this.flagCreateXLDF009SHWFlag = flagCreateXLDF009SHWFlag;
    }

    /**
     * Gets the flag create xld f016 shw flag.
     * 
     * @return the flag create xld f016 shw flag
     */
    public String getFlagCreateXLDF016SHWFlag() {
        return flagCreateXLDF016SHWFlag;
    }

    /**
     * Sets the flag create xld f016 shw flag.
     * 
     * @param flagCreateXLDF016SHWFlag
     *            the new flag create xld f016 shw flag
     */
    public void setFlagCreateXLDF016SHWFlag(final String flagCreateXLDF016SHWFlag) {
        this.flagCreateXLDF016SHWFlag = flagCreateXLDF016SHWFlag;
    }

    /**
     * Gets the hh org education mark.
     * 
     * @return the hh org education mark
     */
    public String getHhOrgEducationMark() {
        return hhOrgEducationMark;
    }

    /**
     * Sets the hh org education mark.
     * 
     * @param hhOrgEducationMark
     *            the new hh org education mark
     */
    public void setHhOrgEducationMark(final String hhOrgEducationMark) {
        this.hhOrgEducationMark = hhOrgEducationMark;
    }

    /**
     * Gets the ww org education mark.
     * 
     * @return the ww org education mark
     */
    public String getWwOrgEducationMark() {
        return wwOrgEducationMark;
    }

    /**
     * Sets the ww org education mark.
     * 
     * @param wwOrgEducationMark
     *            the new ww org education mark
     */
    public void setWwOrgEducationMark(final String wwOrgEducationMark) {
        this.wwOrgEducationMark = wwOrgEducationMark;
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
     * Gets the hh now state code.
     * 
     * @return the hh now state code
     */
    public String getHhNowStateCode() {
        return hhNowStateCode;
    }

    /**
     * Sets the hh now state code.
     * 
     * @param hhNowStateCode
     *            the new hh now state code
     */
    public void setHhNowStateCode(final String hhNowStateCode) {
        this.hhNowStateCode = hhNowStateCode;
    }

    /**
     * Gets the ww now state code.
     * 
     * @return the ww now state code
     */
    public String getWwNowStateCode() {
        return wwNowStateCode;
    }

    /**
     * Sets the ww now state code.
     * 
     * @param wwNowStateCode
     *            the new ww now state code
     */
    public void setWwNowStateCode(final String wwNowStateCode) {
        this.wwNowStateCode = wwNowStateCode;
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

}

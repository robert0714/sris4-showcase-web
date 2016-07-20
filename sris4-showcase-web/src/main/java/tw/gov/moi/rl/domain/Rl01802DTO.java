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
import tw.gov.moi.rl.component.dto.XLDFDomainObject;
import tw.gov.moi.rl.component.xldf.dto.XCDF001MRL;
import tw.gov.moi.rl.component.xldf.dto.XLDF087T;
import tw.gov.moi.rl.component.xldf.dto.XLDF088T;
import tw.gov.moi.rl.component.xldf.dto.XLDFM10M;
import tw.gov.moi.rl.component.xldf.dto.XLDFY091M;
import tw.gov.moi.rl.domain.xldf.XLDFHouseholdDataDomainObject;
import tw.gov.moi.rl.domain.xldf.XLDFHouseholdNoteDomainObject;
import tw.gov.moi.rl.domain.xldf.XLDFPersonDataDomainObject;
import tw.gov.moi.rl.domain.xldf.XLDFPersonNoteDomainObject;

/**
 * 離婚廢止登記DTO.
 * 
 * @author josh
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Rl01802DTO", propOrder = { "transactionId", "acceptSiteId", "userId", "initTime",
        "acceptAdminOfficeCode", "acceptAreaCode", "xldfy091mList", "hhAttorneyFlag", "wwAttorneyFlag",
        "householdNoteList", "personNoteList", "personNoteDetailList", "fineList", "warningMessgeList", "apply1",
        "apply2", "delegated", "finePerson", "hhMrgStatusBCode", "hhAttorneyCode", "hhPersonId", "hhSiteId",
        "hhNowStateCode", "hhOrgEducationMark", "wwPersonId", "wwSiteId", "wwMrgStatusBCode", "wwAttorneyCode",
        "wwNowStateCode", "wwOrgEducationMark", "mrgStatusFlag", "hhMainPersonData", "hhMainForeignPersonDTO",
        "hhMainForeignRoleDTO", "husbandHouseholdData", "husbandHPersonData", "wifeHouseholdData", "wifeHPersonData",
        "wwMainPersonData", "wwMainForeignPersonDTO", "wwMainForeignRoleDTO", "fineOverdueruleMark", "feeAmount",
        "acceptRegistrarName", "acceptRegistrarId", "receiptId", "feeCancelFlag", "applyCancelFlag", "applyCancelDate",
        "hhOutliveCaseFlag", "wwOutliveCaseFlag", "registerContent", "needFineFlag", "removeFeeReason", "beforeWork",
        "delReason", "otherDelReason", "delYyymmdd", "mrgApplyDate", "delReasonName", "hhEducationName",
        "hhCityCountyName", "hhTownName", "hhOrgMarriageCode", "wwEducationName", "wwCityCountyName", "wwTownName",
        "wwOrgMarriageCode", "hhHosueholdHeadFlag", "hhPersonRole", "hhHouseholdState", "wwHosueholdHeadFlag",
        "wwPersonRole", "wwHouseholdState", "enforcedFlag", "enforcedApplicant", "targetPersonFlag", "nonTargetPerson",
        "hhRemoveDate", "hhRemoveTime", "wwRemoveDate", "wwRemoveTime", "registerDate", "registerTime", "applyDate",
        "certificateList", "otherCertificate", "openingOperationDTO", "flagGetSpouseDataHWFlag",
        "flagCreateXLDFPersonDataHWFlag", "applySequenceId", "lawDate", "operateDate", "m10mList", "xldf087tList",
        "xldf088tList", "viewM10m", "viewPostiveApplication", "viewXldf087t", "viewXldf088t", "selectedM10m",
        "selected87t", "selected88t", "selectedPostiveApplication", "selectedSpousePostiveApplication", "spouseName",
        "spouseBirthYyymmdd", "delRLDF087TMap", "delRLDF088TMap", "checkFine", "doM10MCheckFlag", "doFineCheckFlag",
        "deleteFineDTOFlag", "previousDoFineCheckFlag", "previousFineEventDate", "fineFreeFlag", "doFineCheckFlagOpen",
        "fineDTO", "fineSerialNumber", "fineEventDate", "applyCode", "otherCertificateFlag",
        "flagCreateXLDFM10MS091HWFlag", "flagCreateXLDFM10MR091HWFlag", "flagCreateXLDF008SHWFlag",
        "flagCreateXLDFS091HWFlag", "flagCreateXLDFR091HWFlag", "flagCreateXLDF009SHWFlag", "mrgXCDF001MRLMap",
        "initSuccess", "activeIndex", "foreignPerson", "lockMode" })
@XmlRootElement(name = "Rl01802DTO")
public class Rl01802DTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = -4222450748995865352L;

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

    /** 個人記事欄位化-現戶物件清單. */
    @XmlElement(name = "Xldfy091mList", required = true)
    @FieldName("個人記事欄位化-現戶物件清單")
    private List<XLDFY091M> xldfy091mList = new ArrayList<XLDFY091M>();

    /** 夫-法定代理人同意-旗標. */
    @XmlElement(name = "HhAttorneyFlag", required = true)
    @FieldName("夫-法定代理人同意")
    private String hhAttorneyFlag;

    /** 妻-法定代理人同意-旗標. */
    @XmlElement(name = "WwAttorneyFlag", required = true)
    @FieldName("妻-法定代理人同意-旗標")
    private String wwAttorneyFlag;

    /** 清單【全戶記事清單】. */
    @XmlElement(name = "HouseholdNoteList", required = true)
    @FieldName(" 清單【全戶記事清單】")
    private List<XLDFHouseholdNoteDomainObject> householdNoteList = new ArrayList<XLDFHouseholdNoteDomainObject>();

    /** 清單【個人記事清單】. */
    @XmlElement(name = "personNoteList", required = true)
    @FieldName("清單【個人記事清單】")
    private List<XLDFPersonNoteDomainObject> personNoteList = new ArrayList<XLDFPersonNoteDomainObject>();

    /** 個人記事欄位化清單. */
    @XmlElement(name = "PersonNoteDetailList", required = true)
    @FieldName("個人記事欄位化清單")
    private List<XLDFY091M> personNoteDetailList = new ArrayList<XLDFY091M>();

    /** 清單【作業罰鍰清單】. */
    @XmlElement(name = "FineList", required = true)
    @FieldName("清單【作業罰鍰清單】")
    private List<XLDFOperationFineDTO> fineList = new ArrayList<XLDFOperationFineDTO>();

    /** 警告訊息清單. */
    @XmlElement(name = "WarningMessgeList", required = true)
    @FieldName("警告訊息清單 ")
    private List<RlWarningMessage> warningMessgeList = new ArrayList<RlWarningMessage>();

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

    /** 受處分人. */
    @XmlElement(name = "FinePerson", required = true)
    @FieldName("受處分人")
    private XLDFApplicantDataDTO finePerson = new XLDFApplicantDataDTO();

    /** 夫-婚前婚姻狀況代碼. */
    @XmlElement(name = "HhMrgStatusBCode", required = true)
    @FieldName("夫-婚前婚姻狀況代碼")
    private String hhMrgStatusBCode;

    /** 夫-當事人是否有民法1049條之情事代碼. */
    @XmlElement(name = "HhAttorneyCode", required = true)
    @FieldName("夫-當事人是否有民法1049條之情事代碼")
    private String hhAttorneyCode;

    /** (夫)統號. */
    @XmlElement(name = "HhPersonId", required = true)
    @FieldName("(夫)統號")
    private String hhPersonId;

    /** (夫)作業點代碼. */
    @XmlElement(name = "HhSiteId", required = true)
    @FieldName("(夫)作業點代碼")
    private String hhSiteId;

    /** (夫)戶籍現況. */
    @XmlElement(name = "HhNowStateCode", required = true)
    @FieldName("(夫)戶籍現況")
    private String hhNowStateCode;

    /** (夫)原教育程度註記. */
    @XmlElement(name = "HhOrgEducationMark", required = true)
    @FieldName("(夫)原教育程度註記")
    private String hhOrgEducationMark;

    /** (妻)統號. */
    @XmlElement(name = "WwPersonId", required = true)
    @FieldName("(妻)統號")
    private String wwPersonId;

    /** (妻)作業點代碼. */
    @XmlElement(name = "WwSiteId", required = true)
    @FieldName("(妻)作業點代碼")
    private String wwSiteId;

    /** 妻-婚前婚姻狀況代碼. */
    @XmlElement(name = "WwMrgStatusBCode", required = true)
    @FieldName("妻-婚前婚姻狀況代碼")
    private String wwMrgStatusBCode;

    /** 妻-當事人是否有民法1049條之情事代碼. */
    @XmlElement(name = "WwAttorneyCode", required = true)
    @FieldName("妻-當事人是否有民法1049條之情事代碼")
    private String wwAttorneyCode;

    /** (妻)戶籍現況. */
    @XmlElement(name = "HhNowStateCode", required = true)
    @FieldName("(妻)戶籍現況")
    private String wwNowStateCode;

    /** (妻)原教育程度註記. */
    @XmlElement(name = "WwOrgEducationMark", required = true)
    @FieldName("(妻)原教育程度註記")
    private String wwOrgEducationMark;

    /** 婚姻狀況Flag. */
    @XmlElement(name = "MrgStatusFlag", required = true)
    @FieldName("婚姻狀況Flag")
    private String mrgStatusFlag;

    /** (夫)個人基本資料. */
    @XmlElement(name = "HmainPersonData", required = true)
    @FieldName("(夫)個人基本資料")
    private XLDFPersonDataDomainObject hhMainPersonData;

    /** (夫)外籍者資料. */
    @XmlElement(name = "HhMainForeignPersonDTO", required = true)
    @FieldName("(夫)外籍者資料")
    private XLDFForeignPersonDTO hhMainForeignPersonDTO = new XLDFForeignPersonDTO();

    /** (夫)外籍者資料. */
    @XmlElement(name = "HhMainForeignRoleDTO", required = true)
    @FieldName("(夫)外籍者資料")
    private XLDFSimpleForeignRoleDTO hhMainForeignRoleDTO = new XLDFSimpleForeignRoleDTO(StringUtils.EMPTY,
            StringUtils.EMPTY, StringUtils.EMPTY);

    /** (夫)全戶基本資料. */
    @XmlElement(name = "HusbandHouseholdData", required = true)
    @FieldName("(夫)全戶基本資料")
    private XLDFHouseholdDataDomainObject husbandHouseholdData;

    /** (夫)戶長個人基本資料. */
    @XmlElement(name = "HusbandHPersonData", required = true)
    @FieldName("(夫)戶長個人基本資料")
    private XLDFPersonDataDomainObject husbandHPersonData;

    /** (妻)全戶基本資料. */
    @XmlElement(name = "WifeHouseholdData", required = true)
    @FieldName("(妻)全戶基本資料")
    private XLDFHouseholdDataDomainObject wifeHouseholdData;

    /** (妻)戶長個人基本資料. */
    @XmlElement(name = "WifeHPersonData", required = true)
    @FieldName("(妻)戶長個人基本資料")
    private XLDFPersonDataDomainObject wifeHPersonData;

    /** (妻)個人基本資料. */
    @XmlElement(name = "WwMainPersonData", required = true)
    @FieldName("(妻)個人基本資料 ")
    private XLDFPersonDataDomainObject wwMainPersonData;

    /** (妻)外籍者資料. */
    @XmlElement(name = "wwMainForeignPersonDTO", required = true)
    @FieldName("(妻)外籍者資料")
    private XLDFForeignPersonDTO wwMainForeignPersonDTO = new XLDFForeignPersonDTO();

    /** (妻)外籍者資料. */
    @XmlElement(name = "WwMainForeignRoleDTO", required = true)
    @FieldName("(妻)外籍者資料")
    private XLDFSimpleForeignRoleDTO wwMainForeignRoleDTO = new XLDFSimpleForeignRoleDTO(StringUtils.EMPTY,
            StringUtils.EMPTY, StringUtils.EMPTY);

    /** 戶籍罰鍰條款註記. */
    @XmlElement(name = "FineOverdueruleMark", required = true)
    @FieldName("戶籍罰鍰條款註記")
    private String fineOverdueruleMark;

    /** 戶籍罰鍰金鍰. */
    @XmlElement(name = "FeeAmount", required = true)
    @FieldName("戶籍罰鍰金鍰")
    private String feeAmount;

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
    @FieldName("收據號碼")
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

    /** 夫-非現住人口處理註記. */
    @XmlElement(name = "HhOutliveCaseFlag", required = true)
    @FieldName("夫-非現住人口處理註記")
    private String hhOutliveCaseFlag;

    /** 妻-非現住人口處理註記. */
    @XmlElement(name = "WwOutliveCaseFlag", required = true)
    @FieldName("妻-非現住人口處理註記")
    private String wwOutliveCaseFlag;

    /** 備註. */
    @XmlElement(name = "RegisterContent", required = true)
    @FieldName("備註")
    private String registerContent;

    /** 須進行罰鍰處理. */
    @XmlElement(name = "NeedFineFlag", required = true)
    @FieldName("須進行罰鍰處理")
    private String needFineFlag;

    /** 免罰原因. */
    @XmlElement(name = "RemoveFeeReason", required = true)
    @FieldName("免罰原因")
    private String removeFeeReason;

    /** 原登記事項. */
    @XmlElement(name = "BeforeWork", required = true)
    @FieldName("原登記事項")
    private String beforeWork;

    /** 撤銷原因. */
    @XmlElement(name = "DelReason", required = true)
    @FieldName("撤銷原因")
    private String delReason;

    /** 其他撤銷原因. */
    @XmlElement(name = "OtherDelReason", required = true)
    @FieldName("其他撤銷原因")
    private String otherDelReason;

    /** 離婚撤銷日期. */
    @XmlElement(name = "DelYyymmdd", required = true)
    @FieldName("離婚撤銷日期 ")
    private String delYyymmdd;

    /** 離婚登記申請日期. */
    @XmlElement(name = "MrgApplyDate", required = true)
    @FieldName("離婚登記申請日期 ")
    private String mrgApplyDate;

    /** 離婚撤銷原因名稱. */
    @XmlElement(name = "DelReasonName", required = true)
    @FieldName("離婚撤銷原因名稱")
    private String delReasonName;

    /** 夫-教育程度. */
    @XmlElement(name = "HhEducationName", required = true)
    @FieldName("夫-教育程度")
    private String hhEducationName;

    /** 夫-省市縣市名稱. */
    @XmlElement(name = "HhCityCountyName", required = true)
    @FieldName("夫-省市縣市名稱")
    private String hhCityCountyName;

    /** 夫-鄉鎮市區名稱. */
    @XmlElement(name = "HhTownName", required = true)
    @FieldName("夫-鄉鎮市區名稱")
    private String hhTownName;

    /** 夫-原婚姻狀況. */
    @XmlElement(name = "HhOrgMarriageCode", required = true)
    @FieldName("夫-原婚姻狀況")
    private String hhOrgMarriageCode;

    /** 妻-教育程度. */
    @XmlElement(name = "WwEducationName", required = true)
    @FieldName("妻-教育程度")
    private String wwEducationName;

    /** 妻-省市縣市名稱. */
    @XmlElement(name = "WwCityCountyName", required = true)
    @FieldName("妻-省市縣市名稱")
    private String wwCityCountyName;

    /** 妻-鄉鎮市區名稱. */
    @XmlElement(name = "WwTownName", required = true)
    @FieldName("妻-鄉鎮市區名稱")
    private String wwTownName;

    /** 妻-原婚姻狀況. */
    @XmlElement(name = "WwOrgMarriageCode", required = true)
    @FieldName("妻-原婚姻狀況")
    private String wwOrgMarriageCode;

    /** 當事人為戶長-旗標. */
    @XmlElement(name = "HhHosueholdHeadFlag", required = true)
    @FieldName("當事人為戶長-旗標")
    private String hhHosueholdHeadFlag;

    /** 離婚撤銷者身分（1:統號第一碼為$「無戶籍外籍者」、2:國人、3:統號第三碼為6、7、8「外國人有統號」）. */
    @XmlElement(name = "HhPersonRole", required = true)
    @FieldName("離婚撤銷者身分（1:統號第一碼為$「無戶籍外籍者」、2:國人、3:統號第三碼為6、7、8「外國人有統號」）")
    private String hhPersonRole;

    /** 戶籍簿頁狀態（M現戶）、（H除戶）. */
    @XmlElement(name = "HhHouseholdState", required = true)
    @FieldName("戶籍簿頁狀態（M現戶）、（H除戶）")
    private String hhHouseholdState;

    /** 當事人為戶長-旗標. */
    @XmlElement(name = "WwHosueholdHeadFlag", required = true)
    @FieldName("當事人為戶長-旗標")
    private String wwHosueholdHeadFlag;

    /** 離婚撤銷者身分（1:統號第一碼為$「無戶籍外籍者」、2:國人、3:統號第三碼為6、7、8「外國人有統號」）. */
    @XmlElement(name = "WwPersonRole", required = true)
    @FieldName("離婚撤銷者身分（1:統號第一碼為$「無戶籍外籍者」、2:國人、3:統號第三碼為6、7、8「外國人有統號」）")
    private String wwPersonRole;

    /** 戶籍簿頁狀態（M現戶）、（H除戶）. */
    @XmlElement(name = "WwHouseholdState", required = true)
    @FieldName("戶籍簿頁狀態（M現戶）、（H除戶）")
    private String wwHouseholdState;

    /** 逕為登記旗標 Y:是、N:否(預設). */
    @XmlElement(name = "EnforcedFlag", required = true)
    @FieldName("逕為登記旗標 Y:是、N:否(預設)")
    boolean enforcedFlag;

    /** 逕為登記申請人. */
    @XmlElement(name = "EnforcedApplicant", required = true)
    @FieldName("逕為登記申請人")
    private XldfefaplcType enforcedApplicant;

    /** 大簿當事人註記 h表示夫 w表示妻. */
    @XmlElement(name = "TargetPersonFlag", required = true)
    @FieldName("大簿當事人註記 h表示夫 w表示妻")
    private String targetPersonFlag;

    /** 非大簿當事人註記(h:夫、 w:妻). */
    @XmlElement(name = "NonTargetPerson", required = true)
    @FieldName("非大簿當事人註記(h:夫、 w:妻)")
    private String nonTargetPerson;

    /** 夫-除戶日期. */
    @XmlElement(name = "HhRemoveDate", required = true)
    @FieldName("夫-除戶日期")
    private String hhRemoveDate;

    /** 夫-除戶時間. */
    @XmlElement(name = "HhRemoveTime", required = true)
    @FieldName("夫-除戶時間")
    private String hhRemoveTime;

    /** 妻-除戶日期. */
    @XmlElement(name = "WwRemoveDate", required = true)
    @FieldName("妻-除戶日期")
    private String wwRemoveDate;

    /** 妻-除戶時間. */
    @XmlElement(name = "WwRemoveTime", required = true)
    @FieldName("妻-除戶時間")
    private String wwRemoveTime;

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

    /** 申請資料【附繳證件】. */
    @XmlElement(name = "CertificateList", required = true)
    @FieldName("申請資料附繳證件")
    private List<String> certificateList = new ArrayList<String>();

    /** 其它附繳證件. */
    @XmlElement(name = "OtherCertificate", required = true)
    @FieldName("其它附繳證件")
    private String otherCertificate;

    /** 大簿共用元件. */
    @XmlElement(name = "OpeningOperationDTO", required = true)
    @FieldName("大簿共用元件")
    private OpeningOperationDTO openingOperationDTO;

    /** flagGetSpouseDataHWFlag. */
    @XmlElement(name = "FlagGetSpouseDataHWFlag")
    @FieldName("FlagGetSpouseDataHWFlag")
    private String flagGetSpouseDataHWFlag;

    /** flagCreateXLDFPersonDataHWFlag. */
    @XmlElement(name = "FlagCreateXLDFPersonDataHWFlag", required = true)
    @FieldName("flagCreateXLDFPersonDataHWFlag")
    private String flagCreateXLDFPersonDataHWFlag;

    /** 作業順序編號. */
    @XmlElement(name = "ApplySequenceId", required = true)
    @FieldName("作業順序編號")
    private String applySequenceId;

    /** The law date. */
    @XmlElement(name = "LawDate", required = true)
    @FieldName("法定應申報日期")
    private String lawDate;

    /** The operate date. */
    @XmlElement(name = "OperateDate", required = true)
    @FieldName("系統日期")
    private String operateDate;

    /** The m10m list. */
    @XmlElement(name = "M10mList", required = true)
    @FieldName("擬撤銷之原登記申請書紀錄清單")
    private List<XLDFM10M> m10mList = new ArrayList<XLDFM10M>();

    /** The xldf087t list. */
    @XmlElement(name = "Xldf087tList", required = true)
    @FieldName("擬撤銷之登記婚前結婚證明書清單")
    private List<CancelDataObject> xldf087tList = new ArrayList<CancelDataObject>();

    /** 擬撤銷之結婚證明書清單. */
    @XmlElement(name = "Xldf088tList", required = true)
    @FieldName("擬撤銷之結婚證明書清單")
    private List<CancelDataObject> xldf088tList = new ArrayList<CancelDataObject>();

    /** The view m10m. */
    @XmlElement(name = "ViewM10m", required = true)
    @FieldName("檢視的擬撤銷之原登記申請書紀錄")
    private XLDFM10M viewM10m;

    /** The view postive application. */
    @XmlElement(name = "ViewPostiveApplication", required = true)
    @FieldName("檢視的擬撤銷之原登記申請書")
    private XLDFDomainObject viewPostiveApplication;

    /** 檢視的擬撤銷之登記婚前結婚證明書. */
    @XmlElement(name = "ViewXldf087t", required = true)
    @FieldName("檢視的擬撤銷之登記婚前結婚證明書")
    private CancelDataObject viewXldf087t;

    /** 檢視的擬撤銷之結婚證明書. */
    @XmlElement(name = "ViewXldf088t", required = true)
    @FieldName("檢視的擬撤銷之結婚證明書")
    private CancelDataObject viewXldf088t;

    /** The selected m10m. */
    @XmlElement(name = "SelectedM10m", required = true)
    @FieldName("選取的擬撤銷之原登記申請書紀錄")
    private XLDFM10M selectedM10m;

    /** The selected87t. */
    @XmlElement(name = "Selected87t", required = true)
    @FieldName("選取的擬撤銷之登記婚前結婚證明書資料")
    private XLDF087T selected87t;

    /** The selected88t. */
    @XmlElement(name = "Selected88t", required = true)
    @FieldName("選取的擬撤銷之結婚證明書資料")
    private XLDF088T selected88t;

    /** The selected postive application. */
    @XmlElement(name = "SelectedPostiveApplication", required = true)
    @FieldName("選取的擬撤銷之原登記申請書")
    private XLDFDomainObject selectedPostiveApplication;

    /** The selected spouse postive application. */
    @XmlElement(name = "SelectedSpousePostiveApplication", required = true)
    @FieldName("(配偶)選取的擬撤銷之原登記申請書")
    private XLDFDomainObject selectedSpousePostiveApplication;

    /** The spouse name. */
    @XmlElement(name = "SpouseName", required = true)
    @FieldName("擬撤銷之原登記申請書配偶姓名")
    private String spouseName;

    /** The spouse birth yyymmdd. */
    @XmlElement(name = "SpouseBirthYyymmdd", required = true)
    @FieldName("擬撤銷之原登記申請書配偶出生日期")
    private String spouseBirthYyymmdd;

    /** The del rld f087 t map. */
    @XmlElement(name = "離婚系列-統號-delRLDF087TMap物件MAP", required = true)
    @FieldName("離婚系列-統號-delRLDF087TMap物件MAP")
    private Map<String, XLDF087T> delRLDF087TMap = new HashMap<String, XLDF087T>();

    /** 結婚系列-統號-delRLDF088TMap物件MAP. */
    @XmlElement(name = "離婚系列-統號-delRLDF088TMap物件MAP", required = true)
    @FieldName("離婚系列-統號-delRLDF088TMap物件MAP")
    private Map<String, XLDF088T> delRLDF088TMap = new HashMap<String, XLDF088T>();

    /** The check fine. */
    @XmlElement(name = "CheckFine", required = true)
    @FieldName("進行逾期申報之罰鍰檢視")
    private boolean checkFine;

    /** 以上皆非(勾原登記申請書). */
    @XmlElement(name = "DoM10MCheckFlag", required = true)
    @FieldName("以上皆非(勾原登記申請書)")
    private boolean doM10MCheckFlag;

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

    /** 罰鍰裁處書識別序號. */
    @XmlElement(name = "fineSerialNumber")
    @FieldName("罰鍰裁處書識別序號")
    private String fineSerialNumber = StringUtils.EMPTY;

    /** 事件發生(確定)日期. */
    @XmlElement(name = "FineEventDate", required = true)
    @FieldName("事件發生(確定)日期")
    private String fineEventDate;

    /** 登記代碼. */
    @XmlElement(name = "ApplyCode")
    @FieldName("登記代碼")
    private String applyCode = RlConstant.STRING_ZERO_NINE_ONE;

    /** 旗標:其他附繳證件. */
    @XmlElement(name = "OtherCertificateFlag", required = true)
    @FieldName("旗標:其他附繳證件")
    private boolean otherCertificateFlag = false;

    /** 旗標:createxldfm10m flag(s091). */
    @XmlElement(name = "FlagCreateXLDFM10MS091HWFlag", required = true)
    @FieldName("旗標:createxldfm10m flag(s091)")
    private String flagCreateXLDFM10MS091HWFlag;

    /** 旗標:createxldfm10m flag(r091). */
    @XmlElement(name = "FlagCreateXLDFM10MR091HWFlag", required = true)
    @FieldName("旗標:createxldfm10m flag(r091)")
    private String flagCreateXLDFM10MR091HWFlag;

    /** 旗標:建立xldf008s flag. */
    @XmlElement(name = "FlagCreateXLDF008SHWFlag", required = true)
    @FieldName("旗標:建立xldf008s flag")
    private String flagCreateXLDF008SHWFlag;

    /** 旗標:建立xldfs091 flag. */
    @XmlElement(name = "FlagCreateXLDFS091HWFlag", required = true)
    @FieldName("旗標:建立xldfs091 flag")
    private String flagCreateXLDFS091HWFlag;

    /** 旗標:建立xldfr091 flag. */
    @XmlElement(name = "FlagCreateXLDFR091HWFlag", required = true)
    @FieldName("旗標:建立xldfr091 flag")
    private String flagCreateXLDFR091HWFlag;

    /** 旗標:建立xldf009 flag. */
    @XmlElement(name = "FlagCreateXLDF009SHWFlag", required = true)
    @FieldName("旗標:建立xldf009 flag")
    private String flagCreateXLDF009SHWFlag;

    /** 離婚系列-統號-XCDF001MRL物件MAP. */
    @XmlElement(name = "MrgXCDF001MRLMap", required = true)
    @FieldName("離婚系列-統號-XCDF001MRL物件MAP")
    private Map<String, XCDF001MRL> mrgXCDF001MRLMap = new HashMap<String, XCDF001MRL>();

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
     * Gets the hh hosuehold head flag.
     * 
     * @return the hh hosuehold head flag
     */
    public String getHhHosueholdHeadFlag() {
        return hhHosueholdHeadFlag;
    }

    /**
     * Sets the hh hosuehold head flag.
     * 
     * @param hhHosueholdHeadFlag
     *            the new hh hosuehold head flag
     */
    public void setHhHosueholdHeadFlag(final String hhHosueholdHeadFlag) {
        this.hhHosueholdHeadFlag = hhHosueholdHeadFlag;
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
     * Gets the ww hosuehold head flag.
     * 
     * @return the ww hosuehold head flag
     */
    public String getWwHosueholdHeadFlag() {
        return wwHosueholdHeadFlag;
    }

    /**
     * Sets the ww hosuehold head flag.
     * 
     * @param wwHosueholdHeadFlag
     *            the new ww hosuehold head flag
     */
    public void setWwHosueholdHeadFlag(final String wwHosueholdHeadFlag) {
        this.wwHosueholdHeadFlag = wwHosueholdHeadFlag;
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
     * Gets the hh main person data.
     * 
     * @return the hh main person data
     */
    public XLDFPersonDataDomainObject getHhMainPersonData() {
        return hhMainPersonData;
    }

    /**
     * Sets the hh main person data.
     * 
     * @param hhMainPersonData
     *            the new hh main person data
     */
    public void setHhMainPersonData(final XLDFPersonDataDomainObject hhMainPersonData) {
        this.hhMainPersonData = hhMainPersonData;
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
     * Gets the warning messge list.
     * 
     * @return the warning messge list
     */
    public List<RlWarningMessage> getWarningMessgeList() {
        return warningMessgeList;
    }

    /**
     * Sets the warning messge list.
     * 
     * @param warningMessgeList
     *            the new warning messge list
     */
    public void setWarningMessgeList(final List<RlWarningMessage> warningMessgeList) {
        this.warningMessgeList = warningMessgeList;
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
     * Checks if is enforced flag.
     * 
     * @return true, if is enforced flag
     */
    public boolean isEnforcedFlag() {
        return enforcedFlag;
    }

    /**
     * Sets the enforced flag.
     * 
     * @param enforcedFlag
     *            the new enforced flag
     */
    public void setEnforcedFlag(final boolean enforcedFlag) {
        this.enforcedFlag = enforcedFlag;
    }

    /**
     * Gets the person note detail list.
     * 
     * @return the person note detail list
     */
    public List<XLDFY091M> getPersonNoteDetailList() {
        return personNoteDetailList;
    }

    /**
     * Sets the person note detail list.
     * 
     * @param personNoteDetailList
     *            the new person note detail list
     */
    public void setPersonNoteDetailList(final List<XLDFY091M> personNoteDetailList) {
        this.personNoteDetailList = personNoteDetailList;
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
     * Gets the law date.
     * 
     * @return the law date
     */
    public String getLawDate() {
        return lawDate;
    }

    /**
     * Sets the law date.
     * 
     * @param lawDate
     *            the new law date
     */
    public void setLawDate(final String lawDate) {
        this.lawDate = lawDate;
    }

    /**
     * Checks if is check fine.
     * 
     * @return true, if is check fine
     */
    public boolean isCheckFine() {
        return checkFine;
    }

    /**
     * Sets the check fine.
     * 
     * @param checkFine
     *            the new check fine
     */
    public void setCheckFine(final boolean checkFine) {
        this.checkFine = checkFine;
    }

    /**
     * Gets the operate date.
     * 
     * @return the operate date
     */
    public String getOperateDate() {
        return operateDate;
    }

    /**
     * Sets the operate date.
     * 
     * @param operateDate
     *            the new operate date
     */
    public void setOperateDate(final String operateDate) {
        this.operateDate = operateDate;
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
     * Gets the hh mrg status b code.
     * 
     * @return the hh mrg status b code
     */
    public String getHhMrgStatusBCode() {
        return hhMrgStatusBCode;
    }

    /**
     * Sets the hh mrg status b code.
     * 
     * @param hhMrgStatusBCode
     *            the new hh mrg status b code
     */
    public void setHhMrgStatusBCode(final String hhMrgStatusBCode) {
        this.hhMrgStatusBCode = hhMrgStatusBCode;
    }

    /**
     * Gets the hh attorney code.
     * 
     * @return the hh attorney code
     */
    public String getHhAttorneyCode() {
        return hhAttorneyCode;
    }

    /**
     * Sets the hh attorney code.
     * 
     * @param hhAttorneyCode
     *            the new hh attorney code
     */
    public void setHhAttorneyCode(final String hhAttorneyCode) {
        this.hhAttorneyCode = hhAttorneyCode;
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
     * Gets the ww mrg status b code.
     * 
     * @return the ww mrg status b code
     */
    public String getWwMrgStatusBCode() {
        return wwMrgStatusBCode;
    }

    /**
     * Sets the ww mrg status b code.
     * 
     * @param wwMrgStatusBCode
     *            the new ww mrg status b code
     */
    public void setWwMrgStatusBCode(final String wwMrgStatusBCode) {
        this.wwMrgStatusBCode = wwMrgStatusBCode;
    }

    /**
     * Gets the ww attorney code.
     * 
     * @return the ww attorney code
     */
    public String getWwAttorneyCode() {
        return wwAttorneyCode;
    }

    /**
     * Sets the ww attorney code.
     * 
     * @param wwAttorneyCode
     *            the new ww attorney code
     */
    public void setWwAttorneyCode(final String wwAttorneyCode) {
        this.wwAttorneyCode = wwAttorneyCode;
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
     * Gets the mrg status flag.
     * 
     * @return the mrg status flag
     */
    public String getMrgStatusFlag() {
        return mrgStatusFlag;
    }

    /**
     * Sets the mrg status flag.
     * 
     * @param mrgStatusFlag
     *            the new mrg status flag
     */
    public void setMrgStatusFlag(final String mrgStatusFlag) {
        this.mrgStatusFlag = mrgStatusFlag;
    }

    /**
     * Gets the hh attorney flag.
     * 
     * @return the hh attorney flag
     */
    public String getHhAttorneyFlag() {
        return hhAttorneyFlag;
    }

    /**
     * Sets the hh attorney flag.
     * 
     * @param hhAttorneyFlag
     *            the new hh attorney flag
     */
    public void setHhAttorneyFlag(final String hhAttorneyFlag) {
        this.hhAttorneyFlag = hhAttorneyFlag;
    }

    /**
     * Gets the ww attorney flag.
     * 
     * @return the ww attorney flag
     */
    public String getWwAttorneyFlag() {
        return wwAttorneyFlag;
    }

    /**
     * Sets the ww attorney flag.
     * 
     * @param wwAttorneyFlag
     *            the new ww attorney flag
     */
    public void setWwAttorneyFlag(final String wwAttorneyFlag) {
        this.wwAttorneyFlag = wwAttorneyFlag;
    }

    /**
     * Gets the xldfy091m list.
     * 
     * @return the xldfy091m list
     */
    public List<XLDFY091M> getXldfy091mList() {
        return xldfy091mList;
    }

    /**
     * Sets the xldfy091m list.
     * 
     * @param xldfy091mList
     *            the new xldfy091m list
     */
    public void setXldfy091mList(final List<XLDFY091M> xldfy091mList) {
        this.xldfy091mList = xldfy091mList;
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
     * Gets the selected spouse postive application.
     * 
     * @return the selected spouse postive application
     */
    public XLDFDomainObject getSelectedSpousePostiveApplication() {
        return selectedSpousePostiveApplication;
    }

    /**
     * Sets the selected spouse postive application.
     * 
     * @param selectedSpousePostiveApplication
     *            the new selected spouse postive application
     */
    public void setSelectedSpousePostiveApplication(final XLDFDomainObject selectedSpousePostiveApplication) {
        this.selectedSpousePostiveApplication = selectedSpousePostiveApplication;
    }

    /**
     * Gets the spouse name.
     * 
     * @return the spouse name
     */
    public String getSpouseName() {
        return spouseName;
    }

    /**
     * Sets the spouse name.
     * 
     * @param spouseName
     *            the new spouse name
     */
    public void setSpouseName(final String spouseName) {
        this.spouseName = spouseName;
    }

    /**
     * Gets the spouse birth yyymmdd.
     * 
     * @return the spouse birth yyymmdd
     */
    public String getSpouseBirthYyymmdd() {
        return spouseBirthYyymmdd;
    }

    /**
     * Sets the spouse birth yyymmdd.
     * 
     * @param spouseBirthYyymmdd
     *            the new spouse birth yyymmdd
     */
    public void setSpouseBirthYyymmdd(final String spouseBirthYyymmdd) {
        this.spouseBirthYyymmdd = spouseBirthYyymmdd;
    }

    /**
     * Gets the xldf087t list.
     * 
     * @return the xldf087t list
     */
    public List<CancelDataObject> getXldf087tList() {
        return xldf087tList;
    }

    /**
     * Sets the xldf087t list.
     * 
     * @param xldf087tList
     *            the new xldf087t list
     */
    public void setXldf087tList(final List<CancelDataObject> xldf087tList) {
        this.xldf087tList = xldf087tList;
    }

    /**
     * Gets the xldf088t list.
     * 
     * @return the xldf088t list
     */
    public List<CancelDataObject> getXldf088tList() {
        return xldf088tList;
    }

    /**
     * Sets the xldf088t list.
     * 
     * @param xldf088tList
     *            the new xldf088t list
     */
    public void setXldf088tList(final List<CancelDataObject> xldf088tList) {
        this.xldf088tList = xldf088tList;
    }

    /**
     * Gets the view xldf087t.
     * 
     * @return the view xldf087t
     */
    public CancelDataObject getViewXldf087t() {
        return viewXldf087t;
    }

    /**
     * Sets the view xldf087t.
     * 
     * @param viewXldf087t
     *            the new view xldf087t
     */
    public void setViewXldf087t(final CancelDataObject viewXldf087t) {
        this.viewXldf087t = viewXldf087t;
    }

    /**
     * Gets the view xldf088t.
     * 
     * @return the view xldf088t
     */
    public CancelDataObject getViewXldf088t() {
        return viewXldf088t;
    }

    /**
     * Sets the view xldf088t.
     * 
     * @param viewXldf088t
     *            the new view xldf088t
     */
    public void setViewXldf088t(final CancelDataObject viewXldf088t) {
        this.viewXldf088t = viewXldf088t;
    }

    /**
     * Gets the selected87t.
     * 
     * @return the selected87t
     */
    public XLDF087T getSelected87t() {
        return selected87t;
    }

    /**
     * Sets the selected87t.
     * 
     * @param selected87t
     *            the new selected87t
     */
    public void setSelected87t(final XLDF087T selected87t) {
        this.selected87t = selected87t;
    }

    /**
     * Gets the selected88t.
     * 
     * @return the selected88t
     */
    public XLDF088T getSelected88t() {
        return selected88t;
    }

    /**
     * Sets the selected88t.
     * 
     * @param selected88t
     *            the new selected88t
     */
    public void setSelected88t(final XLDF088T selected88t) {
        this.selected88t = selected88t;
    }

    /**
     * Gets the del rld f087 t map.
     * 
     * @return the del rld f087 t map
     */
    public Map<String, XLDF087T> getDelRLDF087TMap() {
        return delRLDF087TMap;
    }

    /**
     * Sets the del rld f087 t map.
     * 
     * @param delRLDF087TMap
     *            the del rld f087 t map
     */
    public void setDelRLDF087TMap(final Map<String, XLDF087T> delRLDF087TMap) {
        this.delRLDF087TMap = delRLDF087TMap;
    }

    /**
     * Gets the del rld f088 t map.
     * 
     * @return the del rld f088 t map
     */
    public Map<String, XLDF088T> getDelRLDF088TMap() {
        return delRLDF088TMap;
    }

    /**
     * Sets the del rld f088 t map.
     * 
     * @param delRLDF088TMap
     *            the del rld f088 t map
     */
    public void setDelRLDF088TMap(final Map<String, XLDF088T> delRLDF088TMap) {
        this.delRLDF088TMap = delRLDF088TMap;
    }

    /**
     * Gets the hh main foreign person dto.
     * 
     * @return the hh main foreign person dto
     */
    public XLDFForeignPersonDTO getHhMainForeignPersonDTO() {
        return hhMainForeignPersonDTO;
    }

    /**
     * Sets the hh main foreign person dto.
     * 
     * @param hhMainForeignPersonDTO
     *            the new hh main foreign person dto
     */
    public void setHhMainForeignPersonDTO(final XLDFForeignPersonDTO hhMainForeignPersonDTO) {
        this.hhMainForeignPersonDTO = hhMainForeignPersonDTO;
    }

    /**
     * Gets the hh main foreign role dto.
     * 
     * @return the hh main foreign role dto
     */
    public XLDFSimpleForeignRoleDTO getHhMainForeignRoleDTO() {
        return hhMainForeignRoleDTO;
    }

    /**
     * Sets the hh main foreign role dto.
     * 
     * @param hhMainForeignRoleDTO
     *            the new hh main foreign role dto
     */
    public void setHhMainForeignRoleDTO(final XLDFSimpleForeignRoleDTO hhMainForeignRoleDTO) {
        this.hhMainForeignRoleDTO = hhMainForeignRoleDTO;
    }

    /**
     * Gets the ww main person data.
     * 
     * @return the ww main person data
     */
    public XLDFPersonDataDomainObject getWwMainPersonData() {
        return wwMainPersonData;
    }

    /**
     * Sets the ww main person data.
     * 
     * @param wwMainPersonData
     *            the new ww main person data
     */
    public void setWwMainPersonData(final XLDFPersonDataDomainObject wwMainPersonData) {
        this.wwMainPersonData = wwMainPersonData;
    }

    /**
     * Gets the ww main foreign person dto.
     * 
     * @return the ww main foreign person dto
     */
    public XLDFForeignPersonDTO getWwMainForeignPersonDTO() {
        return wwMainForeignPersonDTO;
    }

    /**
     * Sets the ww main foreign person dto.
     * 
     * @param wwMainForeignPersonDTO
     *            the new ww main foreign person dto
     */
    public void setWwMainForeignPersonDTO(final XLDFForeignPersonDTO wwMainForeignPersonDTO) {
        this.wwMainForeignPersonDTO = wwMainForeignPersonDTO;
    }

    /**
     * Gets the ww main foreign role dto.
     * 
     * @return the ww main foreign role dto
     */
    public XLDFSimpleForeignRoleDTO getWwMainForeignRoleDTO() {
        return wwMainForeignRoleDTO;
    }

    /**
     * Sets the ww main foreign role dto.
     * 
     * @param wwMainForeignRoleDTO
     *            the new ww main foreign role dto
     */
    public void setWwMainForeignRoleDTO(final XLDFSimpleForeignRoleDTO wwMainForeignRoleDTO) {
        this.wwMainForeignRoleDTO = wwMainForeignRoleDTO;
    }

    /**
     * Checks if is do m10 m check flag.
     * 
     * @return true, if is do m10 m check flag
     */
    public boolean isDoM10MCheckFlag() {
        return doM10MCheckFlag;
    }

    /**
     * Sets the do m10 m check flag.
     * 
     * @param doM10MCheckFlag
     *            the new do m10 m check flag
     */
    public void setDoM10MCheckFlag(final boolean doM10MCheckFlag) {
        this.doM10MCheckFlag = doM10MCheckFlag;
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
     * Gets the hh org marriage code.
     * 
     * @return the hh org marriage code
     */
    public String getHhOrgMarriageCode() {
        return hhOrgMarriageCode;
    }

    /**
     * Sets the hh org marriage code.
     * 
     * @param hhOrgMarriageCode
     *            the new hh org marriage code
     */
    public void setHhOrgMarriageCode(final String hhOrgMarriageCode) {
        this.hhOrgMarriageCode = hhOrgMarriageCode;
    }

    /**
     * Gets the ww org marriage code.
     * 
     * @return the ww org marriage code
     */
    public String getWwOrgMarriageCode() {
        return wwOrgMarriageCode;
    }

    /**
     * Sets the ww org marriage code.
     * 
     * @param wwOrgMarriageCode
     *            the new ww org marriage code
     */
    public void setWwOrgMarriageCode(final String wwOrgMarriageCode) {
        this.wwOrgMarriageCode = wwOrgMarriageCode;
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
     * Gets the flag create xldf m10 m s091 hw flag.
     * 
     * @return the flag create xldf m10 m s091 hw flag
     */
    public String getFlagCreateXLDFM10MS091HWFlag() {
        return flagCreateXLDFM10MS091HWFlag;
    }

    /**
     * Sets the flag create xldf m10 m s091 hw flag.
     * 
     * @param flagCreateXLDFM10MS091HWFlag
     *            the new flag create xldf m10 m s091 hw flag
     */
    public void setFlagCreateXLDFM10MS091HWFlag(final String flagCreateXLDFM10MS091HWFlag) {
        this.flagCreateXLDFM10MS091HWFlag = flagCreateXLDFM10MS091HWFlag;
    }

    /**
     * Gets the flag create xldf m10 m r091 hw flag.
     * 
     * @return the flag create xldf m10 m r091 hw flag
     */
    public String getFlagCreateXLDFM10MR091HWFlag() {
        return flagCreateXLDFM10MR091HWFlag;
    }

    /**
     * Sets the flag create xldf m10 m r091 hw flag.
     * 
     * @param flagCreateXLDFM10MR091HWFlag
     *            the new flag create xldf m10 m r091 hw flag
     */
    public void setFlagCreateXLDFM10MR091HWFlag(final String flagCreateXLDFM10MR091HWFlag) {
        this.flagCreateXLDFM10MR091HWFlag = flagCreateXLDFM10MR091HWFlag;
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
     * Gets the flag create xldf s091 hw flag.
     * 
     * @return the flag create xldf s091 hw flag
     */
    public String getFlagCreateXLDFS091HWFlag() {
        return flagCreateXLDFS091HWFlag;
    }

    /**
     * Sets the flag create xldf s091 hw flag.
     * 
     * @param flagCreateXLDFS091HWFlag
     *            the new flag create xldf s091 hw flag
     */
    public void setFlagCreateXLDFS091HWFlag(final String flagCreateXLDFS091HWFlag) {
        this.flagCreateXLDFS091HWFlag = flagCreateXLDFS091HWFlag;
    }

    /**
     * Gets the flag create xldf r091 hw flag.
     * 
     * @return the flag create xldf r091 hw flag
     */
    public String getFlagCreateXLDFR091HWFlag() {
        return flagCreateXLDFR091HWFlag;
    }

    /**
     * Sets the flag create xldf r091 hw flag.
     * 
     * @param flagCreateXLDFR091HWFlag
     *            the new flag create xldf r091 hw flag
     */
    public void setFlagCreateXLDFR091HWFlag(final String flagCreateXLDFR091HWFlag) {
        this.flagCreateXLDFR091HWFlag = flagCreateXLDFR091HWFlag;
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

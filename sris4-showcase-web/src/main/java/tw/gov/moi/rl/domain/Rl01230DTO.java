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
import tw.gov.moi.rl.component.dto.XLDFRegDetailObnfParams;
import tw.gov.moi.rl.component.xldf.dto.XCDF001MRL;
import tw.gov.moi.rl.component.xldf.dto.XLDF030M;
import tw.gov.moi.rl.component.xldf.dto.XLDFY003H;
import tw.gov.moi.rl.component.xldf.dto.XLDFY003M;

/**
 * 結婚登記DTO.
 * 
 * @author Viva.Hong
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Rl01230DTO", propOrder = { "transactionId", "acceptSiteId", "userId", "initTime",
        "husbandXLDFHouseholdDataDTO", "husbandXLDFPersonDataDTO", "husbandHXLDFPersonDataDTO",
        "husbandXLDFForeignPersonDTO", "husbandXLDFSimpleForeignRoleDTO", "finePerson", "hhPersonId", "hhSiteId",
        "hhRemoveDate", "hhRemoveTime", "hhRemoveYear", "hhRemoveMon", "hhRemoveDay", "hhRemoveHour", "hhRemoveMin",
        "hhRemoveSec", "hhHouseholdHeadFlag", "hhAttorneyFlag", "hhPersonRole", "hhHouseholdState", "hhAttorneyCode",
        "hhAttorney", "hhNationalityFlag", "hhNationalityCountry", "hhNationalityEname", "hhNowStateCode",
        "hhMrgStatusBCode", "hhOriginalName", "hhOriginalLastName", "hhOriginalFirstName", "hhOrgEducationMark",
        "hhEducationName", "hhMrgStatusBName", "hhNowStateName", "hhCityCountyName", "hhTownName", "hhOutliveCaseFlag",
        "hhFlagMarriageCode", "wifeXLDFHouseholdDataDTO", "wifeXLDFPersonDataDTO", "wifeHXLDFPersonDataDTO",
        "wifeXLDFForeignPersonDTO", "wifeXLDFSimpleForeignRoleDTO", "wwPersonId", "wwSiteId", "wwRemoveDate",
        "wwRemoveTime", "wwRemoveYear", "wwRemoveMon", "wwRemoveDay", "wwRemoveHour", "wwRemoveMin", "wwRemoveSec",
        "wwHouseholdHeadFlag", "wwAttorneyFlag", "wwPersonRole", "wwHouseholdState", "wwAttorneyCode", "wwAttorney",
        "wwNationalityFlag", "wwNationalityCountry", "wwNationalityEname", "wwNowStateCode", "wwMrgStatusBCode",
        "wwOriginalName", "wwOriginalLastName", "wwOriginalFirstName", "wwOrgEducationMark", "wwEducationName",
        "wwMrgStatusBName", "wwNowStateName", "wwCityCountyName", "wwTownName", "wwOutliveCaseFlag",
        "wwFlagMarriageCode", "applyDTO1", "applyDTO2", "commDTO", "initErrorMessageList", "mrgXCDF001MRLMap",
        "regObnfList", "personNoteList", "xldfy003mList", "xldfy003hList", "childList", "child030MList",
        "householdNoteList", "fineList", "mrgPlaceCode", "otherMrgPlace", "foreignMrgFlag", "mrgYyymmdd", "apYyymmdd",
        "applyTypeFlag", "mrgTypeCode", "mrgWitnessA", "mrgWitnessB", "otherCertificateFlag", "registerContent",
        "needFineFlag", "acceptAdminOfficeCode", "applyCityCounty1Name", "applyTown1Name", "commTownName",
        "registerDate", "registerTime", "applyCode", "applyDate", "enforcedFlag", "enforcedApplicant",
        "targetPersonFlag", "nonTargetPerson", "certificateList", "fineOverdueruleMark", "fineMoney",
        "fineSerialNumber", "feeAmount", "receiptId", "applySeq", "applyCaseNo", "fineEventDate", "operationCode",
        "systemDate", "systemTime", "applySequenceId", "doFineCheckFlag", "deleteFineDTOFlag",
        "previousDoFineCheckFlag", "previousFineEventDate", "fineFreeFlag", "doFineCheckFlagOpen", "fineDTO",
        "acceptRegistrarName", "acceptRegistrarId", "relationMessage", "isGetSpouseData", "removeFeeReason",
        "certificate3OtherCertificate", "openingOperationDTO", "flagGetSpouseDataHWFlag", "flagQueryForeignDataHWFlag",
        "flagGetChildListHWFlag", "flagCreateXLDFPersonDataHWFlag", "flagCreateXLDFM02MHWFlag",
        "flagCreateXCDF001MRLHWFlag", "flagCreateXLDFM10MS003HWFlag", "flagCreateXLDFM10HS003HWFlag",
        "flagCreateXLDFM10MR003HWFlag", "flagCreateXLDFM10HR003HWFlag", "flagCreateXLDFS003HWFlag",
        "flagCreateXLDF008SHWFlag", "flagCreateXLDF088THWFlag", "flagCreateXLDFR003HWFlag", "flagCreateXLDF009SHWFlag",
        "outliveCase", "initSuccess", "activeIndex", "foreignPerson", "lockMode" })
@XmlRootElement(name = "Rl01230DTO")
public class Rl01230DTO implements Serializable {

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

    /** (夫)全戶基本資料. */
    @XmlElement(name = "HusbandXLDFHouseholdDataDTO", required = true)
    @FieldName("(夫)全戶基本資料")
    private XLDFHouseholdDataDTO husbandXLDFHouseholdDataDTO = new XLDF001MDTO();

    /** (夫)個人基本資料. */
    @XmlElement(name = "HusbandXLDFPersonDataDTO", required = true)
    @FieldName("(夫)個人基本資料")
    private XLDFPersonDataDTO husbandXLDFPersonDataDTO = new XLDF004MDTO();

    /** (夫)戶長個人基本資料. */
    @XmlElement(name = "HusbandHXLDFPersonDataDTO", required = true)
    @FieldName("(夫)戶長個人基本資料")
    private XLDFPersonDataDTO husbandHXLDFPersonDataDTO = new XLDF004MDTO();

    /** (夫)外籍者資料1. */
    @XmlElement(name = "HusbandXLDFForeignPersonDTO", required = true)
    @FieldName("(夫)外籍者資料1")
    private XLDFForeignPersonDTO husbandXLDFForeignPersonDTO = new XLDFForeignPersonDTO();

    /** (夫)外籍者資料2. */
    @XmlElement(name = "HusbandXLDFSimpleForeignRoleDTO", required = true)
    @FieldName("(夫)外籍者資料2")
    private XLDFSimpleForeignRoleDTO husbandXLDFSimpleForeignRoleDTO = new XLDFSimpleForeignRoleDTO(StringUtils.EMPTY,
            StringUtils.EMPTY, StringUtils.EMPTY);

    /** 受處分人. */
    @XmlElement(name = "FinePerson", required = true)
    @FieldName("受處分人")
    private XLDFApplicantDataDTO finePerson = new XLDFApplicantDataDTO();

    /** (夫)統號. */
    @XmlElement(name = "HhPersonId", required = true)
    @FieldName("(夫)統號")
    private String hhPersonId;

    /** (夫)作業點代碼. */
    @XmlElement(name = "HhSiteId", required = true)
    @FieldName("(夫)作業點代碼")
    private String hhSiteId;

    /** (夫)除戶日期. */
    @XmlElement(name = "HhRemoveDate", required = true)
    @FieldName("(夫)除戶日期")
    private String hhRemoveDate;

    /** (夫)除戶時間. */
    @XmlElement(name = "HhRemoveTime", required = true)
    @FieldName("(夫)除戶時間")
    private String hhRemoveTime;

    /** (夫)除戶日期:年. */
    @XmlElement(name = "HhRemoveYear", required = true)
    @FieldName("(夫)除戶日期:年")
    private String hhRemoveYear;

    /** (夫)除戶日期:月. */
    @XmlElement(name = "HhRemoveMon", required = true)
    @FieldName("(夫)除戶日期:月")
    private String hhRemoveMon;

    /** (夫)除戶日期:日. */
    @XmlElement(name = "HhRemoveDay", required = true)
    @FieldName("(夫)除戶日期:日")
    private String hhRemoveDay;

    /** (夫)除戶時間:時. */
    @XmlElement(name = "HhRemoveHour", required = true)
    @FieldName("(夫)除戶時間:時")
    private String hhRemoveHour;

    /** (夫)除戶時間:分. */
    @XmlElement(name = "HhRemoveMin", required = true)
    @FieldName("(夫)除戶時間:分")
    private String hhRemoveMin;

    /** (夫)除戶時間:秒. */
    @XmlElement(name = "HhRemoveSec", required = true)
    @FieldName("(夫)除戶時間:秒")
    private String hhRemoveSec;

    /** (夫)當事人為戶長-旗標. */
    @XmlElement(name = "HhHouseholdHeadFlag", required = true)
    @FieldName("(夫)當事人為戶長-旗標")
    private String hhHouseholdHeadFlag;

    /** (夫)須法定代理人同意-旗標. */
    @XmlElement(name = "HhAttorneyFlag", required = true)
    @FieldName("(夫)須法定代理人同意-旗標")
    private String hhAttorneyFlag;

    /** (夫)結婚者身分. */
    @XmlElement(name = "HhPersonRole", required = true)
    @FieldName("(夫)結婚者身分")
    private String hhPersonRole;

    /** (夫)戶籍簿頁狀態（M現戶）、（H除戶）. */
    @XmlElement(name = "HhHouseholdState", required = true)
    @FieldName("(夫)戶籍簿頁狀態（M現戶）、（H除戶）")
    private String hhHouseholdState;

    /** (夫)法定代理人同意. */
    @XmlElement(name = "HhAttorneyCode", required = true)
    @FieldName("(夫)法定代理人同意")
    private String hhAttorneyCode;

    /** (夫)法定代理人同意內容. */
    @XmlElement(name = "HhAttorney", required = true)
    @FieldName("(夫)法定代理人同意內容")
    private String hhAttorney;

    /** (夫)兼具他國國籍. */
    @XmlElement(name = "HhNationalityFlag", required = true)
    @FieldName("(夫)兼具他國國籍")
    private String hhNationalityFlag;

    /** (夫)兼具他國國籍名稱. */
    @XmlElement(name = "HhNationalityCountry", required = true)
    @FieldName("(夫)兼具他國國籍名稱")
    private String hhNationalityCountry;

    /** (夫)兼具他國國籍-英文姓名. */
    @XmlElement(name = "HhNationalityEname", required = true)
    @FieldName("(夫)兼具他國國籍-英文姓名")
    private String hhNationalityEname;

    /** (夫)戶籍現況. */
    @XmlElement(name = "HhNowStateCode", required = true)
    @FieldName("(夫)戶籍現況")
    private String hhNowStateCode;

    /** (夫)婚前婚姻狀況. */
    @XmlElement(name = "HhMrgStatusBCode", required = true)
    @FieldName("(夫)婚前婚姻狀況")
    private String hhMrgStatusBCode;

    /** (夫)原姓名. */
    @XmlElement(name = "HhOriginalName", required = true)
    @FieldName("(夫)原姓名")
    private String hhOriginalName;

    /** (夫)原姓. */
    @XmlElement(name = "HhOriginalLastName", required = true)
    @FieldName("(夫)原姓")
    private String hhOriginalLastName;

    /** (夫)原名. */
    @XmlElement(name = "HhOriginalFirstName", required = true)
    @FieldName("(夫)原名")
    private String hhOriginalFirstName;

    /** (夫)原教育程度代碼. */
    @XmlElement(name = "HhOrgEducationMark", required = true)
    @FieldName("(夫)原教育程度代碼")
    private String hhOrgEducationMark;

    /** (夫)教育程度. */
    @XmlElement(name = "HhEducationName", required = true)
    @FieldName("(夫)教育程度")
    private String hhEducationName;

    /** (夫)夫-婚前婚姻狀況. */
    @XmlElement(name = "HhMrgStatusBName", required = true)
    @FieldName("(夫)夫-婚前婚姻狀況")
    private String hhMrgStatusBName;

    /** (夫)戶籍現況. */
    @XmlElement(name = "HhNowStateName", required = true)
    @FieldName("(夫)戶籍現況")
    private String hhNowStateName;

    /** (夫)省市縣市名稱. */
    @XmlElement(name = "HhCityCountyName", required = true)
    @FieldName("(夫)省市縣市名稱")
    private String hhCityCountyName;

    /** (夫)鄉鎮市區名稱. */
    @XmlElement(name = "HhTownName", required = true)
    @FieldName("(夫)鄉鎮市區名稱")
    private String hhTownName;

    /** (夫)非現住人口處理註記. */
    @XmlElement(name = "HhOutliveCaseFlag", required = true)
    @FieldName("(夫)非現住人口處理註記")
    private String hhOutliveCaseFlag;

    /** (夫)旗標:是否已婚?. */
    @XmlElement(name = "HhFlagMarriageCode", required = true)
    @FieldName("(夫)旗標:是否已婚?")
    private String hhFlagMarriageCode;

    /** (妻)全戶基本資料. */
    @XmlElement(name = "WifeXLDFHouseholdDataDTO", required = true)
    @FieldName("(妻)全戶基本資料")
    private XLDFHouseholdDataDTO wifeXLDFHouseholdDataDTO = new XLDF001MDTO();

    /** (妻)個人基本資料. */
    @XmlElement(name = "WifeXLDFPersonDataDTO", required = true)
    @FieldName("(妻)個人基本資料")
    private XLDFPersonDataDTO wifeXLDFPersonDataDTO = new XLDF004MDTO();

    /** (妻)戶長個人基本資料. */
    @XmlElement(name = "WifeHXLDFPersonDataDTO", required = true)
    @FieldName("(妻)戶長個人基本資料")
    private XLDFPersonDataDTO wifeHXLDFPersonDataDTO = new XLDF004MDTO();

    /** (妻)外籍者資料1. */
    @XmlElement(name = "WifeXLDFForeignPersonDTO", required = true)
    @FieldName("(妻)外籍者資料1")
    private XLDFForeignPersonDTO wifeXLDFForeignPersonDTO = new XLDFForeignPersonDTO();

    /** (妻)外籍者資料2. */
    @XmlElement(name = "WifeXLDFSimpleForeignRoleDTO", required = true)
    @FieldName("(妻)外籍者資料2")
    private XLDFSimpleForeignRoleDTO wifeXLDFSimpleForeignRoleDTO = new XLDFSimpleForeignRoleDTO(StringUtils.EMPTY,
            StringUtils.EMPTY, StringUtils.EMPTY);

    /** (妻)統號. */
    @XmlElement(name = "WwPersonId", required = true)
    @FieldName("(妻)統號")
    private String wwPersonId;

    /** (妻)作業點代碼. */
    @XmlElement(name = "WwSiteId", required = true)
    @FieldName("(妻)作業點代碼")
    private String wwSiteId;

    /** (妻)除戶日期. */
    @XmlElement(name = "WwRemoveDate", required = true)
    @FieldName("(妻)除戶日期")
    private String wwRemoveDate;

    /** (妻)除戶時間. */
    @XmlElement(name = "WwRemoveTime", required = true)
    @FieldName("(妻)除戶時間")
    private String wwRemoveTime;

    /** (妻)除戶日期:年. */
    @XmlElement(name = "WwRemoveYear", required = true)
    @FieldName("(妻)除戶日期:年")
    private String wwRemoveYear;

    /** (妻)除戶日期:月. */
    @XmlElement(name = "WwRemoveMon", required = true)
    @FieldName("(妻)除戶日期:月")
    private String wwRemoveMon;

    /** (妻)除戶日期:日. */
    @XmlElement(name = "WwRemoveDay", required = true)
    @FieldName("(妻)除戶日期:日")
    private String wwRemoveDay;

    /** (妻)除戶時間:時. */
    @XmlElement(name = "WwRemoveHour", required = true)
    @FieldName("(妻)除戶時間:時")
    private String wwRemoveHour;

    /** (妻)除戶時間:分. */
    @XmlElement(name = "WwRemoveMin", required = true)
    @FieldName("(妻)除戶時間:分")
    private String wwRemoveMin;

    /** (妻)除戶時間:秒. */
    @XmlElement(name = "WwRemoveSec", required = true)
    @FieldName("(妻)除戶時間:秒")
    private String wwRemoveSec;

    /** (妻)當事人為戶長-旗標. */
    @XmlElement(name = "WwHouseholdHeadFlag", required = true)
    @FieldName("(妻)當事人為戶長-旗標")
    private String wwHouseholdHeadFlag;

    /** (妻)須法定代理人同意-旗標. */
    @XmlElement(name = "WwAttorneyFlag", required = true)
    @FieldName("(妻)須法定代理人同意-旗標")
    private String wwAttorneyFlag;

    /** (妻)結婚者身分. */
    @XmlElement(name = "WwPersonRole", required = true)
    @FieldName("(妻)結婚者身分")
    private String wwPersonRole;

    /** (妻)戶籍簿頁狀態（M現戶）、（H除戶）. */
    @XmlElement(name = "WwHouseholdState", required = true)
    @FieldName("(妻)戶籍簿頁狀態（M現戶）、（H除戶）")
    private String wwHouseholdState;

    /** (妻)法定代理人同意. */
    @XmlElement(name = "WwAttorneyCode", required = true)
    @FieldName("(妻)法定代理人同意")
    private String wwAttorneyCode;

    /** (妻)法定代理人同意內容. */
    @XmlElement(name = "WwAttorney", required = true)
    @FieldName("(妻)法定代理人同意內容")
    private String wwAttorney;

    /** (妻)兼具他國國籍. */
    @XmlElement(name = "WwNationalityFlag", required = true)
    @FieldName("(妻)兼具他國國籍")
    private String wwNationalityFlag;

    /** (妻)兼具他國國籍名稱. */
    @XmlElement(name = "WwNationalityCountry", required = true)
    @FieldName("(妻)兼具他國國籍名稱")
    private String wwNationalityCountry;

    /** (妻)兼具他國國籍-英文姓名. */
    @XmlElement(name = "WwNationalityEname", required = true)
    @FieldName("(妻)兼具他國國籍-英文姓名")
    private String wwNationalityEname;

    /** (妻)戶籍現況. */
    @XmlElement(name = "WwNowStateCode", required = true)
    @FieldName("(妻)戶籍現況")
    private String wwNowStateCode;

    /** (妻)婚前婚姻狀況. */
    @XmlElement(name = "WwMrgStatusBCode", required = true)
    @FieldName("(妻)婚前婚姻狀況")
    private String wwMrgStatusBCode;

    /** (妻)原姓名. */
    @XmlElement(name = "WwOriginalName", required = true)
    @FieldName("(妻)原姓名")
    private String wwOriginalName;

    /** (妻)原姓. */
    @XmlElement(name = "WwOriginalLastName", required = true)
    @FieldName("(妻)原姓")
    private String wwOriginalLastName;

    /** (妻)原名. */
    @XmlElement(name = "wwOriginalFirstName", required = true)
    @FieldName("(妻)原名")
    private String wwOriginalFirstName;

    /** (妻)原教育程度代碼. */
    @XmlElement(name = "WwOrgEducationMark", required = true)
    @FieldName("(妻)原教育程度代碼")
    private String wwOrgEducationMark;

    /** (妻)教育程度. */
    @XmlElement(name = "WwEducationName", required = true)
    @FieldName("(妻)教育程度")
    private String wwEducationName;

    /** (妻)婚前婚姻狀況. */
    @XmlElement(name = "WwMrgStatusBName", required = true)
    @FieldName("(妻)婚前婚姻狀況")
    private String wwMrgStatusBName;

    /** (妻)戶籍現況. */
    @XmlElement(name = "WwNowStateName", required = true)
    @FieldName("(妻)戶籍現況")
    private String wwNowStateName;

    /** (妻)省市縣市名稱. */
    @XmlElement(name = "WwCityCountyName", required = true)
    @FieldName("(妻)省市縣市名稱")
    private String wwCityCountyName;

    /** (妻)鄉鎮市區名稱. */
    @XmlElement(name = "WwTownName", required = true)
    @FieldName("(妻)鄉鎮市區名稱")
    private String wwTownName;

    /** (妻)非現住人口處理註記. */
    @XmlElement(name = "WwOutliveCaseFlag", required = true)
    @FieldName("(妻)非現住人口處理註記")
    private String wwOutliveCaseFlag;

    /** (妻)旗標:是否已婚?. */
    @XmlElement(name = "WwFlagMarriageCode", required = true)
    @FieldName("(妻)旗標:是否已婚?")
    private String wwFlagMarriageCode;

    /** 申請人1. */
    @XmlElement(name = "ApplyDTO1", required = true)
    @FieldName("申請人1")
    private XLDFApplicantDataDTO applyDTO1 = new XLDFApplicantDataDTO();

    /** 申請人2. */
    @XmlElement(name = "ApplyDTO2", required = true)
    @FieldName("申請人2")
    private XLDFApplicantDataDTO applyDTO2 = new XLDFApplicantDataDTO();

    /** 受委託人. */
    @XmlElement(name = "CommDTO", required = true)
    @FieldName("受委託人")
    private XLDFPersonBriefDataDTO commDTO = new XLDFPersonBriefDataDTO();

    /** 初始1230時的錯誤訊息清單. */
    @XmlElement(name = "InitErrorMessageList", required = true)
    @FieldName("初始1230時的錯誤訊息清單")
    private List<List<String>> initErrorMessageList = new ArrayList<List<String>>();

    /** 結婚系列-統號-XCDF001MRL物件MAP. */
    @XmlElement(name = "MrgXCDF001MRLMap", required = true)
    @FieldName("結婚系列-統號-XCDF001MRL物件MAP")
    private Map<String, XCDF001MRL> mrgXCDF001MRLMap = new HashMap<String, XCDF001MRL>();

    /** 特殊通報. */
    @XmlElement(name = "RegObnfList", required = true)
    @FieldName("特殊通報")
    private List<XLDFRegDetailObnfParams> regObnfList = new ArrayList<XLDFRegDetailObnfParams>();

    /** 個人記事清單. */
    @XmlElement(name = "PersonNoteList", required = true)
    @FieldName("個人記事清單")
    private List<XLDFPersonNoteDTO> personNoteList = new ArrayList<XLDFPersonNoteDTO>();

    /** 個人記事欄位化-現戶物件清單. */
    @XmlElement(name = "Xldfy003mList", required = true)
    @FieldName("個人記事欄位化-現戶物件清單")
    private List<XLDFY003M> xldfy003mList = new ArrayList<XLDFY003M>();

    /** 個人記事欄位化-除戶物件清單. */
    @XmlElement(name = "Xldfy003hList", required = true)
    @FieldName("個人記事欄位化-除戶物件清單")
    private List<XLDFY003H> xldfy003hList = new ArrayList<XLDFY003H>();

    /** 子女清單. */
    @XmlElement(name = "ChildList", required = true)
    @FieldName("子女清單")
    private List<List<String>> childList = new ArrayList<List<String>>();

    /** 子女所內記事清單. */
    @XmlElement(name = "Child030MList", required = true)
    @FieldName("子女所內記事清單")
    private List<XLDF030M> child030MList = new ArrayList<XLDF030M>();

    /** 全戶記事清單. */
    @XmlElement(name = "householdNoteList", required = true)
    @FieldName("全戶記事清單")
    private List<XLDFHouseholdNoteDTO> householdNoteList = new ArrayList<XLDFHouseholdNoteDTO>();

    /** 罰鍰記事清單. */
    @XmlElement(name = "FineList", required = true)
    @FieldName("罰鍰記事清單")
    private List<XLDFOperationFineDTO> fineList = new ArrayList<XLDFOperationFineDTO>();

    /** 結婚地點. */
    @XmlElement(name = "MrgPlaceCode", required = true)
    @FieldName("結婚地點")
    private String mrgPlaceCode;

    /** 其他結婚地點. */
    @XmlElement(name = "OtherMrgPlace", required = true)
    @FieldName("其他結婚地點")
    private String otherMrgPlace;

    /** 國外結婚. */
    @XmlElement(name = "ForeignMrgFlag", required = true)
    @FieldName("國外結婚")
    private String foreignMrgFlag;

    /** 結婚生效日期. */
    @XmlElement(name = "MrgYyymmdd", required = true)
    @FieldName("結婚生效日期")
    private String mrgYyymmdd;

    /** 結婚登記日期. */
    @XmlElement(name = "ApYyymmdd", required = true)
    @FieldName("結婚登記日期")
    private String apYyymmdd;

    /** 申請種類. */
    @XmlElement(name = "ApplyTypeFlag", required = true)
    @FieldName("申請種類")
    private String applyTypeFlag;

    /** 婚姻類別代碼. */
    @XmlElement(name = "MrgTypeCode", required = true)
    @FieldName("婚姻類別代碼")
    private String mrgTypeCode;

    /** 證人1姓名. */
    @XmlElement(name = "MrgWitnessA", required = true)
    @FieldName("證人1姓名")
    private String mrgWitnessA;

    /** 證人2姓名. */
    @XmlElement(name = "MrgWitnessB", required = true)
    @FieldName("證人2姓名")
    private String mrgWitnessB;

    /** 旗標:其他附繳證件. */
    @XmlElement(name = "OtherCertificateFlag", required = true)
    @FieldName("旗標:其他附繳證件")
    private boolean otherCertificateFlag = false;

    /** 備註. */
    @XmlElement(name = "RegisterContent", required = true)
    @FieldName("備註")
    private String registerContent;

    /** 須進行罰鍰處理. */
    @XmlElement(name = "NeedFineFlag", required = true)
    @FieldName("須進行罰鍰處理")
    private String needFineFlag = RlConstant.NO_CHAR;

    /** 受理地戶所代碼. */
    @XmlElement(name = "AcceptAdminOfficeCode", required = true)
    @FieldName("受理地戶所代碼")
    private String acceptAdminOfficeCode;

    /** 申請人１住址-省市縣市名稱. */
    @XmlElement(name = "ApplyCityCounty1Name", required = true)
    @FieldName("申請人1住址-省市縣市名稱")
    private String applyCityCounty1Name;

    /** 申請人１住址-鄉鎮市區名稱. */
    @XmlElement(name = "ApplyTown1Name", required = true)
    @FieldName("申請人1住址-鄉鎮市區名稱")
    private String applyTown1Name;

    /** 受委託人住址-鄉鎮市區名稱. */
    @XmlElement(name = "CommTownName", required = true)
    @FieldName("受委託人住址-鄉鎮市區名稱")
    private String commTownName;

    /** 登記日期. */
    @XmlElement(name = "RegisterDate", required = true)
    @FieldName("登記日期")
    private String registerDate;

    /** 登記時間. */
    @XmlElement(name = "RegisterTime", required = true)
    @FieldName("登記時間")
    private String registerTime;

    /** 申請書類別代碼（次分類）. */
    @XmlElement(name = "ApplyCode", required = true)
    @FieldName("申請書類別代碼（次分類）")
    private String applyCode;

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

    /** 大簿當事人註記 h表示夫 w表示妻. */
    @XmlElement(name = "TargetPersonFlag", required = true)
    @FieldName("大簿當事人註記 h表示夫 w表示妻")
    private String targetPersonFlag;

    /** 非大簿當事人註記(h:夫、 w:妻). */
    @XmlElement(name = "NonTargetPerson", required = true)
    @FieldName("非大簿當事人註記(h:夫、 w:妻)")
    private String nonTargetPerson;

    /** 附繳證件清單. */
    @XmlElement(name = "CertificateList", required = true)
    @FieldName("附繳證件清單")
    private List<String> certificateList = new ArrayList<String>();

    /** 戶籍罰鍰條款註記. */
    @XmlElement(name = "FineOverdueruleMark", required = true)
    @FieldName("戶籍罰鍰條款註記")
    private String fineOverdueruleMark = StringUtils.EMPTY;

    /** 戶籍罰鍰金鍰. */
    @XmlElement(name = "FineMoney", required = true)
    @FieldName("戶籍罰鍰金鍰")
    private String fineMoney = StringUtils.EMPTY;

    /** 罰鍰裁處書識別序號. */
    @XmlElement(name = "FineSerialNumber", required = true)
    @FieldName("罰鍰裁處書識別序號")
    private String fineSerialNumber = StringUtils.EMPTY;

    /** 戶籍罰鍰金額. */
    @XmlElement(name = "FeeAmount", required = true)
    @FieldName("戶籍罰鍰金額")
    private String feeAmount = StringUtils.EMPTY;

    /** 收據號碼. */
    @XmlElement(name = "ReceiptId", required = true)
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
    @FieldName("系統日期")
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
    private boolean deleteFineDTOFlag = false;

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

    /** 受理地戶籍員姓名. */
    @XmlElement(name = "AcceptRegistrarName", required = true)
    @FieldName("受理地戶籍員姓名")
    private String acceptRegistrarName;

    /** 受理地戶籍員帳號. */
    @XmlElement(name = "AcceptRegistrarId", required = true)
    @FieldName("受理地戶籍員帳號")
    private String acceptRegistrarId;

    /** 夫與妻之親等關係訊息. */
    @XmlElement(name = "RelationMessage", required = true)
    @FieldName("夫與妻之親等關係訊息")
    private String relationMessage;

    /** 申請人是否為2位?. */
    @XmlElement(name = "IsGetSpouseData", required = true)
    @FieldName("申請人是否為2位?")
    private boolean isGetSpouseData;

    /** 免罰原因. */
    @XmlElement(name = "RemoveFeeReason", required = true)
    @FieldName("免罰原因")
    private String removeFeeReason = StringUtils.EMPTY;

    /** 其他附繳證件. */
    @XmlElement(name = "Certificate3OtherCertificate", required = true)
    @FieldName("其他附繳證件")
    private String certificate3OtherCertificate = StringUtils.EMPTY;

    /** OpeningOperationDTO. */
    @XmlElement(name = "OpeningOperationDTO", required = true)
    @FieldName("OpeningOperationDTO")
    private OpeningOperationDTO openingOperationDTO;

    /** flagGetSpouseDataHW flag. */
    @XmlElement(name = "FlagGetSpouseDataHWFlag", required = true)
    @FieldName("flagGetSpouseDataHW flag")
    private String flagGetSpouseDataHWFlag;

    /** flagQueryForeignDataHW flag. */
    @XmlElement(name = "FlagQueryForeignDataHWFlag", required = true)
    @FieldName("flagQueryForeignDataHW flag")
    private String flagQueryForeignDataHWFlag;

    /** flagGetChildListHW flag. */
    @XmlElement(name = "FlagGetChildListHWFlag", required = true)
    @FieldName("flagGetChildListHW flag")
    private String flagGetChildListHWFlag;

    /** createxldfpersondata flag. */
    @XmlElement(name = "FlagCreateXLDFPersonDataHWFlag", required = true)
    @FieldName("createxldfpersondata flag")
    private String flagCreateXLDFPersonDataHWFlag;

    /** createxldfm02m flag. */
    @XmlElement(name = "FlagCreateXLDFM02MHWFlag", required = true)
    @FieldName("createxldfm02m flag")
    private String flagCreateXLDFM02MHWFlag;

    /** createxcdf001mrl flag. */
    @XmlElement(name = "FlagCreateXCDF001MRLHWFlag", required = true)
    @FieldName("createxcdf001mrl flag")
    private String flagCreateXCDF001MRLHWFlag;

    /** createxldfm10ms003 flag. */
    @XmlElement(name = "FlagCreateXLDFM10MS003HWFlag", required = true)
    @FieldName("createxldfm10ms003 flag")
    private String flagCreateXLDFM10MS003HWFlag;

    /** createxldfm10h flag. */
    @XmlElement(name = "FlagCreateXLDFM10HS003HWFlag", required = true)
    @FieldName("createxldfm10h flag")
    private String flagCreateXLDFM10HS003HWFlag;

    /** createxldfm10mr003 flag. */
    @XmlElement(name = "FlagCreateXLDFM10MR003HWFlag", required = true)
    @FieldName("createxldfm10mr003 flag")
    private String flagCreateXLDFM10MR003HWFlag;

    /** createxldfm10h by R003 flag. */
    @XmlElement(name = "FlagCreateXLDFM10HR003HWFlag", required = true)
    @FieldName("createxldfm10h by R003 flag")
    private String flagCreateXLDFM10HR003HWFlag;

    /** createxldfs003 flag. */
    @XmlElement(name = "FlagCreateXLDFS003HWFlag", required = true)
    @FieldName("createxldfs003 flag")
    private String flagCreateXLDFS003HWFlag;

    /** createxldf008 flag. */
    @XmlElement(name = "FlagCreateXLDF008SHWFlag", required = true)
    @FieldName("createxldf008 flag")
    private String flagCreateXLDF008SHWFlag;

    /** createxldf088 flag. */
    @XmlElement(name = "FlagCreateXLDF088THWFlag", required = true)
    @FieldName("createxldf088 flag")
    private String flagCreateXLDF088THWFlag;

    /** createxldfr003 flag. */
    @XmlElement(name = "FlagCreateXLDFR003HWFlag", required = true)
    @FieldName("createxldfr003 flag")
    private String flagCreateXLDFR003HWFlag;

    /** createxldf009 flag. */
    @XmlElement(name = "FlagCreateXLDF009SHWFlag", required = true)
    @FieldName("createxldf009 flag")
    private String flagCreateXLDF009SHWFlag;

    /** 執行現戶/除戶登記. */
    @XmlElement(name = "OutliveCase", required = true)
    @FieldName("執行現戶/除戶登記")
    private boolean outliveCase = false;

    /** 初始化是否成功. */
    @XmlElement(name = "InitSuccess", required = true)
    @FieldName("初始化是否成功")
    private boolean initSuccess = true;

    /** 頁籤索引. */
    @XmlElement(name = "ActiveIndex", required = true)
    @FieldName("頁籤索引")
    private String activeIndex = RlConstant.STRING_ONE;

    /** 已選擇補登統號資料. */
    @XmlElement(name = "ForeignPerson", required = true)
    @FieldName("已選擇補登統號資料")
    private Tldf004mType foreignPerson = new Tldf004mType();

    /** 鎖定頁面元件. */
    @XmlElement(name = "LockMode", required = true)
    @FieldName("鎖定頁面元件")
    private boolean lockMode = false;

    /**
     * Gets the husband xldf household data dto.
     * 
     * @return the husband xldf household data dto
     */
    public XLDFHouseholdDataDTO getHusbandXLDFHouseholdDataDTO() {
        return husbandXLDFHouseholdDataDTO;
    }

    /**
     * Sets the husband xldf household data dto.
     * 
     * @param husbandXLDFHouseholdDataDTO
     *            the new husband xldf household data dto
     */
    public void setHusbandXLDFHouseholdDataDTO(final XLDFHouseholdDataDTO husbandXLDFHouseholdDataDTO) {
        this.husbandXLDFHouseholdDataDTO = husbandXLDFHouseholdDataDTO;
    }

    /**
     * Gets the husband xldf person data dto.
     * 
     * @return the husband xldf person data dto
     */
    public XLDFPersonDataDTO getHusbandXLDFPersonDataDTO() {
        return husbandXLDFPersonDataDTO;
    }

    /**
     * Sets the husband xldf person data dto.
     * 
     * @param husbandXLDFPersonDataDTO
     *            the new husband xldf person data dto
     */
    public void setHusbandXLDFPersonDataDTO(final XLDFPersonDataDTO husbandXLDFPersonDataDTO) {
        this.husbandXLDFPersonDataDTO = husbandXLDFPersonDataDTO;
    }

    /**
     * Gets the husband hxldf person data dto.
     * 
     * @return the husband hxldf person data dto
     */
    public XLDFPersonDataDTO getHusbandHXLDFPersonDataDTO() {
        return husbandHXLDFPersonDataDTO;
    }

    /**
     * Sets the husband hxldf person data dto.
     * 
     * @param husbandHXLDFPersonDataDTO
     *            the new husband hxldf person data dto
     */
    public void setHusbandHXLDFPersonDataDTO(final XLDFPersonDataDTO husbandHXLDFPersonDataDTO) {
        this.husbandHXLDFPersonDataDTO = husbandHXLDFPersonDataDTO;
    }

    /**
     * Gets the husband xldf foreign person dto.
     * 
     * @return the husband xldf foreign person dto
     */
    public XLDFForeignPersonDTO getHusbandXLDFForeignPersonDTO() {
        return husbandXLDFForeignPersonDTO;
    }

    /**
     * Sets the husband xldf foreign person dto.
     * 
     * @param husbandXLDFForeignPersonDTO
     *            the new husband xldf foreign person dto
     */
    public void setHusbandXLDFForeignPersonDTO(final XLDFForeignPersonDTO husbandXLDFForeignPersonDTO) {
        this.husbandXLDFForeignPersonDTO = husbandXLDFForeignPersonDTO;
    }

    /**
     * Gets the husband xldf simple foreign role dto.
     * 
     * @return the husband xldf simple foreign role dto
     */
    public XLDFSimpleForeignRoleDTO getHusbandXLDFSimpleForeignRoleDTO() {
        return husbandXLDFSimpleForeignRoleDTO;
    }

    /**
     * Sets the husband xldf simple foreign role dto.
     * 
     * @param husbandXLDFSimpleForeignRoleDTO
     *            the new husband xldf simple foreign role dto
     */
    public void setHusbandXLDFSimpleForeignRoleDTO(final XLDFSimpleForeignRoleDTO husbandXLDFSimpleForeignRoleDTO) {
        this.husbandXLDFSimpleForeignRoleDTO = husbandXLDFSimpleForeignRoleDTO;
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
     * Gets the hh attorney.
     * 
     * @return the hh attorney
     */
    public String getHhAttorney() {
        return hhAttorney;
    }

    /**
     * Sets the hh attorney.
     * 
     * @param hhAttorney
     *            the new hh attorney
     */
    public void setHhAttorney(final String hhAttorney) {
        this.hhAttorney = hhAttorney;
    }

    /**
     * Gets the hh nationality flag.
     * 
     * @return the hh nationality flag
     */
    public String getHhNationalityFlag() {
        return hhNationalityFlag;
    }

    /**
     * Sets the hh nationality flag.
     * 
     * @param hhNationalityFlag
     *            the new hh nationality flag
     */
    public void setHhNationalityFlag(final String hhNationalityFlag) {
        this.hhNationalityFlag = hhNationalityFlag;
    }

    /**
     * Gets the hh nationality country.
     * 
     * @return the hh nationality country
     */
    public String getHhNationalityCountry() {
        return hhNationalityCountry;
    }

    /**
     * Sets the hh nationality country.
     * 
     * @param hhNationalityCountry
     *            the new hh nationality country
     */
    public void setHhNationalityCountry(final String hhNationalityCountry) {
        this.hhNationalityCountry = hhNationalityCountry;
    }

    /**
     * Gets the hh nationality ename.
     * 
     * @return the hh nationality ename
     */
    public String getHhNationalityEname() {
        return hhNationalityEname;
    }

    /**
     * Sets the hh nationality ename.
     * 
     * @param hhNationalityEname
     *            the new hh nationality ename
     */
    public void setHhNationalityEname(final String hhNationalityEname) {
        this.hhNationalityEname = hhNationalityEname;
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
     * Gets the hh original last name.
     * 
     * @return the hh original last name
     */
    public String getHhOriginalLastName() {
        return hhOriginalLastName;
    }

    /**
     * Sets the hh original last name.
     * 
     * @param hhOriginalLastName
     *            the new hh original last name
     */
    public void setHhOriginalLastName(final String hhOriginalLastName) {
        this.hhOriginalLastName = hhOriginalLastName;
    }

    /**
     * Gets the hh original first name.
     * 
     * @return the hh original first name
     */
    public String getHhOriginalFirstName() {
        return hhOriginalFirstName;
    }

    /**
     * Sets the hh original first name.
     * 
     * @param hhOriginalFirstName
     *            the new hh original first name
     */
    public void setHhOriginalFirstName(final String hhOriginalFirstName) {
        this.hhOriginalFirstName = hhOriginalFirstName;
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
     * Gets the hh mrg status b name.
     * 
     * @return the hh mrg status b name
     */
    public String getHhMrgStatusBName() {
        return hhMrgStatusBName;
    }

    /**
     * Sets the hh mrg status b name.
     * 
     * @param hhMrgStatusBName
     *            the new hh mrg status b name
     */
    public void setHhMrgStatusBName(final String hhMrgStatusBName) {
        this.hhMrgStatusBName = hhMrgStatusBName;
    }

    /**
     * Gets the hh now state name.
     * 
     * @return the hh now state name
     */
    public String getHhNowStateName() {
        return hhNowStateName;
    }

    /**
     * Sets the hh now state name.
     * 
     * @param hhNowStateName
     *            the new hh now state name
     */
    public void setHhNowStateName(final String hhNowStateName) {
        this.hhNowStateName = hhNowStateName;
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
     * Gets the wife xldf household data dto.
     * 
     * @return the wife xldf household data dto
     */
    public XLDFHouseholdDataDTO getWifeXLDFHouseholdDataDTO() {
        return wifeXLDFHouseholdDataDTO;
    }

    /**
     * Sets the wife xldf household data dto.
     * 
     * @param wifeXLDFHouseholdDataDTO
     *            the new wife xldf household data dto
     */
    public void setWifeXLDFHouseholdDataDTO(final XLDFHouseholdDataDTO wifeXLDFHouseholdDataDTO) {
        this.wifeXLDFHouseholdDataDTO = wifeXLDFHouseholdDataDTO;
    }

    /**
     * Gets the wife xldf person data dto.
     * 
     * @return the wife xldf person data dto
     */
    public XLDFPersonDataDTO getWifeXLDFPersonDataDTO() {
        return wifeXLDFPersonDataDTO;
    }

    /**
     * Sets the wife xldf person data dto.
     * 
     * @param wifeXLDFPersonDataDTO
     *            the new wife xldf person data dto
     */
    public void setWifeXLDFPersonDataDTO(final XLDFPersonDataDTO wifeXLDFPersonDataDTO) {
        this.wifeXLDFPersonDataDTO = wifeXLDFPersonDataDTO;
    }

    /**
     * Gets the wife hxldf person data dto.
     * 
     * @return the wife hxldf person data dto
     */
    public XLDFPersonDataDTO getWifeHXLDFPersonDataDTO() {
        return wifeHXLDFPersonDataDTO;
    }

    /**
     * Sets the wife hxldf person data dto.
     * 
     * @param wifeHXLDFPersonDataDTO
     *            the new wife hxldf person data dto
     */
    public void setWifeHXLDFPersonDataDTO(final XLDFPersonDataDTO wifeHXLDFPersonDataDTO) {
        this.wifeHXLDFPersonDataDTO = wifeHXLDFPersonDataDTO;
    }

    /**
     * Gets the wife xldf foreign person dto.
     * 
     * @return the wife xldf foreign person dto
     */
    public XLDFForeignPersonDTO getWifeXLDFForeignPersonDTO() {
        return wifeXLDFForeignPersonDTO;
    }

    /**
     * Sets the wife xldf foreign person dto.
     * 
     * @param wifeXLDFForeignPersonDTO
     *            the new wife xldf foreign person dto
     */
    public void setWifeXLDFForeignPersonDTO(final XLDFForeignPersonDTO wifeXLDFForeignPersonDTO) {
        this.wifeXLDFForeignPersonDTO = wifeXLDFForeignPersonDTO;
    }

    /**
     * Gets the wife xldf simple foreign role dto.
     * 
     * @return the wife xldf simple foreign role dto
     */
    public XLDFSimpleForeignRoleDTO getWifeXLDFSimpleForeignRoleDTO() {
        return wifeXLDFSimpleForeignRoleDTO;
    }

    /**
     * Sets the wife xldf simple foreign role dto.
     * 
     * @param wifeXLDFSimpleForeignRoleDTO
     *            the new wife xldf simple foreign role dto
     */
    public void setWifeXLDFSimpleForeignRoleDTO(final XLDFSimpleForeignRoleDTO wifeXLDFSimpleForeignRoleDTO) {
        this.wifeXLDFSimpleForeignRoleDTO = wifeXLDFSimpleForeignRoleDTO;
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
     * Gets the ww attorney.
     * 
     * @return the ww attorney
     */
    public String getWwAttorney() {
        return wwAttorney;
    }

    /**
     * Sets the ww attorney.
     * 
     * @param wwAttorney
     *            the new ww attorney
     */
    public void setWwAttorney(final String wwAttorney) {
        this.wwAttorney = wwAttorney;
    }

    /**
     * Gets the ww nationality flag.
     * 
     * @return the ww nationality flag
     */
    public String getWwNationalityFlag() {
        return wwNationalityFlag;
    }

    /**
     * Sets the ww nationality flag.
     * 
     * @param wwNationalityFlag
     *            the new ww nationality flag
     */
    public void setWwNationalityFlag(final String wwNationalityFlag) {
        this.wwNationalityFlag = wwNationalityFlag;
    }

    /**
     * Gets the ww nationality country.
     * 
     * @return the ww nationality country
     */
    public String getWwNationalityCountry() {
        return wwNationalityCountry;
    }

    /**
     * Sets the ww nationality country.
     * 
     * @param wwNationalityCountry
     *            the new ww nationality country
     */
    public void setWwNationalityCountry(final String wwNationalityCountry) {
        this.wwNationalityCountry = wwNationalityCountry;
    }

    /**
     * Gets the ww nationality ename.
     * 
     * @return the ww nationality ename
     */
    public String getWwNationalityEname() {
        return wwNationalityEname;
    }

    /**
     * Sets the ww nationality ename.
     * 
     * @param wwNationalityEname
     *            the new ww nationality ename
     */
    public void setWwNationalityEname(final String wwNationalityEname) {
        this.wwNationalityEname = wwNationalityEname;
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
     * Gets the ww original last name.
     * 
     * @return the ww original last name
     */
    public String getWwOriginalLastName() {
        return wwOriginalLastName;
    }

    /**
     * Sets the ww original last name.
     * 
     * @param wwOriginalLastName
     *            the new ww original last name
     */
    public void setWwOriginalLastName(final String wwOriginalLastName) {
        this.wwOriginalLastName = wwOriginalLastName;
    }

    /**
     * Gets the ww original first name.
     * 
     * @return the ww original first name
     */
    public String getWwOriginalFirstName() {
        return wwOriginalFirstName;
    }

    /**
     * Sets the ww original first name.
     * 
     * @param wwOriginalFirstName
     *            the new ww original first name
     */
    public void setWwOriginalFirstName(final String wwOriginalFirstName) {
        this.wwOriginalFirstName = wwOriginalFirstName;
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
     * Gets the ww mrg status b name.
     * 
     * @return the ww mrg status b name
     */
    public String getWwMrgStatusBName() {
        return wwMrgStatusBName;
    }

    /**
     * Sets the ww mrg status b name.
     * 
     * @param wwMrgStatusBName
     *            the new ww mrg status b name
     */
    public void setWwMrgStatusBName(final String wwMrgStatusBName) {
        this.wwMrgStatusBName = wwMrgStatusBName;
    }

    /**
     * Gets the ww now state name.
     * 
     * @return the ww now state name
     */
    public String getWwNowStateName() {
        return wwNowStateName;
    }

    /**
     * Sets the ww now state name.
     * 
     * @param wwNowStateName
     *            the new ww now state name
     */
    public void setWwNowStateName(final String wwNowStateName) {
        this.wwNowStateName = wwNowStateName;
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
     * Gets the person note list.
     * 
     * @return the person note list
     */
    public List<XLDFPersonNoteDTO> getPersonNoteList() {
        return personNoteList;
    }

    /**
     * Sets the person note list.
     * 
     * @param personNoteList
     *            the new person note list
     */
    public void setPersonNoteList(final List<XLDFPersonNoteDTO> personNoteList) {
        this.personNoteList = personNoteList;
    }

    /**
     * Gets the xldfy003m list.
     * 
     * @return the xldfy003m list
     */
    public List<XLDFY003M> getXldfy003mList() {
        return xldfy003mList;
    }

    /**
     * Sets the xldfy003m list.
     * 
     * @param xldfy003mList
     *            the new xldfy003m list
     */
    public void setXldfy003mList(final List<XLDFY003M> xldfy003mList) {
        this.xldfy003mList = xldfy003mList;
    }

    /**
     * Gets the xldfy003h list.
     * 
     * @return the xldfy003h list
     */
    public List<XLDFY003H> getXldfy003hList() {
        return xldfy003hList;
    }

    /**
     * Sets the xldfy003h list.
     * 
     * @param xldfy003hList
     *            the new xldfy003h list
     */
    public void setXldfy003hList(final List<XLDFY003H> xldfy003hList) {
        this.xldfy003hList = xldfy003hList;
    }

    /**
     * Gets the household note list.
     * 
     * @return the household note list
     */
    public List<XLDFHouseholdNoteDTO> getHouseholdNoteList() {
        return householdNoteList;
    }

    /**
     * Sets the household note list.
     * 
     * @param householdNoteList
     *            the new household note list
     */
    public void setHouseholdNoteList(final List<XLDFHouseholdNoteDTO> householdNoteList) {
        this.householdNoteList = householdNoteList;
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
     * Gets the mrg place code.
     * 
     * @return the mrg place code
     */
    public String getMrgPlaceCode() {
        return mrgPlaceCode;
    }

    /**
     * Sets the mrg place code.
     * 
     * @param mrgPlaceCode
     *            the new mrg place code
     */
    public void setMrgPlaceCode(final String mrgPlaceCode) {
        this.mrgPlaceCode = mrgPlaceCode;
    }

    /**
     * Gets the other mrg place.
     * 
     * @return the other mrg place
     */
    public String getOtherMrgPlace() {
        return otherMrgPlace;
    }

    /**
     * Sets the other mrg place.
     * 
     * @param otherMrgPlace
     *            the new other mrg place
     */
    public void setOtherMrgPlace(final String otherMrgPlace) {
        this.otherMrgPlace = otherMrgPlace;
    }

    /**
     * Gets the foreign mrg flag.
     * 
     * @return the foreign mrg flag
     */
    public String getForeignMrgFlag() {
        return foreignMrgFlag;
    }

    /**
     * Sets the foreign mrg flag.
     * 
     * @param foreignMrgFlag
     *            the new foreign mrg flag
     */
    public void setForeignMrgFlag(final String foreignMrgFlag) {
        this.foreignMrgFlag = foreignMrgFlag;
    }

    /**
     * Gets the mrg yyymmdd.
     * 
     * @return the mrg yyymmdd
     */
    public String getMrgYyymmdd() {
        return mrgYyymmdd;
    }

    /**
     * Sets the mrg yyymmdd.
     * 
     * @param mrgYyymmdd
     *            the new mrg yyymmdd
     */
    public void setMrgYyymmdd(final String mrgYyymmdd) {
        this.mrgYyymmdd = mrgYyymmdd;
    }

    /**
     * Gets the ap yyymmdd.
     * 
     * @return the ap yyymmdd
     */
    public String getApYyymmdd() {
        return apYyymmdd;
    }

    /**
     * Sets the ap yyymmdd.
     * 
     * @param apYyymmdd
     *            the new ap yyymmdd
     */
    public void setApYyymmdd(final String apYyymmdd) {
        this.apYyymmdd = apYyymmdd;
    }

    /**
     * Gets the mrg witness a.
     * 
     * @return the mrg witness a
     */
    public String getMrgWitnessA() {
        return mrgWitnessA;
    }

    /**
     * Sets the mrg witness a.
     * 
     * @param mrgWitnessA
     *            the new mrg witness a
     */
    public void setMrgWitnessA(final String mrgWitnessA) {
        this.mrgWitnessA = mrgWitnessA;
    }

    /**
     * Gets the mrg witness b.
     * 
     * @return the mrg witness b
     */
    public String getMrgWitnessB() {
        return mrgWitnessB;
    }

    /**
     * Sets the mrg witness b.
     * 
     * @param mrgWitnessB
     *            the new mrg witness b
     */
    public void setMrgWitnessB(final String mrgWitnessB) {
        this.mrgWitnessB = mrgWitnessB;
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
     * Gets the child list.
     * 
     * @return the child list
     */
    public List<List<String>> getChildList() {
        return childList;
    }

    /**
     * Sets the child list.
     * 
     * @param childList
     *            the new child list
     */
    public void setChildList(final List<List<String>> childList) {
        this.childList = childList;
    }

    /**
     * Gets the apply city county1 name.
     * 
     * @return the apply city county1 name
     */
    public String getApplyCityCounty1Name() {
        return applyCityCounty1Name;
    }

    /**
     * Sets the apply city county1 name.
     * 
     * @param applyCityCounty1Name
     *            the new apply city county1 name
     */
    public void setApplyCityCounty1Name(final String applyCityCounty1Name) {
        this.applyCityCounty1Name = applyCityCounty1Name;
    }

    /**
     * Gets the apply town1 name.
     * 
     * @return the apply town1 name
     */
    public String getApplyTown1Name() {
        return applyTown1Name;
    }

    /**
     * Sets the apply town1 name.
     * 
     * @param applyTown1Name
     *            the new apply town1 name
     */
    public void setApplyTown1Name(final String applyTown1Name) {
        this.applyTown1Name = applyTown1Name;
    }

    /**
     * Gets the comm town name.
     * 
     * @return the comm town name
     */
    public String getCommTownName() {
        return commTownName;
    }

    /**
     * Sets the comm town name.
     * 
     * @param commTownName
     *            the new comm town name
     */
    public void setCommTownName(final String commTownName) {
        this.commTownName = commTownName;
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
     * Sets the gets the spouse data.
     * 
     * @param isGetSpouseData
     *            the new gets the spouse data
     */
    public void setGetSpouseData(final boolean isGetSpouseData) {
        this.isGetSpouseData = isGetSpouseData;
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
     * Gets the flag query foreign data hw flag.
     * 
     * @return the flag query foreign data hw flag
     */
    public String getFlagQueryForeignDataHWFlag() {
        return flagQueryForeignDataHWFlag;
    }

    /**
     * Sets the flag query foreign data hw flag.
     * 
     * @param flagQueryForeignDataHWFlag
     *            the new flag query foreign data hw flag
     */
    public void setFlagQueryForeignDataHWFlag(final String flagQueryForeignDataHWFlag) {
        this.flagQueryForeignDataHWFlag = flagQueryForeignDataHWFlag;
    }

    /**
     * Gets the flag get child list hw flag.
     * 
     * @return the flag get child list hw flag
     */
    public String getFlagGetChildListHWFlag() {
        return flagGetChildListHWFlag;
    }

    /**
     * Sets the flag get child list hw flag.
     * 
     * @param flagGetChildListHWFlag
     *            the new flag get child list hw flag
     */
    public void setFlagGetChildListHWFlag(final String flagGetChildListHWFlag) {
        this.flagGetChildListHWFlag = flagGetChildListHWFlag;
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
     * Gets the flag create xldf m10 m s003 hw flag.
     * 
     * @return the flag create xldf m10 m s003 hw flag
     */
    public String getFlagCreateXLDFM10MS003HWFlag() {
        return flagCreateXLDFM10MS003HWFlag;
    }

    /**
     * Sets the flag create xldf m10 m s003 hw flag.
     * 
     * @param flagCreateXLDFM10MS003HWFlag
     *            the new flag create xldf m10 m s003 hw flag
     */
    public void setFlagCreateXLDFM10MS003HWFlag(final String flagCreateXLDFM10MS003HWFlag) {
        this.flagCreateXLDFM10MS003HWFlag = flagCreateXLDFM10MS003HWFlag;
    }

    /**
     * Gets the flag create xldf m10 m r003 hw flag.
     * 
     * @return the flag create xldf m10 m r003 hw flag
     */
    public String getFlagCreateXLDFM10MR003HWFlag() {
        return flagCreateXLDFM10MR003HWFlag;
    }

    /**
     * Sets the flag create xldf m10 m r003 hw flag.
     * 
     * @param flagCreateXLDFM10MR003HWFlag
     *            the new flag create xldf m10 m r003 hw flag
     */
    public void setFlagCreateXLDFM10MR003HWFlag(final String flagCreateXLDFM10MR003HWFlag) {
        this.flagCreateXLDFM10MR003HWFlag = flagCreateXLDFM10MR003HWFlag;
    }

    /**
     * Gets the flag create xldf s003 hw flag.
     * 
     * @return the flag create xldf s003 hw flag
     */
    public String getFlagCreateXLDFS003HWFlag() {
        return flagCreateXLDFS003HWFlag;
    }

    /**
     * Sets the flag create xldf s003 hw flag.
     * 
     * @param flagCreateXLDFS003HWFlag
     *            the new flag create xldf s003 hw flag
     */
    public void setFlagCreateXLDFS003HWFlag(final String flagCreateXLDFS003HWFlag) {
        this.flagCreateXLDFS003HWFlag = flagCreateXLDFS003HWFlag;
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
     * Gets the flag create xldf r003 hw flag.
     * 
     * @return the flag create xldf r003 hw flag
     */
    public String getFlagCreateXLDFR003HWFlag() {
        return flagCreateXLDFR003HWFlag;
    }

    /**
     * Sets the flag create xldf r003 hw flag.
     * 
     * @param flagCreateXLDFR003HWFlag
     *            the new flag create xldf r003 hw flag
     */
    public void setFlagCreateXLDFR003HWFlag(final String flagCreateXLDFR003HWFlag) {
        this.flagCreateXLDFR003HWFlag = flagCreateXLDFR003HWFlag;
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
     * Gets the child030 m list.
     * 
     * @return the child030 m list
     */
    public List<XLDF030M> getChild030MList() {
        return child030MList;
    }

    /**
     * Sets the child030 m list.
     * 
     * @param child030mList
     *            the new child030 m list
     */
    public void setChild030MList(final List<XLDF030M> child030mList) {
        child030MList = child030mList;
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
     * Gets the mrg type code.
     * 
     * @return the mrg type code
     */
    public String getMrgTypeCode() {
        return mrgTypeCode;
    }

    /**
     * Sets the mrg type code.
     * 
     * @param mrgTypeCode
     *            the new mrg type code
     */
    public void setMrgTypeCode(final String mrgTypeCode) {
        this.mrgTypeCode = mrgTypeCode;
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
     * Gets the relation message.
     * 
     * @return the relation message
     */
    public String getRelationMessage() {
        return relationMessage;
    }

    /**
     * Sets the relation message.
     * 
     * @param relationMessage
     *            the new relation message
     */
    public void setRelationMessage(final String relationMessage) {
        this.relationMessage = relationMessage;
    }

    /**
     * Gets the checks if is get spouse data.
     * 
     * @return the checks if is get spouse data
     */
    public boolean getIsGetSpouseData() {
        return isGetSpouseData;
    }

    /**
     * Sets the checks if is get spouse data.
     * 
     * @param isGetSpouseData
     *            the new checks if is get spouse data
     */
    public void setIsGetSpouseData(final boolean isGetSpouseData) {
        this.isGetSpouseData = isGetSpouseData;
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
     * Checks if is outlive case.
     * 
     * @return true, if is outlive case
     */
    public boolean isOutliveCase() {
        return outliveCase;
    }

    /**
     * Sets the outlive case.
     * 
     * @param outliveCase
     *            the new outlive case
     */
    public void setOutliveCase(final boolean outliveCase) {
        this.outliveCase = outliveCase;
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
     * Gets the flag create xldf m10 h s003 hw flag.
     * 
     * @return the flag create xldf m10 h s003 hw flag
     */
    public String getFlagCreateXLDFM10HS003HWFlag() {
        return flagCreateXLDFM10HS003HWFlag;
    }

    /**
     * Sets the flag create xldf m10 h s003 hw flag.
     * 
     * @param flagCreateXLDFM10HS003HWFlag
     *            the new flag create xldf m10 h s003 hw flag
     */
    public void setFlagCreateXLDFM10HS003HWFlag(final String flagCreateXLDFM10HS003HWFlag) {
        this.flagCreateXLDFM10HS003HWFlag = flagCreateXLDFM10HS003HWFlag;
    }

    /**
     * Gets the flag create xldf m10 h r003 hw flag.
     * 
     * @return the flag create xldf m10 h r003 hw flag
     */
    public String getFlagCreateXLDFM10HR003HWFlag() {
        return flagCreateXLDFM10HR003HWFlag;
    }

    /**
     * Sets the flag create xldf m10 h r003 hw flag.
     * 
     * @param flagCreateXLDFM10HR003HWFlag
     *            the new flag create xldf m10 h r003 hw flag
     */
    public void setFlagCreateXLDFM10HR003HWFlag(final String flagCreateXLDFM10HR003HWFlag) {
        this.flagCreateXLDFM10HR003HWFlag = flagCreateXLDFM10HR003HWFlag;
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
     * Gets the hh remove year.
     * 
     * @return the hh remove year
     */
    public String getHhRemoveYear() {
        return hhRemoveYear;
    }

    /**
     * Sets the hh remove year.
     * 
     * @param hhRemoveYear
     *            the new hh remove year
     */
    public void setHhRemoveYear(final String hhRemoveYear) {
        this.hhRemoveYear = hhRemoveYear;
    }

    /**
     * Gets the hh remove mon.
     * 
     * @return the hh remove mon
     */
    public String getHhRemoveMon() {
        return hhRemoveMon;
    }

    /**
     * Sets the hh remove mon.
     * 
     * @param hhRemoveMon
     *            the new hh remove mon
     */
    public void setHhRemoveMon(final String hhRemoveMon) {
        this.hhRemoveMon = hhRemoveMon;
    }

    /**
     * Gets the hh remove day.
     * 
     * @return the hh remove day
     */
    public String getHhRemoveDay() {
        return hhRemoveDay;
    }

    /**
     * Sets the hh remove day.
     * 
     * @param hhRemoveDay
     *            the new hh remove day
     */
    public void setHhRemoveDay(final String hhRemoveDay) {
        this.hhRemoveDay = hhRemoveDay;
    }

    /**
     * Gets the hh remove hour.
     * 
     * @return the hh remove hour
     */
    public String getHhRemoveHour() {
        return hhRemoveHour;
    }

    /**
     * Sets the hh remove hour.
     * 
     * @param hhRemoveHour
     *            the new hh remove hour
     */
    public void setHhRemoveHour(final String hhRemoveHour) {
        this.hhRemoveHour = hhRemoveHour;
    }

    /**
     * Gets the hh remove min.
     * 
     * @return the hh remove min
     */
    public String getHhRemoveMin() {
        return hhRemoveMin;
    }

    /**
     * Sets the hh remove min.
     * 
     * @param hhRemoveMin
     *            the new hh remove min
     */
    public void setHhRemoveMin(final String hhRemoveMin) {
        this.hhRemoveMin = hhRemoveMin;
    }

    /**
     * Gets the hh remove sec.
     * 
     * @return the hh remove sec
     */
    public String getHhRemoveSec() {
        return hhRemoveSec;
    }

    /**
     * Sets the hh remove sec.
     * 
     * @param hhRemoveSec
     *            the new hh remove sec
     */
    public void setHhRemoveSec(final String hhRemoveSec) {
        this.hhRemoveSec = hhRemoveSec;
    }

    /**
     * Gets the ww remove year.
     * 
     * @return the ww remove year
     */
    public String getWwRemoveYear() {
        return wwRemoveYear;
    }

    /**
     * Sets the ww remove year.
     * 
     * @param wwRemoveYear
     *            the new ww remove year
     */
    public void setWwRemoveYear(final String wwRemoveYear) {
        this.wwRemoveYear = wwRemoveYear;
    }

    /**
     * Gets the ww remove mon.
     * 
     * @return the ww remove mon
     */
    public String getWwRemoveMon() {
        return wwRemoveMon;
    }

    /**
     * Sets the ww remove mon.
     * 
     * @param wwRemoveMon
     *            the new ww remove mon
     */
    public void setWwRemoveMon(final String wwRemoveMon) {
        this.wwRemoveMon = wwRemoveMon;
    }

    /**
     * Gets the ww remove day.
     * 
     * @return the ww remove day
     */
    public String getWwRemoveDay() {
        return wwRemoveDay;
    }

    /**
     * Sets the ww remove day.
     * 
     * @param wwRemoveDay
     *            the new ww remove day
     */
    public void setWwRemoveDay(final String wwRemoveDay) {
        this.wwRemoveDay = wwRemoveDay;
    }

    /**
     * Gets the ww remove hour.
     * 
     * @return the ww remove hour
     */
    public String getWwRemoveHour() {
        return wwRemoveHour;
    }

    /**
     * Sets the ww remove hour.
     * 
     * @param wwRemoveHour
     *            the new ww remove hour
     */
    public void setWwRemoveHour(final String wwRemoveHour) {
        this.wwRemoveHour = wwRemoveHour;
    }

    /**
     * Gets the ww remove min.
     * 
     * @return the ww remove min
     */
    public String getWwRemoveMin() {
        return wwRemoveMin;
    }

    /**
     * Sets the ww remove min.
     * 
     * @param wwRemoveMin
     *            the new ww remove min
     */
    public void setWwRemoveMin(final String wwRemoveMin) {
        this.wwRemoveMin = wwRemoveMin;
    }

    /**
     * Gets the ww remove sec.
     * 
     * @return the ww remove sec
     */
    public String getWwRemoveSec() {
        return wwRemoveSec;
    }

    /**
     * Sets the ww remove sec.
     * 
     * @param wwRemoveSec
     *            the new ww remove sec
     */
    public void setWwRemoveSec(final String wwRemoveSec) {
        this.wwRemoveSec = wwRemoveSec;
    }

    /**
     * Gets the certificate3 other certificate.
     * 
     * @return the certificate3 other certificate
     */
    public String getCertificate3OtherCertificate() {
        return certificate3OtherCertificate;
    }

    /**
     * Sets the certificate3 other certificate.
     * 
     * @param certificate3OtherCertificate
     *            the new certificate3 other certificate
     */
    public void setCertificate3OtherCertificate(final String certificate3OtherCertificate) {
        this.certificate3OtherCertificate = certificate3OtherCertificate;
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
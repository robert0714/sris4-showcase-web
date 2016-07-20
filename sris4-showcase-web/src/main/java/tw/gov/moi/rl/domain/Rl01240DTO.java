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
import tw.gov.moi.domain.Rcdf001mrlType;
import tw.gov.moi.domain.Tldf004mType;
import tw.gov.moi.domain.XldfefaplcType;
import tw.gov.moi.rl.common.constant.RlConstant;
import tw.gov.moi.rl.component.dto.OpeningOperationDTO;
import tw.gov.moi.rl.component.xldf.dto.XCDF001MRL;
import tw.gov.moi.rl.component.xldf.dto.XLDFY004H;
import tw.gov.moi.rl.component.xldf.dto.XLDFY004M;
import tw.gov.moi.rl.domain.xldf.XLDFHouseholdDataDomainObject;
import tw.gov.moi.rl.domain.xldf.XLDFPersonDataDomainObject;
import tw.gov.moi.rl.domain.xldf.XLDFPersonNoteDomainObject;

/**
 * 離婚登記DTO.
 * 
 * @author josh
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Rl01240DTO", propOrder = { "transactionId", "acceptSiteId", "userId", "initTime", "xldfy004mList",
        "xldfy004hList", "finePerson", "targetPersonFlag", "nonTargetPerson", "mrgYyymmdd", "foreignNotify",
        "devYyymmdd", "apYyymmdd", "devTypeCode", "devPlaceCode", "otherDevPlace", "flagCreateXLDF009SHWFlag",
        "applyTypeFlag", "mrgTypeCode", "devPlace", "otherMrgPlace", "flagCreateXLDF088THWFlag", "enforcedFlag",
        "enforcedApplicant", "devWitnessA", "devWitnessB", "registerDate", "registerTime", "applyDate", "executeDate",
        "applicant1", "applicant2", "delegatedPerson", "otherCertificate", "certificateList", "personNoteList",
        "certificateFlag", "registerContent", "openingOperationDTO", "hhPersonId", "hhSiteId", "hhOrgMarriageCode",
        "hhRemoveDate", "hhRemoveTime", "hhRemoveYear", "hhRemoveMon", "hhRemoveDay", "hhRemoveHour", "hhRemoveMin",
        "hhRemoveSec", "hhOutliveCaseFlag", "hhAttorneyFlag", "hhPersonRole", "hhNationalityFlag",
        "hhNationalityCountry", "hhNationalityEname", "hhMrgStatusBCode", "hhAttorneyCode", "hhNowStateCode",
        "hhHouseholdState", "hhEducationName", "hhOrgEducationMark", "wwPersonId", "wwSiteId", "wwOrgMarriageCode",
        "wwRemoveDate", "wwRemoveTime", "wwRemoveYear", "wwRemoveMon", "wwRemoveDay", "wwRemoveHour", "wwRemoveMin",
        "wwRemoveSec", "wwOutliveCaseFlag", "wwAttorneyFlag", "wwNationalityFlag", "wwNationalityCountry",
        "wwNationalityEname", "wwPersonRole", "wwMrgStatusBCode", "wwAttorneyCode", "wwNowStateCode",
        "wwHouseholdState", "wwEducationName", "wwOrgEducationMark", "mrgStatusFlag", "flagQueryForeignDataHWFlag",
        "flagGetSpouseDataHWFlag", "husbandHouseholdData", "husbandHPersonData", "hhMainPersonData",
        "hhMainPersonForeignPersonData", "hhMainPersonSimpleForeignRoleDTO", "wifeHouseholdData", "wifeHPersonData",
        "wwMainPersonData", "wwMainPersonForeignPersonData", "wwMainPersonSimpleForeignRoleDTO",
        "acceptAdminOfficeCode", "childrenTypeCode", "childrenKindCode", "applySequenceId", "needFineFlag",
        "removeFeeReason", "operateDate", "hhChildList", "wwChildList", "childList", "hhInfoFlag", "wwInfoFlag",
        "warningMessgeList", "initErrorMessageList", "fatSuperVise", "motSuperVise", "togetherSuperVise",
        "otherSuperVise", "nonSupervise", "nonSupervise1", "nonSupervise2", "nonSupervise3", "nonSupervise4",
        "nonSupervise5", "otherNonSupervise", "receiptId", "punishFlag", "modifyToUnPunish", "checkFine",
        "doFineCheckFlag", "deleteFineDTOFlag", "previousDoFineCheckFlag", "previousFineEventDate", "fineFreeFlag",
        "doFineCheckFlagOpen", "fineDTO", "fineSerialNumber", "fineEventDate", "applyCode", "feeAmount", "outliveCase",
        "otherCertificateFlag", "flagCreateXLDFM10MS004HWFlag", "flagCreateXLDFM10MR004HWFlag",
        "flagCreateXLDFM10HS004HWFlag", "flagCreateXLDFM10HR004HWFlag", "flagCreateXLDF008SHWFlag",
        "flagCreateXLDFS004HWFlag", "flagCreateXLDFR004HWFlag", "mrgXCDF001MRLMap", "initSuccess", "activeIndex",
        "foreignPerson", "lockMode" })
@XmlRootElement(name = "Rl01240DTO")
public class Rl01240DTO implements Serializable {

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

    /** 個人記事欄位化-現戶物件清單. */
    @XmlElement(name = "Xldfy004mList", required = true)
    @FieldName("個人記事欄位化-現戶物件清單")
    private List<XLDFY004M> xldfy004mList = new ArrayList<XLDFY004M>();

    /** 個人記事欄位化-除戶物件清單. */
    @XmlElement(name = "Xldfy004hList", required = true)
    @FieldName("個人記事欄位化-除戶物件清單")
    private List<XLDFY004H> xldfy004hList = new ArrayList<XLDFY004H>();

    /** 受處分人. */
    @XmlElement(name = "FinePerson", required = true)
    @FieldName("受處分人")
    private XLDFApplicantDataDTO finePerson = new XLDFApplicantDataDTO();

    /** 大簿當事人註記 h表示夫 w表示妻. */
    @XmlElement(name = "TargetPersonFlag", required = true)
    @FieldName("大簿當事人註記 h表示夫 w表示妻")
    private String targetPersonFlag;

    /** 非大簿當事人註記(h:夫、 w:妻). */
    @XmlElement(name = "NonTargetPerson", required = true)
    @FieldName("非大簿當事人註記(h:夫、 w:妻)")
    private String nonTargetPerson;

    /** 結婚日期. */
    @XmlElement(name = "MrgYyymmdd", required = true)
    @FieldName("結婚日期")
    private String mrgYyymmdd;

    /** 憑駐外館處通報. */
    @XmlElement(name = "ForeignNotify", required = true)
    @FieldName("憑駐外館處通報")
    private String foreignNotify = RlConstant.STRING_TWO;

    /** 離婚生效日期. */
    @XmlElement(name = "DevYyymmdd", required = true)
    @FieldName("離婚生效日期")
    private String devYyymmdd;

    /** 離婚申請日期. */
    @XmlElement(name = "ApYyymmdd", required = true)
    @FieldName("離婚申請日期")
    private String apYyymmdd;

    /** 離婚種類. */
    @XmlElement(name = "DevTypeCode", required = true)
    @FieldName("離婚種類")
    private String devTypeCode;

    /** devPlaceCode. */
    @XmlElement(name = "DevPlaceCode", required = true)
    @FieldName("離婚地點")
    private String devPlaceCode;

    /** 其它離婚地點. */
    @XmlElement(name = "OtherDevPlace", required = true)
    @FieldName("其它離婚地點")
    private String otherDevPlace;

    /** createxldf009 flag. */
    @XmlElement(name = "FlagCreateXLDF009SHWFlag", required = true)
    @FieldName("createxldf009 flag")
    private String flagCreateXLDF009SHWFlag;

    /** 申請種類. */
    @XmlElement(name = "ApplyTypeFlag", required = true)
    @FieldName("申請種類")
    private String applyTypeFlag;

    /** 婚姻類別代碼. */
    @XmlElement(name = "MrgTypeCode", required = true)
    @FieldName("婚姻類別代碼")
    private String mrgTypeCode;

    /** 結(離)婚地點. */
    @XmlElement(name = "DevPlace", required = true)
    @FieldName("結(離)婚地點")
    private String devPlace;

    /** 其它結(離)婚地點. */
    @XmlElement(name = "OtherMrgPlace", required = true)
    @FieldName("其它結(離)婚地點")
    private String otherMrgPlace;

    /** createxldf088 flag. */
    @XmlElement(name = "flagCreateXLDF088THWFlag", required = true)
    @FieldName("xldf088flag")
    private String flagCreateXLDF088THWFlag;

    /** 逕為登記旗標. */
    @XmlElement(name = "enforcedFlag", required = true)
    @FieldName("逕為登記")
    private boolean enforcedFlag;

    /** 逕為登記申請人. */
    @XmlElement(name = "EnforcedApplicant", required = true)
    @FieldName("逕為登記申請人")
    private XldfefaplcType enforcedApplicant;

    /** 證人(1). */
    @XmlElement(name = "DevWitnessA", required = true)
    @FieldName("證人(1)")
    private String devWitnessA;

    /** 證人(2). */
    @XmlElement(name = "DevWitnessB", required = true)
    @FieldName("證人(2)")
    private String devWitnessB;

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

    /** 生效日期. */
    @XmlElement(name = "ExecuteDate", required = true)
    @FieldName("生效日期")
    private String executeDate;

    /** 申請人1. */
    @XmlElement(name = "Applicant1", required = true)
    @FieldName("申請人1")
    private XLDFApplicantDataDTO applicant1;

    /** 申請人2. */
    @XmlElement(name = "Applicant2", required = true)
    @FieldName("申請人2")
    private XLDFApplicantDataDTO applicant2;

    /** 委託人. */
    @XmlElement(name = "DelegatedPerson", required = true)
    @FieldName("委託人")
    private XLDFPersonBriefDataDTO delegatedPerson;

    /** 其它附繳證件. */
    @XmlElement(name = "OtherCertificate", required = true)
    @FieldName("其它附繳證件")
    private String otherCertificate;

    /** 申請資料【附繳證件】. */
    @XmlElement(name = "CertificateList", required = true)
    @FieldName("申請資料附繳證件")
    private List<String> certificateList = new ArrayList<String>();

    /** The person note list. */
    @XmlElement(name = "PersonNoteList", required = true)
    @FieldName("個人記事清單")
    List<XLDFPersonNoteDomainObject> personNoteList = new ArrayList<XLDFPersonNoteDomainObject>();

    /** 附繳證件Flag. */
    @XmlElement(name = "CertificateFlag", required = true)
    @FieldName("附繳證件Flag")
    private String certificateFlag;

    /** 備註. */
    @XmlElement(name = "RegisterContent", required = true)
    @FieldName("備註")
    private String registerContent;

    /** 大簿控制各作業之資訊. */
    @XmlElement(name = "OpeningOperationDTO", required = true)
    @FieldName("大簿控制各作業之資訊")
    private OpeningOperationDTO openingOperationDTO;

    /** (夫)統號. */
    @XmlElement(name = "HhPersonId", required = true)
    @FieldName("(夫)統號")
    private String hhPersonId;

    /** (夫)作業點代碼. */
    @XmlElement(name = "HhSiteId", required = true)
    @FieldName("(夫)作業點代碼")
    private String hhSiteId;

    /** (夫)原婚姻代碼. */
    @XmlElement(name = "HhOrgMarriageCode", required = true)
    @FieldName("(夫)原婚姻代碼")
    private String hhOrgMarriageCode;

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

    /** (夫)非現住人口處理註記. */
    @XmlElement(name = "HhOutliveCaseFlag", required = true)
    @FieldName("(夫)非現住人口處理註記")
    private String hhOutliveCaseFlag;

    /** 夫-法定代理人同意-旗標. */
    @XmlElement(name = "HhAttorneyFlag", required = true)
    @FieldName("夫-法定代理人同意")
    private String hhAttorneyFlag;

    /** 夫-身分. */
    @XmlElement(name = "HhPersonRole", required = true)
    @FieldName("夫-身分")
    private String hhPersonRole;

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

    /** 夫-婚前婚姻狀況代碼. */
    @XmlElement(name = "HhMrgStatusBCode", required = true)
    @FieldName("夫-婚前婚姻狀況代碼")
    private String hhMrgStatusBCode;

    /** 夫-當事人是否有民法1049條之情事代碼. */
    @XmlElement(name = "HhAttorneyCode", required = true)
    @FieldName("夫-當事人是否有民法1049條之情事代碼")
    private String hhAttorneyCode;

    /** (夫)戶籍現況. */
    @XmlElement(name = "HhNowStateCode", required = true)
    @FieldName("(夫)戶籍現況")
    private String hhNowStateCode;

    /** (夫)戶籍簿頁狀態（M現戶）、（H除戶）. */
    @XmlElement(name = "HhHouseholdState", required = true)
    @FieldName("(夫)戶籍簿頁狀態（M現戶）、（H除戶）")
    private String hhHouseholdState;

    /** (夫)教育程度. */
    @XmlElement(name = "HhEducationName", required = true)
    @FieldName("(夫)教育程度")
    private String hhEducationName;

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

    /** (妻)原婚姻狀況. */
    @XmlElement(name = "WwOrgMarriageCode", required = true)
    @FieldName("(妻)原婚姻狀況")
    private String wwOrgMarriageCode;

    /** (妻)除戶日期. */
    @XmlElement(name = "WwRemoveDate", required = true)
    @FieldName("妻-資料儲存地作業點代碼")
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

    /** (妻)非現住人口處理註記. */
    @XmlElement(name = "WwOutliveCaseFlag", required = true)
    @FieldName("(妻)非現住人口處理註記")
    private String wwOutliveCaseFlag;

    /** 妻-法定代理人同意-旗標. */
    @XmlElement(name = "WwAttorneyFlag", required = true)
    @FieldName("妻-法定代理人同意-旗標")
    private String wwAttorneyFlag;

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

    /** 妻-者身分. */
    @XmlElement(name = "WwPersonRole", required = true)
    @FieldName("妻-者身分")
    private String wwPersonRole;

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

    /** (妻)戶籍簿頁狀態（M現戶）、（H除戶）. */
    @XmlElement(name = "WwHouseholdState", required = true)
    @FieldName("(妻)戶籍簿頁狀態（M現戶）、（H除戶）")
    private String wwHouseholdState;

    /** (妻)教育程度. */
    @XmlElement(name = "HhEducationName", required = true)
    @FieldName("(妻)教育程度")
    private String wwEducationName;

    /** (妻)原教育程度註記. */
    @XmlElement(name = "WwOrgEducationMark", required = true)
    @FieldName("(妻)原教育程度註記")
    private String wwOrgEducationMark;

    /** 婚姻狀況Flag. */
    @XmlElement(name = "MrgStatusFlag", required = true)
    @FieldName("婚姻狀況Flag")
    private String mrgStatusFlag;

    /** The flag query foreign data hw flag. */
    @XmlElement(name = "FlagQueryForeignDataHWFlag", required = true)
    @FieldName("The flag query foreign data hw flag.")
    private String flagQueryForeignDataHWFlag;

    /** The flag get spouse data hw flag. */
    @XmlElement(name = "FlagGetSpouseDataHWFlag", required = true)
    @FieldName("The flag get spouse data hw flag.")
    private String flagGetSpouseDataHWFlag;

    /** (夫)全戶基本資料. */
    @XmlElement(name = "HusbandHouseholdData", required = true)
    @FieldName("(夫)全戶基本資料")
    private XLDFHouseholdDataDomainObject husbandHouseholdData;

    /** (夫)戶長個人基本資料. */
    @XmlElement(name = "HusbandHPersonData", required = true)
    @FieldName("(夫)戶長個人基本資料")
    private XLDFPersonDataDomainObject husbandHPersonData;

    /** (夫)個人基本資料. */
    @XmlElement(name = "HhMainPersonData", required = true)
    @FieldName("(夫)個人基本資料")
    private XLDFPersonDataDomainObject hhMainPersonData;

    /** (夫)外籍者資料1. */
    @XmlElement(name = "HhMainPersonForeignPersonData", required = true)
    @FieldName("(夫)外籍者資料1")
    private XLDFForeignPersonDTO hhMainPersonForeignPersonData = new XLDFForeignPersonDTO();

    /** (夫)外籍者資料2. */
    @XmlElement(name = "HhMainPersonSimpleForeignRoleDTO", required = true)
    @FieldName("(夫)外籍者資料")
    private XLDFSimpleForeignRoleDTO hhMainPersonSimpleForeignRoleDTO = new XLDFSimpleForeignRoleDTO(StringUtils.EMPTY,
            StringUtils.EMPTY, StringUtils.EMPTY);

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
    @FieldName("(妻)外籍者資料")
    private XLDFPersonDataDomainObject wwMainPersonData;

    /** (妻)外籍者資料1. */
    @XmlElement(name = "WwMainPersonForeignPersonData", required = true)
    @FieldName("(妻)外籍者資料1")
    private XLDFForeignPersonDTO wwMainPersonForeignPersonData = new XLDFForeignPersonDTO();

    /** (妻)外籍者資料2. */
    @XmlElement(name = "WwMainPersonSimpleForeignRoleDTO", required = true)
    @FieldName("(妻)外籍者資料2")
    private XLDFSimpleForeignRoleDTO wwMainPersonSimpleForeignRoleDTO = new XLDFSimpleForeignRoleDTO(StringUtils.EMPTY,
            StringUtils.EMPTY, StringUtils.EMPTY);

    /** 受理地戶所代碼. */
    @XmlElement(name = "AcceptAdminOfficeCode", required = true)
    @FieldName("受理地戶所代碼")
    private String acceptAdminOfficeCode;

    /** 未成年子女權利義務行使負擔人. */
    @XmlElement(name = "ChildrenTypeCode", required = true)
    @FieldName("未成年子女權利義務行使負擔人")
    private String childrenTypeCode;

    /** 未成年子女權利義務行使負擔人. */
    @XmlElement(name = "ChildrenKindCode", required = true)
    @FieldName("未成年子女權利義務行使負擔人")
    private String childrenKindCode;

    /** 作業順序編號. */
    @XmlElement(name = "ApplySequenceId", required = true)
    @FieldName("作業順序編號")
    private String applySequenceId;

    /** 須進行罰鍰處理. */
    @XmlElement(name = "NeedFineFlag", required = true)
    @FieldName("須進行罰鍰處理")
    private String needFineFlag;

    /** The remove fee reason. */
    @XmlElement(name = "RemoveFeeReason", required = true)
    @FieldName("免罰原因")
    private String removeFeeReason;

    /** 系統日期. */
    @XmlElement(name = "OperateDate", required = true)
    @FieldName("系統日期")
    private String operateDate;

    /** (夫)戶下未成年子女清單. */
    @XmlElement(name = "HhChildList", required = true)
    @FieldName("(夫)戶下未成年子女清單")
    private List<XLDFPersonDataDomainObject> hhChildList = new ArrayList<XLDFPersonDataDomainObject>();

    /** (妻)戶下未成年子女清單. */
    @XmlElement(name = "WwChildList", required = true)
    @FieldName("(妻)戶下未成年子女清單")
    private List<XLDFPersonDataDomainObject> wwChildList = new ArrayList<XLDFPersonDataDomainObject>();

    /** 子女資料清單. */
    @XmlElement(name = "childList", required = true)
    @FieldName("子女資料清單")
    private List<Rcdf001mrlType> childList = new ArrayList<Rcdf001mrlType>();

    /** 夫頁面[取得]button Flag. */
    @XmlElement(name = "HhInfoFlag", required = true)
    @FieldName("夫頁面[取得]button Flag")
    private boolean hhInfoFlag = false;

    /** 妻頁面[取得]button Flag. */
    @XmlElement(name = "WwInfoFlag", required = true)
    @FieldName("妻頁面[取得]button Flag")
    private boolean wwInfoFlag = false;

    /** 警告訊息清單. */
    @XmlElement(name = "WarningMessgeList", required = true)
    @FieldName("警告訊息清單 ")
    private List<RlWarningMessage> warningMessgeList = new ArrayList<RlWarningMessage>();

    /** 初始離婚登記時的錯誤訊息清單. */
    @XmlElement(name = "InitErrorMessageList", required = true)
    @FieldName("初始離婚登記時的錯誤訊息清單")
    private List<List<String>> initErrorMessageList = new ArrayList<List<String>>();

    /** The fat super vise. */
    @XmlElement(name = "FatSuperVise", required = true)
    @FieldName("未成年子女權利義務行使負擔人是父")
    private String fatSuperVise = "0";

    /** The mot super vise. */
    @XmlElement(name = "MotSuperVise", required = true)
    @FieldName("未成年子女權利義務行使負擔人是母")
    private String motSuperVise = "0";

    /** The together super vise. */
    @XmlElement(name = "TogetherSuperVise", required = true)
    @FieldName("未成年子女權利義務行使負擔人是父母共同")
    private String togetherSuperVise = "0";

    /** The other super vise. */
    @XmlElement(name = "OtherSuperVise", required = true)
    @FieldName("未成年子女權利義務行使負擔人是其他")
    private String otherSuperVise = "0";

    /** The non supervise. */
    @XmlElement(name = "NonSupervise", required = true)
    @FieldName("未成年子女權利義務行使負擔人")
    private String nonSupervise;

    /** The non supervise1. */
    @XmlElement(name = "NonSupervise1", required = true)
    @FieldName("(子女已成年)未成年子女權利義務行使負擔人")
    private String nonSupervise1;

    /** The non supervise2. */
    @XmlElement(name = "NonSupervise2", required = true)
    @FieldName("(無子女)未成年子女權利義務行使負擔人")
    private String nonSupervise2;

    /** The non supervise3. */
    @XmlElement(name = "NonSupervise3", required = true)
    @FieldName("(未約定)未成年子女權利義務行使負擔人")
    private String nonSupervise3;

    /** The non supervise4. */
    @XmlElement(name = "NonSupervise4", required = true)
    @FieldName("(非適格申請人)未成年子女權利義務行使負擔人")
    private String nonSupervise4;

    /** The non supervise5. */
    @XmlElement(name = "NonSupervise5", required = true)
    @FieldName("(其他)未成年子女權利義務行使負擔人")
    private String nonSupervise5;

    /** The other non supervise. */
    @XmlElement(name = "OtherNonSupervise", required = true)
    @FieldName("(其他)未成年子女權利義務行使負擔人")
    private String otherNonSupervise;

    /** 收據號碼. */
    @XmlElement(name = "ReceiptId", required = true)
    @FieldName("收據號碼")
    private String receiptId;

    /** The punish flag. */
    @XmlElement(name = "IsPunish", required = true)
    @FieldName("是否需要罰鍰")
    private boolean punishFlag = false;

    /** The modify to un punish. */
    @XmlElement(name = "ModifyToUnPunish", required = true)
    @FieldName("改為免罰")
    private boolean modifyToUnPunish;

    /** The check fine. */
    @XmlElement(name = "CheckFine", required = true)
    @FieldName("進行逾期申報之罰鍰檢視")
    private boolean checkFine;

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
    private String applyCode = RlConstant.STRING_ZERO_ZERO_FOUR;

    /** 戶籍罰鍰金鍰. */
    @XmlElement(name = "FeeAmount", required = true)
    @FieldName("戶籍罰鍰金鍰")
    private String feeAmount;

    /** 執行現戶/除戶登記. */
    @XmlElement(name = "OutliveCase", required = true)
    @FieldName("執行現戶/除戶登記")
    private boolean outliveCase = false;

    /** 旗標:其他附繳證件. */
    @XmlElement(name = "OtherCertificateFlag", required = true)
    @FieldName("旗標:其他附繳證件")
    private boolean otherCertificateFlag = false;

    /** 旗標:createxldfm10m flag(s004). */
    @XmlElement(name = "FlagCreateXLDFM10MS004HWFlag", required = true)
    @FieldName("旗標:createxldfm10m flag(s004)")
    private String flagCreateXLDFM10MS004HWFlag;

    /** 旗標:createxldfm10m flag(r004). */
    @XmlElement(name = "FlagCreateXLDFM10MR004HWFlag", required = true)
    @FieldName("旗標:createxldfm10m flag(r004)")
    private String flagCreateXLDFM10MR004HWFlag;

    /** 旗標:createxldfm10h flag(s003). */
    @XmlElement(name = "FlagCreateXLDFM10Hs004HWFlag", required = true)
    @FieldName("旗標:createxldfm10h flag(s004)")
    private String flagCreateXLDFM10HS004HWFlag;

    /** 旗標:createxldfm10h flag(r004). */
    @XmlElement(name = "FlagCreateXLDFM10HR004HWFlag", required = true)
    @FieldName("旗標:createxldfm10h flag(r004)")
    private String flagCreateXLDFM10HR004HWFlag;

    /** 旗標:建立xldf008s flag. */
    @XmlElement(name = "FlagCreateXLDF008SHWFlag", required = true)
    @FieldName("旗標:建立xldf008s flag")
    private String flagCreateXLDF008SHWFlag;

    /** 旗標:建立xldfs004 flag. */
    @XmlElement(name = "FlagCreateXLDFS004HWFlag", required = true)
    @FieldName("旗標:建立xldfs004 flag")
    private String flagCreateXLDFS004HWFlag;

    /** 旗標:建立xldfr004 flag. */
    @XmlElement(name = "FlagCreateXLDFR004HWFlag", required = true)
    @FieldName("旗標:建立xldfr004 flag")
    private String flagCreateXLDFR004HWFlag;

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
     * Gets the execute date.
     * 
     * @return the execute date
     */
    public String getExecuteDate() {
        return executeDate;
    }

    /**
     * Sets the execute date.
     * 
     * @param executeDate
     *            the new execute date
     */
    public void setExecuteDate(final String executeDate) {
        this.executeDate = executeDate;
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
     * Gets the certificate flag.
     * 
     * @return the certificate flag
     */
    public String getCertificateFlag() {
        return certificateFlag;
    }

    /**
     * Sets the certificate flag.
     * 
     * @param certificateFlag
     *            the new certificate flag
     */
    public void setCertificateFlag(final String certificateFlag) {
        this.certificateFlag = certificateFlag;
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
     * Gets the hh mrg status b code.
     * 
     * @return the hh mrg status b code
     */
    public String getHhMrgStatusBCode() {
        return hhMrgStatusBCode;
    }

    /**
     * Gets the applicant1.
     * 
     * @return the applicant1
     */
    public XLDFApplicantDataDTO getApplicant1() {
        return applicant1;
    }

    /**
     * Sets the applicant1.
     * 
     * @param applicant1
     *            the new applicant1
     */
    public void setApplicant1(final XLDFApplicantDataDTO applicant1) {
        this.applicant1 = applicant1;
    }

    /**
     * Gets the applicant2.
     * 
     * @return the applicant2
     */
    public XLDFApplicantDataDTO getApplicant2() {
        return applicant2;
    }

    /**
     * Sets the applicant2.
     * 
     * @param applicant2
     *            the new applicant2
     */
    public void setApplicant2(final XLDFApplicantDataDTO applicant2) {
        this.applicant2 = applicant2;
    }

    /**
     * Gets the delegated person.
     * 
     * @return the delegated person
     */
    public XLDFPersonBriefDataDTO getDelegatedPerson() {
        return delegatedPerson;
    }

    /**
     * Sets the delegated person.
     * 
     * @param delegatedPerson
     *            the new delegated person
     */
    public void setDelegatedPerson(final XLDFPersonBriefDataDTO delegatedPerson) {
        this.delegatedPerson = delegatedPerson;
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
     * Gets the foreign notify.
     * 
     * @return the foreign notify
     */
    public String getForeignNotify() {
        return foreignNotify;
    }

    /**
     * Sets the foreign notify.
     * 
     * @param foreignNotify
     *            the new foreign notify
     */
    public void setForeignNotify(final String foreignNotify) {
        this.foreignNotify = foreignNotify;
    }

    /**
     * Gets the dev yyymmdd.
     * 
     * @return the dev yyymmdd
     */
    public String getDevYyymmdd() {
        return devYyymmdd;
    }

    /**
     * Sets the dev yyymmdd.
     * 
     * @param devYyymmdd
     *            the new dev yyymmdd
     */
    public void setDevYyymmdd(final String devYyymmdd) {
        this.devYyymmdd = devYyymmdd;
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
     * Gets the dev type code.
     * 
     * @return the dev type code
     */
    public String getDevTypeCode() {
        return devTypeCode;
    }

    /**
     * Sets the dev type code.
     * 
     * @param devTypeCode
     *            the new dev type code
     */
    public void setDevTypeCode(final String devTypeCode) {
        this.devTypeCode = devTypeCode;
    }

    /**
     * Gets the dev place code.
     * 
     * @return the dev place code
     */
    public String getDevPlaceCode() {
        return devPlaceCode;
    }

    /**
     * Sets the dev place code.
     * 
     * @param devPlaceCode
     *            the new dev place code
     */
    public void setDevPlaceCode(final String devPlaceCode) {
        this.devPlaceCode = devPlaceCode;
    }

    /**
     * Gets the other dev place.
     * 
     * @return the other dev place
     */
    public String getOtherDevPlace() {
        return otherDevPlace;
    }

    /**
     * Sets the other dev place.
     * 
     * @param otherDevPlace
     *            the new other dev place
     */
    public void setOtherDevPlace(final String otherDevPlace) {
        this.otherDevPlace = otherDevPlace;
    }

    /**
     * Gets the dev witness a.
     * 
     * @return the dev witness a
     */
    public String getDevWitnessA() {
        return devWitnessA;
    }

    /**
     * Sets the dev witness a.
     * 
     * @param devWitnessA
     *            the new dev witness a
     */
    public void setDevWitnessA(final String devWitnessA) {
        this.devWitnessA = devWitnessA;
    }

    /**
     * Gets the dev witness b.
     * 
     * @return the dev witness b
     */
    public String getDevWitnessB() {
        return devWitnessB;
    }

    /**
     * Sets the dev witness b.
     * 
     * @param devWitnessB
     *            the new dev witness b
     */
    public void setDevWitnessB(final String devWitnessB) {
        this.devWitnessB = devWitnessB;
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
     * Gets the dev place.
     * 
     * @return the dev place
     */
    public String getDevPlace() {
        return devPlace;
    }

    /**
     * Sets the dev place.
     * 
     * @param devPlace
     *            the new dev place
     */
    public void setDevPlace(final String devPlace) {
        this.devPlace = devPlace;
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
     * Gets the children type code.
     * 
     * @return the children type code
     */
    public String getChildrenTypeCode() {
        return childrenTypeCode;
    }

    /**
     * Sets the children type code.
     * 
     * @param childrenTypeCode
     *            the new children type code
     */
    public void setChildrenTypeCode(final String childrenTypeCode) {
        this.childrenTypeCode = childrenTypeCode;
    }

    /**
     * Gets the hh child list.
     * 
     * @return the hh child list
     */
    public List<XLDFPersonDataDomainObject> getHhChildList() {
        return hhChildList;
    }

    /**
     * Sets the hh child list.
     * 
     * @param hhChildList
     *            the new hh child list
     */
    public void setHhChildList(final List<XLDFPersonDataDomainObject> hhChildList) {
        this.hhChildList = hhChildList;
    }

    /**
     * Gets the ww child list.
     * 
     * @return the ww child list
     */
    public List<XLDFPersonDataDomainObject> getWwChildList() {
        return wwChildList;
    }

    /**
     * Sets the ww child list.
     * 
     * @param wwChildList
     *            the new ww child list
     */
    public void setWwChildList(final List<XLDFPersonDataDomainObject> wwChildList) {
        this.wwChildList = wwChildList;
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
     * Checks if is punish flag.
     * 
     * @return true, if is punish flag
     */
    public boolean isPunishFlag() {
        return punishFlag;
    }

    /**
     * Sets the punish flag.
     * 
     * @param punishFlag
     *            the new punish flag
     */
    public void setPunishFlag(final boolean punishFlag) {
        this.punishFlag = punishFlag;
    }

    /**
     * Checks if is modify to un punish.
     * 
     * @return true, if is modify to un punish
     */
    public boolean isModifyToUnPunish() {
        return modifyToUnPunish;
    }

    /**
     * Sets the modify to un punish.
     * 
     * @param modifyToUnPunish
     *            the new modify to un punish
     */
    public void setModifyToUnPunish(final boolean modifyToUnPunish) {
        this.modifyToUnPunish = modifyToUnPunish;
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
     * Gets the fat super vise.
     * 
     * @return the fat super vise
     */
    public String getFatSuperVise() {
        return fatSuperVise;
    }

    /**
     * Sets the fat super vise.
     * 
     * @param fatSuperVise
     *            the new fat super vise
     */
    public void setFatSuperVise(final String fatSuperVise) {
        this.fatSuperVise = fatSuperVise;
    }

    /**
     * Gets the mot super vise.
     * 
     * @return the mot super vise
     */
    public String getMotSuperVise() {
        return motSuperVise;
    }

    /**
     * Sets the mot super vise.
     * 
     * @param motSuperVise
     *            the new mot super vise
     */
    public void setMotSuperVise(final String motSuperVise) {
        this.motSuperVise = motSuperVise;
    }

    /**
     * Gets the together super vise.
     * 
     * @return the together super vise
     */
    public String getTogetherSuperVise() {
        return togetherSuperVise;
    }

    /**
     * Sets the together super vise.
     * 
     * @param togetherSuperVise
     *            the new together super vise
     */
    public void setTogetherSuperVise(final String togetherSuperVise) {
        this.togetherSuperVise = togetherSuperVise;
    }

    /**
     * Gets the other super vise.
     * 
     * @return the other super vise
     */
    public String getOtherSuperVise() {
        return otherSuperVise;
    }

    /**
     * Sets the other super vise.
     * 
     * @param otherSuperVise
     *            the new other super vise
     */
    public void setOtherSuperVise(final String otherSuperVise) {
        this.otherSuperVise = otherSuperVise;
    }

    /**
     * Gets the children kind code.
     * 
     * @return the children kind code
     */
    public String getChildrenKindCode() {
        return childrenKindCode;
    }

    /**
     * Sets the children kind code.
     * 
     * @param childrenKindCode
     *            the new children kind code
     */
    public void setChildrenKindCode(final String childrenKindCode) {
        this.childrenKindCode = childrenKindCode;
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
     * Gets the xldfy004m list.
     * 
     * @return the xldfy004m list
     */
    public List<XLDFY004M> getXldfy004mList() {
        return xldfy004mList;
    }

    /**
     * Sets the xldfy004m list.
     * 
     * @param xldfy004mList
     *            the new xldfy004m list
     */
    public void setXldfy004mList(final List<XLDFY004M> xldfy004mList) {
        this.xldfy004mList = xldfy004mList;
    }

    /**
     * Gets the non supervise.
     * 
     * @return the non supervise
     */
    public String getNonSupervise() {
        return nonSupervise;
    }

    /**
     * Sets the non supervise.
     * 
     * @param nonSupervise
     *            the new non supervise
     */
    public void setNonSupervise(final String nonSupervise) {
        this.nonSupervise = nonSupervise;
    }

    /**
     * Gets the other non supervise.
     * 
     * @return the other non supervise
     */
    public String getOtherNonSupervise() {
        return otherNonSupervise;
    }

    /**
     * Sets the other non supervise.
     * 
     * @param otherNonSupervise
     *            the new other non supervise
     */
    public void setOtherNonSupervise(final String otherNonSupervise) {
        this.otherNonSupervise = otherNonSupervise;
    }

    /**
     * Gets the non supervise1.
     * 
     * @return the non supervise1
     */
    public String getNonSupervise1() {
        return nonSupervise1;
    }

    /**
     * Sets the non supervise1.
     * 
     * @param nonSupervise1
     *            the new non supervise1
     */
    public void setNonSupervise1(final String nonSupervise1) {
        this.nonSupervise1 = nonSupervise1;
    }

    /**
     * Gets the non supervise2.
     * 
     * @return the non supervise2
     */
    public String getNonSupervise2() {
        return nonSupervise2;
    }

    /**
     * Sets the non supervise2.
     * 
     * @param nonSupervise2
     *            the new non supervise2
     */
    public void setNonSupervise2(final String nonSupervise2) {
        this.nonSupervise2 = nonSupervise2;
    }

    /**
     * Gets the non supervise3.
     * 
     * @return the non supervise3
     */
    public String getNonSupervise3() {
        return nonSupervise3;
    }

    /**
     * Sets the non supervise3.
     * 
     * @param nonSupervise3
     *            the new non supervise3
     */
    public void setNonSupervise3(final String nonSupervise3) {
        this.nonSupervise3 = nonSupervise3;
    }

    /**
     * Gets the non supervise4.
     * 
     * @return the non supervise4
     */
    public String getNonSupervise4() {
        return nonSupervise4;
    }

    /**
     * Sets the non supervise4.
     * 
     * @param nonSupervise4
     *            the new non supervise4
     */
    public void setNonSupervise4(final String nonSupervise4) {
        this.nonSupervise4 = nonSupervise4;
    }

    /**
     * Gets the non supervise5.
     * 
     * @return the non supervise5
     */
    public String getNonSupervise5() {
        return nonSupervise5;
    }

    /**
     * Sets the non supervise5.
     * 
     * @param nonSupervise5
     *            the new non supervise5
     */
    public void setNonSupervise5(final String nonSupervise5) {
        this.nonSupervise5 = nonSupervise5;
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
     * Gets the hh main person foreign person data.
     * 
     * @return the hh main person foreign person data
     */
    public XLDFForeignPersonDTO getHhMainPersonForeignPersonData() {
        return hhMainPersonForeignPersonData;
    }

    /**
     * Sets the hh main person foreign person data.
     * 
     * @param hhMainPersonForeignPersonData
     *            the new hh main person foreign person data
     */
    public void setHhMainPersonForeignPersonData(final XLDFForeignPersonDTO hhMainPersonForeignPersonData) {
        this.hhMainPersonForeignPersonData = hhMainPersonForeignPersonData;
    }

    /**
     * Gets the hh main person simple foreign role dto.
     * 
     * @return the hh main person simple foreign role dto
     */
    public XLDFSimpleForeignRoleDTO getHhMainPersonSimpleForeignRoleDTO() {
        return hhMainPersonSimpleForeignRoleDTO;
    }

    /**
     * Sets the hh main person simple foreign role dto.
     * 
     * @param hhMainPersonSimpleForeignRoleDTO
     *            the new hh main person simple foreign role dto
     */
    public void setHhMainPersonSimpleForeignRoleDTO(final XLDFSimpleForeignRoleDTO hhMainPersonSimpleForeignRoleDTO) {
        this.hhMainPersonSimpleForeignRoleDTO = hhMainPersonSimpleForeignRoleDTO;
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
     * Gets the ww main person foreign person data.
     * 
     * @return the ww main person foreign person data
     */
    public XLDFForeignPersonDTO getWwMainPersonForeignPersonData() {
        return wwMainPersonForeignPersonData;
    }

    /**
     * Sets the ww main person foreign person data.
     * 
     * @param wwMainPersonForeignPersonData
     *            the new ww main person foreign person data
     */
    public void setWwMainPersonForeignPersonData(final XLDFForeignPersonDTO wwMainPersonForeignPersonData) {
        this.wwMainPersonForeignPersonData = wwMainPersonForeignPersonData;
    }

    /**
     * Gets the ww main person simple foreign role dto.
     * 
     * @return the ww main person simple foreign role dto
     */
    public XLDFSimpleForeignRoleDTO getWwMainPersonSimpleForeignRoleDTO() {
        return wwMainPersonSimpleForeignRoleDTO;
    }

    /**
     * Sets the ww main person simple foreign role dto.
     * 
     * @param wwMainPersonSimpleForeignRoleDTO
     *            the new ww main person simple foreign role dto
     */
    public void setWwMainPersonSimpleForeignRoleDTO(final XLDFSimpleForeignRoleDTO wwMainPersonSimpleForeignRoleDTO) {
        this.wwMainPersonSimpleForeignRoleDTO = wwMainPersonSimpleForeignRoleDTO;
    }

    /**
     * Checks if is hh info flag.
     * 
     * @return true, if is hh info flag
     */
    public boolean isHhInfoFlag() {
        return hhInfoFlag;
    }

    /**
     * Sets the hh info flag.
     * 
     * @param hhInfoFlag
     *            the new hh info flag
     */
    public void setHhInfoFlag(final boolean hhInfoFlag) {
        this.hhInfoFlag = hhInfoFlag;
    }

    /**
     * Checks if is ww info flag.
     * 
     * @return true, if is ww info flag
     */
    public boolean isWwInfoFlag() {
        return wwInfoFlag;
    }

    /**
     * Sets the ww info flag.
     * 
     * @param wwInfoFlag
     *            the new ww info flag
     */
    public void setWwInfoFlag(final boolean wwInfoFlag) {
        this.wwInfoFlag = wwInfoFlag;
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
     * Gets the flag create xldf m10 m s004 hw flag.
     * 
     * @return the flag create xldf m10 m s004 hw flag
     */
    public String getFlagCreateXLDFM10MS004HWFlag() {
        return flagCreateXLDFM10MS004HWFlag;
    }

    /**
     * Sets the flag create xldf m10 m s004 hw flag.
     * 
     * @param flagCreateXLDFM10MS004HWFlag
     *            the new flag create xldf m10 m s004 hw flag
     */
    public void setFlagCreateXLDFM10MS004HWFlag(final String flagCreateXLDFM10MS004HWFlag) {
        this.flagCreateXLDFM10MS004HWFlag = flagCreateXLDFM10MS004HWFlag;
    }

    /**
     * Gets the flag create xldf m10 m r004 hw flag.
     * 
     * @return the flag create xldf m10 m r004 hw flag
     */
    public String getFlagCreateXLDFM10MR004HWFlag() {
        return flagCreateXLDFM10MR004HWFlag;
    }

    /**
     * Sets the flag create xldf m10 m r004 hw flag.
     * 
     * @param flagCreateXLDFM10MR004HWFlag
     *            the new flag create xldf m10 m r004 hw flag
     */
    public void setFlagCreateXLDFM10MR004HWFlag(final String flagCreateXLDFM10MR004HWFlag) {
        this.flagCreateXLDFM10MR004HWFlag = flagCreateXLDFM10MR004HWFlag;
    }

    /**
     * Gets the flag create xldf m10 h s004 hw flag.
     * 
     * @return the flag create xldf m10 h s004 hw flag
     */
    public String getFlagCreateXLDFM10HS004HWFlag() {
        return flagCreateXLDFM10HS004HWFlag;
    }

    /**
     * Sets the flag create xldf m10 h s004 hw flag.
     * 
     * @param flagCreateXLDFM10HS004HWFlag
     *            the new flag create xldf m10 h s004 hw flag
     */
    public void setFlagCreateXLDFM10HS004HWFlag(final String flagCreateXLDFM10HS004HWFlag) {
        this.flagCreateXLDFM10HS004HWFlag = flagCreateXLDFM10HS004HWFlag;
    }

    /**
     * Gets the flag create xldf m10 h r004 hw flag.
     * 
     * @return the flag create xldf m10 h r004 hw flag
     */
    public String getFlagCreateXLDFM10HR004HWFlag() {
        return flagCreateXLDFM10HR004HWFlag;
    }

    /**
     * Sets the flag create xldf m10 h r004 hw flag.
     * 
     * @param flagCreateXLDFM10HR004HWFlag
     *            the new flag create xldf m10 h r004 hw flag
     */
    public void setFlagCreateXLDFM10HR004HWFlag(final String flagCreateXLDFM10HR004HWFlag) {
        this.flagCreateXLDFM10HR004HWFlag = flagCreateXLDFM10HR004HWFlag;
    }

    /**
     * Gets the xldfy004h list.
     * 
     * @return the xldfy004h list
     */
    public List<XLDFY004H> getXldfy004hList() {
        return xldfy004hList;
    }

    /**
     * Sets the xldfy004h list.
     * 
     * @param xldfy004hList
     *            the new xldfy004h list
     */
    public void setXldfy004hList(final List<XLDFY004H> xldfy004hList) {
        this.xldfy004hList = xldfy004hList;
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
     * Gets the flag create xldf s004 hw flag.
     * 
     * @return the flag create xldf s004 hw flag
     */
    public String getFlagCreateXLDFS004HWFlag() {
        return flagCreateXLDFS004HWFlag;
    }

    /**
     * Sets the flag create xldf s004 hw flag.
     * 
     * @param flagCreateXLDFS004HWFlag
     *            the new flag create xldf s004 hw flag
     */
    public void setFlagCreateXLDFS004HWFlag(final String flagCreateXLDFS004HWFlag) {
        this.flagCreateXLDFS004HWFlag = flagCreateXLDFS004HWFlag;
    }

    /**
     * Gets the flag create xldf r004 hw flag.
     * 
     * @return the flag create xldf r004 hw flag
     */
    public String getFlagCreateXLDFR004HWFlag() {
        return flagCreateXLDFR004HWFlag;
    }

    /**
     * Sets the flag create xldf r004 hw flag.
     * 
     * @param flagCreateXLDFR004HWFlag
     *            the new flag create xldf r004 hw flag
     */
    public void setFlagCreateXLDFR004HWFlag(final String flagCreateXLDFR004HWFlag) {
        this.flagCreateXLDFR004HWFlag = flagCreateXLDFR004HWFlag;
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
     * Gets the child list.
     * 
     * @return the child list
     */
    public List<Rcdf001mrlType> getChildList() {
        return childList;
    }

    /**
     * Sets the child list.
     * 
     * @param childList
     *            the new child list
     */
    public void setChildList(final List<Rcdf001mrlType> childList) {
        this.childList = childList;
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

}

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

import tw.gov.moi.ae.checker.annotation.FieldName;
import tw.gov.moi.domain.Rcdf001mType;
import tw.gov.moi.domain.Rldf051mType;
import tw.gov.moi.domain.Tldf004mType;
import tw.gov.moi.domain.XldfefaplcType;
import tw.gov.moi.rl.component.dto.OpeningOperationDTO;
import tw.gov.moi.rl.component.xldf.dto.XLDF058M;
import tw.gov.moi.rl.component.xldf.dto.XLDFM01M;
import tw.gov.moi.rl.component.xldf.dto.XLDFX001M;
import tw.gov.moi.rl.component.xldf.dto.XLDFY001M;
import tw.gov.moi.rl.domain.xldf.XLDFHouseholdDataDomainObject;
import tw.gov.moi.rl.domain.xldf.XLDFHouseholdNoteDomainObject;
import tw.gov.moi.rl.domain.xldf.XLDFPersonDataDomainObject;
import tw.gov.moi.rl.domain.xldf.XLDFPersonNoteDomainObject;

/**
 * 出生登記DTO
 * 
 * @author DAXIONG
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl01210DTO", propOrder = { "lockMode", "isNewHousehold", "oldHouseholdHeadPersonId", "oldHouseholdId", "oldHouseholdHeadSiteId", "oldHouseholdData", "oldHouseholdHeadPersonData", "oldHouseholdHeadBookFlag", "newHouseholdId", "newHouseholdMap", "newHouseholdHeadSiteId", "newHouseholdData", "newMalePersonId", "newMalePersonIdMap", "newFemalePersonId", "newFemalePersonIdMap", "birthPersonData", "birthData", "birthAnnounceList", "birthAnnounce", "birthAnnounceCheckResult", "getByFatherOrMother", "birthAnnounceGender", "birthAnnounceBirthPlace", "fatherPersonId", "fatherSiteId", "fatherRemoveYyymmdd", "fatherRemoveTime", "fatherHouseholdData", "fatherPersonData", "fatherRole", "fatherBookFlag", "fatherOrgEducationMark", "fatherForeignPersonData", "fatherMemoryPerson", "motherPersonId", "motherSiteId", "motherRemoveYyymmdd", "motherRemoveTime", "motherHouseholdData", "motherPersonData", "motherRole", "motherBookFlag", "motherOrgEducationMark", "motherForeignPersonData", "motherMemoryPerson", "childListFlag", "childListTitle", "childList", "fmMarriageDate", "certificate", "certificateList", "otherCertificate", "registerContent", "foreignBirthDate", "apply1", "apply2", "delegated", "householdNoteList", "personNoteList", "householdNoteDetailList", "personNoteDetailList", "previousDoFineCheckFlag", "previousFineEventDate", "receiptId", "doFineCheckFlag", "fineEventDate", "needFineFlag", "fineFreeFlag", "removeFeeReason", "fineDTO", "deleteFineDTOFlag", "finePerson", "systemDate", "systemTime", "parentNameList", "birthOrderSexName", "genderName", "birthPlaceCodeName", "birthPlaceTypeCodeName", "certificateNameList", "familyChoiceName", "familyNameAgreeName", "birthTypeName", "beginBirthPeriod", "endBirthPeriod", "openingOperationDTO", "warningMessgeList", "crossSiteEnabled", "enforcedFlag", "outliveCase", "relatedOutliveCase", "enforcedApplicant", "acceptAdminOfficeCode", "birthKind", "familyNameAgree", "getMotherData", "getFatherData", "birthAnnounceTitle", "birthAnnounceChange", "birthPlaceLabel", "otherBirthPlaceLabel", "birthPlaceNameLabel", "otherCertificateCode", "otherCertificateShow", "saveButtonShow", "fineButtonShow", "doFineCheckFlagOpen", "transactionId", "applySequenceId", "applySeq", "applyCaseNo", "operationCode", "initSuccess", "activeIndex", "styleForPersonId", "styleForSiteId", "ellipsisStyleForFirstName", "ellipsisStyleForLastName", "ellipsisStyleForPersonName" })
@XmlRootElement(name = "Rl01210DTO")
public class Rl01210DTO implements Serializable {

    private static final long serialVersionUID = 1L;

    /** 鎖定頁面元件 */
    @XmlElement(name = "LockMode", required = true)
    @FieldName("鎖定頁面元件")
    private boolean lockMode;

    /** 是否自立新戶 */
    @XmlElement(name = "IsNewHousehold", required = true)
    @FieldName("是否自立新戶")
    private String isNewHousehold;

    /** 戶長統號(非自立新戶) */
    @XmlElement(name = "OldHouseholdHeadPersonId", required = true)
    @FieldName("戶長統號(非自立新戶)")
    private String oldHouseholdHeadPersonId;

    /** 戶號(非自立新戶) */
    @XmlElement(name = "OldHouseholdId", required = true)
    @FieldName("戶號(非自立新戶)")
    private String oldHouseholdId;

    /** 作業點代碼(非自立新戶) */
    @XmlElement(name = "OldHouseholdHeadSiteId", required = true)
    @FieldName("作業點代碼(非自立新戶)")
    private String oldHouseholdHeadSiteId;

    /** 戶長-全戶基本資料(非自立新戶) */
    @XmlElement(name = "OldHouseholdData", required = true)
    @FieldName("戶長-全戶基本資料(非自立新戶)")
    private XLDFHouseholdDataDomainObject oldHouseholdData;

    /** 戶長-個人基本資料(非自立新戶) */
    @XmlElement(name = "OldHouseholdHeadPersonData", required = true)
    @FieldName("戶長-個人基本資料(非自立新戶)")
    private XLDFPersonDataDomainObject oldHouseholdHeadPersonData;

    /** 戶長-簿頁旗標(非自立新戶) */
    @XmlElement(name = "OldHouseholdHeadBookFlag", required = true)
    @FieldName("戶長-簿頁旗標(非自立新戶)")
    private String oldHouseholdHeadBookFlag;

    /** 新戶號 */
    @XmlElement(name = "NewHouseholdId", required = true)
    @FieldName("新戶號")
    private String newHouseholdId;

    /** 新戶號Map */
    @XmlElement(name = "NewHouseholdMap", required = true)
    @FieldName("新戶號Map")
    private Map<String, String> newHouseholdMap = new HashMap<String, String>();

    /** 作業點代碼(自立新戶) */
    @XmlElement(name = "NewHouseholdHeadSiteId", required = true)
    @FieldName("作業點代碼(自立新戶)")
    private String newHouseholdHeadSiteId;

    /** 全戶基本資料(自立新戶) */
    @XmlElement(name = "NewHouseholdData", required = true)
    @FieldName("全戶基本資料(自立新戶)")
    private XLDFHouseholdDataDomainObject newHouseholdData;

    /** 新統號-男性 */
    @XmlElement(name = "NewMalePersonId", required = true)
    @FieldName("新統號-男性")
    private String newMalePersonId;

    /** 新統號-男性Map */
    @XmlElement(name = "NewMalePersonIdMap", required = true)
    @FieldName("新統號-男性Map")
    private Map<String, String> newMalePersonIdMap = new HashMap<String, String>();

    /** 新統號-女性 */
    @XmlElement(name = "NewFemalePersonId", required = true)
    @FieldName("新統號-女性")
    private String newFemalePersonId;

    /** 新統號-女性Map */
    @XmlElement(name = "NewFemalePersonIdMap", required = true)
    @FieldName("新統號-女性Map")
    private Map<String, String> newFemalePersonIdMap = new HashMap<String, String>();

    /** 出生者-個人基本資料 */
    @XmlElement(name = "BirthPersonData", required = true)
    @FieldName("出生者-個人基本資料")
    private XLDFPersonDataDomainObject birthPersonData;

    /** 出生者-出生資料 */
    @XmlElement(name = "BirthData", required = true)
    @FieldName("出生者-出生資料")
    private XLDFM01M birthData;

    /** 出生通報資料清單 */
    @XmlElement(name = "BirthAnnounceList", required = true)
    @FieldName("出生通報資料清單")
    private List<Rldf051mType> birthAnnounceList;

    /** 選定的出生通報資料 */
    @XmlElement(name = "BirthAnnounce", required = true)
    @FieldName("選定的出生通報資料")
    private Rldf051mType birthAnnounce;

    /** 出生通報查核結果資料 */
    @XmlElement(name = "BirthAnnounceCheckResult", required = true)
    @FieldName("出生通報查核結果資料")
    private XLDF058M birthAnnounceCheckResult;

    /** 由生父或生母統號取得 */
    @XmlElement(name = "GetByFatherOrMother", required = true)
    @FieldName("由生父或生母統號取得")
    private String getByFatherOrMother;

    /** 出生通報之出生者性別 */
    @XmlElement(name = "BirthAnnounceGender", required = true)
    @FieldName("出生通報之出生者性別")
    private String birthAnnounceGender;

    /** 出生通報之出生地 */
    @XmlElement(name = "BirthAnnounceBirthPlace", required = true)
    @FieldName("出生通報之出生地")
    private String birthAnnounceBirthPlace;

    /** 生父-統號 */
    @XmlElement(name = "FatherPersonId", required = true)
    @FieldName("生父-統號")
    private String fatherPersonId;

    /** 生父-作業點代碼 */
    @XmlElement(name = "FatherSiteId", required = true)
    @FieldName("生父-作業點代碼")
    private String fatherSiteId;

    /** 生父-除戶日期 */
    @XmlElement(name = "FatherRemoveYyymmdd", required = true)
    @FieldName("生父-除戶日期")
    private String fatherRemoveYyymmdd;

    /** 生父-除戶時間 */
    @XmlElement(name = "FatherRemoveTime", required = true)
    @FieldName("生父-除戶時間")
    private String fatherRemoveTime;

    /** 生父-全戶基本資料 */
    @XmlElement(name = "FatherHouseholdData", required = true)
    @FieldName("生父-全戶基本資料")
    private XLDFHouseholdDataDomainObject fatherHouseholdData;

    /** 生父-個人基本資料 */
    @XmlElement(name = "FatherPersonData", required = true)
    @FieldName("生父-個人基本資料")
    private XLDFPersonDataDomainObject fatherPersonData;

    /** 生父-身分角色 */
    @XmlElement(name = "FatherRole", required = true)
    @FieldName("生父-身分角色")
    private String fatherRole;

    /** 生父-簿頁旗標 */
    @XmlElement(name = "FatherBookFlag", required = true)
    @FieldName("生父-簿頁旗標")
    private String fatherBookFlag;

    /** 生父-原教育程度註記 */
    @XmlElement(name = "FatherOrgEducationMark", required = true)
    @FieldName("生父-原教育程度註記")
    private String fatherOrgEducationMark;

    /** 生父-外籍者資料 */
    @XmlElement(name = "FatherForeignPersonData", required = true)
    @FieldName("生父-外籍者資料")
    private XLDFForeignPersonDTO fatherForeignPersonData = new XLDFForeignPersonDTO();

    /** 生父-補登個人基本資料 */
    @XmlElement(name = "FatherMemoryPerson", required = true)
    @FieldName("生父-補登個人基本資料")
    private Tldf004mType fatherMemoryPerson;

    /** 生母-統號 */
    @XmlElement(name = "MotherPersonId", required = true)
    @FieldName("生母-統號")
    private String motherPersonId;

    /** 生母-作業點代碼 */
    @XmlElement(name = "MotherSiteId", required = true)
    @FieldName("生母-作業點代碼")
    private String motherSiteId;

    /** 生母-除戶日期 */
    @XmlElement(name = "MotherRemoveYyymmdd", required = true)
    @FieldName("生母-除戶日期")
    private String motherRemoveYyymmdd;

    /** 生母-除戶時間 */
    @XmlElement(name = "MotherRemoveTime", required = true)
    @FieldName("生母-除戶時間")
    private String motherRemoveTime;

    /** 生母-全戶基本資料 */
    @XmlElement(name = "MotherHouseholdData", required = true)
    @FieldName("生母-全戶基本資料")
    private XLDFHouseholdDataDomainObject motherHouseholdData;

    /** 生母-個人基本資料 */
    @XmlElement(name = "MotherPersonData", required = true)
    @FieldName("生母-個人基本資料")
    private XLDFPersonDataDomainObject motherPersonData;

    /** 生母-身分角色 */
    @XmlElement(name = "MotherRole", required = true)
    @FieldName("生母-身分角色")
    private String motherRole;

    /** 生母-簿頁旗標 */
    @XmlElement(name = "MotherBookFlag", required = true)
    @FieldName("生母-簿頁旗標")
    private String motherBookFlag;

    /** 生母-原教育程度註記 */
    @XmlElement(name = "MotherOrgEducationMark", required = true)
    @FieldName("生母-原教育程度註記")
    private String motherOrgEducationMark;

    /** 生母-外籍者資料 */
    @XmlElement(name = "MotherForeignPersonData", required = true)
    @FieldName("生母-外籍者資料")
    private XLDFForeignPersonDTO motherForeignPersonData = new XLDFForeignPersonDTO();

    /** 生母-補登個人基本資料 */
    @XmlElement(name = "MotherMemoryPerson", required = true)
    @FieldName("生母-補登個人基本資料")
    private Tldf004mType motherMemoryPerson;

    /** 子女資料取得旗標 */
    @XmlElement(name = "ChildListFlag", required = true)
    @FieldName("子女資料取得旗標")
    private String childListFlag;

    /** 子女資料標題 */
    @XmlElement(name = "ChildListTitle", required = true)
    @FieldName("子女資料標題")
    private String childListTitle;

    /** 子女資料 */
    @XmlElement(name = "ChildList", required = true)
    @FieldName("子女資料")
    private List<Rcdf001mType> childList = new ArrayList<Rcdf001mType>();

    /** 生父生母結婚日期 */
    @XmlElement(name = "FmMarriageDate", required = true)
    @FieldName("生父生母結婚日期")
    private String fmMarriageDate;

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

    /** 國外出生日期 */
    @XmlElement(name = "ForeignBirthDate", required = true)
    @FieldName("國外出生日期")
    private String foreignBirthDate;

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

    /** 全戶記事欄位化清單 */
    @XmlElement(name = "HouseholdNoteDetailList", required = true)
    @FieldName("全戶記事欄位化清單")
    private List<XLDFX001M> householdNoteDetailList = new ArrayList<XLDFX001M>();

    /** 個人記事欄位化清單 */
    @XmlElement(name = "PersonNoteDetailList", required = true)
    @FieldName("個人記事欄位化清單")
    private List<XLDFY001M> personNoteDetailList = new ArrayList<XLDFY001M>();

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

    /** 父母姓名 */
    @XmlElement(name = "ParentNameList", required = true)
    @FieldName("父母姓名")
    private String parentNameList;

    /** 出生別名稱 */
    @XmlElement(name = "BirthOrderSexName", required = true)
    @FieldName("出生別名稱")
    private String birthOrderSexName;

    /** 性別名稱 */
    @XmlElement(name = "GenderName", required = true)
    @FieldName("性別名稱")
    private String genderName;

    /** 出生地名稱 */
    @XmlElement(name = "BirthPlaceCodeName", required = true)
    @FieldName("出生地名稱")
    private String birthPlaceCodeName;

    /** 出生場所性質名稱 */
    @XmlElement(name = "BirthPlaceTypeCodeName", required = true)
    @FieldName("出生場所性質名稱")
    private String birthPlaceTypeCodeName;

    /** 附繳證件清單 */
    @XmlElement(name = "CertificateNameList", required = true)
    @FieldName("附繳證件清單")
    private String certificateNameList;

    /** 從姓方式名稱 */
    @XmlElement(name = "FamilyChoiceName", required = true)
    @FieldName("從姓方式名稱")
    private String familyChoiceName;

    /** 從姓名稱 */
    @XmlElement(name = "FamilyNameAgreeName", required = true)
    @FieldName("從姓名稱")
    private String familyNameAgreeName;

    /** 胎別名稱 */
    @XmlElement(name = "BirthTypeName", required = true)
    @FieldName("胎別名稱")
    private String birthTypeName;

    /** 受胎期間(起) */
    @XmlElement(name = "BeginBirthPeriod", required = true)
    @FieldName("受胎期間(起)")
    private String beginBirthPeriod;

    /** 受胎期間(迄) */
    @XmlElement(name = "EndBirthPeriod", required = true)
    @FieldName("受胎期間(迄)")
    private String endBirthPeriod;

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

    /** 出生身分 */
    @XmlElement(name = "BirthKind", required = true)
    @FieldName("出生身分")
    private String birthKind;

    /** 從姓 */
    @XmlElement(name = "FamilyNameAgree", required = true)
    @FieldName("從姓")
    private String familyNameAgree;

    /** 是否需取得生母資料 */
    @XmlElement(name = "GetMotherData", required = true)
    @FieldName("是否需取得生母資料")
    private boolean getMotherData;

    /** 是否需取得生父資料 */
    @XmlElement(name = "GetFatherData", required = true)
    @FieldName("是否需取得生父資料")
    private boolean getFatherData;

    /** 出生通報資料標題 */
    @XmlElement(name = "BirthAnnounceTitle", required = true)
    @FieldName("出生通報資料標題")
    private String birthAnnounceTitle;

    /** 出生通報資料是否異動 */
    @XmlElement(name = "BirthAnnounceChange", required = true)
    @FieldName("出生通報資料是否異動")
    private boolean birthAnnounceChange;

    /** 出生地點標籤 */
    @XmlElement(name = "BirthPlaceLabel", required = true)
    @FieldName("出生地點標籤")
    private String birthPlaceLabel;

    /** 其他出生地點標籤 */
    @XmlElement(name = "OtherBirthPlaceLabel", required = true)
    @FieldName("其他出生地點標籤")
    private String otherBirthPlaceLabel;

    /** 出生場所名稱標籤 */
    @XmlElement(name = "BirthPlaceNameLabel", required = true)
    @FieldName("出生場所名稱標籤")
    private String birthPlaceNameLabel;

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
     * 取得是否自立新戶
     * 
     * @return 是否自立新戶
     */
    public String getIsNewHousehold() {
        return isNewHousehold;
    }

    /**
     * 設定是否自立新戶
     * 
     * @param isNewHousehold
     *            是否自立新戶
     */
    public void setIsNewHousehold(final String isNewHousehold) {
        this.isNewHousehold = isNewHousehold;
    }

    /**
     * 取得戶長統號(非自立新戶)
     * 
     * @return 戶長統號(非自立新戶)
     */
    public String getOldHouseholdHeadPersonId() {
        return oldHouseholdHeadPersonId;
    }

    /**
     * 設定戶長統號(非自立新戶)
     * 
     * @param oldHouseholdHeadPersonId
     *            戶長統號(非自立新戶)
     */
    public void setOldHouseholdHeadPersonId(final String oldHouseholdHeadPersonId) {
        this.oldHouseholdHeadPersonId = oldHouseholdHeadPersonId;
    }

    /**
     * 取得戶號(非自立新戶)
     * 
     * @return 戶號(非自立新戶)
     */
    public String getOldHouseholdId() {
        return oldHouseholdId;
    }

    /**
     * 設定戶號(非自立新戶)
     * 
     * @param oldHouseholdId
     *            戶號(非自立新戶)
     */
    public void setOldHouseholdId(final String oldHouseholdId) {
        this.oldHouseholdId = oldHouseholdId;
    }

    /**
     * 取得作業點代碼(非自立新戶)
     * 
     * @return 作業點代碼(非自立新戶)
     */
    public String getOldHouseholdHeadSiteId() {
        return oldHouseholdHeadSiteId;
    }

    /**
     * 設定作業點代碼(非自立新戶)
     * 
     * @param oldHouseholdHeadSiteId
     *            作業點代碼(非自立新戶)
     */
    public void setOldHouseholdHeadSiteId(final String oldHouseholdHeadSiteId) {
        this.oldHouseholdHeadSiteId = oldHouseholdHeadSiteId;
    }

    /**
     * 取得戶長-全戶基本資料(非自立新戶)
     * 
     * @return 戶長-全戶基本資料(非自立新戶)
     */
    public XLDFHouseholdDataDomainObject getOldHouseholdData() {
        return oldHouseholdData;
    }

    /**
     * 設定戶長-全戶基本資料(非自立新戶)
     * 
     * @param oldHouseholdData
     *            戶長-全戶基本資料(非自立新戶)
     */
    public void setOldHouseholdData(final XLDFHouseholdDataDomainObject oldHouseholdData) {
        this.oldHouseholdData = oldHouseholdData;
    }

    /**
     * 取得戶長-個人基本資料(非自立新戶)
     * 
     * @return 戶長-個人基本資料(非自立新戶)
     */
    public XLDFPersonDataDomainObject getOldHouseholdHeadPersonData() {
        return oldHouseholdHeadPersonData;
    }

    /**
     * 設定戶長-個人基本資料(非自立新戶)
     * 
     * @param oldHouseholdHeadPersonData
     *            戶長-個人基本資料(非自立新戶)
     */
    public void setOldHouseholdHeadPersonData(final XLDFPersonDataDomainObject oldHouseholdHeadPersonData) {
        this.oldHouseholdHeadPersonData = oldHouseholdHeadPersonData;
    }

    /**
     * 取得戶長-簿頁旗標(非自立新戶)
     * 
     * @return 戶長-簿頁旗標(非自立新戶)
     */
    public String getOldHouseholdHeadBookFlag() {
        return oldHouseholdHeadBookFlag;
    }

    /**
     * 設定戶長-簿頁旗標(非自立新戶)
     * 
     * @param oldHouseholdHeadBookFlag
     *            戶長-簿頁旗標(非自立新戶)
     */
    public void setOldHouseholdHeadBookFlag(final String oldHouseholdHeadBookFlag) {
        this.oldHouseholdHeadBookFlag = oldHouseholdHeadBookFlag;
    }

    /**
     * 取得新戶號
     * 
     * @return 新戶號
     */
    public String getNewHouseholdId() {
        return newHouseholdId;
    }

    /**
     * 設定新戶號
     * 
     * @param newHouseholdId
     *            新戶號
     */
    public void setNewHouseholdId(final String newHouseholdId) {
        this.newHouseholdId = newHouseholdId;
    }

    /**
     * 取得新戶號Map
     * 
     * @return 新戶號Map
     */
    public Map<String, String> getNewHouseholdMap() {
        return newHouseholdMap;
    }

    /**
     * 設定新戶號Map
     * 
     * @param newHouseholdMap
     *            新戶號Map
     */
    public void setNewHouseholdMap(final Map<String, String> newHouseholdMap) {
        this.newHouseholdMap = newHouseholdMap;
    }

    /**
     * 取得作業點代碼(自立新戶)
     * 
     * @return 作業點代碼(自立新戶)
     */
    public String getNewHouseholdHeadSiteId() {
        return newHouseholdHeadSiteId;
    }

    /**
     * 設定作業點代碼(自立新戶)
     * 
     * @param newHouseholdHeadSiteId
     *            作業點代碼(自立新戶)
     */
    public void setNewHouseholdHeadSiteId(final String newHouseholdHeadSiteId) {
        this.newHouseholdHeadSiteId = newHouseholdHeadSiteId;
    }

    /**
     * 取得全戶基本資料(自立新戶)
     * 
     * @return 全戶基本資料(自立新戶)
     */
    public XLDFHouseholdDataDomainObject getNewHouseholdData() {
        return newHouseholdData;
    }

    /**
     * 設定全戶基本資料(自立新戶)
     * 
     * @param newHouseholdData
     *            全戶基本資料(自立新戶)
     */
    public void setNewHouseholdData(final XLDFHouseholdDataDomainObject newHouseholdData) {
        this.newHouseholdData = newHouseholdData;
    }

    /**
     * 取得新統號-男性
     * 
     * @return 新統號-男性
     */
    public String getNewMalePersonId() {
        return newMalePersonId;
    }

    /**
     * 設定新統號-男性
     * 
     * @param newMalePersonId
     *            新統號-男性
     */
    public void setNewMalePersonId(final String newMalePersonId) {
        this.newMalePersonId = newMalePersonId;
    }

    /**
     * 取得新統號-男性Map
     * 
     * @return 新統號-男性Map
     */
    public Map<String, String> getNewMalePersonIdMap() {
        return newMalePersonIdMap;
    }

    /**
     * 設定新統號-男性Map
     * 
     * @param newMalePersonIdMap
     *            新統號-男性Map
     */
    public void setNewMalePersonIdMap(final Map<String, String> newMalePersonIdMap) {
        this.newMalePersonIdMap = newMalePersonIdMap;
    }

    /**
     * 取得新統號-女性
     * 
     * @return 新統號-女性
     */
    public String getNewFemalePersonId() {
        return newFemalePersonId;
    }

    /**
     * 設定新統號-女性
     * 
     * @param newFemalePersonId
     *            新統號-女性
     */
    public void setNewFemalePersonId(final String newFemalePersonId) {
        this.newFemalePersonId = newFemalePersonId;
    }

    /**
     * 取得新統號-女性Map
     * 
     * @return 新統號-女性Map
     */
    public Map<String, String> getNewFemalePersonIdMap() {
        return newFemalePersonIdMap;
    }

    /**
     * 設定新統號-女性Map
     * 
     * @param newFemalePersonIdMap
     *            新統號-女性Map
     */
    public void setNewFemalePersonIdMap(final Map<String, String> newFemalePersonIdMap) {
        this.newFemalePersonIdMap = newFemalePersonIdMap;
    }

    /**
     * 取得出生者-個人基本資料
     * 
     * @return 出生者-個人基本資料
     */
    public XLDFPersonDataDomainObject getBirthPersonData() {
        return birthPersonData;
    }

    /**
     * 設定出生者-個人基本資料
     * 
     * @param birthPersonData
     *            出生者-個人基本資料
     */
    public void setBirthPersonData(final XLDFPersonDataDomainObject birthPersonData) {
        this.birthPersonData = birthPersonData;
    }

    /**
     * 取得出生者-出生資料
     * 
     * @return 出生者-出生資料
     */
    public XLDFM01M getBirthData() {
        return birthData;
    }

    /**
     * 設定出生者-出生資料
     * 
     * @param birthData
     *            出生者-出生資料
     */
    public void setBirthData(final XLDFM01M birthData) {
        this.birthData = birthData;
    }

    /**
     * 取得出生通報資料清單
     * 
     * @return 出生通報資料清單
     */
    public List<Rldf051mType> getBirthAnnounceList() {
        return birthAnnounceList;
    }

    /**
     * 設定出生通報資料清單
     * 
     * @param birthAnnounceList
     *            出生通報資料清單
     */
    public void setBirthAnnounceList(final List<Rldf051mType> birthAnnounceList) {
        this.birthAnnounceList = birthAnnounceList;
    }

    /**
     * 取得選定的出生通報資料
     * 
     * @return 選定的出生通報資料
     */
    public Rldf051mType getBirthAnnounce() {
        return birthAnnounce;
    }

    /**
     * 設定選定的出生通報資料
     * 
     * @param birthAnnounce
     *            選定的出生通報資料
     */
    public void setBirthAnnounce(final Rldf051mType birthAnnounce) {
        this.birthAnnounce = birthAnnounce;
    }

    /**
     * 取得出生通報查核結果資料
     * 
     * @return 出生通報查核結果資料
     */
    public XLDF058M getBirthAnnounceCheckResult() {
        return birthAnnounceCheckResult;
    }

    /**
     * 設定出生通報查核結果資料
     * 
     * @param birthAnnounceCheckResult
     *            出生通報查核結果資料
     */
    public void setBirthAnnounceCheckResult(final XLDF058M birthAnnounceCheckResult) {
        this.birthAnnounceCheckResult = birthAnnounceCheckResult;
    }

    /**
     * 取得由生父或生母統號取得
     * 
     * @return 由生父或生母統號取得
     */
    public String getGetByFatherOrMother() {
        return getByFatherOrMother;
    }

    /**
     * 設定由生父或生母統號取得
     * 
     * @param getByFatherOrMother
     *            由生父或生母統號取得
     */
    public void setGetByFatherOrMother(final String getByFatherOrMother) {
        this.getByFatherOrMother = getByFatherOrMother;
    }

    /**
     * 取得出生通報之出生者性別
     * 
     * @return 出生通報之出生者性別
     */
    public String getBirthAnnounceGender() {
        return birthAnnounceGender;
    }

    /**
     * 設定出生通報之出生者性別
     * 
     * @param birthAnnounceGender
     *            出生通報之出生者性別
     */
    public void setBirthAnnounceGender(final String birthAnnounceGender) {
        this.birthAnnounceGender = birthAnnounceGender;
    }

    /**
     * 取得出生通報之出生地
     * 
     * @return 出生通報之出生地
     */
    public String getBirthAnnounceBirthPlace() {
        return birthAnnounceBirthPlace;
    }

    /**
     * 設定出生通報之出生地
     * 
     * @param birthAnnounceBirthPlace
     *            出生通報之出生地
     */
    public void setBirthAnnounceBirthPlace(final String birthAnnounceBirthPlace) {
        this.birthAnnounceBirthPlace = birthAnnounceBirthPlace;
    }

    /**
     * 取得生父-統號
     * 
     * @return 生父-統號
     */
    public String getFatherPersonId() {
        return fatherPersonId;
    }

    /**
     * 設定生父-統號
     * 
     * @param fatherPersonId
     *            生父-統號
     */
    public void setFatherPersonId(final String fatherPersonId) {
        this.fatherPersonId = fatherPersonId;
    }

    /**
     * 取得生父-作業點代碼
     * 
     * @return 生父-作業點代碼
     */
    public String getFatherSiteId() {
        return fatherSiteId;
    }

    /**
     * 設定生父-作業點代碼
     * 
     * @param fatherSiteId
     *            生父-作業點代碼
     */
    public void setFatherSiteId(final String fatherSiteId) {
        this.fatherSiteId = fatherSiteId;
    }

    /**
     * 取得生父-除戶日期
     * 
     * @return 生父-除戶日期
     */
    public String getFatherRemoveYyymmdd() {
        return fatherRemoveYyymmdd;
    }

    /**
     * 設定生父-除戶日期
     * 
     * @param fatherRemoveYyymmdd
     *            生父-除戶日期
     */
    public void setFatherRemoveYyymmdd(final String fatherRemoveYyymmdd) {
        this.fatherRemoveYyymmdd = fatherRemoveYyymmdd;
    }

    /**
     * 取得生父-除戶時間
     * 
     * @return 生父-除戶時間
     */
    public String getFatherRemoveTime() {
        return fatherRemoveTime;
    }

    /**
     * 設定生父-除戶時間
     * 
     * @param fatherRemoveTime
     *            生父-除戶時間
     */
    public void setFatherRemoveTime(final String fatherRemoveTime) {
        this.fatherRemoveTime = fatherRemoveTime;
    }

    /**
     * 取得生父-全戶基本資料
     * 
     * @return 生父-全戶基本資料
     */
    public XLDFHouseholdDataDomainObject getFatherHouseholdData() {
        return fatherHouseholdData;
    }

    /**
     * 設定生父-全戶基本資料
     * 
     * @param fatherHouseholdData
     *            生父-全戶基本資料
     */
    public void setFatherHouseholdData(final XLDFHouseholdDataDomainObject fatherHouseholdData) {
        this.fatherHouseholdData = fatherHouseholdData;
    }

    /**
     * 取得生父-個人基本資料
     * 
     * @return 生父-個人基本資料
     */
    public XLDFPersonDataDomainObject getFatherPersonData() {
        return fatherPersonData;
    }

    /**
     * 設定生父-個人基本資料
     * 
     * @param fatherPersonData
     *            生父-個人基本資料
     */
    public void setFatherPersonData(final XLDFPersonDataDomainObject fatherPersonData) {
        this.fatherPersonData = fatherPersonData;
    }

    /**
     * 取得生父-身分角色
     * 
     * @return 生父-身分角色
     */
    public String getFatherRole() {
        return fatherRole;
    }

    /**
     * 設定生父-身分角色
     * 
     * @param fatherRole
     *            生父-身分角色
     */
    public void setFatherRole(final String fatherRole) {
        this.fatherRole = fatherRole;
    }

    /**
     * 取得生父-簿頁旗標
     * 
     * @return 生父-簿頁旗標
     */
    public String getFatherBookFlag() {
        return fatherBookFlag;
    }

    /**
     * 設定生父-簿頁旗標
     * 
     * @param fatherBookFlag
     *            生父-簿頁旗標
     */
    public void setFatherBookFlag(final String fatherBookFlag) {
        this.fatherBookFlag = fatherBookFlag;
    }

    /**
     * 取得生父-原教育程度註記
     * 
     * @return 生父-原教育程度註記
     */
    public String getFatherOrgEducationMark() {
        return fatherOrgEducationMark;
    }

    /**
     * 設定生父-原教育程度註記
     * 
     * @param fatherOrgEducationMark
     *            生父-原教育程度註記
     */
    public void setFatherOrgEducationMark(final String fatherOrgEducationMark) {
        this.fatherOrgEducationMark = fatherOrgEducationMark;
    }

    /**
     * 取得生父-外籍者資料
     * 
     * @return 生父-外籍者資料
     */
    public XLDFForeignPersonDTO getFatherForeignPersonData() {
        return fatherForeignPersonData;
    }

    /**
     * 設定生父-外籍者資料
     * 
     * @param fatherForeignPersonData
     *            生父-外籍者資料
     */
    public void setFatherForeignPersonData(final XLDFForeignPersonDTO fatherForeignPersonData) {
        this.fatherForeignPersonData = fatherForeignPersonData;
    }

    /**
     * 取得生父-補登個人基本資料
     * 
     * @return 生父-補登個人基本資料
     */
    public Tldf004mType getFatherMemoryPerson() {
        return fatherMemoryPerson;
    }

    /**
     * 設定生父-補登個人基本資料
     * 
     * @param fatherMemoryPerson
     *            生父-補登個人基本資料
     */
    public void setFatherMemoryPerson(final Tldf004mType fatherMemoryPerson) {
        this.fatherMemoryPerson = fatherMemoryPerson;
    }

    /**
     * 取得生母-統號
     * 
     * @return 生母-統號
     */
    public String getMotherPersonId() {
        return motherPersonId;
    }

    /**
     * 設定生母-統號
     * 
     * @param motherPersonId
     *            生母-統號
     */
    public void setMotherPersonId(final String motherPersonId) {
        this.motherPersonId = motherPersonId;
    }

    /**
     * 取得生母-作業點代碼
     * 
     * @return 生母-作業點代碼
     */
    public String getMotherSiteId() {
        return motherSiteId;
    }

    /**
     * 設定生母-作業點代碼
     * 
     * @param motherSiteId
     *            生母-作業點代碼
     */
    public void setMotherSiteId(final String motherSiteId) {
        this.motherSiteId = motherSiteId;
    }

    /**
     * 取得生母-除戶日期
     * 
     * @return 生母-除戶日期
     */
    public String getMotherRemoveYyymmdd() {
        return motherRemoveYyymmdd;
    }

    /**
     * 設定生母-除戶日期
     * 
     * @param motherRemoveYyymmdd
     *            生母-除戶日期
     */
    public void setMotherRemoveYyymmdd(final String motherRemoveYyymmdd) {
        this.motherRemoveYyymmdd = motherRemoveYyymmdd;
    }

    /**
     * 取得生母-除戶時間
     * 
     * @return 生母-除戶時間
     */
    public String getMotherRemoveTime() {
        return motherRemoveTime;
    }

    /**
     * 設定生母-除戶時間
     * 
     * @param motherRemoveTime
     *            生母-除戶時間
     */
    public void setMotherRemoveTime(final String motherRemoveTime) {
        this.motherRemoveTime = motherRemoveTime;
    }

    /**
     * 取得生母-全戶基本資料
     * 
     * @return 生母-全戶基本資料
     */
    public XLDFHouseholdDataDomainObject getMotherHouseholdData() {
        return motherHouseholdData;
    }

    /**
     * 設定生母-全戶基本資料
     * 
     * @param motherHouseholdData
     *            生母-全戶基本資料
     */
    public void setMotherHouseholdData(final XLDFHouseholdDataDomainObject motherHouseholdData) {
        this.motherHouseholdData = motherHouseholdData;
    }

    /**
     * 取得生母-個人基本資料
     * 
     * @return 生母-個人基本資料
     */
    public XLDFPersonDataDomainObject getMotherPersonData() {
        return motherPersonData;
    }

    /**
     * 設定生母-個人基本資料
     * 
     * @param motherPersonData
     *            生母-個人基本資料
     */
    public void setMotherPersonData(final XLDFPersonDataDomainObject motherPersonData) {
        this.motherPersonData = motherPersonData;
    }

    /**
     * 取得生母-身分角色
     * 
     * @return 生母-身分角色
     */
    public String getMotherRole() {
        return motherRole;
    }

    /**
     * 設定生母-身分角色
     * 
     * @param motherRole
     *            生母-身分角色
     */
    public void setMotherRole(final String motherRole) {
        this.motherRole = motherRole;
    }

    /**
     * 取得生母-簿頁旗標
     * 
     * @return 生母-簿頁旗標
     */
    public String getMotherBookFlag() {
        return motherBookFlag;
    }

    /**
     * 設定生母-簿頁旗標
     * 
     * @param motherBookFlag
     *            生母-簿頁旗標
     */
    public void setMotherBookFlag(final String motherBookFlag) {
        this.motherBookFlag = motherBookFlag;
    }

    /**
     * 取得生母-原教育程度註記
     * 
     * @return 生母-原教育程度註記
     */
    public String getMotherOrgEducationMark() {
        return motherOrgEducationMark;
    }

    /**
     * 設定生母-原教育程度註記
     * 
     * @param motherOrgEducationMark
     *            生母-原教育程度註記
     */
    public void setMotherOrgEducationMark(final String motherOrgEducationMark) {
        this.motherOrgEducationMark = motherOrgEducationMark;
    }

    /**
     * 取得生母-外籍者資料
     * 
     * @return 生母-外籍者資料
     */
    public XLDFForeignPersonDTO getMotherForeignPersonData() {
        return motherForeignPersonData;
    }

    /**
     * 設定生母-外籍者資料
     * 
     * @param motherForeignPersonData
     *            生母-外籍者資料
     */
    public void setMotherForeignPersonData(final XLDFForeignPersonDTO motherForeignPersonData) {
        this.motherForeignPersonData = motherForeignPersonData;
    }

    /**
     * 取得生母-補登個人基本資料
     * 
     * @return 生母-補登個人基本資料
     */
    public Tldf004mType getMotherMemoryPerson() {
        return motherMemoryPerson;
    }

    /**
     * 設定生母-補登個人基本資料
     * 
     * @param motherMemoryPerson
     *            生母-補登個人基本資料
     */
    public void setMotherMemoryPerson(final Tldf004mType motherMemoryPerson) {
        this.motherMemoryPerson = motherMemoryPerson;
    }

    /**
     * 取得子女資料取得旗標
     * 
     * @return 子女資料取得旗標
     */
    public String getChildListFlag() {
        return childListFlag;
    }

    /**
     * 設定子女資料取得旗標
     * 
     * @param childListFlag
     *            子女資料取得旗標
     */
    public void setChildListFlag(final String childListFlag) {
        this.childListFlag = childListFlag;
    }

    /**
     * 取得子女資料標題
     * 
     * @return 子女資料標題
     */
    public String getChildListTitle() {
        return childListTitle;
    }

    /**
     * 設定子女資料標題
     * 
     * @param childListTitle
     *            子女資料標題
     */
    public void setChildListTitle(final String childListTitle) {
        this.childListTitle = childListTitle;
    }

    /**
     * 取得子女資料
     * 
     * @return 子女資料
     */
    public List<Rcdf001mType> getChildList() {
        return childList;
    }

    /**
     * 設定子女資料
     * 
     * @param childList
     *            子女資料
     */
    public void setChildList(final List<Rcdf001mType> childList) {
        this.childList = childList;
    }

    /**
     * 取得生父生母結婚日期
     * 
     * @return 生父生母結婚日期
     */
    public String getFmMarriageDate() {
        return fmMarriageDate;
    }

    /**
     * 設定生父生母結婚日期
     * 
     * @param fmMarriageDate
     *            生父生母結婚日期
     */
    public void setFmMarriageDate(final String fmMarriageDate) {
        this.fmMarriageDate = fmMarriageDate;
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
     * 取得國外出生日期
     * 
     * @return 國外出生日期
     */
    public String getForeignBirthDate() {
        return foreignBirthDate;
    }

    /**
     * 設定國外出生日期
     * 
     * @param foreignBirthDate
     *            國外出生日期
     */
    public void setForeignBirthDate(final String foreignBirthDate) {
        this.foreignBirthDate = foreignBirthDate;
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
     * 取得全戶記事欄位化清單
     * 
     * @return 全戶記事欄位化清單
     */
    public List<XLDFX001M> getHouseholdNoteDetailList() {
        return householdNoteDetailList;
    }

    /**
     * 設定全戶記事欄位化清單
     * 
     * @param householdNoteDetailList
     *            全戶記事欄位化清單
     */
    public void setHouseholdNoteDetailList(final List<XLDFX001M> householdNoteDetailList) {
        this.householdNoteDetailList = householdNoteDetailList;
    }

    /**
     * 取得個人記事欄位化清單
     * 
     * @return 個人記事欄位化清單
     */
    public List<XLDFY001M> getPersonNoteDetailList() {
        return personNoteDetailList;
    }

    /**
     * 設定個人記事欄位化清單
     * 
     * @param personNoteDetailList
     *            個人記事欄位化清單
     */
    public void setPersonNoteDetailList(final List<XLDFY001M> personNoteDetailList) {
        this.personNoteDetailList = personNoteDetailList;
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
     * 取得父母姓名
     * 
     * @return 父母姓名
     */
    public String getParentNameList() {
        return parentNameList;
    }

    /**
     * 設定父母姓名
     * 
     * @param parentNameList
     *            父母姓名
     */
    public void setParentNameList(final String parentNameList) {
        this.parentNameList = parentNameList;
    }

    /**
     * 取得出生別名稱
     * 
     * @return 出生別名稱
     */
    public String getBirthOrderSexName() {
        return birthOrderSexName;
    }

    /**
     * 設定出生別名稱
     * 
     * @param birthOrderSexName
     *            出生別名稱
     */
    public void setBirthOrderSexName(final String birthOrderSexName) {
        this.birthOrderSexName = birthOrderSexName;
    }

    /**
     * 取得性別名稱
     * 
     * @return 性別名稱
     */
    public String getGenderName() {
        return genderName;
    }

    /**
     * 設定性別名稱
     * 
     * @param genderName
     *            性別名稱
     */
    public void setGenderName(final String genderName) {
        this.genderName = genderName;
    }

    /**
     * 取得出生地名稱
     * 
     * @return 出生地名稱
     */
    public String getBirthPlaceCodeName() {
        return birthPlaceCodeName;
    }

    /**
     * 設定出生地名稱
     * 
     * @param birthPlaceCodeName
     *            出生地名稱
     */
    public void setBirthPlaceCodeName(final String birthPlaceCodeName) {
        this.birthPlaceCodeName = birthPlaceCodeName;
    }

    /**
     * 取得出生場所性質名稱
     * 
     * @return 出生場所性質名稱
     */
    public String getBirthPlaceTypeCodeName() {
        return birthPlaceTypeCodeName;
    }

    /**
     * 設定出生場所性質名稱
     * 
     * @param birthPlaceTypeCodeName
     *            出生場所性質名稱
     */
    public void setBirthPlaceTypeCodeName(final String birthPlaceTypeCodeName) {
        this.birthPlaceTypeCodeName = birthPlaceTypeCodeName;
    }

    /**
     * 取得附繳證件清單
     * 
     * @return 附繳證件清單
     */
    public String getCertificateNameList() {
        return certificateNameList;
    }

    /**
     * 設定附繳證件清單
     * 
     * @param certificateNameList
     *            附繳證件清單
     */
    public void setCertificateNameList(final String certificateNameList) {
        this.certificateNameList = certificateNameList;
    }

    /**
     * 取得從姓方式名稱
     * 
     * @return 從姓方式名稱
     */
    public String getFamilyChoiceName() {
        return familyChoiceName;
    }

    /**
     * 設定從姓方式名稱
     * 
     * @param familyChoiceName
     *            從姓方式名稱
     */
    public void setFamilyChoiceName(final String familyChoiceName) {
        this.familyChoiceName = familyChoiceName;
    }

    /**
     * 取得從姓名稱
     * 
     * @return 從姓名稱
     */
    public String getFamilyNameAgreeName() {
        return familyNameAgreeName;
    }

    /**
     * 設定從姓名稱
     * 
     * @param familyNameAgreeName
     *            從姓名稱
     */
    public void setFamilyNameAgreeName(final String familyNameAgreeName) {
        this.familyNameAgreeName = familyNameAgreeName;
    }

    /**
     * 取得胎別名稱
     * 
     * @return 胎別名稱
     */
    public String getBirthTypeName() {
        return birthTypeName;
    }

    /**
     * 設定胎別名稱
     * 
     * @param birthTypeName
     *            胎別名稱
     */
    public void setBirthTypeName(final String birthTypeName) {
        this.birthTypeName = birthTypeName;
    }

    /**
     * 取得受胎期間(起)
     * 
     * @return 受胎期間(起)
     */
    public String getBeginBirthPeriod() {
        return beginBirthPeriod;
    }

    /**
     * 設定受胎期間(起)
     * 
     * @param beginBirthPeriod
     *            受胎期間(起)
     */
    public void setBeginBirthPeriod(final String beginBirthPeriod) {
        this.beginBirthPeriod = beginBirthPeriod;
    }

    /**
     * 取得受胎期間(迄)
     * 
     * @return 受胎期間(迄)
     */
    public String getEndBirthPeriod() {
        return endBirthPeriod;
    }

    /**
     * 設定受胎期間(迄)
     * 
     * @param endBirthPeriod
     *            受胎期間(迄)
     */
    public void setEndBirthPeriod(final String endBirthPeriod) {
        this.endBirthPeriod = endBirthPeriod;
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
     * 取得出生身分
     * 
     * @return 出生身分
     */
    public String getBirthKind() {
        return birthKind;
    }

    /**
     * 設定出生身分
     * 
     * @param birthKind
     *            出生身分
     */
    public void setBirthKind(final String birthKind) {
        this.birthKind = birthKind;
    }

    /**
     * 取得從姓
     * 
     * @return 從姓
     */
    public String getFamilyNameAgree() {
        return familyNameAgree;
    }

    /**
     * 設定從姓
     * 
     * @param familyNameAgree
     *            從姓
     */
    public void setFamilyNameAgree(final String familyNameAgree) {
        this.familyNameAgree = familyNameAgree;
    }

    /**
     * 取得是否需取得生母資料
     * 
     * @return 是否需取得生母資料
     */
    public boolean isGetMotherData() {
        return getMotherData;
    }

    /**
     * 設定是否需取得生母資料
     * 
     * @param getMotherData
     *            是否需取得生母資料
     */
    public void setGetMotherData(final boolean getMotherData) {
        this.getMotherData = getMotherData;
    }

    /**
     * 取得是否需取得生父資料
     * 
     * @return 是否需取得生父資料
     */
    public boolean isGetFatherData() {
        return getFatherData;
    }

    /**
     * 設定是否需取得生父資料
     * 
     * @param getFatherData
     *            是否需取得生父資料
     */
    public void setGetFatherData(final boolean getFatherData) {
        this.getFatherData = getFatherData;
    }

    /**
     * 取得出生通報資料標題
     * 
     * @return 出生通報資料標題
     */
    public String getBirthAnnounceTitle() {
        return birthAnnounceTitle;
    }

    /**
     * 設定出生通報資料標題
     * 
     * @param birthAnnounceTitle
     *            出生通報資料標題
     */
    public void setBirthAnnounceTitle(final String birthAnnounceTitle) {
        this.birthAnnounceTitle = birthAnnounceTitle;
    }

    /**
     * 取得出生通報資料是否異動
     * 
     * @return 出生通報資料是否異動
     */
    public boolean isBirthAnnounceChange() {
        return birthAnnounceChange;
    }

    /**
     * 設定出生通報資料是否異動
     * 
     * @param birthAnnounceChange
     *            出生通報資料是否異動
     */
    public void setBirthAnnounceChange(final boolean birthAnnounceChange) {
        this.birthAnnounceChange = birthAnnounceChange;
    }

    /**
     * 取得出生地點標籤
     * 
     * @return 出生地點標籤
     */
    public String getBirthPlaceLabel() {
        return birthPlaceLabel;
    }

    /**
     * 設定出生地點標籤
     * 
     * @param birthPlaceLabel
     *            出生地點標籤
     */
    public void setBirthPlaceLabel(final String birthPlaceLabel) {
        this.birthPlaceLabel = birthPlaceLabel;
    }

    /**
     * 取得其他出生地點標籤
     * 
     * @return 其他出生地點標籤
     */
    public String getOtherBirthPlaceLabel() {
        return otherBirthPlaceLabel;
    }

    /**
     * 設定其他出生地點標籤
     * 
     * @param otherBirthPlaceLabel
     *            其他出生地點標籤
     */
    public void setOtherBirthPlaceLabel(final String otherBirthPlaceLabel) {
        this.otherBirthPlaceLabel = otherBirthPlaceLabel;
    }

    /**
     * 取得出生場所名稱標籤
     * 
     * @return 出生場所名稱標籤
     */
    public String getBirthPlaceNameLabel() {
        return birthPlaceNameLabel;
    }

    /**
     * 設定出生場所名稱標籤
     * 
     * @param birthPlaceNameLabel
     *            出生場所名稱標籤
     */
    public void setBirthPlaceNameLabel(final String birthPlaceNameLabel) {
        this.birthPlaceNameLabel = birthPlaceNameLabel;
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
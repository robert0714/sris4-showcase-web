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
import tw.gov.moi.domain.XldfefaplcType;
import tw.gov.moi.domain.XldfopracsType;
import tw.gov.moi.rl.component.dto.FinePersonDTO;
import tw.gov.moi.rl.component.dto.OpeningOperationDTO;
import tw.gov.moi.rl.component.dto.XLDFDomainObject;
import tw.gov.moi.rl.component.xldf.dto.XLDF021M;
import tw.gov.moi.rl.component.xldf.dto.XLDF030M;
import tw.gov.moi.rl.component.xldf.dto.XLDFM10M;
import tw.gov.moi.rl.domain.xldf.XLDFHouseholdDataDomainObject;
import tw.gov.moi.rl.domain.xldf.XLDFHouseholdNoteDomainObject;
import tw.gov.moi.rl.domain.xldf.XLDFPersonDataDomainObject;
import tw.gov.moi.rl.domain.xldf.XLDFPersonNoteDomainObject;

/**
 * 撤銷遷出登記DTO
 * 
 * @author Marcus Chen
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Rl01805DTO", propOrder = { "abolishNoteList", "acceptedAdminOfficeCode", "acceptSiteId",
        "activeIndex", "addPersonId", "allMoveFlag", "applyCaseNo", "applyDate", "applyPersonList", "applyRegister",
        "applySeq", "applySequenceId", "applySiteId", "beenEnforcedMoveToAdminOfficeFlag",
        "beenEnforcedMoveToNonAdminOfficeFlag", "bigApplyKind", "bigHouseholdFlag", "canbeCacnceledPersonNum",
        "cancelReason", "certificate", "clearList", "commPerson", "concurrentHeadId", "conCurrentRealHousehold",
        "conCurrentRealPerson", "concurrentSiteId", "correctChangeNoteList", "delete030M", "deleteFineDTOFlag",
        "deleteNoteMap", "enforceApplyPerson", "enforcedFlag", "fineButtonShow", "fineDTO", "fineEventDate",
        "fineFreeFlag", "finePersonData", "finePersonId", "fineReceiptId", "hasMember", "householdData",
        "householdNoteList", "identityNoteList", "initSuccess", "initTime", "isCancelOverseas", "isHeadOut",
        "isMoveFake", "isNewHouse", "isnotLawPeriod", "isPunish", "isSameAdminOffice", "isSameHousehold",
        "lastConcurnHead", "lastNeedCheckFine", "lastQueryMoveinHouseHeadId", "lawDate", "m10mList",
        "massMovePeopleDataList", "masterLast2RegisterDate", "masterLastMove", "masterPerson", "memberIds",
        "memberList", "memberPersonDataList", "moveFakeFlag", "moveInHouseheadId", "moveInHousehold", "moveInHouseId",
        "moveInHousePerson", "moveInSiteId", "moveInXldf021m", "moveNoteList", "needCheckFine", "needFineFlag",
        "oldDataInMove", "oldFineEventDate", "oldMoveHouseholdCurrentMark", "oldMoveInHouseholdType",
        "oldShowRegisterPersonId", "openingOperationDTO", "operateDate", "operateionName", "operateTime",
        "orginNewConcurrentHeadMark", "orginNewHouseId", "orginNewHouseType", "originalSiteId", "originDataList",
        "originNewHousehold", "oriHeadNewMscMark", "oriResidentCnt", "otherCertificate", "otherCertificateStatus",
        "otherNoteList", "otherPersonIds", "outHeadName", "outHeadPersonId", "outNewHeadName", "personDataList",
        "personNoteList", "personNum", "qryinputList", "rc1mSiteId", "registerUserId", "remainSameHouseholdIdAndHead",
        "removeFeeReason", "removeYear", "reserveNoteMap", "revokeNoteList", "rldfyDataMap", "saveButtonShow",
        "selectedM10m", "selectedOriginDataDTO", "selectedPostiveApplication", "selectRegisterList", "showM10MList",
        "showRegisterPersonId", "substituteFlag", "supplementNoteList", "toModifyApplications", "transactionId",
        "txnId", "userId", "viewM10m", "viewPostiveApplication", "warnningList", "xLDFApplicantDataDTO1",
        "xLDFApplicantDataDTO2", "xLDFPersonBriefDataDTO", "xldfyDataaccessList" })
@XmlRootElement(name = "Rl01805DTO")
public class Rl01805DTO implements Serializable {

    /** Serial Id. */
    private static final long serialVersionUID = 598726909330491199L;

    @XmlElement(name = "AbolishNoteList", required = true)
    @FieldName("廢止記事資料串列")
    private List<SelRegisterDTO> abolishNoteList = new ArrayList<SelRegisterDTO>();

    /** 受理地戶政事務所代碼. */
    @XmlElement(name = "acceptedAdminOfficeCode", required = true)
    @FieldName("受理地戶政事務所代碼")
    private String acceptedAdminOfficeCode;

    /** 受理地作業點代碼 */
    @XmlElement(name = "acceptSiteId", required = true)
    @FieldName("受理地作業點代碼")
    private String acceptSiteId;

    /** 頁籤索引 */
    @XmlElement(name = "ActiveIndex", required = true)
    @FieldName("頁籤索引")
    private String activeIndex;

    /** 當事人新增視窗 - 國民身分證統一編號 -. */
    @XmlElement(name = "addPersonId", required = true)
    @FieldName("國民身分證統一編號")
    private String addPersonId;

    /** 全戶遷出旗標. */
    @XmlElement(name = "allMoveFlag", required = true)
    @FieldName("全戶遷出旗標")
    private boolean allMoveFlag;

    /** 申請種類案件編號 */
    @XmlElement(name = "applyCaseNo", required = true)
    @FieldName("applyCaseNo")
    private String applyCaseNo;

    /** 申請日期 */
    @XmlElement(name = "applyDate", required = true)
    @FieldName("申請日期")
    private String applyDate;

    /** 申請人資料. */
    @XmlElement(name = "ApplyPersonList", required = true)
    @FieldName("申請人資料")
    private List<XLDFApplicantDataDTO> applyPersonList = new ArrayList<XLDFApplicantDataDTO>();

    /** 其他申請資料頁籤-(申請書)備註. */
    @XmlElement(name = "applyRegister", required = true)
    @FieldName("申請書備註")
    private String applyRegister;

    /** applySeq */
    @XmlElement(name = "applySeq", required = true)
    @FieldName("applySeq")
    private String applySeq;

    /** 交易順序 */
    @XmlElement(name = "applySequenceId", required = true)
    @FieldName("交易順序")
    private String applySequenceId;

    /** 受理地siteId */
    @XmlElement(name = "applySiteId", required = true)
    @FieldName("受理地siteId")
    private String applySiteId;

    /** 之前是否被逕遷至戶所. */
    @XmlElement(name = "beenEnforcedMoveFlag", required = true)
    @FieldName("之前是否被逕遷至戶所")
    private boolean beenEnforcedMoveToAdminOfficeFlag = Boolean.FALSE;

    /** 之前是否被逕遷至非戶所. */
    @XmlElement(name = "beenEnforcedMoveFlag", required = true)
    @FieldName("之前是否被逕遷至非戶所")
    private boolean beenEnforcedMoveToNonAdminOfficeFlag = Boolean.FALSE;

    /** 申請種類(大戶) */
    @XmlElement(name = "bigApplyKind", required = true)
    @FieldName("申請種類(大戶)")
    private String bigApplyKind;

    /** 是否為大戶 */
    @XmlElement(name = "bigHouseholdFlag", required = true)
    @FieldName("是否為大戶")
    private boolean bigHouseholdFlag;

    /** 可被撤銷至擬入戶人口數 */
    @XmlElement(name = "canbeCacnceledPersonNum", required = true)
    @FieldName("可被撤銷至擬入戶人口數")
    private int canbeCacnceledPersonNum;

    /** 其他申請資料頁籤-撤銷原因. */
    @XmlElement(name = "cancelReason", required = true)
    @FieldName("撤銷原因")
    private String cancelReason;

    /** 其他申請資料頁籤-附繳證件. */
    @XmlElement(name = "certificate", required = true)
    @FieldName("附繳證件")
    private List<String> certificate;

    /** 當事人清除清單. */
    @XmlElement(name = "CommPerson", required = true)
    @FieldName("受委託人資料")
    private List<ClearDTO> clearList = new ArrayList<ClearDTO>();

    /** 受委託人資料. */
    @XmlElement(name = "CommPerson", required = true)
    @FieldName("受委託人資料")
    private XLDFPersonBriefDataDTO commPerson = new XLDFPersonBriefDataDTO();

    /** 其他申請資料頁籤-兼任戶長國民身分證統一編號. */
    @XmlElement(name = "concurrentHeadId", required = true)
    @FieldName("兼任戶長國民身分證統一編號")
    private String concurrentHeadId;

    /** 兼任戶長本人全戶資料 . */
    @XmlElement(name = "conCurrentRealHousehold", required = true)
    @FieldName("兼任戶長本人全戶資料")
    private XLDFHouseholdDataDomainObject conCurrentRealHousehold;

    /** 兼任戶長本人個人資料. */
    @XmlElement(name = "conCurrentRealPerson", required = true)
    @FieldName("兼任戶長本人個人資料")
    private XLDFPersonDataDomainObject conCurrentRealPerson;

    /** 其他申請資料頁籤-兼任戶長-作業點代碼. */
    @XmlElement(name = "concurrentSiteId", required = true)
    @FieldName("兼任戶長作業點代碼")
    private String concurrentSiteId;

    @XmlElement(name = "CorrectChangeNoteList", required = true)
    @FieldName("更正變更記事資料串列")
    private List<SelRegisterDTO> correctChangeNoteList = new ArrayList<SelRegisterDTO>();

    /** 要被刪除的所內記事 */
    @XmlElement(name = "delete030M")
    @FieldName("要被刪除的所內記事")
    private List<XLDF030M> delete030M = new ArrayList<XLDF030M>(5);

    /** 要刪除FINEDTOFLAG. */
    @XmlElement(name = "deleteFineDTOFlag", required = true)
    @FieldName("要刪除FINEDTOFLAG")
    private boolean deleteFineDTOFlag;

    /** 刪除的5MMAP */
    @XmlElement(name = "reserveNoteMap")
    @FieldName("刪除的5MMAP")
    private Map<String, List<XLDFDomainObject>> deleteNoteMap = new HashMap<String, List<XLDFDomainObject>>();

    /** 逕為申請人資料. */
    @XmlElement(name = "EnforceApplyPerson", required = true)
    @FieldName("逕為申請人資料")
    private XldfefaplcType enforceApplyPerson;

    /** 是否逕為登記. */
    @XmlElement(name = "EnforcedFlag", required = true)
    @FieldName("是否逕為登記")
    private boolean enforcedFlag;

    /** 罰鍰處理是否顯示 */
    @XmlElement(name = "fineButtonShow", required = true)
    @FieldName("罰鍰處理是否顯示")
    private boolean fineButtonShow;

    /** 罰鍰DTO. */
    @XmlElement(name = "fineDTO", required = true)
    @FieldName("罰鍰DTO")
    private FineDTO fineDTO;

    /** 其他申請資料頁籤-事件發生(確定)日期. */
    @XmlElement(name = "fineEventDate", required = true)
    @FieldName(" 其他申請資料頁籤-事件發生(確定)日期")
    private String fineEventDate;

    /** 記事與罰鍰資料頁籤-目前有罰鍰改為不須罰鍰. */
    @XmlElement(name = "fineFreeFlag", required = true)
    @FieldName("記事與罰鍰資料頁籤-目前有罰鍰改為不須罰鍰")
    private boolean fineFreeFlag;

    /** 罰鍰受處分人資料 */
    @XmlElement(name = "finePersonData", required = true)
    @FieldName("罰鍰受處分人資料")
    private FinePersonDTO finePersonData = new FinePersonDTO();

    /** finePersonId */
    @XmlElement(name = "finePersonId", required = true)
    @FieldName("finePersonId")
    private String finePersonId;

    /** 收據號碼. */
    @XmlElement(name = "fineReceiptId", required = true)
    @FieldName("收據號碼")
    private String fineReceiptId;

    /** 是否有戶內成員. */
    @XmlElement(name = "hasMember", required = true)
    @FieldName("是否有戶內成員")
    private boolean hasMember;

    /** 原住地原全戶資料. */
    @XmlElement(name = "HouseholdData", required = true)
    @FieldName("原住地原全戶資料")
    private XLDFHouseholdDataDomainObject householdData;

    /** 全戶記事清單 */
    @XmlElement(name = "HouseholdNoteList", required = true)
    @FieldName("全戶記事清單")
    private List<XLDFHouseholdNoteDomainObject> householdNoteList = new ArrayList<XLDFHouseholdNoteDomainObject>();

    /** Test for XLDFSelectModeDomainDTO */

    @XmlElement(name = "IdentityNoteList", required = true)
    @FieldName("身分記事資料串列")
    private List<SelRegisterDTO> identityNoteList = new ArrayList<SelRegisterDTO>();

    /** 初始化是否成功 */
    @XmlElement(name = "InitSuccess", required = true)
    @FieldName("初始化是否成功")
    private boolean initSuccess = Boolean.TRUE;

    /** 初始化時間. */
    @XmlElement(name = "InitTime", required = true)
    @FieldName("初始化時間")
    private String initTime;

    /** 其他申請資料頁籤-是否撤銷遷出國外- */
    @XmlElement(name = "isCancelOverseas", required = true)
    @FieldName("是否撤銷遷出國外")
    private String isCancelOverseas;

    /** 是否原住地戶長撤銷. isHeadOut */
    @XmlElement(name = "isHeadOut", required = true)
    @FieldName("是否原住地戶長撤銷")
    private boolean isHeadOut;

    /** 其他申請資料頁籤-是否虛報遷徙- */
    @XmlElement(name = "isMoveFake", required = true)
    @FieldName("是否虛報遷徙")
    private String isMoveFake;

    /** 其他申請資料頁籤-自立新戶 1:是 2:否 . */
    @XmlElement(name = "isNewHouse", required = true)
    @FieldName("自立新戶")
    private String isNewHouse;

    /** 其他申請資料頁籤-是否於法定期間申報. */
    @XmlElement(name = "isnotLawPeriod", required = true)
    @FieldName("是否於法定期間申報")
    private String isnotLawPeriod;

    /** 其他申請資料頁籤-須進行罰鍰處理. */
    @XmlElement(name = "IsPunish", required = true)
    @FieldName("須進行罰鍰處理")
    private String isPunish;

    /** 是否同一戶所撤銷住變. */
    @XmlElement(name = "IsSameAdminOffice", required = true)
    @FieldName("是否同一戶所撤銷住變")
    private boolean isSameAdminOffice;

    /** 是否擬入同戶所原戶. */
    @XmlElement(name = "IsSameHousehold", required = true)
    @FieldName("是否擬入同戶所原戶")
    private boolean isSameHousehold;

    /** 是否僅餘兼任戶長 */
    @XmlElement(name = "lastConcurnHead", required = true)
    @FieldName("是否僅餘兼任戶長")
    private boolean lastConcurnHead = Boolean.FALSE;

    /** 其他申請資料頁籤-須進行逾期申請之罰鍰處理(上次的選擇). */
    @XmlElement(name = "lastNeedCheckFine", required = true)
    @FieldName(" 其他申請資料頁籤-須進行逾期申請之罰鍰處理(上次的選擇)")
    private boolean lastNeedCheckFine;

    /** ===================當事人新增視窗 ========================= */

    /** 上次Query的遷入戶長ID */
    @XmlElement(name = "lastQueryMoveinHouseHeadId", required = true)
    @FieldName("上次Query的遷入戶長ID")
    private String lastQueryMoveinHouseHeadId;

    /** ===================當事人資料-頁籤 ========================= */

    /** 其他申請資料頁籤-法定應申報日期. */
    @XmlElement(name = "lawDate", required = true)
    @FieldName("法定應申報日期")
    private String lawDate;

    /** 擬撤銷之原登記申請書清單 */
    @XmlElement(name = "M10mList", required = true)
    @FieldName("擬撤銷之原登記申請書清單")
    private List<XLDFM10M> m10mList = new ArrayList<XLDFM10M>();

    /*** ========================其他申請資料頁籤======================= */

    /** 大戶遷徙-遷徙當事人個人資料- */
    @XmlElement(name = "massMovePeopleDataList", required = true)
    @FieldName("大戶遷徙-遷徙當事人個人資料-")
    private List<RlPersonalDataDTO> massMovePeopleDataList;

    /** 大簿當事人原遷入日期. */
    @XmlElement(name = "MasterLast2RegisterDate", required = true)
    @FieldName("大簿當事人原遷入日期")
    private String masterLast2RegisterDate;

    /** 大簿當事人最後遷徙紀錄. */
    @XmlElement(name = "MasterLastMove", required = true)
    @FieldName("大簿當事人最後遷徙紀錄")
    private XLDFDomainObject masterLastMove;

    /** 大簿當事人個人資料. */
    @XmlElement(name = "MasterPerson", required = true)
    @FieldName("大簿當事人個人資料")
    private XLDFPersonDataDomainObject masterPerson;

    /** 戶內人口統號清單. */
    @XmlElement(name = "memberIds", required = true)
    @FieldName("戶內人口統號清單")
    private List<String> memberIds;

    /** 戶內成員清單. */
    @XmlElement(name = "MemberList", required = true)
    @FieldName("戶內成員清單")
    private List<MemberDTO> memberList = new ArrayList<MemberDTO>();

    /** 戶內成員清單. */
    @XmlElement(name = "memberPersonDataList", required = true)
    @FieldName("戶內成員資料清單")
    private List<XLDFPersonDataDomainObject> memberPersonDataList = new ArrayList<XLDFPersonDataDomainObject>();

    /** 其他申請資料頁籤-是否虛報遷徙- */
    @XmlElement(name = "moveFakeFlag", required = true)
    @FieldName("是否虛報遷徙")
    private boolean moveFakeFlag;

    /** 其他申請資料頁籤-(撤銷後擬入)戶長國民身分證統一編號. */
    @XmlElement(name = "moveInHouseheadId", required = true)
    @FieldName("撤銷後擬入戶長國民身分證統一編號")
    private String moveInHouseheadId;

    /** 當事人新全戶資料. */
    @XmlElement(name = "MoveInHousehold", required = true)
    @FieldName("當事人新全戶資料")
    private XLDFHouseholdDataDomainObject moveInHousehold;

    /** 其他申請資料頁籤-(撤銷後擬入)戶號. */
    @XmlElement(name = "moveInHouseId", required = true)
    @FieldName("撤銷後擬入戶號")
    private String moveInHouseId;

    /** 擬入戶長個人資料. */
    @XmlElement(name = "MoveInHousePerson", required = true)
    @FieldName("擬入戶長個人資料")
    private XLDFPersonDataDomainObject moveInHousePerson;

    /** 當事人資料頁籤 - 撤銷後戶籍地 - */
    @XmlElement(name = "moveInSiteId", required = true)
    @FieldName("撤銷後戶籍地")
    private String moveInSiteId;

    /** 擬入地戶號配賦資料. */
    @XmlElement(name = "moveInXldf021m", required = true)
    @FieldName("擬入地戶號配賦資料")
    private XLDF021M moveInXldf021m;

    @XmlElement(name = "MoveNoteList", required = true)
    @FieldName("遷徙記事資料串列")
    private List<SelRegisterDTO> moveNoteList = new ArrayList<SelRegisterDTO>();

    /** 其他申請資料頁籤-須進行逾期申請之罰鍰處理. */
    @XmlElement(name = "needCheckFine", required = true)
    @FieldName(" 其他申請資料頁籤-須進行逾期申請之罰鍰處理")
    private boolean needCheckFine;

    /** 經罰鍰元件驗證後須進行罰鍰處理.Value=Y/N */
    @XmlElement(name = "needFineFlag", required = true)
    @FieldName("經罰鍰元件驗證後須進行罰鍰處理")
    private boolean needFineFlag;

    /** 當事人有不同戶所舊戶資料. */
    @XmlElement(name = "oldDataInMove", required = true)
    @FieldName("當事人有不同戶所舊戶資料")
    private boolean oldDataInMove;

    /** 事件發生確定日期(上次輸入的值) */
    @XmlElement(name = "oldFineEventDate", required = true)
    @FieldName("事件發生確定日期(上次輸入的值)")
    private String oldFineEventDate;

    /** 擬入地原兼任戶長註記. */
    @XmlElement(name = "oldMoveHouseholdCurrentMark", required = true)
    @FieldName("擬入地原兼任戶長註記")
    private String oldMoveHouseholdCurrentMark;

    /** 擬入地原戶別. */
    @XmlElement(name = "oldMoveInHouseholdType", required = true)
    @FieldName("擬入地原戶別")
    private String oldMoveInHouseholdType;

    /** 上次選取的要顯示記事的國民身分證統一編號. */
    @XmlElement(name = "OldShowRegisterPersonId", required = true)
    @FieldName("上次選取的要顯示記事的國民身分證統一編號")
    private String oldShowRegisterPersonId;

    /** 大簿控制各作業之資訊.(OpeningOperationDTO) */
    @XmlElement(name = "OpeningOperationDTO", required = true)
    @FieldName("大簿控制各作業之資訊")
    private OpeningOperationDTO openingOperationDTO = new OpeningOperationDTO();

    /** 系統日期. */
    @XmlElement(name = "operateDate", required = true)
    @FieldName("系統日期")
    private String operateDate;

    /** 作業代碼 */
    @XmlElement(name = "operateionName", required = true)
    @FieldName("作業代碼")
    private String operateionName;

    /** 系統時間. */
    @XmlElement(name = "operateTime", required = true)
    @FieldName("系統時間")
    private String operateTime;

    /** 原住地資料頁籤-兼任戶長註記 */
    @XmlElement(name = "orginNewConcurrentHeadMark", required = true)
    @FieldName("原住地資料頁籤-兼任戶長註記")
    private String orginNewConcurrentHeadMark;

    /** 原住地資料頁籤-戶號 */
    @XmlElement(name = "orginNewHouseId", required = true)
    @FieldName("原住地資料頁籤-戶號")
    private String orginNewHouseId;

    /** 原住地資料頁籤-戶別 */
    @XmlElement(name = "orginNewHouseType", required = true)
    @FieldName("原住地資料頁籤-戶別")
    private String orginNewHouseType;

    /** 當事人資料頁籤 - 原登記住變遷出地 - */
    @XmlElement(name = "originalSiteId", required = true)
    @FieldName("原登記住變遷出地")
    private String originalSiteId;

    /** 原遷出地個人資料. */
    @XmlElement(name = "OriginDataList", required = true)
    @FieldName("原遷出地個人資料")
    private List<Rl01805OriginDataDTO> originDataList = new ArrayList<Rl01805OriginDataDTO>();

    /** 原住地新戶資料. */
    @XmlElement(name = "OriginNewHousehold", required = true)
    @FieldName("原住地新戶資料")
    private XLDFHouseholdDataDomainObject originNewHousehold;

    /** 原住地戶長再遷入地之所內註記 */
    @XmlElement(name = "oriHeadNewMscMark")
    @FieldName("原住地戶長再遷入地之所內註記")
    private String oriHeadNewMscMark = "0";

    /** 原住地戶下現住人口數 */
    @XmlElement(name = "oriResidentCnt", required = true)
    @FieldName("原住地戶下現住人口數-")
    private Integer oriResidentCnt = 0;

    /** 其他申請資料頁籤-其他附繳證件. */
    @XmlElement(name = "otherCertificate", required = true)
    @FieldName("其他附繳證件")
    private String otherCertificate;

    /** 顯示其他附繳證件輸入欄位與否 */
    @XmlElement(name = "otherCertificateStatus", required = true)
    @FieldName("顯示其他附繳證件輸入欄位與否")
    private String otherCertificateStatus;

    @XmlElement(name = "OtherNoteList", required = true)
    @FieldName("其他記事資料串列")
    private List<SelRegisterDTO> otherNoteList = new ArrayList<SelRegisterDTO>();

    /** 戶內非現住人口統號清單. 4/27 */
    @XmlElement(name = "otherPersonIds", required = true)
    @FieldName("戶內非現住人口統號清單")
    private List<String> otherPersonIds;

    /** 原住地原戶長姓名. */
    @XmlElement(name = "outHeadName", required = true)
    @FieldName("原住地原戶長姓名")
    private String outHeadName;

    /** 原住地原戶長統號. */
    @XmlElement(name = "outHeadPersonId", required = true)
    @FieldName("原住地原戶長統號")
    private String outHeadPersonId;

    /** 原住地新戶長姓名 . */
    @XmlElement(name = "outNewHeadName", required = true)
    @FieldName("原住地新戶長姓名")
    private String outNewHeadName;

    /** 當事人個人資料. */
    @XmlElement(name = "PersonDataList", required = true)
    @FieldName("當事人個人資料")
    private List<Rl01805MoveinDTO> personDataList = new ArrayList<Rl01805MoveinDTO>();

    /** 個人記事清單資料. */
    @XmlElement(name = "PersonNoteList", required = true)
    @FieldName("個人記事清單資料")
    private List<XLDFPersonNoteDomainObject> personNoteList = new ArrayList<XLDFPersonNoteDomainObject>();

    /** 現住人口數 */
    @XmlElement(name = "personNum", required = true)
    @FieldName("現住人口數")
    private int personNum;

    /** 輸入大戶遷徙當事人 */
    @XmlElement(name = "qryinputList", required = true)
    @FieldName("輸入大戶遷徙當事人")
    private List<MoveQryInputDTO> qryinputList = new ArrayList<MoveQryInputDTO>(30);

    /** 全國個人資料作業點. */
    @XmlElement(name = "rc1mSiteId", required = true)
    @FieldName("全國個人資料作業點")
    private String rc1mSiteId;

    /** 戶籍員帳號 */
    @XmlElement(name = "registerUserId", required = true)
    @FieldName("戶籍員帳號")
    private String registerUserId;

    /** 是否保留原戶號原戶長. */
    @XmlElement(name = "remainSameHouseholdIdAndHead", required = true)
    @FieldName("是否保留原戶號原戶長")
    private boolean remainSameHouseholdIdAndHead = Boolean.FALSE;

    /** 記事與罰鍰資料頁籤-免罰原因. */
    @XmlElement(name = "removeFeeReason", required = true)
    @FieldName("記事與罰鍰資料頁籤-免罰原因")
    private String removeFeeReason;
    /** 除戶年度. */
    @XmlElement(name = "removeYear", required = true)
    @FieldName("除戶年度")
    private String removeYear;

    /** 保留的5MMAP */
    @XmlElement(name = "reserveNoteMap")
    @FieldName("保留的5MMAP")
    private Map<String, List<XLDFDomainObject>> reserveNoteMap = new HashMap<String, List<XLDFDomainObject>>();

    @XmlElement(name = "RevokeNoteList", required = true)
    @FieldName("撤銷記事資料串列")
    private List<SelRegisterDTO> revokeNoteList = new ArrayList<SelRegisterDTO>();

    /** 遷徙人口個人記事欄位化MAP. */
    @XmlElement(name = "rldfyDataMap")
    @FieldName("遷徙人口個人記事欄位化MAP")
    private Map<String, List<Object>> rldfyDataMap = new HashMap<String, List<Object>>();

    /** 暫存按鈕是否顯示 */
    @XmlElement(name = "saveButtonShow", required = true)
    @FieldName("暫存按鈕是否顯示")
    private boolean saveButtonShow;
    /*** ======================原登記遷出資料頁籤======================= */

    /** 選取的擬撤銷之原登記申請書 */
    @XmlElement(name = "SelectedM10m", required = true)
    @FieldName("選取的擬撤銷之原登記申請書")
    private List<XLDFM10M> selectedM10m = new ArrayList<XLDFM10M>();

    /** 被挑選的戶長 */
    @XmlElement(name = "selectedOriginDataDTO", required = true)
    @FieldName("被挑選的戶長")
    private Rl01805OriginDataDTO selectedOriginDataDTO;

    /** 選取的擬撤銷原登記1S申請書 */
    @XmlElement(name = "SelectedPostiveApplication", required = true)
    @FieldName("選取的擬撤銷原登記1S申請書")
    private List<XLDFDomainObject> selectedPostiveApplication = new ArrayList<XLDFDomainObject>();

    /** 當事人個人記事資料. 4/4 */
    @XmlElement(name = "SelectRegisterList", required = true)
    @FieldName("當事人個人記事資料")
    private List<MoveInRegisterDTO> selectRegisterList = new ArrayList<MoveInRegisterDTO>();

    /** 擬撤銷之原登記申請書清單 */
    @XmlElement(name = "ShowM10MList", required = true)
    @FieldName("擬撤銷之原登記申請書清單(顯示用)")
    private List<XLDFM10M> showM10MList = new ArrayList<XLDFM10M>();

    /** 要顯示記事的國民身分證統一編號. */
    @XmlElement(name = "ShowRegisterPersonId", required = true)
    @FieldName("要顯示記事的國民身分證統一編號")
    private String showRegisterPersonId;

    /** 異地辦理旗標. */
    @XmlElement(name = "substituteFlag", required = true)
    @FieldName("異地辦理旗標")
    private boolean substituteFlag;

    @XmlElement(name = "SupplementNoteList", required = true)
    @FieldName("補填記事資料串列")
    private List<SelRegisterDTO> supplementNoteList = new ArrayList<SelRegisterDTO>();

    /** 要被設定成註銷的申請書 */
    @XmlElement(name = "ToModifyApplications", required = true)
    @FieldName("要被設定成註銷的申請書")
    private List<XLDFDomainObject> toModifyApplications = new ArrayList<XLDFDomainObject>();

    /** 交易序號. */
    @XmlElement(name = "TransactionId", required = true)
    @FieldName("交易序號")
    private String transactionId;

    /** 交易序號. */
    @XmlElement(name = "txnId", required = true)
    @FieldName("交易序號")
    private String txnId;

    /** 使用者帳號. */
    @XmlElement(name = "UserId", required = true)
    @FieldName("使用者帳號")
    private String userId;

    /** 欲檢視的擬撤銷之原登記申請書 */
    @XmlElement(name = "ViewM10m", required = true)
    @FieldName("欲檢視的擬撤銷之原登記申請書")
    private XLDFM10M viewM10m;

    /** 檢視的擬撤銷原登記1S申請書 */
    @XmlElement(name = "ViewPostiveApplication", required = true)
    @FieldName("檢視的擬撤銷原登記1S申請書")
    private XLDFDomainObject viewPostiveApplication;

    /** 警告訊息 */
    @XmlElement(name = "warnningList", required = true)
    @FieldName("警告訊息")
    List<RlWarningMessage> warnningList = new ArrayList<RlWarningMessage>();

    /** ===============大簿Bean================ */
    /** 申請人1 */
    @XmlElement(name = "XLDFApplicantDataDTO1", required = true)
    @FieldName("申請人1")
    private XLDFApplicantDataDTO xLDFApplicantDataDTO1 = new XLDFApplicantDataDTO();

    /** 申請人2 */
    @XmlElement(name = "XLDFApplicantDataDTO2", required = true)
    @FieldName("申請人2")
    private XLDFApplicantDataDTO xLDFApplicantDataDTO2 = new XLDFApplicantDataDTO();

    /** 受委託人 */
    @XmlElement(name = "XLDFPersonBriefDataDTO", required = true)
    @FieldName("受委託人")
    private XLDFPersonBriefDataDTO xLDFPersonBriefDataDTO = new XLDFPersonBriefDataDTO();

    /** 之前登記的個人記事欄位化Access */
    @XmlElement(name = "xldfyDataaccessList")
    @FieldName("之前登記的個人記事欄位化Access")
    private List<XldfopracsType> xldfyDataaccessList = new ArrayList<XldfopracsType>(20);

    /**
     * @return the abolishNoteList
     */
    public List<SelRegisterDTO> getAbolishNoteList() {
        return abolishNoteList;
    }

    /**
     * @return the acceptedAdminOfficeCode
     */
    public String getAcceptedAdminOfficeCode() {
        return acceptedAdminOfficeCode;
    }

    /**
     * @return the acceptSiteId
     */
    public String getAcceptSiteId() {
        return acceptSiteId;
    }

    /**
     * @return the activeIndex
     */
    public String getActiveIndex() {
        return activeIndex;
    }

    /**
     * @return the addPersonId
     */
    public String getAddPersonId() {
        return addPersonId;
    }

    /**
     * @return the applyCaseNo
     */
    public String getApplyCaseNo() {
        return applyCaseNo;
    }

    /**
     * @return the applyDate
     */
    public String getApplyDate() {
        return applyDate;
    }

    /**
     * @return the applyPersonList
     */
    public List<XLDFApplicantDataDTO> getApplyPersonList() {
        return applyPersonList;
    }

    /**
     * @return the applyRegister
     */
    public String getApplyRegister() {
        return applyRegister;
    }

    /**
     * @return the applySeq
     */
    public String getApplySeq() {
        return applySeq;
    }

    /**
     * @return the applySequenceId
     */
    public String getApplySequenceId() {
        return applySequenceId;
    }

    /**
     * @return the applySiteId
     */
    public String getApplySiteId() {
        return applySiteId;
    }

    /**
     * @return the bigApplyKind
     */
    public String getBigApplyKind() {
        return bigApplyKind;
    }

    /**
     * @return the canbeCacnceledPersonNum
     */
    public int getCanbeCacnceledPersonNum() {
        return canbeCacnceledPersonNum;
    }

    /**
     * @return the cancelReason
     */
    public String getCancelReason() {
        return cancelReason;
    }

    /**
     * @return the certificate
     */
    public List<String> getCertificate() {
        return certificate;
    }

    /**
     * @return the clearList
     */
    public List<ClearDTO> getClearList() {
        return clearList;
    }

    /**
     * @return the commPerson
     */
    public XLDFPersonBriefDataDTO getCommPerson() {
        return commPerson;
    }

    /**
     * @return the concurrentHeadId
     */
    public String getConcurrentHeadId() {
        return concurrentHeadId;
    }

    /**
     * @return the conCurrentRealHousehold
     */
    public XLDFHouseholdDataDomainObject getConCurrentRealHousehold() {
        return conCurrentRealHousehold;
    }

    /**
     * @return the conCurrentRealPerson
     */
    public XLDFPersonDataDomainObject getConCurrentRealPerson() {
        return conCurrentRealPerson;
    }

    /**
     * @return the concurrentSiteId
     */
    public String getConcurrentSiteId() {
        return concurrentSiteId;
    }

    /**
     * @return the correctChangeNoteList
     */
    public List<SelRegisterDTO> getCorrectChangeNoteList() {
        return correctChangeNoteList;
    }

    public List<XLDF030M> getDelete030M() {
        return delete030M;
    }

    public Map<String, List<XLDFDomainObject>> getDeleteNoteMap() {
        return deleteNoteMap;
    }

    /**
     * @return the enforceApplyPerson
     */
    public XldfefaplcType getEnforceApplyPerson() {
        return enforceApplyPerson;
    }

    /**
     * @return the fineDTO
     */
    public FineDTO getFineDTO() {
        return fineDTO;
    }

    /**
     * @return the fineEventDate
     */
    public String getFineEventDate() {
        return fineEventDate;
    }

    /**
     * @return the finePersonData
     */
    public FinePersonDTO getFinePersonData() {
        return finePersonData;
    }

    /**
     * @return the finePersonId
     */
    public String getFinePersonId() {
        return finePersonId;
    }

    /**
     * @return the fineReceiptId
     */
    public String getFineReceiptId() {
        return fineReceiptId;
    }

    /**
     * @return the householdData
     */
    public XLDFHouseholdDataDomainObject getHouseholdData() {
        return householdData;
    }

    /**
     * @return the householdNoteList
     */
    public List<XLDFHouseholdNoteDomainObject> getHouseholdNoteList() {
        return householdNoteList;
    }

    /**
     * @return the identityNoteList
     */
    public List<SelRegisterDTO> getIdentityNoteList() {
        if (identityNoteList == null) {

        }
        return identityNoteList;
    }

    public String getInitTime() {
        return initTime;
    }

    /**
     * @return the isCancelOverseas
     */
    public String getIsCancelOverseas() {
        return isCancelOverseas;
    }

    /**
     * @return the isHeadOut
     */
    public boolean getIsHeadOut() {
        return isHeadOut;
    }

    /**
     * @return the isMoveFake
     */
    public String getIsMoveFake() {
        return isMoveFake;
    }

    /**
     * @return the isNewHouse
     */
    public String getIsNewHouse() {
        return isNewHouse;
    }

    /**
     * @return the isnotLawPeriod
     */
    public String getIsnotLawPeriod() {
        return isnotLawPeriod;
    }

    /**
     * @return the isPunish
     */
    public String getIsPunish() {
        return isPunish;
    }

    /**
     * @return the lastQueryMoveinHouseHeadId
     */
    public String getLastQueryMoveinHouseHeadId() {
        return lastQueryMoveinHouseHeadId;
    }

    /**
     * @return the lawDate
     */
    public String getLawDate() {
        return lawDate;
    }

    /**
     * @return the m10mList
     */
    public List<XLDFM10M> getM10mList() {
        return m10mList;
    }

    /**
     * @return the massMovePeopleDataList
     */
    public List<RlPersonalDataDTO> getMassMovePeopleDataList() {
        return massMovePeopleDataList;
    }

    /**
     * @return the masterLast2RegisterDate
     */
    public String getMasterLast2RegisterDate() {
        return masterLast2RegisterDate;
    }

    /**
     * @return the masterLastMove
     */
    public XLDFDomainObject getMasterLastMove() {
        return masterLastMove;
    }

    /**
     * @return the masterPerson
     */
    public XLDFPersonDataDomainObject getMasterPerson() {
        return masterPerson;
    }

    /**
     * @return the memberIds
     */
    public List<String> getMemberIds() {
        if (memberIds == null) {
            memberIds = new ArrayList<String>();
        }
        return memberIds;
    }

    /**
     * @return the memberList
     */
    public List<MemberDTO> getMemberList() {
        return memberList;
    }

    /**
     * @return the memberPersonDataList
     */
    public List<XLDFPersonDataDomainObject> getMemberPersonDataList() {
        return memberPersonDataList;
    }

    /**
     * @return the moveInHouseheadId
     */
    public String getMoveInHouseheadId() {
        return moveInHouseheadId;
    }

    /**
     * @return the moveInHousehold
     */
    public XLDFHouseholdDataDomainObject getMoveInHousehold() {
        return moveInHousehold;
    }

    /**
     * @return the moveInHouseId
     */
    public String getMoveInHouseId() {
        return moveInHouseId;
    }

    /**
     * @return the moveInHousePerson
     */
    public XLDFPersonDataDomainObject getMoveInHousePerson() {
        return moveInHousePerson;
    }

    /**
     * @return the moveInSiteId
     */
    public String getMoveInSiteId() {
        return moveInSiteId;
    }

    /**
     * @return the moveInXldf021m
     */
    public XLDF021M getMoveInXldf021m() {
        return moveInXldf021m;
    }

    /**
     * @return the moveNoteList
     */
    public List<SelRegisterDTO> getMoveNoteList() {
        return moveNoteList;
    }

    /**
     * @return the oldFineEventDate
     */
    public String getOldFineEventDate() {
        return oldFineEventDate;
    }

    /**
     * @return the oldMoveHouseholdCurrentMark
     */
    public String getOldMoveHouseholdCurrentMark() {
        return oldMoveHouseholdCurrentMark;
    }

    /**
     * @return the oldMoveInHouseholdType
     */
    public String getOldMoveInHouseholdType() {
        return oldMoveInHouseholdType;
    }

    /**
     * @return the oldShowRegisterPersonId
     */
    public String getOldShowRegisterPersonId() {

        return oldShowRegisterPersonId;
    }

    /**
     * @return the openingOperationDTO
     */
    public OpeningOperationDTO getOpeningOperationDTO() {
        return openingOperationDTO;
    }

    /**
     * @return the operateDate
     */
    public String getOperateDate() {
        return operateDate;
    }

    /**
     * @return the operateionName
     */
    public String getOperateionName() {
        return operateionName;
    }

    /**
     * @return the operateTime
     */
    public String getOperateTime() {
        return operateTime;
    }

    /**
     * @return the orginNewConcurrentHeadMark
     */
    public String getOrginNewConcurrentHeadMark() {
        return orginNewConcurrentHeadMark;
    }

    /**
     * @return the orginNewHouseId
     */
    public String getOrginNewHouseId() {
        return orginNewHouseId;
    }

    /**
     * @return the orginNewHouseType
     */
    public String getOrginNewHouseType() {
        return orginNewHouseType;
    }

    /**
     * @return the originalSiteId
     */
    public String getOriginalSiteId() {
        return originalSiteId;
    }

    /**
     * @return the originDataList
     */
    public List<Rl01805OriginDataDTO> getOriginDataList() {
        return originDataList;
    }

    /**
     * @return the originNewHousehold
     */
    public XLDFHouseholdDataDomainObject getOriginNewHousehold() {
        return originNewHousehold;
    }

    public String getOriHeadNewMscMark() {
        return oriHeadNewMscMark;
    }

    /**
     * @return the oriResidentCnt
     */
    public Integer getOriResidentCnt() {
        return oriResidentCnt;
    }

    /**
     * @return the otherCertificate
     */
    public String getOtherCertificate() {
        return otherCertificate;
    }

    /**
     * @return the otherCertificateStatus
     */
    public String getOtherCertificateStatus() {
        return otherCertificateStatus;
    }

    /**
     * @return the otherNoteList
     */
    public List<SelRegisterDTO> getOtherNoteList() {
        return otherNoteList;
    }

    /**
     * @return the otherPersonIds
     */
    public List<String> getOtherPersonIds() {
        if (otherPersonIds == null) {
            otherPersonIds = new ArrayList<String>();
        }
        return otherPersonIds;
    }

    /**
     * @return the outHeadName
     */
    public String getOutHeadName() {
        return outHeadName;
    }

    /**
     * @return the outHeadPersonId
     */
    public String getOutHeadPersonId() {
        return outHeadPersonId;
    }

    /**
     * @return the outNewHeadName
     */
    public String getOutNewHeadName() {
        return outNewHeadName;
    }

    /**
     * @return the personDataSet
     */
    public List<Rl01805MoveinDTO> getPersonDataList() {

        return personDataList;
    }

    /**
     * @return the personNoteList
     */
    public List<XLDFPersonNoteDomainObject> getPersonNoteList() {
        return personNoteList;
    }

    /**
     * @return the personNum
     */
    public int getPersonNum() {
        return personNum;
    }

    /**
     * @return the qryinputList
     */
    public List<MoveQryInputDTO> getQryinputList() {
        return qryinputList;
    }

    /**
     * @return the rc1mSiteId
     */
    public String getRc1mSiteId() {
        return rc1mSiteId;
    }

    /**
     * @return the registerUserId
     */
    public String getRegisterUserId() {
        return registerUserId;
    }

    /**
     * @return the removeFeeReason
     */
    public String getRemoveFeeReason() {
        return removeFeeReason;
    }

    /**
     * @return the removeYear
     */
    public String getRemoveYear() {
        return removeYear;
    }

    public Map<String, List<XLDFDomainObject>> getReserveNoteMap() {
        return reserveNoteMap;
    }

    /**
     * @return the revokeNoteList
     */
    public List<SelRegisterDTO> getRevokeNoteList() {
        return revokeNoteList;
    }

    public Map<String, List<Object>> getRldfyDataMap() {
        return rldfyDataMap;
    }

    /**
     * @return the selectedM10m
     */
    public List<XLDFM10M> getSelectedM10m() {
        return selectedM10m;
    }

    /**
     * @return the selectedOriginDataDTO
     */
    public Rl01805OriginDataDTO getSelectedOriginDataDTO() {
        return selectedOriginDataDTO;
    }

    /**
     * @return the selectedPostiveApplication
     */
    public List<XLDFDomainObject> getSelectedPostiveApplication() {
        return selectedPostiveApplication;
    }

    /**
     * @return the selectRegisterList
     */
    public List<MoveInRegisterDTO> getSelectRegisterList() {
        return selectRegisterList;
    }

    /**
     * @return the showM10MList
     */
    public List<XLDFM10M> getShowM10MList() {
        return showM10MList;
    }

    /**
     * @return the showRegisterPersonId
     */
    public String getShowRegisterPersonId() {
        return showRegisterPersonId;
    }

    /**
     * @return the supplementNoteList
     */
    public List<SelRegisterDTO> getSupplementNoteList() {
        return supplementNoteList;
    }

    /**
     * @return the toModifyApplications
     */
    public List<XLDFDomainObject> getToModifyApplications() {
        return toModifyApplications;
    }

    public String getTransactionId() {
        return transactionId;
    }

    /**
     * @return the txnId
     */
    public String getTxnId() {
        return txnId;
    }

    public String getUserId() {
        return userId;
    }

    /**
     * @return the viewM10m
     */
    public XLDFM10M getViewM10m() {
        return viewM10m;
    }

    /**
     * @return the viewPostiveApplication
     */
    public XLDFDomainObject getViewPostiveApplication() {
        return viewPostiveApplication;
    }

    /**
     * @return the warnningList
     */
    public List<RlWarningMessage> getWarnningList() {
        return warnningList;
    }

    /**
     * @return the xLDFApplicantDataDTO1
     */
    public XLDFApplicantDataDTO getxLDFApplicantDataDTO1() {
        return xLDFApplicantDataDTO1;
    }

    /**
     * @return the xLDFApplicantDataDTO2
     */
    public XLDFApplicantDataDTO getxLDFApplicantDataDTO2() {
        return xLDFApplicantDataDTO2;
    }

    /**
     * @return the xLDFPersonBriefDataDTO
     */
    public XLDFPersonBriefDataDTO getxLDFPersonBriefDataDTO() {
        return xLDFPersonBriefDataDTO;
    }

    public List<XldfopracsType> getXldfyDataaccessList() {
        return xldfyDataaccessList;
    }

    /**
     * @return the allMoveFlag
     */
    public boolean isAllMoveFlag() {
        return allMoveFlag;
    }

    /**
     * @return the beenEnforcedMoveToAdminOfficeFlag
     */
    public boolean isBeenEnforcedMoveToAdminOfficeFlag() {
        return beenEnforcedMoveToAdminOfficeFlag;
    }

    /**
     * @return the beenEnforcedMoveToNonAdminOfficeFlag
     */
    public boolean isBeenEnforcedMoveToNonAdminOfficeFlag() {
        return beenEnforcedMoveToNonAdminOfficeFlag;
    }

    /**
     * @return the bigHouseholdFlag
     */
    public boolean isBigHouseholdFlag() {
        return bigHouseholdFlag;
    }

    /**
     * @return the deleteFineDTOFlag
     */
    public boolean isDeleteFineDTOFlag() {
        return deleteFineDTOFlag;
    }

    /**
     * @return the enforcedFlag
     */
    public boolean isEnforcedFlag() {
        return enforcedFlag;
    }

    /**
     * @return the fineButtonShow
     */
    public boolean isFineButtonShow() {
        return fineButtonShow;
    }

    /**
     * @return the fineFreeFlag
     */
    public boolean isFineFreeFlag() {
        return fineFreeFlag;
    }

    /**
     * @return the hasMember
     */
    public boolean isHasMember() {
        return hasMember;
    }

    /**
     * @return the initSuccess
     */
    public boolean isInitSuccess() {
        return initSuccess;
    }

    /**
     * @return the lastConcurnHead
     */
    public boolean isLastConcurnHead() {
        return lastConcurnHead;
    }

    /**
     * @return the lastNeedCheckFine
     */
    public boolean isLastNeedCheckFine() {
        return lastNeedCheckFine;
    }

    /**
     * @return the moveFakeFlag
     */
    public boolean isMoveFakeFlag() {
        return moveFakeFlag;
    }

    /**
     * @return the needCheckFine
     */
    public boolean isNeedCheckFine() {
        return needCheckFine;
    }

    /**
     * @return the needFineFlag
     */
    public boolean isNeedFineFlag() {
        return needFineFlag;
    }

    /**
     * @return the oldDataInMove
     */
    public boolean isOldDataInMove() {
        return oldDataInMove;
    }

    /**
     * @return the remainSameHouseholdIdAndHead
     */
    public boolean isRemainSameHouseholdIdAndHead() {
        return remainSameHouseholdIdAndHead;
    }

    /**
     * @return the isSameAdminOffice
     */
    public boolean isSameAdminOffice() {
        return isSameAdminOffice;
    }

    /**
     * @return the isSameHousehold
     */
    public boolean isSameHousehold() {
        return isSameHousehold;
    }

    /**
     * @return the saveButtonShow
     */
    public boolean isSaveButtonShow() {
        return saveButtonShow;
    }

    /**
     * @return the substituteFlag
     */
    public boolean isSubstituteFlag() {
        return substituteFlag;
    }

    /**
     * @param abolishNoteList
     *            the abolishNoteList to set
     */
    public void setAbolishNoteList(List<SelRegisterDTO> abolishNoteList) {
        this.abolishNoteList = abolishNoteList;
    }

    /**
     * @param acceptedAdminOfficeCode
     *            the acceptedAdminOfficeCode to set
     */
    public void setAcceptedAdminOfficeCode(String acceptedAdminOfficeCode) {
        this.acceptedAdminOfficeCode = acceptedAdminOfficeCode;
    }

    /**
     * @param acceptSiteId
     *            the acceptSiteId to set
     */
    public void setAcceptSiteId(String acceptSiteId) {
        this.acceptSiteId = acceptSiteId;
    }

    /**
     * @param activeIndex
     *            the activeIndex to set
     */
    public void setActiveIndex(String activeIndex) {
        this.activeIndex = activeIndex;
    }

    /**
     * @param addPersonId
     *            the addPersonId to set
     */
    public void setAddPersonId(String addPersonId) {
        this.addPersonId = addPersonId;
    }

    /**
     * @param allMoveFlag
     *            the allMoveFlag to set
     */
    public void setAllMoveFlag(boolean allMoveFlag) {
        this.allMoveFlag = allMoveFlag;
    }

    /**
     * @param applyCaseNo
     *            the applyCaseNo to set
     */
    public void setApplyCaseNo(String applyCaseNo) {
        this.applyCaseNo = applyCaseNo;
    }

    /**
     * @param applyDate
     *            the applyDate to set
     */
    public void setApplyDate(String applyDate) {
        this.applyDate = applyDate;
    }

    /**
     * @param applyPersonList
     *            the applyPersonList to set
     */
    public void setApplyPersonList(List<XLDFApplicantDataDTO> applyPersonList) {
        this.applyPersonList = applyPersonList;
    }

    /**
     * @param applyRegister
     *            the applyRegister to set
     */
    public void setApplyRegister(String applyRegister) {
        this.applyRegister = applyRegister;
    }

    /**
     * @param applySeq
     *            the applySeq to set
     */
    public void setApplySeq(String applySeq) {
        this.applySeq = applySeq;
    }

    /**
     * @param applySequenceId
     *            the applySequenceId to set
     */
    public void setApplySequenceId(String applySequenceId) {
        this.applySequenceId = applySequenceId;
    }

    /**
     * @param applySiteId
     *            the applySiteId to set
     */
    public void setApplySiteId(String applySiteId) {
        this.applySiteId = applySiteId;
    }

    /**
     * @param beenEnforcedMoveToAdminOfficeFlag
     *            the beenEnforcedMoveToAdminOfficeFlag to set
     */
    public void setBeenEnforcedMoveToAdminOfficeFlag(boolean beenEnforcedMoveToAdminOfficeFlag) {
        this.beenEnforcedMoveToAdminOfficeFlag = beenEnforcedMoveToAdminOfficeFlag;
    }

    /**
     * @param beenEnforcedMoveToNonAdminOfficeFlag
     *            the beenEnforcedMoveToNonAdminOfficeFlag to set
     */
    public void setBeenEnforcedMoveToNonAdminOfficeFlag(boolean beenEnforcedMoveToNonAdminOfficeFlag) {
        this.beenEnforcedMoveToNonAdminOfficeFlag = beenEnforcedMoveToNonAdminOfficeFlag;
    }

    /**
     * @param bigApplyKind
     *            the bigApplyKind to set
     */
    public void setBigApplyKind(String bigApplyKind) {
        this.bigApplyKind = bigApplyKind;
    }

    /**
     * @param bigHouseholdFlag
     *            the bigHouseholdFlag to set
     */
    public void setBigHouseholdFlag(boolean bigHouseholdFlag) {
        this.bigHouseholdFlag = bigHouseholdFlag;
    }

    /**
     * @param canbeCacnceledPersonNum
     *            the canbeCacnceledPersonNum to set
     */
    public void setCanbeCacnceledPersonNum(int canbeCacnceledPersonNum) {
        this.canbeCacnceledPersonNum = canbeCacnceledPersonNum;
    }

    /**
     * @param cancelReason
     *            the cancelReason to set
     */
    public void setCancelReason(String cancelReason) {
        this.cancelReason = cancelReason;
    }

    /**
     * @param certificate
     *            the certificate to set
     */
    public void setCertificate(List<String> certificate) {
        this.certificate = certificate;
    }

    /**
     * @param clearList
     *            the clearList to set
     */
    public void setClearList(List<ClearDTO> clearList) {
        this.clearList = clearList;
    }

    /**
     * @param commPerson
     *            the commPerson to set
     */
    public void setCommPerson(XLDFPersonBriefDataDTO commPerson) {
        this.commPerson = commPerson;
    }

    /**
     * @param concurrentHeadId
     *            the concurrentHeadId to set
     */
    public void setConcurrentHeadId(String concurrentHeadId) {
        this.concurrentHeadId = concurrentHeadId;
    }

    /**
     * @param conCurrentRealHousehold
     *            the conCurrentRealHousehold to set
     */
    public void setConCurrentRealHousehold(XLDFHouseholdDataDomainObject conCurrentRealHousehold) {
        this.conCurrentRealHousehold = conCurrentRealHousehold;
    }

    /**
     * @param conCurrentRealPerson
     *            the conCurrentRealPerson to set
     */
    public void setConCurrentRealPerson(XLDFPersonDataDomainObject conCurrentRealPerson) {
        this.conCurrentRealPerson = conCurrentRealPerson;
    }

    /**
     * @param concurrentSiteId
     *            the concurrentSiteId to set
     */
    public void setConcurrentSiteId(String concurrentSiteId) {
        this.concurrentSiteId = concurrentSiteId;
    }

    /**
     * @param correctChangeNoteList
     *            the correctChangeNoteList to set
     */
    public void setCorrectChangeNoteList(List<SelRegisterDTO> correctChangeNoteList) {
        this.correctChangeNoteList = correctChangeNoteList;
    }

    public void setDelete030M(List<XLDF030M> delete030m) {
        delete030M = delete030m;
    }

    /**
     * @param deleteFineDTOFlag
     *            the deleteFineDTOFlag to set
     */
    public void setDeleteFineDTOFlag(boolean deleteFineDTOFlag) {
        this.deleteFineDTOFlag = deleteFineDTOFlag;
    }

    public void setDeleteNoteMap(Map<String, List<XLDFDomainObject>> deleteNoteMap) {
        this.deleteNoteMap = deleteNoteMap;
    }

    /**
     * @param enforceApplyPerson
     *            the enforceApplyPerson to set
     */
    public void setEnforceApplyPerson(XldfefaplcType enforceApplyPerson) {
        this.enforceApplyPerson = enforceApplyPerson;
    }

    /**
     * @param enforcedFlag
     *            the enforcedFlag to set
     */
    public void setEnforcedFlag(boolean enforcedFlag) {
        this.enforcedFlag = enforcedFlag;
    }

    /**
     * @param fineButtonShow
     *            the fineButtonShow to set
     */
    public void setFineButtonShow(boolean fineButtonShow) {
        this.fineButtonShow = fineButtonShow;
    }

    /**
     * @param fineDTO
     *            the fineDTO to set
     */
    public void setFineDTO(FineDTO fineDTO) {
        this.fineDTO = fineDTO;
    }

    /**
     * @param fineEventDate
     *            the fineEventDate to set
     */
    public void setFineEventDate(String fineEventDate) {
        this.fineEventDate = fineEventDate;
    }

    /**
     * @param fineFreeFlag
     *            the fineFreeFlag to set
     */
    public void setFineFreeFlag(boolean fineFreeFlag) {
        this.fineFreeFlag = fineFreeFlag;
    }

    /**
     * @param finePersonData
     *            the finePersonData to set
     */
    public void setFinePersonData(FinePersonDTO finePersonData) {
        this.finePersonData = finePersonData;
    }

    /**
     * @param finePersonId
     *            the finePersonId to set
     */
    public void setFinePersonId(String finePersonId) {
        this.finePersonId = finePersonId;
    }

    /**
     * @param fineReceiptId
     *            the fineReceiptId to set
     */
    public void setFineReceiptId(String fineReceiptId) {
        this.fineReceiptId = fineReceiptId;
    }

    /**
     * @param hasMember
     *            the hasMember to set
     */
    public void setHasMember(boolean hasMember) {
        this.hasMember = hasMember;
    }

    /**
     * @param isHeadOut
     *            the isHeadOut to set
     */
    public void setHeadOut(boolean isHeadOut) {
        this.isHeadOut = isHeadOut;
    }

    /**
     * @param householdData
     *            the householdData to set
     */
    public void setHouseholdData(XLDFHouseholdDataDomainObject householdData) {
        this.householdData = householdData;
    }

    /**
     * @param householdNoteList
     *            the householdNoteList to set
     */
    public void setHouseholdNoteList(List<XLDFHouseholdNoteDomainObject> householdNoteList) {
        this.householdNoteList = householdNoteList;
    }

    /**
     * @param identityNoteList
     *            the identityNoteList to set
     */
    public void setIdentityNoteList(List<SelRegisterDTO> identityNoteList) {
        this.identityNoteList = identityNoteList;
    }

    /**
     * @param initSuccess
     *            the initSuccess to set
     */
    public void setInitSuccess(boolean initSuccess) {
        this.initSuccess = initSuccess;
    }

    public void setInitTime(String initTime) {
        this.initTime = initTime;
    }

    /**
     * @param isCancelOverseas
     *            the isCancelOverseas to set
     */
    public void setIsCancelOverseas(String isCancelOverseas) {
        this.isCancelOverseas = isCancelOverseas;
    }

    /**
     * @param isHeadOut
     *            the isHeadOut to set
     */
    public void setIsHeadOut(boolean isHeadOut) {
        this.isHeadOut = isHeadOut;
    }

    /**
     * @param isMoveFake
     *            the isMoveFake to set
     */
    public void setIsMoveFake(String isMoveFake) {
        this.isMoveFake = isMoveFake;
    }

    /**
     * @param isNewHouse
     *            the isNewHouse to set
     */
    public void setIsNewHouse(String isNewHouse) {
        this.isNewHouse = isNewHouse;
    }

    /**
     * @param isnotLawPeriod
     *            the isnotLawPeriod to set
     */
    public void setIsnotLawPeriod(String isnotLawPeriod) {
        this.isnotLawPeriod = isnotLawPeriod;
    }

    /**
     * @param isPunish
     *            the isPunish to set
     */
    public void setIsPunish(String isPunish) {
        this.isPunish = isPunish;
    }

    /**
     * @param lastConcurnHead
     *            the lastConcurnHead to set
     */
    public void setLastConcurnHead(boolean lastConcurnHead) {
        this.lastConcurnHead = lastConcurnHead;
    }

    /**
     * @param lastNeedCheckFine
     *            the lastNeedCheckFine to set
     */
    public void setLastNeedCheckFine(boolean lastNeedCheckFine) {
        this.lastNeedCheckFine = lastNeedCheckFine;
    }

    /**
     * @param lastQueryMoveinHouseHeadId
     *            the lastQueryMoveinHouseHeadId to set
     */
    public void setLastQueryMoveinHouseHeadId(String lastQueryMoveinHouseHeadId) {
        this.lastQueryMoveinHouseHeadId = lastQueryMoveinHouseHeadId;
    }

    /**
     * @param lawDate
     *            the lawDate to set
     */
    public void setLawDate(String lawDate) {
        this.lawDate = lawDate;
    }

    /**
     * @param m10mList
     *            the m10mList to set
     */
    public void setM10mList(List<XLDFM10M> m10mList) {
        this.m10mList = m10mList;
    }

    /**
     * @param massMovePeopleDataList
     *            the massMovePeopleDataList to set
     */
    public void setMassMovePeopleDataList(List<RlPersonalDataDTO> massMovePeopleDataList) {
        this.massMovePeopleDataList = massMovePeopleDataList;
    }

    /**
     * @param masterLast2RegisterDate
     *            the masterLast2RegisterDate to set
     */
    public void setMasterLast2RegisterDate(String masterLast2RegisterDate) {
        this.masterLast2RegisterDate = masterLast2RegisterDate;
    }

    /**
     * @param masterLastMove
     *            the masterLastMove to set
     */
    public void setMasterLastMove(XLDFDomainObject masterLastMove) {
        this.masterLastMove = masterLastMove;
    }

    /**
     * @param masterPerson
     *            the masterPerson to set
     */
    public void setMasterPerson(XLDFPersonDataDomainObject masterPerson) {
        this.masterPerson = masterPerson;
    }

    /**
     * @param memberIds
     *            the memberIds to set
     */
    public void setMemberIds(List<String> memberIds) {
        this.memberIds = memberIds;
    }

    /**
     * @param memberList
     *            the memberList to set
     */
    public void setMemberList(List<MemberDTO> memberList) {
        this.memberList = memberList;
    }

    /**
     * @param memberPersonDataList
     *            the memberPersonDataList to set
     */
    public void setMemberPersonDataList(List<XLDFPersonDataDomainObject> memberPersonDataList) {
        this.memberPersonDataList = memberPersonDataList;
    }

    /**
     * @param moveFakeFlag
     *            the moveFakeFlag to set
     */
    public void setMoveFakeFlag(boolean moveFakeFlag) {
        this.moveFakeFlag = moveFakeFlag;
    }

    /**
     * @param moveInHouseheadId
     *            the moveInHouseheadId to set
     */
    public void setMoveInHouseheadId(String moveInHouseheadId) {
        this.moveInHouseheadId = moveInHouseheadId;
    }

    /**
     * @param moveInHousehold
     *            the moveInHousehold to set
     */
    public void setMoveInHousehold(XLDFHouseholdDataDomainObject moveInHousehold) {
        this.moveInHousehold = moveInHousehold;
    }

    /**
     * @param moveInHouseId
     *            the moveInHouseId to set
     */
    public void setMoveInHouseId(String moveInHouseId) {
        this.moveInHouseId = moveInHouseId;
    }

    /**
     * @param moveInHousePerson
     *            the moveInHousePerson to set
     */
    public void setMoveInHousePerson(XLDFPersonDataDomainObject moveInHousePerson) {
        this.moveInHousePerson = moveInHousePerson;
    }

    /**
     * @param moveInSiteId
     *            the moveInSiteId to set
     */
    public void setMoveInSiteId(String moveInSiteId) {
        this.moveInSiteId = moveInSiteId;
    }

    /**
     * @param moveInXldf021m
     *            the moveInXldf021m to set
     */
    public void setMoveInXldf021m(XLDF021M moveInXldf021m) {
        this.moveInXldf021m = moveInXldf021m;
    }

    /**
     * @param moveNoteList
     *            the moveNoteList to set
     */
    public void setMoveNoteList(List<SelRegisterDTO> moveNoteList) {
        this.moveNoteList = moveNoteList;
    }

    /**
     * @param needCheckFine
     *            the needCheckFine to set
     */
    public void setNeedCheckFine(boolean needCheckFine) {
        this.needCheckFine = needCheckFine;
    }

    /**
     * @param needFineFlag
     *            the needFineFlag to set
     */
    public void setNeedFineFlag(boolean needFineFlag) {
        this.needFineFlag = needFineFlag;
    }

    /**
     * @param oldDataInMove
     *            the oldDataInMove to set
     */
    public void setOldDataInMove(boolean oldDataInMove) {
        this.oldDataInMove = oldDataInMove;
    }

    /**
     * @param oldFineEventDate
     *            the oldFineEventDate to set
     */
    public void setOldFineEventDate(String oldFineEventDate) {
        this.oldFineEventDate = oldFineEventDate;
    }

    /**
     * @param oldMoveHouseholdCurrentMark
     *            the oldMoveHouseholdCurrentMark to set
     */
    public void setOldMoveHouseholdCurrentMark(String oldMoveHouseholdCurrentMark) {
        this.oldMoveHouseholdCurrentMark = oldMoveHouseholdCurrentMark;
    }

    /**
     * @param oldMoveInHouseholdType
     *            the oldMoveInHouseholdType to set
     */
    public void setOldMoveInHouseholdType(String oldMoveInHouseholdType) {
        this.oldMoveInHouseholdType = oldMoveInHouseholdType;
    }

    /**
     * @param oldShowRegisterPersonId
     *            the oldShowRegisterPersonId to set
     */
    public void setOldShowRegisterPersonId(String oldShowRegisterPersonId) {
        this.oldShowRegisterPersonId = oldShowRegisterPersonId;
    }

    /**
     * @param openingOperationDTO
     *            the openingOperationDTO to set
     */
    public void setOpeningOperationDTO(OpeningOperationDTO openingOperationDTO) {
        this.openingOperationDTO = openingOperationDTO;
    }

    /**
     * @param operateDate
     *            the operateDate to set
     */
    public void setOperateDate(String operateDate) {
        this.operateDate = operateDate;
    }

    /**
     * @param operateionName
     *            the operateionName to set
     */
    public void setOperateionName(String operateionName) {
        this.operateionName = operateionName;
    }

    /**
     * @param operateTime
     *            the operateTime to set
     */
    public void setOperateTime(String operateTime) {
        this.operateTime = operateTime;
    }

    /**
     * @param orginNewConcurrentHeadMark
     *            the orginNewConcurrentHeadMark to set
     */
    public void setOrginNewConcurrentHeadMark(String orginNewConcurrentHeadMark) {
        this.orginNewConcurrentHeadMark = orginNewConcurrentHeadMark;
    }

    /**
     * @param orginNewHouseId
     *            the orginNewHouseId to set
     */
    public void setOrginNewHouseId(String orginNewHouseId) {
        this.orginNewHouseId = orginNewHouseId;
    }

    /**
     * @param orginNewHouseType
     *            the orginNewHouseType to set
     */
    public void setOrginNewHouseType(String orginNewHouseType) {
        this.orginNewHouseType = orginNewHouseType;
    }

    /**
     * @param originalSiteId
     *            the originalSiteId to set
     */
    public void setOriginalSiteId(String originalSiteId) {
        this.originalSiteId = originalSiteId;
    }

    /**
     * @param originDataList
     *            the originDataList to set
     */
    public void setOriginDataList(List<Rl01805OriginDataDTO> originDataList) {
        this.originDataList = originDataList;
    }

    /**
     * @param originNewHousehold
     *            the originNewHousehold to set
     */
    public void setOriginNewHousehold(XLDFHouseholdDataDomainObject originNewHousehold) {
        this.originNewHousehold = originNewHousehold;
    }

    public void setOriHeadNewMscMark(String oriHeadNewMscMark) {
        this.oriHeadNewMscMark = oriHeadNewMscMark;
    }

    /**
     * @param oriResidentCnt
     *            the oriResidentCnt to set
     */
    public void setOriResidentCnt(Integer oriResidentCnt) {
        this.oriResidentCnt = oriResidentCnt;
    }

    /**
     * @param otherCertificate
     *            the otherCertificate to set
     */
    public void setOtherCertificate(String otherCertificate) {
        this.otherCertificate = otherCertificate;
    }

    /**
     * @param otherCertificateStatus
     *            the otherCertificateStatus to set
     */
    public void setOtherCertificateStatus(String otherCertificateStatus) {
        this.otherCertificateStatus = otherCertificateStatus;
    }

    /**
     * @param otherNoteList
     *            the otherNoteList to set
     */
    public void setOtherNoteList(List<SelRegisterDTO> otherNoteList) {
        this.otherNoteList = otherNoteList;
    }

    /**
     * @param otherPersonIds
     *            the otherPersonIds to set
     */
    public void setOtherPersonIds(List<String> otherPersonIds) {
        this.otherPersonIds = otherPersonIds;
    }

    /**
     * @param outHeadName
     *            the outHeadName to set
     */
    public void setOutHeadName(String outHeadName) {
        this.outHeadName = outHeadName;
    }

    /**
     * @param outHeadPersonId
     *            the outHeadPersonId to set
     */
    public void setOutHeadPersonId(String outHeadPersonId) {
        this.outHeadPersonId = outHeadPersonId;
    }

    /**
     * @param outNewHeadName
     *            the outNewHeadName to set
     */
    public void setOutNewHeadName(String outNewHeadName) {
        this.outNewHeadName = outNewHeadName;
    }

    /**
     * @param personDataSet
     *            the personDataSet to set
     */
    public void setPersonDataList(List<Rl01805MoveinDTO> personDataList) {
        this.personDataList = personDataList;
    }

    /**
     * @param personNoteList
     *            the personNoteList to set
     */
    public void setPersonNoteList(List<XLDFPersonNoteDomainObject> personNoteList) {
        this.personNoteList = personNoteList;
    }

    /**
     * @param personNum
     *            the personNum to set
     */
    public void setPersonNum(int personNum) {
        this.personNum = personNum;
    }

    /**
     * @param qryinputList
     *            the qryinputList to set
     */
    public void setQryinputList(List<MoveQryInputDTO> qryinputList) {
        this.qryinputList = qryinputList;
    }

    /**
     * @param rc1mSiteId
     *            the rc1mSiteId to set
     */
    public void setRc1mSiteId(String rc1mSiteId) {
        this.rc1mSiteId = rc1mSiteId;
    }

    /**
     * @param registerUserId
     *            the registerUserId to set
     */
    public void setRegisterUserId(String registerUserId) {
        this.registerUserId = registerUserId;
    }

    /**
     * @param remainSameHouseholdIdAndHead
     *            the remainSameHouseholdIdAndHead to set
     */
    public void setRemainSameHouseholdIdAndHead(boolean remainSameHouseholdIdAndHead) {
        this.remainSameHouseholdIdAndHead = remainSameHouseholdIdAndHead;
    }

    /**
     * @param removeFeeReason
     *            the removeFeeReason to set
     */
    public void setRemoveFeeReason(String removeFeeReason) {
        this.removeFeeReason = removeFeeReason;
    }

    /**
     * @param removeYear
     *            the removeYear to set
     */
    public void setRemoveYear(String removeYear) {
        this.removeYear = removeYear;
    }

    public void setReserveNoteMap(Map<String, List<XLDFDomainObject>> reserveNoteMap) {
        this.reserveNoteMap = reserveNoteMap;
    }

    /**
     * @param revokeNoteList
     *            the revokeNoteList to set
     */
    public void setRevokeNoteList(List<SelRegisterDTO> revokeNoteList) {
        this.revokeNoteList = revokeNoteList;
    }

    public void setRldfyDataMap(Map<String, List<Object>> rldfyDataMap) {
        this.rldfyDataMap = rldfyDataMap;
    }

    /**
     * @param isSameAdminOffice
     *            the isSameAdminOffice to set
     */
    public void setSameAdminOffice(boolean isSameAdminOffice) {
        this.isSameAdminOffice = isSameAdminOffice;
    }

    /**
     * @param isSameHousehold
     *            the isSameHousehold to set
     */
    public void setSameHousehold(boolean isSameHousehold) {
        this.isSameHousehold = isSameHousehold;
    }

    /**
     * @param saveButtonShow
     *            the saveButtonShow to set
     */
    public void setSaveButtonShow(boolean saveButtonShow) {
        this.saveButtonShow = saveButtonShow;
    }

    /**
     * @param selectedM10m
     *            the selectedM10m to set
     */
    public void setSelectedM10m(List<XLDFM10M> selectedM10m) {
        this.selectedM10m = selectedM10m;
    }

    /**
     * @param selectedOriginDataDTO
     *            the selectedOriginDataDTO to set
     */
    public void setSelectedOriginDataDTO(Rl01805OriginDataDTO selectedOriginDataDTO) {
        this.selectedOriginDataDTO = selectedOriginDataDTO;
    }

    /**
     * @param selectedPostiveApplication
     *            the selectedPostiveApplication to set
     */
    public void setSelectedPostiveApplication(List<XLDFDomainObject> selectedPostiveApplication) {
        this.selectedPostiveApplication = selectedPostiveApplication;
    }

    /**
     * @param selectRegisterList
     *            the selectRegisterList to set
     */
    public void setSelectRegisterList(List<MoveInRegisterDTO> selectRegisterList) {
        this.selectRegisterList = selectRegisterList;
    }

    /**
     * @param showM10MList
     *            the showM10MList to set
     */
    public void setShowM10MList(List<XLDFM10M> showM10MList) {
        this.showM10MList = showM10MList;
    }

    /**
     * @param showRegisterPersonId
     *            the showRegisterPersonId to set
     */
    public void setShowRegisterPersonId(String showRegisterPersonId) {
        this.showRegisterPersonId = showRegisterPersonId;
    }

    /**
     * @param substituteFlag
     *            the substituteFlag to set
     */
    public void setSubstituteFlag(boolean substituteFlag) {
        this.substituteFlag = substituteFlag;
    }

    /**
     * @param supplementNoteList
     *            the supplementNoteList to set
     */
    public void setSupplementNoteList(List<SelRegisterDTO> supplementNoteList) {
        this.supplementNoteList = supplementNoteList;
    }

    /**
     * @param toModifyApplications
     *            the toModifyApplications to set
     */
    public void setToModifyApplications(List<XLDFDomainObject> toModifyApplications) {
        this.toModifyApplications = toModifyApplications;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    /**
     * @param txnId
     *            the txnId to set
     */
    public void setTxnId(String txnId) {
        this.txnId = txnId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * @param viewM10m
     *            the viewM10m to set
     */
    public void setViewM10m(XLDFM10M viewM10m) {
        this.viewM10m = viewM10m;
    }

    /**
     * @param viewPostiveApplication
     *            the viewPostiveApplication to set
     */
    public void setViewPostiveApplication(XLDFDomainObject viewPostiveApplication) {
        this.viewPostiveApplication = viewPostiveApplication;
    }

    /**
     * @param warnningList
     *            the warnningList to set
     */
    public void setWarnningList(List<RlWarningMessage> warnningList) {
        this.warnningList = warnningList;
    }

    /**
     * @param xLDFApplicantDataDTO1
     *            the xLDFApplicantDataDTO1 to set
     */
    public void setxLDFApplicantDataDTO1(XLDFApplicantDataDTO xLDFApplicantDataDTO1) {
        this.xLDFApplicantDataDTO1 = xLDFApplicantDataDTO1;
    }

    /**
     * @param xLDFApplicantDataDTO2
     *            the xLDFApplicantDataDTO2 to set
     */
    public void setxLDFApplicantDataDTO2(XLDFApplicantDataDTO xLDFApplicantDataDTO2) {
        this.xLDFApplicantDataDTO2 = xLDFApplicantDataDTO2;
    }

    /**
     * @param xLDFPersonBriefDataDTO
     *            the xLDFPersonBriefDataDTO to set
     */
    public void setxLDFPersonBriefDataDTO(XLDFPersonBriefDataDTO xLDFPersonBriefDataDTO) {
        this.xLDFPersonBriefDataDTO = xLDFPersonBriefDataDTO;
    }

    public void setXldfyDataaccessList(List<XldfopracsType> xldfyDataaccessList) {
        this.xldfyDataaccessList = xldfyDataaccessList;
    }

}

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
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

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
import tw.gov.moi.rl.component.xldf.dto.XLDF030T;
import tw.gov.moi.rl.domain.xldf.XLDFHouseholdDataDomainObject;
import tw.gov.moi.rl.domain.xldf.XLDFHouseholdNoteDomainObject;
import tw.gov.moi.rl.domain.xldf.XLDFPersonDataDomainObject;
import tw.gov.moi.rl.domain.xldf.XLDFPersonNoteDomainObject;

/**
 * Rl01310DTO 遷入登記DTO
 * 
 * @author Marcus Chen
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl01310DTO", propOrder = { "openingOperationDTO", "personDataList", "originDataList",
        "selectRegisterList", "moveInHousePerson", "householdData", "moveInHousehold", "originNewHousehold",
        "memberList" })
@XmlRootElement(name = "Rl01310DTO")
public class Rl01310DTO implements Serializable {

    /** Serial Id. */
    private static final long serialVersionUID = 598726909330491199L;

    /** OpeningOperationDTO 4/18 */
    @XmlElement(name = "OpeningOperationDTO")
    @FieldName("戶籍登記作業共通DTO")
    private OpeningOperationDTO openingOperationDTO = new OpeningOperationDTO();

    /** 當事人個人資料. */
    @XmlElement(name = "PersonDataList")
    @FieldName("當事人個人資料")
    private List<MoveInDTO> personDataList = new ArrayList<MoveInDTO>();

    /** 原住地個人資料. */
    @XmlElement(name = "OriginDataList")
    @FieldName("原住地個人資料")
    private List<OriginDataDTO> originDataList = new ArrayList<OriginDataDTO>();

    /** 當事人個人記事資料. */
    @XmlElement(name = "SelectRegisterList")
    @FieldName("當事人個人記事資料")
    private List<MoveInRegisterDTO> selectRegisterList = new ArrayList<MoveInRegisterDTO>();

    /** 戶內成員personDataObject */
    @XmlElement(name = "MembersPersonData")
    @FieldName("戶內成員personDataObject")
    private List<XLDFPersonDataDomainObject> membersPersonData = new ArrayList<XLDFPersonDataDomainObject>();

    /** 遷入戶長個人資料. */
    @XmlElement(name = "MoveInHousePerson")
    @FieldName("遷入戶長個人資料")
    private XLDFPersonDataDomainObject moveInHousePerson;

    /** 遷出地戶長個人資料. */
    @XmlElement(name = "OriHeadData")
    @FieldName("遷出地戶長個人資料")
    private XLDFPersonDataDomainObject oriHeadData;

    /** 兼任戶長本人個人資料. */
    @XmlElement(name = "ConCurrentRealPerson")
    @FieldName("兼任戶長本人個人資料")
    private XLDFPersonDataDomainObject conCurrentRealPerson;

    /** 原住地原全戶資料. */
    @XmlElement(name = "HouseholdData")
    @FieldName("原住地原全戶資料")
    private XLDFHouseholdDataDomainObject householdData;

    /** 當事人新戶資料. */
    @XmlElement(name = "MoveInHousehold")
    @FieldName("當事人新戶資料")
    private XLDFHouseholdDataDomainObject moveInHousehold;

    /** 原住地新戶資料. */
    @XmlElement(name = "OriginNewHousehold")
    @FieldName("原住地新戶資料")
    private XLDFHouseholdDataDomainObject originNewHousehold;

    /** 申請人資料. */
    @XmlElement(name = "ApplyPersonList")
    @FieldName("申請人資料")
    private List<XLDFApplicantDataDTO> applyPersonList = new ArrayList<XLDFApplicantDataDTO>();

    /** 受委託人資料. */
    @XmlElement(name = "CommPerson")
    @FieldName("受委託人資料")
    private XLDFPersonBriefDataDTO commPerson = new XLDFPersonBriefDataDTO();

    /** 戶內成員清單. */
    private List<MemberDTO> memberList = new ArrayList<MemberDTO>();

    /** 戶內成員清單. */
    @XmlElement(name = "memberPersonDataList", required = true)
    @FieldName("戶內成員資料清單")
    private List<XLDFPersonDataDomainObject> memberPersonDataList = new ArrayList<XLDFPersonDataDomainObject>();

    /** 當事人清除清單. */
    @XmlElement(name = "ClearList")
    @FieldName("當事人清除清單")
    private List<ClearDTO> clearList = new ArrayList<ClearDTO>();

    /** 個人記事清單資料. */
    @XmlElement(name = "personNoteList")
    @FieldName("個人記事清單資料")
    private List<XLDFPersonNoteDomainObject> personNoteList = new ArrayList<XLDFPersonNoteDomainObject>();

    /** 全戶記事清單 */
    @XmlElement(name = "householdNoteList")
    @FieldName("全戶記事清單")
    private List<XLDFHouseholdNoteDomainObject> householdNoteList = new ArrayList<XLDFHouseholdNoteDomainObject>();

    @XmlElement(name = "OnlyMasterPersonList", required = true)
    @FieldName("住變當事人List(只有大簿當事人)")
    private List<MoveInDTO> onlyMasterPersonList = new ArrayList<MoveInDTO>(1);

    /** 大簿當事人個人資料料. */
    @XmlElement(name = "MasterPerson")
    @FieldName("大簿當事人個人資料料")
    private XLDFPersonDataDomainObject masterPerson;

    /** 大簿當事人個人資料料. */
    @XmlElement(name = "EnforceApplyPerson")
    @FieldName("大簿當事人個人資料(逕為登記)")
    private XldfefaplcType enforceApplyPerson;

    /** 遷入地戶號配賦. 4/4 */
    @XmlElement(name = "MoveInXldf021m")
    @FieldName("遷入地戶號配賦")
    private XLDF021M moveInXldf021m;

    /** 戶內人口統號清單. */
    @XmlElement(name = "MemberIds")
    @FieldName("戶內人口統號清單")
    private List<String> memberIds;

    /** 戶內非現住人口統號清單. 4/27 */
    @XmlElement(name = "OtherPersonIds")
    @FieldName("戶內非現住人口統號清單")
    private List<String> otherPersonIds;

    /** 當事人新增視窗 被輸入的personID. */
    @XmlElement(name = "AddPersonId")
    @FieldName("當事人新增視窗 被輸入的personID")
    private String addPersonId;

    /** 異地辦理旗標. */
    @XmlElement(name = "SubstituteFlag")
    @FieldName("異地辦理旗標")
    private boolean substituteFlag;

    /** 全戶遷出旗標. */
    @XmlElement(name = "AllMoveFlag")
    @FieldName("全戶遷出旗標")
    private boolean allMoveFlag;

    /** (是否為)中斷後遷入. */
    @XmlElement(name = "breakDownMovein", required = true)
    @FieldName("中斷後遷入")
    private boolean breakDownMovein = Boolean.FALSE;

    /** 遷入地作業點代碼. */
    @XmlElement(name = "moveInSiteId", required = true)
    @FieldName("遷入地作業點代碼")
    private String moveInSiteId;

    /** 原住地. */
    @XmlElement(name = "OriginalSiteId", required = true)
    @FieldName("原住地點代碼")
    private String originalSiteId;

    /** 申請種類. */
    @XmlElement(name = "ApplyKind", required = true)
    @FieldName("申請種類")
    private String applyKind;

    /** 遷入種類補登時. */
    @XmlElement(name = "moveinType", required = true)
    @FieldName("遷入種類補登時")
    private String moveinType;

    /** 是否原址恢復戶籍. */
    @XmlElement(name = "ifTheSameAddressRegain", required = true)
    @FieldName("是否原址恢復戶籍")
    private boolean ifTheSameAddressRegain = Boolean.FALSE;

    /*** ========================其他申請資料頁籤======================= */

    /** 其他申請資料頁籤-遷入戶號. */
    @XmlElement(name = "MoveInHouseId", required = true)
    @FieldName("其他申請資料頁籤-遷入戶號")
    private String moveInHouseId;

    /** 其他申請資料頁籤-遷入戶長國民身分證統一編號. */
    @XmlElement(name = "MoveInHouseheadId", required = true)
    @FieldName("其他申請資料頁籤-遷入戶長國民身分證統一編號")
    private String moveInHouseheadId;

    /** 其他申請資料頁籤-是否自立新戶 1:是 2:否 . */
    @XmlElement(name = "IsNewHouse", required = true)
    @FieldName("其他申請資料頁籤-是否自立新戶 1:是 2:否 .")
    private String isNewHouse;

    /** 其他申請資料頁籤-兼任戶長國民身分證統一編號. */
    @XmlElement(name = "ConcurrentHeadId", required = true)
    @FieldName("其他申請資料頁籤-是否自立新戶 1:是 2:否 .")
    private String concurrentHeadId;

    /** 其他申請資料頁籤-兼任戶長-作業點代碼. */
    @XmlElement(name = "ConcurrentSiteId", required = true)
    @FieldName("其他申請資料頁籤-兼任戶長-作業點代碼")
    private String concurrentSiteId;

    /** 其他申請資料頁籤-備註. */
    @XmlElement(name = "ApplyRegister", required = true)
    @FieldName("其他申請資料頁籤-備註")
    private String applyRegister;

    /** 其他申請資料頁籤-附繳證件. */
    @XmlElement(name = "Certificate", required = true)
    @FieldName("其他申請資料頁籤-附繳證件")
    private List<String> certificate;

    /** 顯示其他附繳證件輸入欄位與否 */
    @XmlElement(name = "OtherCertificateStatus", required = true)
    @FieldName("顯示其他附繳證件輸入欄位與否")
    private String otherCertificateStatus;

    /** 其他申請資料頁籤-其他附繳證件. */
    @XmlElement(name = "OtherCertificate", required = true)
    @FieldName("其他申請資料頁籤-其他附繳證件")
    private String otherCertificate;

    /** 其他申請資料頁籤-須進行罰鍰處理. */
    @XmlElement(name = "IsPunish", required = true)
    @FieldName("其他申請資料頁籤-須進行罰鍰處理")
    private String isPunish;

    /** 其他申請資料頁籤-於法定期間申報. */
    @XmlElement(name = "IsnotLawPeriod", required = true)
    @FieldName("其他申請資料頁籤-須進行罰鍰處理")
    private String isnotLawPeriod;

    /** 其他申請資料頁籤-須進行逾期申請之罰鍰處理. */
    @XmlElement(name = "NeedCheckFine", required = true)
    @FieldName(" 其他申請資料頁籤-須進行逾期申請之罰鍰處理")
    private boolean needCheckFine;

    /** 其他申請資料頁籤-須進行逾期申請之罰鍰處理(上次的選擇). */
    @XmlElement(name = "LastNeedCheckFine", required = true)
    @FieldName(" 其他申請資料頁籤-須進行逾期申請之罰鍰處理(上次的選擇)")
    private boolean lastNeedCheckFine;

    /** 要刪除FINEDTOFLAG. */
    @XmlElement(name = "DeleteFineDTOFlag", required = true)
    @FieldName("要刪除FINEDTOFLAG")
    private boolean deleteFineDTOFlag;

    /** 其他申請資料頁籤-事件發生(確定)日期. */
    @XmlElement(name = "FineEventDate", required = true)
    @FieldName(" 其他申請資料頁籤-事件發生(確定)日期")
    private String fineEventDate;

    /** 記事與罰鍰資料頁籤-目前有罰鍰改為不須罰鍰. */
    @XmlElement(name = "FineFreeFlag", required = true)
    @FieldName("記事與罰鍰資料頁籤-目前有罰鍰改為不須罰鍰")
    private boolean fineFreeFlag;

    /** 記事與罰鍰資料頁籤-免罰原因. */
    @XmlElement(name = "RemoveFeeReason", required = true)
    @FieldName("記事與罰鍰資料頁籤-免罰原因")
    private String removeFeeReason;

    /** 其他申請資料頁籤-法定應申報日期. */
    @XmlElement(name = "LawDate", required = true)
    @FieldName("記事與罰鍰資料頁籤-免罰原因")
    private String lawDate;

    /** 其他申請資料頁籤-遷出戶戶長未提供戶口名簿. */
    @XmlElement(name = "IsnotHousebook", required = true)
    @FieldName("其他申請資料頁籤-遷出戶戶長未提供戶口名簿")
    private String isnotHousebook;

    /** 其他申請資料頁籤-遷入統計註記. */
    @XmlElement(name = "StatisticMoveinCode", required = true)
    @FieldName("其他申請資料頁籤-遷入統計註記")
    private String statisticMoveinCode;

    /** 其他申請資料頁籤-發生時期. */
    @XmlElement(name = "HappenPeriod", required = true)
    @FieldName("其他申請資料頁籤-發生時期")
    private String happenPeriod;

    /** 其他申請資料頁籤-申請日期. */
    @XmlElement(name = "ApplyDate", required = true)
    @FieldName("其他申請資料頁籤-申請日期")
    private String applyDate;

    /** 其他申請資料頁籤-國籍. */
    @XmlElement(name = "ForeignCountry", required = true)
    @FieldName("其他申請資料頁籤-國籍")
    private String foreignCountry;

    /** 其他申請資料頁籤-撤銷喪失國籍日期. */
    @XmlElement(name = "CancelLoseCitizenDate", required = true)
    @FieldName("其他申請資料頁籤-撤銷喪失國籍日期")
    private String cancelLoseCitizenDate;

    /** 其他申請資料頁籤-遷入事由. */
    @XmlElement(name = "MoveInReason", required = true)
    @FieldName(" 其他申請資料頁籤-遷入事由")
    private String moveInReason;

    /** 其他申請資料頁籤-事由發生日期. */

    @XmlElement(name = "MoveInReasonDate", required = true)
    @FieldName(" 其他申請資料頁籤-事由發生日期")
    private String moveInReasonDate;

    /** 其他申請資料頁籤-入境日期. */
    @XmlElement(name = "ImmigrationDate", required = true)
    @FieldName("其他申請資料頁籤-入境日期")
    private String immigrationDate;

    /** 是否有戶內成員. */
    @XmlElement(name = "HasMember", required = true)
    @FieldName("是否有戶內成員")
    private boolean hasMember;

    /** 其他申請資料頁籤-是否有戶內成員. */
    @XmlElement(name = "IsHeadOut", required = true)
    @FieldName(" 其他申請資料頁籤-是否原住地戶長遷出")
    private boolean isHeadOut;

    /** 原住地資料頁籤-戶號 */

    @XmlElement(name = "OrginNewHouseId", required = true)
    @FieldName("原住地資料頁籤-戶號")
    private String orginNewHouseId;

    /** 原住地資料頁籤-戶別 */
    @XmlElement(name = "OrginNewHouseId", required = true)
    @FieldName("原住地資料頁籤-戶別")
    private String orginNewHouseType;

    /** 原住地資料頁籤-兼任戶長註記 */
    @XmlElement(name = "OrginNewConcurrentHeadMark", required = true)
    @FieldName("原住地資料頁籤-兼任戶長註記")
    private String orginNewConcurrentHeadMark;

    /** 要顯示記事的國民身分證統一編號. */
    @XmlElement(name = "ShowRegisterPersonId", required = true)
    @FieldName("要顯示記事的國民身分證統一編號")
    private String showRegisterPersonId;

    /** 上次選取的要顯示記事的國民身分證統一編號. */
    @XmlElement(name = "OldShowRegisterPersonId", required = true)
    @FieldName(" 上次選取的要顯示記事的國民身分證統一編")
    private String oldShowRegisterPersonId;

    /** 系統日期. */
    @XmlElement(name = "OperateDate", required = true)
    @FieldName(" 系統日期")
    private String operateDate;

    /** 系統時間. */
    @XmlElement(name = "OperateTime", required = true)
    @FieldName("系統時間")
    private String operateTime;

    /** 原住地原戶長地區代碼. */
    @XmlElement(name = "OutHeadAreaCode", required = true)
    @FieldName("原住地原戶長地區代碼")
    private String outHeadAreaCode;

    /** 原住地原戶長戶政所代碼. */
    @XmlElement(name = "OutHeadAdminOfficeCode", required = true)
    @FieldName("原住地原戶長戶政所代碼")
    private String outHeadAdminOfficeCode;

    /** 原住地原戶長姓名. */
    @XmlElement(name = "OutHeadName", required = true)
    @FieldName("原住地原戶長姓名")
    private String outHeadName;

    /** 原住地原戶長統號. */
    @XmlElement(name = "OutHeadPersonId", required = true)
    @FieldName("原住地原戶長統號")
    private String outHeadPersonId;

    /** 原住地新戶長姓名 . */
    @XmlElement(name = "OutNewHeadName", required = true)
    @FieldName("原住地新戶長姓名")
    private String outNewHeadName;

    /** 兼任戶長本人全戶資料 . */
    @XmlElement(name = "ConCurrentRealHousehold", required = true)
    @FieldName("兼任戶長本人全戶資料")
    private XLDFHouseholdDataDomainObject conCurrentRealHousehold;

    /** 是否原址恢復戶籍. */
    @XmlElement(name = "IfTheSameAddressRegainOption", required = true)
    @FieldName("是否原址恢復戶籍")
    private String ifTheSameAddressRegainOption;

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
    @XmlElement(name = "xLDFPersonBriefDataDTO", required = true)
    @FieldName("受委託人")
    private XLDFPersonBriefDataDTO xLDFPersonBriefDataDTO = new XLDFPersonBriefDataDTO();

    /** 身分登記記事 */
    @XmlElement(name = "IdentityNoteList", required = true)
    @FieldName("身分登記記事")
    private List<SelRegisterDTO> identityNoteList;

    /** 遷徙登記記事 */
    @XmlElement(name = "MoveNoteList", required = true)
    @FieldName("遷徙登記記事")
    private List<SelRegisterDTO> moveNoteList;

    /** 廢止登記記事 */
    @XmlElement(name = "AbolishNoteList", required = true)
    @FieldName("廢止登記記事")
    private List<SelRegisterDTO> abolishNoteList;

    /** 更正登記記事 */
    @XmlElement(name = "CorrectChangeNoteList", required = true)
    @FieldName("更正登記記事")
    private List<SelRegisterDTO> correctChangeNoteList;

    /** 撤銷登記記事 */
    @XmlElement(name = "RevokeNoteList", required = true)
    @FieldName("撤銷登記記事")
    private List<SelRegisterDTO> revokeNoteList;
    /** 其他登記記事 */
    @XmlElement(name = "RevokeNoteList", required = true)
    @FieldName("其他登記記事")
    private List<SelRegisterDTO> otherNoteList;

    /** 遷入地原戶別 */
    @XmlElement(name = "OldMoveInHouseholdType", required = true)
    @FieldName("遷入地原戶別 ")
    private String oldMoveInHouseholdType;

    /** 遷入地原兼任戶長註記 */
    @XmlElement(name = "OldMoveHouseholdCurrentMark", required = true)
    @FieldName("遷入地原兼任戶長註記 ")
    private String oldMoveHouseholdCurrentMark;

    /** 被挑選的戶長 */
    @XmlElement(name = "SelectedOriginDataDTO", required = true)
    @FieldName("被挑選的戶長 ")
    private OriginDataDTO selectedOriginDataDTO;

    /** 上次Query的遷入戶長ID */
    @XmlElement(name = "LastQueryMoveinHouseHeadId", required = true)
    @FieldName("上次Query的遷入戶長ID")
    private String lastQueryMoveinHouseHeadId;

    /** 現住人口數 */
    @XmlElement(name = "PersonNum", required = true)
    @FieldName("現住人口數")
    private int personNum;

    /** 當事人資料種類. */
    @XmlElement(name = "PersonDataKind", required = true)
    @FieldName("當事人資料種類")
    private String personDataKind;

    /** 除戶年度. */
    @XmlElement(name = "RemoveYear", required = true)
    @FieldName("除戶年度")
    private String removeYear;

    /** 當事人有舊戶資料. */
    @XmlElement(name = "OldDataInMove", required = true)
    @FieldName("當事人有舊戶資料")
    private boolean oldDataInMove;

    /** 收據號碼. */
    @XmlElement(name = "FineReceiptId", required = true)
    @FieldName("收據號碼")
    private String fineReceiptId;

    /** 是否逕為登記. */
    @XmlElement(name = "EnforcedFlag", required = true)
    @FieldName("是否逕為登記")
    private boolean enforcedFlag;

    /** 電腦化前的住址. */
    @XmlElement(name = "FreeformatAddress", required = true)
    @FieldName("電腦化前的住址")
    private String freeformatAddress;

    /** 是否為日據時期設籍. */
    @XmlElement(name = "IfSetHouseholdWhenJpn", required = true)
    @FieldName("是否為日據時期設籍")
    private boolean ifSetHouseholdWhenJpn = Boolean.FALSE;
    /** 受理地戶政事務所代碼. */
    @XmlElement(name = "AcceptedAdminOfficeCode", required = true)
    @FieldName("受理地戶政事務所代碼")
    private String acceptedAdminOfficeCode;

    /** 撤銷喪失我國國籍原因. */
    @XmlElement(name = "CancelLostNationalityeason", required = true)
    @FieldName("撤銷喪失我國國籍原因")
    private String cancelLostNationalityeason;

    /** 自國外遷入當事人的的除戶日期. */
    @XmlElement(name = "BeMoveoutRemoveDate", required = true)
    @FieldName("自國外遷入當事人的的除戶日期")
    private String beMoveoutRemoveDate;

    /** 無戶籍時當時的. */
    @XmlElement(name = "BeforeMoveOutKind", required = true)
    @FieldName("自國外遷入當事人的種類")
    private String beforeMoveOutKind;

    /** (補登資料時)原住地戶政所代碼. */
    @XmlElement(name = "TldfMoveinCode", required = true)
    @FieldName("(補登資料時)原住地戶政所代碼")
    private String tldfMoveinCode;

    /** 是否初始化完成. */
    @XmlElement(name = "InitFinish", required = true)
    @FieldName("是否初始化完成")
    private boolean initFinish = Boolean.FALSE;

    /** 罰鍰DTO. */
    @XmlElement(name = "FineDTO", required = true)
    @FieldName("罰鍰DTO")
    private FineDTO fineDTO;

    /** 經罰鍰元件驗證後須進行罰鍰處理.Value=Y/N */
    @XmlElement(name = "NeedFineFlag", required = true)
    @FieldName("經罰鍰元件驗證後須進行罰鍰處理")
    private boolean needFineFlag;

    /** 警告訊息 */
    @XmlElement(name = "WarnningList", required = true)
    @FieldName("警告訊息")
    List<RlWarningMessage> warnningList = new ArrayList<RlWarningMessage>();

    /** 事件發生確定日期(上次輸入的值) */
    @XmlElement(name = "OldFineEventDate", required = true)
    @FieldName("事件發生確定日期(上次輸入的值)")
    private String oldFineEventDate;
    /** 交易順序 */
    @XmlElement(name = "ApplySequenceId", required = true)
    @FieldName("交易順序")
    private String applySequenceId;

    /** 受理地siteId */
    @XmlElement(name = "ApplySiteId", required = true)
    @FieldName("受理地siteId")
    private String applySiteId;

    /** applySeq 申請書流水號 */
    @XmlElement(name = "ApplySeq", required = true)
    @FieldName("applySeq申請書流水號")
    private String applySeq;

    /** 申請種類案件編號 */
    @XmlElement(name = "ApplyCaseNo", required = true)
    @FieldName(" 申請種類案件編號")
    private String applyCaseNo;
    /** 作業代碼 */
    @XmlElement(name = "OperationCode", required = true)
    @FieldName("作業代碼")
    private String operationCode;

    /** finePersonId */
    @XmlElement(name = "FinePersonId", required = true)
    @FieldName("罰鍰者id")
    private String finePersonId;

    /** 交易序號 */
    @XmlElement(name = "TransactionId", required = true)
    @FieldName("交易序號")
    private String transactionId;

    /** 存放需要做Lock的舊地1Mkey值 */
    @XmlElement(name = "LockOldDataKeyList", required = true)
    @FieldName("存放需要做Lock的舊地1Mkey值")
    private List<String> lockOldDataKeyList = new ArrayList<String>();

    /** 罰鍰處理是否顯示 */
    @XmlElement(name = "FineButtonShow", required = true)
    @FieldName("罰鍰處理是否顯示")
    private boolean fineButtonShow;

    /** 暫存按鈕是否顯示 */
    @XmlElement(name = "SaveButtonShow", required = true)
    @FieldName("暫存按鈕是否顯示")
    private boolean saveButtonShow;

    /** 受理地作業點代碼 */
    @XmlElement(name = "AcceptSiteId", required = true)
    @FieldName("受理地作業點代碼")
    private String acceptSiteId;

    /** 交易序號. */
    @XmlElement(name = "TxnId", required = true)
    @FieldName("交易序號")
    private String txnId;

    /** 之前是否被逕遷至戶所. */
    @XmlElement(name = "BeenEnforcedMoveFlag", required = true)
    @FieldName("之前是否被逕遷至戶所")
    private boolean beenEnforcedMoveToAdminOfficeFlag = Boolean.FALSE;

    /** 之前是否被逕遷至非戶所. */
    @XmlElement(name = "BeenEnforcedMoveFlag", required = true)
    @FieldName("之前是否被逕遷至非戶所")
    private boolean beenEnforcedMoveToNonAdminOfficeFlag = Boolean.FALSE;

    /** 檢核RCDF001M 是否有重複 檢核成功的PersonID */
    @XmlElement(name = "Rc1mPassPeople", required = true)
    @FieldName("檢核RCDF001M 是否有重複 檢核成功的PersonID")
    private List<String> rc1mPassPeople = new ArrayList<String>();

    /** 是否自大陸地區遷入 */
    @XmlElement(name = "FromRPCChina", required = true)
    @FieldName("是否自大陸地區遷入")
    private boolean fromRPCChinaFlag = Boolean.FALSE;

    /** 是否有入境 */
    @XmlElement(name = "DoImmigrate", required = true)
    @FieldName("是否有入境")
    private boolean doImmigrate = Boolean.FALSE;

    /** 在appendMode已經驗證過是否有除口的統號 */
    @XmlElement(name = "beenVerifiedPersonId", required = true)
    @FieldName("在appendMode已經驗證過是否有除口的統號")
    private Set<String> beenVerifiedPersonId = new HashSet<String>();

    /** 在appendMode已經驗證過是否有除口的統號 */
    @XmlElement(name = "beenVerifiedPersonId", required = true)
    @FieldName("是否已經驗證過personData")
    private Set<String> beenCheckedPersonId = new HashSet<String>();

    /** 在appendMode已經驗證過是否有除口的統號 */
    @XmlElement(name = "beenCheckedMveRestrictedPersonId", required = true)
    @FieldName("是否已經驗證過限制遷徙人口")
    private Set<String> beenCheckedMveRestrictedPersonId = new HashSet<String>();
    /** 在appendMode已經驗證過是否有除口的統號 */
    @XmlElement(name = "beenVerifiedNonInternal", required = true)
    @FieldName("是否已經驗證過非在RC1M有資料的人口")
    private Set<String> beenVerifiedNonInternal = new HashSet<String>();

    /** 罰鍰受處分人資料 */
    @XmlElement(name = "finePersonData", required = true)
    @FieldName("罰鍰受處分人資料")
    private FinePersonDTO finePersonData = new FinePersonDTO();

    /** 當事人於遷入地的現戶資料是否為大戶 */
    @XmlElement(name = "moveinBigHousehold", required = true)
    @FieldName("當事人於遷入地的現戶資料是否為大戶")
    private boolean moveinBigHousehold = Boolean.FALSE;

    /** 是否在init要取得戶下成員與全戶基本資料檔案至本主機 */
    @XmlElement(name = "DoGetAllFiles", required = true)
    @FieldName("是否在建立交易時已取得戶下成員與全戶基本資料檔案至本主機")
    private boolean doGetAllFiles = Boolean.FALSE;

    /** 暫存執行時間LOGSTR */
    @XmlElement(name = "ExeTimeLog", required = true)
    @FieldName("暫存執行時間LOGSTR")
    private String exeTimeLog;

    /** 戶籍員帳號 */
    @XmlElement(name = "RegisterUserId", required = true)
    @FieldName("戶籍員帳號")
    private String registerUserId;

    /** 電腦化前即遷出國外 */
    @XmlElement(name = "BfeComputerlizedlMoveOut", required = true)
    @FieldName("電腦化前即遷出國外")
    private boolean bfeComputerlizedlMoveOut;

    /** 正在處理的當事人資料 */
    @XmlElement(name = "ProcessedPerson", required = true)
    @FieldName("正在處理的當事人資料")
    private MoveInDTO processedPerson;

    /** 處理的各當事人的執行時間 */
    @XmlElement(name = "processedPersonExeTLog", required = true)
    @FieldName("處理的各當事人的執行時間")
    private List<StringBuffer> processedPersonExeTLog = new ArrayList<StringBuffer>();

    /** 流水號(申請書) */
    @XmlElement(name = "loopConunt", required = true)
    @FieldName("流水號(申請書)")
    private Integer loopConunt = 0;

    /** 遷出地的行政區域 */
    @XmlElement(name = "OriginalAreaName", required = true)
    @FieldName("遷出地的行政區域")
    private String originalAreaName;

    /** 遷出地的行政區域 */
    @XmlElement(name = "OriginalAreaCode", required = true)
    @FieldName("遷出地的行政區域代碼")
    private String originalAreaCode;

    /** 限制遷徙人口名單 */
    @XmlElement(name = "RestrictedPerson", required = true)
    @FieldName("限制遷徙人口名單")
    private List<String> restrictedPerson = new ArrayList<String>();

    /** 初始化是否成功 */
    @XmlElement(name = "InitSuccess", required = true)
    @FieldName("初始化是否成功")
    private boolean initSuccess = Boolean.TRUE;

    /** 頁籤索引 */
    @XmlElement(name = "ActiveIndex", required = true)
    @FieldName("頁籤索引")
    private String activeIndex;

    /** 逕為登記核准日期 */
    @XmlElement(name = "ApproveDate", required = true)
    @FieldName("逕為登記核准日期")
    private String approveDate;

    /** 行政區域代碼檔檔名 */
    @XmlElement(name = "areaCodeRSCD", required = true)
    @FieldName("行政區域代碼檔檔名")
    private String areaCodeRSCD;

    /** 是否為大戶 */
    @XmlElement(name = "bigHouseholdFlag", required = true)
    @FieldName("是否為大戶")
    private boolean bigHouseholdFlag;

    /** 申請種類(大戶) */
    @XmlElement(name = "bigApplyKind", required = true)
    @FieldName("申請種類(大戶)")
    private String bigApplyKind;

    /** 輸入大戶遷徙當事人 */
    @XmlElement(name = "qryinputList", required = true)
    @FieldName("輸入大戶遷徙當事人")
    private List<MoveQryInputDTO> qryinputList = new ArrayList<MoveQryInputDTO>(30);

    /** 大戶遷徙-遷徙當事人個人資料- */
    @XmlElement(name = "massMovePeopleDataList", required = true)
    @FieldName("大戶遷徙-遷徙當事人個人資料-")
    private List<RlPersonalDataDTO> massMovePeopleDataList;

    /** 原住地戶下現住人口數 */
    @XmlElement(name = "oriResidentCnt", required = true)
    @FieldName("原住地戶下現住人口數-")
    private Integer oriResidentCnt = 0;

    /** 原住地戶下非現住人口數 */
    @XmlElement(name = "oriNonResidentCnt", required = true)
    @FieldName("原住地戶下非現住人口數-")
    private Integer oriNonResidentCnt = 0;

    /** 是否僅餘兼任戶長 */
    @XmlElement(name = "lastConcurnHead", required = true)
    @FieldName("是否僅餘兼任戶長")
    private boolean lastConcurnHead = Boolean.FALSE;

    /** 大戶的申請種類是否可以更動 */
    @XmlElement(name = "CannotChangeBigApplyKind", required = true)
    @FieldName("大戶的申請種類是否可以更動")
    private boolean cannotChangeBigApplyKind = Boolean.FALSE;

    /** 已經抓取file的統號清單 */
    @XmlElement(name = "FileFetechedPerson", required = true)
    @FieldName("已經抓取file的統號清單")
    private Set<String> fileFetechedPerson = new HashSet<String>(30);

    @XmlElement(name = "nowPersonData", required = true)
    @FieldName("正在處理的當事人個人RLDF資料")
    private RlPersonDataResultDTO nowPersonData;

    @XmlElement(name = "xldf030mList", required = true)
    @FieldName("所內註記記事清單")
    private List<XLDF030M> xldf030mList;

    @XmlElement(name = "xldf030tList", required = true)
    @FieldName("所內註記記事清單")
    private List<XLDF030T> xldf030tList;

    @XmlElement(name = "doNoteOn2H", required = true)
    @FieldName("恢復戶籍記2H在遷出地")
    private boolean doNoteOn2H;

    /** 恢復戶籍之遷出國外地之戶長個人基本資料. */
    @XmlElement(name = "oriHeadRemovePData")
    @FieldName("恢復戶籍之遷出國外地之戶長個人基本資料")
    private XLDFPersonDataDomainObject oriRmveHeadPData;

    /** 恢復戶籍之遷出國外地之戶長個人基本資料. */
    @XmlElement(name = "oriHeadRemovePData")
    @FieldName("恢復戶籍之遷出國外地支全戶基本資料")
    private XLDFHouseholdDataDomainObject oriRmveHData;

    /** 恢復戶籍之遷出國外地之戶長個人基本資料. */
    @XmlElement(name = "rldfyDataMap")
    @FieldName("遷徙人口個人記事欄位化MAP")
    private Map<String, List<Object>> rldfyDataMap = new HashMap<String, List<Object>>();

    /** 顯示戶長本人之記事 */
    @XmlElement(name = "doShowHouseholdHead")
    @FieldName("顯示戶長本人之記事")
    private boolean doShowHouseholdHead = Boolean.TRUE;

    /** 執行時間 */
    @XmlElement(name = "execTimeLog")
    @FieldName("執行時間")
    private List<String> execTimeLog = new ArrayList<String>();

    /** 執行時間 */
    @XmlElement(name = "reserveNoteMap")
    @FieldName("保留的5MMAP")
    private Map<String, List<XLDFDomainObject>> reserveNoteMap = new HashMap<String, List<XLDFDomainObject>>();

    /** 之前登記的個人記事欄位化Access */
    @XmlElement(name = "xldfyDataaccessList")
    @FieldName("之前登記的個人記事欄位化Access")
    private List<XldfopracsType> xldfyDataaccessList = new ArrayList<XldfopracsType>(20);

    /** 已經處理過教育程度註記的統號 */
    @XmlElement(name = "beenEducationModified")
    @FieldName("已經處理過教育程度註記的統號")
    private Set<String> beenEducationModified = new HashSet<String>(20);

    private List<String> infoList = new ArrayList<String>();

    public List<String> getInfoList() {
        return infoList;
    }

    public void setInfoList(List<String> infoList) {
        this.infoList = infoList;
    }

    /**
     * @return the txnId
     */
    public String getTxnId() {
        return txnId;
    }

    /**
     * @param txnId
     *            the txnId to set
     */
    public void setTxnId(String txnId) {
        this.txnId = txnId;
    }

    /**
     * @return the openingOperationDTO
     */
    public OpeningOperationDTO getOpeningOperationDTO() {
        return openingOperationDTO;
    }

    /**
     * @param openingOperationDTO
     *            the openingOperationDTO to set
     */
    public void setOpeningOperationDTO(OpeningOperationDTO openingOperationDTO) {
        this.openingOperationDTO = openingOperationDTO;
    }

    /**
     * @return the personDataSet
     */
    public List<MoveInDTO> getPersonDataList() {

        return personDataList;
    }

    /**
     * @param personDataSet
     *            the personDataSet to set
     */
    public void setPersonDataList(List<MoveInDTO> personDataList) {
        this.personDataList = personDataList;
    }

    /**
     * @return the moveInHousePerson
     */
    public XLDFPersonDataDomainObject getMoveInHousePerson() {
        return moveInHousePerson;
    }

    /**
     * @param moveInHousePerson
     *            the moveInHousePerson to set
     */
    public void setMoveInHousePerson(XLDFPersonDataDomainObject moveInHousePerson) {
        this.moveInHousePerson = moveInHousePerson;
    }

    /**
     * @return the conCurrentRealPerson
     */
    public XLDFPersonDataDomainObject getConCurrentRealPerson() {
        return conCurrentRealPerson;
    }

    /**
     * @param conCurrentRealPerson
     *            the conCurrentRealPerson to set
     */
    public void setConCurrentRealPerson(XLDFPersonDataDomainObject conCurrentRealPerson) {
        this.conCurrentRealPerson = conCurrentRealPerson;
    }

    /**
     * @return the householdData
     */
    public XLDFHouseholdDataDomainObject getHouseholdData() {
        return householdData;
    }

    /**
     * @param householdData
     *            the householdData to set
     */
    public void setHouseholdData(XLDFHouseholdDataDomainObject householdData) {
        this.householdData = householdData;
    }

    /**
     * @return the moveInHousehold
     */
    public XLDFHouseholdDataDomainObject getMoveInHousehold() {
        return moveInHousehold;
    }

    /**
     * @param moveInHousehold
     *            the moveInHousehold to set
     */
    public void setMoveInHousehold(XLDFHouseholdDataDomainObject moveInHousehold) {
        this.moveInHousehold = moveInHousehold;
    }

    /**
     * @return the originNewHousehold
     */
    public XLDFHouseholdDataDomainObject getOriginNewHousehold() {
        return originNewHousehold;
    }

    /**
     * @param originNewHousehold
     *            the originNewHousehold to set
     */
    public void setOriginNewHousehold(XLDFHouseholdDataDomainObject originNewHousehold) {
        this.originNewHousehold = originNewHousehold;
    }

    /**
     * @return the applyPersonList
     */
    public List<XLDFApplicantDataDTO> getApplyPersonList() {
        return applyPersonList;
    }

    /**
     * @param applyPersonList
     *            the applyPersonList to set
     */
    public void setApplyPersonList(List<XLDFApplicantDataDTO> applyPersonList) {
        this.applyPersonList = applyPersonList;
    }

    /**
     * @return the commPerson
     */
    public XLDFPersonBriefDataDTO getCommPerson() {
        return commPerson;
    }

    /**
     * @param commPerson
     *            the commPerson to set
     */
    public void setCommPerson(XLDFPersonBriefDataDTO commPerson) {
        this.commPerson = commPerson;
    }

    /**
     * @return the memberList
     */
    public List<MemberDTO> getMemberList() {
        return memberList;
    }

    /**
     * @param memberList
     *            the memberList to set
     */
    public void setMemberList(List<MemberDTO> memberList) {
        this.memberList = memberList;
    }

    /**
     * @return the clearList
     */
    public List<ClearDTO> getClearList() {
        return clearList;
    }

    /**
     * @param clearList
     *            the clearList to set
     */
    public void setClearList(List<ClearDTO> clearList) {
        this.clearList = clearList;
    }

    /**
     * @return the personNoteList
     */
    public List<XLDFPersonNoteDomainObject> getPersonNoteList() {
        return personNoteList;
    }

    /**
     * @param personNoteList
     *            the personNoteList to set
     */
    public void setPersonNoteList(List<XLDFPersonNoteDomainObject> personNoteList) {
        this.personNoteList = personNoteList;
    }

    /**
     * @return the addPersonId
     */
    public String getAddPersonId() {
        return addPersonId;
    }

    /**
     * @param addPersonId
     *            the addPersonId to set
     */
    public void setAddPersonId(String addPersonId) {
        this.addPersonId = addPersonId;
    }

    /**
     * @return the substituteFlag
     */
    public boolean isSubstituteFlag() {
        return substituteFlag;
    }

    /**
     * @param substituteFlag
     *            the substituteFlag to set
     */
    public void setSubstituteFlag(boolean substituteFlag) {
        this.substituteFlag = substituteFlag;
    }

    /**
     * @return the allMoveFlag
     */
    public boolean isAllMoveFlag() {
        return allMoveFlag;
    }

    /**
     * @param allMoveFlag
     *            the allMoveFlag to set
     */
    public void setAllMoveFlag(boolean allMoveFlag) {
        this.allMoveFlag = allMoveFlag;
    }

    /**
     * @return the moveInSiteId
     */
    public String getMoveInSiteId() {
        return moveInSiteId;
    }

    /**
     * @param moveInSiteId
     *            the moveInSiteId to set
     */
    public void setMoveInSiteId(String moveInSiteId) {
        this.moveInSiteId = moveInSiteId;
    }

    /**
     * @return the applyKind
     */
    public String getApplyKind() {
        return applyKind;
    }

    /**
     * @param applyKind
     *            the applyKind to set
     */
    public void setApplyKind(String applyKind) {
        this.applyKind = applyKind;
    }

    /**
     * @return the moveInHouseId
     */
    public String getMoveInHouseId() {
        return moveInHouseId;
    }

    /**
     * @param moveInHouseId
     *            the moveInHouseId to set
     */
    public void setMoveInHouseId(String moveInHouseId) {
        this.moveInHouseId = moveInHouseId;
    }

    /**
     * @return the moveInHouseheadId
     */
    public String getMoveInHouseheadId() {
        return moveInHouseheadId;
    }

    /**
     * @param moveInHouseheadId
     *            the moveInHouseheadId to set
     */
    public void setMoveInHouseheadId(String moveInHouseheadId) {
        this.moveInHouseheadId = moveInHouseheadId;
    }

    /**
     * @return the concurrentHeadId
     */
    public String getConcurrentHeadId() {
        return concurrentHeadId;
    }

    /**
     * @param concurrentHeadId
     *            the concurrentHeadId to set
     */
    public void setConcurrentHeadId(String concurrentHeadId) {
        this.concurrentHeadId = concurrentHeadId;
    }

    /**
     * @return the concurrentSiteId
     */
    public String getConcurrentSiteId() {
        return concurrentSiteId;
    }

    /**
     * @param concurrentSiteId
     *            the concurrentSiteId to set
     */
    public void setConcurrentSiteId(String concurrentSiteId) {
        this.concurrentSiteId = concurrentSiteId;
    }

    /**
     * @return the applyRegister
     */
    public String getApplyRegister() {
        return applyRegister;
    }

    /**
     * @param applyRegister
     *            the applyRegister to set
     */
    public void setApplyRegister(String applyRegister) {
        this.applyRegister = applyRegister;
    }

    /**
     * @return the certificate
     */
    public List<String> getCertificate() {
        return certificate;
    }

    /**
     * @param certificate
     *            the certificate to set
     */
    public void setCertificate(List<String> certificate) {
        this.certificate = certificate;
    }

    /**
     * @return the otherCertificate
     */
    public String getOtherCertificate() {
        return otherCertificate;
    }

    /**
     * @param otherCertificate
     *            the otherCertificate to set
     */
    public void setOtherCertificate(String otherCertificate) {
        this.otherCertificate = otherCertificate;
    }

    /**
     * @return the isPunish
     */
    public String getIsPunish() {
        return isPunish;
    }

    /**
     * @param isPunish
     *            the isPunish to set
     */
    public void setIsPunish(String isPunish) {
        this.isPunish = isPunish;
    }

    /**
     * @return the isnotLawPeriod
     */
    public String getIsnotLawPeriod() {
        return isnotLawPeriod;
    }

    /**
     * @param isnotLawPeriod
     *            the isnotLawPeriod to set
     */
    public void setIsnotLawPeriod(String isnotLawPeriod) {
        this.isnotLawPeriod = isnotLawPeriod;
    }

    /**
     * @return the lawDate
     */
    public String getLawDate() {
        return lawDate;
    }

    /**
     * @param lawDate
     *            the lawDate to set
     */
    public void setLawDate(String lawDate) {
        this.lawDate = lawDate;
    }

    /**
     * @return the isnotHousebook
     */
    public String getIsnotHousebook() {
        return isnotHousebook;
    }

    /**
     * @param isnotHousebook
     *            the isnotHousebook to set
     */
    public void setIsnotHousebook(String isnotHousebook) {
        this.isnotHousebook = isnotHousebook;
    }

    /**
     * @return the isHeadOut
     */
    public boolean getIsHeadOut() {
        return isHeadOut;
    }

    /**
     * @param isHeadOut
     *            the isHeadOut to set
     */
    public void setIsHeadOut(boolean isHeadOut) {
        this.isHeadOut = isHeadOut;
    }

    /**
     * @return the showRegisterPersonId
     */
    public String getShowRegisterPersonId() {
        return showRegisterPersonId;
    }

    /**
     * @param showRegisterPersonId
     *            the showRegisterPersonId to set
     */
    public void setShowRegisterPersonId(String showRegisterPersonId) {
        this.showRegisterPersonId = showRegisterPersonId;
    }

    /**
     * @return the originDataList
     */
    public List<OriginDataDTO> getOriginDataList() {
        return originDataList;
    }

    /**
     * @param originDataList
     *            the originDataList to set
     */
    public void setOriginDataList(List<OriginDataDTO> originDataList) {
        this.originDataList = originDataList;
    }

    /**
     * @return the selectRegisterList
     */
    public List<MoveInRegisterDTO> getSelectRegisterList() {
        return selectRegisterList;
    }

    /**
     * @param selectRegisterList
     *            the selectRegisterList to set
     */
    public void setSelectRegisterList(List<MoveInRegisterDTO> selectRegisterList) {
        this.selectRegisterList = selectRegisterList;
    }

    /**
     * @return the masterPerson
     */
    public XLDFPersonDataDomainObject getMasterPerson() {
        return masterPerson;
    }

    /**
     * @param masterPerson
     *            the masterPerson to set
     */
    public void setMasterPerson(XLDFPersonDataDomainObject masterPerson) {
        this.masterPerson = masterPerson;
    }

    /**
     * @return the moveInXldf021m
     */
    public XLDF021M getMoveInXldf021m() {
        return moveInXldf021m;
    }

    /**
     * @param moveInXldf021m
     *            the moveInXldf021m to set
     */
    public void setMoveInXldf021m(XLDF021M moveInXldf021m) {
        this.moveInXldf021m = moveInXldf021m;
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
     * @param memberIds
     *            the memberIds to set
     */
    public void setMemberIds(List<String> memberIds) {
        this.memberIds = memberIds;
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
     * @param otherPersonIds
     *            the otherPersonIds to set
     */
    public void setOtherPersonIds(List<String> otherPersonIds) {
        this.otherPersonIds = otherPersonIds;
    }

    /**
     * @return the hasMember
     */
    public boolean isHasMember() {
        return hasMember;
    }

    /**
     * @param hasMember
     *            the hasMember to set
     */
    public void setHasMember(boolean hasMember) {
        this.hasMember = hasMember;
    }

    /**
     * @return the orginNewHouseId
     */
    public String getOrginNewHouseId() {
        return orginNewHouseId;
    }

    /**
     * @param orginNewHouseId
     *            the orginNewHouseId to set
     */
    public void setOrginNewHouseId(String orginNewHouseId) {
        this.orginNewHouseId = orginNewHouseId;
    }

    /**
     * @return the orginNewHouseType
     */
    public String getOrginNewHouseType() {
        return orginNewHouseType;
    }

    /**
     * @param orginNewHouseType
     *            the orginNewHouseType to set
     */
    public void setOrginNewHouseType(String orginNewHouseType) {
        this.orginNewHouseType = orginNewHouseType;
    }

    /**
     * @return the orginNewConcurrentHeadMark
     */
    public String getOrginNewConcurrentHeadMark() {
        return orginNewConcurrentHeadMark;
    }

    /**
     * @param orginNewConcurrentHeadMark
     *            the orginNewConcurrentHeadMark to set
     */
    public void setOrginNewConcurrentHeadMark(String orginNewConcurrentHeadMark) {
        this.orginNewConcurrentHeadMark = orginNewConcurrentHeadMark;
    }

    /**
     * @return the isNewHouse
     */
    public String getIsNewHouse() {
        return isNewHouse;
    }

    /**
     * @param isNewHouse
     *            the isNewHouse to set
     */
    public void setIsNewHouse(String isNewHouse) {
        this.isNewHouse = isNewHouse;
    }

    /**
     * @param isHeadOut
     *            the isHeadOut to set
     */
    public void setHeadOut(boolean isHeadOut) {
        this.isHeadOut = isHeadOut;
    }

    /**
     * @return the operateDate
     */
    public String getOperateDate() {
        return operateDate;
    }

    /**
     * @param operateDate
     *            the operateDate to set
     */
    public void setOperateDate(String operateDate) {
        this.operateDate = operateDate;
    }

    /**
     * @return the operateTime
     */
    public String getOperateTime() {
        return operateTime;
    }

    /**
     * @param operateTime
     *            the operateTime to set
     */
    public void setOperateTime(String operateTime) {
        this.operateTime = operateTime;
    }

    /**
     * @return the outHeadName
     */
    public String getOutHeadName() {
        return outHeadName;
    }

    /**
     * @param outHeadName
     *            the outHeadName to set
     */
    public void setOutHeadName(String outHeadName) {
        this.outHeadName = outHeadName;
    }

    /**
     * @return the outHeadPersonId
     */
    public String getOutHeadPersonId() {
        return outHeadPersonId;
    }

    /**
     * @param outHeadPersonId
     *            the outHeadPersonId to set
     */
    public void setOutHeadPersonId(String outHeadPersonId) {
        this.outHeadPersonId = outHeadPersonId;
    }

    /**
     * @return the outNewHeadName
     */
    public String getOutNewHeadName() {
        return outNewHeadName;
    }

    /**
     * @param outNewHeadName
     *            the outNewHeadName to set
     */
    public void setOutNewHeadName(String outNewHeadName) {
        this.outNewHeadName = outNewHeadName;
    }

    /**
     * @return the conCurrentRealHousehold
     */
    public XLDFHouseholdDataDomainObject getConCurrentRealHousehold() {
        return conCurrentRealHousehold;
    }

    /**
     * @param conCurrentRealHousehold
     *            the conCurrentRealHousehold to set
     */
    public void setConCurrentRealHousehold(XLDFHouseholdDataDomainObject conCurrentRealHousehold) {
        this.conCurrentRealHousehold = conCurrentRealHousehold;
    }

    /**
     * @return the xLDFApplicantDataDTO1
     */
    public XLDFApplicantDataDTO getxLDFApplicantDataDTO1() {
        return xLDFApplicantDataDTO1;
    }

    /**
     * @param xLDFApplicantDataDTO1
     *            the xLDFApplicantDataDTO1 to set
     */
    public void setxLDFApplicantDataDTO1(XLDFApplicantDataDTO xLDFApplicantDataDTO1) {
        this.xLDFApplicantDataDTO1 = xLDFApplicantDataDTO1;
    }

    /**
     * @return the xLDFApplicantDataDTO2
     */
    public XLDFApplicantDataDTO getxLDFApplicantDataDTO2() {
        return xLDFApplicantDataDTO2;
    }

    /**
     * @param xLDFApplicantDataDTO2
     *            the xLDFApplicantDataDTO2 to set
     */
    public void setxLDFApplicantDataDTO2(XLDFApplicantDataDTO xLDFApplicantDataDTO2) {
        this.xLDFApplicantDataDTO2 = xLDFApplicantDataDTO2;
    }

    /**
     * @return the xLDFPersonBriefDataDTO
     */
    public XLDFPersonBriefDataDTO getxLDFPersonBriefDataDTO() {
        return xLDFPersonBriefDataDTO;
    }

    /**
     * @param xLDFPersonBriefDataDTO
     *            the xLDFPersonBriefDataDTO to set
     */
    public void setxLDFPersonBriefDataDTO(XLDFPersonBriefDataDTO xLDFPersonBriefDataDTO) {
        this.xLDFPersonBriefDataDTO = xLDFPersonBriefDataDTO;
    }

    /**
     * @return the householdNoteList
     */
    public List<XLDFHouseholdNoteDomainObject> getHouseholdNoteList() {
        return householdNoteList;
    }

    /**
     * @param householdNoteList
     *            the householdNoteList to set
     */
    public void setHouseholdNoteList(List<XLDFHouseholdNoteDomainObject> householdNoteList) {
        this.householdNoteList = householdNoteList;
    }

    /**
     * @return the identityNoteList
     */
    public List<SelRegisterDTO> getIdentityNoteList() {
        if (identityNoteList == null) {
            identityNoteList = new ArrayList<SelRegisterDTO>();
        }
        return identityNoteList;
    }

    /**
     * @param identityNoteList
     *            the identityNoteList to set
     */
    public void setIdentityNoteList(List<SelRegisterDTO> identityNoteList) {
        this.identityNoteList = identityNoteList;
    }

    /**
     * @return the moveNoteList
     */
    public List<SelRegisterDTO> getMoveNoteList() {
        if (moveNoteList == null) {
            moveNoteList = new ArrayList<SelRegisterDTO>();
        }
        return moveNoteList;
    }

    /**
     * @param moveNoteList
     *            the moveNoteList to set
     */
    public void setMoveNoteList(List<SelRegisterDTO> moveNoteList) {
        this.moveNoteList = moveNoteList;
    }

    /**
     * @return the abolishNoteList
     */
    public List<SelRegisterDTO> getAbolishNoteList() {
        if (abolishNoteList == null) {
            abolishNoteList = new ArrayList<SelRegisterDTO>();
        }
        return abolishNoteList;
    }

    /**
     * @param abolishNoteList
     *            the abolishNoteList to set
     */
    public void setAbolishNoteList(List<SelRegisterDTO> abolishNoteList) {
        this.abolishNoteList = abolishNoteList;
    }

    /**
     * @return the correctChangeNoteList
     */
    public List<SelRegisterDTO> getCorrectChangeNoteList() {
        if (correctChangeNoteList == null) {
            correctChangeNoteList = new ArrayList<SelRegisterDTO>();
        }
        return correctChangeNoteList;
    }

    /**
     * @param correctChangeNoteList
     *            the correctChangeNoteList to set
     */
    public void setCorrectChangeNoteList(List<SelRegisterDTO> correctChangeNoteList) {
        this.correctChangeNoteList = correctChangeNoteList;
    }

    /**
     * @return the revokeNoteList
     */
    public List<SelRegisterDTO> getRevokeNoteList() {
        if (revokeNoteList == null) {
            revokeNoteList = new ArrayList<SelRegisterDTO>();
        }
        return revokeNoteList;
    }

    /**
     * @param revokeNoteList
     *            the revokeNoteList to set
     */
    public void setRevokeNoteList(List<SelRegisterDTO> revokeNoteList) {
        this.revokeNoteList = revokeNoteList;
    }

    /**
     * @return the otherNoteList
     */
    public List<SelRegisterDTO> getOtherNoteList() {
        if (otherNoteList == null) {
            otherNoteList = new ArrayList<SelRegisterDTO>();
        }
        return otherNoteList;
    }

    /**
     * @param otherNoteList
     *            the otherNoteList to set
     */
    public void setOtherNoteList(List<SelRegisterDTO> otherNoteList) {
        this.otherNoteList = otherNoteList;
    }

    /**
     * @return the oldShowRegisterPersonId
     */
    public String getOldShowRegisterPersonId() {

        return oldShowRegisterPersonId;
    }

    /**
     * @param oldShowRegisterPersonId
     *            the oldShowRegisterPersonId to set
     */
    public void setOldShowRegisterPersonId(String oldShowRegisterPersonId) {
        this.oldShowRegisterPersonId = oldShowRegisterPersonId;
    }

    /**
     * @return the otherCertificateStatus
     */
    public String getOtherCertificateStatus() {
        return otherCertificateStatus;
    }

    /**
     * @param otherCertificateStatus
     *            the otherCertificateStatus to set
     */
    public void setOtherCertificateStatus(String otherCertificateStatus) {
        this.otherCertificateStatus = otherCertificateStatus;
    }

    /**
     * @return the selectedOriginDataDTO
     */
    public OriginDataDTO getSelectedOriginDataDTO() {
        return selectedOriginDataDTO;
    }

    /**
     * @param selectedOriginDataDTO
     *            the selectedOriginDataDTO to set
     */
    public void setSelectedOriginDataDTO(OriginDataDTO selectedOriginDataDTO) {
        this.selectedOriginDataDTO = selectedOriginDataDTO;
    }

    /**
     * @return the lastQueryMoveinHouseHeadId
     */
    public String getLastQueryMoveinHouseHeadId() {
        return lastQueryMoveinHouseHeadId;
    }

    /**
     * @param lastQueryMoveinHouseHeadId
     *            the lastQueryMoveinHouseHeadId to set
     */
    public void setLastQueryMoveinHouseHeadId(String lastQueryMoveinHouseHeadId) {
        this.lastQueryMoveinHouseHeadId = lastQueryMoveinHouseHeadId;
    }

    /**
     * @return the oldMoveInHouseholdType
     */
    public String getOldMoveInHouseholdType() {
        return oldMoveInHouseholdType;
    }

    /**
     * @param oldMoveInHouseholdType
     *            the oldMoveInHouseholdType to set
     */
    public void setOldMoveInHouseholdType(String oldMoveInHouseholdType) {
        this.oldMoveInHouseholdType = oldMoveInHouseholdType;
    }

    /**
     * @return the oldMoveHouseholdCurrentMark
     */
    public String getOldMoveHouseholdCurrentMark() {
        return oldMoveHouseholdCurrentMark;
    }

    /**
     * @param oldMoveHouseholdCurrentMark
     *            the oldMoveHouseholdCurrentMark to set
     */
    public void setOldMoveHouseholdCurrentMark(String oldMoveHouseholdCurrentMark) {
        this.oldMoveHouseholdCurrentMark = oldMoveHouseholdCurrentMark;
    }

    /**
     * @return the personNum
     */
    public int getPersonNum() {
        return personNum;
    }

    /**
     * @param personNum
     *            the personNum to set
     */
    public void setPersonNum(int personNum) {
        this.personNum = personNum;
    }

    /**
     * @return the statisticMoveinCode
     */
    public String getStatisticMoveinCode() {
        return statisticMoveinCode;
    }

    /**
     * @param statisticMoveinCode
     *            the statisticMoveinCode to set
     */
    public void setStatisticMoveinCode(String statisticMoveinCode) {
        this.statisticMoveinCode = statisticMoveinCode;
    }

    /**
     * @return the happenPeriod
     */
    public String getHappenPeriod() {
        return happenPeriod;
    }

    /**
     * @param happenPeriod
     *            the happenPeriod to set
     */
    public void setHappenPeriod(String happenPeriod) {
        this.happenPeriod = happenPeriod;
    }

    /**
     * @return the applyDate
     */
    public String getApplyDate() {
        return applyDate;
    }

    /**
     * @param applyDate
     *            the applyDate to set
     */
    public void setApplyDate(String applyDate) {
        this.applyDate = applyDate;
    }

    /**
     * @return the foreignCountry
     */
    public String getForeignCountry() {
        return foreignCountry;
    }

    /**
     * @param foreignCountry
     *            the foreignCountry to set
     */
    public void setForeignCountry(String foreignCountry) {
        this.foreignCountry = foreignCountry;
    }

    /**
     * @return the cancelLoseCitizenDate
     */
    public String getCancelLoseCitizenDate() {
        return cancelLoseCitizenDate;
    }

    /**
     * @param cancelLoseCitizenDate
     *            the cancelLoseCitizenDate to set
     */
    public void setCancelLoseCitizenDate(String cancelLoseCitizenDate) {
        this.cancelLoseCitizenDate = cancelLoseCitizenDate;
    }

    /**
     * @return the moveInReason
     */
    public String getMoveInReason() {
        return moveInReason;
    }

    /**
     * @param moveInReason
     *            the moveInReason to set
     */
    public void setMoveInReason(String moveInReason) {
        this.moveInReason = moveInReason;
    }

    /**
     * @return the moveInReasonDate
     */
    public String getMoveInReasonDate() {
        return moveInReasonDate;
    }

    /**
     * @param moveInReasonDate
     *            the moveInReasonDate to set
     */
    public void setMoveInReasonDate(String moveInReasonDate) {
        this.moveInReasonDate = moveInReasonDate;
    }

    /**
     * @return the immigrationDate
     */
    public String getImmigrationDate() {
        return immigrationDate;
    }

    /**
     * @param immigrationDate
     *            the immigrationDate to set
     */
    public void setImmigrationDate(String immigrationDate) {
        this.immigrationDate = immigrationDate;
    }

    /**
     * @return the originalSiteId
     */
    public String getOriginalSiteId() {
        return originalSiteId;
    }

    /**
     * @param originalSiteId
     *            the originalSiteId to set
     */
    public void setOriginalSiteId(String originalSiteId) {
        this.originalSiteId = originalSiteId;
    }

    /**
     * @return the personDataKind
     */
    public String getPersonDataKind() {
        return personDataKind;
    }

    /**
     * @param personDataKind
     *            the personDataKind to set
     */
    public void setPersonDataKind(String personDataKind) {
        this.personDataKind = personDataKind;
    }

    /**
     * @return the removeYear
     */
    public String getRemoveYear() {
        return removeYear;
    }

    /**
     * @param removeYear
     *            the removeYear to set
     */
    public void setRemoveYear(String removeYear) {
        this.removeYear = removeYear;
    }

    /**
     * @return the oldDataInMove
     */
    public boolean isOldDataInMove() {
        return oldDataInMove;
    }

    /**
     * @param oldDataInMove
     *            the oldDataInMove to set
     */
    public void setOldDataInMove(boolean oldDataInMove) {
        this.oldDataInMove = oldDataInMove;
    }

    /**
     * @return the enforcedFlag
     */
    public boolean isEnforcedFlag() {
        return enforcedFlag;
    }

    /**
     * @param enforcedFlag
     *            the enforcedFlag to set
     */
    public void setEnforcedFlag(boolean enforcedFlag) {
        this.enforcedFlag = enforcedFlag;
    }

    /**
     * @return the membersPersonData
     */
    public List<XLDFPersonDataDomainObject> getMembersPersonData() {
        return membersPersonData;
    }

    /**
     * @param membersPersonData
     *            the membersPersonData to set
     */
    public void setMembersPersonData(List<XLDFPersonDataDomainObject> membersPersonData) {
        this.membersPersonData = membersPersonData;
    }

    /**
     * @return the enforceApplyPerson
     */
    public XldfefaplcType getEnforceApplyPerson() {
        return enforceApplyPerson;
    }

    /**
     * @param enforceApplyPerson
     *            the enforceApplyPerson to set
     */
    public void setEnforceApplyPerson(XldfefaplcType enforceApplyPerson) {
        this.enforceApplyPerson = enforceApplyPerson;
    }

    /**
     * @return the freeformatAddress
     */
    public String getFreeformatAddress() {
        return freeformatAddress;
    }

    /**
     * @param freeformatAddress
     *            the freeformatAddress to set
     */
    public void setFreeformatAddress(String freeformatAddress) {
        this.freeformatAddress = freeformatAddress;
    }

    /**
     * @return the ifSetHouseholdWhenJpn
     */
    public boolean isIfSetHouseholdWhenJpn() {
        return ifSetHouseholdWhenJpn;
    }

    /**
     * @param ifSetHouseholdWhenJpn
     *            the ifSetHouseholdWhenJpn to set
     */
    public void setIfSetHouseholdWhenJpn(boolean ifSetHouseholdWhenJpn) {
        this.ifSetHouseholdWhenJpn = ifSetHouseholdWhenJpn;
    }

    /**
     * @return the acceptedAdminOfficeCode
     */
    public String getAcceptedAdminOfficeCode() {
        return acceptedAdminOfficeCode;
    }

    /**
     * @param acceptedAdminOfficeCode
     *            the acceptedAdminOfficeCode to set
     */
    public void setAcceptedAdminOfficeCode(String acceptedAdminOfficeCode) {
        this.acceptedAdminOfficeCode = acceptedAdminOfficeCode;
    }

    /**
     * @return the cancelLostNationalityeason
     */
    public String getCancelLostNationalityeason() {
        return cancelLostNationalityeason;
    }

    /**
     * @param cancelLostNationalityeason
     *            the cancelLostNationalityeason to set
     */
    public void setCancelLostNationalityeason(String cancelLostNationalityeason) {
        this.cancelLostNationalityeason = cancelLostNationalityeason;
    }

    /**
     * @return the beMoveoutRemoveDate
     */
    public String getBeMoveoutRemoveDate() {
        return beMoveoutRemoveDate;
    }

    /**
     * @param beMoveoutRemoveDate
     *            the beMoveoutRemoveDate to set
     */
    public void setBeMoveoutRemoveDate(String beMoveoutRemoveDate) {
        this.beMoveoutRemoveDate = beMoveoutRemoveDate;
    }

    /**
     * @return the beforeMoveOutKind
     */
    public String getBeforeMoveOutKind() {
        return beforeMoveOutKind;
    }

    /**
     * @param beforeMoveOutKind
     *            the beforeMoveOutKind to set
     */
    public void setBeforeMoveOutKind(String beforeMoveOutKind) {
        this.beforeMoveOutKind = beforeMoveOutKind;
    }

    /**
     * @return the tldfMoveinCode
     */
    public String getTldfMoveinCode() {
        return tldfMoveinCode;
    }

    /**
     * @param tldfMoveinCode
     *            the tldfMoveinCode to set
     */
    public void setTldfMoveinCode(String tldfMoveinCode) {
        this.tldfMoveinCode = tldfMoveinCode;
    }

    /**
     * @return the moveinType
     */
    public String getMoveinType() {
        return moveinType;
    }

    /**
     * @param moveinType
     *            the moveinType to set
     */
    public void setMoveinType(String moveinType) {
        this.moveinType = moveinType;
    }

    /**
     * @return the initFinish
     */
    public boolean isInitFinish() {
        return initFinish;
    }

    /**
     * @param initFinish
     *            the initFinish to set
     */
    public void setInitFinish(boolean initFinish) {
        this.initFinish = initFinish;
    }

    /**
     * @return the outHeadAreaCode
     */
    public String getOutHeadAreaCode() {
        return outHeadAreaCode;
    }

    /**
     * @param outHeadAreaCode
     *            the outHeadAreaCode to set
     */
    public void setOutHeadAreaCode(String outHeadAreaCode) {
        this.outHeadAreaCode = outHeadAreaCode;
    }

    /**
     * @return the outHeadAdminOfficeCode
     */
    public String getOutHeadAdminOfficeCode() {
        return outHeadAdminOfficeCode;
    }

    /**
     * @param outHeadAdminOfficeCode
     *            the outHeadAdminOfficeCode to set
     */
    public void setOutHeadAdminOfficeCode(String outHeadAdminOfficeCode) {
        this.outHeadAdminOfficeCode = outHeadAdminOfficeCode;
    }

    /**
     * @return the fineEventDate
     */
    public String getFineEventDate() {
        return fineEventDate;
    }

    /**
     * @param fineEventDate
     *            the fineEventDate to set
     */
    public void setFineEventDate(String fineEventDate) {
        this.fineEventDate = fineEventDate;
    }

    /**
     * @return the needCheckFine
     */
    public boolean isNeedCheckFine() {
        return needCheckFine;
    }

    /**
     * @param needCheckFine
     *            the needCheckFine to set
     */
    public void setNeedCheckFine(boolean needCheckFine) {
        this.needCheckFine = needCheckFine;
    }

    /**
     * @return the fineFreeFlag
     */
    public boolean isFineFreeFlag() {
        return fineFreeFlag;
    }

    /**
     * @param fineFreeFlag
     *            the fineFreeFlag to set
     */
    public void setFineFreeFlag(boolean fineFreeFlag) {
        this.fineFreeFlag = fineFreeFlag;
    }

    /**
     * @return the removeFeeReason
     */
    public String getRemoveFeeReason() {
        return removeFeeReason;
    }

    /**
     * @param removeFeeReason
     *            the removeFeeReason to set
     */
    public void setRemoveFeeReason(String removeFeeReason) {
        this.removeFeeReason = removeFeeReason;
    }

    /**
     * @return the fineDTO
     */
    public FineDTO getFineDTO() {
        return fineDTO;
    }

    /**
     * @param fineDTO
     *            the fineDTO to set
     */
    public void setFineDTO(FineDTO fineDTO) {
        this.fineDTO = fineDTO;
    }

    /**
     * @return the fineReceiptId
     */
    public String getFineReceiptId() {
        return fineReceiptId;
    }

    /**
     * @param fineReceiptId
     *            the fineReceiptId to set
     */
    public void setFineReceiptId(String fineReceiptId) {
        this.fineReceiptId = fineReceiptId;
    }

    /**
     * @return the needFineFlag
     */
    public boolean isNeedFineFlag() {
        return needFineFlag;
    }

    /**
     * @param needFineFlag
     *            the needFineFlag to set
     */
    public void setNeedFineFlag(boolean needFineFlag) {
        this.needFineFlag = needFineFlag;
    }

    /**
     * @return the warnningList
     */
    public List<RlWarningMessage> getWarnningList() {
        return warnningList;
    }

    /**
     * @param warnningList
     *            the warnningList to set
     */
    public void setWarnningList(List<RlWarningMessage> warnningList) {
        this.warnningList = warnningList;
    }

    /**
     * @return the oldFineEventDate
     */
    public String getOldFineEventDate() {
        return oldFineEventDate;
    }

    /**
     * @param oldFineEventDate
     *            the oldFineEventDate to set
     */
    public void setOldFineEventDate(String oldFineEventDate) {
        this.oldFineEventDate = oldFineEventDate;
    }

    /**
     * @return the applySequenceId
     */
    public String getApplySequenceId() {
        return applySequenceId;
    }

    /**
     * @param applySequenceId
     *            the applySequenceId to set
     */
    public void setApplySequenceId(String applySequenceId) {
        this.applySequenceId = applySequenceId;
    }

    /**
     * @return the applySiteId
     */
    public String getApplySiteId() {
        return applySiteId;
    }

    /**
     * @param applySiteId
     *            the applySiteId to set
     */
    public void setApplySiteId(String applySiteId) {
        this.applySiteId = applySiteId;
    }

    /**
     * @return the applySeq
     */
    public String getApplySeq() {
        return applySeq;
    }

    /**
     * @param applySeq
     *            the applySeq to set
     */
    public void setApplySeq(String applySeq) {
        this.applySeq = applySeq;
    }

    /**
     * @return the applyCaseNo
     */
    public String getApplyCaseNo() {
        return applyCaseNo;
    }

    /**
     * @param applyCaseNo
     *            the applyCaseNo to set
     */
    public void setApplyCaseNo(String applyCaseNo) {
        this.applyCaseNo = applyCaseNo;
    }

    /**
     * @return the operationCode
     */
    public String getOperationCode() {
        return operationCode;
    }

    /**
     * @param operationCode
     *            the operationCode to set
     */
    public void setOperationCode(String operationCode) {
        this.operationCode = operationCode;
    }

    /**
     * @return the finePersonId
     */
    public String getFinePersonId() {
        return finePersonId;
    }

    /**
     * @param finePersonId
     *            the finePersonId to set
     */
    public void setFinePersonId(String finePersonId) {
        this.finePersonId = finePersonId;
    }

    /**
     * @return the transactionId
     */
    public String getTransactionId() {
        return transactionId;
    }

    /**
     * @param transactionId
     *            the transactionId to set
     */
    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    /**
     * @return the lockOldDataKeyList
     */
    public List<String> getLockOldDataKeyList() {
        return lockOldDataKeyList;
    }

    /**
     * @param lockOldDataKeyList
     *            the lockOldDataKeyList to set
     */
    public void setLockOldDataKeyList(List<String> lockOldDataKeyList) {
        this.lockOldDataKeyList = lockOldDataKeyList;
    }

    /**
     * @return the lastNeedCheckFine
     */
    public boolean isLastNeedCheckFine() {
        return lastNeedCheckFine;
    }

    /**
     * @param lastNeedCheckFine
     *            the lastNeedCheckFine to set
     */
    public void setLastNeedCheckFine(boolean lastNeedCheckFine) {
        this.lastNeedCheckFine = lastNeedCheckFine;
    }

    /**
     * @return the deleteFineDTOFlag
     */
    public boolean isDeleteFineDTOFlag() {
        return deleteFineDTOFlag;
    }

    /**
     * @param deleteFineDTOFlag
     *            the deleteFineDTOFlag to set
     */
    public void setDeleteFineDTOFlag(boolean deleteFineDTOFlag) {
        this.deleteFineDTOFlag = deleteFineDTOFlag;
    }

    /**
     * @return the fineButtonShow
     */
    public boolean isFineButtonShow() {
        return fineButtonShow;
    }

    /**
     * @param fineButtonShow
     *            the fineButtonShow to set
     */
    public void setFineButtonShow(boolean fineButtonShow) {
        this.fineButtonShow = fineButtonShow;
    }

    /**
     * @return the acceptSiteId
     */
    public String getAcceptSiteId() {
        return acceptSiteId;
    }

    /**
     * @param acceptSiteId
     *            the acceptSiteId to set
     */
    public void setAcceptSiteId(String acceptSiteId) {
        this.acceptSiteId = acceptSiteId;
    }

    /**
     * @return the memberPersonDataList
     */
    public List<XLDFPersonDataDomainObject> getMemberPersonDataList() {
        return memberPersonDataList;
    }

    /**
     * @param memberPersonDataList
     *            the memberPersonDataList to set
     */
    public void setMemberPersonDataList(List<XLDFPersonDataDomainObject> memberPersonDataList) {
        this.memberPersonDataList = memberPersonDataList;
    }

    /**
     * @return the breakDownMovein
     */
    public boolean isBreakDownMovein() {
        return breakDownMovein;
    }

    /**
     * @param breakDownMovein
     *            the breakDownMovein to set
     */
    public void setBreakDownMovein(boolean breakDownMovein) {
        this.breakDownMovein = breakDownMovein;
    }

    /**
     * @return the saveButtonShow
     */
    public boolean isSaveButtonShow() {
        return saveButtonShow;
    }

    /**
     * @param saveButtonShow
     *            the saveButtonShow to set
     */
    public void setSaveButtonShow(boolean saveButtonShow) {
        this.saveButtonShow = saveButtonShow;
    }

    /**
     * @return the beenEnforcedMoveToAdminOfficeFlag
     */
    public boolean isBeenEnforcedMoveToAdminOfficeFlag() {
        return beenEnforcedMoveToAdminOfficeFlag;
    }

    /**
     * @param beenEnforcedMoveToAdminOfficeFlag
     *            the beenEnforcedMoveToAdminOfficeFlag to set
     */
    public void setBeenEnforcedMoveToAdminOfficeFlag(boolean beenEnforcedMoveToAdminOfficeFlag) {
        this.beenEnforcedMoveToAdminOfficeFlag = beenEnforcedMoveToAdminOfficeFlag;
    }

    /**
     * @return the beenEnforcedMoveToNonAdminOfficeFlag
     */
    public boolean isBeenEnforcedMoveToNonAdminOfficeFlag() {
        return beenEnforcedMoveToNonAdminOfficeFlag;
    }

    /**
     * @param beenEnforcedMoveToNonAdminOfficeFlag
     *            the beenEnforcedMoveToNonAdminOfficeFlag to set
     */
    public void setBeenEnforcedMoveToNonAdminOfficeFlag(boolean beenEnforcedMoveToNonAdminOfficeFlag) {
        this.beenEnforcedMoveToNonAdminOfficeFlag = beenEnforcedMoveToNonAdminOfficeFlag;
    }

    /**
     * @return the rc1mPassPeople
     */
    public List<String> getRc1mPassPeople() {
        return rc1mPassPeople;
    }

    /**
     * @param rc1mPassPeople
     *            the rc1mPassPeople to set
     */
    public void setRc1mPassPeople(List<String> rc1mPassPeople) {
        this.rc1mPassPeople = rc1mPassPeople;
    }

    /**
     * @return the fromRPCChinaFlag
     */
    public boolean isFromRPCChinaFlag() {
        return fromRPCChinaFlag;
    }

    /**
     * @param fromRPCChinaFlag
     *            the fromRPCChinaFlag to set
     */
    public void setFromRPCChinaFlag(boolean fromRPCChinaFlag) {
        this.fromRPCChinaFlag = fromRPCChinaFlag;
    }

    /**
     * @return the doImmigrate
     */
    public boolean isDoImmigrate() {
        return doImmigrate;
    }

    /**
     * @param doImmigrate
     *            the doImmigrate to set
     */
    public void setDoImmigrate(boolean doImmigrate) {
        this.doImmigrate = doImmigrate;
    }

    /**
     * @return the beenVerifiedPersonId
     */
    public Set<String> getBeenVerifiedPersonId() {
        return beenVerifiedPersonId;
    }

    /**
     * @param beenVerifiedPersonId
     *            the beenVerifiedPersonId to set
     */
    public void setBeenVerifiedPersonId(Set<String> beenVerifiedPersonId) {
        this.beenVerifiedPersonId = beenVerifiedPersonId;
    }

    /**
     * @return the beenCheckedPersonId
     */
    public Set<String> getBeenCheckedPersonId() {
        return beenCheckedPersonId;
    }

    /**
     * @param beenCheckedPersonId
     *            the beenCheckedPersonId to set
     */
    public void setBeenCheckedPersonId(Set<String> beenCheckedPersonId) {
        this.beenCheckedPersonId = beenCheckedPersonId;
    }

    /**
     * @return the beenCheckedMveRestrictedPersonId
     */
    public Set<String> getBeenCheckedMveRestrictedPersonId() {
        return beenCheckedMveRestrictedPersonId;
    }

    /**
     * @param beenCheckedMveRestrictedPersonId
     *            the beenCheckedMveRestrictedPersonId to set
     */
    public void setBeenCheckedMveRestrictedPersonId(Set<String> beenCheckedMveRestrictedPersonId) {
        this.beenCheckedMveRestrictedPersonId = beenCheckedMveRestrictedPersonId;
    }

    /**
     * @return the beenVerifiedNonInternal
     */
    public Set<String> getBeenVerifiedNonInternal() {
        return beenVerifiedNonInternal;
    }

    /**
     * @param beenVerifiedNonInternal
     *            the beenVerifiedNonInternal to set
     */
    public void setBeenVerifiedNonInternal(Set<String> beenVerifiedNonInternal) {
        this.beenVerifiedNonInternal = beenVerifiedNonInternal;
    }

    /**
     * @return the finePersonData
     */
    public FinePersonDTO getFinePersonData() {
        return finePersonData;
    }

    /**
     * @param finePersonData
     *            the finePersonData to set
     */
    public void setFinePersonData(FinePersonDTO finePersonData) {
        this.finePersonData = finePersonData;
    }

    /**
     * @return the moveinBigHousehold
     */
    public boolean isMoveinBigHousehold() {
        return moveinBigHousehold;
    }

    /**
     * @param moveinBigHousehold
     *            the moveinBigHousehold to set
     */
    public void setMoveinBigHousehold(boolean moveinBigHousehold) {
        this.moveinBigHousehold = moveinBigHousehold;
    }

    /**
     * @return the doGetAllFiles
     */
    public boolean isDoGetAllFiles() {
        return doGetAllFiles;
    }

    /**
     * @param doGetAllFiles
     *            the doGetAllFiles to set
     */
    public void setDoGetAllFiles(boolean doGetAllFiles) {
        this.doGetAllFiles = doGetAllFiles;
    }

    /**
     * @return the ifTheSameAddressRegain
     */
    public boolean isIfTheSameAddressRegain() {
        return ifTheSameAddressRegain;
    }

    /**
     * @param ifTheSameAddressRegain
     *            the ifTheSameAddressRegain to set
     */
    public void setIfTheSameAddressRegain(boolean ifTheSameAddressRegain) {
        this.ifTheSameAddressRegain = ifTheSameAddressRegain;
    }

    /**
     * @return the ifTheSameAddressRegainOption
     */
    public String getIfTheSameAddressRegainOption() {
        return ifTheSameAddressRegainOption;
    }

    /**
     * @param ifTheSameAddressRegainOption
     *            the ifTheSameAddressRegainOption to set
     */
    public void setIfTheSameAddressRegainOption(String ifTheSameAddressRegainOption) {
        this.ifTheSameAddressRegainOption = ifTheSameAddressRegainOption;
    }

    /**
     * @return the exeTimeLog
     */
    public String getExeTimeLog() {
        return exeTimeLog;
    }

    /**
     * @param exeTimeLog
     *            the exeTimeLog to set
     */
    public void setExeTimeLog(String exeTimeLog) {
        this.exeTimeLog = exeTimeLog;
    }

    /**
     * @return the registerUserId
     */
    public String getRegisterUserId() {
        return registerUserId;
    }

    /**
     * @param registerUserId
     *            the registerUserId to set
     */
    public void setRegisterUserId(String registerUserId) {
        this.registerUserId = registerUserId;
    }

    /**
     * @return the bfeComputerlizedlMoveOut
     */
    public boolean isBfeComputerlizedlMoveOut() {
        return bfeComputerlizedlMoveOut;
    }

    /**
     * @param bfeComputerlizedlMoveOut
     *            the bfeComputerlizedlMoveOut to set
     */
    public void setBfeComputerlizedlMoveOut(boolean bfeComputerlizedlMoveOut) {
        this.bfeComputerlizedlMoveOut = bfeComputerlizedlMoveOut;
    }

    /**
     * @return the processedPerson
     */
    public MoveInDTO getProcessedPerson() {
        return processedPerson;
    }

    /**
     * @param processedPerson
     *            the processedPerson to set
     */
    public void setProcessedPerson(MoveInDTO processedPerson) {
        this.processedPerson = processedPerson;
    }

    /**
     * @return the loopConunt
     */
    public Integer getLoopConunt() {
        return loopConunt;
    }

    /**
     * @param loopConunt
     *            the loopConunt to set
     */
    public void setLoopConunt(Integer loopConunt) {
        this.loopConunt = loopConunt;
    }

    /**
     * @return the processedPersonExeTLog
     */
    public List<StringBuffer> getProcessedPersonExeTLog() {
        return processedPersonExeTLog;
    }

    /**
     * @param processedPersonExeTLog
     *            the processedPersonExeTLog to set
     */
    public void setProcessedPersonExeTLog(List<StringBuffer> processedPersonExeTLog) {
        this.processedPersonExeTLog = processedPersonExeTLog;
    }

    /**
     * @return the originalAreaName
     */
    public String getOriginalAreaName() {
        return originalAreaName;
    }

    /**
     * @param originalAreaName
     *            the originalAreaName to set
     */
    public void setOriginalAreaName(String originalAreaName) {
        this.originalAreaName = originalAreaName;
    }

    /**
     * @return the originalAreaCode
     */
    public String getOriginalAreaCode() {
        return originalAreaCode;
    }

    /**
     * @param originalAreaCode
     *            the originalAreaCode to set
     */
    public void setOriginalAreaCode(String originalAreaCode) {
        this.originalAreaCode = originalAreaCode;
    }

    /**
     * @return the restrictedPerson
     */
    public List<String> getRestrictedPerson() {
        return restrictedPerson;
    }

    /**
     * @param restrictedPerson
     *            the restrictedPerson to set
     */
    public void setRestrictedPerson(List<String> restrictedPerson) {
        this.restrictedPerson = restrictedPerson;
    }

    /**
     * @return the initSuccess
     */
    public boolean isInitSuccess() {
        return initSuccess;
    }

    /**
     * @param initSuccess
     *            the initSuccess to set
     */
    public void setInitSuccess(boolean initSuccess) {
        this.initSuccess = initSuccess;
    }

    /**
     * @return the activeIndex
     */
    public String getActiveIndex() {
        return activeIndex;
    }

    /**
     * @param activeIndex
     *            the activeIndex to set
     */
    public void setActiveIndex(String activeIndex) {
        this.activeIndex = activeIndex;
    }

    /**
     * @return the approveDate
     */
    public String getApproveDate() {
        return approveDate;
    }

    /**
     * @param approveDate
     *            the approveDate to set
     */
    public void setApproveDate(String approveDate) {
        this.approveDate = approveDate;
    }

    /**
     * @return the areaCodeRSCD
     */
    public String getAreaCodeRSCD() {
        return areaCodeRSCD;
    }

    /**
     * @param areaCodeRSCD
     *            the areaCodeRSCD to set
     */
    public void setAreaCodeRSCD(String areaCodeRSCD) {
        this.areaCodeRSCD = areaCodeRSCD;
    }

    /**
     * @return the bigApplyKind
     */
    public String getBigApplyKind() {
        return bigApplyKind;
    }

    /**
     * @param bigApplyKind
     *            the bigApplyKind to set
     */
    public void setBigApplyKind(String bigApplyKind) {
        this.bigApplyKind = bigApplyKind;
    }

    /**
     * @return the qryinputList
     */
    public List<MoveQryInputDTO> getQryinputList() {
        return qryinputList;
    }

    /**
     * @param qryinputList
     *            the qryinputList to set
     */
    public void setQryinputList(List<MoveQryInputDTO> qryinputList) {
        this.qryinputList = qryinputList;
    }

    /**
     * @return the bigHouseholdFlag
     */
    public boolean isBigHouseholdFlag() {
        return bigHouseholdFlag;
    }

    /**
     * @param bigHouseholdFlag
     *            the bigHouseholdFlag to set
     */
    public void setBigHouseholdFlag(boolean bigHouseholdFlag) {
        this.bigHouseholdFlag = bigHouseholdFlag;
    }

    /**
     * @return the massMovePeopleDataList
     */
    public List<RlPersonalDataDTO> getMassMovePeopleDataList() {
        return massMovePeopleDataList;
    }

    /**
     * @param massMovePeopleDataList
     *            the massMovePeopleDataList to set
     */
    public void setMassMovePeopleDataList(List<RlPersonalDataDTO> massMovePeopleDataList) {
        this.massMovePeopleDataList = massMovePeopleDataList;
    }

    /**
     * @return the oriResidentCnt
     */
    public Integer getOriResidentCnt() {
        return oriResidentCnt;
    }

    /**
     * @param oriResidentCnt
     *            the oriResidentCnt to set
     */
    public void setOriResidentCnt(Integer oriResidentCnt) {
        this.oriResidentCnt = oriResidentCnt;
    }

    /**
     * @return the lastConcurnHead
     */
    public boolean isLastConcurnHead() {
        return lastConcurnHead;
    }

    /**
     * @param lastConcurnHead
     *            the lastConcurnHead to set
     */
    public void setLastConcurnHead(boolean lastConcurnHead) {
        this.lastConcurnHead = lastConcurnHead;
    }

    /**
     * @return the oriNonResidentCnt
     */
    public Integer getOriNonResidentCnt() {
        return oriNonResidentCnt;
    }

    /**
     * @param oriNonResidentCnt
     *            the oriNonResidentCnt to set
     */
    public void setOriNonResidentCnt(Integer oriNonResidentCnt) {
        this.oriNonResidentCnt = oriNonResidentCnt;
    }

    /**
     * @return the oriHeadData
     */
    public XLDFPersonDataDomainObject getOriHeadData() {
        return oriHeadData;
    }

    /**
     * @param oriHeadData
     *            the oriHeadData to set
     */
    public void setOriHeadData(XLDFPersonDataDomainObject oriHeadData) {
        this.oriHeadData = oriHeadData;
    }

    /**
     * @return the onlyMasterPersonList
     */
    public List<MoveInDTO> getOnlyMasterPersonList() {
        return onlyMasterPersonList;
    }

    /**
     * @param onlyMasterPersonList
     *            the onlyMasterPersonList to set
     */
    public void setOnlyMasterPersonList(List<MoveInDTO> onlyMasterPersonList) {
        this.onlyMasterPersonList = onlyMasterPersonList;
    }

    /**
     * @return the cannotChangeBigApplyKind
     */
    public boolean isCannotChangeBigApplyKind() {
        return cannotChangeBigApplyKind;
    }

    /**
     * @param cannotChangeBigApplyKind
     *            the cannotChangeBigApplyKind to set
     */
    public void setCannotChangeBigApplyKind(boolean cannotChangeBigApplyKind) {
        this.cannotChangeBigApplyKind = cannotChangeBigApplyKind;
    }

    /**
     * @return the fileFetechedPerson
     */
    public Set<String> getFileFetechedPerson() {
        return fileFetechedPerson;
    }

    /**
     * @param fileFetechedPerson
     *            the fileFetechedPerson to set
     */
    public void setFileFetechedPerson(Set<String> fileFetechedPerson) {
        this.fileFetechedPerson = fileFetechedPerson;
    }

    /**
     * @return the nowPersonData
     */
    public RlPersonDataResultDTO getNowPersonData() {
        return nowPersonData;
    }

    /**
     * @param nowPersonData
     *            the nowPersonData to set
     */
    public void setNowPersonData(RlPersonDataResultDTO nowPersonData) {
        this.nowPersonData = nowPersonData;
    }

    /**
     * @return the xldf030mList
     */
    public List<XLDF030M> getXldf030mList() {
        return xldf030mList;
    }

    /**
     * @param xldf030mList
     *            the xldf030mList to set
     */
    public void setXldf030mList(List<XLDF030M> xldf030mList) {
        this.xldf030mList = xldf030mList;
    }

    /**
     * @return the xldf030tList
     */
    public List<XLDF030T> getXldf030tList() {
        return xldf030tList;
    }

    /**
     * @param xldf030tList
     *            the xldf030tList to set
     */
    public void setXldf030tList(List<XLDF030T> xldf030tList) {
        this.xldf030tList = xldf030tList;
    }

    public boolean isDoNoteOn2H() {
        return doNoteOn2H;
    }

    public void setDoNoteOn2H(boolean doNoteOn2H) {
        this.doNoteOn2H = doNoteOn2H;
    }

    public XLDFPersonDataDomainObject getOriRmveHeadPData() {
        return oriRmveHeadPData;
    }

    public void setOriRmveHeadPData(XLDFPersonDataDomainObject oriRmveHeadPData) {
        this.oriRmveHeadPData = oriRmveHeadPData;
    }

    public XLDFHouseholdDataDomainObject getOriRmveHData() {
        return oriRmveHData;
    }

    public void setOriRmveHData(XLDFHouseholdDataDomainObject oriRmveHData) {
        this.oriRmveHData = oriRmveHData;
    }

    public Map<String, List<Object>> getRldfyDataMap() {
        return rldfyDataMap;
    }

    public void setRldfyDataMap(Map<String, List<Object>> rldfyDataMap) {
        this.rldfyDataMap = rldfyDataMap;
    }

    public boolean isDoShowHouseholdHead() {
        return doShowHouseholdHead;
    }

    public void setDoShowHouseholdHead(boolean doShowHouseholdHead) {
        this.doShowHouseholdHead = doShowHouseholdHead;
    }

    public List<String> getExecTimeLog() {
        return execTimeLog;
    }

    public void setExecTimeLog(List<String> execTimeLog) {
        this.execTimeLog = execTimeLog;
    }

    public Map<String, List<XLDFDomainObject>> getReserveNoteMap() {
        return reserveNoteMap;
    }

    public void setReserveNoteMap(Map<String, List<XLDFDomainObject>> reserveNoteMap) {
        this.reserveNoteMap = reserveNoteMap;
    }

    public List<XldfopracsType> getXldfyDataaccessList() {
        return xldfyDataaccessList;
    }

    public void setXldfyDataaccessList(List<XldfopracsType> xldfyDataaccessList) {
        this.xldfyDataaccessList = xldfyDataaccessList;
    }

    public Set<String> getBeenEducationModified() {
        return beenEducationModified;
    }

    public void setBeenEducationModified(Set<String> beenEducationModified) {
        this.beenEducationModified = beenEducationModified;
    }

}

/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;
import tw.gov.moi.domain.XldfefaplcType;
import tw.gov.moi.rl.component.dto.FinePersonDTO;
import tw.gov.moi.rl.component.dto.OpeningOperationDTO;
import tw.gov.moi.rl.component.xldf.dto.XLDF021M;
import tw.gov.moi.rl.domain.xldf.XLDFHouseholdDataDomainObject;
import tw.gov.moi.rl.domain.xldf.XLDFHouseholdNoteDomainObject;
import tw.gov.moi.rl.domain.xldf.XLDFPersonDataDomainObject;
import tw.gov.moi.rl.domain.xldf.XLDFPersonNoteDomainObject;

/**
 * Rl01370DTO 通訊中斷後遷入登記DTO
 * 
 * @author Marcus Chen
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl01370DTO", propOrder = { "openingOperationDTO", "personDataList", "originDataList",
        "selectRegisterList", "moveInHousePerson", "householdData", "moveInHousehold", "originNewHousehold",
        "memberList" })
@XmlRootElement(name = "Rl01370DTO")
public class Rl01370DTO implements Serializable {

    /** Serial Id. */
    private static final long serialVersionUID = 598726909330491199L;

    /** OpeningOperationDTO 4/18 */
    @XmlElement(name = "OpeningOperationDTO")
    @FieldName("戶籍登記作業共通DTO")
    private OpeningOperationDTO openingOperationDTO = new OpeningOperationDTO();

    /** 當事人個人資料. */
    @XmlElement(name = "personDataList", required = true)
    @FieldName(" 當事人個人資料")
    private List<MoveInDTO> personDataList = new ArrayList<MoveInDTO>();

    /** 原住地個人資料. 4/17 */
    @XmlElement(name = "personDataList", required = true)
    @FieldName("原住地個人資料")
    private List<OriginDataDTO> originDataList = new ArrayList<OriginDataDTO>();

    /** 當事人個人記事資料. 4/4 */
    @XmlElement(name = "selectRegisterList", required = true)
    @FieldName("當事人個人記事資料")
    private List<MoveInRegisterDTO> selectRegisterList = new ArrayList<MoveInRegisterDTO>();

    /** 戶內成員personDataObject */
    @XmlElement(name = "membersPersonData", required = true)
    @FieldName("戶內成員personDataObject ")
    private List<XLDFPersonDataDomainObject> membersPersonData = new ArrayList<XLDFPersonDataDomainObject>();

    /** 遷入戶長個人資料. */
    @XmlElement(name = "moveInHousePerson", required = true)
    @FieldName("遷入戶長個人資料")
    private XLDFPersonDataDomainObject moveInHousePerson;

    /** 兼任戶長本人個人資料. */
    @XmlElement(name = "conCurrentRealPerson", required = true)
    @FieldName("兼任戶長本人個人資料")
    private XLDFPersonDataDomainObject conCurrentRealPerson;

    /** 原住地原全戶資料. */
    @XmlElement(name = "householdData", required = true)
    @FieldName("原住地原全戶資料")
    private XLDFHouseholdDataDomainObject householdData;

    /** 當事人新戶資料. */
    @XmlElement(name = "moveInHousehold", required = true)
    @FieldName("當事人新戶資料")
    private XLDFHouseholdDataDomainObject moveInHousehold;

    /** 原住地新戶資料. */
    @XmlElement(name = "originNewHousehold", required = true)
    @FieldName("原住地新戶資料")
    private XLDFHouseholdDataDomainObject originNewHousehold;

    /** 申請人資料. */
    @XmlElement(name = "applyPersonList", required = true)
    @FieldName("申請人資料")
    private List<XLDFApplicantDataDTO> applyPersonList = new ArrayList<XLDFApplicantDataDTO>();

    /** 受委託人資料. */
    @XmlElement(name = "commPerson", required = true)
    @FieldName(" 受委託人資料")
    private XLDFPersonBriefDataDTO commPerson = new XLDFPersonBriefDataDTO();

    /** 戶內成員清單. */
    @XmlElement(name = "memberList", required = true)
    @FieldName("戶內成員清單")
    private List<MemberDTO> memberList = new ArrayList<MemberDTO>();

    /** 戶內成員清單. */
    @XmlElement(name = "memberPersonDataList", required = true)
    @FieldName("戶內成員資料清單")
    private List<XLDFPersonDataDomainObject> memberPersonDataList = new ArrayList<XLDFPersonDataDomainObject>();

    /** 當事人清除清單. */
    @XmlElement(name = "clearList", required = true)
    @FieldName("當事人清除清單")
    private List<ClearDTO> clearList = new ArrayList<ClearDTO>();

    /** 個人記事清單資料. */
    @XmlElement(name = "personNoteList", required = true)
    @FieldName("個人記事清單資料")
    private List<XLDFPersonNoteDomainObject> personNoteList = new ArrayList<XLDFPersonNoteDomainObject>();

    /** 全戶記事清單 */
    @XmlElement(name = "householdNoteList", required = true)
    @FieldName(" 全戶記事清單")
    private List<XLDFHouseholdNoteDomainObject> householdNoteList = new ArrayList<XLDFHouseholdNoteDomainObject>();

    /** 大簿當事人個人資料料. */
    @XmlElement(name = "masterPerson", required = true)
    @FieldName(" 大簿當事人個人資料料")
    private XLDFPersonDataDomainObject masterPerson;

    /** 大簿當事人個人資料料. */
    @XmlElement(name = "enforceApplyPerson", required = true)
    @FieldName("大簿當事人個人資料料.")
    private XldfefaplcType enforceApplyPerson;

    /** 遷入地戶號配賦. 4/4 */
    @XmlElement(name = "moveInXldf021m", required = true)
    @FieldName(" 遷入地戶號配賦.")
    private XLDF021M moveInXldf021m;

    /** 戶內人口統號清單. */
    @XmlElement(name = "memberIds", required = true)
    @FieldName("戶內人口統號清單.")
    private List<String> memberIds;

    /** 戶內非現住人口統號清單. 4/27 */
    @XmlElement(name = "otherPersonIds", required = true)
    @FieldName("戶內非現住人口統號清單.")
    private List<String> otherPersonIds;

    /** 當事人新增視窗 被輸入的personID. */
    @XmlElement(name = "addPersonId", required = true)
    @FieldName("當事人新增視窗 被輸入的personID.")
    private String addPersonId;

    /** 異地辦理旗標. */
    @XmlElement(name = "substituteFlag", required = true)
    @FieldName("異地辦理旗標")
    private boolean substituteFlag;

    /** 全戶遷出旗標. */
    @XmlElement(name = "allMoveFlag", required = true)
    @FieldName("全戶遷出旗標.")
    private boolean allMoveFlag;

    /** 遷入地作業點代碼. */
    @XmlElement(name = "moveInSiteId", required = true)
    @FieldName("遷入地作業點代碼")
    private String moveInSiteId;

    /** 原住地. */
    @XmlElement(name = "OriginalSiteId", required = true)
    @FieldName("原住地點代碼")
    private String originalSiteId;

    /** 原住地點行政區域代碼. */
    @XmlElement(name = "originalAreaCode", required = true)
    @FieldName("原住地點行政區域代碼")
    private String originalAreaCode;

    /** 申請種類. */
    @XmlElement(name = "ApplyKind", required = true)
    @FieldName("申請種類")
    private String applyKind;

    /** 遷入種類補登時. */
    @XmlElement(name = "moveinType", required = true)
    @FieldName("遷入種類補登時")
    private String moveinType;

    /*** ========================其他申請資料頁籤======================= */

    /** 其他申請資料頁籤-遷入戶號. */
    @XmlElement(name = "moveInHouseId", required = true)
    @FieldName(" 其他申請資料頁籤-遷入戶號.")
    private String moveInHouseId;

    /** 其他申請資料頁籤-遷入戶長國民身分證統一編號. */
    @XmlElement(name = "moveInHouseheadId", required = true)
    @FieldName("其他申請資料頁籤-遷入戶長國民身分證統一編號.")
    private String moveInHouseheadId;

    /** 其他申請資料頁籤-是否自立新戶 1:是 2:否 . */
    @XmlElement(name = "moveInHouseheadId", required = true)
    @FieldName("其他申請資料頁籤-是否自立新戶")
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
    @XmlElement(name = "needCheckFine", required = true)
    @FieldName(" 其他申請資料頁籤-須進行逾期申請之罰鍰處理")
    private boolean needCheckFine;

    /** 其他申請資料頁籤-事件發生(確定)日期. */
    @XmlElement(name = "fineEventDate", required = true)
    @FieldName(" 其他申請資料頁籤-事件發生(確定)日期")
    private String fineEventDate;

    /** 記事與罰鍰資料頁籤-目前有罰鍰改為不須罰鍰. */
    @XmlElement(name = "fineFreeFlag", required = true)
    @FieldName("記事與罰鍰資料頁籤-目前有罰鍰改為不須罰鍰")
    private boolean fineFreeFlag;

    /** 記事與罰鍰資料頁籤-免罰原因. */
    @XmlElement(name = "removeFeeReason", required = true)
    @FieldName("記事與罰鍰資料頁籤-免罰原因")
    private String removeFeeReason;

    /** (是否為)中斷後遷入. */
    @XmlElement(name = "breakDownMovein", required = true)
    @FieldName("中斷後遷入")
    private boolean breakDownMovein = Boolean.TRUE;

    /** 其他申請資料頁籤-法定應申報日期. */
    @XmlElement(name = "LawDate", required = true)
    @FieldName("記事與罰鍰資料頁籤-免罰原因")
    private String lawDate;

    /** 其他申請資料頁籤-遷出戶戶長未提供戶口名簿. */
    @XmlElement(name = "IsnotHousebook", required = true)
    @FieldName("其他申請資料頁籤-遷出戶戶長未提供戶口名簿")
    private String isnotHousebook;

    /** 是否有戶內成員. */
    @XmlElement(name = "hasMember", required = true)
    @FieldName("是否有戶內成員")
    private boolean hasMember;

    /** 其他申請資料頁籤-是否原住地戶長遷出. */
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

    /** ===============大簿Bean================ */

    /** Test for XLDFSelectModeDomainDTO */
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
    @XmlElement(name = "fineReceiptId", required = true)
    @FieldName("收據號碼")
    private String fineReceiptId;

    /** 是否逕為登記. */
    @XmlElement(name = "enforcedFlag", required = true)
    @FieldName("是否逕為登記")
    private boolean enforcedFlag;

    /** 受理地戶政事務所代碼. */
    @XmlElement(name = "acceptedAdminOfficeCode", required = true)
    @FieldName("受理地戶政事務所代碼")
    private String acceptedAdminOfficeCode;

    /** 自國外遷入當事人的的除戶日期. */
    @XmlElement(name = "BeMoveoutRemoveDate", required = true)
    @FieldName("自國外遷入當事人的的除戶日期")
    private String beMoveoutRemoveDate;

    /** 是否初始化完成. */
    @XmlElement(name = "initFinish", required = true)
    @FieldName("是否初始化完成")
    private boolean initFinish = Boolean.FALSE;

    /** 罰鍰DTO. */
    @XmlElement(name = "fineDTO", required = true)
    @FieldName("罰鍰DTO")
    private FineDTO fineDTO;

    /** 經罰鍰元件驗證後須進行罰鍰處理.Value=Y/N */
    @XmlElement(name = "needFineFlag", required = true)
    @FieldName("經罰鍰元件驗證後須進行罰鍰處理")
    private boolean needFineFlag;

    /** 警告訊息 */
    @XmlElement(name = "warnningList", required = true)
    @FieldName("警告訊息")
    List<RlWarningMessage> warnningList = new ArrayList<RlWarningMessage>();

    /** 其他申請資料頁籤-須進行逾期申請之罰鍰處理(上次的選擇). */
    @XmlElement(name = "lastNeedCheckFine", required = true)
    @FieldName(" 其他申請資料頁籤-須進行逾期申請之罰鍰處理(上次的選擇)")
    private boolean lastNeedCheckFine;

    /** 要刪除FINEDTOFLAG. */
    @XmlElement(name = "deleteFineDTOFlag", required = true)
    @FieldName("要刪除FINEDTOFLAG")
    private boolean deleteFineDTOFlag;

    /** 事件發生確定日期(上次輸入的值) */
    @XmlElement(name = "oldFineEventDate", required = true)
    @FieldName("事件發生確定日期(上次輸入的值)")
    private String oldFineEventDate;
    /** 交易順序 */
    @XmlElement(name = "applySequenceId", required = true)
    @FieldName("交易順序")
    private String applySequenceId;

    /** 受理地siteId */
    @XmlElement(name = "applySiteId", required = true)
    @FieldName("受理地siteId")
    private String applySiteId;

    /** applySeq */
    @XmlElement(name = "applySeq", required = true)
    @FieldName("applySeq")
    private String applySeq;

    /** 申請種類案件編號 */
    @XmlElement(name = "applyCaseNo", required = true)
    @FieldName("applyCaseNo")
    private String applyCaseNo;
    /** 作業代碼 */
    @XmlElement(name = "operateionName", required = true)
    @FieldName("作業代碼")
    private String operateionName;

    /** finePersonId */
    @XmlElement(name = "finePersonId", required = true)
    @FieldName("finePersonId")
    private String finePersonId;

    /** 交易序號 */
    @XmlElement(name = "transactionId", required = true)
    @FieldName("交易序號")
    private String transactionId;

    /** 存放需要做Lock的舊地1Mkey值 */
    @XmlElement(name = "lockOldDataKeyList", required = true)
    @FieldName("存放需要做Lock的舊地1Mkey值")
    private List<String> lockOldDataKeyList = new ArrayList<String>();

    /** 罰鍰處理是否顯示 */
    @XmlElement(name = "fineButtonShow", required = true)
    @FieldName("罰鍰處理是否顯示")
    private boolean fineButtonShow;

    /** 暫存按鈕是否顯示 */
    @XmlElement(name = "saveButtonShow", required = true)
    @FieldName("暫存按鈕是否顯示")
    private boolean saveButtonShow;

    /** 受理地作業點代碼 */
    @XmlElement(name = "acceptSiteId", required = true)
    @FieldName("受理地作業點代碼")
    private String acceptSiteId;

    /** 交易序號. */
    @XmlElement(name = "txnId", required = true)
    @FieldName("交易序號")
    private String txnId;

    /** 之前是否被逕遷至戶所. */
    @XmlElement(name = "beenEnforcedMoveFlag", required = true)
    @FieldName("之前是否被逕遷至戶所")
    private boolean beenEnforcedMoveToAdminOfficeFlag = Boolean.FALSE;

    /** 之前是否被逕遷至非戶所. */
    @XmlElement(name = "beenEnforcedMoveFlag", required = true)
    @FieldName("之前是否被逕遷至非戶所")
    private boolean beenEnforcedMoveToNonAdminOfficeFlag = Boolean.FALSE;

    /** 其他申請資料頁籤-申請日期. */
    @XmlElement(name = "ApplyDate", required = true)
    @FieldName("其他申請資料頁籤-申請日期")
    private String applyDate;

    /** 罰鍰受處分人資料 */
    @XmlElement(name = "finePersonData", required = true)
    @FieldName("罰鍰受處分人資料")
    private FinePersonDTO finePersonData = new FinePersonDTO();;

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
     * @return the operateionName
     */
    public String getOperateionName() {
        return operateionName;
    }

    /**
     * @param operateionName
     *            the operateionName to set
     */
    public void setOperateionName(String operateionName) {
        this.operateionName = operateionName;
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

}

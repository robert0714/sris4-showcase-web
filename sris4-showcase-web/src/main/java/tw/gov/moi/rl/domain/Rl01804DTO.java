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
import tw.gov.moi.rl.component.xldf.dto.XLDFM10M;
import tw.gov.moi.rl.domain.xldf.XLDFHouseholdDataDomainObject;
import tw.gov.moi.rl.domain.xldf.XLDFHouseholdNoteDomainObject;
import tw.gov.moi.rl.domain.xldf.XLDFPersonDataDomainObject;
import tw.gov.moi.rl.domain.xldf.XLDFPersonNoteDomainObject;

/**
 * 撤銷遷出登記DTO
 * 
 * @author Marcus Chen
 * 
 */

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl01804DTO", propOrder = { "openingOperationDTO", "personDataList", "originDataList",
        "selectRegisterList", "moveInHousePerson", "householdData", "moveInHousehold", "originNewHousehold",
        "memberList" })
@XmlRootElement(name = "Rl01804DTO")
public class Rl01804DTO implements Serializable {

    /** Serial Id. */
    private static final long serialVersionUID = 598726909330491199L;

    /** 大簿控制各作業之資訊.(OpeningOperationDTO) */
    @XmlElement(name = "openingOperationDTO", required = true)
    @FieldName("大簿控制各作業之資訊")
    private OpeningOperationDTO openingOperationDTO = new OpeningOperationDTO();

    /** 當事人個人資料. */
    @XmlElement(name = "personDataList", required = true)
    @FieldName("當事人個人資料")
    private List<Rl01804MoveinDTO> personDataList = new ArrayList<Rl01804MoveinDTO>();

    /** 原遷出地個人資料. */
    @XmlElement(name = "originDataList", required = true)
    @FieldName("原遷出地個人資料")
    private List<Rl01804OriginDataDTO> originDataList = new ArrayList<Rl01804OriginDataDTO>();

    /** 當事人個人記事資料. 4/4 */
    @XmlElement(name = "selectRegisterList", required = true)
    @FieldName("當事人個人記事資料")
    private List<MoveInRegisterDTO> selectRegisterList = new ArrayList<MoveInRegisterDTO>();

    /** 擬入戶長個人資料. */
    @XmlElement(name = "moveInHousePerson", required = true)
    @FieldName("擬入戶長個人資料")
    private XLDFPersonDataDomainObject moveInHousePerson;

    /** 原住地原全戶資料. */
    @XmlElement(name = "householdData", required = true)
    @FieldName("原住地原全戶資料")
    private XLDFHouseholdDataDomainObject householdData;

    /** 當事人新全戶資料. */
    @XmlElement(name = "moveInHousehold", required = true)
    @FieldName("當事人新全戶資料")
    private XLDFHouseholdDataDomainObject moveInHousehold;

    /** 原住地新戶資料. */
    @XmlElement(name = "originNewHousehold", required = true)
    @FieldName("原住地新戶資料")
    private XLDFHouseholdDataDomainObject originNewHousehold;

    /** 戶內成員清單. */
    @XmlElement(name = "memberList", required = true)
    @FieldName("戶內成員清單")
    private List<MemberDTO> memberList = new ArrayList<MemberDTO>();

    /** 戶內成員清單. */
    @XmlElement(name = "memberPersonDataList", required = true)
    @FieldName("戶內成員資料清單")
    private List<XLDFPersonDataDomainObject> memberPersonDataList = new ArrayList<XLDFPersonDataDomainObject>();

    /** 兼任戶長本人個人資料. */
    @XmlElement(name = "conCurrentRealPerson", required = true)
    @FieldName("兼任戶長本人個人資料")
    private XLDFPersonDataDomainObject conCurrentRealPerson;

    /** 申請人資料. */
    @XmlElement(name = "applyPersonList", required = true)
    @FieldName("申請人資料")
    private List<XLDFApplicantDataDTO> applyPersonList = new ArrayList<XLDFApplicantDataDTO>();

    /** 受委託人資料. */
    @XmlElement(name = "commPerson", required = true)
    @FieldName("受委託人資料")
    private XLDFPersonBriefDataDTO commPerson = new XLDFPersonBriefDataDTO();

    /** 當事人清除清單. */
    @XmlElement(name = "commPerson", required = true)
    @FieldName("受委託人資料")
    private List<ClearDTO> clearList = new ArrayList<ClearDTO>();

    /** 逕為申請人資料. */
    @XmlElement(name = "enforceApplyPerson", required = true)
    @FieldName("逕為申請人資料")
    private XldfefaplcType enforceApplyPerson;

    /** 是否逕為登記. */
    @XmlElement(name = "enforcedFlag", required = true)
    @FieldName("是否逕為登記")
    private boolean enforcedFlag;

    /** 個人記事清單資料. */
    @XmlElement(name = "personNoteList", required = true)
    @FieldName("個人記事清單資料")
    private List<XLDFPersonNoteDomainObject> personNoteList = new ArrayList<XLDFPersonNoteDomainObject>();

    /** 全戶記事清單 */
    @XmlElement(name = "householdNoteList", required = true)
    @FieldName("全戶記事清單")
    private List<XLDFHouseholdNoteDomainObject> householdNoteList = new ArrayList<XLDFHouseholdNoteDomainObject>();

    /** 大簿當事人個人資料. */
    @XmlElement(name = "masterPerson", required = true)
    @FieldName("大簿當事人個人資料")
    private XLDFPersonDataDomainObject masterPerson;

    /** 大簿當事人最後遷徙紀錄. */
    @XmlElement(name = "masterLastMove", required = true)
    @FieldName("大簿當事人最後遷徙紀錄")
    private XLDFDomainObject masterLastMove;

    /** 大簿當事人原遷入日期. */
    @XmlElement(name = "masterLast2RegisterDate", required = true)
    @FieldName("大簿當事人原遷入日期")
    private String masterLast2RegisterDate;

    /** 擬入地戶號配賦資料. */
    @XmlElement(name = "moveInXldf021m", required = true)
    @FieldName("擬入地戶號配賦資料")
    private XLDF021M moveInXldf021m;

    /** 系統日期. */
    @XmlElement(name = "operateDate", required = true)
    @FieldName("系統日期")
    private String operateDate;

    /** 系統時間. */
    @XmlElement(name = "operateTime", required = true)
    @FieldName("系統時間")
    private String operateTime;

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

    /** 是否原住地戶長撤銷. isHeadOut */
    @XmlElement(name = "isHeadOut", required = true)
    @FieldName("是否原住地戶長撤銷")
    private boolean isHeadOut;

    /** 是否有戶內成員. */
    @XmlElement(name = "hasMember", required = true)
    @FieldName("是否有戶內成員")
    private boolean hasMember;

    /** 戶內人口統號清單. */
    @XmlElement(name = "memberIds", required = true)
    @FieldName("戶內人口統號清單")
    private List<String> memberIds;

    /** 戶內非現住人口統號清單. 4/27 */
    @XmlElement(name = "otherPersonIds", required = true)
    @FieldName("戶內非現住人口統號清單")
    private List<String> otherPersonIds;

    /** 兼任戶長本人全戶資料 . */
    @XmlElement(name = "conCurrentRealHousehold", required = true)
    @FieldName("兼任戶長本人全戶資料")
    private XLDFHouseholdDataDomainObject conCurrentRealHousehold;

    /** 異地辦理旗標. */
    @XmlElement(name = "substituteFlag", required = true)
    @FieldName("異地辦理旗標")
    private boolean substituteFlag;

    /** 全戶遷出旗標. */
    @XmlElement(name = "allMoveFlag", required = true)
    @FieldName("全戶遷出旗標")
    private boolean allMoveFlag;

    /** 擬入地原戶別. */
    @XmlElement(name = "oldMoveInHouseholdType", required = true)
    @FieldName("擬入地原戶別")
    private String oldMoveInHouseholdType;

    /** 擬入地原兼任戶長註記. */
    @XmlElement(name = "oldMoveHouseholdCurrentMark", required = true)
    @FieldName("擬入地原兼任戶長註記")
    private String oldMoveHouseholdCurrentMark;

    /** 現住人口數 */
    @XmlElement(name = "personNum", required = true)
    @FieldName("現住人口數")
    private int personNum;

    /** 當事人資料種類. */
    @XmlElement(name = "personDataKind", required = true)
    @FieldName("當事人資料種類")
    private String personDataKind;

    /** 除戶年度. */
    @XmlElement(name = "removeYear", required = true)
    @FieldName("除戶年度")
    private String removeYear;

    /** 全國個人資料作業點. */
    @XmlElement(name = "rc1mSiteId", required = true)
    @FieldName("全國個人資料作業點")
    private String rc1mSiteId;

    /** 收據號碼. */
    @XmlElement(name = "fineReceiptId", required = true)
    @FieldName("收據號碼")
    private String fineReceiptId;

    /** 當事人有舊戶資料. */
    @XmlElement(name = "oldDataInMove", required = true)
    @FieldName("當事人有舊戶資料")
    private boolean oldDataInMove;

    /** ===================當事人新增視窗 ========================= */

    /** 當事人新增視窗 - 國民身分證統一編號 -. */
    @XmlElement(name = "addPersonId", required = true)
    @FieldName("國民身分證統一編號")
    private String addPersonId;

    /** ===================當事人資料-頁籤 ========================= */

    /** 當事人資料頁籤 - 撤銷後戶籍地 - */
    @XmlElement(name = "moveInSiteId", required = true)
    @FieldName("撤銷後戶籍地")
    private String moveInSiteId;

    /** 當事人資料頁籤 - 原登記遷出地 - */
    @XmlElement(name = "originalSiteId", required = true)
    @FieldName("原登記遷出地")
    private String originalSiteId;

    /*** ========================其他申請資料頁籤======================= */

    /** 其他申請資料頁籤-(撤銷後擬入)戶號. */
    @XmlElement(name = "moveInHouseId", required = true)
    @FieldName("撤銷後擬入戶號")
    private String moveInHouseId;

    /** 其他申請資料頁籤-(撤銷後擬入)戶長國民身分證統一編號. */
    @XmlElement(name = "moveInHouseheadId", required = true)
    @FieldName("撤銷後擬入戶長國民身分證統一編號")
    private String moveInHouseheadId;

    /** 其他申請資料頁籤-自立新戶 1:是 2:否 . */
    @XmlElement(name = "isNewHouse", required = true)
    @FieldName("自立新戶")
    private String isNewHouse;

    /** 其他申請資料頁籤-是否撤銷遷出國外- */
    @XmlElement(name = "isCancelOverseas", required = true)
    @FieldName("是否撤銷遷出國外")
    private String isCancelOverseas;

    /** 其他申請資料頁籤-兼任戶長國民身分證統一編號. */
    @XmlElement(name = "concurrentHeadId", required = true)
    @FieldName("兼任戶長國民身分證統一編號")
    private String concurrentHeadId;

    /** 其他申請資料頁籤-兼任戶長-作業點代碼. */
    @XmlElement(name = "concurrentSiteId", required = true)
    @FieldName("兼任戶長作業點代碼")
    private String concurrentSiteId;

    /** 其他申請資料頁籤-附繳證件. */
    @XmlElement(name = "certificate", required = true)
    @FieldName("附繳證件")
    private List<String> certificate;

    /** 顯示其他附繳證件輸入欄位與否 */
    @XmlElement(name = "otherCertificateStatus", required = true)
    @FieldName("顯示其他附繳證件輸入欄位與否")
    private String otherCertificateStatus;

    /** 其他申請資料頁籤-其他附繳證件. */
    @XmlElement(name = "otherCertificate", required = true)
    @FieldName("其他附繳證件")
    private String otherCertificate;

    /** 其他申請資料頁籤-撤銷原因. */
    @XmlElement(name = "cancelReason", required = true)
    @FieldName("撤銷原因")
    private String cancelReason;

    /** 其他申請資料頁籤-(申請書)備註. */
    @XmlElement(name = "applyRegister", required = true)
    @FieldName("申請書備註")
    private String applyRegister;

    /** 其他申請資料頁籤-是否虛報遷徙- */
    @XmlElement(name = "isMoveFake", required = true)
    @FieldName("是否虛報遷徙")
    private String isMoveFake;

    /** 其他申請資料頁籤-是否虛報遷徙- */
    @XmlElement(name = "moveFakeFlag", required = true)
    @FieldName("是否虛報遷徙")
    private boolean moveFakeFlag;

    /** 其他申請資料頁籤-是否於法定期間申報. */
    @XmlElement(name = "isnotLawPeriod", required = true)
    @FieldName("是否於法定期間申報")
    private String isnotLawPeriod;

    /** 其他申請資料頁籤-法定應申報日期. */
    @XmlElement(name = "lawDate", required = true)
    @FieldName("法定應申報日期")
    private String lawDate;

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

    /** 其他申請資料頁籤-須進行逾期申請之罰鍰處理(上次的選擇). */
    @XmlElement(name = "lastNeedCheckFine", required = true)
    @FieldName(" 其他申請資料頁籤-須進行逾期申請之罰鍰處理(上次的選擇)")
    private boolean lastNeedCheckFine;

    /** 事件發生確定日期(上次輸入的值) */
    @XmlElement(name = "oldFineEventDate", required = true)
    @FieldName("事件發生確定日期(上次輸入的值)")
    private String oldFineEventDate;

    /** 要刪除FINEDTOFLAG. */
    @XmlElement(name = "deleteFineDTOFlag", required = true)
    @FieldName("要刪除FINEDTOFLAG")
    private boolean deleteFineDTOFlag;

    /** 罰鍰DTO */
    @XmlElement(name = "fineDTO", required = true)
    @FieldName("罰鍰DTO")
    private FineDTO fineDTO;

    /*** ======================原登記遷出資料頁籤======================= */

    /** 原住地資料頁籤-戶號 */
    @XmlElement(name = "orginNewHouseId", required = true)
    @FieldName("原住地資料頁籤-戶號")
    private String orginNewHouseId;

    /** 原住地資料頁籤-戶別 */
    @XmlElement(name = "orginNewHouseType", required = true)
    @FieldName("原住地資料頁籤-戶別")
    private String orginNewHouseType;

    /** 原住地資料頁籤-兼任戶長註記 */
    @XmlElement(name = "OrginNewConcurrentHeadMark", required = true)
    @FieldName("原住地資料頁籤-兼任戶長註記")
    private String orginNewConcurrentHeadMark;

    /** 要顯示記事的國民身分證統一編號. */
    @XmlElement(name = "ShowRegisterPersonId", required = true)
    @FieldName("要顯示記事的國民身分證統一編號.")
    private String showRegisterPersonId;

    /** 上次選取的要顯示記事的國民身分證統一編號. */
    @XmlElement(name = "OldShowRegisterPersonId", required = true)
    @FieldName("上次選取的要顯示記事的國民身分證統一編號.")
    private String oldShowRegisterPersonId;

    /** 申請日期 */
    @XmlElement(name = "applyDate", required = true)
    @FieldName("申請日期")
    private String applyDate;

    /** 警告訊息 */
    @XmlElement(name = "warnningList", required = true)
    @FieldName("警告訊息")
    List<RlWarningMessage> warnningList = new ArrayList<RlWarningMessage>();

    /** ===============大簿Bean================ */
    /** 申請人1 */
    @XmlElement(name = "xLDFApplicantDataDTO1", required = true)
    @FieldName("申請人1")
    private XLDFApplicantDataDTO xLDFApplicantDataDTO1 = new XLDFApplicantDataDTO();

    /** 申請人2 */
    @XmlElement(name = "xLDFApplicantDataDTO2", required = true)
    @FieldName("申請人2")
    private XLDFApplicantDataDTO xLDFApplicantDataDTO2 = new XLDFApplicantDataDTO();

    /** 受委託人 */
    @XmlElement(name = "xLDFPersonBriefDataDTO", required = true)
    @FieldName("受委託人")
    private XLDFPersonBriefDataDTO xLDFPersonBriefDataDTO = new XLDFPersonBriefDataDTO();

    /** Test for XLDFSelectModeDomainDTO */

    @XmlElement(name = "IdentityNoteList", required = true)
    @FieldName("身分記事資料串列")
    private List<SelRegisterDTO> identityNoteList = new ArrayList<SelRegisterDTO>();

    @XmlElement(name = "MoveNoteList", required = true)
    @FieldName("遷徙記事資料串列")
    private List<SelRegisterDTO> moveNoteList = new ArrayList<SelRegisterDTO>();

    @XmlElement(name = "AbolishNoteList", required = true)
    @FieldName("廢止記事資料串列")
    private List<SelRegisterDTO> abolishNoteList = new ArrayList<SelRegisterDTO>();

    @XmlElement(name = "CorrectChangeNoteList", required = true)
    @FieldName("更正變更記事資料串列")
    private List<SelRegisterDTO> correctChangeNoteList = new ArrayList<SelRegisterDTO>();

    @XmlElement(name = "SupplementNoteList", required = true)
    @FieldName("補填記事資料串列")
    private List<SelRegisterDTO> supplementNoteList = new ArrayList<SelRegisterDTO>();

    @XmlElement(name = "RevokeNoteList", required = true)
    @FieldName("撤銷記事資料串列")
    private List<SelRegisterDTO> revokeNoteList = new ArrayList<SelRegisterDTO>();

    @XmlElement(name = "OtherNoteList", required = true)
    @FieldName("其他記事資料串列")
    private List<SelRegisterDTO> otherNoteList = new ArrayList<SelRegisterDTO>();

    /** 被挑選的戶長 */
    @XmlElement(name = "SelectedOriginDataDTO", required = true)
    @FieldName("被挑選的戶長")
    private Rl01804OriginDataDTO selectedOriginDataDTO;

    /** 上次Query的遷入戶長ID */
    @XmlElement(name = "LastQueryMoveinHouseHeadId", required = true)
    @FieldName("上次Query的遷入戶長ID")
    private String lastQueryMoveinHouseHeadId;

    /** 經罰鍰元件驗證後須進行罰鍰處理.Value=Y/N */
    @XmlElement(name = "NeedFineFlag", required = true)
    @FieldName("經罰鍰元件驗證後須進行罰鍰處理")
    private boolean needFineFlag;

    /** 可被撤銷至擬入戶人口數 */
    @XmlElement(name = "CanbeCacnceledPersonNum", required = true)
    @FieldName("可被撤銷至擬入戶人口數")
    private int canbeCacnceledPersonNum;

    /** 存放需要做Lock的舊地1Mkey值 */
    @XmlElement(name = "LockOldDataKeyList", required = true)
    @FieldName("存放需要做Lock的舊地1Mkey值")
    private List<String> lockOldDataKeyList = new ArrayList<String>();

    /** 暫存按鈕是否顯示 */
    @XmlElement(name = "SaveButtonShow", required = true)
    @FieldName("暫存按鈕是否顯示")
    private boolean saveButtonShow;

    /** 罰鍰處理是否顯示 */
    @XmlElement(name = "FineButtonShow", required = true)
    @FieldName("罰鍰處理是否顯示")
    private boolean fineButtonShow;

    /** 交易序號. */
    @XmlElement(name = "TxnId", required = true)
    @FieldName("交易序號")
    private String txnId;

    /** 交易順序 */
    @XmlElement(name = "ApplySequenceId", required = true)
    @FieldName("交易順序")
    private String applySequenceId;

    /** 受理地siteId */
    @XmlElement(name = "ApplySiteId", required = true)
    @FieldName("受理地siteId")
    private String applySiteId;

    /** applySeq */
    @XmlElement(name = "ApplySeq", required = true)
    @FieldName("applySeq")
    private String applySeq;

    /** 申請種類案件編號 */
    @XmlElement(name = "ApplyCaseNo", required = true)
    @FieldName("applyCaseNo")
    private String applyCaseNo;
    /** 作業代碼 */
    @XmlElement(name = "OperateionName", required = true)
    @FieldName("作業代碼")
    private String operateionName;

    /** finePersonId */
    @XmlElement(name = "FinePersonId", required = true)
    @FieldName("finePersonId")
    private String finePersonId;

    /** 受理地作業點代碼 */
    @XmlElement(name = "AcceptSiteId", required = true)
    @FieldName("受理地作業點代碼")
    private String acceptSiteId;

    /** 之前是否被逕遷至戶所. */
    @XmlElement(name = "BeenEnforcedMoveFlag", required = true)
    @FieldName("之前是否被逕遷至戶所")
    private boolean beenEnforcedMoveToAdminOfficeFlag = Boolean.FALSE;

    /** 之前是否被逕遷至非戶所. */
    @XmlElement(name = "BeenEnforcedMoveFlag", required = true)
    @FieldName("之前是否被逕遷至非戶所")
    private boolean beenEnforcedMoveToNonAdminOfficeFlag = Boolean.FALSE;

    /** 受理地戶政事務所代碼. */
    @XmlElement(name = "AcceptedAdminOfficeCode", required = true)
    @FieldName("受理地戶政事務所代碼")
    private String acceptedAdminOfficeCode;

    /** 擬撤銷之原登記申請書清單 */
    @XmlElement(name = "M10mList", required = true)
    @FieldName("擬撤銷之原登記申請書清單")
    private List<XLDFDomainObject> m10mList = new ArrayList<XLDFDomainObject>();

    /** 擬撤銷之原登記申請書清單 */
    @XmlElement(name = "ShowM10MList", required = true)
    @FieldName("擬撤銷之原登記申請書清單(顯示用)")
    private List<XLDFDomainObject> showM10MList = new ArrayList<XLDFDomainObject>();

    /** 選取的擬撤銷之原登記申請書 */
    @XmlElement(name = "SelectedM10m", required = true)
    @FieldName("選取的擬撤銷之原登記申請書")
    private XLDFDomainObject selectedM10m;

    /** 欲檢視的擬撤銷之原登記申請書 */
    @XmlElement(name = "ViewM10m", required = true)
    @FieldName("欲檢視的擬撤銷之原登記申請書")
    private XLDFDomainObject viewM10m;

    /** 檢視的擬撤銷原登記1S申請書 */
    @XmlElement(name = "ViewPostiveApplication", required = true)
    @FieldName("檢視的擬撤銷原登記1S申請書")
    private XLDFDomainObject viewPostiveApplication;

    /** 選取的擬撤銷原登記1S申請書 */
    @XmlElement(name = "SelectedPostiveApplication", required = true)
    @FieldName("選取的擬撤銷原登記1S申請書")
    private XLDFDomainObject selectedPostiveApplication;

    /** 檢核RCDF001M 是否有重複 檢核成功的PersonID */
    @XmlElement(name = "Rc1mPassPeople", required = true)
    @FieldName("檢核RCDF001M 是否有重複 檢核成功的PersonID")
    private List<String> rc1mPassPeople = new ArrayList<String>();

    /** 原住地原戶長地區代碼. */
    @XmlElement(name = "OutHeadAreaCode", required = true)
    @FieldName("原住地原戶長地區代碼")
    private String outHeadAreaCode;

    /** 原住地原戶長戶政所代碼. */
    @XmlElement(name = "OutHeadAdminOfficeCode", required = true)
    @FieldName("原住地原戶長戶政所代碼")
    private String outHeadAdminOfficeCode;

    @XmlElement(name = "ApplicationIndex", required = true)
    @FieldName("申請書索引檔")
    private XLDFDomainObject applicationIndex;
    /** 要被設定成註銷的申請書 */
    @XmlElement(name = "ToModifyApplications", required = true)
    @FieldName("要被設定成註銷的申請書")
    private List<XLDFDomainObject> toModifyApplications = new ArrayList<XLDFDomainObject>();

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

    /** 戶籍員帳號 */
    @XmlElement(name = "registerUserId", required = true)
    @FieldName("戶籍員帳號")
    private String registerUserId;

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

    /** 是否僅餘兼任戶長 */
    @XmlElement(name = "lastConcurnHead", required = true)
    @FieldName("是否僅餘兼任戶長")
    private boolean lastConcurnHead = Boolean.FALSE;

    /** 初始化是否成功 */
    @XmlElement(name = "InitSuccess", required = true)
    @FieldName("初始化是否成功")
    private boolean initSuccess = Boolean.TRUE;

    /** 頁籤索引 */
    @XmlElement(name = "ActiveIndex", required = true)
    @FieldName("頁籤索引")
    private String activeIndex;

    /** 遷徙人口個人記事欄位化MAP. */
    @XmlElement(name = "rldfyDataMap")
    @FieldName("遷徙人口個人記事欄位化MAP")
    private Map<String, List<Object>> rldfyDataMap = new HashMap<String, List<Object>>();

    /** 執行時間 */
    @XmlElement(name = "reserveNoteMap")
    @FieldName("保留的5MMAP")
    private Map<String, List<XLDFDomainObject>> reserveNoteMap = new HashMap<String, List<XLDFDomainObject>>();

    /** 之前登記的個人記事欄位化Access */
    @XmlElement(name = "xldfyDataaccessList")
    @FieldName("之前登記的個人記事欄位化Access")
    private List<XldfopracsType> xldfyDataaccessList = new ArrayList<XldfopracsType>(20);

    /**已經處理過教育程度註記的統號*/
    @XmlElement(name = "beenEducationModified")
    @FieldName("已經處理過教育程度註記的統號")
    private Set<String> beenEducationModified = new HashSet<String>(20);
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
    public List<Rl01804MoveinDTO> getPersonDataList() {

        return personDataList;
    }

    /**
     * @param personDataSet
     *            the personDataSet to set
     */
    public void setPersonDataList(List<Rl01804MoveinDTO> personDataList) {
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
    public List<Rl01804OriginDataDTO> getOriginDataList() {
        return originDataList;
    }

    /**
     * @param originDataList
     *            the originDataList to set
     */
    public void setOriginDataList(List<Rl01804OriginDataDTO> originDataList) {
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
     * @return the identityNoteList
     */
    public List<SelRegisterDTO> getIdentityNoteList() {
        if (identityNoteList == null) {

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
     * @return the supplementNoteList
     */
    public List<SelRegisterDTO> getSupplementNoteList() {
        return supplementNoteList;
    }

    /**
     * @param supplementNoteList
     *            the supplementNoteList to set
     */
    public void setSupplementNoteList(List<SelRegisterDTO> supplementNoteList) {
        this.supplementNoteList = supplementNoteList;
    }

    /**
     * @return the revokeNoteList
     */
    public List<SelRegisterDTO> getRevokeNoteList() {
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
    public Rl01804OriginDataDTO getSelectedOriginDataDTO() {
        return selectedOriginDataDTO;
    }

    /**
     * @param selectedOriginDataDTO
     *            the selectedOriginDataDTO to set
     */
    public void setSelectedOriginDataDTO(Rl01804OriginDataDTO selectedOriginDataDTO) {
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
     * @return the rc1mSiteId
     */
    public String getRc1mSiteId() {
        return rc1mSiteId;
    }

    /**
     * @param rc1mSiteId
     *            the rc1mSiteId to set
     */
    public void setRc1mSiteId(String rc1mSiteId) {
        this.rc1mSiteId = rc1mSiteId;
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
     * @return the masterLastMove
     */
    public XLDFDomainObject getMasterLastMove() {
        return masterLastMove;
    }

    /**
     * @param masterLastMove
     *            the masterLastMove to set
     */
    public void setMasterLastMove(XLDFDomainObject masterLastMove) {
        this.masterLastMove = masterLastMove;
    }

    /**
     * @return the masterLast2RegisterDate
     */
    public String getMasterLast2RegisterDate() {
        return masterLast2RegisterDate;
    }

    /**
     * @param masterLast2RegisterDate
     *            the masterLast2RegisterDate to set
     */
    public void setMasterLast2RegisterDate(String masterLast2RegisterDate) {
        this.masterLast2RegisterDate = masterLast2RegisterDate;
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
     * @return the isCancelOverseas
     */
    public String getIsCancelOverseas() {
        return isCancelOverseas;
    }

    /**
     * @param isCancelOverseas
     *            the isCancelOverseas to set
     */
    public void setIsCancelOverseas(String isCancelOverseas) {
        this.isCancelOverseas = isCancelOverseas;
    }

    /**
     * @return the cancelReason
     */
    public String getCancelReason() {
        return cancelReason;
    }

    /**
     * @param cancelReason
     *            the cancelReason to set
     */
    public void setCancelReason(String cancelReason) {
        this.cancelReason = cancelReason;
    }

    /**
     * @return the isMoveFake
     */
    public String getIsMoveFake() {
        return isMoveFake;
    }

    /**
     * @param isMoveFake
     *            the isMoveFake to set
     */
    public void setIsMoveFake(String isMoveFake) {
        this.isMoveFake = isMoveFake;
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
     * @return the canbeCacnceledPersonNum
     */
    public int getCanbeCacnceledPersonNum() {
        return canbeCacnceledPersonNum;
    }

    /**
     * @param canbeCacnceledPersonNum
     *            the canbeCacnceledPersonNum to set
     */
    public void setCanbeCacnceledPersonNum(int canbeCacnceledPersonNum) {
        this.canbeCacnceledPersonNum = canbeCacnceledPersonNum;
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
     * @return the moveFakeFlag
     */
    public boolean isMoveFakeFlag() {
        return moveFakeFlag;
    }

    /**
     * @param moveFakeFlag
     *            the moveFakeFlag to set
     */
    public void setMoveFakeFlag(boolean moveFakeFlag) {
        this.moveFakeFlag = moveFakeFlag;
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
     * @return the m10mList
     */
    public List<XLDFDomainObject> getM10mList() {
        return m10mList;
    }

    /**
     * @param m10mList
     *            the m10mList to set
     */
    public void setM10mList(List<XLDFDomainObject> m10mList) {
        this.m10mList = m10mList;
    }

    /**
     * @return the showM10MList
     */
    public List<XLDFDomainObject> getShowM10MList() {
        return showM10MList;
    }

    /**
     * @param showM10MList
     *            the showM10MList to set
     */
    public void setShowM10MList(List<XLDFDomainObject> showM10MList) {
        this.showM10MList = showM10MList;
    }

    /**
     * @return the selectedM10m
     */
    public XLDFDomainObject getSelectedM10m() {
        return selectedM10m;
    }

    /**
     * @param selectedM10m
     *            the selectedM10m to set
     */
    public void setSelectedM10m(XLDFDomainObject selectedM10m) {
        this.selectedM10m = selectedM10m;
    }

    /**
     * @return the viewM10m
     */
    public XLDFDomainObject getViewM10m() {
        return viewM10m;
    }

    /**
     * @param viewM10m
     *            the viewM10m to set
     */
    public void setViewM10m(XLDFDomainObject viewM10m) {
        this.viewM10m = viewM10m;
    }

    /**
     * @param viewM10m
     *            the viewM10m to set
     */
    public void setViewM10m(XLDFM10M viewM10m) {
        this.viewM10m = viewM10m;
    }

    /**
     * @return the viewPostiveApplication
     */
    public XLDFDomainObject getViewPostiveApplication() {
        return viewPostiveApplication;
    }

    /**
     * @param viewPostiveApplication
     *            the viewPostiveApplication to set
     */
    public void setViewPostiveApplication(XLDFDomainObject viewPostiveApplication) {
        this.viewPostiveApplication = viewPostiveApplication;
    }

    /**
     * @return the selectedPostiveApplication
     */
    public XLDFDomainObject getSelectedPostiveApplication() {
        return selectedPostiveApplication;
    }

    /**
     * @param selectedPostiveApplication
     *            the selectedPostiveApplication to set
     */
    public void setSelectedPostiveApplication(XLDFDomainObject selectedPostiveApplication) {
        this.selectedPostiveApplication = selectedPostiveApplication;
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
     * @return the applicationIndex
     */
    public XLDFDomainObject getApplicationIndex() {
        return applicationIndex;
    }

    /**
     * @param applicationIndex
     *            the applicationIndex to set
     */
    public void setApplicationIndex(XLDFDomainObject applicationIndex) {
        this.applicationIndex = applicationIndex;
    }

    /**
     * @return the toModifyApplications
     */
    public List<XLDFDomainObject> getToModifyApplications() {
        return toModifyApplications;
    }

    /**
     * @param toModifyApplications
     *            the toModifyApplications to set
     */
    public void setToModifyApplications(List<XLDFDomainObject> toModifyApplications) {
        this.toModifyApplications = toModifyApplications;
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

    public Map<String, List<Object>> getRldfyDataMap() {
        return rldfyDataMap;
    }

    public void setRldfyDataMap(Map<String, List<Object>> rldfyDataMap) {
        this.rldfyDataMap = rldfyDataMap;
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

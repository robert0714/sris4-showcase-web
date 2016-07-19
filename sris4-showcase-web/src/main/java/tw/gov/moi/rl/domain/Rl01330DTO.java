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
import tw.gov.moi.domain.Xldf020mType;
import tw.gov.moi.domain.XldfefaplcType;
import tw.gov.moi.domain.XldfopracsType;
import tw.gov.moi.rl.component.dto.OpeningOperationDTO;
import tw.gov.moi.rl.component.dto.XLDFDomainObject;
import tw.gov.moi.rl.component.xldf.dto.XLDF001M;
import tw.gov.moi.rl.component.xldf.dto.XLDF030M;
import tw.gov.moi.rl.component.xldf.dto.XLDF030T;
import tw.gov.moi.rl.domain.xldf.XLDFHouseholdDataDomainObject;
import tw.gov.moi.rl.domain.xldf.XLDFPersonDataDomainObject;

/**
 * 住址變更登記DTO.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Rl01330DTO", propOrder = { "acceptSiteId", "activeIndex", "addAPersonId", "addPersonIdList",
        "adminOfficeName", "allMoveOut", "applicant1", "applicant2", "applyDate", "applyType", "approveDate",
        "bigApplyKind", "bigHouseholdFlag", "certificateList", "certificateOther", "checkFine", "dataNo",
        "delegatedPerson", "delete030M", "deleteFineDTOFlag", "deleteNoteMap", "execTimeLog", "fineDate", "fineDTO",
        "fineList", "fineReason", "fineStatus", "householdNoteList", "householdRegistration", "inAdminOfficeCode",
        "inAlley", "inArea", "inAreaCode", "inCountyCode", "inDoorNo", "inFullAdress", "inHouseholdData",
        "inHouseholdHeadId", "inHouseholdHeadName", "inHouseholdId", "inHouseholdType", "initSuccess", "initTime",
        "inLane", "inNeighbor", "inSection", "inSiteId", "inStreetDoorPlate", "inTownCode", "inVillage",
        "iOperationSequenceId", "isDelFine", "isFine", "isHouse", "isHousehildChange",
        "isHouseholdRegistrationAddress", "isNewHousehold", "isProvideHousehold", "isRegisterFlag", "lastConcurnHead",
        "lastNeedCheckFine", "massMovePeopleDataList", "moveComDTO", "moveOutLivingPersonList", "moveOutMemberList",
        "moveOutPersonList", "moveOutRemainderPersonList", "newHouseholdHeadId", "newHouseholdHeadName",
        "newHouseholdId", "oldDataInMove", "oldFineEventDate", "onlyMasterPersonList", "openingOperationDTO",
        "operationCode", "operationSequenceId", "oriHeadNewMscMark", "oriNonResidentCnt", "oriResidentCnt", "outAlley",
        "outArea", "outConMark", "outCountyCode", "outDoorNo", "outFullAdress", "outHouseholdData",
        "outHouseholdHeadData", "outHouseholdHeadId", "outHouseholdHeadName", "outHouseholdId", "outHouseholdType",
        "outLane", "outNeighbor", "outSection", "outSiteId", "outStreetDoorplate", "outTownCode", "outVillage",
        "personNoteList", "probationList", "punishedDTO", "qryinputList", "receiptId", "registerData", "remark",
        "removePersonIdList", "reserveNoteMap", "rldfyDataMap", "selectNewHouseHoldPerson", "selectPerson",
        "showRegisterPersonId", "siteId", "substituteFlag", "systemDate", "systemTime", "tempStatus", "transactionId",
        "userId", "xldf030mList", "xldf030tList", "xldfPersonData", "xldfyDataaccessList", "warnningList" })
@XmlRootElement(name = "Rl01330DTO")
public class Rl01330DTO implements Serializable {

    /** SerialVersion UID. */
    private static final long serialVersionUID = -367742039728388569L;

    /** 受理地作業點代碼. */
    @XmlElement(name = "AcceptSiteId", required = true)
    @FieldName("受理地作業點代碼")
    private String acceptSiteId;

    /** 頁籤索引. */
    @XmlElement(name = "ActiveIndex", required = true)
    @FieldName("頁籤索引")
    private String activeIndex;

    /** 手動輸入之personId. */
    @XmlElement(name = "AddAPersonId", required = true)
    @FieldName("手動輸入之personId")
    private String addAPersonId;

    /** 新增所選擇的當事人統編清單. */
    @XmlElement(name = "AddPersonIdList", required = true)
    @FieldName("新增所選擇的當事人統編清單")
    private List<String> addPersonIdList = new ArrayList<String>();

    /** 戶政事務所名稱. */
    @XmlElement(name = "AdminOfficeName", required = true)
    @FieldName("戶政事務所名稱")
    private String adminOfficeName;

    /** 是否全戶遷出國外. */
    @XmlElement(name = "AllMoveOut", required = true)
    @FieldName("是否全戶遷出國外")
    private boolean allMoveOut = Boolean.FALSE;

    /** 申請人1. */
    @XmlElement(name = "Applicant1", required = true)
    @FieldName("個人記事")
    private XLDFApplicantDataDTO applicant1;

    /** 申請人2. */
    @XmlElement(name = "Applicant2", required = true)
    @FieldName("個人記事")
    private XLDFApplicantDataDTO applicant2;

    /** 申請日期. */
    @XmlElement(name = "ApplyDate", required = true)
    @FieldName("申請日期")
    private String applyDate;

    /** 申請種類. */
    @XmlElement(name = "ApplyType", required = true)
    @FieldName("申請種類")
    private String applyType;

    /** 核准日期. */
    @XmlElement(name = "ApproveDate")
    @FieldName("核准日期")
    private String approveDate;

    /** 申請種類(大戶). */
    @XmlElement(name = "BigApplyKind", required = true)
    @FieldName("申請種類(大戶)")
    private String bigApplyKind;

    /** 是否為大戶. */
    @XmlElement(name = "BigHouseholdFlag", required = true)
    @FieldName("是否為大戶")
    private boolean bigHouseholdFlag;

    /** 附繳證件. */
    @XmlElement(name = "CertificateList", required = true)
    @FieldName("附繳證件")
    private List<String> certificateList = new ArrayList<String>();

    /** 附繳證件-其他. */
    @XmlElement(name = "CertificateOther", required = true)
    @FieldName("附繳證件-其他")
    private String certificateOther;

    /** 進行逾期申報之罰鍰檢視. */
    @XmlElement(name = "CheckFine", required = true)
    @FieldName("進行逾期申報之罰鍰檢視")
    private boolean checkFine;

    /** 申請書流水號. */
    @XmlElement(name = "DataNo", required = true)
    @FieldName("申請書流水號")
    private String dataNo;

    /** 受委託人. */
    @XmlElement(name = "DelegatedPerson", required = true)
    @FieldName("個人記事")
    private XLDFPersonBriefDataDTO delegatedPerson;

    /** 要被刪除的所內記事. */
    @XmlElement(name = "delete030M")
    @FieldName("要被刪除的所內記事")
    private List<XLDF030M> delete030M = new ArrayList<XLDF030M>(10);

    /** 要刪除FINEDTOFLAG. */
    @XmlElement(name = "DeleteFineDTOFlag", required = true)
    @FieldName("要刪除FINEDTOFLAG")
    private boolean deleteFineDTOFlag;

    /** 執行時間. */
    @XmlElement(name = "reserveNoteMap")
    @FieldName("刪除的5MMAP")
    private Map<String, List<XLDFDomainObject>> deleteNoteMap = new HashMap<String, List<XLDFDomainObject>>();

    /** 執行時間. */
    @XmlElement(name = "execTimeLog")
    @FieldName("執行時間")
    private List<String> execTimeLog = new ArrayList<String>();

    /** 法定應申報日期. */
    @XmlElement(name = "FineDate", required = true)
    @FieldName("法定應申報日期")
    private String fineDate;

    /** 罰款DTO. */
    @XmlElement(name = "OpeningOperationDTO", required = true)
    @FieldName("罰款DTO")
    private FineDTO fineDTO = new FineDTO();

    /** 罰鍰清單. */
    @XmlElement(name = "FineList", required = true)
    @FieldName("罰鍰清單")
    private String fineList;

    /** 免罰原因. */
    @XmlElement(name = "FineReason", required = true)
    @FieldName("免罰原因")
    private String fineReason;

    /** 申請種類. */
    @XmlElement(name = "FineStatus", required = true)
    @FieldName("申請種類")
    private boolean fineStatus = false;

    /** 全戶記事清單List. */
    @XmlElement(name = "HouseholdNoteList", required = true)
    @FieldName("全戶記事清單List")
    private List<Rl01330HouseholdNoteDTO> householdNoteList = new ArrayList<Rl01330HouseholdNoteDTO>();

    /** 戶政事務所. */
    @XmlElement(name = "HouseholdRegistration", required = true)
    @FieldName("戶政事務所")
    private Xldf020mType householdRegistration;

    /** 遷入作業地點代碼. */
    @XmlElement(name = "InAdminOfficeCode", required = true)
    @FieldName("遷入戶戶所代碼")
    private String inAdminOfficeCode;

    /** 遷入戶地址-弄(衖、衕). */
    @XmlElement(name = "InAlley", required = true)
    @FieldName("遷入戶地址-弄(衖、衕)")
    private String inAlley;

    /** 遷入戶地址-地區. */
    @XmlElement(name = "InArea", required = true)
    @FieldName(" 遷入戶地址-地區")
    private String inArea;

    /** 遷入作業地點代碼. */
    @XmlElement(name = "InAreaCode", required = true)
    @FieldName("遷入戶行政區域代碼")
    private String inAreaCode;

    /** 遷入戶地址-縣市. */
    @XmlElement(name = "InCountyCode", required = true)
    @FieldName("遷入戶地址-縣市")
    private String inCountyCode;

    /** 遷入戶地址-門牌號. */
    @XmlElement(name = "InDoorNo", required = true)
    @FieldName("遷入戶地址-門牌號")
    private String inDoorNo;

    /** 遷入戶完整地址. */
    @XmlElement(name = "InFullAdress", required = true)
    @FieldName("遷入戶完整地址")
    private String inFullAdress;

    /** 遷入地全戶資料. */
    @XmlElement(name = "InHouseholdData", required = true)
    @FieldName("遷入地全戶資料")
    private XLDF001M inHouseholdData;

    /** 遷入戶戶長統編. */
    @XmlElement(name = "InHouseholdHeadId", required = true)
    @FieldName("遷入戶戶長統編")
    private String inHouseholdHeadId;

    /** 遷入戶戶長姓名. */
    @XmlElement(name = "InHouseholdHeadName", required = true)
    @FieldName("遷入戶戶長姓名")
    private String inHouseholdHeadName;

    /** 遷入戶號. */
    @XmlElement(name = "InHouseholdId", required = true)
    @FieldName("遷入戶號")
    private String inHouseholdId;

    /** 遷入戶別. */
    @XmlElement(name = "InHouseholdType", required = true)
    @FieldName("遷入戶別")
    private String inHouseholdType;

    /** 初始化是否成功. */
    @XmlElement(name = "InitSuccess", required = true)
    @FieldName("初始化是否成功")
    private boolean initSuccess = Boolean.TRUE;

    /** 初始化時間. */
    @XmlElement(name = "InitTime", required = true)
    @FieldName("初始化時間")
    private String initTime;

    /** 遷入戶地址-巷. */
    @XmlElement(name = "InLane", required = true)
    @FieldName("遷入戶地址-巷")
    private String inLane;

    /** 遷入戶地址-鄰. */
    @XmlElement(name = "InNeighbor", required = true)
    @FieldName("遷入戶地址-鄰")
    private String inNeighbor;

    /** 遷入戶地址-街(路段). */
    @XmlElement(name = "InSection", required = true)
    @FieldName("遷入戶地址-街(路段)")
    private String inSection;

    /** 遷入作業地點代碼. */
    @XmlElement(name = "InSiteId", required = true)
    @FieldName("遷入作業地點代碼")
    private String inSiteId;

    /** 遷入戶地址-門牌號. */
    @XmlElement(name = "InStreetDoorPlate", required = true)
    @FieldName("遷入戶地址-門牌號")
    private String inStreetDoorPlate;

    /** 遷入戶地址-鄉鎮市區. */
    @XmlElement(name = "InTownCode", required = true)
    @FieldName("遷入戶地址-鄉鎮市區")
    private String inTownCode;

    /** 遷入戶地址-村里. */
    @XmlElement(name = "InVillage", required = true)
    @FieldName("遷入戶地址-村里")
    private String inVillage;

    /** 作業順序. */
    @XmlElement(name = "IOperationSequenceId", required = true)
    @FieldName("作業順序")
    private Integer iOperationSequenceId;

    /** 是否清除罰款. */
    @XmlElement(name = "IsDelFine", required = true)
    @FieldName("是否清除罰款")
    private boolean isDelFine;

    /** 是否需進行罰鍰. */
    @XmlElement(name = "IsFine", required = true)
    @FieldName("是否需進行罰鍰")
    private boolean isFine;

    /** 是否遷出戶為戶政事務所. */
    @XmlElement(name = "IsHouse", required = true)
    @FieldName("是否遷出戶為戶政事務所")
    private boolean isHouse;

    /** 是否戶長住變. */
    @XmlElement(name = "IsHousehildChange", required = true)
    @FieldName("是否戶長住變")
    private String isHousehildChange;

    /** 遷入地址是否為戶政事務所. */
    @XmlElement(name = "IsHouseholdRegistrationAddress", required = true)
    @FieldName("遷入地址是否為戶政事務所")
    private boolean isHouseholdRegistrationAddress;

    /** 自立新戶. */
    @XmlElement(name = "IsNewHousehold", required = true)
    @FieldName("自立新戶")
    private String isNewHousehold;

    /** 住變戶戶長未提供戶口名簿. */
    @XmlElement(name = "IsProvideHousehold", required = true)
    @FieldName("住變戶戶長未提供戶口名簿")
    private String isProvideHousehold;

    /** 逕為登記旗標. */
    @XmlElement(name = "IsRegisterFlag", required = true)
    @FieldName("逕為登記旗標")
    private boolean isRegisterFlag;

    /** 是否僅餘兼任戶長. */
    @XmlElement(name = "LastConcurnHead", required = true)
    @FieldName("是否僅餘兼任戶長")
    private boolean lastConcurnHead = Boolean.FALSE;

    /** 其他申請資料頁籤-須進行逾期申請之罰鍰處理(上次的選擇). */
    @XmlElement(name = "LastNeedCheckFine", required = true)
    @FieldName(" 其他申請資料頁籤-須進行逾期申請之罰鍰處理(上次的選擇)")
    private boolean lastNeedCheckFine;

    /** 大戶遷徙-遷徙當事人個人資料-. */
    @XmlElement(name = "MassMovePeopleDataList", required = true)
    @FieldName("大戶遷徙-遷徙當事人個人資料-")
    private List<RlPersonalDataDTO> massMovePeopleDataList;

    /** 遷徙共用的欄位. */
    @XmlElement(name = "moveComDTO", required = true)
    @FieldName("遷徙共用的欄位")
    private MoveCommonDTO moveComDTO = new MoveCommonDTO();

    /** 原遷出地現住人口清單. */
    @XmlElement(name = "MoveOutLivingPersonList", required = true)
    @FieldName("原遷出地現住人口清單")
    private List<XLDFPersonDataDomainObject> moveOutLivingPersonList = new ArrayList<XLDFPersonDataDomainObject>();

    /** 遷出戶戶內成員清單. */
    @XmlElement(name = "MoveOutMemberList", required = true)
    @FieldName("遷出戶戶內成員清單")
    private List<XLDFPersonDataDomainObject> moveOutMemberList = new ArrayList<XLDFPersonDataDomainObject>();

    /** 住變當事人清單. */
    @XmlElement(name = "MoveOutPersonList", required = true)
    @FieldName("住變當事人清單")
    private List<Rl01330MoveOutDTO> moveOutPersonList = new ArrayList<Rl01330MoveOutDTO>();

    /** 原遷出地剩餘現住人口清單. */
    @XmlElement(name = "MoveOutRemainderPersonList", required = true)
    @FieldName("原遷出地剩餘現住人口清單")
    private List<Rl01330MoveOutRemainderDTO> moveOutRemainderPersonList = new ArrayList<Rl01330MoveOutRemainderDTO>();

    /** 遷出地新戶長姓名. */
    @XmlElement(name = "NewHouseholdHeadId", required = true)
    @FieldName("遷出地新戶長姓名")
    private String newHouseholdHeadId;

    /** 遷出地新戶長姓名. */
    @XmlElement(name = "NewHouseholdHeadName", required = true)
    @FieldName("遷出地新戶長姓名")
    private String newHouseholdHeadName;

    /** 新戶號. */
    @XmlElement(name = "NewHouseholdId", required = true)
    @FieldName("新戶號")
    private String newHouseholdId;

    /** 當事人有舊戶資料. */
    @XmlElement(name = "OldDataInMove", required = true)
    @FieldName("當事人有舊戶資料")
    private boolean oldDataInMove;

    /** 事件發生確定日期(上次輸入的值). */
    @XmlElement(name = "OldFineEventDate", required = true)
    @FieldName("事件發生確定日期(上次輸入的值)")
    private String oldFineEventDate;

    /** 住變當事人List(只有大簿當事人) 用於全戶自立一戶 當事人清單的顯示。. */
    @XmlElement(name = "OnlyMasterPersonList", required = true)
    @FieldName("住變當事人List(只有大簿當事人)")
    private List<Rl01330MoveOutDTO> onlyMasterPersonList = new ArrayList<Rl01330MoveOutDTO>();

    /** 申請種類. */
    @XmlElement(name = "OpeningOperationDTO", required = true)
    @FieldName("申請種類")
    private OpeningOperationDTO openingOperationDTO;

    /** 作業代碼. */
    @XmlElement(name = "OperationCode", required = true)
    @FieldName("作業代碼")
    private String operationCode;

    /** 作業順序. */
    @XmlElement(name = "OperationSequenceId", required = true)
    @FieldName("作業順序")
    private String operationSequenceId;

    /** 原住地戶長再遷入地之所內註記. */
    @XmlElement(name = "oriHeadNewMscMark")
    @FieldName("原住地戶長再遷入地之所內註記")
    private String oriHeadNewMscMark = "0";

    /** 原住地戶下非現住人口數. */
    @XmlElement(name = "OriNonResidentCnt", required = true)
    @FieldName("原住地戶下非現住人口數-")
    private Integer oriNonResidentCnt = 0;

    /** 原住地戶下現住人口數. */
    @XmlElement(name = "OriResidentCnt", required = true)
    @FieldName("原住地戶下現住人口數-")
    private Integer oriResidentCnt = 0;

    /** 遷出戶地址-弄(衖、衕). */
    @XmlElement(name = "OutAlley", required = true)
    @FieldName("遷出戶地址-弄(衖、衕)")
    private String outAlley;

    /** 遷出戶地址-地區. */
    @XmlElement(name = "OutArea", required = true)
    @FieldName("遷出戶地址-地區")
    private String outArea;

    /** 就有的兼任戶長註記. */
    @XmlElement(name = "OutConMark", required = true)
    @FieldName("就有的兼任戶長註記")
    private String outConMark;

    /** 遷入戶地址-縣市. */
    @XmlElement(name = "OutCountyCode", required = true)
    @FieldName("遷入戶地址-縣市")
    private String outCountyCode;

    /** 遷出戶地址-門牌號. */
    @XmlElement(name = "OutDoorNo", required = true)
    @FieldName("遷出戶地址-門牌號")
    private String outDoorNo;

    /** 遷入戶完整地址. */
    @XmlElement(name = "OutFullAdress", required = true)
    @FieldName("遷入戶完整地址")
    private String outFullAdress;

    /** 原遷出地全戶資料. */
    @XmlElement(name = "OutHouseholdData", required = true)
    @FieldName("原遷出地全戶資料")
    private XLDFHouseholdDataDomainObject outHouseholdData;

    /** 遷出地戶長. */
    @XmlElement(name = "OutHouseholdHeadData", required = true)
    @FieldName("遷出地戶長")
    private XLDFDomainObject outHouseholdHeadData;

    /** 遷出戶戶長統編. */
    @XmlElement(name = "OutHouseholdHeadId", required = true)
    @FieldName("遷出戶戶長統編")
    private String outHouseholdHeadId;

    /** 遷出戶戶長姓名. */
    @XmlElement(name = "OoutHouseholdHeadName", required = true)
    @FieldName("個人記事")
    private String outHouseholdHeadName;

    /** 遷出戶戶號. */
    @XmlElement(name = "OutHouseholdId", required = true)
    @FieldName("遷出戶戶號")
    private String outHouseholdId;

    /** 遷出戶戶別. */
    @XmlElement(name = "OutHouseholdType", required = true)
    @FieldName("遷出戶戶別")
    private String outHouseholdType;

    /** 遷出戶地址-巷. */
    @XmlElement(name = "OutLane", required = true)
    @FieldName("遷出戶地址-巷")
    private String outLane;

    /** 遷出戶地址-鄰. */
    @XmlElement(name = "OutNeighbor", required = true)
    @FieldName("遷出戶地址-鄰")
    private String outNeighbor;

    /** 遷出戶地址-街(路段). */
    @XmlElement(name = "OutSection", required = true)
    @FieldName("遷出戶地址-街(路段)")
    private String outSection;

    /** 遷出作業地點代碼. */
    @XmlElement(name = "OutSiteId", required = true)
    @FieldName("遷出作業地點代碼")
    private String outSiteId;

    /** 遷出戶地址-門牌號. */
    @XmlElement(name = "OutStreetDoorplate", required = true)
    @FieldName("遷出戶地址-門牌號")
    private String outStreetDoorplate;

    /** 遷出戶地址-鄉鎮市區. */
    @XmlElement(name = "OutTownCode", required = true)
    @FieldName("遷出戶地址-鄉鎮市區")
    private String outTownCode;

    /** 遷出戶地址-村里. */
    @XmlElement(name = "outVillage", required = true)
    @FieldName("遷出戶地址-村里")
    private String outVillage;

    /** 個人記事清單List. */
    @XmlElement(name = "PersonNoteList", required = true)
    @FieldName("個人記事清單List")
    private List<Rl01330PersonNoteDTO> personNoteList = new ArrayList<Rl01330PersonNoteDTO>();

    /** 保護管束. */
    @XmlElement(name = "ProbationList")
    @FieldName("保護管束")
    private List<String> probationList = new ArrayList<String>();

    /** 受罰人. */
    @XmlElement(name = "PunishedDTO", required = true)
    @FieldName("受罰人")
    private Rl01330PunishedDTO punishedDTO = new Rl01330PunishedDTO();

    /** 輸入大戶遷徙當事人. */
    @XmlElement(name = "QryinputList", required = true)
    @FieldName("輸入大戶遷徙當事人")
    private List<MoveQryInputDTO> qryinputList = new ArrayList<MoveQryInputDTO>(30);

    /** 收據號碼. */
    @XmlElement(name = "ReceiptId", required = true)
    @FieldName("收據號碼")
    private String receiptId;

    /** 逕為登記資料. */
    @XmlElement(name = "RegisterData", required = true)
    @FieldName("逕為登記資料")
    private XldfefaplcType registerData;

    /** 申請書備註. */
    @XmlElement(name = "Remark", required = true)
    @FieldName("申請書備註")
    private String remark;

    /** 清除所選擇的當事人統編List. */
    @XmlElement(name = "RemovePersonIdList", required = true)
    @FieldName("清除所選擇的當事人統編List")
    private List<String> removePersonIdList = new ArrayList<String>();

    /** 執行時間. */
    @XmlElement(name = "reserveNoteMap")
    @FieldName("保留的5MMAP")
    private Map<String, List<XLDFDomainObject>> reserveNoteMap = new HashMap<String, List<XLDFDomainObject>>();

    /** 遷徙人口個人記事欄位化MAP. */
    @XmlElement(name = "rldfyDataMap")
    @FieldName("遷徙人口個人記事欄位化MAP")
    private Map<String, List<Object>> rldfyDataMap = new HashMap<String, List<Object>>();

    /** 被選擇到的新戶長. */
    @XmlElement(name = "SelectNewHouseHoldPerson", required = true)
    @FieldName("被選擇到的新戶長")
    private Rl01330MoveOutRemainderDTO selectNewHouseHoldPerson = new Rl01330MoveOutRemainderDTO();

    /** 被選擇到的人. */
    @XmlElement(name = "SelectPerson", required = true)
    @FieldName("被選擇到的人")
    private Rl01330MoveOutDTO selectPerson = new Rl01330MoveOutDTO();

    /** 被選擇到個人記事的人. */
    @XmlElement(name = "ShowRegisterPersonId", required = true)
    @FieldName("被選擇到個人記事的人")
    private String showRegisterPersonId;

    /** 作業點代碼. */
    @XmlElement(name = "SiteId", required = true)
    @FieldName("作業點代碼")
    private String siteId;

    /** 異地辦理旗標. */
    @XmlElement(name = "Note", required = true)
    @FieldName("異地辦理旗標")
    private boolean substituteFlag;

    /** 系統日期. */
    @XmlElement(name = "SystemDate", required = true)
    @FieldName("系統日期")
    private String systemDate;

    /** 系統時間. */
    @XmlElement(name = "SystemTime", required = true)
    @FieldName("系統時間")
    private String systemTime;

    /** 「暫存」按鈕. */
    @XmlElement(name = "TempStatus", required = true)
    @FieldName("「暫存」按鈕")
    private boolean tempStatus = false;

    /** 交易序號. */
    @XmlElement(name = "TransactionId", required = true)
    @FieldName("交易序號")
    private String transactionId;

    /** 使用者帳號. */
    @XmlElement(name = "UserId", required = true)
    @FieldName("使用者帳號")
    private String userId;

    /** 所內註記記事清單. */
    @XmlElement(name = "xldf030mList", required = true)
    @FieldName("所內註記記事清單")
    private List<XLDF030M> xldf030mList;

    /** 所內註記記事清單. */
    @XmlElement(name = "xldf030tList", required = true)
    @FieldName("所內註記記事清單")
    private List<XLDF030T> xldf030tList;

    /** 當事人. */
    @XmlElement(name = "XldfPersonData", required = true)
    @FieldName("當事人")
    private XLDFPersonDataDomainObject xldfPersonData;

    /** 之前登記的個人記事欄位化Access. */
    @XmlElement(name = "xldfyDataaccessList")
    @FieldName("之前登記的個人記事欄位化Access")
    private List<XldfopracsType> xldfyDataaccessList = new ArrayList<XldfopracsType>(20);

    /** 警告訊息. */
    @XmlElement(name = "WarnningList", required = true)
    @FieldName("警告訊息")
    List<RlWarningMessage> warnningList = new ArrayList<RlWarningMessage>();

    public String getAcceptSiteId() {
        return acceptSiteId;
    }

    /**
     * @return the activeIndex
     */
    public String getActiveIndex() {
        return activeIndex;
    }

    public String getAddAPersonId() {
        return addAPersonId;
    }

    public List<String> getAddPersonIdList() {
        return addPersonIdList;
    }

    public String getAdminOfficeName() {
        return adminOfficeName;
    }

    public XLDFApplicantDataDTO getApplicant1() {
        return applicant1;
    }

    public XLDFApplicantDataDTO getApplicant2() {
        return applicant2;
    }

    public String getApplyDate() {
        return applyDate;
    }

    public String getApplyType() {
        return applyType;
    }

    public String getApproveDate() {
        return approveDate;
    }

    /**
     * @return the bigApplyKind
     */
    public String getBigApplyKind() {
        return bigApplyKind;
    }

    public List<String> getCertificateList() {
        return certificateList;
    }

    public String getCertificateOther() {
        return certificateOther;
    }

    public String getDataNo() {
        return dataNo == null ? "0" : this.dataNo;
    }

    public XLDFPersonBriefDataDTO getDelegatedPerson() {
        return delegatedPerson;
    }

    public List<XLDF030M> getDelete030M() {
        return delete030M;
    }

    public Map<String, List<XLDFDomainObject>> getDeleteNoteMap() {
        return deleteNoteMap;
    }

    public List<String> getExecTimeLog() {
        return execTimeLog;
    }

    public String getFineDate() {
        return fineDate;
    }

    public FineDTO getFineDTO() {
        return fineDTO;
    }

    public String getFineList() {
        return fineList;
    }

    public String getFineReason() {
        return fineReason;
    }

    public List<Rl01330HouseholdNoteDTO> getHouseholdNoteList() {
        return householdNoteList;
    }

    public Xldf020mType getHouseholdRegistration() {
        return householdRegistration;
    }

    public String getInAdminOfficeCode() {
        return inAdminOfficeCode;
    }

    public String getInAlley() {
        return inAlley;
    }

    public String getInArea() {
        return inArea;
    }

    public String getInAreaCode() {
        return inAreaCode;
    }

    public String getInCountyCode() {
        return inCountyCode;
    }

    public String getInDoorNo() {
        return inDoorNo;
    }

    public String getInFullAdress() {
        return inFullAdress;
    }

    public XLDF001M getInHouseholdData() {
        return inHouseholdData;
    }

    public String getInHouseholdHeadId() {
        return inHouseholdHeadId;
    }

    public String getInHouseholdHeadName() {
        return inHouseholdHeadName;
    }

    public String getInHouseholdId() {
        return inHouseholdId;
    }

    public String getInHouseholdType() {
        return inHouseholdType;
    }

    public String getInitTime() {
        return initTime;
    }

    public String getInLane() {
        return inLane;
    }

    public String getInNeighbor() {
        return inNeighbor;
    }

    public String getInSection() {
        return inSection;
    }

    public String getInSiteId() {
        return inSiteId;
    }

    public String getInStreetDoorPlate() {
        return inStreetDoorPlate;
    }

    public String getInTownCode() {
        return inTownCode;
    }

    public String getInVillage() {
        return inVillage;
    }

    public Integer getiOperationSequenceId() {
        return Integer.parseInt(this.getOperationSequenceId());
    }

    public String getIsHousehildChange() {
        return isHousehildChange;
    }

    public String getIsNewHousehold() {
        return isNewHousehold;
    }

    public String getIsProvideHousehold() {
        return isProvideHousehold;
    }

    /**
     * @return the massMovePeopleDataList
     */
    public List<RlPersonalDataDTO> getMassMovePeopleDataList() {
        return massMovePeopleDataList;
    }

    /**
     * @return the moveComDTO
     */
    public MoveCommonDTO getMoveComDTO() {
        return moveComDTO;
    }

    public List<XLDFPersonDataDomainObject> getMoveOutLivingPersonList() {
        return moveOutLivingPersonList;
    }

    public List<XLDFPersonDataDomainObject> getMoveOutMemberList() {
        return moveOutMemberList;
    }

    public List<Rl01330MoveOutDTO> getMoveOutPersonList() {
        return moveOutPersonList;
    }

    public List<Rl01330MoveOutRemainderDTO> getMoveOutRemainderPersonList() {
        return moveOutRemainderPersonList;
    }

    public String getNewHouseholdHeadId() {
        return newHouseholdHeadId;
    }

    public String getNewHouseholdHeadName() {
        return newHouseholdHeadName;
    }

    public String getNewHouseholdId() {
        return newHouseholdId;
    }

    public String getOldFineEventDate() {
        return oldFineEventDate;
    }

    /**
     * @return the onlyMasterPersonList
     */
    public List<Rl01330MoveOutDTO> getOnlyMasterPersonList() {
        return onlyMasterPersonList;
    }

    public OpeningOperationDTO getOpeningOperationDTO() {
        return openingOperationDTO;
    }

    public String getOperationCode() {
        return operationCode;
    }

    public String getOperationSequenceId() {
        return operationSequenceId;
    }

    public String getOriHeadNewMscMark() {
        return oriHeadNewMscMark;
    }

    /**
     * @return the oriNonResidentCnt
     */
    public Integer getOriNonResidentCnt() {
        return oriNonResidentCnt;
    }

    /**
     * @return the oriResidentCnt
     */
    public Integer getOriResidentCnt() {
        return oriResidentCnt;
    }

    public String getOutAlley() {
        return outAlley;
    }

    public String getOutArea() {
        return outArea;
    }

    public String getOutConMark() {
        return outConMark;
    }

    public String getOutCountyCode() {
        return outCountyCode;
    }

    public String getOutDoorNo() {
        return outDoorNo;
    }

    public String getOutFullAdress() {
        return outFullAdress;
    }

    public XLDFHouseholdDataDomainObject getOutHouseholdData() {
        return outHouseholdData;
    }

    /**
     * @return the outHouseholdHeadData
     */
    public XLDFDomainObject getOutHouseholdHeadData() {
        return outHouseholdHeadData;
    }

    public String getOutHouseholdHeadId() {
        return outHouseholdHeadId;
    }

    public String getOutHouseholdHeadName() {
        return outHouseholdHeadName;
    }

    public String getOutHouseholdId() {
        return outHouseholdId;
    }

    public String getOutHouseholdType() {
        return outHouseholdType;
    }

    public String getOutLane() {
        return outLane;
    }

    public String getOutNeighbor() {
        return outNeighbor;
    }

    public String getOutSection() {
        return outSection;
    }

    public String getOutSiteId() {
        return outSiteId;
    }

    public String getOutStreetDoorplate() {
        return outStreetDoorplate;
    }

    public String getOutTownCode() {
        return outTownCode;
    }

    public String getOutVillage() {
        return outVillage;
    }

    public List<Rl01330PersonNoteDTO> getPersonNoteList() {
        return personNoteList;
    }

    public List<String> getProbationList() {
        return probationList;
    }

    public Rl01330PunishedDTO getPunishedDTO() {
        return punishedDTO;
    }

    /**
     * @return the qryinputList
     */
    public List<MoveQryInputDTO> getQryinputList() {
        return qryinputList;
    }

    public String getReceiptId() {
        return receiptId;
    }

    public XldfefaplcType getRegisterData() {
        return registerData;
    }

    public String getRemark() {
        return remark;
    }

    public List<String> getRemovePersonIdList() {
        return removePersonIdList;
    }

    public Map<String, List<XLDFDomainObject>> getReserveNoteMap() {
        return reserveNoteMap;
    }

    public Map<String, List<Object>> getRldfyDataMap() {
        return rldfyDataMap;
    }

    public Rl01330MoveOutRemainderDTO getSelectNewHouseHoldPerson() {
        return selectNewHouseHoldPerson;
    }

    public Rl01330MoveOutDTO getSelectPerson() {
        return selectPerson;
    }

    public String getShowRegisterPersonId() {
        return showRegisterPersonId;
    }

    public String getSiteId() {
        return siteId;
    }

    public String getSystemDate() {
        return this.systemDate;
    }

    public String getSystemTime() {
        return this.systemTime;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public String getUserId() {
        return userId;
    }

    /**
     * @return the warnningList
     */
    public List<RlWarningMessage> getWarnningList() {
        return warnningList;
    }

    public List<XLDF030M> getXldf030mList() {
        return xldf030mList;
    }

    public List<XLDF030T> getXldf030tList() {
        return xldf030tList;
    }

    public XLDFPersonDataDomainObject getXldfPersonData() {
        return xldfPersonData;
    }

    public List<XldfopracsType> getXldfyDataaccessList() {
        return xldfyDataaccessList;
    }

    /**
     * @return the allMoveOut
     */
    public boolean isAllMoveOut() {
        return allMoveOut;
    }

    /**
     * @return the bigHouseholdFlag
     */
    public boolean isBigHouseholdFlag() {
        return bigHouseholdFlag;
    }

    public boolean isCheckFine() {
        return checkFine;
    }

    public boolean isDeleteFineDTOFlag() {
        return deleteFineDTOFlag;
    }

    public boolean isDelFine() {
        return isDelFine;
    }

    public boolean isFine() {
        return isFine;
    }

    public boolean isFineStatus() {
        return fineStatus;
    }

    public boolean isHouse() {
        return isHouse;
    }

    public boolean isHouseholdRegistrationAddress() {
        return isHouseholdRegistrationAddress;
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

    public boolean isLastNeedCheckFine() {
        return lastNeedCheckFine;
    }

    /**
     * @return the oldDataInMove
     */
    public boolean isOldDataInMove() {
        return oldDataInMove;
    }

    public boolean isRegisterFlag() {
        return isRegisterFlag;
    }

    public boolean isSubstituteFlag() {
        return substituteFlag;
    }

    public boolean isTempStatus() {
        return tempStatus;
    }

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

    public void setAddAPersonId(String addAPersonId) {
        this.addAPersonId = addAPersonId;
    }

    public void setAddPersonIdList(List<String> addPersonIdList) {
        this.addPersonIdList = addPersonIdList;
    }

    public void setAdminOfficeName(String adminOfficeName) {
        this.adminOfficeName = adminOfficeName;
    }

    /**
     * @param allMoveOut
     *            the allMoveOut to set
     */
    public void setAllMoveOut(boolean allMoveOut) {
        this.allMoveOut = allMoveOut;
    }

    public void setApplicant1(XLDFApplicantDataDTO applicant1) {
        this.applicant1 = applicant1;
    }

    public void setApplicant2(XLDFApplicantDataDTO applicant2) {
        this.applicant2 = applicant2;
    }

    public void setApplyDate(String applyDate) {
        this.applyDate = applyDate;
    }

    public void setApplyType(String applyType) {
        this.applyType = applyType;
    }

    public void setApproveDate(String approveDate) {
        this.approveDate = approveDate;
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

    public void setCertificateList(List<String> certificateList) {
        this.certificateList = certificateList;
    }

    public void setCertificateOther(String certificateOther) {
        this.certificateOther = certificateOther;
    }

    public void setCheckFine(boolean checkFine) {
        this.checkFine = checkFine;
    }

    public void setDataNo(String dataNo) {
        this.dataNo = dataNo;
    }

    public void setDelegatedPerson(XLDFPersonBriefDataDTO delegatedPerson) {
        this.delegatedPerson = delegatedPerson;
    }

    public void setDelete030M(List<XLDF030M> delete030m) {
        delete030M = delete030m;
    }

    public void setDeleteFineDTOFlag(boolean deleteFineDTOFlag) {
        this.deleteFineDTOFlag = deleteFineDTOFlag;
    }

    public void setDeleteNoteMap(Map<String, List<XLDFDomainObject>> deleteNoteMap) {
        this.deleteNoteMap = deleteNoteMap;
    }

    public void setDelFine(boolean isDelFine) {
        this.isDelFine = isDelFine;
    }

    public void setExecTimeLog(List<String> execTimeLog) {
        this.execTimeLog = execTimeLog;
    }

    public void setFine(boolean isFine) {
        this.isFine = isFine;
    }

    public void setFineDate(String fineDate) {
        this.fineDate = fineDate;
    }

    public void setFineDTO(FineDTO fineDTO) {
        this.fineDTO = fineDTO;
    }

    public void setFineList(String fineList) {
        this.fineList = fineList;
    }

    public void setFineReason(String fineReason) {
        this.fineReason = fineReason;
    }

    public void setFineStatus(boolean fineStatus) {
        this.fineStatus = fineStatus;
    }

    public void setHouse(boolean isHouse) {
        this.isHouse = isHouse;
    }

    public void setHouseholdNoteList(List<Rl01330HouseholdNoteDTO> householdNoteList) {
        this.householdNoteList = householdNoteList;
    }

    public void setHouseholdRegistration(Xldf020mType householdRegistration) {
        this.householdRegistration = householdRegistration;
    }

    public void setHouseholdRegistrationAddress(boolean isHouseholdRegistrationAddress) {
        this.isHouseholdRegistrationAddress = isHouseholdRegistrationAddress;
    }

    public void setInAdminOfficeCode(String inAdminOfficeCode) {
        this.inAdminOfficeCode = inAdminOfficeCode;
    }

    public void setInAlley(String inAlley) {
        this.inAlley = inAlley;
    }

    public void setInArea(String inArea) {
        this.inArea = inArea;
    }

    public void setInAreaCode(String inAreaCode) {
        this.inAreaCode = inAreaCode;
    }

    public void setInCountyCode(String inCountyCode) {
        this.inCountyCode = inCountyCode;
    }

    public void setInDoorNo(String inDoorNo) {
        this.inDoorNo = inDoorNo;
    }

    public void setInFullAdress(String inFullAdress) {
        this.inFullAdress = inFullAdress;
    }

    public void setInHouseholdData(XLDF001M inHouseholdData) {
        this.inHouseholdData = inHouseholdData;
    }

    public void setInHouseholdHeadId(String inHouseholdHeadId) {
        this.inHouseholdHeadId = inHouseholdHeadId;
    }

    public void setInHouseholdHeadName(String inHouseholdHeadName) {
        this.inHouseholdHeadName = inHouseholdHeadName;
    }

    public void setInHouseholdId(String inHouseholdId) {
        this.inHouseholdId = inHouseholdId;
    }

    public void setInHouseholdType(String inHouseholdType) {
        this.inHouseholdType = inHouseholdType;
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

    public void setInLane(String inLane) {
        this.inLane = inLane;
    }

    public void setInNeighbor(String inNeighbor) {
        this.inNeighbor = inNeighbor;
    }

    public void setInSection(String inSection) {
        this.inSection = inSection;
    }

    public void setInSiteId(String inSiteId) {
        this.inSiteId = inSiteId;
    }

    public void setInStreetDoorPlate(String inStreetDoorPlate) {
        this.inStreetDoorPlate = inStreetDoorPlate;
    }

    public void setInTownCode(String inTownCode) {
        this.inTownCode = inTownCode;
    }

    public void setInVillage(String inVillage) {
        this.inVillage = inVillage;
    }

    public void setiOperationSequenceId(Integer iOperationSequenceId) {
        this.iOperationSequenceId = iOperationSequenceId;
    }

    public void setIsHousehildChange(String isHousehildChange) {
        this.isHousehildChange = isHousehildChange;
    }

    public void setIsNewHousehold(String isNewHousehold) {
        this.isNewHousehold = isNewHousehold;
    }

    public void setIsProvideHousehold(String isProvideHousehold) {
        this.isProvideHousehold = isProvideHousehold;
    }

    /**
     * @param lastConcurnHead
     *            the lastConcurnHead to set
     */
    public void setLastConcurnHead(boolean lastConcurnHead) {
        this.lastConcurnHead = lastConcurnHead;
    }

    public void setLastNeedCheckFine(boolean lastNeedCheckFine) {
        this.lastNeedCheckFine = lastNeedCheckFine;
    }

    /**
     * @param massMovePeopleDataList
     *            the massMovePeopleDataList to set
     */
    public void setMassMovePeopleDataList(List<RlPersonalDataDTO> massMovePeopleDataList) {
        this.massMovePeopleDataList = massMovePeopleDataList;
    }

    /**
     * @param moveComDTO
     *            the moveComDTO to set
     */
    public void setMoveComDTO(MoveCommonDTO moveComDTO) {
        this.moveComDTO = moveComDTO;
    }

    public void setMoveOutLivingPersonList(List<XLDFPersonDataDomainObject> moveOutLivingPersonList) {
        this.moveOutLivingPersonList = moveOutLivingPersonList;
    }

    public void setMoveOutMemberList(List<XLDFPersonDataDomainObject> moveOutMemberList) {
        this.moveOutMemberList = moveOutMemberList;
    }

    public void setMoveOutPersonList(List<Rl01330MoveOutDTO> moveOutPersonList) {
        this.moveOutPersonList = moveOutPersonList;
    }

    public void setMoveOutRemainderPersonList(List<Rl01330MoveOutRemainderDTO> moveOutRemainderPersonList) {
        this.moveOutRemainderPersonList = moveOutRemainderPersonList;
    }

    public void setNewHouseholdHeadId(String newHouseholdHeadId) {
        this.newHouseholdHeadId = newHouseholdHeadId;
    }

    public void setNewHouseholdHeadName(String newHouseholdHeadName) {
        this.newHouseholdHeadName = newHouseholdHeadName;
    }

    public void setNewHouseholdId(String newHouseholdId) {
        this.newHouseholdId = newHouseholdId;
    }

    /**
     * @param oldDataInMove
     *            the oldDataInMove to set
     */
    public void setOldDataInMove(boolean oldDataInMove) {
        this.oldDataInMove = oldDataInMove;
    }

    public void setOldFineEventDate(String oldFineEventDate) {
        this.oldFineEventDate = oldFineEventDate;
    }

    /**
     * @param onlyMasterPersonList
     *            the onlyMasterPersonList to set
     */
    public void setOnlyMasterPersonList(List<Rl01330MoveOutDTO> onlyMasterPersonList) {
        this.onlyMasterPersonList = onlyMasterPersonList;
    }

    public void setOpeningOperationDTO(OpeningOperationDTO openingOperationDTO) {
        this.openingOperationDTO = openingOperationDTO;
    }

    public void setOperationCode(String operationCode) {
        this.operationCode = operationCode;
    }

    public void setOperationSequenceId(String operationSequenceId) {
        this.operationSequenceId = operationSequenceId;
    }

    public void setOriHeadNewMscMark(String oriHeadNewMscMark) {
        this.oriHeadNewMscMark = oriHeadNewMscMark;
    }

    /**
     * @param oriNonResidentCnt
     *            the oriNonResidentCnt to set
     */
    public void setOriNonResidentCnt(Integer oriNonResidentCnt) {
        this.oriNonResidentCnt = oriNonResidentCnt;
    }

    /**
     * @param oriResidentCnt
     *            the oriResidentCnt to set
     */
    public void setOriResidentCnt(Integer oriResidentCnt) {
        this.oriResidentCnt = oriResidentCnt;
    }

    public void setOutAlley(String outAlley) {
        this.outAlley = outAlley;
    }

    public void setOutArea(String outArea) {
        this.outArea = outArea;
    }

    public void setOutConMark(String outConMark) {
        this.outConMark = outConMark;
    }

    public void setOutCountyCode(String outCountyCode) {
        this.outCountyCode = outCountyCode;
    }

    public void setOutDoorNo(String outDoorNo) {
        this.outDoorNo = outDoorNo;
    }

    public void setOutFullAdress(String outFullAdress) {
        this.outFullAdress = outFullAdress;
    }

    public void setOutHouseholdData(XLDFHouseholdDataDomainObject outHouseholdData) {
        this.outHouseholdData = outHouseholdData;
    }

    /**
     * @param outHouseholdHeadData
     *            the outHouseholdHeadData to set
     */
    public void setOutHouseholdHeadData(XLDFDomainObject outHouseholdHeadData) {
        this.outHouseholdHeadData = outHouseholdHeadData;
    }

    public void setOutHouseholdHeadId(String outHouseholdHeadId) {
        this.outHouseholdHeadId = outHouseholdHeadId;
    }

    public void setOutHouseholdHeadName(String outHouseholdHeadName) {
        this.outHouseholdHeadName = outHouseholdHeadName;
    }

    public void setOutHouseholdId(String outHouseholdId) {
        this.outHouseholdId = outHouseholdId;
    }

    public void setOutHouseholdType(String outHouseholdType) {
        this.outHouseholdType = outHouseholdType;
    }

    public void setOutLane(String outLane) {
        this.outLane = outLane;
    }

    public void setOutNeighbor(String outNeighbor) {
        this.outNeighbor = outNeighbor;
    }

    public void setOutSection(String outSection) {
        this.outSection = outSection;
    }

    public void setOutSiteId(String outSiteId) {
        this.outSiteId = outSiteId;
    }

    public void setOutStreetDoorplate(String outStreetDoorplate) {
        this.outStreetDoorplate = outStreetDoorplate;
    }

    public void setOutTownCode(String outTownCode) {
        this.outTownCode = outTownCode;
    }

    public void setOutVillage(String outVillage) {
        this.outVillage = outVillage;
    }

    public void setPersonNoteList(List<Rl01330PersonNoteDTO> personNoteList) {
        this.personNoteList = personNoteList;
    }

    public void setProbationList(List<String> probationList) {
        this.probationList = probationList;
    }

    public void setPunishedDTO(Rl01330PunishedDTO punishedDTO) {
        this.punishedDTO = punishedDTO;
    }

    public void setQryinputList(List<MoveQryInputDTO> qryinputList) {
        this.qryinputList = qryinputList;
    }

    public void setReceiptId(String receiptId) {
        this.receiptId = receiptId;
    }

    public void setRegisterData(XldfefaplcType registerData) {
        this.registerData = registerData;
    }

    public void setRegisterFlag(boolean isRegisterFlag) {
        this.isRegisterFlag = isRegisterFlag;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public void setRemovePersonIdList(List<String> removePersonIdList) {
        this.removePersonIdList = removePersonIdList;
    }

    public void setReserveNoteMap(Map<String, List<XLDFDomainObject>> reserveNoteMap) {
        this.reserveNoteMap = reserveNoteMap;
    }

    public void setRldfyDataMap(Map<String, List<Object>> rldfyDataMap) {
        this.rldfyDataMap = rldfyDataMap;
    }

    public void setSelectNewHouseHoldPerson(Rl01330MoveOutRemainderDTO selectNewHouseHoldPerson) {
        this.selectNewHouseHoldPerson = selectNewHouseHoldPerson;
    }

    public void setSelectPerson(Rl01330MoveOutDTO selectPerson) {
        this.selectPerson = selectPerson;
    }

    public void setShowRegisterPersonId(String showRegisterPersonId) {
        this.showRegisterPersonId = showRegisterPersonId;
    }

    public void setSiteId(String siteId) {
        this.siteId = siteId;
    }

    public void setSubstituteFlag(boolean substituteFlag) {
        this.substituteFlag = substituteFlag;
    }

    public void setSystemDate(String systemDate) {
        this.systemDate = systemDate;
    }

    public void setSystemTime(String systemTime) {
        this.systemTime = systemTime;
    }

    public void setTempStatus(boolean tempStatus) {
        this.tempStatus = tempStatus;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setWarnningList(List<RlWarningMessage> warnningList) {
        this.warnningList = warnningList;
    }

    public void setXldf030mList(List<XLDF030M> xldf030mList) {
        this.xldf030mList = xldf030mList;
    }

    public void setXldf030tList(List<XLDF030T> xldf030tList) {
        this.xldf030tList = xldf030tList;
    }

    public void setXldfPersonData(XLDFPersonDataDomainObject xldfPersonData) {
        this.xldfPersonData = xldfPersonData;
    }

    public void setXldfyDataaccessList(List<XldfopracsType> xldfyDataaccessList) {
        this.xldfyDataaccessList = xldfyDataaccessList;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "Rl01330DTO [showRegisterPersonId=" + showRegisterPersonId + ", addAPersonId=" + addAPersonId
                + ", applyType=" + applyType + ", moveOutPersonList=" + moveOutPersonList
                + ", moveOutLivingPersonList=" + moveOutLivingPersonList + ", moveOutRemainderPersonList="
                + moveOutRemainderPersonList + ", moveOutMemberList=" + moveOutMemberList + ", transactionId="
                + transactionId + ", operationCode=" + operationCode + ", operationSequenceId=" + operationSequenceId
                + ", iOperationSequenceId=" + iOperationSequenceId + ", xldfPersonData=" + xldfPersonData
                + ", applicant1=" + applicant1 + ", applicant2=" + applicant2 + ", delegatedPerson=" + delegatedPerson
                + ", systemDate=" + systemDate + ", systemTime=" + systemTime + ", siteId=" + siteId
                + ", outHouseholdData=" + outHouseholdData + ", inHouseholdData=" + inHouseholdData + ", receiptId="
                + receiptId + ", substituteFlag=" + substituteFlag + ", isRegisterFlag=" + isRegisterFlag
                + ", registerData=" + registerData + ", isHousehildChange=" + isHousehildChange + ", newHouseholdId="
                + newHouseholdId + ", newHouseholdHeadId=" + newHouseholdHeadId + ", newHouseholdHeadName="
                + newHouseholdHeadName + ", dataNo=" + dataNo + ", adminOfficeName=" + adminOfficeName
                + ", isNewHousehold=" + isNewHousehold + ", applyDate=" + applyDate + ", isProvideHousehold="
                + isProvideHousehold + ", inSiteId=" + inSiteId + ", inAdminOfficeCode=" + inAdminOfficeCode
                + ", inAreaCode=" + inAreaCode + ", inHouseholdType=" + inHouseholdType + ", inHouseholdId="
                + inHouseholdId + ", inHouseholdHeadId=" + inHouseholdHeadId + ", inHouseholdHeadName="
                + inHouseholdHeadName + ", inCountyCode=" + inCountyCode + ", inTownCode=" + inTownCode
                + ", inVillage=" + inVillage + ", inNeighbor=" + inNeighbor + ", inSection=" + inSection + ", inArea="
                + inArea + ", inLane=" + inLane + ", inAlley=" + inAlley + ", inDoorNo=" + inDoorNo
                + ", inStreetDoorPlate=" + inStreetDoorPlate + ", outCountyCode=" + outCountyCode + ", outSiteId="
                + outSiteId + ", outHouseholdType=" + outHouseholdType + ", outHouseholdId=" + outHouseholdId
                + ", outHouseholdHeadId=" + outHouseholdHeadId + ", outHouseholdHeadName=" + outHouseholdHeadName
                + ", outTownCode=" + outTownCode + ", outVillage=" + outVillage + ", outNeighbor=" + outNeighbor
                + ", outSection=" + outSection + ", outArea=" + outArea + ", outLane=" + outLane + ", outAlley="
                + outAlley + ", outDoorNo=" + outDoorNo + ", outStreetDoorPlate=" + outStreetDoorplate
                + ", outFullAdress=" + outFullAdress + ", inFullAdress=" + inFullAdress + ", certificateList="
                + certificateList + ", remark=" + remark + ", removePersonIdList=" + removePersonIdList
                + ", addPersonIdList=" + addPersonIdList + ", householdNoteList=" + householdNoteList
                + ", personNoteList=" + personNoteList + ", isFine=" + isFine + ", fineReason=" + fineReason
                + ", fineList=" + fineList + ", certificateOther=" + certificateOther + ", checkFine=" + checkFine
                + ", fineDate=" + fineDate + ", fineStatus=" + fineStatus + ", tempStatus=" + tempStatus + ", isHouse="
                + isHouse + ", selectPerson=" + selectPerson + ", selectNewHouseHoldPerson=" + selectNewHouseHoldPerson
                + ", openingOperationDTO=" + openingOperationDTO + "]";
    }

}

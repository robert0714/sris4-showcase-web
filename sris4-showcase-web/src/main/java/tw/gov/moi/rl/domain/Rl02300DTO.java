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
import tw.gov.moi.domain.Rldfu001Type;

/**
 * The Class Rl02300DTO.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Rl02300DTO", propOrder = { "Village", "Neighbor", "StreetDoorplate", "Registeryyymmdd",
        "RegisterKind", "RegisterKindName", "FileKind", "ApplyPersonId", "ApplyAdminOfficeCode", "ApplyBirthday",
        "ApplyName1", "ApplyName2", "ApplyTel1", "ApplyTel2", "ApplyIdentity", "ApplyIdentityName", "ApplyAddress",
        "ApplyAreaCode", "ApplyAddressVillage", "ApplyAddressNeighbor", "ApplyAddressDoorplate", "DelegatedPersonId",
        "CommAdminOfficeCode", "CommName", "CommAddress", "CommAddress", "CommAreaCode", "CommAddressVillage",
        "CommAddressNeighbor", "CommAddressDoorplate", "Quantity", "FeeAmount", "AdminOfficeName", "DoorNumber",
        "ApplyTransactionId", "FeeReceiptId", "ModifyKind", "Status", "SelectVillage", "SelectNeighbor",
        "SelectDoorplate", "SelectRegisteryyymmdd", "SelectRegisterKind", "SelectModifyKind", "SelectNewOld",
        "QueryDoorplate", "QueryNote", "SelectStartNo", "SelectEndNo", "PrintVillageNeighbor", "PrintTo", "PrintKind6",
        "Sysdate", "Selected", "Series", "Rl02300SelectList", "Rl02300SeriesList", "Rl02300SeriesResultList",
        "Rl02300ResultList", "Rl02300PrintList", "ReportUrl", "PrintType", "OldNew", "TmpVillage", "TmpNeighbor",
        "TmpDoorplate", "TmpRegisterYyymmdd", "isSaved" })
@XmlRootElement(name = "Rl02300DTO")
public class Rl02300DTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    // -----畫面查詢-----------------
    private String strretOrDoor = "1";
    @XmlElement(name = "QueryType")
    @FieldName("查詢類別")
    private String queryType = "0";

    // 歷史門牌共用dto
    private RlStreetSerialDataDTO rlStreetSerialDataDTO;

    // ------其他資料

    @XmlElement(name = "OldState")
    @FieldName("找舊的狀態")
    private String oldState = "";

    @XmlElement(name = "OldState")
    @FieldName("找新的狀態")
    private String newState = "";

    /** 村里 */
    @XmlElement(name = "Village")
    @FieldName("村里")
    private String village = "";

    /** 鄰 */
    @XmlElement(name = "Neighbor")
    @FieldName("鄰")
    private String neighbor = "";

    /** 街路門牌 */
    @XmlElement(name = "StreetDoorplate")
    @FieldName("街路門牌")
    private String streetDoorplate = "";

    /** 編釘日期 */
    @XmlElement(name = "Registeryyymmdd")
    @FieldName("編釘日期")
    private String registeryyymmdd = "";

    /** 編釘類別 */
    @XmlElement(name = "RegisterKind")
    @FieldName("編釘類別")
    private String registerKind = "";

    /** 編釘類別名稱 */
    @XmlElement(name = "RegisterKindName")
    @FieldName("編釘類別名稱")
    private String registerKindName = "";

    /** 門牌種類 */
    @XmlElement(name = "FileKind")
    @FieldName("門牌種類")
    private String fileKind = "";

    // -----------申請人-------------------------//

    /** 申請人統一編號 */
    @XmlElement(name = "ApplyPersonId")
    @FieldName("申請人統一編號")
    private String applyPersonId = "";

    /** 申請人戶所代碼 */
    @XmlElement(name = "ApplyAdminOfficeCode")
    @FieldName("申請人戶所代碼")
    private String applyAdminOfficeCode = "";

    /** 申請人出生日期 */
    @XmlElement(name = "ApplyBirthday")
    @FieldName("申請人出生日期")
    private String applyBirthday = "";

    /** 申請人姓名1 */
    @XmlElement(name = "ApplyName1")
    @FieldName("申請人姓名1")
    private String applyName1 = "";

    /** 申請人姓名2 */
    @XmlElement(name = "ApplyName2")
    @FieldName("申請人姓名2")
    private String applyName2 = "";

    /** 申請人電話1 */
    @XmlElement(name = "ApplyTel1")
    @FieldName("申請人電話1")
    private String applyTel1 = "";

    /** 申請人電話2 */
    @XmlElement(name = "ApplyTel2")
    @FieldName("申請人電話2")
    private String applyTel2 = "";

    /** 申請人身分 */
    @XmlElement(name = "ApplyIdentity")
    @FieldName("申請人身分")
    private String applyIdentity = "";

    /** 申請人身分名稱 */
    @XmlElement(name = "ApplyIdentityName")
    @FieldName("申請人身分名稱")
    private String applyIdentityName = "";

    /** 申請人地址 */
    @XmlElement(name = "ApplyAddress")
    @FieldName("申請人地址")
    private String applyAddress = "";

    /** 申請人地址(行政區域代碼) */
    @XmlElement(name = "ApplyAreaCode")
    @FieldName("申請人地址(行政區域代碼)")
    private String applyAreaCode = "";

    /** 申請人地址(村里) */
    @XmlElement(name = "ApplyAddressVillage")
    @FieldName("申請人地址(村里)")
    private String applyAddressVillage = "";

    /** 申請人地址(鄰) */
    @XmlElement(name = "ApplyAddressNeighbor")
    @FieldName("申請人地址(鄰)")
    private String applyAddressNeighbor = "";

    /** 申請人地址(街路門牌) */
    @XmlElement(name = "ApplyAddressDoorplate")
    @FieldName("申請人地址(街路門牌)")
    private String applyAddressDoorplate = "";

    @XmlElement(name = "ApplySiteId")
    @FieldName("申請人site_id")
    private String applySiteId = "";

    @XmlElement(name = "ApplyHouseholdId")
    @FieldName("申請人戶號")
    private String applyHouseholdId = "";

    @XmlElement(name = "ApplyHouseholdheadId")
    @FieldName("申請人戶長統號")
    private String applyHouseholdheadId = "";

    @XmlElement(name = "ApplyHouseholdheadId")
    @FieldName("申請人除戶時間")
    private String applyRemoveTime = "";

    @XmlElement(name = "ApplyHouseholdheadId")
    @FieldName("申請人除戶日期")
    private String applyRemoveDate = "";

    /** 申請人地址電腦化狀況 */
    @XmlElement(name = "ApplyPcSate")
    @FieldName("申請人地址電腦化狀況")
    private boolean applyPcSate = false;

    @XmlElement(name = "ApplyPersonMark")
    @FieldName("申請人是除戶還是現戶")
    private String applyPersonMark = "";

    // -----------受委託人-------------------------//

    /** 受委託人統一編號 */
    @XmlElement(name = "DelegatedPersonId")
    @FieldName("受委託人統一編號")
    private String delegatedPersonId = "";

    /** 受委託人戶所代碼 */
    @XmlElement(name = "CommAdminOfficeCode")
    @FieldName("受委託人戶所代碼 ")
    private String commAdminOfficeCode = "";

    @XmlElement(name = "ApplyHouseholdId")
    @FieldName("受委託戶號")
    private String commHouseholdId = "";

    @XmlElement(name = "ApplyHouseholdheadId")
    @FieldName("受委託戶長統號")
    private String commmHouseholdheadId = "";

    @XmlElement(name = "ApplyHouseholdheadId")
    @FieldName("受委託除戶時間")
    private String commRemoveTime = "";

    @XmlElement(name = "ApplyHouseholdheadId")
    @FieldName("受委託除戶日期")
    private String commRemoveDate = "";

    /** 受委託人戶所代碼 */
    @XmlElement(name = "CommSiteId")
    @FieldName("受委託人戶所代碼 ")
    private String commSiteId = "";

    /** 受委託人姓名 */
    @XmlElement(name = "CommName")
    @FieldName("受委託人姓名")
    private String commName = "";

    /** 受委託人地址 */
    @XmlElement(name = "CommAddress")
    @FieldName("受委託人地址")
    private String commAddress = "";

    /** 受委託人地址(行政區域代碼) */
    @XmlElement(name = "CommAreaCode")
    @FieldName("受委託人地址(行政區域代碼)")
    private String commAreaCode = "";

    /** 受委託人地址(村里) */
    @XmlElement(name = "CommAddressVillage")
    @FieldName("受委託人地址(村里)")
    private String commAddressVillage = "";

    /** 受委託人地址(鄰) */
    @XmlElement(name = "CommAddressNeighbor")
    @FieldName("受委託人地址(鄰)")
    private String commAddressNeighbor = "";

    /** 受委託人地址(街路門牌) */
    @XmlElement(name = "CommAddressDoorplate")
    @FieldName("受委託人地址(街路門牌)")
    private String commAddressDoorplate = "";

    /** 受委託人地址(街路門牌) */
    @XmlElement(name = "CommAddressDoorplate")
    @FieldName("受委託人電腦化狀況")
    private boolean commPcSate = false;

    @XmlElement(name = "CommPersonMark")
    @FieldName("受委託人是除戶還是現戶")
    private String commPersonMark = "";

    // --------規費相關----------------------------

    /** 份數 */
    @XmlElement(name = "Quantity")
    @FieldName("份數")
    private String quantity = "1";

    /** 規費總金額 */
    @XmlElement(name = "FeeAmount")
    @FieldName("規費總金額")
    private String feeAmount = "";

    @XmlElement(name = "TotalFeeAmount")
    @FieldName("規費單價")
    private String unitFee = "";

    @XmlElement(name = "OtherFreeReason")
    @FieldName("免收規費其他原因")
    private String otherFreeReason = "";

    @XmlElement(name = "FreeReason")
    @FieldName("免收規費其他原因")
    private String freeReason = "";

    @XmlElement(name = "TotalFeeAmount")
    @FieldName("規費代碼")
    private String feeCode = "";

    // ------------------------------------

    /** 戶所名稱 */
    @XmlElement(name = "AdminOfficeName")
    @FieldName("戶所名稱")
    private String adminOfficeName = "";

    /** 門證字號 */
    @XmlElement(name = "DoorNumber")
    @FieldName("門證字號")
    private String doorNumber = "";

    /** 交易序號 */
    @XmlElement(name = "ApplyTransactionId")
    @FieldName("交易序號")
    private String applyTransactionId = "";

    /** 收據號碼 */
    @XmlElement(name = "FeeReceiptId")
    @FieldName("收據號碼")
    private String feeReceiptId = "";

    /** 異動原因 */
    @XmlElement(name = "ModifyKind")
    @FieldName("異動原因")
    private String modifyKind = "";

    /** 處理狀態 */
    @XmlElement(name = "Status")
    @FieldName("處理狀態")
    private String status = "";

    /** 選擇村里 */
    @XmlElement(name = "SelectVillage")
    @FieldName("選擇村里")
    private String selectVillage = "";

    /** 選擇鄰 */
    @XmlElement(name = "SelectNeighbor")
    @FieldName("選擇鄰")
    private String selectNeighbor = "";

    /** 選擇門牌 */
    @XmlElement(name = "SelectDoorplate")
    @FieldName("選擇門牌")
    private String selectDoorplate = "";

    /** 選擇編釘日期 */
    @XmlElement(name = "SelectRegisteryyymmdd")
    @FieldName("選擇編釘日期")
    private String selectRegisteryyymmdd = "";

    /** 選擇編釘種類 */
    @XmlElement(name = "SelectRegisterKind")
    @FieldName("選擇編釘種類")
    private String selectRegisterKind = "";

    /** 選擇異動類別 */
    @XmlElement(name = "SelectModifyKind")
    @FieldName("選擇異動類別")
    private String selectModifyKind = "";

    /** 選擇門牌新舊註記 */
    @XmlElement(name = "SelectNewOld")
    @FieldName("選擇門牌新舊註記")
    private String selectNewOld = "";

    /** 查詢門牌 */
    @XmlElement(name = "QueryDoorplate")
    @FieldName("查詢門牌")
    private String queryDoorplate = "";

    /** 查詢備註 */
    @XmlElement(name = "QueryNote")
    @FieldName("查詢備註")
    private String queryNote = "";

    /** 列印起始序號 */
    @XmlElement(name = "SelectStartNo")
    @FieldName("列印起始序號")
    private String selectStartNo = "";

    /** 列印截止序號 */
    @XmlElement(name = "SelectEndNo")
    @FieldName("列印截止序號")
    private String selectEndNo = "";

    /** 列印村里鄰 */
    @XmlElement(name = "PrintVillageNeighbor")
    @FieldName("列印村里鄰")
    private String printVillageNeighbor = "";

    /** 列印上給 */
    @XmlElement(name = "PrintTo")
    @FieldName("列印上給")
    private String printTo = "";

    /** 列印行政區域調整資料 */
    @XmlElement(name = "PrintKind6")
    @FieldName("列印行政區域調整資料")
    private String printKind6 = "";

    /** 系統日期 */
    @XmlElement(name = "Sysdate")
    @FieldName("系統日期")
    private String sysdate = "";

    /** 選擇門牌 */
    @XmlElement(name = "Selected")
    @FieldName("選擇門牌")
    Rl02300SelectDTO selected;

    /** 門牌歷史資料串聯選擇門牌 */
    @XmlElement(name = "Series")
    @FieldName("門牌歷史資料串聯選擇門牌")
    private Rl02300SeriesDTO series;

    /** 選擇門牌清單 */
    @XmlElement(name = "Rl02300SelectList")
    @FieldName("選擇門牌清單")
    private List<Rl02300SelectDTO> rl02300SelectList;

    /** 門牌歷史資料串聯選擇門牌清單 */
    @XmlElement(name = "Rl02300SeriesList")
    @FieldName("門牌歷史資料串聯選擇門牌清單")
    private List<Rl02300SeriesDTO> rl02300SeriesList;

    /** 門牌歷史已串聯清單 */
    @XmlElement(name = "Rl02300SeriesResultList")
    @FieldName("門牌歷史已串聯清單")
    private List<Rl02300SeriesResultDTO> rl02300SeriesResultList;

    /** 結果列表清單 */
    @XmlElement(name = "Rl02300ResultList")
    @FieldName("結果列表清單")
    private List<Rl02300ResultDTO> rl02300ResultList;

    /** 證明書內容清單 */
    @XmlElement(name = "Rl02300PrintList")
    @FieldName("證明書內容清單")
    private List<Rl02300PrintDTO> rl02300PrintList;

    @XmlElement(name = "ReportUrl")
    @FieldName("申請書報表路徑")
    private String reportUrlForApplication;

    @XmlElement(name = "ReportUrl")
    @FieldName("證明書報表路徑")
    private String reportUrlForCertificate;

    @XmlElement(name = "ReportUrl")
    @FieldName("規費收據路徑")
    private String reportUrlFornReceipt;

    @XmlElement(name = "PrintType")
    @FieldName("列印種頪")
    private String printType;

    @XmlElement(name = "OldNew")
    @FieldName("找尋方向")
    private String oldNew;

    @XmlElement(name = "TmpVillage")
    @FieldName("暫存村里")
    private String tmpVillage = "";

    @XmlElement(name = "TmpNeighbor")
    @FieldName("暫存鄰")
    private String tmpNeighbor = "";

    @XmlElement(name = "TmpDoorplate")
    @FieldName("暫存門牌")
    private String tmpDoorplate = "";

    @XmlElement(name = "TmpRegisterYyymmdd")
    @FieldName("暫存編釘日期")
    private String tmpRegisterYyymmdd = "";

    @XmlElement(name = "IsSaved")
    @FieldName("是否已存檔")
    private boolean isSaved = false;

    private List<Rldfu001Type> rldfu001List = new ArrayList<Rldfu001Type>();

    private CertificateDTO certificateDTO = new CertificateDTO();

    @XmlElement(name = "SelectFee")
    @FieldName("選擇到的規費項目")
    private Rldfu001Type selectFee = new Rldfu001Type();

    @XmlElement(name = "PayType")
    @FieldName("付費方式")
    private String payType = "1";

    @XmlElement(name = "IsFreeFlag")
    @FieldName("是否免費")
    private String isFreeFlag = "N";

    @XmlElement(name = "IsPrintFee")
    @FieldName("是否列印規費")
    private String isPrintFee = "Y";

    public String getIsPrintFee() {
        return isPrintFee;
    }

    public void setIsPrintFee(String isPrintFee) {
        this.isPrintFee = isPrintFee;
    }

    public Rldfu001Type getSelectFee() {
        return selectFee;
    }

    public void setSelectFee(Rldfu001Type selectFee) {
        this.selectFee = selectFee;
    }

    public String getIsFreeFlag() {
        return isFreeFlag;
    }

    public void setIsFreeFlag(String isFreeFlag) {
        this.isFreeFlag = isFreeFlag;
    }

    public String getPayType() {
        return payType;
    }

    public void setPayType(String payType) {
        this.payType = payType;
    }

    public String getQueryType() {
        return queryType;
    }

    public void setQueryType(String queryType) {
        this.queryType = queryType;
    }

    public List<Rldfu001Type> getRldfu001List() {
        return rldfu001List;
    }

    public void setRldfu001List(List<Rldfu001Type> rldfu001List) {
        this.rldfu001List = rldfu001List;
    }

    public boolean isSaved() {
        return isSaved;
    }

    public void setSaved(boolean isSaved) {
        this.isSaved = isSaved;
    }

    public String getVillage() {
        return village;
    }

    public void setVillage(String village) {
        this.village = village;
    }

    public String getNeighbor() {
        return neighbor;
    }

    public void setNeighbor(String neighbor) {
        this.neighbor = neighbor;
    }

    public String getStreetDoorplate() {
        return streetDoorplate;
    }

    public void setStreetDoorplate(String streetDoorplate) {
        this.streetDoorplate = streetDoorplate;
    }

    public String getRegisteryyymmdd() {
        return registeryyymmdd;
    }

    public void setRegisteryyymmdd(String registeryyymmdd) {
        this.registeryyymmdd = registeryyymmdd;
    }

    public String getRegisterKind() {
        return registerKind;
    }

    public void setRegisterKind(String registerKind) {
        this.registerKind = registerKind;
    }

    public String getRegisterKindName() {
        return registerKindName;
    }

    public void setRegisterKindName(String registerKindName) {
        this.registerKindName = registerKindName;
    }

    public String getFileKind() {
        return fileKind;
    }

    public void setFileKind(String fileKind) {
        this.fileKind = fileKind;
    }

    public String getApplyPersonId() {
        return applyPersonId;
    }

    public void setApplyPersonId(String applyPersonId) {
        this.applyPersonId = applyPersonId;
    }

    public String getApplyAdminOfficeCode() {
        return applyAdminOfficeCode;
    }

    public void setApplyAdminOfficeCode(String applyAdminOfficeCode) {
        this.applyAdminOfficeCode = applyAdminOfficeCode;
    }

    public String getApplyBirthday() {
        return applyBirthday;
    }

    public void setApplyBirthday(String applyBirthday) {
        this.applyBirthday = applyBirthday;
    }

    public String getApplyName1() {
        return applyName1;
    }

    public void setApplyName1(String applyName1) {
        this.applyName1 = applyName1;
    }

    public String getApplyName2() {
        return applyName2;
    }

    public void setApplyName2(String applyName2) {
        this.applyName2 = applyName2;
    }

    public String getApplyTel1() {
        return applyTel1;
    }

    public void setApplyTel1(String applyTel1) {
        this.applyTel1 = applyTel1;
    }

    public String getApplyTel2() {
        return applyTel2;
    }

    public void setApplyTel2(String applyTel2) {
        this.applyTel2 = applyTel2;
    }

    public String getApplyIdentity() {
        return applyIdentity;
    }

    public void setApplyIdentity(String applyIdentity) {
        this.applyIdentity = applyIdentity;
    }

    public String getApplyIdentityName() {
        return applyIdentityName;
    }

    public void setApplyIdentityName(String applyIdentityName) {
        this.applyIdentityName = applyIdentityName;
    }

    public String getApplyAddress() {
        return applyAddress;
    }

    public void setApplyAddress(String applyAddress) {
        this.applyAddress = applyAddress;
    }

    public String getApplyAreaCode() {
        return applyAreaCode;
    }

    public void setApplyAreaCode(String applyAreaCode) {
        this.applyAreaCode = applyAreaCode;
    }

    public String getApplyAddressVillage() {
        return applyAddressVillage;
    }

    public void setApplyAddressVillage(String applyAddressVillage) {
        this.applyAddressVillage = applyAddressVillage;
    }

    public String getApplyAddressNeighbor() {
        return applyAddressNeighbor;
    }

    public void setApplyAddressNeighbor(String applyAddressNeighbor) {
        this.applyAddressNeighbor = applyAddressNeighbor;
    }

    public String getApplyAddressDoorplate() {
        return applyAddressDoorplate;
    }

    public void setApplyAddressDoorplate(String applyAddressDoorplate) {
        this.applyAddressDoorplate = applyAddressDoorplate;
    }

    public String getDelegatedPersonId() {
        return delegatedPersonId;
    }

    public void setDelegatedPersonId(String delegatedPersonId) {
        this.delegatedPersonId = delegatedPersonId;
    }

    public String getCommAdminOfficeCode() {
        return commAdminOfficeCode;
    }

    public void setCommAdminOfficeCode(String commAdminOfficeCode) {
        this.commAdminOfficeCode = commAdminOfficeCode;
    }

    public String getCommName() {
        return commName;
    }

    public void setCommName(String commName) {
        this.commName = commName;
    }

    public String getCommAddress() {
        return commAddress;
    }

    public void setCommAddress(String commAddress) {
        this.commAddress = commAddress;
    }

    public String getCommAreaCode() {
        return commAreaCode;
    }

    public void setCommAreaCode(String commAreaCode) {
        this.commAreaCode = commAreaCode;
    }

    public String getCommAddressVillage() {
        return commAddressVillage;
    }

    public void setCommAddressVillage(String commAddressVillage) {
        this.commAddressVillage = commAddressVillage;
    }

    public String getCommAddressNeighbor() {
        return commAddressNeighbor;
    }

    public void setCommAddressNeighbor(String commAddressNeighbor) {
        this.commAddressNeighbor = commAddressNeighbor;
    }

    public String getCommAddressDoorplate() {
        return commAddressDoorplate;
    }

    public void setCommAddressDoorplate(String commAddressDoorplate) {
        this.commAddressDoorplate = commAddressDoorplate;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getFeeAmount() {
        return feeAmount;
    }

    public void setFeeAmount(String feeAmount) {
        this.feeAmount = feeAmount;
    }

    public String getAdminOfficeName() {
        return adminOfficeName;
    }

    public void setAdminOfficeName(String adminOfficeName) {
        this.adminOfficeName = adminOfficeName;
    }

    public String getDoorNumber() {
        return doorNumber;
    }

    public void setDoorNumber(String doorNumber) {
        this.doorNumber = doorNumber;
    }

    public String getApplyTransactionId() {
        return applyTransactionId;
    }

    public void setApplyTransactionId(String applyTransactionId) {
        this.applyTransactionId = applyTransactionId;
    }

    public String getFeeReceiptId() {
        return feeReceiptId;
    }

    public void setFeeReceiptId(String feeReceiptId) {
        this.feeReceiptId = feeReceiptId;
    }

    public String getModifyKind() {
        return modifyKind;
    }

    public void setModifyKind(String modifyKind) {
        this.modifyKind = modifyKind;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getSelectVillage() {
        return selectVillage;
    }

    public void setSelectVillage(String selectVillage) {
        this.selectVillage = selectVillage;
    }

    public String getSelectNeighbor() {
        return selectNeighbor;
    }

    public void setSelectNeighbor(String selectNeighbor) {
        this.selectNeighbor = selectNeighbor;
    }

    public String getSelectDoorplate() {
        return selectDoorplate;
    }

    public void setSelectDoorplate(String selectDoorplate) {
        this.selectDoorplate = selectDoorplate;
    }

    public String getSelectRegisteryyymmdd() {
        return selectRegisteryyymmdd;
    }

    public void setSelectRegisteryyymmdd(String selectRegisteryyymmdd) {
        this.selectRegisteryyymmdd = selectRegisteryyymmdd;
    }

    public String getSelectRegisterKind() {
        return selectRegisterKind;
    }

    public void setSelectRegisterKind(String selectRegisterKind) {
        this.selectRegisterKind = selectRegisterKind;
    }

    public String getSelectModifyKind() {
        return selectModifyKind;
    }

    public void setSelectModifyKind(String selectModifyKind) {
        this.selectModifyKind = selectModifyKind;
    }

    public String getSelectNewOld() {
        return selectNewOld;
    }

    public void setSelectNewOld(String selectNewOld) {
        this.selectNewOld = selectNewOld;
    }

    public String getQueryDoorplate() {
        return queryDoorplate;
    }

    public void setQueryDoorplate(String queryDoorplate) {
        this.queryDoorplate = queryDoorplate;
    }

    public String getQueryNote() {
        return queryNote;
    }

    public void setQueryNote(String queryNote) {
        this.queryNote = queryNote;
    }

    public String getSelectStartNo() {
        return selectStartNo;
    }

    public void setSelectStartNo(String selectStartNo) {
        this.selectStartNo = selectStartNo;
    }

    public String getSelectEndNo() {
        return selectEndNo;
    }

    public void setSelectEndNo(String selectEndNo) {
        this.selectEndNo = selectEndNo;
    }

    public String getPrintVillageNeighbor() {
        return printVillageNeighbor;
    }

    public void setPrintVillageNeighbor(String printVillageNeighbor) {
        this.printVillageNeighbor = printVillageNeighbor;
    }

    public String getPrintTo() {
        return printTo;
    }

    public void setPrintTo(String printTo) {
        this.printTo = printTo;
    }

    public String getPrintKind6() {
        return printKind6;
    }

    public void setPrintKind6(String printKind6) {
        this.printKind6 = printKind6;
    }

    public String getSysdate() {
        return sysdate;
    }

    public void setSysdate(String sysdate) {
        this.sysdate = sysdate;
    }

    public Rl02300SelectDTO getSelected() {
        return selected;
    }

    public void setSelected(Rl02300SelectDTO selected) {
        this.selected = selected;
    }

    public Rl02300SeriesDTO getSeries() {
        return series;
    }

    public void setSeries(Rl02300SeriesDTO series) {
        this.series = series;
    }

    public List<Rl02300SelectDTO> getRl02300SelectList() {
        return rl02300SelectList;
    }

    public void setRl02300SelectList(List<Rl02300SelectDTO> rl02300SelectList) {
        this.rl02300SelectList = rl02300SelectList;
    }

    public List<Rl02300SeriesDTO> getRl02300SeriesList() {
        return rl02300SeriesList;
    }

    public void setRl02300SeriesList(List<Rl02300SeriesDTO> rl02300SeriesList) {
        this.rl02300SeriesList = rl02300SeriesList;
    }

    public List<Rl02300SeriesResultDTO> getRl02300SeriesResultList() {
        return rl02300SeriesResultList;
    }

    public void setRl02300SeriesResultList(List<Rl02300SeriesResultDTO> rl02300SeriesResultList) {
        this.rl02300SeriesResultList = rl02300SeriesResultList;
    }

    public List<Rl02300ResultDTO> getRl02300ResultList() {
        return rl02300ResultList;
    }

    public void setRl02300ResultList(List<Rl02300ResultDTO> rl02300ResultList) {
        this.rl02300ResultList = rl02300ResultList;
    }

    public List<Rl02300PrintDTO> getRl02300PrintList() {
        return rl02300PrintList;
    }

    public void setRl02300PrintList(List<Rl02300PrintDTO> rl02300PrintList) {
        this.rl02300PrintList = rl02300PrintList;
    }

    public String getPrintType() {
        return printType;
    }

    public void setPrintType(String printType) {
        this.printType = printType;
    }

    public String getOldNew() {
        return oldNew;
    }

    public void setOldNew(String oldNew) {
        this.oldNew = oldNew;
    }

    public String getTmpVillage() {
        return tmpVillage;
    }

    public void setTmpVillage(String tmpVillage) {
        this.tmpVillage = tmpVillage;
    }

    public String getTmpNeighbor() {
        return tmpNeighbor;
    }

    public void setTmpNeighbor(String tmpNeighbor) {
        this.tmpNeighbor = tmpNeighbor;
    }

    public String getTmpDoorplate() {
        return tmpDoorplate;
    }

    public void setTmpDoorplate(String tmpDoorplate) {
        this.tmpDoorplate = tmpDoorplate;
    }

    public String getTmpRegisterYyymmdd() {
        return tmpRegisterYyymmdd;
    }

    public void setTmpRegisterYyymmdd(String tmpRegisterYyymmdd) {
        this.tmpRegisterYyymmdd = tmpRegisterYyymmdd;
    }

    public String getUnitFee() {
        return unitFee;
    }

    public void setUnitFee(String unitFee) {
        this.unitFee = unitFee;
    }

    public String getFeeCode() {
        return feeCode;
    }

    public void setFeeCode(String feeCode) {
        this.feeCode = feeCode;
    }

    public String getOtherFreeReason() {
        return otherFreeReason;
    }

    public void setOtherFreeReason(String otherFreeReason) {
        this.otherFreeReason = otherFreeReason;
    }

    public String getFreeReason() {
        return freeReason;
    }

    public void setFreeReason(String freeReason) {
        this.freeReason = freeReason;
    }

    public CertificateDTO getCertificateDTO() {
        return certificateDTO;
    }

    public void setCertificateDTO(CertificateDTO certificateDTO) {
        this.certificateDTO = certificateDTO;
    }

    public String getReportUrlForApplication() {
        return reportUrlForApplication;
    }

    public void setReportUrlForApplication(String reportUrlForApplication) {
        this.reportUrlForApplication = reportUrlForApplication;
    }

    public String getReportUrlForCertificate() {
        return reportUrlForCertificate;
    }

    public void setReportUrlForCertificate(String reportUrlForCertificate) {
        this.reportUrlForCertificate = reportUrlForCertificate;
    }

    public String getReportUrlFornReceipt() {
        return reportUrlFornReceipt;
    }

    public void setReportUrlFornReceipt(String reportUrlFornReceipt) {
        this.reportUrlFornReceipt = reportUrlFornReceipt;
    }

    public String getOldState() {
        return oldState;
    }

    public void setOldState(String oldState) {
        this.oldState = oldState;
    }

    public String getNewState() {
        return newState;
    }

    public void setNewState(String newState) {
        this.newState = newState;
    }

    public boolean isApplyPcSate() {
        return applyPcSate;
    }

    public void setApplyPcSate(boolean applyPcSate) {
        this.applyPcSate = applyPcSate;
    }

    public boolean isCommPcSate() {
        return commPcSate;
    }

    public void setCommPcSate(boolean commPcSate) {
        this.commPcSate = commPcSate;
    }

    public String getApplyPersonMark() {
        return applyPersonMark;
    }

    public void setApplyPersonMark(String applyPersonMark) {
        this.applyPersonMark = applyPersonMark;
    }

    public String getCommPersonMark() {
        return commPersonMark;
    }

    public void setCommPersonMark(String commPersonMark) {
        this.commPersonMark = commPersonMark;
    }

    public String getApplySiteId() {
        return applySiteId;
    }

    public void setApplySiteId(String applySiteId) {
        this.applySiteId = applySiteId;
    }

    public String getCommSiteId() {
        return commSiteId;
    }

    public void setCommSiteId(String commSiteId) {
        this.commSiteId = commSiteId;
    }

    public String getApplyHouseholdId() {
        return applyHouseholdId;
    }

    public void setApplyHouseholdId(String applyHouseholdId) {
        this.applyHouseholdId = applyHouseholdId;
    }

    public String getApplyHouseholdheadId() {
        return applyHouseholdheadId;
    }

    public void setApplyHouseholdheadId(String applyHouseholdheadId) {
        this.applyHouseholdheadId = applyHouseholdheadId;
    }

    public String getCommHouseholdId() {
        return commHouseholdId;
    }

    public void setCommHouseholdId(String commHouseholdId) {
        this.commHouseholdId = commHouseholdId;
    }

    public String getCommmHouseholdheadId() {
        return commmHouseholdheadId;
    }

    public void setCommmHouseholdheadId(String commmHouseholdheadId) {
        this.commmHouseholdheadId = commmHouseholdheadId;
    }

    public String getApplyRemoveTime() {
        return applyRemoveTime;
    }

    public void setApplyRemoveTime(String applyRemoveTime) {
        this.applyRemoveTime = applyRemoveTime;
    }

    public String getApplyRemoveDate() {
        return applyRemoveDate;
    }

    public void setApplyRemoveDate(String applyRemoveDate) {
        this.applyRemoveDate = applyRemoveDate;
    }

    public String getCommRemoveTime() {
        return commRemoveTime;
    }

    public void setCommRemoveTime(String commRemoveTime) {
        this.commRemoveTime = commRemoveTime;
    }

    public String getCommRemoveDate() {
        return commRemoveDate;
    }

    public void setCommRemoveDate(String commRemoveDate) {
        this.commRemoveDate = commRemoveDate;
    }

    public String getStrretOrDoor() {
        return strretOrDoor;
    }

    public void setStrretOrDoor(String strretOrDoor) {
        this.strretOrDoor = strretOrDoor;
    }

    public RlStreetSerialDataDTO getRlStreetSerialDataDTO() {
        return rlStreetSerialDataDTO;
    }

    public void setRlStreetSerialDataDTO(RlStreetSerialDataDTO rlStreetSerialDataDTO) {
        this.rlStreetSerialDataDTO = rlStreetSerialDataDTO;
    }

    @Override
    public String toString() {
        return "Rl02300DTO [oldState=" + oldState + ", newState=" + newState + ", village=" + village + ", neighbor="
                + neighbor + ", streetDoorplate=" + streetDoorplate + ", registeryyymmdd=" + registeryyymmdd
                + ", registerKind=" + registerKind + ", registerKindName=" + registerKindName + ", fileKind="
                + fileKind + ", applyPersonId=" + applyPersonId + ", applyAdminOfficeCode=" + applyAdminOfficeCode
                + ", applyBirthday=" + applyBirthday + ", applyName1=" + applyName1 + ", applyName2=" + applyName2
                + ", applyTel1=" + applyTel1 + ", applyTel2=" + applyTel2 + ", applyIdentity=" + applyIdentity
                + ", applyIdentityName=" + applyIdentityName + ", applyAddress=" + applyAddress + ", applyAreaCode="
                + applyAreaCode + ", applyAddressVillage=" + applyAddressVillage + ", applyAddressNeighbor="
                + applyAddressNeighbor + ", applyAddressDoorplate=" + applyAddressDoorplate + ", applySiteId="
                + applySiteId + ", applyPcSate=" + applyPcSate + ", applyPersonMark=" + applyPersonMark
                + ", delegatedPersonId=" + delegatedPersonId + ", commAdminOfficeCode=" + commAdminOfficeCode
                + ", commSiteId=" + commSiteId + ", commName=" + commName + ", commAddress=" + commAddress
                + ", commAreaCode=" + commAreaCode + ", commAddressVillage=" + commAddressVillage
                + ", commAddressNeighbor=" + commAddressNeighbor + ", commAddressDoorplate=" + commAddressDoorplate
                + ", commPcSate=" + commPcSate + ", commPersonMark=" + commPersonMark + ", quantity=" + quantity
                + ", feeAmount=" + feeAmount + ", unitFee=" + unitFee + ", otherFreeReason=" + otherFreeReason
                + ", freeReason=" + freeReason + ", feeCode=" + feeCode + ", adminOfficeName=" + adminOfficeName
                + ", doorNumber=" + doorNumber + ", applyTransactionId=" + applyTransactionId + ", feeReceiptId="
                + feeReceiptId + ", modifyKind=" + modifyKind + ", status=" + status + ", selectVillage="
                + selectVillage + ", selectNeighbor=" + selectNeighbor + ", selectDoorplate=" + selectDoorplate
                + ", selectRegisteryyymmdd=" + selectRegisteryyymmdd + ", selectRegisterKind=" + selectRegisterKind
                + ", selectModifyKind=" + selectModifyKind + ", selectNewOld=" + selectNewOld + ", queryDoorplate="
                + queryDoorplate + ", queryNote=" + queryNote + ", selectStartNo=" + selectStartNo + ", selectEndNo="
                + selectEndNo + ", printVillageNeighbor=" + printVillageNeighbor + ", printTo=" + printTo
                + ", printKind6=" + printKind6 + ", sysdate=" + sysdate + ", selected=" + selected + ", series="
                + series + ", rl02300SelectList=" + rl02300SelectList + ", rl02300SeriesList=" + rl02300SeriesList
                + ", rl02300SeriesResultList=" + rl02300SeriesResultList + ", rl02300ResultList=" + rl02300ResultList
                + ", rl02300PrintList=" + rl02300PrintList + ", reportUrlForApplication=" + reportUrlForApplication
                + ", reportUrlForCertificate=" + reportUrlForCertificate + ", reportUrlFornReceipt="
                + reportUrlFornReceipt + ", printType=" + printType + ", oldNew=" + oldNew + ", tmpVillage="
                + tmpVillage + ", tmpNeighbor=" + tmpNeighbor + ", tmpDoorplate=" + tmpDoorplate
                + ", tmpRegisterYyymmdd=" + tmpRegisterYyymmdd + ", isSaved=" + isSaved + ", rldfu001List="
                + rldfu001List + ", certificateDTO=" + certificateDTO + ", selectFee=" + selectFee + ", payType="
                + payType + ", isFreeFlag=" + isFreeFlag + ", isPrintFee=" + isPrintFee + "]";
    }

}

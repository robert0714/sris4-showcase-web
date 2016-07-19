/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;
import tw.gov.moi.domain.Rldf001mType;
import tw.gov.moi.domain.Rldf004mType;
import tw.gov.moi.domain.Rldfu001Type;
import tw.gov.moi.rl.component.dto.OpeningOperationDTO;
import tw.gov.moi.rl.domain.RlWarningMessage;
import tw.gov.moi.rl.domain.XLDFApplicantDataDTO;
import tw.gov.moi.rl.domain.XLDFPersonBriefDataDTO;
import tw.gov.moi.rl.domain.xldf.XLDFHouseholdDataDomainObject;
import tw.gov.moi.rl.domain.xldf.XLDFPersonDataDomainObject;

/**
 * 印鑑證明核發DTO
 * 
 * @author Marcus Chen
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Rl02200DTO", propOrder = { "openingOperationDTO", "personData", "houseHeadData", "householdData",
        "applyPerson1", "applyPerson1Relationship", "applyPerson2", "applyPerson2Relationship", "delegated",
        "certificate", "otherCertificateStatus", "otherCertificate", "systemDate", "systemTime", "crossSiteEnabled",
        "moveOutType", "sealNumber", "sealApplYyymmdd", "registerContent", "sealReason", "sealReasonOther",
        "otherSealReasonOtherShow", "type", "registerYyymmdd", "warningMessgeList", "otherCertificateCode",
        "otherCertificateShow", "printMark", "quantity", "fee", "commId1", "commName1", "commId2", "commName2",
        "commDate1", "commHousDate1", "commDate2", "commHousDate2", "revicePeople", "reportUrl", "cancelAgent1",
        "cancelAgent2", "receiptId", "feeAmount", "freeReason", "otherFreeReason", "feeList", "feeSelect", "feeCode",
        "copies", "selectFree", "haveCurrentPerson", "currentPersonName", "streetDoorplate", "acceptSiteId" })
@XmlRootElement(name = "Rl02200DTO")
public class Rl02200DTO implements Serializable {

    /** Serial Id. */
    private static final long serialVersionUID = 598726909330491199L;
    /** The OpeningOperationDTO. */
    @XmlElement(name = "openingOperationDTO", required = true)
    @FieldName("OpeningOperationDTO")
    private OpeningOperationDTO openingOperationDTO = new OpeningOperationDTO();

    /** 個人基本資料. */
    @XmlElement(name = "personData", required = true)
    @FieldName("個人基本資料")
    private XLDFPersonDataDomainObject personData;

    /** 戶長基本資料. */
    @XmlElement(name = "houseHeadData", required = true)
    @FieldName("戶長個人基本資料")
    private XLDFPersonDataDomainObject houseHeadData;

    /** 當事人全戶基本資料. */
    @XmlElement(name = "householdData", required = true)
    @FieldName("當事人全戶基本資料")
    private XLDFHouseholdDataDomainObject householdData;

    /** 申請人1 */
    @XmlElement(name = "applyPerson1", required = true)
    @FieldName("申請人1")
    private XLDFApplicantDataDTO applyPerson1;

    /** 申請人1-與當事人關係. */
    @XmlElement(name = "applyPerson1Relationship", required = true)
    @FieldName("申請人1-與當事人關係")
    private String applyPerson1Relationship;

    /** 申請人2 */
    @XmlElement(name = "applyPerson2", required = true)
    @FieldName("申請人1")
    private XLDFApplicantDataDTO applyPerson2;

    /** 申請人2-與當事人關係. */
    @XmlElement(name = "applyPerson2Relationship", required = true)
    @FieldName("申請人2-與當事人關係")
    private String applyPerson2Relationship;

    /** 受委託人 */
    @XmlElement(name = "delegated", required = true)
    @FieldName("受委託人")
    private XLDFPersonBriefDataDTO delegated;

    /** 附繳證件. */
    @XmlElement(name = "certificate", required = true)
    @FieldName("附繳證件")
    private List<String> certificate;

    /** 顯示其他附繳證件輸入欄位與否 */
    @XmlElement(name = "otherCertificateStatus", required = true)
    @FieldName("顯示其他附繳證件輸入欄位與否")
    private String otherCertificateStatus;

    /** 其他附繳證件. */
    @XmlElement(name = "otherCertificate", required = true)
    @FieldName("其他附繳證件")
    private String otherCertificate;

    /** 系統日期. */
    @XmlElement(name = "systemDate", required = true)
    @FieldName("系統日期")
    private String systemDate;

    /** 系統時間. */
    @XmlElement(name = "systemTime", required = true)
    @FieldName("系統時間")
    private String systemTime;

    /** 是否可異地辦理. */
    @XmlElement(name = "crossSiteEnabled", required = true)
    @FieldName("是否可異地辦理")
    private boolean crossSiteEnabled;

    /** ======================頁面變數===================== **/

    /** 當事人為出境人口 */
    @XmlElement(name = "MoveOutType", required = true)
    @FieldName("當事人為出境人口")
    private String moveOutType;

    /** 申請資料 -印登字號- */
    @XmlElement(name = "sealNumber", required = true)
    @FieldName("印登字號")
    private String sealNumber;

    /** 申請資料 -廢止日期- */
    @XmlElement(name = "sealApplYyymmdd", required = true)
    @FieldName("廢止日期")
    private String sealApplYyymmdd;

    /** 申請資料 -備註- */
    @XmlElement(name = "registerContent", required = true)
    @FieldName("備註")
    private String registerContent;

    /** 申請資料 -廢止原因- */
    @XmlElement(name = "sealReason", required = true)
    @FieldName("廢止原因")
    private List<String> sealReason;

    /** 申請資料 -廢止原因- */
    @XmlElement(name = "sealReasonOther", required = true)
    @FieldName("廢止原因-其他")
    private String sealReasonOther;

    /** 廢止原因-其他是否顯示 */
    @XmlElement(name = "otherSealReasonOtherShow", required = true)
    @FieldName("廢止原因-其他是否顯示")
    private boolean otherSealReasonOtherShow;

    /** 申請資料 -申請種類- */
    @XmlElement(name = "type", required = true)
    @FieldName("申請種類")
    private String type;

    /** 申請資料 -登記日期- */
    @XmlElement(name = "registerYyymmdd", required = true)
    @FieldName("登記日期")
    private String registerYyymmdd;

    @XmlElement(name = "warningMessgeList", required = true)
    @FieldName("警告訊息清單")
    private List<RlWarningMessage> warningMessgeList = new ArrayList<RlWarningMessage>();

    /** 其他附繳證件代碼 */
    @XmlElement(name = "OtherCertificateCode", required = true)
    @FieldName("其他附繳證件代碼")
    private String otherCertificateCode;

    /** 其他附繳證件是否顯示 */
    @XmlElement(name = "OtherCertificateShow", required = true)
    @FieldName("其他附繳證件是否顯示")
    private boolean otherCertificateShow;

    /**
     * 列印資料-列印戶籍謄本申請書 <BR>
     * Default: 要印.
     */
    @XmlElement(name = "PrintMark")
    @FieldName("列印旗標")
    private boolean printMark = true;

    /**
     * 列印資料-份數. <BR>
     * Default: 1.
     */
    // @XmlElement(name = "Copies")
    // @FieldName("列印份數")
    // private String copies = "1";

    /** 列印資料-張數. */
    @XmlElement(name = "Quantity")
    @FieldName("列印張數")
    private String quantity = "1";

    /** 列印資料-單價. */
    @XmlElement(name = "Fee")
    @FieldName("列印單價")
    private String fee = "0";

    /** 列印資料-總金額. */
    // @XmlElement(name = "FeeAmount")
    // @FieldName("列印總金額")
    // private String feeAmount = "20";

    /** 收據號碼 */
    // @XmlElement(name = "ReceiptId", required = true)
    // @FieldName("收據號碼")
    // private String receiptId;

    /** 列印資料-免收規費原因. */
    // @XmlElement(name = "FreeReason")
    // @FieldName("列印免收規費原因")
    // private String freeReason;

    // @XmlElement(name = "selectFree")
    // @FieldName("是否免費")
    // private String selectFree = "N";

    /*    *//** 免規費原因. */
    /*
     * @XmlElement(name = "FreeReasonCode")
     * 
     * @FieldName("免規費原因") private String freeReasonCode = "";
     */

    /** 免規費原因(字串). */
    // @XmlElement(name = "OtherFreeReason")
    // @FieldName("免規費原因(字串)")
    // private String otherFreeReason = "";

    /** 列印資料-法定代理人統號1. */
    @XmlElement(name = "CommId1")
    @FieldName("列印法定代理人統號1")
    private String commId1;
    /** 列印資料-法定代理人姓名1. */
    @XmlElement(name = "CommName1")
    @FieldName("列印法定代理人姓名1")
    private String commName1;

    /** 列印資料-法定代理人統號2. */
    @XmlElement(name = "CommId2")
    @FieldName("列印法定代理人統號2")
    private String commId2;
    /** 列印資料-法定代理人姓名2. */
    @XmlElement(name = "CommName2")
    @FieldName("列印法定代理人姓名2")
    private String commName2;

    /** 列印資料-法定代理人4M. */
    @XmlElement(name = "CommDate1")
    @FieldName("列印法定代理人4M")
    private Rldf004mType commDate1;
    /** 列印資料-法定代理人1M. */
    @XmlElement(name = "CommHousDate1")
    @FieldName("列印法定代理人1M")
    private Rldf001mType commHousDate1;

    /** 列印資料-法定代理人4M. */
    @XmlElement(name = "CommDate2")
    @FieldName("列印法定代理人4M")
    private Rldf004mType commDate2;
    /** 列印資料-法定代理人1M. */
    @XmlElement(name = "CommHousDate2")
    @FieldName("列印法定代理人1M")
    private Rldf001mType commHousDate2;

    /** 上給收執人員. */
    @XmlElement(name = "RevicePeople")
    @FieldName("上給收執人員")
    private String revicePeople;

    /** 報表路徑. */
    @XmlElement(name = "ReportUrl")
    @FieldName("報表路徑")
    private String reportUrl;

    // @XmlElement(name = "feeList")
    // @FieldName("規費資料")
    // private List<Rldfu001Type> feeList;

    // @XmlElement(name = "feeSelect")
    // @FieldName("規費選擇")
    // private Rldfu001Type feeSelect;

    // @XmlElement(name = "feeCode")
    // @FieldName("規費選擇")
    // private String feeCode;

    @XmlElement(name = "cancelAgent1")
    @FieldName("取消法定代理人1")
    private boolean cancelAgent1;

    @XmlElement(name = "cancelAgent2")
    @FieldName("取消法定代理人2")
    private boolean cancelAgent2;

    // ↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓ 規費
    @XmlElement(name = "receiptId")
    @FieldName("收據號碼")
    private String receiptId;
    @XmlElement(name = "feeAmount")
    @FieldName("規費")
    private String feeAmount;
    @XmlElement(name = "freeReason")
    @FieldName("免收規費代碼")
    private String freeReason;
    @XmlElement(name = "otherFreeReason")
    @FieldName("免收規費原因")
    private String otherFreeReason;

    @XmlElement(name = "feeList")
    @FieldName("規費資料")
    private List<Rldfu001Type> feeList;
    @XmlElement(name = "feeSelect")
    @FieldName("規費選擇")
    private Rldfu001Type feeSelect;

    @XmlElement(name = "feeCode")
    @FieldName("規費選擇")
    private String feeCode;

    @XmlElement(name = "copies")
    @FieldName("份數")
    private String copies = "1";

    @XmlElement(name = "selectFree")
    @FieldName("是否免費")
    private String selectFree = "N";

    /** 是否有當事人資料. */
    @XmlElement(name = "HaveCurrentPerson")
    @FieldName("是否有當事人資料")
    private boolean haveCurrentPerson = true;

    /** 當事人姓名. */
    @XmlElement(name = "CurrentPersonName")
    @FieldName("當事人姓名")
    private String currentPersonName = "";

    /** 當事人戶籍地址. */
    @XmlElement(name = "StreetDoorplate")
    @FieldName("當事人戶籍地址")
    private String streetDoorplate = "";

    /** 當事人是否為電腦化前人口. */
    @XmlElement(name = "ComputerizedPredecessor", required = true)
    @FieldName("當事人是否為電腦化前人口")
    private boolean computerizedPredecessor = false;

    /** 申請人1是否為電腦化前人口. */
    @XmlElement(name = "Apply1ComputerizedPredecessor", required = true)
    @FieldName("申請人1是否為電腦化前人口")
    private boolean apply1ComputerizedPredecessor = false;

    /** 申請人2是否為電腦化前人口. */
    @XmlElement(name = "Apply2ComputerizedPredecessor", required = true)
    @FieldName("申請人2是否為電腦化前人口")
    private boolean apply2ComputerizedPredecessor = false;

    @XmlElement(name = "acceptSiteId")
    @FieldName("受理地代碼")
    private String acceptSiteId;
    
    // ↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑

    public boolean isCancelAgent1() {
        return cancelAgent1;
    }

    public String getReceiptId() {
        return receiptId;
    }

    public void setReceiptId(String receiptId) {
        this.receiptId = receiptId;
    }

    public String getFeeAmount() {
        return feeAmount;
    }

    public void setFeeAmount(String feeAmount) {
        this.feeAmount = feeAmount;
    }

    public String getFreeReason() {
        return freeReason;
    }

    public void setFreeReason(String freeReason) {
        this.freeReason = freeReason;
    }

    public String getOtherFreeReason() {
        return otherFreeReason;
    }

    public void setOtherFreeReason(String otherFreeReason) {
        this.otherFreeReason = otherFreeReason;
    }

    public List<Rldfu001Type> getFeeList() {
        return feeList;
    }

    public void setFeeList(List<Rldfu001Type> feeList) {
        this.feeList = feeList;
    }

    public Rldfu001Type getFeeSelect() {
        return feeSelect;
    }

    public void setFeeSelect(Rldfu001Type feeSelect) {
        this.feeSelect = feeSelect;
    }

    public String getFeeCode() {
        return feeCode;
    }

    public void setFeeCode(String feeCode) {
        this.feeCode = feeCode;
    }

    public String getCopies() {
        return copies;
    }

    public void setCopies(String copies) {
        this.copies = copies;
    }

    public String getSelectFree() {
        return selectFree;
    }

    public void setSelectFree(String selectFree) {
        this.selectFree = selectFree;
    }

    public void setCancelAgent1(boolean cancelAgent1) {
        this.cancelAgent1 = cancelAgent1;
    }

    public boolean isCancelAgent2() {
        return cancelAgent2;
    }

    public void setCancelAgent2(boolean cancelAgent2) {
        this.cancelAgent2 = cancelAgent2;
    }

    public String getRevicePeople() {
        return revicePeople;
    }

    public void setRevicePeople(String revicePeople) {
        this.revicePeople = revicePeople;
    }

    public String getCommId1() {
        return commId1;
    }

    public void setCommId1(String commId1) {
        this.commId1 = commId1;
    }

    public String getCommName1() {
        return commName1;
    }

    public void setCommName1(String commName1) {
        this.commName1 = commName1;
    }

    public String getCommId2() {
        return commId2;
    }

    public void setCommId2(String commId2) {
        this.commId2 = commId2;
    }

    public String getCommName2() {
        return commName2;
    }

    public void setCommName2(String commName2) {
        this.commName2 = commName2;
    }

    public Rldf004mType getCommDate1() {
        return commDate1;
    }

    public void setCommDate1(Rldf004mType commDate1) {
        this.commDate1 = commDate1;
    }

    public Rldf001mType getCommHousDate1() {
        return commHousDate1;
    }

    public void setCommHousDate1(Rldf001mType commHousDate1) {
        this.commHousDate1 = commHousDate1;
    }

    public Rldf004mType getCommDate2() {
        return commDate2;
    }

    public void setCommDate2(Rldf004mType commDate2) {
        this.commDate2 = commDate2;
    }

    public Rldf001mType getCommHousDate2() {
        return commHousDate2;
    }

    public void setCommHousDate2(Rldf001mType commHousDate2) {
        this.commHousDate2 = commHousDate2;
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
     * @return the personData
     */
    public XLDFPersonDataDomainObject getPersonData() {
        return personData;
    }

    /**
     * @param personData
     *            the personData to set
     */
    public void setPersonData(XLDFPersonDataDomainObject personData) {
        this.personData = personData;
    }

    /**
     * @return the houseHeadData
     */
    public XLDFPersonDataDomainObject getHouseHeadData() {
        return houseHeadData;
    }

    /**
     * @param houseHeadData
     *            the houseHeadData to set
     */
    public void setHouseHeadData(XLDFPersonDataDomainObject houseHeadData) {
        this.houseHeadData = houseHeadData;
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
     * @return the applyPerson1
     */
    public XLDFApplicantDataDTO getApplyPerson1() {
        return applyPerson1;
    }

    /**
     * @param applyPerson1
     *            the applyPerson1 to set
     */
    public void setApplyPerson1(XLDFApplicantDataDTO applyPerson1) {
        this.applyPerson1 = applyPerson1;
    }

    /**
     * @return the applyPerson1Relationship
     */
    public String getApplyPerson1Relationship() {
        return applyPerson1Relationship;
    }

    /**
     * @param applyPerson1Relationship
     *            the applyPerson1Relationship to set
     */
    public void setApplyPerson1Relationship(String applyPerson1Relationship) {
        this.applyPerson1Relationship = applyPerson1Relationship;
    }

    /**
     * @return the applyPerson2
     */
    public XLDFApplicantDataDTO getApplyPerson2() {
        return applyPerson2;
    }

    /**
     * @param applyPerson2
     *            the applyPerson2 to set
     */
    public void setApplyPerson2(XLDFApplicantDataDTO applyPerson2) {
        this.applyPerson2 = applyPerson2;
    }

    /**
     * @return the applyPerson2Relationship
     */
    public String getApplyPerson2Relationship() {
        return applyPerson2Relationship;
    }

    /**
     * @param applyPerson2Relationship
     *            the applyPerson2Relationship to set
     */
    public void setApplyPerson2Relationship(String applyPerson2Relationship) {
        this.applyPerson2Relationship = applyPerson2Relationship;
    }

    /**
     * @return the delegated
     */
    public XLDFPersonBriefDataDTO getDelegated() {
        return delegated;
    }

    /**
     * @param delegated
     *            the delegated to set
     */
    public void setDelegated(XLDFPersonBriefDataDTO delegated) {
        this.delegated = delegated;
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
     * @return the systemDate
     */
    public String getSystemDate() {
        return systemDate;
    }

    /**
     * @param systemDate
     *            the systemDate to set
     */
    public void setSystemDate(String systemDate) {
        this.systemDate = systemDate;
    }

    /**
     * @return the systemTime
     */
    public String getSystemTime() {
        return systemTime;
    }

    /**
     * @param systemTime
     *            the systemTime to set
     */
    public void setSystemTime(String systemTime) {
        this.systemTime = systemTime;
    }

    /**
     * @return the crossSiteEnabled
     */
    public boolean isCrossSiteEnabled() {
        return crossSiteEnabled;
    }

    /**
     * @param crossSiteEnabled
     *            the crossSiteEnabled to set
     */
    public void setCrossSiteEnabled(boolean crossSiteEnabled) {
        this.crossSiteEnabled = crossSiteEnabled;
    }

    /**
     * @return the sealNumber
     */
    public String getSealNumber() {
        return sealNumber;
    }

    /**
     * @param sealNumber
     *            the sealNumber to set
     */
    public void setSealNumber(String sealNumber) {
        this.sealNumber = sealNumber;
    }

    /**
     * @return the sealApplYyymmdd
     */
    public String getSealApplYyymmdd() {
        return sealApplYyymmdd;
    }

    /**
     * @param sealApplYyymmdd
     *            the sealApplYyymmdd to set
     */
    public void setSealApplYyymmdd(String sealApplYyymmdd) {
        this.sealApplYyymmdd = sealApplYyymmdd;
    }

    /**
     * @return the registerContent
     */
    public String getRegisterContent() {
        return registerContent;
    }

    /**
     * @param registerContent
     *            the registerContent to set
     */
    public void setRegisterContent(String registerContent) {
        this.registerContent = registerContent;
    }

    public List<String> getSealReason() {
        return sealReason;
    }

    public void setSealReason(List<String> sealReason) {
        this.sealReason = sealReason;
    }

    /**
     * @return the fee
     */
    public String getFee() {
        return fee;
    }

    /**
     * @param fee
     *            the fee to set
     */
    public void setFee(String fee) {
        this.fee = fee;
    }

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type
     *            the type to set
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return the registerYyymmdd
     */
    public String getRegisterYyymmdd() {
        return registerYyymmdd;
    }

    /**
     * @param registerYyymmdd
     *            the registerYyymmdd to set
     */
    public void setRegisterYyymmdd(String registerYyymmdd) {
        this.registerYyymmdd = registerYyymmdd;
    }

    public List<RlWarningMessage> getWarningMessgeList() {
        return warningMessgeList;
    }

    public void setWarningMessgeList(List<RlWarningMessage> warningMessgeList) {
        this.warningMessgeList = warningMessgeList;
    }

    public boolean isPrintMark() {
        return printMark;
    }

    public void setPrintMark(boolean printMark) {
        this.printMark = printMark;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    /*    *//**
     * Gets the free reason code.
     * 
     * @return the free reason code
     */
    /*
     * public String getFreeReasonCode() { return freeReasonCode; }
     *//**
     * Sets the free reason code.
     * 
     * @param freeReasonCode
     *            the new free reason code
     */
    /*
     * public void setFreeReasonCode(String freeReasonCode) {
     * this.freeReasonCode = freeReasonCode; }
     */

    public String getOtherCertificateCode() {
        return otherCertificateCode;
    }

    public void setOtherCertificateCode(String otherCertificateCode) {
        this.otherCertificateCode = otherCertificateCode;
    }

    public boolean isOtherCertificateShow() {
        return otherCertificateShow;
    }

    public void setOtherCertificateShow(boolean otherCertificateShow) {
        this.otherCertificateShow = otherCertificateShow;
    }

    public String getMoveOutType() {
        return moveOutType;
    }

    public void setMoveOutType(String moveOutType) {
        this.moveOutType = moveOutType;
    }

    public String getReportUrl() {
        return reportUrl;
    }

    public void setReportUrl(String reportUrl) {
        this.reportUrl = reportUrl;
    }

    public String getSealReasonOther() {
        return sealReasonOther;
    }

    public void setSealReasonOther(String sealReasonOther) {
        this.sealReasonOther = sealReasonOther;
    }

    public boolean isOtherSealReasonOtherShow() {
        return otherSealReasonOtherShow;
    }

    public void setOtherSealReasonOtherShow(boolean otherSealReasonOtherShow) {
        this.otherSealReasonOtherShow = otherSealReasonOtherShow;
    }

    public boolean isHaveCurrentPerson() {
        return haveCurrentPerson;
    }

    public void setHaveCurrentPerson(boolean haveCurrentPerson) {
        this.haveCurrentPerson = haveCurrentPerson;
    }

    public String getCurrentPersonName() {
        return currentPersonName;
    }

    public void setCurrentPersonName(String currentPersonName) {
        this.currentPersonName = currentPersonName;
    }

    public String getStreetDoorplate() {
        return streetDoorplate;
    }

    public void setStreetDoorplate(String streetDoorplate) {
        this.streetDoorplate = streetDoorplate;
    }

    public boolean isComputerizedPredecessor() {
        return computerizedPredecessor;
    }

    public void setComputerizedPredecessor(boolean apply1ComputerizedPredecessor) {
        this.apply1ComputerizedPredecessor = apply1ComputerizedPredecessor;
    }

    public boolean isApply1ComputerizedPredecessor() {
        return apply1ComputerizedPredecessor;
    }

    public void setApply1ComputerizedPredecessor(boolean apply1ComputerizedPredecessor) {
        this.apply1ComputerizedPredecessor = apply1ComputerizedPredecessor;
    }

    public boolean isApply2ComputerizedPredecessor() {
        return apply2ComputerizedPredecessor;
    }

    public void setApply2ComputerizedPredecessor(boolean apply2ComputerizedPredecessor) {
        this.apply2ComputerizedPredecessor = apply2ComputerizedPredecessor;
    }

	public String getAcceptSiteId() {
		return acceptSiteId;
	}

	public void setAcceptSiteId(String acceptSiteId) {
		this.acceptSiteId = acceptSiteId;
	}
}

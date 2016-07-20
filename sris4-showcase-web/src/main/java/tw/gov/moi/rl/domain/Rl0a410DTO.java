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
import tw.gov.moi.domain.Rlde009eType;
import tw.gov.moi.domain.Rldf009eType;
import tw.gov.moi.domain.Rldfd008Type;
import tw.gov.moi.domain.Rldfd009Type;

/**
 * 製作罰鍰處理 DTO.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl0a410DTO", propOrder = { "PersonId", "PersonId2", "RegisterDate", "Document", "TransactionCaseCode",
        "ApplyCaseCode", "PersonName", "FineId3", "FineId4", "OverDate", "NoticeCount", "EndingDate", "IncidentDate",
        "FinePrice", "BirthYymmdd", "Gender", "AssognAddr", "Village", "Neighbor", "StreetDoorplate",
        "HouseholdHeadId", "HouseholdHeadName", "TransactionId", "Gist", "Fact", "Law", "LawList", "Annotation",
        "Rldf009eList", "Rldf009e", "Rlde009eList", "reportUrl", "reportFeeUrl", "fineMasterId", "fineType",
        "fineTypeList"})
@XmlRootElement(name = "Rl0a410DTO")
public class Rl0a410DTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** 統號 / 受罰人統號1 */
    @XmlElement(name = "PersonId")
    @FieldName("統號 / 受罰人統號1")
    private String personId = "";

    /** 統號 / 受罰人戶籍地 */
    @XmlElement(name = "PersonSiteId")
    @FieldName("統號 / 受罰人戶籍地")
    private String personSiteId = "";

    /** 統號 / 受罰人統號2 */
    @XmlElement(name = "PersonId2")
    @FieldName("統號 / 受罰人統號2")
    private String personId2 = "";

    /** 開單日期 */
    @XmlElement(name = "RegisterDate")
    @FieldName("開單日期")
    private String registerDate = "";

    /** 罰鍰字號 */
    @XmlElement(name = "Document")
    @FieldName("罰鍰字號")
    private String document = "";

    /** 罰鍰書類別 */
    @XmlElement(name = "TransactionCaseCode")
    @FieldName("罰鍰書類別")
    private String transactionCaseCode = "";

    /** 申登案別 */
    @XmlElement(name = "ApplyCaseCode")
    @FieldName("申登案別")
    private String applyCaseCode = "";

    /** 受罰人姓名 */
    @XmlElement(name = "PersonName")
    @FieldName("受罰人姓名")
    private String personName = "";

    /** 不實原因 */
    @XmlElement(name = "FineId3")
    @FieldName("不實原因")
    private String fineId3 = "";

    /** 原因 */
    @XmlElement(name = "FineId4")
    @FieldName("原因")
    private String fineId4 = "";

    /** 逾期天數 */
    @XmlElement(name = "OverDate")
    @FieldName("逾期天數")
    private String overDate = "";

    /** 通知次數 */
    @XmlElement(name = "NoticeCount")
    @FieldName("通知次數")
    private String noticeCount = "";

    /** 申登期限 */
    @XmlElement(name = "EndingDate")
    @FieldName("申登期限")
    private String endingDate = "";

    /** 發生日期 */
    @XmlElement(name = "IncidentDate")
    @FieldName("發生日期")
    private String incidentDate = "";

    /** 罰鍰金額 */
    @XmlElement(name = "FinePrice")
    @FieldName("罰鍰金額")
    private String finePrice = "";

    /** 出生日期 */
    @XmlElement(name = "BirthYymmdd")
    @FieldName("出生日期")
    private String birthYymmdd = "";

    /** 性別 */
    @XmlElement(name = "Gender")
    @FieldName("性別")
    private String gender = "";

    /** 居住所 */
    @XmlElement(name = "AssignAddr")
    @FieldName("居住所")
    private String assignAddr = "";

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

    /** 戶長統號 */
    @XmlElement(name = "HouseholdHeadId")
    @FieldName("戶長統號")
    private String householdHeadId = "";

    /** 戶長姓名 */
    @XmlElement(name = "HouseholdHeadName")
    @FieldName("戶長姓名")
    private String householdHeadName = "";

    /** 罰鍰個案交易序號 */
    @XmlElement(name = "TransactionId")
    @FieldName("罰鍰個案交易序號")
    private String transactionId = "";

    /** 主旨 */
    @XmlElement(name = "Gist")
    @FieldName("主旨")
    private String gist = "";

    /** 事實 */
    @XmlElement(name = "Fact")
    @FieldName("事實")
    private String fact = "";

    /** 法令依據及理由 */
    @XmlElement(name = "Law")
    @FieldName("法令依據及理由")
    private String law = "";

    /** 法令依據及理由 */
    @XmlElement(name = "Law")
    @FieldName("法令依據及理由")
    private String acceptSiteId = "";

    /** 法令依據及理由列表 */
    @XmlElement(name = "LawList")
    @FieldName("法令依據及理由列表")
    private List<Rldfd009Type> lawList = new ArrayList<Rldfd009Type>();

    /** 附註 */
    @XmlElement(name = "Annotation")
    @FieldName("附註")
    private String annotation = "";

    /** Rldf009eList 資料列表 */
    @XmlElement(name = "Rldf009eList")
    @FieldName("Rldf009eList  資料列表")
    private List<Rldf009eType> rldf009eList = new ArrayList<Rldf009eType>();

    /** Rldf009e 資料內容 */
    @XmlElement(name = "Rldf009e")
    @FieldName("Rldf009e  資料內容")
    private Rldf009eType selected = new Rldf009eType();

    /** Rldf009e 資料內容 */
    @XmlElement(name = "PaymentWay")
    @FieldName("paymentWay  繳費方式")
    private String paymentWay = "1";

    /** 催告日期 */
    @XmlElement(name = "SummonDate")
    @FieldName("催告日期")
    private String summonDate = "";

    /** Rlde009e 資料列表 */
    @XmlElement(name = "Rlde009eList")
    @FieldName("Rlde009e  資料列表")
    private List<Rlde009eType> rlde009eList = new ArrayList<Rlde009eType>();

    /** 罰鍰細項ID */
    @XmlElement(name = "FineId")
    @FieldName("罰鍰細項ID")
    private String fineId;

    /** 收據編號 */
    @XmlElement(name = "ReceiptId")
    @FieldName("收據編號")
    private String receiptId;

    /** 舊收據編號 */
    @XmlElement(name = "OldReceiptId")
    @FieldName("舊收據編號")
    private String oldReceiptId;

    /** 報表路徑 */
    @XmlElement(name = "ReportUrl")
    @FieldName("報表路徑")
    private String reportUrl;

    /** 規費報表路徑 */
    @XmlElement(name = "ReportFeeUrl")
    @FieldName("規費報表路徑")
    private String reportFeeUrl;

    /** fineMasterId */
    @XmlElement(name = "FineMasterId")
    @FieldName("fineMasterId")
    private String fineMasterId;

    /** fineType */
    @XmlElement(name = "FineType")
    @FieldName("fineType")
    private String fineType;

    /** 修改罰鍰金額 */
    @XmlElement(name = "ModifyFinePrice")
    @FieldName("修改罰鍰金額")
    private String modifyFinePrice;

    /** 修改申登案別 */
    @XmlElement(name = "modifyApplyCaseCode")
    @FieldName("修改申登案別")
    private String modifyApplyCaseCode;

    /** 合併後申登案別 */
    @XmlElement(name = "mergerApplyCaseCode")
    @FieldName("合併後申登案別")
    private String mergerApplyCaseCode;

    /** fineType */
    @XmlElement(name = "FineTypeList")
    @FieldName("fineTypeList")
    private List<Rldfd008Type> fineTypeList;

    /** fineType */
    @XmlElement(name = "SiteIdFind")
    @FieldName("siteIdFind")
    private String siteIdFind;
    
    public String getPaymentWay() {
        return paymentWay;
    }

    public void setPaymentWay(String paymentWay) {
        this.paymentWay = paymentWay;
    }

    public String getOldReceiptId() {
        return oldReceiptId;
    }

    public void setOldReceiptId(String oldReceiptId) {
        this.oldReceiptId = oldReceiptId;
    }

    public String getReceiptId() {
        return receiptId;
    }

    public void setReceiptId(String receiptId) {
        this.receiptId = receiptId;
    }

    public String getFineId() {
        return fineId;
    }

    public void setFineId(String fineId) {
        this.fineId = fineId;
    }

    public String getPersonId() {
        return personId;
    }

    public void setPersonId(String personId) {
        this.personId = personId;
    }

    public String getPersonSiteId() {
        return personSiteId;
    }

    public void setPersonSiteId(String personSiteId) {
        this.personSiteId = personSiteId;
    }

    public String getPersonId2() {
        return personId2;
    }

    public void setPersonId2(String personId2) {
        this.personId2 = personId2;
    }

    public String getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(String registerDate) {
        this.registerDate = registerDate;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public String getTransactionCaseCode() {
        return transactionCaseCode;
    }

    public void setTransactionCaseCode(String transactionCaseCode) {
        this.transactionCaseCode = transactionCaseCode;
    }

    public String getApplyCaseCode() {
        return applyCaseCode;
    }

    public void setApplyCaseCode(String applyCaseCode) {
        this.applyCaseCode = applyCaseCode;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getFineId3() {
        return fineId3;
    }

    public void setFineId3(String fineId3) {
        this.fineId3 = fineId3;
    }

    public String getFineId4() {
        return fineId4;
    }

    public void setFineId4(String fineId4) {
        this.fineId4 = fineId4;
    }

    public String getOverDate() {
        return overDate;
    }

    public void setOverDate(String overDate) {
        this.overDate = overDate;
    }

    public String getNoticeCount() {
        return noticeCount;
    }

    public void setNoticeCount(String noticeCount) {
        this.noticeCount = noticeCount;
    }

    public String getEndingDate() {
        return endingDate;
    }

    public void setEndingDate(String endingDate) {
        this.endingDate = endingDate;
    }

    public String getIncidentDate() {
        return incidentDate;
    }

    public void setIncidentDate(String incidentDate) {
        this.incidentDate = incidentDate;
    }

    public String getFinePrice() {
        return finePrice;
    }

    public void setFinePrice(String finePrice) {
        this.finePrice = finePrice;
    }

    public String getBirthYymmdd() {
        return birthYymmdd;
    }

    public void setBirthYymmdd(String birthYymmdd) {
        this.birthYymmdd = birthYymmdd;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAssignAddr() {
        return assignAddr;
    }

    public void setAssignAddr(String assignAddr) {
        this.assignAddr = assignAddr;
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

    public String getHouseholdHeadId() {
        return householdHeadId;
    }

    public void setHouseholdHeadId(String householdHeadId) {
        this.householdHeadId = householdHeadId;
    }

    public String getHouseholdHeadName() {
        return householdHeadName;
    }

    public void setHouseholdHeadName(String householdHeadName) {
        this.householdHeadName = householdHeadName;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getGist() {
        return gist;
    }

    public void setGist(String gist) {
        this.gist = gist;
    }

    public String getFact() {
        return fact;
    }

    public void setFact(String fact) {
        this.fact = fact;
    }

    public String getLaw() {
        return law;
    }

    public void setLaw(String law) {
        this.law = law;
    }

    public List<Rldfd009Type> getLawList() {
        return lawList;
    }

    public void setLawList(List<Rldfd009Type> lawList) {
        this.lawList = lawList;
    }

    public String getAnnotation() {
        return annotation;
    }

    public void setAnnotation(String annotation) {
        this.annotation = annotation;
    }

    public List<Rldf009eType> getRldf009eList() {
        return rldf009eList;
    }

    public void setRldf009eList(List<Rldf009eType> rldf009eList) {
        this.rldf009eList = rldf009eList;
    }

    public Rldf009eType getSelected() {
        return selected;
    }

    public void setSelected(Rldf009eType selected) {
        this.selected = selected;
    }

    public List<Rlde009eType> getRlde009eList() {
        return rlde009eList;
    }

    public void setRlde009eList(List<Rlde009eType> rlde009eList) {
        this.rlde009eList = rlde009eList;
    }

    public String getSummonDate() {
        return summonDate;
    }

    public void setSummonDate(String summonDate) {
        this.summonDate = summonDate;
    }

    public String getReportUrl() {
        return reportUrl;
    }

    public void setReportUrl(String reportUrl) {
        this.reportUrl = reportUrl;
    }

    public String getReportFeeUrl() {
        return reportFeeUrl;
    }

    public void setReportFeeUrl(String reportFeeUrl) {
        this.reportFeeUrl = reportFeeUrl;
    }

    public String getFineMasterId() {
        return fineMasterId;
    }

    public void setFineMasterId(String fineMasterId) {
        this.fineMasterId = fineMasterId;
    }

    public String getFineType() {
        return fineType;
    }

    public void setFineType(String fineType) {
        this.fineType = fineType;
    }

    public List<Rldfd008Type> getFineTypeList() {
        return fineTypeList;
    }

    public void setFineTypeList(List<Rldfd008Type> fineTypeList) {
        this.fineTypeList = fineTypeList;
    }

    public String getModifyFinePrice() {
        return modifyFinePrice;
    }

    public void setModifyFinePrice(String modifyFinePrice) {
        this.modifyFinePrice = modifyFinePrice;
    }

    public String getModifyApplyCaseCode() {
        return modifyApplyCaseCode;
    }

    public void setModifyApplyCaseCode(String modifyApplyCaseCode) {
        this.modifyApplyCaseCode = modifyApplyCaseCode;
    }

    public String getMergerApplyCaseCode() {
        return mergerApplyCaseCode;
    }

    public void setMergerApplyCaseCode(String mergerApplyCaseCode) {
        this.mergerApplyCaseCode = mergerApplyCaseCode;
    }

    public String getAcceptSiteId() {
        return acceptSiteId;
    }

    public void setAcceptSiteId(String acceptSiteId) {
        this.acceptSiteId = acceptSiteId;
    }

    public String getSiteIdFind() {
        return siteIdFind;
    }

    public void setSiteIdFind(String siteIdFind) {
        this.siteIdFind = siteIdFind;
    }
}

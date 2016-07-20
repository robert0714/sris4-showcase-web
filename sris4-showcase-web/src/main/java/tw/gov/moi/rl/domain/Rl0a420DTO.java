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
import tw.gov.moi.domain.Rldfd009Type;
import tw.gov.moi.domain.Xldf004mType;
import tw.gov.moi.rl.domain.xldf.XLDFHouseholdDataDomainObject;
import tw.gov.moi.rl.domain.xldf.XLDFPersonDataDomainObject;

/**
 * 製作罰鍰處理 DTO.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl0a420DTO", propOrder = { "PersonId", "PersonSiteId", "PersonId2", "RegisterDate", "Document",
        "TransactionCaseCode", "ApplyCaseCode", "PersonName", "FineId3", "FineId4", "OverDate", "NoticeCount",
        "EndingDate", "IncidentDate", "FinePrice", "BirthYymmdd", "Gender", "AssognAddr", "Village", "Neighbor",
        "StreetDoorplate", "HouseholdHeadId", "HouseholdHeadName", "TransactionId", "Gist", "Fact", "Law", "LawList",
        "Annotation", "Rldf009eList", "Rldf009e", "Rlde009eList" })
@XmlRootElement(name = "Rl0a420DTO")
public class Rl0a420DTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** 統號 / 受罰人統號 */
    @XmlElement(name = "PersonId")
    @FieldName("統號 / 受罰人統號1")
    private String personId = "";

    /** 統號 / 受罰人戶籍地 */
    @XmlElement(name = "PersonSiteId")
    @FieldName("統號 / 受罰人戶籍地")
    private String personSiteId = "";

    /** 統號 / 受罰人統號 */
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

    /** 罰鍰流水號 */
    @XmlElement(name = "SeriesNo")
    @FieldName("罰鍰流水號")
    private String seriesNo = "";

    /** 罰鍰書類別 */
    @XmlElement(name = "TransactionCaseCode")
    @FieldName("罰鍰書類別")
    private String transactionCaseCode = "";

    /** 大簿申登案別 */
    @XmlElement(name = "ApplyCaseCode")
    @FieldName("大簿申登案別")
    private String applyCaseCode = "";

    /** 罰鍰申登案別 */
    @XmlElement(name = "FincaseNo")
    @FieldName("罰鍰申登案別")
    private String fincaseNo = "";

    /** 受罰人姓名 */
    @XmlElement(name = "PersonName")
    @FieldName("受罰人姓名")
    private String personName = "";

    /** 逾期天數 */
    @XmlElement(name = "OverDate")
    @FieldName("逾期天數")
    private String overDate = "";

    /** 通知次數 */
    @XmlElement(name = "NoticeCount")
    @FieldName("通知次數")
    private String noticeCount = "";

    /** 申登期限 (迄) */
    @XmlElement(name = "EndingDate")
    @FieldName("申登期限(迄)")
    private String endingDate = "";

    /** 申登期限 (起) */
    @XmlElement(name = "LegalStart")
    @FieldName("申登期限(起) ")
    private String legalStart = "";

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

    /** 大簿XLDF交易序號 */
    @XmlElement(name = "TransactionId")
    @FieldName("大簿XLDF交易序號")
    private String transactionId = "";

    /** 罰鍰自己的交易序號 */
    @XmlElement(name = "FineId")
    @FieldName("罰鍰交易序號")
    private String fineId;

    /** 罰緩名稱對應規費名稱 */
    @XmlElement(name = "FineNmae")
    @FieldName("罰緩名稱對應規費名稱")
    private String fineNmae;

    /** 報表url */
    @XmlElement(name = "reportURL")
    @FieldName("報表url")
    private String reportURL;

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

    /** Rlde009e 資料列表 */
    @XmlElement(name = "Rlde009eList")
    @FieldName("Rlde009e  資料列表")
    private List<Rlde009eType> rlde009eList = new ArrayList<Rlde009eType>();

    /** 作業順序編號 */
    @XmlElement(name = "OpertionSequenceID")
    @FieldName("作業順序編號")
    private String opertionSequenceID;

    /** 作業編號不含系統碼 */
    @XmlElement(name = "OpertionName")
    @FieldName("作業編號不含系統碼")
    private String opertionName;

    /** 當事人-個人基本資料 */
    @XmlElement(name = "PersonData", required = true)
    @FieldName("當事人-個人基本資料")
    private XLDFPersonDataDomainObject personData;

    /** 作業指定罰鍰人-個人基本資料 */
    @XmlElement(name = "FinePersonData", required = true)
    @FieldName("作業指定罰鍰人-個人基本資料")
    private Xldf004mType finePersonData;

    /** 當事人-全戶基本資料 */
    @XmlElement(name = "HouseData", required = true)
    @FieldName("當事人-全戶基本資料")
    private XLDFHouseholdDataDomainObject houseData;

    /** 申請書代碼 */
    @XmlElement(name = "ApplyCaseNo", required = true)
    @FieldName("申請書代碼")
    private String applyCaseNo;

    /** 規費收據號碼 */
    @XmlElement(name = "ReceiptId", required = true)
    @FieldName("規費收據號碼")
    private String receiptId;

    /** 申請書作業編號 */
    @XmlElement(name = "ApplySequenceId", required = true)
    @FieldName("申請書作業編號")
    private String applySequenceId;

    /** 當事人最後資料儲存地作業點代碼 */
    @XmlElement(name = "ApplySiteId", required = true)
    @FieldName("當事人作業點代碼")
    private String applySiteId;

    /** 當事人統號 */
    @XmlElement(name = "applyPersonId", required = true)
    @FieldName("當事人統號")
    private String applyPersonId;

    /** 申請書流水號 */
    @XmlElement(name = "ApplySeq", required = true)
    @FieldName("申請書流水號")
    private String applySeq;

    /** 當事人dto */
    @XmlElement(name = "XldfTxnPersonDTO", required = true)
    @FieldName("當事人dto")
    private XLDFTxnPersonDTO xldfTxnPersonDTO;

    @XmlElement(name = "apply1", required = true)
    @FieldName("申請人1")
    private XLDFApplicantDataDTO apply1;

    @XmlElement(name = "apply2", required = true)
    @FieldName("申請人2")
    private XLDFApplicantDataDTO apply2;

    @XmlElement(name = "FilterClass", required = true)
    @FieldName("4M類型")
    private Object filterClass;

    @XmlElement(name = "removeYyymmdd", required = true)
    @FieldName("儲戶日期")
    private String removeYyymmdd;

    @XmlElement(name = "removeTime", required = true)
    @FieldName("儲戶時間")
    private String removeTime;

    public String getRemoveYyymmdd() {
        return removeYyymmdd;
    }

    public void setRemoveYyymmdd(String removeYyymmdd) {
        this.removeYyymmdd = removeYyymmdd;
    }

    public String getRemoveTime() {
        return removeTime;
    }

    public void setRemoveTime(String removeTime) {
        this.removeTime = removeTime;
    }

    public Object getFilterClass() {
        return filterClass;
    }

    public void setFilterClass(Object filterClass) {
        this.filterClass = filterClass;
    }

    public String getReportURL() {
        return reportURL;
    }

    public void setReportURL(String reportURL) {
        this.reportURL = reportURL;
    }

    public String getFineId() {
        return fineId;
    }

    public void setFineId(String fineId) {
        this.fineId = fineId;
    }

    public String getFineNmae() {
        return fineNmae;
    }

    public void setFineNmae(String fineNmae) {
        this.fineNmae = fineNmae;
    }

    public String getSeriesNo() {
        return seriesNo;
    }

    public void setSeriesNo(String seriesNo) {
        this.seriesNo = seriesNo;
    }

    public XLDFTxnPersonDTO getXldfTxnPersonDTO() {
        return xldfTxnPersonDTO;
    }

    public void setXldfTxnPersonDTO(XLDFTxnPersonDTO xldfTxnPersonDTO) {
        this.xldfTxnPersonDTO = xldfTxnPersonDTO;
    }

    public String getApplyCaseNo() {
        return applyCaseNo;
    }

    public void setApplyCaseNo(String applyCaseNo) {
        this.applyCaseNo = applyCaseNo;
    }

    public String getReceiptId() {
        return receiptId;
    }

    public void setReceiptId(String receiptId) {
        this.receiptId = receiptId;
    }

    public String getApplySequenceId() {
        return applySequenceId;
    }

    public void setApplySequenceId(String applySequenceId) {
        this.applySequenceId = applySequenceId;
    }

    public String getApplySiteId() {
        return applySiteId;
    }

    public void setApplySiteId(String applySiteId) {
        this.applySiteId = applySiteId;
    }

    public String getApplyPersonId() {
        return applyPersonId;
    }

    public void setApplyPersonId(String applyPersonId) {
        this.applyPersonId = applyPersonId;
    }

    public String getApplySeq() {
        return applySeq;
    }

    public void setApplySeq(String applySeq) {
        this.applySeq = applySeq;
    }

    public String getOpertionName() {
        return opertionName;
    }

    public void setOpertionName(String opertionName) {
        this.opertionName = opertionName;
    }

    public XLDFPersonDataDomainObject getPersonData() {
        return personData;
    }

    public void setPersonData(XLDFPersonDataDomainObject personData) {
        this.personData = personData;
    }

    public XLDFHouseholdDataDomainObject getHouseData() {
        return houseData;
    }

    public void setHouseData(XLDFHouseholdDataDomainObject houseData) {
        this.houseData = houseData;
    }

    public String getOpertionSequenceID() {
        return opertionSequenceID;
    }

    public void setOpertionSequenceID(String opertionSequenceID) {
        this.opertionSequenceID = opertionSequenceID;
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

    public String getFincaseNo() {
        return fincaseNo;
    }

    public void setFincaseNo(String fincaseNo) {
        this.fincaseNo = fincaseNo;
    }

    public String getLegalStart() {
        return legalStart;
    }

    public void setLegalStart(String legalStart) {
        this.legalStart = legalStart;
    }

    public XLDFApplicantDataDTO getApply1() {
        return apply1;
    }

    public void setApply1(XLDFApplicantDataDTO apply1) {
        this.apply1 = apply1;
    }

    public XLDFApplicantDataDTO getApply2() {
        return apply2;
    }

    public void setApply2(XLDFApplicantDataDTO apply2) {
        this.apply2 = apply2;
    }

    public Xldf004mType getFinePersonData() {
        return finePersonData;
    }

    public void setFinePersonData(Xldf004mType finePersonData) {
        this.finePersonData = finePersonData;
    }

}

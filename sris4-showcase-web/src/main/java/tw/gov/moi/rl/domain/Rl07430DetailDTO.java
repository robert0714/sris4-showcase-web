package tw.gov.moi.rl.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;

import tw.gov.moi.ae.checker.annotation.FieldName;
import tw.gov.moi.dbo.entity.SelectEntity;
import tw.gov.moi.domain.Rlde019eType;

/**
 * Rl07430DetailDTO
 * 
 * @author Alan Lo
 */
public class Rl07430DetailDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    /** 統號 / 催告對象統號 */
    @XmlElement(name = "PersonId")
    @FieldName("統號 / 催告對象統號")
    private String personId;

    /** 開單日期(起) */
    @XmlElement(name = "RegisterDateStart")
    @FieldName("開單日期(起)")
    private String registerDateStart;

    /** 開單日期 (迄) */
    @XmlElement(name = "RegisterDateEnd")
    @FieldName("開單日期 (迄)")
    private String registerDateEnd;

    /** 開單日期 (迄) */
    @XmlElement(name = "RegisterDate")
    @FieldName("開單日期 (迄)")
    private String registerDate;

    /** 催告文號 */
    @XmlElement(name = "Document")
    @FieldName("催告文號")
    private String document;

    /** 催告書類別 */
    @XmlElement(name = "TransactionCaseCode")
    @FieldName("催告書類別")
    private String transactionCaseCode;

    /** 申登案別 */
    @XmlElement(name = "ApplyCaseCode")
    @FieldName("申登案別")
    private String applyCaseCode;

    /** 催告對象姓名 */
    @XmlElement(name = "PersonName")
    @FieldName("催告對象姓名")
    private String personName;

    /** 催告對象出生日期 */
    @XmlElement(name = "BirthYyymmdd")
    @FieldName("催告對象出生日期")
    private String birthYyymmdd;

    /** 催告對象性別 */
    @XmlElement(name = "Gender")
    @FieldName("催告對象性別")
    private String gender;

    /** 申登期限 */
    @XmlElement(name = "EndingDate")
    @FieldName("申登期限")
    private String endingDate;

    /** 居住所/戶籍地 */
    @XmlElement(name = "AssignAddr")
    @FieldName("居住所/戶籍地")
    private String assignAddr;

    /** 出境人員序號 */
    @XmlElement(name = "EmigrateNo")
    @FieldName("出境人員序號")
    private String emigrateNo;

    /** 出境人員統號 */
    @XmlElement(name = "EmigrateId")
    @FieldName("出境人員統號")
    private String emigrateId;

    /** 出境人員姓名 */
    @XmlElement(name = "EmigrateName")
    @FieldName("出境人員姓名")
    private String emigrateName;

    /** 催告個案交易序號 */
    @XmlElement(name = "TransactionId")
    @FieldName("催告個案交易序號")
    private String transactionId;

    /** 催告個案交易序號 */
    @XmlElement(name = "TransactionId")
    @FieldName("催告個案交易序號")
    private String fineTransactionId;

    /** 主旨 */
    @XmlElement(name = "Gist")
    @FieldName("主旨")
    private String gist;

    /** 事實 */
    @XmlElement(name = "Fact")
    @FieldName("事實")
    private String fact;

    /** 法令依據及理由 */
    @XmlElement(name = "Laws")
    @FieldName("法令依據及理由")
    private String laws;

    /** 附註 */
    @XmlElement(name = "Annotation")
    @FieldName("附註")
    private String annotation;

    /** 村里 */
    @XmlElement(name = "Village")
    @FieldName("村里")
    private String village;

    /** Query Result List */
    @XmlElement(name = "ResultList")
    @FieldName("存放Rlde019eType資料")
    private List<SelectEntity<Rlde019eType>> rlde019eList = new ArrayList<SelectEntity<Rlde019eType>>();

    public String getPersonId() {
        return personId;
    }

    public void setPersonId(String personId) {
        this.personId = personId;
    }

    public String getRegisterDateStart() {
        return registerDateStart;
    }

    public void setRegisterDateStart(String registerDateStart) {
        this.registerDateStart = registerDateStart;
    }

    public String getRegisterDateEnd() {
        return registerDateEnd;
    }

    public void setRegisterDateEnd(String registerDateEnd) {
        this.registerDateEnd = registerDateEnd;
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

    public String getBirthYyymmdd() {
        return birthYyymmdd;
    }

    public void setBirthYyymmdd(String birthYyymmdd) {
        this.birthYyymmdd = birthYyymmdd;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEndingDate() {
        return endingDate;
    }

    public void setEndingDate(String endingDate) {
        this.endingDate = endingDate;
    }

    public String getAssignAddr() {
        return assignAddr;
    }

    public void setAssignAddr(String assignAddr) {
        this.assignAddr = assignAddr;
    }

    public String getEmigrateNo() {
        return emigrateNo;
    }

    public void setEmigrateNo(String emigrateNo) {
        this.emigrateNo = emigrateNo;
    }

    public String getEmigrateId() {
        return emigrateId;
    }

    public void setEmigrateId(String emigrateId) {
        this.emigrateId = emigrateId;
    }

    public String getEmigrateName() {
        return emigrateName;
    }

    public void setEmigrateName(String emigrateName) {
        this.emigrateName = emigrateName;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getFineTransactionId() {
        return fineTransactionId;
    }

    public void setFineTransactionId(String fineTransactionId) {
        this.fineTransactionId = fineTransactionId;
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

    public String getLaws() {
        return laws;
    }

    public void setLaws(String laws) {
        this.laws = laws;
    }

    public String getAnnotation() {
        return annotation;
    }

    public void setAnnotation(String annotation) {
        this.annotation = annotation;
    }

    public String getVillage() {
        return village;
    }

    public void setVillage(String village) {
        this.village = village;
    }

    public List<SelectEntity<Rlde019eType>> getRlde019eList() {
        return rlde019eList;
    }

    public void setRlde019eList(List<SelectEntity<Rlde019eType>> rlde019eList) {
        this.rlde019eList = rlde019eList;
    }

}

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
import java.util.concurrent.atomic.AtomicInteger;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;
import tw.gov.moi.domain.Rldfg002Type;

/**
 * The Class Rl01k00DTO.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl01k00DTO", propOrder = { "transactionId", "areaCode", "adminOfficceCode", "adminOfficeName",
        "applyCaseCode", "applyCaseName", "option", "applyId", "applySiteId", "applyName", "personId", "personSiteId",
        "personName", "phoneNumber", "document", "registrarName", "adminOfficePhone", "adminOfficeUrl", "registerDate",
        "optionName", "reportURL", "saveButton", "deleteDate", "aCount", "bCount", "rl01k00List", "necessaryList",
        "certificateList", "payList", "noticeList", "chosenCcertificateList", "chosenPayList", "chosenNoticeList",
        "rldfg002List" })
@XmlRootElement(name = "Rl01k00DTO")
public class Rl01k00DTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** 告知單個案交易序號. */
    @XmlElement(name = "TransactionId")
    @FieldName("告知單個案交易序號")
    private String transactionId;

    /** 行政區域代碼. */
    @XmlElement(name = "AreaCode")
    @FieldName("行政區域代碼")
    private String areaCode;

    /** 戶所代碼. */
    @XmlElement(name = "AdminOfficceCode")
    @FieldName("戶所代碼")
    private String adminOfficceCode;

    /** 戶所名稱. */
    @XmlElement(name = "AdminOfficeName")
    @FieldName("戶所名稱")
    private String adminOfficeName;

    /** 申登案由代碼. */
    @XmlElement(name = "ApplyCaseCode")
    @FieldName("申登案由代碼")
    private String applyCaseCode;

    /** 申登案由名稱. */
    @XmlElement(name = "ApplyCaseName")
    @FieldName("申登案由名稱")
    private String applyCaseName;

    /** 案由辦理戶所. */
    @XmlElement(name = "Option")
    @FieldName("案由辦理戶所")
    private String option;

    /** 申請人統號. */
    @XmlElement(name = "ApplyId")
    @FieldName("申請人統號")
    private String applyId;

    /** 申請人作業點代碼. */
    @XmlElement(name = "ApplySiteId")
    @FieldName("申請人作業點代碼")
    private String applySiteId;

    /** 申請人姓名. */
    @XmlElement(name = "ApplyName")
    @FieldName("申請人姓名")
    private String applyName;

    /** 當事人統號. */
    @XmlElement(name = "PersonId")
    @FieldName("當事人統號")
    private String personId;

    /** 當事人作業點代碼. */
    @XmlElement(name = "personSiteId")
    @FieldName("當事人作業點代碼")
    private String personSiteId;

    /** 當事人姓名. */
    @XmlElement(name = "PersonName")
    @FieldName("當事人姓名")
    private String personName;

    /** 當事人電話. */
    @XmlElement(name = "PhoneNumber")
    @FieldName("當事人電話")
    private String phoneNumber;

    /** 開立字號. */
    @XmlElement(name = "Document")
    @FieldName("開立字號")
    private String document;

    /** 戶籍員姓名. */
    @XmlElement(name = "RegistrarName")
    @FieldName("戶籍員姓名")
    private String registrarName;

    /** 戶所電話. */
    @XmlElement(name = "AdminOfficePhone")
    @FieldName("戶所電話")
    private String adminOfficePhone;

    /** 戶所網址. */
    @XmlElement(name = "AdminOfficeUrl")
    @FieldName("戶所網址")
    private String adminOfficeUrl;

    /** 開立日期. */
    @XmlElement(name = "RegisterDate")
    @FieldName("開立日期")
    private String registerDate;

    /** 案由辦理戶所名稱. */
    @XmlElement(name = "OptionName")
    @FieldName("案由辦理戶所名稱")
    private String optionName;

    /** 報表URL. */
    @XmlElement(name = "ReportURL")
    @FieldName("報表URL")
    private String reportURL;

    /** 控制「儲存」按鈕. */
    @XmlElement(name = "SaveButton")
    @FieldName("控制「儲存」按鈕")
    private Boolean saveButton;

    /** 案由日期期限. */
    @XmlElement(name = "DeleteDate")
    @FieldName("案由日期期限")
    private String deleteDate;

    /** 計數A. */
    @XmlElement(name = "CertificateCountA")
    @FieldName("計數A")
    private AtomicInteger certificateCountA = new AtomicInteger(0);

    /** 計數B. */
    @XmlElement(name = "CertificateCountB")
    @FieldName("計數B")
    private AtomicInteger certificateCountB = new AtomicInteger(0);

    /** rl01k00清單. */
    @XmlElement(name = "Rl01k00List")
    @FieldName("rl01k00清單")
    private List<Rl01k00DTO> rl01k00List = new ArrayList<Rl01k00DTO>();

    /** 必要項目List. */
    @XmlElement(name = "NecessaryList")
    @FieldName("必要項目List")
    private List<Rl01k00DTOResult> necessaryList = new ArrayList<Rl01k00DTOResult>();

    /** 應繳書件List. */
    @XmlElement(name = "CertificateList")
    @FieldName("應繳書件List")
    private List<Rl01k00DTOResult> certificateList = new ArrayList<Rl01k00DTOResult>();

    /** 計數A. */
    @XmlElement(name = "PayCountA")
    @FieldName("計數A")
    private AtomicInteger payCountA = new AtomicInteger(0);

    /** 計數B. */
    @XmlElement(name = "PayCountB")
    @FieldName("計數B")
    private AtomicInteger payCountB = new AtomicInteger(0);

    /** 必要項目規費List. */
    @XmlElement(name = "NecessaryPayList")
    @FieldName("必要項目List")
    private List<Rl01k00DTOResult> necessaryPayList = new ArrayList<Rl01k00DTOResult>();

    /** 規費項目List. */
    @XmlElement(name = "PayList")
    @FieldName("規費項目List")
    private List<Rl01k00DTOResult> payList = new ArrayList<Rl01k00DTOResult>();

    /** 計數A. */
    @XmlElement(name = "NoticeCountA")
    @FieldName("計數A")
    private AtomicInteger noticeCountA = new AtomicInteger(0);

    /** 計數B. */
    @XmlElement(name = "NoticeCountB")
    @FieldName("計數B")
    private AtomicInteger noticeCountB = new AtomicInteger(0);

    /** 必要項目應注意事項List. */
    @XmlElement(name = "NecessaryNoticeList")
    @FieldName("必要項目List")
    private List<Rl01k00DTOResult> necessaryNoticeList = new ArrayList<Rl01k00DTOResult>();

    /** 應注意事項List. */
    @XmlElement(name = "NoticeList")
    @FieldName("應注意事項List")
    private List<Rl01k00DTOResult> noticeList = new ArrayList<Rl01k00DTOResult>();

    /** 選取應繳書件List. */
    @XmlElement(name = "ChosenCcertificateList")
    @FieldName("選取應繳書件List")
    private List<Rl01k00DTOResult> chosenCertificateList = new ArrayList<Rl01k00DTOResult>();

    /** 選取規費項目List. */
    @XmlElement(name = "ChosenPayList")
    @FieldName("選取規費項目List")
    private List<Rl01k00DTOResult> chosenPayList = new ArrayList<Rl01k00DTOResult>();

    /** 選取應注意事項List. */
    @XmlElement(name = "ChosenNoticeList")
    @FieldName("選取應注意事項List")
    private List<Rl01k00DTOResult> chosenNoticeList = new ArrayList<Rl01k00DTOResult>();

    /** The rldfg002 list. */
    @XmlElement(name = "Rldfg002List")
    @FieldName("rldfg002List")
    private List<Rldfg002Type> rldfg002List = new ArrayList<Rldfg002Type>();

    /** ApplyIdCheckbox. */
    @XmlElement(name = "ApplyIdCheckbox")
    @FieldName("applyIdCheckbox")
    private boolean applyIdCheckbox;

    /**
     * Gets the apply case code.
     * 
     * @return the apply case code
     */
    public String getApplyCaseCode() {
        return applyCaseCode;
    }

    /**
     * Sets the apply case code.
     * 
     * @param applyCaseCode
     *            the new apply case code
     */
    public void setApplyCaseCode(String applyCaseCode) {
        this.applyCaseCode = applyCaseCode;
    }

    /**
     * Gets the apply case name.
     * 
     * @return the apply case name
     */
    public String getApplyCaseName() {
        return applyCaseName;
    }

    /**
     * Sets the apply case name.
     * 
     * @param applyCaseName
     *            the new apply case name
     */
    public void setApplyCaseName(String applyCaseName) {
        this.applyCaseName = applyCaseName;
    }

    /**
     * Gets the apply id.
     * 
     * @return the apply id
     */
    public String getApplyId() {
        return applyId;
    }

    /**
     * Sets the apply id.
     * 
     * @param applyId
     *            the new apply id
     */
    public void setApplyId(String applyId) {
        this.applyId = applyId;
    }

    /**
     * Gets the apply name.
     * 
     * @return the apply name
     */
    public String getApplyName() {
        return applyName;
    }

    /**
     * Sets the apply name.
     * 
     * @param applyName
     *            the new apply name
     */
    public void setApplyName(String applyName) {
        this.applyName = applyName;
    }

    /**
     * Gets the person id.
     * 
     * @return the person id
     */
    public String getPersonId() {
        return personId;
    }

    /**
     * Sets the person id.
     * 
     * @param personId
     *            the new person id
     */
    public void setPersonId(String personId) {
        this.personId = personId;
    }

    /**
     * Gets the person name.
     * 
     * @return the person name
     */
    public String getPersonName() {
        return personName;
    }

    /**
     * Sets the person name.
     * 
     * @param personName
     *            the new person name
     */
    public void setPersonName(String personName) {
        this.personName = personName;
    }

    /**
     * Gets the phone number.
     * 
     * @return the phone number
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Sets the phone number.
     * 
     * @param phoneNumber
     *            the new phone number
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * Gets the necessary list.
     * 
     * @return the necessary list
     */
    public List<Rl01k00DTOResult> getNecessaryList() {
        return necessaryList;
    }

    /**
     * Sets the necessary list.
     * 
     * @param necessaryList
     *            the new necessary list
     */
    public void setNecessaryList(List<Rl01k00DTOResult> necessaryList) {
        this.necessaryList = necessaryList;
    }

    /**
     * Gets the notice list.
     * 
     * @return the notice list
     */
    public List<Rl01k00DTOResult> getNoticeList() {
        return noticeList;
    }

    /**
     * Sets the notice list.
     * 
     * @param noticeList
     *            the new notice list
     */
    public void setNoticeList(List<Rl01k00DTOResult> noticeList) {
        this.noticeList = noticeList;
    }

    /**
     * Gets the certificate list.
     * 
     * @return the certificate list
     */
    public List<Rl01k00DTOResult> getCertificateList() {
        return certificateList;
    }

    /**
     * Sets the certificate list.
     * 
     * @param certificateList
     *            the new certificate list
     */
    public void setCertificateList(List<Rl01k00DTOResult> certificateList) {
        this.certificateList = certificateList;
    }

    /**
     * Gets the pay list.
     * 
     * @return the pay list
     */
    public List<Rl01k00DTOResult> getPayList() {
        return payList;
    }

    /**
     * Sets the pay list.
     * 
     * @param payList
     *            the new pay list
     */
    public void setPayList(List<Rl01k00DTOResult> payList) {
        this.payList = payList;
    }

    /**
     * Gets the transaction id.
     * 
     * @return the transaction id
     */
    public String getTransactionId() {
        return transactionId;
    }

    /**
     * Sets the transaction id.
     * 
     * @param transactionId
     *            the new transaction id
     */
    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    /**
     * Gets the rl01k00 list.
     * 
     * @return the rl01k00 list
     */
    public List<Rl01k00DTO> getRl01k00List() {
        return rl01k00List;
    }

    /**
     * Sets the rl01k00 list.
     * 
     * @param rl01k00List
     *            the new rl01k00 list
     */
    public void setRl01k00List(List<Rl01k00DTO> rl01k00List) {
        this.rl01k00List = rl01k00List;
    }

    /**
     * Gets the document.
     * 
     * @return the document
     */
    public String getDocument() {
        return document;
    }

    /**
     * Sets the document.
     * 
     * @param document
     *            the new document
     */
    public void setDocument(String document) {
        this.document = document;
    }

    /**
     * Gets the registrar name.
     * 
     * @return the registrar name
     */
    public String getRegistrarName() {
        return registrarName;
    }

    /**
     * Sets the registrar name.
     * 
     * @param registrarName
     *            the new registrar name
     */
    public void setRegistrarName(String registrarName) {
        this.registrarName = registrarName;
    }

    /**
     * Gets the admin office phone.
     * 
     * @return the admin office phone
     */
    public String getAdminOfficePhone() {
        return adminOfficePhone;
    }

    /**
     * Sets the admin office phone.
     * 
     * @param adminOfficePhone
     *            the new admin office phone
     */
    public void setAdminOfficePhone(String adminOfficePhone) {
        this.adminOfficePhone = adminOfficePhone;
    }

    /**
     * Gets the admin office url.
     * 
     * @return the admin office url
     */
    public String getAdminOfficeUrl() {
        return adminOfficeUrl;
    }

    /**
     * Sets the admin office url.
     * 
     * @param adminOfficeUrl
     *            the new admin office url
     */
    public void setAdminOfficeUrl(String adminOfficeUrl) {
        this.adminOfficeUrl = adminOfficeUrl;
    }

    /**
     * Gets the register date.
     * 
     * @return the register date
     */
    public String getRegisterDate() {
        return registerDate;
    }

    /**
     * Sets the register date.
     * 
     * @param registerDate
     *            the new register date
     */
    public void setRegisterDate(String registerDate) {
        this.registerDate = registerDate;
    }

    /**
     * Gets the rldfg002 list.
     * 
     * @return the rldfg002 list
     */
    public List<Rldfg002Type> getRldfg002List() {
        return rldfg002List;
    }

    /**
     * Sets the rldfg002 list.
     * 
     * @param rldfg002List
     *            the new rldfg002 list
     */
    public void setRldfg002List(List<Rldfg002Type> rldfg002List) {
        this.rldfg002List = rldfg002List;
    }

    /**
     * Gets the chosen pay list.
     * 
     * @return the chosen pay list
     */
    public List<Rl01k00DTOResult> getChosenPayList() {
        return chosenPayList;
    }

    /**
     * Sets the chosen pay list.
     * 
     * @param chosenPayList
     *            the new chosen pay list
     */
    public void setChosenPayList(List<Rl01k00DTOResult> chosenPayList) {
        this.chosenPayList = chosenPayList;
    }

    /**
     * Gets the chosen notice list.
     * 
     * @return the chosen notice list
     */
    public List<Rl01k00DTOResult> getChosenNoticeList() {
        return chosenNoticeList;
    }

    /**
     * Sets the chosen notice list.
     * 
     * @param chosenNoticeList
     *            the new chosen notice list
     */
    public void setChosenNoticeList(List<Rl01k00DTOResult> chosenNoticeList) {
        this.chosenNoticeList = chosenNoticeList;
    }

    /**
     * Gets the admin officce code.
     * 
     * @return the admin officce code
     */
    public String getAdminOfficceCode() {
        return adminOfficceCode;
    }

    /**
     * Sets the admin officce code.
     * 
     * @param adminOfficceCode
     *            the new admin officce code
     */
    public void setAdminOfficceCode(String adminOfficceCode) {
        this.adminOfficceCode = adminOfficceCode;
    }

    /**
     * Gets the area code.
     * 
     * @return the area code
     */
    public String getAreaCode() {
        return areaCode;
    }

    /**
     * Sets the area code.
     * 
     * @param areaCode
     *            the new area code
     */
    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    /**
     * Gets the option.
     * 
     * @return the option
     */
    public String getOption() {
        return option;
    }

    /**
     * Sets the option.
     * 
     * @param option
     *            the new option
     */
    public void setOption(String option) {
        this.option = option;
    }

    /**
     * Gets the option name.
     * 
     * @return the option name
     */
    public String getOptionName() {
        return optionName;
    }

    /**
     * Sets the option name.
     * 
     * @param optionName
     *            the new option name
     */
    public void setOptionName(String optionName) {
        this.optionName = optionName;
    }

    /**
     * Gets the save button.
     * 
     * @return the save button
     */
    public Boolean getSaveButton() {
        return saveButton;
    }

    /**
     * Sets the save button.
     * 
     * @param saveButton
     *            the new save button
     */
    public void setSaveButton(Boolean saveButton) {
        this.saveButton = saveButton;
    }

    /**
     * Gets the report url.
     * 
     * @return the report url
     */
    public String getReportURL() {
        return reportURL;
    }

    /**
     * Sets the report url.
     * 
     * @param reportURL
     *            the new report url
     */
    public void setReportURL(String reportURL) {
        this.reportURL = reportURL;
    }

    /**
     * Gets the admin office name.
     * 
     * @return the admin office name
     */
    public String getAdminOfficeName() {
        return adminOfficeName;
    }

    /**
     * Sets the admin office name.
     * 
     * @param adminOfficeName
     *            the new admin office name
     */
    public void setAdminOfficeName(String adminOfficeName) {
        this.adminOfficeName = adminOfficeName;
    }

    /**
     * Gets the delete date.
     * 
     * @return the delete date
     */
    public String getDeleteDate() {
        return deleteDate;
    }

    /**
     * Sets the delete date.
     * 
     * @param deleteDate
     *            the new delete date
     */
    public void setDeleteDate(String deleteDate) {
        this.deleteDate = deleteDate;
    }

    public String getApplySiteId() {
        return applySiteId;
    }

    public void setApplySiteId(String applySiteId) {
        this.applySiteId = applySiteId;
    }

    public String getPersonSiteId() {
        return personSiteId;
    }

    public void setPersonSiteId(String personSiteId) {
        this.personSiteId = personSiteId;
    }

    public boolean isApplyIdCheckbox() {
        return applyIdCheckbox;
    }

    public void setApplyIdCheckbox(boolean applyIdCheckbox) {
        this.applyIdCheckbox = applyIdCheckbox;
    }

    public List<Rl01k00DTOResult> getChosenCertificateList() {
        return chosenCertificateList;
    }

    public void setChosenCertificateList(List<Rl01k00DTOResult> chosenCertificateList) {
        this.chosenCertificateList = chosenCertificateList;
    }

    public List<Rl01k00DTOResult> getNecessaryPayList() {
        return necessaryPayList;
    }

    public void setNecessaryPayList(List<Rl01k00DTOResult> necessaryPayList) {
        this.necessaryPayList = necessaryPayList;
    }

    public List<Rl01k00DTOResult> getNecessaryNoticeList() {
        return necessaryNoticeList;
    }

    public void setNecessaryNoticeList(List<Rl01k00DTOResult> necessaryNoticeList) {
        this.necessaryNoticeList = necessaryNoticeList;
    }

    public AtomicInteger getPayCountA() {
        return payCountA;
    }

    public void setPayCountA(AtomicInteger payCountA) {
        this.payCountA = payCountA;
    }

    public AtomicInteger getPayCountB() {
        return payCountB;
    }

    public void setPayCountB(AtomicInteger payCountB) {
        this.payCountB = payCountB;
    }

    public AtomicInteger getNoticeCountA() {
        return noticeCountA;
    }

    public void setNoticeCountA(AtomicInteger noticeCountA) {
        this.noticeCountA = noticeCountA;
    }

    public AtomicInteger getNoticeCountB() {
        return noticeCountB;
    }

    public void setNoticeCountB(AtomicInteger noticeCountB) {
        this.noticeCountB = noticeCountB;
    }

    public AtomicInteger getCertificateCountA() {
        return certificateCountA;
    }

    public void setCertificateCountA(AtomicInteger certificateCountA) {
        this.certificateCountA = certificateCountA;
    }

    public AtomicInteger getCertificateCountB() {
        return certificateCountB;
    }

    public void setCertificateCountB(AtomicInteger certificateCountB) {
        this.certificateCountB = certificateCountB;
    }

}

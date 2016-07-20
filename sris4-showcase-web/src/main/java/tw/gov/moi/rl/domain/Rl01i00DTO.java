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
import tw.gov.moi.rl.component.dto.OpeningOperationDTO;
import tw.gov.moi.rl.domain.xldf.XLDFPersonDataDomainObject;

/**
 * 個人聯絡資訊維護 DTO.
 * 
 * @author Jay Kan
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl01i00DTO", propOrder = { "assignAddrChangeMode", "assignAddrTypeCode", "assignAddrZone",
        "assignAddrCountryCode", "assignAddrAreaCode", "assignAddrStreetDoorplate", "mailbox", "dayPhoneAreacode",
        "dayPhoneNumber", "dayPhoneExtension", "nightPhoneAreacode", "nightPhoneNumber", "nightPhoneExtension",
        "cellPhoneNumber", "emailAddress", "imAccount", "openingOperationDTO", "warningMessgeList", "xldfPersonData",
        "reportUrl", "birthYyymmdd", "initializationFlag", "errorCode" })
@XmlRootElement(name = "Rl01i00DTO")
public class Rl01i00DTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 5935538200185601161L;

    /** 指定地址-來源方式. */
    @XmlElement(name = "AssignAddrChangeMode")
    @FieldName("指定地址-來源方式")
    private String assignAddrChangeMode;

    /** 指定地址-類別代碼. */
    @XmlElement(name = "AssignAddrTypeCode")
    @FieldName("指定地址-類別代碼")
    private String assignAddrTypeCode;

    /** 郵遞區號. */
    @XmlElement(name = "AssignAddrZone")
    @FieldName("郵遞區號")
    private String assignAddrZone;

    /** 指定地址-省市縣市代碼. */
    @XmlElement(name = "AssignAddrCountryCode")
    @FieldName("指定地址-省市縣市代碼")
    private String assignAddrCountryCode;

    /** 指定地址-鄉鎮市區代碼. */
    @XmlElement(name = "AssignAddrAreaCode")
    @FieldName("指定地址-鄉鎮市區代碼")
    private String assignAddrAreaCode;

    /** 指定地址-街路門牌. */
    @XmlElement(name = "AssignAddrStreetDoorplate")
    @FieldName("指定地址-街路門牌")
    private String assignAddrStreetDoorplate;

    /** 郵政信箱. */
    @XmlElement(name = "Mailbox")
    @FieldName("郵政信箱")
    private String mailbox;

    /** 日間電話-區域號碼. */
    @XmlElement(name = "DayPhoneAreacode")
    @FieldName("日間電話-區域號碼")
    private String dayPhoneAreacode;

    /** 日間電話-號碼. */
    @XmlElement(name = "DayPhoneNumber")
    @FieldName("日間電話-號碼")
    private String dayPhoneNumber;

    /** 日間電話-分機. */
    @XmlElement(name = "DayPhoneExtension")
    @FieldName("日間電話-分機")
    private String dayPhoneExtension;

    /** 夜間電話-區域號碼. */
    @XmlElement(name = "NightPhoneAreacode")
    @FieldName("夜間電話-區域號碼")
    private String nightPhoneAreacode;

    /** 夜間電話-號碼. */
    @XmlElement(name = "NightPhoneNumber")
    @FieldName("夜間電話-號碼")
    private String nightPhoneNumber;

    /** 夜間電話-分機. */
    @XmlElement(name = "NightPhoneExtension")
    @FieldName("夜間電話-分機")
    private String nightPhoneExtension;

    /** 行動電話號碼. */
    @XmlElement(name = "CellPhoneNumber")
    @FieldName("行動電話號碼")
    private String cellPhoneNumber;

    /** 電子信箱. */
    @XmlElement(name = "EmailAddress")
    @FieldName("電子信箱")
    private String emailAddress;

    /** 即時通帳號. */
    @XmlElement(name = "ImAccount")
    @FieldName("即時通帳號")
    private String imAccount;

    /** 大簿控制各作業之資訊. */
    @XmlElement(name = "OpeningOperationDTO")
    @FieldName("大簿控制各作業之資訊")
    private OpeningOperationDTO openingOperationDTO;

    /** 警告訊息清單. */
    @XmlElement(name = "WarningMessgeList")
    @FieldName("警告訊息清單")
    private List<RlWarningMessage> warningMessgeList = new ArrayList<RlWarningMessage>();

    /** 當事人-個人基本資料. */
    @XmlElement(name = "XldfPersonData")
    @FieldName("當事人-個人基本資料")
    private XLDFPersonDataDomainObject xldfPersonData;

    /** 報表檔URL. */
    @XmlElement(name = "ReportUrl")
    @FieldName("報表檔URL")
    private String reportUrl;

    /** 出生日期. */
    @XmlElement(name = "BirthYyymmdd")
    @FieldName("出生日期")
    private String birthYyymmdd;

    /**
     * 初始化. <BR>
     * Default: true
     */
    @XmlElement(name = "InitializationFlag")
    @FieldName("初始化")
    private boolean initializationFlag = true;

    /** 錯誤代碼. */
    @XmlElement(name = "ErrorCode")
    @FieldName("錯誤代碼")
    private String errorCode;

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer();

        sb.append(getAssignAddrTypeCode());
        sb.append(getAssignAddrZone());
        sb.append(getAssignAddrCountryCode());
        sb.append(getAssignAddrAreaCode());
        sb.append(getAssignAddrStreetDoorplate());
        sb.append(getMailbox());
        sb.append(getDayPhoneAreacode());
        sb.append(getDayPhoneNumber());
        sb.append(getDayPhoneExtension());
        sb.append(getNightPhoneAreacode());
        sb.append(getNightPhoneNumber());
        sb.append(getNightPhoneExtension());
        sb.append(getCellPhoneNumber());
        sb.append(getEmailAddress());

        return sb.toString();
    }

    /**
     * Gets the assign addr change mode.
     * 
     * @return the assign addr change mode
     */
    public String getAssignAddrChangeMode() {
        return assignAddrChangeMode;
    }

    /**
     * Sets the assign addr change mode.
     * 
     * @param assignAddrChangeMode
     *            the new assign addr change mode
     */
    public void setAssignAddrChangeMode(final String assignAddrChangeMode) {
        this.assignAddrChangeMode = assignAddrChangeMode;
    }

    /**
     * Gets the assign addr type code.
     * 
     * @return the assign addr type code
     */
    public String getAssignAddrTypeCode() {
        return assignAddrTypeCode;
    }

    /**
     * Sets the assign addr type code.
     * 
     * @param assignAddrTypeCode
     *            the new assign addr type code
     */
    public void setAssignAddrTypeCode(final String assignAddrTypeCode) {
        this.assignAddrTypeCode = assignAddrTypeCode;
    }

    /**
     * Gets the assign addr zone.
     * 
     * @return the assign addr zone
     */
    public String getAssignAddrZone() {
        return assignAddrZone;
    }

    /**
     * Sets the assign addr zone.
     * 
     * @param assignAddrZone
     *            the new assign addr zone
     */
    public void setAssignAddrZone(final String assignAddrZone) {
        this.assignAddrZone = assignAddrZone;
    }

    /**
     * Gets the assign addr country code.
     * 
     * @return the assign addr country code
     */
    public String getAssignAddrCountryCode() {
        return assignAddrCountryCode;
    }

    /**
     * Sets the assign addr country code.
     * 
     * @param assignAddrCountryCode
     *            the new assign addr country code
     */
    public void setAssignAddrCountryCode(final String assignAddrCountryCode) {
        this.assignAddrCountryCode = assignAddrCountryCode;
    }

    /**
     * Gets the assign addr area code.
     * 
     * @return the assign addr area code
     */
    public String getAssignAddrAreaCode() {
        return assignAddrAreaCode;
    }

    /**
     * Sets the assign addr area code.
     * 
     * @param assignAddrAreaCode
     *            the new assign addr area code
     */
    public void setAssignAddrAreaCode(final String assignAddrAreaCode) {
        this.assignAddrAreaCode = assignAddrAreaCode;
    }

    /**
     * Gets the assign addr street doorplate.
     * 
     * @return the assign addr street doorplate
     */
    public String getAssignAddrStreetDoorplate() {
        return assignAddrStreetDoorplate;
    }

    /**
     * Sets the assign addr street doorplate.
     * 
     * @param assignAddrStreetDoorplate
     *            the new assign addr street doorplate
     */
    public void setAssignAddrStreetDoorplate(final String assignAddrStreetDoorplate) {
        this.assignAddrStreetDoorplate = assignAddrStreetDoorplate;
    }

    /**
     * Gets the mailbox.
     * 
     * @return the mailbox
     */
    public String getMailbox() {
        return mailbox;
    }

    /**
     * Sets the mailbox.
     * 
     * @param mailbox
     *            the new mailbox
     */
    public void setMailbox(final String mailbox) {
        this.mailbox = mailbox;
    }

    /**
     * Gets the day phone areacode.
     * 
     * @return the day phone areacode
     */
    public String getDayPhoneAreacode() {
        return dayPhoneAreacode;
    }

    /**
     * Sets the day phone areacode.
     * 
     * @param dayPhoneAreacode
     *            the new day phone areacode
     */
    public void setDayPhoneAreacode(final String dayPhoneAreacode) {
        this.dayPhoneAreacode = dayPhoneAreacode;
    }

    /**
     * Gets the day phone number.
     * 
     * @return the day phone number
     */
    public String getDayPhoneNumber() {
        return dayPhoneNumber;
    }

    /**
     * Sets the day phone number.
     * 
     * @param dayPhoneNumber
     *            the new day phone number
     */
    public void setDayPhoneNumber(final String dayPhoneNumber) {
        this.dayPhoneNumber = dayPhoneNumber;
    }

    /**
     * Gets the day phone extension.
     * 
     * @return the day phone extension
     */
    public String getDayPhoneExtension() {
        return dayPhoneExtension;
    }

    /**
     * Sets the day phone extension.
     * 
     * @param dayPhoneExtension
     *            the new day phone extension
     */
    public void setDayPhoneExtension(final String dayPhoneExtension) {
        this.dayPhoneExtension = dayPhoneExtension;
    }

    /**
     * Gets the night phone areacode.
     * 
     * @return the night phone areacode
     */
    public String getNightPhoneAreacode() {
        return nightPhoneAreacode;
    }

    /**
     * Sets the night phone areacode.
     * 
     * @param nightPhoneAreacode
     *            the new night phone areacode
     */
    public void setNightPhoneAreacode(final String nightPhoneAreacode) {
        this.nightPhoneAreacode = nightPhoneAreacode;
    }

    /**
     * Gets the night phone number.
     * 
     * @return the night phone number
     */
    public String getNightPhoneNumber() {
        return nightPhoneNumber;
    }

    /**
     * Sets the night phone number.
     * 
     * @param nightPhoneNumber
     *            the new night phone number
     */
    public void setNightPhoneNumber(final String nightPhoneNumber) {
        this.nightPhoneNumber = nightPhoneNumber;
    }

    /**
     * Gets the night phone extension.
     * 
     * @return the night phone extension
     */
    public String getNightPhoneExtension() {
        return nightPhoneExtension;
    }

    /**
     * Sets the night phone extension.
     * 
     * @param nightPhoneExtension
     *            the new night phone extension
     */
    public void setNightPhoneExtension(final String nightPhoneExtension) {
        this.nightPhoneExtension = nightPhoneExtension;
    }

    /**
     * Gets the cell phone number.
     * 
     * @return the cell phone number
     */
    public String getCellPhoneNumber() {
        return cellPhoneNumber;
    }

    /**
     * Sets the cell phone number.
     * 
     * @param cellPhoneNumber
     *            the new cell phone number
     */
    public void setCellPhoneNumber(final String cellPhoneNumber) {
        this.cellPhoneNumber = cellPhoneNumber;
    }

    /**
     * Gets the email address.
     * 
     * @return the email address
     */
    public String getEmailAddress() {
        return emailAddress;
    }

    /**
     * Sets the email address.
     * 
     * @param emailAddress
     *            the new email address
     */
    public void setEmailAddress(final String emailAddress) {
        this.emailAddress = emailAddress;
    }

    /**
     * Gets the opening operation dto.
     * 
     * @return the opening operation dto
     */
    public OpeningOperationDTO getOpeningOperationDTO() {
        return openingOperationDTO;
    }

    /**
     * Sets the opening operation dto.
     * 
     * @param openingOperationDTO
     *            the new opening operation dto
     */
    public void setOpeningOperationDTO(final OpeningOperationDTO openingOperationDTO) {
        this.openingOperationDTO = openingOperationDTO;
    }

    /**
     * Gets the warning messge list.
     * 
     * @return the warning messge list
     */
    public List<RlWarningMessage> getWarningMessgeList() {
        return warningMessgeList;
    }

    /**
     * Sets the warning messge list.
     * 
     * @param warningMessgeList
     *            the new warning messge list
     */
    public void setWarningMessgeList(final List<RlWarningMessage> warningMessgeList) {
        this.warningMessgeList = warningMessgeList;
    }

    /**
     * Gets the im account.
     * 
     * @return the im account
     */
    public String getImAccount() {
        return imAccount;
    }

    /**
     * Sets the im account.
     * 
     * @param imAccount
     *            the new im account
     */
    public void setImAccount(final String imAccount) {
        this.imAccount = imAccount;
    }

    /**
     * Gets the xldf person data.
     * 
     * @return the xldf person data
     */
    public XLDFPersonDataDomainObject getXldfPersonData() {
        return xldfPersonData;
    }

    /**
     * Sets the xldf person data.
     * 
     * @param xldfPersonData
     *            the new xldf person data
     */
    public void setXldfPersonData(final XLDFPersonDataDomainObject xldfPersonData) {
        this.xldfPersonData = xldfPersonData;
    }

    /**
     * Gets the report url.
     * 
     * @return the report url
     */
    public String getReportUrl() {
        return reportUrl;
    }

    /**
     * Sets the report url.
     * 
     * @param reportUrl
     *            the new report url
     */
    public void setReportUrl(final String reportUrl) {
        this.reportUrl = reportUrl;
    }

    /**
     * Gets the birth yyymmdd.
     * 
     * @return the birth yyymmdd
     */
    public String getBirthYyymmdd() {
        return birthYyymmdd;
    }

    /**
     * Sets the birth yyymmdd.
     * 
     * @param birthYyymmdd
     *            the new birth yyymmdd
     */
    public void setBirthYyymmdd(final String birthYyymmdd) {
        this.birthYyymmdd = birthYyymmdd;
    }

    /**
     * Checks if is initialization flag.
     * 
     * @return true, if is initialization flag
     */
    public boolean isInitializationFlag() {
        return initializationFlag;
    }

    /**
     * Sets the initialization flag.
     * 
     * @param initializationFlag
     *            the new initialization flag
     */
    public void setInitializationFlag(boolean initializationFlag) {
        this.initializationFlag = initializationFlag;
    }

    /**
     * Gets the error code.
     * 
     * @return the error code
     */
    public String getErrorCode() {
        return errorCode;
    }

    /**
     * Sets the error code.
     * 
     * @param errorCode
     *            the new error code
     */
    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }
}

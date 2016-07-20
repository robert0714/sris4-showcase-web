/*
 * Copyright (c) 2010-2020 IISI. All rights reserved.
 * 
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.domain;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;

/**
 * 職權更正案件統計表.
 * 
 * @author Viva.Hong
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Rl089e0DTO", propOrder = { "processYear", "processMonth", "reportType", "town", "country",
        "reportUrl", "option", "transactionId", "userId", "initTime" })
@XmlRootElement(name = "Rl089e0DTO")
public class Rl089e0DTO implements Serializable {

    /** serialVersionUID. */
    private static final long serialVersionUID = 8431788095599023197L;

    /** 資料日期年. */
    @XmlElement(name = "ProcessYear", required = true)
    @FieldName("資料日期年")
    private String processYear;

    /** 資料日期月. */
    @XmlElement(name = "ProcessMonth", required = true)
    @FieldName("資料日期月")
    private String processMonth;

    /** 檔案格式. */
    @XmlElement(name = "ReportType", required = true)
    @FieldName("檔案格式")
    private String reportType;

    /** 鄉鎮市區. */
    @XmlElement(name = "Town", required = true)
    @FieldName("鄉鎮市區")
    private String town;

    /** 省市縣市. */
    @XmlElement(name = "Country", required = true)
    @FieldName("省市縣市")
    private String country;

    /** 報表路徑 */
    @XmlElement(name = "ReportUrl", required = true)
    @FieldName("報表路徑")
    private String reportUrl;

    /** 請選擇列印項目. */
    @XmlElement(name = "Option", required = true)
    @FieldName("請選擇列印項目")
    private String option = "";

    /** 交易序號. */
    @XmlElement(name = "TransactionId", required = true)
    @FieldName("交易序號")
    private String transactionId;

    /** 使用者帳號. */
    @XmlElement(name = "UserId", required = true)
    @FieldName("使用者帳號")
    private String userId;

    /** 初始化時間. */
    @XmlElement(name = "InitTime", required = true)
    @FieldName("初始化時間")
    private String initTime;

    public String getProcessYear() {
        return processYear;
    }

    public void setProcessYear(String processYear) {
        this.processYear = processYear;
    }

    public String getProcessMonth() {
        return processMonth;
    }

    public void setProcessMonth(String processMonth) {
        this.processMonth = processMonth;
    }

    public String getReportType() {
        return reportType;
    }

    public void setReportType(String reportType) {
        this.reportType = reportType;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getOption() {
        return option;
    }

    public void setOption(String option) {
        this.option = option;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getInitTime() {
        return initTime;
    }

    public void setInitTime(String initTime) {
        this.initTime = initTime;
    }

    public String getReportUrl() {
        return reportUrl;
    }

    public void setReportUrl(String reportUrl) {
        this.reportUrl = reportUrl;
    }

}

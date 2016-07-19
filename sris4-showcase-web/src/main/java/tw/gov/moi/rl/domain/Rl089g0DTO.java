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
 * 製作出生登記子女從姓人數按性別及從姓方式分DTO.
 * 
 * @author Viva.Hong
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Rl089g0DTO", propOrder = { "county", "fileURL", "initTime", "month", "reportFormat", "reportUrl",
        "town", "transactionId", "userId", "year" })
@XmlRootElement(name = "Rl089g0DTO")
public class Rl089g0DTO implements Serializable {

    /** serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** 列印區域-市縣市. */
    @XmlElement(name = "County", required = true)
    @FieldName("列印區域-市縣市")
    private String county;

    /** 執行所回傳之下載檔案. */
    @XmlElement(name = "FileURL", required = true)
    @FieldName("執行所回傳之下載檔案")
    private String fileURL;

    /** 初始化時間. */
    @XmlElement(name = "InitTime", required = true)
    @FieldName("初始化時間")
    private String initTime;

    /** 月份. */
    @XmlElement(name = "Month", required = true)
    @FieldName("月份")
    private String month;

    /** 報表格式. */
    @XmlElement(name = "ReportFormat", required = true)
    @FieldName("報表格式")
    private String reportFormat;

    /** 報表路徑. */
    @XmlElement(name = "ReportUrl", required = true)
    @FieldName("報表路徑")
    private String reportUrl;

    /** 列印區域-鄉鎮市區. */
    @XmlElement(name = "Town", required = true)
    @FieldName("列印區域-鄉鎮市區")
    private String town;

    /** 交易序號. */
    @XmlElement(name = "TransactionId", required = true)
    @FieldName("交易序號")
    private String transactionId;

    /** 使用者帳號. */
    @XmlElement(name = "UserId", required = true)
    @FieldName("使用者帳號")
    private String userId;

    /** 年度資料. */
    @XmlElement(name = "Year", required = true)
    @FieldName("年度資料")
    private String year;

    public String getCounty() {
        return county;
    }

    public String getFileURL() {
        return fileURL;
    }

    public String getInitTime() {
        return initTime;
    }

    public String getMonth() {
        return month;
    }

    public String getReportFormat() {
        return reportFormat;
    }

    public String getReportUrl() {
        return reportUrl;
    }

    public String getTown() {
        return town;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public String getUserId() {
        return userId;
    }

    public String getYear() {
        return year;
    }

    public void setCounty(final String county) {
        this.county = county;
    }

    public void setFileURL(final String fileURL) {
        this.fileURL = fileURL;
    }

    public void setInitTime(final String initTime) {
        this.initTime = initTime;
    }

    public void setMonth(final String month) {
        this.month = month;
    }

    public void setReportFormat(final String reportFormat) {
        this.reportFormat = reportFormat;
    }

    public void setReportUrl(final String reportUrl) {
        this.reportUrl = reportUrl;
    }

    public void setTown(final String town) {
        this.town = town;
    }

    public void setTransactionId(final String transactionId) {
        this.transactionId = transactionId;
    }

    public void setUserId(final String userId) {
        this.userId = userId;
    }

    public void setYear(final String year) {
        this.year = year;
    }

}

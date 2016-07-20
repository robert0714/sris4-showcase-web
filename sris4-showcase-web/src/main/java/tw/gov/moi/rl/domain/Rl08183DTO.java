/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.domain;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;

/**
 * 戶籍罰鍰處罰統計表DTO.
 * 
 * @author Derek Wang
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Rl08183DTO", propOrder = { "dataMonth", "dataYear", "doCheating2AlreadyRunning", "executeWork",
        "initTime", "printCountyArea", "printTownArea", "reportFormat", "reportURL", "fileURL", "resultList", "siteId",
        "transactionId", "userId" })
@XmlRootElement(name = "Rl08183DTO")
public class Rl08183DTO implements Serializable {

    /** Serial UID. */
    private static final long serialVersionUID = 8431788095599023197L;

    /** 統計年月(月). */
    @XmlElement(name = "DataMonth", required = true)
    @FieldName("統計年月(月)")
    private String dataMonth;

    /** 統計年月(年). */
    @XmlElement(name = "DataYear", required = true)
    @FieldName("統計年月(年)")
    private String dataYear;

    /** 是否執行. */
    @XmlElement(name = "UserId", required = true)
    @FieldName("是否執行")
    private boolean doCheating2AlreadyRunning;

    /** 是否執行8183作業. */
    @XmlElement(name = "ExecuteWork", required = true)
    @FieldName("是否執行8183作業")
    private boolean executeWork;

    /** 執行所回傳之下載檔案. */
    @XmlElement(name = "FileURL")
    @FieldName("執行所回傳之下載檔案")
    private String fileURL;

    /** 初始化時間. */
    @XmlElement(name = "InitTime", required = true)
    @FieldName("初始化時間")
    private String initTime;

    /** 列印區域-市縣市. */
    @XmlElement(name = "PrintCountyArea", required = true)
    @FieldName("列印區域-市縣市")
    private String printCountyArea;

    /** 列印區域-鄉鎮市區. */
    @XmlElement(name = "PrintTownArea", required = true)
    @FieldName("列印區域-鄉鎮市區")
    private String printTownArea;

    /** 報表格式. */
    @XmlElement(name = "ReportFormat", required = true)
    @FieldName("報表格式")
    private String reportFormat;

    /** 報表路徑. */
    @XmlElement(name = "ReportURL", required = true)
    @FieldName("報表路徑")
    private String reportURL;

    /** 查詢結果. */
    @XmlElement(name = "ResultList", required = true)
    @FieldName("查詢結果")
    private List<Rl08183DTO> resultList;

    /** 戶所代碼. */
    @XmlElement(name = "SiteId", required = true)
    @FieldName("戶所代碼")
    private String siteId;

    /** 交易序號. */
    @XmlElement(name = "TransactionId", required = true)
    @FieldName("交易序號")
    private String transactionId;

    /** 使用者帳號. */
    @XmlElement(name = "UserId", required = true)
    @FieldName("使用者帳號")
    private String userId;

    public String getDataMonth() {
        return dataMonth;
    }

    public String getDataYear() {
        return dataYear;
    }

    public String getFileURL() {
        return fileURL;
    }

    public String getInitTime() {
        return initTime;
    }

    public String getPrintCountyArea() {
        return printCountyArea;
    }

    public String getPrintTownArea() {
        return printTownArea;
    }

    public String getReportFormat() {
        return reportFormat;
    }

    public String getReportURL() {
        return reportURL;
    }

    public List<Rl08183DTO> getResultList() {
        return resultList;
    }

    public String getSiteId() {
        return siteId;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public String getUserId() {
        return userId;
    }

    public boolean isDoCheating2AlreadyRunning() {
        return doCheating2AlreadyRunning;
    }

    public boolean isExecuteWork() {
        return executeWork;
    }

    public void setDataMonth(String dataMonth) {
        this.dataMonth = dataMonth;
    }

    public void setDataYear(String dataYear) {
        this.dataYear = dataYear;
    }

    public void setDoCheating2AlreadyRunning(boolean doCheating2AlreadyRunning) {
        this.doCheating2AlreadyRunning = doCheating2AlreadyRunning;
    }

    public void setExecuteWork(boolean executeWork) {
        this.executeWork = executeWork;
    }

    public void setFileURL(String fileURL) {
        this.fileURL = fileURL;
    }

    public void setInitTime(String initTime) {
        this.initTime = initTime;
    }

    public void setPrintCountyArea(String printCountyArea) {
        this.printCountyArea = printCountyArea;
    }

    public void setPrintTownArea(String printTownArea) {
        this.printTownArea = printTownArea;
    }

    public void setReportFormat(String reportFormat) {
        this.reportFormat = reportFormat;
    }

    public void setReportURL(String reportURL) {
        this.reportURL = reportURL;
    }

    public void setResultList(List<Rl08183DTO> resultList) {
        this.resultList = resultList;
    }

    public void setSiteId(String siteId) {
        this.siteId = siteId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

}

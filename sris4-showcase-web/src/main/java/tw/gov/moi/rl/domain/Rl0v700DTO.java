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
import tw.gov.moi.domain.Rsdfz229Type;

/**
 * 全面換證統計表DTO.
 * 
 * @author Viva.Hong
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Rl0v700DTO", propOrder = { "fileURL", "initTime", "operationCode", "printStyle", "reportFormat",
        "reportURL", "seqNo", "transactionId", "userId", "villageNoticeList", "whetherToPrint", "isPrintDisabled" })
@XmlRootElement(name = "Rl0v700DTO")
public class Rl0v700DTO implements Serializable {

    /** serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** 執行所回傳之下載檔案. */
    @XmlElement(name = "FileURL", required = true)
    @FieldName("執行所回傳之下載檔案")
    private String fileURL;

    /** 初始化時間. */
    @XmlElement(name = "InitTime", required = true)
    @FieldName("初始化時間")
    private String initTime;

    /** 作業代碼. */
    @XmlElement(name = "OperationCode", required = true)
    @FieldName("作業代碼")
    private String operationCode;

    /** 列印方式. */
    @XmlElement(name = "PrintStyle", required = true)
    @FieldName("列印方式")
    private String printStyle = "";

    /** 報表格式. */
    @XmlElement(name = "ReportFormat", required = true)
    @FieldName("報表格式")
    private String reportFormat = "";

    /** 報表路徑 */
    @XmlElement(name = "ReportURL", required = true)
    @FieldName("報表路徑")
    private String reportURL;

    /** 序號. */
    @XmlElement(name = "SeqNo", required = true)
    @FieldName("序號")
    private int seqNo = 0;

    /** 交易序號. */
    @XmlElement(name = "TransactionId", required = true)
    @FieldName("交易序號")
    private String transactionId;

    /** 使用者帳號. */
    @XmlElement(name = "UserId", required = true)
    @FieldName("使用者帳號")
    private String userId;

    /** 村里總計清單 . */
    @XmlElement(name = "InitTime", required = true)
    @FieldName("村里總計清單")
    private List<Rsdfz229Type> villageNoticeList = new ArrayList<Rsdfz229Type>();

    /** 是否列印統計表. */
    @XmlElement(name = "WhetherToPrint", required = true)
    @FieldName("是否列印統計表")
    private String whetherToPrint = "";

    /** 是否關閉列印按鈕. */
    @XmlElement(name = "IsPrintDisabled", required = true)
    @FieldName("是否關閉列印按鈕")
    private boolean isPrintDisabled = false;

    public boolean isPrintDisabled() {
        return isPrintDisabled;
    }

    public void setPrintDisabled(boolean isPrintDisabled) {
        this.isPrintDisabled = isPrintDisabled;
    }

    public String getFileURL() {
        return fileURL;
    }

    public String getInitTime() {
        return initTime;
    }

    public String getOperationCode() {
        return operationCode;
    }

    public String getPrintStyle() {
        return printStyle;
    }

    public String getReportFormat() {
        return reportFormat;
    }

    public String getReportURL() {
        return reportURL;
    }

    public int getSeqNo() {
        return seqNo;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public String getUserId() {
        return userId;
    }

    public List<Rsdfz229Type> getVillageNoticeList() {
        return villageNoticeList;
    }

    public String getWhetherToPrint() {
        return whetherToPrint;
    }

    public void setFileURL(final String fileURL) {
        this.fileURL = fileURL;
    }

    public void setInitTime(final String initTime) {
        this.initTime = initTime;
    }

    public void setOperationCode(final String operationCode) {
        this.operationCode = operationCode;
    }

    public void setPrintStyle(final String printStyle) {
        this.printStyle = printStyle;
    }

    public void setReportFormat(final String reportFormat) {
        this.reportFormat = reportFormat;
    }

    public void setReportURL(final String reportURL) {
        this.reportURL = reportURL;
    }

    public void setSeqNo(final int seqNo) {
        this.seqNo = seqNo;
    }

    public void setTransactionId(final String transactionId) {
        this.transactionId = transactionId;
    }

    public void setUserId(final String userId) {
        this.userId = userId;
    }

    public void setVillageNoticeList(final List<Rsdfz229Type> villageNoticeList) {
        this.villageNoticeList = villageNoticeList;
    }

    public void setWhetherToPrint(final String whetherToPrint) {
        this.whetherToPrint = whetherToPrint;
    }

}

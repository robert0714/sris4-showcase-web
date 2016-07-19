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
 * The Class Rl05284DTO.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl05284DTO", propOrder = { "printType", "dateStart", "dateEnd", "processMark", "pageChange", "reportType", "chk1", "chk2" })
@XmlRootElement(name = "Rl05284DTO")
public class Rl05284DTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    // 列印類別
    /** The print type. */
    @XmlElement(name = "PrintType")
    @FieldName("列印類別")
    private String printType;

    // 通報日期起
    /** The date start. */
    @XmlElement(name = "DateStart")
    @FieldName("通報日期起")
    private String dateStart;

    // 通報日期迄
    /** The date end. */
    @XmlElement(name = "DateEnd")
    @FieldName("通報日期迄")
    private String dateEnd;

    // 處理註記
    /** The process mark. */
    @XmlElement(name = "ProcessMark")
    @FieldName("處理註記")
    private String processMark;

    // 換頁方式
    /** The page change. */
    @XmlElement(name = "PageChange")
    @FieldName("換頁方式")
    private String pageChange;

    // 報表格式
    /** The report type. */
    @XmlElement(name = "ReportType")
    @FieldName("報表格式")
    private String reportType;

    /** The chk1. */
    @XmlElement(name = "Chk1")
    @FieldName("chk1")
    private boolean chk1;

    /** The chk2. */
    @XmlElement(name = "Chk2")
    @FieldName("chk2")
    private boolean chk2;
    
    /** 報表路徑 */
    @XmlElement(name = "reportUrl")
    @FieldName("報表路徑")
    private String reportUrl;

    public String getReportUrl() {
        return reportUrl;
    }

    public void setReportUrl(String reportUrl) {
        this.reportUrl = reportUrl;
    }

    /**
     * Gets the prints the type.
     * 
     * @return the prints the type
     */
    public String getPrintType() {
        return printType;
    }

    /**
     * Sets the prints the type.
     * 
     * @param printType
     *            the new prints the type
     */
    public void setPrintType(String printType) {
        this.printType = printType;
    }

    /**
     * Gets the date start.
     * 
     * @return the date start
     */
    public String getDateStart() {
        return dateStart;
    }

    /**
     * Sets the date start.
     * 
     * @param dateStart
     *            the new date start
     */
    public void setDateStart(String dateStart) {
        this.dateStart = dateStart;
    }

    /**
     * Gets the date end.
     * 
     * @return the date end
     */
    public String getDateEnd() {
        return dateEnd;
    }

    /**
     * Sets the date end.
     * 
     * @param dateEnd
     *            the new date end
     */
    public void setDateEnd(String dateEnd) {
        this.dateEnd = dateEnd;
    }

    /**
     * Gets the process mark.
     * 
     * @return the process mark
     */
    public String getProcessMark() {
        return processMark;
    }

    /**
     * Sets the process mark.
     * 
     * @param processMark
     *            the new process mark
     */
    public void setProcessMark(String processMark) {
        this.processMark = processMark;
    }

    /**
     * Gets the page change.
     * 
     * @return the page change
     */
    public String getPageChange() {
        return pageChange;
    }

    /**
     * Sets the page change.
     * 
     * @param pageChange
     *            the new page change
     */
    public void setPageChange(String pageChange) {
        this.pageChange = pageChange;
    }

    /**
     * Gets the report type.
     * 
     * @return the report type
     */
    public String getReportType() {
        return reportType;
    }

    /**
     * Sets the report type.
     * 
     * @param reportType
     *            the new report type
     */
    public void setReportType(String reportType) {
        this.reportType = reportType;
    }

    /**
     * Checks if is chk1.
     * 
     * @return true, if is chk1
     */
    public boolean isChk1() {
        return chk1;
    }

    /**
     * Sets the chk1.
     * 
     * @param chk1
     *            the new chk1
     */
    public void setChk1(boolean chk1) {
        this.chk1 = chk1;
    }

    /**
     * Checks if is chk2.
     * 
     * @return true, if is chk2
     */
    public boolean isChk2() {
        return chk2;
    }

    /**
     * Sets the chk2.
     * 
     * @param chk2
     *            the new chk2
     */
    public void setChk2(boolean chk2) {
        this.chk2 = chk2;
    }
}

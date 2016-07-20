/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
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
 * The Class Rc0c920DTO.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl082b0DTO", propOrder = { "option", "dataYear", "printCountyArea", "printTownArea", "printTownTable",
        "reportFormat", "reportURL", "fileURL" })
@XmlRootElement(name = "Rl082b0DTO")
public class Rl082b0DTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** 選擇項目. */
    @XmlElement(name = "Option")
    @FieldName("選擇項目")
    private String option;

    /** 資料日期(年). */
    @XmlElement(name = "DataYear")
    @FieldName("資料日期(年)")
    private String dataYear;

    /** 列印區域-市縣市. */
    // @XmlElement(name = "PrintCountyArea")
    // @FieldName("列印區域-市縣市")
    // private String printCountyArea;

    /** 列印區域-鄉鎮市區. */
    // @XmlElement(name = "PrintTownArea")
    // @FieldName("列印區域-鄉鎮市區")
    // private String printTownArea;

    /** 列印該鄉鎮市區總表. */
    @XmlElement(name = "PrintTownTable")
    @FieldName("列印該鄉鎮市區總表")
    private String printTownTable;

    /** 報表格式. */
    @XmlElement(name = "ReportFormat")
    @FieldName("報表格式")
    private String reportFormat;

    /** 報表路徑. */
    @XmlElement(name = "ReportURL")
    @FieldName("報表路徑")
    private String reportURL;

    /** 執行所回傳之下載檔案. */
    @XmlElement(name = "FileURL")
    @FieldName("執行所回傳之下載檔案")
    private String fileURL;

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
     * Gets the data year.
     * 
     * @return the data year
     */
    public String getDataYear() {
        return dataYear;
    }

    /**
     * Sets the data year.
     * 
     * @param dataYear
     *            the new data year
     */
    public void setDataYear(String dataYear) {
        this.dataYear = dataYear;
    }

    /**
     * Gets the prints the county area.
     * 
     * @return the prints the county area
     */
    // public String getPrintCountyArea() {
    // return printCountyArea;
    // }

    /**
     * Sets the prints the county area.
     * 
     * @param printCountyArea
     *            the new prints the county area
     */
    // public void setPrintCountyArea(String printCountyArea) {
    // this.printCountyArea = printCountyArea;
    // }

    /**
     * Gets the prints the town area.
     * 
     * @return the prints the town area
     */
    // public String getPrintTownArea() {
    // return printTownArea;
    // }

    /**
     * Sets the prints the town area.
     * 
     * @param printTownArea
     *            the new prints the town area
     */
    // public void setPrintTownArea(String printTownArea) {
    // this.printTownArea = printTownArea;
    // }

    /**
     * Gets the prints the town table.
     * 
     * @return the prints the town table
     */
    public String getPrintTownTable() {
        return printTownTable;
    }

    /**
     * Sets the prints the town table.
     * 
     * @param printTownTable
     *            the new prints the town table
     */
    public void setPrintTownTable(String printTownTable) {
        this.printTownTable = printTownTable;
    }

    /**
     * Gets the report format.
     * 
     * @return the report format
     */
    public String getReportFormat() {
        return reportFormat;
    }

    /**
     * Sets the report format.
     * 
     * @param reportFormat
     *            the new report format
     */
    public void setReportFormat(String reportFormat) {
        this.reportFormat = reportFormat;
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

    public String getFileURL() {
        return fileURL;
    }

    public void setFileURL(String fileURL) {
        this.fileURL = fileURL;
    }
}

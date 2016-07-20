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
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl08172DTO", propOrder = { "dataYear", "printCountyArea", "printTownArea", "reportFormat", "reportURL" })
@XmlRootElement(name = "Rl08172DTO")
public class Rl08172DTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 8431788095599023197L;

    /** 統計年度. */
    @XmlElement(name = "DataYear")
    @FieldName("統計年度")
    private String dataYear;

    /** 列印區域-市縣市. */
    @XmlElement(name = "PrintCountyArea")
    @FieldName("列印區域-市縣市")
    private String printCountyArea;

    /** 列印區域-鄉鎮市區. */
    @XmlElement(name = "PrintTownArea")
    @FieldName("列印區域-鄉鎮市區")
    private String printTownArea;

    /** 報表格式. */
    @XmlElement(name = "ReportFormat")
    @FieldName("報表格式")
    private String reportFormat;

    /** 報表路徑. */
    @XmlElement(name = "ReportURL")
    @FieldName("報表路徑")
    private String reportURL;
    
    
    private boolean doCheating2AlreadyRunning;
    

    public boolean isDoCheating2AlreadyRunning() {
        return doCheating2AlreadyRunning;
    }

    public void setDoCheating2AlreadyRunning(boolean doCheating2AlreadyRunning) {
        this.doCheating2AlreadyRunning = doCheating2AlreadyRunning;
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
    public String getPrintCountyArea() {
        return printCountyArea;
    }

    /**
     * Sets the prints the county area.
     * 
     * @param printCountyArea
     *            the new prints the county area
     */
    public void setPrintCountyArea(String printCountyArea) {
        this.printCountyArea = printCountyArea;
    }

    /**
     * Gets the prints the town area.
     * 
     * @return the prints the town area
     */
    public String getPrintTownArea() {
        return printTownArea;
    }

    /**
     * Sets the prints the town area.
     * 
     * @param printTownArea
     *            the new prints the town area
     */
    public void setPrintTownArea(String printTownArea) {
        this.printTownArea = printTownArea;
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

}

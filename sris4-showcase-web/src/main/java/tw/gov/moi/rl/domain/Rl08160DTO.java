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
 * 列印戶籍人口統計月報表處理.
 * 
 * @author Derek Wang
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Rl08160DTO", propOrder = { "startYear", "startMonth", "endMonth", "printCountyArea", "printTownArea",
        "reportFormat", "reportURL" })
@XmlRootElement(name = "Rl08160DTO")
public class Rl08160DTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 8431788095599023197L;

    /** 統計月份-年. */
    @XmlElement(name = "StartYear", required = false)
    @FieldName("統計月份-年")
    private String startYear;

    /** 統計月份-開始月. */
    @XmlElement(name = "StartMonth", required = false)
    @FieldName("統計月份-開始月")
    private String startMonth;

    /** 統計月份-結束月. */
    @XmlElement(name = "EndMonth", required = false)
    @FieldName("統計月份-結束月")
    private String endMonth;

    /** 列印區域-市縣市. */
    @XmlElement(name = "PrintCountyArea", required = false)
    @FieldName("列印區域-市縣市")
    private String printCountyArea;

    /** 列印區域-鄉鎮市區. */
    @XmlElement(name = "PrintTownArea", required = false)
    @FieldName("列印區域-鄉鎮市區")
    private String printTownArea;

    /** 檔案格式. */
    @XmlElement(name = "ReportFormat", required = false)
    @FieldName("檔案格式")
    private String reportFormat;

    /** 報表URL. */
    @XmlElement(name = "ReportURL", required = false)
    @FieldName("報表URL")
    private String reportURL;

    /**
     * Gets the start year.
     * 
     * @return the start year
     */
    public String getStartYear() {
        return startYear;
    }

    /**
     * Sets the start year.
     * 
     * @param startYear
     *            the new start year
     */
    public void setStartYear(String startYear) {
        this.startYear = startYear;
    }

    /**
     * Gets the start month.
     * 
     * @return the start month
     */
    public String getStartMonth() {
        return startMonth;
    }

    /**
     * Sets the start month.
     * 
     * @param startMonth
     *            the new start month
     */
    public void setStartMonth(String startMonth) {
        this.startMonth = startMonth;
    }

    /**
     * Gets the end month.
     * 
     * @return the end month
     */
    public String getEndMonth() {
        return endMonth;
    }

    /**
     * Sets the end month.
     * 
     * @param endMonth
     *            the new end month
     */
    public void setEndMonth(String endMonth) {
        this.endMonth = endMonth;
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

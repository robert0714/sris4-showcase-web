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
import tw.gov.moi.domain.Rsdfz224Type;

/**
 * 製作年終人口靜態統計項目依比例分配人數表.
 * 
 * @author Derek Wang
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Rl08390DTO", propOrder = { "printCountyArea", "printTownArea", "reportFormat", "reportURL",
        "rsdfz224RlData" })
@XmlRootElement(name = "Rl08390DTO")
public class Rl08390DTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 8431788095599023197L;

    /** 列印區域-市縣市. */
    @XmlElement(name = "PrintCountyArea", required = false)
    @FieldName("列印區域-市縣市")
    private String printCountyArea;

    /** 列印區域-鄉鎮市區. */
    @XmlElement(name = "PrintTownArea", required = false)
    @FieldName("列印區域-鄉鎮市區")
    private String printTownArea;

    /** 報表格式. */
    @XmlElement(name = "ReportFormat", required = false)
    @FieldName("報表格式")
    private String reportFormat;

    /** 報表路徑. */
    @XmlElement(name = "ReportURL", required = false)
    @FieldName("報表路徑")
    private String reportURL;

    /** 處理的RL-Rsdfz224 *. */
    @XmlElement(name = "Rsdfz224RlData", required = false)
    @FieldName("處理的RL-Rsdfz224")
    private Rsdfz224Type rsdfz224RlData;

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

    /**
     * Gets the rsdfz224 rl data.
     * 
     * @return the rsdfz224 rl data
     */
    public Rsdfz224Type getRsdfz224RlData() {
        return rsdfz224RlData;
    }

    /**
     * Sets the rsdfz224 rl data.
     * 
     * @param rsdfz224RlData
     *            the new rsdfz224 rl data
     */
    public void setRsdfz224RlData(Rsdfz224Type rsdfz224RlData) {
        this.rsdfz224RlData = rsdfz224RlData;
    }

}

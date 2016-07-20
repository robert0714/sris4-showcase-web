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
 * 戶號配賦表列印.
 * 
 * @author Derek Wang
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Rl06400DTO", propOrder = { "printAll", "houseHoldIdStart", "houseHoldIdEnd", "assignDateStart",
        "assignDateEnd", "reportFormat", "reportURL" })
@XmlRootElement(name = "Rl06400DTO")
public class Rl06400DTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 8431788095599023197L;

    /** 全部列印. */
    @XmlElement(name = "PrintAll")
    @FieldName("全部列印")
    private String printAll;

    /** 列印戶號(起). */
    @XmlElement(name = "HouseHoldIdStart")
    @FieldName("列印戶號(起)")
    private String houseHoldIdStart;

    /** 列印戶號(迄). */
    @XmlElement(name = "HouseHoldIdEnd")
    @FieldName("列印戶號(迄)")
    private String houseHoldIdEnd;

    /** 配賦日期(起). */
    @XmlElement(name = "AssignDateStart")
    @FieldName("配賦日期(起)")
    private String assignDateStart;

    /** 配賦日期(迄). */
    @XmlElement(name = "AssignDateEnd")
    @FieldName("配賦日期(迄)")
    private String assignDateEnd;

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

    /**
     * Gets the prints the all.
     * 
     * @return the prints the all
     */
    public String getPrintAll() {
        return printAll;
    }

    /**
     * Sets the prints the all.
     * 
     * @param printAll
     *            the new prints the all
     */
    public void setPrintAll(String printAll) {
        this.printAll = printAll;
    }

    /**
     * Gets the house hold id start.
     * 
     * @return the house hold id start
     */
    public String getHouseHoldIdStart() {
        return houseHoldIdStart;
    }

    /**
     * Sets the house hold id start.
     * 
     * @param houseHoldIdStart
     *            the new house hold id start
     */
    public void setHouseHoldIdStart(String houseHoldIdStart) {
        this.houseHoldIdStart = houseHoldIdStart;
    }

    /**
     * Gets the house hold id end.
     * 
     * @return the house hold id end
     */
    public String getHouseHoldIdEnd() {
        return houseHoldIdEnd;
    }

    /**
     * Sets the house hold id end.
     * 
     * @param houseHoldIdEnd
     *            the new house hold id end
     */
    public void setHouseHoldIdEnd(String houseHoldIdEnd) {
        this.houseHoldIdEnd = houseHoldIdEnd;
    }

    /**
     * Gets the assign date start.
     * 
     * @return the assign date start
     */
    public String getAssignDateStart() {
        return assignDateStart;
    }

    /**
     * Sets the assign date start.
     * 
     * @param assignDateStart
     *            the new assign date start
     */
    public void setAssignDateStart(String assignDateStart) {
        this.assignDateStart = assignDateStart;
    }

    /**
     * Gets the assign date end.
     * 
     * @return the assign date end
     */
    public String getAssignDateEnd() {
        return assignDateEnd;
    }

    /**
     * Sets the assign date end.
     * 
     * @param assignDateEnd
     *            the new assign date end
     */
    public void setAssignDateEnd(String assignDateEnd) {
        this.assignDateEnd = assignDateEnd;
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

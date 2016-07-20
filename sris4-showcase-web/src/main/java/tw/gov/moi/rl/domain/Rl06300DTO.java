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
 * 統號配賦表列印.
 * 
 * @author Derek Wang
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Rl06300DTO", propOrder = { "printAll", "maleIdStart", "maleIdEnd", "femaleIdStart", "femaleIdEnd",
        "assignDateStart", "assignDateEnd", "reportFormat", "reportURL" })
@XmlRootElement(name = "Rl06300DTO")
public class Rl06300DTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 8431788095599023197L;

    /** 全部列印. */
    @XmlElement(name = "PrintAll")
    @FieldName("全部列印")
    private String printAll;

    /** 列印統號(男)起. */
    @XmlElement(name = "MaleIdStart")
    @FieldName("列印統號(男)起")
    private String maleIdStart;

    /** 列印統號(男)迄. */
    @XmlElement(name = "MaleIdEnd")
    @FieldName("列印統號(男)迄")
    private String maleIdEnd;

    /** 列印統號(女)起. */
    @XmlElement(name = "FemaleIdStart")
    @FieldName("列印統號(女)起")
    private String femaleIdStart;

    /** 列印統號(女)迄. */
    @XmlElement(name = "FemaleIdEnd")
    @FieldName("列印統號(女)迄")
    private String femaleIdEnd;

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
     * Gets the male id start.
     * 
     * @return the male id start
     */
    public String getMaleIdStart() {
        return maleIdStart;
    }

    /**
     * Sets the male id start.
     * 
     * @param maleIdStart
     *            the new male id start
     */
    public void setMaleIdStart(String maleIdStart) {
        this.maleIdStart = maleIdStart;
    }

    /**
     * Gets the male id end.
     * 
     * @return the male id end
     */
    public String getMaleIdEnd() {
        return maleIdEnd;
    }

    /**
     * Sets the male id end.
     * 
     * @param maleIdEnd
     *            the new male id end
     */
    public void setMaleIdEnd(String maleIdEnd) {
        this.maleIdEnd = maleIdEnd;
    }

    /**
     * Gets the female id start.
     * 
     * @return the female id start
     */
    public String getFemaleIdStart() {
        return femaleIdStart;
    }

    /**
     * Sets the female id start.
     * 
     * @param femaleIdStart
     *            the new female id start
     */
    public void setFemaleIdStart(String femaleIdStart) {
        this.femaleIdStart = femaleIdStart;
    }

    /**
     * Gets the female id end.
     * 
     * @return the female id end
     */
    public String getFemaleIdEnd() {
        return femaleIdEnd;
    }

    /**
     * Sets the female id end.
     * 
     * @param femaleIdEnd
     *            the new female id end
     */
    public void setFemaleIdEnd(String femaleIdEnd) {
        this.femaleIdEnd = femaleIdEnd;
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

    /**
     * Gets the serialversionuid.
     * 
     * @return the serialversionuid
     */
    public static long getSerialversionuid() {
        return serialVersionUID;
    }

}

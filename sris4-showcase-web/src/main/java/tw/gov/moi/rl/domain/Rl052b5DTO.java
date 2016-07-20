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
 * 列印已辦理死亡登記逾期未接收死亡通報清冊.
 * 
 * @author Derek Wang
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Rl052b5DTO", propOrder = { "registerDateStart", "registerDateEnd", "printCountyArea", "printTownArea",
        "notNotice", "reportFormat", "reportURL" })
@XmlRootElement(name = "Rl052b5DTO")
public class Rl052b5DTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 8431788095599023197L;

    /** 登記日期(起). */
    @XmlElement(name = "RegisterDateStart")
    @FieldName("登記日期(起)")
    private String registerDateStart;

    /** 登記日期(迄). */
    @XmlElement(name = "RegisterDateEnd")
    @FieldName("登記日期(迄)")
    private String registerDateEnd;

    /** 列印區域-市縣市. */
    @XmlElement(name = "PrintCountyArea")
    @FieldName("列印區域-市縣市")
    private String printCountyArea;

    /** 列印區域-鄉鎮市區. */
    @XmlElement(name = "PrintTownArea")
    @FieldName("列印區域-鄉鎮市區")
    private String printTownArea;

    /** 僅列印未通報資料. */
    @XmlElement(name = "NotNotice")
    @FieldName("僅列印未通報資料")
    private String notNotice;

    /** 報表格式. */
    @XmlElement(name = "ReportFormat")
    @FieldName("報表格式")
    private String reportFormat;

    /** 報表路徑. */
    @XmlElement(name = "ReportURL")
    @FieldName("報表路徑")
    private String reportURL;

    /**
     * Gets the register date start.
     * 
     * @return the register date start
     */
    public String getRegisterDateStart() {
        return registerDateStart;
    }

    /**
     * Sets the register date start.
     * 
     * @param registerDateStart
     *            the new register date start
     */
    public void setRegisterDateStart(String registerDateStart) {
        this.registerDateStart = registerDateStart;
    }

    /**
     * Gets the register date end.
     * 
     * @return the register date end
     */
    public String getRegisterDateEnd() {
        return registerDateEnd;
    }

    /**
     * Sets the register date end.
     * 
     * @param registerDateEnd
     *            the new register date end
     */
    public void setRegisterDateEnd(String registerDateEnd) {
        this.registerDateEnd = registerDateEnd;
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
     * Gets the not notice.
     * 
     * @return the not notice
     */
    public String getNotNotice() {
        return notNotice;
    }

    /**
     * Sets the not notice.
     * 
     * @param notNotice
     *            the new not notice
     */
    public void setNotNotice(String notNotice) {
        this.notNotice = notNotice;
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

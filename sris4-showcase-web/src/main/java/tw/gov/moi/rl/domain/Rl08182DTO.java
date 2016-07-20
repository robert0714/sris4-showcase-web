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
import tw.gov.moi.domain.Rrdfr198Type;

/**
 * 列印戶政管理服務案件統計表處理.
 * 
 * @author Derek Wang
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl08182DTO", propOrder = { "dataYear", "dataMonth", "isNotice", "printCountyArea", "printTownArea",
        "reportFormat", "reportURL", "dataObj198", "resultList" })
@XmlRootElement(name = "Rl08182DTO")
public class Rl08182DTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 8431788095599023197L;

    /** 統計年月(年). */
    @XmlElement(name = "DataYear")
    @FieldName("統計年月(年)")
    private String dataYear;

    /** 統計年月(月). */
    @XmlElement(name = "DataMonth")
    @FieldName("統計年月(月)")
    private String dataMonth;

    /** 是否通報. */
    @XmlElement(name = "IsNotice")
    @FieldName("是否通報")
    private String isNotice;

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

    /** rrdfr198 物件. */
    @XmlElement(name = "DataObj198")
    @FieldName("rrdfr198物件")
    private Rrdfr198Type dataObj198;

    /** 查詢結果. */
    @XmlElement(name = "ResultList")
    @FieldName("查詢結果")
    private List<Rl08182DTO> resultList;

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
     * Gets the data month.
     * 
     * @return the data month
     */
    public String getDataMonth() {
        return dataMonth;
    }

    /**
     * Sets the data month.
     * 
     * @param dataMonth
     *            the new data month
     */
    public void setDataMonth(String dataMonth) {
        this.dataMonth = dataMonth;
    }

    /**
     * Gets the checks if is notice.
     * 
     * @return the checks if is notice
     */
    public String getIsNotice() {
        return isNotice;
    }

    /**
     * Sets the checks if is notice.
     * 
     * @param isNotice
     *            the new checks if is notice
     */
    public void setIsNotice(String isNotice) {
        this.isNotice = isNotice;
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
     * Gets the data obj198.
     * 
     * @return the data obj198
     */
    public Rrdfr198Type getDataObj198() {
        return dataObj198;
    }

    /**
     * Sets the data obj198.
     * 
     * @param dataObj198
     *            the new data obj198
     */
    public void setDataObj198(Rrdfr198Type dataObj198) {
        this.dataObj198 = dataObj198;
    }

    /**
     * Gets the result list.
     * 
     * @return the result list
     */
    public List<Rl08182DTO> getResultList() {
        return resultList;
    }

    /**
     * Sets the result list.
     * 
     * @param resultList
     *            the new result list
     */
    public void setResultList(List<Rl08182DTO> resultList) {
        this.resultList = resultList;
    }

}

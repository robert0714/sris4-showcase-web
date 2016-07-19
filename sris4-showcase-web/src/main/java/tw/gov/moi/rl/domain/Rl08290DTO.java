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
 * The Class Rl08290DTO.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Rl08290DTO", propOrder = { "catalog", "printType", "reportFormat", "fileURL", "reportURL", "isNotice",
        "year" })
@XmlRootElement(name = "Rl08290DTO")
public class Rl08290DTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = -4721169453914053611L;

    /** 請輸入選擇項目. */
    @XmlElement(name = "Catalog")
    @FieldName("請輸入選擇項目")
    private String catalog;

    /** 列印種類. */
    @XmlElement(name = "PrintType")
    @FieldName("列印種類")
    private String printType;

    /** 檔案格式. */
    @XmlElement(name = "RreportFormat")
    @FieldName("檔案格式")
    private String reportFormat;

    /** 下載檔案URL. */
    @XmlElement(name = "FileURL")
    @FieldName("下載檔案URL")
    private String fileURL;

    /** 報表檔案URL. */
    @XmlElement(name = "ReportURL")
    @FieldName("報表檔案URL")
    private String reportURL;

    /** 是否通報. */
    @XmlElement(name = "IsNotice")
    @FieldName("是否通報")
    private String isNotice;

    /** 資料年份. */
    @XmlElement(name = "Year")
    @FieldName("資料年份")
    private String year;

    /**
     * Gets the catalog.
     * 
     * @return the catalog
     */
    public String getCatalog() {
        return catalog;
    }

    /**
     * Sets the catalog.
     * 
     * @param catalog
     *            the new catalog
     */
    public void setCatalog(final String catalog) {
        this.catalog = catalog;
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
    public void setPrintType(final String printType) {
        this.printType = printType;
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
    public void setReportFormat(final String reportFormat) {
        this.reportFormat = reportFormat;
    }

    /**
     * Gets the file url.
     * 
     * @return the file url
     */
    public String getFileURL() {
        return fileURL;
    }

    /**
     * Sets the file url.
     * 
     * @param fileURL
     *            the new file url
     */
    public void setFileURL(final String fileURL) {
        this.fileURL = fileURL;
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
    public void setReportURL(final String reportURL) {
        this.reportURL = reportURL;
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
     * Gets the year.
     * 
     * @return the year
     */
    public String getYear() {
        return year;
    }

    /**
     * Sets the year.
     * 
     * @param year
     *            the new year
     */
    public void setYear(String year) {
        this.year = year;
    }
}

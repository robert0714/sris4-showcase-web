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
import tw.gov.moi.rl.common.constant.RlConstant;

/**
 * The Class Rl08220DTO.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Rl08220DTO", propOrder = { "catalog", "printType", "reportFormat", "fileURL", "reportURL" })
@XmlRootElement(name = "Rl08220DTO")
public class Rl08220DTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = -4721169453914053611L;

    /** 統計項目. */
    @XmlElement(name = "Catalog")
    @FieldName("統計項目")
    private String catalog = "1";

    /** 列印種類. */
    @XmlElement(name = "PrintType")
    @FieldName("列印種類")
    private String printType = "R";

    /** 檔案格式. */
    @XmlElement(name = "RreportFormat")
    @FieldName("檔案格式")
    private String reportFormat = RlConstant.ReportFormat.CSV.name();

    /** 下載檔案URL. */
    @XmlElement(name = "FileURL")
    @FieldName("下載檔案URL")
    private String fileURL;

    /** 報表檔案URL. */
    @XmlElement(name = "ReportURL")
    @FieldName("報表檔案URL")
    private String reportURL;

    /** 生死結離種類. */
    @XmlElement(name = "Type")
    @FieldName("生死結離種類")
    private String type;
    
    @XmlElement(name = "year")
    @FieldName("year")
    private String year;

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

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
     * Sets the type.
     * 
     * @param type
     *            the new type
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the type.
     * 
     * @param type
     *            the new type
     */
    public void setType(String type) {
        this.type = type;
    }

}

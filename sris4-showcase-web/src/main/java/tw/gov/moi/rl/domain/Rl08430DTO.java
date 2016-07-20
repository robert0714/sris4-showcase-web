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
 * The Class Rl08430DTO.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl08430DTO", propOrder = { "reportType", "reportURL", "birthDateFrom", "birthDateTo", "school",
        "pageType", "printType" })
@XmlRootElement(name = "Rl08430DTO")
public class Rl08430DTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** 報表格式. */
    @XmlElement(name = "ReportType", required = true)
    @FieldName("報表格式")
    private String reportType;

    /** 報表URL. */
    @XmlElement(name = "ReportURL", required = true)
    @FieldName("報表URL")
    private String reportURL;

    /** 出生日期(起). */
    @XmlElement(name = "BirthDateFrom", required = true)
    @FieldName("出生日期(起)")
    private String birthDateFrom;

    /** 出生日期(迄). */
    @XmlElement(name = "BirthDateTo", required = true)
    @FieldName("出生日期(迄)")
    private String birthDateTo;

    /** 學校. */
    @XmlElement(name = "School", required = true)
    @FieldName("學校")
    private String school;

    /** 頁面格式. */
    @XmlElement(name = "PageType", required = true)
    @FieldName("頁面格式")
    private String pageType;

    /** 列印格式. */
    @XmlElement(name = "PrintType", required = true)
    @FieldName("列印格式")
    private String printType;

    /**
     * Gets the report type.
     * 
     * @return the report type
     */
    public String getReportType() {
        return reportType;
    }

    /**
     * Sets the report type.
     * 
     * @param reportType
     *            the new report type
     */
    public void setReportType(String reportType) {
        this.reportType = reportType;
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
     * Gets the birth date from.
     * 
     * @return the birth date from
     */
    public String getBirthDateFrom() {
        return birthDateFrom;
    }

    /**
     * Sets the birth date from.
     * 
     * @param birthDateFrom
     *            the new birth date from
     */
    public void setBirthDateFrom(String birthDateFrom) {
        this.birthDateFrom = birthDateFrom;
    }

    /**
     * Gets the birth date to.
     * 
     * @return the birth date to
     */
    public String getBirthDateTo() {
        return birthDateTo;
    }

    /**
     * Sets the birth date to.
     * 
     * @param birthDateTo
     *            the new birth date to
     */
    public void setBirthDateTo(String birthDateTo) {
        this.birthDateTo = birthDateTo;
    }

    /**
     * Gets the school.
     * 
     * @return the school
     */
    public String getSchool() {
        return school;
    }

    /**
     * Sets the school.
     * 
     * @param school
     *            the new school
     */
    public void setSchool(String school) {
        this.school = school;
    }

    /**
     * Gets the page type.
     * 
     * @return the page type
     */
    public String getPageType() {
        return pageType;
    }

    /**
     * Sets the page type.
     * 
     * @param pageType
     *            the new page type
     */
    public void setPageType(String pageType) {
        this.pageType = pageType;
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
    public void setPrintType(String printType) {
        this.printType = printType;
    }

}

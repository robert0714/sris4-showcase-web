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
 * The Class Rl052a3DTO.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl052a3DTO", propOrder = { "birthNoticeNo", "reportFormat", "reportURL" })
@XmlRootElement(name = "Rl052a3DTO")
public class Rl052a3DTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** 出生通報序號. */
    @XmlElement(name = "BirthNoticeNo", required = true)
    @FieldName("出生通報序號")
    private String birthNoticeNo;

    /** 報表格式. */
    @XmlElement(name = "ReportFormat", required = true)
    @FieldName("報表格式")
    private String reportFormat;

    /** 報表路徑. */
    @XmlElement(name = "ReportURL", required = true)
    @FieldName("報表路徑")
    private String reportURL;

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
     * Gets the birth notice no.
     * 
     * @return the birth notice no
     */
    public String getBirthNoticeNo() {
        return birthNoticeNo;
    }

    /**
     * Sets the birth notice no.
     * 
     * @param birthNoticeNo
     *            the new birth notice no
     */
    public void setBirthNoticeNo(String birthNoticeNo) {
        this.birthNoticeNo = birthNoticeNo;
    }

}

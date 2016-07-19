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
 * 列印空白申請書.
 * 
 * @author Derek Wang
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Rl01z00DTO", propOrder = { "reportNumber", "reportFormat", "reportURL" })
@XmlRootElement(name = "Rl01z00DTO")
public class Rl01z00DTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 8431788095599023197L;

    /** 報表代號. */
    @XmlElement(name = "ReportNumber", required = false)
    @FieldName("報表代號")
    private String reportNumber;

    /** 檔案格式. */
    @XmlElement(name = "ReportFormat", required = false)
    @FieldName("檔案格式")
    private String reportFormat;

    /** 報表URL. */
    @XmlElement(name = "ReportURL", required = false)
    @FieldName("報表URL")
    private String reportURL;

    /**
     * Gets the report number.
     * 
     * @return the report number
     */
    public String getReportNumber() {
        return reportNumber;
    }

    /**
     * Sets the report number.
     * 
     * @param reportNumber
     *            the new report number
     */
    public void setReportNumber(String reportNumber) {
        this.reportNumber = reportNumber;
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

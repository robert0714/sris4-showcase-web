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
 * The Class Rl089d5DTO.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl089d5DTO", propOrder = { "yyy", "reportFormat", "tranType", "reportUrl" })
@XmlRootElement(name = "Rl089d5DTO")
public class Rl089d5DTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** 清查年份. */
    @XmlElement(name = "yyy")
    @FieldName("清查年份")
    private String yyy;

    /** 報表格式. */
    @XmlElement(name = "reportFormat")
    @FieldName("報表格式")
    private String reportFormat;

    /** 清查對象. */
    @XmlElement(name = "TranType")
    @FieldName("清查對象")
    private String[] tranType;

    /** 報表路徑. */
    @XmlElement(name = "ReportUrl")
    @FieldName("報表路徑")
    private String reportUrl = "";

    /**
     * Gets the yyy.
     * 
     * @return the yyy
     */
    public String getYyy() {
        return yyy;
    }

    /**
     * Sets the yyy.
     * 
     * @param yyy
     *            the new yyy
     */
    public void setYyy(String yyy) {
        this.yyy = yyy;
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

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "Rl089d5DTO [yyy=" + yyy + ", reportFormat=" + reportFormat + "]";
    }

    /**
     * Gets the tran type.
     * 
     * @return the tran type
     */
    public String[] getTranType() {
        return tranType;
    }

    /**
     * Sets the tran type.
     * 
     * @param tranType
     *            the new tran type
     */
    public void setTranType(String[] tranType) {
        this.tranType = tranType;
    }

    /**
     * Gets the report url.
     * 
     * @return the report url
     */
    public String getReportUrl() {
        return reportUrl;
    }

    /**
     * Sets the report url.
     * 
     * @param reportUrl
     *            the new report url
     */
    public void setReportUrl(String reportUrl) {
        this.reportUrl = reportUrl;
    }

}

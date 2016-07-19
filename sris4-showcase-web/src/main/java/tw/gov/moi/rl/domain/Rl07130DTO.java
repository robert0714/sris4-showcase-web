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
 * 製作辦理巡迴查對戶籍成果統計表.
 * 
 * @author Derek Wang
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Rl07130DTO", propOrder = { "ProcessYear", "ProcessMonth", "IsNotice", "ReportFormat", "ReportURL" })
@XmlRootElement(name = "Rl07130DTO")
public class Rl07130DTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 8431788095599023197L;

    /** 巡查年月(年). */
    @XmlElement(name = "ProcessYear")
    @FieldName("巡查年月(年)")
    private String processYear;

    /** 巡查年月(月). */
    @XmlElement(name = "ProcessMonth")
    @FieldName("巡查年月(月)")
    private String processMonth;

    /** 是否通報. */
    @XmlElement(name = "IsNotice")
    @FieldName("是否通報")
    private String isNotice;

    /** 報表格式. */
    @XmlElement(name = "ReportFormat")
    @FieldName("報表格式")
    private String reportFormat;

    /** 報表路徑. */
    @XmlElement(name = "ReportURL")
    @FieldName("報表路徑")
    private String reportURL;

    /**
     * Gets the process year.
     * 
     * @return the process year
     */
    public String getProcessYear() {
        return processYear;
    }

    /**
     * Sets the process year.
     * 
     * @param processYear
     *            the new process year
     */
    public void setProcessYear(String processYear) {
        this.processYear = processYear;
    }

    /**
     * Gets the process month.
     * 
     * @return the process month
     */
    public String getProcessMonth() {
        return processMonth;
    }

    /**
     * Sets the process month.
     * 
     * @param processMonth
     *            the new process month
     */
    public void setProcessMonth(String processMonth) {
        this.processMonth = processMonth;
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

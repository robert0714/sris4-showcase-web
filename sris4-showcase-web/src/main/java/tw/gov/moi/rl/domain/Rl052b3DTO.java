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
 * 列印死亡／相驗屍體證明書.
 * 
 * @author Derek Wang
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Rl052b3DTO", propOrder = { "siteId", "sourceCode", "noticeNo", "reportFormat", "reportURL" })
@XmlRootElement(name = "Rl052b3DTO")
public class Rl052b3DTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 8431788095599023197L;

    /** 工作站. */
    @XmlElement(name = "SiteId")
    @FieldName("工作站")
    private String siteId;

    /** 報表路徑. */
    @XmlElement(name = "SourceCode")
    @FieldName("報表路徑")
    private String sourceCode;

    /** 通報號碼. */
    @XmlElement(name = "NoticeNo")
    @FieldName("通報號碼")
    private String noticeNo;

    /** 報表格式. */
    @XmlElement(name = "ReportFormat")
    @FieldName("報表格式")
    private String reportFormat;

    /** 報表路徑. */
    @XmlElement(name = "ReportURL")
    @FieldName("報表路徑")
    private String reportURL;

    /**
     * Gets the site id.
     * 
     * @return the site id
     */
    public String getSiteId() {
        return siteId;
    }

    /**
     * Sets the site id.
     * 
     * @param siteId
     *            the new site id
     */
    public void setSiteId(String siteId) {
        this.siteId = siteId;
    }

    /**
     * Gets the source code.
     * 
     * @return the source code
     */
    public String getSourceCode() {
        return sourceCode;
    }

    /**
     * Sets the source code.
     * 
     * @param sourceCode
     *            the new source code
     */
    public void setSourceCode(String sourceCode) {
        this.sourceCode = sourceCode;
    }

    /**
     * Gets the notice no.
     * 
     * @return the notice no
     */
    public String getNoticeNo() {
        return noticeNo;
    }

    /**
     * Sets the notice no.
     * 
     * @param noticeNo
     *            the new notice no
     */
    public void setNoticeNo(String noticeNo) {
        this.noticeNo = noticeNo;
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

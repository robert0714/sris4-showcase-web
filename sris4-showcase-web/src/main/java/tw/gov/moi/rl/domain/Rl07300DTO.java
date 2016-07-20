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
 * 列印戶口普查處理服務.
 * 
 * @author Derek Wang
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Rl07300DTO", propOrder = { "verifyUserId", "result", "reportType", "reportURL", "fileURL" })
@XmlRootElement(name = "Rl07300DTO")
public class Rl07300DTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 8431788095599023197L;

    /** 驗證使用者ID. */
    @XmlElement(name = "VerifyUserId")
    @FieldName("驗證使用者ID")
    private String verifyUserId;

    /** 結果. */
    @XmlElement(name = "Result")
    @FieldName("結果")
    private String result;

    /** 報表格式. */
    @XmlElement(name = "ReportType")
    @FieldName("報表格式")
    private String reportType;

    /** 報表路徑. */
    @XmlElement(name = "ReportURL")
    @FieldName("報表路徑")
    private String reportURL;

    /** 回傳路徑. */
    @XmlElement(name = "FileURL")
    @FieldName("回傳路徑")
    private String fileURL;

    /**
     * Gets the verify user id.
     * 
     * @return the verify user id
     */
    public String getVerifyUserId() {
        return verifyUserId;
    }

    /**
     * Sets the verify user id.
     * 
     * @param verifyUserId
     *            the new verify user id
     */
    public void setVerifyUserId(String verifyUserId) {
        this.verifyUserId = verifyUserId;
    }

    /**
     * Gets the result.
     * 
     * @return the result
     */
    public String getResult() {
        return result;
    }

    /**
     * Sets the result.
     * 
     * @param result
     *            the new result
     */
    public void setResult(String result) {
        this.result = result;
    }

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
    public void setFileURL(String fileURL) {
        this.fileURL = fileURL;
    }

}

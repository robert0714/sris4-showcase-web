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
 * The Class Rl02bc0DTO.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Rl02bc0DTO", propOrder = { "UseDate", "ReportType", "ReportURL", "FileURL" })
@XmlRootElement(name = "Rl02bc0DTO")
public class Rl02bc0DTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 8431788095599023197L;

    /** 使用日期 */
    @XmlElement(name = "UseDate", required = true)
    @FieldName("使用日期")
    private String useDate;

    /** 報表格式 */
    @XmlElement(name = "ReportType", required = true)
    @FieldName("報表格式")
    private String reportType;

    /** 報表路徑 */
    @XmlElement(name = "ReportURL", required = true)
    @FieldName("報表路徑")
    private String reportURL;

    /** 執行所回傳之下載檔案. */
    @XmlElement(name = "FileURL")
    @FieldName("執行所回傳之下載檔案")
    private String fileURL;

    public String getUseDate() {
        return useDate;
    }

    public void setUseDate(final String useDate) {
        this.useDate = useDate;
    }

    public String getReportType() {
        return reportType;
    }

    public void setReportType(final String reportType) {
        this.reportType = reportType;
    }

    public String getReportURL() {
        return reportURL;
    }

    public void setReportURL(final String reportURL) {
        this.reportURL = reportURL;
    }

    public String getFileURL() {
        return fileURL;
    }

    public void setFileURL(String fileURL) {
        this.fileURL = fileURL;
    }
}

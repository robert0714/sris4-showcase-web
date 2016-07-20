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
 * The Class Rl052f2DTO.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Rl052f2DTO", propOrder = { "noticeDate", "noticeEndDate", "reportType", "reportURL", "selectRadio" })
@XmlRootElement(name = "Rl052f2DTO")
public class Rl052f2DTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 8431788095599023197L;

    /** 內政部通報日期 */
    @XmlElement(name = "NoticeDate", required = true)
    @FieldName("內政部通報日期")
    private String noticeDate;

    /** 內政部通報日期(迄) */
    @XmlElement(name = "NoticeEndDate", required = true)
    @FieldName("內政部通報日期(迄)")
    private String noticeEndDate;

    /** 報表格式 */
    @XmlElement(name = "ReportType", required = true)
    @FieldName("報表格式")
    private String reportType;

    /** 報表路徑 */
    @XmlElement(name = "ReportURL", required = true)
    @FieldName("報表路徑")
    private String reportURL;

    /** 儲存選擇radio使用 */
    @XmlElement(name = "SelectRadio", required = true)
    @FieldName("儲存選擇radio使用")
    private String selectRadio = "1";

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

    public String getNoticeDate() {
        return noticeDate;
    }

    public void setNoticeDate(final String noticeDate) {
        this.noticeDate = noticeDate;
    }

    public String getSelectRadio() {
        return selectRadio;
    }

    public void setSelectRadio(String selectRadio) {
        this.selectRadio = selectRadio;
    }

    public String getNoticeEndDate() {
        return noticeEndDate;
    }

    public void setNoticeEndDate(String noticeEndDate) {
        this.noticeEndDate = noticeEndDate;
    }

}

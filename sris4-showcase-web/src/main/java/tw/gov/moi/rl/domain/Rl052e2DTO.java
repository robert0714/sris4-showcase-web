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
 * The Class Rl052e2DTO.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Rl052e2DTO", propOrder = { "NoticeStartDate", "NoticeEndDate", "ProcessStatus", "Paging",
        "ReportType", "ReportURL" })
@XmlRootElement(name = "Rl052e2DTO")
public class Rl052e2DTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 8431788095599023197L;

    /** 內政部通報日期(起) */
    @XmlElement(name = "NoticeStartDate", required = true)
    @FieldName("內政部通報日期(起)")
    private String noticeStartDate;

    /** 內政部通報日期(迄) */
    @XmlElement(name = "NoticeEndDate", required = true)
    @FieldName("內政部通報日期(迄)")
    private String noticeEndDate;

    /** 處理註記 */
    @XmlElement(name = "ProcessStatus", required = true)
    @FieldName("處理註記")
    private String processStatus;

    /** 換頁方式 */
    @XmlElement(name = "Paging", required = true)
    @FieldName("換頁方式")
    private String paging;

    /** 報表格式 */
    @XmlElement(name = "ReportType", required = true)
    @FieldName("報表格式")
    private String reportType;

    /** 報表路徑 */
    @XmlElement(name = "ReportURL", required = true)
    @FieldName("報表路徑")
    private String reportURL;

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

    public String getNoticeStartDate() {
        return noticeStartDate;
    }

    public void setNoticeStartDate(final String noticeStartDate) {
        this.noticeStartDate = noticeStartDate;
    }

    public String getNoticeEndDate() {
        return noticeEndDate;
    }

    public void setNoticeEndDate(final String noticeEndDate) {
        this.noticeEndDate = noticeEndDate;
    }

    public String getProcessStatus() {
        return processStatus;
    }

    public void setProcessStatus(final String processStatus) {
        this.processStatus = processStatus;
    }

    public String getPaging() {
        return paging;
    }

    public void setPaging(final String paging) {
        this.paging = paging;
    }

}

/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.domain;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;

/**
 * The Class Rl01463DTO.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Rl01463DTO", propOrder = { "NoticeStartDate", "NoticeEndDate", "HappenStartDate", "HappenEndDate",
        "QueryType", "PersonIdQuery", "personIdModify", "PersonIdQueryList" })
@XmlRootElement(name = "Rl01463DTO")
public class Rl01463DTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 8431788095599023197L;

    /** 通報日期(起) */
    @XmlElement(name = "NoticeStartDate", required = true)
    @FieldName("通報日期(起)")
    private String noticeStartDate;

    /** 通報日期(迄) */
    @XmlElement(name = "NoticeEndDate", required = true)
    @FieldName("通報日期(迄)")
    private String noticeEndDate;

    /** 發生日期(起) */
    @XmlElement(name = "HappenStartDate", required = true)
    @FieldName("發生日期(起)")
    private String happenStartDate;

    /** 發生日期(迄) */
    @XmlElement(name = "HappenEndDate", required = true)
    @FieldName("發生日期(迄)")
    private String happenEndDate;

    /** 查詢方式 */
    @XmlElement(name = "QueryType", required = true)
    @FieldName("查詢方式")
    private String queryType;

    /** 身分證統一編號 */
    @XmlElement(name = "PersonIdQuery", required = true)
    @FieldName("身分證統一編號")
    private String personIdQuery;

    /** 身分證統一編號-for修改 */
    @XmlElement(name = "personIdModify", required = true)
    @FieldName("身分證統一編號-for修改")
    private String personIdModify;

    /** 身分證統一編號清單 */
    @XmlElement(name = "PersonIdQueryList", required = true)
    @FieldName("作業點")
    private List<String> personIdQueryList;

    /** 報表格式 */
    @XmlElement(name = "ReportType", required = true)
    @FieldName("報表格式")
    private String reportType;

    /** 報表路徑 */
    @XmlElement(name = "ReportURL", required = true)
    @FieldName("報表路徑")
    private String reportURL;

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

    public String getHappenStartDate() {
        return happenStartDate;
    }

    public void setHappenStartDate(final String happenStartDate) {
        this.happenStartDate = happenStartDate;
    }

    public String getHappenEndDate() {
        return happenEndDate;
    }

    public void setHappenEndDate(final String happenEndDate) {
        this.happenEndDate = happenEndDate;
    }

    public String getQueryType() {
        return queryType;
    }

    public void setQueryType(final String queryType) {
        this.queryType = queryType;
    }

    public String getPersonIdQuery() {
        return personIdQuery;
    }

    public void setPersonIdQuery(final String personIdQuery) {
        this.personIdQuery = personIdQuery;
    }

    public String getPersonIdModify() {
        return personIdModify;
    }

    public void setPersonIdModify(final String personIdModify) {
        this.personIdModify = personIdModify;
    }

    public List<String> getPersonIdQueryList() {
        return personIdQueryList;
    }

    public void setPersonIdQueryList(final List<String> personIdQueryList) {
        this.personIdQueryList = personIdQueryList;
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

}

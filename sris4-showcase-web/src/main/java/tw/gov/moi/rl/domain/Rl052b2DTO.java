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
 * 列印死亡／相驗屍體證明書清冊.
 * 
 * @author Derek Wang
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Rl052b2DTO", propOrder = { "noticeDateStart", "noticeDateEnd", "sourceCode", "reportFormat",
        "reportURL", "rcProcessYyymm", "printMark", "rcOriginalId", "personId064m", "judicialPersonId",
        "noticePersonId062m", "noticePersonId063m", "personId053m", "regYyymmdd", "noticeYyymmdd", "noticePersonName",
        "noticeDeathYyymmdd", "noticeDataSource" })
@XmlRootElement(name = "Rl052b2DTO")
public class Rl052b2DTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 8431788095599023197L;

    /** 通報日期(起). */
    @XmlElement(name = "NoticeDateStart")
    @FieldName("通報日期(起)")
    private String noticeDateStart;

    /** 通報日期(迄). */
    @XmlElement(name = "NoticeDateEnd")
    @FieldName("通報日期(迄)")
    private String noticeDateEnd;

    /** 資料來源. */
    @XmlElement(name = "SourceCode")
    @FieldName("資料來源")
    private String[] sourceCode = new String[] {};

    /** 報表格式. */
    @XmlElement(name = "ReportFormat")
    @FieldName("報表格式")
    private String reportFormat;

    /** 報表路徑. */
    @XmlElement(name = "ReportURL")
    @FieldName("報表路徑")
    private String reportURL;

    /** 通報日期. */
    @XmlElement(name = "RcProcessYyymm")
    @FieldName("通報日期")
    private String rcProcessYyymm;

    /** 列印註記. */
    @XmlElement(name = "PrintMark")
    @FieldName("列印註記")
    private String printMark;

    /** 原通報統號. */
    @XmlElement(name = "RcOriginalId")
    @FieldName("原通報統號")
    private String rcOriginalId;

    /** 統一編號064m. */
    @XmlElement(name = "PersonId064m")
    @FieldName("統一編號064m")
    private String personId064m;

    /** 統一編號061m. */
    @XmlElement(name = "JudicialPersonId")
    @FieldName("統一編號061m")
    private String judicialPersonId;

    /** 統一編號062m. */
    @XmlElement(name = "NoticePersonId062m")
    @FieldName("統一編號062m")
    private String noticePersonId062m;

    /** 統一編號063m. */
    @XmlElement(name = "NoticePersonId063m")
    @FieldName("統一編號063m")
    private String noticePersonId063m;

    /** 統一編號053m. */
    @XmlElement(name = "PersonId053m")
    @FieldName("統一編號053m")
    private String personId053m;

    /** 登記日期. */
    @XmlElement(name = "RegYyymmdd")
    @FieldName("登記日期")
    private String regYyymmdd;

    /** 內政部通報日期. */
    @XmlElement(name = "NoticeYyymmdd")
    @FieldName("內政部通報日期")
    private String noticeYyymmdd;

    /** 通報-姓名. */
    @XmlElement(name = "NoticePersonName")
    @FieldName("通報-姓名")
    private String noticePersonName;

    /** 通報-死亡日期. */
    @XmlElement(name = "NoticeDeathYyymmdd")
    @FieldName("通報-死亡日期")
    private String noticeDeathYyymmdd;

    /** 通報-資料來源. */
    @XmlElement(name = "NoticeDataSource")
    @FieldName("通報-資料來源")
    private String noticeDataSource;

    /**
     * Gets the notice date start.
     * 
     * @return the notice date start
     */
    public String getNoticeDateStart() {
        return noticeDateStart;
    }

    /**
     * Sets the notice date start.
     * 
     * @param noticeDateStart
     *            the new notice date start
     */
    public void setNoticeDateStart(String noticeDateStart) {
        this.noticeDateStart = noticeDateStart;
    }

    /**
     * Gets the notice date end.
     * 
     * @return the notice date end
     */
    public String getNoticeDateEnd() {
        return noticeDateEnd;
    }

    /**
     * Sets the notice date end.
     * 
     * @param noticeDateEnd
     *            the new notice date end
     */
    public void setNoticeDateEnd(String noticeDateEnd) {
        this.noticeDateEnd = noticeDateEnd;
    }

    /**
     * Gets the source code.
     * 
     * @return the source code
     */
    public String[] getSourceCode() {
        return sourceCode;
    }

    /**
     * Sets the source code.
     * 
     * @param sourceCode
     *            the new source code
     */
    public void setSourceCode(String[] sourceCode) {
        this.sourceCode = sourceCode;
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

    /**
     * Gets the rc process yyymm.
     * 
     * @return the rc process yyymm
     */
    public String getRcProcessYyymm() {
        return rcProcessYyymm;
    }

    /**
     * Sets the rc process yyymm.
     * 
     * @param rcProcessYyymm
     *            the new rc process yyymm
     */
    public void setRcProcessYyymm(String rcProcessYyymm) {
        this.rcProcessYyymm = rcProcessYyymm;
    }

    /**
     * Gets the prints the mark.
     * 
     * @return the prints the mark
     */
    public String getPrintMark() {
        return printMark;
    }

    /**
     * Sets the prints the mark.
     * 
     * @param printMark
     *            the new prints the mark
     */
    public void setPrintMark(String printMark) {
        this.printMark = printMark;
    }

    /**
     * Gets the rc original id.
     * 
     * @return the rc original id
     */
    public String getRcOriginalId() {
        return rcOriginalId;
    }

    /**
     * Sets the rc original id.
     * 
     * @param rcOriginalId
     *            the new rc original id
     */
    public void setRcOriginalId(String rcOriginalId) {
        this.rcOriginalId = rcOriginalId;
    }

    /**
     * Gets the person id064m.
     * 
     * @return the person id064m
     */
    public String getPersonId064m() {
        return personId064m;
    }

    /**
     * Sets the person id064m.
     * 
     * @param personId064m
     *            the new person id064m
     */
    public void setPersonId064m(String personId064m) {
        this.personId064m = personId064m;
    }

    /**
     * Gets the judicial person id.
     * 
     * @return the judicial person id
     */
    public String getJudicialPersonId() {
        return judicialPersonId;
    }

    /**
     * Sets the judicial person id.
     * 
     * @param judicialPersonId
     *            the new judicial person id
     */
    public void setJudicialPersonId(String judicialPersonId) {
        this.judicialPersonId = judicialPersonId;
    }

    /**
     * Gets the notice person id062m.
     * 
     * @return the notice person id062m
     */
    public String getNoticePersonId062m() {
        return noticePersonId062m;
    }

    /**
     * Sets the notice person id062m.
     * 
     * @param noticePersonId062m
     *            the new notice person id062m
     */
    public void setNoticePersonId062m(String noticePersonId062m) {
        this.noticePersonId062m = noticePersonId062m;
    }

    /**
     * Gets the notice person id063m.
     * 
     * @return the notice person id063m
     */
    public String getNoticePersonId063m() {
        return noticePersonId063m;
    }

    /**
     * Sets the notice person id063m.
     * 
     * @param noticePersonId063m
     *            the new notice person id063m
     */
    public void setNoticePersonId063m(String noticePersonId063m) {
        this.noticePersonId063m = noticePersonId063m;
    }

    /**
     * Gets the person id053m.
     * 
     * @return the person id053m
     */
    public String getPersonId053m() {
        return personId053m;
    }

    /**
     * Sets the person id053m.
     * 
     * @param personId053m
     *            the new person id053m
     */
    public void setPersonId053m(String personId053m) {
        this.personId053m = personId053m;
    }

    /**
     * Gets the reg yyymmdd.
     * 
     * @return the reg yyymmdd
     */
    public String getRegYyymmdd() {
        return regYyymmdd;
    }

    /**
     * Sets the reg yyymmdd.
     * 
     * @param regYyymmdd
     *            the new reg yyymmdd
     */
    public void setRegYyymmdd(String regYyymmdd) {
        this.regYyymmdd = regYyymmdd;
    }

    /**
     * Gets the notice yyymmdd.
     * 
     * @return the notice yyymmdd
     */
    public String getNoticeYyymmdd() {
        return noticeYyymmdd;
    }

    /**
     * Sets the notice yyymmdd.
     * 
     * @param noticeYyymmdd
     *            the new notice yyymmdd
     */
    public void setNoticeYyymmdd(String noticeYyymmdd) {
        this.noticeYyymmdd = noticeYyymmdd;
    }

    /**
     * Gets the notice person name.
     * 
     * @return the notice person name
     */
    public String getNoticePersonName() {
        return noticePersonName;
    }

    /**
     * Sets the notice person name.
     * 
     * @param noticePersonName
     *            the new notice person name
     */
    public void setNoticePersonName(String noticePersonName) {
        this.noticePersonName = noticePersonName;
    }

    /**
     * Gets the notice death yyymmdd.
     * 
     * @return the notice death yyymmdd
     */
    public String getNoticeDeathYyymmdd() {
        return noticeDeathYyymmdd;
    }

    /**
     * Sets the notice death yyymmdd.
     * 
     * @param noticeDeathYyymmdd
     *            the new notice death yyymmdd
     */
    public void setNoticeDeathYyymmdd(String noticeDeathYyymmdd) {
        this.noticeDeathYyymmdd = noticeDeathYyymmdd;
    }

    /**
     * Gets the notice data source.
     * 
     * @return the notice data source
     */
    public String getNoticeDataSource() {
        return noticeDataSource;
    }

    /**
     * Sets the notice data source.
     * 
     * @param noticeDataSource
     *            the new notice data source
     */
    public void setNoticeDataSource(String noticeDataSource) {
        this.noticeDataSource = noticeDataSource;
    }

}

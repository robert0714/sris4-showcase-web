/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;

/**
 * Rl08f3dDTO.
 * 
 * @author Weiren.Jheng
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl08f3dDTO", propOrder = { "reportDate", "reportName", "reportFormat", "reportURL", "voteCode",
        "voteDate", "reportType", "votePointStart", "votePointEnd", "reportBaseDate", "labelHead", "votePointList" })
@XmlRootElement(name = "Rl08f3dDTO")
public class Rl08f3dDTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** The report date. */
    @XmlElement(name = "ReportDate")
    @FieldName("報表日期")
    private String reportDate = "";

    /** The report name. */
    @XmlElement(name = "ReportName")
    @FieldName("報表名稱")
    private String reportName = "";

    /** The report format. */
    @XmlElement(name = "ReportFormat")
    @FieldName("檔案格式")
    private String reportFormat = "";

    /** The report url. */
    @XmlElement(name = "ReportURL")
    @FieldName("檔案路徑")
    private String reportURL = "";

    /** 選舉組合代碼. */
    @XmlElement(name = "VoteCode")
    @FieldName("選舉組合代碼")
    private String voteCode = "";

    /** 投票日期. */
    @XmlElement(name = "VoteDate")
    @FieldName("投票日期")
    private String voteDate = "";

    /** 報表類別. */
    @XmlElement(name = "ReportType")
    @FieldName("報表類別")
    private String reportType = "";

    /** 投票所起. */
    @XmlElement(name = "VotePointStart")
    @FieldName("投票所起")
    private String votePointStart = "";

    /** 投票所迄. */
    @XmlElement(name = "VotePointEnd")
    @FieldName("投票所迄")
    private String votePointEnd = "";

    /** 造冊基準日. */
    @XmlElement(name = "ReportBaseDate")
    @FieldName("造冊基準日")
    private String reportBaseDate = "";

    /** The label head. */
    @XmlElement(name = "LabelHead")
    @FieldName("標題名稱")
    private String labelHead;

    /** 投票所清單. */
    @XmlElement(name = "VotePointList")
    @FieldName("投票所清單")
    private List<String> votePointList = new ArrayList<String>();

    /**
     * Gets the report date.
     * 
     * @return the report date
     */
    public String getReportDate() {
        return reportDate;
    }

    /**
     * Sets the report date.
     * 
     * @param reportDate
     *            the new report date
     */
    public void setReportDate(String reportDate) {
        this.reportDate = reportDate;
    }

    /**
     * Gets the report name.
     * 
     * @return the report name
     */
    public String getReportName() {
        return reportName;
    }

    /**
     * Sets the report name.
     * 
     * @param reportName
     *            the new report name
     */
    public void setReportName(String reportName) {
        this.reportName = reportName;
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
     * Gets the vote code.
     * 
     * @return the vote code
     */
    public String getVoteCode() {
        return voteCode;
    }

    /**
     * Sets the vote code.
     * 
     * @param voteCode
     *            the new vote code
     */
    public void setVoteCode(String voteCode) {
        this.voteCode = voteCode;
    }

    /**
     * Gets the vote date.
     * 
     * @return the vote date
     */
    public String getVoteDate() {
        return voteDate;
    }

    /**
     * Sets the vote date.
     * 
     * @param voteDate
     *            the new vote date
     */
    public void setVoteDate(String voteDate) {
        this.voteDate = voteDate;
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

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "Rl08f3dDTO [reportDate=" + reportDate + ", reportName=" + reportName + ", reportFormat=" + reportFormat
                + ", reportURL=" + reportURL + ", voteCode=" + voteCode + ", voteDate=" + voteDate + ", reportType="
                + reportType + ", votePointStart=" + votePointStart + ", votePointEnd=" + votePointEnd
                + ", reportBaseDate=" + reportBaseDate + "]";
    }

    /**
     * Gets the vote point start.
     * 
     * @return the vote point start
     */
    public String getVotePointStart() {
        return votePointStart;
    }

    /**
     * Sets the vote point start.
     * 
     * @param votePointStart
     *            the new vote point start
     */
    public void setVotePointStart(String votePointStart) {
        this.votePointStart = votePointStart;
    }

    /**
     * Gets the vote point end.
     * 
     * @return the vote point end
     */
    public String getVotePointEnd() {
        return votePointEnd;
    }

    /**
     * Sets the vote point end.
     * 
     * @param votePointEnd
     *            the new vote point end
     */
    public void setVotePointEnd(String votePointEnd) {
        this.votePointEnd = votePointEnd;
    }

    /**
     * Gets the report base date.
     * 
     * @return the report base date
     */
    public String getReportBaseDate() {
        return reportBaseDate;
    }

    /**
     * Sets the report base date.
     * 
     * @param reportBaseDate
     *            the new report base date
     */
    public void setReportBaseDate(String reportBaseDate) {
        this.reportBaseDate = reportBaseDate;
    }

    /**
     * Gets the label head.
     * 
     * @param labelHead
     *            the new label head
     * @return the label head
     */
    public void setLabelHead(String labelHead) {
        this.labelHead = labelHead;
    }

    /**
     * Sets the label head.
     * 
     * @return the label head
     */
    public String getLabelHead() {
        return labelHead;
    }

    /**
     * Gets the vote point list.
     * 
     * @return the vote point list
     */
    public List<String> getVotePointList() {
        return votePointList;
    }

    /**
     * Sets the vote point list.
     * 
     * @param votePointList
     *            the new vote point list
     */
    public void setVotePointList(List<String> votePointList) {
        this.votePointList = votePointList;
    }

}

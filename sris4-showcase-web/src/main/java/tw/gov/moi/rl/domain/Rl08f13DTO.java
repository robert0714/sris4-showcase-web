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
 * The Class Rl08f13DTO.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl08f13DTO", propOrder = { "votePointStart", "votePointEnd", "reportFormat", "reportURL", "voteDate",
        "voteCode", "autoVotePointList", "labelHead" })
@XmlRootElement(name = "Rl08f13DTO")
public class Rl08f13DTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** 投票所(起). */
    @XmlElement(name = "VotePointStart")
    @FieldName("投票所(起)")
    private String votePointStart;

    /** 投票所(迄). */
    @XmlElement(name = "VotePointEnd")
    @FieldName("投票所(迄)")
    private String votePointEnd;

    /** 報表格式. */
    @XmlElement(name = "ReportFormat")
    @FieldName("報表格式")
    private String reportFormat;

    /** 報表URL. */
    @XmlElement(name = "ReportURL")
    @FieldName("報表URL")
    private String reportURL;

    /** 投票日期. */
    @XmlElement(name = "VoteDate")
    @FieldName("投票日期")
    private String voteDate;

    /** 選舉組合代碼. */
    @XmlElement(name = "VoteCode")
    @FieldName("選舉組合代碼")
    private String voteCode;

    /** 投票所清單. */
    @XmlElement(name = "AutoVotePointList")
    @FieldName("投票所清單")
    private List<String> autoVotePointList;

    @XmlElement(name = "LabelHead")
    @FieldName("標題名稱")
    private String labelHead;

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
     * Gets the auto vote point list.
     * 
     * @return the auto vote point list
     */
    public List<String> getAutoVotePointList() {
        return autoVotePointList;
    }

    /**
     * Sets the auto vote point list.
     * 
     * @param autoVotePointList
     *            the new auto vote point list
     */
    public void setAutoVotePointList(List<String> autoVotePointList) {
        this.autoVotePointList = autoVotePointList;
    }

    /**
     * @return the labelHead
     */
    public String getLabelHead() {
        return labelHead;
    }

    /**
     * @param labelHead
     *            the labelHead to set
     */
    public void setLabelHead(String labelHead) {
        this.labelHead = labelHead;
    }
}

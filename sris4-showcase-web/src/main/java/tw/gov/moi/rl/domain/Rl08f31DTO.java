/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;
import tw.gov.moi.domain.Rlde800wType;

/**
 * 列印選舉人名冊 DTO.
 * 
 * @author 劉嘉煒
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl08f31DTO", propOrder = { "voteCode", "voteDate", "votePoint", "voteReportName", "reportDate",
        "votePointList", "reportUrl", "reportParams", "reportName", "rlde800wFlag", "rlde800w", "url", "votePointEnd",
        "labelHead" })
@XmlRootElement(name = "Rl08f31DTO")
public class Rl08f31DTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** 選舉組合代碼. */
    @XmlElement(name = "VoteCode")
    @FieldName("選舉組合代碼")
    private String voteCode = "";

    /** 投票日期. */
    @XmlElement(name = "VoteDate")
    @FieldName("投票日期")
    private String voteDate = "";

    /** 投票所. */
    @XmlElement(name = "VotePoint")
    @FieldName("投票所(起)")
    private String votePoint = "";

    /** 選舉名冊名稱. */
    @XmlElement(name = "VoteReportName")
    @FieldName("選舉名冊名稱")
    private String voteReportName = "";

    /** 製表日期. */
    @XmlElement(name = "ReportDate")
    @FieldName("製表日期")
    private String reportDate = "";

    /** 投票所清單. */
    @XmlElement(name = "VotePointList")
    @FieldName("投票所清單")
    private List<String> votePointList = new ArrayList<String>();

    /** 報表路徑. */
    @XmlElement(name = "ReportUrl")
    @FieldName("報表路徑")
    private String reportUrl = "";

    /** 報表參數. */
    @XmlElement(name = "ReportParams")
    @FieldName("報表參數")
    private HashMap<String, String> reportParams = new HashMap<String, String>();

    /** 報表名稱. */
    @XmlElement(name = "ReportName")
    @FieldName("報表名稱")
    private String reportName = "";

    /** 是否有選舉組合作用檔. */
    @XmlElement(name = "Rlde800wFlag")
    @FieldName("是否有選舉組合作用檔")
    private boolean rlde800wFlag = false;

    /** 選舉組合作用檔. */
    @XmlElement(name = "Rlde800w")
    @FieldName("選舉組合作用檔")
    private Rlde800wType rlde800w;

    @XmlElement(name = "Url", required = true)
    @FieldName("URL")
    private String url = "";

    /** 投票所(迄). */
    @XmlElement(name = "VotePoint")
    @FieldName("投票所(迄)")
    private String votePointEnd = "";

    @XmlElement(name = "LabelHead")
    @FieldName("標題名稱")
    private String labelHead;

    public String getVoteCode() {
        return voteCode;
    }

    public void setVoteCode(String voteCode) {
        this.voteCode = voteCode;
    }

    public String getVoteDate() {
        return voteDate;
    }

    public void setVoteDate(String voteDate) {
        this.voteDate = voteDate;
    }

    public String getVotePoint() {
        return votePoint;
    }

    public void setVotePoint(String votePoint) {
        this.votePoint = votePoint;
    }

    public String getVoteReportName() {
        return voteReportName;
    }

    public void setVoteReportName(String voteReportName) {
        this.voteReportName = voteReportName;
    }

    public String getReportDate() {
        return reportDate;
    }

    public void setReportDate(String reportDate) {
        this.reportDate = reportDate;
    }

    public List<String> getVotePointList() {
        return votePointList;
    }

    public void setVotePointList(List<String> votePointList) {
        this.votePointList = votePointList;
    }

    public String getReportUrl() {
        return reportUrl;
    }

    public void setReportUrl(String reportUrl) {
        this.reportUrl = reportUrl;
    }

    public HashMap<String, String> getReportParams() {
        return reportParams;
    }

    public void setReportParams(HashMap<String, String> reportParams) {
        this.reportParams = reportParams;
    }

    public String getReportName() {
        return reportName;
    }

    public void setReportName(String reportName) {
        this.reportName = reportName;
    }

    public boolean isRlde800wFlag() {
        return rlde800wFlag;
    }

    public void setRlde800wFlag(boolean rlde800wFlag) {
        this.rlde800wFlag = rlde800wFlag;
    }

    public Rlde800wType getRlde800w() {
        return rlde800w;
    }

    public void setRlde800w(Rlde800wType rlde800w) {
        this.rlde800w = rlde800w;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getVotePointEnd() {
        return votePointEnd;
    }

    public void setVotePointEnd(String votePointEnd) {
        this.votePointEnd = votePointEnd;
    }

    public String getLabelHead() {
        return labelHead;
    }

    public void setLabelHead(String labelHead) {
        this.labelHead = labelHead;
    }

}

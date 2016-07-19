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

/**
 * 製作返國投票選舉人名冊 DTO.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl08f3aDTO", propOrder = { "VoteCode", "VoteDate", "VotePoint", "VoteName11", "VoteName12",
        "VoteName21", "VoteName22", "VoteName31", "VoteName32", "VoteLivingStyle", "ReportDate", "ReportName",
        "ReportUrl", "ReportUrl2", "ReportParam", "VotePointList", "labelHead" })
@XmlRootElement(name = "Rl08f3aDTO")
public class Rl08f3aDTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** 選舉組合代碼 */
    @XmlElement(name = "VoteCode")
    @FieldName("選舉組合代碼")
    private String voteCode;

    /** 投票日期 */
    @XmlElement(name = "VoteDate")
    @FieldName("投票日期")
    private String voteDate;

    /** 投票所 */
    @XmlElement(name = "VotePoint")
    @FieldName("投票所")
    private String votePoint;

    /** 選舉名冊名稱 */
    @XmlElement(name = "ReportTitle")
    @FieldName("選舉名冊名稱")
    private String reportTitle;

    /** 選舉名冊選舉權名稱(一) */
    @XmlElement(name = "VoteName11")
    @FieldName("選舉名冊選舉權名稱(一)")
    private String voteName11;

    /** 選舉名冊選舉權名稱(一) */
    @XmlElement(name = "VoteName12")
    @FieldName("選舉名冊選舉權名稱(一)")
    private String voteName12;

    /** 選舉名冊選舉權名稱(二) */
    @XmlElement(name = "VoteName21")
    @FieldName("選舉名冊選舉權名稱(二)")
    private String voteName21;

    /** 選舉名冊選舉權名稱(二) */
    @XmlElement(name = "VoteName22")
    @FieldName("選舉名冊選舉權名稱(二)")
    private String voteName22;

    /** 選舉名冊選舉權名稱(三) */
    @XmlElement(name = "VoteName31")
    @FieldName("選舉名冊選舉權名稱(三)")
    private String voteName31;

    /** 選舉名冊選舉權名稱(三) */
    @XmlElement(name = "VoteName32")
    @FieldName("選舉名冊選舉權名稱(三)")
    private String voteName32;

    /** 選舉權(三)選舉人身分名稱 */
    @XmlElement(name = "VoteLivingStyle")
    @FieldName("選舉權(三)選舉人身分名稱")
    private List<String> voteLivingStyle;

    /** 製表日期 */
    @XmlElement(name = "ReportDate")
    @FieldName("製表日期")
    private String reportDate;

    /** 報表名稱 */
    @XmlElement(name = "ReportName")
    @FieldName("報表名稱")
    private String reportName;

    /** 報表位置 */
    @XmlElement(name = "ReportUrl")
    @FieldName("報表位置")
    private String reportUrl;

    /** 報表位置 */
    @XmlElement(name = "ReportUrl2")
    @FieldName("報表位置")
    private String reportUrl2;

    /** 報表參數 */
    @XmlElement(name = "ReportParam")
    @FieldName("報表參數")
    private HashMap<String, String> reportParam;

    /** 投票所清單. */
    @XmlElement(name = "VotePointList")
    @FieldName("投票所清單")
    private List<String> votePointList = new ArrayList<String>();

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

    public String getReportTitle() {
        return reportTitle;
    }

    public void setReportTitle(String reportTitle) {
        this.reportTitle = reportTitle;
    }

    public String getVoteName11() {
        return voteName11;
    }

    public void setVoteName11(String voteName11) {
        this.voteName11 = voteName11;
    }

    public String getVoteName12() {
        return voteName12;
    }

    public void setVoteName12(String voteName12) {
        this.voteName12 = voteName12;
    }

    public String getVoteName21() {
        return voteName21;
    }

    public void setVoteName21(String voteName21) {
        this.voteName21 = voteName21;
    }

    public String getVoteName22() {
        return voteName22;
    }

    public void setVoteName22(String voteName22) {
        this.voteName22 = voteName22;
    }

    public String getVoteName31() {
        return voteName31;
    }

    public void setVoteName31(String voteName31) {
        this.voteName31 = voteName31;
    }

    public String getVoteName32() {
        return voteName32;
    }

    public void setVoteName32(String voteName32) {
        this.voteName32 = voteName32;
    }

    public List<String> getVoteLivingStyle() {
        return voteLivingStyle;
    }

    public void setVoteLivingStyle(List<String> voteLivingStyle) {
        this.voteLivingStyle = voteLivingStyle;
    }

    public String getReportDate() {
        return reportDate;
    }

    public void setReportDate(String reportDate) {
        this.reportDate = reportDate;
    }

    public String getReportName() {
        return reportName;
    }

    public void setReportName(String reportName) {
        this.reportName = reportName;
    }

    public String getReportUrl() {
        return reportUrl;
    }

    public void setReportUrl(String reportUrl) {
        this.reportUrl = reportUrl;
    }

    public String getReportUrl2() {
        return reportUrl2;
    }

    public void setReportUrl2(String reportUrl2) {
        this.reportUrl2 = reportUrl2;
    }

    public HashMap<String, String> getReportParam() {
        return reportParam;
    }

    public void setReportParam(HashMap<String, String> reportParam) {
        this.reportParam = reportParam;
    }

    public List<String> getVotePointList() {
        return votePointList;
    }

    public void setVotePointList(List<String> votePointList) {
        this.votePointList = votePointList;
    }

    public String getLabelHead() {
        return labelHead;
    }

    public void setLabelHead(String labelHead) {
        this.labelHead = labelHead;
    }

}

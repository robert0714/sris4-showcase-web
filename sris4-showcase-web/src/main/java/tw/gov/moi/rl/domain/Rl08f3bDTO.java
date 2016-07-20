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
 * 返國投票選舉人投票通知單 DTO.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl08f3bDTO", propOrder = { "VoteCode", "VoteDate", "VotePoint", "ReportName", "VoteBillName1",
        "VoteBillName2", "VoteBillName3", "VoteLivingStyle", "ReportDate", "VotePointList", "labelHead" })
@XmlRootElement(name = "Rl08f3bDTO")
public class Rl08f3bDTO implements Serializable {

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
    @XmlElement(name = "ReportName")
    @FieldName("選舉名冊名稱")
    private String reportName;

    /** 投票通知單-選舉種類(一) */
    @XmlElement(name = "VoteBillName1")
    @FieldName("投票通知單-選舉種類(一)")
    private String voteBillName1;

    /** 投票通知單-選舉種類(二) */
    @XmlElement(name = "VoteBillName2")
    @FieldName("投票通知單-選舉種類(二)")
    private String voteBillName2;

    /** 投票通知單-選舉種類(三) */
    @XmlElement(name = "VoteBillName3")
    @FieldName("投票通知單-選舉種類(三)")
    private String voteBillName3;

    /** 選舉權(三)選舉人身分名稱 */
    @XmlElement(name = "VoteLivingStyle")
    @FieldName("選舉權(三)選舉人身分名稱")
    private List<String> voteLivingStyle;

    /** 製表日期 */
    @XmlElement(name = "ReportDate")
    @FieldName("製表日期")
    private String reportDate;

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

    public String getReportName() {
        return reportName;
    }

    public void setReportName(String reportName) {
        this.reportName = reportName;
    }

    public String getVoteBillName1() {
        return voteBillName1;
    }

    public void setVoteBillName1(String voteBillName1) {
        this.voteBillName1 = voteBillName1;
    }

    public String getVoteBillName2() {
        return voteBillName2;
    }

    public void setVoteBillName2(String voteBillName2) {
        this.voteBillName2 = voteBillName2;
    }

    public String getVoteBillName3() {
        return voteBillName3;
    }

    public void setVoteBillName3(String voteBillName3) {
        this.voteBillName3 = voteBillName3;
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

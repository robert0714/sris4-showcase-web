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
import tw.gov.moi.rs.domain.VoterRollsInfoDTO;

/**
 * 列印選舉空白報表DTO.
 * 
 * @author Stnaley.Li
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl08f30DTO", propOrder = { "voteCode", "voteDate", "voteRosterType", "votePoint", "voteReportName",
        "voteName1", "voteName2", "voteName3", "voteName4", "voteName5", "voteLivingStyle2", "voteLivingStyle3",
        "reportDate", "voteName1_2", "voteName2_2", "voteName3_2", "votePointList", "voteType", "issueNumber",
        "issueName1", "issueName2", "issueName3", "issueName4", "issueName5", "activeVoteType1", "activeVoteType2",
        "activeVoteType3", "activeVoteType4", "activeVoteType5", "reportUrl", "reportParams", "reportName",
        "rlde800wFlag", "rlde800w", "reportType", "subTitle", "labelHead", "subTitle2", "voterRollsInfoDTO",
        "reportExt" })
@XmlRootElement(name = "Rl08f30DTO")
public class Rl08f30DTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** The vote code. */
    @XmlElement(name = "VoteCode")
    @FieldName("選舉組合代碼")
    private String voteCode = "";

    /** The vote date. */
    @XmlElement(name = "VoteDate")
    @FieldName("投票日期")
    private String voteDate = "";

    /** The vote roster type. */
    @XmlElement(name = "VoteRosterType")
    @FieldName("選舉名冊類別")
    private String voteRosterType = "";

    /** The vote point. */
    @XmlElement(name = "VotePoint")
    @FieldName("投票所")
    private String votePoint = "";

    /** The vote report name. */
    @XmlElement(name = "VoteReportName")
    @FieldName("選舉名冊名稱")
    private String voteReportName = "";

    /** The vote name1. */
    @XmlElement(name = "VoteName1")
    @FieldName("選舉名冊選舉權名稱（一）")
    private String voteName1 = "";

    /** The vote name2. */
    @XmlElement(name = "VoteName2")
    @FieldName("選舉名冊選舉權名稱（二）")
    private String voteName2 = "";

    /** The vote name3. */
    @XmlElement(name = "VoteName3")
    @FieldName("選舉名冊選舉權名稱（三）")
    private String voteName3 = "";

    /** The vote name4. */
    @XmlElement(name = "VoteName4")
    @FieldName("選舉名冊選舉權名稱（四）")
    private String voteName4 = "";

    /** The vote name5. */
    @XmlElement(name = "VoteName5")
    @FieldName("選舉名冊選舉權名稱（五）")
    private String voteName5 = "";

    /** The vote living style2. */
    @XmlElement(name = "VoteLivingStyle2")
    @FieldName("選舉權（二）選舉人身分名稱")
    private List<String> voteLivingStyle2 = new ArrayList<String>();

    /** The vote living style3. */
    @XmlElement(name = "VoteLivingStyle3")
    @FieldName("選舉權（三）選舉人身分名稱")
    private List<String> voteLivingStyle3 = new ArrayList<String>();

    /** The report date. */
    @XmlElement(name = "ReportDate")
    @FieldName("製表日期")
    private String reportDate = "";

    /** The vote name1_2. */
    @XmlElement(name = "VoteName1_2")
    @FieldName("選舉名冊選舉權名稱（一）之二")
    private String voteName1_2 = "";

    /** The vote name2_2. */
    @XmlElement(name = "VoteName2_2")
    @FieldName("選舉名冊選舉權名稱（二）之二")
    private String voteName2_2 = "";

    /** The vote name3_2. */
    @XmlElement(name = "VoteName3_2")
    @FieldName("選舉名冊選舉權名稱（三）之二")
    private String voteName3_2 = "";

    /** The vote point list. */
    @XmlElement(name = "VotePointList")
    @FieldName("投票所清單")
    private List<String> votePointList = new ArrayList<String>();

    /** The vote type. */
    @XmlElement(name = "VoteType")
    @FieldName("公民投票種類")
    private String voteType = "";

    /** The issue number. */
    @XmlElement(name = "IssueNumber")
    @FieldName("議題個數")
    private String issueNumber = "";

    /** The issue name1. */
    @XmlElement(name = "IssueName1")
    @FieldName("議題個數名稱1")
    private String issueName1 = "";

    /** The issue name2. */
    @XmlElement(name = "IssueName2")
    @FieldName("議題個數名稱2")
    private String issueName2 = "";

    /** The issue name3. */
    @XmlElement(name = "IssueName3")
    @FieldName("議題個數名稱3")
    private String issueName3 = "";

    /** The issue name4. */
    @XmlElement(name = "IssueName4")
    @FieldName("議題個數名稱4")
    private String issueName4 = "";

    /** The issue name5. */
    @XmlElement(name = "IssueName5")
    @FieldName("議題個數名稱5")
    private String issueName5 = "";

    /** The active vote type1. */
    @XmlElement(name = "ActiveVoteType1")
    @FieldName("選舉種類（一）")
    private String activeVoteType1 = "";

    /** The active vote type2. */
    @XmlElement(name = "ActiveVoteType2")
    @FieldName("選舉種類（二）")
    private String activeVoteType2 = "";

    /** The active vote type3. */
    @XmlElement(name = "ActiveVoteType3")
    @FieldName("選舉種類（三）")
    private String activeVoteType3 = "";

    /** The active vote type3. */
    @XmlElement(name = "ActiveVoteType4")
    @FieldName("選舉種類（四）")
    private String activeVoteType4 = "";

    /** The active vote type3. */
    @XmlElement(name = "ActiveVoteType5")
    @FieldName("選舉種類（五）")
    private String activeVoteType5 = "";

    /** The report url. */
    @XmlElement(name = "ReportUrl")
    @FieldName("報表路徑")
    private String reportUrl = "";

    /** The report params. */
    @XmlElement(name = "ReportParams")
    @FieldName("報表參數")
    private HashMap<String, String> reportParams = new HashMap<String, String>();

    /** The report name. */
    @XmlElement(name = "ReportName")
    @FieldName("報表名稱")
    private String reportName = "";

    /** The rlde800w flag. */
    @XmlElement(name = "Rlde800wFlag")
    @FieldName("是否有選舉組合作用檔")
    private boolean rlde800wFlag = false;

    /** The rlde800w. */
    @XmlElement(name = "Rlde800w")
    @FieldName("選舉組合作用檔")
    private Rlde800wType rlde800w;

    /** The report type. */
    @XmlElement(name = "ReportType")
    @FieldName("報表種類")
    private String reportType = "";

    /** 選舉名冊種類. */
    @XmlElement(name = "SubTitle")
    @FieldName("選舉名冊種類")
    private String subTitle = "";

    /** The label head. */
    @XmlElement(name = "LabelHead")
    @FieldName("標題名稱")
    private String labelHead;

    /** 選舉名冊種類2. */
    @XmlElement(name = "SubTitle2")
    @FieldName("選舉名冊種類2")
    private String subTitle2 = "";

    /** 選舉名冊資訊DTO */
    @FieldName("選舉名冊資訊DTO")
    @XmlElement(name = "VoterRollsInfoDTO", required = true)
    private VoterRollsInfoDTO voterRollsInfoDTO;

    /** 選舉空白報表識別. */
    @FieldName("選舉空白報表識別")
    @XmlElement(name = "ReportExt", required = true)
    private String reportExt = "";

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
    public void setVoteCode(final String voteCode) {
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
    public void setVoteDate(final String voteDate) {
        this.voteDate = voteDate;
    }

    /**
     * Gets the vote roster type.
     * 
     * @return the vote roster type
     */
    public String getVoteRosterType() {
        return voteRosterType;
    }

    /**
     * Sets the vote roster type.
     * 
     * @param voteRosterType
     *            the new vote roster type
     */
    public void setVoteRosterType(final String voteRosterType) {
        this.voteRosterType = voteRosterType;
    }

    /**
     * Gets the vote point.
     * 
     * @return the vote point
     */
    public String getVotePoint() {
        return votePoint;
    }

    /**
     * Sets the vote point.
     * 
     * @param votePoint
     *            the new vote point
     */
    public void setVotePoint(final String votePoint) {
        this.votePoint = votePoint;
    }

    /**
     * Gets the vote report name.
     * 
     * @return the vote report name
     */
    public String getVoteReportName() {
        return voteReportName;
    }

    /**
     * Sets the vote report name.
     * 
     * @param voteReportName
     *            the new vote report name
     */
    public void setVoteReportName(final String voteReportName) {
        this.voteReportName = voteReportName;
    }

    /**
     * Gets the vote name1.
     * 
     * @return the vote name1
     */
    public String getVoteName1() {
        return voteName1;
    }

    /**
     * Sets the vote name1.
     * 
     * @param voteName1
     *            the new vote name1
     */
    public void setVoteName1(final String voteName1) {
        this.voteName1 = voteName1;
    }

    /**
     * Gets the vote name2.
     * 
     * @return the vote name2
     */
    public String getVoteName2() {
        return voteName2;
    }

    /**
     * Sets the vote name2.
     * 
     * @param voteName2
     *            the new vote name2
     */
    public void setVoteName2(final String voteName2) {
        this.voteName2 = voteName2;
    }

    /**
     * Gets the vote name3.
     * 
     * @return the vote name3
     */
    public String getVoteName3() {
        return voteName3;
    }

    /**
     * Sets the vote name3.
     * 
     * @param voteName3
     *            the new vote name3
     */
    public void setVoteName3(final String voteName3) {
        this.voteName3 = voteName3;
    }

    /**
     * Gets the vote living style2.
     * 
     * @return the vote living style2
     */
    public List<String> getVoteLivingStyle2() {
        return voteLivingStyle2;
    }

    /**
     * Sets the vote living style2.
     * 
     * @param voteLivingStyle2
     *            the new vote living style2
     */
    public void setVoteLivingStyle2(final List<String> voteLivingStyle2) {
        this.voteLivingStyle2 = voteLivingStyle2;
    }

    /**
     * Gets the vote living style3.
     * 
     * @return the vote living style3
     */
    public List<String> getVoteLivingStyle3() {
        return voteLivingStyle3;
    }

    /**
     * Sets the vote living style3.
     * 
     * @param voteLivingStyle3
     *            the new vote living style3
     */
    public void setVoteLivingStyle3(final List<String> voteLivingStyle3) {
        this.voteLivingStyle3 = voteLivingStyle3;
    }

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
    public void setReportDate(final String reportDate) {
        this.reportDate = reportDate;
    }

    /**
     * Gets the vote name1_2.
     * 
     * @return the vote name1_2
     */
    public String getVoteName1_2() {
        return voteName1_2;
    }

    /**
     * Sets the vote name1_2.
     * 
     * @param voteName1_2
     *            the new vote name1_2
     */
    public void setVoteName1_2(final String voteName1_2) {
        this.voteName1_2 = voteName1_2;
    }

    /**
     * Gets the vote name2_2.
     * 
     * @return the vote name2_2
     */
    public String getVoteName2_2() {
        return voteName2_2;
    }

    /**
     * Sets the vote name2_2.
     * 
     * @param voteName2_2
     *            the new vote name2_2
     */
    public void setVoteName2_2(final String voteName2_2) {
        this.voteName2_2 = voteName2_2;
    }

    /**
     * Gets the vote name3_2.
     * 
     * @return the vote name3_2
     */
    public String getVoteName3_2() {
        return voteName3_2;
    }

    /**
     * Sets the vote name3_2.
     * 
     * @param voteName3_2
     *            the new vote name3_2
     */
    public void setVoteName3_2(final String voteName3_2) {
        this.voteName3_2 = voteName3_2;
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
    public void setVotePointList(final List<String> votePointList) {
        this.votePointList = votePointList;
    }

    /**
     * Gets the vote type.
     * 
     * @return the vote type
     */
    public String getVoteType() {
        return voteType;
    }

    /**
     * Sets the vote type.
     * 
     * @param voteType
     *            the new vote type
     */
    public void setVoteType(final String voteType) {
        this.voteType = voteType;
    }

    /**
     * Gets the issue number.
     * 
     * @return the issue number
     */
    public String getIssueNumber() {
        return issueNumber;
    }

    /**
     * Sets the issue number.
     * 
     * @param issueNumber
     *            the new issue number
     */
    public void setIssueNumber(final String issueNumber) {
        this.issueNumber = issueNumber;
    }

    /**
     * Gets the issue name1.
     * 
     * @return the issue name1
     */
    public String getIssueName1() {
        return issueName1;
    }

    /**
     * Sets the issue name1.
     * 
     * @param issueName1
     *            the new issue name1
     */
    public void setIssueName1(final String issueName1) {
        this.issueName1 = issueName1;
    }

    /**
     * Gets the issue name2.
     * 
     * @return the issue name2
     */
    public String getIssueName2() {
        return issueName2;
    }

    /**
     * Sets the issue name2.
     * 
     * @param issueName2
     *            the new issue name2
     */
    public void setIssueName2(final String issueName2) {
        this.issueName2 = issueName2;
    }

    /**
     * Gets the issue name3.
     * 
     * @return the issue name3
     */
    public String getIssueName3() {
        return issueName3;
    }

    /**
     * Sets the issue name3.
     * 
     * @param issueName3
     *            the new issue name3
     */
    public void setIssueName3(final String issueName3) {
        this.issueName3 = issueName3;
    }

    /**
     * Gets the issue name4.
     * 
     * @return the issue name4
     */
    public String getIssueName4() {
        return issueName4;
    }

    /**
     * Sets the issue name4.
     * 
     * @param issueName4
     *            the new issue name4
     */
    public void setIssueName4(final String issueName4) {
        this.issueName4 = issueName4;
    }

    /**
     * Gets the issue name5.
     * 
     * @return the issue name5
     */
    public String getIssueName5() {
        return issueName5;
    }

    /**
     * Sets the issue name5.
     * 
     * @param issueName5
     *            the new issue name5
     */
    public void setIssueName5(final String issueName5) {
        this.issueName5 = issueName5;
    }

    /**
     * Gets the active vote type1.
     * 
     * @return the active vote type1
     */
    public String getActiveVoteType1() {
        return activeVoteType1;
    }

    /**
     * Sets the active vote type1.
     * 
     * @param activeVoteType1
     *            the new active vote type1
     */
    public void setActiveVoteType1(final String activeVoteType1) {
        this.activeVoteType1 = activeVoteType1;
    }

    /**
     * Gets the active vote type2.
     * 
     * @return the active vote type2
     */
    public String getActiveVoteType2() {
        return activeVoteType2;
    }

    /**
     * Sets the active vote type2.
     * 
     * @param activeVoteType2
     *            the new active vote type2
     */
    public void setActiveVoteType2(final String activeVoteType2) {
        this.activeVoteType2 = activeVoteType2;
    }

    /**
     * Gets the active vote type3.
     * 
     * @return the active vote type3
     */
    public String getActiveVoteType3() {
        return activeVoteType3;
    }

    /**
     * Sets the active vote type3.
     * 
     * @param activeVoteType3
     *            the new active vote type3
     */
    public void setActiveVoteType3(final String activeVoteType3) {
        this.activeVoteType3 = activeVoteType3;
    }

    /**
     * Gets the report url.
     * 
     * @return the report url
     */
    public String getReportUrl() {
        return reportUrl;
    }

    /**
     * Sets the report url.
     * 
     * @param reportUrl
     *            the new report url
     */
    public void setReportUrl(final String reportUrl) {
        this.reportUrl = reportUrl;
    }

    /**
     * Gets the report params.
     * 
     * @return the report params
     */
    public HashMap<String, String> getReportParams() {
        return reportParams;
    }

    /**
     * Sets the report params.
     * 
     * @param reportParams
     *            the report params
     */
    public void setReportParams(final HashMap<String, String> reportParams) {
        this.reportParams = reportParams;
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
    public void setReportName(final String reportName) {
        this.reportName = reportName;
    }

    /**
     * Checks if is rlde800w flag.
     * 
     * @return true, if is rlde800w flag
     */
    public boolean isRlde800wFlag() {
        return rlde800wFlag;
    }

    /**
     * Sets the rlde800w flag.
     * 
     * @param rlde800wFlag
     *            the new rlde800w flag
     */
    public void setRlde800wFlag(final boolean rlde800wFlag) {
        this.rlde800wFlag = rlde800wFlag;
    }

    /**
     * Gets the rlde800w.
     * 
     * @return the rlde800w
     */
    public Rlde800wType getRlde800w() {
        return rlde800w;
    }

    /**
     * Sets the rlde800w.
     * 
     * @param rlde800w
     *            the new rlde800w
     */
    public void setRlde800w(final Rlde800wType rlde800w) {
        this.rlde800w = rlde800w;
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

    /**
     * Gets the sub title.
     * 
     * @return the sub title
     */
    public String getSubTitle() {
        return subTitle;
    }

    /**
     * Sets the sub title.
     * 
     * @param subTitle
     *            the new sub title
     */
    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle;
    }

    /**
     * Gets the label head.
     * 
     * @return the label head
     */
    public String getLabelHead() {
        return labelHead;
    }

    /**
     * Sets the label head.
     * 
     * @param labelHead
     *            the new label head
     */
    public void setLabelHead(String labelHead) {
        this.labelHead = labelHead;
    }

    /**
     * Gets the sub title2.
     * 
     * @return the sub title2
     */
    public String getSubTitle2() {
        return subTitle2;
    }

    /**
     * Sets the sub title2.
     * 
     * @param subTitle2
     *            the new sub title2
     */
    public void setSubTitle2(String subTitle2) {
        this.subTitle2 = subTitle2;
    }

    public String getVoteName4() {
        return voteName4;
    }

    public void setVoteName4(String voteName4) {
        this.voteName4 = voteName4;
    }

    public String getVoteName5() {
        return voteName5;
    }

    public void setVoteName5(String voteName5) {
        this.voteName5 = voteName5;
    }

    public String getActiveVoteType4() {
        return activeVoteType4;
    }

    public void setActiveVoteType4(String activeVoteType4) {
        this.activeVoteType4 = activeVoteType4;
    }

    public String getActiveVoteType5() {
        return activeVoteType5;
    }

    public void setActiveVoteType5(String activeVoteType5) {
        this.activeVoteType5 = activeVoteType5;
    }

    public VoterRollsInfoDTO getVoterRollsInfoDTO() {
        return voterRollsInfoDTO;
    }

    public void setVoterRollsInfoDTO(VoterRollsInfoDTO voterRollsInfoDTO) {
        this.voterRollsInfoDTO = voterRollsInfoDTO;
    }

    public String getReportExt() {
        return this.reportExt;
    }

    public void setReportExt(String reportExt) {
        this.reportExt = reportExt;
    }

}
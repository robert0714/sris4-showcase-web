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
 * 內政部申請返國行使總統、副總統選舉權人數統計表 DTO.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl08f3cDTO", propOrder = { "VoteCode", "VoteDate", "ReportName", "ReportUrl", "FileType", "labelHead" })
@XmlRootElement(name = "Rl08f3cDTO")
public class Rl08f3cDTO implements Serializable {

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

    /** 報表名稱 */
    @XmlElement(name = "ReportName")
    @FieldName("報表名稱")
    private String reportName;

    /** 報表位置 */
    @XmlElement(name = "ReportUrl")
    @FieldName("報表位置")
    private String reportUrl;

    /** 檔案格式 */
    @XmlElement(name = "FileType")
    @FieldName("檔案格式")
    private String fileType;

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

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public String getLabelHead() {
        return labelHead;
    }

    public void setLabelHead(String labelHead) {
        this.labelHead = labelHead;
    }

}

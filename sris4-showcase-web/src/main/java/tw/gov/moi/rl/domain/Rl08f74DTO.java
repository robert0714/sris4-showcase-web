/*
 * Copyright (c) 2010-2020 IISI. All rights reserved.
 * 
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.domain;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;

import tw.gov.moi.ae.checker.annotation.FieldName;
import tw.gov.moi.domain.Rlde800wType;

/**
 * Rl08f3dDTO.
 * 
 * @author Weiren.Jheng
 */
public class Rl08f74DTO implements Serializable {

    private static final long serialVersionUID = 1L;

    @XmlElement(name = "woman2Rlde808wType")
    @FieldName("查詢結果 ")
    private String voteCode;
    @XmlElement(name = "woman2Rlde808wType")
    @FieldName("查詢結果 ")
    private String voteDate;
    @XmlElement(name = "woman2Rlde808wType")
    @FieldName("查詢結果 ")
    private String fileType;

    @XmlElement(name = "woman2Rlde808wType")
    @FieldName("查詢結果 ")
    private String voteOffice;//投票所
    @XmlElement(name = "woman2Rlde808wType")
    @FieldName("查詢結果 ")
    private String pageStart1;//起頁次1
    @XmlElement(name = "woman2Rlde808wType")
    @FieldName("查詢結果 ")
    private String pageStart2;//起頁次2
    @XmlElement(name = "woman2Rlde808wType")
    @FieldName("查詢結果 ")
    private String pageEnd1;//訖頁次1
    @XmlElement(name = "woman2Rlde808wType")
    @FieldName("查詢結果 ")
    private String pageEnd2;//訖頁次2
    @XmlElement(name = "woman2Rlde808wType")
    @FieldName("查詢結果 ")
    private String num1;//編號
    @XmlElement(name = "woman2Rlde808wType")
    @FieldName("查詢結果 ")
    private String num2;//編號
    @XmlElement(name = "woman2Rlde808wType")
    @FieldName("查詢結果 ")
    private List<String> electionPosition;//選舉人身分
    @XmlElement(name = "woman2Rlde808wType")
    @FieldName("查詢結果 ")
    private String voteType1;//選舉種類1
    @XmlElement(name = "woman2Rlde808wType")
    @FieldName("查詢結果 ")
    private String voteType2;//選舉種類2
    @XmlElement(name = "woman2Rlde808wType")
    @FieldName("查詢結果 ")
    private String voteType3;//選舉種類3
    
    @XmlElement(name = "woman2Rlde808wType")
    @FieldName("查詢結果 ")
    private Rlde800wType rlde800wType;

    @XmlElement(name = "woman2Rlde808wType")
    @FieldName("查詢結果 ")
    private String reportUrl;

    @XmlElement(name = "LabelHead")
    @FieldName("標題名稱")
    private String labelHead;

    public String getReportUrl() {
        return reportUrl;
    }

    public void setReportUrl(String reportUrl) {
        this.reportUrl = reportUrl;
    }

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

    public String getVoteType1() {
        return voteType1;
    }

    public void setVoteType1(String voteType1) {
        this.voteType1 = voteType1;
    }

    public String getVoteType2() {
        return voteType2;
    }

    public void setVoteType2(String voteType2) {
        this.voteType2 = voteType2;
    }

    public String getVoteType3() {
        return voteType3;
    }

    public void setVoteType3(String voteType3) {
        this.voteType3 = voteType3;
    }

    public Rlde800wType getRlde800wType() {
        return rlde800wType;
    }

    public void setRlde800wType(Rlde800wType rlde800wType) {
        this.rlde800wType = rlde800wType;
    }

    public String getVoteOffice() {
        return voteOffice;
    }

    public void setVoteOffice(String voteOffice) {
        this.voteOffice = voteOffice;
    }

    public String getPageStart1() {
        return pageStart1;
    }

    public void setPageStart1(String pageStart1) {
        this.pageStart1 = pageStart1;
    }

    public String getPageStart2() {
        return pageStart2;
    }

    public void setPageStart2(String pageStart2) {
        this.pageStart2 = pageStart2;
    }

    public String getPageEnd1() {
        return pageEnd1;
    }

    public void setPageEnd1(String pageEnd1) {
        this.pageEnd1 = pageEnd1;
    }

    public String getPageEnd2() {
        return pageEnd2;
    }

    public void setPageEnd2(String pageEnd2) {
        this.pageEnd2 = pageEnd2;
    }

    public String getNum1() {
        return num1;
    }

    public void setNum1(String num1) {
        this.num1 = num1;
    }

    public String getNum2() {
        return num2;
    }

    public void setNum2(String num2) {
        this.num2 = num2;
    }

    public List<String> getElectionPosition() {
        return electionPosition;
    }

    public void setElectionPosition(List<String> electionPosition) {
        this.electionPosition = electionPosition;
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

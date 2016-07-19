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
import tw.gov.moi.domain.Rldf012dType;

/**
 * The Class Rl02b10DTO.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Rl02b10DTO", propOrder = { "Type", "Option", "StartNo", "EndNo", "UseYyymmddFlag", "StatisticsType",
        "UseYyymmddStart", "UseYyymmddEnd", "IssueYyymmddStart", "IssueYyymmddEnd", "VoidYyymmddStart",
        "VoidYyymmddEnd", "ApplyReason", "IssueYyymmddFlag", "VoidYyymmddFlag", "VoidCode", "Rldf012dList",
        "Rldf012dObj" })
@XmlRootElement(name = "Rl02b10DTO")
public class Rl02b10DTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 8431788095599023197L;

    /** 類別 */
    @XmlElement(name = "Type", required = true)
    @FieldName("類別")
    private String type;

    /** 查詢類別 */
    @XmlElement(name = "Option", required = true)
    @FieldName("查詢類別")
    private String option;

    /** A類-號碼(起) */
    @XmlElement(name = "StartNo", required = true)
    @FieldName("A類-號碼(起)")
    private String startNo;

    /** A類-號碼(迄) */
    @XmlElement(name = "EndNo", required = true)
    @FieldName("A類-號碼(迄)")
    private String endNo;

    /** A類-是否已用 */
    @XmlElement(name = "UseYyymmddFlag", required = true)
    @FieldName("A類-是否已用")
    private String useYyymmddFlag;

    /** B類-辦理類別 */
    @XmlElement(name = "StatisticsType", required = true)
    @FieldName("B類-辦理類別")
    private String statisticsType;

    /** B類-使用日期(起) */
    @XmlElement(name = "UseYyymmddStart", required = true)
    @FieldName("B類-使用日期(起)")
    private String useYyymmddStart;

    /** B類-使用日期(迄) */
    @XmlElement(name = "UseYyymmddEnd", required = true)
    @FieldName("B類-使用日期(迄)")
    private String useYyymmddEnd;

    /** B類-發出日期(起) */
    @XmlElement(name = "IssueYyymmddStart", required = true)
    @FieldName("B類-發出日期(起)")
    private String issueYyymmddStart;

    /** B類-發出日期(迄) */
    @XmlElement(name = "IssueYyymmddEnd", required = true)
    @FieldName("B類-發出日期(迄)")
    private String issueYyymmddEnd;

    /** B類-作廢日期(起) */
    @XmlElement(name = "VoidYyymmddStart", required = true)
    @FieldName("B類-作廢日期(起)")
    private String voidYyymmddStart;

    /** B類-作廢日期(迄) */
    @XmlElement(name = "VoidYyymmddEnd", required = true)
    @FieldName("B類-作廢日期(迄)")
    private String voidYyymmddEnd;

    /** B類-申請事由 */
    @XmlElement(name = "ApplyReason", required = true)
    @FieldName("B類-申請事由")
    private String applyReason;

    /** B類-是否已發 */
    @XmlElement(name = "IssueYyymmddFlag", required = true)
    @FieldName("B類-是否已發")
    private String issueYyymmddFlag;

    /** B類-是否作廢 */
    @XmlElement(name = "VoidYyymmddFlag", required = true)
    @FieldName("B類-是否作廢")
    private String voidYyymmddFlag;

    /** B類-作廢原因　 */
    @XmlElement(name = "VoidCode", required = true)
    @FieldName("B類-作廢原因　")
    private String voidCode;

    /** rldf012d List　 */
    @XmlElement(name = "Rldf012dList", required = true)
    @FieldName("rldf012d List")
    private List<Rldf012dType> rldf012dList;

    /** rldf012d Object　 */
    @XmlElement(name = "Rldf012dObj", required = true)
    @FieldName("rldf012d Object")
    private Rldf012dType rldf012dObj;

    public String getType() {
        return type;
    }

    public void setType(final String type) {
        this.type = type;
    }

    public String getOption() {
        return option;
    }

    public void setOption(final String option) {
        this.option = option;
    }

    public String getStartNo() {
        return startNo;
    }

    public void setStartNo(final String startNo) {
        this.startNo = startNo;
    }

    public String getEndNo() {
        return endNo;
    }

    public void setEndNo(final String endNo) {
        this.endNo = endNo;
    }

    public String getUseYyymmddFlag() {
        return useYyymmddFlag;
    }

    public void setUseYyymmddFlag(final String useYyymmddFlag) {
        this.useYyymmddFlag = useYyymmddFlag;
    }

    public String getStatisticsType() {
        return statisticsType;
    }

    public void setStatisticsType(final String statisticsType) {
        this.statisticsType = statisticsType;
    }

    public String getUseYyymmddStart() {
        return useYyymmddStart;
    }

    public void setUseYyymmddStart(final String useYyymmddStart) {
        this.useYyymmddStart = useYyymmddStart;
    }

    public String getUseYyymmddEnd() {
        return useYyymmddEnd;
    }

    public void setUseYyymmddEnd(final String useYyymmddEnd) {
        this.useYyymmddEnd = useYyymmddEnd;
    }

    public String getIssueYyymmddStart() {
        return issueYyymmddStart;
    }

    public void setIssueYyymmddStart(final String issueYyymmddStart) {
        this.issueYyymmddStart = issueYyymmddStart;
    }

    public String getIssueYyymmddEnd() {
        return issueYyymmddEnd;
    }

    public void setIssueYyymmddEnd(final String issueYyymmddEnd) {
        this.issueYyymmddEnd = issueYyymmddEnd;
    }

    public String getVoidYyymmddStart() {
        return voidYyymmddStart;
    }

    public void setVoidYyymmddStart(final String voidYyymmddStart) {
        this.voidYyymmddStart = voidYyymmddStart;
    }

    public String getVoidYyymmddEnd() {
        return voidYyymmddEnd;
    }

    public void setVoidYyymmddEnd(final String voidYyymmddEnd) {
        this.voidYyymmddEnd = voidYyymmddEnd;
    }

    public String getApplyReason() {
        return applyReason;
    }

    public void setApplyReason(final String applyReason) {
        this.applyReason = applyReason;
    }

    public String getIssueYyymmddFlag() {
        return issueYyymmddFlag;
    }

    public void setIssueYyymmddFlag(final String issueYyymmddFlag) {
        this.issueYyymmddFlag = issueYyymmddFlag;
    }

    public String getVoidYyymmddFlag() {
        return voidYyymmddFlag;
    }

    public void setVoidYyymmddFlag(final String voidYyymmddFlag) {
        this.voidYyymmddFlag = voidYyymmddFlag;
    }

    public String getVoidCode() {
        return voidCode;
    }

    public void setVoidCode(final String voidCode) {
        this.voidCode = voidCode;
    }

    public List<Rldf012dType> getRldf012dList() {
        return rldf012dList;
    }

    public void setRldf012dList(final List<Rldf012dType> rldf012dList) {
        this.rldf012dList = rldf012dList;
    }

    public Rldf012dType getRldf012dObj() {
        return rldf012dObj;
    }

    public void setRldf012dObj(final Rldf012dType rldf012dObj) {
        this.rldf012dObj = rldf012dObj;
    }

}

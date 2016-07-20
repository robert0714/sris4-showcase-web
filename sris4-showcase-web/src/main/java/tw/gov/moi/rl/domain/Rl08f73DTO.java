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
import tw.gov.moi.ae.report.ReportFormat;
import tw.gov.moi.rs.common.report.dto.BaseITextReportParams;
import tw.gov.moi.rs.domain.VoterRollsInfoDTO;

/**
 * 重印選舉人投票通知單 DTO.
 * 
 * @author Viva.Hong
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Rl08f73DTO", propOrder = { "acceptSiteId", "endPage1", "endPage2", "initTime", "pageNo1", "pageNo2",
        "startPage1", "startPage2", "transactionId", "userId", "voterRollsInfoDTO" })
@XmlRootElement(name = "Rl08f73DTO")
public class Rl08f73DTO extends BaseITextReportParams implements Serializable {

    /** SerialVersion UID. */
    private static final long serialVersionUID = 1L;

    /** 受理地作業點代碼. */
    @XmlElement(name = "AcceptSiteId", required = true)
    @FieldName("受理地作業點代碼")
    private String acceptSiteId;

    /** (迄)頁次1. */
    @FieldName("(迄)頁次1")
    @XmlElement(name = "EndPage1", required = true)
    private String endPage1;

    /** (迄)頁次2. */
    @FieldName("(迄)頁次2")
    @XmlElement(name = "EndPage2", required = true)
    private String endPage2;

    /** 初始化時間. */
    @XmlElement(name = "InitTime", required = true)
    @FieldName("初始化時間")
    private String initTime;

    /** 編號1. */
    @FieldName("編號1")
    @XmlElement(name = "PageNo1", required = true)
    private String pageNo1;

    /** 編號2. */
    @FieldName("編號2")
    @XmlElement(name = "PageNo2", required = true)
    private String pageNo2;

    /** (起)頁次1. */
    @FieldName("(起)頁次1")
    @XmlElement(name = "StartPage1", required = true)
    private String startPage1;

    /** (起)頁次2. */
    @FieldName("(起)頁次2")
    @XmlElement(name = "StartPage2", required = true)
    private String startPage2;

    /** 交易序號. */
    @XmlElement(name = "TransactionId", required = true)
    @FieldName("交易序號")
    private String transactionId;

    /** 使用者帳號. */
    @XmlElement(name = "UserId", required = true)
    @FieldName("使用者帳號")
    private String userId;

    /** 選舉名冊資訊DTO. */
    @XmlElement(name = "VoterRollsInfoDTO", required = true)
    @FieldName("選舉名冊資訊DTO")
    private VoterRollsInfoDTO voterRollsInfoDTO = new VoterRollsInfoDTO();

    @Override
    public String getMainReportName() {
        return voterRollsInfoDTO.getReportName();
    }

    @Override
    public String getReportExt() {
        return voterRollsInfoDTO.getReportName();
    }

    @Override
    public ReportFormat getReportFormatEnum() {
        return ReportFormat.PDF;
    }

    public String getAcceptSiteId() {
        return acceptSiteId;
    }

    public String getEndPage1() {
        return endPage1;
    }

    public String getEndPage2() {
        return endPage2;
    }

    public String getInitTime() {
        return initTime;
    }

    public String getPageNo1() {
        return pageNo1;
    }

    public String getPageNo2() {
        return pageNo2;
    }

    public String getStartPage1() {
        return startPage1;
    }

    public String getStartPage2() {
        return startPage2;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public String getUserId() {
        return userId;
    }

    public VoterRollsInfoDTO getVoterRollsInfoDTO() {
        return voterRollsInfoDTO;
    }

    public void setAcceptSiteId(final String acceptSiteId) {
        this.acceptSiteId = acceptSiteId;
    }

    public void setEndPage1(final String endPage1) {
        this.endPage1 = endPage1;
    }

    public void setEndPage2(final String endPage2) {
        this.endPage2 = endPage2;
    }

    public void setInitTime(final String initTime) {
        this.initTime = initTime;
    }

    public void setPageNo1(final String pageNo1) {
        this.pageNo1 = pageNo1;
    }

    public void setPageNo2(final String pageNo2) {
        this.pageNo2 = pageNo2;
    }

    public void setStartPage1(final String startPage1) {
        this.startPage1 = startPage1;
    }

    public void setStartPage2(final String startPage2) {
        this.startPage2 = startPage2;
    }

    public void setTransactionId(final String transactionId) {
        this.transactionId = transactionId;
    }

    public void setUserId(final String userId) {
        this.userId = userId;
    }

    public void setVoterRollsInfoDTO(final VoterRollsInfoDTO voterRollsInfoDTO) {
        this.voterRollsInfoDTO = voterRollsInfoDTO;
    }
}

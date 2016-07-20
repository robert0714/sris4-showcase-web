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
 * 在工作地投票通知單DTO.
 * 
 * @author Viva.Hong
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Rl08f35DTO", propOrder = { "acceptSiteId", "initTime", "transactionId", "userId", "voterRollsInfoDTO" })
@XmlRootElement(name = "Rl08f35DTO")
public class Rl08f35DTO extends BaseITextReportParams implements Serializable {

    /** SerialVersion UID. */
    private static final long serialVersionUID = 1L;

    /** 受理地作業點代碼. */
    @XmlElement(name = "AcceptSiteId", required = true)
    @FieldName("受理地作業點代碼")
    private String acceptSiteId;

    /** 初始化時間. */
    @XmlElement(name = "InitTime", required = true)
    @FieldName("初始化時間")
    private String initTime;

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

    public String getAcceptSiteId() {
        return acceptSiteId;
    }

    public String getInitTime() {
        return initTime;
    }

    @Override
    public String getMainReportName() {
        return voterRollsInfoDTO.getReportName();
    }

    @Override
    public String getReportExt() {
        return voterRollsInfoDTO.getVotePoint();
    }

    @Override
    public ReportFormat getReportFormatEnum() {
        return ReportFormat.PDF;
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

    public void setInitTime(final String initTime) {
        this.initTime = initTime;
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

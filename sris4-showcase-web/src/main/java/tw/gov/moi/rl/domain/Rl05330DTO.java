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
import tw.gov.moi.domain.RedfnttlType;

/**
 * The Class Rl05330DTO.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Rl05330DTO", propOrder = { "createDateBegin", "createDateEnd", "siteId", "transactionId", "programId",
        "qryMessageId", "jmsDeCode", "status", "resultList", "reSendOption", "selectedRedfnttl" })
@XmlRootElement(name = "Rl05330DTO")
public class Rl05330DTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 8431788095599023197L;

    /** 執行日期(起) */
    @XmlElement(name = "CreateDateBegin", required = true)
    @FieldName("執行日期(起)")
    private String createDateBegin;

    /** 執行日期(迄) */
    @XmlElement(name = "CreateDateEnd", required = true)
    @FieldName("執行日期(迄)")
    private String createDateEnd;

    /** 傳送端SiteId */
    @XmlElement(name = "SiteId", required = true)
    @FieldName("傳送端SiteId")
    private String siteId;

    /** 交易序號 */
    @XmlElement(name = "TransactionId")
    @FieldName("交易序號")
    private String transactionId;

    /** 作業代碼 */
    @XmlElement(name = "ProgramId")
    @FieldName("作業代碼")
    private String programId;

    /** QryMessageId */
    @XmlElement(name = "QryMessageId")
    @FieldName("查詢MessageId")
    private String qryMessageId;

    /** jms解碼訊息 */
    @XmlElement(name = "JmsDeCode")
    @FieldName("jms解碼訊息")
    private String jmsDeCode;

    /** 處理狀態 */
    @XmlElement(name = "Status")
    @FieldName("處理狀態")
    private String status;

    /** 資料結果 */
    @XmlElement(name = "ResultList", required = true)
    @FieldName("資料結果")
    private List<RedfnttlType> resultList;

    /** 重送通報處理選項 */
    @XmlElement(name = "ReSendOption")
    @FieldName("重送通報處理選項")
    private String reSendOption;

    /** 選取的通報執行記錄 */
    @XmlElement(name = "SelectedRedfnttl")
    @FieldName("選取的通報執行記錄")
    private RedfnttlType selectedRedfnttl;

    public String getCreateDateBegin() {
        return createDateBegin;
    }

    public void setCreateDateBegin(final String createDateBegin) {
        this.createDateBegin = createDateBegin;
    }

    public String getCreateDateEnd() {
        return createDateEnd;
    }

    public void setCreateDateEnd(final String createDateEnd) {
        this.createDateEnd = createDateEnd;
    }

    public List<RedfnttlType> getResultList() {
        return resultList;
    }

    public void setResultList(final List<RedfnttlType> resultList) {
        this.resultList = resultList;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getProgramId() {
        return programId;
    }

    public void setProgramId(String programId) {
        this.programId = programId;
    }

    public String getJmsDeCode() {
        return jmsDeCode;
    }

    public void setJmsDeCode(String jmsDeCode) {
        this.jmsDeCode = jmsDeCode;
    }

    public String getQryMessageId() {
        return qryMessageId;
    }

    public void setQryMessageId(String qryMessageId) {
        this.qryMessageId = qryMessageId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getSiteId() {
        return siteId;
    }

    public void setSiteId(String siteId) {
        this.siteId = siteId;
    }

	public String getReSendOption() {
		return reSendOption;
	}

	public void setReSendOption(String reSendOption) {
		this.reSendOption = reSendOption;
	}

	public RedfnttlType getSelectedRedfnttl() {
		return selectedRedfnttl;
	}

	public void setSelectedRedfnttl(RedfnttlType selectedRedfnttl) {
		this.selectedRedfnttl = selectedRedfnttl;
	}

}

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
import tw.gov.moi.domain.Rldfz2aa0Type;

/**
 * 重製國民身分證送件聯單DTO.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Rl02aa0DTO", propOrder = { "acceptSiteId", "countMap", "fileFormat", "initTime", "msgList",
        "otherList", "reportName", "reportParams", "reportURL", "selfList", "sendLotNo", "sendYyymmddEnd",
        "sendYyymmddStart", "transactionId", "userId" })
@XmlRootElement(name = "Rl02aa0DTO")
public class Rl02aa0DTO implements Serializable {

    /** SerialVersionUID. */
    private static final long serialVersionUID = 8431788095599023197L;

    /** 受理地作業點代碼. */
    @FieldName("受理地作業點代碼")
    @XmlElement(name = "AcceptSiteId", required = true)
    private String acceptSiteId;

    /** 列印的筆數. */
    @XmlElement(name = "CountMap", required = true)
    @FieldName("列印的筆數")
    private HashMap<String, Integer> countMap = new HashMap<String, Integer>();

    /** 檔案格式. */
    @FieldName("檔案格式")
    @XmlElement(name = "FileFormat", required = true)
    private String fileFormat = "";

    /** 初始化時間. */
    @FieldName("初始化時間")
    @XmlElement(name = "InitTime", required = true)
    private String initTime;

    /** 列印時提示的訊息. */
    @FieldName("列印時提示的訊息")
    @XmlElement(name = "MsgList", required = true)
    private List<String> msgList = new ArrayList<String>();

    /** 他所辦理資料. */
    @XmlElement(name = "OtherList", required = true)
    @FieldName("他所辦理資料")
    private List<Rldfz2aa0Type> otherList = new ArrayList<Rldfz2aa0Type>();

    /** 報表名稱. */
    @FieldName("報表名稱")
    @XmlElement(name = "ReportName", required = true)
    private String reportName = "RLRP02AA0";

    /** 報表參數. */
    @FieldName("報表參數")
    @XmlElement(name = "ReportParams", required = true)
    private HashMap<String, String> reportParams = new HashMap<String, String>();

    /** 報表路徑. */
    @FieldName("報表路徑")
    @XmlElement(name = "ReportURL", required = true)
    private String reportURL = "";

    /** 本所辦理資料. */
    @FieldName("本所辦理資料")
    @XmlElement(name = "SelfList", required = true)
    private List<Rldfz2aa0Type> selfList = new ArrayList<Rldfz2aa0Type>();

    /** 列印序號. */
    @FieldName("列印序號 ")
    @XmlElement(name = "SendLotNo", required = true)
    private String sendLotNo = "";

    /** 列印日期迄. */
    @FieldName("列印日期迄")
    @XmlElement(name = "SendYyymmddEnd", required = true)
    private String sendYyymmddEnd = "";

    /** 列印日期起. */
    @FieldName("列印日期起")
    @XmlElement(name = "SendYyymmddStart", required = true)
    private String sendYyymmddStart = "";

    /** 交易序號. */
    @FieldName("交易序號")
    @XmlElement(name = "TransactionId", required = true)
    private String transactionId;

    /** 使用者帳號. */
    @FieldName("使用者帳號")
    @XmlElement(name = "UserId", required = true)
    private String userId;

    public String getAcceptSiteId() {
        return acceptSiteId;
    }

    public HashMap<String, Integer> getCountMap() {
        return countMap;
    }

    public String getFileFormat() {
        return fileFormat;
    }

    public String getInitTime() {
        return initTime;
    }

    public List<String> getMsgList() {
        return msgList;
    }

    public List<Rldfz2aa0Type> getOtherList() {
        return otherList;
    }

    public String getReportName() {
        return reportName;
    }

    public HashMap<String, String> getReportParams() {
        return reportParams;
    }

    public String getReportURL() {
        return reportURL;
    }

    public List<Rldfz2aa0Type> getSelfList() {
        return selfList;
    }

    public String getSendLotNo() {
        return sendLotNo;
    }

    public String getSendYyymmddEnd() {
        return sendYyymmddEnd;
    }

    public String getSendYyymmddStart() {
        return sendYyymmddStart;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public String getUserId() {
        return userId;
    }

    public void setAcceptSiteId(String acceptSiteId) {
        this.acceptSiteId = acceptSiteId;
    }

    public void setCountMap(HashMap<String, Integer> countMap) {
        this.countMap = countMap;
    }

    public void setFileFormat(String fileFormat) {
        this.fileFormat = fileFormat;
    }

    public void setInitTime(String initTime) {
        this.initTime = initTime;
    }

    public void setMsgList(List<String> msgList) {
        this.msgList = msgList;
    }

    public void setOtherList(List<Rldfz2aa0Type> otherList) {
        this.otherList = otherList;
    }

    public void setReportName(String reportName) {
        this.reportName = reportName;
    }

    public void setReportParams(HashMap<String, String> reportParams) {
        this.reportParams = reportParams;
    }

    public void setReportURL(String reportURL) {
        this.reportURL = reportURL;
    }

    public void setSelfList(List<Rldfz2aa0Type> selfList) {
        this.selfList = selfList;
    }

    public void setSendLotNo(String sendLotNo) {
        this.sendLotNo = sendLotNo;
    }

    public void setSendYyymmddEnd(String sendYyymmddEnd) {
        this.sendYyymmddEnd = sendYyymmddEnd;
    }

    public void setSendYyymmddStart(String sendYyymmddStart) {
        this.sendYyymmddStart = sendYyymmddStart;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}

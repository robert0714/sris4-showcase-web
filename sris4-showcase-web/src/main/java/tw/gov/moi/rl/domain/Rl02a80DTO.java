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
 * 製作國民身分證臨時證明書DTO.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Rl02a80DTO", propOrder = { "acceptSiteId", "applyReason", "applyReasonName", "applyYyymmdd",
        "areaCode", "areaName", "birthYyymmdd", "document", "fileFormat", "freePhoto", "initTime", "lastYyymmdd",
        "lastYyymmddRenderedFlag", "neighbor", "nophotoReason", "nophotoRemark", "oldPersonId", "personId",
        "personName", "reportURL", "sendBtFlag", "siteId", "siteName", "streetDoorplate", "sysYyymmdd",
        "transactionId", "userId", "village" })
@XmlRootElement(name = "Rl02a80DTO")
public class Rl02a80DTO implements Serializable {

    /** SerialVersionUID. */
    private static final long serialVersionUID = 8431788095599023197L;

    /** 受理地作業點代碼. */
    @XmlElement(name = "AcceptSiteId", required = true)
    @FieldName("受理地作業點代碼")
    private String acceptSiteId;

    /** 申請事由. */
    @XmlElement(name = "ApplyReason")
    @FieldName("申請事由")
    private String applyReason = "";

    /** 申請事由名稱. */
    @XmlElement(name = "ApplyReasonName")
    @FieldName("申請事由名稱")
    private String applyReasonName;

    /** 受理日期. */
    @XmlElement(name = "ApplyYyymmdd")
    @FieldName("受理日期")
    private String applyYyymmdd = "";

    /** 行政區域代碼. */
    @XmlElement(name = "AreaCode")
    @FieldName("行政區域代碼")
    private String areaCode = "";

    /** 行政區域名稱. */
    @XmlElement(name = "AreaName")
    @FieldName("行政區域名稱")
    private String areaName;

    /** 出生日期. */
    @XmlElement(name = "BirthYyymmdd")
    @FieldName("出生日期")
    private String birthYyymmdd = "";

    /** 字號. */
    @XmlElement(name = "Document")
    @FieldName("字號")
    private String document = "";

    /** 檔案格式. */
    @XmlElement(name = "FileFormat")
    @FieldName("檔案格式")
    private String fileFormat = "1";

    /** 免費照相. */
    @XmlElement(name = "FreePhoto")
    @FieldName("免費照相")
    private String freePhoto = "";

    /** 初始化時間. */
    @XmlElement(name = "InitTime", required = true)
    @FieldName("初始化時間")
    private String initTime;

    /** 使用期限. */
    @XmlElement(name = "LastYyymmdd")
    @FieldName("使用期限")
    private String lastYyymmdd = "";

    /** 是否顯示. */
    @XmlElement(name = "LastYyymmddRenderedFlag")
    @FieldName("是否顯示")
    private String lastYyymmddRenderedFlag = "hidden";

    /** 鄰. */
    @XmlElement(name = "Neighbor")
    @FieldName("鄰")
    private String neighbor = "";

    /** 免列印相片原因. */
    @XmlElement(name = "NophotoReason")
    @FieldName("免列印相片原因")
    private String nophotoReason = "";

    /** 免列印相片說明. */
    @XmlElement(name = "NophotoRemark")
    @FieldName("免列印相片說明")
    private String nophotoRemark = "";

    /** 國民身分證統一編號. */
    @XmlElement(name = "OldPersonId")
    @FieldName("國民身分證統一編號")
    private String oldPersonId = "";

    /** 國民身分證統一編號. */
    @XmlElement(name = "PersonId")
    @FieldName("國民身分證統一編號")
    private String personId = "";

    /** 姓名. */
    @XmlElement(name = "PersonName")
    @FieldName("姓名")
    private String personName = "";

    /** 報表URL. */
    @XmlElement(name = "ReportURL")
    @FieldName("報表URL")
    private String reportURL = "";

    /** 是否顯示. */
    @XmlElement(name = "SendBtFlag")
    @FieldName("是否顯示")
    private String sendBtFlag = "true";

    /** 作業點代碼. */
    @XmlElement(name = "SiteId")
    @FieldName("作業點代碼")
    private String siteId = "";

    /** 作業點名稱. */
    @XmlElement(name = "SiteName")
    @FieldName("作業點名稱")
    private String siteName;

    /** 街路門牌. */
    @XmlElement(name = "StreetDoorplate")
    @FieldName("街路門牌")
    private String streetDoorplate = "";

    /** 系統日期. */
    @XmlElement(name = "SysYyymmdd")
    @FieldName("系統日期")
    private String sysYyymmdd;

    /** 交易序號. */
    @XmlElement(name = "TransactionId", required = true)
    @FieldName("交易序號")
    private String transactionId;

    /** 使用者帳號. */
    @XmlElement(name = "UserId", required = true)
    @FieldName("使用者帳號")
    private String userId;

    /** 村里. */
    @XmlElement(name = "Village")
    @FieldName("村里")
    private String village = "";

    public String getAcceptSiteId() {
        return acceptSiteId;
    }

    public String getApplyReason() {
        return applyReason;
    }

    public String getApplyReasonName() {
        return applyReasonName;
    }

    public String getApplyYyymmdd() {
        return applyYyymmdd;
    }

    public String getAreaCode() {
        return areaCode;
    }

    public String getAreaName() {
        return areaName;
    }

    public String getBirthYyymmdd() {
        return birthYyymmdd;
    }

    public String getDocument() {
        return document;
    }

    public String getFileFormat() {
        return fileFormat;
    }

    public String getFreePhoto() {
        return freePhoto;
    }

    public String getInitTime() {
        return initTime;
    }

    public String getLastYyymmdd() {
        return lastYyymmdd;
    }

    public String getLastYyymmddRenderedFlag() {
        return lastYyymmddRenderedFlag;
    }

    public String getNeighbor() {
        return neighbor;
    }

    public String getNophotoReason() {
        return nophotoReason;
    }

    public String getNophotoRemark() {
        return nophotoRemark;
    }

    public String getOldPersonId() {
        return oldPersonId;
    }

    public String getPersonId() {
        return personId;
    }

    public String getPersonName() {
        return personName;
    }

    public String getReportURL() {
        return reportURL;
    }

    public String getSendBtFlag() {
        return sendBtFlag;
    }

    public String getSiteId() {
        return siteId;
    }

    public String getSiteName() {
        return siteName;
    }

    public String getStreetDoorplate() {
        return streetDoorplate;
    }

    public String getSysYyymmdd() {
        return sysYyymmdd;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public String getUserId() {
        return userId;
    }

    public String getVillage() {
        return village;
    }

    public void setAcceptSiteId(String acceptSiteId) {
        this.acceptSiteId = acceptSiteId;
    }

    public void setApplyReason(String applyReason) {
        this.applyReason = applyReason;
    }

    public void setApplyReasonName(String applyReasonName) {
        this.applyReasonName = applyReasonName;
    }

    public void setApplyYyymmdd(String applyYyymmdd) {
        this.applyYyymmdd = applyYyymmdd;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    public void setBirthYyymmdd(String birthYyymmdd) {
        this.birthYyymmdd = birthYyymmdd;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public void setFileFormat(String fileFormat) {
        this.fileFormat = fileFormat;
    }

    public void setFreePhoto(String freePhoto) {
        this.freePhoto = freePhoto;
    }

    public void setInitTime(String initTime) {
        this.initTime = initTime;
    }

    public void setLastYyymmdd(String lastYyymmdd) {
        this.lastYyymmdd = lastYyymmdd;
    }

    public void setLastYyymmddRenderedFlag(String lastYyymmddRenderedFlag) {
        this.lastYyymmddRenderedFlag = lastYyymmddRenderedFlag;
    }

    public void setNeighbor(String neighbor) {
        this.neighbor = neighbor;
    }

    public void setNophotoReason(String nophotoReason) {
        this.nophotoReason = nophotoReason;
    }

    public void setNophotoRemark(String nophotoRemark) {
        this.nophotoRemark = nophotoRemark;
    }

    public void setOldPersonId(String oldPersonId) {
        this.oldPersonId = oldPersonId;
    }

    public void setPersonId(String personId) {
        this.personId = personId;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public void setReportURL(String reportURL) {
        this.reportURL = reportURL;
    }

    public void setSendBtFlag(String sendBtFlag) {
        this.sendBtFlag = sendBtFlag;
    }

    public void setSiteId(String siteId) {
        this.siteId = siteId;
    }

    public void setSiteName(String siteName) {
        this.siteName = siteName;
    }

    public void setStreetDoorplate(String streetDoorplate) {
        this.streetDoorplate = streetDoorplate;
    }

    public void setSysYyymmdd(String sysYyymmdd) {
        this.sysYyymmdd = sysYyymmdd;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setVillage(String village) {
        this.village = village;
    }
}

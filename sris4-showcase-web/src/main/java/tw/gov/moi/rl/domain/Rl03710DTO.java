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
 * 本地申請書索引資料DTO.
 * 
 * @author Alan Lo
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl03710DTO", propOrder = { "personId", "applyTransactionId", "applySequenceId", "acceptSiteId",
        "acceptAreaCode", "acceptAdminOfficeCode", "registerDate", "registerDateBegin", "registerDateEnd",
        "registerTime", "personName", "masterMark", "applyCode", "village", "bbPersonId", "bbPersonName",
        "settleSiteId", "settleAreaCode", "settleAdminOfficeCode", "registrarName", "resultList", "reportUrl" })
@XmlRootElement(name = "Rl03710DTO")
public class Rl03710DTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** 統一編號. */
    @XmlElement(name = "PersonId")
    @FieldName("統一編號")
    private String personId;

    /** 交易序號. */
    @XmlElement(name = "ApplyTransactionId")
    @FieldName("交易序號")
    private String applyTransactionId;

    /** 作業順序編號. */
    @XmlElement(name = "ApplySequenceId")
    @FieldName("作業順序編號")
    private String applySequenceId;

    /** 受理地作業點代碼. */
    @XmlElement(name = "AcceptSiteId")
    @FieldName("受理地作業點代碼")
    private String acceptSiteId;

    /** 受理地行政區域代碼. */
    @XmlElement(name = "AcceptAreaCode")
    @FieldName("受理地行政區域代碼")
    private String acceptAreaCode;

    /** 受理地戶所代碼. */
    @XmlElement(name = "AcceptAdminOfficeCode")
    @FieldName("受理地戶所代碼")
    private String acceptAdminOfficeCode;

    /** 登記日期. */
    @XmlElement(name = "RegisterDate")
    @FieldName("登記日期")
    private String registerDate;

    /** 登記日期（起）. */
    @XmlElement(name = "RegisterDateBegin")
    @FieldName("登記日期（起）")
    private String registerDateBegin;

    /** 登記日期（迄）. */
    @XmlElement(name = "RegisterDateEnd")
    @FieldName("登記日期（迄）")
    private String registerDateEnd;

    /** 登記時間. */
    @XmlElement(name = "RegisterTime")
    @FieldName("登記時間")
    private String registerTime;

    /** 姓名. */
    @XmlElement(name = "PersonName")
    @FieldName("姓名")
    private String personName;

    /** 當事人註記. */
    @XmlElement(name = "MasterMark")
    @FieldName("當事人註記")
    private String masterMark;

    /** 申請書類別. */
    @XmlElement(name = "ApplyCode")
    @FieldName("申請書類別")
    private String applyCode;

    /** 村里. */
    @XmlElement(name = "village")
    @FieldName("村里")
    private String village;

    /** 更正(或變更)前統號/原有統號. */
    @XmlElement(name = "BbPersonId")
    @FieldName("更正(或變更)前統號/原有統號")
    private String bbPersonId;

    /** 更正(或變更)前姓名/原有姓名. */
    @XmlElement(name = "BbPersonName")
    @FieldName("更正(或變更)前姓名/原有姓名")
    private String bbPersonName;

    /** 戶籍地. */
    @XmlElement(name = "SettleSiteId")
    @FieldName("戶籍地")
    private String settleSiteId;

    /** 縣市鄉鎮市區. */
    @XmlElement(name = "SettleAreaCode")
    @FieldName("縣市鄉鎮市區")
    private String settleAreaCode;

    /** 戶籍地戶所代碼. */
    @XmlElement(name = "SettleAdminOfficeCode")
    @FieldName("戶籍地戶所代碼")
    private String settleAdminOfficeCode;

    /** 戶籍員姓名. */
    @XmlElement(name = "RegistrarName")
    @FieldName("戶籍員姓名")
    private String registrarName;

    /** 查詢結果. */
    @XmlElement(name = "ResultList")
    @FieldName("查詢結果")
    private List<Rl03710DTO> resultList = new ArrayList<Rl03710DTO>();

    /** 報表路徑. */
    @XmlElement(name = "ReportUrl")
    @FieldName("報表路徑")
    private String reportUrl = "";

    /**
     * Gets the person id.
     * 
     * @return the person id
     */
    public String getPersonId() {
        return personId;
    }

    /**
     * Sets the person id.
     * 
     * @param personId
     *            the new person id
     */
    public void setPersonId(final String personId) {
        this.personId = personId;
    }

    /**
     * Gets the apply transaction id.
     * 
     * @return the apply transaction id
     */
    public String getApplyTransactionId() {
        return applyTransactionId;
    }

    /**
     * Sets the apply transaction id.
     * 
     * @param applyTransactionId
     *            the new apply transaction id
     */
    public void setApplyTransactionId(final String applyTransactionId) {
        this.applyTransactionId = applyTransactionId;
    }

    /**
     * Gets the apply sequence id.
     * 
     * @return the apply sequence id
     */
    public String getApplySequenceId() {
        return applySequenceId;
    }

    /**
     * Sets the apply sequence id.
     * 
     * @param applySequenceId
     *            the new apply sequence id
     */
    public void setApplySequenceId(final String applySequenceId) {
        this.applySequenceId = applySequenceId;
    }

    /**
     * Gets the accept site id.
     * 
     * @return the accept site id
     */
    public String getAcceptSiteId() {
        return acceptSiteId;
    }

    /**
     * Sets the accept site id.
     * 
     * @param acceptSiteId
     *            the new accept site id
     */
    public void setAcceptSiteId(final String acceptSiteId) {
        this.acceptSiteId = acceptSiteId;
    }

    /**
     * Gets the accept area code.
     * 
     * @return the accept area code
     */
    public String getAcceptAreaCode() {
        return acceptAreaCode;
    }

    /**
     * Sets the accept area code.
     * 
     * @param acceptAreaCode
     *            the new accept area code
     */
    public void setAcceptAreaCode(final String acceptAreaCode) {
        this.acceptAreaCode = acceptAreaCode;
    }

    /**
     * Gets the accept admin office code.
     * 
     * @return the accept admin office code
     */
    public String getAcceptAdminOfficeCode() {
        return acceptAdminOfficeCode;
    }

    /**
     * Sets the accept admin office code.
     * 
     * @param acceptAdminOfficeCode
     *            the new accept admin office code
     */
    public void setAcceptAdminOfficeCode(final String acceptAdminOfficeCode) {
        this.acceptAdminOfficeCode = acceptAdminOfficeCode;
    }

    /**
     * Gets the register date.
     * 
     * @return the register date
     */
    public String getRegisterDate() {
        return registerDate;
    }

    /**
     * Sets the register date.
     * 
     * @param registerDate
     *            the new register date
     */
    public void setRegisterDate(final String registerDate) {
        this.registerDate = registerDate;
    }

    /**
     * Gets the register date begin.
     * 
     * @return the register date begin
     */
    public String getRegisterDateBegin() {
        return registerDateBegin;
    }

    /**
     * Sets the register date begin.
     * 
     * @param registerDateBegin
     *            the new register date begin
     */
    public void setRegisterDateBegin(final String registerDateBegin) {
        this.registerDateBegin = registerDateBegin;
    }

    /**
     * Gets the register date end.
     * 
     * @return the register date end
     */
    public String getRegisterDateEnd() {
        return registerDateEnd;
    }

    /**
     * Sets the register date end.
     * 
     * @param registerDateEnd
     *            the new register date end
     */
    public void setRegisterDateEnd(final String registerDateEnd) {
        this.registerDateEnd = registerDateEnd;
    }

    /**
     * Gets the register time.
     * 
     * @return the register time
     */
    public String getRegisterTime() {
        return registerTime;
    }

    /**
     * Sets the register time.
     * 
     * @param registerTime
     *            the new register time
     */
    public void setRegisterTime(final String registerTime) {
        this.registerTime = registerTime;
    }

    /**
     * Gets the person name.
     * 
     * @return the person name
     */
    public String getPersonName() {
        return personName;
    }

    /**
     * Sets the person name.
     * 
     * @param personName
     *            the new person name
     */
    public void setPersonName(final String personName) {
        this.personName = personName;
    }

    /**
     * Gets the master mark.
     * 
     * @return the master mark
     */
    public String getMasterMark() {
        return masterMark;
    }

    /**
     * Sets the master mark.
     * 
     * @param masterMark
     *            the new master mark
     */
    public void setMasterMark(final String masterMark) {
        this.masterMark = masterMark;
    }

    /**
     * Gets the apply code.
     * 
     * @return the apply code
     */
    public String getApplyCode() {
        return applyCode;
    }

    /**
     * Sets the apply code.
     * 
     * @param applyCode
     *            the new apply code
     */
    public void setApplyCode(final String applyCode) {
        this.applyCode = applyCode;
    }

    /**
     * Gets the village.
     * 
     * @return the village
     */
    public String getVillage() {
        return village;
    }

    /**
     * Sets the village.
     * 
     * @param village
     *            the new village
     */
    public void setVillage(final String village) {
        this.village = village;
    }

    /**
     * Gets the bb person id.
     * 
     * @return the bb person id
     */
    public String getBbPersonId() {
        return bbPersonId;
    }

    /**
     * Sets the bb person id.
     * 
     * @param bbPersonId
     *            the new bb person id
     */
    public void setBbPersonId(final String bbPersonId) {
        this.bbPersonId = bbPersonId;
    }

    /**
     * Gets the bb person name.
     * 
     * @return the bb person name
     */
    public String getBbPersonName() {
        return bbPersonName;
    }

    /**
     * Sets the bb person name.
     * 
     * @param bbPersonName
     *            the new bb person name
     */
    public void setBbPersonName(final String bbPersonName) {
        this.bbPersonName = bbPersonName;
    }

    /**
     * Gets the settle site id.
     * 
     * @return the settle site id
     */
    public String getSettleSiteId() {
        return settleSiteId;
    }

    /**
     * Sets the settle site id.
     * 
     * @param settleSiteId
     *            the new settle site id
     */
    public void setSettleSiteId(final String settleSiteId) {
        this.settleSiteId = settleSiteId;
    }

    /**
     * Gets the settle area code.
     * 
     * @return the settle area code
     */
    public String getSettleAreaCode() {
        return settleAreaCode;
    }

    /**
     * Sets the settle area code.
     * 
     * @param settleAreaCode
     *            the new settle area code
     */
    public void setSettleAreaCode(final String settleAreaCode) {
        this.settleAreaCode = settleAreaCode;
    }

    /**
     * Gets the settle admin office code.
     * 
     * @return the settle admin office code
     */
    public String getSettleAdminOfficeCode() {
        return settleAdminOfficeCode;
    }

    /**
     * Sets the settle admin office code.
     * 
     * @param settleAdminOfficeCode
     *            the new settle admin office code
     */
    public void setSettleAdminOfficeCode(final String settleAdminOfficeCode) {
        this.settleAdminOfficeCode = settleAdminOfficeCode;
    }

    /**
     * Gets the registrar name.
     * 
     * @return the registrar name
     */
    public String getRegistrarName() {
        return registrarName;
    }

    /**
     * Sets the registrar name.
     * 
     * @param registrarName
     *            the new registrar name
     */
    public void setRegistrarName(final String registrarName) {
        this.registrarName = registrarName;
    }

    /**
     * Gets the result list.
     * 
     * @return the result list
     */
    public List<Rl03710DTO> getResultList() {
        return resultList;
    }

    /**
     * Sets the result list.
     * 
     * @param resultList
     *            the new result list
     */
    public void setResultList(final List<Rl03710DTO> resultList) {
        this.resultList = resultList;
    }

    @Override
    public String toString() {
        return "Rl03710DTO [personId=" + personId + ", applyTransactionId=" + applyTransactionId + ", applySequenceId="
                + applySequenceId + ", acceptSiteId=" + acceptSiteId + ", acceptAreaCode=" + acceptAreaCode
                + ", acceptAdminOfficeCode=" + acceptAdminOfficeCode + ", registerDate=" + registerDate
                + ", registerDateBegin=" + registerDateBegin + ", registerDateEnd=" + registerDateEnd
                + ", registerTime=" + registerTime + ", personName=" + personName + ", masterMark=" + masterMark
                + ", applyCode=" + applyCode + ", village=" + village + ", bbPersonId=" + bbPersonId
                + ", bbPersonName=" + bbPersonName + ", settleSiteId=" + settleSiteId + ", settleAreaCode="
                + settleAreaCode + ", settleAdminOfficeCode=" + settleAdminOfficeCode + ", registrarName="
                + registrarName + ", resultList=" + resultList + "]";
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
    public void setReportUrl(String reportUrl) {
        this.reportUrl = reportUrl;
    }
}

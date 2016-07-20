/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.component.dto;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import tw.gov.moi.ae.checker.annotation.FieldName;

/**
 * 教育程度註記更新 DTO
 * 
 * @author 1119253
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rlModifyEducationDTO", propOrder = { "personId", "applyTransactionId", "applySequenceId", "siteId",
        "applySeq", "registerDate", "registerTime", "applyDate", "personName", "birthYyymmdd", "educationMark",
        "beforeEducationMark", "acceptSiteId", "acceptAdminOfficeCode", "acceptAreaCode", "settleSiteId",
        "settleAdminOfficeCode", "settleAreaCode", "acceptRegistrarName", "acceptRegistrarId" })
@XmlRootElement(name = "RlModifyEducation")
public class RlModifyEducationDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    /** 國民身分證統一編號. */
    @XmlElement(name = "PersonId", required = true)
    @FieldName("國民身分證統一編號")
    private String personId = "";

    /** 交易序號. */
    @XmlElement(name = "ApplyTransactionId", required = true)
    @FieldName("交易序號")
    private String applyTransactionId = "";

    /** 作業順序編號. */
    @XmlElement(name = "ApplySequenceId", required = true)
    @FieldName("作業順序編號")
    private Integer applySequenceId = Integer.valueOf(0);

    /** 資料儲存地作業點代碼. */
    @XmlElement(name = "SiteId", required = true)
    @FieldName("資料儲存地作業點代碼")
    private String siteId = "";

    /** 申請書流水號. */
    @XmlElement(name = "ApplySeq", required = true)
    @FieldName("申請書流水號")
    private Integer applySeq = Integer.valueOf(0);

    /** 登記日期. */
    @XmlElement(name = "RegisterDate", required = true)
    @FieldName("登記日期")
    private String registerDate = "";

    /** 登記時間. */
    @XmlElement(name = "RegisterTime", required = true)
    @FieldName("登記時間")
    private String registerTime = "";

    /** 申請日期. */
    @XmlElement(name = "ApplyDate", required = true)
    @FieldName("申請日期")
    private String applyDate = "";

    /** 姓名. */
    @XmlElement(name = "PersonName", required = true)
    @FieldName("姓名")
    private String personName = "";

    /** 出生日期. */
    @XmlElement(name = "BirthYyymmdd", required = true)
    @FieldName("出生日期")
    private String birthYyymmdd = "";

    /** 教育程度註記. */
    @XmlElement(name = "EducationMark", required = true)
    @FieldName("教育程度註記")
    private String educationMark = "";

    /** 修改前教育程度註記. */
    @XmlElement(name = "BeforeEducationMark", required = true)
    @FieldName("修改前教育程度註記")
    private String beforeEducationMark = "";

    /** 受理地作業點代碼. */
    @XmlElement(name = "AcceptSiteId", required = true)
    @FieldName("受理地作業點代碼")
    private String acceptSiteId = "";

    /** 受理地戶所代碼. */
    @XmlElement(name = "AcceptAdminOfficeCode", required = true)
    @FieldName("受理地戶所代碼")
    private String acceptAdminOfficeCode = "";

    /** 受理地行政區域代碼. */
    @XmlElement(name = "AcceptAreaCode", required = true)
    @FieldName("受理地行政區域代碼")
    private String acceptAreaCode = "";

    /** 戶籍地作業點代碼. */
    @XmlElement(name = "SettleSiteId", required = true)
    @FieldName("戶籍地作業點代碼")
    private String settleSiteId = "";

    /** 戶籍地戶所代碼. */
    @XmlElement(name = "SettleAdminOfficeCode", required = true)
    @FieldName("戶籍地戶所代碼")
    private String settleAdminOfficeCode = "";

    /** 戶籍地行政區域代碼. */
    @XmlElement(name = "SettleAreaCode", required = true)
    @FieldName("戶籍地行政區域代碼")
    private String settleAreaCode = "";

    /** 受理地戶籍員姓名. */
    @XmlElement(name = "AcceptRegistrarName", required = true)
    @FieldName("受理地戶籍員姓名")
    private String acceptRegistrarName = "";

    /** 受理地戶籍員帳號. */
    @XmlElement(name = "AcceptRegistrarId", required = true)
    @FieldName("受理地戶籍員帳號")
    private String acceptRegistrarId = "";

    /** 作業代碼. */
    @XmlElement(name = "OperationCode", required = true)
    @FieldName("作業代碼")
    private String operationCode = "";

    public String getPersonId() {
        return personId;
    }

    public void setPersonId(String personId) {
        this.personId = personId;
    }

    public String getApplyTransactionId() {
        return applyTransactionId;
    }

    public void setApplyTransactionId(String applyTransactionId) {
        this.applyTransactionId = applyTransactionId;
    }

    public Integer getApplySequenceId() {
        return applySequenceId;
    }

    public void setApplySequenceId(Integer applySequenceId) {
        this.applySequenceId = applySequenceId;
    }

    public String getSiteId() {
        return siteId;
    }

    public void setSiteId(String siteId) {
        this.siteId = siteId;
    }

    public Integer getApplySeq() {
        return applySeq;
    }

    public void setApplySeq(Integer applySeq) {
        this.applySeq = applySeq;
    }

    public String getAcceptRegistrarName() {
        return acceptRegistrarName;
    }

    public void setAcceptRegistrarName(String acceptRegistrarName) {
        this.acceptRegistrarName = acceptRegistrarName;
    }

    public String getRegisterTime() {
        return registerTime;
    }

    public void setRegisterTime(String registerTime) {
        this.registerTime = registerTime;
    }

    public String getAcceptAdminOfficeCode() {
        return acceptAdminOfficeCode;
    }

    public void setAcceptAdminOfficeCode(String acceptAdminOfficeCode) {
        this.acceptAdminOfficeCode = acceptAdminOfficeCode;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getAcceptRegistrarId() {
        return acceptRegistrarId;
    }

    public void setAcceptRegistrarId(String acceptRegistrarId) {
        this.acceptRegistrarId = acceptRegistrarId;
    }

    public String getBeforeEducationMark() {
        return beforeEducationMark;
    }

    public void setBeforeEducationMark(String beforeEducationMark) {
        this.beforeEducationMark = beforeEducationMark;
    }

    public String getAcceptSiteId() {
        return acceptSiteId;
    }

    public void setAcceptSiteId(String acceptSiteId) {
        this.acceptSiteId = acceptSiteId;
    }

    public String getAcceptAreaCode() {
        return acceptAreaCode;
    }

    public void setAcceptAreaCode(String acceptAreaCode) {
        this.acceptAreaCode = acceptAreaCode;
    }

    public String getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(String registerDate) {
        this.registerDate = registerDate;
    }

    public String getApplyDate() {
        return applyDate;
    }

    public void setApplyDate(String applyDate) {
        this.applyDate = applyDate;
    }

    public String getSettleAreaCode() {
        return settleAreaCode;
    }

    public void setSettleAreaCode(String settleAreaCode) {
        this.settleAreaCode = settleAreaCode;
    }

    public String getSettleSiteId() {
        return settleSiteId;
    }

    public void setSettleSiteId(String settleSiteId) {
        this.settleSiteId = settleSiteId;
    }

    public String getSettleAdminOfficeCode() {
        return settleAdminOfficeCode;
    }

    public void setSettleAdminOfficeCode(String settleAdminOfficeCode) {
        this.settleAdminOfficeCode = settleAdminOfficeCode;
    }

    public String getBirthYyymmdd() {
        return birthYyymmdd;
    }

    public void setBirthYyymmdd(String birthYyymmdd) {
        this.birthYyymmdd = birthYyymmdd;
    }

    public String getEducationMark() {
        return educationMark;
    }

    public void setEducationMark(String educationMark) {
        this.educationMark = educationMark;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
    }

    public String getOperationCode() {
        return operationCode;
    }

    public void setOperationCode(String operationCode) {
        this.operationCode = operationCode;
    }

}

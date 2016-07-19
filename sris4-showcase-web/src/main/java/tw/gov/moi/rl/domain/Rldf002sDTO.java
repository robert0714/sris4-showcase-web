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
 * The Class Rldf002sDTO.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Rldf002sDTO", propOrder = { "statisticKind", "domainObject", "applyTransactionId", "applySequenceId",
        "applySeq", "statisticYyymmdd", "siteId", "feeAmount", "cnt", "areaCode", "no", "mon", "adminOfficeCode",
        "num", "applyKind", "applyCode", "type", "isThisMonth" })
@XmlRootElement(name = "Rldf002sDTO")
public class Rldf002sDTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** 統計類別. */
    @XmlElement(name = "StatisticKind", required = true)
    @FieldName("統計類別")
    private String statisticKind = "";

    /** The domain object. */
    @XmlElement(name = "DomainObject", required = true)
    @FieldName("")
    private String domainObject = "";

    /** 交易序號. */
    @XmlElement(name = "ApplyTransactionId", required = true)
    @FieldName("交易序號")
    private String applyTransactionId = "";

    /** APPLY_作業順序編號. */
    @XmlElement(name = "ApplySequenceId", required = true)
    @FieldName("APPLY_作業順序編號")
    private Integer applySequenceId = Integer.valueOf(0);

    /** 申請書流水號. */
    @XmlElement(name = "ApplySeq", required = true)
    @FieldName("申請書流水號")
    private Integer applySeq = Integer.valueOf(0);

    /** 統計日期. */
    @XmlElement(name = "StatisticYyymmdd", required = true)
    @FieldName("統計日期")
    private String statisticYyymmdd = "";

    /** 作業點代碼. */
    @XmlElement(name = "SiteId", required = true)
    @FieldName("作業點代碼")
    private String siteId = "";

    /** 罰款金額. */
    @XmlElement(name = "FeeAmount", required = true)
    @FieldName("罰款金額")
    private String feeAmount = "";

    /** 份數. */
    @XmlElement(name = "Cnt", required = true)
    @FieldName("份數")
    private String cnt = "";

    /** 行政區域代碼. */
    @XmlElement(name = "AreaCode", required = true)
    @FieldName("行政區域代碼")
    private String areaCode = "";

    /** 件數. */
    @XmlElement(name = "No", required = true)
    @FieldName("件數")
    private String no = "";

    /** The mon. */
    @XmlElement(name = "Mon", required = true)
    @FieldName("mon")
    private String mon = "";

    /** 戶所代碼. */
    @XmlElement(name = "AdminOfficeCode", required = true)
    @FieldName("戶所代碼")
    private String adminOfficeCode = "";

    /** 張數. */
    @XmlElement(name = "Num", required = true)
    @FieldName("張數")
    private String num = "";

    /** 類別主項. */
    @XmlElement(name = "ApplyKind", required = true)
    @FieldName("類別主項")
    private String applyKind = "";

    /** 類別. */
    @XmlElement(name = "ApplyCode", required = true)
    @FieldName("類別")
    private String applyCode = "";

    /** 類別項. */
    @XmlElement(name = "Type", required = true)
    @FieldName("類別項")
    private String type = "";

    /** 本月. */
    @XmlElement(name = "IsThisMonth", required = true)
    @FieldName("本月")
    private String isThisMonth = "";

    /**
     * Gets the statistic kind.
     * 
     * @return the statistic kind
     */
    public String getStatisticKind() {
        return statisticKind;
    }

    /**
     * Sets the statistic kind.
     * 
     * @param statisticKind
     *            the new statistic kind
     */
    public void setStatisticKind(String statisticKind) {
        this.statisticKind = statisticKind;
    }

    /**
     * Gets the domain object.
     * 
     * @return the domain object
     */
    public String getDomainObject() {
        return domainObject;
    }

    /**
     * Sets the domain object.
     * 
     * @param domainObject
     *            the new domain object
     */
    public void setDomainObject(String domainObject) {
        this.domainObject = domainObject;
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
    public void setApplyTransactionId(String applyTransactionId) {
        this.applyTransactionId = applyTransactionId;
    }

    /**
     * Gets the apply sequence id.
     * 
     * @return the apply sequence id
     */
    public Integer getApplySequenceId() {
        return applySequenceId;
    }

    /**
     * Sets the apply sequence id.
     * 
     * @param applySequenceId
     *            the new apply sequence id
     */
    public void setApplySequenceId(Integer applySequenceId) {
        this.applySequenceId = applySequenceId;
    }

    /**
     * Gets the apply seq.
     * 
     * @return the apply seq
     */
    public Integer getApplySeq() {
        return applySeq;
    }

    /**
     * Sets the apply seq.
     * 
     * @param applySeq
     *            the new apply seq
     */
    public void setApplySeq(Integer applySeq) {
        this.applySeq = applySeq;
    }

    /**
     * Gets the statistic yyymmdd.
     * 
     * @return the statistic yyymmdd
     */
    public String getStatisticYyymmdd() {
        return statisticYyymmdd;
    }

    /**
     * Sets the statistic yyymmdd.
     * 
     * @param statisticYyymmdd
     *            the new statistic yyymmdd
     */
    public void setStatisticYyymmdd(String statisticYyymmdd) {
        this.statisticYyymmdd = statisticYyymmdd;
    }

    /**
     * Gets the site id.
     * 
     * @return the site id
     */
    public String getSiteId() {
        return siteId;
    }

    /**
     * Sets the site id.
     * 
     * @param siteId
     *            the new site id
     */
    public void setSiteId(String siteId) {
        this.siteId = siteId;
    }

    /**
     * Gets the fee amount.
     * 
     * @return the fee amount
     */
    public String getFeeAmount() {
        return feeAmount;
    }

    /**
     * Sets the fee amount.
     * 
     * @param feeAmount
     *            the new fee amount
     */
    public void setFeeAmount(String feeAmount) {
        this.feeAmount = feeAmount;
    }

    /**
     * Gets the cnt.
     * 
     * @return the cnt
     */
    public String getCnt() {
        return cnt;
    }

    /**
     * Sets the cnt.
     * 
     * @param cnt
     *            the new cnt
     */
    public void setCnt(String cnt) {
        this.cnt = cnt;
    }

    /**
     * Gets the area code.
     * 
     * @return the area code
     */
    public String getAreaCode() {
        return areaCode;
    }

    /**
     * Sets the area code.
     * 
     * @param areaCode
     *            the new area code
     */
    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    /**
     * Gets the no.
     * 
     * @return the no
     */
    public String getNo() {
        return no;
    }

    /**
     * Sets the no.
     * 
     * @param no
     *            the new no
     */
    public void setNo(String no) {
        this.no = no;
    }

    /**
     * Gets the mon.
     * 
     * @return the mon
     */
    public String getMon() {
        return mon;
    }

    /**
     * Sets the mon.
     * 
     * @param mon
     *            the new mon
     */
    public void setMon(String mon) {
        this.mon = mon;
    }

    /**
     * Gets the admin office code.
     * 
     * @return the admin office code
     */
    public String getAdminOfficeCode() {
        return adminOfficeCode;
    }

    /**
     * Sets the admin office code.
     * 
     * @param adminOfficeCode
     *            the new admin office code
     */
    public void setAdminOfficeCode(String adminOfficeCode) {
        this.adminOfficeCode = adminOfficeCode;
    }

    /**
     * Gets the num.
     * 
     * @return the num
     */
    public String getNum() {
        return num;
    }

    /**
     * Sets the num.
     * 
     * @param num
     *            the new num
     */
    public void setNum(String num) {
        this.num = num;
    }

    /**
     * Gets the apply kind.
     * 
     * @return the apply kind
     */
    public String getApplyKind() {
        return applyKind;
    }

    /**
     * Sets the apply kind.
     * 
     * @param applyKind
     *            the new apply kind
     */
    public void setApplyKind(String applyKind) {
        this.applyKind = applyKind;
    }

    public String getApplyCode() {
        return applyCode;
    }

    public void setApplyCode(String applyCode) {
        this.applyCode = applyCode;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getIsThisMonth() {
        return isThisMonth;
    }

    public void setIsThisMonth(String isThisMonth) {
        this.isThisMonth = isThisMonth;
    }

    @Override
    public String toString() {
        return "Rldf002sDTO [statisticKind=" + statisticKind + ", domainObject=" + domainObject
                + ", applyTransactionId=" + applyTransactionId + ", applySequenceId=" + applySequenceId + ", applySeq="
                + applySeq + ", statisticYyymmdd=" + statisticYyymmdd + ", siteId=" + siteId + ", feeAmount="
                + feeAmount + ", cnt=" + cnt + ", areaCode=" + areaCode + ", no=" + no + ", mon=" + mon
                + ", adminOfficeCode=" + adminOfficeCode + ", num=" + num + ", applyKind=" + applyKind + "]";
    }
}

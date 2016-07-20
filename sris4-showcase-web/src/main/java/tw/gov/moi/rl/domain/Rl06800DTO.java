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
 * The Class Rl06800DTO.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Rl06800DTO", propOrder = { "printAll", "householdIdBegin", "householdIdEnd",
        "householdIdBeginEnabled", "householdIdEndEnabled", "btnSendDisEnabled", "btnSaveDisEnabled", "reportType",
        "reportURL" })
@XmlRootElement(name = "Rl06800DTO")
public class Rl06800DTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = -8616388621444900101L;

    /** 是否全部列印. */
    @XmlElement(name = "PrintAll")
    @FieldName("是否全部列印")
    private String printAll = "";

    /** 戶號(起). */
    @XmlElement(name = "HouseholdIdBegin")
    @FieldName("戶號(起)")
    private String householdIdBegin;

    /** 戶號(迄). */
    @XmlElement(name = "HouseholdIdEnd")
    @FieldName("戶號(迄)")
    private String householdIdEnd;

    /** 戶號(起)狀態. */
    @XmlElement(name = "HouseholdIdBeginEnabled")
    @FieldName("戶號(起)狀態")
    private boolean householdIdBeginEnabled = false;

    /** 戶號(迄)狀態. */
    @XmlElement(name = "HouseholdIdEndEnabled")
    @FieldName("戶號(迄)狀態")
    private boolean householdIdEndEnabled = false;

    /** 「送出」按鈕狀態. */
    @XmlElement(name = "BtnSendDisEnabled")
    @FieldName("「送出」按鈕狀態")
    private boolean btnSendDisEnabled;

    /** 「另存電子檔」按鈕狀態. */
    @XmlElement(name = "BtnSaveDisEnabled")
    @FieldName("「另存電子檔」按鈕狀態")
    private boolean btnSaveDisEnabled = false;

    /** 檔案格式 */
    @XmlElement(name = "ReportType", required = true)
    @FieldName("檔案格式")
    private String reportType;

    /** 報表URL */
    @XmlElement(name = "ReportURL", required = true)
    @FieldName("報表URL")
    private String reportURL;

    /**
     * Gets the prints the all.
     * 
     * @return the prints the all
     */
    public String getPrintAll() {
        return printAll;
    }

    /**
     * Sets the prints the all.
     * 
     * @param printAll
     *            the new prints the all
     */
    public void setPrintAll(final String printAll) {
        this.printAll = printAll;
    }

    /**
     * Gets the household id begin.
     * 
     * @return the household id begin
     */
    public String getHouseholdIdBegin() {
        return householdIdBegin;
    }

    /**
     * Sets the household id begin.
     * 
     * @param householdIdBegin
     *            the new household id begin
     */
    public void setHouseholdIdBegin(final String householdIdBegin) {
        this.householdIdBegin = householdIdBegin;
    }

    /**
     * Gets the household id end.
     * 
     * @return the household id end
     */
    public String getHouseholdIdEnd() {
        return householdIdEnd;
    }

    /**
     * Sets the household id end.
     * 
     * @param householdIdEnd
     *            the new household id end
     */
    public void setHouseholdIdEnd(final String householdIdEnd) {
        this.householdIdEnd = householdIdEnd;
    }

    public boolean isHouseholdIdBeginEnabled() {
        return householdIdBeginEnabled;
    }

    public void setHouseholdIdBeginEnabled(boolean householdIdBeginEnabled) {
        this.householdIdBeginEnabled = householdIdBeginEnabled;
    }

    public boolean isHouseholdIdEndEnabled() {
        return householdIdEndEnabled;
    }

    public void setHouseholdIdEndEnabled(boolean householdIdEndEnabled) {
        this.householdIdEndEnabled = householdIdEndEnabled;
    }

    public boolean isBtnSendDisEnabled() {
        return btnSendDisEnabled;
    }

    public void setBtnSendDisEnabled(boolean btnSendDisEnabled) {
        this.btnSendDisEnabled = btnSendDisEnabled;
    }

    public boolean isBtnSaveDisEnabled() {
        return btnSaveDisEnabled;
    }

    public void setBtnSaveDisEnabled(boolean btnSaveDisEnabled) {
        this.btnSaveDisEnabled = btnSaveDisEnabled;
    }

    public String getReportURL() {
        return reportURL;
    }

    public void setReportURL(final String reportURL) {
        this.reportURL = reportURL;
    }

    public String getReportType() {
        return reportType;
    }

    public void setReportType(final String reportType) {
        this.reportType = reportType;
    }
}

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
 * 結婚動態統計申請書資料清冊 DTO.
 * 
 * @author Weiren.Jheng
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl08273DTO", propOrder = { "seqType", "noteDateFrom", "noteDateTo", "hAgeFrom", "hAgeTo", "wAgeFrom",
        "wAgeTo", "hMarryStatus", "wMarryStatus", "hNationCode", "wNationCode", "marryDateFrom", "marryDateTo",
        "hEducationMarkFrom", "hEducationMarkTo", "wEducationMarkFrom", "wEducationMarkTo", "hNationCodeSpace",
        "wNationCodeSpace", "reportFormat", "reportUrl" })
@XmlRootElement(name = "Rl08273DTO")
public class Rl08273DTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** 排序方式. */
    @XmlElement(name = "SeqType")
    @FieldName("排序方式")
    private String seqType = "";

    /** 登記日期起. */
    @XmlElement(name = "NoteDateFrom")
    @FieldName("登記日期 起")
    private String noteDateFrom = "";

    /** 登記日期迄. */
    @XmlElement(name = "NoteDateTo")
    @FieldName("登記日期 迄")
    private String noteDateTo = "";

    /** 夫年齡起. */
    @XmlElement(name = "HAgeFrom")
    @FieldName("夫年齡起")
    private String hAgeFrom = "";

    /** 夫年齡迄. */
    @XmlElement(name = "HAgeTo")
    @FieldName("夫年齡迄")
    private String hAgeTo = "";

    /** 妻年齡起. */
    @XmlElement(name = "WAgeFrom")
    @FieldName("妻年齡起")
    private String wAgeFrom = "";

    /** 妻年齡迄. */
    @XmlElement(name = "WAgeTo")
    @FieldName("妻年齡迄")
    private String wAgeTo = "";

    /** 夫婚前婚姻狀況. */
    @XmlElement(name = "HMarryStatus")
    @FieldName("夫婚前婚姻狀況")
    private String hMarryStatus = "";

    /** 妻婚前婚姻狀況. */
    @XmlElement(name = "WMarryStatus")
    @FieldName("妻婚前婚姻狀況")
    private String wMarryStatus = "";

    /** 夫國籍或區域代碼. */
    @XmlElement(name = "HNationCode")
    @FieldName("夫國籍或區域代碼")
    private String hNationCode = "";

    /** 妻國籍或區域代碼. */
    @XmlElement(name = "WNationCode")
    @FieldName("妻國籍或區域代碼")
    private String wNationCode = "";

    /** 結婚日期起. */
    @XmlElement(name = "MarryDateFrom")
    @FieldName("結婚日期起")
    private String marryDateFrom = "";

    /** 結婚日期迄. */
    @XmlElement(name = "MarryDateTo")
    @FieldName("結婚日期迄")
    private String marryDateTo = "";

    /** 夫教育程迄起. */
    @XmlElement(name = "HEducationMarkFrom")
    @FieldName("夫教育程迄起")
    private String hEducationMarkFrom = "";

    /** 夫教育程度迄. */
    @XmlElement(name = "HEducationMarkTo")
    @FieldName(" 夫教育程度迄")
    private String hEducationMarkTo = "";

    /** 妻教育程迄起. */
    @XmlElement(name = "WEducationMarkFrom")
    @FieldName("妻教育程迄起")
    private String wEducationMarkFrom = "";

    /** 妻教育程度迄. */
    @XmlElement(name = "WEducationMarkTo")
    @FieldName("妻教育程度迄")
    private String wEducationMarkTo = "";

    /** 夫國籍域區域代碼空白者. */
    @XmlElement(name = "HNationCodeSpace")
    @FieldName("夫國籍域區域代碼空白者")
    private boolean hNationCodeSpace = false;

    /** 妻國籍域區域代碼空白者. */
    @XmlElement(name = "WNationCodeSpace")
    @FieldName("妻國籍域區域代碼空白者")
    private boolean wNationCodeSpace = false;

    /** 電子檔格式. */
    @XmlElement(name = "ReportFormat")
    @FieldName("電子檔格式")
    private String reportFormat = "";

    /** 報表路徑. */
    @XmlElement(name = "ReportUrl")
    @FieldName("報表路徑")
    private String reportUrl = "";

    /**
     * Gets the seq type.
     * 
     * @return the seq type
     */
    public String getSeqType() {
        return seqType;
    }

    /**
     * Sets the seq type.
     * 
     * @param seqType
     *            the new seq type
     */
    public void setSeqType(String seqType) {
        this.seqType = seqType;
    }

    /**
     * Gets the note date from.
     * 
     * @return the note date from
     */
    public String getNoteDateFrom() {
        return noteDateFrom;
    }

    /**
     * Sets the note date from.
     * 
     * @param noteDateFrom
     *            the new note date from
     */
    public void setNoteDateFrom(String noteDateFrom) {
        this.noteDateFrom = noteDateFrom;
    }

    /**
     * Gets the note date to.
     * 
     * @return the note date to
     */
    public String getNoteDateTo() {
        return noteDateTo;
    }

    /**
     * Sets the note date to.
     * 
     * @param noteDateTo
     *            the new note date to
     */
    public void setNoteDateTo(String noteDateTo) {
        this.noteDateTo = noteDateTo;
    }

    /**
     * Gets the h age from.
     * 
     * @return the h age from
     */
    public String gethAgeFrom() {
        return hAgeFrom;
    }

    /**
     * Sets the h age from.
     * 
     * @param hAgeFrom
     *            the new h age from
     */
    public void sethAgeFrom(String hAgeFrom) {
        this.hAgeFrom = hAgeFrom;
    }

    /**
     * Gets the h age to.
     * 
     * @return the h age to
     */
    public String gethAgeTo() {
        return hAgeTo;
    }

    /**
     * Sets the h age to.
     * 
     * @param hAgeTo
     *            the new h age to
     */
    public void sethAgeTo(String hAgeTo) {
        this.hAgeTo = hAgeTo;
    }

    /**
     * Gets the w age from.
     * 
     * @return the w age from
     */
    public String getwAgeFrom() {
        return wAgeFrom;
    }

    /**
     * Sets the w age from.
     * 
     * @param wAgeFrom
     *            the new w age from
     */
    public void setwAgeFrom(String wAgeFrom) {
        this.wAgeFrom = wAgeFrom;
    }

    /**
     * Gets the w age to.
     * 
     * @return the w age to
     */
    public String getwAgeTo() {
        return wAgeTo;
    }

    /**
     * Sets the w age to.
     * 
     * @param wAgeTo
     *            the new w age to
     */
    public void setwAgeTo(String wAgeTo) {
        this.wAgeTo = wAgeTo;
    }

    /**
     * Gets the h marry status.
     * 
     * @return the h marry status
     */
    public String gethMarryStatus() {
        return hMarryStatus;
    }

    /**
     * Sets the h marry status.
     * 
     * @param hMarryStatus
     *            the new h marry status
     */
    public void sethMarryStatus(String hMarryStatus) {
        this.hMarryStatus = hMarryStatus;
    }

    /**
     * Gets the w marry status.
     * 
     * @return the w marry status
     */
    public String getwMarryStatus() {
        return wMarryStatus;
    }

    /**
     * Sets the w marry status.
     * 
     * @param wMarryStatus
     *            the new w marry status
     */
    public void setwMarryStatus(String wMarryStatus) {
        this.wMarryStatus = wMarryStatus;
    }

    /**
     * Gets the h nation code.
     * 
     * @return the h nation code
     */
    public String gethNationCode() {
        return hNationCode;
    }

    /**
     * Sets the h nation code.
     * 
     * @param hNationCode
     *            the new h nation code
     */
    public void sethNationCode(String hNationCode) {
        this.hNationCode = hNationCode;
    }

    /**
     * Gets the w nation code.
     * 
     * @return the w nation code
     */
    public String getwNationCode() {
        return wNationCode;
    }

    /**
     * Sets the w nation code.
     * 
     * @param wNationCode
     *            the new w nation code
     */
    public void setwNationCode(String wNationCode) {
        this.wNationCode = wNationCode;
    }

    /**
     * Gets the marry date from.
     * 
     * @return the marry date from
     */
    public String getMarryDateFrom() {
        return marryDateFrom;
    }

    /**
     * Sets the marry date from.
     * 
     * @param marryDateFrom
     *            the new marry date from
     */
    public void setMarryDateFrom(String marryDateFrom) {
        this.marryDateFrom = marryDateFrom;
    }

    /**
     * Gets the marry date to.
     * 
     * @return the marry date to
     */
    public String getMarryDateTo() {
        return marryDateTo;
    }

    /**
     * Sets the marry date to.
     * 
     * @param marryDateTo
     *            the new marry date to
     */
    public void setMarryDateTo(String marryDateTo) {
        this.marryDateTo = marryDateTo;
    }

    /**
     * Gets the h education mark from.
     * 
     * @return the h education mark from
     */
    public String gethEducationMarkFrom() {
        return hEducationMarkFrom;
    }

    /**
     * Sets the h education mark from.
     * 
     * @param hEducationMarkFrom
     *            the new h education mark from
     */
    public void sethEducationMarkFrom(String hEducationMarkFrom) {
        this.hEducationMarkFrom = hEducationMarkFrom;
    }

    /**
     * Gets the h education mark to.
     * 
     * @return the h education mark to
     */
    public String gethEducationMarkTo() {
        return hEducationMarkTo;
    }

    /**
     * Sets the h education mark to.
     * 
     * @param hEducationMarkTo
     *            the new h education mark to
     */
    public void sethEducationMarkTo(String hEducationMarkTo) {
        this.hEducationMarkTo = hEducationMarkTo;
    }

    /**
     * Gets the w education mark from.
     * 
     * @return the w education mark from
     */
    public String getwEducationMarkFrom() {
        return wEducationMarkFrom;
    }

    /**
     * Sets the w education mark from.
     * 
     * @param wEducationMarkFrom
     *            the new w education mark from
     */
    public void setwEducationMarkFrom(String wEducationMarkFrom) {
        this.wEducationMarkFrom = wEducationMarkFrom;
    }

    /**
     * Gets the w education mark to.
     * 
     * @return the w education mark to
     */
    public String getwEducationMarkTo() {
        return wEducationMarkTo;
    }

    /**
     * Sets the w education mark to.
     * 
     * @param wEducationMarkTo
     *            the new w education mark to
     */
    public void setwEducationMarkTo(String wEducationMarkTo) {
        this.wEducationMarkTo = wEducationMarkTo;
    }

    /**
     * Checks if is h nation code space.
     * 
     * @return true, if is h nation code space
     */
    public boolean ishNationCodeSpace() {
        return hNationCodeSpace;
    }

    /**
     * Sets the h nation code space.
     * 
     * @param hNationCodeSpace
     *            the new h nation code space
     */
    public void sethNationCodeSpace(boolean hNationCodeSpace) {
        this.hNationCodeSpace = hNationCodeSpace;
    }

    /**
     * Checks if is w nation code space.
     * 
     * @return true, if is w nation code space
     */
    public boolean iswNationCodeSpace() {
        return wNationCodeSpace;
    }

    /**
     * Sets the w nation code space.
     * 
     * @param wNationCodeSpace
     *            the new w nation code space
     */
    public void setwNationCodeSpace(boolean wNationCodeSpace) {
        this.wNationCodeSpace = wNationCodeSpace;
    }

    /**
     * Gets the report format.
     * 
     * @return the report format
     */
    public String getReportFormat() {
        return reportFormat;
    }

    /**
     * Sets the report format.
     * 
     * @param reportFormat
     *            the new report format
     */
    public void setReportFormat(String reportFormat) {
        this.reportFormat = reportFormat;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "Rl08273DTO [seqType=" + seqType + ", noteDateFrom=" + noteDateFrom + ", noteDateTo=" + noteDateTo
                + ", hAgeFrom=" + hAgeFrom + ", hAgeTo=" + hAgeTo + ", wAgeFrom=" + wAgeFrom + ", wAgeTo=" + wAgeTo
                + ", hMarryStatus=" + hMarryStatus + ", wMarryStatus=" + wMarryStatus + ", hNationCode=" + hNationCode
                + ", wNationCode=" + wNationCode + ", marryDateFrom=" + marryDateFrom + ", marryDateTo=" + marryDateTo
                + ", hEducationMarkFrom=" + hEducationMarkFrom + ", hEducationMarkTo=" + hEducationMarkTo
                + ", wEducationMarkFrom=" + wEducationMarkFrom + ", wEducationMarkTo=" + wEducationMarkTo
                + ", hNationCodeSpace=" + hNationCodeSpace + ", wNationCodeSpace=" + wNationCodeSpace
                + ", reportFormat=" + reportFormat + "]";
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

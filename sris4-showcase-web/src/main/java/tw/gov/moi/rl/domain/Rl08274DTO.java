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
 * 離婚動態統計申請書資料清冊 DTO.
 * 
 * @author Weiren.Jheng
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl08274DTO", propOrder = { "seqType", "noteDateFrom", "noteDateTo", "hAgeFrom", "hAgeTo",
        "hEducationMarkFrom", "hEducationMarkTo", "hMarryAgeFrom", "hMarryAgeTo", "hNationCode", "wAgeFrom", "wAgeTo",
        "wEducationMarkFrom", "wEducationMarkTo", "wMarryAgeFrom", "wMarryAgeTo", "wNationCode", "divorceDateFrom",
        "divorceDateTo", "marryPeriodFrom", "marryPeriodTo", "notOneYear", "hNationCodeSpace", "wNationCodeSpace",
        "reportFormat", "reportUrl" })
@XmlRootElement(name = "Rl08274DTO")
public class Rl08274DTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** 排序方式. */
    @XmlElement(name = "SeqType")
    @FieldName("排序方式")
    private String seqType;

    /** 登記日期 起. */
    @XmlElement(name = "NoteDateFrom")
    @FieldName("登記日期 起")
    private String noteDateFrom;

    /** 登記日期 迄. */
    @XmlElement(name = "NoteDateTo")
    @FieldName("登記日期 迄")
    private String noteDateTo;

    /** 夫 年齡 起. */
    @XmlElement(name = "HAgeFrom")
    @FieldName("夫 年齡 起")
    private String hAgeFrom;

    /** 夫 年齡 迄. */
    @XmlElement(name = "HAgeTo")
    @FieldName("夫 年齡 迄")
    private String hAgeTo;

    /** 夫教育程迄 起. */
    @XmlElement(name = "HEducationMarkFrom")
    @FieldName("夫教育程迄 起")
    private String hEducationMarkFrom;

    /** 夫教育程度 迄. */
    @XmlElement(name = "HEducationMarkTo")
    @FieldName("夫教育程度 迄")
    private String hEducationMarkTo;

    /** 夫 結婚時年齡 起. */
    @XmlElement(name = "HMarryAgeFrom")
    @FieldName("夫 結婚時年齡 起")
    private String hMarryAgeFrom;

    /** 夫 結婚時年齡 迄. */
    @XmlElement(name = "HMarryAgeTo")
    @FieldName("夫 結婚時年齡 迄")
    private String hMarryAgeTo;

    /** 夫 國籍或區域代碼. */
    @XmlElement(name = "HNationCode")
    @FieldName("夫 國籍或區域代碼")
    private String hNationCode;

    /** 妻 年齡 起. */
    @XmlElement(name = "WAgeFrom")
    @FieldName("妻 年齡 起")
    private String wAgeFrom;

    /** 妻 年齡 迄. */
    @XmlElement(name = "WAgeTo")
    @FieldName("妻 年齡 迄")
    private String wAgeTo;

    /** 妻教育程迄 起. */
    @XmlElement(name = "WEducationMarkFrom")
    @FieldName("妻教育程迄 起")
    private String wEducationMarkFrom;

    /** 妻教育程度 迄. */
    @XmlElement(name = "WEducationMarkTo")
    @FieldName("妻教育程度 迄")
    private String wEducationMarkTo;

    /** 妻 結婚時年齡 起. */
    @XmlElement(name = "WMarryAgeFrom")
    @FieldName("妻 結婚時年齡 起")
    private String wMarryAgeFrom;

    /** 妻 結婚時年齡 迄. */
    @XmlElement(name = "WMarryAgeTo")
    @FieldName("妻 結婚時年齡 迄")
    private String wMarryAgeTo;

    /** 妻 國籍或區域代碼. */
    @XmlElement(name = "WNationCode")
    @FieldName("妻 國籍或區域代碼")
    private String wNationCode;

    /** 離婚日期 起. */
    @XmlElement(name = "DivorceDateFrom")
    @FieldName("離婚日期 起")
    private String divorceDateFrom;

    /** 離婚日期 迄. */
    @XmlElement(name = "DivorceDateTo")
    @FieldName("離婚日期 迄")
    private String divorceDateTo;

    /** 結婚期間(起). */
    @XmlElement(name = "MarryPeriodFrom")
    @FieldName("結婚期間(起)")
    private String marryPeriodFrom;

    /** 結婚期間(迄). */
    @XmlElement(name = "MarryPeriodTo")
    @FieldName("結婚期間(迄)")
    private String marryPeriodTo;

    /** 結婚期間不滿一年. */
    @XmlElement(name = "NotOneYear")
    @FieldName("結婚期間不滿一年")
    private boolean notOneYear = false;

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
     * Gets the h marry age from.
     * 
     * @return the h marry age from
     */
    public String gethMarryAgeFrom() {
        return hMarryAgeFrom;
    }

    /**
     * Sets the h marry age from.
     * 
     * @param hMarryAgeFrom
     *            the new h marry age from
     */
    public void sethMarryAgeFrom(String hMarryAgeFrom) {
        this.hMarryAgeFrom = hMarryAgeFrom;
    }

    /**
     * Gets the h marry age to.
     * 
     * @return the h marry age to
     */
    public String gethMarryAgeTo() {
        return hMarryAgeTo;
    }

    /**
     * Sets the h marry age to.
     * 
     * @param hMarryAgeTo
     *            the new h marry age to
     */
    public void sethMarryAgeTo(String hMarryAgeTo) {
        this.hMarryAgeTo = hMarryAgeTo;
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
     * Gets the w marry age from.
     * 
     * @return the w marry age from
     */
    public String getwMarryAgeFrom() {
        return wMarryAgeFrom;
    }

    /**
     * Sets the w marry age from.
     * 
     * @param wMarryAgeFrom
     *            the new w marry age from
     */
    public void setwMarryAgeFrom(String wMarryAgeFrom) {
        this.wMarryAgeFrom = wMarryAgeFrom;
    }

    /**
     * Gets the w marry age to.
     * 
     * @return the w marry age to
     */
    public String getwMarryAgeTo() {
        return wMarryAgeTo;
    }

    /**
     * Sets the w marry age to.
     * 
     * @param wMarryAgeTo
     *            the new w marry age to
     */
    public void setwMarryAgeTo(String wMarryAgeTo) {
        this.wMarryAgeTo = wMarryAgeTo;
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
     * Gets the divorce date from.
     * 
     * @return the divorce date from
     */
    public String getDivorceDateFrom() {
        return divorceDateFrom;
    }

    /**
     * Sets the divorce date from.
     * 
     * @param divorceDateFrom
     *            the new divorce date from
     */
    public void setDivorceDateFrom(String divorceDateFrom) {
        this.divorceDateFrom = divorceDateFrom;
    }

    /**
     * Gets the divorce date to.
     * 
     * @return the divorce date to
     */
    public String getDivorceDateTo() {
        return divorceDateTo;
    }

    /**
     * Sets the divorce date to.
     * 
     * @param divorceDateTo
     *            the new divorce date to
     */
    public void setDivorceDateTo(String divorceDateTo) {
        this.divorceDateTo = divorceDateTo;
    }

    /**
     * Gets the marry period from.
     * 
     * @return the marry period from
     */
    public String getMarryPeriodFrom() {
        return marryPeriodFrom;
    }

    /**
     * Sets the marry period from.
     * 
     * @param marryPeriodFrom
     *            the new marry period from
     */
    public void setMarryPeriodFrom(String marryPeriodFrom) {
        this.marryPeriodFrom = marryPeriodFrom;
    }

    /**
     * Gets the marry period to.
     * 
     * @return the marry period to
     */
    public String getMarryPeriodTo() {
        return marryPeriodTo;
    }

    /**
     * Sets the marry period to.
     * 
     * @param marryPeriodTo
     *            the new marry period to
     */
    public void setMarryPeriodTo(String marryPeriodTo) {
        this.marryPeriodTo = marryPeriodTo;
    }

    /**
     * Checks if is not one year.
     * 
     * @return true, if is not one year
     */
    public boolean isNotOneYear() {
        return notOneYear;
    }

    /**
     * Sets the not one year.
     * 
     * @param notOneYear
     *            the new not one year
     */
    public void setNotOneYear(boolean notOneYear) {
        this.notOneYear = notOneYear;
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
        return "Rl08274DTO [seqType=" + seqType + ", noteDateFrom=" + noteDateFrom + ", noteDateTo=" + noteDateTo
                + ", hAgeFrom=" + hAgeFrom + ", hAgeTo=" + hAgeTo + ", hEducationMarkFrom=" + hEducationMarkFrom
                + ", hEducationMarkTo=" + hEducationMarkTo + ", hMarryAgeFrom=" + hMarryAgeFrom + ", hMarryAgeTo="
                + hMarryAgeTo + ", hNationCode=" + hNationCode + ", wAgeFrom=" + wAgeFrom + ", wAgeTo=" + wAgeTo
                + ", wEducationMarkFrom=" + wEducationMarkFrom + ", wEducationMarkTo=" + wEducationMarkTo
                + ", wMarryAgeFrom=" + wMarryAgeFrom + ", wMarryAgeTo=" + wMarryAgeTo + ", wNationCode=" + wNationCode
                + ", divorceDateFrom=" + divorceDateFrom + ", divorceDateTo=" + divorceDateTo + ", marryPeriodFrom="
                + marryPeriodFrom + ", marryPeriodTo=" + marryPeriodTo + ", notOneYear=" + notOneYear
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

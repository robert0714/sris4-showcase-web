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
 * 死亡動態統計申請書資料清冊 DTO.
 * 
 * @author Weiren.Jheng
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl08272DTO", propOrder = { "seqType", "noteDateFrom", "noteDateTo", "deathDateFrom", "deathDateTo",
        "sex", "deathAgeFrom", "deathAgeTo", "educationMarkFrom", "educationMarkTo", "marriageCode", "notOneYear",
        "reportUrl" })
@XmlRootElement(name = "Rl08272DTO")
public class Rl08272DTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** 排序方式. */
    @XmlElement(name = "SeqType")
    @FieldName("排序方式")
    private String seqType = "";

    /** 登記日期 起. */
    @XmlElement(name = "NoteDateFrom")
    @FieldName("登記日期起")
    private String noteDateFrom = "";

    /** 登記日期 迄. */
    @XmlElement(name = "NoteDateTo")
    @FieldName("登記日期迄")
    private String noteDateTo = "";

    /** 死亡日期起. */
    @XmlElement(name = "DeathDateFrom")
    @FieldName("死亡日期起")
    private String deathDateFrom = "";

    /** 死亡日期迄. */
    @XmlElement(name = "DeathDateTo")
    @FieldName("死亡日期迄")
    private String deathDateTo = "";

    /** 性別. */
    @XmlElement(name = "Sex")
    @FieldName("性別")
    private String sex = "";

    /** 年齡（歲） 起. */
    @XmlElement(name = "DeathAgeFrom")
    @FieldName("年齡（歲）起")
    private String deathAgeFrom = "";

    /** 年齡（歲） 迄. */
    @XmlElement(name = "DeathAgeTo")
    @FieldName("年齡（歲）迄")
    private String deathAgeTo = "";

    /** 教育程度 起. */
    @XmlElement(name = "EducationMarkFrom")
    @FieldName("教育程度起")
    private String educationMarkFrom = "";

    /** 教育程度 迄. */
    @XmlElement(name = "EducationMarkTo")
    @FieldName("教育程度迄")
    private String educationMarkTo = "";

    /** 婚姻狀況. */
    @XmlElement(name = "MarriageCode")
    @FieldName("婚姻狀況")
    private String marriageCode = "";

    /** 未滿一年. */
    @XmlElement(name = "NotOneYear")
    @FieldName("未滿一年")
    private boolean notOneYear = false;

    /** 檔案格式. */
    @XmlElement(name = "ReportFormat")
    @FieldName("檔案格式")
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
     * Gets the death date from.
     * 
     * @return the death date from
     */
    public String getDeathDateFrom() {
        return deathDateFrom;
    }

    /**
     * Sets the death date from.
     * 
     * @param deathDateFrom
     *            the new death date from
     */
    public void setDeathDateFrom(String deathDateFrom) {
        this.deathDateFrom = deathDateFrom;
    }

    /**
     * Gets the death date to.
     * 
     * @return the death date to
     */
    public String getDeathDateTo() {
        return deathDateTo;
    }

    /**
     * Sets the death date to.
     * 
     * @param deathDateTo
     *            the new death date to
     */
    public void setDeathDateTo(String deathDateTo) {
        this.deathDateTo = deathDateTo;
    }

    /**
     * Gets the sex.
     * 
     * @return the sex
     */
    public String getSex() {
        return sex;
    }

    /**
     * Sets the sex.
     * 
     * @param sex
     *            the new sex
     */
    public void setSex(String sex) {
        this.sex = sex;
    }

    /**
     * Gets the death age from.
     * 
     * @return the death age from
     */
    public String getDeathAgeFrom() {
        return deathAgeFrom;
    }

    /**
     * Sets the death age from.
     * 
     * @param deathAgeFrom
     *            the new death age from
     */
    public void setDeathAgeFrom(String deathAgeFrom) {
        this.deathAgeFrom = deathAgeFrom;
    }

    /**
     * Gets the death age to.
     * 
     * @return the death age to
     */
    public String getDeathAgeTo() {
        return deathAgeTo;
    }

    /**
     * Sets the death age to.
     * 
     * @param deathAgeTo
     *            the new death age to
     */
    public void setDeathAgeTo(String deathAgeTo) {
        this.deathAgeTo = deathAgeTo;
    }

    /**
     * Gets the education mark from.
     * 
     * @return the education mark from
     */
    public String getEducationMarkFrom() {
        return educationMarkFrom;
    }

    /**
     * Sets the education mark from.
     * 
     * @param educationMarkFrom
     *            the new education mark from
     */
    public void setEducationMarkFrom(String educationMarkFrom) {
        this.educationMarkFrom = educationMarkFrom;
    }

    /**
     * Gets the education mark to.
     * 
     * @return the education mark to
     */
    public String getEducationMarkTo() {
        return educationMarkTo;
    }

    /**
     * Sets the education mark to.
     * 
     * @param educationMarkTo
     *            the new education mark to
     */
    public void setEducationMarkTo(String educationMarkTo) {
        this.educationMarkTo = educationMarkTo;
    }

    /**
     * Gets the marriage code.
     * 
     * @return the marriage code
     */
    public String getMarriageCode() {
        return marriageCode;
    }

    /**
     * Sets the marriage code.
     * 
     * @param marriageCode
     *            the new marriage code
     */
    public void setMarriageCode(String marriageCode) {
        this.marriageCode = marriageCode;
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
        return "Rl08272DTO [seqType=" + seqType + ", noteDateFrom=" + noteDateFrom + ", noteDateTo=" + noteDateTo
                + ", deathDateFrom=" + deathDateFrom + ", deathDateTo=" + deathDateTo + ", sex=" + sex
                + ", deathAgeFrom=" + deathAgeFrom + ", deathAgeTo=" + deathAgeTo + ", educationMarkFrom="
                + educationMarkFrom + ", educationMarkTo=" + educationMarkTo + ", marriageCode=" + marriageCode
                + ", notOneYear=" + notOneYear + ", reportFormat=" + reportFormat + "]";
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

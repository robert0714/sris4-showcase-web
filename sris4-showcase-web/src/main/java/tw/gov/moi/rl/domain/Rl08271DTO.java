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
 * 出生動態統計申請書資料造冊 DTO.
 * 
 * @author Weiren.Jheng
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl08271DTO", propOrder = { "seqType", "noteDateFrom", "noteDateTo", "birthDateFrom", "birthDateTo",
        "sex", "birthKind", "birthType", "birthNumFrom", "birthNumTo", "birthWeightFrom", "birthWeightTo",
        "birthWkFrom", "birthWkTo", "fAgeFrom", "fAgeTo", "fEducationMarkFrom", "fEducationMarkTo", "fMarryAgeFrom",
        "fMarryAgeTo", "fNationCode", "mAgeFrom", "mAgeTo", "mEducationMarkFrom", "mEducationMarkTo", "mMarryAgeFrom",
        "mMarryAgeTo", "mNationCode", "marryYyyMmFrom", "marryYyyMmTo", "notOneYear", "reportFormat", "reportUrl" })
@XmlRootElement(name = "Rl08271DTO")
public class Rl08271DTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** 排序方式. */
    @XmlElement(name = "SeqType")
    @FieldName("排序方式")
    private String seqType = "";

    /** 登記日期 起. */
    @XmlElement(name = "NoteDateFrom")
    @FieldName("登記日期 起")
    private String noteDateFrom = "";

    /** 登記日期 迄. */
    @XmlElement(name = "NoteDateTo")
    @FieldName("登記日期 迄")
    private String noteDateTo = "";

    /** 出生者 出生日期 起. */
    @XmlElement(name = "BirthDateFrom")
    @FieldName("出生者 出生日期 起")
    private String birthDateFrom = "";

    /** 出生者 出生日期 迄. */
    @XmlElement(name = "BirthDateTo")
    @FieldName("出生者 出生日期 迄")
    private String birthDateTo = "";

    /** 性別. */
    @XmlElement(name = "Sex")
    @FieldName("性別")
    private String sex = "";

    /** 出生者身份. */
    @XmlElement(name = "BirthKind")
    @FieldName("出生者身份")
    private String birthKind = "";

    /** 出生別胎別. */
    @XmlElement(name = "BirthType")
    @FieldName("出生別胎別")
    private String birthType = "";

    /** 出生者胎次 起. */
    @XmlElement(name = "BirthNumFrom")
    @FieldName("出生者胎次 起")
    private String birthNumFrom = "";

    /** 出生者胎次 迄. */
    @XmlElement(name = "BirthNumTo")
    @FieldName("出生者胎次 迄")
    private String birthNumTo = "";

    /** 出生者 體重 起. */
    @XmlElement(name = "BirthWeightFrom")
    @FieldName(" 出生者 體重 起")
    private String birthWeightFrom = "";

    /** 出生者 體重 迄. */
    @XmlElement(name = "BirthWeightTo")
    @FieldName("出生者 體重 迄")
    private String birthWeightTo = "";

    /** 出生者 懷胎週數 起. */
    @XmlElement(name = "BirthWkFrom")
    @FieldName("出生者 懷胎週數 起")
    private String birthWkFrom = "";

    /** 出生者 懷胎週數 迄. */
    @XmlElement(name = "BirthWkTo")
    @FieldName("出生者 懷胎週數 迄 ")
    private String birthWkTo = "";

    /** 父齡 起. */
    @XmlElement(name = "FAgeFrom")
    @FieldName("父齡 起")
    private String fAgeFrom = "";

    /** 父齡 迄. */
    @XmlElement(name = "FAgeTo")
    @FieldName("父齡 迄")
    private String fAgeTo = "";

    /** 父教育程迄 起. */
    @XmlElement(name = "FEducationMarkFrom")
    @FieldName("父教育程迄 起")
    private String fEducationMarkFrom = "";

    /** 父教育程度 迄. */
    @XmlElement(name = "FEducationMarkTo")
    @FieldName("父教育程度 迄")
    private String fEducationMarkTo = "";

    /** 父 結婚時年齡 起. */
    @XmlElement(name = "FMarryAgeFrom")
    @FieldName("父 結婚時年齡 起")
    private String fMarryAgeFrom = "";

    /** 父 結婚時年齡 迄. */
    @XmlElement(name = "FMarryAgeTo")
    @FieldName("父 結婚時年齡 迄")
    private String fMarryAgeTo = "";

    /** 父 國籍或區域代碼. */
    @XmlElement(name = "FNationCode")
    @FieldName("父 國籍或區域代碼")
    private String fNationCode = "";

    /** 母 年齡 起. */
    @XmlElement(name = "MAgeFrom")
    @FieldName("母 年齡 起")
    private String mAgeFrom = "";

    /** 母 年齡 迄. */
    @XmlElement(name = "MAgeTo")
    @FieldName("母 年齡 迄")
    private String mAgeTo = "";

    /** 母教育程迄 起. */
    @XmlElement(name = "MEducationMarkFrom")
    @FieldName("母教育程迄 起")
    private String mEducationMarkFrom = "";

    /** 母教育程度 迄. */
    @XmlElement(name = "MEducationMarkTo")
    @FieldName("母教育程度 迄")
    private String mEducationMarkTo = "";

    /** 母 結婚時年齡 起. */
    @XmlElement(name = "MMarryAgeFrom")
    @FieldName("母 結婚時年齡 起")
    private String mMarryAgeFrom = "";

    /** 母 結婚時年齡 迄. */
    @XmlElement(name = "MMarryAgeTo")
    @FieldName("母 結婚時年齡 迄")
    private String mMarryAgeTo = "";

    /** 母 國籍或區域代碼. */
    @XmlElement(name = "MNationCode")
    @FieldName("母 國籍或區域代碼")
    private String mNationCode = "";

    /** 父母結婚期間_起. */
    @XmlElement(name = "MarryYyyMmFrom")
    @FieldName("父母結婚期間_起")
    private String marryYyyMmFrom = "";

    /** 父母結婚期間_迄. */
    @XmlElement(name = "MarryYyyMmTo")
    @FieldName("父母結婚期間_迄")
    private String marryYyyMmTo = "";

    /** 父國籍域區域代碼空白者. */
    @XmlElement(name = "FNationCodeSpace")
    @FieldName("父國籍域區域代碼空白者")
    private boolean fNationCodeSpace = false;

    /** 母國籍域區域代碼空白者. */
    @XmlElement(name = "MNationCodeSpace")
    @FieldName("母國籍域區域代碼空白者")
    private boolean mNationCodeSpace = false;

    /** 父母結婚期間不滿一年. */
    @XmlElement(name = "NotOneYear")
    @FieldName("父母結婚期間不滿一年")
    private String notOneYear = "";

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
     * Gets the birth date from.
     * 
     * @return the birth date from
     */
    public String getBirthDateFrom() {
        return birthDateFrom;
    }

    /**
     * Sets the birth date from.
     * 
     * @param birthDateFrom
     *            the new birth date from
     */
    public void setBirthDateFrom(String birthDateFrom) {
        this.birthDateFrom = birthDateFrom;
    }

    /**
     * Gets the birth date to.
     * 
     * @return the birth date to
     */
    public String getBirthDateTo() {
        return birthDateTo;
    }

    /**
     * Sets the birth date to.
     * 
     * @param birthDateTo
     *            the new birth date to
     */
    public void setBirthDateTo(String birthDateTo) {
        this.birthDateTo = birthDateTo;
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
     * Gets the birth kind.
     * 
     * @return the birth kind
     */
    public String getBirthKind() {
        return birthKind;
    }

    /**
     * Sets the birth kind.
     * 
     * @param birthKind
     *            the new birth kind
     */
    public void setBirthKind(String birthKind) {
        this.birthKind = birthKind;
    }

    /**
     * Gets the birth type.
     * 
     * @return the birth type
     */
    public String getBirthType() {
        return birthType;
    }

    /**
     * Sets the birth type.
     * 
     * @param birthType
     *            the new birth type
     */
    public void setBirthType(String birthType) {
        this.birthType = birthType;
    }

    /**
     * Gets the birth num from.
     * 
     * @return the birth num from
     */
    public String getBirthNumFrom() {
        return birthNumFrom;
    }

    /**
     * Sets the birth num from.
     * 
     * @param birthNumFrom
     *            the new birth num from
     */
    public void setBirthNumFrom(String birthNumFrom) {
        this.birthNumFrom = birthNumFrom;
    }

    /**
     * Gets the birth num to.
     * 
     * @return the birth num to
     */
    public String getBirthNumTo() {
        return birthNumTo;
    }

    /**
     * Sets the birth num to.
     * 
     * @param birthNumTo
     *            the new birth num to
     */
    public void setBirthNumTo(String birthNumTo) {
        this.birthNumTo = birthNumTo;
    }

    /**
     * Gets the birth weight from.
     * 
     * @return the birth weight from
     */
    public String getBirthWeightFrom() {
        return birthWeightFrom;
    }

    /**
     * Sets the birth weight from.
     * 
     * @param birthWeightFrom
     *            the new birth weight from
     */
    public void setBirthWeightFrom(String birthWeightFrom) {
        this.birthWeightFrom = birthWeightFrom;
    }

    /**
     * Gets the birth weight to.
     * 
     * @return the birth weight to
     */
    public String getBirthWeightTo() {
        return birthWeightTo;
    }

    /**
     * Sets the birth weight to.
     * 
     * @param birthWeightTo
     *            the new birth weight to
     */
    public void setBirthWeightTo(String birthWeightTo) {
        this.birthWeightTo = birthWeightTo;
    }

    /**
     * Gets the birth wk from.
     * 
     * @return the birth wk from
     */
    public String getBirthWkFrom() {
        return birthWkFrom;
    }

    /**
     * Sets the birth wk from.
     * 
     * @param birthWkFrom
     *            the new birth wk from
     */
    public void setBirthWkFrom(String birthWkFrom) {
        this.birthWkFrom = birthWkFrom;
    }

    /**
     * Gets the birth wk to.
     * 
     * @return the birth wk to
     */
    public String getBirthWkTo() {
        return birthWkTo;
    }

    /**
     * Sets the birth wk to.
     * 
     * @param birthWkTo
     *            the new birth wk to
     */
    public void setBirthWkTo(String birthWkTo) {
        this.birthWkTo = birthWkTo;
    }

    /**
     * Gets the f age from.
     * 
     * @return the f age from
     */
    public String getfAgeFrom() {
        return fAgeFrom;
    }

    /**
     * Sets the f age from.
     * 
     * @param fAgeFrom
     *            the new f age from
     */
    public void setfAgeFrom(String fAgeFrom) {
        this.fAgeFrom = fAgeFrom;
    }

    /**
     * Gets the f age to.
     * 
     * @return the f age to
     */
    public String getfAgeTo() {
        return fAgeTo;
    }

    /**
     * Sets the f age to.
     * 
     * @param fAgeTo
     *            the new f age to
     */
    public void setfAgeTo(String fAgeTo) {
        this.fAgeTo = fAgeTo;
    }

    /**
     * Gets the f education mark from.
     * 
     * @return the f education mark from
     */
    public String getfEducationMarkFrom() {
        return fEducationMarkFrom;
    }

    /**
     * Sets the f education mark from.
     * 
     * @param fEducationMarkFrom
     *            the new f education mark from
     */
    public void setfEducationMarkFrom(String fEducationMarkFrom) {
        this.fEducationMarkFrom = fEducationMarkFrom;
    }

    /**
     * Gets the f education mark to.
     * 
     * @return the f education mark to
     */
    public String getfEducationMarkTo() {
        return fEducationMarkTo;
    }

    /**
     * Sets the f education mark to.
     * 
     * @param fEducationMarkTo
     *            the new f education mark to
     */
    public void setfEducationMarkTo(String fEducationMarkTo) {
        this.fEducationMarkTo = fEducationMarkTo;
    }

    /**
     * Gets the f marry age from.
     * 
     * @return the f marry age from
     */
    public String getfMarryAgeFrom() {
        return fMarryAgeFrom;
    }

    /**
     * Sets the f marry age from.
     * 
     * @param fMarryAgeFrom
     *            the new f marry age from
     */
    public void setfMarryAgeFrom(String fMarryAgeFrom) {
        this.fMarryAgeFrom = fMarryAgeFrom;
    }

    /**
     * Gets the f marry age to.
     * 
     * @return the f marry age to
     */
    public String getfMarryAgeTo() {
        return fMarryAgeTo;
    }

    /**
     * Sets the f marry age to.
     * 
     * @param fMarryAgeTo
     *            the new f marry age to
     */
    public void setfMarryAgeTo(String fMarryAgeTo) {
        this.fMarryAgeTo = fMarryAgeTo;
    }

    /**
     * Gets the f nation code.
     * 
     * @return the f nation code
     */
    public String getfNationCode() {
        return fNationCode;
    }

    /**
     * Sets the f nation code.
     * 
     * @param fNationCode
     *            the new f nation code
     */
    public void setfNationCode(String fNationCode) {
        this.fNationCode = fNationCode;
    }

    /**
     * Gets the m age from.
     * 
     * @return the m age from
     */
    public String getmAgeFrom() {
        return mAgeFrom;
    }

    /**
     * Sets the m age from.
     * 
     * @param mAgeFrom
     *            the new m age from
     */
    public void setmAgeFrom(String mAgeFrom) {
        this.mAgeFrom = mAgeFrom;
    }

    /**
     * Gets the m age to.
     * 
     * @return the m age to
     */
    public String getmAgeTo() {
        return mAgeTo;
    }

    /**
     * Sets the m age to.
     * 
     * @param mAgeTo
     *            the new m age to
     */
    public void setmAgeTo(String mAgeTo) {
        this.mAgeTo = mAgeTo;
    }

    /**
     * Gets the m education mark from.
     * 
     * @return the m education mark from
     */
    public String getmEducationMarkFrom() {
        return mEducationMarkFrom;
    }

    /**
     * Sets the m education mark from.
     * 
     * @param mEducationMarkFrom
     *            the new m education mark from
     */
    public void setmEducationMarkFrom(String mEducationMarkFrom) {
        this.mEducationMarkFrom = mEducationMarkFrom;
    }

    /**
     * Gets the m education mark to.
     * 
     * @return the m education mark to
     */
    public String getmEducationMarkTo() {
        return mEducationMarkTo;
    }

    /**
     * Sets the m education mark to.
     * 
     * @param mEducationMarkTo
     *            the new m education mark to
     */
    public void setmEducationMarkTo(String mEducationMarkTo) {
        this.mEducationMarkTo = mEducationMarkTo;
    }

    /**
     * Gets the m marry age from.
     * 
     * @return the m marry age from
     */
    public String getmMarryAgeFrom() {
        return mMarryAgeFrom;
    }

    /**
     * Sets the m marry age from.
     * 
     * @param mMarryAgeFrom
     *            the new m marry age from
     */
    public void setmMarryAgeFrom(String mMarryAgeFrom) {
        this.mMarryAgeFrom = mMarryAgeFrom;
    }

    /**
     * Gets the m marry age to.
     * 
     * @return the m marry age to
     */
    public String getmMarryAgeTo() {
        return mMarryAgeTo;
    }

    /**
     * Sets the m marry age to.
     * 
     * @param mMarryAgeTo
     *            the new m marry age to
     */
    public void setmMarryAgeTo(String mMarryAgeTo) {
        this.mMarryAgeTo = mMarryAgeTo;
    }

    /**
     * Gets the m nation code.
     * 
     * @return the m nation code
     */
    public String getmNationCode() {
        return mNationCode;
    }

    /**
     * Sets the m nation code.
     * 
     * @param mNationCode
     *            the new m nation code
     */
    public void setmNationCode(String mNationCode) {
        this.mNationCode = mNationCode;
    }

    /**
     * Gets the marry yyy mm from.
     * 
     * @return the marry yyy mm from
     */
    public String getMarryYyyMmFrom() {
        return marryYyyMmFrom;
    }

    /**
     * Sets the marry yyy mm from.
     * 
     * @param marryYyyMmFrom
     *            the new marry yyy mm from
     */
    public void setMarryYyyMmFrom(String marryYyyMmFrom) {
        this.marryYyyMmFrom = marryYyyMmFrom;
    }

    /**
     * Gets the marry yyy mm to.
     * 
     * @return the marry yyy mm to
     */
    public String getMarryYyyMmTo() {
        return marryYyyMmTo;
    }

    /**
     * Sets the marry yyy mm to.
     * 
     * @param marryYyyMmTo
     *            the new marry yyy mm to
     */
    public void setMarryYyyMmTo(String marryYyyMmTo) {
        this.marryYyyMmTo = marryYyyMmTo;
    }

    /**
     * Checks if is f nation code space.
     * 
     * @return true, if is f nation code space
     */
    public boolean isfNationCodeSpace() {
        return fNationCodeSpace;
    }

    /**
     * Sets the f nation code space.
     * 
     * @param fNationCodeSpace
     *            the new f nation code space
     */
    public void setfNationCodeSpace(boolean fNationCodeSpace) {
        this.fNationCodeSpace = fNationCodeSpace;
    }

    /**
     * Checks if is m nation code space.
     * 
     * @return true, if is m nation code space
     */
    public boolean ismNationCodeSpace() {
        return mNationCodeSpace;
    }

    /**
     * Sets the m nation code space.
     * 
     * @param mNationCodeSpace
     *            the new m nation code space
     */
    public void setmNationCodeSpace(boolean mNationCodeSpace) {
        this.mNationCodeSpace = mNationCodeSpace;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "Rl08271DTO [seqType=" + seqType + ", noteDateFrom=" + noteDateFrom + ", noteDateTo=" + noteDateTo
                + ", birthDateFrom=" + birthDateFrom + ", birthDateTo=" + birthDateTo + ", sex=" + sex + ", birthKind="
                + birthKind + ", birthType=" + birthType + ", birthNumFrom=" + birthNumFrom + ", birthNumTo="
                + birthNumTo + ", birthWeightFrom=" + birthWeightFrom + ", birthWeightTo=" + birthWeightTo
                + ", birthWkFrom=" + birthWkFrom + ", birthWkTo=" + birthWkTo + ", fAgeFrom=" + fAgeFrom + ", fAgeTo="
                + fAgeTo + ", fEducationMarkFrom=" + fEducationMarkFrom + ", fEducationMarkTo=" + fEducationMarkTo
                + ", fMarryAgeFrom=" + fMarryAgeFrom + ", fMarryAgeTo=" + fMarryAgeTo + ", fNationCode=" + fNationCode
                + ", mAgeFrom=" + mAgeFrom + ", mAgeTo=" + mAgeTo + ", mEducationMarkFrom=" + mEducationMarkFrom
                + ", mEducationMarkTo=" + mEducationMarkTo + ", mMarryAgeFrom=" + mMarryAgeFrom + ", mMarryAgeTo="
                + mMarryAgeTo + ", mNationCode=" + mNationCode + ", marryYyyMmFrom=" + marryYyyMmFrom
                + ", marryYyyMmTo=" + marryYyyMmTo + ", fNationCodeSpace=" + fNationCodeSpace + ", mNationCodeSpace="
                + mNationCodeSpace + "]";
    }

    /**
     * Gets the not one year.
     * 
     * @return the not one year
     */
    public String getNotOneYear() {
        return notOneYear;
    }

    /**
     * Sets the not one year.
     * 
     * @param notOneYear
     *            the new not one year
     */
    public void setNotOneYear(String notOneYear) {
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

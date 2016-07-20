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
 * 養父姓名更正登記 DTO.
 * 
 * @author Jay Kan
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl0171qAppDataDTO", propOrder = { "beforeFosterFather", "beforeFosterFatherLastName",
        "beforeFosterFatherFirstName", "afterFosterFather", "afterFosterFatherLastName", "afterFosterFatherFirstName",
        "updateYyymmdd", "quoteLowCode", "updateReasonCode", "otherUpdateReason", "otherCertificate", "certificateList" })
@XmlRootElement(name = "Rl0171qAppDataDTO")
public class Rl0171qAppDataDTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = -3281213810724830941L;

    /** 原養父姓名. */
    @XmlElement(name = "BeforeFosterFather")
    @FieldName("原養父姓名")
    private String beforeFosterFather;

    /** 原養父姓. */
    @XmlElement(name = "BeforeFosterFatherLastName")
    @FieldName("原養父姓")
    private String beforeFosterFatherLastName;

    /** 原養父名. */
    @XmlElement(name = "BeforeFosterFatherFirstName")
    @FieldName("原養父名")
    private String beforeFosterFatherFirstName;

    /** 更正後養父姓名. */
    @XmlElement(name = "AfterFosterFather")
    @FieldName("更正後養父姓名")
    private String afterFosterFather;

    /** 更正後養父姓. */
    @XmlElement(name = "AfterFosterFatherLastName")
    @FieldName("更正後養父姓")
    private String afterFosterFatherLastName;

    /** 更正後養父名. */
    @XmlElement(name = "AfterFosterFatherFirstName")
    @FieldName("更正後養父名")
    private String afterFosterFatherFirstName;

    /** 更正日期. */
    @XmlElement(name = "UpdateYyymmdd")
    @FieldName("更正日期")
    private String updateYyymmdd;

    /** 引用法條代碼. */
    @XmlElement(name = "QuoteLowCode")
    @FieldName("引用法條代碼")
    private String quoteLowCode = "01";

    /** 更正原因代碼. */
    @XmlElement(name = "UpdateReasonCode")
    @FieldName("更正原因代碼")
    private String updateReasonCode = "01";

    /** 其他更正原因. */
    @XmlElement(name = "OtherUpdateReason")
    @FieldName("其他更正原因")
    private String otherUpdateReason;

    /** 其他附繳證件. */
    @XmlElement(name = "OtherCertificate")
    @FieldName("其他附繳證件")
    private String otherCertificate;

    /** 附繳證件清單. */
    @XmlElement(name = "CertificateList")
    @FieldName("附繳證件清單")
    private List<String> certificateList = new ArrayList<String>();

    /**
     * Gets the before foster father.
     * 
     * @return the before foster father
     */
    public String getBeforeFosterFather() {
        return beforeFosterFather;
    }

    /**
     * Sets the before foster father.
     * 
     * @param beforeFosterFather
     *            the new before foster father
     */
    public void setBeforeFosterFather(final String beforeFosterFather) {
        this.beforeFosterFather = beforeFosterFather;
    }

    /**
     * Gets the before foster father last name.
     * 
     * @return the before foster father last name
     */
    public String getBeforeFosterFatherLastName() {
        return beforeFosterFatherLastName;
    }

    /**
     * Sets the before foster father last name.
     * 
     * @param beforeFosterFatherLastName
     *            the new before foster father last name
     */
    public void setBeforeFosterFatherLastName(final String beforeFosterFatherLastName) {
        this.beforeFosterFatherLastName = beforeFosterFatherLastName;
    }

    /**
     * Gets the before foster father first name.
     * 
     * @return the before foster father first name
     */
    public String getBeforeFosterFatherFirstName() {
        return beforeFosterFatherFirstName;
    }

    /**
     * Sets the before foster father first name.
     * 
     * @param beforeFosterFatherFirstName
     *            the new before foster father first name
     */
    public void setBeforeFosterFatherFirstName(final String beforeFosterFatherFirstName) {
        this.beforeFosterFatherFirstName = beforeFosterFatherFirstName;
    }

    /**
     * Gets the after foster father.
     * 
     * @return the after foster father
     */
    public String getAfterFosterFather() {
        return afterFosterFather;
    }

    /**
     * Sets the after foster father.
     * 
     * @param afterFosterFather
     *            the new after foster father
     */
    public void setAfterFosterFather(final String afterFosterFather) {
        this.afterFosterFather = afterFosterFather;
    }

    /**
     * Gets the after foster father last name.
     * 
     * @return the after foster father last name
     */
    public String getAfterFosterFatherLastName() {
        return afterFosterFatherLastName;
    }

    /**
     * Sets the after foster father last name.
     * 
     * @param afterFosterFatherLastName
     *            the new after foster father last name
     */
    public void setAfterFosterFatherLastName(final String afterFosterFatherLastName) {
        this.afterFosterFatherLastName = afterFosterFatherLastName;
    }

    /**
     * Gets the after foster father first name.
     * 
     * @return the after foster father first name
     */
    public String getAfterFosterFatherFirstName() {
        return afterFosterFatherFirstName;
    }

    /**
     * Sets the after foster father first name.
     * 
     * @param afterFosterFatherFirstName
     *            the new after foster father first name
     */
    public void setAfterFosterFatherFirstName(final String afterFosterFatherFirstName) {
        this.afterFosterFatherFirstName = afterFosterFatherFirstName;
    }

    /**
     * Gets the update yyymmdd.
     * 
     * @return the update yyymmdd
     */
    public String getUpdateYyymmdd() {
        return updateYyymmdd;
    }

    /**
     * Sets the update yyymmdd.
     * 
     * @param updateYyymmdd
     *            the new update yyymmdd
     */
    public void setUpdateYyymmdd(final String updateYyymmdd) {
        this.updateYyymmdd = updateYyymmdd;
    }

    /**
     * Gets the quote low code.
     * 
     * @return the quote low code
     */
    public String getQuoteLowCode() {
        return quoteLowCode;
    }

    /**
     * Sets the quote low code.
     * 
     * @param quoteLowCode
     *            the new quote low code
     */
    public void setQuoteLowCode(final String quoteLowCode) {
        this.quoteLowCode = quoteLowCode;
    }

    /**
     * Gets the update reason code.
     * 
     * @return the update reason code
     */
    public String getUpdateReasonCode() {
        return updateReasonCode;
    }

    /**
     * Sets the update reason code.
     * 
     * @param updateReasonCode
     *            the new update reason code
     */
    public void setUpdateReasonCode(final String updateReasonCode) {
        this.updateReasonCode = updateReasonCode;
    }

    /**
     * Gets the other update reason.
     * 
     * @return the other update reason
     */
    public String getOtherUpdateReason() {
        return otherUpdateReason;
    }

    /**
     * Sets the other update reason.
     * 
     * @param otherUpdateReason
     *            the new other update reason
     */
    public void setOtherUpdateReason(final String otherUpdateReason) {
        this.otherUpdateReason = otherUpdateReason;
    }

    /**
     * Gets the other certificate.
     * 
     * @return the other certificate
     */
    public String getOtherCertificate() {
        return otherCertificate;
    }

    /**
     * Sets the other certificate.
     * 
     * @param otherCertificate
     *            the new other certificate
     */
    public void setOtherCertificate(final String otherCertificate) {
        this.otherCertificate = otherCertificate;
    }

    /**
     * Gets the certificate list.
     * 
     * @return the certificate list
     */
    public List<String> getCertificateList() {
        return certificateList;
    }

    /**
     * Sets the certificate list.
     * 
     * @param certificateList
     *            the new certificate list
     */
    public void setCertificateList(final List<String> certificateList) {
        this.certificateList = certificateList;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((afterFosterFather == null) ? 0 : afterFosterFather.hashCode());
        result = prime * result + ((certificateList == null) ? 0 : certificateList.hashCode());
        result = prime * result + ((otherCertificate == null) ? 0 : otherCertificate.hashCode());
        result = prime * result + ((otherUpdateReason == null) ? 0 : otherUpdateReason.hashCode());
        result = prime * result + ((quoteLowCode == null) ? 0 : quoteLowCode.hashCode());
        result = prime * result + ((updateReasonCode == null) ? 0 : updateReasonCode.hashCode());
        result = prime * result + ((updateYyymmdd == null) ? 0 : updateYyymmdd.hashCode());
        return result;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(final Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Rl0171qAppDataDTO other = (Rl0171qAppDataDTO) obj;
        if (afterFosterFather == null) {
            if (other.afterFosterFather != null)
                return false;
        } else if (!afterFosterFather.equals(other.afterFosterFather))
            return false;
        if (certificateList == null) {
            if (other.certificateList != null)
                return false;
        } else if (!certificateList.equals(other.certificateList))
            return false;
        if (otherCertificate == null) {
            if (other.otherCertificate != null)
                return false;
        } else if (!otherCertificate.equals(other.otherCertificate))
            return false;
        if (otherUpdateReason == null) {
            if (other.otherUpdateReason != null)
                return false;
        } else if (!otherUpdateReason.equals(other.otherUpdateReason))
            return false;
        if (quoteLowCode == null) {
            if (other.quoteLowCode != null)
                return false;
        } else if (!quoteLowCode.equals(other.quoteLowCode))
            return false;
        if (updateReasonCode == null) {
            if (other.updateReasonCode != null)
                return false;
        } else if (!updateReasonCode.equals(other.updateReasonCode))
            return false;
        if (updateYyymmdd == null) {
            if (other.updateYyymmdd != null)
                return false;
        } else if (!updateYyymmdd.equals(other.updateYyymmdd))
            return false;
        return true;
    }
}

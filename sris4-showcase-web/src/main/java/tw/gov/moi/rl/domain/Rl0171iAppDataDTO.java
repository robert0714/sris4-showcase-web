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
 * 父姓名更正登記 AppDataDTO.
 * 
 * @author Jay Kan
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl0171iAppDataDTO", propOrder = { "beforeFather", "beforeFatherLastName", "beforeFatherFirstName",
        "afterFather", "afterFatherLastName", "afterFatherFirstName", "updateYyymmdd", "quoteLowCode",
        "updateReasonCode", "otherUpdateReason", "otherCertificate", "certificateList" })
@XmlRootElement(name = "Rl0171iAppDataDTO")
public class Rl0171iAppDataDTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 8411249994693485028L;

    /** 原父姓名 . */
    @XmlElement(name = "BeforeFather")
    @FieldName("原父姓名")
    private String beforeFather;

    /** 原父姓. */
    @XmlElement(name = "BeforeFatherLastName")
    @FieldName("原父姓")
    private String beforeFatherLastName;

    /** 原父名. */
    @XmlElement(name = "BeforeFatherFirstName")
    @FieldName("原父名")
    private String beforeFatherFirstName;

    /** 更正後父姓名. */
    @XmlElement(name = "AfterFather")
    @FieldName("更正後父姓名")
    private String afterFather;

    /** 更正後父姓. */
    @XmlElement(name = "AfterFatherLastName")
    @FieldName("更正後父姓")
    private String afterFatherLastName;

    /** 更正後父名. */
    @XmlElement(name = "AfterFatherFirstName")
    @FieldName("更正後父名")
    private String afterFatherFirstName;

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
     * Gets the before father.
     * 
     * @return the before father
     */
    public String getBeforeFather() {
        return beforeFather;
    }

    /**
     * Sets the before father.
     * 
     * @param beforeFather
     *            the new before father
     */
    public void setBeforeFather(final String beforeFather) {
        this.beforeFather = beforeFather;
    }

    /**
     * Gets the before father last name.
     * 
     * @return the before father last name
     */
    public String getBeforeFatherLastName() {
        return beforeFatherLastName;
    }

    /**
     * Sets the before father last name.
     * 
     * @param beforeFatherLastName
     *            the new before father last name
     */
    public void setBeforeFatherLastName(final String beforeFatherLastName) {
        this.beforeFatherLastName = beforeFatherLastName;
    }

    /**
     * Gets the before father first name.
     * 
     * @return the before father first name
     */
    public String getBeforeFatherFirstName() {
        return beforeFatherFirstName;
    }

    /**
     * Sets the before father first name.
     * 
     * @param beforeFatherFirstName
     *            the new before father first name
     */
    public void setBeforeFatherFirstName(final String beforeFatherFirstName) {
        this.beforeFatherFirstName = beforeFatherFirstName;
    }

    /**
     * Gets the after father.
     * 
     * @return the after father
     */
    public String getAfterFather() {
        return afterFather;
    }

    /**
     * Sets the after father.
     * 
     * @param afterFather
     *            the new after father
     */
    public void setAfterFather(final String afterFather) {
        this.afterFather = afterFather;
    }

    /**
     * Gets the after father last name.
     * 
     * @return the after father last name
     */
    public String getAfterFatherLastName() {
        return afterFatherLastName;
    }

    /**
     * Sets the after father last name.
     * 
     * @param afterFatherLastName
     *            the new after father last name
     */
    public void setAfterFatherLastName(final String afterFatherLastName) {
        this.afterFatherLastName = afterFatherLastName;
    }

    /**
     * Gets the after father first name.
     * 
     * @return the after father first name
     */
    public String getAfterFatherFirstName() {
        return afterFatherFirstName;
    }

    /**
     * Sets the after father first name.
     * 
     * @param afterFatherFirstName
     *            the new after father first name
     */
    public void setAfterFatherFirstName(final String afterFatherFirstName) {
        this.afterFatherFirstName = afterFatherFirstName;
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
        result = prime * result + ((afterFather == null) ? 0 : afterFather.hashCode());
        result = prime * result + ((certificateList == null) ? 0 : certificateList.hashCode());
        result = prime * result + ((otherCertificate == null) ? 0 : otherCertificate.hashCode());
        result = prime * result + ((otherUpdateReason == null) ? 0 : otherUpdateReason.hashCode());
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
        Rl0171iAppDataDTO other = (Rl0171iAppDataDTO) obj;
        if (afterFather == null) {
            if (other.afterFather != null)
                return false;
        } else if (!afterFather.equals(other.afterFather))
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

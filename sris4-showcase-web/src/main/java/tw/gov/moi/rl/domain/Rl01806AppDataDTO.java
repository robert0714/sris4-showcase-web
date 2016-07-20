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
 * 父姓名更正撤銷登記AppDataDTO.
 * 
 * @author Jay Kan
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Rl01806AppDataDTO", propOrder = { "beforeWork", "beforeFather", "beforeFatherLastName",
        "beforeFatherFirstName", "afterFather", "afterFatherLastName", "afterFatherFirstName", "revokeYyymmdd",
        "quoteLowCode", "revokeReasonCode", "otherCertificate", "certificateList" })
@XmlRootElement(name = "Rl01806AppDataDTO")
public class Rl01806AppDataDTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 5810629360668782821L;

    /** 原登記事項. */
    @XmlElement(name = "BeforeWork")
    @FieldName("原登記事項")
    private String beforeWork;

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

    /** 撤銷後父姓名. */
    @XmlElement(name = "AfterFather")
    @FieldName("撤銷後父姓名")
    private String afterFather;

    /** 撤銷後父姓. */
    @XmlElement(name = "AfterFatherLastName")
    @FieldName("撤銷後父姓")
    private String afterFatherLastName;

    /** 撤銷後父名. */
    @XmlElement(name = "AfterFatherFirstName")
    @FieldName("撤銷後父名")
    private String afterFatherFirstName;

    /** 撤銷日期. */
    @XmlElement(name = "RevokeYyymmdd")
    @FieldName("撤銷日期")
    private String revokeYyymmdd;

    /** 引用法條代碼. */
    @XmlElement(name = "QuoteLowCode")
    @FieldName("引用法條代碼")
    private String quoteLowCode = "1";

    /** 撤銷原因代碼. */
    @XmlElement(name = "RevokeReasonCode")
    @FieldName("撤銷原因代碼")
    private String revokeReasonCode = "01";

    /** 其他附繳證件. */
    @XmlElement(name = "OtherCertificate")
    @FieldName("其他附繳證件")
    private String otherCertificate;

    /** 附繳證件清單. */
    @XmlElement(name = "CertificateList")
    @FieldName("附繳證件清單")
    private List<String> certificateList = new ArrayList<String>();

    /**
     * Gets the before work.
     * 
     * @return the before work
     */
    public String getBeforeWork() {
        return beforeWork;
    }

    /**
     * Sets the before work.
     * 
     * @param beforeWork
     *            the new before work
     */
    public void setBeforeWork(final String beforeWork) {
        this.beforeWork = beforeWork;
    }

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
     * Gets the revoke yyymmdd.
     * 
     * @return the revoke yyymmdd
     */
    public String getRevokeYyymmdd() {
        return revokeYyymmdd;
    }

    /**
     * Sets the revoke yyymmdd.
     * 
     * @param revokeYyymmdd
     *            the new revoke yyymmdd
     */
    public void setRevokeYyymmdd(final String revokeYyymmdd) {
        this.revokeYyymmdd = revokeYyymmdd;
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
     * Gets the revoke reason code.
     * 
     * @return the revoke reason code
     */
    public String getRevokeReasonCode() {
        return revokeReasonCode;
    }

    /**
     * Sets the revoke reason code.
     * 
     * @param revokeReasonCode
     *            the new revoke reason code
     */
    public void setRevokeReasonCode(final String revokeReasonCode) {
        this.revokeReasonCode = revokeReasonCode;
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
        result = prime * result + ((beforeWork == null) ? 0 : beforeWork.hashCode());
        result = prime * result + ((certificateList == null) ? 0 : certificateList.hashCode());
        result = prime * result + ((otherCertificate == null) ? 0 : otherCertificate.hashCode());
        result = prime * result + ((quoteLowCode == null) ? 0 : quoteLowCode.hashCode());
        result = prime * result + ((revokeReasonCode == null) ? 0 : revokeReasonCode.hashCode());
        result = prime * result + ((revokeYyymmdd == null) ? 0 : revokeYyymmdd.hashCode());
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
        Rl01806AppDataDTO other = (Rl01806AppDataDTO) obj;
        if (afterFather == null) {
            if (other.afterFather != null)
                return false;
        } else if (!afterFather.equals(other.afterFather))
            return false;
        if (beforeWork == null) {
            if (other.beforeWork != null)
                return false;
        } else if (!beforeWork.equals(other.beforeWork))
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
        if (quoteLowCode == null) {
            if (other.quoteLowCode != null)
                return false;
        } else if (!quoteLowCode.equals(other.quoteLowCode))
            return false;
        if (revokeReasonCode == null) {
            if (other.revokeReasonCode != null)
                return false;
        } else if (!revokeReasonCode.equals(other.revokeReasonCode))
            return false;
        if (revokeYyymmdd == null) {
            if (other.revokeYyymmdd != null)
                return false;
        } else if (!revokeYyymmdd.equals(other.revokeYyymmdd))
            return false;
        return true;
    }
}

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
 * 養父姓名更正撤銷登記AppDataDTO.
 * 
 * @author Jay Kan
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Rl01808AppDataDTO", propOrder = { "beforeWork", "beforeFosterFather", "beforeFosterFatherLastName",
        "beforeFosterFatherFirstName", "afterFosterFather", "afterFosterFatherLastName", "afterFosterFatherFirstName",
        "revokeYyymmdd", "quoteLowCode", "revokeReasonCode", "otherCertificate", "certificateList" })
@XmlRootElement(name = "Rl01808AppDataDTO")
public class Rl01808AppDataDTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = -7639666671966031700L;

    /** 原登記事項. */
    @XmlElement(name = "BeforeWork")
    @FieldName("原登記事項")
    private String beforeWork;

    /** 原養父姓名 . */
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

    /** 撤銷後養父姓名. */
    @XmlElement(name = "AfterFosterFather")
    @FieldName("撤銷後養父姓名")
    private String afterFosterFather;

    /** 撤銷後養父姓. */
    @XmlElement(name = "AfterFosterFatherLastName")
    @FieldName("撤銷後養父姓")
    private String afterFosterFatherLastName;

    /** 撤銷後養父名. */
    @XmlElement(name = "AfterFosterFatherFirstName")
    @FieldName("撤銷後養父名")
    private String afterFosterFatherFirstName;

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
        result = prime * result + ((afterFosterFather == null) ? 0 : afterFosterFather.hashCode());
        result = prime * result + ((beforeWork == null) ? 0 : beforeWork.hashCode());
        result = prime * result + ((certificateList == null) ? 0 : certificateList.hashCode());
        result = prime * result + ((otherCertificate == null) ? 0 : otherCertificate.hashCode());
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
        Rl01808AppDataDTO other = (Rl01808AppDataDTO) obj;
        if (afterFosterFather == null) {
            if (other.afterFosterFather != null)
                return false;
        } else if (!afterFosterFather.equals(other.afterFosterFather))
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

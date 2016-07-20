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
 * 配偶姓名更正撤銷登記AppDataDTO.
 * 
 * @author Jay Kan
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Rl01810AppDataDTO", propOrder = { "beforeWork", "beforeSpouse", "beforeSpouseLastName",
        "beforeSpouseFirstName", "afterSpouse", "afterSpouseLastName", "afterSpouseFirstName", "revokeYyymmdd",
        "quoteLowCode", "revokeReasonCode", "otherCertificate", "certificateList" })
@XmlRootElement(name = "Rl01810AppDataDTO")
public class Rl01810AppDataDTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = -3630456207890034968L;

    /** 原登記事項. */
    @XmlElement(name = "BeforeWork")
    @FieldName("原登記事項")
    private String beforeWork;

    /** 原配偶姓名 . */
    @XmlElement(name = "BeforeSpouse")
    @FieldName("原配偶姓名")
    private String beforeSpouse;

    /** 原配偶姓. */
    @XmlElement(name = "BeforeSpouseLastName")
    @FieldName("原配偶姓")
    private String beforeSpouseLastName;

    /** 原配偶名. */
    @XmlElement(name = "BeforeSpouseFirstName")
    @FieldName("原配偶名")
    private String beforeSpouseFirstName;

    /** 撤銷後配偶姓名. */
    @XmlElement(name = "AfterSpouse")
    @FieldName("撤銷後配偶姓名")
    private String afterSpouse;

    /** 撤銷後配偶姓. */
    @XmlElement(name = "AfterSpouseLastName")
    @FieldName("撤銷後配偶姓")
    private String afterSpouseLastName;

    /** 撤銷後配偶名. */
    @XmlElement(name = "AfterSpouseFirstName")
    @FieldName("撤銷後配偶名")
    private String afterSpouseFirstName;

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
     * Gets the before spouse.
     * 
     * @return the before spouse
     */
    public String getBeforeSpouse() {
        return beforeSpouse;
    }

    /**
     * Sets the before spouse.
     * 
     * @param beforeSpouse
     *            the new before spouse
     */
    public void setBeforeSpouse(final String beforeSpouse) {
        this.beforeSpouse = beforeSpouse;
    }

    /**
     * Gets the before spouse last name.
     * 
     * @return the before spouse last name
     */
    public String getBeforeSpouseLastName() {
        return beforeSpouseLastName;
    }

    /**
     * Sets the before spouse last name.
     * 
     * @param beforeSpouseLastName
     *            the new before spouse last name
     */
    public void setBeforeSpouseLastName(final String beforeSpouseLastName) {
        this.beforeSpouseLastName = beforeSpouseLastName;
    }

    /**
     * Gets the before spouse first name.
     * 
     * @return the before spouse first name
     */
    public String getBeforeSpouseFirstName() {
        return beforeSpouseFirstName;
    }

    /**
     * Sets the before spouse first name.
     * 
     * @param beforeSpouseFirstName
     *            the new before spouse first name
     */
    public void setBeforeSpouseFirstName(final String beforeSpouseFirstName) {
        this.beforeSpouseFirstName = beforeSpouseFirstName;
    }

    /**
     * Gets the after spouse.
     * 
     * @return the after spouse
     */
    public String getAfterSpouse() {
        return afterSpouse;
    }

    /**
     * Sets the after spouse.
     * 
     * @param afterSpouse
     *            the new after spouse
     */
    public void setAfterSpouse(final String afterSpouse) {
        this.afterSpouse = afterSpouse;
    }

    /**
     * Gets the after spouse last name.
     * 
     * @return the after spouse last name
     */
    public String getAfterSpouseLastName() {
        return afterSpouseLastName;
    }

    /**
     * Sets the after spouse last name.
     * 
     * @param afterSpouseLastName
     *            the new after spouse last name
     */
    public void setAfterSpouseLastName(final String afterSpouseLastName) {
        this.afterSpouseLastName = afterSpouseLastName;
    }

    /**
     * Gets the after spouse first name.
     * 
     * @return the after spouse first name
     */
    public String getAfterSpouseFirstName() {
        return afterSpouseFirstName;
    }

    /**
     * Sets the after spouse first name.
     * 
     * @param afterSpouseFirstName
     *            the new after spouse first name
     */
    public void setAfterSpouseFirstName(final String afterSpouseFirstName) {
        this.afterSpouseFirstName = afterSpouseFirstName;
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
        result = prime * result + ((afterSpouse == null) ? 0 : afterSpouse.hashCode());
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
        Rl01810AppDataDTO other = (Rl01810AppDataDTO) obj;
        if (afterSpouse == null) {
            if (other.afterSpouse != null)
                return false;
        } else if (!afterSpouse.equals(other.afterSpouse))
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

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
 * 配偶姓名更正廢止AppDataDTO.
 */

/**
 * The Class Rl01g10AppDataDTO.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl01g10AppDataDTO", propOrder = { "beforeSpouse", "beforeSpouseLastName", "beforeSpouseFirstName",
        "afterSpouse", "afterSpouseLastName", "afterSpouseFirstName", "cancelYyymmdd", "cancelReason", "quoteLowCode",
        "otherCertificate", "certificateList" })
@XmlRootElement(name = "Rl01g10AppDataDTO")
public class Rl01g10AppDataDTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 4070209125473720541L;

    /** 原登記配偶姓名. */
    @XmlElement(name = "BeforeSpouse")
    @FieldName("原登記配偶姓名")
    private String beforeSpouse;

    /** 原登記配偶姓. */
    @XmlElement(name = "BeforeSpouseLastName")
    @FieldName("原登記配偶姓")
    private String beforeSpouseLastName;

    /** 原登記配偶名. */
    @XmlElement(name = "BeforeSpouseFirstName")
    @FieldName("原登記配偶名")
    private String beforeSpouseFirstName;

    /** 廢止後登記配偶姓名. */
    @XmlElement(name = "AfterSpouse")
    @FieldName("廢止後登記配偶姓名")
    private String afterSpouse;

    /** 廢止後配偶姓. */
    @XmlElement(name = "AfterSpouseLastName")
    @FieldName("廢止後配偶姓")
    private String afterSpouseLastName;

    /** 廢止後配偶名. */
    @XmlElement(name = "AfterSpouseFirstName")
    @FieldName("廢止後配偶名")
    private String afterSpouseFirstName;

    /** 廢止日期. */
    @XmlElement(name = "CancelYyymmdd")
    @FieldName("廢止日期")
    private String cancelYyymmdd;

    /** 廢止原因. */
    @XmlElement(name = "CancelReason")
    @FieldName("廢止原因")
    private String cancelReason = "廢止";

    /** 引用法條代碼. */
    @XmlElement(name = "QuoteLowCode")
    @FieldName("引用法條代碼")
    private String quoteLowCode = "1";

    /** 其他附繳證件. */
    @XmlElement(name = "OtherCertificate")
    @FieldName("其他附繳證件")
    private String otherCertificate;

    /** 附繳證件清單. */
    @XmlElement(name = "CertificateList")
    @FieldName("附繳證件清單")
    private List<String> certificateList = new ArrayList<String>();

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
     * Gets the cancel yyymmdd.
     * 
     * @return the cancel yyymmdd
     */
    public String getCancelYyymmdd() {
        return cancelYyymmdd;
    }

    /**
     * Sets the cancel yyymmdd.
     * 
     * @param cancelYyymmdd
     *            the new cancel yyymmdd
     */
    public void setCancelYyymmdd(final String cancelYyymmdd) {
        this.cancelYyymmdd = cancelYyymmdd;
    }

    /**
     * Gets the cancel reason.
     * 
     * @return the cancel reason
     */
    public String getCancelReason() {
        return cancelReason;
    }

    /**
     * Sets the cancel reason.
     * 
     * @param cancelReason
     *            the new cancel reason
     */
    public void setCancelReason(final String cancelReason) {
        this.cancelReason = cancelReason;
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
    /**
     * Hash code.
     * 
     * @return the int
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((afterSpouse == null) ? 0 : afterSpouse.hashCode());
        result = prime * result + ((cancelReason == null) ? 0 : cancelReason.hashCode());
        result = prime * result + ((cancelYyymmdd == null) ? 0 : cancelYyymmdd.hashCode());
        result = prime * result + ((certificateList == null) ? 0 : certificateList.hashCode());
        result = prime * result + ((otherCertificate == null) ? 0 : otherCertificate.hashCode());
        return result;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#equals(java.lang.Object)
     */
    /**
     * Equals.
     * 
     * @param obj
     *            the obj
     * @return true, if successful
     */
    @Override
    public boolean equals(final Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Rl01g10AppDataDTO other = (Rl01g10AppDataDTO) obj;
        if (afterSpouse == null) {
            if (other.afterSpouse != null)
                return false;
        } else if (!afterSpouse.equals(other.afterSpouse))
            return false;
        if (cancelReason == null) {
            if (other.cancelReason != null)
                return false;
        } else if (!cancelReason.equals(other.cancelReason))
            return false;
        if (cancelYyymmdd == null) {
            if (other.cancelYyymmdd != null)
                return false;
        } else if (!cancelYyymmdd.equals(other.cancelYyymmdd))
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
        return true;
    }
}

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
 * 配偶姓名變更AppDataDTO.
 * 
 * @author Jay Kan
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl0172fAppDataDTO", propOrder = { "beforeSpouse", "beforeSpouseLastName", "beforeSpouseFirstName",
        "afterSpouse", "afterSpouseLastName", "afterSpouseFirstName", "updateYyymmdd", "quoteLowCode",
        "updateReasonCode", "otherUpdateReason", "otherCertificate", "certificateList", "spouseDeathDate" })
@XmlRootElement(name = "Rl0172fAppDataDTO")
public class Rl0172fAppDataDTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = -9216822179628018896L;

    /** 原配偶姓名. */
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

    /** 變更後配偶姓名. */
    @XmlElement(name = "AfterSpouse")
    @FieldName("變更後配偶姓名")
    private String afterSpouse;

    /** 變更後配偶姓. */
    @XmlElement(name = "AfterSpouseLastName")
    @FieldName("變更後配偶姓")
    private String afterSpouseLastName;

    /** 變更後配偶名. */
    @XmlElement(name = "AfterSpouseFirstName")
    @FieldName("變更後配偶名")
    private String afterSpouseFirstName;

    /** 變更日期. */
    @XmlElement(name = "UpdateYyymmdd")
    @FieldName("變更日期")
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

    /** 配偶死亡日期. */
    @XmlElement(name = "SpouseDeathDate")
    @FieldName("配偶死亡日期")
    private String spouseDeathDate;

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

    /**
     * Gets the spouse death date.
     * 
     * @return the spouse death date
     */
    public String getSpouseDeathDate() {
        return spouseDeathDate;
    }

    /**
     * Sets the spouse death date.
     * 
     * @param spouseDeathDate
     *            the new spouse death date
     */
    public void setSpouseDeathDate(final String spouseDeathDate) {
        this.spouseDeathDate = spouseDeathDate;
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
        Rl0172fAppDataDTO other = (Rl0172fAppDataDTO) obj;
        if (afterSpouse == null) {
            if (other.afterSpouse != null)
                return false;
        } else if (!afterSpouse.equals(other.afterSpouse))
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

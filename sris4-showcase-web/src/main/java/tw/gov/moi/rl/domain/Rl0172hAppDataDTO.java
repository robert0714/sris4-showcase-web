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
 * 母姓名變更 AppDataDTO.
 * 
 * @author Jay Kan
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl0172hAppDataDTO", propOrder = { "beforeMother", "beforeMotherLastName", "beforeMotherFirstName",
        "afterMother", "afterMotherLastName", "afterMotherFirstName", "updateYyymmdd", "quoteLowCode",
        "updateReasonCode", "otherUpdateReason", "otherCertificate", "certificateList" })
@XmlRootElement(name = "Rl0172hAppDataDTO")
public class Rl0172hAppDataDTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = -5082548346468462710L;

    /** 原母姓名. */
    @XmlElement(name = "BeforeMother")
    @FieldName("原母姓名")
    private String beforeMother;

    /** 原母姓. */
    @XmlElement(name = "BeforeMotherLastName")
    @FieldName("原母姓")
    private String beforeMotherLastName;

    /** 原母名. */
    @XmlElement(name = "BeforeMotherFirstName")
    @FieldName("原母名")
    private String beforeMotherFirstName;

    /** 變更後母姓名. */
    @XmlElement(name = "afterMother")
    @FieldName("變更後母姓名")
    private String afterMother;

    /** 變更後母姓. */
    @XmlElement(name = "AfterMotherLastName")
    @FieldName("變更後母姓")
    private String afterMotherLastName;

    /** 變更後母名. */
    @XmlElement(name = "AfterMotherFirstName")
    @FieldName("變更後母名")
    private String afterMotherFirstName;

    /** 變更日期. */
    @XmlElement(name = "UpdateYyymmdd")
    @FieldName("變更日期")
    private String updateYyymmdd;

    /** 引用法條代碼. */
    @XmlElement(name = "QuoteLowCode")
    @FieldName("引用法條代碼")
    private String quoteLowCode = "01";

    /** 變更原因代碼. */
    @XmlElement(name = "UpdateReasonCode")
    @FieldName("變更原因代碼")
    private String updateReasonCode = "01";

    /** 其他變更原因. */
    @XmlElement(name = "OtherUpdateReason")
    @FieldName("其他變更原因")
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
     * Gets the before mother.
     * 
     * @return the before mother
     */
    public String getBeforeMother() {
        return beforeMother;
    }

    /**
     * Sets the before mother.
     * 
     * @param beforeMother
     *            the new before mother
     */
    public void setBeforeMother(final String beforeMother) {
        this.beforeMother = beforeMother;
    }

    /**
     * Gets the before mother last name.
     * 
     * @return the before mother last name
     */
    public String getBeforeMotherLastName() {
        return beforeMotherLastName;
    }

    /**
     * Sets the before mother last name.
     * 
     * @param beforeMotherLastName
     *            the new before mother last name
     */
    public void setBeforeMotherLastName(final String beforeMotherLastName) {
        this.beforeMotherLastName = beforeMotherLastName;
    }

    /**
     * Gets the before mother first name.
     * 
     * @return the before mother first name
     */
    public String getBeforeMotherFirstName() {
        return beforeMotherFirstName;
    }

    /**
     * Sets the before mother first name.
     * 
     * @param beforeMotherFirstName
     *            the new before mother first name
     */
    public void setBeforeMotherFirstName(final String beforeMotherFirstName) {
        this.beforeMotherFirstName = beforeMotherFirstName;
    }

    /**
     * Gets the after mother.
     * 
     * @return the after mother
     */
    public String getAfterMother() {
        return afterMother;
    }

    /**
     * Sets the after mother.
     * 
     * @param afterMother
     *            the new after mother
     */
    public void setAfterMother(final String afterMother) {
        this.afterMother = afterMother;
    }

    /**
     * Gets the after mother last name.
     * 
     * @return the after mother last name
     */
    public String getAfterMotherLastName() {
        return afterMotherLastName;
    }

    /**
     * Sets the after mother last name.
     * 
     * @param afterMotherLastName
     *            the new after mother last name
     */
    public void setAfterMotherLastName(final String afterMotherLastName) {
        this.afterMotherLastName = afterMotherLastName;
    }

    /**
     * Gets the after mother first name.
     * 
     * @return the after mother first name
     */
    public String getAfterMotherFirstName() {
        return afterMotherFirstName;
    }

    /**
     * Sets the after mother first name.
     * 
     * @param afterMotherFirstName
     *            the new after mother first name
     */
    public void setAfterMotherFirstName(final String afterMotherFirstName) {
        this.afterMotherFirstName = afterMotherFirstName;
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
        result = prime * result + ((afterMother == null) ? 0 : afterMother.hashCode());
        result = prime * result + ((afterMotherFirstName == null) ? 0 : afterMotherFirstName.hashCode());
        result = prime * result + ((afterMotherLastName == null) ? 0 : afterMotherLastName.hashCode());
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
        Rl0172hAppDataDTO other = (Rl0172hAppDataDTO) obj;
        if (afterMother == null) {
            if (other.afterMother != null)
                return false;
        } else if (!afterMother.equals(other.afterMother))
            return false;
        if (afterMotherFirstName == null) {
            if (other.afterMotherFirstName != null)
                return false;
        } else if (!afterMotherFirstName.equals(other.afterMotherFirstName))
            return false;
        if (afterMotherLastName == null) {
            if (other.afterMotherLastName != null)
                return false;
        } else if (!afterMotherLastName.equals(other.afterMotherLastName))
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
